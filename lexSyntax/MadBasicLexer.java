// Generated from MadBasic.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MadBasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, SEMICOLON=2, VARS=3, COMMA=4, COLON=5, INT=6, FLOAT=7, STRING=8, 
		BOOL=9, CLASS=10, PARENT=11, INIT=12, METHODS=13, VOID=14, RETURN=15, 
		OBRACE=16, CBRACE=17, OBRACKET=18, CBRACKET=19, EQUAL=20, GREATER=21, 
		LESSER=22, INEQUALITY=23, PLUS=24, AND=25, OR=26, DIFFERENT=27, DOT=28, 
		MINUS=29, MULTIPLICATION=30, DIVISION=31, OPARENTHESIS=32, CPARENTHESIS=33, 
		IF=34, ELSE=35, WHILE=36, READ=37, TRUE=38, FALSE=39, MAIN=40, END=41, 
		TILDE=42, CARET=43, PRINT=44, ID=45, OBJECT=46, CTESTRING=47, CTEF=48, 
		CTEI=49, SKIP=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAM", "SEMICOLON", "VARS", "COMMA", "COLON", "INT", "FLOAT", "STRING", 
		"BOOL", "CLASS", "PARENT", "INIT", "METHODS", "VOID", "RETURN", "OBRACE", 
		"CBRACE", "OBRACKET", "CBRACKET", "EQUAL", "GREATER", "LESSER", "INEQUALITY", 
		"PLUS", "AND", "OR", "DIFFERENT", "DOT", "MINUS", "MULTIPLICATION", "DIVISION", 
		"OPARENTHESIS", "CPARENTHESIS", "IF", "ELSE", "WHILE", "READ", "TRUE", 
		"FALSE", "MAIN", "END", "TILDE", "CARET", "PRINT", "ID", "OBJECT", "CTESTRING", 
		"CTEF", "CTEI", "SKIP"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "';'", "'vars'", "','", "':'", "'int'", "'float'", 
		"'string'", "'bool'", "'class'", "'parent'", "'init'", "'methods'", "'void'", 
		"'return'", "'{'", "'}'", "'['", "']'", "'='", "'>'", "'<'", "'<>'", "'+'", 
		"'&&'", "'||'", "'!='", "'.'", "'-'", "'*'", "'/'", "'('", "')'", "'if'", 
		"'else'", "'while'", "'read'", "'true'", "'false'", "'main'", "'end'", 
		"'~'", "'^'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "SEMICOLON", "VARS", "COMMA", "COLON", "INT", "FLOAT", 
		"STRING", "BOOL", "CLASS", "PARENT", "INIT", "METHODS", "VOID", "RETURN", 
		"OBRACE", "CBRACE", "OBRACKET", "CBRACKET", "EQUAL", "GREATER", "LESSER", 
		"INEQUALITY", "PLUS", "AND", "OR", "DIFFERENT", "DOT", "MINUS", "MULTIPLICATION", 
		"DIVISION", "OPARENTHESIS", "CPARENTHESIS", "IF", "ELSE", "WHILE", "READ", 
		"TRUE", "FALSE", "MAIN", "END", "TILDE", "CARET", "PRINT", "ID", "OBJECT", 
		"CTESTRING", "CTEF", "CTEI", "SKIP"
	};
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


	public MadBasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MadBasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u013d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\7.\u0112\n."+
		"\f.\16.\u0115\13.\3/\3/\7/\u0119\n/\f/\16/\u011c\13/\3\60\3\60\7\60\u0120"+
		"\n\60\f\60\16\60\u0123\13\60\3\60\3\60\3\61\6\61\u0128\n\61\r\61\16\61"+
		"\u0129\3\61\3\61\6\61\u012e\n\61\r\61\16\61\u012f\3\62\6\62\u0133\n\62"+
		"\r\62\16\62\u0134\3\63\6\63\u0138\n\63\r\63\16\63\u0139\3\63\3\63\2\2"+
		"\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\b\3\2c"+
		"|\5\2\62;C\\c|\3\2C\\\5\2\f\f\17\17$$\3\2\62;\5\2\13\f\17\17\"\"\u0143"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\tv\3\2\2"+
		"\2\13x\3\2\2\2\rz\3\2\2\2\17~\3\2\2\2\21\u0084\3\2\2\2\23\u008b\3\2\2"+
		"\2\25\u0090\3\2\2\2\27\u0096\3\2\2\2\31\u009d\3\2\2\2\33\u00a2\3\2\2\2"+
		"\35\u00aa\3\2\2\2\37\u00af\3\2\2\2!\u00b6\3\2\2\2#\u00b8\3\2\2\2%\u00ba"+
		"\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3\2\2\2+\u00c0\3\2\2\2-\u00c2\3\2\2\2"+
		"/\u00c4\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cc\3\2\2\2\67"+
		"\u00cf\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d6\3\2\2\2?\u00d8\3\2"+
		"\2\2A\u00da\3\2\2\2C\u00dc\3\2\2\2E\u00de\3\2\2\2G\u00e1\3\2\2\2I\u00e6"+
		"\3\2\2\2K\u00ec\3\2\2\2M\u00f1\3\2\2\2O\u00f6\3\2\2\2Q\u00fc\3\2\2\2S"+
		"\u0101\3\2\2\2U\u0105\3\2\2\2W\u0107\3\2\2\2Y\u0109\3\2\2\2[\u010f\3\2"+
		"\2\2]\u0116\3\2\2\2_\u011d\3\2\2\2a\u0127\3\2\2\2c\u0132\3\2\2\2e\u0137"+
		"\3\2\2\2gh\7r\2\2hi\7t\2\2ij\7q\2\2jk\7i\2\2kl\7t\2\2lm\7c\2\2mn\7o\2"+
		"\2n\4\3\2\2\2op\7=\2\2p\6\3\2\2\2qr\7x\2\2rs\7c\2\2st\7t\2\2tu\7u\2\2"+
		"u\b\3\2\2\2vw\7.\2\2w\n\3\2\2\2xy\7<\2\2y\f\3\2\2\2z{\7k\2\2{|\7p\2\2"+
		"|}\7v\2\2}\16\3\2\2\2~\177\7h\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2"+
		"\u0081\u0082\7c\2\2\u0082\u0083\7v\2\2\u0083\20\3\2\2\2\u0084\u0085\7"+
		"u\2\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7i\2\2\u008a\22\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d"+
		"\7q\2\2\u008d\u008e\7q\2\2\u008e\u008f\7n\2\2\u008f\24\3\2\2\2\u0090\u0091"+
		"\7e\2\2\u0091\u0092\7n\2\2\u0092\u0093\7c\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7u\2\2\u0095\26\3\2\2\2\u0096\u0097\7r\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2"+
		"\u009c\30\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7"+
		"k\2\2\u00a0\u00a1\7v\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4"+
		"\7g\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7f\2\2\u00a8\u00a9\7u\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7x\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7f\2\2\u00ae\36\3\2\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7w\2\2"+
		"\u00b3\u00b4\7t\2\2\u00b4\u00b5\7p\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7}\2"+
		"\2\u00b7\"\3\2\2\2\u00b8\u00b9\7\177\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7"+
		"]\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7_\2\2\u00bd(\3\2\2\2\u00be\u00bf\7?"+
		"\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7>\2"+
		"\2\u00c3.\3\2\2\2\u00c4\u00c5\7>\2\2\u00c5\u00c6\7@\2\2\u00c6\60\3\2\2"+
		"\2\u00c7\u00c8\7-\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7(\2\2\u00ca\u00cb"+
		"\7(\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7~\2\2\u00cd\u00ce\7~\2\2\u00ce\66"+
		"\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1\7?\2\2\u00d18\3\2\2\2\u00d2\u00d3"+
		"\7\60\2\2\u00d3:\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5<\3\2\2\2\u00d6\u00d7"+
		"\7,\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9@\3\2\2\2\u00da\u00db"+
		"\7*\2\2\u00dbB\3\2\2\2\u00dc\u00dd\7+\2\2\u00ddD\3\2\2\2\u00de\u00df\7"+
		"k\2\2\u00df\u00e0\7h\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3"+
		"\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5H\3\2\2\2\u00e6\u00e7"+
		"\7y\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7n\2\2\u00ea"+
		"\u00eb\7g\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"\u00ef\7c\2\2\u00ef\u00f0\7f\2\2\u00f0L\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7g\2\2\u00f5N\3\2\2\2\u00f6"+
		"\u00f7\7h\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7u\2\2"+
		"\u00fa\u00fb\7g\2\2\u00fbP\3\2\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7c\2"+
		"\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7p\2\2\u0100R\3\2\2\2\u0101\u0102\7"+
		"g\2\2\u0102\u0103\7p\2\2\u0103\u0104\7f\2\2\u0104T\3\2\2\2\u0105\u0106"+
		"\7\u0080\2\2\u0106V\3\2\2\2\u0107\u0108\7`\2\2\u0108X\3\2\2\2\u0109\u010a"+
		"\7r\2\2\u010a\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2\u010d"+
		"\u010e\7v\2\2\u010eZ\3\2\2\2\u010f\u0113\t\2\2\2\u0110\u0112\t\3\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\\\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011a\t\4\2\2\u0117\u0119"+
		"\t\3\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b^\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0121\7$\2\2\u011e"+
		"\u0120\n\5\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\7$\2\2\u0125`\3\2\2\2\u0126\u0128\t\6\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\7\60\2\2\u012c\u012e\t\6\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130b\3\2\2\2"+
		"\u0131\u0133\t\6\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135d\3\2\2\2\u0136\u0138\t\7\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b\63\2\2\u013cf\3\2\2\2\n\2\u0113"+
		"\u011a\u0121\u0129\u012f\u0134\u0139\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}