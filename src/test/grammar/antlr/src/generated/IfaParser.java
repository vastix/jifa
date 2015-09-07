// Generated from /home/bpdp/kerjaan/git-repos/vastix/jifa/src/main/antlr/Ifa.g4 by ANTLR 4.5.1

package name.bpdp.vastix.jifa.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IfaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, Q_RESERVED=27, MARK=28, DIGIT=29, ALPHA=30, HEX_LETTER=31, 
		WS=32;
	public static final int
		RULE_stat = 0, RULE_force = 1, RULE_representatives = 2, RULE_directives = 3, 
		RULE_commissives = 4, RULE_expressives = 5, RULE_declaratives = 6, RULE_propositional = 7, 
		RULE_url = 8, RULE_scheme = 9, RULE_hier_part = 10, RULE_net_path = 11, 
		RULE_abs_path = 12, RULE_segment = 13, RULE_pchar = 14, RULE_server = 15, 
		RULE_port = 16, RULE_host = 17, RULE_hostname = 18, RULE_domainlabel = 19, 
		RULE_toplabel = 20, RULE_ipV4Address = 21, RULE_fragment_ = 22, RULE_query = 23, 
		RULE_param = 24, RULE_pname = 25, RULE_pvalue = 26, RULE_qc = 27, RULE_uric = 28, 
		RULE_unreserved = 29, RULE_escaped = 30, RULE_hex = 31, RULE_alphanum = 32, 
		RULE_reserved = 33;
	public static final String[] ruleNames = {
		"stat", "force", "representatives", "directives", "commissives", "expressives", 
		"declaratives", "propositional", "url", "scheme", "hier_part", "net_path", 
		"abs_path", "segment", "pchar", "server", "port", "host", "hostname", 
		"domainlabel", "toplabel", "ipV4Address", "fragment_", "query", "param", 
		"pname", "pvalue", "qc", "uric", "unreserved", "escaped", "hex", "alphanum", 
		"reserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'ASSERT'", "'INFORM'", "'REQUEST'", "'CONSENT'", 
		"'APOLOGIZE'", "'THANK'", "'COMPLAIN'", "'DECLARE'", "':'", "'http'", 
		"'https'", "'?'", "'#'", "'//'", "'/'", "'@'", "'&'", "'='", "'+'", "'$'", 
		"','", "'.'", "'-'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Q_RESERVED", "MARK", "DIGIT", "ALPHA", "HEX_LETTER", 
		"WS"
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
	public String getGrammarFileName() { return "Ifa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IfaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IfaParser.EOF, 0); }
		public List<ForceContext> force() {
			return getRuleContexts(ForceContext.class);
		}
		public ForceContext force(int i) {
			return getRuleContext(ForceContext.class,i);
		}
		public List<PropositionalContext> propositional() {
			return getRuleContexts(PropositionalContext.class);
		}
		public PropositionalContext propositional(int i) {
			return getRuleContext(PropositionalContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				force();
				setState(69);
				match(T__0);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					propositional();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 || _la==T__12 );
				setState(75);
				match(T__1);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) );
			setState(81);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForceContext extends ParserRuleContext {
		public RepresentativesContext representatives() {
			return getRuleContext(RepresentativesContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public CommissivesContext commissives() {
			return getRuleContext(CommissivesContext.class,0);
		}
		public ExpressivesContext expressives() {
			return getRuleContext(ExpressivesContext.class,0);
		}
		public DeclarativesContext declaratives() {
			return getRuleContext(DeclarativesContext.class,0);
		}
		public ForceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_force; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterForce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitForce(this);
		}
	}

	public final ForceContext force() throws RecognitionException {
		ForceContext _localctx = new ForceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_force);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				representatives();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				directives();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				commissives();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				expressives();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				declaratives();
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

	public static class RepresentativesContext extends ParserRuleContext {
		public RepresentativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_representatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterRepresentatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitRepresentatives(this);
		}
	}

	public final RepresentativesContext representatives() throws RecognitionException {
		RepresentativesContext _localctx = new RepresentativesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_representatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class DirectivesContext extends ParserRuleContext {
		public DirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterDirectives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitDirectives(this);
		}
	}

	public final DirectivesContext directives() throws RecognitionException {
		DirectivesContext _localctx = new DirectivesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommissivesContext extends ParserRuleContext {
		public CommissivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commissives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterCommissives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitCommissives(this);
		}
	}

	public final CommissivesContext commissives() throws RecognitionException {
		CommissivesContext _localctx = new CommissivesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commissives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressivesContext extends ParserRuleContext {
		public ExpressivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterExpressives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitExpressives(this);
		}
	}

	public final ExpressivesContext expressives() throws RecognitionException {
		ExpressivesContext _localctx = new ExpressivesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class DeclarativesContext extends ParserRuleContext {
		public DeclarativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterDeclaratives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitDeclaratives(this);
		}
	}

	public final DeclarativesContext declaratives() throws RecognitionException {
		DeclarativesContext _localctx = new DeclarativesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaratives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropositionalContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public PropositionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propositional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterPropositional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitPropositional(this);
		}
	}

	public final PropositionalContext propositional() throws RecognitionException {
		PropositionalContext _localctx = new PropositionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propositional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			url();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlContext extends ParserRuleContext {
		public SchemeContext scheme() {
			return getRuleContext(SchemeContext.class,0);
		}
		public Hier_partContext hier_part() {
			return getRuleContext(Hier_partContext.class,0);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			scheme();
			setState(103);
			match(T__10);
			setState(104);
			hier_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemeContext extends ParserRuleContext {
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitScheme(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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

	public static class Hier_partContext extends ParserRuleContext {
		public Net_pathContext net_path() {
			return getRuleContext(Net_pathContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public Fragment_Context fragment_() {
			return getRuleContext(Fragment_Context.class,0);
		}
		public Hier_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hier_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterHier_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitHier_part(this);
		}
	}

	public final Hier_partContext hier_part() throws RecognitionException {
		Hier_partContext _localctx = new Hier_partContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hier_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			net_path();
			setState(111);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(109);
				match(T__13);
				setState(110);
				query();
				}
			}

			setState(115);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(113);
				match(T__14);
				setState(114);
				fragment_();
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

	public static class Net_pathContext extends ParserRuleContext {
		public ServerContext server() {
			return getRuleContext(ServerContext.class,0);
		}
		public Abs_pathContext abs_path() {
			return getRuleContext(Abs_pathContext.class,0);
		}
		public Net_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_net_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterNet_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitNet_path(this);
		}
	}

	public final Net_pathContext net_path() throws RecognitionException {
		Net_pathContext _localctx = new Net_pathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_net_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__15);
			setState(118);
			server();
			setState(120);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(119);
				abs_path();
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

	public static class Abs_pathContext extends ParserRuleContext {
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public Abs_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterAbs_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitAbs_path(this);
		}
	}

	public final Abs_pathContext abs_path() throws RecognitionException {
		Abs_pathContext _localctx = new Abs_pathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_abs_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				match(T__16);
				setState(123);
				segment();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentContext extends ParserRuleContext {
		public List<PcharContext> pchar() {
			return getRuleContexts(PcharContext.class);
		}
		public PcharContext pchar(int i) {
			return getRuleContext(PcharContext.class,i);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitSegment(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				pchar();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << MARK) | (1L << DIGIT) | (1L << ALPHA))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PcharContext extends ParserRuleContext {
		public EscapedContext escaped() {
			return getRuleContext(EscapedContext.class,0);
		}
		public UnreservedContext unreserved() {
			return getRuleContext(UnreservedContext.class,0);
		}
		public PcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterPchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitPchar(this);
		}
	}

	public final PcharContext pchar() throws RecognitionException {
		PcharContext _localctx = new PcharContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pchar);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				escaped();
				}
				break;
			case MARK:
			case DIGIT:
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				unreserved();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__10);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				match(T__22);
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

	public static class ServerContext extends ParserRuleContext {
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public ServerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterServer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitServer(this);
		}
	}

	public final ServerContext server() throws RecognitionException {
		ServerContext _localctx = new ServerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_server);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			host();
			setState(147);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(145);
				match(T__10);
				setState(146);
				port();
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

	public static class PortContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(IfaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(IfaParser.DIGIT, i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitPort(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				match(DIGIT);
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostContext extends ParserRuleContext {
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public IpV4AddressContext ipV4Address() {
			return getRuleContext(IpV4AddressContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitHost(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_host);
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				hostname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				ipV4Address();
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

	public static class HostnameContext extends ParserRuleContext {
		public ToplabelContext toplabel() {
			return getRuleContext(ToplabelContext.class,0);
		}
		public List<DomainlabelContext> domainlabel() {
			return getRuleContexts(DomainlabelContext.class);
		}
		public DomainlabelContext domainlabel(int i) {
			return getRuleContext(DomainlabelContext.class,i);
		}
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterHostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitHostname(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_hostname);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					domainlabel();
					setState(159);
					match(T__23);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(166);
			toplabel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainlabelContext extends ParserRuleContext {
		public List<AlphanumContext> alphanum() {
			return getRuleContexts(AlphanumContext.class);
		}
		public AlphanumContext alphanum(int i) {
			return getRuleContext(AlphanumContext.class,i);
		}
		public DomainlabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainlabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterDomainlabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitDomainlabel(this);
		}
	}

	public final DomainlabelContext domainlabel() throws RecognitionException {
		DomainlabelContext _localctx = new DomainlabelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_domainlabel);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			alphanum();
			setState(177);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << DIGIT) | (1L << ALPHA))) != 0)) {
				{
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(171);
						switch (_input.LA(1)) {
						case DIGIT:
						case ALPHA:
							{
							setState(169);
							alphanum();
							}
							break;
						case T__24:
							{
							setState(170);
							match(T__24);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(176);
				alphanum();
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

	public static class ToplabelContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(IfaParser.ALPHA, 0); }
		public List<AlphanumContext> alphanum() {
			return getRuleContexts(AlphanumContext.class);
		}
		public AlphanumContext alphanum(int i) {
			return getRuleContext(AlphanumContext.class,i);
		}
		public ToplabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toplabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterToplabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitToplabel(this);
		}
	}

	public final ToplabelContext toplabel() throws RecognitionException {
		ToplabelContext _localctx = new ToplabelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_toplabel);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ALPHA);
			setState(188);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << DIGIT) | (1L << ALPHA))) != 0)) {
				{
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(182);
						switch (_input.LA(1)) {
						case DIGIT:
						case ALPHA:
							{
							setState(180);
							alphanum();
							}
							break;
						case T__23:
							{
							setState(181);
							match(T__23);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(187);
				alphanum();
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

	public static class IpV4AddressContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(IfaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(IfaParser.DIGIT, i);
		}
		public IpV4AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipV4Address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterIpV4Address(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitIpV4Address(this);
		}
	}

	public final IpV4AddressContext ipV4Address() throws RecognitionException {
		IpV4AddressContext _localctx = new IpV4AddressContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ipV4Address);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				match(DIGIT);
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(195);
			match(T__23);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				match(DIGIT);
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(201);
			match(T__23);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(DIGIT);
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(207);
			match(T__23);
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				match(DIGIT);
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fragment_Context extends ParserRuleContext {
		public List<UricContext> uric() {
			return getRuleContexts(UricContext.class);
		}
		public UricContext uric(int i) {
			return getRuleContext(UricContext.class,i);
		}
		public Fragment_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragment_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterFragment_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitFragment_(this);
		}
	}

	public final Fragment_Context fragment_() throws RecognitionException {
		Fragment_Context _localctx = new Fragment_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_fragment_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__25) | (1L << Q_RESERVED) | (1L << MARK) | (1L << DIGIT) | (1L << ALPHA))) != 0)) {
				{
				{
				setState(213);
				uric();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class QueryContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			param();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(220);
				match(T__18);
				setState(221);
				param();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParamContext extends ParserRuleContext {
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public PvalueContext pvalue() {
			return getRuleContext(PvalueContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			pname();
			setState(228);
			match(T__19);
			setState(229);
			pvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PnameContext extends ParserRuleContext {
		public List<QcContext> qc() {
			return getRuleContexts(QcContext.class);
		}
		public QcContext qc(int i) {
			return getRuleContext(QcContext.class,i);
		}
		public PnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterPname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitPname(this);
		}
	}

	public final PnameContext pname() throws RecognitionException {
		PnameContext _localctx = new PnameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				qc();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << Q_RESERVED) | (1L << MARK) | (1L << DIGIT) | (1L << ALPHA))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PvalueContext extends ParserRuleContext {
		public List<QcContext> qc() {
			return getRuleContexts(QcContext.class);
		}
		public QcContext qc(int i) {
			return getRuleContext(QcContext.class,i);
		}
		public PvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterPvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitPvalue(this);
		}
	}

	public final PvalueContext pvalue() throws RecognitionException {
		PvalueContext _localctx = new PvalueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				qc();
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << Q_RESERVED) | (1L << MARK) | (1L << DIGIT) | (1L << ALPHA))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QcContext extends ParserRuleContext {
		public EscapedContext escaped() {
			return getRuleContext(EscapedContext.class,0);
		}
		public TerminalNode Q_RESERVED() { return getToken(IfaParser.Q_RESERVED, 0); }
		public UnreservedContext unreserved() {
			return getRuleContext(UnreservedContext.class,0);
		}
		public QcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterQc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitQc(this);
		}
	}

	public final QcContext qc() throws RecognitionException {
		QcContext _localctx = new QcContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_qc);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				escaped();
				}
				break;
			case Q_RESERVED:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(Q_RESERVED);
				}
				break;
			case MARK:
			case DIGIT:
			case ALPHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				unreserved();
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

	public static class UricContext extends ParserRuleContext {
		public EscapedContext escaped() {
			return getRuleContext(EscapedContext.class,0);
		}
		public ReservedContext reserved() {
			return getRuleContext(ReservedContext.class,0);
		}
		public UnreservedContext unreserved() {
			return getRuleContext(UnreservedContext.class,0);
		}
		public UricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterUric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitUric(this);
		}
	}

	public final UricContext uric() throws RecognitionException {
		UricContext _localctx = new UricContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_uric);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				escaped();
				}
				break;
			case T__18:
			case T__19:
			case Q_RESERVED:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				reserved();
				}
				break;
			case MARK:
			case DIGIT:
			case ALPHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				unreserved();
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

	public static class UnreservedContext extends ParserRuleContext {
		public AlphanumContext alphanum() {
			return getRuleContext(AlphanumContext.class,0);
		}
		public TerminalNode MARK() { return getToken(IfaParser.MARK, 0); }
		public UnreservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterUnreserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitUnreserved(this);
		}
	}

	public final UnreservedContext unreserved() throws RecognitionException {
		UnreservedContext _localctx = new UnreservedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unreserved);
		try {
			setState(253);
			switch (_input.LA(1)) {
			case DIGIT:
			case ALPHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				alphanum();
				}
				break;
			case MARK:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(MARK);
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

	public static class EscapedContext extends ParserRuleContext {
		public List<HexContext> hex() {
			return getRuleContexts(HexContext.class);
		}
		public HexContext hex(int i) {
			return getRuleContext(HexContext.class,i);
		}
		public EscapedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escaped; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterEscaped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitEscaped(this);
		}
	}

	public final EscapedContext escaped() throws RecognitionException {
		EscapedContext _localctx = new EscapedContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_escaped);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__25);
			setState(256);
			hex();
			setState(257);
			hex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(IfaParser.DIGIT, 0); }
		public TerminalNode HEX_LETTER() { return getToken(IfaParser.HEX_LETTER, 0); }
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitHex(this);
		}
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_hex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==HEX_LETTER) ) {
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

	public static class AlphanumContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(IfaParser.DIGIT, 0); }
		public TerminalNode ALPHA() { return getToken(IfaParser.ALPHA, 0); }
		public AlphanumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterAlphanum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitAlphanum(this);
		}
	}

	public final AlphanumContext alphanum() throws RecognitionException {
		AlphanumContext _localctx = new AlphanumContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_alphanum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==ALPHA) ) {
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

	public static class ReservedContext extends ParserRuleContext {
		public TerminalNode Q_RESERVED() { return getToken(IfaParser.Q_RESERVED, 0); }
		public ReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).enterReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IfaListener ) ((IfaListener)listener).exitReserved(this);
		}
	}

	public final ReservedContext reserved() throws RecognitionException {
		ReservedContext _localctx = new ReservedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_reserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << Q_RESERVED))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\6\2J\n\2\r\2\16\2K\3\2\3\2\6\2P\n\2\r\2"+
		"\16\2Q\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\fr\n\f"+
		"\3\f\3\f\5\fv\n\f\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\6\16\177\n\16\r\16\16"+
		"\16\u0080\3\17\6\17\u0084\n\17\r\17\16\17\u0085\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0091\n\20\3\21\3\21\3\21\5\21\u0096\n\21"+
		"\3\22\6\22\u0099\n\22\r\22\16\22\u009a\3\23\3\23\5\23\u009f\n\23\3\24"+
		"\3\24\3\24\7\24\u00a4\n\24\f\24\16\24\u00a7\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\7\25\u00ae\n\25\f\25\16\25\u00b1\13\25\3\25\5\25\u00b4\n\25\3\26"+
		"\3\26\3\26\7\26\u00b9\n\26\f\26\16\26\u00bc\13\26\3\26\5\26\u00bf\n\26"+
		"\3\27\6\27\u00c2\n\27\r\27\16\27\u00c3\3\27\3\27\6\27\u00c8\n\27\r\27"+
		"\16\27\u00c9\3\27\3\27\6\27\u00ce\n\27\r\27\16\27\u00cf\3\27\3\27\6\27"+
		"\u00d4\n\27\r\27\16\27\u00d5\3\30\7\30\u00d9\n\30\f\30\16\30\u00dc\13"+
		"\30\3\31\3\31\3\31\7\31\u00e1\n\31\f\31\16\31\u00e4\13\31\3\32\3\32\3"+
		"\32\3\32\3\33\6\33\u00eb\n\33\r\33\16\33\u00ec\3\34\6\34\u00f0\n\34\r"+
		"\34\16\34\u00f1\3\35\3\35\3\35\5\35\u00f7\n\35\3\36\3\36\3\36\5\36\u00fc"+
		"\n\36\3\37\3\37\5\37\u0100\n\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\2\2"+
		"$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2"+
		"\b\3\2\5\6\3\2\t\13\3\2\16\17\4\2\37\37!!\3\2\37 \4\2\25\26\35\35\u0113"+
		"\2O\3\2\2\2\4Z\3\2\2\2\6\\\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16"+
		"d\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24l\3\2\2\2\26n\3\2\2\2\30w\3\2\2\2"+
		"\32~\3\2\2\2\34\u0083\3\2\2\2\36\u0090\3\2\2\2 \u0092\3\2\2\2\"\u0098"+
		"\3\2\2\2$\u009e\3\2\2\2&\u00a5\3\2\2\2(\u00aa\3\2\2\2*\u00b5\3\2\2\2,"+
		"\u00c1\3\2\2\2.\u00da\3\2\2\2\60\u00dd\3\2\2\2\62\u00e5\3\2\2\2\64\u00ea"+
		"\3\2\2\2\66\u00ef\3\2\2\28\u00f6\3\2\2\2:\u00fb\3\2\2\2<\u00ff\3\2\2\2"+
		">\u0101\3\2\2\2@\u0105\3\2\2\2B\u0107\3\2\2\2D\u0109\3\2\2\2FG\5\4\3\2"+
		"GI\7\3\2\2HJ\5\20\t\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2"+
		"\2MN\7\4\2\2NP\3\2\2\2OF\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2"+
		"\2ST\7\2\2\3T\3\3\2\2\2U[\5\6\4\2V[\5\b\5\2W[\5\n\6\2X[\5\f\7\2Y[\5\16"+
		"\b\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\5\3\2\2\2\\]\t"+
		"\2\2\2]\7\3\2\2\2^_\7\7\2\2_\t\3\2\2\2`a\7\b\2\2a\13\3\2\2\2bc\t\3\2\2"+
		"c\r\3\2\2\2de\7\f\2\2e\17\3\2\2\2fg\5\22\n\2g\21\3\2\2\2hi\5\24\13\2i"+
		"j\7\r\2\2jk\5\26\f\2k\23\3\2\2\2lm\t\4\2\2m\25\3\2\2\2nq\5\30\r\2op\7"+
		"\20\2\2pr\5\60\31\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2st\7\21\2\2tv\5.\30\2"+
		"us\3\2\2\2uv\3\2\2\2v\27\3\2\2\2wx\7\22\2\2xz\5 \21\2y{\5\32\16\2zy\3"+
		"\2\2\2z{\3\2\2\2{\31\3\2\2\2|}\7\23\2\2}\177\5\34\17\2~|\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\33\3\2\2\2\u0082\u0084"+
		"\5\36\20\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\35\3\2\2\2\u0087\u0091\5> \2\u0088\u0091\5"+
		"<\37\2\u0089\u0091\7\r\2\2\u008a\u0091\7\24\2\2\u008b\u0091\7\25\2\2\u008c"+
		"\u0091\7\26\2\2\u008d\u0091\7\27\2\2\u008e\u0091\7\30\2\2\u008f\u0091"+
		"\7\31\2\2\u0090\u0087\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u0089\3\2\2\2"+
		"\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\37\3\2\2\2\u0092"+
		"\u0095\5$\23\2\u0093\u0094\7\r\2\2\u0094\u0096\5\"\22\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096!\3\2\2\2\u0097\u0099\7\37\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"#\3\2\2\2\u009c\u009f\5&\24\2\u009d\u009f\5,\27\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009d\3\2\2\2\u009f%\3\2\2\2\u00a0\u00a1\5(\25\2\u00a1\u00a2\7"+
		"\32\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\5*\26\2\u00a9\'\3\2\2\2\u00aa\u00b3\5B\"\2\u00ab\u00ae"+
		"\5B\"\2\u00ac\u00ae\7\33\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\5B\"\2\u00b3\u00af\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4)\3\2\2\2\u00b5\u00be\7 \2\2\u00b6\u00b9\5B\"\2\u00b7"+
		"\u00b9\7\32\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3"+
		"\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00bf\5B\"\2\u00be\u00ba\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf+\3\2\2\2\u00c0\u00c2\7\37\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\7\32\2\2\u00c6\u00c8\7\37\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\7\32\2\2\u00cc\u00ce\7\37\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\7\32\2\2\u00d2\u00d4\7\37\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6-\3\2\2\2\u00d7\u00d9"+
		"\5:\36\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db/\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e2\5\62\32"+
		"\2\u00de\u00df\7\25\2\2\u00df\u00e1\5\62\32\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\61\3\2\2"+
		"\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\64\33\2\u00e6\u00e7\7\26\2\2\u00e7"+
		"\u00e8\5\66\34\2\u00e8\63\3\2\2\2\u00e9\u00eb\58\35\2\u00ea\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\65\3\2\2\2\u00ee\u00f0\58\35\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2"+
		"\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\67\3\2\2\2\u00f3\u00f7"+
		"\5> \2\u00f4\u00f7\7\35\2\2\u00f5\u00f7\5<\37\2\u00f6\u00f3\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f79\3\2\2\2\u00f8\u00fc\5> \2\u00f9"+
		"\u00fc\5D#\2\u00fa\u00fc\5<\37\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2"+
		"\2\u00fb\u00fa\3\2\2\2\u00fc;\3\2\2\2\u00fd\u0100\5B\"\2\u00fe\u0100\7"+
		"\36\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100=\3\2\2\2\u0101\u0102"+
		"\7\34\2\2\u0102\u0103\5@!\2\u0103\u0104\5@!\2\u0104?\3\2\2\2\u0105\u0106"+
		"\t\5\2\2\u0106A\3\2\2\2\u0107\u0108\t\6\2\2\u0108C\3\2\2\2\u0109\u010a"+
		"\t\7\2\2\u010aE\3\2\2\2 KQZquz\u0080\u0085\u0090\u0095\u009a\u009e\u00a5"+
		"\u00ad\u00af\u00b3\u00b8\u00ba\u00be\u00c3\u00c9\u00cf\u00d5\u00da\u00e2"+
		"\u00ec\u00f1\u00f6\u00fb\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}