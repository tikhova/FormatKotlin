// Generated from /shared/YandexDisk/ITMO/year2019/parsers/FormatKotlin/src/main/kotlin/SimpleFunction.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleFunctionLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NOT", "COMMA", "COLON", "LBRACKET", "RBRACKET", "CURLY_LBRACKET", 
			"CURLY_RBRACKET", "EQUAL", "VARIABLE_TYPE", "LOGICAL_VALUE", "LOGICAL_OPERATOR", 
			"OPERATOR", "TYPE", "FUN", "FOR", "ELSE", "IN", "IF", "WHILE", "DO", 
			"PRINT_FUN", "RETURN", "NAME", "NUMBER", "STR", "EPS", "WS", "NEWLINE"
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


	public SimpleFunctionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleFunction.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\\\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\rg\n\r\3\16\3\16\3\16\3\16\5\16m\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0092\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00bc\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\7\32\u00c7\n\32\f\32\16\32\u00ca\13\32\3\33\3\33\3\33\7\33"+
		"\u00cf\n\33\f\33\16\33\u00d2\13\33\5\33\u00d4\n\33\3\34\3\34\7\34\u00d8"+
		"\n\34\f\34\16\34\u00db\13\34\3\34\3\34\3\35\3\35\3\36\6\36\u00e2\n\36"+
		"\r\36\16\36\u00e3\3\36\3\36\3\37\6\37\u00e9\n\37\r\37\16\37\u00ea\2\2"+
		" \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= \3\2\t\5\2,-//\61\61\3\2c|\5\2\62;C\\c|\3\2\63;\3\2\62;\4\2$$^^\5\2"+
		"\13\13\17\17\"\"\2\u00fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5B\3\2\2\2\7E\3\2\2"+
		"\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2"+
		"\2\25S\3\2\2\2\27[\3\2\2\2\31f\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37\u0091"+
		"\3\2\2\2!\u0093\3\2\2\2#\u0097\3\2\2\2%\u009b\3\2\2\2\'\u00a0\3\2\2\2"+
		")\u00a3\3\2\2\2+\u00a6\3\2\2\2-\u00ac\3\2\2\2/\u00bb\3\2\2\2\61\u00bd"+
		"\3\2\2\2\63\u00c4\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2\29\u00de\3\2"+
		"\2\2;\u00e1\3\2\2\2=\u00e8\3\2\2\2?@\7-\2\2@A\7?\2\2A\4\3\2\2\2BC\7/\2"+
		"\2CD\7?\2\2D\6\3\2\2\2EF\7#\2\2F\b\3\2\2\2GH\7.\2\2H\n\3\2\2\2IJ\7<\2"+
		"\2J\f\3\2\2\2KL\7*\2\2L\16\3\2\2\2MN\7+\2\2N\20\3\2\2\2OP\7}\2\2P\22\3"+
		"\2\2\2QR\7\177\2\2R\24\3\2\2\2ST\7?\2\2T\26\3\2\2\2UV\7x\2\2VW\7c\2\2"+
		"W\\\7n\2\2XY\7x\2\2YZ\7c\2\2Z\\\7t\2\2[U\3\2\2\2[X\3\2\2\2\\\30\3\2\2"+
		"\2]^\7v\2\2^_\7t\2\2_`\7w\2\2`g\7g\2\2ab\7h\2\2bc\7c\2\2cd\7n\2\2de\7"+
		"u\2\2eg\7g\2\2f]\3\2\2\2fa\3\2\2\2g\32\3\2\2\2hi\7~\2\2im\7~\2\2jk\7("+
		"\2\2km\7(\2\2lh\3\2\2\2lj\3\2\2\2m\34\3\2\2\2no\t\2\2\2o\36\3\2\2\2pq"+
		"\7D\2\2qr\7{\2\2rs\7v\2\2s\u0092\7g\2\2tu\7U\2\2uv\7j\2\2vw\7q\2\2wx\7"+
		"t\2\2x\u0092\7v\2\2yz\7K\2\2z{\7p\2\2{\u0092\7v\2\2|}\7N\2\2}~\7q\2\2"+
		"~\177\7p\2\2\177\u0092\7i\2\2\u0080\u0081\7E\2\2\u0081\u0082\7j\2\2\u0082"+
		"\u0083\7c\2\2\u0083\u0092\7t\2\2\u0084\u0085\7U\2\2\u0085\u0086\7v\2\2"+
		"\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u0092"+
		"\7i\2\2\u008a\u008b\7D\2\2\u008b\u008c\7q\2\2\u008c\u008d\7q\2\2\u008d"+
		"\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f\u0090\7c\2\2\u0090\u0092\7p\2\2"+
		"\u0091p\3\2\2\2\u0091t\3\2\2\2\u0091y\3\2\2\2\u0091|\3\2\2\2\u0091\u0080"+
		"\3\2\2\2\u0091\u0084\3\2\2\2\u0091\u008a\3\2\2\2\u0092 \3\2\2\2\u0093"+
		"\u0094\7h\2\2\u0094\u0095\7w\2\2\u0095\u0096\7p\2\2\u0096\"\3\2\2\2\u0097"+
		"\u0098\7h\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a$\3\2\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2"+
		"\u009f&\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2(\3\2\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7h\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7y\2\2\u00a7"+
		"\u00a8\7j\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab,\3\2\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7q\2\2\u00ae.\3\2\2\2\u00af"+
		"\u00b0\7r\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2"+
		"\u00b3\u00bc\7v\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7"+
		"\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7n\2\2\u00ba"+
		"\u00bc\7p\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bc\60\3\2\2\2"+
		"\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1"+
		"\7w\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7p\2\2\u00c3\62\3\2\2\2\u00c4\u00c8"+
		"\t\3\2\2\u00c5\u00c7\t\4\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\64\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb\u00d4\7\62\2\2\u00cc\u00d0\t\5\2\2\u00cd\u00cf\t\6\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3"+
		"\u00cc\3\2\2\2\u00d4\66\3\2\2\2\u00d5\u00d9\7$\2\2\u00d6\u00d8\n\7\2\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd"+
		"8\3\2\2\2\u00de\u00df\3\2\2\2\u00df:\3\2\2\2\u00e0\u00e2\t\b\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\36\2\2\u00e6<\3\2\2\2\u00e7\u00e9"+
		"\7\f\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb>\3\2\2\2\16\2[fl\u0091\u00bb\u00c8\u00d0\u00d3\u00d9"+
		"\u00e3\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}