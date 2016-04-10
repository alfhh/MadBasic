// Generated from /home/lsanchez/Documents/Compiladores/MadBasic/AntlrProject/src/MadBasic/MadBasic.g4 by ANTLR 4.5.1
package ParserMadBasic;
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
	public static final int
		RULE_madbasic = 0, RULE_program = 1, RULE_a = 2, RULE_b = 3, RULE_c = 4, 
		RULE_classe = 5, RULE_d = 6, RULE_vars = 7, RULE_e = 8, RULE_f = 9, RULE_g = 10, 
		RULE_methods = 11, RULE_h = 12, RULE_j = 13, RULE_init = 14, RULE_k = 15, 
		RULE_l = 16, RULE_type = 17, RULE_method = 18, RULE_params = 19, RULE_m = 20, 
		RULE_n = 21, RULE_statement = 22, RULE_procedure = 23, RULE_function = 24, 
		RULE_reference = 25, RULE_assignment = 26, RULE_o = 27, RULE_condition = 28, 
		RULE_p = 29, RULE_loop = 30, RULE_write = 31, RULE_q = 32, RULE_call = 33, 
		RULE_r = 34, RULE_block = 35, RULE_retorno = 36, RULE_identifier = 37, 
		RULE_s = 38, RULE_ss = 39, RULE_expression = 40, RULE_t = 41, RULE_u = 42, 
		RULE_read = 43, RULE_exp = 44, RULE_v = 45, RULE_w = 46, RULE_args = 47, 
		RULE_x = 48, RULE_comparison = 49, RULE_y = 50, RULE_z = 51, RULE_zz = 52, 
		RULE_term = 53, RULE_aa = 54, RULE_ab = 55, RULE_factor = 56, RULE_ac = 57, 
		RULE_value = 58, RULE_main = 59;
	public static final String[] ruleNames = {
		"madbasic", "program", "a", "b", "c", "classe", "d", "vars", "e", "f", 
		"g", "methods", "h", "j", "init", "k", "l", "type", "method", "params", 
		"m", "n", "statement", "procedure", "function", "reference", "assignment", 
		"o", "condition", "p", "loop", "write", "q", "call", "r", "block", "retorno", 
		"identifier", "s", "ss", "expression", "t", "u", "read", "exp", "v", "w", 
		"args", "x", "comparison", "y", "z", "zz", "term", "aa", "ab", "factor", 
		"ac", "value", "main"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitMadbasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MadbasicContext madbasic() throws RecognitionException {
		MadbasicContext _localctx = new MadbasicContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_madbasic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(PROGRAM);
			setState(121);
			match(ID);
			setState(122);
			match(SEMICOLON);
			setState(123);
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			a();
			setState(126);
			b();
			setState(127);
			c();
			setState(128);
			main();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_a);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				classe();
				setState(131);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_b);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case VARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_c);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case METHODS:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(CLASS);
			setState(145);
			match(OBJECT);
			setState(146);
			d();
			setState(147);
			match(OBRACE);
			setState(148);
			b();
			setState(149);
			init();
			setState(150);
			c();
			setState(151);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_d);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case PARENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(PARENT);
				setState(154);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(VARS);
			setState(159);
			match(COLON);
			setState(160);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			type();
			setState(163);
			match(ID);
			setState(164);
			f();
			setState(165);
			match(SEMICOLON);
			setState(166);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_f);
		try {
			setState(172);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(COMMA);
				setState(169);
				match(ID);
				setState(170);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_g);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(METHODS);
			setState(179);
			match(COLON);
			setState(180);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HContext h() throws RecognitionException {
		HContext _localctx = new HContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_h);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			method();
			setState(183);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitJ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JContext j() throws RecognitionException {
		JContext _localctx = new JContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_j);
		try {
			setState(189);
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
				setState(185);
				method();
				setState(186);
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
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(INIT);
			setState(192);
			match(OPARENTHESIS);
			setState(193);
			k();
			setState(194);
			match(CPARENTHESIS);
			setState(195);
			match(OBRACE);
			setState(196);
			l();
			setState(197);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KContext k() throws RecognitionException {
		KContext _localctx = new KContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_k);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_l);
		try {
			setState(207);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				statement();
				setState(204);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(BOOL);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(LIST);
				setState(214);
				match(LESSER);
				setState(215);
				type();
				setState(216);
				match(GREATER);
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
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
				setState(222);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			type();
			setState(226);
			m();
			setState(227);
			match(ID);
			setState(228);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MContext m() throws RecognitionException {
		MContext _localctx = new MContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_m);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				reference();
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
		public TerminalNode COMMA() { return getToken(MadBasicParser.COMMA, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_n);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(COMMA);
				setState(235);
				type();
				setState(236);
				m();
				setState(237);
				match(ID);
				setState(238);
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
		public TerminalNode SEMICOLON() { return getToken(MadBasicParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				write();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				call();
				setState(248);
				match(SEMICOLON);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(VOID);
			setState(253);
			match(ID);
			setState(254);
			match(OPARENTHESIS);
			setState(255);
			k();
			setState(256);
			match(CPARENTHESIS);
			setState(257);
			match(OBRACE);
			setState(258);
			block();
			setState(259);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			type();
			setState(262);
			match(ID);
			setState(263);
			match(OPARENTHESIS);
			setState(264);
			k();
			setState(265);
			match(CPARENTHESIS);
			setState(266);
			match(OBRACE);
			setState(267);
			block();
			setState(268);
			retorno();
			setState(269);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			identifier();
			setState(274);
			match(EQUAL);
			setState(275);
			o();
			setState(276);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_o);
		try {
			setState(280);
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
				setState(278);
				expression();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(IF);
			setState(283);
			match(OPARENTHESIS);
			setState(284);
			expression();
			setState(285);
			match(CPARENTHESIS);
			setState(286);
			match(OBRACE);
			setState(287);
			l();
			setState(288);
			match(CBRACE);
			setState(289);
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
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
	 
		public PContext() { }
		public void copyFrom(PContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PElseContext extends PContext {
		public TerminalNode ELSE() { return getToken(MadBasicParser.ELSE, 0); }
		public TerminalNode OBRACE() { return getToken(MadBasicParser.OBRACE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MadBasicParser.CBRACE, 0); }
		public PElseContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterPElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitPElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitPElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PEmptyContext extends PContext {
		public PEmptyContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterPEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitPEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitPEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_p);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case ELSE:
				_localctx = new PElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(ELSE);
				setState(292);
				match(OBRACE);
				setState(293);
				l();
				setState(294);
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
				_localctx = new PEmptyContext(_localctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(WHILE);
			setState(300);
			match(OPARENTHESIS);
			setState(301);
			expression();
			setState(302);
			match(CPARENTHESIS);
			setState(303);
			match(OBRACE);
			setState(304);
			l();
			setState(305);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(PRINT);
			setState(308);
			match(OPARENTHESIS);
			setState(309);
			exp();
			setState(310);
			q();
			setState(311);
			match(CPARENTHESIS);
			setState(312);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_q);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case CARET:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(CARET);
				setState(315);
				exp();
				setState(316);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			identifier();
			setState(322);
			match(OPARENTHESIS);
			setState(323);
			r();
			setState(324);
			match(CPARENTHESIS);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_r);
		try {
			setState(328);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case OPARENTHESIS:
			case TRUE:
			case FALSE:
			case TILDE:
			case ID:
			case CTESTRING:
			case CTEF:
			case CTEI:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			b();
			setState(331);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(RETURN);
			setState(334);
			expression();
			setState(335);
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
		public SsContext ss() {
			return getRuleContext(SsContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ID);
			setState(338);
			ss();
			setState(339);
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
		public SsContext ss() {
			return getRuleContext(SsContext.class,0);
		}
		public TerminalNode INIT() { return getToken(MadBasicParser.INIT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_s);
		try {
			setState(347);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(DOT);
				setState(342);
				match(ID);
				setState(343);
				ss();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(DOT);
				setState(345);
				match(INIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	public static class SsContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(MadBasicParser.OBRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(MadBasicParser.CBRACKET, 0); }
		public SsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterSs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitSs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitSs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SsContext ss() throws RecognitionException {
		SsContext _localctx = new SsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ss);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case OBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(OBRACKET);
				setState(350);
				exp();
				setState(351);
				match(CBRACKET);
				}
				break;
			case SEMICOLON:
			case COMMA:
			case CBRACKET:
			case EQUAL:
			case GREATER:
			case LESSER:
			case PLUS:
			case AND:
			case OR:
			case DIFFERENT:
			case DOT:
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			comparison();
			setState(357);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_t);
		try {
			setState(363);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				u();
				setState(360);
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
		public UContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u; }
	 
		public UContext() { }
		public void copyFrom(UContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UAndContext extends UContext {
		public TerminalNode AND() { return getToken(MadBasicParser.AND, 0); }
		public UAndContext(UContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterUAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitUAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitUAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UOrContext extends UContext {
		public TerminalNode OR() { return getToken(MadBasicParser.OR, 0); }
		public UOrContext(UContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterUOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitUOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitUOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UContext u() throws RecognitionException {
		UContext _localctx = new UContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_u);
		try {
			setState(367);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new UAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(AND);
				}
				break;
			case OR:
				_localctx = new UOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(OR);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			term();
			setState(372);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_v);
		try {
			setState(379);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				w();
				setState(375);
				term();
				setState(376);
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
		public WContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w; }
	 
		public WContext() { }
		public void copyFrom(WContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WPlusContext extends WContext {
		public TerminalNode PLUS() { return getToken(MadBasicParser.PLUS, 0); }
		public WPlusContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterWPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitWPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitWPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WMinusContext extends WContext {
		public TerminalNode MINUS() { return getToken(MadBasicParser.MINUS, 0); }
		public WMinusContext(WContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterWMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitWMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitWMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WContext w() throws RecognitionException {
		WContext _localctx = new WContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_w);
		try {
			setState(383);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new WPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new WMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(MINUS);
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

	public static class ArgsContext extends ParserRuleContext {
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			m();
			setState(386);
			exp();
			setState(387);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_x);
		try {
			setState(395);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(COMMA);
				setState(390);
				m();
				setState(391);
				exp();
				setState(392);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			exp();
			setState(398);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_y);
		try {
			setState(404);
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
				setState(400);
				z();
				setState(401);
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
		public ZContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z; }
	 
		public ZContext() { }
		public void copyFrom(ZContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZwtfContext extends ZContext {
		public ZwtfContext(ZContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterZwtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitZwtf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitZwtf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZDifferentContext extends ZContext {
		public TerminalNode DIFFERENT() { return getToken(MadBasicParser.DIFFERENT, 0); }
		public ZDifferentContext(ZContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterZDifferent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitZDifferent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitZDifferent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZEqualEqualContext extends ZContext {
		public List<TerminalNode> EQUAL() { return getTokens(MadBasicParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(MadBasicParser.EQUAL, i);
		}
		public ZEqualEqualContext(ZContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterZEqualEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitZEqualEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitZEqualEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZLesserContext extends ZContext {
		public TerminalNode LESSER() { return getToken(MadBasicParser.LESSER, 0); }
		public ZzContext zz() {
			return getRuleContext(ZzContext.class,0);
		}
		public ZLesserContext(ZContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterZLesser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitZLesser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitZLesser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZGreaterContext extends ZContext {
		public TerminalNode GREATER() { return getToken(MadBasicParser.GREATER, 0); }
		public ZzContext zz() {
			return getRuleContext(ZzContext.class,0);
		}
		public ZGreaterContext(ZContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterZGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitZGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitZGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZContext z() throws RecognitionException {
		ZContext _localctx = new ZContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_z);
		try {
			setState(414);
			switch (_input.LA(1)) {
			case GREATER:
				_localctx = new ZGreaterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(GREATER);
				setState(407);
				zz();
				}
				break;
			case LESSER:
				_localctx = new ZLesserContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(LESSER);
				setState(409);
				zz();
				}
				break;
			case EQUAL:
				_localctx = new ZEqualEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				match(EQUAL);
				setState(411);
				match(EQUAL);
				}
				break;
			case DIFFERENT:
				_localctx = new ZDifferentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
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
				_localctx = new ZwtfContext(_localctx);
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

	public static class ZzContext extends ParserRuleContext {
		public ZzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zz; }
	 
		public ZzContext() { }
		public void copyFrom(ZzContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZzEmptyContext extends ZzContext {
		public ZzEmptyContext(ZzContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterZzEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitZzEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitZzEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZzEqualContext extends ZzContext {
		public TerminalNode EQUAL() { return getToken(MadBasicParser.EQUAL, 0); }
		public ZzEqualContext(ZzContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterZzEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitZzEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitZzEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZzContext zz() throws RecognitionException {
		ZzContext _localctx = new ZzContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_zz);
		try {
			setState(418);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new ZzEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(EQUAL);
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
				_localctx = new ZzEmptyContext(_localctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			factor();
			setState(421);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitAa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AaContext aa() throws RecognitionException {
		AaContext _localctx = new AaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_aa);
		try {
			setState(428);
			switch (_input.LA(1)) {
			case MULTIPLICATION:
			case DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				ab();
				setState(424);
				factor();
				setState(425);
				aa();
				}
				break;
			case SEMICOLON:
			case COMMA:
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
		public AbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ab; }
	 
		public AbContext() { }
		public void copyFrom(AbContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbDivisionContext extends AbContext {
		public TerminalNode DIVISION() { return getToken(MadBasicParser.DIVISION, 0); }
		public AbDivisionContext(AbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAbDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAbDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitAbDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbMultiplicationContext extends AbContext {
		public TerminalNode MULTIPLICATION() { return getToken(MadBasicParser.MULTIPLICATION, 0); }
		public AbMultiplicationContext(AbContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAbMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAbMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitAbMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbContext ab() throws RecognitionException {
		AbContext _localctx = new AbContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ab);
		try {
			setState(432);
			switch (_input.LA(1)) {
			case MULTIPLICATION:
				_localctx = new AbMultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(MULTIPLICATION);
				}
				break;
			case DIVISION:
				_localctx = new AbDivisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(DIVISION);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorExpressionContext extends FactorContext {
		public TerminalNode OPARENTHESIS() { return getToken(MadBasicParser.OPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPARENTHESIS() { return getToken(MadBasicParser.CPARENTHESIS, 0); }
		public FactorExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterFactorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitFactorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitFactorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorValueContext extends FactorContext {
		public AcContext ac() {
			return getRuleContext(AcContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FactorValueContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterFactorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitFactorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitFactorValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_factor);
		try {
			setState(441);
			switch (_input.LA(1)) {
			case OPARENTHESIS:
				_localctx = new FactorExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(OPARENTHESIS);
				setState(435);
				expression();
				setState(436);
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
				_localctx = new FactorValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				ac();
				setState(439);
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
		public AcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ac; }
	 
		public AcContext() { }
		public void copyFrom(AcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AcEmptyContext extends AcContext {
		public AcEmptyContext(AcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAcEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAcEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitAcEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AcPlusContext extends AcContext {
		public TerminalNode PLUS() { return getToken(MadBasicParser.PLUS, 0); }
		public AcPlusContext(AcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAcPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAcPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitAcPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AcMinusContext extends AcContext {
		public TerminalNode MINUS() { return getToken(MadBasicParser.MINUS, 0); }
		public AcMinusContext(AcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAcMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAcMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitAcMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcContext ac() throws RecognitionException {
		AcContext _localctx = new AcContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ac);
		try {
			setState(446);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new AcPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new AcMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(MINUS);
				}
				break;
			case TRUE:
			case FALSE:
			case ID:
			case CTESTRING:
			case CTEF:
			case CTEI:
				_localctx = new AcEmptyContext(_localctx);
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
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueIdentifierContext extends ValueContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueIdentifierContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterValueIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitValueIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitValueIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueStringContext extends ValueContext {
		public TerminalNode CTESTRING() { return getToken(MadBasicParser.CTESTRING, 0); }
		public ValueStringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitValueString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitValueString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueCallContext extends ValueContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ValueCallContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterValueCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitValueCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitValueCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueIntContext extends ValueContext {
		public TerminalNode CTEI() { return getToken(MadBasicParser.CTEI, 0); }
		public ValueIntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterValueInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitValueInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitValueInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueFloatContext extends ValueContext {
		public TerminalNode CTEF() { return getToken(MadBasicParser.CTEF, 0); }
		public ValueFloatContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterValueFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitValueFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitValueFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueBoolContext extends ValueContext {
		public TerminalNode TRUE() { return getToken(MadBasicParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MadBasicParser.FALSE, 0); }
		public ValueBoolContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterValueBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitValueBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitValueBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_value);
		try {
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new ValueIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				identifier();
				}
				break;
			case 2:
				_localctx = new ValueIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(CTEI);
				}
				break;
			case 3:
				_localctx = new ValueFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(CTEF);
				}
				break;
			case 4:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				match(CTESTRING);
				}
				break;
			case 5:
				_localctx = new ValueBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(452);
				match(TRUE);
				}
				break;
			case 6:
				_localctx = new ValueBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(453);
				match(FALSE);
				}
				break;
			case 7:
				_localctx = new ValueCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(454);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(MAIN);
			setState(458);
			match(COLON);
			setState(459);
			block();
			setState(460);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u01d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0089\n\4"+
		"\3\5\3\5\5\5\u008d\n\5\3\6\3\6\5\6\u0091\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\5\b\u009f\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\5\13\u00af\n\13\3\f\3\f\5\f\u00b3\n\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00c0\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00cc\n\21\3\22\3\22\3\22"+
		"\3\22\5\22\u00d2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00de\n\23\3\24\3\24\5\24\u00e2\n\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\5\26\u00eb\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f4"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fd\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u011b\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u012c\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u0142\n\"\3#\3#\3#\3#\3#\3$\3$\5$\u014b\n$\3%\3%"+
		"\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u015e\n(\3)\3)\3"+
		")\3)\3)\5)\u0165\n)\3*\3*\3*\3+\3+\3+\3+\5+\u016e\n+\3,\3,\5,\u0172\n"+
		",\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\5/\u017e\n/\3\60\3\60\5\60\u0182\n\60"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u018e\n\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0197\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u01a1\n\65\3\66\3\66\5\66\u01a5\n\66\3\67\3\67\3"+
		"\67\38\38\38\38\38\58\u01af\n8\39\39\59\u01b3\n9\3:\3:\3:\3:\3:\3:\3:"+
		"\5:\u01bc\n:\3;\3;\3;\5;\u01c1\n;\3<\3<\3<\3<\3<\3<\3<\5<\u01ca\n<\3="+
		"\3=\3=\3=\3=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\2\u01c6\2z\3\2\2\2\4\177"+
		"\3\2\2\2\6\u0088\3\2\2\2\b\u008c\3\2\2\2\n\u0090\3\2\2\2\f\u0092\3\2\2"+
		"\2\16\u009e\3\2\2\2\20\u00a0\3\2\2\2\22\u00a4\3\2\2\2\24\u00ae\3\2\2\2"+
		"\26\u00b2\3\2\2\2\30\u00b4\3\2\2\2\32\u00b8\3\2\2\2\34\u00bf\3\2\2\2\36"+
		"\u00c1\3\2\2\2 \u00cb\3\2\2\2\"\u00d1\3\2\2\2$\u00dd\3\2\2\2&\u00e1\3"+
		"\2\2\2(\u00e3\3\2\2\2*\u00ea\3\2\2\2,\u00f3\3\2\2\2.\u00fc\3\2\2\2\60"+
		"\u00fe\3\2\2\2\62\u0107\3\2\2\2\64\u0111\3\2\2\2\66\u0113\3\2\2\28\u011a"+
		"\3\2\2\2:\u011c\3\2\2\2<\u012b\3\2\2\2>\u012d\3\2\2\2@\u0135\3\2\2\2B"+
		"\u0141\3\2\2\2D\u0143\3\2\2\2F\u014a\3\2\2\2H\u014c\3\2\2\2J\u014f\3\2"+
		"\2\2L\u0153\3\2\2\2N\u015d\3\2\2\2P\u0164\3\2\2\2R\u0166\3\2\2\2T\u016d"+
		"\3\2\2\2V\u0171\3\2\2\2X\u0173\3\2\2\2Z\u0175\3\2\2\2\\\u017d\3\2\2\2"+
		"^\u0181\3\2\2\2`\u0183\3\2\2\2b\u018d\3\2\2\2d\u018f\3\2\2\2f\u0196\3"+
		"\2\2\2h\u01a0\3\2\2\2j\u01a4\3\2\2\2l\u01a6\3\2\2\2n\u01ae\3\2\2\2p\u01b2"+
		"\3\2\2\2r\u01bb\3\2\2\2t\u01c0\3\2\2\2v\u01c9\3\2\2\2x\u01cb\3\2\2\2z"+
		"{\7\3\2\2{|\7\60\2\2|}\7\4\2\2}~\5\4\3\2~\3\3\2\2\2\177\u0080\5\6\4\2"+
		"\u0080\u0081\5\b\5\2\u0081\u0082\5\n\6\2\u0082\u0083\5x=\2\u0083\5\3\2"+
		"\2\2\u0084\u0085\5\f\7\2\u0085\u0086\5\6\4\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0087\3\2\2\2\u0089\7\3\2\2\2"+
		"\u008a\u008d\5\20\t\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\t\3\2\2\2\u008e\u0091\5\30\r\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\13\3\2\2\2\u0092\u0093\7\f\2"+
		"\2\u0093\u0094\7\61\2\2\u0094\u0095\5\16\b\2\u0095\u0096\7\22\2\2\u0096"+
		"\u0097\5\b\5\2\u0097\u0098\5\36\20\2\u0098\u0099\5\n\6\2\u0099\u009a\7"+
		"\23\2\2\u009a\r\3\2\2\2\u009b\u009c\7\r\2\2\u009c\u009f\7\61\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009d\3\2\2\2\u009f\17\3\2\2"+
		"\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a3\5\22\n\2\u00a3"+
		"\21\3\2\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7\60\2\2\u00a6\u00a7\5\24"+
		"\13\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\5\26\f\2\u00a9\23\3\2\2\2\u00aa"+
		"\u00ab\7\6\2\2\u00ab\u00ac\7\60\2\2\u00ac\u00af\5\24\13\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\25\3\2\2\2\u00b0"+
		"\u00b3\5\22\n\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b6\7\7\2\2\u00b6"+
		"\u00b7\5\32\16\2\u00b7\31\3\2\2\2\u00b8\u00b9\5&\24\2\u00b9\u00ba\5\34"+
		"\17\2\u00ba\33\3\2\2\2\u00bb\u00bc\5&\24\2\u00bc\u00bd\5\34\17\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\7\16\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4"+
		"\5 \21\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\5\"\22\2"+
		"\u00c7\u00c8\7\23\2\2\u00c8\37\3\2\2\2\u00c9\u00cc\5(\25\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc!\3\2\2\2\u00cd"+
		"\u00ce\5.\30\2\u00ce\u00cf\5\"\22\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\3"+
		"\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2#\3\2\2\2\u00d3\u00de"+
		"\7\b\2\2\u00d4\u00de\7\t\2\2\u00d5\u00de\7\n\2\2\u00d6\u00de\7\13\2\2"+
		"\u00d7\u00d8\7%\2\2\u00d8\u00d9\7\30\2\2\u00d9\u00da\5$\23\2\u00da\u00db"+
		"\7\27\2\2\u00db\u00de\3\2\2\2\u00dc\u00de\7\61\2\2\u00dd\u00d3\3\2\2\2"+
		"\u00dd\u00d4\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d7"+
		"\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de%\3\2\2\2\u00df\u00e2\5\60\31\2\u00e0"+
		"\u00e2\5\62\32\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\'\3\2\2"+
		"\2\u00e3\u00e4\5$\23\2\u00e4\u00e5\5*\26\2\u00e5\u00e6\7\60\2\2\u00e6"+
		"\u00e7\5,\27\2\u00e7)\3\2\2\2\u00e8\u00eb\5\64\33\2\u00e9\u00eb\3\2\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb+\3\2\2\2\u00ec\u00ed"+
		"\7\6\2\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\5*\26\2\u00ef\u00f0\7\60\2\2"+
		"\u00f0\u00f1\5,\27\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ec"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00fd\5\66\34\2\u00f6"+
		"\u00fd\5:\36\2\u00f7\u00fd\5> \2\u00f8\u00fd\5@!\2\u00f9\u00fa\5D#\2\u00fa"+
		"\u00fb\7\4\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2"+
		"\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd"+
		"/\3\2\2\2\u00fe\u00ff\7\20\2\2\u00ff\u0100\7\60\2\2\u0100\u0101\7\"\2"+
		"\2\u0101\u0102\5 \21\2\u0102\u0103\7#\2\2\u0103\u0104\7\22\2\2\u0104\u0105"+
		"\5H%\2\u0105\u0106\7\23\2\2\u0106\61\3\2\2\2\u0107\u0108\5$\23\2\u0108"+
		"\u0109\7\60\2\2\u0109\u010a\7\"\2\2\u010a\u010b\5 \21\2\u010b\u010c\7"+
		"#\2\2\u010c\u010d\7\22\2\2\u010d\u010e\5H%\2\u010e\u010f\5J&\2\u010f\u0110"+
		"\7\23\2\2\u0110\63\3\2\2\2\u0111\u0112\7-\2\2\u0112\65\3\2\2\2\u0113\u0114"+
		"\5L\'\2\u0114\u0115\7\26\2\2\u0115\u0116\58\35\2\u0116\u0117\7\4\2\2\u0117"+
		"\67\3\2\2\2\u0118\u011b\5R*\2\u0119\u011b\5X-\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b9\3\2\2\2\u011c\u011d\7$\2\2\u011d\u011e\7\"\2\2\u011e"+
		"\u011f\5R*\2\u011f\u0120\7#\2\2\u0120\u0121\7\22\2\2\u0121\u0122\5\"\22"+
		"\2\u0122\u0123\7\23\2\2\u0123\u0124\5<\37\2\u0124;\3\2\2\2\u0125\u0126"+
		"\7&\2\2\u0126\u0127\7\22\2\2\u0127\u0128\5\"\22\2\u0128\u0129\7\23\2\2"+
		"\u0129\u012c\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u012a"+
		"\3\2\2\2\u012c=\3\2\2\2\u012d\u012e\7\'\2\2\u012e\u012f\7\"\2\2\u012f"+
		"\u0130\5R*\2\u0130\u0131\7#\2\2\u0131\u0132\7\22\2\2\u0132\u0133\5\"\22"+
		"\2\u0133\u0134\7\23\2\2\u0134?\3\2\2\2\u0135\u0136\7/\2\2\u0136\u0137"+
		"\7\"\2\2\u0137\u0138\5Z.\2\u0138\u0139\5B\"\2\u0139\u013a\7#\2\2\u013a"+
		"\u013b\7\4\2\2\u013bA\3\2\2\2\u013c\u013d\7.\2\2\u013d\u013e\5Z.\2\u013e"+
		"\u013f\5B\"\2\u013f\u0142\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013c\3\2"+
		"\2\2\u0141\u0140\3\2\2\2\u0142C\3\2\2\2\u0143\u0144\5L\'\2\u0144\u0145"+
		"\7\"\2\2\u0145\u0146\5F$\2\u0146\u0147\7#\2\2\u0147E\3\2\2\2\u0148\u014b"+
		"\5`\61\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"G\3\2\2\2\u014c\u014d\5\b\5\2\u014d\u014e\5\"\22\2\u014eI\3\2\2\2\u014f"+
		"\u0150\7\21\2\2\u0150\u0151\5R*\2\u0151\u0152\7\4\2\2\u0152K\3\2\2\2\u0153"+
		"\u0154\7\60\2\2\u0154\u0155\5P)\2\u0155\u0156\5N(\2\u0156M\3\2\2\2\u0157"+
		"\u0158\7\36\2\2\u0158\u0159\7\60\2\2\u0159\u015e\5P)\2\u015a\u015b\7\36"+
		"\2\2\u015b\u015e\7\16\2\2\u015c\u015e\3\2\2\2\u015d\u0157\3\2\2\2\u015d"+
		"\u015a\3\2\2\2\u015d\u015c\3\2\2\2\u015eO\3\2\2\2\u015f\u0160\7\24\2\2"+
		"\u0160\u0161\5Z.\2\u0161\u0162\7\25\2\2\u0162\u0165\3\2\2\2\u0163\u0165"+
		"\3\2\2\2\u0164\u015f\3\2\2\2\u0164\u0163\3\2\2\2\u0165Q\3\2\2\2\u0166"+
		"\u0167\5d\63\2\u0167\u0168\5T+\2\u0168S\3\2\2\2\u0169\u016a\5V,\2\u016a"+
		"\u016b\5d\63\2\u016b\u016e\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u0169\3\2"+
		"\2\2\u016d\u016c\3\2\2\2\u016eU\3\2\2\2\u016f\u0172\7\33\2\2\u0170\u0172"+
		"\7\34\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172W\3\2\2\2\u0173"+
		"\u0174\7(\2\2\u0174Y\3\2\2\2\u0175\u0176\5l\67\2\u0176\u0177\5\\/\2\u0177"+
		"[\3\2\2\2\u0178\u0179\5^\60\2\u0179\u017a\5l\67\2\u017a\u017b\5\\/\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u0178\3\2\2\2\u017d\u017c\3\2"+
		"\2\2\u017e]\3\2\2\2\u017f\u0182\7\32\2\2\u0180\u0182\7\37\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0180\3\2\2\2\u0182_\3\2\2\2\u0183\u0184\5*\26\2\u0184"+
		"\u0185\5Z.\2\u0185\u0186\5b\62\2\u0186a\3\2\2\2\u0187\u0188\7\6\2\2\u0188"+
		"\u0189\5*\26\2\u0189\u018a\5Z.\2\u018a\u018b\5b\62\2\u018b\u018e\3\2\2"+
		"\2\u018c\u018e\3\2\2\2\u018d\u0187\3\2\2\2\u018d\u018c\3\2\2\2\u018ec"+
		"\3\2\2\2\u018f\u0190\5Z.\2\u0190\u0191\5f\64\2\u0191e\3\2\2\2\u0192\u0193"+
		"\5h\65\2\u0193\u0194\5Z.\2\u0194\u0197\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u0192\3\2\2\2\u0196\u0195\3\2\2\2\u0197g\3\2\2\2\u0198\u0199\7\27\2\2"+
		"\u0199\u01a1\5j\66\2\u019a\u019b\7\30\2\2\u019b\u01a1\5j\66\2\u019c\u019d"+
		"\7\26\2\2\u019d\u01a1\7\26\2\2\u019e\u01a1\7\35\2\2\u019f\u01a1\3\2\2"+
		"\2\u01a0\u0198\3\2\2\2\u01a0\u019a\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1i\3\2\2\2\u01a2\u01a5\7\26\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5k\3\2\2\2"+
		"\u01a6\u01a7\5r:\2\u01a7\u01a8\5n8\2\u01a8m\3\2\2\2\u01a9\u01aa\5p9\2"+
		"\u01aa\u01ab\5r:\2\u01ab\u01ac\5n8\2\u01ac\u01af\3\2\2\2\u01ad\u01af\3"+
		"\2\2\2\u01ae\u01a9\3\2\2\2\u01ae\u01ad\3\2\2\2\u01afo\3\2\2\2\u01b0\u01b3"+
		"\7 \2\2\u01b1\u01b3\7!\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"q\3\2\2\2\u01b4\u01b5\7\"\2\2\u01b5\u01b6\5R*\2\u01b6\u01b7\7#\2\2\u01b7"+
		"\u01bc\3\2\2\2\u01b8\u01b9\5t;\2\u01b9\u01ba\5v<\2\u01ba\u01bc\3\2\2\2"+
		"\u01bb\u01b4\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bcs\3\2\2\2\u01bd\u01c1\7"+
		"\32\2\2\u01be\u01c1\7\37\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1u\3\2\2\2\u01c2\u01ca\5L\'\2\u01c3"+
		"\u01ca\7\64\2\2\u01c4\u01ca\7\63\2\2\u01c5\u01ca\7\62\2\2\u01c6\u01ca"+
		"\7)\2\2\u01c7\u01ca\7*\2\2\u01c8\u01ca\5D#\2\u01c9\u01c2\3\2\2\2\u01c9"+
		"\u01c3\3\2\2\2\u01c9\u01c4\3\2\2\2\u01c9\u01c5\3\2\2\2\u01c9\u01c6\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01caw\3\2\2\2\u01cb\u01cc"+
		"\7+\2\2\u01cc\u01cd\7\7\2\2\u01cd\u01ce\5H%\2\u01ce\u01cf\7,\2\2\u01cf"+
		"y\3\2\2\2#\u0088\u008c\u0090\u009e\u00ae\u00b2\u00bf\u00cb\u00d1\u00dd"+
		"\u00e1\u00ea\u00f3\u00fc\u011a\u012b\u0141\u014a\u015d\u0164\u016d\u0171"+
		"\u017d\u0181\u018d\u0196\u01a0\u01a4\u01ae\u01b2\u01bb\u01c0\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}