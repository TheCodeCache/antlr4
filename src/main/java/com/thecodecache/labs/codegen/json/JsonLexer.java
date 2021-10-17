// Generated from Json.g4 by ANTLR 4.4

package com.thecodecache.labs.codegen.json;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, SINGLE_STRING=7, DOUBLE_STRING=8, 
		IDENTIFIER=9, WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "SINGLE_STRING", "DOUBLE_STRING", 
		"IDENTIFIER", "WS"
	};


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Json.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fF\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\6\b-\n\b\r\b\16\b.\3\b\3\b\3\t\3\t\6\t\65\n\t\r\t\16"+
		"\t\66\3\t\3\t\3\n\6\n<\n\n\r\n\16\n=\3\13\6\13A\n\13\r\13\16\13B\3\13"+
		"\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\6\3\2))"+
		"\3\2$$\5\2\62;C\\c|\5\2\13\f\17\17\"\"I\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\34\3\2\2\2\7\36\3\2\2\2\t \3"+
		"\2\2\2\13\"\3\2\2\2\r$\3\2\2\2\17*\3\2\2\2\21\62\3\2\2\2\23;\3\2\2\2\25"+
		"@\3\2\2\2\27\30\7v\2\2\30\31\7t\2\2\31\32\7w\2\2\32\33\7g\2\2\33\4\3\2"+
		"\2\2\34\35\7<\2\2\35\6\3\2\2\2\36\37\7}\2\2\37\b\3\2\2\2 !\7.\2\2!\n\3"+
		"\2\2\2\"#\7\177\2\2#\f\3\2\2\2$%\7h\2\2%&\7c\2\2&\'\7n\2\2\'(\7u\2\2("+
		")\7g\2\2)\16\3\2\2\2*,\7)\2\2+-\n\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\60\3\2\2\2\60\61\7)\2\2\61\20\3\2\2\2\62\64\7$\2\2\63\65\n"+
		"\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2"+
		"\2\289\7$\2\29\22\3\2\2\2:<\t\4\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>\24\3\2\2\2?A\t\5\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C"+
		"D\3\2\2\2DE\b\13\2\2E\26\3\2\2\2\7\2.\66=B\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}