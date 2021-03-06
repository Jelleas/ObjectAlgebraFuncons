// Generated from  by ANTLR 4.2.2

package camllightnocollections.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLNoColLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__61=1, T__60=2, T__59=3, T__58=4, T__57=5, T__56=6, T__55=7, T__54=8, 
		T__53=9, T__52=10, T__51=11, T__50=12, T__49=13, T__48=14, T__47=15, T__46=16, 
		T__45=17, T__44=18, T__43=19, T__42=20, T__41=21, T__40=22, T__39=23, 
		T__38=24, T__37=25, T__36=26, T__35=27, T__34=28, T__33=29, T__32=30, 
		T__31=31, T__30=32, T__29=33, T__28=34, T__27=35, T__26=36, T__25=37, 
		T__24=38, T__23=39, T__22=40, T__21=41, T__20=42, T__19=43, T__18=44, 
		T__17=45, T__16=46, T__15=47, T__14=48, T__13=49, T__12=50, T__11=51, 
		T__10=52, T__9=53, T__8=54, T__7=55, T__6=56, T__5=57, T__4=58, T__3=59, 
		T__2=60, T__1=61, T__0=62, CHARTOKEN=63, NULLTOKEN=64, EMPTYLISTTOKEN=65, 
		EMPTYARRAYTOKEN=66, WILDCARDTOKEN=67, BOOLTOKEN=68, CARRIAGERETURN=69, 
		FORMFEED=70, WS=71, COMMENT=72, INTTOKEN=73, STRINGTOKEN=74, FLOATTOKEN=75, 
		LINEFEED=76, HORIZONTALTAB=77, IDTOKEN=78, CONSTRTOKEN=79;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'fun'", "'!='", "'{'", "'while'", "'&&'", "'**'", "'='", "'for'", "'^'", 
		"'do'", "'('", "'rec'", "','", "'done'", "'mod'", "'>='", "'<'", "';;'", 
		"'*.'", "'type'", "'<>'", "'let'", "'match'", "'function'", "'downto'", 
		"'then'", "'+'", "'/'", "'as'", "'of'", "';'", "'||'", "'/.'", "'}'", 
		"'if'", "'try'", "':='", "'<='", "'&'", "'''", "'*'", "'exception'", "'->'", 
		"'to'", "'mutable'", "':'", "'=='", "'|'", "'with'", "'>'", "'+.'", "'or'", 
		"'-.'", "'!'", "'else'", "'begin'", "'in'", "'end'", "')'", "'and'", "'not'", 
		"'-'", "CHARTOKEN", "NULLTOKEN", "EMPTYLISTTOKEN", "EMPTYARRAYTOKEN", 
		"'_'", "BOOLTOKEN", "CARRIAGERETURN", "FORMFEED", "WS", "COMMENT", "INTTOKEN", 
		"STRINGTOKEN", "FLOATTOKEN", "LINEFEED", "HORIZONTALTAB", "IDTOKEN", "CONSTRTOKEN"
	};
	public static final String[] ruleNames = {
		"T__61", "T__60", "T__59", "T__58", "T__57", "T__56", "T__55", "T__54", 
		"T__53", "T__52", "T__51", "T__50", "T__49", "T__48", "T__47", "T__46", 
		"T__45", "T__44", "T__43", "T__42", "T__41", "T__40", "T__39", "T__38", 
		"T__37", "T__36", "T__35", "T__34", "T__33", "T__32", "T__31", "T__30", 
		"T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", 
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "CHARTOKEN", "NULLTOKEN", "EMPTYLISTTOKEN", 
		"EMPTYARRAYTOKEN", "WILDCARDTOKEN", "BOOLTOKEN", "CARRIAGERETURN", "FORMFEED", 
		"WS", "COMMENT", "INTTOKEN", "STRINGTOKEN", "FLOATTOKEN", "LINEFEED", 
		"HORIZONTALTAB", "IDTOKEN", "CONSTRTOKEN"
	};


	public CLNoColLexer(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2Q\u0215\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3"+
		"\67\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3<\3<\3=\3="+
		"\3=\3=\3>\3>\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3@\5@\u0182\n@\7@\u0184\n@"+
		"\f@\16@\u0187\13@\3@\3@\3A\3A\7A\u018d\nA\fA\16A\u0190\13A\3A\3A\3B\3"+
		"B\7B\u0196\nB\fB\16B\u0199\13B\3B\3B\3C\3C\3C\3C\7C\u01a1\nC\fC\16C\u01a4"+
		"\13C\3C\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u01b4\nE\3F\6F\u01b7"+
		"\nF\rF\16F\u01b8\3F\3F\3G\6G\u01be\nG\rG\16G\u01bf\3G\3G\3H\6H\u01c5\n"+
		"H\rH\16H\u01c6\3H\3H\3I\3I\3I\3I\7I\u01cf\nI\fI\16I\u01d2\13I\3I\3I\3"+
		"I\3I\3I\3J\6J\u01da\nJ\rJ\16J\u01db\3K\3K\3K\3K\3K\3K\3K\5K\u01e5\nK\7"+
		"K\u01e7\nK\fK\16K\u01ea\13K\3K\3K\3L\6L\u01ef\nL\rL\16L\u01f0\3L\3L\7"+
		"L\u01f5\nL\fL\16L\u01f8\13L\3M\6M\u01fb\nM\rM\16M\u01fc\3M\3M\3N\6N\u0202"+
		"\nN\rN\16N\u0203\3N\3N\3O\3O\7O\u020a\nO\fO\16O\u020d\13O\3P\3P\7P\u0211"+
		"\nP\fP\16P\u0214\13P\3\u01d0\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"N\u009bO\u009dP\u009fQ\3\2\17\4\2^^bb\b\2^^bbddppttvv\3\2\62;\3\2\"\""+
		"\4\2\17\17))\4\2\16\16))\4\2$$^^\b\2$$^^ddppttvv\4\2\f\f))\4\2\13\13)"+
		")\4\2aac|\6\2\62;C\\aac|\3\2C\\\u0229\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3\u00a1\3\2\2\2\5\u00a5\3\2\2"+
		"\2\7\u00a8\3\2\2\2\t\u00aa\3\2\2\2\13\u00b0\3\2\2\2\r\u00b3\3\2\2\2\17"+
		"\u00b6\3\2\2\2\21\u00b8\3\2\2\2\23\u00bc\3\2\2\2\25\u00be\3\2\2\2\27\u00c1"+
		"\3\2\2\2\31\u00c3\3\2\2\2\33\u00c7\3\2\2\2\35\u00c9\3\2\2\2\37\u00ce\3"+
		"\2\2\2!\u00d2\3\2\2\2#\u00d5\3\2\2\2%\u00d7\3\2\2\2\'\u00da\3\2\2\2)\u00dd"+
		"\3\2\2\2+\u00e2\3\2\2\2-\u00e5\3\2\2\2/\u00e9\3\2\2\2\61\u00ef\3\2\2\2"+
		"\63\u00f8\3\2\2\2\65\u00ff\3\2\2\2\67\u0104\3\2\2\29\u0106\3\2\2\2;\u0108"+
		"\3\2\2\2=\u010b\3\2\2\2?\u010e\3\2\2\2A\u0110\3\2\2\2C\u0113\3\2\2\2E"+
		"\u0116\3\2\2\2G\u0118\3\2\2\2I\u011b\3\2\2\2K\u011f\3\2\2\2M\u0122\3\2"+
		"\2\2O\u0125\3\2\2\2Q\u0127\3\2\2\2S\u0129\3\2\2\2U\u012b\3\2\2\2W\u0135"+
		"\3\2\2\2Y\u0138\3\2\2\2[\u013b\3\2\2\2]\u0143\3\2\2\2_\u0145\3\2\2\2a"+
		"\u0148\3\2\2\2c\u014a\3\2\2\2e\u014f\3\2\2\2g\u0151\3\2\2\2i\u0154\3\2"+
		"\2\2k\u0157\3\2\2\2m\u015a\3\2\2\2o\u015c\3\2\2\2q\u0161\3\2\2\2s\u0167"+
		"\3\2\2\2u\u016a\3\2\2\2w\u016e\3\2\2\2y\u0170\3\2\2\2{\u0174\3\2\2\2}"+
		"\u0178\3\2\2\2\177\u017a\3\2\2\2\u0081\u018a\3\2\2\2\u0083\u0193\3\2\2"+
		"\2\u0085\u019c\3\2\2\2\u0087\u01a8\3\2\2\2\u0089\u01b3\3\2\2\2\u008b\u01b6"+
		"\3\2\2\2\u008d\u01bd\3\2\2\2\u008f\u01c4\3\2\2\2\u0091\u01ca\3\2\2\2\u0093"+
		"\u01d9\3\2\2\2\u0095\u01dd\3\2\2\2\u0097\u01ee\3\2\2\2\u0099\u01fa\3\2"+
		"\2\2\u009b\u0201\3\2\2\2\u009d\u0207\3\2\2\2\u009f\u020e\3\2\2\2\u00a1"+
		"\u00a2\7h\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7p\2\2\u00a4\4\3\2\2\2\u00a5"+
		"\u00a6\7#\2\2\u00a6\u00a7\7?\2\2\u00a7\6\3\2\2\2\u00a8\u00a9\7}\2\2\u00a9"+
		"\b\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\n\3\2\2\2\u00b0\u00b1\7(\2\2\u00b1"+
		"\u00b2\7(\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4\u00b5\7,\2\2\u00b5"+
		"\16\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7\20\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9"+
		"\u00ba\7q\2\2\u00ba\u00bb\7t\2\2\u00bb\22\3\2\2\2\u00bc\u00bd\7`\2\2\u00bd"+
		"\24\3\2\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7q\2\2\u00c0\26\3\2\2\2\u00c1"+
		"\u00c2\7*\2\2\u00c2\30\3\2\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7e\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7.\2\2\u00c8\34\3\2\2\2\u00c9"+
		"\u00ca\7f\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\36\3\2\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7"+
		"f\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4\7?\2\2\u00d4\"\3\2"+
		"\2\2\u00d5\u00d6\7>\2\2\u00d6$\3\2\2\2\u00d7\u00d8\7=\2\2\u00d8\u00d9"+
		"\7=\2\2\u00d9&\3\2\2\2\u00da\u00db\7,\2\2\u00db\u00dc\7\60\2\2\u00dc("+
		"\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7{\2\2\u00df\u00e0\7r\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e4\7@\2\2\u00e4"+
		",\3\2\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		".\3\2\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7v\2\2\u00ec"+
		"\u00ed\7e\2\2\u00ed\u00ee\7j\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7h\2\2\u00f0"+
		"\u00f1\7w\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7v\2\2"+
		"\u00f4\u00f5\7k\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7p\2\2\u00f7\62\3\2"+
		"\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7y\2\2\u00fb\u00fc"+
		"\7p\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7q\2\2\u00fe\64\3\2\2\2\u00ff\u0100"+
		"\7v\2\2\u0100\u0101\7j\2\2\u0101\u0102\7g\2\2\u0102\u0103\7p\2\2\u0103"+
		"\66\3\2\2\2\u0104\u0105\7-\2\2\u01058\3\2\2\2\u0106\u0107\7\61\2\2\u0107"+
		":\3\2\2\2\u0108\u0109\7c\2\2\u0109\u010a\7u\2\2\u010a<\3\2\2\2\u010b\u010c"+
		"\7q\2\2\u010c\u010d\7h\2\2\u010d>\3\2\2\2\u010e\u010f\7=\2\2\u010f@\3"+
		"\2\2\2\u0110\u0111\7~\2\2\u0111\u0112\7~\2\2\u0112B\3\2\2\2\u0113\u0114"+
		"\7\61\2\2\u0114\u0115\7\60\2\2\u0115D\3\2\2\2\u0116\u0117\7\177\2\2\u0117"+
		"F\3\2\2\2\u0118\u0119\7k\2\2\u0119\u011a\7h\2\2\u011aH\3\2\2\2\u011b\u011c"+
		"\7v\2\2\u011c\u011d\7t\2\2\u011d\u011e\7{\2\2\u011eJ\3\2\2\2\u011f\u0120"+
		"\7<\2\2\u0120\u0121\7?\2\2\u0121L\3\2\2\2\u0122\u0123\7>\2\2\u0123\u0124"+
		"\7?\2\2\u0124N\3\2\2\2\u0125\u0126\7(\2\2\u0126P\3\2\2\2\u0127\u0128\7"+
		")\2\2\u0128R\3\2\2\2\u0129\u012a\7,\2\2\u012aT\3\2\2\2\u012b\u012c\7g"+
		"\2\2\u012c\u012d\7z\2\2\u012d\u012e\7e\2\2\u012e\u012f\7g\2\2\u012f\u0130"+
		"\7r\2\2\u0130\u0131\7v\2\2\u0131\u0132\7k\2\2\u0132\u0133\7q\2\2\u0133"+
		"\u0134\7p\2\2\u0134V\3\2\2\2\u0135\u0136\7/\2\2\u0136\u0137\7@\2\2\u0137"+
		"X\3\2\2\2\u0138\u0139\7v\2\2\u0139\u013a\7q\2\2\u013aZ\3\2\2\2\u013b\u013c"+
		"\7o\2\2\u013c\u013d\7w\2\2\u013d\u013e\7v\2\2\u013e\u013f\7c\2\2\u013f"+
		"\u0140\7d\2\2\u0140\u0141\7n\2\2\u0141\u0142\7g\2\2\u0142\\\3\2\2\2\u0143"+
		"\u0144\7<\2\2\u0144^\3\2\2\2\u0145\u0146\7?\2\2\u0146\u0147\7?\2\2\u0147"+
		"`\3\2\2\2\u0148\u0149\7~\2\2\u0149b\3\2\2\2\u014a\u014b\7y\2\2\u014b\u014c"+
		"\7k\2\2\u014c\u014d\7v\2\2\u014d\u014e\7j\2\2\u014ed\3\2\2\2\u014f\u0150"+
		"\7@\2\2\u0150f\3\2\2\2\u0151\u0152\7-\2\2\u0152\u0153\7\60\2\2\u0153h"+
		"\3\2\2\2\u0154\u0155\7q\2\2\u0155\u0156\7t\2\2\u0156j\3\2\2\2\u0157\u0158"+
		"\7/\2\2\u0158\u0159\7\60\2\2\u0159l\3\2\2\2\u015a\u015b\7#\2\2\u015bn"+
		"\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e\7n\2\2\u015e\u015f\7u\2\2\u015f"+
		"\u0160\7g\2\2\u0160p\3\2\2\2\u0161\u0162\7d\2\2\u0162\u0163\7g\2\2\u0163"+
		"\u0164\7i\2\2\u0164\u0165\7k\2\2\u0165\u0166\7p\2\2\u0166r\3\2\2\2\u0167"+
		"\u0168\7k\2\2\u0168\u0169\7p\2\2\u0169t\3\2\2\2\u016a\u016b\7g\2\2\u016b"+
		"\u016c\7p\2\2\u016c\u016d\7f\2\2\u016dv\3\2\2\2\u016e\u016f\7+\2\2\u016f"+
		"x\3\2\2\2\u0170\u0171\7c\2\2\u0171\u0172\7p\2\2\u0172\u0173\7f\2\2\u0173"+
		"z\3\2\2\2\u0174\u0175\7p\2\2\u0175\u0176\7q\2\2\u0176\u0177\7v\2\2\u0177"+
		"|\3\2\2\2\u0178\u0179\7/\2\2\u0179~\3\2\2\2\u017a\u0185\7b\2\2\u017b\u0184"+
		"\n\2\2\2\u017c\u0181\7^\2\2\u017d\u0182\t\3\2\2\u017e\u017f\t\4\2\2\u017f"+
		"\u0180\t\4\2\2\u0180\u0182\t\4\2\2\u0181\u017d\3\2\2\2\u0181\u017e\3\2"+
		"\2\2\u0182\u0184\3\2\2\2\u0183\u017b\3\2\2\2\u0183\u017c\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7b\2\2\u0189\u0080\3\2\2\2\u018a"+
		"\u018e\7*\2\2\u018b\u018d\t\5\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\7+\2\2\u0192\u0082\3\2\2\2\u0193\u0197\7]\2"+
		"\2\u0194\u0196\t\5\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019b\7_\2\2\u019b\u0084\3\2\2\2\u019c\u019d\7]\2\2\u019d\u019e\7~\2"+
		"\2\u019e\u01a2\3\2\2\2\u019f\u01a1\t\5\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a6\7~\2\2\u01a6\u01a7\7_\2\2\u01a7\u0086\3\2\2"+
		"\2\u01a8\u01a9\7a\2\2\u01a9\u0088\3\2\2\2\u01aa\u01ab\7h\2\2\u01ab\u01ac"+
		"\7c\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7u\2\2\u01ae\u01b4\7g\2\2\u01af"+
		"\u01b0\7v\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2\7w\2\2\u01b2\u01b4\7g\2\2"+
		"\u01b3\u01aa\3\2\2\2\u01b3\u01af\3\2\2\2\u01b4\u008a\3\2\2\2\u01b5\u01b7"+
		"\t\6\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\bF\2\2\u01bb\u008c\3\2"+
		"\2\2\u01bc\u01be\t\7\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\bG"+
		"\2\2\u01c2\u008e\3\2\2\2\u01c3\u01c5\t\5\2\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01c9\bH\2\2\u01c9\u0090\3\2\2\2\u01ca\u01cb\7*\2\2\u01cb\u01cc"+
		"\7,\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cf\13\2\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u01d2\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7,\2\2\u01d4\u01d5\7+\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\u01d7\bI\2\2\u01d7\u0092\3\2\2\2\u01d8\u01da\t\4\2\2\u01d9"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u0094\3\2\2\2\u01dd\u01e8\7$\2\2\u01de\u01e7\n\b\2\2\u01df"+
		"\u01e4\7^\2\2\u01e0\u01e5\t\t\2\2\u01e1\u01e2\t\4\2\2\u01e2\u01e3\t\4"+
		"\2\2\u01e3\u01e5\t\4\2\2\u01e4\u01e0\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6\u01df\3\2\2\2\u01e7\u01ea\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01eb\u01ec\7$\2\2\u01ec\u0096\3\2\2\2\u01ed\u01ef\t\4"+
		"\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f6\7\60\2\2\u01f3\u01f5\t"+
		"\4\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u0098\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fb\t\n"+
		"\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\bM\2\2\u01ff\u009a\3\2"+
		"\2\2\u0200\u0202\t\13\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\bN"+
		"\2\2\u0206\u009c\3\2\2\2\u0207\u020b\t\f\2\2\u0208\u020a\t\r\2\2\u0209"+
		"\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u009e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0212\t\16\2\2\u020f"+
		"\u0211\t\r\2\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u00a0\3\2\2\2\u0214\u0212\3\2\2\2\30\2"+
		"\u0181\u0183\u0185\u018e\u0197\u01a2\u01b3\u01b8\u01bf\u01c6\u01d0\u01db"+
		"\u01e4\u01e6\u01e8\u01f0\u01f6\u01fc\u0203\u020b\u0212\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}