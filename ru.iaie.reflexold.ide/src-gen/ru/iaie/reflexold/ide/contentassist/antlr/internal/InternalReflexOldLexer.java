package ru.iaie.reflexold.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReflexOldLexer extends Lexer {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int RULE_HEX=14;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int RULE_SIGN=13;
    public static final int RULE_DEC_SEQUENCE=21;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=9;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_HEX_FLOAT=20;
    public static final int RULE_INT=27;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=29;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_HEX_SEQUENCE=24;
    public static final int RULE_UNSIGNED=18;
    public static final int RULE_BOOL_LITERAL=12;
    public static final int RULE_BIN_EXPONENT=25;
    public static final int RULE_LOGICAL_AND=7;
    public static final int RULE_EXPONENT=22;
    public static final int T__48=48;
    public static final int RULE_DEC_FLOAT=19;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=11;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int RULE_BIT_AND=4;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_OCTAL=15;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=16;
    public static final int RULE_LOGICAL_OR=8;
    public static final int RULE_FLOAT_SUFFIX=23;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=28;
    public static final int RULE_SL_COMMENT=30;
    public static final int RULE_HEX_PREFIX=26;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=31;
    public static final int RULE_ANY_OTHER=32;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int RULE_BIT_XOR=5;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int RULE_BIT_OR=6;
    public static final int RULE_LONG=17;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int RULE_INTEGER=10;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalReflexOldLexer() {;} 
    public InternalReflexOldLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReflexOldLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalReflexOld.g"; }

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11:7: ( '\\u041F\\u0420\\u041E\\u0413\\u0420' )
            // InternalReflexOld.g:11:9: '\\u041F\\u0420\\u041E\\u0413\\u0420'
            {
            match("\u041F\u0420\u041E\u0413\u0420"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:12:7: ( 'TACT' )
            // InternalReflexOld.g:12:9: 'TACT'
            {
            match("TACT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:13:7: ( '\\u0422\\u0410\\u041A\\u0422' )
            // InternalReflexOld.g:13:9: '\\u0422\\u0410\\u041A\\u0422'
            {
            match("\u0422\u0410\u041A\u0422"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:14:7: ( 'PROC' )
            // InternalReflexOld.g:14:9: 'PROC'
            {
            match("PROC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:15:7: ( '\\u041F\\u0420\\u041E\\u0426' )
            // InternalReflexOld.g:15:9: '\\u041F\\u0420\\u041E\\u0426'
            {
            match("\u041F\u0420\u041E\u0426"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:16:7: ( 'STATE' )
            // InternalReflexOld.g:16:9: 'STATE'
            {
            match("STATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:17:7: ( '\\u0421\\u041E\\u0421\\u0422' )
            // InternalReflexOld.g:17:9: '\\u0421\\u041E\\u0421\\u0422'
            {
            match("\u0421\u041E\u0421\u0422"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:18:7: ( 'LOCAL' )
            // InternalReflexOld.g:18:9: 'LOCAL'
            {
            match("LOCAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:19:7: ( '\\u041B\\u041E\\u041A\\u0410\\u041B' )
            // InternalReflexOld.g:19:9: '\\u041B\\u041E\\u041A\\u0410\\u041B'
            {
            match("\u041B\u041E\u041A\u0410\u041B"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:20:7: ( 'FOR' )
            // InternalReflexOld.g:20:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:21:7: ( '\\u0414\\u041B\\u042F' )
            // InternalReflexOld.g:21:9: '\\u0414\\u041B\\u042F'
            {
            match("\u0414\u041B\u042F"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:22:7: ( 'ALL' )
            // InternalReflexOld.g:22:9: 'ALL'
            {
            match("ALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:23:7: ( '\\u0412\\u0421\\u0415\\u0425' )
            // InternalReflexOld.g:23:9: '\\u0412\\u0421\\u0415\\u0425'
            {
            match("\u0412\u0421\u0415\u0425"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:24:7: ( 'TIMEOUT' )
            // InternalReflexOld.g:24:9: 'TIMEOUT'
            {
            match("TIMEOUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:25:7: ( '\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422' )
            // InternalReflexOld.g:25:9: '\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422'
            {
            match("\u0422\u0410\u0419\u041C\u0410\u0423\u0422"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:26:7: ( 'FUNCTION' )
            // InternalReflexOld.g:26:9: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:27:7: ( '\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F' )
            // InternalReflexOld.g:27:9: '\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F'
            {
            match("\u0424\u0423\u041D\u041A\u0426\u0418\u042F"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:28:7: ( 'CONST' )
            // InternalReflexOld.g:28:9: 'CONST'
            {
            match("CONST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:29:7: ( '\\u041A\\u041E\\u041D\\u0421\\u0422' )
            // InternalReflexOld.g:29:9: '\\u041A\\u041E\\u041D\\u0421\\u0422'
            {
            match("\u041A\u041E\u041D\u0421\u0422"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:30:7: ( 'ENUM' )
            // InternalReflexOld.g:30:9: 'ENUM'
            {
            match("ENUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:31:7: ( '\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415' )
            // InternalReflexOld.g:31:9: '\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415'
            {
            match("\u041F\u0415\u0420\u0415\u0427\u0418\u0421\u041B\u0415\u041D\u0418\u0415"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:32:7: ( 'IF' )
            // InternalReflexOld.g:32:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:33:7: ( '\\u0415\\u0421\\u041B\\u0418' )
            // InternalReflexOld.g:33:9: '\\u0415\\u0421\\u041B\\u0418'
            {
            match("\u0415\u0421\u041B\u0418"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:34:7: ( 'ELSE' )
            // InternalReflexOld.g:34:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:35:7: ( '\\u0418\\u041D\\u0410\\u0427\\u0415' )
            // InternalReflexOld.g:35:9: '\\u0418\\u041D\\u0410\\u0427\\u0415'
            {
            match("\u0418\u041D\u0410\u0427\u0415"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:36:7: ( 'SWITCH' )
            // InternalReflexOld.g:36:9: 'SWITCH'
            {
            match("SWITCH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:37:7: ( '\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420' )
            // InternalReflexOld.g:37:9: '\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420'
            {
            match("\u0420\u0410\u0417\u0411\u041E\u0420"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:38:7: ( 'CASE' )
            // InternalReflexOld.g:38:9: 'CASE'
            {
            match("CASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:39:7: ( '\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419' )
            // InternalReflexOld.g:39:9: '\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419'
            {
            match("\u0421\u041B\u0423\u0427\u0410\u0419"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:40:7: ( 'DEFAULT' )
            // InternalReflexOld.g:40:9: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:41:7: ( '\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415' )
            // InternalReflexOld.g:41:9: '\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415'
            {
            match("\u0423\u041C\u041E\u041B\u0427\u0410\u041D\u0418\u0415"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:42:7: ( 'BREAK' )
            // InternalReflexOld.g:42:9: 'BREAK'
            {
            match("BREAK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:43:7: ( '\\u041A\\u041E\\u041D\\u0415\\u0426' )
            // InternalReflexOld.g:43:9: '\\u041A\\u041E\\u041D\\u0415\\u0426'
            {
            match("\u041A\u041E\u041D\u0415\u0426"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:44:7: ( 'START' )
            // InternalReflexOld.g:44:9: 'START'
            {
            match("START"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:45:7: ( '\\u0421\\u0422\\u0410\\u0420\\u0422' )
            // InternalReflexOld.g:45:9: '\\u0421\\u0422\\u0410\\u0420\\u0422'
            {
            match("\u0421\u0422\u0410\u0420\u0422"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:46:7: ( 'STOP' )
            // InternalReflexOld.g:46:9: 'STOP'
            {
            match("STOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:47:7: ( '\\u0421\\u0422\\u041E\\u041F' )
            // InternalReflexOld.g:47:9: '\\u0421\\u0422\\u041E\\u041F'
            {
            match("\u0421\u0422\u041E\u041F"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:48:7: ( 'ERROR' )
            // InternalReflexOld.g:48:9: 'ERROR'
            {
            match("ERROR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:49:7: ( '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' )
            // InternalReflexOld.g:49:9: '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410'
            {
            match("\u041E\u0428\u0418\u0411\u041A\u0410"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:50:7: ( 'LOOP' )
            // InternalReflexOld.g:50:9: 'LOOP'
            {
            match("LOOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:51:7: ( '\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C' )
            // InternalReflexOld.g:51:9: '\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C'
            {
            match("\u0417\u0410\u0426\u0418\u041A\u041B\u0418\u0422\u042C"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:52:7: ( 'SET' )
            // InternalReflexOld.g:52:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:53:7: ( '\\u0412' )
            // InternalReflexOld.g:53:9: '\\u0412'
            {
            match('\u0412'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:54:7: ( 'NEXT' )
            // InternalReflexOld.g:54:9: 'NEXT'
            {
            match("NEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:55:7: ( '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' )
            // InternalReflexOld.g:55:9: '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415'
            {
            match("\u0421\u041B\u0415\u0414\u0423\u042E\u0429\u0415\u0415"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:56:7: ( 'INPUT' )
            // InternalReflexOld.g:56:9: 'INPUT'
            {
            match("INPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:57:7: ( '\\u0412\\u0425\\u041E\\u0414' )
            // InternalReflexOld.g:57:9: '\\u0412\\u0425\\u041E\\u0414'
            {
            match("\u0412\u0425\u041E\u0414"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:58:7: ( 'OUTPUT' )
            // InternalReflexOld.g:58:9: 'OUTPUT'
            {
            match("OUTPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:59:7: ( '\\u0412\\u042B\\u0425\\u041E\\u0414' )
            // InternalReflexOld.g:59:9: '\\u0412\\u042B\\u0425\\u041E\\u0414'
            {
            match("\u0412\u042B\u0425\u041E\u0414"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:60:7: ( 'ACTIVE' )
            // InternalReflexOld.g:60:9: 'ACTIVE'
            {
            match("ACTIVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:61:7: ( '\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415' )
            // InternalReflexOld.g:61:9: '\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415'
            {
            match("\u0410\u041A\u0422\u0418\u0412\u041D\u041E\u0415"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:62:7: ( 'PASSIVE' )
            // InternalReflexOld.g:62:9: 'PASSIVE'
            {
            match("PASSIVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:63:7: ( '\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415' )
            // InternalReflexOld.g:63:9: '\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415'
            {
            match("\u041F\u0410\u0421\u0421\u0418\u0412\u041D\u041E\u0415"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:64:7: ( '++' )
            // InternalReflexOld.g:64:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:65:7: ( '--' )
            // InternalReflexOld.g:65:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:66:7: ( '=' )
            // InternalReflexOld.g:66:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:67:7: ( '*=' )
            // InternalReflexOld.g:67:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:68:7: ( '/=' )
            // InternalReflexOld.g:68:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:69:7: ( '+=' )
            // InternalReflexOld.g:69:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:70:7: ( '-=' )
            // InternalReflexOld.g:70:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:71:7: ( '<<=' )
            // InternalReflexOld.g:71:9: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:72:7: ( '>>=' )
            // InternalReflexOld.g:72:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:73:7: ( '&=' )
            // InternalReflexOld.g:73:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:74:7: ( '^=' )
            // InternalReflexOld.g:74:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:75:7: ( '|=' )
            // InternalReflexOld.g:75:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:76:7: ( '+' )
            // InternalReflexOld.g:76:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:77:7: ( '-' )
            // InternalReflexOld.g:77:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:78:8: ( '~' )
            // InternalReflexOld.g:78:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:79:8: ( '!' )
            // InternalReflexOld.g:79:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:80:8: ( '<' )
            // InternalReflexOld.g:80:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:81:8: ( '>' )
            // InternalReflexOld.g:81:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:82:8: ( '<=' )
            // InternalReflexOld.g:82:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:83:8: ( '>=' )
            // InternalReflexOld.g:83:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:84:8: ( '==' )
            // InternalReflexOld.g:84:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:85:8: ( '!=' )
            // InternalReflexOld.g:85:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:86:8: ( '>>' )
            // InternalReflexOld.g:86:10: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:87:8: ( '<<' )
            // InternalReflexOld.g:87:10: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:88:8: ( '*' )
            // InternalReflexOld.g:88:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:89:8: ( '/' )
            // InternalReflexOld.g:89:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:90:8: ( '%' )
            // InternalReflexOld.g:90:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:91:8: ( 'VOID' )
            // InternalReflexOld.g:91:10: 'VOID'
            {
            match("VOID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:92:8: ( '\\u041F\\u0423\\u0421\\u0422\\u041E' )
            // InternalReflexOld.g:92:10: '\\u041F\\u0423\\u0421\\u0422\\u041E'
            {
            match("\u041F\u0423\u0421\u0422\u041E"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:93:8: ( 'FLOAT' )
            // InternalReflexOld.g:93:10: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:94:8: ( '\\u041F\\u041B\\u0410\\u0412' )
            // InternalReflexOld.g:94:10: '\\u041F\\u041B\\u0410\\u0412'
            {
            match("\u041F\u041B\u0410\u0412"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:95:8: ( 'DOUBLE' )
            // InternalReflexOld.g:95:10: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:96:8: ( '\\u0414\\u041F\\u041B\\u0410\\u0412' )
            // InternalReflexOld.g:96:10: '\\u0414\\u041F\\u041B\\u0410\\u0412'
            {
            match("\u0414\u041F\u041B\u0410\u0412"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:97:8: ( 'SHORT' )
            // InternalReflexOld.g:97:10: 'SHORT'
            {
            match("SHORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:98:8: ( '\\u041A\\u0426\\u0415\\u041B' )
            // InternalReflexOld.g:98:10: '\\u041A\\u0426\\u0415\\u041B'
            {
            match("\u041A\u0426\u0415\u041B"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:99:8: ( 'UNSIGNED SHORT' )
            // InternalReflexOld.g:99:10: 'UNSIGNED SHORT'
            {
            match("UNSIGNED SHORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:100:8: ( '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B' )
            // InternalReflexOld.g:100:10: '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B'
            {
            match("\u0411\u0415\u0417\u0417\u041D\u0410\u041A\u041E\u0412\u041E\u0415 \u041A\u0426\u0415\u041B"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:101:8: ( 'INT' )
            // InternalReflexOld.g:101:10: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:102:8: ( '\\u0426\\u0415\\u041B' )
            // InternalReflexOld.g:102:10: '\\u0426\\u0415\\u041B'
            {
            match("\u0426\u0415\u041B"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:103:8: ( 'UNSIGNED INT' )
            // InternalReflexOld.g:103:10: 'UNSIGNED INT'
            {
            match("UNSIGNED INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:104:8: ( '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B' )
            // InternalReflexOld.g:104:10: '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B'
            {
            match("\u0411\u0415\u0417\u0417\u041D\u0410\u041A\u041E\u0412\u041E\u0415 \u0426\u0415\u041B"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:105:8: ( 'LONG' )
            // InternalReflexOld.g:105:10: 'LONG'
            {
            match("LONG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:106:8: ( '\\u0414\\u0426\\u0415\\u041B' )
            // InternalReflexOld.g:106:10: '\\u0414\\u0426\\u0415\\u041B'
            {
            match("\u0414\u0426\u0415\u041B"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:107:8: ( 'UNSIGNED LONG' )
            // InternalReflexOld.g:107:10: 'UNSIGNED LONG'
            {
            match("UNSIGNED LONG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:108:8: ( '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B' )
            // InternalReflexOld.g:108:10: '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B'
            {
            match("\u0411\u0415\u0417\u0417\u041D\u0410\u041A\u041E\u0412\u041E\u0415 \u0414\u0426\u0415\u041B"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:109:8: ( 'LOG' )
            // InternalReflexOld.g:109:10: 'LOG'
            {
            match("LOG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:110:8: ( '\\u041B\\u041E\\u0413' )
            // InternalReflexOld.g:110:10: '\\u041B\\u041E\\u0413'
            {
            match("\u041B\u041E\u0413"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:111:8: ( '{' )
            // InternalReflexOld.g:111:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:112:8: ( '}' )
            // InternalReflexOld.g:112:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:113:8: ( ';' )
            // InternalReflexOld.g:113:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:114:8: ( 'FROM' )
            // InternalReflexOld.g:114:10: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:115:8: ( '\\u0418\\u0417' )
            // InternalReflexOld.g:115:10: '\\u0418\\u0417'
            {
            match("\u0418\u0417"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:116:8: ( ',' )
            // InternalReflexOld.g:116:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:117:8: ( '[' )
            // InternalReflexOld.g:117:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:118:8: ( ']' )
            // InternalReflexOld.g:118:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:119:8: ( '(' )
            // InternalReflexOld.g:119:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:120:8: ( ')' )
            // InternalReflexOld.g:120:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:121:8: ( ':' )
            // InternalReflexOld.g:121:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:122:8: ( 'RESTART' )
            // InternalReflexOld.g:122:10: 'RESTART'
            {
            match("RESTART"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:123:8: ( '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' )
            // InternalReflexOld.g:123:10: '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422'
            {
            match("\u0420\u0415\u0421\u0422\u0410\u0420\u0422"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:124:8: ( 'TIMER' )
            // InternalReflexOld.g:124:10: 'TIMER'
            {
            match("TIMER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:125:8: ( '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420' )
            // InternalReflexOld.g:125:10: '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420'
            {
            match("\u0422\u0410\u0419\u041C\u0415\u0420"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:126:8: ( 'IN' )
            // InternalReflexOld.g:126:10: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:127:8: ( 'PROGR' )
            // InternalReflexOld.g:127:10: 'PROGR'
            {
            match("PROGR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "RULE_LOGICAL_OR"
    public final void mRULE_LOGICAL_OR() throws RecognitionException {
        try {
            int _type = RULE_LOGICAL_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11679:17: ( '||' )
            // InternalReflexOld.g:11679:19: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGICAL_OR"

    // $ANTLR start "RULE_LOGICAL_AND"
    public final void mRULE_LOGICAL_AND() throws RecognitionException {
        try {
            int _type = RULE_LOGICAL_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11681:18: ( '&&' )
            // InternalReflexOld.g:11681:20: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGICAL_AND"

    // $ANTLR start "RULE_BIT_OR"
    public final void mRULE_BIT_OR() throws RecognitionException {
        try {
            int _type = RULE_BIT_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11683:13: ( '|' )
            // InternalReflexOld.g:11683:15: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT_OR"

    // $ANTLR start "RULE_BIT_XOR"
    public final void mRULE_BIT_XOR() throws RecognitionException {
        try {
            int _type = RULE_BIT_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11685:14: ( '^' )
            // InternalReflexOld.g:11685:16: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT_XOR"

    // $ANTLR start "RULE_BIT_AND"
    public final void mRULE_BIT_AND() throws RecognitionException {
        try {
            int _type = RULE_BIT_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11687:14: ( '&' )
            // InternalReflexOld.g:11687:16: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT_AND"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11689:14: ( ( RULE_SIGN )? ( RULE_HEX | RULE_OCTAL | RULE_DECIMAL ) ( RULE_LONG | RULE_UNSIGNED )? )
            // InternalReflexOld.g:11689:16: ( RULE_SIGN )? ( RULE_HEX | RULE_OCTAL | RULE_DECIMAL ) ( RULE_LONG | RULE_UNSIGNED )?
            {
            // InternalReflexOld.g:11689:16: ( RULE_SIGN )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalReflexOld.g:11689:16: RULE_SIGN
                    {
                    mRULE_SIGN(); 

                    }
                    break;

            }

            // InternalReflexOld.g:11689:27: ( RULE_HEX | RULE_OCTAL | RULE_DECIMAL )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt2=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt2=2;
                    }
                    break;
                default:
                    alt2=3;}

            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalReflexOld.g:11689:28: RULE_HEX
                    {
                    mRULE_HEX(); 

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:11689:37: RULE_OCTAL
                    {
                    mRULE_OCTAL(); 

                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:11689:48: RULE_DECIMAL
                    {
                    mRULE_DECIMAL(); 

                    }
                    break;

            }

            // InternalReflexOld.g:11689:62: ( RULE_LONG | RULE_UNSIGNED )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='L'||LA3_0=='U'||LA3_0=='l'||LA3_0=='u') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReflexOld.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='U'||input.LA(1)=='l'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11691:12: ( ( RULE_DEC_FLOAT | RULE_HEX_FLOAT ) )
            // InternalReflexOld.g:11691:14: ( RULE_DEC_FLOAT | RULE_HEX_FLOAT )
            {
            // InternalReflexOld.g:11691:14: ( RULE_DEC_FLOAT | RULE_HEX_FLOAT )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalReflexOld.g:11691:15: RULE_DEC_FLOAT
                    {
                    mRULE_DEC_FLOAT(); 

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:11691:30: RULE_HEX_FLOAT
                    {
                    mRULE_HEX_FLOAT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_DEC_FLOAT"
    public final void mRULE_DEC_FLOAT() throws RecognitionException {
        try {
            // InternalReflexOld.g:11693:25: ( ( RULE_DEC_SEQUENCE )? '.' RULE_DEC_SEQUENCE ( RULE_EXPONENT RULE_SIGN RULE_DEC_SEQUENCE )? ( RULE_LONG | RULE_FLOAT_SUFFIX )? )
            // InternalReflexOld.g:11693:27: ( RULE_DEC_SEQUENCE )? '.' RULE_DEC_SEQUENCE ( RULE_EXPONENT RULE_SIGN RULE_DEC_SEQUENCE )? ( RULE_LONG | RULE_FLOAT_SUFFIX )?
            {
            // InternalReflexOld.g:11693:27: ( RULE_DEC_SEQUENCE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReflexOld.g:11693:27: RULE_DEC_SEQUENCE
                    {
                    mRULE_DEC_SEQUENCE(); 

                    }
                    break;

            }

            match('.'); 
            mRULE_DEC_SEQUENCE(); 
            // InternalReflexOld.g:11693:68: ( RULE_EXPONENT RULE_SIGN RULE_DEC_SEQUENCE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='E'||LA6_0=='e') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReflexOld.g:11693:69: RULE_EXPONENT RULE_SIGN RULE_DEC_SEQUENCE
                    {
                    mRULE_EXPONENT(); 
                    mRULE_SIGN(); 
                    mRULE_DEC_SEQUENCE(); 

                    }
                    break;

            }

            // InternalReflexOld.g:11693:113: ( RULE_LONG | RULE_FLOAT_SUFFIX )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='F'||LA7_0=='L'||LA7_0=='f'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReflexOld.g:
                    {
                    if ( input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_FLOAT"

    // $ANTLR start "RULE_HEX_FLOAT"
    public final void mRULE_HEX_FLOAT() throws RecognitionException {
        try {
            // InternalReflexOld.g:11695:25: ( ( RULE_HEX_SEQUENCE )? '.' RULE_HEX_SEQUENCE ( RULE_BIN_EXPONENT RULE_SIGN RULE_DEC_SEQUENCE )? ( RULE_LONG | RULE_FLOAT_SUFFIX )? )
            // InternalReflexOld.g:11695:27: ( RULE_HEX_SEQUENCE )? '.' RULE_HEX_SEQUENCE ( RULE_BIN_EXPONENT RULE_SIGN RULE_DEC_SEQUENCE )? ( RULE_LONG | RULE_FLOAT_SUFFIX )?
            {
            // InternalReflexOld.g:11695:27: ( RULE_HEX_SEQUENCE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='F')||(LA8_0>='a' && LA8_0<='f')) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalReflexOld.g:11695:27: RULE_HEX_SEQUENCE
                    {
                    mRULE_HEX_SEQUENCE(); 

                    }
                    break;

            }

            match('.'); 
            mRULE_HEX_SEQUENCE(); 
            // InternalReflexOld.g:11695:68: ( RULE_BIN_EXPONENT RULE_SIGN RULE_DEC_SEQUENCE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='P'||LA9_0=='p') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReflexOld.g:11695:69: RULE_BIN_EXPONENT RULE_SIGN RULE_DEC_SEQUENCE
                    {
                    mRULE_BIN_EXPONENT(); 
                    mRULE_SIGN(); 
                    mRULE_DEC_SEQUENCE(); 

                    }
                    break;

            }

            // InternalReflexOld.g:11695:117: ( RULE_LONG | RULE_FLOAT_SUFFIX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='F'||LA10_0=='L'||LA10_0=='f'||LA10_0=='l') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReflexOld.g:
                    {
                    if ( input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_FLOAT"

    // $ANTLR start "RULE_DEC_SEQUENCE"
    public final void mRULE_DEC_SEQUENCE() throws RecognitionException {
        try {
            // InternalReflexOld.g:11697:28: ( ( '0' .. '9' )+ )
            // InternalReflexOld.g:11697:30: ( '0' .. '9' )+
            {
            // InternalReflexOld.g:11697:30: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReflexOld.g:11697:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_SEQUENCE"

    // $ANTLR start "RULE_HEX_SEQUENCE"
    public final void mRULE_HEX_SEQUENCE() throws RecognitionException {
        try {
            // InternalReflexOld.g:11699:28: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalReflexOld.g:11699:30: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            // InternalReflexOld.g:11699:30: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='F')||(LA12_0>='a' && LA12_0<='f')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReflexOld.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_SEQUENCE"

    // $ANTLR start "RULE_BIN_EXPONENT"
    public final void mRULE_BIN_EXPONENT() throws RecognitionException {
        try {
            // InternalReflexOld.g:11701:28: ( ( 'p' | 'P' ) )
            // InternalReflexOld.g:11701:30: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIN_EXPONENT"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalReflexOld.g:11703:24: ( ( 'e' | 'E' ) )
            // InternalReflexOld.g:11703:26: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            // InternalReflexOld.g:11705:20: ( ( '+' | '-' ) )
            // InternalReflexOld.g:11705:22: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGN"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            // InternalReflexOld.g:11707:23: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalReflexOld.g:11707:25: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalReflexOld.g:11707:25: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='0') ) {
                alt14=1;
            }
            else if ( ((LA14_0>='1' && LA14_0<='9')) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalReflexOld.g:11707:26: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:11707:30: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalReflexOld.g:11707:39: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalReflexOld.g:11707:40: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_OCTAL"
    public final void mRULE_OCTAL() throws RecognitionException {
        try {
            // InternalReflexOld.g:11709:21: ( '0' ( '0' .. '7' )+ )
            // InternalReflexOld.g:11709:23: '0' ( '0' .. '7' )+
            {
            match('0'); 
            // InternalReflexOld.g:11709:27: ( '0' .. '7' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='7')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalReflexOld.g:11709:28: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            // InternalReflexOld.g:11711:19: ( RULE_HEX_PREFIX RULE_HEX_SEQUENCE )
            // InternalReflexOld.g:11711:21: RULE_HEX_PREFIX RULE_HEX_SEQUENCE
            {
            mRULE_HEX_PREFIX(); 
            mRULE_HEX_SEQUENCE(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_HEX_PREFIX"
    public final void mRULE_HEX_PREFIX() throws RecognitionException {
        try {
            // InternalReflexOld.g:11713:26: ( '0' ( 'x' | 'X' ) )
            // InternalReflexOld.g:11713:28: '0' ( 'x' | 'X' )
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_PREFIX"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            // InternalReflexOld.g:11715:20: ( ( 'L' | 'l' ) )
            // InternalReflexOld.g:11715:22: ( 'L' | 'l' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_FLOAT_SUFFIX"
    public final void mRULE_FLOAT_SUFFIX() throws RecognitionException {
        try {
            // InternalReflexOld.g:11717:28: ( ( 'F' | 'f' ) )
            // InternalReflexOld.g:11717:30: ( 'F' | 'f' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_SUFFIX"

    // $ANTLR start "RULE_UNSIGNED"
    public final void mRULE_UNSIGNED() throws RecognitionException {
        try {
            // InternalReflexOld.g:11719:24: ( ( 'U' | 'u' ) )
            // InternalReflexOld.g:11719:26: ( 'U' | 'u' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED"

    // $ANTLR start "RULE_BOOL_LITERAL"
    public final void mRULE_BOOL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11721:19: ( ( 'true' | 'false' ) )
            // InternalReflexOld.g:11721:21: ( 'true' | 'false' )
            {
            // InternalReflexOld.g:11721:21: ( 'true' | 'false' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='t') ) {
                alt16=1;
            }
            else if ( (LA16_0=='f') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalReflexOld.g:11721:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:11721:29: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11723:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0430' .. '\\u044F' | '\\u0410' .. '\\u042F' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0430' .. '\\u044F' | '\\u0410' .. '\\u042F' | '_' | '0' .. '9' )* )
            // InternalReflexOld.g:11723:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0430' .. '\\u044F' | '\\u0410' .. '\\u042F' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0430' .. '\\u044F' | '\\u0410' .. '\\u042F' | '_' | '0' .. '9' )*
            {
            // InternalReflexOld.g:11723:11: ( '^' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='^') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReflexOld.g:11723:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0410' && input.LA(1)<='\u044F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalReflexOld.g:11723:78: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0430' .. '\\u044F' | '\\u0410' .. '\\u042F' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')||(LA18_0>='\u0410' && LA18_0<='\u044F')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalReflexOld.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0410' && input.LA(1)<='\u044F') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11725:10: ( ( '0' .. '9' )+ )
            // InternalReflexOld.g:11725:12: ( '0' .. '9' )+
            {
            // InternalReflexOld.g:11725:12: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalReflexOld.g:11725:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11727:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalReflexOld.g:11727:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalReflexOld.g:11727:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\"') ) {
                alt22=1;
            }
            else if ( (LA22_0=='\'') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalReflexOld.g:11727:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalReflexOld.g:11727:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalReflexOld.g:11727:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReflexOld.g:11727:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:11727:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalReflexOld.g:11727:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalReflexOld.g:11727:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReflexOld.g:11727:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11729:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalReflexOld.g:11729:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalReflexOld.g:11729:24: ( options {greedy=false; } : . )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='*') ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1=='/') ) {
                        alt23=2;
                    }
                    else if ( ((LA23_1>='\u0000' && LA23_1<='.')||(LA23_1>='0' && LA23_1<='\uFFFF')) ) {
                        alt23=1;
                    }


                }
                else if ( ((LA23_0>='\u0000' && LA23_0<=')')||(LA23_0>='+' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalReflexOld.g:11729:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11731:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalReflexOld.g:11731:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalReflexOld.g:11731:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalReflexOld.g:11731:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalReflexOld.g:11731:40: ( ( '\\r' )? '\\n' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalReflexOld.g:11731:41: ( '\\r' )? '\\n'
                    {
                    // InternalReflexOld.g:11731:41: ( '\\r' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='\r') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalReflexOld.g:11731:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11733:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalReflexOld.g:11733:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalReflexOld.g:11733:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalReflexOld.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReflexOld.g:11735:16: ( . )
            // InternalReflexOld.g:11735:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalReflexOld.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | RULE_LOGICAL_OR | RULE_LOGICAL_AND | RULE_BIT_OR | RULE_BIT_XOR | RULE_BIT_AND | RULE_INTEGER | RULE_FLOAT | RULE_BOOL_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt28=132;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalReflexOld.g:1:10: T__33
                {
                mT__33(); 

                }
                break;
            case 2 :
                // InternalReflexOld.g:1:16: T__34
                {
                mT__34(); 

                }
                break;
            case 3 :
                // InternalReflexOld.g:1:22: T__35
                {
                mT__35(); 

                }
                break;
            case 4 :
                // InternalReflexOld.g:1:28: T__36
                {
                mT__36(); 

                }
                break;
            case 5 :
                // InternalReflexOld.g:1:34: T__37
                {
                mT__37(); 

                }
                break;
            case 6 :
                // InternalReflexOld.g:1:40: T__38
                {
                mT__38(); 

                }
                break;
            case 7 :
                // InternalReflexOld.g:1:46: T__39
                {
                mT__39(); 

                }
                break;
            case 8 :
                // InternalReflexOld.g:1:52: T__40
                {
                mT__40(); 

                }
                break;
            case 9 :
                // InternalReflexOld.g:1:58: T__41
                {
                mT__41(); 

                }
                break;
            case 10 :
                // InternalReflexOld.g:1:64: T__42
                {
                mT__42(); 

                }
                break;
            case 11 :
                // InternalReflexOld.g:1:70: T__43
                {
                mT__43(); 

                }
                break;
            case 12 :
                // InternalReflexOld.g:1:76: T__44
                {
                mT__44(); 

                }
                break;
            case 13 :
                // InternalReflexOld.g:1:82: T__45
                {
                mT__45(); 

                }
                break;
            case 14 :
                // InternalReflexOld.g:1:88: T__46
                {
                mT__46(); 

                }
                break;
            case 15 :
                // InternalReflexOld.g:1:94: T__47
                {
                mT__47(); 

                }
                break;
            case 16 :
                // InternalReflexOld.g:1:100: T__48
                {
                mT__48(); 

                }
                break;
            case 17 :
                // InternalReflexOld.g:1:106: T__49
                {
                mT__49(); 

                }
                break;
            case 18 :
                // InternalReflexOld.g:1:112: T__50
                {
                mT__50(); 

                }
                break;
            case 19 :
                // InternalReflexOld.g:1:118: T__51
                {
                mT__51(); 

                }
                break;
            case 20 :
                // InternalReflexOld.g:1:124: T__52
                {
                mT__52(); 

                }
                break;
            case 21 :
                // InternalReflexOld.g:1:130: T__53
                {
                mT__53(); 

                }
                break;
            case 22 :
                // InternalReflexOld.g:1:136: T__54
                {
                mT__54(); 

                }
                break;
            case 23 :
                // InternalReflexOld.g:1:142: T__55
                {
                mT__55(); 

                }
                break;
            case 24 :
                // InternalReflexOld.g:1:148: T__56
                {
                mT__56(); 

                }
                break;
            case 25 :
                // InternalReflexOld.g:1:154: T__57
                {
                mT__57(); 

                }
                break;
            case 26 :
                // InternalReflexOld.g:1:160: T__58
                {
                mT__58(); 

                }
                break;
            case 27 :
                // InternalReflexOld.g:1:166: T__59
                {
                mT__59(); 

                }
                break;
            case 28 :
                // InternalReflexOld.g:1:172: T__60
                {
                mT__60(); 

                }
                break;
            case 29 :
                // InternalReflexOld.g:1:178: T__61
                {
                mT__61(); 

                }
                break;
            case 30 :
                // InternalReflexOld.g:1:184: T__62
                {
                mT__62(); 

                }
                break;
            case 31 :
                // InternalReflexOld.g:1:190: T__63
                {
                mT__63(); 

                }
                break;
            case 32 :
                // InternalReflexOld.g:1:196: T__64
                {
                mT__64(); 

                }
                break;
            case 33 :
                // InternalReflexOld.g:1:202: T__65
                {
                mT__65(); 

                }
                break;
            case 34 :
                // InternalReflexOld.g:1:208: T__66
                {
                mT__66(); 

                }
                break;
            case 35 :
                // InternalReflexOld.g:1:214: T__67
                {
                mT__67(); 

                }
                break;
            case 36 :
                // InternalReflexOld.g:1:220: T__68
                {
                mT__68(); 

                }
                break;
            case 37 :
                // InternalReflexOld.g:1:226: T__69
                {
                mT__69(); 

                }
                break;
            case 38 :
                // InternalReflexOld.g:1:232: T__70
                {
                mT__70(); 

                }
                break;
            case 39 :
                // InternalReflexOld.g:1:238: T__71
                {
                mT__71(); 

                }
                break;
            case 40 :
                // InternalReflexOld.g:1:244: T__72
                {
                mT__72(); 

                }
                break;
            case 41 :
                // InternalReflexOld.g:1:250: T__73
                {
                mT__73(); 

                }
                break;
            case 42 :
                // InternalReflexOld.g:1:256: T__74
                {
                mT__74(); 

                }
                break;
            case 43 :
                // InternalReflexOld.g:1:262: T__75
                {
                mT__75(); 

                }
                break;
            case 44 :
                // InternalReflexOld.g:1:268: T__76
                {
                mT__76(); 

                }
                break;
            case 45 :
                // InternalReflexOld.g:1:274: T__77
                {
                mT__77(); 

                }
                break;
            case 46 :
                // InternalReflexOld.g:1:280: T__78
                {
                mT__78(); 

                }
                break;
            case 47 :
                // InternalReflexOld.g:1:286: T__79
                {
                mT__79(); 

                }
                break;
            case 48 :
                // InternalReflexOld.g:1:292: T__80
                {
                mT__80(); 

                }
                break;
            case 49 :
                // InternalReflexOld.g:1:298: T__81
                {
                mT__81(); 

                }
                break;
            case 50 :
                // InternalReflexOld.g:1:304: T__82
                {
                mT__82(); 

                }
                break;
            case 51 :
                // InternalReflexOld.g:1:310: T__83
                {
                mT__83(); 

                }
                break;
            case 52 :
                // InternalReflexOld.g:1:316: T__84
                {
                mT__84(); 

                }
                break;
            case 53 :
                // InternalReflexOld.g:1:322: T__85
                {
                mT__85(); 

                }
                break;
            case 54 :
                // InternalReflexOld.g:1:328: T__86
                {
                mT__86(); 

                }
                break;
            case 55 :
                // InternalReflexOld.g:1:334: T__87
                {
                mT__87(); 

                }
                break;
            case 56 :
                // InternalReflexOld.g:1:340: T__88
                {
                mT__88(); 

                }
                break;
            case 57 :
                // InternalReflexOld.g:1:346: T__89
                {
                mT__89(); 

                }
                break;
            case 58 :
                // InternalReflexOld.g:1:352: T__90
                {
                mT__90(); 

                }
                break;
            case 59 :
                // InternalReflexOld.g:1:358: T__91
                {
                mT__91(); 

                }
                break;
            case 60 :
                // InternalReflexOld.g:1:364: T__92
                {
                mT__92(); 

                }
                break;
            case 61 :
                // InternalReflexOld.g:1:370: T__93
                {
                mT__93(); 

                }
                break;
            case 62 :
                // InternalReflexOld.g:1:376: T__94
                {
                mT__94(); 

                }
                break;
            case 63 :
                // InternalReflexOld.g:1:382: T__95
                {
                mT__95(); 

                }
                break;
            case 64 :
                // InternalReflexOld.g:1:388: T__96
                {
                mT__96(); 

                }
                break;
            case 65 :
                // InternalReflexOld.g:1:394: T__97
                {
                mT__97(); 

                }
                break;
            case 66 :
                // InternalReflexOld.g:1:400: T__98
                {
                mT__98(); 

                }
                break;
            case 67 :
                // InternalReflexOld.g:1:406: T__99
                {
                mT__99(); 

                }
                break;
            case 68 :
                // InternalReflexOld.g:1:412: T__100
                {
                mT__100(); 

                }
                break;
            case 69 :
                // InternalReflexOld.g:1:419: T__101
                {
                mT__101(); 

                }
                break;
            case 70 :
                // InternalReflexOld.g:1:426: T__102
                {
                mT__102(); 

                }
                break;
            case 71 :
                // InternalReflexOld.g:1:433: T__103
                {
                mT__103(); 

                }
                break;
            case 72 :
                // InternalReflexOld.g:1:440: T__104
                {
                mT__104(); 

                }
                break;
            case 73 :
                // InternalReflexOld.g:1:447: T__105
                {
                mT__105(); 

                }
                break;
            case 74 :
                // InternalReflexOld.g:1:454: T__106
                {
                mT__106(); 

                }
                break;
            case 75 :
                // InternalReflexOld.g:1:461: T__107
                {
                mT__107(); 

                }
                break;
            case 76 :
                // InternalReflexOld.g:1:468: T__108
                {
                mT__108(); 

                }
                break;
            case 77 :
                // InternalReflexOld.g:1:475: T__109
                {
                mT__109(); 

                }
                break;
            case 78 :
                // InternalReflexOld.g:1:482: T__110
                {
                mT__110(); 

                }
                break;
            case 79 :
                // InternalReflexOld.g:1:489: T__111
                {
                mT__111(); 

                }
                break;
            case 80 :
                // InternalReflexOld.g:1:496: T__112
                {
                mT__112(); 

                }
                break;
            case 81 :
                // InternalReflexOld.g:1:503: T__113
                {
                mT__113(); 

                }
                break;
            case 82 :
                // InternalReflexOld.g:1:510: T__114
                {
                mT__114(); 

                }
                break;
            case 83 :
                // InternalReflexOld.g:1:517: T__115
                {
                mT__115(); 

                }
                break;
            case 84 :
                // InternalReflexOld.g:1:524: T__116
                {
                mT__116(); 

                }
                break;
            case 85 :
                // InternalReflexOld.g:1:531: T__117
                {
                mT__117(); 

                }
                break;
            case 86 :
                // InternalReflexOld.g:1:538: T__118
                {
                mT__118(); 

                }
                break;
            case 87 :
                // InternalReflexOld.g:1:545: T__119
                {
                mT__119(); 

                }
                break;
            case 88 :
                // InternalReflexOld.g:1:552: T__120
                {
                mT__120(); 

                }
                break;
            case 89 :
                // InternalReflexOld.g:1:559: T__121
                {
                mT__121(); 

                }
                break;
            case 90 :
                // InternalReflexOld.g:1:566: T__122
                {
                mT__122(); 

                }
                break;
            case 91 :
                // InternalReflexOld.g:1:573: T__123
                {
                mT__123(); 

                }
                break;
            case 92 :
                // InternalReflexOld.g:1:580: T__124
                {
                mT__124(); 

                }
                break;
            case 93 :
                // InternalReflexOld.g:1:587: T__125
                {
                mT__125(); 

                }
                break;
            case 94 :
                // InternalReflexOld.g:1:594: T__126
                {
                mT__126(); 

                }
                break;
            case 95 :
                // InternalReflexOld.g:1:601: T__127
                {
                mT__127(); 

                }
                break;
            case 96 :
                // InternalReflexOld.g:1:608: T__128
                {
                mT__128(); 

                }
                break;
            case 97 :
                // InternalReflexOld.g:1:615: T__129
                {
                mT__129(); 

                }
                break;
            case 98 :
                // InternalReflexOld.g:1:622: T__130
                {
                mT__130(); 

                }
                break;
            case 99 :
                // InternalReflexOld.g:1:629: T__131
                {
                mT__131(); 

                }
                break;
            case 100 :
                // InternalReflexOld.g:1:636: T__132
                {
                mT__132(); 

                }
                break;
            case 101 :
                // InternalReflexOld.g:1:643: T__133
                {
                mT__133(); 

                }
                break;
            case 102 :
                // InternalReflexOld.g:1:650: T__134
                {
                mT__134(); 

                }
                break;
            case 103 :
                // InternalReflexOld.g:1:657: T__135
                {
                mT__135(); 

                }
                break;
            case 104 :
                // InternalReflexOld.g:1:664: T__136
                {
                mT__136(); 

                }
                break;
            case 105 :
                // InternalReflexOld.g:1:671: T__137
                {
                mT__137(); 

                }
                break;
            case 106 :
                // InternalReflexOld.g:1:678: T__138
                {
                mT__138(); 

                }
                break;
            case 107 :
                // InternalReflexOld.g:1:685: T__139
                {
                mT__139(); 

                }
                break;
            case 108 :
                // InternalReflexOld.g:1:692: T__140
                {
                mT__140(); 

                }
                break;
            case 109 :
                // InternalReflexOld.g:1:699: T__141
                {
                mT__141(); 

                }
                break;
            case 110 :
                // InternalReflexOld.g:1:706: T__142
                {
                mT__142(); 

                }
                break;
            case 111 :
                // InternalReflexOld.g:1:713: T__143
                {
                mT__143(); 

                }
                break;
            case 112 :
                // InternalReflexOld.g:1:720: T__144
                {
                mT__144(); 

                }
                break;
            case 113 :
                // InternalReflexOld.g:1:727: T__145
                {
                mT__145(); 

                }
                break;
            case 114 :
                // InternalReflexOld.g:1:734: T__146
                {
                mT__146(); 

                }
                break;
            case 115 :
                // InternalReflexOld.g:1:741: T__147
                {
                mT__147(); 

                }
                break;
            case 116 :
                // InternalReflexOld.g:1:748: T__148
                {
                mT__148(); 

                }
                break;
            case 117 :
                // InternalReflexOld.g:1:755: T__149
                {
                mT__149(); 

                }
                break;
            case 118 :
                // InternalReflexOld.g:1:762: RULE_LOGICAL_OR
                {
                mRULE_LOGICAL_OR(); 

                }
                break;
            case 119 :
                // InternalReflexOld.g:1:778: RULE_LOGICAL_AND
                {
                mRULE_LOGICAL_AND(); 

                }
                break;
            case 120 :
                // InternalReflexOld.g:1:795: RULE_BIT_OR
                {
                mRULE_BIT_OR(); 

                }
                break;
            case 121 :
                // InternalReflexOld.g:1:807: RULE_BIT_XOR
                {
                mRULE_BIT_XOR(); 

                }
                break;
            case 122 :
                // InternalReflexOld.g:1:820: RULE_BIT_AND
                {
                mRULE_BIT_AND(); 

                }
                break;
            case 123 :
                // InternalReflexOld.g:1:833: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 124 :
                // InternalReflexOld.g:1:846: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 125 :
                // InternalReflexOld.g:1:857: RULE_BOOL_LITERAL
                {
                mRULE_BOOL_LITERAL(); 

                }
                break;
            case 126 :
                // InternalReflexOld.g:1:875: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 127 :
                // InternalReflexOld.g:1:883: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 128 :
                // InternalReflexOld.g:1:892: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 129 :
                // InternalReflexOld.g:1:904: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 130 :
                // InternalReflexOld.g:1:920: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 131 :
                // InternalReflexOld.g:1:936: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 132 :
                // InternalReflexOld.g:1:944: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA4_eotS =
        "\5\uffff";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\2\56\1\60\2\uffff";
    static final String DFA4_maxS =
        "\3\146\2\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\uffff\12\1\7\uffff\6\3\32\uffff\6\3",
            "\1\2\1\uffff\12\1\7\uffff\6\3\32\uffff\6\3",
            "\12\4\7\uffff\6\3\32\uffff\6\3",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "11691:14: ( RULE_DEC_FLOAT | RULE_HEX_FLOAT )";
        }
    }
    static final String DFA28_eotS =
        "\1\uffff\13\110\1\145\20\110\1\u0080\1\u0084\1\u0086\1\u0088\1\u008c\1\u008f\1\u0092\1\u0095\1\u0097\1\u009a\1\uffff\1\u009d\1\uffff\4\110\11\uffff\1\110\2\u0081\1\102\3\110\1\uffff\2\102\2\uffff\5\110\1\uffff\23\110\1\uffff\10\110\1\uffff\10\110\1\u00e3\1\u00e6\2\110\1\u00e9\13\110\17\uffff\1\u00f6\2\uffff\1\u00f8\16\uffff\4\110\11\uffff\1\110\1\u0081\1\u00fe\1\u0081\2\110\2\uffff\16\110\1\u0112\11\110\1\u011c\1\110\1\u011e\1\u011f\3\110\1\u0123\2\110\1\u0126\14\110\1\uffff\1\110\1\u0135\1\uffff\2\110\1\uffff\13\110\4\uffff\3\110\1\u0146\1\110\1\uffff\3\110\1\u014b\3\110\1\u014f\1\u0150\1\110\1\u0153\1\110\1\u0156\4\110\1\u015b\1\110\1\uffff\1\110\1\u015e\3\110\1\u0162\1\110\1\u0164\1\u0165\1\uffff\1\110\2\uffff\2\110\1\u0169\1\uffff\1\110\1\u016b\1\uffff\1\110\1\u016d\1\u016e\3\110\1\u0172\2\110\1\u0175\1\u0176\1\u0177\2\110\1\uffff\1\u017a\11\110\1\u0184\2\110\1\u0187\2\110\1\uffff\2\110\1\u018c\1\u018d\1\uffff\2\110\1\u0190\2\uffff\1\110\1\u0192\1\uffff\2\110\1\uffff\1\u0195\1\110\1\u0197\1\u0198\1\uffff\1\110\1\u019a\1\uffff\2\110\1\u019d\1\uffff\1\u019e\2\uffff\1\u019f\1\110\1\u01a1\1\uffff\1\u01a2\1\uffff\1\110\2\uffff\1\u01a4\1\110\1\u01a6\1\uffff\1\u01a7\1\u01a8\3\uffff\1\u01a9\1\u01aa\1\uffff\1\u01ab\5\110\1\u01b1\2\110\1\uffff\2\110\1\uffff\3\110\1\u018c\2\uffff\2\110\1\uffff\1\110\1\uffff\1\110\1\u01bd\1\uffff\1\110\2\uffff\1\u01bf\1\uffff\1\u01c0\1\110\3\uffff\1\110\2\uffff\1\u01c3\1\uffff\1\110\6\uffff\1\u01c5\2\110\1\u01c8\1\110\1\uffff\1\u01ca\1\110\1\u01cc\6\110\1\u01d3\1\u01d4\1\uffff\1\u01d5\2\uffff\2\110\1\uffff\1\u01d8\1\uffff\1\u01d9\1\u01da\1\uffff\1\110\1\uffff\1\110\1\uffff\3\110\1\u01e0\2\110\3\uffff\1\110\1\u01e4\3\uffff\2\110\1\u01e7\2\110\1\uffff\1\110\1\u01eb\1\u01ec\1\uffff\1\u01ed\1\u01ee\2\uffff\2\110\7\uffff\3\110\1\u01f7\5\uffff";
    static final String DFA28_eofS =
        "\u01fb\uffff";
    static final String DFA28_minS =
        "\1\0\1\u0410\1\101\1\u0410\1\101\1\105\1\u041b\1\117\1\u041e\1\56\1\u041b\1\56\1\60\1\u0423\1\56\1\u041e\1\56\1\106\1\u0421\1\u0417\1\u0410\1\56\1\u041c\1\56\1\u0428\1\u0410\1\105\1\125\1\u041a\1\53\1\55\2\75\1\52\1\74\1\75\1\46\2\75\1\uffff\1\75\1\uffff\1\117\1\116\2\u0415\11\uffff\1\105\2\56\1\60\1\56\1\162\1\56\1\uffff\2\0\2\uffff\1\u041e\1\u0420\2\u0421\1\u0410\1\uffff\1\103\1\115\1\u0419\1\117\1\123\1\101\1\111\1\124\1\117\1\u0421\1\u0415\1\u0410\1\103\1\u0413\1\122\1\116\2\117\1\56\1\uffff\1\u042f\1\u041b\1\u0415\1\114\1\56\1\u0415\1\u041e\1\u0425\1\uffff\1\u041d\1\116\1\56\1\u041d\1\u0415\1\125\1\123\1\122\2\60\1\u041b\1\u0410\1\60\1\u0417\1\u0421\1\56\1\125\1\u041e\1\105\1\u0418\1\u0426\1\130\1\124\1\u0422\17\uffff\1\75\2\uffff\1\75\16\uffff\1\111\1\123\1\u0417\1\u041b\11\uffff\1\123\4\56\1\165\2\uffff\1\u0413\1\u0415\1\u0421\1\u0422\1\u0412\1\124\1\105\1\u0422\1\u041c\1\103\1\123\1\122\1\120\1\124\1\60\1\122\1\u0422\1\u0427\1\u0414\1\u0420\1\u041f\1\101\1\120\1\107\1\60\1\u0410\2\60\1\103\1\101\1\115\1\60\1\u0410\1\u041b\1\60\1\111\1\u0425\1\u0414\1\u041e\1\u041a\1\123\1\105\1\u0415\1\u041b\1\115\1\105\1\117\1\uffff\1\125\1\60\1\uffff\1\u0418\1\u0427\1\uffff\1\u0411\1\u0422\1\56\1\102\1\u041b\1\101\1\u0411\1\u0418\1\124\1\120\1\u0418\4\uffff\1\104\1\111\1\u0417\1\60\1\124\1\uffff\1\163\1\145\1\u0420\1\60\1\u0427\1\u0418\1\u041e\2\60\1\117\1\60\1\u0410\1\60\1\122\1\111\1\105\1\124\1\60\1\103\1\uffff\1\124\1\60\1\u0410\1\u0423\1\u0422\1\60\1\114\2\60\1\uffff\1\u041b\2\uffff\2\124\1\60\1\uffff\1\u0412\1\60\1\uffff\1\126\2\60\1\u0414\1\u0426\1\124\1\60\1\u0422\1\u0426\3\60\1\122\1\124\1\uffff\1\60\1\u0415\1\u041e\1\u0410\1\56\1\114\1\u0427\1\113\2\u041a\1\60\1\125\1\u0412\1\60\1\107\1\u041d\1\uffff\1\101\1\145\2\60\1\uffff\1\u0418\1\u0412\1\60\2\uffff\1\125\1\60\1\uffff\1\u0423\1\u0420\1\uffff\1\60\1\126\2\60\1\uffff\1\110\1\60\1\uffff\1\u0419\1\u042e\1\60\1\uffff\1\60\2\uffff\1\60\1\111\1\60\1\uffff\1\60\1\uffff\1\105\2\uffff\1\60\1\u0418\1\60\1\uffff\2\60\3\uffff\2\60\1\uffff\1\60\2\u0420\1\114\1\105\1\u0410\1\60\1\u0410\1\u041b\1\uffff\1\124\1\u041d\1\uffff\1\116\1\u0410\1\122\1\60\2\uffff\1\u0421\1\u041d\1\uffff\1\124\1\uffff\1\u0422\1\60\1\uffff\1\105\2\uffff\1\60\1\uffff\1\60\1\u0429\3\uffff\1\117\2\uffff\1\60\1\uffff\1\u042f\6\uffff\1\60\1\u0422\1\124\1\60\1\u041d\1\uffff\1\60\1\u0418\1\60\1\u041e\1\105\1\u041a\1\124\1\u041b\1\u041e\2\60\1\uffff\1\60\2\uffff\1\u0415\1\116\1\uffff\1\60\1\uffff\2\60\1\uffff\1\u0418\1\uffff\1\u0422\1\uffff\1\u0415\1\104\1\u041e\1\60\2\u0415\3\uffff\1\u0415\1\60\3\uffff\1\u0415\1\u042c\1\60\1\40\1\u0412\1\uffff\1\u041d\2\60\1\uffff\2\60\1\uffff\1\111\1\u041e\1\u0418\7\uffff\2\u0415\1\40\1\60\1\u0414\4\uffff";
    static final String DFA28_maxS =
        "\1\uffff\1\u0423\1\111\1\u0410\1\122\1\127\1\u0422\1\117\1\u041e\1\146\1\u0426\1\146\1\u044f\1\u0423\1\146\1\u0426\1\146\1\116\1\u0421\1\u041d\1\u0415\1\146\1\u041c\1\146\1\u0428\1\u0410\1\105\1\125\1\u041a\6\75\1\76\1\75\1\u044f\1\174\1\uffff\1\75\1\uffff\1\117\1\116\2\u0415\11\uffff\1\105\4\146\1\162\1\146\1\uffff\2\uffff\2\uffff\1\u041e\1\u0420\2\u0421\1\u0410\1\uffff\1\103\1\115\1\u041a\1\117\1\123\1\117\1\111\1\124\1\117\1\u0421\1\u0423\1\u041e\1\117\1\u041a\1\122\1\116\2\117\1\146\1\uffff\1\u042f\1\u041b\1\u0415\1\114\1\146\1\u0415\1\u041e\1\u0425\1\uffff\1\u041d\1\116\1\146\1\u041d\1\u0415\1\125\1\123\1\122\2\u044f\1\u041b\1\u0410\1\u044f\1\u0417\1\u0421\1\146\1\125\1\u041e\1\105\1\u0418\1\u0426\1\130\1\124\1\u0422\17\uffff\1\75\2\uffff\1\75\16\uffff\1\111\1\123\1\u0417\1\u041b\11\uffff\1\123\3\146\1\154\1\165\2\uffff\1\u0426\1\u0415\1\u0421\1\u0422\1\u0412\1\124\1\105\1\u0422\1\u041c\1\107\1\123\1\124\1\120\1\124\1\u044f\1\122\1\u0422\1\u0427\1\u0414\1\u0420\1\u041f\1\101\1\120\1\107\1\u044f\1\u0410\2\u044f\1\103\1\101\1\115\1\u044f\1\u0410\1\u041b\1\u044f\1\111\1\u0425\1\u0414\1\u041e\1\u041a\1\123\1\105\1\u0421\1\u041b\1\115\1\105\1\117\1\uffff\1\125\1\u044f\1\uffff\1\u0418\1\u0427\1\uffff\1\u0411\1\u0422\1\146\1\102\1\u041b\1\101\1\u0411\1\u0418\1\124\1\120\1\u0418\4\uffff\1\104\1\111\1\u0417\1\u044f\1\124\1\uffff\1\163\1\145\1\u0420\1\u044f\1\u0427\1\u0418\1\u041e\2\u044f\1\122\1\u044f\1\u0415\1\u044f\1\122\1\111\1\105\1\124\1\u044f\1\103\1\uffff\1\124\1\u044f\1\u0410\1\u0423\1\u0422\1\u044f\1\114\2\u044f\1\uffff\1\u041b\2\uffff\2\124\1\u044f\1\uffff\1\u0412\1\u044f\1\uffff\1\126\2\u044f\1\u0414\1\u0426\1\124\1\u044f\1\u0422\1\u0426\3\u044f\1\122\1\124\1\uffff\1\u044f\1\u0415\1\u041e\1\u0410\1\146\1\114\1\u0427\1\113\2\u041a\1\u044f\1\125\1\u0412\1\u044f\1\107\1\u041d\1\uffff\1\101\1\145\2\u044f\1\uffff\1\u0418\1\u0412\1\u044f\2\uffff\1\125\1\u044f\1\uffff\1\u0423\1\u0420\1\uffff\1\u044f\1\126\2\u044f\1\uffff\1\110\1\u044f\1\uffff\1\u0419\1\u042e\1\u044f\1\uffff\1\u044f\2\uffff\1\u044f\1\111\1\u044f\1\uffff\1\u044f\1\uffff\1\105\2\uffff\1\u044f\1\u0418\1\u044f\1\uffff\2\u044f\3\uffff\2\u044f\1\uffff\1\u044f\2\u0420\1\114\1\105\1\u0410\1\u044f\1\u0410\1\u041b\1\uffff\1\124\1\u041d\1\uffff\1\116\1\u0410\1\122\1\u044f\2\uffff\1\u0421\1\u041d\1\uffff\1\124\1\uffff\1\u0422\1\u044f\1\uffff\1\105\2\uffff\1\u044f\1\uffff\1\u044f\1\u0429\3\uffff\1\117\2\uffff\1\u044f\1\uffff\1\u042f\6\uffff\1\u044f\1\u0422\1\124\1\u044f\1\u041d\1\uffff\1\u044f\1\u0418\1\u044f\1\u041e\1\105\1\u041a\1\124\1\u041b\1\u041e\2\u044f\1\uffff\1\u044f\2\uffff\1\u0415\1\116\1\uffff\1\u044f\1\uffff\2\u044f\1\uffff\1\u0418\1\uffff\1\u0422\1\uffff\1\u0415\1\104\1\u041e\1\u044f\2\u0415\3\uffff\1\u0415\1\u044f\3\uffff\1\u0415\1\u042c\1\u044f\1\40\1\u0412\1\uffff\1\u041d\2\u044f\1\uffff\2\u044f\1\uffff\1\123\1\u041e\1\u0418\7\uffff\2\u0415\1\40\1\u044f\1\u0426\4\uffff";
    static final String DFA28_acceptS =
        "\47\uffff\1\104\1\uffff\1\120\4\uffff\1\145\1\146\1\147\1\152\1\153\1\154\1\155\1\156\1\157\7\uffff\1\176\2\uffff\1\u0083\1\u0084\5\uffff\1\176\23\uffff\1\174\10\uffff\1\53\30\uffff\1\66\1\73\1\102\1\173\1\67\1\74\1\103\1\112\1\70\1\71\1\116\1\72\1\u0081\1\u0082\1\117\1\uffff\1\110\1\106\1\uffff\1\111\1\107\1\77\1\167\1\172\1\100\1\171\1\101\1\166\1\170\1\104\1\113\1\105\1\120\4\uffff\1\145\1\146\1\147\1\152\1\153\1\154\1\155\1\156\1\157\6\uffff\1\u0080\1\u0083\57\uffff\1\26\2\uffff\1\164\2\uffff\1\151\13\uffff\1\75\1\115\1\76\1\114\5\uffff\1\177\23\uffff\1\52\11\uffff\1\143\1\uffff\1\144\1\12\3\uffff\1\13\2\uffff\1\14\16\uffff\1\133\20\uffff\1\134\4\uffff\1\5\3\uffff\1\124\1\2\2\uffff\1\3\2\uffff\1\4\4\uffff\1\44\2\uffff\1\7\3\uffff\1\45\1\uffff\1\50\1\137\3\uffff\1\150\1\uffff\1\140\1\uffff\1\15\1\57\3\uffff\1\34\2\uffff\1\130\1\24\1\30\2\uffff\1\27\11\uffff\1\54\2\uffff\1\121\4\uffff\1\175\1\1\2\uffff\1\122\1\uffff\1\162\2\uffff\1\165\1\uffff\1\6\1\42\1\uffff\1\127\2\uffff\1\43\1\10\1\11\1\uffff\1\123\1\126\1\uffff\1\61\1\uffff\1\22\1\23\1\41\1\46\1\56\1\31\5\uffff\1\40\13\uffff\1\163\1\uffff\1\32\1\35\2\uffff\1\62\1\uffff\1\33\2\uffff\1\125\1\uffff\1\47\1\uffff\1\60\6\uffff\1\16\1\17\1\64\2\uffff\1\21\1\161\1\36\5\uffff\1\160\3\uffff\1\20\2\uffff\1\63\3\uffff\1\65\1\55\1\37\1\51\1\131\1\135\1\141\5\uffff\1\25\1\132\1\136\1\142";
    static final String DFA28_specialS =
        "\1\0\76\uffff\1\1\1\2\u01ba\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\102\2\101\2\102\1\101\22\102\1\101\1\50\1\77\2\102\1\51\1\44\1\100\1\64\1\65\1\40\1\35\1\61\1\36\1\72\1\41\1\70\11\71\1\66\1\60\1\42\1\37\1\43\2\102\1\13\1\27\1\16\1\25\1\20\1\11\2\76\1\21\2\76\1\7\1\76\1\32\1\33\1\4\1\76\1\67\1\5\1\2\1\53\1\52\4\76\1\62\1\102\1\63\1\45\1\76\1\102\5\75\1\73\15\76\1\74\6\76\1\56\1\46\1\57\1\47\u0391\102\1\34\1\54\1\14\1\76\1\12\1\22\1\76\1\31\1\23\1\76\1\17\1\10\2\76\1\30\1\1\1\24\1\6\1\3\1\26\1\15\1\76\1\55\51\76\ufbb0\102",
            "\1\105\4\uffff\1\104\5\uffff\1\107\4\uffff\1\103\2\uffff\1\106",
            "\1\111\7\uffff\1\112",
            "\1\113",
            "\1\115\20\uffff\1\114",
            "\1\120\2\uffff\1\121\13\uffff\1\116\2\uffff\1\117",
            "\1\123\2\uffff\1\122\3\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\134\1\uffff\12\133\7\uffff\6\133\5\uffff\1\131\2\uffff\1\127\2\uffff\1\132\2\uffff\1\130\13\uffff\6\133",
            "\1\135\3\uffff\1\136\6\uffff\1\137",
            "\1\134\1\uffff\12\133\7\uffff\2\133\1\141\3\133\5\uffff\1\140\24\uffff\6\133",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\21\110\1\142\3\110\1\143\5\110\1\144\44\110",
            "\1\146",
            "\1\134\1\uffff\12\133\7\uffff\1\150\5\133\10\uffff\1\147\21\uffff\6\133",
            "\1\151\7\uffff\1\152",
            "\1\134\1\uffff\12\133\7\uffff\6\133\5\uffff\1\154\1\uffff\1\153\3\uffff\1\155\16\uffff\6\133",
            "\1\156\7\uffff\1\157",
            "\1\160",
            "\1\162\5\uffff\1\161",
            "\1\163\4\uffff\1\164",
            "\1\134\1\uffff\12\133\7\uffff\4\133\1\165\1\133\10\uffff\1\166\21\uffff\6\133",
            "\1\167",
            "\1\134\1\uffff\12\133\7\uffff\6\133\13\uffff\1\170\16\uffff\6\133",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\4\uffff\12\u0081\3\uffff\1\177",
            "\1\u0082\2\uffff\12\u0081\3\uffff\1\u0083",
            "\1\u0085",
            "\1\u0087",
            "\1\u008a\4\uffff\1\u008b\15\uffff\1\u0089",
            "\1\u008d\1\u008e",
            "\1\u0091\1\u0090",
            "\1\u0094\26\uffff\1\u0093",
            "\1\u0096\3\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0098\76\uffff\1\u0099",
            "",
            "\1\u009c",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ac",
            "\1\134\1\uffff\10\u00ad\2\u00ae\7\uffff\6\134\32\uffff\6\134",
            "\1\134\1\uffff\12\u00af\7\uffff\6\134\32\uffff\6\134",
            "\12\134\7\uffff\6\134\32\uffff\6\134",
            "\1\134\1\uffff\12\133\7\uffff\6\133\32\uffff\1\u00b0\5\133",
            "\1\u00b1",
            "\1\134\1\uffff\12\133\7\uffff\6\133\32\uffff\6\133",
            "",
            "\0\u00b2",
            "\0\u00b2",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bc\1\u00bb",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf\15\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c6\15\uffff\1\u00c5",
            "\1\u00c7\15\uffff\1\u00c8",
            "\1\u00c9\3\uffff\1\u00cc\6\uffff\1\u00cb\1\u00ca",
            "\1\u00ce\6\uffff\1\u00cd",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\134\1\uffff\12\133\7\uffff\6\133\32\uffff\6\133",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\134\1\uffff\12\133\7\uffff\6\133\15\uffff\1\u00d7\14\uffff\6\133",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\134\1\uffff\12\133\7\uffff\6\133\14\uffff\1\u00dd\15\uffff\6\133",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\17\110\1\u00e4\3\110\1\u00e5\6\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u00e7",
            "\1\u00e8",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u00ea",
            "\1\u00eb",
            "\1\134\1\uffff\12\133\7\uffff\5\133\1\u00ec\32\uffff\6\133",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f5",
            "",
            "",
            "\1\u00f7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00fd",
            "\1\134\1\uffff\10\u00ad\2\u00ae\7\uffff\6\134\32\uffff\6\134",
            "\1\134\1\uffff\12\u00ae\7\uffff\6\134\32\uffff\6\134",
            "\1\134\1\uffff\12\u00af\7\uffff\6\134\32\uffff\6\134",
            "\1\134\1\uffff\12\133\7\uffff\6\133\32\uffff\6\133\5\uffff\1\u00ff",
            "\1\u0100",
            "",
            "",
            "\1\u0101\22\uffff\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b\3\uffff\1\u010c",
            "\1\u010d",
            "\1\u010f\1\uffff\1\u010e",
            "\1\u0110",
            "\1\u0111",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u011d",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0124",
            "\1\u0125",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012f\13\uffff\1\u012e",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "\1\u0134",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u0136",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\134\1\uffff\12\133\7\uffff\1\u013a\5\133\32\uffff\6\133",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "",
            "",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0151\2\uffff\1\u0152",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0154\4\uffff\1\u0155",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u015c",
            "",
            "\1\u015d",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0163",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u0166",
            "",
            "",
            "\1\u0167",
            "\1\u0168",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u016a",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u016c",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0173",
            "\1\u0174",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0178",
            "\1\u0179",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\134\1\uffff\12\133\7\uffff\6\133\16\uffff\1\u017e\13\uffff\6\133",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0185",
            "\1\u0186",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0188",
            "\1\u0189",
            "",
            "\1\u018a",
            "\1\u018b",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u018e",
            "\1\u018f",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "",
            "\1\u0191",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u0193",
            "\1\u0194",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u0196",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u0199",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u019b",
            "\1\u019c",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01a0",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u01a3",
            "",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01a5",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01b2",
            "\1\u01b3",
            "",
            "\1\u01b4",
            "\1\u01b5",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "",
            "\1\u01bb",
            "",
            "\1\u01bc",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u01be",
            "",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01c1",
            "",
            "",
            "",
            "\1\u01c2",
            "",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u01c4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01c6",
            "\1\u01c7",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01c9",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01cb",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "",
            "\1\u01d6",
            "\1\u01d7",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u01db",
            "",
            "\1\u01dc",
            "",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "",
            "",
            "\1\u01e3",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01e8",
            "\1\u01e9",
            "",
            "\1\u01ea",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "",
            "\1\u01f0\2\uffff\1\u01f1\6\uffff\1\u01ef",
            "\1\u01f2",
            "\1\u01f3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110\u0395\uffff\100\110",
            "\1\u01fa\5\uffff\1\u01f8\13\uffff\1\u01f9",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | RULE_LOGICAL_OR | RULE_LOGICAL_AND | RULE_BIT_OR | RULE_BIT_XOR | RULE_BIT_AND | RULE_INTEGER | RULE_FLOAT | RULE_BOOL_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='\u041F') ) {s = 1;}

                        else if ( (LA28_0=='T') ) {s = 2;}

                        else if ( (LA28_0=='\u0422') ) {s = 3;}

                        else if ( (LA28_0=='P') ) {s = 4;}

                        else if ( (LA28_0=='S') ) {s = 5;}

                        else if ( (LA28_0=='\u0421') ) {s = 6;}

                        else if ( (LA28_0=='L') ) {s = 7;}

                        else if ( (LA28_0=='\u041B') ) {s = 8;}

                        else if ( (LA28_0=='F') ) {s = 9;}

                        else if ( (LA28_0=='\u0414') ) {s = 10;}

                        else if ( (LA28_0=='A') ) {s = 11;}

                        else if ( (LA28_0=='\u0412') ) {s = 12;}

                        else if ( (LA28_0=='\u0424') ) {s = 13;}

                        else if ( (LA28_0=='C') ) {s = 14;}

                        else if ( (LA28_0=='\u041A') ) {s = 15;}

                        else if ( (LA28_0=='E') ) {s = 16;}

                        else if ( (LA28_0=='I') ) {s = 17;}

                        else if ( (LA28_0=='\u0415') ) {s = 18;}

                        else if ( (LA28_0=='\u0418') ) {s = 19;}

                        else if ( (LA28_0=='\u0420') ) {s = 20;}

                        else if ( (LA28_0=='D') ) {s = 21;}

                        else if ( (LA28_0=='\u0423') ) {s = 22;}

                        else if ( (LA28_0=='B') ) {s = 23;}

                        else if ( (LA28_0=='\u041E') ) {s = 24;}

                        else if ( (LA28_0=='\u0417') ) {s = 25;}

                        else if ( (LA28_0=='N') ) {s = 26;}

                        else if ( (LA28_0=='O') ) {s = 27;}

                        else if ( (LA28_0=='\u0410') ) {s = 28;}

                        else if ( (LA28_0=='+') ) {s = 29;}

                        else if ( (LA28_0=='-') ) {s = 30;}

                        else if ( (LA28_0=='=') ) {s = 31;}

                        else if ( (LA28_0=='*') ) {s = 32;}

                        else if ( (LA28_0=='/') ) {s = 33;}

                        else if ( (LA28_0=='<') ) {s = 34;}

                        else if ( (LA28_0=='>') ) {s = 35;}

                        else if ( (LA28_0=='&') ) {s = 36;}

                        else if ( (LA28_0=='^') ) {s = 37;}

                        else if ( (LA28_0=='|') ) {s = 38;}

                        else if ( (LA28_0=='~') ) {s = 39;}

                        else if ( (LA28_0=='!') ) {s = 40;}

                        else if ( (LA28_0=='%') ) {s = 41;}

                        else if ( (LA28_0=='V') ) {s = 42;}

                        else if ( (LA28_0=='U') ) {s = 43;}

                        else if ( (LA28_0=='\u0411') ) {s = 44;}

                        else if ( (LA28_0=='\u0426') ) {s = 45;}

                        else if ( (LA28_0=='{') ) {s = 46;}

                        else if ( (LA28_0=='}') ) {s = 47;}

                        else if ( (LA28_0==';') ) {s = 48;}

                        else if ( (LA28_0==',') ) {s = 49;}

                        else if ( (LA28_0=='[') ) {s = 50;}

                        else if ( (LA28_0==']') ) {s = 51;}

                        else if ( (LA28_0=='(') ) {s = 52;}

                        else if ( (LA28_0==')') ) {s = 53;}

                        else if ( (LA28_0==':') ) {s = 54;}

                        else if ( (LA28_0=='R') ) {s = 55;}

                        else if ( (LA28_0=='0') ) {s = 56;}

                        else if ( ((LA28_0>='1' && LA28_0<='9')) ) {s = 57;}

                        else if ( (LA28_0=='.') ) {s = 58;}

                        else if ( (LA28_0=='f') ) {s = 59;}

                        else if ( (LA28_0=='t') ) {s = 60;}

                        else if ( ((LA28_0>='a' && LA28_0<='e')) ) {s = 61;}

                        else if ( ((LA28_0>='G' && LA28_0<='H')||(LA28_0>='J' && LA28_0<='K')||LA28_0=='M'||LA28_0=='Q'||(LA28_0>='W' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='g' && LA28_0<='s')||(LA28_0>='u' && LA28_0<='z')||LA28_0=='\u0413'||LA28_0=='\u0416'||LA28_0=='\u0419'||(LA28_0>='\u041C' && LA28_0<='\u041D')||LA28_0=='\u0425'||(LA28_0>='\u0427' && LA28_0<='\u044F')) ) {s = 62;}

                        else if ( (LA28_0=='\"') ) {s = 63;}

                        else if ( (LA28_0=='\'') ) {s = 64;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 65;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||(LA28_0>='#' && LA28_0<='$')||(LA28_0>='?' && LA28_0<='@')||LA28_0=='\\'||LA28_0=='`'||(LA28_0>='\u007F' && LA28_0<='\u040F')||(LA28_0>='\u0450' && LA28_0<='\uFFFF')) ) {s = 66;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_63 = input.LA(1);

                        s = -1;
                        if ( ((LA28_63>='\u0000' && LA28_63<='\uFFFF')) ) {s = 178;}

                        else s = 66;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_64 = input.LA(1);

                        s = -1;
                        if ( ((LA28_64>='\u0000' && LA28_64<='\uFFFF')) ) {s = 178;}

                        else s = 66;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}