// Generated from  by ANTLR 4.2.2

package camllight.parser;
import static camllight.parser.Tokens.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, WS=20, NUM=21, BOOL=22, ID=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'done'", "'to'", "'||'", "'while'", "'&&'", "'='", "'for'", "'if'", "'or'", 
		"'&'", "'begin'", "'else'", "'('", "'end'", "'do'", "')'", "'*'", "'+'", 
		"'then'", "WS", "NUM", "BOOL", "ID"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "WS", "NUM", "BOOL", "ID"
	};


	public CLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return ""; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\6\25t\n\25\r\25\16\25u\3\25\3\25\3\26\6\26{\n\26\r\26\16\26|\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0088\n\27\3\30\6\30\u008b"+
		"\n\30\r\30\16\30\u008c\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3"+
		"\2\5\3\2\"\"\3\2\62;\3\2c|\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3\2\2\2\79\3\2\2\2"+
		"\t<\3\2\2\2\13B\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21K\3\2\2\2\23N\3\2\2\2"+
		"\25Q\3\2\2\2\27S\3\2\2\2\31Y\3\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37d\3\2\2"+
		"\2!g\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'m\3\2\2\2)s\3\2\2\2+z\3\2\2\2-\u0087"+
		"\3\2\2\2/\u008a\3\2\2\2\61\62\7f\2\2\62\63\7q\2\2\63\64\7p\2\2\64\65\7"+
		"g\2\2\65\4\3\2\2\2\66\67\7v\2\2\678\7q\2\28\6\3\2\2\29:\7~\2\2:;\7~\2"+
		"\2;\b\3\2\2\2<=\7y\2\2=>\7j\2\2>?\7k\2\2?@\7n\2\2@A\7g\2\2A\n\3\2\2\2"+
		"BC\7(\2\2CD\7(\2\2D\f\3\2\2\2EF\7?\2\2F\16\3\2\2\2GH\7h\2\2HI\7q\2\2I"+
		"J\7t\2\2J\20\3\2\2\2KL\7k\2\2LM\7h\2\2M\22\3\2\2\2NO\7q\2\2OP\7t\2\2P"+
		"\24\3\2\2\2QR\7(\2\2R\26\3\2\2\2ST\7d\2\2TU\7g\2\2UV\7i\2\2VW\7k\2\2W"+
		"X\7p\2\2X\30\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\32\3\2\2\2"+
		"^_\7*\2\2_\34\3\2\2\2`a\7g\2\2ab\7p\2\2bc\7f\2\2c\36\3\2\2\2de\7f\2\2"+
		"ef\7q\2\2f \3\2\2\2gh\7+\2\2h\"\3\2\2\2ij\7,\2\2j$\3\2\2\2kl\7-\2\2l&"+
		"\3\2\2\2mn\7v\2\2no\7j\2\2op\7g\2\2pq\7p\2\2q(\3\2\2\2rt\t\2\2\2sr\3\2"+
		"\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\25\2\2x*\3\2\2\2y{\t"+
		"\3\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2},\3\2\2\2~\177\7h\2\2\177"+
		"\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0088\7g\2\2"+
		"\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7w\2\2\u0086\u0088"+
		"\7g\2\2\u0087~\3\2\2\2\u0087\u0083\3\2\2\2\u0088.\3\2\2\2\u0089\u008b"+
		"\t\4\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\60\3\2\2\2\7\2u|\u0087\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}