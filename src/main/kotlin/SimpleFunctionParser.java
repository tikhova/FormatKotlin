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
		T__0=1, T__1=2, NOT=3, COMMA=4, COLON=5, LBRACKET=6, RBRACKET=7, CURLY_LBRACKET=8, 
		CURLY_RBRACKET=9, EQUAL=10, VARIABLE_TYPE=11, LOGICAL_VALUE=12, LOGICAL_OPERATOR=13, 
		OPERATOR=14, TYPE=15, FUN=16, FOR=17, ELSE=18, IN=19, IF=20, WHILE=21, 
		DO=22, PRINT_FUN=23, RETURN=24, NAME=25, NUMBER=26, STR=27, EPS=28, WS=29, 
		NEWLINE=30;
	public static final int
		RULE_func = 0, RULE_header = 1, RULE_typeIndicator = 2, RULE_args = 3, 
		RULE_argument = 4, RULE_argumentWithComma = 5, RULE_exprsBlock = 6, RULE_exprs = 7, 
		RULE_expr = 8, RULE_returnStatement = 9, RULE_ifExpression = 10, RULE_ifCond = 11, 
		RULE_logicExpr = 12, RULE_logicAtom = 13, RULE_assignment = 14, RULE_assignmentOperator = 15, 
		RULE_definition = 16, RULE_functionCall = 17, RULE_printExpression = 18, 
		RULE_cycle = 19, RULE_forCycle = 20, RULE_whileCycle = 21, RULE_doWhileCycle = 22, 
		RULE_vals = 23, RULE_valueWithComma = 24, RULE_assignableVal = 25, RULE_calculation = 26, 
		RULE_value = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"func", "header", "typeIndicator", "args", "argument", "argumentWithComma", 
			"exprsBlock", "exprs", "expr", "returnStatement", "ifExpression", "ifCond", 
			"logicExpr", "logicAtom", "assignment", "assignmentOperator", "definition", 
			"functionCall", "printExpression", "cycle", "forCycle", "whileCycle", 
			"doWhileCycle", "vals", "valueWithComma", "assignableVal", "calculation", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+='", "'-='", "'!'", "','", "':'", "'('", "')'", "'{'", "'}'", 
			"'='", null, null, null, null, null, "'fun'", "'for'", "'else'", "'in'", 
			"'if'", "'while'", "'do'", null, "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NOT", "COMMA", "COLON", "LBRACKET", "RBRACKET", "CURLY_LBRACKET", 
			"CURLY_RBRACKET", "EQUAL", "VARIABLE_TYPE", "LOGICAL_VALUE", "LOGICAL_OPERATOR", 
			"OPERATOR", "TYPE", "FUN", "FOR", "ELSE", "IN", "IF", "WHILE", "DO", 
			"PRINT_FUN", "RETURN", "NAME", "NUMBER", "STR", "EPS", "WS", "NEWLINE"
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
			setState(56);
			header();
			setState(57);
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
			setState(59);
			match(FUN);
			setState(60);
			match(NAME);
			setState(61);
			match(LBRACKET);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(62);
				args();
				}
			}

			setState(65);
			match(RBRACKET);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(66);
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
			setState(69);
			match(COLON);
			setState(70);
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
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					argumentWithComma();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(78);
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
			setState(80);
			match(NAME);
			setState(81);
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
			setState(83);
			argument();
			setState(84);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(CURLY_LBRACKET);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(87);
				match(NEWLINE);
				}
			}

			setState(90);
			exprs();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(91);
				match(NEWLINE);
				}
			}

			setState(94);
			match(CURLY_RBRACKET);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(95);
				match(NEWLINE);
				}
				break;
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					expr();
					setState(99);
					match(NEWLINE);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(106);
			expr();
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
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				ifExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				definition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				printExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
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
		enterRule(_localctx, 18, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(RETURN);
			setState(118);
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
		public TerminalNode NEWLINE() { return getToken(SimpleFunctionParser.NEWLINE, 0); }
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
		enterRule(_localctx, 20, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			ifCond();
			setState(121);
			exprsBlock();
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(122);
				match(NEWLINE);
				}
				break;
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(125);
				match(ELSE);
				setState(126);
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
		enterRule(_localctx, 22, RULE_ifCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IF);
			setState(130);
			match(LBRACKET);
			setState(131);
			logicExpr();
			setState(132);
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
		enterRule(_localctx, 24, RULE_logicExpr);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				logicAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				logicAtom();
				setState(136);
				match(LOGICAL_OPERATOR);
				setState(137);
				logicExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(LBRACKET);
				setState(140);
				logicExpr();
				setState(141);
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
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_logicAtom);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(NAME);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(NOT);
				setState(147);
				logicExpr();
				}
				break;
			case LOGICAL_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimpleFunctionParser.NAME, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignableValContext assignableVal() {
			return getRuleContext(AssignableValContext.class,0);
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
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(NAME);
			setState(152);
			assignmentOperator();
			setState(153);
			assignableVal();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SimpleFunctionParser.EQUAL, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << EQUAL))) != 0)) ) {
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode VARIABLE_TYPE() { return getToken(SimpleFunctionParser.VARIABLE_TYPE, 0); }
		public TerminalNode NAME() { return getToken(SimpleFunctionParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(SimpleFunctionParser.EQUAL, 0); }
		public AssignableValContext assignableVal() {
			return getRuleContext(AssignableValContext.class,0);
		}
		public TypeIndicatorContext typeIndicator() {
			return getRuleContext(TypeIndicatorContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(VARIABLE_TYPE);
			setState(158);
			match(NAME);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(159);
				typeIndicator();
				}
			}

			setState(162);
			match(EQUAL);
			setState(163);
			assignableVal();
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
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(NAME);
			setState(166);
			match(LBRACKET);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << LBRACKET) | (1L << LOGICAL_VALUE) | (1L << NAME) | (1L << NUMBER) | (1L << STR))) != 0)) {
				{
				setState(167);
				vals();
				}
			}

			setState(170);
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
		enterRule(_localctx, 36, RULE_printExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(PRINT_FUN);
			setState(173);
			match(LBRACKET);
			setState(174);
			value();
			setState(175);
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
		enterRule(_localctx, 38, RULE_cycle);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				forCycle();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				whileCycle();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
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
		enterRule(_localctx, 40, RULE_forCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(FOR);
			setState(183);
			match(LBRACKET);
			setState(184);
			match(NAME);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(185);
				typeIndicator();
				}
			}

			setState(188);
			match(IN);
			setState(189);
			match(NAME);
			setState(190);
			match(RBRACKET);
			setState(191);
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
		enterRule(_localctx, 42, RULE_whileCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(WHILE);
			setState(194);
			match(LBRACKET);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << LBRACKET) | (1L << LOGICAL_VALUE) | (1L << NAME))) != 0)) {
				{
				setState(195);
				logicExpr();
				}
			}

			setState(198);
			match(RBRACKET);
			setState(199);
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
		enterRule(_localctx, 44, RULE_doWhileCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(DO);
			setState(202);
			exprsBlock();
			setState(203);
			match(WHILE);
			setState(204);
			match(LBRACKET);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << LBRACKET) | (1L << LOGICAL_VALUE) | (1L << NAME))) != 0)) {
				{
				setState(205);
				logicExpr();
				}
			}

			setState(208);
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
		public AssignableValContext assignableVal() {
			return getRuleContext(AssignableValContext.class,0);
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
		enterRule(_localctx, 46, RULE_vals);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					valueWithComma();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(216);
			assignableVal();
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
		public AssignableValContext assignableVal() {
			return getRuleContext(AssignableValContext.class,0);
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
		enterRule(_localctx, 48, RULE_valueWithComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			assignableVal();
			setState(219);
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

	public static class AssignableValContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public AssignableValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableVal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunctionVisitor ) return ((SimpleFunctionVisitor<? extends T>)visitor).visitAssignableVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableValContext assignableVal() throws RecognitionException {
		AssignableValContext _localctx = new AssignableValContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignableVal);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				calculation();
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
		public TerminalNode LBRACKET() { return getToken(SimpleFunctionParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(SimpleFunctionParser.RBRACKET, 0); }
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
		enterRule(_localctx, 52, RULE_calculation);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				value();
				setState(227);
				match(OPERATOR);
				setState(228);
				calculation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(LBRACKET);
				setState(231);
				calculation();
				setState(232);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SimpleFunctionParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleFunctionParser.NUMBER, 0); }
		public TerminalNode STR() { return getToken(SimpleFunctionParser.STR, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_value);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(STR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				logicExpr();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5"+
		"\3B\n\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\b[\n\b\3\b\3\b\5\b_\n\b\3\b\3\b\5"+
		"\bc\n\b\3\t\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\nv\n\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f~\n\f\3\f\3\f\5\f\u0082"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0092\n\16\3\17\3\17\3\17\3\17\5\17\u0098\n\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\5\22\u00a3\n\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\5\23\u00ab\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\5\25\u00b7\n\25\3\26\3\26\3\26\3\26\5\26\u00bd\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\5\27\u00c7\n\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00d1\n\30\3\30\3\30\3\31\7\31\u00d6\n\31\f\31\16\31\u00d9"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\5\33\u00e2\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00ed\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u00f4\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668\2\3\4\2\3\4\f\f\2\u00fb\2:\3\2\2\2\4=\3\2\2"+
		"\2\6G\3\2\2\2\bM\3\2\2\2\nR\3\2\2\2\fU\3\2\2\2\16X\3\2\2\2\20i\3\2\2\2"+
		"\22u\3\2\2\2\24w\3\2\2\2\26z\3\2\2\2\30\u0083\3\2\2\2\32\u0091\3\2\2\2"+
		"\34\u0097\3\2\2\2\36\u0099\3\2\2\2 \u009d\3\2\2\2\"\u009f\3\2\2\2$\u00a7"+
		"\3\2\2\2&\u00ae\3\2\2\2(\u00b6\3\2\2\2*\u00b8\3\2\2\2,\u00c3\3\2\2\2."+
		"\u00cb\3\2\2\2\60\u00d7\3\2\2\2\62\u00dc\3\2\2\2\64\u00e1\3\2\2\2\66\u00ec"+
		"\3\2\2\28\u00f3\3\2\2\2:;\5\4\3\2;<\5\16\b\2<\3\3\2\2\2=>\7\22\2\2>?\7"+
		"\33\2\2?A\7\b\2\2@B\5\b\5\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CE\7\t\2\2DF"+
		"\5\6\4\2ED\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GH\7\7\2\2HI\7\21\2\2I\7\3\2\2"+
		"\2JL\5\f\7\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2"+
		"\2PQ\5\n\6\2Q\t\3\2\2\2RS\7\33\2\2ST\5\6\4\2T\13\3\2\2\2UV\5\n\6\2VW\7"+
		"\6\2\2W\r\3\2\2\2XZ\7\n\2\2Y[\7 \2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\"+
		"^\5\20\t\2]_\7 \2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\7\13\2\2ac\7 \2\2"+
		"ba\3\2\2\2bc\3\2\2\2c\17\3\2\2\2de\5\22\n\2ef\7 \2\2fh\3\2\2\2gd\3\2\2"+
		"\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5\22\n\2m\21\3"+
		"\2\2\2nv\5\24\13\2ov\5\26\f\2pv\5\36\20\2qv\5\"\22\2rv\5$\23\2sv\5&\24"+
		"\2tv\5(\25\2un\3\2\2\2uo\3\2\2\2up\3\2\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2"+
		"\2ut\3\2\2\2v\23\3\2\2\2wx\7\32\2\2xy\58\35\2y\25\3\2\2\2z{\5\30\r\2{"+
		"}\5\16\b\2|~\7 \2\2}|\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177\u0080\7\24"+
		"\2\2\u0080\u0082\5\16\b\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\27\3\2\2\2\u0083\u0084\7\26\2\2\u0084\u0085\7\b\2\2\u0085\u0086\5\32"+
		"\16\2\u0086\u0087\7\t\2\2\u0087\31\3\2\2\2\u0088\u0092\5\34\17\2\u0089"+
		"\u008a\5\34\17\2\u008a\u008b\7\17\2\2\u008b\u008c\5\32\16\2\u008c\u0092"+
		"\3\2\2\2\u008d\u008e\7\b\2\2\u008e\u008f\5\32\16\2\u008f\u0090\7\t\2\2"+
		"\u0090\u0092\3\2\2\2\u0091\u0088\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008d"+
		"\3\2\2\2\u0092\33\3\2\2\2\u0093\u0098\7\33\2\2\u0094\u0095\7\5\2\2\u0095"+
		"\u0098\5\32\16\2\u0096\u0098\7\16\2\2\u0097\u0093\3\2\2\2\u0097\u0094"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\35\3\2\2\2\u0099\u009a\7\33\2\2\u009a"+
		"\u009b\5 \21\2\u009b\u009c\5\64\33\2\u009c\37\3\2\2\2\u009d\u009e\t\2"+
		"\2\2\u009e!\3\2\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a2\7\33\2\2\u00a1\u00a3"+
		"\5\6\4\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\7\f\2\2\u00a5\u00a6\5\64\33\2\u00a6#\3\2\2\2\u00a7\u00a8\7\33\2"+
		"\2\u00a8\u00aa\7\b\2\2\u00a9\u00ab\5\60\31\2\u00aa\u00a9\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\t\2\2\u00ad%\3\2\2\2"+
		"\u00ae\u00af\7\31\2\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\58\35\2\u00b1\u00b2"+
		"\7\t\2\2\u00b2\'\3\2\2\2\u00b3\u00b7\5*\26\2\u00b4\u00b7\5,\27\2\u00b5"+
		"\u00b7\5.\30\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7)\3\2\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bc"+
		"\7\33\2\2\u00bb\u00bd\5\6\4\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\7\33\2\2\u00c0\u00c1"+
		"\7\t\2\2\u00c1\u00c2\5\16\b\2\u00c2+\3\2\2\2\u00c3\u00c4\7\27\2\2\u00c4"+
		"\u00c6\7\b\2\2\u00c5\u00c7\5\32\16\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\t\2\2\u00c9\u00ca\5\16\b\2\u00ca"+
		"-\3\2\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\5\16\b\2\u00cd\u00ce\7\27\2"+
		"\2\u00ce\u00d0\7\b\2\2\u00cf\u00d1\5\32\16\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\t\2\2\u00d3/\3\2\2\2"+
		"\u00d4\u00d6\5\62\32\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\5\64\33\2\u00db\61\3\2\2\2\u00dc\u00dd\5\64\33\2\u00dd\u00de\7"+
		"\6\2\2\u00de\63\3\2\2\2\u00df\u00e2\58\35\2\u00e0\u00e2\5\66\34\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\65\3\2\2\2\u00e3\u00ed\58\35"+
		"\2\u00e4\u00e5\58\35\2\u00e5\u00e6\7\20\2\2\u00e6\u00e7\5\66\34\2\u00e7"+
		"\u00ed\3\2\2\2\u00e8\u00e9\7\b\2\2\u00e9\u00ea\5\66\34\2\u00ea\u00eb\7"+
		"\t\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec"+
		"\u00e8\3\2\2\2\u00ed\67\3\2\2\2\u00ee\u00f4\7\33\2\2\u00ef\u00f4\7\34"+
		"\2\2\u00f0\u00f4\7\35\2\2\u00f1\u00f4\5$\23\2\u00f2\u00f4\5\32\16\2\u00f3"+
		"\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f49\3\2\2\2\30AEMZ^biu}\u0081\u0091\u0097"+
		"\u00a2\u00aa\u00b6\u00bc\u00c6\u00d0\u00d7\u00e1\u00ec\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}