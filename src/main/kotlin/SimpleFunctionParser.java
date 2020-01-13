// Generated from /shared/YandexDisk/ITMO/year2019/parsers/FormatKotlin/src/main/kotlin/SimpleFunction.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleFunctionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT=1, COMMA=2, COLON=3, LBRACKET=4, RBRACKET=5, CURLY_LBRACKET=6, CURLY_RBRACKET=7, 
		EQUALITY=8, VARIABLE_TYPE=9, LOGICAL_VALUE=10, LOGICAL_OPERATOR=11, OPERATOR=12, 
		TYPE=13, FUN=14, FOR=15, ELSE=16, IN=17, IF=18, WHILE=19, DO=20, PRINT_FUN=21, 
		RETURN=22, NAME=23, STR=24, EPS=25, WS=26;
	public static final int
		RULE_func = 0, RULE_header = 1, RULE_typeIndicator = 2, RULE_args = 3, 
		RULE_argument = 4, RULE_argumentWithComma = 5, RULE_exprsBlock = 6, RULE_exprs = 7, 
		RULE_expr = 8, RULE_calculation = 9, RULE_assignment = 10, RULE_assignmentExpr = 11, 
		RULE_functionCall = 12, RULE_vals = 13, RULE_valueWithComma = 14, RULE_value = 15, 
		RULE_cycle = 16, RULE_forCycle = 17, RULE_whileCycle = 18, RULE_doWhileCycle = 19, 
		RULE_returnStatement = 20, RULE_ifExpression = 21, RULE_printExpression = 22, 
		RULE_ifCond = 23, RULE_logicExpr = 24, RULE_logicAtom = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"func", "header", "typeIndicator", "args", "argument", "argumentWithComma", 
			"exprsBlock", "exprs", "expr", "calculation", "assignment", "assignmentExpr", 
			"functionCall", "vals", "valueWithComma", "value", "cycle", "forCycle", 
			"whileCycle", "doWhileCycle", "returnStatement", "ifExpression", "printExpression", 
			"ifCond", "logicExpr", "logicAtom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "','", "':'", "'('", "')'", "'{'", "'}'", "'='", null, null, 
			null, null, null, "'fun'", "'for'", "'else'", "'in'", "'if'", "'while'", 
			"'do'", null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOT", "COMMA", "COLON", "LBRACKET", "RBRACKET", "CURLY_LBRACKET", 
			"CURLY_RBRACKET", "EQUALITY", "VARIABLE_TYPE", "LOGICAL_VALUE", "LOGICAL_OPERATOR", 
			"OPERATOR", "TYPE", "FUN", "FOR", "ELSE", "IN", "IF", "WHILE", "DO", 
			"PRINT_FUN", "RETURN", "NAME", "STR", "EPS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleFunction.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleFunctionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FuncContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public ExprsBlockContext exprsBlock() {
			return getRuleContext(ExprsBlockContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			header();
			setState(53);
			exprsBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(SimpleFunctionParser.FUN, 0); }
		public TerminalNode NAME() { return getToken(SimpleFunctionParser.NAME, 0); }
		public TerminalNode LBRACKET() { return getToken(SimpleFunctionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TypeIndicatorContext typeIndicator() {
			return getRuleContext(TypeIndicatorContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(FUN);
			setState(56);
			match(NAME);
			setState(57);
			match(LBRACKET);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(58);
				args();
				}
			}

			setState(61);
			match(RBRACKET);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(62);
				typeIndicator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIndicatorContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SimpleFunctionParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(SimpleFunctionParser.TYPE, 0); }
		public TypeIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIndicator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitTypeIndicator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIndicatorContext typeIndicator() throws RecognitionException {
		TypeIndicatorContext _localctx = new TypeIndicatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(COLON);
			setState(66);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public List<ArgumentWithCommaContext> argumentWithComma() {
			return getRuleContexts(ArgumentWithCommaContext.class);
		}
		public ArgumentWithCommaContext argumentWithComma(int i) {
			return getRuleContext(ArgumentWithCommaContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					argumentWithComma();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(74);
			argument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimpleFunctionParser.NAME, 0); }
		public TypeIndicatorContext typeIndicator() {
			return getRuleContext(TypeIndicatorContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(NAME);
			setState(77);
			typeIndicator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentWithCommaContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimpleFunctionParser.COMMA, 0); }
		public ArgumentWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentWithComma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitArgumentWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentWithCommaContext argumentWithComma() throws RecognitionException {
		ArgumentWithCommaContext _localctx = new ArgumentWithCommaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argumentWithComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			argument();
			setState(80);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprsBlockContext extends ParserRuleContext {
		public TerminalNode CURLY_LBRACKET() { return getToken(SimpleFunctionParser.CURLY_LBRACKET, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode CURLY_RBRACKET() { return getToken(SimpleFunctionParser.CURLY_RBRACKET, 0); }
		public ExprsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitExprsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsBlockContext exprsBlock() throws RecognitionException {
		ExprsBlockContext _localctx = new ExprsBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CURLY_LBRACKET);
			setState(83);
			exprs();
			setState(84);
			match(CURLY_RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << PRINT_FUN) | (1L << RETURN) | (1L << NAME))) != 0)) {
				{
				{
				setState(86);
				expr();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				ifExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				printExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				cycle();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalculationContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(SimpleFunctionParser.OPERATOR, 0); }
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitCalculation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_calculation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			value();
			setState(101);
			match(OPERATOR);
			setState(102);
			calculation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimpleFunctionParser.NAME, 0); }
		public TerminalNode EQUALITY() { return getToken(SimpleFunctionParser.EQUALITY, 0); }
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public TypeIndicatorContext typeIndicator() {
			return getRuleContext(TypeIndicatorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(NAME);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(105);
				typeIndicator();
				}
			}

			setState(108);
			match(EQUALITY);
			setState(109);
			assignmentExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentExpr);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimpleFunctionParser.NAME, 0); }
		public TerminalNode LBRACKET() { return getToken(SimpleFunctionParser.LBRACKET, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(NAME);
			setState(116);
			match(LBRACKET);
			setState(117);
			vals();
			setState(118);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<ValueWithCommaContext> valueWithComma() {
			return getRuleContexts(ValueWithCommaContext.class);
		}
		public ValueWithCommaContext valueWithComma(int i) {
			return getRuleContext(ValueWithCommaContext.class,i);
		}
		public ValsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitVals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValsContext vals() throws RecognitionException {
		ValsContext _localctx = new ValsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vals);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					valueWithComma();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(126);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueWithCommaContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimpleFunctionParser.COMMA, 0); }
		public ValueWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueWithComma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitValueWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueWithCommaContext valueWithComma() throws RecognitionException {
		ValueWithCommaContext _localctx = new ValueWithCommaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valueWithComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			value();
			setState(129);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimpleFunctionParser.NAME, 0); }
		public TerminalNode STR() { return getToken(SimpleFunctionParser.STR, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==STR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CycleContext extends ParserRuleContext {
		public ForCycleContext forCycle() {
			return getRuleContext(ForCycleContext.class,0);
		}
		public WhileCycleContext whileCycle() {
			return getRuleContext(WhileCycleContext.class,0);
		}
		public DoWhileCycleContext doWhileCycle() {
			return getRuleContext(DoWhileCycleContext.class,0);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cycle);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				forCycle();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				whileCycle();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				doWhileCycle();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForCycleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SimpleFunctionParser.FOR, 0); }
		public TerminalNode LBRACKET() { return getToken(SimpleFunctionParser.LBRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(SimpleFunctionParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SimpleFunctionParser.NAME, i);
		}
		public TerminalNode IN() { return getToken(SimpleFunctionParser.IN, 0); }
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
		public ExprsBlockContext exprsBlock() {
			return getRuleContext(ExprsBlockContext.class,0);
		}
		public TypeIndicatorContext typeIndicator() {
			return getRuleContext(TypeIndicatorContext.class,0);
		}
		public ForCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCycle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitForCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForCycleContext forCycle() throws RecognitionException {
		ForCycleContext _localctx = new ForCycleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(FOR);
			setState(139);
			match(LBRACKET);
			setState(140);
			match(NAME);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(141);
				typeIndicator();
				}
			}

			setState(144);
			match(IN);
			setState(145);
			match(NAME);
			setState(146);
			match(RBRACKET);
			setState(147);
			exprsBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileCycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimpleFunctionParser.WHILE, 0); }
		public TerminalNode LBRACKET() { return getToken(SimpleFunctionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
		public ExprsBlockContext exprsBlock() {
			return getRuleContext(ExprsBlockContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public WhileCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCycle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitWhileCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileCycleContext whileCycle() throws RecognitionException {
		WhileCycleContext _localctx = new WhileCycleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(WHILE);
			setState(150);
			match(LBRACKET);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << LBRACKET) | (1L << LOGICAL_VALUE) | (1L << NAME))) != 0)) {
				{
				setState(151);
				logicExpr();
				}
			}

			setState(154);
			match(RBRACKET);
			setState(155);
			exprsBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileCycleContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(SimpleFunctionParser.DO, 0); }
		public ExprsBlockContext exprsBlock() {
			return getRuleContext(ExprsBlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(SimpleFunctionParser.WHILE, 0); }
		public TerminalNode LBRACKET() { return getToken(SimpleFunctionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public DoWhileCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileCycle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitDoWhileCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileCycleContext doWhileCycle() throws RecognitionException {
		DoWhileCycleContext _localctx = new DoWhileCycleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_doWhileCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(DO);
			setState(158);
			exprsBlock();
			setState(159);
			match(WHILE);
			setState(160);
			match(LBRACKET);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << LBRACKET) | (1L << LOGICAL_VALUE) | (1L << NAME))) != 0)) {
				{
				setState(161);
				logicExpr();
				}
			}

			setState(164);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SimpleFunctionParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(RETURN);
			setState(167);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpressionContext extends ParserRuleContext {
		public IfCondContext ifCond() {
			return getRuleContext(IfCondContext.class,0);
		}
		public List<ExprsBlockContext> exprsBlock() {
			return getRuleContexts(ExprsBlockContext.class);
		}
		public ExprsBlockContext exprsBlock(int i) {
			return getRuleContext(ExprsBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleFunctionParser.ELSE, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			ifCond();
			setState(170);
			exprsBlock();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(171);
				match(ELSE);
				setState(172);
				exprsBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintExpressionContext extends ParserRuleContext {
		public TerminalNode PRINT_FUN() { return getToken(SimpleFunctionParser.PRINT_FUN, 0); }
		public TerminalNode LBRACKET() { return getToken(SimpleFunctionParser.LBRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_printExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(PRINT_FUN);
			setState(176);
			match(LBRACKET);
			setState(177);
			value();
			setState(178);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCondContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleFunctionParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(SimpleFunctionParser.LBRACKET, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
		public IfCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitIfCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCondContext ifCond() throws RecognitionException {
		IfCondContext _localctx = new IfCondContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IF);
			setState(181);
			match(LBRACKET);
			setState(182);
			logicExpr();
			setState(183);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExprContext extends ParserRuleContext {
		public LogicAtomContext logicAtom() {
			return getRuleContext(LogicAtomContext.class,0);
		}
		public TerminalNode LOGICAL_OPERATOR() { return getToken(SimpleFunctionParser.LOGICAL_OPERATOR, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(SimpleFunctionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicExpr);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				logicAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				logicAtom();
				setState(187);
				match(LOGICAL_OPERATOR);
				setState(188);
				logicExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(LBRACKET);
				setState(191);
				logicExpr();
				setState(192);
				match(RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicAtomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimpleFunctionParser.NAME, 0); }
		public TerminalNode NOT() { return getToken(SimpleFunctionParser.NOT, 0); }
		public TerminalNode LOGICAL_VALUE() { return getToken(SimpleFunctionParser.LOGICAL_VALUE, 0); }
		public LogicAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitLogicAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicAtomContext logicAtom() throws RecognitionException {
		LogicAtomContext _localctx = new LogicAtomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicAtom);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(NAME);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(NOT);
				setState(198);
				match(NAME);
				}
				break;
			case LOGICAL_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(LOGICAL_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\5\3"+
		"B\n\3\3\4\3\4\3\4\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\ne\n\n\3\13\3\13\3\13\3\13\3\f\3\f\5\fm\n\f\3\f\3\f\3\f\3\r\3"+
		"\r\5\rt\n\r\3\16\3\16\3\16\3\16\3\16\3\17\7\17|\n\17\f\17\16\17\177\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u008b\n\22"+
		"\3\23\3\23\3\23\3\23\5\23\u0091\n\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\5\24\u009b\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00a5"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00b0\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00c5\n\32\3\33\3\33\3\33\3\33\5\33\u00cb\n"+
		"\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\2\3\3\2\31\32\2\u00c8\2\66\3\2\2\2\49\3\2\2\2\6C\3\2\2\2\bI\3\2\2"+
		"\2\nN\3\2\2\2\fQ\3\2\2\2\16T\3\2\2\2\20[\3\2\2\2\22d\3\2\2\2\24f\3\2\2"+
		"\2\26j\3\2\2\2\30s\3\2\2\2\32u\3\2\2\2\34}\3\2\2\2\36\u0082\3\2\2\2 \u0085"+
		"\3\2\2\2\"\u008a\3\2\2\2$\u008c\3\2\2\2&\u0097\3\2\2\2(\u009f\3\2\2\2"+
		"*\u00a8\3\2\2\2,\u00ab\3\2\2\2.\u00b1\3\2\2\2\60\u00b6\3\2\2\2\62\u00c4"+
		"\3\2\2\2\64\u00ca\3\2\2\2\66\67\5\4\3\2\678\5\16\b\28\3\3\2\2\29:\7\20"+
		"\2\2:;\7\31\2\2;=\7\6\2\2<>\5\b\5\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\7"+
		"\7\2\2@B\5\6\4\2A@\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CD\7\5\2\2DE\7\17\2\2E"+
		"\7\3\2\2\2FH\5\f\7\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2"+
		"KI\3\2\2\2LM\5\n\6\2M\t\3\2\2\2NO\7\31\2\2OP\5\6\4\2P\13\3\2\2\2QR\5\n"+
		"\6\2RS\7\4\2\2S\r\3\2\2\2TU\7\b\2\2UV\5\20\t\2VW\7\t\2\2W\17\3\2\2\2X"+
		"Z\5\22\n\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2"+
		"\2\2^e\5*\26\2_e\5,\27\2`e\5\26\f\2ae\5\32\16\2be\5.\30\2ce\5\"\22\2d"+
		"^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\23\3\2\2"+
		"\2fg\5 \21\2gh\7\16\2\2hi\5\24\13\2i\25\3\2\2\2jl\7\31\2\2km\5\6\4\2l"+
		"k\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\n\2\2op\5\30\r\2p\27\3\2\2\2qt\5\32"+
		"\16\2rt\5 \21\2sq\3\2\2\2sr\3\2\2\2t\31\3\2\2\2uv\7\31\2\2vw\7\6\2\2w"+
		"x\5\34\17\2xy\7\7\2\2y\33\3\2\2\2z|\5\36\20\2{z\3\2\2\2|\177\3\2\2\2}"+
		"{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\5 \21\2\u0081"+
		"\35\3\2\2\2\u0082\u0083\5 \21\2\u0083\u0084\7\4\2\2\u0084\37\3\2\2\2\u0085"+
		"\u0086\t\2\2\2\u0086!\3\2\2\2\u0087\u008b\5$\23\2\u0088\u008b\5&\24\2"+
		"\u0089\u008b\5(\25\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b#\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u008e\7\6\2\2\u008e"+
		"\u0090\7\31\2\2\u008f\u0091\5\6\4\2\u0090\u008f\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\23\2\2\u0093\u0094\7\31\2\2\u0094"+
		"\u0095\7\7\2\2\u0095\u0096\5\16\b\2\u0096%\3\2\2\2\u0097\u0098\7\25\2"+
		"\2\u0098\u009a\7\6\2\2\u0099\u009b\5\62\32\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\7\2\2\u009d\u009e\5\16"+
		"\b\2\u009e\'\3\2\2\2\u009f\u00a0\7\26\2\2\u00a0\u00a1\5\16\b\2\u00a1\u00a2"+
		"\7\25\2\2\u00a2\u00a4\7\6\2\2\u00a3\u00a5\5\62\32\2\u00a4\u00a3\3\2\2"+
		"\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\7\2\2\u00a7)"+
		"\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\5 \21\2\u00aa+\3\2\2\2\u00ab"+
		"\u00ac\5\60\31\2\u00ac\u00af\5\16\b\2\u00ad\u00ae\7\22\2\2\u00ae\u00b0"+
		"\5\16\b\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0-\3\2\2\2\u00b1"+
		"\u00b2\7\27\2\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7"+
		"\7\2\2\u00b5/\3\2\2\2\u00b6\u00b7\7\24\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9"+
		"\5\62\32\2\u00b9\u00ba\7\7\2\2\u00ba\61\3\2\2\2\u00bb\u00c5\5\64\33\2"+
		"\u00bc\u00bd\5\64\33\2\u00bd\u00be\7\r\2\2\u00be\u00bf\5\62\32\2\u00bf"+
		"\u00c5\3\2\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\5\62\32\2\u00c2\u00c3\7"+
		"\7\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c5\63\3\2\2\2\u00c6\u00cb\7\31\2\2\u00c7\u00c8\7\3\2"+
		"\2\u00c8\u00cb\7\31\2\2\u00c9\u00cb\7\f\2\2\u00ca\u00c6\3\2\2\2\u00ca"+
		"\u00c7\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\65\3\2\2\2\21=AI[dls}\u008a\u0090"+
		"\u009a\u00a4\u00af\u00c4\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}