// Generated from C:/Users/tanya/Documents/University/PBL2.0/DSL2.0/DSL_TAX_CALC\DSL.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	public static final int
			T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
			T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
			T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24,
			T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31,
			T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38,
			T__38=39, T__39=40, INT=41, FLOAT=42, STRING=43, WS=44;
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u021e\b\1\4\2\t"+
					"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
					",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
					"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
					"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
					"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
					"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
					"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
					"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
					"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
					"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
					"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
					"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
					"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
					"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
					"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
					"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
					"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
					"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
					"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
					"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
					"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
					"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
					"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
					"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
					"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
					"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
					"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
					"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
					"\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'"+
					"\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\6*\u020e\n*\r*\16*\u020f\3"+
					"+\3+\3+\3+\3,\6,\u0217\n,\r,\16,\u0218\3-\3-\3-\3-\2\2.\3\3\5\4\7\5\t"+
					"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
					"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
					"%I&K\'M(O)Q*S+U,W-Y.\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u021f"+
					"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
					"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
					"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
					"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
					"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
					"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
					"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
					"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5a\3\2\2\2\7e\3\2\2\2\tj\3"+
					"\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21y\3\2\2\2\23~\3\2\2\2\25\u0084"+
					"\3\2\2\2\27\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u009b\3\2\2\2\35\u00a9\3"+
					"\2\2\2\37\u00b9\3\2\2\2!\u00cd\3\2\2\2#\u00e3\3\2\2\2%\u00f6\3\2\2\2\'"+
					"\u0105\3\2\2\2)\u0116\3\2\2\2+\u012b\3\2\2\2-\u0142\3\2\2\2/\u0156\3\2"+
					"\2\2\61\u0169\3\2\2\2\63\u0178\3\2\2\2\65\u0187\3\2\2\2\67\u018f\3\2\2"+
					"\29\u01a0\3\2\2\2;\u01aa\3\2\2\2=\u01b6\3\2\2\2?\u01c6\3\2\2\2A\u01d4"+
					"\3\2\2\2C\u01e4\3\2\2\2E\u01ee\3\2\2\2G\u01f2\3\2\2\2I\u01f6\3\2\2\2K"+
					"\u01fa\3\2\2\2M\u01fe\3\2\2\2O\u0203\3\2\2\2Q\u0206\3\2\2\2S\u020d\3\2"+
					"\2\2U\u0211\3\2\2\2W\u0216\3\2\2\2Y\u021a\3\2\2\2[\\\7d\2\2\\]\7g\2\2"+
					"]^\7i\2\2^_\7k\2\2_`\7p\2\2`\4\3\2\2\2ab\7g\2\2bc\7p\2\2cd\7f\2\2d\6\3"+
					"\2\2\2ef\7p\2\2fg\7c\2\2gh\7o\2\2hi\7g\2\2i\b\3\2\2\2jk\7/\2\2kl\7@\2"+
					"\2l\n\3\2\2\2mn\7}\2\2n\f\3\2\2\2op\7\177\2\2p\16\3\2\2\2qr\7e\2\2rs\7"+
					"c\2\2st\7n\2\2tu\7e\2\2uv\7H\2\2vw\7q\2\2wx\7t\2\2x\20\3\2\2\2yz\7u\2"+
					"\2z{\7g\2\2{|\7t\2\2|}\7x\2\2}\22\3\2\2\2~\177\7u\2\2\177\u0080\7g\2\2"+
					"\u0080\u0081\7t\2\2\u0081\u0082\7x\2\2\u0082\u0083\7P\2\2\u0083\24\3\2"+
					"\2\2\u0084\u0085\7u\2\2\u0085\u0086\7q\2\2\u0086\u0087\7e\2\2\u0087\u0088"+
					"\7k\2\2\u0088\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a\u008b\7H\2\2\u008b"+
					"\u008c\7w\2\2\u008c\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e\26\3\2\2\2\u008f"+
					"\u0090\7\'\2\2\u0090\30\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7z\2\2"+
					"\u0093\u0094\7g\2\2\u0094\u0095\7o\2\2\u0095\u0096\7r\2\2\u0096\u0097"+
					"\7v\2\2\u0097\u0098\7k\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a"+
					"\32\3\2\2\2\u009b\u009c\7r\2\2\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e"+
					"\u009f\7x\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7g\2\2"+
					"\u00a2\u00a3\7U\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6"+
					"\7v\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7t\2\2\u00a8\34\3\2\2\2\u00a9\u00aa"+
					"\7j\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad\7j\2\2\u00ad"+
					"\u00ae\7g\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1\7f\2\2"+
					"\u00b1\u00b2\7w\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5"+
					"\7v\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8"+
					"\36\3\2\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7f\2\2\u00bc"+
					"\u00bd\7k\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7n\2\2"+
					"\u00c0\u00c1\7K\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4"+
					"\7v\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7w\2\2\u00c7"+
					"\u00c8\7v\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7p\2\2"+
					"\u00cb\u00cc\7u\2\2\u00cc \3\2\2\2\u00cd\u00ce\7d\2\2\u00ce\u00cf\7w\2"+
					"\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7i\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3"+
					"\7v\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7{\2\2\u00d6"+
					"\u00d7\7K\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7v\2\2"+
					"\u00da\u00db\7k\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de"+
					"\7v\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7p\2\2\u00e1"+
					"\u00e2\7u\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7w\2\2\u00e5"+
					"\u00e6\7d\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7e\2\2"+
					"\u00e9\u00ea\7K\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed"+
					"\7v\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7w\2\2\u00f0"+
					"\u00f1\7v\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2"+
					"\u00f4\u00f5\7u\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7t\2"+
					"\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7x\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc"+
					"\7v\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7U\2\2\u00fe\u00ff\7g\2\2\u00ff"+
					"\u0100\7e\2\2\u0100\u0101\7v\2\2\u0101\u0102\7q\2\2\u0102\u0103\7t\2\2"+
					"\u0103\u0104\7U\2\2\u0104&\3\2\2\2\u0105\u0106\7j\2\2\u0106\u0107\7k\2"+
					"\2\u0107\u0108\7i\2\2\u0108\u0109\7j\2\2\u0109\u010a\7g\2\2\u010a\u010b"+
					"\7t\2\2\u010b\u010c\7G\2\2\u010c\u010d\7f\2\2\u010d\u010e\7w\2\2\u010e"+
					"\u010f\7e\2\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2\u0111\u0112\7k\2\2"+
					"\u0112\u0113\7q\2\2\u0113\u0114\7p\2\2\u0114\u0115\7U\2\2\u0115(\3\2\2"+
					"\2\u0116\u0117\7o\2\2\u0117\u0118\7g\2\2\u0118\u0119\7f\2\2\u0119\u011a"+
					"\7k\2\2\u011a\u011b\7e\2\2\u011b\u011c\7c\2\2\u011c\u011d\7n\2\2\u011d"+
					"\u011e\7K\2\2\u011e\u011f\7p\2\2\u011f\u0120\7u\2\2\u0120\u0121\7v\2\2"+
					"\u0121\u0122\7k\2\2\u0122\u0123\7v\2\2\u0123\u0124\7w\2\2\u0124\u0125"+
					"\7v\2\2\u0125\u0126\7k\2\2\u0126\u0127\7q\2\2\u0127\u0128\7p\2\2\u0128"+
					"\u0129\7u\2\2\u0129\u012a\7U\2\2\u012a*\3\2\2\2\u012b\u012c\7d\2\2\u012c"+
					"\u012d\7w\2\2\u012d\u012e\7f\2\2\u012e\u012f\7i\2\2\u012f\u0130\7g\2\2"+
					"\u0130\u0131\7v\2\2\u0131\u0132\7c\2\2\u0132\u0133\7t\2\2\u0133\u0134"+
					"\7{\2\2\u0134\u0135\7K\2\2\u0135\u0136\7p\2\2\u0136\u0137\7u\2\2\u0137"+
					"\u0138\7v\2\2\u0138\u0139\7k\2\2\u0139\u013a\7v\2\2\u013a\u013b\7w\2\2"+
					"\u013b\u013c\7v\2\2\u013c\u013d\7k\2\2\u013d\u013e\7q\2\2\u013e\u013f"+
					"\7p\2\2\u013f\u0140\7u\2\2\u0140\u0141\7U\2\2\u0141,\3\2\2\2\u0142\u0143"+
					"\7r\2\2\u0143\u0144\7w\2\2\u0144\u0145\7d\2\2\u0145\u0146\7n\2\2\u0146"+
					"\u0147\7k\2\2\u0147\u0148\7e\2\2\u0148\u0149\7K\2\2\u0149\u014a\7p\2\2"+
					"\u014a\u014b\7u\2\2\u014b\u014c\7v\2\2\u014c\u014d\7k\2\2\u014d\u014e"+
					"\7v\2\2\u014e\u014f\7w\2\2\u014f\u0150\7v\2\2\u0150\u0151\7k\2\2\u0151"+
					"\u0152\7q\2\2\u0152\u0153\7p\2\2\u0153\u0154\7u\2\2\u0154\u0155\7U\2\2"+
					"\u0155.\3\2\2\2\u0156\u0157\7e\2\2\u0157\u0158\7q\2\2\u0158\u0159\7p\2"+
					"\2\u0159\u015a\7v\2\2\u015a\u015b\7t\2\2\u015b\u015c\7k\2\2\u015c\u015d"+
					"\7d\2\2\u015d\u015e\7R\2\2\u015e\u015f\7g\2\2\u015f\u0160\7p\2\2\u0160"+
					"\u0161\7u\2\2\u0161\u0162\7k\2\2\u0162\u0163\7q\2\2\u0163\u0164\7p\2\2"+
					"\u0164\u0165\7H\2\2\u0165\u0166\7w\2\2\u0166\u0167\7p\2\2\u0167\u0168"+
					"\7f\2\2\u0168\60\3\2\2\2\u0169\u016a\7o\2\2\u016a\u016b\7g\2\2\u016b\u016c"+
					"\7f\2\2\u016c\u016d\7K\2\2\u016d\u016e\7p\2\2\u016e\u016f\7u\2\2\u016f"+
					"\u0170\7G\2\2\u0170\u0171\7o\2\2\u0171\u0172\7r\2\2\u0172\u0173\7n\2\2"+
					"\u0173\u0174\7q\2\2\u0174\u0175\7{\2\2\u0175\u0176\7g\2\2\u0176\u0177"+
					"\7t\2\2\u0177\62\3\2\2\2\u0178\u0179\7o\2\2\u0179\u017a\7g\2\2\u017a\u017b"+
					"\7f\2\2\u017b\u017c\7K\2\2\u017c\u017d\7p\2\2\u017d\u017e\7u\2\2\u017e"+
					"\u017f\7G\2\2\u017f\u0180\7o\2\2\u0180\u0181\7r\2\2\u0181\u0182\7n\2\2"+
					"\u0182\u0183\7q\2\2\u0183\u0184\7{\2\2\u0184\u0185\7g\2\2\u0185\u0186"+
					"\7g\2\2\u0186\64\3\2\2\2\u0187\u0188\7k\2\2\u0188\u0189\7v\2\2\u0189\u018a"+
					"\7H\2\2\u018a\u018b\7k\2\2\u018b\u018c\7g\2\2\u018c\u018d\7n\2\2\u018d"+
					"\u018e\7f\2\2\u018e\66\3\2\2\2\u018f\u0190\7u\2\2\u0190\u0191\7{\2\2\u0191"+
					"\u0192\7p\2\2\u0192\u0193\7f\2\2\u0193\u0194\7k\2\2\u0194\u0195\7e\2\2"+
					"\u0195\u0196\7c\2\2\u0196\u0197\7v\2\2\u0197\u0198\7g\2\2\u0198\u0199"+
					"\7E\2\2\u0199\u019a\7q\2\2\u019a\u019b\7p\2\2\u019b\u019c\7v\2\2\u019c"+
					"\u019d\7t\2\2\u019d\u019e\7k\2\2\u019e\u019f\7d\2\2\u019f8\3\2\2\2\u01a0"+
					"\u01a1\7p\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7U\2\2"+
					"\u01a4\u01a5\7c\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8"+
					"\7t\2\2\u01a8\u01a9\7{\2\2\u01a9:\3\2\2\2\u01aa\u01ab\7i\2\2\u01ab\u01ac"+
					"\7t\2\2\u01ac\u01ad\7q\2\2\u01ad\u01ae\7u\2\2\u01ae\u01af\7u\2\2\u01af"+
					"\u01b0\7U\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\7c\2\2"+
					"\u01b3\u01b4\7t\2\2\u01b4\u01b5\7{\2\2\u01b5<\3\2\2\2\u01b6\u01b7\7e\2"+
					"\2\u01b7\u01b8\7c\2\2\u01b8\u01b9\7n\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb"+
					"\7I\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be\7u\2\2\u01be"+
					"\u01bf\7u\2\2\u01bf\u01c0\7U\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7n\2\2"+
					"\u01c2\u01c3\7c\2\2\u01c3\u01c4\7t\2\2\u01c4\u01c5\7{\2\2\u01c5>\3\2\2"+
					"\2\u01c6\u01c7\7e\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca"+
					"\7e\2\2\u01ca\u01cb\7P\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7v\2\2\u01cd"+
					"\u01ce\7U\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7n\2\2\u01d0\u01d1\7c\2\2"+
					"\u01d1\u01d2\7t\2\2\u01d2\u01d3\7{\2\2\u01d3@\3\2\2\2\u01d4\u01d5\7e\2"+
					"\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7n\2\2\u01d7\u01d8\7e\2\2\u01d8\u01d9"+
					"\7V\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7v\2\2\u01db\u01dc\7c\2\2\u01dc"+
					"\u01dd\7n\2\2\u01dd\u01de\7U\2\2\u01de\u01df\7c\2\2\u01df\u01e0\7n\2\2"+
					"\u01e0\u01e1\7c\2\2\u01e1\u01e2\7t\2\2\u01e2\u01e3\7{\2\2\u01e3B\3\2\2"+
					"\2\u01e4\u01e5\7e\2\2\u01e5\u01e6\7c\2\2\u01e6\u01e7\7n\2\2\u01e7\u01e8"+
					"\7e\2\2\u01e8\u01e9\7V\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7z\2\2\u01eb"+
					"\u01ec\7g\2\2\u01ec\u01ed\7u\2\2\u01edD\3\2\2\2\u01ee\u01ef\7o\2\2\u01ef"+
					"\u01f0\7f\2\2\u01f0\u01f1\7n\2\2\u01f1F\3\2\2\2\u01f2\u01f3\7g\2\2\u01f3"+
					"\u01f4\7w\2\2\u01f4\u01f5\7t\2\2\u01f5H\3\2\2\2\u01f6\u01f7\7w\2\2\u01f7"+
					"\u01f8\7u\2\2\u01f8\u01f9\7f\2\2\u01f9J\3\2\2\2\u01fa\u01fb\7{\2\2\u01fb"+
					"\u01fc\7g\2\2\u01fc\u01fd\7u\2\2\u01fdL\3\2\2\2\u01fe\u01ff\7v\2\2\u01ff"+
					"\u0200\7t\2\2\u0200\u0201\7w\2\2\u0201\u0202\7g\2\2\u0202N\3\2\2\2\u0203"+
					"\u0204\7p\2\2\u0204\u0205\7q\2\2\u0205P\3\2\2\2\u0206\u0207\7h\2\2\u0207"+
					"\u0208\7c\2\2\u0208\u0209\7n\2\2\u0209\u020a\7u\2\2\u020a\u020b\7g\2\2"+
					"\u020bR\3\2\2\2\u020c\u020e\t\2\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3"+
					"\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210T\3\2\2\2\u0211\u0212"+
					"\5S*\2\u0212\u0213\7\60\2\2\u0213\u0214\5S*\2\u0214V\3\2\2\2\u0215\u0217"+
					"\t\3\2\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218"+
					"\u0219\3\2\2\2\u0219X\3\2\2\2\u021a\u021b\t\4\2\2\u021b\u021c\3\2\2\2"+
					"\u021c\u021d\b-\2\2\u021dZ\3\2\2\2\5\2\u020f\u0218\3\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};
	public static final String[] ruleNames = makeRuleNames();
	public static String[] modeNames = {
			"DEFAULT_MODE"
	};
	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeRuleNames() {
		return new String[] {
				"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
				"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
				"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24",
				"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32",
				"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "INT",
				"FLOAT", "STRING", "WS"
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


	public DSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DSL.g4"; }

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

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'begin'", "'end'", "'name'", "'->'", "'{'", "'}'", "'calcFor'",
				"'serv'", "'servN'", "'socialFund'", "'%'", "'exemption'", "'privateSector'",
				"'higherEducation'", "'medicalInstitutions'", "'budgetaryInstitutions'",
				"'publicInstitutions'", "'privateSectorS'", "'higherEducationS'", "'medicalInstitutionsS'",
				"'budgetaryInstitutionsS'", "'publicInstitutionsS'", "'contribPensionFund'",
				"'medInsEmployer'", "'medInsEmployee'", "'itField'", "'syndicateContrib'",
				"'netSalary'", "'grossSalary'", "'calcGrossSalary'", "'calcNetSalary'",
				"'calcTotalSalary'", "'calcTaxes'", "'mdl'", "'eur'", "'usd'", "'yes'",
				"'true'", "'no'", "'false'"
		};
	}

	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, "INT", "FLOAT", "STRING", "WS"
		};
	}
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}