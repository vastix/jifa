// Generated from Ifa.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Propositional=11, WS=12;
	public static final int
		RULE_stat = 0, RULE_force = 1, RULE_representatives = 2, RULE_directives = 3, 
		RULE_commissives = 4, RULE_expressives = 5, RULE_declaratives = 6;
	public static final String[] ruleNames = {
		"stat", "force", "representatives", "directives", "commissives", "expressives", 
		"declaratives"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'ASSERT'", "'INFORM'", "'REQUEST'", "'CONSENT'", 
		"'APOLOGIZE'", "'THANK'", "'COMPLAIN'", "'DECLARE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Propositional", 
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
		public List<TerminalNode> Propositional() { return getTokens(IfaParser.Propositional); }
		public TerminalNode Propositional(int i) {
			return getToken(IfaParser.Propositional, i);
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				force();
				setState(15);
				match(T__0);
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(16);
					match(Propositional);
					}
					}
					setState(19); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Propositional );
				setState(21);
				match(T__1);
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) );
			setState(27);
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
			setState(34);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				representatives();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				directives();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				commissives();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				expressives();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
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
			setState(36);
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
			setState(38);
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
			setState(40);
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
			setState(42);
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
			setState(44);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\6\2\24\n\2\r"+
		"\2\16\2\25\3\2\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\5\3%\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n"+
		"\f\16\2\4\3\2\5\6\3\2\t\13/\2\31\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b(\3\2"+
		"\2\2\n*\3\2\2\2\f,\3\2\2\2\16.\3\2\2\2\20\21\5\4\3\2\21\23\7\3\2\2\22"+
		"\24\7\r\2\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
		"\27\3\2\2\2\27\30\7\4\2\2\30\32\3\2\2\2\31\20\3\2\2\2\32\33\3\2\2\2\33"+
		"\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37"+
		"%\5\6\4\2 %\5\b\5\2!%\5\n\6\2\"%\5\f\7\2#%\5\16\b\2$\37\3\2\2\2$ \3\2"+
		"\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\t\2\2\2\'\7\3\2\2\2"+
		"()\7\7\2\2)\t\3\2\2\2*+\7\b\2\2+\13\3\2\2\2,-\t\3\2\2-\r\3\2\2\2./\7\f"+
		"\2\2/\17\3\2\2\2\5\25\33$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}