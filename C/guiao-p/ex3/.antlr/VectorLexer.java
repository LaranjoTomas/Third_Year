// Generated from /home/laranjo/Desktop/Third_Year/C/guiao-p/ex3/Vector.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VectorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		VECTOR=10, NUMBER=11, FLOAT=12, INT=13, ID=14, Comments=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"VECTOR", "NUMBER", "FLOAT", "INT", "ID", "Comments", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'show'", "'->'", "'+'", "'-'", "'*'", "'('", "')'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "VECTOR", 
			"NUMBER", "FLOAT", "INT", "ID", "Comments", "WS"
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


	public VectorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Vector.g4"; }

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
		"\u0004\u0000\u0010p\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t<\b\t\n\t\f\t?\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\nE\b\n\u0001\u000b\u0004\u000bH\b\u000b\u000b\u000b\f\u000bI"+
		"\u0001\u000b\u0001\u000b\u0004\u000bN\b\u000b\u000b\u000b\f\u000bO\u0001"+
		"\f\u0004\fS\b\f\u000b\f\f\fT\u0001\r\u0001\r\u0005\rY\b\r\n\r\f\r\\\t"+
		"\r\u0001\u000e\u0001\u000e\u0005\u000e`\b\u000e\n\u000e\f\u000ec\t\u000e"+
		"\u0001\u000e\u0003\u000ef\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0004\u000fk\b\u000f\u000b\u000f\f\u000fl\u0001\u000f\u0001\u000f\u0001"+
		"a\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0005\u0001\u00000"+
		"9\u0001\u0000az\u0002\u000009az\u0001\u0001\n\n\u0003\u0000\t\n\r\r  "+
		"w\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001"+
		"\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005(\u0001\u0000\u0000"+
		"\u0000\u0007+\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b"+
		"/\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f3\u0001\u0000"+
		"\u0000\u0000\u00115\u0001\u0000\u0000\u0000\u00137\u0001\u0000\u0000\u0000"+
		"\u0015D\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000\u0000\u0019R"+
		"\u0001\u0000\u0000\u0000\u001bV\u0001\u0000\u0000\u0000\u001d]\u0001\u0000"+
		"\u0000\u0000\u001fj\u0001\u0000\u0000\u0000!\"\u0005;\u0000\u0000\"\u0002"+
		"\u0001\u0000\u0000\u0000#$\u0005s\u0000\u0000$%\u0005h\u0000\u0000%&\u0005"+
		"o\u0000\u0000&\'\u0005w\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000()"+
		"\u0005-\u0000\u0000)*\u0005>\u0000\u0000*\u0006\u0001\u0000\u0000\u0000"+
		"+,\u0005+\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005-\u0000\u0000"+
		".\n\u0001\u0000\u0000\u0000/0\u0005*\u0000\u00000\f\u0001\u0000\u0000"+
		"\u000012\u0005(\u0000\u00002\u000e\u0001\u0000\u0000\u000034\u0005)\u0000"+
		"\u00004\u0010\u0001\u0000\u0000\u000056\u0005.\u0000\u00006\u0012\u0001"+
		"\u0000\u0000\u000078\u0005[\u0000\u00008=\u0003\u0015\n\u00009:\u0005"+
		",\u0000\u0000:<\u0003\u0015\n\u0000;9\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005]\u0000\u0000"+
		"A\u0014\u0001\u0000\u0000\u0000BE\u0003\u0017\u000b\u0000CE\u0003\u0019"+
		"\f\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0016\u0001"+
		"\u0000\u0000\u0000FH\u0007\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KM\u0005.\u0000\u0000LN\u0007\u0000\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0018\u0001\u0000\u0000\u0000"+
		"QS\u0007\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u001a\u0001"+
		"\u0000\u0000\u0000VZ\u0007\u0001\u0000\u0000WY\u0007\u0002\u0000\u0000"+
		"XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\u001c\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000]a\u0005#\u0000\u0000^`\t\u0000\u0000\u0000_^\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000df\u0007\u0003\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0006\u000e\u0000\u0000h\u001e\u0001\u0000\u0000\u0000"+
		"ik\u0007\u0004\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000no\u0006\u000f\u0000\u0000o \u0001\u0000\u0000\u0000\n\u0000"+
		"=DIOTZael\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}