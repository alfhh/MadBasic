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
		RULE_l = 16, RULE_type = 17, RULE_array = 18, RULE_method = 19, RULE_params = 20, 
		RULE_m = 21, RULE_n = 22, RULE_statement = 23, RULE_procedure = 24, RULE_function = 25, 
		RULE_reference = 26, RULE_assignment = 27, RULE_o = 28, RULE_condition = 29, 
		RULE_p = 30, RULE_loop = 31, RULE_write = 32, RULE_q = 33, RULE_call = 34, 
		RULE_r = 35, RULE_block = 36, RULE_retorno = 37, RULE_identifier = 38, 
		RULE_s = 39, RULE_ss = 40, RULE_expression = 41, RULE_t = 42, RULE_u = 43, 
		RULE_read = 44, RULE_exp = 45, RULE_v = 46, RULE_w = 47, RULE_args = 48, 
		RULE_x = 49, RULE_comparison = 50, RULE_y = 51, RULE_z = 52, RULE_zz = 53, 
		RULE_term = 54, RULE_aa = 55, RULE_ab = 56, RULE_factor = 57, RULE_ac = 58, 
		RULE_ad = 59, RULE_value = 60, RULE_main = 61;
	public static final String[] ruleNames = {
		"madbasic", "program", "a", "b", "c", "classe", "d", "vars", "e", "f", 
		"g", "methods", "h", "j", "init", "k", "l", "type", "array", "method", 
		"params", "m", "n", "statement", "procedure", "function", "reference", 
		"assignment", "o", "condition", "p", "loop", "write", "q", "call", "r", 
		"block", "retorno", "identifier", "s", "ss", "expression", "t", "u", "read", 
		"exp", "v", "w", "args", "x", "comparison", "y", "z", "zz", "term", "aa", 
		"ab", "factor", "ac", "ad", "value", "main"
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
			setState(124);
			match(PROGRAM);
			setState(125);
			match(ID);
			setState(126);
			match(SEMICOLON);
			setState(127);
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
			setState(129);
			a();
			setState(130);
			b();
			setState(131);
			c();
			setState(132);
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
			setState(138);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				classe();
				setState(135);
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
			setState(142);
			switch (_input.LA(1)) {
			case VARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
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
			setState(146);
			switch (_input.LA(1)) {
			case METHODS:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
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
			setState(148);
			match(CLASS);
			setState(149);
			match(OBJECT);
			setState(150);
			d();
			setState(151);
			match(OBRACE);
			setState(152);
			b();
			setState(153);
			init();
			setState(154);
			c();
			setState(155);
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
			setState(160);
			switch (_input.LA(1)) {
			case PARENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(PARENT);
				setState(158);
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
			setState(162);
			match(VARS);
			setState(163);
			match(COLON);
			setState(164);
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
			setState(166);
			type();
			setState(167);
			match(ID);
			setState(168);
			f();
			setState(169);
			match(SEMICOLON);
			setState(170);
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
			setState(176);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(COMMA);
				setState(173);
				match(ID);
				setState(174);
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
			setState(180);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
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
			setState(182);
			match(METHODS);
			setState(183);
			match(COLON);
			setState(184);
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
			setState(186);
			method();
			setState(187);
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
			setState(193);
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
				setState(189);
				method();
				setState(190);
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
			setState(195);
			match(INIT);
			setState(196);
			match(OPARENTHESIS);
			setState(197);
			k();
			setState(198);
			match(CPARENTHESIS);
			setState(199);
			match(OBRACE);
			setState(200);
			l();
			setState(201);
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
			setState(205);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
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
			setState(211);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				statement();
				setState(208);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(MadBasicParser.INT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeFloatContext extends TypeContext {
		public TerminalNode FLOAT() { return getToken(MadBasicParser.FLOAT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeFloatContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterTypeFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitTypeFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitTypeFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeListContext extends TypeContext {
		public TerminalNode LIST() { return getToken(MadBasicParser.LIST, 0); }
		public TerminalNode LESSER() { return getToken(MadBasicParser.LESSER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(MadBasicParser.GREATER, 0); }
		public TypeListContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeObjectContext extends TypeContext {
		public TerminalNode OBJECT() { return getToken(MadBasicParser.OBJECT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeObjectContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterTypeObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitTypeObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitTypeObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeStringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(MadBasicParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeStringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterTypeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitTypeString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitTypeString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(MadBasicParser.BOOL, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitTypeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(INT);
				setState(214);
				array();
				}
				break;
			case FLOAT:
				_localctx = new TypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(FLOAT);
				setState(216);
				array();
				}
				break;
			case STRING:
				_localctx = new TypeStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(STRING);
				setState(218);
				array();
				}
				break;
			case BOOL:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(BOOL);
				setState(220);
				array();
				}
				break;
			case LIST:
				_localctx = new TypeListContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(LIST);
				setState(222);
				match(LESSER);
				setState(223);
				type();
				setState(224);
				match(GREATER);
				}
				break;
			case OBJECT:
				_localctx = new TypeObjectContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(OBJECT);
				setState(227);
				array();
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayEmptyContext extends ArrayContext {
		public ArrayEmptyContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterArrayEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitArrayEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitArrayEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclareContext extends ArrayContext {
		public TerminalNode OBRACKET() { return getToken(MadBasicParser.OBRACKET, 0); }
		public List<AdContext> ad() {
			return getRuleContexts(AdContext.class);
		}
		public AdContext ad(int i) {
			return getRuleContext(AdContext.class,i);
		}
		public List<TerminalNode> CTEI() { return getTokens(MadBasicParser.CTEI); }
		public TerminalNode CTEI(int i) {
			return getToken(MadBasicParser.CTEI, i);
		}
		public TerminalNode COMMA() { return getToken(MadBasicParser.COMMA, 0); }
		public TerminalNode CBRACKET() { return getToken(MadBasicParser.CBRACKET, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayDeclareContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterArrayDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitArrayDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitArrayDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayVoidContext extends ArrayContext {
		public TerminalNode OBRACKET() { return getToken(MadBasicParser.OBRACKET, 0); }
		public TerminalNode CBRACKET() { return getToken(MadBasicParser.CBRACKET, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayVoidContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterArrayVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitArrayVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitArrayVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		try {
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(OBRACKET);
				setState(231);
				ad();
				setState(232);
				match(CTEI);
				setState(233);
				match(COMMA);
				setState(234);
				ad();
				setState(235);
				match(CTEI);
				setState(236);
				match(CBRACKET);
				setState(237);
				array();
				}
				break;
			case 2:
				_localctx = new ArrayVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(OBRACKET);
				setState(240);
				match(CBRACKET);
				setState(241);
				array();
				}
				break;
			case 3:
				_localctx = new ArrayEmptyContext(_localctx);
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
		enterRule(_localctx, 38, RULE_method);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
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
				setState(246);
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
		enterRule(_localctx, 40, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			type();
			setState(250);
			m();
			setState(251);
			match(ID);
			setState(252);
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
		enterRule(_localctx, 42, RULE_m);
		try {
			setState(256);
			switch (_input.LA(1)) {
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
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
		enterRule(_localctx, 44, RULE_n);
		try {
			setState(265);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(COMMA);
				setState(259);
				type();
				setState(260);
				m();
				setState(261);
				match(ID);
				setState(262);
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
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				write();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				call();
				setState(272);
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
		enterRule(_localctx, 48, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(VOID);
			setState(277);
			match(ID);
			setState(278);
			match(OPARENTHESIS);
			setState(279);
			k();
			setState(280);
			match(CPARENTHESIS);
			setState(281);
			match(OBRACE);
			setState(282);
			block();
			setState(283);
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
		enterRule(_localctx, 50, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			type();
			setState(286);
			match(ID);
			setState(287);
			match(OPARENTHESIS);
			setState(288);
			k();
			setState(289);
			match(CPARENTHESIS);
			setState(290);
			match(OBRACE);
			setState(291);
			block();
			setState(292);
			retorno();
			setState(293);
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
		enterRule(_localctx, 52, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 54, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			identifier();
			setState(298);
			match(EQUAL);
			setState(299);
			o();
			setState(300);
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
		enterRule(_localctx, 56, RULE_o);
		try {
			setState(304);
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
				setState(302);
				expression();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
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
		enterRule(_localctx, 58, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IF);
			setState(307);
			match(OPARENTHESIS);
			setState(308);
			expression();
			setState(309);
			match(CPARENTHESIS);
			setState(310);
			match(OBRACE);
			setState(311);
			l();
			setState(312);
			match(CBRACE);
			setState(313);
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
		enterRule(_localctx, 60, RULE_p);
		try {
			setState(321);
			switch (_input.LA(1)) {
			case ELSE:
				_localctx = new PElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(ELSE);
				setState(316);
				match(OBRACE);
				setState(317);
				l();
				setState(318);
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
		enterRule(_localctx, 62, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(WHILE);
			setState(324);
			match(OPARENTHESIS);
			setState(325);
			expression();
			setState(326);
			match(CPARENTHESIS);
			setState(327);
			match(OBRACE);
			setState(328);
			l();
			setState(329);
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
		enterRule(_localctx, 64, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(PRINT);
			setState(332);
			match(OPARENTHESIS);
			setState(333);
			exp();
			setState(334);
			q();
			setState(335);
			match(CPARENTHESIS);
			setState(336);
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
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
	 
		public QContext() { }
		public void copyFrom(QContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QWriteContext extends QContext {
		public TerminalNode CARET() { return getToken(MadBasicParser.CARET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public QWriteContext(QContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterQWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitQWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitQWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QEmptyContext extends QContext {
		public QEmptyContext(QContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterQEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitQEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitQEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_q);
		try {
			setState(343);
			switch (_input.LA(1)) {
			case CARET:
				_localctx = new QWriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(CARET);
				setState(339);
				exp();
				setState(340);
				q();
				}
				break;
			case CPARENTHESIS:
				_localctx = new QEmptyContext(_localctx);
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
		enterRule(_localctx, 68, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			identifier();
			setState(346);
			match(OPARENTHESIS);
			setState(347);
			r();
			setState(348);
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
		enterRule(_localctx, 70, RULE_r);
		try {
			setState(352);
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
				setState(350);
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
		enterRule(_localctx, 72, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			b();
			setState(355);
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
		enterRule(_localctx, 74, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(RETURN);
			setState(358);
			expression();
			setState(359);
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
		enterRule(_localctx, 76, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(ID);
			setState(362);
			ss();
			setState(363);
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
		enterRule(_localctx, 78, RULE_s);
		try {
			setState(371);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(DOT);
				setState(366);
				match(ID);
				setState(367);
				ss();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(DOT);
				setState(369);
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
		enterRule(_localctx, 80, RULE_ss);
		try {
			setState(378);
			switch (_input.LA(1)) {
			case OBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(OBRACKET);
				setState(374);
				exp();
				setState(375);
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
		enterRule(_localctx, 82, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			comparison();
			setState(381);
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
		enterRule(_localctx, 84, RULE_t);
		try {
			setState(387);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				u();
				setState(384);
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
		enterRule(_localctx, 86, RULE_u);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new UAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(AND);
				}
				break;
			case OR:
				_localctx = new UOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
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
		enterRule(_localctx, 88, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		enterRule(_localctx, 90, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			term();
			setState(396);
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
		enterRule(_localctx, 92, RULE_v);
		try {
			setState(403);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				w();
				setState(399);
				term();
				setState(400);
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
		enterRule(_localctx, 94, RULE_w);
		try {
			setState(407);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new WPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new WMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
		enterRule(_localctx, 96, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			m();
			setState(410);
			exp();
			setState(411);
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
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
	 
		public XContext() { }
		public void copyFrom(XContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XEmptyContext extends XContext {
		public XEmptyContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterXEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitXEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitXEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XArgsContext extends XContext {
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
		public XArgsContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterXArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitXArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitXArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_x);
		try {
			setState(419);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new XArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(COMMA);
				setState(414);
				m();
				setState(415);
				exp();
				setState(416);
				x();
				}
				break;
			case CPARENTHESIS:
				_localctx = new XEmptyContext(_localctx);
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
		enterRule(_localctx, 100, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			exp();
			setState(422);
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
		enterRule(_localctx, 102, RULE_y);
		try {
			setState(428);
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
				setState(424);
				z();
				setState(425);
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
		enterRule(_localctx, 104, RULE_z);
		try {
			setState(438);
			switch (_input.LA(1)) {
			case GREATER:
				_localctx = new ZGreaterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(GREATER);
				setState(431);
				zz();
				}
				break;
			case LESSER:
				_localctx = new ZLesserContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(LESSER);
				setState(433);
				zz();
				}
				break;
			case EQUAL:
				_localctx = new ZEqualEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(EQUAL);
				setState(435);
				match(EQUAL);
				}
				break;
			case DIFFERENT:
				_localctx = new ZDifferentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
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
		enterRule(_localctx, 106, RULE_zz);
		try {
			setState(442);
			switch (_input.LA(1)) {
			case EQUAL:
				_localctx = new ZzEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
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
		enterRule(_localctx, 108, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			factor();
			setState(445);
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
		enterRule(_localctx, 110, RULE_aa);
		try {
			setState(452);
			switch (_input.LA(1)) {
			case MULTIPLICATION:
			case DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				ab();
				setState(448);
				factor();
				setState(449);
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
		enterRule(_localctx, 112, RULE_ab);
		try {
			setState(456);
			switch (_input.LA(1)) {
			case MULTIPLICATION:
				_localctx = new AbMultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(MULTIPLICATION);
				}
				break;
			case DIVISION:
				_localctx = new AbDivisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
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
		enterRule(_localctx, 114, RULE_factor);
		try {
			setState(465);
			switch (_input.LA(1)) {
			case OPARENTHESIS:
				_localctx = new FactorExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(OPARENTHESIS);
				setState(459);
				expression();
				setState(460);
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
				setState(462);
				ac();
				setState(463);
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
		enterRule(_localctx, 116, RULE_ac);
		try {
			setState(470);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new AcPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new AcMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
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

	public static class AdContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(MadBasicParser.MINUS, 0); }
		public AdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).enterAd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MadBasicListener ) ((MadBasicListener)listener).exitAd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MadBasicVisitor ) return ((MadBasicVisitor<? extends T>)visitor).visitAd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdContext ad() throws RecognitionException {
		AdContext _localctx = new AdContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ad);
		try {
			setState(474);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(MINUS);
				}
				break;
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
		enterRule(_localctx, 120, RULE_value);
		try {
			setState(483);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ValueIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				identifier();
				}
				break;
			case 2:
				_localctx = new ValueIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(CTEI);
				}
				break;
			case 3:
				_localctx = new ValueFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(CTEF);
				}
				break;
			case 4:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(CTESTRING);
				}
				break;
			case 5:
				_localctx = new ValueBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				match(TRUE);
				}
				break;
			case 6:
				_localctx = new ValueBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				match(FALSE);
				}
				break;
			case 7:
				_localctx = new ValueCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(482);
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
		enterRule(_localctx, 122, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(MAIN);
			setState(486);
			match(COLON);
			setState(487);
			block();
			setState(488);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u01ed\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5"+
		"\4\u008d\n\4\3\5\3\5\5\5\u0091\n\5\3\6\3\6\5\6\u0095\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00a3\n\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\f\3\f\5\f\u00b7"+
		"\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00c4\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00d0\n\21\3\22"+
		"\3\22\3\22\3\22\5\22\u00d6\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e7\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f6\n\24\3\25\3\25"+
		"\5\25\u00fa\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u0103\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u010c\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0115\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u0133\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u0144\n \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u015a\n#\3$\3$\3$\3"+
		"$\3$\3%\3%\5%\u0163\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\5)\u0176\n)\3*\3*\3*\3*\3*\5*\u017d\n*\3+\3+\3+\3,\3,\3,\3,\5"+
		",\u0186\n,\3-\3-\5-\u018a\n-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u0196\n\60\3\61\3\61\5\61\u019a\n\61\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u01a6\n\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\5\65\u01af\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01b9\n"+
		"\66\3\67\3\67\5\67\u01bd\n\67\38\38\38\39\39\39\39\39\59\u01c7\n9\3:\3"+
		":\5:\u01cb\n:\3;\3;\3;\3;\3;\3;\3;\5;\u01d4\n;\3<\3<\3<\5<\u01d9\n<\3"+
		"=\3=\5=\u01dd\n=\3>\3>\3>\3>\3>\3>\3>\5>\u01e6\n>\3?\3?\3?\3?\3?\3?\2"+
		"\2@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\2\u01e3\2~\3\2\2\2\4\u0083\3\2\2\2\6"+
		"\u008c\3\2\2\2\b\u0090\3\2\2\2\n\u0094\3\2\2\2\f\u0096\3\2\2\2\16\u00a2"+
		"\3\2\2\2\20\u00a4\3\2\2\2\22\u00a8\3\2\2\2\24\u00b2\3\2\2\2\26\u00b6\3"+
		"\2\2\2\30\u00b8\3\2\2\2\32\u00bc\3\2\2\2\34\u00c3\3\2\2\2\36\u00c5\3\2"+
		"\2\2 \u00cf\3\2\2\2\"\u00d5\3\2\2\2$\u00e6\3\2\2\2&\u00f5\3\2\2\2(\u00f9"+
		"\3\2\2\2*\u00fb\3\2\2\2,\u0102\3\2\2\2.\u010b\3\2\2\2\60\u0114\3\2\2\2"+
		"\62\u0116\3\2\2\2\64\u011f\3\2\2\2\66\u0129\3\2\2\28\u012b\3\2\2\2:\u0132"+
		"\3\2\2\2<\u0134\3\2\2\2>\u0143\3\2\2\2@\u0145\3\2\2\2B\u014d\3\2\2\2D"+
		"\u0159\3\2\2\2F\u015b\3\2\2\2H\u0162\3\2\2\2J\u0164\3\2\2\2L\u0167\3\2"+
		"\2\2N\u016b\3\2\2\2P\u0175\3\2\2\2R\u017c\3\2\2\2T\u017e\3\2\2\2V\u0185"+
		"\3\2\2\2X\u0189\3\2\2\2Z\u018b\3\2\2\2\\\u018d\3\2\2\2^\u0195\3\2\2\2"+
		"`\u0199\3\2\2\2b\u019b\3\2\2\2d\u01a5\3\2\2\2f\u01a7\3\2\2\2h\u01ae\3"+
		"\2\2\2j\u01b8\3\2\2\2l\u01bc\3\2\2\2n\u01be\3\2\2\2p\u01c6\3\2\2\2r\u01ca"+
		"\3\2\2\2t\u01d3\3\2\2\2v\u01d8\3\2\2\2x\u01dc\3\2\2\2z\u01e5\3\2\2\2|"+
		"\u01e7\3\2\2\2~\177\7\3\2\2\177\u0080\7\60\2\2\u0080\u0081\7\4\2\2\u0081"+
		"\u0082\5\4\3\2\u0082\3\3\2\2\2\u0083\u0084\5\6\4\2\u0084\u0085\5\b\5\2"+
		"\u0085\u0086\5\n\6\2\u0086\u0087\5|?\2\u0087\5\3\2\2\2\u0088\u0089\5\f"+
		"\7\2\u0089\u008a\5\6\4\2\u008a\u008d\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008c\u008b\3\2\2\2\u008d\7\3\2\2\2\u008e\u0091\5\20\t"+
		"\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\t"+
		"\3\2\2\2\u0092\u0095\5\30\r\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\13\3\2\2\2\u0096\u0097\7\f\2\2\u0097\u0098"+
		"\7\61\2\2\u0098\u0099\5\16\b\2\u0099\u009a\7\22\2\2\u009a\u009b\5\b\5"+
		"\2\u009b\u009c\5\36\20\2\u009c\u009d\5\n\6\2\u009d\u009e\7\23\2\2\u009e"+
		"\r\3\2\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a3\7\61\2\2\u00a1\u00a3\3\2\2"+
		"\2\u00a2\u009f\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a5"+
		"\7\5\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\5\22\n\2\u00a7\21\3\2\2\2\u00a8"+
		"\u00a9\5$\23\2\u00a9\u00aa\7\60\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac"+
		"\7\4\2\2\u00ac\u00ad\5\26\f\2\u00ad\23\3\2\2\2\u00ae\u00af\7\6\2\2\u00af"+
		"\u00b0\7\60\2\2\u00b0\u00b3\5\24\13\2\u00b1\u00b3\3\2\2\2\u00b2\u00ae"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\25\3\2\2\2\u00b4\u00b7\5\22\n\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\27\3\2\2"+
		"\2\u00b8\u00b9\7\17\2\2\u00b9\u00ba\7\7\2\2\u00ba\u00bb\5\32\16\2\u00bb"+
		"\31\3\2\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be\5\34\17\2\u00be\33\3\2\2\2"+
		"\u00bf\u00c0\5(\25\2\u00c0\u00c1\5\34\17\2\u00c1\u00c4\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\35\3\2\2\2\u00c5"+
		"\u00c6\7\16\2\2\u00c6\u00c7\7\"\2\2\u00c7\u00c8\5 \21\2\u00c8\u00c9\7"+
		"#\2\2\u00c9\u00ca\7\22\2\2\u00ca\u00cb\5\"\22\2\u00cb\u00cc\7\23\2\2\u00cc"+
		"\37\3\2\2\2\u00cd\u00d0\5*\26\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2"+
		"\2\u00cf\u00ce\3\2\2\2\u00d0!\3\2\2\2\u00d1\u00d2\5\60\31\2\u00d2\u00d3"+
		"\5\"\22\2\u00d3\u00d6\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d1\3\2\2\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6#\3\2\2\2\u00d7\u00d8\7\b\2\2\u00d8\u00e7\5"+
		"&\24\2\u00d9\u00da\7\t\2\2\u00da\u00e7\5&\24\2\u00db\u00dc\7\n\2\2\u00dc"+
		"\u00e7\5&\24\2\u00dd\u00de\7\13\2\2\u00de\u00e7\5&\24\2\u00df\u00e0\7"+
		"%\2\2\u00e0\u00e1\7\30\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e3\7\27\2\2\u00e3"+
		"\u00e7\3\2\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e7\5&\24\2\u00e6\u00d7\3"+
		"\2\2\2\u00e6\u00d9\3\2\2\2\u00e6\u00db\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6"+
		"\u00df\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7%\3\2\2\2\u00e8\u00e9\7\24\2\2"+
		"\u00e9\u00ea\5x=\2\u00ea\u00eb\7\64\2\2\u00eb\u00ec\7\6\2\2\u00ec\u00ed"+
		"\5x=\2\u00ed\u00ee\7\64\2\2\u00ee\u00ef\7\25\2\2\u00ef\u00f0\5&\24\2\u00f0"+
		"\u00f6\3\2\2\2\u00f1\u00f2\7\24\2\2\u00f2\u00f3\7\25\2\2\u00f3\u00f6\5"+
		"&\24\2\u00f4\u00f6\3\2\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\'\3\2\2\2\u00f7\u00fa\5\62\32\2\u00f8\u00fa\5\64"+
		"\33\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa)\3\2\2\2\u00fb\u00fc"+
		"\5$\23\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\7\60\2\2\u00fe\u00ff\5.\30\2"+
		"\u00ff+\3\2\2\2\u0100\u0103\5\66\34\2\u0101\u0103\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0101\3\2\2\2\u0103-\3\2\2\2\u0104\u0105\7\6\2\2\u0105"+
		"\u0106\5$\23\2\u0106\u0107\5,\27\2\u0107\u0108\7\60\2\2\u0108\u0109\5"+
		".\30\2\u0109\u010c\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0104\3\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010c/\3\2\2\2\u010d\u0115\58\35\2\u010e\u0115\5<\37\2"+
		"\u010f\u0115\5@!\2\u0110\u0115\5B\"\2\u0111\u0112\5F$\2\u0112\u0113\7"+
		"\4\2\2\u0113\u0115\3\2\2\2\u0114\u010d\3\2\2\2\u0114\u010e\3\2\2\2\u0114"+
		"\u010f\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0115\61\3\2\2"+
		"\2\u0116\u0117\7\20\2\2\u0117\u0118\7\60\2\2\u0118\u0119\7\"\2\2\u0119"+
		"\u011a\5 \21\2\u011a\u011b\7#\2\2\u011b\u011c\7\22\2\2\u011c\u011d\5J"+
		"&\2\u011d\u011e\7\23\2\2\u011e\63\3\2\2\2\u011f\u0120\5$\23\2\u0120\u0121"+
		"\7\60\2\2\u0121\u0122\7\"\2\2\u0122\u0123\5 \21\2\u0123\u0124\7#\2\2\u0124"+
		"\u0125\7\22\2\2\u0125\u0126\5J&\2\u0126\u0127\5L\'\2\u0127\u0128\7\23"+
		"\2\2\u0128\65\3\2\2\2\u0129\u012a\7-\2\2\u012a\67\3\2\2\2\u012b\u012c"+
		"\5N(\2\u012c\u012d\7\26\2\2\u012d\u012e\5:\36\2\u012e\u012f\7\4\2\2\u012f"+
		"9\3\2\2\2\u0130\u0133\5T+\2\u0131\u0133\5Z.\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133;\3\2\2\2\u0134\u0135\7$\2\2\u0135\u0136\7\"\2\2\u0136"+
		"\u0137\5T+\2\u0137\u0138\7#\2\2\u0138\u0139\7\22\2\2\u0139\u013a\5\"\22"+
		"\2\u013a\u013b\7\23\2\2\u013b\u013c\5> \2\u013c=\3\2\2\2\u013d\u013e\7"+
		"&\2\2\u013e\u013f\7\22\2\2\u013f\u0140\5\"\22\2\u0140\u0141\7\23\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u0142\3\2"+
		"\2\2\u0144?\3\2\2\2\u0145\u0146\7\'\2\2\u0146\u0147\7\"\2\2\u0147\u0148"+
		"\5T+\2\u0148\u0149\7#\2\2\u0149\u014a\7\22\2\2\u014a\u014b\5\"\22\2\u014b"+
		"\u014c\7\23\2\2\u014cA\3\2\2\2\u014d\u014e\7/\2\2\u014e\u014f\7\"\2\2"+
		"\u014f\u0150\5\\/\2\u0150\u0151\5D#\2\u0151\u0152\7#\2\2\u0152\u0153\7"+
		"\4\2\2\u0153C\3\2\2\2\u0154\u0155\7.\2\2\u0155\u0156\5\\/\2\u0156\u0157"+
		"\5D#\2\u0157\u015a\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0154\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015aE\3\2\2\2\u015b\u015c\5N(\2\u015c\u015d\7\"\2\2\u015d"+
		"\u015e\5H%\2\u015e\u015f\7#\2\2\u015fG\3\2\2\2\u0160\u0163\5b\62\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163I\3\2\2\2"+
		"\u0164\u0165\5\b\5\2\u0165\u0166\5\"\22\2\u0166K\3\2\2\2\u0167\u0168\7"+
		"\21\2\2\u0168\u0169\5T+\2\u0169\u016a\7\4\2\2\u016aM\3\2\2\2\u016b\u016c"+
		"\7\60\2\2\u016c\u016d\5R*\2\u016d\u016e\5P)\2\u016eO\3\2\2\2\u016f\u0170"+
		"\7\36\2\2\u0170\u0171\7\60\2\2\u0171\u0176\5R*\2\u0172\u0173\7\36\2\2"+
		"\u0173\u0176\7\16\2\2\u0174\u0176\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0172"+
		"\3\2\2\2\u0175\u0174\3\2\2\2\u0176Q\3\2\2\2\u0177\u0178\7\24\2\2\u0178"+
		"\u0179\5\\/\2\u0179\u017a\7\25\2\2\u017a\u017d\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u0177\3\2\2\2\u017c\u017b\3\2\2\2\u017dS\3\2\2\2\u017e\u017f"+
		"\5f\64\2\u017f\u0180\5V,\2\u0180U\3\2\2\2\u0181\u0182\5X-\2\u0182\u0183"+
		"\5f\64\2\u0183\u0186\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0181\3\2\2\2\u0185"+
		"\u0184\3\2\2\2\u0186W\3\2\2\2\u0187\u018a\7\33\2\2\u0188\u018a\7\34\2"+
		"\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018aY\3\2\2\2\u018b\u018c"+
		"\7(\2\2\u018c[\3\2\2\2\u018d\u018e\5n8\2\u018e\u018f\5^\60\2\u018f]\3"+
		"\2\2\2\u0190\u0191\5`\61\2\u0191\u0192\5n8\2\u0192\u0193\5^\60\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0194\3\2"+
		"\2\2\u0196_\3\2\2\2\u0197\u019a\7\32\2\2\u0198\u019a\7\37\2\2\u0199\u0197"+
		"\3\2\2\2\u0199\u0198\3\2\2\2\u019aa\3\2\2\2\u019b\u019c\5,\27\2\u019c"+
		"\u019d\5\\/\2\u019d\u019e\5d\63\2\u019ec\3\2\2\2\u019f\u01a0\7\6\2\2\u01a0"+
		"\u01a1\5,\27\2\u01a1\u01a2\5\\/\2\u01a2\u01a3\5d\63\2\u01a3\u01a6\3\2"+
		"\2\2\u01a4\u01a6\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6"+
		"e\3\2\2\2\u01a7\u01a8\5\\/\2\u01a8\u01a9\5h\65\2\u01a9g\3\2\2\2\u01aa"+
		"\u01ab\5j\66\2\u01ab\u01ac\5\\/\2\u01ac\u01af\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01aa\3\2\2\2\u01ae\u01ad\3\2\2\2\u01afi\3\2\2\2\u01b0\u01b1"+
		"\7\27\2\2\u01b1\u01b9\5l\67\2\u01b2\u01b3\7\30\2\2\u01b3\u01b9\5l\67\2"+
		"\u01b4\u01b5\7\26\2\2\u01b5\u01b9\7\26\2\2\u01b6\u01b9\7\35\2\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b8\u01b4\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9k\3\2\2\2\u01ba\u01bd"+
		"\7\26\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2"+
		"\u01bdm\3\2\2\2\u01be\u01bf\5t;\2\u01bf\u01c0\5p9\2\u01c0o\3\2\2\2\u01c1"+
		"\u01c2\5r:\2\u01c2\u01c3\5t;\2\u01c3\u01c4\5p9\2\u01c4\u01c7\3\2\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7q\3\2\2\2"+
		"\u01c8\u01cb\7 \2\2\u01c9\u01cb\7!\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9"+
		"\3\2\2\2\u01cbs\3\2\2\2\u01cc\u01cd\7\"\2\2\u01cd\u01ce\5T+\2\u01ce\u01cf"+
		"\7#\2\2\u01cf\u01d4\3\2\2\2\u01d0\u01d1\5v<\2\u01d1\u01d2\5z>\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01cc\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d4u\3\2\2\2"+
		"\u01d5\u01d9\7\32\2\2\u01d6\u01d9\7\37\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d5"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9w\3\2\2\2\u01da"+
		"\u01dd\7\37\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3"+
		"\2\2\2\u01ddy\3\2\2\2\u01de\u01e6\5N(\2\u01df\u01e6\7\64\2\2\u01e0\u01e6"+
		"\7\63\2\2\u01e1\u01e6\7\62\2\2\u01e2\u01e6\7)\2\2\u01e3\u01e6\7*\2\2\u01e4"+
		"\u01e6\5F$\2\u01e5\u01de\3\2\2\2\u01e5\u01df\3\2\2\2\u01e5\u01e0\3\2\2"+
		"\2\u01e5\u01e1\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e6{\3\2\2\2\u01e7\u01e8\7+\2\2\u01e8\u01e9\7\7\2\2\u01e9\u01ea"+
		"\5J&\2\u01ea\u01eb\7,\2\2\u01eb}\3\2\2\2%\u008c\u0090\u0094\u00a2\u00b2"+
		"\u00b6\u00c3\u00cf\u00d5\u00e6\u00f5\u00f9\u0102\u010b\u0114\u0132\u0143"+
		"\u0159\u0162\u0175\u017c\u0185\u0189\u0195\u0199\u01a5\u01ae\u01b8\u01bc"+
		"\u01c6\u01ca\u01d3\u01d8\u01dc\u01e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}