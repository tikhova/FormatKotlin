import org.antlr.v4.runtime.tree.TerminalNode
import java.io.OutputStreamWriter

class KotlinFunctionVisitor(private val outputStreamWriter: OutputStreamWriter) : SimpleFunctionBaseVisitor<Void?>() {
    private val _lineSeparator = System.lineSeparator()
    private val _space = " "
    private val _singleIndentation = "    "
    private var _indentationDepth = 0
    private var _currentLength = 0
    private val _maxLength = 80

    private fun getIndentation(): String {
        return _singleIndentation.repeat(_indentationDepth)
    }

    private fun printIndentation() {
        _currentLength += _indentationDepth * _singleIndentation.length
        outputStreamWriter.write(getIndentation())
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

    // FUNCTION

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
            when (child) {
                is SimpleFunctionParser.ArgumentContext -> length += getString(child).length
                is SimpleFunctionParser.ArgumentWithCommaContext -> length += getString(child).length
            }
        }

        val newLineList = length > _maxLength

        if (newLineList) {
            _indentationDepth++
        }

        var firstArg = true

        for (child in ctx.children) {
            var str = ""

            when (child) {
                is SimpleFunctionParser.ArgumentContext -> str = getString(child)
                is SimpleFunctionParser.ArgumentWithCommaContext -> str = getString(child)
            }

            if (newLineList) {
                if (firstArg) {
                    firstArg = false
                    printNewLine()
                }

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
        printIndentation()
        visitTerminal(ctx.CURLY_RBRACKET())

        return null
    }

    override fun visitExprs(ctx: SimpleFunctionParser.ExprsContext?): Void? {
        if (ctx != null) {
            for (child in ctx.expr()) {
                visitExpr((child as SimpleFunctionParser.ExprContext))
                printNewLine()
            }
        }

        return null
    }

    override fun visitExpr(ctx: SimpleFunctionParser.ExprContext): Void? {
        printIndentation()
        super.visitExpr(ctx)

        return null
    }

    // RETURN

    override fun visitReturnStatement(ctx: SimpleFunctionParser.ReturnStatementContext): Void? {
        printString(ctx.RETURN().text)
        printSpace()
        visitValue(ctx.value())

        return null
    }

    // IF EXPRESSION

    override fun visitIfExpression(ctx: SimpleFunctionParser.IfExpressionContext): Void? {
        visitIfCond(ctx.ifCond())
        printSpace()
        visitExprsBlock(ctx.exprsBlock(0))

        if (ctx.ELSE() != null) {
            printSpace()
            visitTerminal(ctx.ELSE())
            printSpace()
            visitExprsBlock(ctx.exprsBlock(1))
        }

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
                printSpace()
                visitTerminal(ctx.LOGICAL_OPERATOR())

                if (_currentLength >= _maxLength) {
                    printNewLine()
                    printIndentation()
                } else {
                    printSpace()
                }

                visitLogicExpr(ctx.logicExpr())
            }
        }

        return null
    }

    // ASSIGNMENT

    override fun visitAssignment(ctx: SimpleFunctionParser.AssignmentContext): Void? {
        visitTerminal(ctx.NAME())
        printSpace()
        visitAssignmentOperator(ctx.assignmentOperator())
        printSpace()
        visitAssignableVal(ctx.assignableVal())

        return null
    }

    override fun visitDefinition(ctx: SimpleFunctionParser.DefinitionContext): Void? {
        visitTerminal(ctx.VARIABLE_TYPE())
        printSpace()
        visitTerminal(ctx.NAME())
        visitTypeIndicator(ctx.typeIndicator())
        printSpace()
        visitTerminal(ctx.EQUAL())
        printSpace()
        visitAssignableVal(ctx.assignableVal())

        return null
    }

    // CYCLES

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
        printSpace()
        visitTerminal(ctx.LBRACKET())
        visitTerminal(ctx.NAME(0))
        visitTypeIndicator(ctx.typeIndicator())
        printSpace()
        visitTerminal(ctx.IN())
        printSpace()
        visitTerminal(ctx.NAME(1))
        visitTerminal(ctx.RBRACKET())
        printSpace()
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
        printSpace()
        visitExprsBlock(ctx.exprsBlock())
        printSpace()
        visitTerminal(ctx.WHILE())
        printSpace()
        visitTerminal(ctx.LBRACKET())

        if (ctx.logicExpr() != null) {
            visitLogicExpr(ctx.logicExpr())
        }

        visitTerminal(ctx.RBRACKET())

        return null
    }

    // VALUES

    override fun visitVals(ctx: SimpleFunctionParser.ValsContext): Void? {
        for (child in ctx.valueWithComma()) {
            visitValueWithComma(child)
            printSpace()
        }
        visitAssignableVal(ctx.assignableVal())

        return null
    }

    override fun visitCalculation(ctx: SimpleFunctionParser.CalculationContext): Void? {
        if (ctx.children.size == 1 || ctx.LBRACKET() != null) {
            super.visitCalculation(ctx)
        } else {
            visitValue(ctx.value())
            printSpace()
            visitTerminal(ctx.OPERATOR())
            printSpace()
            visitCalculation(ctx.calculation())
        }

        return null
    }

    override fun visitTerminal(node: TerminalNode?): Void? {
        var str = node?.text

        str = if (str?.startsWith("\"") == true) {
            str.replace(Regex(pattern = "${_lineSeparator}+${_space}*"), "\" +${_lineSeparator}${getIndentation()}${_singleIndentation.repeat(2)}\"")
        } else {
            str?.replace(_lineSeparator, "")
        }

        printString(str ?: "")

        return null
    }


    // GET STRING

    private fun getString(ctx: SimpleFunctionParser.ArgumentContext): String =
            ctx.NAME().text + getString(ctx.typeIndicator())

    private fun getString(ctx: SimpleFunctionParser.ArgumentWithCommaContext): String =
            getString(ctx.argument()) + ctx.COMMA().text

    private fun getString(ctx: SimpleFunctionParser.TypeIndicatorContext): String =
            ctx.COLON().text + _space + ctx.TYPE().text
}