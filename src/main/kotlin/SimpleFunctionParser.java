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
		public TerminalNode NEWLINE() { return getToken(SimpleFunctionParser.NEWLINE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			header();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(57);
				match(NEWLINE);
				}
			}

			setState(60);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
		}
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
			setState(62);
			match(FUN);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(63);
				match(NEWLINE);
				}
			}

			setState(66);
			match(NAME);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(67);
				match(NEWLINE);
				}
			}

			setState(70);
			match(LBRACKET);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(71);
				match(NEWLINE);
				}
				break;
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(74);
				args();
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(77);
				match(NEWLINE);
				}
			}

			setState(80);
			match(RBRACKET);
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(81);
				match(NEWLINE);
				}
				break;
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(84);
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
		public TerminalNode NEWLINE() { return getToken(SimpleFunctionParser.NEWLINE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(COLON);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(88);
				match(NEWLINE);
				}
			}

			setState(91);
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
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					argumentWithComma();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(99);
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
		public TerminalNode NEWLINE() { return getToken(SimpleFunctionParser.NEWLINE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(NAME);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(102);
				match(NEWLINE);
				}
			}

			setState(105);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			argument();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(108);
				match(NEWLINE);
				}
			}

			setState(111);
			match(COMMA);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(112);
				match(NEWLINE);
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
			setState(115);
			match(CURLY_LBRACKET);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(116);
				match(NEWLINE);
				}
			}

			setState(119);
			exprs();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(120);
				match(NEWLINE);
				}
			}

			setState(123);
			match(CURLY_RBRACKET);
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(124);
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
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					expr();
					setState(128);
					match(NEWLINE);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(135);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				ifExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				definition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				printExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
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
			setState(146);
			match(RETURN);
			setState(147);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
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
		enterRule(_localctx, 20, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			ifCond();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(150);
				match(NEWLINE);
				}
			}

			setState(153);
			exprsBlock();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(154);
				match(NEWLINE);
				}
				break;
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(157);
				match(ELSE);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(158);
					match(NEWLINE);
					}
				}

				setState(161);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IF);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(165);
				match(NEWLINE);
				}
			}

			setState(168);
			match(LBRACKET);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(169);
				match(NEWLINE);
				}
			}

			setState(172);
			logicExpr();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(173);
				match(NEWLINE);
				}
			}

			setState(176);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
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
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				logicAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				logicAtom();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(180);
					match(NEWLINE);
					}
				}

				setState(183);
				match(LOGICAL_OPERATOR);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(184);
					match(NEWLINE);
					}
				}

				setState(187);
				logicExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(LBRACKET);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(190);
					match(NEWLINE);
					}
				}

				setState(193);
				logicExpr();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(194);
					match(NEWLINE);
					}
				}

				setState(197);
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
		public TerminalNode NEWLINE() { return getToken(SimpleFunctionParser.NEWLINE, 0); }
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
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(NAME);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(NOT);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(203);
					match(NEWLINE);
					}
				}

				setState(206);
				logicExpr();
				}
				break;
			case LOGICAL_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(NAME);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(211);
				match(NEWLINE);
				}
			}

			setState(214);
			assignmentOperator();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(215);
				match(NEWLINE);
				}
			}

			setState(218);
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
			setState(220);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
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
			setState(222);
			match(VARIABLE_TYPE);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(223);
				match(NEWLINE);
				}
			}

			setState(226);
			match(NAME);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(227);
				match(NEWLINE);
				}
				break;
			}
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(230);
				typeIndicator();
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(233);
				match(NEWLINE);
				}
			}

			setState(236);
			match(EQUAL);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(237);
				match(NEWLINE);
				}
			}

			setState(240);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
		}
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
			setState(242);
			match(NAME);
			setState(243);
			match(LBRACKET);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(244);
				match(NEWLINE);
				}
				break;
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << LBRACKET) | (1L << LOGICAL_VALUE) | (1L << NAME) | (1L << NUMBER) | (1L << STR))) != 0)) {
				{
				setState(247);
				vals();
				}
			}

			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(250);
				match(NEWLINE);
				}
			}

			setState(253);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(PRINT_FUN);
			setState(256);
			match(LBRACKET);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(257);
				match(NEWLINE);
				}
			}

			setState(260);
			value();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(261);
				match(NEWLINE);
				}
			}

			setState(264);
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
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				forCycle();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				whileCycle();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
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
			setState(271);
			match(FOR);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(272);
				match(NEWLINE);
				}
			}

			setState(275);
			match(LBRACKET);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(276);
				match(NEWLINE);
				}
			}

			setState(279);
			match(NAME);
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(280);
				match(NEWLINE);
				}
				break;
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(283);
				typeIndicator();
				}
			}

			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(286);
				match(NEWLINE);
				}
			}

			setState(289);
			match(IN);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(290);
				match(NEWLINE);
				}
			}

			setState(293);
			match(NAME);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(294);
				match(NEWLINE);
				}
			}

			setState(297);
			match(RBRACKET);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(298);
				match(NEWLINE);
				}
			}

			setState(301);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
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
			setState(303);
			match(WHILE);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(304);
				match(NEWLINE);
				}
			}

			setState(307);
			match(LBRACKET);
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(308);
				match(NEWLINE);
				}
				break;
			}
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << LBRACKET) | (1L << LOGICAL_VALUE) | (1L << NAME))) != 0)) {
				{
				setState(311);
				logicExpr();
				}
			}

			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(314);
				match(NEWLINE);
				}
			}

			setState(317);
			match(RBRACKET);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(318);
				match(NEWLINE);
				}
			}

			setState(321);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
		}
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
			setState(323);
			match(DO);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(324);
				match(NEWLINE);
				}
			}

			setState(327);
			exprsBlock();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(328);
				match(NEWLINE);
				}
			}

			setState(331);
			match(WHILE);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(332);
				match(NEWLINE);
				}
			}

			setState(335);
			match(LBRACKET);
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(336);
				match(NEWLINE);
				}
				break;
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << LBRACKET) | (1L << LOGICAL_VALUE) | (1L << NAME))) != 0)) {
				{
				setState(339);
				logicExpr();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(342);
				match(NEWLINE);
				}
			}

			setState(345);
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
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					valueWithComma();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(353);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			assignableVal();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(356);
				match(NEWLINE);
				}
			}

			setState(359);
			match(COMMA);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(360);
				match(NEWLINE);
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
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleFunctionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleFunctionParser.NEWLINE, i);
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
		int _la;
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				value();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(369);
					match(NEWLINE);
					}
				}

				setState(372);
				match(OPERATOR);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(373);
					match(NEWLINE);
					}
				}

				setState(376);
				calculation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(LBRACKET);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(379);
					match(NEWLINE);
					}
				}

				setState(382);
				calculation();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(383);
					match(NEWLINE);
					}
				}

				setState(386);
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
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				match(STR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\5\2=\n\2\3\2\3\2\3\3"+
		"\3\3\5\3C\n\3\3\3\3\3\5\3G\n\3\3\3\3\3\5\3K\n\3\3\3\5\3N\n\3\3\3\5\3Q"+
		"\n\3\3\3\3\3\5\3U\n\3\3\3\5\3X\n\3\3\4\3\4\5\4\\\n\4\3\4\3\4\3\5\7\5a"+
		"\n\5\f\5\16\5d\13\5\3\5\3\5\3\6\3\6\5\6j\n\6\3\6\3\6\3\7\3\7\5\7p\n\7"+
		"\3\7\3\7\5\7t\n\7\3\b\3\b\5\bx\n\b\3\b\3\b\5\b|\n\b\3\b\3\b\5\b\u0080"+
		"\n\b\3\t\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0093\n\n\3\13\3\13\3\13\3\f\3\f\5\f\u009a\n\f\3"+
		"\f\3\f\5\f\u009e\n\f\3\f\3\f\5\f\u00a2\n\f\3\f\5\f\u00a5\n\f\3\r\3\r\5"+
		"\r\u00a9\n\r\3\r\3\r\5\r\u00ad\n\r\3\r\3\r\5\r\u00b1\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\5\16\u00b8\n\16\3\16\3\16\5\16\u00bc\n\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00c2\n\16\3\16\3\16\5\16\u00c6\n\16\3\16\3\16\5\16\u00ca\n\16"+
		"\3\17\3\17\3\17\5\17\u00cf\n\17\3\17\3\17\5\17\u00d3\n\17\3\20\3\20\5"+
		"\20\u00d7\n\20\3\20\3\20\5\20\u00db\n\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\5\22\u00e3\n\22\3\22\3\22\5\22\u00e7\n\22\3\22\5\22\u00ea\n\22\3\22\5"+
		"\22\u00ed\n\22\3\22\3\22\5\22\u00f1\n\22\3\22\3\22\3\23\3\23\3\23\5\23"+
		"\u00f8\n\23\3\23\5\23\u00fb\n\23\3\23\5\23\u00fe\n\23\3\23\3\23\3\24\3"+
		"\24\3\24\5\24\u0105\n\24\3\24\3\24\5\24\u0109\n\24\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u0110\n\25\3\26\3\26\5\26\u0114\n\26\3\26\3\26\5\26\u0118\n"+
		"\26\3\26\3\26\5\26\u011c\n\26\3\26\5\26\u011f\n\26\3\26\5\26\u0122\n\26"+
		"\3\26\3\26\5\26\u0126\n\26\3\26\3\26\5\26\u012a\n\26\3\26\3\26\5\26\u012e"+
		"\n\26\3\26\3\26\3\27\3\27\5\27\u0134\n\27\3\27\3\27\5\27\u0138\n\27\3"+
		"\27\5\27\u013b\n\27\3\27\5\27\u013e\n\27\3\27\3\27\5\27\u0142\n\27\3\27"+
		"\3\27\3\30\3\30\5\30\u0148\n\30\3\30\3\30\5\30\u014c\n\30\3\30\3\30\5"+
		"\30\u0150\n\30\3\30\3\30\5\30\u0154\n\30\3\30\5\30\u0157\n\30\3\30\5\30"+
		"\u015a\n\30\3\30\3\30\3\31\7\31\u015f\n\31\f\31\16\31\u0162\13\31\3\31"+
		"\3\31\3\32\3\32\5\32\u0168\n\32\3\32\3\32\5\32\u016c\n\32\3\33\3\33\5"+
		"\33\u0170\n\33\3\34\3\34\3\34\5\34\u0175\n\34\3\34\3\34\5\34\u0179\n\34"+
		"\3\34\3\34\3\34\3\34\5\34\u017f\n\34\3\34\3\34\5\34\u0183\n\34\3\34\3"+
		"\34\5\34\u0187\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u018e\n\35\3\35\2\2"+
		"\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\3\4"+
		"\2\3\4\f\f\2\u01c9\2:\3\2\2\2\4@\3\2\2\2\6Y\3\2\2\2\bb\3\2\2\2\ng\3\2"+
		"\2\2\fm\3\2\2\2\16u\3\2\2\2\20\u0086\3\2\2\2\22\u0092\3\2\2\2\24\u0094"+
		"\3\2\2\2\26\u0097\3\2\2\2\30\u00a6\3\2\2\2\32\u00c9\3\2\2\2\34\u00d2\3"+
		"\2\2\2\36\u00d4\3\2\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00f4\3\2\2\2"+
		"&\u0101\3\2\2\2(\u010f\3\2\2\2*\u0111\3\2\2\2,\u0131\3\2\2\2.\u0145\3"+
		"\2\2\2\60\u0160\3\2\2\2\62\u0165\3\2\2\2\64\u016f\3\2\2\2\66\u0186\3\2"+
		"\2\28\u018d\3\2\2\2:<\5\4\3\2;=\7 \2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>"+
		"?\5\16\b\2?\3\3\2\2\2@B\7\22\2\2AC\7 \2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2"+
		"\2DF\7\33\2\2EG\7 \2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\7\b\2\2IK\7 \2"+
		"\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\5\b\5\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2"+
		"\2OQ\7 \2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\7\t\2\2SU\7 \2\2TS\3\2\2\2"+
		"TU\3\2\2\2UW\3\2\2\2VX\5\6\4\2WV\3\2\2\2WX\3\2\2\2X\5\3\2\2\2Y[\7\7\2"+
		"\2Z\\\7 \2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\21\2\2^\7\3\2\2\2_a\5"+
		"\f\7\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\5"+
		"\n\6\2f\t\3\2\2\2gi\7\33\2\2hj\7 \2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl"+
		"\5\6\4\2l\13\3\2\2\2mo\5\n\6\2np\7 \2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2"+
		"qs\7\6\2\2rt\7 \2\2sr\3\2\2\2st\3\2\2\2t\r\3\2\2\2uw\7\n\2\2vx\7 \2\2"+
		"wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\5\20\t\2z|\7 \2\2{z\3\2\2\2{|\3\2\2\2"+
		"|}\3\2\2\2}\177\7\13\2\2~\u0080\7 \2\2\177~\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\17\3\2\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7 \2\2\u0083\u0085"+
		"\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5\22"+
		"\n\2\u008a\21\3\2\2\2\u008b\u0093\5\24\13\2\u008c\u0093\5\26\f\2\u008d"+
		"\u0093\5\36\20\2\u008e\u0093\5\"\22\2\u008f\u0093\5$\23\2\u0090\u0093"+
		"\5&\24\2\u0091\u0093\5(\25\2\u0092\u008b\3\2\2\2\u0092\u008c\3\2\2\2\u0092"+
		"\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0091\3\2\2\2\u0093\23\3\2\2\2\u0094\u0095\7\32\2\2\u0095\u0096"+
		"\58\35\2\u0096\25\3\2\2\2\u0097\u0099\5\30\r\2\u0098\u009a\7 \2\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\5\16"+
		"\b\2\u009c\u009e\7 \2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a4\3\2\2\2\u009f\u00a1\7\24\2\2\u00a0\u00a2\7 \2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\5\16\b\2\u00a4"+
		"\u009f\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a8\7\26\2"+
		"\2\u00a7\u00a9\7 \2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ac\7\b\2\2\u00ab\u00ad\7 \2\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\5\32\16\2\u00af\u00b1\7"+
		" \2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\7\t\2\2\u00b3\31\3\2\2\2\u00b4\u00ca\5\34\17\2\u00b5\u00b7\5\34"+
		"\17\2\u00b6\u00b8\7 \2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\7\17\2\2\u00ba\u00bc\7 \2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\5\32\16\2\u00be"+
		"\u00ca\3\2\2\2\u00bf\u00c1\7\b\2\2\u00c0\u00c2\7 \2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\5\32\16\2\u00c4"+
		"\u00c6\7 \2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\7\t\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00b4\3\2\2\2\u00c9"+
		"\u00b5\3\2\2\2\u00c9\u00bf\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00d3\7\33\2"+
		"\2\u00cc\u00ce\7\5\2\2\u00cd\u00cf\7 \2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\5\32\16\2\u00d1\u00d3\7\16\2"+
		"\2\u00d2\u00cb\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\35"+
		"\3\2\2\2\u00d4\u00d6\7\33\2\2\u00d5\u00d7\7 \2\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\5 \21\2\u00d9\u00db\7 "+
		"\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\5\64\33\2\u00dd\37\3\2\2\2\u00de\u00df\t\2\2\2\u00df!\3\2\2\2\u00e0"+
		"\u00e2\7\r\2\2\u00e1\u00e3\7 \2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\7\33\2\2\u00e5\u00e7\7 \2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00ea\5\6"+
		"\4\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00ed\7 \2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\7\f\2\2\u00ef\u00f1\7 \2\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\5\64\33\2\u00f3#\3\2\2"+
		"\2\u00f4\u00f5\7\33\2\2\u00f5\u00f7\7\b\2\2\u00f6\u00f8\7 \2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00fb\5\60\31\2"+
		"\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fe"+
		"\7 \2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\7\t\2\2\u0100%\3\2\2\2\u0101\u0102\7\31\2\2\u0102\u0104\7\b\2\2"+
		"\u0103\u0105\7 \2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0108\58\35\2\u0107\u0109\7 \2\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\t\2\2\u010b\'\3\2\2\2"+
		"\u010c\u0110\5*\26\2\u010d\u0110\5,\27\2\u010e\u0110\5.\30\2\u010f\u010c"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110)\3\2\2\2\u0111"+
		"\u0113\7\23\2\2\u0112\u0114\7 \2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0117\7\b\2\2\u0116\u0118\7 \2\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\7\33"+
		"\2\2\u011a\u011c\7 \2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u011f\5\6\4\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u0122\7 \2\2\u0121\u0120\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\7\25\2\2\u0124\u0126\7"+
		" \2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\7\33\2\2\u0128\u012a\7 \2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012d\7\t\2\2\u012c\u012e\7 \2\2\u012d"+
		"\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\5\16"+
		"\b\2\u0130+\3\2\2\2\u0131\u0133\7\27\2\2\u0132\u0134\7 \2\2\u0133\u0132"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\7\b\2\2\u0136"+
		"\u0138\7 \2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u013b\5\32\16\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013e\7 \2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\7\t\2\2\u0140\u0142\7 \2\2\u0141"+
		"\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\5\16"+
		"\b\2\u0144-\3\2\2\2\u0145\u0147\7\30\2\2\u0146\u0148\7 \2\2\u0147\u0146"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\5\16\b\2"+
		"\u014a\u014c\7 \2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014f\7\27\2\2\u014e\u0150\7 \2\2\u014f\u014e\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\7\b\2\2\u0152\u0154\7 "+
		"\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0157\5\32\16\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3"+
		"\2\2\2\u0158\u015a\7 \2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015c\7\t\2\2\u015c/\3\2\2\2\u015d\u015f\5\62\32"+
		"\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\5\64\33\2"+
		"\u0164\61\3\2\2\2\u0165\u0167\5\64\33\2\u0166\u0168\7 \2\2\u0167\u0166"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\7\6\2\2\u016a"+
		"\u016c\7 \2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\63\3\2\2\2"+
		"\u016d\u0170\58\35\2\u016e\u0170\5\66\34\2\u016f\u016d\3\2\2\2\u016f\u016e"+
		"\3\2\2\2\u0170\65\3\2\2\2\u0171\u0187\58\35\2\u0172\u0174\58\35\2\u0173"+
		"\u0175\7 \2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0178\7\20\2\2\u0177\u0179\7 \2\2\u0178\u0177\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\5\66\34\2\u017b\u0187\3"+
		"\2\2\2\u017c\u017e\7\b\2\2\u017d\u017f\7 \2\2\u017e\u017d\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\5\66\34\2\u0181\u0183\7"+
		" \2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\7\t\2\2\u0185\u0187\3\2\2\2\u0186\u0171\3\2\2\2\u0186\u0172\3\2"+
		"\2\2\u0186\u017c\3\2\2\2\u0187\67\3\2\2\2\u0188\u018e\7\33\2\2\u0189\u018e"+
		"\7\34\2\2\u018a\u018e\7\35\2\2\u018b\u018e\5$\23\2\u018c\u018e\5\32\16"+
		"\2\u018d\u0188\3\2\2\2\u018d\u0189\3\2\2\2\u018d\u018a\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018d\u018c\3\2\2\2\u018e9\3\2\2\2L<BFJMPTW[biosw{\177\u0086"+
		"\u0092\u0099\u009d\u00a1\u00a4\u00a8\u00ac\u00b0\u00b7\u00bb\u00c1\u00c5"+
		"\u00c9\u00ce\u00d2\u00d6\u00da\u00e2\u00e6\u00e9\u00ec\u00f0\u00f7\u00fa"+
		"\u00fd\u0104\u0108\u010f\u0113\u0117\u011b\u011e\u0121\u0125\u0129\u012d"+
		"\u0133\u0137\u013a\u013d\u0141\u0147\u014b\u014f\u0153\u0156\u0159\u0160"+
		"\u0167\u016b\u016f\u0174\u0178\u017e\u0182\u0186\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}