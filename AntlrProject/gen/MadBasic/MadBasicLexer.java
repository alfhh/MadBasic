// Generated from /home/ahinojosa/workspace/MadBasic/AntlrProject/src/MadBasic/MadBasic.g4 by ANTLR 4.5.1
package MadBasic;
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, SEMICOLON=2, VARS=3, COMMA=4, COLON=5, INT=6, FLOAT=7, STRING=8, 
		BOOL=9, CLASS=10, PARENT=11, INIT=12, METHODS=13, VOID=14, RETURN=15, 
		OBRACE=16, CBRACE=17, OBRACKET=18, CBRACKET=19, EQUAL=20, GREATER=21, 
		LESSER=22, INEQUALITY=23, PLUS=24, AND=25, OR=26, DIFFERENT=27, DOT=28, 
		MINUS=29, MULTIPLICATION=30, DIVISION=31, OPARENTHESIS=32, CPARENTHESIS=33, 
		IF=34, LIST=35, ELSE=36, WHILE=37, READ=38, TRUE=39, FALSE=40, MAIN=41, 
		END=42, TILDE=43, CARET=44, PRINT=45, ID=46, OBJECT=47, CTESTRING=48, 
		CTEF=49, CTEI=50, SKIP=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAM", "SEMICOLON", "VARS", "COMMA", "COLON", "INT", "FLOAT", "STRING", 
		"BOOL", "CLASS", "PARENT", "INIT", "METHODS", "VOID", "RETURN", "OBRACE", 
		"CBRACE", "OBRACKET", "CBRACKET", "EQUAL", "GREATER", "LESSER", "INEQUALITY", 
		"PLUS", "AND", "OR", "DIFFERENT", "DOT", "MINUS", "MULTIPLICATION", "DIVISION", 
		"OPARENTHESIS", "CPARENTHESIS", "IF", "LIST", "ELSE", "WHILE", "READ", 
		"TRUE", "FALSE", "MAIN", "END", "TILDE", "CARET", "PRINT", "ID", "OBJECT", 
		"CTESTRING", "CTEF", "CTEI", "SKIP"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "';'", "'vars'", "','", "':'", "'int'", "'float'", 
		"'string'", "'bool'", "'classe'", "'parent'", "'init'", "'methods'", "'void'", 
		"'return'", "'{'", "'}'", "'['", "']'", "'='", "'>'", "'<'", "'<>'", "'+'", 
		"'&&'", "'||'", "'!='", "'.'", "'-'", "'*'", "'/'", "'('", "')'", "'if'", 
		"'list'", "'else'", "'while'", "'read'", "'true'", "'false'", "'main'", 
		"'end'", "'~'", "'^'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "SEMICOLON", "VARS", "COMMA", "COLON", "INT", "FLOAT", 
		"STRING", "BOOL", "CLASS", "PARENT", "INIT", "METHODS", "VOID", "RETURN", 
		"OBRACE", "CBRACE", "OBRACKET", "CBRACKET", "EQUAL", "GREATER", "LESSER", 
		"INEQUALITY", "PLUS", "AND", "OR", "DIFFERENT", "DOT", "MINUS", "MULTIPLICATION", 
		"DIVISION", "OPARENTHESIS", "CPARENTHESIS", "IF", "LIST", "ELSE", "WHILE", 
		"READ", "TRUE", "FALSE", "MAIN", "END", "TILDE", "CARET", "PRINT", "ID", 
		"OBJECT", "CTESTRING", "CTEF", "CTEI", "SKIP"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0145\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3/\3/\7/\u011a\n/\f/\16/\u011d\13/\3\60\3\60\7\60\u0121"+
		"\n\60\f\60\16\60\u0124\13\60\3\61\3\61\7\61\u0128\n\61\f\61\16\61\u012b"+
		"\13\61\3\61\3\61\3\62\6\62\u0130\n\62\r\62\16\62\u0131\3\62\3\62\6\62"+
		"\u0136\n\62\r\62\16\62\u0137\3\63\6\63\u013b\n\63\r\63\16\63\u013c\3\64"+
		"\6\64\u0140\n\64\r\64\16\64\u0141\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\b\3\2c|\5\2\62;C\\c|\3\2"+
		"C\\\5\2\f\f\17\17$$\3\2\62;\5\2\13\f\17\17\"\"\u014b\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tx\3\2\2\2\13z\3"+
		"\2\2\2\r|\3\2\2\2\17\u0080\3\2\2\2\21\u0086\3\2\2\2\23\u008d\3\2\2\2\25"+
		"\u0092\3\2\2\2\27\u0099\3\2\2\2\31\u00a0\3\2\2\2\33\u00a5\3\2\2\2\35\u00ad"+
		"\3\2\2\2\37\u00b2\3\2\2\2!\u00b9\3\2\2\2#\u00bb\3\2\2\2%\u00bd\3\2\2\2"+
		"\'\u00bf\3\2\2\2)\u00c1\3\2\2\2+\u00c3\3\2\2\2-\u00c5\3\2\2\2/\u00c7\3"+
		"\2\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2\2\65\u00cf\3\2\2\2\67\u00d2\3\2"+
		"\2\29\u00d5\3\2\2\2;\u00d7\3\2\2\2=\u00d9\3\2\2\2?\u00db\3\2\2\2A\u00dd"+
		"\3\2\2\2C\u00df\3\2\2\2E\u00e1\3\2\2\2G\u00e4\3\2\2\2I\u00e9\3\2\2\2K"+
		"\u00ee\3\2\2\2M\u00f4\3\2\2\2O\u00f9\3\2\2\2Q\u00fe\3\2\2\2S\u0104\3\2"+
		"\2\2U\u0109\3\2\2\2W\u010d\3\2\2\2Y\u010f\3\2\2\2[\u0111\3\2\2\2]\u0117"+
		"\3\2\2\2_\u011e\3\2\2\2a\u0125\3\2\2\2c\u012f\3\2\2\2e\u013a\3\2\2\2g"+
		"\u013f\3\2\2\2ij\7r\2\2jk\7t\2\2kl\7q\2\2lm\7i\2\2mn\7t\2\2no\7c\2\2o"+
		"p\7o\2\2p\4\3\2\2\2qr\7=\2\2r\6\3\2\2\2st\7x\2\2tu\7c\2\2uv\7t\2\2vw\7"+
		"u\2\2w\b\3\2\2\2xy\7.\2\2y\n\3\2\2\2z{\7<\2\2{\f\3\2\2\2|}\7k\2\2}~\7"+
		"p\2\2~\177\7v\2\2\177\16\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7n\2\2"+
		"\u0082\u0083\7q\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085\20\3\2"+
		"\2\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7i\2\2\u008c\22\3\2\2\2\u008d\u008e"+
		"\7d\2\2\u008e\u008f\7q\2\2\u008f\u0090\7q\2\2\u0090\u0091\7n\2\2\u0091"+
		"\24\3\2\2\2\u0092\u0093\7e\2\2\u0093\u0094\7n\2\2\u0094\u0095\7c\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098\26\3\2\2\2\u0099"+
		"\u009a\7r\2\2\u009a\u009b\7c\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2"+
		"\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7"+
		"k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7v\2\2\u00a4\32"+
		"\3\2\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7j\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7u\2\2"+
		"\u00ac\34\3\2\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7"+
		"k\2\2\u00b0\u00b1\7f\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7t\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7}\2\2\u00ba\"\3\2\2\2\u00bb"+
		"\u00bc\7\177\2\2\u00bc$\3\2\2\2\u00bd\u00be\7]\2\2\u00be&\3\2\2\2\u00bf"+
		"\u00c0\7_\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2*\3\2\2\2\u00c3\u00c4"+
		"\7@\2\2\u00c4,\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6.\3\2\2\2\u00c7\u00c8\7"+
		">\2\2\u00c8\u00c9\7@\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\62"+
		"\3\2\2\2\u00cc\u00cd\7(\2\2\u00cd\u00ce\7(\2\2\u00ce\64\3\2\2\2\u00cf"+
		"\u00d0\7~\2\2\u00d0\u00d1\7~\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3"+
		"\u00d4\7?\2\2\u00d48\3\2\2\2\u00d5\u00d6\7\60\2\2\u00d6:\3\2\2\2\u00d7"+
		"\u00d8\7/\2\2\u00d8<\3\2\2\2\u00d9\u00da\7,\2\2\u00da>\3\2\2\2\u00db\u00dc"+
		"\7\61\2\2\u00dc@\3\2\2\2\u00dd\u00de\7*\2\2\u00deB\3\2\2\2\u00df\u00e0"+
		"\7+\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7h\2\2\u00e3F\3"+
		"\2\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7u\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8H\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00edJ\3\2\2\2\u00ee\u00ef\7y\2\2\u00ef"+
		"\u00f0\7j\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7g\2\2"+
		"\u00f3L\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7c\2"+
		"\2\u00f7\u00f8\7f\2\2\u00f8N\3\2\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7"+
		"t\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7g\2\2\u00fdP\3\2\2\2\u00fe\u00ff"+
		"\7h\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7n\2\2\u0101\u0102\7u\2\2\u0102"+
		"\u0103\7g\2\2\u0103R\3\2\2\2\u0104\u0105\7o\2\2\u0105\u0106\7c\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7p\2\2\u0108T\3\2\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7p\2\2\u010b\u010c\7f\2\2\u010cV\3\2\2\2\u010d\u010e\7\u0080\2"+
		"\2\u010eX\3\2\2\2\u010f\u0110\7`\2\2\u0110Z\3\2\2\2\u0111\u0112\7r\2\2"+
		"\u0112\u0113\7t\2\2\u0113\u0114\7k\2\2\u0114\u0115\7p\2\2\u0115\u0116"+
		"\7v\2\2\u0116\\\3\2\2\2\u0117\u011b\t\2\2\2\u0118\u011a\t\3\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c^\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0122\t\4\2\2\u011f\u0121"+
		"\t\3\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123`\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0129\7$\2\2\u0126"+
		"\u0128\n\5\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\7$\2\2\u012db\3\2\2\2\u012e\u0130\t\6\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\7\60\2\2\u0134\u0136\t\6\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138d\3\2\2\2"+
		"\u0139\u013b\t\6\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013df\3\2\2\2\u013e\u0140\t\7\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0144\b\64\2\2\u0144h\3\2\2\2\n\2\u011b"+
		"\u0122\u0129\u0131\u0137\u013c\u0141\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}