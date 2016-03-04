// Generated from MadBasic.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MadBasicParser extends Parser {
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
		IF=34, LIST=35, ELSE=36, WHILE=37, READ=38, TRUE=39, FALSE=40, MAIN=41, 
		END=42, TILDE=43, CARET=44, PRINT=45, ID=46, OBJECT=47, CTESTRING=48, 
		CTEF=49, CTEI=50, SKIP=51;
	public static final int
		RULE_madbasic = 0, RULE_program = 1, RULE_a = 2, RULE_b = 3, RULE_c = 4, 
		RULE_classe = 5, RULE_d = 6, RULE_vars = 7, RULE_e = 8, RULE_f = 9, RULE_g = 10, 
		RULE_methods = 11, RULE_h = 12, RULE_j = 13, RULE_init = 14, RULE_k = 15, 
		RULE_l = 16, RULE_type = 17, RULE_method = 18, RULE_params = 19, RULE_m = 20, 
		RULE_n = 21, RULE_statement = 22, RULE_procedure = 23, RULE_function = 24, 
		RULE_reference = 25, RULE_assignment = 26, RULE_o = 27, RULE_condition = 28, 
		RULE_p = 29, RULE_loop = 30, RULE_write = 31, RULE_q = 32, RULE_call = 33, 
		RULE_r = 34, RULE_block = 35, RULE_retorno = 36, RULE_identifier = 37, 
		RULE_s = 38, RULE_expression = 39, RULE_t = 40, RULE_u = 41, RULE_read = 42, 
		RULE_exp = 43, RULE_v = 44, RULE_w = 45, RULE_args = 46, RULE_x = 47, 
		RULE_comparison = 48, RULE_y = 49, RULE_z = 50, RULE_term = 51, RULE_aa = 52, 
		RULE_ab = 53, RULE_factor = 54, RULE_ac = 55, RULE_value = 56, RULE_main = 57;
	public static final String[] ruleNames = {
		"madbasic", "program", "a", "b", "c", "classe", "d", "vars", "e", "f", 
		"g", "methods", "h", "j", "init", "k", "l", "type", "method", "params", 
		"m", "n", "statement", "procedure", "function", "reference", "assignment", 
		"o", "condition", "p", "loop", "write", "q", "call", "r", "block", "retorno", 
		"identifier", "s", "expression", "t", "u", "read", "exp", "v", "w", "args", 
		"x", "comparison", "y", "z", "term", "aa", "ab", "factor", "ac", "value", 
		"main"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "';'", "'vars'", "','", "':'", "'int'", "'float'", 
		"'string'", "'bool'", "'classe'", "'parent'", "'init'", "'methods'", "'void'", 
		"'returno'", "'{'", "'}'", "'['", "']'", "'='", "'>'", "'<'", "'<>'", 
		"'+'", "'&&'", "'||'", "'!='", "'.'", "'-'", "'*'", "'/'", "'('", "')'", 
		"'if'", "'list'", "'else'", "'while'", "'read'", "'true'", "'false'", 
		"'main'", "'end'", "'~'", "'^'", "'print'"
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

	@Override
	public String getGrammarFileName() { return "MadBasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MadBasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MadbasicContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(MadBasicParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(MadBasicParser.SEMICOLON, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public MadbasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_madbasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterMadbasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitMadbasic(this);
		}
	}

	public final MadbasicContext madbasic() throws RecognitionException {
		MadbasicContext _localctx = new MadbasicContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_madbasic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(PROGRAM);
			setState(117);
			match(ID);
			setState(118);
			match(SEMICOLON);
			setState(119);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(MadBasicParser.MAIN, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			a();
			setState(122);
			b();
			setState(123);
			c();
			setState(124);
			match(MAIN);
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

	public static class AContext extends ParserRuleContext {
		public ClasseContext classe() {
			return getRuleContext(ClasseContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_a);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				classe();
				setState(127);
				a();
				}
				break;
			case VARS:
			case METHODS:
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_b);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case VARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				vars();
				}
				break;
			case INIT:
			case METHODS:
			case RETURN:
			case CBRACE:
			case IF:
			case WHILE:
			case MAIN:
			case END:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CContext extends ParserRuleContext {
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_c);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case METHODS:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				methods();
				}
				break;
			case CBRACE:
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ClasseContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MadBasicParser.CLASS, 0); }
		public TerminalNode OBJECT() { return getToken(MadBasicParser.OBJECT, 0); }
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public TerminalNode OBRACE() { return getToken(MadBasicParser.OBRACE, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MadBasicParser.CBRACE, 0); }
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitClasse(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CLASS);
			setState(141);
			match(OBJECT);
			setState(142);
			d();
			setState(143);
			match(OBRACE);
			setState(144);
			b();
			setState(145);
			init();
			setState(146);
			c();
			setState(147);
			match(CBRACE);
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

	public static class DContext extends ParserRuleContext {
		public TerminalNode PARENT() { return getToken(MadBasicParser.PARENT, 0); }
		public TerminalNode OBJECT() { return getToken(MadBasicParser.OBJECT, 0); }
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_d);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case PARENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(PARENT);
				setState(150);
				match(OBJECT);
				}
				break;
			case OBRACE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VarsContext extends ParserRuleContext {
		public TerminalNode VARS() { return getToken(MadBasicParser.VARS, 0); }
		public TerminalNode COLON() { return getToken(MadBasicParser.COLON, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(VARS);
			setState(155);
			match(COLON);
			setState(156);
			e();
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

	public static class EContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MadBasicParser.SEMICOLON, 0); }
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			type();
			setState(159);
			match(ID);
			setState(160);
			f();
			setState(161);
			match(SEMICOLON);
			setState(162);
			g();
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MadBasicParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_f);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(COMMA);
				setState(165);
				match(ID);
				setState(166);
				f();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class GContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitG(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_g);
		try {
			setState(172);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				e();
				}
				break;
			case INIT:
			case METHODS:
			case RETURN:
			case CBRACE:
			case IF:
			case WHILE:
			case MAIN:
			case END:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MethodsContext extends ParserRuleContext {
		public TerminalNode METHODS() { return getToken(MadBasicParser.METHODS, 0); }
		public TerminalNode COLON() { return getToken(MadBasicParser.COLON, 0); }
		public HContext h() {
			return getRuleContext(HContext.class,0);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitMethods(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(METHODS);
			setState(175);
			match(COLON);
			setState(176);
			h();
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

	public static class HContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public JContext j() {
			return getRuleContext(JContext.class,0);
		}
		public HContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitH(this);
		}
	}

	public final HContext h() throws RecognitionException {
		HContext _localctx = new HContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_h);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			method();
			setState(179);
			j();
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

	public static class JContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public JContext j() {
			return getRuleContext(JContext.class,0);
		}
		public JContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterJ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitJ(this);
		}
	}

	public final JContext j() throws RecognitionException {
		JContext _localctx = new JContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_j);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case LIST:
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				method();
				setState(182);
				j();
				}
				break;
			case CBRACE:
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InitContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(MadBasicParser.INIT, 0); }
		public TerminalNode OPARENTHESIS() { return getToken(MadBasicParser.OPARENTHESIS, 0); }
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public TerminalNode CPARENTHESIS() { return getToken(MadBasicParser.CPARENTHESIS, 0); }
		public TerminalNode OBRACE() { return getToken(MadBasicParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(MadBasicParser.CBRACE, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(INIT);
			setState(188);
			match(OPARENTHESIS);
			setState(189);
			k();
			setState(190);
			match(CPARENTHESIS);
			setState(191);
			match(OBRACE);
			setState(192);
			match(CBRACE);
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

	public static class KContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public KContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitK(this);
		}
	}

	public final KContext k() throws RecognitionException {
		KContext _localctx = new KContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_k);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				params();
				}
				break;
			case CPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitL(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_l);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				statement();
				setState(199);
				l();
				}
				break;
			case RETURN:
			case CBRACE:
			case END:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MadBasicParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MadBasicParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(MadBasicParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(MadBasicParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(MadBasicParser.LIST, 0); }
		public TerminalNode LESSER() { return getToken(MadBasicParser.LESSER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(MadBasicParser.GREATER, 0); }
		public TerminalNode OBJECT() { return getToken(MadBasicParser.OBJECT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(214);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(BOOL);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(LIST);
				setState(209);
				match(LESSER);
				setState(210);
				type();
				setState(211);
				match(GREATER);
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				match(OBJECT);
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

	public static class MethodContext extends ParserRuleContext {
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method);
		try {
			setState(218);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				procedure();
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				function();
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

	public static class ParamsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			type();
			setState(221);
			m();
			setState(222);
			match(ID);
			setState(223);
			n();
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

	public static class MContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public MContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitM(this);
		}
	}

	public final MContext m() throws RecognitionException {
		MContext _localctx = new MContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_m);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				reference();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class NContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public NContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitN(this);
		}
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_n);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				type();
				setState(230);
				m();
				setState(231);
				match(ID);
				setState(232);
				n();
				}
				break;
			case CPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				write();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				call();
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MadBasicParser.VOID, 0); }
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public TerminalNode OPARENTHESIS() { return getToken(MadBasicParser.OPARENTHESIS, 0); }
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public TerminalNode CPARENTHESIS() { return getToken(MadBasicParser.CPARENTHESIS, 0); }
		public TerminalNode OBRACE() { return getToken(MadBasicParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MadBasicParser.CBRACE, 0); }
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitProcedure(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(VOID);
			setState(245);
			match(ID);
			setState(246);
			match(OPARENTHESIS);
			setState(247);
			k();
			setState(248);
			match(CPARENTHESIS);
			setState(249);
			match(OBRACE);
			setState(250);
			block();
			setState(251);
			match(CBRACE);
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public TerminalNode OPARENTHESIS() { return getToken(MadBasicParser.OPARENTHESIS, 0); }
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public TerminalNode CPARENTHESIS() { return getToken(MadBasicParser.CPARENTHESIS, 0); }
		public TerminalNode OBRACE() { return getToken(MadBasicParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MadBasicParser.CBRACE, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			type();
			setState(254);
			match(ID);
			setState(255);
			match(OPARENTHESIS);
			setState(256);
			k();
			setState(257);
			match(CPARENTHESIS);
			setState(258);
			match(OBRACE);
			setState(259);
			block();
			setState(260);
			retorno();
			setState(261);
			match(CBRACE);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(MadBasicParser.TILDE, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(TILDE);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MadBasicParser.EQUAL, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MadBasicParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			identifier();
			setState(266);
			match(EQUAL);
			setState(267);
			o();
			setState(268);
			match(SEMICOLON);
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

	public static class OContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public OContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitO(this);
		}
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_o);
		try {
			setState(272);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case OPARENTHESIS:
			case TRUE:
			case FALSE:
			case ID:
			case CTESTRING:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				expression();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				read();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MadBasicParser.IF, 0); }
		public TerminalNode OPARENTHESIS() { return getToken(MadBasicParser.OPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPARENTHESIS() { return getToken(MadBasicParser.CPARENTHESIS, 0); }
		public TerminalNode OBRACE() { return getToken(MadBasicParser.OBRACE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MadBasicParser.CBRACE, 0); }
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(IF);
			setState(275);
			match(OPARENTHESIS);
			setState(276);
			expression();
			setState(277);
			match(CPARENTHESIS);
			setState(278);
			match(OBRACE);
			setState(279);
			l();
			setState(280);
			match(CBRACE);
			setState(281);
			p();
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

	public static class PContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MadBasicParser.ELSE, 0); }
		public TerminalNode OBRACE() { return getToken(MadBasicParser.OBRACE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MadBasicParser.CBRACE, 0); }
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitP(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_p);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(ELSE);
				setState(284);
				match(OBRACE);
				setState(285);
				l();
				setState(286);
				match(CBRACE);
				}
				break;
			case RETURN:
			case CBRACE:
			case IF:
			case WHILE:
			case END:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MadBasicParser.WHILE, 0); }
		public TerminalNode OPARENTHESIS() { return getToken(MadBasicParser.OPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPARENTHESIS() { return getToken(MadBasicParser.CPARENTHESIS, 0); }
		public TerminalNode OBRACE() { return getToken(MadBasicParser.OBRACE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MadBasicParser.CBRACE, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(WHILE);
			setState(292);
			match(OPARENTHESIS);
			setState(293);
			expression();
			setState(294);
			match(CPARENTHESIS);
			setState(295);
			match(OBRACE);
			setState(296);
			l();
			setState(297);
			match(CBRACE);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MadBasicParser.PRINT, 0); }
		public TerminalNode OPARENTHESIS() { return getToken(MadBasicParser.OPARENTHESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public TerminalNode CPARENTHESIS() { return getToken(MadBasicParser.CPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(MadBasicParser.SEMICOLON, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(PRINT);
			setState(300);
			match(OPARENTHESIS);
			setState(301);
			exp();
			setState(302);
			q();
			setState(303);
			match(CPARENTHESIS);
			setState(304);
			match(SEMICOLON);
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

	public static class QContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(MadBasicParser.CARET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitQ(this);
		}
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_q);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case CARET:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(CARET);
				setState(307);
				exp();
				setState(308);
				q();
				}
				break;
			case CPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPARENTHESIS() { return getToken(MadBasicParser.OPARENTHESIS, 0); }
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public TerminalNode CPARENTHESIS() { return getToken(MadBasicParser.CPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(MadBasicParser.SEMICOLON, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			identifier();
			setState(314);
			match(OPARENTHESIS);
			setState(315);
			r();
			setState(316);
			match(CPARENTHESIS);
			setState(317);
			match(SEMICOLON);
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

	public static class RContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_r);
		try {
			setState(321);
			switch (_input.LA(1)) {
			case TILDE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				args();
				}
				break;
			case CPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BlockContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			b();
			setState(324);
			l();
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MadBasicParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MadBasicParser.SEMICOLON, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(RETURN);
			setState(327);
			expression();
			setState(328);
			match(SEMICOLON);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ID);
			setState(331);
			s();
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

	public static class SContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(MadBasicParser.DOT, 0); }
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_s);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(DOT);
				setState(334);
				match(ID);
				}
				break;
			case SEMICOLON:
			case CBRACKET:
			case EQUAL:
			case GREATER:
			case LESSER:
			case PLUS:
			case AND:
			case OR:
			case DIFFERENT:
			case MINUS:
			case MULTIPLICATION:
			case DIVISION:
			case OPARENTHESIS:
			case CPARENTHESIS:
			case TRUE:
			case FALSE:
			case CARET:
			case ID:
			case CTESTRING:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			comparison();
			setState(339);
			t();
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

	public static class TContext extends ParserRuleContext {
		public UContext u() {
			return getRuleContext(UContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_t);
		try {
			setState(345);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				u();
				setState(342);
				comparison();
				}
				break;
			case SEMICOLON:
			case CPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class UContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MadBasicParser.AND, 0); }
		public TerminalNode OR() { return getToken(MadBasicParser.OR, 0); }
		public UContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterU(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitU(this);
		}
	}

	public final UContext u() throws RecognitionException {
		UContext _localctx = new UContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_u);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MadBasicParser.READ, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(READ);
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

	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			term();
			setState(352);
			v();
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

	public static class VContext extends ParserRuleContext {
		public WContext w() {
			return getRuleContext(WContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public VContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_v);
		try {
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				w();
				setState(355);
				term();
				setState(356);
				v();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class WContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MadBasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MadBasicParser.MINUS, 0); }
		public WContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitW(this);
		}
	}

	public final WContext w() throws RecognitionException {
		WContext _localctx = new WContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_w);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ArgsContext extends ParserRuleContext {
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			m();
			setState(364);
			match(ID);
			setState(365);
			x();
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

	public static class XContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MadBasicParser.COMMA, 0); }
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitX(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_x);
		try {
			setState(373);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(COMMA);
				setState(368);
				m();
				setState(369);
				match(ID);
				setState(370);
				x();
				}
				break;
			case CPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComparisonContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			exp();
			setState(376);
			y();
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

	public static class YContext extends ParserRuleContext {
		public ZContext z() {
			return getRuleContext(ZContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitY(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_y);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case EQUAL:
			case GREATER:
			case LESSER:
			case PLUS:
			case DIFFERENT:
			case MINUS:
			case OPARENTHESIS:
			case TRUE:
			case FALSE:
			case ID:
			case CTESTRING:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				z();
				setState(379);
				exp();
				}
				break;
			case SEMICOLON:
			case AND:
			case OR:
			case CPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ZContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(MadBasicParser.GREATER, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(MadBasicParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(MadBasicParser.EQUAL, i);
		}
		public TerminalNode LESSER() { return getToken(MadBasicParser.LESSER, 0); }
		public TerminalNode DIFFERENT() { return getToken(MadBasicParser.DIFFERENT, 0); }
		public ZContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitZ(this);
		}
	}

	public final ZContext z() throws RecognitionException {
		ZContext _localctx = new ZContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_z);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case GREATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(GREATER);
				setState(385);
				match(EQUAL);
				}
				break;
			case LESSER:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(LESSER);
				setState(387);
				match(EQUAL);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(EQUAL);
				setState(389);
				match(EQUAL);
				}
				break;
			case DIFFERENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(DIFFERENT);
				}
				break;
			case PLUS:
			case MINUS:
			case OPARENTHESIS:
			case TRUE:
			case FALSE:
			case ID:
			case CTESTRING:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			factor();
			setState(395);
			aa();
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

	public static class AaContext extends ParserRuleContext {
		public AbContext ab() {
			return getRuleContext(AbContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public AaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAa(this);
		}
	}

	public final AaContext aa() throws RecognitionException {
		AaContext _localctx = new AaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_aa);
		try {
			setState(402);
			switch (_input.LA(1)) {
			case MULTIPLICATION:
			case DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				ab();
				setState(398);
				factor();
				setState(399);
				aa();
				}
				break;
			case SEMICOLON:
			case CBRACKET:
			case EQUAL:
			case GREATER:
			case LESSER:
			case PLUS:
			case AND:
			case OR:
			case DIFFERENT:
			case MINUS:
			case OPARENTHESIS:
			case CPARENTHESIS:
			case TRUE:
			case FALSE:
			case CARET:
			case ID:
			case CTESTRING:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AbContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(MadBasicParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(MadBasicParser.DIVISION, 0); }
		public AbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAb(this);
		}
	}

	public final AbContext ab() throws RecognitionException {
		AbContext _localctx = new AbContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ab);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICATION || _la==DIVISION) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode OPARENTHESIS() { return getToken(MadBasicParser.OPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPARENTHESIS() { return getToken(MadBasicParser.CPARENTHESIS, 0); }
		public AcContext ac() {
			return getRuleContext(AcContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_factor);
		try {
			setState(413);
			switch (_input.LA(1)) {
			case OPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(OPARENTHESIS);
				setState(407);
				expression();
				setState(408);
				match(CPARENTHESIS);
				}
				break;
			case PLUS:
			case MINUS:
			case TRUE:
			case FALSE:
			case ID:
			case CTESTRING:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				ac();
				setState(411);
				value();
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

	public static class AcContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MadBasicParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MadBasicParser.MINUS, 0); }
		public AcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAc(this);
		}
	}

	public final AcContext ac() throws RecognitionException {
		AcContext _localctx = new AcContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ac);
		try {
			setState(418);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(MINUS);
				}
				break;
			case TRUE:
			case FALSE:
			case ID:
			case CTESTRING:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(MadBasicParser.ID, 0); }
		public TerminalNode OBRACKET() { return getToken(MadBasicParser.OBRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(MadBasicParser.CBRACKET, 0); }
		public TerminalNode CTEI() { return getToken(MadBasicParser.CTEI, 0); }
		public TerminalNode CTEF() { return getToken(MadBasicParser.CTEF, 0); }
		public TerminalNode CTESTRING() { return getToken(MadBasicParser.CTESTRING, 0); }
		public TerminalNode TRUE() { return getToken(MadBasicParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MadBasicParser.FALSE, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_value);
		try {
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(ID);
				setState(422);
				match(OBRACKET);
				setState(423);
				exp();
				setState(424);
				match(CBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(CTEI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				match(CTEF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				match(CTESTRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(430);
				match(FALSE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(431);
				call();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(MadBasicParser.MAIN, 0); }
		public TerminalNode COLON() { return getToken(MadBasicParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(MadBasicParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(MAIN);
			setState(435);
			match(COLON);
			setState(436);
			block();
			setState(437);
			match(END);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u01ba\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0085\n\4\3\5\3\5\5\5"+
		"\u0089\n\5\3\6\3\6\5\6\u008d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\5\13\u00ab\n\13\3\f\3\f\5\f\u00af\n\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00bc\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\5\21\u00c7\n\21\3\22\3\22\3\22\3\22\5\22\u00cd"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d9\n\23"+
		"\3\24\3\24\5\24\u00dd\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00e6"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ee\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00f5\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\5\35\u0113\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0124\n\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u013a\n\"\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\5$\u0144\n$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\5(\u0153\n(\3)\3)\3)\3*\3*\3*\3*\5*\u015c\n*\3+\3+\3,\3,\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\5.\u016a\n.\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u0178\n\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63"+
		"\u0181\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u018b\n\64\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u0195\n\66\3\67\3\67\38\3"+
		"8\38\38\38\38\38\58\u01a0\n8\39\39\39\59\u01a5\n9\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\5:\u01b3\n:\3;\3;\3;\3;\3;\3;\2\2<\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprt\2\5\3\2\33\34\4\2\32\32\37\37\3\2 !\u01ac\2v\3\2\2\2\4{\3\2\2\2"+
		"\6\u0084\3\2\2\2\b\u0088\3\2\2\2\n\u008c\3\2\2\2\f\u008e\3\2\2\2\16\u009a"+
		"\3\2\2\2\20\u009c\3\2\2\2\22\u00a0\3\2\2\2\24\u00aa\3\2\2\2\26\u00ae\3"+
		"\2\2\2\30\u00b0\3\2\2\2\32\u00b4\3\2\2\2\34\u00bb\3\2\2\2\36\u00bd\3\2"+
		"\2\2 \u00c6\3\2\2\2\"\u00cc\3\2\2\2$\u00d8\3\2\2\2&\u00dc\3\2\2\2(\u00de"+
		"\3\2\2\2*\u00e5\3\2\2\2,\u00ed\3\2\2\2.\u00f4\3\2\2\2\60\u00f6\3\2\2\2"+
		"\62\u00ff\3\2\2\2\64\u0109\3\2\2\2\66\u010b\3\2\2\28\u0112\3\2\2\2:\u0114"+
		"\3\2\2\2<\u0123\3\2\2\2>\u0125\3\2\2\2@\u012d\3\2\2\2B\u0139\3\2\2\2D"+
		"\u013b\3\2\2\2F\u0143\3\2\2\2H\u0145\3\2\2\2J\u0148\3\2\2\2L\u014c\3\2"+
		"\2\2N\u0152\3\2\2\2P\u0154\3\2\2\2R\u015b\3\2\2\2T\u015d\3\2\2\2V\u015f"+
		"\3\2\2\2X\u0161\3\2\2\2Z\u0169\3\2\2\2\\\u016b\3\2\2\2^\u016d\3\2\2\2"+
		"`\u0177\3\2\2\2b\u0179\3\2\2\2d\u0180\3\2\2\2f\u018a\3\2\2\2h\u018c\3"+
		"\2\2\2j\u0194\3\2\2\2l\u0196\3\2\2\2n\u019f\3\2\2\2p\u01a4\3\2\2\2r\u01b2"+
		"\3\2\2\2t\u01b4\3\2\2\2vw\7\3\2\2wx\7\60\2\2xy\7\4\2\2yz\5\4\3\2z\3\3"+
		"\2\2\2{|\5\6\4\2|}\5\b\5\2}~\5\n\6\2~\177\7+\2\2\177\5\3\2\2\2\u0080\u0081"+
		"\5\f\7\2\u0081\u0082\5\6\4\2\u0082\u0085\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0080\3\2\2\2\u0084\u0083\3\2\2\2\u0085\7\3\2\2\2\u0086\u0089\5\20\t"+
		"\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\t"+
		"\3\2\2\2\u008a\u008d\5\30\r\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\13\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090"+
		"\7\61\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\22\2\2\u0092\u0093\5\b\5"+
		"\2\u0093\u0094\5\36\20\2\u0094\u0095\5\n\6\2\u0095\u0096\7\23\2\2\u0096"+
		"\r\3\2\2\2\u0097\u0098\7\r\2\2\u0098\u009b\7\61\2\2\u0099\u009b\3\2\2"+
		"\2\u009a\u0097\3\2\2\2\u009a\u0099\3\2\2\2\u009b\17\3\2\2\2\u009c\u009d"+
		"\7\5\2\2\u009d\u009e\7\7\2\2\u009e\u009f\5\22\n\2\u009f\21\3\2\2\2\u00a0"+
		"\u00a1\5$\23\2\u00a1\u00a2\7\60\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4"+
		"\7\4\2\2\u00a4\u00a5\5\26\f\2\u00a5\23\3\2\2\2\u00a6\u00a7\7\6\2\2\u00a7"+
		"\u00a8\7\60\2\2\u00a8\u00ab\5\24\13\2\u00a9\u00ab\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\25\3\2\2\2\u00ac\u00af\5\22\n\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\27\3\2\2"+
		"\2\u00b0\u00b1\7\17\2\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5\32\16\2\u00b3"+
		"\31\3\2\2\2\u00b4\u00b5\5&\24\2\u00b5\u00b6\5\34\17\2\u00b6\33\3\2\2\2"+
		"\u00b7\u00b8\5&\24\2\u00b8\u00b9\5\34\17\2\u00b9\u00bc\3\2\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\35\3\2\2\2\u00bd"+
		"\u00be\7\16\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1\7"+
		"#\2\2\u00c1\u00c2\7\22\2\2\u00c2\u00c3\7\23\2\2\u00c3\37\3\2\2\2\u00c4"+
		"\u00c7\5(\25\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7!\3\2\2\2\u00c8\u00c9\5.\30\2\u00c9\u00ca\5\"\22\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"#\3\2\2\2\u00ce\u00d9\7\b\2\2\u00cf\u00d9\7\t\2\2\u00d0\u00d9\7\n\2\2"+
		"\u00d1\u00d9\7\13\2\2\u00d2\u00d3\7%\2\2\u00d3\u00d4\7\30\2\2\u00d4\u00d5"+
		"\5$\23\2\u00d5\u00d6\7\27\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d9\7\61\2\2"+
		"\u00d8\u00ce\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d1"+
		"\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9%\3\2\2\2\u00da"+
		"\u00dd\5\60\31\2\u00db\u00dd\5\62\32\2\u00dc\u00da\3\2\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\'\3\2\2\2\u00de\u00df\5$\23\2\u00df\u00e0\5*\26\2\u00e0"+
		"\u00e1\7\60\2\2\u00e1\u00e2\5,\27\2\u00e2)\3\2\2\2\u00e3\u00e6\5\64\33"+
		"\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6+"+
		"\3\2\2\2\u00e7\u00e8\5$\23\2\u00e8\u00e9\5*\26\2\u00e9\u00ea\7\60\2\2"+
		"\u00ea\u00eb\5,\27\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e7"+
		"\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee-\3\2\2\2\u00ef\u00f5\5\66\34\2\u00f0"+
		"\u00f5\5:\36\2\u00f1\u00f5\5> \2\u00f2\u00f5\5@!\2\u00f3\u00f5\5D#\2\u00f4"+
		"\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f3\3\2\2\2\u00f5/\3\2\2\2\u00f6\u00f7\7\20\2\2\u00f7\u00f8"+
		"\7\60\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\5 \21\2\u00fa\u00fb\7#\2\2\u00fb"+
		"\u00fc\7\22\2\2\u00fc\u00fd\5H%\2\u00fd\u00fe\7\23\2\2\u00fe\61\3\2\2"+
		"\2\u00ff\u0100\5$\23\2\u0100\u0101\7\60\2\2\u0101\u0102\7\"\2\2\u0102"+
		"\u0103\5 \21\2\u0103\u0104\7#\2\2\u0104\u0105\7\22\2\2\u0105\u0106\5H"+
		"%\2\u0106\u0107\5J&\2\u0107\u0108\7\23\2\2\u0108\63\3\2\2\2\u0109\u010a"+
		"\7-\2\2\u010a\65\3\2\2\2\u010b\u010c\5L\'\2\u010c\u010d\7\26\2\2\u010d"+
		"\u010e\58\35\2\u010e\u010f\7\4\2\2\u010f\67\3\2\2\2\u0110\u0113\5P)\2"+
		"\u0111\u0113\5V,\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u01139\3\2"+
		"\2\2\u0114\u0115\7$\2\2\u0115\u0116\7\"\2\2\u0116\u0117\5P)\2\u0117\u0118"+
		"\7#\2\2\u0118\u0119\7\22\2\2\u0119\u011a\5\"\22\2\u011a\u011b\7\23\2\2"+
		"\u011b\u011c\5<\37\2\u011c;\3\2\2\2\u011d\u011e\7&\2\2\u011e\u011f\7\22"+
		"\2\2\u011f\u0120\5\"\22\2\u0120\u0121\7\23\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0122\3\2\2\2\u0124=\3\2\2\2"+
		"\u0125\u0126\7\'\2\2\u0126\u0127\7\"\2\2\u0127\u0128\5P)\2\u0128\u0129"+
		"\7#\2\2\u0129\u012a\7\22\2\2\u012a\u012b\5\"\22\2\u012b\u012c\7\23\2\2"+
		"\u012c?\3\2\2\2\u012d\u012e\7/\2\2\u012e\u012f\7\"\2\2\u012f\u0130\5X"+
		"-\2\u0130\u0131\5B\"\2\u0131\u0132\7#\2\2\u0132\u0133\7\4\2\2\u0133A\3"+
		"\2\2\2\u0134\u0135\7.\2\2\u0135\u0136\5X-\2\u0136\u0137\5B\"\2\u0137\u013a"+
		"\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0134\3\2\2\2\u0139\u0138\3\2\2\2\u013a"+
		"C\3\2\2\2\u013b\u013c\5L\'\2\u013c\u013d\7\"\2\2\u013d\u013e\5F$\2\u013e"+
		"\u013f\7#\2\2\u013f\u0140\7\4\2\2\u0140E\3\2\2\2\u0141\u0144\5^\60\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144G\3\2\2\2"+
		"\u0145\u0146\5\b\5\2\u0146\u0147\5\"\22\2\u0147I\3\2\2\2\u0148\u0149\7"+
		"\21\2\2\u0149\u014a\5P)\2\u014a\u014b\7\4\2\2\u014bK\3\2\2\2\u014c\u014d"+
		"\7\60\2\2\u014d\u014e\5N(\2\u014eM\3\2\2\2\u014f\u0150\7\36\2\2\u0150"+
		"\u0153\7\60\2\2\u0151\u0153\3\2\2\2\u0152\u014f\3\2\2\2\u0152\u0151\3"+
		"\2\2\2\u0153O\3\2\2\2\u0154\u0155\5b\62\2\u0155\u0156\5R*\2\u0156Q\3\2"+
		"\2\2\u0157\u0158\5T+\2\u0158\u0159\5b\62\2\u0159\u015c\3\2\2\2\u015a\u015c"+
		"\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u015a\3\2\2\2\u015cS\3\2\2\2\u015d"+
		"\u015e\t\2\2\2\u015eU\3\2\2\2\u015f\u0160\7(\2\2\u0160W\3\2\2\2\u0161"+
		"\u0162\5h\65\2\u0162\u0163\5Z.\2\u0163Y\3\2\2\2\u0164\u0165\5\\/\2\u0165"+
		"\u0166\5h\65\2\u0166\u0167\5Z.\2\u0167\u016a\3\2\2\2\u0168\u016a\3\2\2"+
		"\2\u0169\u0164\3\2\2\2\u0169\u0168\3\2\2\2\u016a[\3\2\2\2\u016b\u016c"+
		"\t\3\2\2\u016c]\3\2\2\2\u016d\u016e\5*\26\2\u016e\u016f\7\60\2\2\u016f"+
		"\u0170\5`\61\2\u0170_\3\2\2\2\u0171\u0172\7\6\2\2\u0172\u0173\5*\26\2"+
		"\u0173\u0174\7\60\2\2\u0174\u0175\5`\61\2\u0175\u0178\3\2\2\2\u0176\u0178"+
		"\3\2\2\2\u0177\u0171\3\2\2\2\u0177\u0176\3\2\2\2\u0178a\3\2\2\2\u0179"+
		"\u017a\5X-\2\u017a\u017b\5d\63\2\u017bc\3\2\2\2\u017c\u017d\5f\64\2\u017d"+
		"\u017e\5X-\2\u017e\u0181\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017c\3\2\2"+
		"\2\u0180\u017f\3\2\2\2\u0181e\3\2\2\2\u0182\u0183\7\27\2\2\u0183\u018b"+
		"\7\26\2\2\u0184\u0185\7\30\2\2\u0185\u018b\7\26\2\2\u0186\u0187\7\26\2"+
		"\2\u0187\u018b\7\26\2\2\u0188\u018b\7\35\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0182\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0188\3\2"+
		"\2\2\u018a\u0189\3\2\2\2\u018bg\3\2\2\2\u018c\u018d\5n8\2\u018d\u018e"+
		"\5j\66\2\u018ei\3\2\2\2\u018f\u0190\5l\67\2\u0190\u0191\5n8\2\u0191\u0192"+
		"\5j\66\2\u0192\u0195\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u018f\3\2\2\2\u0194"+
		"\u0193\3\2\2\2\u0195k\3\2\2\2\u0196\u0197\t\4\2\2\u0197m\3\2\2\2\u0198"+
		"\u0199\7\"\2\2\u0199\u019a\5P)\2\u019a\u019b\7#\2\2\u019b\u01a0\3\2\2"+
		"\2\u019c\u019d\5p9\2\u019d\u019e\5r:\2\u019e\u01a0\3\2\2\2\u019f\u0198"+
		"\3\2\2\2\u019f\u019c\3\2\2\2\u01a0o\3\2\2\2\u01a1\u01a5\7\32\2\2\u01a2"+
		"\u01a5\7\37\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a4\u01a2\3"+
		"\2\2\2\u01a4\u01a3\3\2\2\2\u01a5q\3\2\2\2\u01a6\u01b3\5L\'\2\u01a7\u01a8"+
		"\7\60\2\2\u01a8\u01a9\7\24\2\2\u01a9\u01aa\5X-\2\u01aa\u01ab\7\25\2\2"+
		"\u01ab\u01b3\3\2\2\2\u01ac\u01b3\7\64\2\2\u01ad\u01b3\7\63\2\2\u01ae\u01b3"+
		"\7\62\2\2\u01af\u01b3\7)\2\2\u01b0\u01b3\7*\2\2\u01b1\u01b3\5D#\2\u01b2"+
		"\u01a6\3\2\2\2\u01b2\u01a7\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2\u01ad\3\2"+
		"\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3s\3\2\2\2\u01b4\u01b5\7+\2\2\u01b5\u01b6\7\7\2\2\u01b6"+
		"\u01b7\5H%\2\u01b7\u01b8\7,\2\2\u01b8u\3\2\2\2\36\u0084\u0088\u008c\u009a"+
		"\u00aa\u00ae\u00bb\u00c6\u00cc\u00d8\u00dc\u00e5\u00ed\u00f4\u0112\u0123"+
		"\u0139\u0143\u0152\u015b\u0169\u0177\u0180\u018a\u0194\u019f\u01a4\u01b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}