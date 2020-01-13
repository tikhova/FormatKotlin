// Generated from /shared/YandexDisk/ITMO/year2019/parsers/FormatKotlin/src/main/kotlin/SimpleFunction.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleFunctionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleFunctionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(SimpleFunctionParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SimpleFunctionParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#typeIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIndicator(SimpleFunctionParser.TypeIndicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(SimpleFunctionParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SimpleFunctionParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#argumentWithComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentWithComma(SimpleFunctionParser.ArgumentWithCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#exprsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprsBlock(SimpleFunctionParser.ExprsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(SimpleFunctionParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleFunctionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculation(SimpleFunctionParser.CalculationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleFunctionParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#assignmentExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(SimpleFunctionParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SimpleFunctionParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVals(SimpleFunctionParser.ValsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#valueWithComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueWithComma(SimpleFunctionParser.ValueWithCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SimpleFunctionParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(SimpleFunctionParser.CycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#forCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCycle(SimpleFunctionParser.ForCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#whileCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCycle(SimpleFunctionParser.WhileCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#doWhileCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileCycle(SimpleFunctionParser.DoWhileCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SimpleFunctionParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(SimpleFunctionParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(SimpleFunctionParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#ifCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCond(SimpleFunctionParser.IfCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr(SimpleFunctionParser.LogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunctionParser#logicAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAtom(SimpleFunctionParser.LogicAtomContext ctx);
}