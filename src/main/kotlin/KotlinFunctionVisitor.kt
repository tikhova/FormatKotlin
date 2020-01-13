import org.antlr.v4.runtime.tree.TerminalNode
import java.io.OutputStreamWriter

class KotlinFunctionVisitor(private val outputStreamWriter: OutputStreamWriter) : SimpleFunctionBaseVisitor<Void?>() {
    private val _lineSeparator = System.lineSeparator()
    private val _space = " "
    private val _singleIndentation = "    "
    private var _indentationDepth = 0
    private var _currentLength = 0
    private val _maxLength = 80

    private fun printIndentation() {
        _currentLength += _indentationDepth * _singleIndentation.length
        outputStreamWriter.write(_singleIndentation.repeat(_indentationDepth))
    }

    private fun printNewLine() {
        _currentLength = 0
        outputStreamWriter.write(_lineSeparator)
    }

    private fun printString(str: String) {
        _currentLength += str.length
        outputStreamWriter.write(str)
    }

    private fun printLineStart(str: String) {
        printIndentation()
        printString(str)
    }

    private fun printLine(str: String) {
        printLineStart(str)
        printNewLine()
    }

    private fun printSpace() {
        printString(_space)
    }

    override fun visitFunc(ctx: SimpleFunctionParser.FuncContext): Void? {
        visitHeader(ctx.header())
        visitExprsBlock(ctx.exprsBlock())

        return null
    }

    override fun visitHeader(ctx: SimpleFunctionParser.HeaderContext): Void? {
        visitTerminal(ctx.FUN())
        printSpace()
        visitTerminal(ctx.NAME())
        visitTerminal(ctx.LBRACKET())

        if (ctx.args() != null) {
            visitArgs(ctx.args())
        }

        visitTerminal(ctx.RBRACKET())
        visitTypeIndicator(ctx.typeIndicator())
        printSpace()

        return null
    }

    override fun visitArgs(ctx: SimpleFunctionParser.ArgsContext): Void? {
        var length = _currentLength
        for (child in ctx.children) {
            if (child is SimpleFunctionParser.ArgumentContext) {
                length += child.NAME().text.length
            } else if (child is SimpleFunctionParser.ArgumentWithCommaContext) {
                length += child.argument().NAME().text.length + 2
            }
        }

        val newLineList = length > _maxLength

        if (newLineList) {
            _indentationDepth++
        }

        for (child in ctx.children) {
            var str = ""

            if (child is SimpleFunctionParser.ArgumentContext) {
                str = child.NAME().text
            } else if (child is SimpleFunctionParser.ArgumentWithCommaContext) {
                str = child.argument().NAME().text + child.COMMA().text
            }

            if (newLineList) {
                printLine(str)
            } else {
                if (child is SimpleFunctionParser.ArgumentWithCommaContext) {
                    str += _space
                }

                printString(str)
            }
        }

        if (newLineList) {
            _indentationDepth--
        }

        return null
    }

    override fun visitTypeIndicator(ctx: SimpleFunctionParser.TypeIndicatorContext?): Void? {
        if (ctx != null) {
            visitTerminal(ctx.COLON())
            printSpace()
            visitTerminal(ctx.TYPE())
        }

        return null
    }

    override fun visitExprsBlock(ctx: SimpleFunctionParser.ExprsBlockContext): Void? {
        visitTerminal(ctx.CURLY_LBRACKET())
        printNewLine()
        _indentationDepth++
        visitExprs(ctx.exprs())
        _indentationDepth--
        visitTerminal(ctx.CURLY_RBRACKET())
        printNewLine()

        return null
    }

    override fun visitExprs(ctx: SimpleFunctionParser.ExprsContext?): Void? {
        if (ctx != null) {
            for (child in ctx.children) {
                visitExpr((child as SimpleFunctionParser.ExprContext))
                printNewLine()
            }
        }

        return null
    }

    override fun visitExpr(ctx: SimpleFunctionParser.ExprContext): Void? {
        printIndentation()
        when (ctx.getChild(0)) {
            is SimpleFunctionParser.ReturnStatementContext -> {
                visitReturnStatement(ctx.getChild(0) as SimpleFunctionParser.ReturnStatementContext)
            }
            is SimpleFunctionParser.IfExpressionContext -> {
                visitIfExpression(ctx.getChild(0) as SimpleFunctionParser.IfExpressionContext)
            }
            is SimpleFunctionParser.AssignmentContext -> {
                visitAssignment(ctx.getChild(0) as SimpleFunctionParser.AssignmentContext)
            }
            is SimpleFunctionParser.FunctionCallContext -> {
                visitFunctionCall(ctx.getChild(0) as SimpleFunctionParser.FunctionCallContext)
            }
            is SimpleFunctionParser.PrintExpressionContext -> {
                visitPrintExpression(ctx.getChild(0) as SimpleFunctionParser.PrintExpressionContext)
            }
            is SimpleFunctionParser.CycleContext -> {
                visitCycle(ctx.getChild(0) as SimpleFunctionParser.CycleContext)
            }
        }

        return null
    }

    override fun visitReturnStatement(ctx: SimpleFunctionParser.ReturnStatementContext): Void? {
        printString(ctx.RETURN().text)
        printSpace()
        visitValue(ctx.value())
        printNewLine()

        return null
    }

    override fun visitIfExpression(ctx: SimpleFunctionParser.IfExpressionContext): Void? {
        visitIfCond(ctx.ifCond())
        print(_space)
        visitExprsBlock(ctx.exprsBlock()[0])

        if (ctx.ELSE() != null) {
            visitTerminal(ctx.ELSE())
            visitExprsBlock(ctx.exprsBlock()[1])
        }

        printNewLine()

        return null
    }

    override fun visitIfCond(ctx: SimpleFunctionParser.IfCondContext): Void? {
        visitTerminal(ctx.IF())
        printString(_space)
        visitTerminal(ctx.LBRACKET())
        _indentationDepth++
        visitLogicExpr(ctx.logicExpr())
        _indentationDepth--
        visitTerminal(ctx.RBRACKET())

        return null
    }

    override fun visitLogicExpr(ctx: SimpleFunctionParser.LogicExprContext): Void? {
        when {
            ctx.LBRACKET() != null -> {
                visitTerminal(ctx.LBRACKET())
                visitLogicExpr(ctx.logicExpr())
                visitTerminal(ctx.RBRACKET())
            }
            ctx.children.size == 1 -> {
                visitLogicAtom(ctx.logicAtom())
            }
            else -> {
                visitLogicAtom(ctx.logicAtom())
                printString(_space)
                visitTerminal(ctx.LOGICAL_OPERATOR())

                if (_currentLength >= _maxLength) {
                    printNewLine()
                    printIndentation()
                } else {
                    printString(_space)
                }

                visitLogicExpr(ctx.logicExpr())
            }
        }

        return null
    }

    override fun visitAssignment(ctx: SimpleFunctionParser.AssignmentContext): Void? {
        visitTerminal(ctx.NAME())

        if (ctx.typeIndicator() != null) {
            visitTypeIndicator(ctx.typeIndicator())
        }

        visitTerminal(ctx.EQUALITY())
        visitAssignmentExpr(ctx.assignmentExpr())

        return null
    }

    override fun visitAssignmentExpr(ctx: SimpleFunctionParser.AssignmentExprContext): Void? {
        when (ctx.getChild(0)) {
            is SimpleFunctionParser.FunctionCallContext -> {
                visitFunctionCall(ctx.getChild(0) as SimpleFunctionParser.FunctionCallContext)
            }
            is SimpleFunctionParser.ValueContext -> {
                visitValue(ctx.getChild(0) as SimpleFunctionParser.ValueContext)
            }
        }

        return null
    }

    override fun visitFunctionCall(ctx: SimpleFunctionParser.FunctionCallContext): Void? {
        visitTerminal(ctx.NAME())
        visitTerminal(ctx.LBRACKET())
        visitVals(ctx.vals())
        visitTerminal(ctx.RBRACKET())

        return null
    }

    override fun visitVals(ctx: SimpleFunctionParser.ValsContext): Void? {
        var length = _currentLength
        for (child in ctx.children) {
            if (child is SimpleFunctionParser.ValueContext) {
                length += child.NAME().text.length
            } else if (child is SimpleFunctionParser.ValueWithCommaContext) {
                length += child.value().NAME().text.length + 2
            }
        }

        val newLineList = length > _maxLength

        if (newLineList) {
            _indentationDepth++
        }

        for (child in ctx.children) {
            var str = ""

            if (child is SimpleFunctionParser.ValueContext) {
                str = child.getChild(0).text
            } else if (child is SimpleFunctionParser.ValueWithCommaContext) {
                str = child.value().NAME().text + child.COMMA().text
            }

            if (newLineList) {
                printLine(str)
            } else {
                if (child is SimpleFunctionParser.ValueWithCommaContext) {
                    str += _space
                }

                printString(str)
            }
        }

        if (newLineList) {
            _indentationDepth--
        }

        return null
    }

    override fun visitValue(ctx: SimpleFunctionParser.ValueContext): Void? {
        visitTerminal(ctx.getChild(0) as TerminalNode)

        return null
    }

    override fun visitPrintExpression(ctx: SimpleFunctionParser.PrintExpressionContext): Void? {
        visitTerminal(ctx.PRINT_FUN())
        visitTerminal(ctx.LBRACKET())
        visitValue(ctx.value())
        visitTerminal(ctx.RBRACKET())

        return null
    }

    override fun visitCycle(ctx: SimpleFunctionParser.CycleContext): Void? {
        when (ctx.getChild(0)) {
            is SimpleFunctionParser.ForCycleContext -> {
                visitForCycle(ctx.getChild(0) as SimpleFunctionParser.ForCycleContext)
            }
            is SimpleFunctionParser.WhileCycleContext -> {
                visitWhileCycle(ctx.getChild(0) as SimpleFunctionParser.WhileCycleContext)
            }
            is SimpleFunctionParser.DoWhileCycleContext -> {
                visitDoWhileCycle(ctx.getChild(0) as SimpleFunctionParser.DoWhileCycleContext)
            }
        }

        return null
    }

    override fun visitForCycle(ctx: SimpleFunctionParser.ForCycleContext): Void? {
        visitTerminal(ctx.FOR())
        printString(_space)
        visitTerminal(ctx.LBRACKET())
        visitTerminal(ctx.NAME(0))

        if (ctx.typeIndicator() != null) {
            visitTypeIndicator(ctx.typeIndicator()) // TODO
        }

        visitTerminal(ctx.IN())
        visitTerminal(ctx.NAME(1))
        visitTerminal(ctx.RBRACKET())
        visitExprsBlock(ctx.exprsBlock())

        return null
    }

    override fun visitWhileCycle(ctx: SimpleFunctionParser.WhileCycleContext): Void? {
        visitTerminal(ctx.WHILE())
        printString(_space)
        visitTerminal(ctx.LBRACKET())

        if (ctx.logicExpr() != null) {
            visitLogicExpr(ctx.logicExpr())
        }

        visitTerminal(ctx.RBRACKET())
        visitExprsBlock(ctx.exprsBlock())

        return null
    }

    override fun visitDoWhileCycle(ctx: SimpleFunctionParser.DoWhileCycleContext): Void? {
        visitTerminal(ctx.DO())
        printString(_space)
        visitExprsBlock(ctx.exprsBlock())
        visitTerminal(ctx.WHILE())
        printString(_space)
        visitTerminal(ctx.LBRACKET())

        if (ctx.logicExpr() != null) {
            visitLogicExpr(ctx.logicExpr())
        }

        visitTerminal(ctx.RBRACKET())

        return null
    }

    override fun visitTerminal(node: TerminalNode?): Void? {
        printString(node?.text?: "")
        return null
    }
}