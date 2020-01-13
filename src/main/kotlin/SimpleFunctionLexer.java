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
		NOT=1, COMMA=2, COLON=3, LBRACKET=4, RBRACKET=5, CURLY_LBRACKET=6, CURLY_RBRACKET=7, 
		EQUALITY=8, VARIABLE_TYPE=9, LOGICAL_VALUE=10, LOGICAL_OPERATOR=11, OPERATOR=12, 
		TYPE=13, FUN=14, FOR=15, ELSE=16, IN=17, IF=18, WHILE=19, DO=20, PRINT_FUN=21, 
		RETURN=22, NAME=23, STR=24, EPS=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOT", "COMMA", "COLON", "LBRACKET", "RBRACKET", "CURLY_LBRACKET", "CURLY_RBRACKET", 
			"EQUALITY", "VARIABLE_TYPE", "LOGICAL_VALUE", "LOGICAL_OPERATOR", "OPERATOR", 
			"TYPE", "FUN", "FOR", "ELSE", "IN", "IF", "WHILE", "DO", "PRINT_FUN", 
			"RETURN", "NAME", "STR", "EPS", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nN\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13Y\n\13\3\f\3\f\3\f\3\f\5\f_\n\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0082\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00ac\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\7\30\u00b7\n\30\f\30\16\30\u00ba\13\30\3\31\3\31\7\31"+
		"\u00be\n\31\f\31\16\31\u00c1\13\31\3\31\3\31\3\32\3\32\3\33\6\33\u00c8"+
		"\n\33\r\33\16\33\u00c9\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\3\2\7\5\2,-//\61\61\3\2c|\5\2\62;C\\c|\4\2"+
		"$$^^\5\2\13\f\17\17\"\"\2\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2"+
		"\2\17C\3\2\2\2\21E\3\2\2\2\23M\3\2\2\2\25X\3\2\2\2\27^\3\2\2\2\31`\3\2"+
		"\2\2\33\u0081\3\2\2\2\35\u0083\3\2\2\2\37\u0087\3\2\2\2!\u008b\3\2\2\2"+
		"#\u0090\3\2\2\2%\u0093\3\2\2\2\'\u0096\3\2\2\2)\u009c\3\2\2\2+\u00ab\3"+
		"\2\2\2-\u00ad\3\2\2\2/\u00b4\3\2\2\2\61\u00bb\3\2\2\2\63\u00c4\3\2\2\2"+
		"\65\u00c7\3\2\2\2\678\7#\2\28\4\3\2\2\29:\7.\2\2:\6\3\2\2\2;<\7<\2\2<"+
		"\b\3\2\2\2=>\7*\2\2>\n\3\2\2\2?@\7+\2\2@\f\3\2\2\2AB\7}\2\2B\16\3\2\2"+
		"\2CD\7\177\2\2D\20\3\2\2\2EF\7?\2\2F\22\3\2\2\2GH\7x\2\2HI\7c\2\2IN\7"+
		"n\2\2JK\7x\2\2KL\7c\2\2LN\7t\2\2MG\3\2\2\2MJ\3\2\2\2N\24\3\2\2\2OP\7v"+
		"\2\2PQ\7t\2\2QR\7w\2\2RY\7g\2\2ST\7h\2\2TU\7c\2\2UV\7n\2\2VW\7u\2\2WY"+
		"\7g\2\2XO\3\2\2\2XS\3\2\2\2Y\26\3\2\2\2Z[\7~\2\2[_\7~\2\2\\]\7(\2\2]_"+
		"\7(\2\2^Z\3\2\2\2^\\\3\2\2\2_\30\3\2\2\2`a\t\2\2\2a\32\3\2\2\2bc\7D\2"+
		"\2cd\7{\2\2de\7v\2\2e\u0082\7g\2\2fg\7U\2\2gh\7j\2\2hi\7q\2\2ij\7t\2\2"+
		"j\u0082\7v\2\2kl\7K\2\2lm\7p\2\2m\u0082\7v\2\2no\7N\2\2op\7q\2\2pq\7p"+
		"\2\2q\u0082\7i\2\2rs\7H\2\2st\7n\2\2tu\7q\2\2uv\7c\2\2v\u0082\7v\2\2w"+
		"x\7F\2\2xy\7q\2\2yz\7w\2\2z{\7d\2\2{|\7n\2\2|\u0082\7g\2\2}~\7E\2\2~\177"+
		"\7j\2\2\177\u0080\7c\2\2\u0080\u0082\7t\2\2\u0081b\3\2\2\2\u0081f\3\2"+
		"\2\2\u0081k\3\2\2\2\u0081n\3\2\2\2\u0081r\3\2\2\2\u0081w\3\2\2\2\u0081"+
		"}\3\2\2\2\u0082\34\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7w\2\2\u0085"+
		"\u0086\7p\2\2\u0086\36\3\2\2\2\u0087\u0088\7h\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7t\2\2\u008a \3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\"\3\2\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7p\2\2\u0092$\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7h\2\2\u0095"+
		"&\3\2\2\2\u0096\u0097\7y\2\2\u0097\u0098\7j\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b(\3\2\2\2\u009c\u009d\7f\2\2\u009d"+
		"\u009e\7q\2\2\u009e*\3\2\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00ac\7v\2\2\u00a4\u00a5\7r\2\2"+
		"\u00a5\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ac\7p\2\2\u00ab\u009f\3\2\2\2\u00ab"+
		"\u00a4\3\2\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2"+
		"\u00b3.\3\2\2\2\u00b4\u00b8\t\3\2\2\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3"+
		"\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\60\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\7$\2\2\u00bc\u00be\n\5\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3"+
		"\62\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\64\3\2\2\2\u00c6\u00c8\t\6\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\33\2\2\u00cc\66\3\2\2\2\13\2MX"+
		"^\u0081\u00ab\u00b8\u00bf\u00c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}