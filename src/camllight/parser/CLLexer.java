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
		T__62=1, T__61=2, T__60=3, T__59=4, T__58=5, T__57=6, T__56=7, T__55=8, 
		T__54=9, T__53=10, T__52=11, T__51=12, T__50=13, T__49=14, T__48=15, T__47=16, 
		T__46=17, T__45=18, T__44=19, T__43=20, T__42=21, T__41=22, T__40=23, 
		T__39=24, T__38=25, T__37=26, T__36=27, T__35=28, T__34=29, T__33=30, 
		T__32=31, T__31=32, T__30=33, T__29=34, T__28=35, T__27=36, T__26=37, 
		T__25=38, T__24=39, T__23=40, T__22=41, T__21=42, T__20=43, T__19=44, 
		T__18=45, T__17=46, T__16=47, T__15=48, T__14=49, T__13=50, T__12=51, 
		T__11=52, T__10=53, T__9=54, T__8=55, T__7=56, T__6=57, T__5=58, T__4=59, 
		T__3=60, T__2=61, T__1=62, T__0=63, CHARTOKEN=64, WS=65, INTTOKEN=66, 
		NULLTOKEN=67, EMPTYARRAYTOKEN=68, STRINGTOKEN=69, EMPTYLISTTOKEN=70, FLOATTOKEN=71, 
		WILDCARDTOKEN=72, BOOLTOKEN=73, IDTOKEN=74, CONSTRTOKEN=75;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'fun'", "'while'", "'{'", "'&&'", "'::'", "'='", "'for'", "'do'", "'('", 
		"'rec'", "','", "'<-'", "'done'", "'mod'", "'>='", "'<'", "';;'", "']'", 
		"'*.'", "'type'", "'|]'", "'let'", "'match'", "'function'", "'downto'", 
		"'then'", "'+'", "'/'", "'as'", "'of'", "'.('", "'||'", "'/.'", "';'", 
		"'}'", "'if'", "'<='", "'[|'", "'&'", "'print'", "'''", "'*'", "'.'", 
		"'->'", "'to'", "'mutable'", "':'", "'['", "'=='", "'|'", "'with'", "'>'", 
		"'+.'", "'or'", "'-.'", "'else'", "'begin'", "'in'", "'end'", "')'", "'and'", 
		"'not'", "'-'", "CHARTOKEN", "WS", "INTTOKEN", "NULLTOKEN", "EMPTYARRAYTOKEN", 
		"STRINGTOKEN", "EMPTYLISTTOKEN", "FLOATTOKEN", "'_'", "BOOLTOKEN", "IDTOKEN", 
		"CONSTRTOKEN"
	};
	public static final String[] ruleNames = {
		"T__62", "T__61", "T__60", "T__59", "T__58", "T__57", "T__56", "T__55", 
		"T__54", "T__53", "T__52", "T__51", "T__50", "T__49", "T__48", "T__47", 
		"T__46", "T__45", "T__44", "T__43", "T__42", "T__41", "T__40", "T__39", 
		"T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", "T__31", 
		"T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", 
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "CHARTOKEN", "WS", "INTTOKEN", 
		"NULLTOKEN", "EMPTYARRAYTOKEN", "STRINGTOKEN", "EMPTYLISTTOKEN", "FLOATTOKEN", 
		"WILDCARDTOKEN", "BOOLTOKEN", "IDTOKEN", "CONSTRTOKEN"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2M\u01e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:"+
		"\3:\3;\3;\3;\3<\3<\3<\3<\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3A\3A\3A"+
		"\3A\3A\3A\3A\5A\u0177\nA\7A\u0179\nA\fA\16A\u017c\13A\3A\3A\3B\6B\u0181"+
		"\nB\rB\16B\u0182\3B\3B\3C\6C\u0188\nC\rC\16C\u0189\3D\3D\7D\u018e\nD\f"+
		"D\16D\u0191\13D\3D\3D\3E\3E\3E\3E\7E\u0199\nE\fE\16E\u019c\13E\3E\3E\3"+
		"E\3F\3F\3F\3F\3F\3F\3F\5F\u01a8\nF\7F\u01aa\nF\fF\16F\u01ad\13F\3F\3F"+
		"\3G\3G\7G\u01b3\nG\fG\16G\u01b6\13G\3G\3G\3H\6H\u01bb\nH\rH\16H\u01bc"+
		"\3H\3H\7H\u01c1\nH\fH\16H\u01c4\13H\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\5"+
		"J\u01d1\nJ\3K\3K\7K\u01d5\nK\fK\16K\u01d8\13K\3L\3L\7L\u01dc\nL\fL\16"+
		"L\u01df\13L\2\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\3\2\13\4\2^^bb\b\2"+
		"^^bbddppttvv\3\2\62;\3\2\"\"\4\2$$^^\b\2$$^^ddppttvv\4\2aac|\6\2\62;C"+
		"\\aac|\3\2C\\\u01ef\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u0099\3\2\2\2\5\u009d\3\2\2\2\7\u00a3"+
		"\3\2\2\2\t\u00a5\3\2\2\2\13\u00a8\3\2\2\2\r\u00ab\3\2\2\2\17\u00ad\3\2"+
		"\2\2\21\u00b1\3\2\2\2\23\u00b4\3\2\2\2\25\u00b6\3\2\2\2\27\u00ba\3\2\2"+
		"\2\31\u00bc\3\2\2\2\33\u00bf\3\2\2\2\35\u00c4\3\2\2\2\37\u00c8\3\2\2\2"+
		"!\u00cb\3\2\2\2#\u00cd\3\2\2\2%\u00d0\3\2\2\2\'\u00d2\3\2\2\2)\u00d5\3"+
		"\2\2\2+\u00da\3\2\2\2-\u00dd\3\2\2\2/\u00e1\3\2\2\2\61\u00e7\3\2\2\2\63"+
		"\u00f0\3\2\2\2\65\u00f7\3\2\2\2\67\u00fc\3\2\2\29\u00fe\3\2\2\2;\u0100"+
		"\3\2\2\2=\u0103\3\2\2\2?\u0106\3\2\2\2A\u0109\3\2\2\2C\u010c\3\2\2\2E"+
		"\u010f\3\2\2\2G\u0111\3\2\2\2I\u0113\3\2\2\2K\u0116\3\2\2\2M\u0119\3\2"+
		"\2\2O\u011c\3\2\2\2Q\u011e\3\2\2\2S\u0124\3\2\2\2U\u0126\3\2\2\2W\u0128"+
		"\3\2\2\2Y\u012a\3\2\2\2[\u012d\3\2\2\2]\u0130\3\2\2\2_\u0138\3\2\2\2a"+
		"\u013a\3\2\2\2c\u013c\3\2\2\2e\u013f\3\2\2\2g\u0141\3\2\2\2i\u0146\3\2"+
		"\2\2k\u0148\3\2\2\2m\u014b\3\2\2\2o\u014e\3\2\2\2q\u0151\3\2\2\2s\u0156"+
		"\3\2\2\2u\u015c\3\2\2\2w\u015f\3\2\2\2y\u0163\3\2\2\2{\u0165\3\2\2\2}"+
		"\u0169\3\2\2\2\177\u016d\3\2\2\2\u0081\u016f\3\2\2\2\u0083\u0180\3\2\2"+
		"\2\u0085\u0187\3\2\2\2\u0087\u018b\3\2\2\2\u0089\u0194\3\2\2\2\u008b\u01a0"+
		"\3\2\2\2\u008d\u01b0\3\2\2\2\u008f\u01ba\3\2\2\2\u0091\u01c5\3\2\2\2\u0093"+
		"\u01d0\3\2\2\2\u0095\u01d2\3\2\2\2\u0097\u01d9\3\2\2\2\u0099\u009a\7h"+
		"\2\2\u009a\u009b\7w\2\2\u009b\u009c\7p\2\2\u009c\4\3\2\2\2\u009d\u009e"+
		"\7y\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7n\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\6\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4\b\3\2\2\2\u00a5"+
		"\u00a6\7(\2\2\u00a6\u00a7\7(\2\2\u00a7\n\3\2\2\2\u00a8\u00a9\7<\2\2\u00a9"+
		"\u00aa\7<\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\16\3\2\2\2\u00ad"+
		"\u00ae\7h\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7t\2\2\u00b0\20\3\2\2\2\u00b1"+
		"\u00b2\7f\2\2\u00b2\u00b3\7q\2\2\u00b3\22\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5"+
		"\24\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7e\2\2\u00b9"+
		"\26\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd"+
		"\u00be\7/\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7g\2\2\u00c3\34\3\2\2\2\u00c4\u00c5\7o\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7f\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9"+
		"\u00ca\7?\2\2\u00ca \3\2\2\2\u00cb\u00cc\7>\2\2\u00cc\"\3\2\2\2\u00cd"+
		"\u00ce\7=\2\2\u00ce\u00cf\7=\2\2\u00cf$\3\2\2\2\u00d0\u00d1\7_\2\2\u00d1"+
		"&\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\u00d4\7\60\2\2\u00d4(\3\2\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\u00d7\7{\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7g\2\2"+
		"\u00d9*\3\2\2\2\u00da\u00db\7~\2\2\u00db\u00dc\7_\2\2\u00dc,\3\2\2\2\u00dd"+
		"\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7v\2\2\u00e0.\3\2\2\2\u00e1"+
		"\u00e2\7o\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7e\2\2"+
		"\u00e5\u00e6\7j\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7"+
		"w\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7p\2\2\u00ef\62\3\2\2\2\u00f0\u00f1"+
		"\7f\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7y\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\u00f5\7v\2\2\u00f5\u00f6\7q\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7j\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\66\3\2\2\2\u00fc"+
		"\u00fd\7-\2\2\u00fd8\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff:\3\2\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7u\2\2\u0102<\3\2\2\2\u0103\u0104\7q\2\2\u0104"+
		"\u0105\7h\2\2\u0105>\3\2\2\2\u0106\u0107\7\60\2\2\u0107\u0108\7*\2\2\u0108"+
		"@\3\2\2\2\u0109\u010a\7~\2\2\u010a\u010b\7~\2\2\u010bB\3\2\2\2\u010c\u010d"+
		"\7\61\2\2\u010d\u010e\7\60\2\2\u010eD\3\2\2\2\u010f\u0110\7=\2\2\u0110"+
		"F\3\2\2\2\u0111\u0112\7\177\2\2\u0112H\3\2\2\2\u0113\u0114\7k\2\2\u0114"+
		"\u0115\7h\2\2\u0115J\3\2\2\2\u0116\u0117\7>\2\2\u0117\u0118\7?\2\2\u0118"+
		"L\3\2\2\2\u0119\u011a\7]\2\2\u011a\u011b\7~\2\2\u011bN\3\2\2\2\u011c\u011d"+
		"\7(\2\2\u011dP\3\2\2\2\u011e\u011f\7r\2\2\u011f\u0120\7t\2\2\u0120\u0121"+
		"\7k\2\2\u0121\u0122\7p\2\2\u0122\u0123\7v\2\2\u0123R\3\2\2\2\u0124\u0125"+
		"\7)\2\2\u0125T\3\2\2\2\u0126\u0127\7,\2\2\u0127V\3\2\2\2\u0128\u0129\7"+
		"\60\2\2\u0129X\3\2\2\2\u012a\u012b\7/\2\2\u012b\u012c\7@\2\2\u012cZ\3"+
		"\2\2\2\u012d\u012e\7v\2\2\u012e\u012f\7q\2\2\u012f\\\3\2\2\2\u0130\u0131"+
		"\7o\2\2\u0131\u0132\7w\2\2\u0132\u0133\7v\2\2\u0133\u0134\7c\2\2\u0134"+
		"\u0135\7d\2\2\u0135\u0136\7n\2\2\u0136\u0137\7g\2\2\u0137^\3\2\2\2\u0138"+
		"\u0139\7<\2\2\u0139`\3\2\2\2\u013a\u013b\7]\2\2\u013bb\3\2\2\2\u013c\u013d"+
		"\7?\2\2\u013d\u013e\7?\2\2\u013ed\3\2\2\2\u013f\u0140\7~\2\2\u0140f\3"+
		"\2\2\2\u0141\u0142\7y\2\2\u0142\u0143\7k\2\2\u0143\u0144\7v\2\2\u0144"+
		"\u0145\7j\2\2\u0145h\3\2\2\2\u0146\u0147\7@\2\2\u0147j\3\2\2\2\u0148\u0149"+
		"\7-\2\2\u0149\u014a\7\60\2\2\u014al\3\2\2\2\u014b\u014c\7q\2\2\u014c\u014d"+
		"\7t\2\2\u014dn\3\2\2\2\u014e\u014f\7/\2\2\u014f\u0150\7\60\2\2\u0150p"+
		"\3\2\2\2\u0151\u0152\7g\2\2\u0152\u0153\7n\2\2\u0153\u0154\7u\2\2\u0154"+
		"\u0155\7g\2\2\u0155r\3\2\2\2\u0156\u0157\7d\2\2\u0157\u0158\7g\2\2\u0158"+
		"\u0159\7i\2\2\u0159\u015a\7k\2\2\u015a\u015b\7p\2\2\u015bt\3\2\2\2\u015c"+
		"\u015d\7k\2\2\u015d\u015e\7p\2\2\u015ev\3\2\2\2\u015f\u0160\7g\2\2\u0160"+
		"\u0161\7p\2\2\u0161\u0162\7f\2\2\u0162x\3\2\2\2\u0163\u0164\7+\2\2\u0164"+
		"z\3\2\2\2\u0165\u0166\7c\2\2\u0166\u0167\7p\2\2\u0167\u0168\7f\2\2\u0168"+
		"|\3\2\2\2\u0169\u016a\7p\2\2\u016a\u016b\7q\2\2\u016b\u016c\7v\2\2\u016c"+
		"~\3\2\2\2\u016d\u016e\7/\2\2\u016e\u0080\3\2\2\2\u016f\u017a\7b\2\2\u0170"+
		"\u0179\n\2\2\2\u0171\u0176\7^\2\2\u0172\u0177\t\3\2\2\u0173\u0174\t\4"+
		"\2\2\u0174\u0175\t\4\2\2\u0175\u0177\t\4\2\2\u0176\u0172\3\2\2\2\u0176"+
		"\u0173\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0170\3\2\2\2\u0178\u0171\3\2"+
		"\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7b\2\2\u017e\u0082\3\2"+
		"\2\2\u017f\u0181\t\5\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\bB"+
		"\2\2\u0185\u0084\3\2\2\2\u0186\u0188\t\4\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0086\3\2"+
		"\2\2\u018b\u018f\7*\2\2\u018c\u018e\t\5\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7+\2\2\u0193\u0088\3\2\2\2\u0194"+
		"\u0195\7]\2\2\u0195\u0196\7~\2\2\u0196\u019a\3\2\2\2\u0197\u0199\t\5\2"+
		"\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7~\2\2\u019e"+
		"\u019f\7_\2\2\u019f\u008a\3\2\2\2\u01a0\u01ab\7$\2\2\u01a1\u01aa\n\6\2"+
		"\2\u01a2\u01a7\7^\2\2\u01a3\u01a8\t\7\2\2\u01a4\u01a5\t\4\2\2\u01a5\u01a6"+
		"\t\4\2\2\u01a6\u01a8\t\4\2\2\u01a7\u01a3\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01a2\3\2\2\2\u01aa\u01ad\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01af\7$\2\2\u01af\u008c\3\2\2\2\u01b0\u01b4\7]\2"+
		"\2\u01b1\u01b3\t\5\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b8\7_\2\2\u01b8\u008e\3\2\2\2\u01b9\u01bb\t\4\2\2\u01ba\u01b9\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c2\7\60\2\2\u01bf\u01c1\t\4\2\2\u01c0\u01bf\3"+
		"\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u0090\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7a\2\2\u01c6\u0092\3\2"+
		"\2\2\u01c7\u01c8\7h\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb"+
		"\7u\2\2\u01cb\u01d1\7g\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce\7t\2\2\u01ce"+
		"\u01cf\7w\2\2\u01cf\u01d1\7g\2\2\u01d0\u01c7\3\2\2\2\u01d0\u01cc\3\2\2"+
		"\2\u01d1\u0094\3\2\2\2\u01d2\u01d6\t\b\2\2\u01d3\u01d5\t\t\2\2\u01d4\u01d3"+
		"\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u0096\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01dd\t\n\2\2\u01da\u01dc\t\t"+
		"\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u0098\3\2\2\2\u01df\u01dd\3\2\2\2\23\2\u0176\u0178"+
		"\u017a\u0182\u0189\u018f\u019a\u01a7\u01a9\u01ab\u01b4\u01bc\u01c2\u01d0"+
		"\u01d6\u01dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}