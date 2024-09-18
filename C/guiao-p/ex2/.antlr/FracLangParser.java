// Generated from /home/laranjo/Desktop/Third_Year/C/guiao-p/ex2/FracLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FracLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, NUMBER=14, COMMENTS=15, ASPAS=16, 
		WS=17;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'display'", "'<='", "'/'", "'-'", "'+'", "'*'", "':'", 
			"'('", "')'", "'read'", "'reduce'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "NUMBER", "COMMENTS", "ASPAS", "WS"
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

	@Override
	public String getGrammarFileName() { return "FracLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FracLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FracLangParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==ID) {
				{
				{
				setState(6);
				stat();
				setState(7);
				match(T__0);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatDisplayContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatDisplayContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatGetVarnameContext extends StatContext {
		public TerminalNode ID() { return getToken(FracLangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatGetVarnameContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new StatDisplayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(T__1);
				setState(17);
				expr(0);
				}
				break;
			case ID:
				_localctx = new StatGetVarnameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(ID);
				setState(19);
				match(T__2);
				setState(20);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMulDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFRACTIONContext extends ExprContext {
		public List<TerminalNode> NUMBER() { return getTokens(FracLangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(FracLangParser.NUMBER, i);
		}
		public ExprFRACTIONContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSumSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprSumSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends ExprContext {
		public Token sign;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(FracLangParser.NUMBER, 0); }
		public ExprNumberContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAspaContext extends ExprContext {
		public TerminalNode ASPAS() { return getToken(FracLangParser.ASPAS, 0); }
		public ExprAspaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(FracLangParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprReduceContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprReduceContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ExprFRACTIONContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(24);
				match(NUMBER);
				setState(25);
				match(T__3);
				setState(26);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				((ExprUnaryContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
					((ExprUnaryContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(28);
				expr(8);
				}
				break;
			case 3:
				{
				_localctx = new ExprNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(T__8);
				setState(32);
				expr(0);
				setState(33);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new ExprAspaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(T__10);
				setState(36);
				match(ASPAS);
				}
				break;
			case 7:
				{
				_localctx = new ExprReduceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__11);
				setState(38);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(47);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(41);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(42);
						((ExprMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
							((ExprMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(43);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprSumSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(45);
						((ExprSumSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((ExprSumSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(46);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00115\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0016\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u00020\b\u0002\n\u0002\f\u00023\t\u0002\u0001\u0002\u0000\u0001\u0004"+
		"\u0003\u0000\u0002\u0004\u0000\u0002\u0001\u0000\u0005\u0006\u0001\u0000"+
		"\u0007\b;\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000"+
		"\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006\u0007\u0003\u0002\u0001"+
		"\u0000\u0007\b\u0005\u0001\u0000\u0000\b\n\u0001\u0000\u0000\u0000\t\u0006"+
		"\u0001\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000"+
		"\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u000e\u0001\u0000\u0000"+
		"\u0000\r\u000b\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0000\u0000\u0001"+
		"\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0002\u0000\u0000"+
		"\u0011\u0016\u0003\u0004\u0002\u0000\u0012\u0013\u0005\r\u0000\u0000\u0013"+
		"\u0014\u0005\u0003\u0000\u0000\u0014\u0016\u0003\u0004\u0002\u0000\u0015"+
		"\u0010\u0001\u0000\u0000\u0000\u0015\u0012\u0001\u0000\u0000\u0000\u0016"+
		"\u0003\u0001\u0000\u0000\u0000\u0017\u0018\u0006\u0002\uffff\uffff\u0000"+
		"\u0018\u0019\u0005\u000e\u0000\u0000\u0019\u001a\u0005\u0004\u0000\u0000"+
		"\u001a(\u0005\u000e\u0000\u0000\u001b\u001c\u0007\u0000\u0000\u0000\u001c"+
		"(\u0003\u0004\u0002\b\u001d(\u0005\u000e\u0000\u0000\u001e(\u0005\r\u0000"+
		"\u0000\u001f \u0005\t\u0000\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\n"+
		"\u0000\u0000\"(\u0001\u0000\u0000\u0000#$\u0005\u000b\u0000\u0000$(\u0005"+
		"\u0010\u0000\u0000%&\u0005\f\u0000\u0000&(\u0003\u0004\u0002\u0001\'\u0017"+
		"\u0001\u0000\u0000\u0000\'\u001b\u0001\u0000\u0000\u0000\'\u001d\u0001"+
		"\u0000\u0000\u0000\'\u001e\u0001\u0000\u0000\u0000\'\u001f\u0001\u0000"+
		"\u0000\u0000\'#\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(1\u0001"+
		"\u0000\u0000\u0000)*\n\u0005\u0000\u0000*+\u0007\u0001\u0000\u0000+0\u0003"+
		"\u0004\u0002\u0006,-\n\u0004\u0000\u0000-.\u0007\u0000\u0000\u0000.0\u0003"+
		"\u0004\u0002\u0005/)\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000\u0000"+
		"03\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u00002\u0005\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000\u0005"+
		"\u000b\u0015\'/1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}