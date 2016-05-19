// Generated from  by ANTLR 4.2.2

package camllight.parser;
import static camllight.parser.Tokens.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__60=1, T__59=2, T__58=3, T__57=4, T__56=5, T__55=6, T__54=7, T__53=8, 
		T__52=9, T__51=10, T__50=11, T__49=12, T__48=13, T__47=14, T__46=15, T__45=16, 
		T__44=17, T__43=18, T__42=19, T__41=20, T__40=21, T__39=22, T__38=23, 
		T__37=24, T__36=25, T__35=26, T__34=27, T__33=28, T__32=29, T__31=30, 
		T__30=31, T__29=32, T__28=33, T__27=34, T__26=35, T__25=36, T__24=37, 
		T__23=38, T__22=39, T__21=40, T__20=41, T__19=42, T__18=43, T__17=44, 
		T__16=45, T__15=46, T__14=47, T__13=48, T__12=49, T__11=50, T__10=51, 
		T__9=52, T__8=53, T__7=54, T__6=55, T__5=56, T__4=57, T__3=58, T__2=59, 
		T__1=60, T__0=61, CHARTOKEN=62, WS=63, INTTOKEN=64, NULLTOKEN=65, STRINGTOKEN=66, 
		EMPTYARRAYTOKEN=67, EMPTYLISTTOKEN=68, WILDCARDTOKEN=69, FLOATTOKEN=70, 
		BOOLTOKEN=71, IDTOKEN=72, CONSTRTOKEN=73;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'while'", "'{'", "'&&'", "'::'", "'='", "'for'", 
		"'do'", "'('", "'rec'", "','", "'<-'", "'done'", "'mod'", "'>='", "'<'", 
		"';;'", "']'", "'*.'", "'|]'", "'let'", "'match'", "'function'", "'downto'", 
		"'then'", "'+'", "'/'", "'as'", "'of'", "'.('", "'||'", "'/.'", "';'", 
		"'}'", "'if'", "'<='", "'[|'", "'&'", "'print'", "'''", "'*'", "'.'", 
		"'->'", "'to'", "'mutable'", "':'", "'['", "'|'", "'with'", "'>'", "'+.'", 
		"'or'", "'-.'", "'else'", "'begin'", "'in'", "'end'", "')'", "'and'", 
		"'not'", "'-'", "CHARTOKEN", "WS", "INTTOKEN", "NULLTOKEN", "STRINGTOKEN", 
		"EMPTYARRAYTOKEN", "EMPTYLISTTOKEN", "'_'", "FLOATTOKEN", "BOOLTOKEN", 
		"IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decl = 2, RULE_patt = 3, RULE_ident = 4, 
		RULE_declorexp = 5, RULE_pattlist = 6, RULE_emptylist = 7, RULE_pattmatchsingle = 8, 
		RULE_explist = 9, RULE_type = 10, RULE_headtaillistpatt = 11, RULE_recordsingle = 12, 
		RULE_declmono = 13, RULE_letExp = 14, RULE_patttuple = 15, RULE_declimpl = 16, 
		RULE_function = 17, RULE_recanddecl = 18, RULE_exp = 19, RULE_decllabelsandvariants = 20, 
		RULE_anddecl = 21, RULE_varianttype = 22, RULE_pattmatchcurried = 23, 
		RULE_prog = 24, RULE_exparray = 25, RULE_exptuple = 26, RULE_tupletypelist = 27, 
		RULE_recordappendix = 28, RULE_recdeclmono = 29, RULE_recdecl = 30;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decl", "patt", "ident", "declorexp", "pattlist", 
		"emptylist", "pattmatchsingle", "explist", "type", "headtaillistpatt", 
		"recordsingle", "declmono", "letExp", "patttuple", "declimpl", "function", 
		"recanddecl", "exp", "decllabelsandvariants", "anddecl", "varianttype", 
		"pattmatchcurried", "prog", "exparray", "exptuple", "tupletypelist", "recordappendix", 
		"recdeclmono", "recdecl"
	};

	@Override
	public String getGrammarFileName() { return ""; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private camllight.algebras.AllAlg builder;
	public void setBuilder(camllight.algebras.AllAlg builder) { this.builder = builder; }
	private static <X> java.util.List<X> lift(String name, java.util.List<?> ctxs, X ...heads) {
	  java.util.List<X> l = new java.util.ArrayList<X>();
	  for (X h: heads) { l.add(h); }
	  for (Object ctx: ctxs) {
	    try {
	      l.add((X)ctx.getClass().getField(name).get(ctx));
	    } catch (Throwable e) {
	      throw new RuntimeException(e);
	    }
	  }
	  return l;
	}

	public CLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PattmatchContext extends ParserRuleContext {
		public Object _pattmatch;
		public PattmatchContext pattmatch_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchContext pattmatch_1;
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public PattmatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatch; }
	}

	public final PattmatchContext pattmatch() throws RecognitionException {
		PattmatchContext _localctx = new PattmatchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pattmatch);
		try {
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); match(48);
				setState(63); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(67); match(48);
				setState(68); ((PattmatchContext)_localctx).pattmatch_1 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchMulti((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
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

	public static class ConstantContext extends ParserRuleContext {
		public Object _constant;
		public EmptylistContext emptylist_0;
		public Token INTTOKEN_0;
		public Token STRINGTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token FLOATTOKEN_0;
		public Token NULLTOKEN_0;
		public Token CHARTOKEN_0;
		public TerminalNode FLOATTOKEN() { return getToken(CLParser.FLOATTOKEN, 0); }
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public TerminalNode INTTOKEN() { return getToken(CLParser.INTTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
		public TerminalNode CHARTOKEN() { return getToken(CLParser.CHARTOKEN, 0); }
		public TerminalNode STRINGTOKEN() { return getToken(CLParser.STRINGTOKEN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(83); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(85); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
				((ConstantContext)_localctx)._constant =  builder.float_(floattoken((((ConstantContext)_localctx).FLOATTOKEN_0!=null?((ConstantContext)_localctx).FLOATTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(87); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(89); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
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

	public static class DeclContext extends ParserRuleContext {
		public Object _decl;
		public DeclmonoContext declmono_0;
		public RecdeclContext recdecl_0;
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public AnddeclContext anddecl(int i) {
			return getRuleContext(AnddeclContext.class,i);
		}
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public List<AnddeclContext> anddecl() {
			return getRuleContexts(AnddeclContext.class);
		}
		public RecdeclContext recdecl() {
			return getRuleContext(RecdeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); match(21);
				setState(97); match(10);
				setState(98); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); match(21);
				setState(102); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==59 );
				((DeclContext)_localctx)._decl =  builder.andDecl((((DeclContext)_localctx).declmono_0._declmono),lift("_anddecl", ((DeclContext)_localctx).anddecl_1_list));
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

	public static class PattContext extends ParserRuleContext {
		public Object _patt;
		public PattContext patt_0;
		public Token CONSTRTOKEN_0;
		public PattContext patt_1;
		public IdentContext ident_0;
		public Token WILDCARDTOKEN_0;
		public TypeContext type_1;
		public ConstantContext constant_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public EmptylistContext emptylist_0;
		public PattlistContext pattlist_0;
		public HeadtaillistpattContext headtaillistpatt_0;
		public IdentContext ident_1;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public PattlistContext pattlist() {
			return getRuleContext(PattlistContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public HeadtaillistpattContext headtaillistpatt() {
			return getRuleContext(HeadtaillistpattContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public TerminalNode WILDCARDTOKEN() { return getToken(CLParser.WILDCARDTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public PattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patt; }
	}

	public final PattContext patt() throws RecognitionException {
		return patt(0);
	}

	private PattContext patt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PattContext _localctx = new PattContext(_ctx, _parentState);
		PattContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(116); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(117); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(120); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 3:
				{
				setState(123); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 4:
				{
				setState(125); match(9);
				setState(126); ((PattContext)_localctx).patt_0 = patt(0);
				setState(127); match(58);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 5:
				{
				setState(130); match(9);
				setState(131); ((PattContext)_localctx).patt_0 = patt(0);
				setState(132); match(46);
				setState(133); ((PattContext)_localctx).type_1 = type(0);
				setState(134); match(58);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 6:
				{
				setState(137); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 7:
				{
				setState(140); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 8:
				{
				setState(142); match(9);
				setState(143); ((PattContext)_localctx).patt_0 = patt(0);
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 );
				setState(149); match(58);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 9:
				{
				setState(152); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 10:
				{
				setState(155); match(47);
				setState(156); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(157); match(18);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 11:
				{
				setState(160); match(47);
				setState(161); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(162); match(18);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(167);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(168); match(48);
						setState(169); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(172);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(173); match(28);
						setState(174); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public Object _ident;
		public Token IDTOKEN_0;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			((IdentContext)_localctx)._ident =  builder.id(idtoken((((IdentContext)_localctx).IDTOKEN_0!=null?((IdentContext)_localctx).IDTOKEN_0.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclorexpContext extends ParserRuleContext {
		public Object _declorexp;
		public ExpContext exp_0;
		public DeclContext decl_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclorexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declorexp; }
	}

	public final DeclorexpContext declorexp() throws RecognitionException {
		DeclorexpContext _localctx = new DeclorexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declorexp);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); ((DeclorexpContext)_localctx).decl_0 = decl();
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpDecl((((DeclorexpContext)_localctx).decl_0._decl));
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

	public static class PattlistContext extends ParserRuleContext {
		public Object _pattlist;
		public PattContext patt_0;
		public PattlistContext pattlist_1;
		public PattlistContext pattlist() {
			return getRuleContext(PattlistContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PattlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattlist; }
	}

	public final PattlistContext pattlist() throws RecognitionException {
		PattlistContext _localctx = new PattlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pattlist);
		try {
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(194); match(11);
				setState(195); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
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

	public static class EmptylistContext extends ParserRuleContext {
		public Object _emptylist;
		public Token EMPTYLISTTOKEN_0;
		public TerminalNode EMPTYLISTTOKEN() { return getToken(CLParser.EMPTYLISTTOKEN, 0); }
		public EmptylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptylist; }
	}

	public final EmptylistContext emptylist() throws RecognitionException {
		EmptylistContext _localctx = new EmptylistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
			((EmptylistContext)_localctx)._emptylist =  builder.emptyList(emptylisttoken((((EmptylistContext)_localctx).EMPTYLISTTOKEN_0!=null?((EmptylistContext)_localctx).EMPTYLISTTOKEN_0.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattmatchsingleContext extends ParserRuleContext {
		public Object _pattmatchsingle;
		public PattContext patt_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PattmatchsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchsingle; }
	}

	public final PattmatchsingleContext pattmatchsingle() throws RecognitionException {
		PattmatchsingleContext _localctx = new PattmatchsingleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(207); match(43);
			setState(208); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
			((PattmatchsingleContext)_localctx)._pattmatchsingle =  builder.pattMatchSingle((((PattmatchsingleContext)_localctx).patt_0._patt),(((PattmatchsingleContext)_localctx).exp_1._exp));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplistContext extends ParserRuleContext {
		public Object _explist;
		public ExpContext exp_0;
		public ExplistContext explist_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_explist);
		try {
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(212); match(11);
				setState(213); ((ExplistContext)_localctx).explist_1 = explist();
				((ExplistContext)_localctx)._explist =  builder.innerExpListMulti((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).explist_1._explist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); ((ExplistContext)_localctx).exp_0 = exp(0);
				((ExplistContext)_localctx)._explist =  builder.innerExpListDouble((((ExplistContext)_localctx).exp_0._exp));
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

	public static class TypeContext extends ParserRuleContext {
		public Object _type;
		public TypeContext type_0;
		public Token IDTOKEN_0;
		public TypeContext type_1;
		public TupletypelistContext tupletypelist;
		public List<TupletypelistContext> tupletypelist_1_list = new ArrayList<TupletypelistContext>();
		public TupletypelistContext tupletypelist(int i) {
			return getRuleContext(TupletypelistContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TupletypelistContext> tupletypelist() {
			return getRuleContexts(TupletypelistContext.class);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			switch (_input.LA(1)) {
			case 9:
				{
				setState(222); match(9);
				setState(223); ((TypeContext)_localctx).type_0 = type(0);
				setState(224); match(58);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case IDTOKEN:
				{
				setState(227); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 40:
				{
				setState(229); match(40);
				setState(230); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235); match(43);
						setState(236); ((TypeContext)_localctx).type_1 = type(3);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(239);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(241); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(240); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(243); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class HeadtaillistpattContext extends ParserRuleContext {
		public Object _headtaillistpatt;
		public PattContext patt_0;
		public HeadtaillistpattContext headtaillistpatt_1;
		public HeadtaillistpattContext headtaillistpatt() {
			return getRuleContext(HeadtaillistpattContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public HeadtaillistpattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headtaillistpatt; }
	}

	public final HeadtaillistpattContext headtaillistpatt() throws RecognitionException {
		HeadtaillistpattContext _localctx = new HeadtaillistpattContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_headtaillistpatt);
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(253); match(5);
				setState(254); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattSingle((((HeadtaillistpattContext)_localctx).patt_0._patt));
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

	public static class RecordsingleContext extends ParserRuleContext {
		public Object _recordsingle;
		public Token IDTOKEN_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public RecordsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordsingle; }
	}

	public final RecordsingleContext recordsingle() throws RecognitionException {
		RecordsingleContext _localctx = new RecordsingleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recordsingle);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case 45:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); match(45);
				setState(263); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(264); match(6);
				setState(265); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntryMutableSingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(269); match(6);
				setState(270); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntrySingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
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

	public static class DeclmonoContext extends ParserRuleContext {
		public Object _declmono;
		public PattContext patt_0;
		public ExpContext exp_1;
		public IdentContext ident_0;
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp_2;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public DeclmonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declmono; }
	}

	public final DeclmonoContext declmono() throws RecognitionException {
		DeclmonoContext _localctx = new DeclmonoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declmono);
		int _la;
		try {
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(276); match(6);
				setState(277); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(281); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 47) | (1L << CHARTOKEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INTTOKEN - 64)) | (1L << (NULLTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
				setState(286); match(6);
				setState(287); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
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

	public static class LetExpContext extends ParserRuleContext {
		public Object _letExp;
		public DeclContext decl_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public LetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExp; }
	}

	public final LetExpContext letExp() throws RecognitionException {
		LetExpContext _localctx = new LetExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); ((LetExpContext)_localctx).decl_0 = decl();
			setState(293); match(56);
			setState(294); ((LetExpContext)_localctx).exp_1 = exp(0);
			((LetExpContext)_localctx)._letExp =  builder.letInExp((((LetExpContext)_localctx).decl_0._decl),(((LetExpContext)_localctx).exp_1._exp));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatttupleContext extends ParserRuleContext {
		public Object _patttuple;
		public PattContext patt_0;
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PatttupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patttuple; }
	}

	public final PatttupleContext patttuple() throws RecognitionException {
		PatttupleContext _localctx = new PatttupleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(11);
			setState(298); ((PatttupleContext)_localctx).patt_0 = patt(0);
			((PatttupleContext)_localctx)._patttuple =  builder.pattTupleSingle((((PatttupleContext)_localctx).patt_0._patt));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclimplContext extends ParserRuleContext {
		public Object _declimpl;
		public DeclorexpContext declorexp_0;
		public DeclimplContext declimpl_1;
		public DeclorexpContext declorexp() {
			return getRuleContext(DeclorexpContext.class,0);
		}
		public DeclimplContext declimpl() {
			return getRuleContext(DeclimplContext.class,0);
		}
		public DeclimplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declimpl; }
	}

	public final DeclimplContext declimpl() throws RecognitionException {
		DeclimplContext _localctx = new DeclimplContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declimpl);
		try {
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(302); match(17);
				setState(303); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(307); match(17);
				((DeclimplContext)_localctx)._declimpl =  builder.declImplSingle((((DeclimplContext)_localctx).declorexp_0._declorexp));
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

	public static class FunctionContext extends ParserRuleContext {
		public Object _function;
		public FunctionContext function_0;
		public PattmatchContext pattmatch_0;
		public IdentContext ident_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchcurriedContext pattmatchcurried_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchcurriedContext pattmatchcurried() {
			return getRuleContext(PattmatchcurriedContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		return function(0);
	}

	private FunctionContext function(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionContext _localctx = new FunctionContext(_ctx, _parentState);
		FunctionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(313); match(23);
				setState(314); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(317); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 3:
				{
				setState(320); match(55);
				setState(321); ((FunctionContext)_localctx).function_0 = function(0);
				setState(322); match(57);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(325); match(9);
				setState(326); ((FunctionContext)_localctx).function_0 = function(0);
				setState(327); match(58);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(330); match(1);
				setState(331); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(334); match(1);
				setState(335); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(340);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(341); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RecanddeclContext extends ParserRuleContext {
		public Object _recanddecl;
		public RecdeclmonoContext recdeclmono_0;
		public RecdeclmonoContext recdeclmono() {
			return getRuleContext(RecdeclmonoContext.class,0);
		}
		public RecanddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recanddecl; }
	}

	public final RecanddeclContext recanddecl() throws RecognitionException {
		RecanddeclContext _localctx = new RecanddeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(59);
			setState(350); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
			((RecanddeclContext)_localctx)._recanddecl =  builder.recAndDeclSingle((((RecanddeclContext)_localctx).recdeclmono_0._recdeclmono));
			}
		}
		catch (RecognitionException re) {
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
		public Object _exp;
		public ExpContext exp_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public Token EMPTYARRAYTOKEN_0;
		public IdentContext ident_0;
		public ConstantContext constant_0;
		public TypeContext type_1;
		public ExptupleContext exptuple;
		public List<ExptupleContext> exptuple_1_list = new ArrayList<ExptupleContext>();
		public ExplistContext explist_0;
		public ExparrayContext exparray_0;
		public RecordsingleContext recordsingle_0;
		public RecordappendixContext recordappendix;
		public List<RecordappendixContext> recordappendix_1_list = new ArrayList<RecordappendixContext>();
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public FunctionContext function_0;
		public LetExpContext letExp_0;
		public Token op_1512;
		public Token op_1511;
		public Token op_1508;
		public Token IDTOKEN_1;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExptupleContext exptuple(int i) {
			return getRuleContext(ExptupleContext.class,i);
		}
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public RecordsingleContext recordsingle() {
			return getRuleContext(RecordsingleContext.class,0);
		}
		public List<RecordappendixContext> recordappendix() {
			return getRuleContexts(RecordappendixContext.class);
		}
		public List<ExptupleContext> exptuple() {
			return getRuleContexts(ExptupleContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public TerminalNode EMPTYARRAYTOKEN() { return getToken(CLParser.EMPTYARRAYTOKEN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public RecordappendixContext recordappendix(int i) {
			return getRuleContext(RecordappendixContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExparrayContext exparray() {
			return getRuleContext(ExparrayContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(354); match(39);
				setState(355); ((ExpContext)_localctx).exp_0 = exp(35);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(358); match(60);
				setState(359); ((ExpContext)_localctx).exp_0 = exp(22);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(362); match(53);
				setState(363); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(366); match(61);
				setState(367); ((ExpContext)_localctx).exp_0 = exp(20);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(370); match(35);
				setState(371); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(372); match(25);
				setState(373); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(374); match(54);
				setState(375); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 6:
				{
				setState(378); match(35);
				setState(379); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(380); match(25);
				setState(381); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 7:
				{
				setState(384); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 8:
				{
				setState(386); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 9:
				{
				setState(389); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 10:
				{
				setState(392); match(9);
				setState(393); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(394); match(58);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 11:
				{
				setState(397); match(55);
				setState(398); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(399); match(57);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(402); match(9);
				setState(403); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(404); match(46);
				setState(405); ((ExpContext)_localctx).type_1 = type(0);
				setState(406); match(58);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 13:
				{
				setState(409); match(9);
				setState(410); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(411); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(414); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 );
				setState(416); match(58);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 14:
				{
				setState(419); match(47);
				setState(420); ((ExpContext)_localctx).explist_0 = explist();
				setState(421); match(18);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 15:
				{
				setState(424); match(37);
				setState(425); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(427);
				_la = _input.LA(1);
				if (_la==33) {
					{
					setState(426); match(33);
					}
				}

				setState(429); match(20);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 16:
				{
				setState(432); match(37);
				setState(433); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(435);
				_la = _input.LA(1);
				if (_la==33) {
					{
					setState(434); match(33);
					}
				}

				setState(437); match(20);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 17:
				{
				setState(440); match(3);
				setState(441); ((ExpContext)_localctx).recordsingle_0 = recordsingle();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(442); ((ExpContext)_localctx).recordappendix = recordappendix();
					((ExpContext)_localctx).recordappendix_1_list.add(((ExpContext)_localctx).recordappendix);
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448); match(34);
				((ExpContext)_localctx)._exp =  builder.recordExp((((ExpContext)_localctx).recordsingle_0._recordsingle),lift("_recordappendix", ((ExpContext)_localctx).recordappendix_1_list));
				}
				break;

			case 18:
				{
				setState(451); match(2);
				setState(452); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(453); match(8);
				setState(454); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(455); match(13);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 19:
				{
				setState(458); match(7);
				setState(459); ((ExpContext)_localctx).ident_0 = ident();
				setState(460); match(6);
				setState(461); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(462); match(24);
				setState(463); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(464); match(8);
				setState(465); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(466); match(13);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 20:
				{
				setState(469); match(7);
				setState(470); ((ExpContext)_localctx).ident_0 = ident();
				setState(471); match(6);
				setState(472); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(473); match(44);
				setState(474); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(475); match(8);
				setState(476); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(477); match(13);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 21:
				{
				setState(480); match(22);
				setState(481); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(482); match(49);
				setState(483); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 22:
				{
				setState(486); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 23:
				{
				setState(489); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(559);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(494);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(495); match(5);
						setState(496); ((ExpContext)_localctx).exp_1 = exp(27);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(499);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(500); match(14);
						setState(501); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(504);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(505);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 19) | (1L << 27) | (1L << 32) | (1L << 41))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(506); ((ExpContext)_localctx).exp_1 = exp(19);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(509);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(510);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 26) | (1L << 51) | (1L << 53) | (1L << 61))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(511); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(514);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(515);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 15) | (1L << 16) | (1L << 36) | (1L << 50))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(516); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(519);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(520); match(42);
						setState(521); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						setState(522); match(12);
						setState(523); ((ExpContext)_localctx).exp_2 = exp(16);
						((ExpContext)_localctx)._exp =  builder.recordAssignExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(526);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(527); match(30);
						setState(528); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(529); match(58);
						setState(530); match(12);
						setState(531); ((ExpContext)_localctx).exp_2 = exp(13);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(534);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(535);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==38) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(536); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(539);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(540);
						_la = _input.LA(1);
						if ( !(_la==31 || _la==52) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(541); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(544);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(545); match(33);
						setState(546); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(549);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(550); match(42);
						setState(551); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((ExpContext)_localctx)._exp =  builder.recordSelectExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(553);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(554); match(30);
						setState(555); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(556); match(58);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DecllabelsandvariantsContext extends ParserRuleContext {
		public Object _decllabelsandvariants;
		public IdentContext ident_0;
		public Token IDTOKEN_1;
		public TypeContext type_2;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DecllabelsandvariantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decllabelsandvariants; }
	}

	public final DecllabelsandvariantsContext decllabelsandvariants() throws RecognitionException {
		DecllabelsandvariantsContext _localctx = new DecllabelsandvariantsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decllabelsandvariants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
			setState(565); match(6);
			setState(566); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
			setState(567); match(29);
			setState(568); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
			((DecllabelsandvariantsContext)_localctx)._decllabelsandvariants =  builder.declLabelsAndVariantsDecl((((DecllabelsandvariantsContext)_localctx).ident_0._ident),idtoken((((DecllabelsandvariantsContext)_localctx).IDTOKEN_1!=null?((DecllabelsandvariantsContext)_localctx).IDTOKEN_1.getText():null)),(((DecllabelsandvariantsContext)_localctx).type_2._type));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnddeclContext extends ParserRuleContext {
		public Object _anddecl;
		public DeclmonoContext declmono_0;
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public AnddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anddecl; }
	}

	public final AnddeclContext anddecl() throws RecognitionException {
		AnddeclContext _localctx = new AnddeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); match(59);
			setState(572); ((AnddeclContext)_localctx).declmono_0 = declmono();
			((AnddeclContext)_localctx)._anddecl =  builder.andDeclSingle((((AnddeclContext)_localctx).declmono_0._declmono));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarianttypeContext extends ParserRuleContext {
		public Object _varianttype;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarianttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varianttype; }
	}

	public final VarianttypeContext varianttype() throws RecognitionException {
		VarianttypeContext _localctx = new VarianttypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varianttype);
		try {
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(576); match(29);
				setState(577); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)));
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

	public static class PattmatchcurriedContext extends ParserRuleContext {
		public Object _pattmatchcurried;
		public PattContext patt;
		public List<PattContext> patt_0_list = new ArrayList<PattContext>();
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public PattmatchcurriedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchcurried; }
	}

	public final PattmatchcurriedContext pattmatchcurried() throws RecognitionException {
		PattmatchcurriedContext _localctx = new PattmatchcurriedContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(584); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(587); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 47) | (1L << CHARTOKEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INTTOKEN - 64)) | (1L << (NULLTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
			setState(589); match(43);
			setState(590); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
			((PattmatchcurriedContext)_localctx)._pattmatchcurried =  builder.pattMatchCurriedMulti(lift("_patt", ((PattmatchcurriedContext)_localctx).patt_0_list),(((PattmatchcurriedContext)_localctx).exp_1._exp));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public Object _prog;
		public DeclimplContext declimpl_0;
		public DeclimplContext declimpl() {
			return getRuleContext(DeclimplContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); ((ProgContext)_localctx).declimpl_0 = declimpl();
			((ProgContext)_localctx)._prog =  builder.start((((ProgContext)_localctx).declimpl_0._declimpl));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExparrayContext extends ParserRuleContext {
		public Object _exparray;
		public ExpContext exp_0;
		public ExparrayContext exparray_1;
		public ExpContext exp_1;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExparrayContext exparray() {
			return getRuleContext(ExparrayContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExparrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exparray; }
	}

	public final ExparrayContext exparray() throws RecognitionException {
		ExparrayContext _localctx = new ExparrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exparray);
		try {
			setState(606);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(597); match(33);
				setState(598); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(602); match(33);
				setState(603); ((ExparrayContext)_localctx).exp_1 = exp(0);
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayDouble((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exp_1._exp));
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

	public static class ExptupleContext extends ParserRuleContext {
		public Object _exptuple;
		public ExpContext exp_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExptupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exptuple; }
	}

	public final ExptupleContext exptuple() throws RecognitionException {
		ExptupleContext _localctx = new ExptupleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); match(11);
			setState(609); ((ExptupleContext)_localctx).exp_0 = exp(0);
			((ExptupleContext)_localctx)._exptuple =  builder.exprTupleSingle((((ExptupleContext)_localctx).exp_0._exp));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupletypelistContext extends ParserRuleContext {
		public Object _tupletypelist;
		public TypeContext type_0;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TupletypelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletypelist; }
	}

	public final TupletypelistContext tupletypelist() throws RecognitionException {
		TupletypelistContext _localctx = new TupletypelistContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); match(41);
			setState(613); ((TupletypelistContext)_localctx).type_0 = type(0);
			((TupletypelistContext)_localctx)._tupletypelist =  builder.tupleTypeSingle((((TupletypelistContext)_localctx).type_0._type));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordappendixContext extends ParserRuleContext {
		public Object _recordappendix;
		public RecordsingleContext recordsingle_0;
		public RecordsingleContext recordsingle() {
			return getRuleContext(RecordsingleContext.class,0);
		}
		public RecordappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordappendix; }
	}

	public final RecordappendixContext recordappendix() throws RecognitionException {
		RecordappendixContext _localctx = new RecordappendixContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_recordappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616); match(11);
			setState(617); ((RecordappendixContext)_localctx).recordsingle_0 = recordsingle();
			((RecordappendixContext)_localctx)._recordappendix =  builder.recordEntryAppendix((((RecordappendixContext)_localctx).recordsingle_0._recordsingle));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecdeclmonoContext extends ParserRuleContext {
		public Object _recdeclmono;
		public IdentContext ident_0;
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp_2;
		public TypeContext type_1;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public RecdeclmonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recdeclmono; }
	}

	public final RecdeclmonoContext recdeclmono() throws RecognitionException {
		RecdeclmonoContext _localctx = new RecdeclmonoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_recdeclmono);
		int _la;
		try {
			setState(644);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(622); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(621); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(624); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 47) | (1L << CHARTOKEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INTTOKEN - 64)) | (1L << (NULLTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
				setState(626); match(6);
				setState(627); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630); match(9);
				setState(631); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(632); match(46);
				setState(633); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(634); match(58);
				setState(635); match(6);
				setState(636); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(640); match(6);
				setState(641); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
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

	public static class RecdeclContext extends ParserRuleContext {
		public Object _recdecl;
		public RecdeclmonoContext recdeclmono_0;
		public RecanddeclContext recanddecl;
		public List<RecanddeclContext> recanddecl_1_list = new ArrayList<RecanddeclContext>();
		public RecdeclmonoContext recdeclmono() {
			return getRuleContext(RecdeclmonoContext.class,0);
		}
		public RecanddeclContext recanddecl(int i) {
			return getRuleContext(RecanddeclContext.class,i);
		}
		public List<RecanddeclContext> recanddecl() {
			return getRuleContexts(RecanddeclContext.class);
		}
		public RecdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recdecl; }
	}

	public final RecdeclContext recdecl() throws RecognitionException {
		RecdeclContext _localctx = new RecdeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_recdecl);
		int _la;
		try {
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(648); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(647); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(650); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==59 );
				((RecdeclContext)_localctx)._recdecl =  builder.recAndDecl((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono),lift("_recanddecl", ((RecdeclContext)_localctx).recanddecl_1_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return patt_sempred((PattContext)_localctx, predIndex);

		case 10: return type_sempred((TypeContext)_localctx, predIndex);

		case 17: return function_sempred((FunctionContext)_localctx, predIndex);

		case 19: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);

		case 1: return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);

		case 3: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 13);

		case 5: return precpred(_ctx, 27);

		case 6: return precpred(_ctx, 19);

		case 7: return precpred(_ctx, 18);

		case 8: return precpred(_ctx, 17);

		case 9: return precpred(_ctx, 16);

		case 10: return precpred(_ctx, 15);

		case 11: return precpred(_ctx, 12);

		case 12: return precpred(_ctx, 11);

		case 13: return precpred(_ctx, 10);

		case 14: return precpred(_ctx, 4);

		case 15: return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u0296\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2M\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4n\n\4\r\4\16\4o\3\4\3\4\5"+
		"\4t\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0094\n"+
		"\5\r\5\16\5\u0095\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u00a8\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"\u00b4\n\5\f\5\16\5\u00b7\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00c2\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cc\n\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00de"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00eb\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\6\f\u00f4\n\f\r\f\16\f\u00f5\3\f\3\f\7\f\u00fa"+
		"\n\f\f\f\16\f\u00fd\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0107\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0114\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u011d\n\17\r\17\16\17\u011e\3"+
		"\17\3\17\3\17\3\17\5\17\u0125\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0139\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0155"+
		"\n\23\3\23\3\23\3\23\3\23\7\23\u015b\n\23\f\23\16\23\u015e\13\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u019f\n\25\r\25\16\25\u01a0\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01ae\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u01b6\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u01be\n\25\f\25\16\25\u01c1\13\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01ef\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0232\n\25\f\25\16\25\u0235"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0249\n\30\3\31\6\31\u024c\n\31\r\31\16"+
		"\31\u024d\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0261\n\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\6\37\u0271\n\37\r\37\16\37\u0272"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0287\n\37\3 \3 \6 \u028b\n \r \16 \u028c\3"+
		" \3 \3 \3 \3 \5 \u0294\n \3 \2\6\b\26$(!\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>\2\7\6\2\25\25\35\35\"\"++\6\2\34\34"+
		"\65\65\67\67??\6\2\b\b\21\22&&\64\64\4\2\6\6((\4\2!!\66\66\u02d0\2L\3"+
		"\2\2\2\4]\3\2\2\2\6s\3\2\2\2\b\u00a7\3\2\2\2\n\u00b8\3\2\2\2\f\u00c1\3"+
		"\2\2\2\16\u00cb\3\2\2\2\20\u00cd\3\2\2\2\22\u00d0\3\2\2\2\24\u00dd\3\2"+
		"\2\2\26\u00ea\3\2\2\2\30\u0106\3\2\2\2\32\u0113\3\2\2\2\34\u0124\3\2\2"+
		"\2\36\u0126\3\2\2\2 \u012b\3\2\2\2\"\u0138\3\2\2\2$\u0154\3\2\2\2&\u015f"+
		"\3\2\2\2(\u01ee\3\2\2\2*\u0236\3\2\2\2,\u023d\3\2\2\2.\u0248\3\2\2\2\60"+
		"\u024b\3\2\2\2\62\u0253\3\2\2\2\64\u0260\3\2\2\2\66\u0262\3\2\2\28\u0266"+
		"\3\2\2\2:\u026a\3\2\2\2<\u0286\3\2\2\2>\u0293\3\2\2\2@A\7\62\2\2AB\5\2"+
		"\2\2BC\b\2\1\2CM\3\2\2\2DE\5\22\n\2EF\7\62\2\2FG\5\2\2\2GH\b\2\1\2HM\3"+
		"\2\2\2IJ\5\22\n\2JK\b\2\1\2KM\3\2\2\2L@\3\2\2\2LD\3\2\2\2LI\3\2\2\2M\3"+
		"\3\2\2\2NO\5\20\t\2OP\b\3\1\2P^\3\2\2\2QR\7B\2\2R^\b\3\1\2ST\7D\2\2T^"+
		"\b\3\1\2UV\7I\2\2V^\b\3\1\2WX\7H\2\2X^\b\3\1\2YZ\7C\2\2Z^\b\3\1\2[\\\7"+
		"@\2\2\\^\b\3\1\2]N\3\2\2\2]Q\3\2\2\2]S\3\2\2\2]U\3\2\2\2]W\3\2\2\2]Y\3"+
		"\2\2\2][\3\2\2\2^\5\3\2\2\2_`\5\34\17\2`a\b\4\1\2at\3\2\2\2bc\7\27\2\2"+
		"cd\7\f\2\2de\5> \2ef\b\4\1\2ft\3\2\2\2gh\7\27\2\2hi\5\6\4\2ij\b\4\1\2"+
		"jt\3\2\2\2km\5\34\17\2ln\5,\27\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2pq\3\2\2\2qr\b\4\1\2rt\3\2\2\2s_\3\2\2\2sb\3\2\2\2sg\3\2\2\2sk\3\2\2"+
		"\2t\7\3\2\2\2uv\b\5\1\2vw\7K\2\2wx\5\b\5\bxy\b\5\1\2y\u00a8\3\2\2\2z{"+
		"\5\n\6\2{|\b\5\1\2|\u00a8\3\2\2\2}~\7G\2\2~\u00a8\b\5\1\2\177\u0080\7"+
		"\13\2\2\u0080\u0081\5\b\5\2\u0081\u0082\7<\2\2\u0082\u0083\b\5\1\2\u0083"+
		"\u00a8\3\2\2\2\u0084\u0085\7\13\2\2\u0085\u0086\5\b\5\2\u0086\u0087\7"+
		"\60\2\2\u0087\u0088\5\26\f\2\u0088\u0089\7<\2\2\u0089\u008a\b\5\1\2\u008a"+
		"\u00a8\3\2\2\2\u008b\u008c\5\4\3\2\u008c\u008d\b\5\1\2\u008d\u00a8\3\2"+
		"\2\2\u008e\u008f\7K\2\2\u008f\u00a8\b\5\1\2\u0090\u0091\7\13\2\2\u0091"+
		"\u0093\5\b\5\2\u0092\u0094\5 \21\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7<\2\2\u0098\u0099\b\5\1\2\u0099\u00a8\3\2\2\2\u009a\u009b\5\20"+
		"\t\2\u009b\u009c\b\5\1\2\u009c\u00a8\3\2\2\2\u009d\u009e\7\61\2\2\u009e"+
		"\u009f\5\16\b\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\b\5\1\2\u00a1\u00a8\3"+
		"\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7\24\2\2"+
		"\u00a5\u00a6\b\5\1\2\u00a6\u00a8\3\2\2\2\u00a7u\3\2\2\2\u00a7z\3\2\2\2"+
		"\u00a7}\3\2\2\2\u00a7\177\3\2\2\2\u00a7\u0084\3\2\2\2\u00a7\u008b\3\2"+
		"\2\2\u00a7\u008e\3\2\2\2\u00a7\u0090\3\2\2\2\u00a7\u009a\3\2\2\2\u00a7"+
		"\u009d\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\u00b5\3\2\2\2\u00a9\u00aa\f\n"+
		"\2\2\u00aa\u00ab\7\62\2\2\u00ab\u00ac\5\b\5\13\u00ac\u00ad\b\5\1\2\u00ad"+
		"\u00b4\3\2\2\2\u00ae\u00af\f\r\2\2\u00af\u00b0\7\36\2\2\u00b0\u00b1\5"+
		"\n\6\2\u00b1\u00b2\b\5\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3"+
		"\u00ae\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\t\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7J\2\2\u00b9\u00ba"+
		"\b\6\1\2\u00ba\13\3\2\2\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\b\7\1\2\u00bd"+
		"\u00c2\3\2\2\2\u00be\u00bf\5\6\4\2\u00bf\u00c0\b\7\1\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\r\3\2\2\2\u00c3\u00c4"+
		"\5\b\5\2\u00c4\u00c5\7\r\2\2\u00c5\u00c6\5\16\b\2\u00c6\u00c7\b\b\1\2"+
		"\u00c7\u00cc\3\2\2\2\u00c8\u00c9\5\b\5\2\u00c9\u00ca\b\b\1\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\17\3\2\2\2\u00cd"+
		"\u00ce\7F\2\2\u00ce\u00cf\b\t\1\2\u00cf\21\3\2\2\2\u00d0\u00d1\5\b\5\2"+
		"\u00d1\u00d2\7-\2\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\b\n\1\2\u00d4\23\3"+
		"\2\2\2\u00d5\u00d6\5(\25\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\5\24\13\2\u00d8"+
		"\u00d9\b\13\1\2\u00d9\u00de\3\2\2\2\u00da\u00db\5(\25\2\u00db\u00dc\b"+
		"\13\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00da\3\2\2\2\u00de"+
		"\25\3\2\2\2\u00df\u00e0\b\f\1\2\u00e0\u00e1\7\13\2\2\u00e1\u00e2\5\26"+
		"\f\2\u00e2\u00e3\7<\2\2\u00e3\u00e4\b\f\1\2\u00e4\u00eb\3\2\2\2\u00e5"+
		"\u00e6\7J\2\2\u00e6\u00eb\b\f\1\2\u00e7\u00e8\7*\2\2\u00e8\u00e9\7J\2"+
		"\2\u00e9\u00eb\b\f\1\2\u00ea\u00df\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e7"+
		"\3\2\2\2\u00eb\u00fb\3\2\2\2\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7-\2\2\u00ee"+
		"\u00ef\5\26\f\5\u00ef\u00f0\b\f\1\2\u00f0\u00fa\3\2\2\2\u00f1\u00f3\f"+
		"\7\2\2\u00f2\u00f4\58\35\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b\f"+
		"\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00ec\3\2\2\2\u00f9\u00f1\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\27\3\2\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\5\b\5\2\u00ff\u0100\7\7\2\2\u0100\u0101"+
		"\5\30\r\2\u0101\u0102\b\r\1\2\u0102\u0107\3\2\2\2\u0103\u0104\5\b\5\2"+
		"\u0104\u0105\b\r\1\2\u0105\u0107\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0103"+
		"\3\2\2\2\u0107\31\3\2\2\2\u0108\u0109\7/\2\2\u0109\u010a\7J\2\2\u010a"+
		"\u010b\7\b\2\2\u010b\u010c\5(\25\2\u010c\u010d\b\16\1\2\u010d\u0114\3"+
		"\2\2\2\u010e\u010f\7J\2\2\u010f\u0110\7\b\2\2\u0110\u0111\5(\25\2\u0111"+
		"\u0112\b\16\1\2\u0112\u0114\3\2\2\2\u0113\u0108\3\2\2\2\u0113\u010e\3"+
		"\2\2\2\u0114\33\3\2\2\2\u0115\u0116\5\b\5\2\u0116\u0117\7\b\2\2\u0117"+
		"\u0118\5(\25\2\u0118\u0119\b\17\1\2\u0119\u0125\3\2\2\2\u011a\u011c\5"+
		"\n\6\2\u011b\u011d\5\b\5\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\b"+
		"\2\2\u0121\u0122\5(\25\2\u0122\u0123\b\17\1\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0115\3\2\2\2\u0124\u011a\3\2\2\2\u0125\35\3\2\2\2\u0126\u0127\5\6\4"+
		"\2\u0127\u0128\7:\2\2\u0128\u0129\5(\25\2\u0129\u012a\b\20\1\2\u012a\37"+
		"\3\2\2\2\u012b\u012c\7\r\2\2\u012c\u012d\5\b\5\2\u012d\u012e\b\21\1\2"+
		"\u012e!\3\2\2\2\u012f\u0130\5\f\7\2\u0130\u0131\7\23\2\2\u0131\u0132\5"+
		"\"\22\2\u0132\u0133\b\22\1\2\u0133\u0139\3\2\2\2\u0134\u0135\5\f\7\2\u0135"+
		"\u0136\7\23\2\2\u0136\u0137\b\22\1\2\u0137\u0139\3\2\2\2\u0138\u012f\3"+
		"\2\2\2\u0138\u0134\3\2\2\2\u0139#\3\2\2\2\u013a\u013b\b\23\1\2\u013b\u013c"+
		"\7\31\2\2\u013c\u013d\5\2\2\2\u013d\u013e\b\23\1\2\u013e\u0155\3\2\2\2"+
		"\u013f\u0140\5\n\6\2\u0140\u0141\b\23\1\2\u0141\u0155\3\2\2\2\u0142\u0143"+
		"\79\2\2\u0143\u0144\5$\23\2\u0144\u0145\7;\2\2\u0145\u0146\b\23\1\2\u0146"+
		"\u0155\3\2\2\2\u0147\u0148\7\13\2\2\u0148\u0149\5$\23\2\u0149\u014a\7"+
		"<\2\2\u014a\u014b\b\23\1\2\u014b\u0155\3\2\2\2\u014c\u014d\7\3\2\2\u014d"+
		"\u014e\5\22\n\2\u014e\u014f\b\23\1\2\u014f\u0155\3\2\2\2\u0150\u0151\7"+
		"\3\2\2\u0151\u0152\5\60\31\2\u0152\u0153\b\23\1\2\u0153\u0155\3\2\2\2"+
		"\u0154\u013a\3\2\2\2\u0154\u013f\3\2\2\2\u0154\u0142\3\2\2\2\u0154\u0147"+
		"\3\2\2\2\u0154\u014c\3\2\2\2\u0154\u0150\3\2\2\2\u0155\u015c\3\2\2\2\u0156"+
		"\u0157\f\b\2\2\u0157\u0158\5(\25\2\u0158\u0159\b\23\1\2\u0159\u015b\3"+
		"\2\2\2\u015a\u0156\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d%\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7=\2\2\u0160"+
		"\u0161\5<\37\2\u0161\u0162\b\24\1\2\u0162\'\3\2\2\2\u0163\u0164\b\25\1"+
		"\2\u0164\u0165\7)\2\2\u0165\u0166\5(\25%\u0166\u0167\b\25\1\2\u0167\u01ef"+
		"\3\2\2\2\u0168\u0169\7>\2\2\u0169\u016a\5(\25\30\u016a\u016b\b\25\1\2"+
		"\u016b\u01ef\3\2\2\2\u016c\u016d\7\67\2\2\u016d\u016e\5(\25\27\u016e\u016f"+
		"\b\25\1\2\u016f\u01ef\3\2\2\2\u0170\u0171\7?\2\2\u0171\u0172\5(\25\26"+
		"\u0172\u0173\b\25\1\2\u0173\u01ef\3\2\2\2\u0174\u0175\7%\2\2\u0175\u0176"+
		"\5(\25\2\u0176\u0177\7\33\2\2\u0177\u0178\5(\25\2\u0178\u0179\78\2\2\u0179"+
		"\u017a\5(\25\13\u017a\u017b\b\25\1\2\u017b\u01ef\3\2\2\2\u017c\u017d\7"+
		"%\2\2\u017d\u017e\5(\25\2\u017e\u017f\7\33\2\2\u017f\u0180\5(\25\n\u0180"+
		"\u0181\b\25\1\2\u0181\u01ef\3\2\2\2\u0182\u0183\7E\2\2\u0183\u01ef\b\25"+
		"\1\2\u0184\u0185\5\n\6\2\u0185\u0186\b\25\1\2\u0186\u01ef\3\2\2\2\u0187"+
		"\u0188\5\4\3\2\u0188\u0189\b\25\1\2\u0189\u01ef\3\2\2\2\u018a\u018b\7"+
		"\13\2\2\u018b\u018c\5(\25\2\u018c\u018d\7<\2\2\u018d\u018e\b\25\1\2\u018e"+
		"\u01ef\3\2\2\2\u018f\u0190\79\2\2\u0190\u0191\5(\25\2\u0191\u0192\7;\2"+
		"\2\u0192\u0193\b\25\1\2\u0193\u01ef\3\2\2\2\u0194\u0195\7\13\2\2\u0195"+
		"\u0196\5(\25\2\u0196\u0197\7\60\2\2\u0197\u0198\5\26\f\2\u0198\u0199\7"+
		"<\2\2\u0199\u019a\b\25\1\2\u019a\u01ef\3\2\2\2\u019b\u019c\7\13\2\2\u019c"+
		"\u019e\5(\25\2\u019d\u019f\5\66\34\2\u019e\u019d\3\2\2\2\u019f\u01a0\3"+
		"\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\7<\2\2\u01a3\u01a4\b\25\1\2\u01a4\u01ef\3\2\2\2\u01a5\u01a6\7\61"+
		"\2\2\u01a6\u01a7\5\24\13\2\u01a7\u01a8\7\24\2\2\u01a8\u01a9\b\25\1\2\u01a9"+
		"\u01ef\3\2\2\2\u01aa\u01ab\7\'\2\2\u01ab\u01ad\5\64\33\2\u01ac\u01ae\7"+
		"#\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\7\26\2\2\u01b0\u01b1\b\25\1\2\u01b1\u01ef\3\2\2\2\u01b2\u01b3\7"+
		"\'\2\2\u01b3\u01b5\5(\25\2\u01b4\u01b6\7#\2\2\u01b5\u01b4\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\7\26\2\2\u01b8\u01b9\b"+
		"\25\1\2\u01b9\u01ef\3\2\2\2\u01ba\u01bb\7\5\2\2\u01bb\u01bf\5\32\16\2"+
		"\u01bc\u01be\5:\36\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01c3\7$\2\2\u01c3\u01c4\b\25\1\2\u01c4\u01ef\3\2\2\2\u01c5\u01c6\7\4"+
		"\2\2\u01c6\u01c7\5(\25\2\u01c7\u01c8\7\n\2\2\u01c8\u01c9\5(\25\2\u01c9"+
		"\u01ca\7\17\2\2\u01ca\u01cb\b\25\1\2\u01cb\u01ef\3\2\2\2\u01cc\u01cd\7"+
		"\t\2\2\u01cd\u01ce\5\n\6\2\u01ce\u01cf\7\b\2\2\u01cf\u01d0\5(\25\2\u01d0"+
		"\u01d1\7\32\2\2\u01d1\u01d2\5(\25\2\u01d2\u01d3\7\n\2\2\u01d3\u01d4\5"+
		"(\25\2\u01d4\u01d5\7\17\2\2\u01d5\u01d6\b\25\1\2\u01d6\u01ef\3\2\2\2\u01d7"+
		"\u01d8\7\t\2\2\u01d8\u01d9\5\n\6\2\u01d9\u01da\7\b\2\2\u01da\u01db\5("+
		"\25\2\u01db\u01dc\7.\2\2\u01dc\u01dd\5(\25\2\u01dd\u01de\7\n\2\2\u01de"+
		"\u01df\5(\25\2\u01df\u01e0\7\17\2\2\u01e0\u01e1\b\25\1\2\u01e1\u01ef\3"+
		"\2\2\2\u01e2\u01e3\7\30\2\2\u01e3\u01e4\5(\25\2\u01e4\u01e5\7\63\2\2\u01e5"+
		"\u01e6\5\2\2\2\u01e6\u01e7\b\25\1\2\u01e7\u01ef\3\2\2\2\u01e8\u01e9\5"+
		"$\23\2\u01e9\u01ea\b\25\1\2\u01ea\u01ef\3\2\2\2\u01eb\u01ec\5\36\20\2"+
		"\u01ec\u01ed\b\25\1\2\u01ed\u01ef\3\2\2\2\u01ee\u0163\3\2\2\2\u01ee\u0168"+
		"\3\2\2\2\u01ee\u016c\3\2\2\2\u01ee\u0170\3\2\2\2\u01ee\u0174\3\2\2\2\u01ee"+
		"\u017c\3\2\2\2\u01ee\u0182\3\2\2\2\u01ee\u0184\3\2\2\2\u01ee\u0187\3\2"+
		"\2\2\u01ee\u018a\3\2\2\2\u01ee\u018f\3\2\2\2\u01ee\u0194\3\2\2\2\u01ee"+
		"\u019b\3\2\2\2\u01ee\u01a5\3\2\2\2\u01ee\u01aa\3\2\2\2\u01ee\u01b2\3\2"+
		"\2\2\u01ee\u01ba\3\2\2\2\u01ee\u01c5\3\2\2\2\u01ee\u01cc\3\2\2\2\u01ee"+
		"\u01d7\3\2\2\2\u01ee\u01e2\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01eb\3\2"+
		"\2\2\u01ef\u0233\3\2\2\2\u01f0\u01f1\f\35\2\2\u01f1\u01f2\7\7\2\2\u01f2"+
		"\u01f3\5(\25\35\u01f3\u01f4\b\25\1\2\u01f4\u0232\3\2\2\2\u01f5\u01f6\f"+
		"\25\2\2\u01f6\u01f7\7\20\2\2\u01f7\u01f8\5(\25\26\u01f8\u01f9\b\25\1\2"+
		"\u01f9\u0232\3\2\2\2\u01fa\u01fb\f\24\2\2\u01fb\u01fc\t\2\2\2\u01fc\u01fd"+
		"\5(\25\25\u01fd\u01fe\b\25\1\2\u01fe\u0232\3\2\2\2\u01ff\u0200\f\23\2"+
		"\2\u0200\u0201\t\3\2\2\u0201\u0202\5(\25\24\u0202\u0203\b\25\1\2\u0203"+
		"\u0232\3\2\2\2\u0204\u0205\f\22\2\2\u0205\u0206\t\4\2\2\u0206\u0207\5"+
		"(\25\23\u0207\u0208\b\25\1\2\u0208\u0232\3\2\2\2\u0209\u020a\f\21\2\2"+
		"\u020a\u020b\7,\2\2\u020b\u020c\7J\2\2\u020c\u020d\7\16\2\2\u020d\u020e"+
		"\5(\25\22\u020e\u020f\b\25\1\2\u020f\u0232\3\2\2\2\u0210\u0211\f\16\2"+
		"\2\u0211\u0212\7 \2\2\u0212\u0213\5(\25\2\u0213\u0214\7<\2\2\u0214\u0215"+
		"\7\16\2\2\u0215\u0216\5(\25\17\u0216\u0217\b\25\1\2\u0217\u0232\3\2\2"+
		"\2\u0218\u0219\f\r\2\2\u0219\u021a\t\5\2\2\u021a\u021b\5(\25\16\u021b"+
		"\u021c\b\25\1\2\u021c\u0232\3\2\2\2\u021d\u021e\f\f\2\2\u021e\u021f\t"+
		"\6\2\2\u021f\u0220\5(\25\r\u0220\u0221\b\25\1\2\u0221\u0232\3\2\2\2\u0222"+
		"\u0223\f\6\2\2\u0223\u0224\7#\2\2\u0224\u0225\5(\25\6\u0225\u0226\b\25"+
		"\1\2\u0226\u0232\3\2\2\2\u0227\u0228\f\20\2\2\u0228\u0229\7,\2\2\u0229"+
		"\u022a\7J\2\2\u022a\u0232\b\25\1\2\u022b\u022c\f\17\2\2\u022c\u022d\7"+
		" \2\2\u022d\u022e\5(\25\2\u022e\u022f\7<\2\2\u022f\u0230\b\25\1\2\u0230"+
		"\u0232\3\2\2\2\u0231\u01f0\3\2\2\2\u0231\u01f5\3\2\2\2\u0231\u01fa\3\2"+
		"\2\2\u0231\u01ff\3\2\2\2\u0231\u0204\3\2\2\2\u0231\u0209\3\2\2\2\u0231"+
		"\u0210\3\2\2\2\u0231\u0218\3\2\2\2\u0231\u021d\3\2\2\2\u0231\u0222\3\2"+
		"\2\2\u0231\u0227\3\2\2\2\u0231\u022b\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234)\3\2\2\2\u0235\u0233\3\2\2\2"+
		"\u0236\u0237\5\n\6\2\u0237\u0238\7\b\2\2\u0238\u0239\7J\2\2\u0239\u023a"+
		"\7\37\2\2\u023a\u023b\5\26\f\2\u023b\u023c\b\26\1\2\u023c+\3\2\2\2\u023d"+
		"\u023e\7=\2\2\u023e\u023f\5\34\17\2\u023f\u0240\b\27\1\2\u0240-\3\2\2"+
		"\2\u0241\u0242\7K\2\2\u0242\u0243\7\37\2\2\u0243\u0244\5\26\f\2\u0244"+
		"\u0245\b\30\1\2\u0245\u0249\3\2\2\2\u0246\u0247\7K\2\2\u0247\u0249\b\30"+
		"\1\2\u0248\u0241\3\2\2\2\u0248\u0246\3\2\2\2\u0249/\3\2\2\2\u024a\u024c"+
		"\5\b\5\2\u024b\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\7-\2\2\u0250\u0251\5(\25"+
		"\2\u0251\u0252\b\31\1\2\u0252\61\3\2\2\2\u0253\u0254\5\"\22\2\u0254\u0255"+
		"\b\32\1\2\u0255\63\3\2\2\2\u0256\u0257\5(\25\2\u0257\u0258\7#\2\2\u0258"+
		"\u0259\5\64\33\2\u0259\u025a\b\33\1\2\u025a\u0261\3\2\2\2\u025b\u025c"+
		"\5(\25\2\u025c\u025d\7#\2\2\u025d\u025e\5(\25\2\u025e\u025f\b\33\1\2\u025f"+
		"\u0261\3\2\2\2\u0260\u0256\3\2\2\2\u0260\u025b\3\2\2\2\u0261\65\3\2\2"+
		"\2\u0262\u0263\7\r\2\2\u0263\u0264\5(\25\2\u0264\u0265\b\34\1\2\u0265"+
		"\67\3\2\2\2\u0266\u0267\7+\2\2\u0267\u0268\5\26\f\2\u0268\u0269\b\35\1"+
		"\2\u02699\3\2\2\2\u026a\u026b\7\r\2\2\u026b\u026c\5\32\16\2\u026c\u026d"+
		"\b\36\1\2\u026d;\3\2\2\2\u026e\u0270\5\n\6\2\u026f\u0271\5\b\5\2\u0270"+
		"\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273\u0274\3\2\2\2\u0274\u0275\7\b\2\2\u0275\u0276\5(\25\2\u0276"+
		"\u0277\b\37\1\2\u0277\u0287\3\2\2\2\u0278\u0279\7\13\2\2\u0279\u027a\5"+
		"\n\6\2\u027a\u027b\7\60\2\2\u027b\u027c\5\26\f\2\u027c\u027d\7<\2\2\u027d"+
		"\u027e\7\b\2\2\u027e\u027f\5(\25\2\u027f\u0280\b\37\1\2\u0280\u0287\3"+
		"\2\2\2\u0281\u0282\5\n\6\2\u0282\u0283\7\b\2\2\u0283\u0284\5(\25\2\u0284"+
		"\u0285\b\37\1\2\u0285\u0287\3\2\2\2\u0286\u026e\3\2\2\2\u0286\u0278\3"+
		"\2\2\2\u0286\u0281\3\2\2\2\u0287=\3\2\2\2\u0288\u028a\5<\37\2\u0289\u028b"+
		"\5&\24\2\u028a\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\b \1\2\u028f\u0294\3\2"+
		"\2\2\u0290\u0291\5<\37\2\u0291\u0292\b \1\2\u0292\u0294\3\2\2\2\u0293"+
		"\u0288\3\2\2\2\u0293\u0290\3\2\2\2\u0294?\3\2\2\2&L]os\u0095\u00a7\u00b3"+
		"\u00b5\u00c1\u00cb\u00dd\u00ea\u00f5\u00f9\u00fb\u0106\u0113\u011e\u0124"+
		"\u0138\u0154\u015c\u01a0\u01ad\u01b5\u01bf\u01ee\u0231\u0233\u0248\u024d"+
		"\u0260\u0272\u0286\u028c\u0293";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}