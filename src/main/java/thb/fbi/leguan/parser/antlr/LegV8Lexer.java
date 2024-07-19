// Generated from java-escape by ANTLR 4.11.1
package thb.fbi.leguan.parser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LegV8Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ArithmeticInstruction=1, ShiftInstruction=2, ImmediateInstruction=3, WideImmediateInstrcution=4, 
		DatatransferInstruction=5, ExclusiveInstruction=6, CondBranchInstruction=7, 
		B_cond_Instruction=8, BranchInstruction=9, BranchByRegisterInstruction=10, 
		DataSegmentInstruction=11, WS=12, COMMENT=13, LINE_COMMENT=14, COMMA=15, 
		SEMI=16, EQUALS_SIGN=17, SQUARE_BRACKET_LEFT=18, SQUARE_BRACKET_RIGHT=19, 
		REGISTER=20, NUMBER=21, SP=22, FP=23, LR=24, XZR=25, PointerDeclaration=26, 
		PointerReference=27, DataSegmentTypes=28, ASCII_String=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ArithmeticInstruction", "ShiftInstruction", "ImmediateInstruction", 
			"WideImmediateInstrcution", "DatatransferInstruction", "ExclusiveInstruction", 
			"CondBranchInstruction", "B_cond_Instruction", "BranchInstruction", "BranchByRegisterInstruction", 
			"DataSegmentInstruction", "WS", "COMMENT", "LINE_COMMENT", "COMMA", "SEMI", 
			"EQUALS_SIGN", "SQUARE_BRACKET_LEFT", "SQUARE_BRACKET_RIGHT", "REGISTER", 
			"NUMBER", "SP", "FP", "LR", "XZR", "PointerDeclaration", "PointerReference", 
			"DataSegmentTypes", "ASCII_String"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'STXR'", null, null, null, "'BR'", 
			"'LDR'", null, null, null, "','", "';'", "'='", "'['", "']'", null, null, 
			"'SP'", "'FP'", "'LR'", "'XZR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ArithmeticInstruction", "ShiftInstruction", "ImmediateInstruction", 
			"WideImmediateInstrcution", "DatatransferInstruction", "ExclusiveInstruction", 
			"CondBranchInstruction", "B_cond_Instruction", "BranchInstruction", "BranchByRegisterInstruction", 
			"DataSegmentInstruction", "WS", "COMMENT", "LINE_COMMENT", "COMMA", "SEMI", 
			"EQUALS_SIGN", "SQUARE_BRACKET_LEFT", "SQUARE_BRACKET_RIGHT", "REGISTER", 
			"NUMBER", "SP", "FP", "LR", "XZR", "PointerDeclaration", "PointerReference", 
			"DataSegmentTypes", "ASCII_String"
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


	public LegV8Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LegV8.g4"; }

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
		"\u0004\u0000\u001d\u0194\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000Z\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0087\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0091\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00be\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cc\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f6\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00fb\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u010c\b\f\n\f\f\f\u010f\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u011a\b\r\n\r\f\r\u011d\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0134\b\u0013\u0003\u0013\u0136\b\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u013a\b\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u013e\b\u0014"+
		"\n\u0014\f\u0014\u0141\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0148\b\u0014\n\u0014\f\u0014\u014b\t\u0014"+
		"\u0003\u0014\u014d\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u015e\b\u0019\n\u0019\f\u0019\u0161\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0167\b\u001a\n\u001a\f\u001a\u016a\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u018b\b\u001b\u0001\u001c\u0001\u001c\u0004\u001c"+
		"\u018f\b\u001c\u000b\u001c\f\u001c\u0190\u0001\u001c\u0001\u001c\u0001"+
		"\u010d\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d\u0001\u0000\t"+
		"\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r\u0001\u000019\u0001\u00000"+
		"9\u0003\u000019AFaf\u0003\u000009AFaf\u0002\u0000AZaz\u0003\u000009AZ"+
		"az\u0007\u0000  ,,..:;AZ__az\u01cb\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001"+
		"Y\u0001\u0000\u0000\u0000\u0003a\u0001\u0000\u0000\u0000\u0005\u0086\u0001"+
		"\u0000\u0000\u0000\u0007\u0090\u0001\u0000\u0000\u0000\t\u00bd\u0001\u0000"+
		"\u0000\u0000\u000b\u00bf\u0001\u0000\u0000\u0000\r\u00cb\u0001\u0000\u0000"+
		"\u0000\u000f\u00f5\u0001\u0000\u0000\u0000\u0011\u00fa\u0001\u0000\u0000"+
		"\u0000\u0013\u00fc\u0001\u0000\u0000\u0000\u0015\u00ff\u0001\u0000\u0000"+
		"\u0000\u0017\u0103\u0001\u0000\u0000\u0000\u0019\u0107\u0001\u0000\u0000"+
		"\u0000\u001b\u0115\u0001\u0000\u0000\u0000\u001d\u0120\u0001\u0000\u0000"+
		"\u0000\u001f\u0122\u0001\u0000\u0000\u0000!\u0124\u0001\u0000\u0000\u0000"+
		"#\u0126\u0001\u0000\u0000\u0000%\u0128\u0001\u0000\u0000\u0000\'\u0135"+
		"\u0001\u0000\u0000\u0000)\u014c\u0001\u0000\u0000\u0000+\u014e\u0001\u0000"+
		"\u0000\u0000-\u0151\u0001\u0000\u0000\u0000/\u0154\u0001\u0000\u0000\u0000"+
		"1\u0157\u0001\u0000\u0000\u00003\u015b\u0001\u0000\u0000\u00005\u0164"+
		"\u0001\u0000\u0000\u00007\u018a\u0001\u0000\u0000\u00009\u018c\u0001\u0000"+
		"\u0000\u0000;<\u0005A\u0000\u0000<=\u0005D\u0000\u0000=Z\u0005D\u0000"+
		"\u0000>?\u0005A\u0000\u0000?@\u0005D\u0000\u0000@A\u0005D\u0000\u0000"+
		"AZ\u0005S\u0000\u0000BC\u0005A\u0000\u0000CD\u0005N\u0000\u0000DZ\u0005"+
		"D\u0000\u0000EF\u0005A\u0000\u0000FG\u0005N\u0000\u0000GH\u0005D\u0000"+
		"\u0000HZ\u0005S\u0000\u0000IJ\u0005E\u0000\u0000JK\u0005O\u0000\u0000"+
		"KZ\u0005R\u0000\u0000LM\u0005O\u0000\u0000MN\u0005R\u0000\u0000NZ\u0005"+
		"R\u0000\u0000OP\u0005S\u0000\u0000PQ\u0005U\u0000\u0000QZ\u0005B\u0000"+
		"\u0000RS\u0005S\u0000\u0000ST\u0005U\u0000\u0000TU\u0005B\u0000\u0000"+
		"UZ\u0005S\u0000\u0000VW\u0005M\u0000\u0000WX\u0005U\u0000\u0000XZ\u0005"+
		"L\u0000\u0000Y;\u0001\u0000\u0000\u0000Y>\u0001\u0000\u0000\u0000YB\u0001"+
		"\u0000\u0000\u0000YE\u0001\u0000\u0000\u0000YI\u0001\u0000\u0000\u0000"+
		"YL\u0001\u0000\u0000\u0000YO\u0001\u0000\u0000\u0000YR\u0001\u0000\u0000"+
		"\u0000YV\u0001\u0000\u0000\u0000Z\u0002\u0001\u0000\u0000\u0000[\\\u0005"+
		"L\u0000\u0000\\]\u0005S\u0000\u0000]b\u0005L\u0000\u0000^_\u0005L\u0000"+
		"\u0000_`\u0005S\u0000\u0000`b\u0005R\u0000\u0000a[\u0001\u0000\u0000\u0000"+
		"a^\u0001\u0000\u0000\u0000b\u0004\u0001\u0000\u0000\u0000cd\u0005A\u0000"+
		"\u0000de\u0005D\u0000\u0000ef\u0005D\u0000\u0000f\u0087\u0005I\u0000\u0000"+
		"gh\u0005A\u0000\u0000hi\u0005D\u0000\u0000ij\u0005D\u0000\u0000jk\u0005"+
		"I\u0000\u0000k\u0087\u0005S\u0000\u0000lm\u0005A\u0000\u0000mn\u0005N"+
		"\u0000\u0000no\u0005D\u0000\u0000o\u0087\u0005I\u0000\u0000pq\u0005A\u0000"+
		"\u0000qr\u0005N\u0000\u0000rs\u0005D\u0000\u0000st\u0005I\u0000\u0000"+
		"t\u0087\u0005S\u0000\u0000uv\u0005E\u0000\u0000vw\u0005O\u0000\u0000w"+
		"x\u0005R\u0000\u0000x\u0087\u0005I\u0000\u0000yz\u0005O\u0000\u0000z{"+
		"\u0005R\u0000\u0000{|\u0005R\u0000\u0000|\u0087\u0005I\u0000\u0000}~\u0005"+
		"S\u0000\u0000~\u007f\u0005U\u0000\u0000\u007f\u0080\u0005B\u0000\u0000"+
		"\u0080\u0087\u0005I\u0000\u0000\u0081\u0082\u0005S\u0000\u0000\u0082\u0083"+
		"\u0005U\u0000\u0000\u0083\u0084\u0005B\u0000\u0000\u0084\u0085\u0005I"+
		"\u0000\u0000\u0085\u0087\u0005S\u0000\u0000\u0086c\u0001\u0000\u0000\u0000"+
		"\u0086g\u0001\u0000\u0000\u0000\u0086l\u0001\u0000\u0000\u0000\u0086p"+
		"\u0001\u0000\u0000\u0000\u0086u\u0001\u0000\u0000\u0000\u0086y\u0001\u0000"+
		"\u0000\u0000\u0086}\u0001\u0000\u0000\u0000\u0086\u0081\u0001\u0000\u0000"+
		"\u0000\u0087\u0006\u0001\u0000\u0000\u0000\u0088\u0089\u0005M\u0000\u0000"+
		"\u0089\u008a\u0005O\u0000\u0000\u008a\u008b\u0005V\u0000\u0000\u008b\u0091"+
		"\u0005K\u0000\u0000\u008c\u008d\u0005M\u0000\u0000\u008d\u008e\u0005O"+
		"\u0000\u0000\u008e\u008f\u0005V\u0000\u0000\u008f\u0091\u0005Z\u0000\u0000"+
		"\u0090\u0088\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000"+
		"\u0091\b\u0001\u0000\u0000\u0000\u0092\u0093\u0005L\u0000\u0000\u0093"+
		"\u0094\u0005D\u0000\u0000\u0094\u0095\u0005U\u0000\u0000\u0095\u00be\u0005"+
		"R\u0000\u0000\u0096\u0097\u0005L\u0000\u0000\u0097\u0098\u0005D\u0000"+
		"\u0000\u0098\u0099\u0005U\u0000\u0000\u0099\u009a\u0005R\u0000\u0000\u009a"+
		"\u00be\u0005B\u0000\u0000\u009b\u009c\u0005L\u0000\u0000\u009c\u009d\u0005"+
		"D\u0000\u0000\u009d\u009e\u0005U\u0000\u0000\u009e\u009f\u0005R\u0000"+
		"\u0000\u009f\u00be\u0005H\u0000\u0000\u00a0\u00a1\u0005L\u0000\u0000\u00a1"+
		"\u00a2\u0005D\u0000\u0000\u00a2\u00a3\u0005U\u0000\u0000\u00a3\u00a4\u0005"+
		"R\u0000\u0000\u00a4\u00a5\u0005S\u0000\u0000\u00a5\u00be\u0005W\u0000"+
		"\u0000\u00a6\u00a7\u0005L\u0000\u0000\u00a7\u00a8\u0005D\u0000\u0000\u00a8"+
		"\u00a9\u0005X\u0000\u0000\u00a9\u00be\u0005R\u0000\u0000\u00aa\u00ab\u0005"+
		"S\u0000\u0000\u00ab\u00ac\u0005T\u0000\u0000\u00ac\u00ad\u0005U\u0000"+
		"\u0000\u00ad\u00be\u0005R\u0000\u0000\u00ae\u00af\u0005S\u0000\u0000\u00af"+
		"\u00b0\u0005T\u0000\u0000\u00b0\u00b1\u0005U\u0000\u0000\u00b1\u00b2\u0005"+
		"R\u0000\u0000\u00b2\u00be\u0005B\u0000\u0000\u00b3\u00b4\u0005S\u0000"+
		"\u0000\u00b4\u00b5\u0005T\u0000\u0000\u00b5\u00b6\u0005U\u0000\u0000\u00b6"+
		"\u00b7\u0005R\u0000\u0000\u00b7\u00be\u0005H\u0000\u0000\u00b8\u00b9\u0005"+
		"S\u0000\u0000\u00b9\u00ba\u0005T\u0000\u0000\u00ba\u00bb\u0005U\u0000"+
		"\u0000\u00bb\u00bc\u0005R\u0000\u0000\u00bc\u00be\u0005W\u0000\u0000\u00bd"+
		"\u0092\u0001\u0000\u0000\u0000\u00bd\u0096\u0001\u0000\u0000\u0000\u00bd"+
		"\u009b\u0001\u0000\u0000\u0000\u00bd\u00a0\u0001\u0000\u0000\u0000\u00bd"+
		"\u00a6\u0001\u0000\u0000\u0000\u00bd\u00aa\u0001\u0000\u0000\u0000\u00bd"+
		"\u00ae\u0001\u0000\u0000\u0000\u00bd\u00b3\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b8\u0001\u0000\u0000\u0000\u00be\n\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005S\u0000\u0000\u00c0\u00c1\u0005T\u0000\u0000\u00c1\u00c2\u0005X"+
		"\u0000\u0000\u00c2\u00c3\u0005R\u0000\u0000\u00c3\f\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005C\u0000\u0000\u00c5\u00c6\u0005B\u0000\u0000\u00c6"+
		"\u00c7\u0005N\u0000\u0000\u00c7\u00cc\u0005Z\u0000\u0000\u00c8\u00c9\u0005"+
		"C\u0000\u0000\u00c9\u00ca\u0005B\u0000\u0000\u00ca\u00cc\u0005Z\u0000"+
		"\u0000\u00cb\u00c4\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cc\u000e\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005B\u0000\u0000"+
		"\u00ce\u00cf\u0005.\u0000\u0000\u00cf\u00d0\u0005E\u0000\u0000\u00d0\u00f6"+
		"\u0005Q\u0000\u0000\u00d1\u00d2\u0005B\u0000\u0000\u00d2\u00d3\u0005."+
		"\u0000\u0000\u00d3\u00d4\u0005N\u0000\u0000\u00d4\u00f6\u0005E\u0000\u0000"+
		"\u00d5\u00d6\u0005B\u0000\u0000\u00d6\u00d7\u0005.\u0000\u0000\u00d7\u00d8"+
		"\u0005L\u0000\u0000\u00d8\u00f6\u0005T\u0000\u0000\u00d9\u00da\u0005B"+
		"\u0000\u0000\u00da\u00db\u0005.\u0000\u0000\u00db\u00dc\u0005L\u0000\u0000"+
		"\u00dc\u00f6\u0005E\u0000\u0000\u00dd\u00de\u0005B\u0000\u0000\u00de\u00df"+
		"\u0005.\u0000\u0000\u00df\u00e0\u0005G\u0000\u0000\u00e0\u00f6\u0005T"+
		"\u0000\u0000\u00e1\u00e2\u0005B\u0000\u0000\u00e2\u00e3\u0005.\u0000\u0000"+
		"\u00e3\u00e4\u0005G\u0000\u0000\u00e4\u00f6\u0005E\u0000\u0000\u00e5\u00e6"+
		"\u0005B\u0000\u0000\u00e6\u00e7\u0005.\u0000\u0000\u00e7\u00e8\u0005M"+
		"\u0000\u0000\u00e8\u00f6\u0005I\u0000\u0000\u00e9\u00ea\u0005B\u0000\u0000"+
		"\u00ea\u00eb\u0005.\u0000\u0000\u00eb\u00ec\u0005P\u0000\u0000\u00ec\u00f6"+
		"\u0005L\u0000\u0000\u00ed\u00ee\u0005B\u0000\u0000\u00ee\u00ef\u0005."+
		"\u0000\u0000\u00ef\u00f0\u0005V\u0000\u0000\u00f0\u00f6\u0005S\u0000\u0000"+
		"\u00f1\u00f2\u0005B\u0000\u0000\u00f2\u00f3\u0005.\u0000\u0000\u00f3\u00f4"+
		"\u0005V\u0000\u0000\u00f4\u00f6\u0005C\u0000\u0000\u00f5\u00cd\u0001\u0000"+
		"\u0000\u0000\u00f5\u00d1\u0001\u0000\u0000\u0000\u00f5\u00d5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00d9\u0001\u0000\u0000\u0000\u00f5\u00dd\u0001\u0000"+
		"\u0000\u0000\u00f5\u00e1\u0001\u0000\u0000\u0000\u00f5\u00e5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00e9\u0001\u0000\u0000\u0000\u00f5\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f6\u0010\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fb\u0005B\u0000\u0000\u00f8\u00f9\u0005B\u0000\u0000"+
		"\u00f9\u00fb\u0005L\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fb\u0012\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005B\u0000\u0000\u00fd\u00fe\u0005R\u0000\u0000\u00fe\u0014\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005L\u0000\u0000\u0100\u0101\u0005D\u0000"+
		"\u0000\u0101\u0102\u0005R\u0000\u0000\u0102\u0016\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0007\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0006\u000b\u0000\u0000\u0106\u0018\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0005/\u0000\u0000\u0108\u0109\u0005*\u0000\u0000\u0109\u010d"+
		"\u0001\u0000\u0000\u0000\u010a\u010c\t\u0000\u0000\u0000\u010b\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0110\u0001"+
		"\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0005"+
		"*\u0000\u0000\u0111\u0112\u0005/\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0006\f\u0000\u0000\u0114\u001a\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005/\u0000\u0000\u0116\u0117\u0005/\u0000\u0000\u0117\u011b"+
		"\u0001\u0000\u0000\u0000\u0118\u011a\b\u0001\u0000\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0006"+
		"\r\u0000\u0000\u011f\u001c\u0001\u0000\u0000\u0000\u0120\u0121\u0005,"+
		"\u0000\u0000\u0121\u001e\u0001\u0000\u0000\u0000\u0122\u0123\u0005;\u0000"+
		"\u0000\u0123 \u0001\u0000\u0000\u0000\u0124\u0125\u0005=\u0000\u0000\u0125"+
		"\"\u0001\u0000\u0000\u0000\u0126\u0127\u0005[\u0000\u0000\u0127$\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005]\u0000\u0000\u0129&\u0001\u0000\u0000"+
		"\u0000\u012a\u0136\u0003+\u0015\u0000\u012b\u0136\u0003-\u0016\u0000\u012c"+
		"\u0136\u0003/\u0017\u0000\u012d\u0136\u00031\u0018\u0000\u012e\u012f\u0005"+
		"X\u0000\u0000\u012f\u0136\u00050\u0000\u0000\u0130\u0131\u0005X\u0000"+
		"\u0000\u0131\u0133\u0007\u0002\u0000\u0000\u0132\u0134\u0007\u0003\u0000"+
		"\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u012a\u0001\u0000\u0000"+
		"\u0000\u0135\u012b\u0001\u0000\u0000\u0000\u0135\u012c\u0001\u0000\u0000"+
		"\u0000\u0135\u012d\u0001\u0000\u0000\u0000\u0135\u012e\u0001\u0000\u0000"+
		"\u0000\u0135\u0130\u0001\u0000\u0000\u0000\u0136(\u0001\u0000\u0000\u0000"+
		"\u0137\u014d\u00050\u0000\u0000\u0138\u013a\u0005-\u0000\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013f\u0007\u0002\u0000\u0000\u013c\u013e"+
		"\u0007\u0003\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u0141"+
		"\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u014d\u0001\u0000\u0000\u0000\u0141\u013f"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u00050\u0000\u0000\u0143\u0144\u0005"+
		"x\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0149\u0007\u0004"+
		"\u0000\u0000\u0146\u0148\u0007\u0005\u0000\u0000\u0147\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0137\u0001\u0000"+
		"\u0000\u0000\u014c\u0139\u0001\u0000\u0000\u0000\u014c\u0142\u0001\u0000"+
		"\u0000\u0000\u014d*\u0001\u0000\u0000\u0000\u014e\u014f\u0005S\u0000\u0000"+
		"\u014f\u0150\u0005P\u0000\u0000\u0150,\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0005F\u0000\u0000\u0152\u0153\u0005P\u0000\u0000\u0153.\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0005L\u0000\u0000\u0155\u0156\u0005R\u0000\u0000"+
		"\u01560\u0001\u0000\u0000\u0000\u0157\u0158\u0005X\u0000\u0000\u0158\u0159"+
		"\u0005Z\u0000\u0000\u0159\u015a\u0005R\u0000\u0000\u015a2\u0001\u0000"+
		"\u0000\u0000\u015b\u015f\u0007\u0006\u0000\u0000\u015c\u015e\u0007\u0007"+
		"\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005:\u0000\u0000\u01634\u0001\u0000\u0000\u0000"+
		"\u0164\u0168\u0007\u0006\u0000\u0000\u0165\u0167\u0007\u0007\u0000\u0000"+
		"\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u01696\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0005.\u0000\u0000\u016c\u016d\u0005b\u0000\u0000\u016d\u016e\u0005"+
		"y\u0000\u0000\u016e\u016f\u0005t\u0000\u0000\u016f\u018b\u0005e\u0000"+
		"\u0000\u0170\u0171\u0005.\u0000\u0000\u0171\u0172\u0005h\u0000\u0000\u0172"+
		"\u0173\u0005a\u0000\u0000\u0173\u0174\u0005l\u0000\u0000\u0174\u0175\u0005"+
		"f\u0000\u0000\u0175\u0176\u0005w\u0000\u0000\u0176\u0177\u0005o\u0000"+
		"\u0000\u0177\u0178\u0005r\u0000\u0000\u0178\u018b\u0005d\u0000\u0000\u0179"+
		"\u017a\u0005.\u0000\u0000\u017a\u017b\u0005w\u0000\u0000\u017b\u017c\u0005"+
		"o\u0000\u0000\u017c\u017d\u0005r\u0000\u0000\u017d\u018b\u0005d\u0000"+
		"\u0000\u017e\u017f\u0005.\u0000\u0000\u017f\u0180\u0005d\u0000\u0000\u0180"+
		"\u0181\u0005w\u0000\u0000\u0181\u0182\u0005o\u0000\u0000\u0182\u0183\u0005"+
		"r\u0000\u0000\u0183\u018b\u0005d\u0000\u0000\u0184\u0185\u0005.\u0000"+
		"\u0000\u0185\u0186\u0005a\u0000\u0000\u0186\u0187\u0005s\u0000\u0000\u0187"+
		"\u0188\u0005c\u0000\u0000\u0188\u0189\u0005i\u0000\u0000\u0189\u018b\u0005"+
		"i\u0000\u0000\u018a\u016b\u0001\u0000\u0000\u0000\u018a\u0170\u0001\u0000"+
		"\u0000\u0000\u018a\u0179\u0001\u0000\u0000\u0000\u018a\u017e\u0001\u0000"+
		"\u0000\u0000\u018a\u0184\u0001\u0000\u0000\u0000\u018b8\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0005\"\u0000\u0000\u018d\u018f\u0007\b\u0000\u0000"+
		"\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000"+
		"\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0005\"\u0000\u0000\u0193"+
		":\u0001\u0000\u0000\u0000\u0015\u0000Ya\u0086\u0090\u00bd\u00cb\u00f5"+
		"\u00fa\u010d\u011b\u0133\u0135\u0139\u013f\u0149\u014c\u015f\u0168\u018a"+
		"\u0190\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}