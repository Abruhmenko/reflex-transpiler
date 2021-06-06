package ru.iaie.reflexold.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ru.iaie.reflexold.services.ReflexOldGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalReflexOldParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_FLOAT", "RULE_BOOL_LITERAL", "RULE_BIT_AND", "RULE_BIT_XOR", "RULE_BIT_OR", "RULE_LOGICAL_AND", "RULE_LOGICAL_OR", "RULE_SIGN", "RULE_HEX", "RULE_OCTAL", "RULE_DECIMAL", "RULE_LONG", "RULE_UNSIGNED", "RULE_DEC_FLOAT", "RULE_HEX_FLOAT", "RULE_DEC_SEQUENCE", "RULE_EXPONENT", "RULE_FLOAT_SUFFIX", "RULE_HEX_SEQUENCE", "RULE_BIN_EXPONENT", "RULE_HEX_PREFIX", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PROGR'", "'\\u041F\\u0420\\u041E\\u0413\\u0420'", "'{'", "'}'", "'TACT'", "'\\u0422\\u0410\\u041A\\u0422'", "';'", "'PROC'", "'\\u041F\\u0420\\u041E\\u0426'", "'STATE'", "'\\u0421\\u041E\\u0421\\u0422'", "'FROM'", "'\\u0418\\u0417'", "','", "'LOCAL'", "'\\u041B\\u041E\\u041A\\u0410\\u041B'", "'FOR'", "'\\u0414\\u041B\\u042F'", "'ALL'", "'\\u0412\\u0421\\u0415\\u0425'", "'='", "'['", "']'", "'TIMEOUT'", "'\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422'", "'('", "')'", "'FUNCTION'", "'\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F'", "'CONST'", "'\\u041A\\u041E\\u041D\\u0421\\u0422'", "'ENUM'", "'\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415'", "'IF'", "'\\u0415\\u0421\\u041B\\u0418'", "'ELSE'", "'\\u0418\\u041D\\u0410\\u0427\\u0415'", "'SWITCH'", "'\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420'", "'CASE'", "'\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419'", "':'", "'DEFAULT'", "'\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415'", "'BREAK'", "'\\u041A\\u041E\\u041D\\u0415\\u0426'", "'START'", "'\\u0421\\u0422\\u0410\\u0420\\u0422'", "'STOP'", "'\\u0421\\u0422\\u041E\\u041F'", "'ERROR'", "'\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410'", "'RESTART'", "'\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422'", "'TIMER'", "'\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420'", "'LOOP'", "'\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C'", "'SET'", "'\\u0412'", "'NEXT'", "'\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415'", "'IN'", "'INPUT'", "'\\u0412\\u0425\\u041E\\u0414'", "'OUTPUT'", "'\\u0412\\u042B\\u0425\\u041E\\u0414'", "'ACTIVE'", "'\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415'", "'PASSIVE'", "'\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415'", "'++'", "'--'", "'*='", "'/='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'>>'", "'<<'", "'*'", "'/'", "'%'", "'VOID'", "'\\u041F\\u0423\\u0421\\u0422\\u041E'", "'FLOAT'", "'\\u041F\\u041B\\u0410\\u0412'", "'DOUBLE'", "'\\u0414\\u041F\\u041B\\u0410\\u0412'", "'SHORT'", "'\\u041A\\u0426\\u0415\\u041B'", "'UNSIGNED SHORT'", "'\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B'", "'INT'", "'\\u0426\\u0415\\u041B'", "'UNSIGNED INT'", "'\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B'", "'LONG'", "'\\u0414\\u0426\\u0415\\u041B'", "'UNSIGNED LONG'", "'\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B'", "'LOG'", "'\\u041B\\u041E\\u0413'"
    };
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
    public static final int RULE_ID=4;
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
    public static final int RULE_BOOL_LITERAL=7;
    public static final int RULE_BIN_EXPONENT=25;
    public static final int RULE_LOGICAL_AND=11;
    public static final int RULE_EXPONENT=22;
    public static final int T__48=48;
    public static final int RULE_DEC_FLOAT=19;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int RULE_BIT_AND=8;
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
    public static final int RULE_LOGICAL_OR=12;
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
    public static final int RULE_BIT_XOR=9;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int RULE_BIT_OR=10;
    public static final int RULE_LONG=17;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int RULE_INTEGER=5;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalReflexOldParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReflexOldParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReflexOldParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReflexOld.g"; }



     	private ReflexOldGrammarAccess grammarAccess;

        public InternalReflexOldParser(TokenStream input, ReflexOldGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected ReflexOldGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalReflexOld.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalReflexOld.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalReflexOld.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalReflexOld.g:72:1: ruleProgram returns [EObject current=null] : ( ( ( (lv_en_0_0= 'PROGR' ) ) | otherlv_1= '\\u041F\\u0420\\u041E\\u0413\\u0420' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_clock_4_0= ruleClockDefinition ) ) ( ( (lv_consts_5_0= ruleConst ) ) | ( (lv_enums_6_0= ruleEnum ) ) | ( (lv_functions_7_0= ruleFunction ) ) | ( (lv_ports_8_0= rulePort ) ) | ( (lv_processes_9_0= ruleProcess ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_en_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_10=null;
        EObject lv_clock_4_0 = null;

        EObject lv_consts_5_0 = null;

        EObject lv_enums_6_0 = null;

        EObject lv_functions_7_0 = null;

        EObject lv_ports_8_0 = null;

        EObject lv_processes_9_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:78:2: ( ( ( ( (lv_en_0_0= 'PROGR' ) ) | otherlv_1= '\\u041F\\u0420\\u041E\\u0413\\u0420' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_clock_4_0= ruleClockDefinition ) ) ( ( (lv_consts_5_0= ruleConst ) ) | ( (lv_enums_6_0= ruleEnum ) ) | ( (lv_functions_7_0= ruleFunction ) ) | ( (lv_ports_8_0= rulePort ) ) | ( (lv_processes_9_0= ruleProcess ) ) )* otherlv_10= '}' ) )
            // InternalReflexOld.g:79:2: ( ( ( (lv_en_0_0= 'PROGR' ) ) | otherlv_1= '\\u041F\\u0420\\u041E\\u0413\\u0420' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_clock_4_0= ruleClockDefinition ) ) ( ( (lv_consts_5_0= ruleConst ) ) | ( (lv_enums_6_0= ruleEnum ) ) | ( (lv_functions_7_0= ruleFunction ) ) | ( (lv_ports_8_0= rulePort ) ) | ( (lv_processes_9_0= ruleProcess ) ) )* otherlv_10= '}' )
            {
            // InternalReflexOld.g:79:2: ( ( ( (lv_en_0_0= 'PROGR' ) ) | otherlv_1= '\\u041F\\u0420\\u041E\\u0413\\u0420' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_clock_4_0= ruleClockDefinition ) ) ( ( (lv_consts_5_0= ruleConst ) ) | ( (lv_enums_6_0= ruleEnum ) ) | ( (lv_functions_7_0= ruleFunction ) ) | ( (lv_ports_8_0= rulePort ) ) | ( (lv_processes_9_0= ruleProcess ) ) )* otherlv_10= '}' )
            // InternalReflexOld.g:80:3: ( ( (lv_en_0_0= 'PROGR' ) ) | otherlv_1= '\\u041F\\u0420\\u041E\\u0413\\u0420' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_clock_4_0= ruleClockDefinition ) ) ( ( (lv_consts_5_0= ruleConst ) ) | ( (lv_enums_6_0= ruleEnum ) ) | ( (lv_functions_7_0= ruleFunction ) ) | ( (lv_ports_8_0= rulePort ) ) | ( (lv_processes_9_0= ruleProcess ) ) )* otherlv_10= '}'
            {
            // InternalReflexOld.g:80:3: ( ( (lv_en_0_0= 'PROGR' ) ) | otherlv_1= '\\u041F\\u0420\\u041E\\u0413\\u0420' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33) ) {
                alt1=1;
            }
            else if ( (LA1_0==34) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalReflexOld.g:81:4: ( (lv_en_0_0= 'PROGR' ) )
                    {
                    // InternalReflexOld.g:81:4: ( (lv_en_0_0= 'PROGR' ) )
                    // InternalReflexOld.g:82:5: (lv_en_0_0= 'PROGR' )
                    {
                    // InternalReflexOld.g:82:5: (lv_en_0_0= 'PROGR' )
                    // InternalReflexOld.g:83:6: lv_en_0_0= 'PROGR'
                    {
                    lv_en_0_0=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_en_0_0, grammarAccess.getProgramAccess().getEnPROGRKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProgramRule());
                      						}
                      						setWithLastConsumed(current, "en", lv_en_0_0 != null, "PROGR");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:96:4: otherlv_1= '\\u041F\\u0420\\u041E\\u0413\\u0420'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterErCyrillicCapitalLetterOCyrillicCapitalLetterGheCyrillicCapitalLetterErKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:101:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalReflexOld.g:102:4: (lv_name_2_0= RULE_ID )
            {
            // InternalReflexOld.g:102:4: (lv_name_2_0= RULE_ID )
            // InternalReflexOld.g:103:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProgramRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"ru.iaie.reflexold.ReflexOld.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalReflexOld.g:123:3: ( (lv_clock_4_0= ruleClockDefinition ) )
            // InternalReflexOld.g:124:4: (lv_clock_4_0= ruleClockDefinition )
            {
            // InternalReflexOld.g:124:4: (lv_clock_4_0= ruleClockDefinition )
            // InternalReflexOld.g:125:5: lv_clock_4_0= ruleClockDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramAccess().getClockClockDefinitionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_clock_4_0=ruleClockDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramRule());
              					}
              					set(
              						current,
              						"clock",
              						lv_clock_4_0,
              						"ru.iaie.reflexold.ReflexOld.ClockDefinition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:142:3: ( ( (lv_consts_5_0= ruleConst ) ) | ( (lv_enums_6_0= ruleEnum ) ) | ( (lv_functions_7_0= ruleFunction ) ) | ( (lv_ports_8_0= rulePort ) ) | ( (lv_processes_9_0= ruleProcess ) ) )*
            loop2:
            do {
                int alt2=6;
                switch ( input.LA(1) ) {
                case 62:
                case 63:
                    {
                    alt2=1;
                    }
                    break;
                case 64:
                case 65:
                    {
                    alt2=2;
                    }
                    break;
                case 60:
                case 61:
                    {
                    alt2=3;
                    }
                    break;
                case 96:
                case 97:
                case 98:
                case 99:
                    {
                    alt2=4;
                    }
                    break;
                case 40:
                case 41:
                    {
                    alt2=5;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalReflexOld.g:143:4: ( (lv_consts_5_0= ruleConst ) )
            	    {
            	    // InternalReflexOld.g:143:4: ( (lv_consts_5_0= ruleConst ) )
            	    // InternalReflexOld.g:144:5: (lv_consts_5_0= ruleConst )
            	    {
            	    // InternalReflexOld.g:144:5: (lv_consts_5_0= ruleConst )
            	    // InternalReflexOld.g:145:6: lv_consts_5_0= ruleConst
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getProgramAccess().getConstsConstParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_consts_5_0=ruleConst();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getProgramRule());
            	      						}
            	      						add(
            	      							current,
            	      							"consts",
            	      							lv_consts_5_0,
            	      							"ru.iaie.reflexold.ReflexOld.Const");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalReflexOld.g:163:4: ( (lv_enums_6_0= ruleEnum ) )
            	    {
            	    // InternalReflexOld.g:163:4: ( (lv_enums_6_0= ruleEnum ) )
            	    // InternalReflexOld.g:164:5: (lv_enums_6_0= ruleEnum )
            	    {
            	    // InternalReflexOld.g:164:5: (lv_enums_6_0= ruleEnum )
            	    // InternalReflexOld.g:165:6: lv_enums_6_0= ruleEnum
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getProgramAccess().getEnumsEnumParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_enums_6_0=ruleEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getProgramRule());
            	      						}
            	      						add(
            	      							current,
            	      							"enums",
            	      							lv_enums_6_0,
            	      							"ru.iaie.reflexold.ReflexOld.Enum");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalReflexOld.g:183:4: ( (lv_functions_7_0= ruleFunction ) )
            	    {
            	    // InternalReflexOld.g:183:4: ( (lv_functions_7_0= ruleFunction ) )
            	    // InternalReflexOld.g:184:5: (lv_functions_7_0= ruleFunction )
            	    {
            	    // InternalReflexOld.g:184:5: (lv_functions_7_0= ruleFunction )
            	    // InternalReflexOld.g:185:6: lv_functions_7_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_functions_7_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getProgramRule());
            	      						}
            	      						add(
            	      							current,
            	      							"functions",
            	      							lv_functions_7_0,
            	      							"ru.iaie.reflexold.ReflexOld.Function");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalReflexOld.g:203:4: ( (lv_ports_8_0= rulePort ) )
            	    {
            	    // InternalReflexOld.g:203:4: ( (lv_ports_8_0= rulePort ) )
            	    // InternalReflexOld.g:204:5: (lv_ports_8_0= rulePort )
            	    {
            	    // InternalReflexOld.g:204:5: (lv_ports_8_0= rulePort )
            	    // InternalReflexOld.g:205:6: lv_ports_8_0= rulePort
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getProgramAccess().getPortsPortParserRuleCall_4_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_ports_8_0=rulePort();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getProgramRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ports",
            	      							lv_ports_8_0,
            	      							"ru.iaie.reflexold.ReflexOld.Port");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalReflexOld.g:223:4: ( (lv_processes_9_0= ruleProcess ) )
            	    {
            	    // InternalReflexOld.g:223:4: ( (lv_processes_9_0= ruleProcess ) )
            	    // InternalReflexOld.g:224:5: (lv_processes_9_0= ruleProcess )
            	    {
            	    // InternalReflexOld.g:224:5: (lv_processes_9_0= ruleProcess )
            	    // InternalReflexOld.g:225:6: lv_processes_9_0= ruleProcess
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getProgramAccess().getProcessesProcessParserRuleCall_4_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_processes_9_0=ruleProcess();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getProgramRule());
            	      						}
            	      						add(
            	      							current,
            	      							"processes",
            	      							lv_processes_9_0,
            	      							"ru.iaie.reflexold.ReflexOld.Process");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleClockDefinition"
    // InternalReflexOld.g:251:1: entryRuleClockDefinition returns [EObject current=null] : iv_ruleClockDefinition= ruleClockDefinition EOF ;
    public final EObject entryRuleClockDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockDefinition = null;


        try {
            // InternalReflexOld.g:251:56: (iv_ruleClockDefinition= ruleClockDefinition EOF )
            // InternalReflexOld.g:252:2: iv_ruleClockDefinition= ruleClockDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClockDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClockDefinition=ruleClockDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClockDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClockDefinition"


    // $ANTLR start "ruleClockDefinition"
    // InternalReflexOld.g:258:1: ruleClockDefinition returns [EObject current=null] : ( (otherlv_0= 'TACT' | otherlv_1= '\\u0422\\u0410\\u041A\\u0422' ) ( (lv_value_2_0= RULE_INTEGER ) ) otherlv_3= ';' ) ;
    public final EObject ruleClockDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalReflexOld.g:264:2: ( ( (otherlv_0= 'TACT' | otherlv_1= '\\u0422\\u0410\\u041A\\u0422' ) ( (lv_value_2_0= RULE_INTEGER ) ) otherlv_3= ';' ) )
            // InternalReflexOld.g:265:2: ( (otherlv_0= 'TACT' | otherlv_1= '\\u0422\\u0410\\u041A\\u0422' ) ( (lv_value_2_0= RULE_INTEGER ) ) otherlv_3= ';' )
            {
            // InternalReflexOld.g:265:2: ( (otherlv_0= 'TACT' | otherlv_1= '\\u0422\\u0410\\u041A\\u0422' ) ( (lv_value_2_0= RULE_INTEGER ) ) otherlv_3= ';' )
            // InternalReflexOld.g:266:3: (otherlv_0= 'TACT' | otherlv_1= '\\u0422\\u0410\\u041A\\u0422' ) ( (lv_value_2_0= RULE_INTEGER ) ) otherlv_3= ';'
            {
            // InternalReflexOld.g:266:3: (otherlv_0= 'TACT' | otherlv_1= '\\u0422\\u0410\\u041A\\u0422' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalReflexOld.g:267:4: otherlv_0= 'TACT'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getClockDefinitionAccess().getTACTKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:272:4: otherlv_1= '\\u0422\\u0410\\u041A\\u0422'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getClockDefinitionAccess().getCyrillicCapitalLetterTeCyrillicCapitalLetterACyrillicCapitalLetterKaCyrillicCapitalLetterTeKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:277:3: ( (lv_value_2_0= RULE_INTEGER ) )
            // InternalReflexOld.g:278:4: (lv_value_2_0= RULE_INTEGER )
            {
            // InternalReflexOld.g:278:4: (lv_value_2_0= RULE_INTEGER )
            // InternalReflexOld.g:279:5: lv_value_2_0= RULE_INTEGER
            {
            lv_value_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getClockDefinitionAccess().getValueINTEGERTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClockDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"ru.iaie.reflexold.ReflexOld.INTEGER");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getClockDefinitionAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClockDefinition"


    // $ANTLR start "entryRuleProcess"
    // InternalReflexOld.g:303:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalReflexOld.g:303:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalReflexOld.g:304:2: iv_ruleProcess= ruleProcess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcess; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalReflexOld.g:310:1: ruleProcess returns [EObject current=null] : ( (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( (lv_imports_4_0= ruleImportedVariableList ) ) | ( (lv_variables_5_0= ruleProcessVariable ) ) ) otherlv_6= ';' )* ( (lv_states_7_0= ruleState ) )* otherlv_8= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_imports_4_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_states_7_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:316:2: ( ( (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( (lv_imports_4_0= ruleImportedVariableList ) ) | ( (lv_variables_5_0= ruleProcessVariable ) ) ) otherlv_6= ';' )* ( (lv_states_7_0= ruleState ) )* otherlv_8= '}' ) )
            // InternalReflexOld.g:317:2: ( (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( (lv_imports_4_0= ruleImportedVariableList ) ) | ( (lv_variables_5_0= ruleProcessVariable ) ) ) otherlv_6= ';' )* ( (lv_states_7_0= ruleState ) )* otherlv_8= '}' )
            {
            // InternalReflexOld.g:317:2: ( (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( (lv_imports_4_0= ruleImportedVariableList ) ) | ( (lv_variables_5_0= ruleProcessVariable ) ) ) otherlv_6= ';' )* ( (lv_states_7_0= ruleState ) )* otherlv_8= '}' )
            // InternalReflexOld.g:318:3: (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( (lv_imports_4_0= ruleImportedVariableList ) ) | ( (lv_variables_5_0= ruleProcessVariable ) ) ) otherlv_6= ';' )* ( (lv_states_7_0= ruleState ) )* otherlv_8= '}'
            {
            // InternalReflexOld.g:318:3: (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            else if ( (LA4_0==41) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalReflexOld.g:319:4: otherlv_0= 'PROC'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getPROCKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:324:4: otherlv_1= '\\u041F\\u0420\\u041E\\u0426'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterErCyrillicCapitalLetterOCyrillicCapitalLetterTseKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:329:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalReflexOld.g:330:4: (lv_name_2_0= RULE_ID )
            {
            // InternalReflexOld.g:330:4: (lv_name_2_0= RULE_ID )
            // InternalReflexOld.g:331:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProcessRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"ru.iaie.reflexold.ReflexOld.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalReflexOld.g:351:3: ( ( ( (lv_imports_4_0= ruleImportedVariableList ) ) | ( (lv_variables_5_0= ruleProcessVariable ) ) ) otherlv_6= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=44 && LA6_0<=45)||(LA6_0>=130 && LA6_0<=149)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalReflexOld.g:352:4: ( ( (lv_imports_4_0= ruleImportedVariableList ) ) | ( (lv_variables_5_0= ruleProcessVariable ) ) ) otherlv_6= ';'
            	    {
            	    // InternalReflexOld.g:352:4: ( ( (lv_imports_4_0= ruleImportedVariableList ) ) | ( (lv_variables_5_0= ruleProcessVariable ) ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( ((LA5_0>=44 && LA5_0<=45)) ) {
            	        alt5=1;
            	    }
            	    else if ( ((LA5_0>=130 && LA5_0<=149)) ) {
            	        alt5=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalReflexOld.g:353:5: ( (lv_imports_4_0= ruleImportedVariableList ) )
            	            {
            	            // InternalReflexOld.g:353:5: ( (lv_imports_4_0= ruleImportedVariableList ) )
            	            // InternalReflexOld.g:354:6: (lv_imports_4_0= ruleImportedVariableList )
            	            {
            	            // InternalReflexOld.g:354:6: (lv_imports_4_0= ruleImportedVariableList )
            	            // InternalReflexOld.g:355:7: lv_imports_4_0= ruleImportedVariableList
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getProcessAccess().getImportsImportedVariableListParserRuleCall_3_0_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_imports_4_0=ruleImportedVariableList();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getProcessRule());
            	              							}
            	              							add(
            	              								current,
            	              								"imports",
            	              								lv_imports_4_0,
            	              								"ru.iaie.reflexold.ReflexOld.ImportedVariableList");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalReflexOld.g:373:5: ( (lv_variables_5_0= ruleProcessVariable ) )
            	            {
            	            // InternalReflexOld.g:373:5: ( (lv_variables_5_0= ruleProcessVariable ) )
            	            // InternalReflexOld.g:374:6: (lv_variables_5_0= ruleProcessVariable )
            	            {
            	            // InternalReflexOld.g:374:6: (lv_variables_5_0= ruleProcessVariable )
            	            // InternalReflexOld.g:375:7: lv_variables_5_0= ruleProcessVariable
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getProcessAccess().getVariablesProcessVariableParserRuleCall_3_0_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_variables_5_0=ruleProcessVariable();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getProcessRule());
            	              							}
            	              							add(
            	              								current,
            	              								"variables",
            	              								lv_variables_5_0,
            	              								"ru.iaie.reflexold.ReflexOld.ProcessVariable");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,39,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalReflexOld.g:398:3: ( (lv_states_7_0= ruleState ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=42 && LA7_0<=43)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReflexOld.g:399:4: (lv_states_7_0= ruleState )
            	    {
            	    // InternalReflexOld.g:399:4: (lv_states_7_0= ruleState )
            	    // InternalReflexOld.g:400:5: lv_states_7_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcessAccess().getStatesStateParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_states_7_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProcessRule());
            	      					}
            	      					add(
            	      						current,
            	      						"states",
            	      						lv_states_7_0,
            	      						"ru.iaie.reflexold.ReflexOld.State");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleState"
    // InternalReflexOld.g:425:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalReflexOld.g:425:46: (iv_ruleState= ruleState EOF )
            // InternalReflexOld.g:426:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalReflexOld.g:432:1: ruleState returns [EObject current=null] : ( (otherlv_0= 'STATE' | otherlv_1= '\\u0421\\u041E\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_stateFunction_4_0= ruleStatementSequence ) ) ( (lv_timeoutFunction_5_0= ruleTimeoutFunction ) )? otherlv_6= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_stateFunction_4_0 = null;

        EObject lv_timeoutFunction_5_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:438:2: ( ( (otherlv_0= 'STATE' | otherlv_1= '\\u0421\\u041E\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_stateFunction_4_0= ruleStatementSequence ) ) ( (lv_timeoutFunction_5_0= ruleTimeoutFunction ) )? otherlv_6= '}' ) )
            // InternalReflexOld.g:439:2: ( (otherlv_0= 'STATE' | otherlv_1= '\\u0421\\u041E\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_stateFunction_4_0= ruleStatementSequence ) ) ( (lv_timeoutFunction_5_0= ruleTimeoutFunction ) )? otherlv_6= '}' )
            {
            // InternalReflexOld.g:439:2: ( (otherlv_0= 'STATE' | otherlv_1= '\\u0421\\u041E\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_stateFunction_4_0= ruleStatementSequence ) ) ( (lv_timeoutFunction_5_0= ruleTimeoutFunction ) )? otherlv_6= '}' )
            // InternalReflexOld.g:440:3: (otherlv_0= 'STATE' | otherlv_1= '\\u0421\\u041E\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_stateFunction_4_0= ruleStatementSequence ) ) ( (lv_timeoutFunction_5_0= ruleTimeoutFunction ) )? otherlv_6= '}'
            {
            // InternalReflexOld.g:440:3: (otherlv_0= 'STATE' | otherlv_1= '\\u0421\\u041E\\u0421\\u0422' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            else if ( (LA8_0==43) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalReflexOld.g:441:4: otherlv_0= 'STATE'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStateAccess().getSTATEKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:446:4: otherlv_1= '\\u0421\\u041E\\u0421\\u0422'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStateAccess().getCyrillicCapitalLetterEsCyrillicCapitalLetterOCyrillicCapitalLetterEsCyrillicCapitalLetterTeKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:451:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalReflexOld.g:452:4: (lv_name_2_0= RULE_ID )
            {
            // InternalReflexOld.g:452:4: (lv_name_2_0= RULE_ID )
            // InternalReflexOld.g:453:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"ru.iaie.reflexold.ReflexOld.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalReflexOld.g:473:3: ( (lv_stateFunction_4_0= ruleStatementSequence ) )
            // InternalReflexOld.g:474:4: (lv_stateFunction_4_0= ruleStatementSequence )
            {
            // InternalReflexOld.g:474:4: (lv_stateFunction_4_0= ruleStatementSequence )
            // InternalReflexOld.g:475:5: lv_stateFunction_4_0= ruleStatementSequence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStateAccess().getStateFunctionStatementSequenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_stateFunction_4_0=ruleStatementSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStateRule());
              					}
              					set(
              						current,
              						"stateFunction",
              						lv_stateFunction_4_0,
              						"ru.iaie.reflexold.ReflexOld.StatementSequence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:492:3: ( (lv_timeoutFunction_5_0= ruleTimeoutFunction ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=56 && LA9_0<=57)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReflexOld.g:493:4: (lv_timeoutFunction_5_0= ruleTimeoutFunction )
                    {
                    // InternalReflexOld.g:493:4: (lv_timeoutFunction_5_0= ruleTimeoutFunction )
                    // InternalReflexOld.g:494:5: lv_timeoutFunction_5_0= ruleTimeoutFunction
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStateAccess().getTimeoutFunctionTimeoutFunctionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_timeoutFunction_5_0=ruleTimeoutFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStateRule());
                      					}
                      					set(
                      						current,
                      						"timeoutFunction",
                      						lv_timeoutFunction_5_0,
                      						"ru.iaie.reflexold.ReflexOld.TimeoutFunction");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleImportedVariableList"
    // InternalReflexOld.g:519:1: entryRuleImportedVariableList returns [EObject current=null] : iv_ruleImportedVariableList= ruleImportedVariableList EOF ;
    public final EObject entryRuleImportedVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedVariableList = null;


        try {
            // InternalReflexOld.g:519:61: (iv_ruleImportedVariableList= ruleImportedVariableList EOF )
            // InternalReflexOld.g:520:2: iv_ruleImportedVariableList= ruleImportedVariableList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportedVariableListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportedVariableList=ruleImportedVariableList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportedVariableList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportedVariableList"


    // $ANTLR start "ruleImportedVariableList"
    // InternalReflexOld.g:526:1: ruleImportedVariableList returns [EObject current=null] : ( ( (otherlv_0= 'FROM' otherlv_1= 'PROC' ) | (otherlv_2= '\\u0418\\u0417' otherlv_3= '\\u041F\\u0420\\u041E\\u0426' ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ;
    public final EObject ruleImportedVariableList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalReflexOld.g:532:2: ( ( ( (otherlv_0= 'FROM' otherlv_1= 'PROC' ) | (otherlv_2= '\\u0418\\u0417' otherlv_3= '\\u041F\\u0420\\u041E\\u0426' ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) )
            // InternalReflexOld.g:533:2: ( ( (otherlv_0= 'FROM' otherlv_1= 'PROC' ) | (otherlv_2= '\\u0418\\u0417' otherlv_3= '\\u041F\\u0420\\u041E\\u0426' ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            {
            // InternalReflexOld.g:533:2: ( ( (otherlv_0= 'FROM' otherlv_1= 'PROC' ) | (otherlv_2= '\\u0418\\u0417' otherlv_3= '\\u041F\\u0420\\u041E\\u0426' ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            // InternalReflexOld.g:534:3: ( (otherlv_0= 'FROM' otherlv_1= 'PROC' ) | (otherlv_2= '\\u0418\\u0417' otherlv_3= '\\u041F\\u0420\\u041E\\u0426' ) ) ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            {
            // InternalReflexOld.g:534:3: ( (otherlv_0= 'FROM' otherlv_1= 'PROC' ) | (otherlv_2= '\\u0418\\u0417' otherlv_3= '\\u041F\\u0420\\u041E\\u0426' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            else if ( (LA10_0==45) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalReflexOld.g:535:4: (otherlv_0= 'FROM' otherlv_1= 'PROC' )
                    {
                    // InternalReflexOld.g:535:4: (otherlv_0= 'FROM' otherlv_1= 'PROC' )
                    // InternalReflexOld.g:536:5: otherlv_0= 'FROM' otherlv_1= 'PROC'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getImportedVariableListAccess().getFROMKeyword_0_0_0());
                      				
                    }
                    otherlv_1=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getImportedVariableListAccess().getPROCKeyword_0_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:546:4: (otherlv_2= '\\u0418\\u0417' otherlv_3= '\\u041F\\u0420\\u041E\\u0426' )
                    {
                    // InternalReflexOld.g:546:4: (otherlv_2= '\\u0418\\u0417' otherlv_3= '\\u041F\\u0420\\u041E\\u0426' )
                    // InternalReflexOld.g:547:5: otherlv_2= '\\u0418\\u0417' otherlv_3= '\\u041F\\u0420\\u041E\\u0426'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getImportedVariableListAccess().getCyrillicCapitalLetterICyrillicCapitalLetterZeKeyword_0_1_0());
                      				
                    }
                    otherlv_3=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getImportedVariableListAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterErCyrillicCapitalLetterOCyrillicCapitalLetterTseKeyword_0_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalReflexOld.g:557:3: ( (otherlv_4= RULE_ID ) )
            // InternalReflexOld.g:558:4: (otherlv_4= RULE_ID )
            {
            // InternalReflexOld.g:558:4: (otherlv_4= RULE_ID )
            // InternalReflexOld.g:559:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportedVariableListRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getImportedVariableListAccess().getProcessProcessCrossReference_1_0());
              				
            }

            }


            }

            // InternalReflexOld.g:570:3: ( (otherlv_5= RULE_ID ) )
            // InternalReflexOld.g:571:4: (otherlv_5= RULE_ID )
            {
            // InternalReflexOld.g:571:4: (otherlv_5= RULE_ID )
            // InternalReflexOld.g:572:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportedVariableListRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getImportedVariableListAccess().getVariablesProcessVariableCrossReference_2_0());
              				
            }

            }


            }

            // InternalReflexOld.g:583:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReflexOld.g:584:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getImportedVariableListAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalReflexOld.g:588:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalReflexOld.g:589:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalReflexOld.g:589:5: (otherlv_7= RULE_ID )
            	    // InternalReflexOld.g:590:6: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getImportedVariableListRule());
            	      						}
            	      					
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getImportedVariableListAccess().getVariablesProcessVariableCrossReference_3_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportedVariableList"


    // $ANTLR start "entryRuleProcessVariable"
    // InternalReflexOld.g:606:1: entryRuleProcessVariable returns [EObject current=null] : iv_ruleProcessVariable= ruleProcessVariable EOF ;
    public final EObject entryRuleProcessVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessVariable = null;


        try {
            // InternalReflexOld.g:606:56: (iv_ruleProcessVariable= ruleProcessVariable EOF )
            // InternalReflexOld.g:607:2: iv_ruleProcessVariable= ruleProcessVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcessVariable=ruleProcessVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessVariable"


    // $ANTLR start "ruleProcessVariable"
    // InternalReflexOld.g:613:1: ruleProcessVariable returns [EObject current=null] : ( (this_PhysicalVariable_0= rulePhysicalVariable | this_ProgramVariable_1= ruleProgramVariable ) ( ( ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) ) ) | ( ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) ) ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) ) ) ) ) ;
    public final EObject ruleProcessVariable() throws RecognitionException {
        EObject current = null;

        Token lv_local_2_1=null;
        Token lv_local_2_2=null;
        Token lv_shared_3_1=null;
        Token lv_shared_3_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject this_PhysicalVariable_0 = null;

        EObject this_ProgramVariable_1 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:619:2: ( ( (this_PhysicalVariable_0= rulePhysicalVariable | this_ProgramVariable_1= ruleProgramVariable ) ( ( ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) ) ) | ( ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) ) ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) ) ) ) ) )
            // InternalReflexOld.g:620:2: ( (this_PhysicalVariable_0= rulePhysicalVariable | this_ProgramVariable_1= ruleProgramVariable ) ( ( ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) ) ) | ( ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) ) ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) ) ) ) )
            {
            // InternalReflexOld.g:620:2: ( (this_PhysicalVariable_0= rulePhysicalVariable | this_ProgramVariable_1= ruleProgramVariable ) ( ( ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) ) ) | ( ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) ) ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) ) ) ) )
            // InternalReflexOld.g:621:3: (this_PhysicalVariable_0= rulePhysicalVariable | this_ProgramVariable_1= ruleProgramVariable ) ( ( ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) ) ) | ( ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) ) ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) ) ) )
            {
            // InternalReflexOld.g:621:3: (this_PhysicalVariable_0= rulePhysicalVariable | this_ProgramVariable_1= ruleProgramVariable )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalReflexOld.g:622:4: this_PhysicalVariable_0= rulePhysicalVariable
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getProcessVariableAccess().getPhysicalVariableParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    this_PhysicalVariable_0=rulePhysicalVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PhysicalVariable_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:631:4: this_ProgramVariable_1= ruleProgramVariable
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getProcessVariableAccess().getProgramVariableParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    this_ProgramVariable_1=ruleProgramVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ProgramVariable_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:640:3: ( ( ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) ) ) | ( ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) ) ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=47 && LA19_0<=48)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=49 && LA19_0<=50)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalReflexOld.g:641:4: ( ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) ) )
                    {
                    // InternalReflexOld.g:641:4: ( ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) ) )
                    // InternalReflexOld.g:642:5: ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) )
                    {
                    // InternalReflexOld.g:642:5: ( (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' ) )
                    // InternalReflexOld.g:643:6: (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' )
                    {
                    // InternalReflexOld.g:643:6: (lv_local_2_1= 'LOCAL' | lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==47) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==48) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalReflexOld.g:644:7: lv_local_2_1= 'LOCAL'
                            {
                            lv_local_2_1=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_local_2_1, grammarAccess.getProcessVariableAccess().getLocalLOCALKeyword_1_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getProcessVariableRule());
                              							}
                              							setWithLastConsumed(current, "local", lv_local_2_1 != null, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalReflexOld.g:655:7: lv_local_2_2= '\\u041B\\u041E\\u041A\\u0410\\u041B'
                            {
                            lv_local_2_2=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_local_2_2, grammarAccess.getProcessVariableAccess().getLocalCyrillicCapitalLetterElCyrillicCapitalLetterOCyrillicCapitalLetterKaCyrillicCapitalLetterACyrillicCapitalLetterElKeyword_1_0_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getProcessVariableRule());
                              							}
                              							setWithLastConsumed(current, "local", lv_local_2_2 != null, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:669:4: ( ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) ) ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) ) )
                    {
                    // InternalReflexOld.g:669:4: ( ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) ) ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) ) )
                    // InternalReflexOld.g:670:5: ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) ) ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) )
                    {
                    // InternalReflexOld.g:670:5: ( ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) ) )
                    // InternalReflexOld.g:671:6: ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) )
                    {
                    // InternalReflexOld.g:671:6: ( (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' ) )
                    // InternalReflexOld.g:672:7: (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' )
                    {
                    // InternalReflexOld.g:672:7: (lv_shared_3_1= 'FOR' | lv_shared_3_2= '\\u0414\\u041B\\u042F' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==49) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==50) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalReflexOld.g:673:8: lv_shared_3_1= 'FOR'
                            {
                            lv_shared_3_1=(Token)match(input,49,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_shared_3_1, grammarAccess.getProcessVariableAccess().getSharedFORKeyword_1_1_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getProcessVariableRule());
                              								}
                              								setWithLastConsumed(current, "shared", lv_shared_3_1 != null, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalReflexOld.g:684:8: lv_shared_3_2= '\\u0414\\u041B\\u042F'
                            {
                            lv_shared_3_2=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_shared_3_2, grammarAccess.getProcessVariableAccess().getSharedCyrillicCapitalLetterDeCyrillicCapitalLetterElCyrillicCapitalLetterYaKeyword_1_1_0_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getProcessVariableRule());
                              								}
                              								setWithLastConsumed(current, "shared", lv_shared_3_2 != null, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalReflexOld.g:697:5: ( (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' ) | ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=51 && LA18_0<=52)) ) {
                        alt18=1;
                    }
                    else if ( ((LA18_0>=40 && LA18_0<=41)) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalReflexOld.g:698:6: (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' )
                            {
                            // InternalReflexOld.g:698:6: (otherlv_4= 'ALL' | otherlv_5= '\\u0412\\u0421\\u0415\\u0425' )
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==51) ) {
                                alt15=1;
                            }
                            else if ( (LA15_0==52) ) {
                                alt15=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 0, input);

                                throw nvae;
                            }
                            switch (alt15) {
                                case 1 :
                                    // InternalReflexOld.g:699:7: otherlv_4= 'ALL'
                                    {
                                    otherlv_4=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_4, grammarAccess.getProcessVariableAccess().getALLKeyword_1_1_1_0_0());
                                      						
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalReflexOld.g:704:7: otherlv_5= '\\u0412\\u0421\\u0415\\u0425'
                                    {
                                    otherlv_5=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_5, grammarAccess.getProcessVariableAccess().getCyrillicCapitalLetterVeCyrillicCapitalLetterEsCyrillicCapitalLetterIeCyrillicCapitalLetterHaKeyword_1_1_1_0_1());
                                      						
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalReflexOld.g:710:6: ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )
                            {
                            // InternalReflexOld.g:710:6: ( (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )
                            // InternalReflexOld.g:711:7: (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            {
                            // InternalReflexOld.g:711:7: (otherlv_6= 'PROC' | otherlv_7= '\\u041F\\u0420\\u041E\\u0426' )
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==40) ) {
                                alt16=1;
                            }
                            else if ( (LA16_0==41) ) {
                                alt16=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 0, input);

                                throw nvae;
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalReflexOld.g:712:8: otherlv_6= 'PROC'
                                    {
                                    otherlv_6=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_6, grammarAccess.getProcessVariableAccess().getPROCKeyword_1_1_1_1_0_0());
                                      							
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalReflexOld.g:717:8: otherlv_7= '\\u041F\\u0420\\u041E\\u0426'
                                    {
                                    otherlv_7=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_7, grammarAccess.getProcessVariableAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterErCyrillicCapitalLetterOCyrillicCapitalLetterTseKeyword_1_1_1_1_0_1());
                                      							
                                    }

                                    }
                                    break;

                            }

                            // InternalReflexOld.g:722:7: ( (otherlv_8= RULE_ID ) )
                            // InternalReflexOld.g:723:8: (otherlv_8= RULE_ID )
                            {
                            // InternalReflexOld.g:723:8: (otherlv_8= RULE_ID )
                            // InternalReflexOld.g:724:9: otherlv_8= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElement(grammarAccess.getProcessVariableRule());
                              									}
                              								
                            }
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									newLeafNode(otherlv_8, grammarAccess.getProcessVariableAccess().getProcessesProcessCrossReference_1_1_1_1_1_0());
                              								
                            }

                            }


                            }

                            // InternalReflexOld.g:735:7: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==46) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalReflexOld.g:736:8: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								newLeafNode(otherlv_9, grammarAccess.getProcessVariableAccess().getCommaKeyword_1_1_1_1_2_0());
                            	      							
                            	    }
                            	    // InternalReflexOld.g:740:8: ( (otherlv_10= RULE_ID ) )
                            	    // InternalReflexOld.g:741:9: (otherlv_10= RULE_ID )
                            	    {
                            	    // InternalReflexOld.g:741:9: (otherlv_10= RULE_ID )
                            	    // InternalReflexOld.g:742:10: otherlv_10= RULE_ID
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      										if (current==null) {
                            	      											current = createModelElement(grammarAccess.getProcessVariableRule());
                            	      										}
                            	      									
                            	    }
                            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      										newLeafNode(otherlv_10, grammarAccess.getProcessVariableAccess().getProcessesProcessCrossReference_1_1_1_1_2_1_0());
                            	      									
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessVariable"


    // $ANTLR start "entryRulePhysicalVariable"
    // InternalReflexOld.g:762:1: entryRulePhysicalVariable returns [EObject current=null] : iv_rulePhysicalVariable= rulePhysicalVariable EOF ;
    public final EObject entryRulePhysicalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicalVariable = null;


        try {
            // InternalReflexOld.g:762:57: (iv_rulePhysicalVariable= rulePhysicalVariable EOF )
            // InternalReflexOld.g:763:2: iv_rulePhysicalVariable= rulePhysicalVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPhysicalVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePhysicalVariable=rulePhysicalVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePhysicalVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhysicalVariable"


    // $ANTLR start "rulePhysicalVariable"
    // InternalReflexOld.g:769:1: rulePhysicalVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_mapping_3_0= rulePortMapping ) ) ) ;
    public final EObject rulePhysicalVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_mapping_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:775:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_mapping_3_0= rulePortMapping ) ) ) )
            // InternalReflexOld.g:776:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_mapping_3_0= rulePortMapping ) ) )
            {
            // InternalReflexOld.g:776:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_mapping_3_0= rulePortMapping ) ) )
            // InternalReflexOld.g:777:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_mapping_3_0= rulePortMapping ) )
            {
            // InternalReflexOld.g:777:3: ( (lv_type_0_0= ruleType ) )
            // InternalReflexOld.g:778:4: (lv_type_0_0= ruleType )
            {
            // InternalReflexOld.g:778:4: (lv_type_0_0= ruleType )
            // InternalReflexOld.g:779:5: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPhysicalVariableAccess().getTypeTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPhysicalVariableRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"ru.iaie.reflexold.ReflexOld.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:796:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReflexOld.g:797:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReflexOld.g:797:4: (lv_name_1_0= RULE_ID )
            // InternalReflexOld.g:798:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPhysicalVariableAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPhysicalVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"ru.iaie.reflexold.ReflexOld.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPhysicalVariableAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalReflexOld.g:818:3: ( (lv_mapping_3_0= rulePortMapping ) )
            // InternalReflexOld.g:819:4: (lv_mapping_3_0= rulePortMapping )
            {
            // InternalReflexOld.g:819:4: (lv_mapping_3_0= rulePortMapping )
            // InternalReflexOld.g:820:5: lv_mapping_3_0= rulePortMapping
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPhysicalVariableAccess().getMappingPortMappingParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_mapping_3_0=rulePortMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPhysicalVariableRule());
              					}
              					set(
              						current,
              						"mapping",
              						lv_mapping_3_0,
              						"ru.iaie.reflexold.ReflexOld.PortMapping");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhysicalVariable"


    // $ANTLR start "entryRulePortMapping"
    // InternalReflexOld.g:841:1: entryRulePortMapping returns [EObject current=null] : iv_rulePortMapping= rulePortMapping EOF ;
    public final EObject entryRulePortMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortMapping = null;


        try {
            // InternalReflexOld.g:841:52: (iv_rulePortMapping= rulePortMapping EOF )
            // InternalReflexOld.g:842:2: iv_rulePortMapping= rulePortMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePortMapping=rulePortMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePortMapping; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortMapping"


    // $ANTLR start "rulePortMapping"
    // InternalReflexOld.g:848:1: rulePortMapping returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_bits_3_0= RULE_INTEGER ) ) otherlv_4= ']' otherlv_5= '}' ) ;
    public final EObject rulePortMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_bits_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalReflexOld.g:854:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_bits_3_0= RULE_INTEGER ) ) otherlv_4= ']' otherlv_5= '}' ) )
            // InternalReflexOld.g:855:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_bits_3_0= RULE_INTEGER ) ) otherlv_4= ']' otherlv_5= '}' )
            {
            // InternalReflexOld.g:855:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_bits_3_0= RULE_INTEGER ) ) otherlv_4= ']' otherlv_5= '}' )
            // InternalReflexOld.g:856:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_bits_3_0= RULE_INTEGER ) ) otherlv_4= ']' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPortMappingAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalReflexOld.g:860:3: ( (otherlv_1= RULE_ID ) )
            // InternalReflexOld.g:861:4: (otherlv_1= RULE_ID )
            {
            // InternalReflexOld.g:861:4: (otherlv_1= RULE_ID )
            // InternalReflexOld.g:862:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortMappingRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getPortMappingAccess().getPortPortCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,54,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPortMappingAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalReflexOld.g:877:3: ( (lv_bits_3_0= RULE_INTEGER ) )
            // InternalReflexOld.g:878:4: (lv_bits_3_0= RULE_INTEGER )
            {
            // InternalReflexOld.g:878:4: (lv_bits_3_0= RULE_INTEGER )
            // InternalReflexOld.g:879:5: lv_bits_3_0= RULE_INTEGER
            {
            lv_bits_3_0=(Token)match(input,RULE_INTEGER,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_bits_3_0, grammarAccess.getPortMappingAccess().getBitsINTEGERTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortMappingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"bits",
              						lv_bits_3_0,
              						"ru.iaie.reflexold.ReflexOld.INTEGER");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPortMappingAccess().getRightSquareBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPortMappingAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortMapping"


    // $ANTLR start "entryRulePort"
    // InternalReflexOld.g:907:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalReflexOld.g:907:45: (iv_rulePort= rulePort EOF )
            // InternalReflexOld.g:908:2: iv_rulePort= rulePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePort; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalReflexOld.g:914:1: rulePort returns [EObject current=null] : ( ( (lv_type_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INTEGER ) ) ( (lv_addr2_3_0= RULE_INTEGER ) ) ( (lv_size_4_0= RULE_INTEGER ) ) otherlv_5= ';' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_addr1_2_0=null;
        Token lv_addr2_3_0=null;
        Token lv_size_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:920:2: ( ( ( (lv_type_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INTEGER ) ) ( (lv_addr2_3_0= RULE_INTEGER ) ) ( (lv_size_4_0= RULE_INTEGER ) ) otherlv_5= ';' ) )
            // InternalReflexOld.g:921:2: ( ( (lv_type_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INTEGER ) ) ( (lv_addr2_3_0= RULE_INTEGER ) ) ( (lv_size_4_0= RULE_INTEGER ) ) otherlv_5= ';' )
            {
            // InternalReflexOld.g:921:2: ( ( (lv_type_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INTEGER ) ) ( (lv_addr2_3_0= RULE_INTEGER ) ) ( (lv_size_4_0= RULE_INTEGER ) ) otherlv_5= ';' )
            // InternalReflexOld.g:922:3: ( (lv_type_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_addr1_2_0= RULE_INTEGER ) ) ( (lv_addr2_3_0= RULE_INTEGER ) ) ( (lv_size_4_0= RULE_INTEGER ) ) otherlv_5= ';'
            {
            // InternalReflexOld.g:922:3: ( (lv_type_0_0= rulePortType ) )
            // InternalReflexOld.g:923:4: (lv_type_0_0= rulePortType )
            {
            // InternalReflexOld.g:923:4: (lv_type_0_0= rulePortType )
            // InternalReflexOld.g:924:5: lv_type_0_0= rulePortType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPortAccess().getTypePortTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=rulePortType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPortRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"ru.iaie.reflexold.ReflexOld.PortType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:941:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReflexOld.g:942:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReflexOld.g:942:4: (lv_name_1_0= RULE_ID )
            // InternalReflexOld.g:943:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"ru.iaie.reflexold.ReflexOld.ID");
              				
            }

            }


            }

            // InternalReflexOld.g:959:3: ( (lv_addr1_2_0= RULE_INTEGER ) )
            // InternalReflexOld.g:960:4: (lv_addr1_2_0= RULE_INTEGER )
            {
            // InternalReflexOld.g:960:4: (lv_addr1_2_0= RULE_INTEGER )
            // InternalReflexOld.g:961:5: lv_addr1_2_0= RULE_INTEGER
            {
            lv_addr1_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_addr1_2_0, grammarAccess.getPortAccess().getAddr1INTEGERTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"addr1",
              						lv_addr1_2_0,
              						"ru.iaie.reflexold.ReflexOld.INTEGER");
              				
            }

            }


            }

            // InternalReflexOld.g:977:3: ( (lv_addr2_3_0= RULE_INTEGER ) )
            // InternalReflexOld.g:978:4: (lv_addr2_3_0= RULE_INTEGER )
            {
            // InternalReflexOld.g:978:4: (lv_addr2_3_0= RULE_INTEGER )
            // InternalReflexOld.g:979:5: lv_addr2_3_0= RULE_INTEGER
            {
            lv_addr2_3_0=(Token)match(input,RULE_INTEGER,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_addr2_3_0, grammarAccess.getPortAccess().getAddr2INTEGERTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"addr2",
              						lv_addr2_3_0,
              						"ru.iaie.reflexold.ReflexOld.INTEGER");
              				
            }

            }


            }

            // InternalReflexOld.g:995:3: ( (lv_size_4_0= RULE_INTEGER ) )
            // InternalReflexOld.g:996:4: (lv_size_4_0= RULE_INTEGER )
            {
            // InternalReflexOld.g:996:4: (lv_size_4_0= RULE_INTEGER )
            // InternalReflexOld.g:997:5: lv_size_4_0= RULE_INTEGER
            {
            lv_size_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_size_4_0, grammarAccess.getPortAccess().getSizeINTEGERTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"size",
              						lv_size_4_0,
              						"ru.iaie.reflexold.ReflexOld.INTEGER");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPortAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleProgramVariable"
    // InternalReflexOld.g:1021:1: entryRuleProgramVariable returns [EObject current=null] : iv_ruleProgramVariable= ruleProgramVariable EOF ;
    public final EObject entryRuleProgramVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramVariable = null;


        try {
            // InternalReflexOld.g:1021:56: (iv_ruleProgramVariable= ruleProgramVariable EOF )
            // InternalReflexOld.g:1022:2: iv_ruleProgramVariable= ruleProgramVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgramVariable=ruleProgramVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgramVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgramVariable"


    // $ANTLR start "ruleProgramVariable"
    // InternalReflexOld.g:1028:1: ruleProgramVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProgramVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1034:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalReflexOld.g:1035:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalReflexOld.g:1035:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalReflexOld.g:1036:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalReflexOld.g:1036:3: ( (lv_type_0_0= ruleType ) )
            // InternalReflexOld.g:1037:4: (lv_type_0_0= ruleType )
            {
            // InternalReflexOld.g:1037:4: (lv_type_0_0= ruleType )
            // InternalReflexOld.g:1038:5: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProgramVariableAccess().getTypeTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProgramVariableRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"ru.iaie.reflexold.ReflexOld.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:1055:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReflexOld.g:1056:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReflexOld.g:1056:4: (lv_name_1_0= RULE_ID )
            // InternalReflexOld.g:1057:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProgramVariableAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProgramVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"ru.iaie.reflexold.ReflexOld.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgramVariable"


    // $ANTLR start "entryRuleTimeoutFunction"
    // InternalReflexOld.g:1077:1: entryRuleTimeoutFunction returns [EObject current=null] : iv_ruleTimeoutFunction= ruleTimeoutFunction EOF ;
    public final EObject entryRuleTimeoutFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutFunction = null;


        try {
            // InternalReflexOld.g:1077:56: (iv_ruleTimeoutFunction= ruleTimeoutFunction EOF )
            // InternalReflexOld.g:1078:2: iv_ruleTimeoutFunction= ruleTimeoutFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeoutFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeoutFunction=ruleTimeoutFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeoutFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeoutFunction"


    // $ANTLR start "ruleTimeoutFunction"
    // InternalReflexOld.g:1084:1: ruleTimeoutFunction returns [EObject current=null] : ( (otherlv_0= 'TIMEOUT' | otherlv_1= '\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422' ) (this_TimeAmountOrRef_2= ruleTimeAmountOrRef[$current] | (otherlv_3= '(' this_TimeAmountOrRef_4= ruleTimeAmountOrRef[$current] otherlv_5= ')' ) ) ( (lv_body_6_0= ruleStatement ) ) ) ;
    public final EObject ruleTimeoutFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_TimeAmountOrRef_2 = null;

        EObject this_TimeAmountOrRef_4 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1090:2: ( ( (otherlv_0= 'TIMEOUT' | otherlv_1= '\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422' ) (this_TimeAmountOrRef_2= ruleTimeAmountOrRef[$current] | (otherlv_3= '(' this_TimeAmountOrRef_4= ruleTimeAmountOrRef[$current] otherlv_5= ')' ) ) ( (lv_body_6_0= ruleStatement ) ) ) )
            // InternalReflexOld.g:1091:2: ( (otherlv_0= 'TIMEOUT' | otherlv_1= '\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422' ) (this_TimeAmountOrRef_2= ruleTimeAmountOrRef[$current] | (otherlv_3= '(' this_TimeAmountOrRef_4= ruleTimeAmountOrRef[$current] otherlv_5= ')' ) ) ( (lv_body_6_0= ruleStatement ) ) )
            {
            // InternalReflexOld.g:1091:2: ( (otherlv_0= 'TIMEOUT' | otherlv_1= '\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422' ) (this_TimeAmountOrRef_2= ruleTimeAmountOrRef[$current] | (otherlv_3= '(' this_TimeAmountOrRef_4= ruleTimeAmountOrRef[$current] otherlv_5= ')' ) ) ( (lv_body_6_0= ruleStatement ) ) )
            // InternalReflexOld.g:1092:3: (otherlv_0= 'TIMEOUT' | otherlv_1= '\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422' ) (this_TimeAmountOrRef_2= ruleTimeAmountOrRef[$current] | (otherlv_3= '(' this_TimeAmountOrRef_4= ruleTimeAmountOrRef[$current] otherlv_5= ')' ) ) ( (lv_body_6_0= ruleStatement ) )
            {
            // InternalReflexOld.g:1092:3: (otherlv_0= 'TIMEOUT' | otherlv_1= '\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==56) ) {
                alt20=1;
            }
            else if ( (LA20_0==57) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalReflexOld.g:1093:4: otherlv_0= 'TIMEOUT'
                    {
                    otherlv_0=(Token)match(input,56,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTimeoutFunctionAccess().getTIMEOUTKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:1098:4: otherlv_1= '\\u0422\\u0410\\u0419\\u041C\\u0410\\u0423\\u0422'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTimeoutFunctionAccess().getCyrillicCapitalLetterTeCyrillicCapitalLetterACyrillicCapitalLetterShortICyrillicCapitalLetterEmCyrillicCapitalLetterACyrillicCapitalLetterUCyrillicCapitalLetterTeKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:1103:3: (this_TimeAmountOrRef_2= ruleTimeAmountOrRef[$current] | (otherlv_3= '(' this_TimeAmountOrRef_4= ruleTimeAmountOrRef[$current] otherlv_5= ')' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INTEGER)) ) {
                alt21=1;
            }
            else if ( (LA21_0==58) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalReflexOld.g:1104:4: this_TimeAmountOrRef_2= ruleTimeAmountOrRef[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getTimeoutFunctionRule());
                      				}
                      				newCompositeNode(grammarAccess.getTimeoutFunctionAccess().getTimeAmountOrRefParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_TimeAmountOrRef_2=ruleTimeAmountOrRef(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TimeAmountOrRef_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:1116:4: (otherlv_3= '(' this_TimeAmountOrRef_4= ruleTimeAmountOrRef[$current] otherlv_5= ')' )
                    {
                    // InternalReflexOld.g:1116:4: (otherlv_3= '(' this_TimeAmountOrRef_4= ruleTimeAmountOrRef[$current] otherlv_5= ')' )
                    // InternalReflexOld.g:1117:5: otherlv_3= '(' this_TimeAmountOrRef_4= ruleTimeAmountOrRef[$current] otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getTimeoutFunctionAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeoutFunctionRule());
                      					}
                      					newCompositeNode(grammarAccess.getTimeoutFunctionAccess().getTimeAmountOrRefParserRuleCall_1_1_1());
                      				
                    }
                    pushFollow(FOLLOW_25);
                    this_TimeAmountOrRef_4=ruleTimeAmountOrRef(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_TimeAmountOrRef_4;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    otherlv_5=(Token)match(input,59,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getTimeoutFunctionAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalReflexOld.g:1138:3: ( (lv_body_6_0= ruleStatement ) )
            // InternalReflexOld.g:1139:4: (lv_body_6_0= ruleStatement )
            {
            // InternalReflexOld.g:1139:4: (lv_body_6_0= ruleStatement )
            // InternalReflexOld.g:1140:5: lv_body_6_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTimeoutFunctionAccess().getBodyStatementParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTimeoutFunctionRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_6_0,
              						"ru.iaie.reflexold.ReflexOld.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeoutFunction"


    // $ANTLR start "ruleTimeAmountOrRef"
    // InternalReflexOld.g:1162:1: ruleTimeAmountOrRef[EObject in_current] returns [EObject current=in_current] : ( ( (lv_time_0_0= RULE_INTEGER ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTimeAmountOrRef(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_time_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReflexOld.g:1168:2: ( ( ( (lv_time_0_0= RULE_INTEGER ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReflexOld.g:1169:2: ( ( (lv_time_0_0= RULE_INTEGER ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReflexOld.g:1169:2: ( ( (lv_time_0_0= RULE_INTEGER ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INTEGER) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalReflexOld.g:1170:3: ( (lv_time_0_0= RULE_INTEGER ) )
                    {
                    // InternalReflexOld.g:1170:3: ( (lv_time_0_0= RULE_INTEGER ) )
                    // InternalReflexOld.g:1171:4: (lv_time_0_0= RULE_INTEGER )
                    {
                    // InternalReflexOld.g:1171:4: (lv_time_0_0= RULE_INTEGER )
                    // InternalReflexOld.g:1172:5: lv_time_0_0= RULE_INTEGER
                    {
                    lv_time_0_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_time_0_0, grammarAccess.getTimeAmountOrRefAccess().getTimeINTEGERTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeAmountOrRefRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"time",
                      						lv_time_0_0,
                      						"ru.iaie.reflexold.ReflexOld.INTEGER");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:1189:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalReflexOld.g:1189:3: ( (otherlv_1= RULE_ID ) )
                    // InternalReflexOld.g:1190:4: (otherlv_1= RULE_ID )
                    {
                    // InternalReflexOld.g:1190:4: (otherlv_1= RULE_ID )
                    // InternalReflexOld.g:1191:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTimeAmountOrRefRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getTimeAmountOrRefAccess().getRefIdReferenceCrossReference_1_0());
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeAmountOrRef"


    // $ANTLR start "entryRuleFunction"
    // InternalReflexOld.g:1206:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalReflexOld.g:1206:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalReflexOld.g:1207:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalReflexOld.g:1213:1: ruleFunction returns [EObject current=null] : ( (otherlv_0= 'FUNCTION' | otherlv_1= '\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F' ) ( (lv_returnType_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_argTypes_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_argTypes_7_0= ruleType ) ) )* otherlv_8= ')' otherlv_9= ';' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_returnType_2_0 = null;

        Enumerator lv_argTypes_5_0 = null;

        Enumerator lv_argTypes_7_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1219:2: ( ( (otherlv_0= 'FUNCTION' | otherlv_1= '\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F' ) ( (lv_returnType_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_argTypes_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_argTypes_7_0= ruleType ) ) )* otherlv_8= ')' otherlv_9= ';' ) )
            // InternalReflexOld.g:1220:2: ( (otherlv_0= 'FUNCTION' | otherlv_1= '\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F' ) ( (lv_returnType_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_argTypes_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_argTypes_7_0= ruleType ) ) )* otherlv_8= ')' otherlv_9= ';' )
            {
            // InternalReflexOld.g:1220:2: ( (otherlv_0= 'FUNCTION' | otherlv_1= '\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F' ) ( (lv_returnType_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_argTypes_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_argTypes_7_0= ruleType ) ) )* otherlv_8= ')' otherlv_9= ';' )
            // InternalReflexOld.g:1221:3: (otherlv_0= 'FUNCTION' | otherlv_1= '\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F' ) ( (lv_returnType_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_argTypes_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_argTypes_7_0= ruleType ) ) )* otherlv_8= ')' otherlv_9= ';'
            {
            // InternalReflexOld.g:1221:3: (otherlv_0= 'FUNCTION' | otherlv_1= '\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==60) ) {
                alt23=1;
            }
            else if ( (LA23_0==61) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalReflexOld.g:1222:4: otherlv_0= 'FUNCTION'
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFUNCTIONKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:1227:4: otherlv_1= '\\u0424\\u0423\\u041D\\u041A\\u0426\\u0418\\u042F'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getCyrillicCapitalLetterEfCyrillicCapitalLetterUCyrillicCapitalLetterEnCyrillicCapitalLetterKaCyrillicCapitalLetterTseCyrillicCapitalLetterICyrillicCapitalLetterYaKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:1232:3: ( (lv_returnType_2_0= ruleType ) )
            // InternalReflexOld.g:1233:4: (lv_returnType_2_0= ruleType )
            {
            // InternalReflexOld.g:1233:4: (lv_returnType_2_0= ruleType )
            // InternalReflexOld.g:1234:5: lv_returnType_2_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_returnType_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_2_0,
              						"ru.iaie.reflexold.ReflexOld.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:1251:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalReflexOld.g:1252:4: (lv_name_3_0= RULE_ID )
            {
            // InternalReflexOld.g:1252:4: (lv_name_3_0= RULE_ID )
            // InternalReflexOld.g:1253:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"ru.iaie.reflexold.ReflexOld.ID");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,58,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalReflexOld.g:1273:3: ( (lv_argTypes_5_0= ruleType ) )
            // InternalReflexOld.g:1274:4: (lv_argTypes_5_0= ruleType )
            {
            // InternalReflexOld.g:1274:4: (lv_argTypes_5_0= ruleType )
            // InternalReflexOld.g:1275:5: lv_argTypes_5_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getArgTypesTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_argTypes_5_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					add(
              						current,
              						"argTypes",
              						lv_argTypes_5_0,
              						"ru.iaie.reflexold.ReflexOld.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:1292:3: (otherlv_6= ',' ( (lv_argTypes_7_0= ruleType ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalReflexOld.g:1293:4: otherlv_6= ',' ( (lv_argTypes_7_0= ruleType ) )
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalReflexOld.g:1297:4: ( (lv_argTypes_7_0= ruleType ) )
            	    // InternalReflexOld.g:1298:5: (lv_argTypes_7_0= ruleType )
            	    {
            	    // InternalReflexOld.g:1298:5: (lv_argTypes_7_0= ruleType )
            	    // InternalReflexOld.g:1299:6: lv_argTypes_7_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFunctionAccess().getArgTypesTypeEnumRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_argTypes_7_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFunctionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"argTypes",
            	      							lv_argTypes_7_0,
            	      							"ru.iaie.reflexold.ReflexOld.Type");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_8=(Token)match(input,59,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_9=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleConst"
    // InternalReflexOld.g:1329:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalReflexOld.g:1329:46: (iv_ruleConst= ruleConst EOF )
            // InternalReflexOld.g:1330:2: iv_ruleConst= ruleConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConst; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalReflexOld.g:1336:1: ruleConst returns [EObject current=null] : ( (otherlv_0= 'CONST' | otherlv_1= '\\u041A\\u041E\\u041D\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1342:2: ( ( (otherlv_0= 'CONST' | otherlv_1= '\\u041A\\u041E\\u041D\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // InternalReflexOld.g:1343:2: ( (otherlv_0= 'CONST' | otherlv_1= '\\u041A\\u041E\\u041D\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // InternalReflexOld.g:1343:2: ( (otherlv_0= 'CONST' | otherlv_1= '\\u041A\\u041E\\u041D\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            // InternalReflexOld.g:1344:3: (otherlv_0= 'CONST' | otherlv_1= '\\u041A\\u041E\\u041D\\u0421\\u0422' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            // InternalReflexOld.g:1344:3: (otherlv_0= 'CONST' | otherlv_1= '\\u041A\\u041E\\u041D\\u0421\\u0422' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==62) ) {
                alt25=1;
            }
            else if ( (LA25_0==63) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalReflexOld.g:1345:4: otherlv_0= 'CONST'
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConstAccess().getCONSTKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:1350:4: otherlv_1= '\\u041A\\u041E\\u041D\\u0421\\u0422'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConstAccess().getCyrillicCapitalLetterKaCyrillicCapitalLetterOCyrillicCapitalLetterEnCyrillicCapitalLetterEsCyrillicCapitalLetterTeKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:1355:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalReflexOld.g:1356:4: (lv_name_2_0= RULE_ID )
            {
            // InternalReflexOld.g:1356:4: (lv_name_2_0= RULE_ID )
            // InternalReflexOld.g:1357:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getConstAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"ru.iaie.reflexold.ReflexOld.ID");
              				
            }

            }


            }

            // InternalReflexOld.g:1373:3: ( (lv_value_3_0= ruleExpression ) )
            // InternalReflexOld.g:1374:4: (lv_value_3_0= ruleExpression )
            {
            // InternalReflexOld.g:1374:4: (lv_value_3_0= ruleExpression )
            // InternalReflexOld.g:1375:5: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstAccess().getValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"ru.iaie.reflexold.ReflexOld.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConstAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleEnum"
    // InternalReflexOld.g:1400:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalReflexOld.g:1400:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalReflexOld.g:1401:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalReflexOld.g:1407:1: ruleEnum returns [EObject current=null] : ( (otherlv_0= 'ENUM' | otherlv_1= '\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415' ) otherlv_2= '{' ( (lv_enumMembers_3_0= ruleEnumMember ) ) (otherlv_4= ',' ( (lv_enumMembers_5_0= ruleEnumMember ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_enumMembers_3_0 = null;

        EObject lv_enumMembers_5_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1413:2: ( ( (otherlv_0= 'ENUM' | otherlv_1= '\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415' ) otherlv_2= '{' ( (lv_enumMembers_3_0= ruleEnumMember ) ) (otherlv_4= ',' ( (lv_enumMembers_5_0= ruleEnumMember ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalReflexOld.g:1414:2: ( (otherlv_0= 'ENUM' | otherlv_1= '\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415' ) otherlv_2= '{' ( (lv_enumMembers_3_0= ruleEnumMember ) ) (otherlv_4= ',' ( (lv_enumMembers_5_0= ruleEnumMember ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalReflexOld.g:1414:2: ( (otherlv_0= 'ENUM' | otherlv_1= '\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415' ) otherlv_2= '{' ( (lv_enumMembers_3_0= ruleEnumMember ) ) (otherlv_4= ',' ( (lv_enumMembers_5_0= ruleEnumMember ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalReflexOld.g:1415:3: (otherlv_0= 'ENUM' | otherlv_1= '\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415' ) otherlv_2= '{' ( (lv_enumMembers_3_0= ruleEnumMember ) ) (otherlv_4= ',' ( (lv_enumMembers_5_0= ruleEnumMember ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // InternalReflexOld.g:1415:3: (otherlv_0= 'ENUM' | otherlv_1= '\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==64) ) {
                alt26=1;
            }
            else if ( (LA26_0==65) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalReflexOld.g:1416:4: otherlv_0= 'ENUM'
                    {
                    otherlv_0=(Token)match(input,64,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getENUMKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:1421:4: otherlv_1= '\\u041F\\u0415\\u0420\\u0415\\u0427\\u0418\\u0421\\u041B\\u0415\\u041D\\u0418\\u0415'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterIeCyrillicCapitalLetterErCyrillicCapitalLetterIeCyrillicCapitalLetterCheCyrillicCapitalLetterICyrillicCapitalLetterEsCyrillicCapitalLetterElCyrillicCapitalLetterIeCyrillicCapitalLetterEnCyrillicCapitalLetterICyrillicCapitalLetterIeKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalReflexOld.g:1430:3: ( (lv_enumMembers_3_0= ruleEnumMember ) )
            // InternalReflexOld.g:1431:4: (lv_enumMembers_3_0= ruleEnumMember )
            {
            // InternalReflexOld.g:1431:4: (lv_enumMembers_3_0= ruleEnumMember )
            // InternalReflexOld.g:1432:5: lv_enumMembers_3_0= ruleEnumMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumAccess().getEnumMembersEnumMemberParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_enumMembers_3_0=ruleEnumMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumRule());
              					}
              					add(
              						current,
              						"enumMembers",
              						lv_enumMembers_3_0,
              						"ru.iaie.reflexold.ReflexOld.EnumMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:1449:3: (otherlv_4= ',' ( (lv_enumMembers_5_0= ruleEnumMember ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalReflexOld.g:1450:4: otherlv_4= ',' ( (lv_enumMembers_5_0= ruleEnumMember ) )
            	    {
            	    otherlv_4=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalReflexOld.g:1454:4: ( (lv_enumMembers_5_0= ruleEnumMember ) )
            	    // InternalReflexOld.g:1455:5: (lv_enumMembers_5_0= ruleEnumMember )
            	    {
            	    // InternalReflexOld.g:1455:5: (lv_enumMembers_5_0= ruleEnumMember )
            	    // InternalReflexOld.g:1456:6: lv_enumMembers_5_0= ruleEnumMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumAccess().getEnumMembersEnumMemberParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_enumMembers_5_0=ruleEnumMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumRule());
            	      						}
            	      						add(
            	      							current,
            	      							"enumMembers",
            	      							lv_enumMembers_5_0,
            	      							"ru.iaie.reflexold.ReflexOld.EnumMember");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEnumAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumMember"
    // InternalReflexOld.g:1486:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // InternalReflexOld.g:1486:51: (iv_ruleEnumMember= ruleEnumMember EOF )
            // InternalReflexOld.g:1487:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumMember"


    // $ANTLR start "ruleEnumMember"
    // InternalReflexOld.g:1493:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1499:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) )
            // InternalReflexOld.g:1500:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
            {
            // InternalReflexOld.g:1500:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
            // InternalReflexOld.g:1501:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
            {
            // InternalReflexOld.g:1501:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReflexOld.g:1502:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReflexOld.g:1502:4: (lv_name_0_0= RULE_ID )
            // InternalReflexOld.g:1503:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumMemberRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"ru.iaie.reflexold.ReflexOld.ID");
              				
            }

            }


            }

            // InternalReflexOld.g:1519:3: (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==53) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalReflexOld.g:1520:4: otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalReflexOld.g:1524:4: ( (lv_value_2_0= ruleExpression ) )
                    // InternalReflexOld.g:1525:5: (lv_value_2_0= ruleExpression )
                    {
                    // InternalReflexOld.g:1525:5: (lv_value_2_0= ruleExpression )
                    // InternalReflexOld.g:1526:6: lv_value_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnumMemberAccess().getValueExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnumMemberRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"ru.iaie.reflexold.ReflexOld.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumMember"


    // $ANTLR start "entryRuleStatement"
    // InternalReflexOld.g:1548:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalReflexOld.g:1548:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalReflexOld.g:1549:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalReflexOld.g:1555:1: ruleStatement returns [EObject current=null] : ( ( () otherlv_1= ';' ) | this_CompoundStatement_2= ruleCompoundStatement | this_StartProcStat_3= ruleStartProcStat | this_StopProcStat_4= ruleStopProcStat | this_ErrorStat_5= ruleErrorStat | this_RestartStat_6= ruleRestartStat | this_ResetStat_7= ruleResetStat | this_LoopStat_8= ruleLoopStat | this_SetStateStat_9= ruleSetStateStat | this_IfElseStat_10= ruleIfElseStat | this_SwitchStat_11= ruleSwitchStat | (this_Expression_12= ruleExpression otherlv_13= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_13=null;
        EObject this_CompoundStatement_2 = null;

        EObject this_StartProcStat_3 = null;

        EObject this_StopProcStat_4 = null;

        EObject this_ErrorStat_5 = null;

        EObject this_RestartStat_6 = null;

        EObject this_ResetStat_7 = null;

        EObject this_LoopStat_8 = null;

        EObject this_SetStateStat_9 = null;

        EObject this_IfElseStat_10 = null;

        EObject this_SwitchStat_11 = null;

        EObject this_Expression_12 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1561:2: ( ( ( () otherlv_1= ';' ) | this_CompoundStatement_2= ruleCompoundStatement | this_StartProcStat_3= ruleStartProcStat | this_StopProcStat_4= ruleStopProcStat | this_ErrorStat_5= ruleErrorStat | this_RestartStat_6= ruleRestartStat | this_ResetStat_7= ruleResetStat | this_LoopStat_8= ruleLoopStat | this_SetStateStat_9= ruleSetStateStat | this_IfElseStat_10= ruleIfElseStat | this_SwitchStat_11= ruleSwitchStat | (this_Expression_12= ruleExpression otherlv_13= ';' ) ) )
            // InternalReflexOld.g:1562:2: ( ( () otherlv_1= ';' ) | this_CompoundStatement_2= ruleCompoundStatement | this_StartProcStat_3= ruleStartProcStat | this_StopProcStat_4= ruleStopProcStat | this_ErrorStat_5= ruleErrorStat | this_RestartStat_6= ruleRestartStat | this_ResetStat_7= ruleResetStat | this_LoopStat_8= ruleLoopStat | this_SetStateStat_9= ruleSetStateStat | this_IfElseStat_10= ruleIfElseStat | this_SwitchStat_11= ruleSwitchStat | (this_Expression_12= ruleExpression otherlv_13= ';' ) )
            {
            // InternalReflexOld.g:1562:2: ( ( () otherlv_1= ';' ) | this_CompoundStatement_2= ruleCompoundStatement | this_StartProcStat_3= ruleStartProcStat | this_StopProcStat_4= ruleStopProcStat | this_ErrorStat_5= ruleErrorStat | this_RestartStat_6= ruleRestartStat | this_ResetStat_7= ruleResetStat | this_LoopStat_8= ruleLoopStat | this_SetStateStat_9= ruleSetStateStat | this_IfElseStat_10= ruleIfElseStat | this_SwitchStat_11= ruleSwitchStat | (this_Expression_12= ruleExpression otherlv_13= ';' ) )
            int alt29=12;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalReflexOld.g:1563:3: ( () otherlv_1= ';' )
                    {
                    // InternalReflexOld.g:1563:3: ( () otherlv_1= ';' )
                    // InternalReflexOld.g:1564:4: () otherlv_1= ';'
                    {
                    // InternalReflexOld.g:1564:4: ()
                    // InternalReflexOld.g:1565:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getStatementAccess().getStatementAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:1577:3: this_CompoundStatement_2= ruleCompoundStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getCompoundStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompoundStatement_2=ruleCompoundStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CompoundStatement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:1586:3: this_StartProcStat_3= ruleStartProcStat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getStartProcStatParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StartProcStat_3=ruleStartProcStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StartProcStat_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalReflexOld.g:1595:3: this_StopProcStat_4= ruleStopProcStat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getStopProcStatParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StopProcStat_4=ruleStopProcStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StopProcStat_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalReflexOld.g:1604:3: this_ErrorStat_5= ruleErrorStat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getErrorStatParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ErrorStat_5=ruleErrorStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ErrorStat_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalReflexOld.g:1613:3: this_RestartStat_6= ruleRestartStat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getRestartStatParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RestartStat_6=ruleRestartStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RestartStat_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalReflexOld.g:1622:3: this_ResetStat_7= ruleResetStat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getResetStatParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ResetStat_7=ruleResetStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ResetStat_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalReflexOld.g:1631:3: this_LoopStat_8= ruleLoopStat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LoopStat_8=ruleLoopStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LoopStat_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalReflexOld.g:1640:3: this_SetStateStat_9= ruleSetStateStat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSetStateStatParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SetStateStat_9=ruleSetStateStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SetStateStat_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalReflexOld.g:1649:3: this_IfElseStat_10= ruleIfElseStat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfElseStatParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfElseStat_10=ruleIfElseStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfElseStat_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalReflexOld.g:1658:3: this_SwitchStat_11= ruleSwitchStat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchStat_11=ruleSwitchStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SwitchStat_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalReflexOld.g:1667:3: (this_Expression_12= ruleExpression otherlv_13= ';' )
                    {
                    // InternalReflexOld.g:1667:3: (this_Expression_12= ruleExpression otherlv_13= ';' )
                    // InternalReflexOld.g:1668:4: this_Expression_12= ruleExpression otherlv_13= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_11_0());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_Expression_12=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_12;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_13=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getSemicolonKeyword_11_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStatementSequence"
    // InternalReflexOld.g:1685:1: entryRuleStatementSequence returns [EObject current=null] : iv_ruleStatementSequence= ruleStatementSequence EOF ;
    public final EObject entryRuleStatementSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementSequence = null;


        try {
            // InternalReflexOld.g:1685:58: (iv_ruleStatementSequence= ruleStatementSequence EOF )
            // InternalReflexOld.g:1686:2: iv_ruleStatementSequence= ruleStatementSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementSequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatementSequence=ruleStatementSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementSequence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementSequence"


    // $ANTLR start "ruleStatementSequence"
    // InternalReflexOld.g:1692:1: ruleStatementSequence returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleStatement ) )* ) ;
    public final EObject ruleStatementSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1698:2: ( ( () ( (lv_statements_1_0= ruleStatement ) )* ) )
            // InternalReflexOld.g:1699:2: ( () ( (lv_statements_1_0= ruleStatement ) )* )
            {
            // InternalReflexOld.g:1699:2: ( () ( (lv_statements_1_0= ruleStatement ) )* )
            // InternalReflexOld.g:1700:3: () ( (lv_statements_1_0= ruleStatement ) )*
            {
            // InternalReflexOld.g:1700:3: ()
            // InternalReflexOld.g:1701:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStatementSequenceAccess().getStatementSequenceAction_0(),
              					current);
              			
            }

            }

            // InternalReflexOld.g:1707:3: ( (lv_statements_1_0= ruleStatement ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_BOOL_LITERAL)||LA30_0==35||(LA30_0>=39 && LA30_0<=41)||LA30_0==58||(LA30_0>=66 && LA30_0<=67)||(LA30_0>=70 && LA30_0<=71)||(LA30_0>=79 && LA30_0<=86)||(LA30_0>=89 && LA30_0<=92)||(LA30_0>=104 && LA30_0<=105)||(LA30_0>=115 && LA30_0<=118)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalReflexOld.g:1708:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalReflexOld.g:1708:4: (lv_statements_1_0= ruleStatement )
            	    // InternalReflexOld.g:1709:5: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStatementSequenceAccess().getStatementsStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStatementSequenceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_1_0,
            	      						"ru.iaie.reflexold.ReflexOld.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementSequence"


    // $ANTLR start "entryRuleCompoundStatement"
    // InternalReflexOld.g:1730:1: entryRuleCompoundStatement returns [EObject current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final EObject entryRuleCompoundStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundStatement = null;


        try {
            // InternalReflexOld.g:1730:58: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // InternalReflexOld.g:1731:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompoundStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundStatement"


    // $ANTLR start "ruleCompoundStatement"
    // InternalReflexOld.g:1737:1: ruleCompoundStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleCompoundStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1743:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalReflexOld.g:1744:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalReflexOld.g:1744:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalReflexOld.g:1745:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalReflexOld.g:1745:3: ()
            // InternalReflexOld.g:1746:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCompoundStatementAccess().getCompoundStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCompoundStatementAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalReflexOld.g:1756:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_BOOL_LITERAL)||LA31_0==35||(LA31_0>=39 && LA31_0<=41)||LA31_0==58||(LA31_0>=66 && LA31_0<=67)||(LA31_0>=70 && LA31_0<=71)||(LA31_0>=79 && LA31_0<=86)||(LA31_0>=89 && LA31_0<=92)||(LA31_0>=104 && LA31_0<=105)||(LA31_0>=115 && LA31_0<=118)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalReflexOld.g:1757:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalReflexOld.g:1757:4: (lv_statements_2_0= ruleStatement )
            	    // InternalReflexOld.g:1758:5: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCompoundStatementAccess().getStatementsStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCompoundStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"ru.iaie.reflexold.ReflexOld.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCompoundStatementAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundStatement"


    // $ANTLR start "entryRuleIfElseStat"
    // InternalReflexOld.g:1783:1: entryRuleIfElseStat returns [EObject current=null] : iv_ruleIfElseStat= ruleIfElseStat EOF ;
    public final EObject entryRuleIfElseStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStat = null;


        try {
            // InternalReflexOld.g:1783:51: (iv_ruleIfElseStat= ruleIfElseStat EOF )
            // InternalReflexOld.g:1784:2: iv_ruleIfElseStat= ruleIfElseStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfElseStat=ruleIfElseStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElseStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfElseStat"


    // $ANTLR start "ruleIfElseStat"
    // InternalReflexOld.g:1790:1: ruleIfElseStat returns [EObject current=null] : ( (otherlv_0= 'IF' | otherlv_1= '\\u0415\\u0421\\u041B\\u0418' ) otherlv_2= '(' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleStatement ) ) ( ( ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )=> (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' ) ) ( (lv_else_8_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIfElseStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_cond_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_8_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1796:2: ( ( (otherlv_0= 'IF' | otherlv_1= '\\u0415\\u0421\\u041B\\u0418' ) otherlv_2= '(' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleStatement ) ) ( ( ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )=> (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' ) ) ( (lv_else_8_0= ruleStatement ) ) )? ) )
            // InternalReflexOld.g:1797:2: ( (otherlv_0= 'IF' | otherlv_1= '\\u0415\\u0421\\u041B\\u0418' ) otherlv_2= '(' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleStatement ) ) ( ( ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )=> (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' ) ) ( (lv_else_8_0= ruleStatement ) ) )? )
            {
            // InternalReflexOld.g:1797:2: ( (otherlv_0= 'IF' | otherlv_1= '\\u0415\\u0421\\u041B\\u0418' ) otherlv_2= '(' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleStatement ) ) ( ( ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )=> (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' ) ) ( (lv_else_8_0= ruleStatement ) ) )? )
            // InternalReflexOld.g:1798:3: (otherlv_0= 'IF' | otherlv_1= '\\u0415\\u0421\\u041B\\u0418' ) otherlv_2= '(' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleStatement ) ) ( ( ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )=> (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' ) ) ( (lv_else_8_0= ruleStatement ) ) )?
            {
            // InternalReflexOld.g:1798:3: (otherlv_0= 'IF' | otherlv_1= '\\u0415\\u0421\\u041B\\u0418' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==66) ) {
                alt32=1;
            }
            else if ( (LA32_0==67) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalReflexOld.g:1799:4: otherlv_0= 'IF'
                    {
                    otherlv_0=(Token)match(input,66,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getIfElseStatAccess().getIFKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:1804:4: otherlv_1= '\\u0415\\u0421\\u041B\\u0418'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getIfElseStatAccess().getCyrillicCapitalLetterIeCyrillicCapitalLetterEsCyrillicCapitalLetterElCyrillicCapitalLetterIKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,58,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfElseStatAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalReflexOld.g:1813:3: ( (lv_cond_3_0= ruleExpression ) )
            // InternalReflexOld.g:1814:4: (lv_cond_3_0= ruleExpression )
            {
            // InternalReflexOld.g:1814:4: (lv_cond_3_0= ruleExpression )
            // InternalReflexOld.g:1815:5: lv_cond_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfElseStatAccess().getCondExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_cond_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfElseStatRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_3_0,
              						"ru.iaie.reflexold.ReflexOld.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,59,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfElseStatAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalReflexOld.g:1836:3: ( (lv_then_5_0= ruleStatement ) )
            // InternalReflexOld.g:1837:4: (lv_then_5_0= ruleStatement )
            {
            // InternalReflexOld.g:1837:4: (lv_then_5_0= ruleStatement )
            // InternalReflexOld.g:1838:5: lv_then_5_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfElseStatAccess().getThenStatementParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_then_5_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfElseStatRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_5_0,
              						"ru.iaie.reflexold.ReflexOld.Statement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:1855:3: ( ( ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )=> (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' ) ) ( (lv_else_8_0= ruleStatement ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==68) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred1_InternalReflexOld()) ) {
                    alt34=1;
                }
            }
            else if ( (LA34_0==69) ) {
                int LA34_2 = input.LA(2);

                if ( (synpred1_InternalReflexOld()) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalReflexOld.g:1856:4: ( ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )=> (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' ) ) ( (lv_else_8_0= ruleStatement ) )
                    {
                    // InternalReflexOld.g:1856:4: ( ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )=> (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )
                    // InternalReflexOld.g:1857:5: ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )=> (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' )
                    {
                    // InternalReflexOld.g:1863:5: (otherlv_6= 'ELSE' | otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==68) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==69) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalReflexOld.g:1864:6: otherlv_6= 'ELSE'
                            {
                            otherlv_6=(Token)match(input,68,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getIfElseStatAccess().getELSEKeyword_5_0_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalReflexOld.g:1869:6: otherlv_7= '\\u0418\\u041D\\u0410\\u0427\\u0415'
                            {
                            otherlv_7=(Token)match(input,69,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getIfElseStatAccess().getCyrillicCapitalLetterICyrillicCapitalLetterEnCyrillicCapitalLetterACyrillicCapitalLetterCheCyrillicCapitalLetterIeKeyword_5_0_0_1());
                              					
                            }

                            }
                            break;

                    }


                    }

                    // InternalReflexOld.g:1875:4: ( (lv_else_8_0= ruleStatement ) )
                    // InternalReflexOld.g:1876:5: (lv_else_8_0= ruleStatement )
                    {
                    // InternalReflexOld.g:1876:5: (lv_else_8_0= ruleStatement )
                    // InternalReflexOld.g:1877:6: lv_else_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfElseStatAccess().getElseStatementParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_8_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfElseStatRule());
                      						}
                      						set(
                      							current,
                      							"else",
                      							lv_else_8_0,
                      							"ru.iaie.reflexold.ReflexOld.Statement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfElseStat"


    // $ANTLR start "entryRuleSwitchStat"
    // InternalReflexOld.g:1899:1: entryRuleSwitchStat returns [EObject current=null] : iv_ruleSwitchStat= ruleSwitchStat EOF ;
    public final EObject entryRuleSwitchStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStat = null;


        try {
            // InternalReflexOld.g:1899:51: (iv_ruleSwitchStat= ruleSwitchStat EOF )
            // InternalReflexOld.g:1900:2: iv_ruleSwitchStat= ruleSwitchStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchStat=ruleSwitchStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchStat"


    // $ANTLR start "ruleSwitchStat"
    // InternalReflexOld.g:1906:1: ruleSwitchStat returns [EObject current=null] : ( (otherlv_0= 'SWITCH' | otherlv_1= '\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420' ) otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_options_6_0= ruleCaseStat ) )* ( (lv_defaultOption_7_0= ruleDefaultStat ) )? otherlv_8= '}' ) ;
    public final EObject ruleSwitchStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_expr_3_0 = null;

        EObject lv_options_6_0 = null;

        EObject lv_defaultOption_7_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:1912:2: ( ( (otherlv_0= 'SWITCH' | otherlv_1= '\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420' ) otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_options_6_0= ruleCaseStat ) )* ( (lv_defaultOption_7_0= ruleDefaultStat ) )? otherlv_8= '}' ) )
            // InternalReflexOld.g:1913:2: ( (otherlv_0= 'SWITCH' | otherlv_1= '\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420' ) otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_options_6_0= ruleCaseStat ) )* ( (lv_defaultOption_7_0= ruleDefaultStat ) )? otherlv_8= '}' )
            {
            // InternalReflexOld.g:1913:2: ( (otherlv_0= 'SWITCH' | otherlv_1= '\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420' ) otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_options_6_0= ruleCaseStat ) )* ( (lv_defaultOption_7_0= ruleDefaultStat ) )? otherlv_8= '}' )
            // InternalReflexOld.g:1914:3: (otherlv_0= 'SWITCH' | otherlv_1= '\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420' ) otherlv_2= '(' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_options_6_0= ruleCaseStat ) )* ( (lv_defaultOption_7_0= ruleDefaultStat ) )? otherlv_8= '}'
            {
            // InternalReflexOld.g:1914:3: (otherlv_0= 'SWITCH' | otherlv_1= '\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            else if ( (LA35_0==71) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalReflexOld.g:1915:4: otherlv_0= 'SWITCH'
                    {
                    otherlv_0=(Token)match(input,70,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSwitchStatAccess().getSWITCHKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:1920:4: otherlv_1= '\\u0420\\u0410\\u0417\\u0411\\u041E\\u0420'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSwitchStatAccess().getCyrillicCapitalLetterErCyrillicCapitalLetterACyrillicCapitalLetterZeCyrillicCapitalLetterBeCyrillicCapitalLetterOCyrillicCapitalLetterErKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,58,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSwitchStatAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalReflexOld.g:1929:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalReflexOld.g:1930:4: (lv_expr_3_0= ruleExpression )
            {
            // InternalReflexOld.g:1930:4: (lv_expr_3_0= ruleExpression )
            // InternalReflexOld.g:1931:5: lv_expr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSwitchStatAccess().getExprExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_expr_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSwitchStatRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"ru.iaie.reflexold.ReflexOld.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,59,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSwitchStatAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_5=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSwitchStatAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalReflexOld.g:1956:3: ( (lv_options_6_0= ruleCaseStat ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=72 && LA36_0<=73)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalReflexOld.g:1957:4: (lv_options_6_0= ruleCaseStat )
            	    {
            	    // InternalReflexOld.g:1957:4: (lv_options_6_0= ruleCaseStat )
            	    // InternalReflexOld.g:1958:5: lv_options_6_0= ruleCaseStat
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchStatAccess().getOptionsCaseStatParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_options_6_0=ruleCaseStat();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchStatRule());
            	      					}
            	      					add(
            	      						current,
            	      						"options",
            	      						lv_options_6_0,
            	      						"ru.iaie.reflexold.ReflexOld.CaseStat");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalReflexOld.g:1975:3: ( (lv_defaultOption_7_0= ruleDefaultStat ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=75 && LA37_0<=76)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalReflexOld.g:1976:4: (lv_defaultOption_7_0= ruleDefaultStat )
                    {
                    // InternalReflexOld.g:1976:4: (lv_defaultOption_7_0= ruleDefaultStat )
                    // InternalReflexOld.g:1977:5: lv_defaultOption_7_0= ruleDefaultStat
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSwitchStatAccess().getDefaultOptionDefaultStatParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_defaultOption_7_0=ruleDefaultStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSwitchStatRule());
                      					}
                      					set(
                      						current,
                      						"defaultOption",
                      						lv_defaultOption_7_0,
                      						"ru.iaie.reflexold.ReflexOld.DefaultStat");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getSwitchStatAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchStat"


    // $ANTLR start "entryRuleCaseStat"
    // InternalReflexOld.g:2002:1: entryRuleCaseStat returns [EObject current=null] : iv_ruleCaseStat= ruleCaseStat EOF ;
    public final EObject entryRuleCaseStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStat = null;


        try {
            // InternalReflexOld.g:2002:49: (iv_ruleCaseStat= ruleCaseStat EOF )
            // InternalReflexOld.g:2003:2: iv_ruleCaseStat= ruleCaseStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseStat=ruleCaseStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseStat"


    // $ANTLR start "ruleCaseStat"
    // InternalReflexOld.g:2009:1: ruleCaseStat returns [EObject current=null] : ( (otherlv_0= 'CASE' | otherlv_1= '\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419' ) ( (lv_option_2_0= ruleExpression ) ) otherlv_3= ':' otherlv_4= '{' this_SwitchOptionStatSequence_5= ruleSwitchOptionStatSequence[$current] otherlv_6= '}' ) ;
    public final EObject ruleCaseStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_option_2_0 = null;

        EObject this_SwitchOptionStatSequence_5 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:2015:2: ( ( (otherlv_0= 'CASE' | otherlv_1= '\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419' ) ( (lv_option_2_0= ruleExpression ) ) otherlv_3= ':' otherlv_4= '{' this_SwitchOptionStatSequence_5= ruleSwitchOptionStatSequence[$current] otherlv_6= '}' ) )
            // InternalReflexOld.g:2016:2: ( (otherlv_0= 'CASE' | otherlv_1= '\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419' ) ( (lv_option_2_0= ruleExpression ) ) otherlv_3= ':' otherlv_4= '{' this_SwitchOptionStatSequence_5= ruleSwitchOptionStatSequence[$current] otherlv_6= '}' )
            {
            // InternalReflexOld.g:2016:2: ( (otherlv_0= 'CASE' | otherlv_1= '\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419' ) ( (lv_option_2_0= ruleExpression ) ) otherlv_3= ':' otherlv_4= '{' this_SwitchOptionStatSequence_5= ruleSwitchOptionStatSequence[$current] otherlv_6= '}' )
            // InternalReflexOld.g:2017:3: (otherlv_0= 'CASE' | otherlv_1= '\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419' ) ( (lv_option_2_0= ruleExpression ) ) otherlv_3= ':' otherlv_4= '{' this_SwitchOptionStatSequence_5= ruleSwitchOptionStatSequence[$current] otherlv_6= '}'
            {
            // InternalReflexOld.g:2017:3: (otherlv_0= 'CASE' | otherlv_1= '\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==72) ) {
                alt38=1;
            }
            else if ( (LA38_0==73) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalReflexOld.g:2018:4: otherlv_0= 'CASE'
                    {
                    otherlv_0=(Token)match(input,72,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCaseStatAccess().getCASEKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2023:4: otherlv_1= '\\u0421\\u041B\\u0423\\u0427\\u0410\\u0419'
                    {
                    otherlv_1=(Token)match(input,73,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCaseStatAccess().getCyrillicCapitalLetterEsCyrillicCapitalLetterElCyrillicCapitalLetterUCyrillicCapitalLetterCheCyrillicCapitalLetterACyrillicCapitalLetterShortIKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:2028:3: ( (lv_option_2_0= ruleExpression ) )
            // InternalReflexOld.g:2029:4: (lv_option_2_0= ruleExpression )
            {
            // InternalReflexOld.g:2029:4: (lv_option_2_0= ruleExpression )
            // InternalReflexOld.g:2030:5: lv_option_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseStatAccess().getOptionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_option_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseStatRule());
              					}
              					set(
              						current,
              						"option",
              						lv_option_2_0,
              						"ru.iaie.reflexold.ReflexOld.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,74,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCaseStatAccess().getColonKeyword_2());
              		
            }
            otherlv_4=(Token)match(input,35,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCaseStatAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getCaseStatRule());
              			}
              			newCompositeNode(grammarAccess.getCaseStatAccess().getSwitchOptionStatSequenceParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_13);
            this_SwitchOptionStatSequence_5=ruleSwitchOptionStatSequence(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SwitchOptionStatSequence_5;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_6=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getCaseStatAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseStat"


    // $ANTLR start "entryRuleDefaultStat"
    // InternalReflexOld.g:2074:1: entryRuleDefaultStat returns [EObject current=null] : iv_ruleDefaultStat= ruleDefaultStat EOF ;
    public final EObject entryRuleDefaultStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultStat = null;


        try {
            // InternalReflexOld.g:2074:52: (iv_ruleDefaultStat= ruleDefaultStat EOF )
            // InternalReflexOld.g:2075:2: iv_ruleDefaultStat= ruleDefaultStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultStat=ruleDefaultStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultStat"


    // $ANTLR start "ruleDefaultStat"
    // InternalReflexOld.g:2081:1: ruleDefaultStat returns [EObject current=null] : ( (otherlv_0= 'DEFAULT' | otherlv_1= '\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415' ) otherlv_2= ':' otherlv_3= '{' this_SwitchOptionStatSequence_4= ruleSwitchOptionStatSequence[$current] otherlv_5= '}' ) ;
    public final EObject ruleDefaultStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_SwitchOptionStatSequence_4 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:2087:2: ( ( (otherlv_0= 'DEFAULT' | otherlv_1= '\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415' ) otherlv_2= ':' otherlv_3= '{' this_SwitchOptionStatSequence_4= ruleSwitchOptionStatSequence[$current] otherlv_5= '}' ) )
            // InternalReflexOld.g:2088:2: ( (otherlv_0= 'DEFAULT' | otherlv_1= '\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415' ) otherlv_2= ':' otherlv_3= '{' this_SwitchOptionStatSequence_4= ruleSwitchOptionStatSequence[$current] otherlv_5= '}' )
            {
            // InternalReflexOld.g:2088:2: ( (otherlv_0= 'DEFAULT' | otherlv_1= '\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415' ) otherlv_2= ':' otherlv_3= '{' this_SwitchOptionStatSequence_4= ruleSwitchOptionStatSequence[$current] otherlv_5= '}' )
            // InternalReflexOld.g:2089:3: (otherlv_0= 'DEFAULT' | otherlv_1= '\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415' ) otherlv_2= ':' otherlv_3= '{' this_SwitchOptionStatSequence_4= ruleSwitchOptionStatSequence[$current] otherlv_5= '}'
            {
            // InternalReflexOld.g:2089:3: (otherlv_0= 'DEFAULT' | otherlv_1= '\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==75) ) {
                alt39=1;
            }
            else if ( (LA39_0==76) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalReflexOld.g:2090:4: otherlv_0= 'DEFAULT'
                    {
                    otherlv_0=(Token)match(input,75,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getDefaultStatAccess().getDEFAULTKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2095:4: otherlv_1= '\\u0423\\u041C\\u041E\\u041B\\u0427\\u0410\\u041D\\u0418\\u0415'
                    {
                    otherlv_1=(Token)match(input,76,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDefaultStatAccess().getCyrillicCapitalLetterUCyrillicCapitalLetterEmCyrillicCapitalLetterOCyrillicCapitalLetterElCyrillicCapitalLetterCheCyrillicCapitalLetterACyrillicCapitalLetterEnCyrillicCapitalLetterICyrillicCapitalLetterIeKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,74,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefaultStatAccess().getColonKeyword_1());
              		
            }
            otherlv_3=(Token)match(input,35,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefaultStatAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDefaultStatRule());
              			}
              			newCompositeNode(grammarAccess.getDefaultStatAccess().getSwitchOptionStatSequenceParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_13);
            this_SwitchOptionStatSequence_4=ruleSwitchOptionStatSequence(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SwitchOptionStatSequence_4;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefaultStatAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultStat"


    // $ANTLR start "ruleSwitchOptionStatSequence"
    // InternalReflexOld.g:2128:1: ruleSwitchOptionStatSequence[EObject in_current] returns [EObject current=in_current] : ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_hasBreak_1_0= ruleBreakStat ) )? ) ;
    public final EObject ruleSwitchOptionStatSequence(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_statements_0_0 = null;

        AntlrDatatypeRuleToken lv_hasBreak_1_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:2134:2: ( ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_hasBreak_1_0= ruleBreakStat ) )? ) )
            // InternalReflexOld.g:2135:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_hasBreak_1_0= ruleBreakStat ) )? )
            {
            // InternalReflexOld.g:2135:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_hasBreak_1_0= ruleBreakStat ) )? )
            // InternalReflexOld.g:2136:3: ( (lv_statements_0_0= ruleStatement ) )* ( (lv_hasBreak_1_0= ruleBreakStat ) )?
            {
            // InternalReflexOld.g:2136:3: ( (lv_statements_0_0= ruleStatement ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_BOOL_LITERAL)||LA40_0==35||(LA40_0>=39 && LA40_0<=41)||LA40_0==58||(LA40_0>=66 && LA40_0<=67)||(LA40_0>=70 && LA40_0<=71)||(LA40_0>=79 && LA40_0<=86)||(LA40_0>=89 && LA40_0<=92)||(LA40_0>=104 && LA40_0<=105)||(LA40_0>=115 && LA40_0<=118)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalReflexOld.g:2137:4: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalReflexOld.g:2137:4: (lv_statements_0_0= ruleStatement )
            	    // InternalReflexOld.g:2138:5: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchOptionStatSequenceAccess().getStatementsStatementParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchOptionStatSequenceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_0_0,
            	      						"ru.iaie.reflexold.ReflexOld.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalReflexOld.g:2155:3: ( (lv_hasBreak_1_0= ruleBreakStat ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=77 && LA41_0<=78)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalReflexOld.g:2156:4: (lv_hasBreak_1_0= ruleBreakStat )
                    {
                    // InternalReflexOld.g:2156:4: (lv_hasBreak_1_0= ruleBreakStat )
                    // InternalReflexOld.g:2157:5: lv_hasBreak_1_0= ruleBreakStat
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSwitchOptionStatSequenceAccess().getHasBreakBreakStatParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_hasBreak_1_0=ruleBreakStat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSwitchOptionStatSequenceRule());
                      					}
                      					set(
                      						current,
                      						"hasBreak",
                      						lv_hasBreak_1_0 != null,
                      						"ru.iaie.reflexold.ReflexOld.BreakStat");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchOptionStatSequence"


    // $ANTLR start "entryRuleBreakStat"
    // InternalReflexOld.g:2178:1: entryRuleBreakStat returns [String current=null] : iv_ruleBreakStat= ruleBreakStat EOF ;
    public final String entryRuleBreakStat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBreakStat = null;


        try {
            // InternalReflexOld.g:2178:49: (iv_ruleBreakStat= ruleBreakStat EOF )
            // InternalReflexOld.g:2179:2: iv_ruleBreakStat= ruleBreakStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakStat=ruleBreakStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStat"


    // $ANTLR start "ruleBreakStat"
    // InternalReflexOld.g:2185:1: ruleBreakStat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'BREAK' | kw= '\\u041A\\u041E\\u041D\\u0415\\u0426' ) kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleBreakStat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReflexOld.g:2191:2: ( ( (kw= 'BREAK' | kw= '\\u041A\\u041E\\u041D\\u0415\\u0426' ) kw= ';' ) )
            // InternalReflexOld.g:2192:2: ( (kw= 'BREAK' | kw= '\\u041A\\u041E\\u041D\\u0415\\u0426' ) kw= ';' )
            {
            // InternalReflexOld.g:2192:2: ( (kw= 'BREAK' | kw= '\\u041A\\u041E\\u041D\\u0415\\u0426' ) kw= ';' )
            // InternalReflexOld.g:2193:3: (kw= 'BREAK' | kw= '\\u041A\\u041E\\u041D\\u0415\\u0426' ) kw= ';'
            {
            // InternalReflexOld.g:2193:3: (kw= 'BREAK' | kw= '\\u041A\\u041E\\u041D\\u0415\\u0426' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==77) ) {
                alt42=1;
            }
            else if ( (LA42_0==78) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalReflexOld.g:2194:4: kw= 'BREAK'
                    {
                    kw=(Token)match(input,77,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getBreakStatAccess().getBREAKKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2200:4: kw= '\\u041A\\u041E\\u041D\\u0415\\u0426'
                    {
                    kw=(Token)match(input,78,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getBreakStatAccess().getCyrillicCapitalLetterKaCyrillicCapitalLetterOCyrillicCapitalLetterEnCyrillicCapitalLetterIeCyrillicCapitalLetterTseKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBreakStatAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakStat"


    // $ANTLR start "entryRuleStartProcStat"
    // InternalReflexOld.g:2215:1: entryRuleStartProcStat returns [EObject current=null] : iv_ruleStartProcStat= ruleStartProcStat EOF ;
    public final EObject entryRuleStartProcStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartProcStat = null;


        try {
            // InternalReflexOld.g:2215:54: (iv_ruleStartProcStat= ruleStartProcStat EOF )
            // InternalReflexOld.g:2216:2: iv_ruleStartProcStat= ruleStartProcStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStartProcStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStartProcStat=ruleStartProcStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStartProcStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartProcStat"


    // $ANTLR start "ruleStartProcStat"
    // InternalReflexOld.g:2222:1: ruleStartProcStat returns [EObject current=null] : ( (otherlv_0= 'START' | otherlv_1= '\\u0421\\u0422\\u0410\\u0420\\u0422' ) (otherlv_2= 'PROC' | otherlv_3= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleStartProcStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalReflexOld.g:2228:2: ( ( (otherlv_0= 'START' | otherlv_1= '\\u0421\\u0422\\u0410\\u0420\\u0422' ) (otherlv_2= 'PROC' | otherlv_3= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalReflexOld.g:2229:2: ( (otherlv_0= 'START' | otherlv_1= '\\u0421\\u0422\\u0410\\u0420\\u0422' ) (otherlv_2= 'PROC' | otherlv_3= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalReflexOld.g:2229:2: ( (otherlv_0= 'START' | otherlv_1= '\\u0421\\u0422\\u0410\\u0420\\u0422' ) (otherlv_2= 'PROC' | otherlv_3= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalReflexOld.g:2230:3: (otherlv_0= 'START' | otherlv_1= '\\u0421\\u0422\\u0410\\u0420\\u0422' ) (otherlv_2= 'PROC' | otherlv_3= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalReflexOld.g:2230:3: (otherlv_0= 'START' | otherlv_1= '\\u0421\\u0422\\u0410\\u0420\\u0422' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==79) ) {
                alt43=1;
            }
            else if ( (LA43_0==80) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalReflexOld.g:2231:4: otherlv_0= 'START'
                    {
                    otherlv_0=(Token)match(input,79,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getStartProcStatAccess().getSTARTKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2236:4: otherlv_1= '\\u0421\\u0422\\u0410\\u0420\\u0422'
                    {
                    otherlv_1=(Token)match(input,80,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStartProcStatAccess().getCyrillicCapitalLetterEsCyrillicCapitalLetterTeCyrillicCapitalLetterACyrillicCapitalLetterErCyrillicCapitalLetterTeKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:2241:3: (otherlv_2= 'PROC' | otherlv_3= '\\u041F\\u0420\\u041E\\u0426' )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            else if ( (LA44_0==41) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // InternalReflexOld.g:2242:4: otherlv_2= 'PROC'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStartProcStatAccess().getPROCKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2247:4: otherlv_3= '\\u041F\\u0420\\u041E\\u0426'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStartProcStatAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterErCyrillicCapitalLetterOCyrillicCapitalLetterTseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:2252:3: ( (otherlv_4= RULE_ID ) )
            // InternalReflexOld.g:2253:4: (otherlv_4= RULE_ID )
            {
            // InternalReflexOld.g:2253:4: (otherlv_4= RULE_ID )
            // InternalReflexOld.g:2254:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStartProcStatRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getStartProcStatAccess().getProcessProcessCrossReference_2_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getStartProcStatAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartProcStat"


    // $ANTLR start "entryRuleStopProcStat"
    // InternalReflexOld.g:2273:1: entryRuleStopProcStat returns [EObject current=null] : iv_ruleStopProcStat= ruleStopProcStat EOF ;
    public final EObject entryRuleStopProcStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopProcStat = null;


        try {
            // InternalReflexOld.g:2273:53: (iv_ruleStopProcStat= ruleStopProcStat EOF )
            // InternalReflexOld.g:2274:2: iv_ruleStopProcStat= ruleStopProcStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStopProcStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStopProcStat=ruleStopProcStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStopProcStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStopProcStat"


    // $ANTLR start "ruleStopProcStat"
    // InternalReflexOld.g:2280:1: ruleStopProcStat returns [EObject current=null] : ( () (otherlv_1= 'STOP' | otherlv_2= '\\u0421\\u0422\\u041E\\u041F' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleStopProcStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalReflexOld.g:2286:2: ( ( () (otherlv_1= 'STOP' | otherlv_2= '\\u0421\\u0422\\u041E\\u041F' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' ) )
            // InternalReflexOld.g:2287:2: ( () (otherlv_1= 'STOP' | otherlv_2= '\\u0421\\u0422\\u041E\\u041F' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' )
            {
            // InternalReflexOld.g:2287:2: ( () (otherlv_1= 'STOP' | otherlv_2= '\\u0421\\u0422\\u041E\\u041F' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' )
            // InternalReflexOld.g:2288:3: () (otherlv_1= 'STOP' | otherlv_2= '\\u0421\\u0422\\u041E\\u041F' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';'
            {
            // InternalReflexOld.g:2288:3: ()
            // InternalReflexOld.g:2289:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStopProcStatAccess().getStopProcStatAction_0(),
              					current);
              			
            }

            }

            // InternalReflexOld.g:2295:3: (otherlv_1= 'STOP' | otherlv_2= '\\u0421\\u0422\\u041E\\u041F' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==81) ) {
                alt45=1;
            }
            else if ( (LA45_0==82) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalReflexOld.g:2296:4: otherlv_1= 'STOP'
                    {
                    otherlv_1=(Token)match(input,81,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStopProcStatAccess().getSTOPKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2301:4: otherlv_2= '\\u0421\\u0422\\u041E\\u041F'
                    {
                    otherlv_2=(Token)match(input,82,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStopProcStatAccess().getCyrillicCapitalLetterEsCyrillicCapitalLetterTeCyrillicCapitalLetterOCyrillicCapitalLetterPeKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:2306:3: ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||(LA47_0>=40 && LA47_0<=41)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalReflexOld.g:2307:4: (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalReflexOld.g:2307:4: (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )?
                    int alt46=3;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==40) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==41) ) {
                        alt46=2;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalReflexOld.g:2308:5: otherlv_3= 'PROC'
                            {
                            otherlv_3=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getStopProcStatAccess().getPROCKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalReflexOld.g:2313:5: otherlv_4= '\\u041F\\u0420\\u041E\\u0426'
                            {
                            otherlv_4=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getStopProcStatAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterErCyrillicCapitalLetterOCyrillicCapitalLetterTseKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalReflexOld.g:2318:4: ( (otherlv_5= RULE_ID ) )
                    // InternalReflexOld.g:2319:5: (otherlv_5= RULE_ID )
                    {
                    // InternalReflexOld.g:2319:5: (otherlv_5= RULE_ID )
                    // InternalReflexOld.g:2320:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStopProcStatRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getStopProcStatAccess().getProcessProcessCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getStopProcStatAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStopProcStat"


    // $ANTLR start "entryRuleErrorStat"
    // InternalReflexOld.g:2340:1: entryRuleErrorStat returns [EObject current=null] : iv_ruleErrorStat= ruleErrorStat EOF ;
    public final EObject entryRuleErrorStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorStat = null;


        try {
            // InternalReflexOld.g:2340:50: (iv_ruleErrorStat= ruleErrorStat EOF )
            // InternalReflexOld.g:2341:2: iv_ruleErrorStat= ruleErrorStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getErrorStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleErrorStat=ruleErrorStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleErrorStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorStat"


    // $ANTLR start "ruleErrorStat"
    // InternalReflexOld.g:2347:1: ruleErrorStat returns [EObject current=null] : ( () (otherlv_1= 'ERROR' | otherlv_2= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleErrorStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalReflexOld.g:2353:2: ( ( () (otherlv_1= 'ERROR' | otherlv_2= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' ) )
            // InternalReflexOld.g:2354:2: ( () (otherlv_1= 'ERROR' | otherlv_2= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' )
            {
            // InternalReflexOld.g:2354:2: ( () (otherlv_1= 'ERROR' | otherlv_2= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';' )
            // InternalReflexOld.g:2355:3: () (otherlv_1= 'ERROR' | otherlv_2= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' ) ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )? otherlv_6= ';'
            {
            // InternalReflexOld.g:2355:3: ()
            // InternalReflexOld.g:2356:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getErrorStatAccess().getErrorStatAction_0(),
              					current);
              			
            }

            }

            // InternalReflexOld.g:2362:3: (otherlv_1= 'ERROR' | otherlv_2= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==83) ) {
                alt48=1;
            }
            else if ( (LA48_0==84) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalReflexOld.g:2363:4: otherlv_1= 'ERROR'
                    {
                    otherlv_1=(Token)match(input,83,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getErrorStatAccess().getERRORKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2368:4: otherlv_2= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410'
                    {
                    otherlv_2=(Token)match(input,84,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getErrorStatAccess().getCyrillicCapitalLetterOCyrillicCapitalLetterShaCyrillicCapitalLetterICyrillicCapitalLetterBeCyrillicCapitalLetterKaCyrillicCapitalLetterAKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:2373:3: ( (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||(LA50_0>=40 && LA50_0<=41)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalReflexOld.g:2374:4: (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )? ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalReflexOld.g:2374:4: (otherlv_3= 'PROC' | otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )?
                    int alt49=3;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==40) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==41) ) {
                        alt49=2;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalReflexOld.g:2375:5: otherlv_3= 'PROC'
                            {
                            otherlv_3=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getErrorStatAccess().getPROCKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalReflexOld.g:2380:5: otherlv_4= '\\u041F\\u0420\\u041E\\u0426'
                            {
                            otherlv_4=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getErrorStatAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterErCyrillicCapitalLetterOCyrillicCapitalLetterTseKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalReflexOld.g:2385:4: ( (otherlv_5= RULE_ID ) )
                    // InternalReflexOld.g:2386:5: (otherlv_5= RULE_ID )
                    {
                    // InternalReflexOld.g:2386:5: (otherlv_5= RULE_ID )
                    // InternalReflexOld.g:2387:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getErrorStatRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getErrorStatAccess().getProcessProcessCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getErrorStatAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorStat"


    // $ANTLR start "entryRuleRestartStat"
    // InternalReflexOld.g:2407:1: entryRuleRestartStat returns [EObject current=null] : iv_ruleRestartStat= ruleRestartStat EOF ;
    public final EObject entryRuleRestartStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartStat = null;


        try {
            // InternalReflexOld.g:2407:52: (iv_ruleRestartStat= ruleRestartStat EOF )
            // InternalReflexOld.g:2408:2: iv_ruleRestartStat= ruleRestartStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestartStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRestartStat=ruleRestartStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestartStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestartStat"


    // $ANTLR start "ruleRestartStat"
    // InternalReflexOld.g:2414:1: ruleRestartStat returns [EObject current=null] : ( () ( (otherlv_1= 'RESTART' otherlv_2= 'PROC' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u041F\\u0420\\u041E\\u0426' ) ) otherlv_5= ';' ) ;
    public final EObject ruleRestartStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalReflexOld.g:2420:2: ( ( () ( (otherlv_1= 'RESTART' otherlv_2= 'PROC' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u041F\\u0420\\u041E\\u0426' ) ) otherlv_5= ';' ) )
            // InternalReflexOld.g:2421:2: ( () ( (otherlv_1= 'RESTART' otherlv_2= 'PROC' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u041F\\u0420\\u041E\\u0426' ) ) otherlv_5= ';' )
            {
            // InternalReflexOld.g:2421:2: ( () ( (otherlv_1= 'RESTART' otherlv_2= 'PROC' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u041F\\u0420\\u041E\\u0426' ) ) otherlv_5= ';' )
            // InternalReflexOld.g:2422:3: () ( (otherlv_1= 'RESTART' otherlv_2= 'PROC' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u041F\\u0420\\u041E\\u0426' ) ) otherlv_5= ';'
            {
            // InternalReflexOld.g:2422:3: ()
            // InternalReflexOld.g:2423:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRestartStatAccess().getRestartStatAction_0(),
              					current);
              			
            }

            }

            // InternalReflexOld.g:2429:3: ( (otherlv_1= 'RESTART' otherlv_2= 'PROC' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u041F\\u0420\\u041E\\u0426' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==85) ) {
                alt51=1;
            }
            else if ( (LA51_0==86) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalReflexOld.g:2430:4: (otherlv_1= 'RESTART' otherlv_2= 'PROC' )
                    {
                    // InternalReflexOld.g:2430:4: (otherlv_1= 'RESTART' otherlv_2= 'PROC' )
                    // InternalReflexOld.g:2431:5: otherlv_1= 'RESTART' otherlv_2= 'PROC'
                    {
                    otherlv_1=(Token)match(input,85,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getRestartStatAccess().getRESTARTKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,40,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getRestartStatAccess().getPROCKeyword_1_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2441:4: (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )
                    {
                    // InternalReflexOld.g:2441:4: (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u041F\\u0420\\u041E\\u0426' )
                    // InternalReflexOld.g:2442:5: otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u041F\\u0420\\u041E\\u0426'
                    {
                    otherlv_3=(Token)match(input,86,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getRestartStatAccess().getCyrillicCapitalLetterErCyrillicCapitalLetterIeCyrillicCapitalLetterEsCyrillicCapitalLetterTeCyrillicCapitalLetterACyrillicCapitalLetterErCyrillicCapitalLetterTeKeyword_1_1_0());
                      				
                    }
                    otherlv_4=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getRestartStatAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterErCyrillicCapitalLetterOCyrillicCapitalLetterTseKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRestartStatAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestartStat"


    // $ANTLR start "entryRuleResetStat"
    // InternalReflexOld.g:2460:1: entryRuleResetStat returns [EObject current=null] : iv_ruleResetStat= ruleResetStat EOF ;
    public final EObject entryRuleResetStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResetStat = null;


        try {
            // InternalReflexOld.g:2460:50: (iv_ruleResetStat= ruleResetStat EOF )
            // InternalReflexOld.g:2461:2: iv_ruleResetStat= ruleResetStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResetStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResetStat=ruleResetStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResetStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResetStat"


    // $ANTLR start "ruleResetStat"
    // InternalReflexOld.g:2467:1: ruleResetStat returns [EObject current=null] : ( () ( (otherlv_1= 'RESTART' otherlv_2= 'TIMER' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420' ) ) otherlv_5= ';' ) ;
    public final EObject ruleResetStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalReflexOld.g:2473:2: ( ( () ( (otherlv_1= 'RESTART' otherlv_2= 'TIMER' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420' ) ) otherlv_5= ';' ) )
            // InternalReflexOld.g:2474:2: ( () ( (otherlv_1= 'RESTART' otherlv_2= 'TIMER' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420' ) ) otherlv_5= ';' )
            {
            // InternalReflexOld.g:2474:2: ( () ( (otherlv_1= 'RESTART' otherlv_2= 'TIMER' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420' ) ) otherlv_5= ';' )
            // InternalReflexOld.g:2475:3: () ( (otherlv_1= 'RESTART' otherlv_2= 'TIMER' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420' ) ) otherlv_5= ';'
            {
            // InternalReflexOld.g:2475:3: ()
            // InternalReflexOld.g:2476:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getResetStatAccess().getResetStatAction_0(),
              					current);
              			
            }

            }

            // InternalReflexOld.g:2482:3: ( (otherlv_1= 'RESTART' otherlv_2= 'TIMER' ) | (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==85) ) {
                alt52=1;
            }
            else if ( (LA52_0==86) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalReflexOld.g:2483:4: (otherlv_1= 'RESTART' otherlv_2= 'TIMER' )
                    {
                    // InternalReflexOld.g:2483:4: (otherlv_1= 'RESTART' otherlv_2= 'TIMER' )
                    // InternalReflexOld.g:2484:5: otherlv_1= 'RESTART' otherlv_2= 'TIMER'
                    {
                    otherlv_1=(Token)match(input,85,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getResetStatAccess().getRESTARTKeyword_1_0_0());
                      				
                    }
                    otherlv_2=(Token)match(input,87,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getResetStatAccess().getTIMERKeyword_1_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2494:4: (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420' )
                    {
                    // InternalReflexOld.g:2494:4: (otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420' )
                    // InternalReflexOld.g:2495:5: otherlv_3= '\\u0420\\u0415\\u0421\\u0422\\u0410\\u0420\\u0422' otherlv_4= '\\u0422\\u0410\\u0419\\u041C\\u0415\\u0420'
                    {
                    otherlv_3=(Token)match(input,86,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getResetStatAccess().getCyrillicCapitalLetterErCyrillicCapitalLetterIeCyrillicCapitalLetterEsCyrillicCapitalLetterTeCyrillicCapitalLetterACyrillicCapitalLetterErCyrillicCapitalLetterTeKeyword_1_1_0());
                      				
                    }
                    otherlv_4=(Token)match(input,88,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getResetStatAccess().getCyrillicCapitalLetterTeCyrillicCapitalLetterACyrillicCapitalLetterShortICyrillicCapitalLetterEmCyrillicCapitalLetterIeCyrillicCapitalLetterErKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getResetStatAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResetStat"


    // $ANTLR start "entryRuleLoopStat"
    // InternalReflexOld.g:2513:1: entryRuleLoopStat returns [EObject current=null] : iv_ruleLoopStat= ruleLoopStat EOF ;
    public final EObject entryRuleLoopStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStat = null;


        try {
            // InternalReflexOld.g:2513:49: (iv_ruleLoopStat= ruleLoopStat EOF )
            // InternalReflexOld.g:2514:2: iv_ruleLoopStat= ruleLoopStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoopStat=ruleLoopStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopStat"


    // $ANTLR start "ruleLoopStat"
    // InternalReflexOld.g:2520:1: ruleLoopStat returns [EObject current=null] : ( () (otherlv_1= 'LOOP' | otherlv_2= '\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C' ) otherlv_3= ';' ) ;
    public final EObject ruleLoopStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalReflexOld.g:2526:2: ( ( () (otherlv_1= 'LOOP' | otherlv_2= '\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C' ) otherlv_3= ';' ) )
            // InternalReflexOld.g:2527:2: ( () (otherlv_1= 'LOOP' | otherlv_2= '\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C' ) otherlv_3= ';' )
            {
            // InternalReflexOld.g:2527:2: ( () (otherlv_1= 'LOOP' | otherlv_2= '\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C' ) otherlv_3= ';' )
            // InternalReflexOld.g:2528:3: () (otherlv_1= 'LOOP' | otherlv_2= '\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C' ) otherlv_3= ';'
            {
            // InternalReflexOld.g:2528:3: ()
            // InternalReflexOld.g:2529:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLoopStatAccess().getLoopStatAction_0(),
              					current);
              			
            }

            }

            // InternalReflexOld.g:2535:3: (otherlv_1= 'LOOP' | otherlv_2= '\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==89) ) {
                alt53=1;
            }
            else if ( (LA53_0==90) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalReflexOld.g:2536:4: otherlv_1= 'LOOP'
                    {
                    otherlv_1=(Token)match(input,89,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLoopStatAccess().getLOOPKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2541:4: otherlv_2= '\\u0417\\u0410\\u0426\\u0418\\u041A\\u041B\\u0418\\u0422\\u042C'
                    {
                    otherlv_2=(Token)match(input,90,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLoopStatAccess().getCyrillicCapitalLetterZeCyrillicCapitalLetterACyrillicCapitalLetterTseCyrillicCapitalLetterICyrillicCapitalLetterKaCyrillicCapitalLetterElCyrillicCapitalLetterICyrillicCapitalLetterTeCyrillicCapitalLetterSoftSignKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLoopStatAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopStat"


    // $ANTLR start "entryRuleSetStateStat"
    // InternalReflexOld.g:2554:1: entryRuleSetStateStat returns [EObject current=null] : iv_ruleSetStateStat= ruleSetStateStat EOF ;
    public final EObject entryRuleSetStateStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetStateStat = null;


        try {
            // InternalReflexOld.g:2554:53: (iv_ruleSetStateStat= ruleSetStateStat EOF )
            // InternalReflexOld.g:2555:2: iv_ruleSetStateStat= ruleSetStateStat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetStateStatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetStateStat=ruleSetStateStat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetStateStat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetStateStat"


    // $ANTLR start "ruleSetStateStat"
    // InternalReflexOld.g:2561:1: ruleSetStateStat returns [EObject current=null] : ( () (otherlv_1= 'SET' | otherlv_2= '\\u0412' ) ( ( ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) ) ) | ( (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' ) ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= ';' ) ;
    public final EObject ruleSetStateStat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_next_3_1=null;
        Token lv_next_3_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalReflexOld.g:2567:2: ( ( () (otherlv_1= 'SET' | otherlv_2= '\\u0412' ) ( ( ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) ) ) | ( (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' ) ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= ';' ) )
            // InternalReflexOld.g:2568:2: ( () (otherlv_1= 'SET' | otherlv_2= '\\u0412' ) ( ( ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) ) ) | ( (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' ) ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= ';' )
            {
            // InternalReflexOld.g:2568:2: ( () (otherlv_1= 'SET' | otherlv_2= '\\u0412' ) ( ( ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) ) ) | ( (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' ) ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= ';' )
            // InternalReflexOld.g:2569:3: () (otherlv_1= 'SET' | otherlv_2= '\\u0412' ) ( ( ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) ) ) | ( (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' ) ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= ';'
            {
            // InternalReflexOld.g:2569:3: ()
            // InternalReflexOld.g:2570:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSetStateStatAccess().getSetStateStatAction_0(),
              					current);
              			
            }

            }

            // InternalReflexOld.g:2576:3: (otherlv_1= 'SET' | otherlv_2= '\\u0412' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==91) ) {
                alt54=1;
            }
            else if ( (LA54_0==92) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalReflexOld.g:2577:4: otherlv_1= 'SET'
                    {
                    otherlv_1=(Token)match(input,91,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSetStateStatAccess().getSETKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2582:4: otherlv_2= '\\u0412'
                    {
                    otherlv_2=(Token)match(input,92,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSetStateStatAccess().getCyrillicCapitalLetterVeKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:2587:3: ( ( ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) ) ) | ( (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' ) ( (otherlv_6= RULE_ID ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=93 && LA57_0<=94)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=42 && LA57_0<=43)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalReflexOld.g:2588:4: ( ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) ) )
                    {
                    // InternalReflexOld.g:2588:4: ( ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) ) )
                    // InternalReflexOld.g:2589:5: ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) )
                    {
                    // InternalReflexOld.g:2589:5: ( (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' ) )
                    // InternalReflexOld.g:2590:6: (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' )
                    {
                    // InternalReflexOld.g:2590:6: (lv_next_3_1= 'NEXT' | lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==93) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==94) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalReflexOld.g:2591:7: lv_next_3_1= 'NEXT'
                            {
                            lv_next_3_1=(Token)match(input,93,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_next_3_1, grammarAccess.getSetStateStatAccess().getNextNEXTKeyword_2_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSetStateStatRule());
                              							}
                              							setWithLastConsumed(current, "next", lv_next_3_1 != null, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalReflexOld.g:2602:7: lv_next_3_2= '\\u0421\\u041B\\u0415\\u0414\\u0423\\u042E\\u0429\\u0415\\u0415'
                            {
                            lv_next_3_2=(Token)match(input,94,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_next_3_2, grammarAccess.getSetStateStatAccess().getNextCyrillicCapitalLetterEsCyrillicCapitalLetterElCyrillicCapitalLetterIeCyrillicCapitalLetterDeCyrillicCapitalLetterUCyrillicCapitalLetterYuCyrillicCapitalLetterShchaCyrillicCapitalLetterIeCyrillicCapitalLetterIeKeyword_2_0_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSetStateStatRule());
                              							}
                              							setWithLastConsumed(current, "next", lv_next_3_2 != null, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2616:4: ( (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' ) ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalReflexOld.g:2616:4: ( (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' ) ( (otherlv_6= RULE_ID ) ) )
                    // InternalReflexOld.g:2617:5: (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' ) ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalReflexOld.g:2617:5: (otherlv_4= 'STATE' | otherlv_5= '\\u0421\\u041E\\u0421\\u0422' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==42) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==43) ) {
                        alt56=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalReflexOld.g:2618:6: otherlv_4= 'STATE'
                            {
                            otherlv_4=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getSetStateStatAccess().getSTATEKeyword_2_1_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalReflexOld.g:2623:6: otherlv_5= '\\u0421\\u041E\\u0421\\u0422'
                            {
                            otherlv_5=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getSetStateStatAccess().getCyrillicCapitalLetterEsCyrillicCapitalLetterOCyrillicCapitalLetterEsCyrillicCapitalLetterTeKeyword_2_1_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalReflexOld.g:2628:5: ( (otherlv_6= RULE_ID ) )
                    // InternalReflexOld.g:2629:6: (otherlv_6= RULE_ID )
                    {
                    // InternalReflexOld.g:2629:6: (otherlv_6= RULE_ID )
                    // InternalReflexOld.g:2630:7: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getSetStateStatRule());
                      							}
                      						
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_6, grammarAccess.getSetStateStatAccess().getStateStateCrossReference_2_1_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSetStateStatAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetStateStat"


    // $ANTLR start "entryRuleInfixOp"
    // InternalReflexOld.g:2651:1: entryRuleInfixOp returns [EObject current=null] : iv_ruleInfixOp= ruleInfixOp EOF ;
    public final EObject entryRuleInfixOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfixOp = null;


        try {
            // InternalReflexOld.g:2651:48: (iv_ruleInfixOp= ruleInfixOp EOF )
            // InternalReflexOld.g:2652:2: iv_ruleInfixOp= ruleInfixOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInfixOp=ruleInfixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfixOp"


    // $ANTLR start "ruleInfixOp"
    // InternalReflexOld.g:2658:1: ruleInfixOp returns [EObject current=null] : ( ( (lv_op_0_0= ruleInfixPostfixOp ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleInfixOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:2664:2: ( ( ( (lv_op_0_0= ruleInfixPostfixOp ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReflexOld.g:2665:2: ( ( (lv_op_0_0= ruleInfixPostfixOp ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReflexOld.g:2665:2: ( ( (lv_op_0_0= ruleInfixPostfixOp ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalReflexOld.g:2666:3: ( (lv_op_0_0= ruleInfixPostfixOp ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalReflexOld.g:2666:3: ( (lv_op_0_0= ruleInfixPostfixOp ) )
            // InternalReflexOld.g:2667:4: (lv_op_0_0= ruleInfixPostfixOp )
            {
            // InternalReflexOld.g:2667:4: (lv_op_0_0= ruleInfixPostfixOp )
            // InternalReflexOld.g:2668:5: lv_op_0_0= ruleInfixPostfixOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInfixOpAccess().getOpInfixPostfixOpEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_op_0_0=ruleInfixPostfixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInfixOpRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"ru.iaie.reflexold.ReflexOld.InfixPostfixOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReflexOld.g:2685:3: ( (otherlv_1= RULE_ID ) )
            // InternalReflexOld.g:2686:4: (otherlv_1= RULE_ID )
            {
            // InternalReflexOld.g:2686:4: (otherlv_1= RULE_ID )
            // InternalReflexOld.g:2687:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInfixOpRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getInfixOpAccess().getRefIdReferenceCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfixOp"


    // $ANTLR start "entryRulePostfixOp"
    // InternalReflexOld.g:2702:1: entryRulePostfixOp returns [EObject current=null] : iv_rulePostfixOp= rulePostfixOp EOF ;
    public final EObject entryRulePostfixOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOp = null;


        try {
            // InternalReflexOld.g:2702:50: (iv_rulePostfixOp= rulePostfixOp EOF )
            // InternalReflexOld.g:2703:2: iv_rulePostfixOp= rulePostfixOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostfixOp=rulePostfixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixOp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixOp"


    // $ANTLR start "rulePostfixOp"
    // InternalReflexOld.g:2709:1: rulePostfixOp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleInfixPostfixOp ) ) ) ;
    public final EObject rulePostfixOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:2715:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleInfixPostfixOp ) ) ) )
            // InternalReflexOld.g:2716:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleInfixPostfixOp ) ) )
            {
            // InternalReflexOld.g:2716:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleInfixPostfixOp ) ) )
            // InternalReflexOld.g:2717:3: ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= ruleInfixPostfixOp ) )
            {
            // InternalReflexOld.g:2717:3: ( (otherlv_0= RULE_ID ) )
            // InternalReflexOld.g:2718:4: (otherlv_0= RULE_ID )
            {
            // InternalReflexOld.g:2718:4: (otherlv_0= RULE_ID )
            // InternalReflexOld.g:2719:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPostfixOpRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getPostfixOpAccess().getRefIdReferenceCrossReference_0_0());
              				
            }

            }


            }

            // InternalReflexOld.g:2730:3: ( (lv_op_1_0= ruleInfixPostfixOp ) )
            // InternalReflexOld.g:2731:4: (lv_op_1_0= ruleInfixPostfixOp )
            {
            // InternalReflexOld.g:2731:4: (lv_op_1_0= ruleInfixPostfixOp )
            // InternalReflexOld.g:2732:5: lv_op_1_0= ruleInfixPostfixOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPostfixOpAccess().getOpInfixPostfixOpEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_op_1_0=ruleInfixPostfixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPostfixOpRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"ru.iaie.reflexold.ReflexOld.InfixPostfixOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostfixOp"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalReflexOld.g:2753:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalReflexOld.g:2753:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalReflexOld.g:2754:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalReflexOld.g:2760:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:2766:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalReflexOld.g:2767:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalReflexOld.g:2767:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalReflexOld.g:2768:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalReflexOld.g:2768:3: ( (otherlv_0= RULE_ID ) )
            // InternalReflexOld.g:2769:4: (otherlv_0= RULE_ID )
            {
            // InternalReflexOld.g:2769:4: (otherlv_0= RULE_ID )
            // InternalReflexOld.g:2770:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getFunctionFunctionCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,58,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalReflexOld.g:2785:3: ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_BOOL_LITERAL)||(LA59_0>=40 && LA59_0<=41)||LA59_0==58||(LA59_0>=104 && LA59_0<=105)||(LA59_0>=115 && LA59_0<=118)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalReflexOld.g:2786:4: ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )*
                    {
                    // InternalReflexOld.g:2786:4: ( (lv_args_2_0= ruleExpression ) )
                    // InternalReflexOld.g:2787:5: (lv_args_2_0= ruleExpression )
                    {
                    // InternalReflexOld.g:2787:5: (lv_args_2_0= ruleExpression )
                    // InternalReflexOld.g:2788:6: lv_args_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_args_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_2_0,
                      							"ru.iaie.reflexold.ReflexOld.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReflexOld.g:2805:4: (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==46) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalReflexOld.g:2806:5: otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,46,FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReflexOld.g:2810:5: ( (lv_args_4_0= ruleExpression ) )
                    	    // InternalReflexOld.g:2811:6: (lv_args_4_0= ruleExpression )
                    	    {
                    	    // InternalReflexOld.g:2811:6: (lv_args_4_0= ruleExpression )
                    	    // InternalReflexOld.g:2812:7: lv_args_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_args_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_4_0,
                    	      								"ru.iaie.reflexold.ReflexOld.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleCheckStateExpression"
    // InternalReflexOld.g:2839:1: entryRuleCheckStateExpression returns [EObject current=null] : iv_ruleCheckStateExpression= ruleCheckStateExpression EOF ;
    public final EObject entryRuleCheckStateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckStateExpression = null;


        try {
            // InternalReflexOld.g:2839:61: (iv_ruleCheckStateExpression= ruleCheckStateExpression EOF )
            // InternalReflexOld.g:2840:2: iv_ruleCheckStateExpression= ruleCheckStateExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckStateExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCheckStateExpression=ruleCheckStateExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckStateExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckStateExpression"


    // $ANTLR start "ruleCheckStateExpression"
    // InternalReflexOld.g:2846:1: ruleCheckStateExpression returns [EObject current=null] : ( (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= 'IN' otherlv_4= 'STATE' ) | (otherlv_5= '\\u0412' otherlv_6= '\\u0421\\u041E\\u0421\\u0422' ) ) ( (lv_qualfier_7_0= ruleStateQualifier ) ) ) ;
    public final EObject ruleCheckStateExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_qualfier_7_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:2852:2: ( ( (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= 'IN' otherlv_4= 'STATE' ) | (otherlv_5= '\\u0412' otherlv_6= '\\u0421\\u041E\\u0421\\u0422' ) ) ( (lv_qualfier_7_0= ruleStateQualifier ) ) ) )
            // InternalReflexOld.g:2853:2: ( (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= 'IN' otherlv_4= 'STATE' ) | (otherlv_5= '\\u0412' otherlv_6= '\\u0421\\u041E\\u0421\\u0422' ) ) ( (lv_qualfier_7_0= ruleStateQualifier ) ) )
            {
            // InternalReflexOld.g:2853:2: ( (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= 'IN' otherlv_4= 'STATE' ) | (otherlv_5= '\\u0412' otherlv_6= '\\u0421\\u041E\\u0421\\u0422' ) ) ( (lv_qualfier_7_0= ruleStateQualifier ) ) )
            // InternalReflexOld.g:2854:3: (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= 'IN' otherlv_4= 'STATE' ) | (otherlv_5= '\\u0412' otherlv_6= '\\u0421\\u041E\\u0421\\u0422' ) ) ( (lv_qualfier_7_0= ruleStateQualifier ) )
            {
            // InternalReflexOld.g:2854:3: (otherlv_0= 'PROC' | otherlv_1= '\\u041F\\u0420\\u041E\\u0426' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==40) ) {
                alt60=1;
            }
            else if ( (LA60_0==41) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalReflexOld.g:2855:4: otherlv_0= 'PROC'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCheckStateExpressionAccess().getPROCKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2860:4: otherlv_1= '\\u041F\\u0420\\u041E\\u0426'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCheckStateExpressionAccess().getCyrillicCapitalLetterPeCyrillicCapitalLetterErCyrillicCapitalLetterOCyrillicCapitalLetterTseKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalReflexOld.g:2865:3: ( (otherlv_2= RULE_ID ) )
            // InternalReflexOld.g:2866:4: (otherlv_2= RULE_ID )
            {
            // InternalReflexOld.g:2866:4: (otherlv_2= RULE_ID )
            // InternalReflexOld.g:2867:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCheckStateExpressionRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getCheckStateExpressionAccess().getProcessProcessCrossReference_1_0());
              				
            }

            }


            }

            // InternalReflexOld.g:2878:3: ( (otherlv_3= 'IN' otherlv_4= 'STATE' ) | (otherlv_5= '\\u0412' otherlv_6= '\\u0421\\u041E\\u0421\\u0422' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==95) ) {
                alt61=1;
            }
            else if ( (LA61_0==92) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalReflexOld.g:2879:4: (otherlv_3= 'IN' otherlv_4= 'STATE' )
                    {
                    // InternalReflexOld.g:2879:4: (otherlv_3= 'IN' otherlv_4= 'STATE' )
                    // InternalReflexOld.g:2880:5: otherlv_3= 'IN' otherlv_4= 'STATE'
                    {
                    otherlv_3=(Token)match(input,95,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getCheckStateExpressionAccess().getINKeyword_2_0_0());
                      				
                    }
                    otherlv_4=(Token)match(input,42,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getCheckStateExpressionAccess().getSTATEKeyword_2_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2890:4: (otherlv_5= '\\u0412' otherlv_6= '\\u0421\\u041E\\u0421\\u0422' )
                    {
                    // InternalReflexOld.g:2890:4: (otherlv_5= '\\u0412' otherlv_6= '\\u0421\\u041E\\u0421\\u0422' )
                    // InternalReflexOld.g:2891:5: otherlv_5= '\\u0412' otherlv_6= '\\u0421\\u041E\\u0421\\u0422'
                    {
                    otherlv_5=(Token)match(input,92,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCheckStateExpressionAccess().getCyrillicCapitalLetterVeKeyword_2_1_0());
                      				
                    }
                    otherlv_6=(Token)match(input,43,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getCheckStateExpressionAccess().getCyrillicCapitalLetterEsCyrillicCapitalLetterOCyrillicCapitalLetterEsCyrillicCapitalLetterTeKeyword_2_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalReflexOld.g:2901:3: ( (lv_qualfier_7_0= ruleStateQualifier ) )
            // InternalReflexOld.g:2902:4: (lv_qualfier_7_0= ruleStateQualifier )
            {
            // InternalReflexOld.g:2902:4: (lv_qualfier_7_0= ruleStateQualifier )
            // InternalReflexOld.g:2903:5: lv_qualfier_7_0= ruleStateQualifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCheckStateExpressionAccess().getQualfierStateQualifierEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_qualfier_7_0=ruleStateQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCheckStateExpressionRule());
              					}
              					set(
              						current,
              						"qualfier",
              						lv_qualfier_7_0,
              						"ru.iaie.reflexold.ReflexOld.StateQualifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckStateExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalReflexOld.g:2924:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalReflexOld.g:2924:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalReflexOld.g:2925:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalReflexOld.g:2931:1: rulePrimaryExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( () ( (lv_integer_2_0= RULE_INTEGER ) ) ) | ( () ( (lv_floating_4_0= RULE_FLOAT ) ) ) | ( () ( (lv_bool_6_0= RULE_BOOL_LITERAL ) ) ) | (otherlv_7= '(' ( (lv_nestedExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_integer_2_0=null;
        Token lv_floating_4_0=null;
        Token lv_bool_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_nestedExpr_8_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:2937:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( () ( (lv_integer_2_0= RULE_INTEGER ) ) ) | ( () ( (lv_floating_4_0= RULE_FLOAT ) ) ) | ( () ( (lv_bool_6_0= RULE_BOOL_LITERAL ) ) ) | (otherlv_7= '(' ( (lv_nestedExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) )
            // InternalReflexOld.g:2938:2: ( ( (otherlv_0= RULE_ID ) ) | ( () ( (lv_integer_2_0= RULE_INTEGER ) ) ) | ( () ( (lv_floating_4_0= RULE_FLOAT ) ) ) | ( () ( (lv_bool_6_0= RULE_BOOL_LITERAL ) ) ) | (otherlv_7= '(' ( (lv_nestedExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            {
            // InternalReflexOld.g:2938:2: ( ( (otherlv_0= RULE_ID ) ) | ( () ( (lv_integer_2_0= RULE_INTEGER ) ) ) | ( () ( (lv_floating_4_0= RULE_FLOAT ) ) ) | ( () ( (lv_bool_6_0= RULE_BOOL_LITERAL ) ) ) | (otherlv_7= '(' ( (lv_nestedExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            int alt62=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt62=1;
                }
                break;
            case RULE_INTEGER:
                {
                alt62=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt62=3;
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt62=4;
                }
                break;
            case 58:
                {
                alt62=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalReflexOld.g:2939:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalReflexOld.g:2939:3: ( (otherlv_0= RULE_ID ) )
                    // InternalReflexOld.g:2940:4: (otherlv_0= RULE_ID )
                    {
                    // InternalReflexOld.g:2940:4: (otherlv_0= RULE_ID )
                    // InternalReflexOld.g:2941:5: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      					}
                      				
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getReferenceIdReferenceCrossReference_0_0());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:2953:3: ( () ( (lv_integer_2_0= RULE_INTEGER ) ) )
                    {
                    // InternalReflexOld.g:2953:3: ( () ( (lv_integer_2_0= RULE_INTEGER ) ) )
                    // InternalReflexOld.g:2954:4: () ( (lv_integer_2_0= RULE_INTEGER ) )
                    {
                    // InternalReflexOld.g:2954:4: ()
                    // InternalReflexOld.g:2955:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getPrimaryExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalReflexOld.g:2961:4: ( (lv_integer_2_0= RULE_INTEGER ) )
                    // InternalReflexOld.g:2962:5: (lv_integer_2_0= RULE_INTEGER )
                    {
                    // InternalReflexOld.g:2962:5: (lv_integer_2_0= RULE_INTEGER )
                    // InternalReflexOld.g:2963:6: lv_integer_2_0= RULE_INTEGER
                    {
                    lv_integer_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_integer_2_0, grammarAccess.getPrimaryExpressionAccess().getIntegerINTEGERTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"integer",
                      							lv_integer_2_0,
                      							"ru.iaie.reflexold.ReflexOld.INTEGER");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:2981:3: ( () ( (lv_floating_4_0= RULE_FLOAT ) ) )
                    {
                    // InternalReflexOld.g:2981:3: ( () ( (lv_floating_4_0= RULE_FLOAT ) ) )
                    // InternalReflexOld.g:2982:4: () ( (lv_floating_4_0= RULE_FLOAT ) )
                    {
                    // InternalReflexOld.g:2982:4: ()
                    // InternalReflexOld.g:2983:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getPrimaryExpressionAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalReflexOld.g:2989:4: ( (lv_floating_4_0= RULE_FLOAT ) )
                    // InternalReflexOld.g:2990:5: (lv_floating_4_0= RULE_FLOAT )
                    {
                    // InternalReflexOld.g:2990:5: (lv_floating_4_0= RULE_FLOAT )
                    // InternalReflexOld.g:2991:6: lv_floating_4_0= RULE_FLOAT
                    {
                    lv_floating_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_floating_4_0, grammarAccess.getPrimaryExpressionAccess().getFloatingFLOATTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"floating",
                      							lv_floating_4_0,
                      							"ru.iaie.reflexold.ReflexOld.FLOAT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalReflexOld.g:3009:3: ( () ( (lv_bool_6_0= RULE_BOOL_LITERAL ) ) )
                    {
                    // InternalReflexOld.g:3009:3: ( () ( (lv_bool_6_0= RULE_BOOL_LITERAL ) ) )
                    // InternalReflexOld.g:3010:4: () ( (lv_bool_6_0= RULE_BOOL_LITERAL ) )
                    {
                    // InternalReflexOld.g:3010:4: ()
                    // InternalReflexOld.g:3011:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getPrimaryExpressionAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalReflexOld.g:3017:4: ( (lv_bool_6_0= RULE_BOOL_LITERAL ) )
                    // InternalReflexOld.g:3018:5: (lv_bool_6_0= RULE_BOOL_LITERAL )
                    {
                    // InternalReflexOld.g:3018:5: (lv_bool_6_0= RULE_BOOL_LITERAL )
                    // InternalReflexOld.g:3019:6: lv_bool_6_0= RULE_BOOL_LITERAL
                    {
                    lv_bool_6_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_bool_6_0, grammarAccess.getPrimaryExpressionAccess().getBoolBOOL_LITERALTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"bool",
                      							lv_bool_6_0,
                      							"ru.iaie.reflexold.ReflexOld.BOOL_LITERAL");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalReflexOld.g:3037:3: (otherlv_7= '(' ( (lv_nestedExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    {
                    // InternalReflexOld.g:3037:3: (otherlv_7= '(' ( (lv_nestedExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    // InternalReflexOld.g:3038:4: otherlv_7= '(' ( (lv_nestedExpr_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalReflexOld.g:3042:4: ( (lv_nestedExpr_8_0= ruleExpression ) )
                    // InternalReflexOld.g:3043:5: (lv_nestedExpr_8_0= ruleExpression )
                    {
                    // InternalReflexOld.g:3043:5: (lv_nestedExpr_8_0= ruleExpression )
                    // InternalReflexOld.g:3044:6: lv_nestedExpr_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNestedExprExpressionParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_nestedExpr_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"nestedExpr",
                      							lv_nestedExpr_8_0,
                      							"ru.iaie.reflexold.ReflexOld.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalReflexOld.g:3070:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalReflexOld.g:3070:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalReflexOld.g:3071:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalReflexOld.g:3077:1: ruleUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | this_FunctionCall_1= ruleFunctionCall | this_PostfixOp_2= rulePostfixOp | this_InfixOp_3= ruleInfixOp | ( ( (lv_unaryOp_4_0= ruleUnaryOp ) ) ( (lv_right_5_0= ruleCastExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject this_FunctionCall_1 = null;

        EObject this_PostfixOp_2 = null;

        EObject this_InfixOp_3 = null;

        Enumerator lv_unaryOp_4_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3083:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | this_FunctionCall_1= ruleFunctionCall | this_PostfixOp_2= rulePostfixOp | this_InfixOp_3= ruleInfixOp | ( ( (lv_unaryOp_4_0= ruleUnaryOp ) ) ( (lv_right_5_0= ruleCastExpression ) ) ) ) )
            // InternalReflexOld.g:3084:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_FunctionCall_1= ruleFunctionCall | this_PostfixOp_2= rulePostfixOp | this_InfixOp_3= ruleInfixOp | ( ( (lv_unaryOp_4_0= ruleUnaryOp ) ) ( (lv_right_5_0= ruleCastExpression ) ) ) )
            {
            // InternalReflexOld.g:3084:2: (this_PrimaryExpression_0= rulePrimaryExpression | this_FunctionCall_1= ruleFunctionCall | this_PostfixOp_2= rulePostfixOp | this_InfixOp_3= ruleInfixOp | ( ( (lv_unaryOp_4_0= ruleUnaryOp ) ) ( (lv_right_5_0= ruleCastExpression ) ) ) )
            int alt63=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_BIT_AND:
                case RULE_BIT_XOR:
                case RULE_BIT_OR:
                case RULE_LOGICAL_AND:
                case RULE_LOGICAL_OR:
                case 36:
                case 39:
                case 46:
                case 59:
                case 74:
                case 115:
                case 116:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                    {
                    alt63=1;
                    }
                    break;
                case 104:
                case 105:
                    {
                    alt63=3;
                    }
                    break;
                case 58:
                    {
                    alt63=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INTEGER:
            case RULE_FLOAT:
            case RULE_BOOL_LITERAL:
            case 58:
                {
                alt63=1;
                }
                break;
            case 104:
            case 105:
                {
                alt63=4;
                }
                break;
            case 115:
            case 116:
            case 117:
            case 118:
                {
                alt63=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalReflexOld.g:3085:3: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:3094:3: this_FunctionCall_1= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getFunctionCallParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_1=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:3103:3: this_PostfixOp_2= rulePostfixOp
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPostfixOpParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PostfixOp_2=rulePostfixOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PostfixOp_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalReflexOld.g:3112:3: this_InfixOp_3= ruleInfixOp
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getInfixOpParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InfixOp_3=ruleInfixOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InfixOp_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalReflexOld.g:3121:3: ( ( (lv_unaryOp_4_0= ruleUnaryOp ) ) ( (lv_right_5_0= ruleCastExpression ) ) )
                    {
                    // InternalReflexOld.g:3121:3: ( ( (lv_unaryOp_4_0= ruleUnaryOp ) ) ( (lv_right_5_0= ruleCastExpression ) ) )
                    // InternalReflexOld.g:3122:4: ( (lv_unaryOp_4_0= ruleUnaryOp ) ) ( (lv_right_5_0= ruleCastExpression ) )
                    {
                    // InternalReflexOld.g:3122:4: ( (lv_unaryOp_4_0= ruleUnaryOp ) )
                    // InternalReflexOld.g:3123:5: (lv_unaryOp_4_0= ruleUnaryOp )
                    {
                    // InternalReflexOld.g:3123:5: (lv_unaryOp_4_0= ruleUnaryOp )
                    // InternalReflexOld.g:3124:6: lv_unaryOp_4_0= ruleUnaryOp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryOpUnaryOpEnumRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_unaryOp_4_0=ruleUnaryOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"unaryOp",
                      							lv_unaryOp_4_0,
                      							"ru.iaie.reflexold.ReflexOld.UnaryOp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReflexOld.g:3141:4: ( (lv_right_5_0= ruleCastExpression ) )
                    // InternalReflexOld.g:3142:5: (lv_right_5_0= ruleCastExpression )
                    {
                    // InternalReflexOld.g:3142:5: (lv_right_5_0= ruleCastExpression )
                    // InternalReflexOld.g:3143:6: lv_right_5_0= ruleCastExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightCastExpressionParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_5_0=ruleCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_5_0,
                      							"ru.iaie.reflexold.ReflexOld.CastExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleCastExpression"
    // InternalReflexOld.g:3165:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // InternalReflexOld.g:3165:55: (iv_ruleCastExpression= ruleCastExpression EOF )
            // InternalReflexOld.g:3166:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCastExpression=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCastExpression"


    // $ANTLR start "ruleCastExpression"
    // InternalReflexOld.g:3172:1: ruleCastExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ( (lv_right_4_0= ruleCastExpression ) ) ) ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_UnaryExpression_0 = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3178:2: ( (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ( (lv_right_4_0= ruleCastExpression ) ) ) ) )
            // InternalReflexOld.g:3179:2: (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ( (lv_right_4_0= ruleCastExpression ) ) ) )
            {
            // InternalReflexOld.g:3179:2: (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ( (lv_right_4_0= ruleCastExpression ) ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_BOOL_LITERAL)||(LA64_0>=104 && LA64_0<=105)||(LA64_0>=115 && LA64_0<=118)) ) {
                alt64=1;
            }
            else if ( (LA64_0==58) ) {
                int LA64_2 = input.LA(2);

                if ( ((LA64_2>=RULE_ID && LA64_2<=RULE_BOOL_LITERAL)||(LA64_2>=40 && LA64_2<=41)||LA64_2==58||(LA64_2>=104 && LA64_2<=105)||(LA64_2>=115 && LA64_2<=118)) ) {
                    alt64=1;
                }
                else if ( ((LA64_2>=130 && LA64_2<=149)) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalReflexOld.g:3180:3: this_UnaryExpression_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpression_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:3189:3: (otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ( (lv_right_4_0= ruleCastExpression ) ) )
                    {
                    // InternalReflexOld.g:3189:3: (otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ( (lv_right_4_0= ruleCastExpression ) ) )
                    // InternalReflexOld.g:3190:4: otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ( (lv_right_4_0= ruleCastExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCastExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalReflexOld.g:3194:4: ( (lv_type_2_0= ruleType ) )
                    // InternalReflexOld.g:3195:5: (lv_type_2_0= ruleType )
                    {
                    // InternalReflexOld.g:3195:5: (lv_type_2_0= ruleType )
                    // InternalReflexOld.g:3196:6: lv_type_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeTypeEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_type_2_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCastExpressionRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_0,
                      							"ru.iaie.reflexold.ReflexOld.Type");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,59,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCastExpressionAccess().getRightParenthesisKeyword_1_2());
                      			
                    }
                    // InternalReflexOld.g:3217:4: ( (lv_right_4_0= ruleCastExpression ) )
                    // InternalReflexOld.g:3218:5: (lv_right_4_0= ruleCastExpression )
                    {
                    // InternalReflexOld.g:3218:5: (lv_right_4_0= ruleCastExpression )
                    // InternalReflexOld.g:3219:6: lv_right_4_0= ruleCastExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCastExpressionAccess().getRightCastExpressionParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_4_0=ruleCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCastExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_4_0,
                      							"ru.iaie.reflexold.ReflexOld.CastExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCastExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalReflexOld.g:3241:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalReflexOld.g:3241:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalReflexOld.g:3242:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalReflexOld.g:3248:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_CastExpression_0= ruleCastExpression ( () ( (lv_mulOp_2_0= ruleMultiplicativeOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CastExpression_0 = null;

        Enumerator lv_mulOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3254:2: ( (this_CastExpression_0= ruleCastExpression ( () ( (lv_mulOp_2_0= ruleMultiplicativeOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )* ) )
            // InternalReflexOld.g:3255:2: (this_CastExpression_0= ruleCastExpression ( () ( (lv_mulOp_2_0= ruleMultiplicativeOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )* )
            {
            // InternalReflexOld.g:3255:2: (this_CastExpression_0= ruleCastExpression ( () ( (lv_mulOp_2_0= ruleMultiplicativeOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )* )
            // InternalReflexOld.g:3256:3: this_CastExpression_0= ruleCastExpression ( () ( (lv_mulOp_2_0= ruleMultiplicativeOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getCastExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_CastExpression_0=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CastExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalReflexOld.g:3264:3: ( () ( (lv_mulOp_2_0= ruleMultiplicativeOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=127 && LA65_0<=129)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalReflexOld.g:3265:4: () ( (lv_mulOp_2_0= ruleMultiplicativeOp ) ) ( (lv_right_3_0= ruleCastExpression ) )
            	    {
            	    // InternalReflexOld.g:3265:4: ()
            	    // InternalReflexOld.g:3266:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalReflexOld.g:3272:4: ( (lv_mulOp_2_0= ruleMultiplicativeOp ) )
            	    // InternalReflexOld.g:3273:5: (lv_mulOp_2_0= ruleMultiplicativeOp )
            	    {
            	    // InternalReflexOld.g:3273:5: (lv_mulOp_2_0= ruleMultiplicativeOp )
            	    // InternalReflexOld.g:3274:6: lv_mulOp_2_0= ruleMultiplicativeOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMulOpMultiplicativeOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_mulOp_2_0=ruleMultiplicativeOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"mulOp",
            	      							lv_mulOp_2_0,
            	      							"ru.iaie.reflexold.ReflexOld.MultiplicativeOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalReflexOld.g:3291:4: ( (lv_right_3_0= ruleCastExpression ) )
            	    // InternalReflexOld.g:3292:5: (lv_right_3_0= ruleCastExpression )
            	    {
            	    // InternalReflexOld.g:3292:5: (lv_right_3_0= ruleCastExpression )
            	    // InternalReflexOld.g:3293:6: lv_right_3_0= ruleCastExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightCastExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_right_3_0=ruleCastExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"ru.iaie.reflexold.ReflexOld.CastExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalReflexOld.g:3315:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalReflexOld.g:3315:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalReflexOld.g:3316:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalReflexOld.g:3322:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_addOp_2_0= ruleAdditiveOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_addOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3328:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_addOp_2_0= ruleAdditiveOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalReflexOld.g:3329:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_addOp_2_0= ruleAdditiveOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalReflexOld.g:3329:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_addOp_2_0= ruleAdditiveOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalReflexOld.g:3330:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_addOp_2_0= ruleAdditiveOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalReflexOld.g:3338:3: ( () ( (lv_addOp_2_0= ruleAdditiveOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==115) ) {
                    alt66=1;
                }
                else if ( (LA66_0==116) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalReflexOld.g:3339:4: () ( (lv_addOp_2_0= ruleAdditiveOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalReflexOld.g:3339:4: ()
            	    // InternalReflexOld.g:3340:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalReflexOld.g:3346:4: ( (lv_addOp_2_0= ruleAdditiveOp ) )
            	    // InternalReflexOld.g:3347:5: (lv_addOp_2_0= ruleAdditiveOp )
            	    {
            	    // InternalReflexOld.g:3347:5: (lv_addOp_2_0= ruleAdditiveOp )
            	    // InternalReflexOld.g:3348:6: lv_addOp_2_0= ruleAdditiveOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getAddOpAdditiveOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_addOp_2_0=ruleAdditiveOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"addOp",
            	      							lv_addOp_2_0,
            	      							"ru.iaie.reflexold.ReflexOld.AdditiveOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalReflexOld.g:3365:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalReflexOld.g:3366:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalReflexOld.g:3366:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalReflexOld.g:3367:6: lv_right_3_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"ru.iaie.reflexold.ReflexOld.AdditiveExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // InternalReflexOld.g:3389:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // InternalReflexOld.g:3389:56: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // InternalReflexOld.g:3390:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // InternalReflexOld.g:3396:1: ruleShiftExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_shiftOp_2_0= ruleShiftOp ) ) ( (lv_right_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_shiftOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3402:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_shiftOp_2_0= ruleShiftOp ) ) ( (lv_right_3_0= ruleShiftExpression ) ) )* ) )
            // InternalReflexOld.g:3403:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_shiftOp_2_0= ruleShiftOp ) ) ( (lv_right_3_0= ruleShiftExpression ) ) )* )
            {
            // InternalReflexOld.g:3403:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_shiftOp_2_0= ruleShiftOp ) ) ( (lv_right_3_0= ruleShiftExpression ) ) )* )
            // InternalReflexOld.g:3404:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_shiftOp_2_0= ruleShiftOp ) ) ( (lv_right_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalReflexOld.g:3412:3: ( () ( (lv_shiftOp_2_0= ruleShiftOp ) ) ( (lv_right_3_0= ruleShiftExpression ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==125) ) {
                    alt67=1;
                }
                else if ( (LA67_0==126) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalReflexOld.g:3413:4: () ( (lv_shiftOp_2_0= ruleShiftOp ) ) ( (lv_right_3_0= ruleShiftExpression ) )
            	    {
            	    // InternalReflexOld.g:3413:4: ()
            	    // InternalReflexOld.g:3414:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalReflexOld.g:3420:4: ( (lv_shiftOp_2_0= ruleShiftOp ) )
            	    // InternalReflexOld.g:3421:5: (lv_shiftOp_2_0= ruleShiftOp )
            	    {
            	    // InternalReflexOld.g:3421:5: (lv_shiftOp_2_0= ruleShiftOp )
            	    // InternalReflexOld.g:3422:6: lv_shiftOp_2_0= ruleShiftOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftExpressionAccess().getShiftOpShiftOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_shiftOp_2_0=ruleShiftOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"shiftOp",
            	      							lv_shiftOp_2_0,
            	      							"ru.iaie.reflexold.ReflexOld.ShiftOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalReflexOld.g:3439:4: ( (lv_right_3_0= ruleShiftExpression ) )
            	    // InternalReflexOld.g:3440:5: (lv_right_3_0= ruleShiftExpression )
            	    {
            	    // InternalReflexOld.g:3440:5: (lv_right_3_0= ruleShiftExpression )
            	    // InternalReflexOld.g:3441:6: lv_right_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightShiftExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_right_3_0=ruleShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"ru.iaie.reflexold.ReflexOld.ShiftExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleCompareExpression"
    // InternalReflexOld.g:3463:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // InternalReflexOld.g:3463:58: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // InternalReflexOld.g:3464:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // InternalReflexOld.g:3470:1: ruleCompareExpression returns [EObject current=null] : (this_CheckStateExpression_0= ruleCheckStateExpression | (this_ShiftExpression_1= ruleShiftExpression ( () ( (lv_cmpOp_3_0= ruleCompareOp ) ) ( (lv_right_4_0= ruleCompareExpression ) ) )* ) ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CheckStateExpression_0 = null;

        EObject this_ShiftExpression_1 = null;

        Enumerator lv_cmpOp_3_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3476:2: ( (this_CheckStateExpression_0= ruleCheckStateExpression | (this_ShiftExpression_1= ruleShiftExpression ( () ( (lv_cmpOp_3_0= ruleCompareOp ) ) ( (lv_right_4_0= ruleCompareExpression ) ) )* ) ) )
            // InternalReflexOld.g:3477:2: (this_CheckStateExpression_0= ruleCheckStateExpression | (this_ShiftExpression_1= ruleShiftExpression ( () ( (lv_cmpOp_3_0= ruleCompareOp ) ) ( (lv_right_4_0= ruleCompareExpression ) ) )* ) )
            {
            // InternalReflexOld.g:3477:2: (this_CheckStateExpression_0= ruleCheckStateExpression | (this_ShiftExpression_1= ruleShiftExpression ( () ( (lv_cmpOp_3_0= ruleCompareOp ) ) ( (lv_right_4_0= ruleCompareExpression ) ) )* ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=40 && LA69_0<=41)) ) {
                alt69=1;
            }
            else if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_BOOL_LITERAL)||LA69_0==58||(LA69_0>=104 && LA69_0<=105)||(LA69_0>=115 && LA69_0<=118)) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalReflexOld.g:3478:3: this_CheckStateExpression_0= ruleCheckStateExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCompareExpressionAccess().getCheckStateExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CheckStateExpression_0=ruleCheckStateExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CheckStateExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:3487:3: (this_ShiftExpression_1= ruleShiftExpression ( () ( (lv_cmpOp_3_0= ruleCompareOp ) ) ( (lv_right_4_0= ruleCompareExpression ) ) )* )
                    {
                    // InternalReflexOld.g:3487:3: (this_ShiftExpression_1= ruleShiftExpression ( () ( (lv_cmpOp_3_0= ruleCompareOp ) ) ( (lv_right_4_0= ruleCompareExpression ) ) )* )
                    // InternalReflexOld.g:3488:4: this_ShiftExpression_1= ruleShiftExpression ( () ( (lv_cmpOp_3_0= ruleCompareOp ) ) ( (lv_right_4_0= ruleCompareExpression ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCompareExpressionAccess().getShiftExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_52);
                    this_ShiftExpression_1=ruleShiftExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ShiftExpression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalReflexOld.g:3496:4: ( () ( (lv_cmpOp_3_0= ruleCompareOp ) ) ( (lv_right_4_0= ruleCompareExpression ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        switch ( input.LA(1) ) {
                        case 119:
                            {
                            alt68=1;
                            }
                            break;
                        case 120:
                            {
                            alt68=1;
                            }
                            break;
                        case 121:
                            {
                            alt68=1;
                            }
                            break;
                        case 122:
                            {
                            alt68=1;
                            }
                            break;

                        }

                        switch (alt68) {
                    	case 1 :
                    	    // InternalReflexOld.g:3497:5: () ( (lv_cmpOp_3_0= ruleCompareOp ) ) ( (lv_right_4_0= ruleCompareExpression ) )
                    	    {
                    	    // InternalReflexOld.g:3497:5: ()
                    	    // InternalReflexOld.g:3498:6: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						current = forceCreateModelElementAndSet(
                    	      							grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_1_0(),
                    	      							current);
                    	      					
                    	    }

                    	    }

                    	    // InternalReflexOld.g:3504:5: ( (lv_cmpOp_3_0= ruleCompareOp ) )
                    	    // InternalReflexOld.g:3505:6: (lv_cmpOp_3_0= ruleCompareOp )
                    	    {
                    	    // InternalReflexOld.g:3505:6: (lv_cmpOp_3_0= ruleCompareOp )
                    	    // InternalReflexOld.g:3506:7: lv_cmpOp_3_0= ruleCompareOp
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCompareExpressionAccess().getCmpOpCompareOpEnumRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_cmpOp_3_0=ruleCompareOp();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"cmpOp",
                    	      								lv_cmpOp_3_0,
                    	      								"ru.iaie.reflexold.ReflexOld.CompareOp");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalReflexOld.g:3523:5: ( (lv_right_4_0= ruleCompareExpression ) )
                    	    // InternalReflexOld.g:3524:6: (lv_right_4_0= ruleCompareExpression )
                    	    {
                    	    // InternalReflexOld.g:3524:6: (lv_right_4_0= ruleCompareExpression )
                    	    // InternalReflexOld.g:3525:7: lv_right_4_0= ruleCompareExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightCompareExpressionParserRuleCall_1_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_52);
                    	    lv_right_4_0=ruleCompareExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"right",
                    	      								lv_right_4_0,
                    	      								"ru.iaie.reflexold.ReflexOld.CompareExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalReflexOld.g:3548:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalReflexOld.g:3548:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalReflexOld.g:3549:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalReflexOld.g:3555:1: ruleEqualityExpression returns [EObject current=null] : (this_CompareExpression_0= ruleCompareExpression ( () ( (lv_eqCmpOp_2_0= ruleCompareEqOp ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareExpression_0 = null;

        Enumerator lv_eqCmpOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3561:2: ( (this_CompareExpression_0= ruleCompareExpression ( () ( (lv_eqCmpOp_2_0= ruleCompareEqOp ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalReflexOld.g:3562:2: (this_CompareExpression_0= ruleCompareExpression ( () ( (lv_eqCmpOp_2_0= ruleCompareEqOp ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalReflexOld.g:3562:2: (this_CompareExpression_0= ruleCompareExpression ( () ( (lv_eqCmpOp_2_0= ruleCompareEqOp ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalReflexOld.g:3563:3: this_CompareExpression_0= ruleCompareExpression ( () ( (lv_eqCmpOp_2_0= ruleCompareEqOp ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getCompareExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_CompareExpression_0=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CompareExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalReflexOld.g:3571:3: ( () ( (lv_eqCmpOp_2_0= ruleCompareEqOp ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==123) ) {
                    alt70=1;
                }
                else if ( (LA70_0==124) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalReflexOld.g:3572:4: () ( (lv_eqCmpOp_2_0= ruleCompareEqOp ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalReflexOld.g:3572:4: ()
            	    // InternalReflexOld.g:3573:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalReflexOld.g:3579:4: ( (lv_eqCmpOp_2_0= ruleCompareEqOp ) )
            	    // InternalReflexOld.g:3580:5: (lv_eqCmpOp_2_0= ruleCompareEqOp )
            	    {
            	    // InternalReflexOld.g:3580:5: (lv_eqCmpOp_2_0= ruleCompareEqOp )
            	    // InternalReflexOld.g:3581:6: lv_eqCmpOp_2_0= ruleCompareEqOp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getEqCmpOpCompareEqOpEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_eqCmpOp_2_0=ruleCompareEqOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"eqCmpOp",
            	      							lv_eqCmpOp_2_0,
            	      							"ru.iaie.reflexold.ReflexOld.CompareEqOp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalReflexOld.g:3598:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalReflexOld.g:3599:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalReflexOld.g:3599:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalReflexOld.g:3600:6: lv_right_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"ru.iaie.reflexold.ReflexOld.EqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleBitAndExpression"
    // InternalReflexOld.g:3622:1: entryRuleBitAndExpression returns [EObject current=null] : iv_ruleBitAndExpression= ruleBitAndExpression EOF ;
    public final EObject entryRuleBitAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitAndExpression = null;


        try {
            // InternalReflexOld.g:3622:57: (iv_ruleBitAndExpression= ruleBitAndExpression EOF )
            // InternalReflexOld.g:3623:2: iv_ruleBitAndExpression= ruleBitAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitAndExpression=ruleBitAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitAndExpression"


    // $ANTLR start "ruleBitAndExpression"
    // InternalReflexOld.g:3629:1: ruleBitAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () this_BIT_AND_2= RULE_BIT_AND ( (lv_right_3_0= ruleBitAndExpression ) ) )* ) ;
    public final EObject ruleBitAndExpression() throws RecognitionException {
        EObject current = null;

        Token this_BIT_AND_2=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3635:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () this_BIT_AND_2= RULE_BIT_AND ( (lv_right_3_0= ruleBitAndExpression ) ) )* ) )
            // InternalReflexOld.g:3636:2: (this_EqualityExpression_0= ruleEqualityExpression ( () this_BIT_AND_2= RULE_BIT_AND ( (lv_right_3_0= ruleBitAndExpression ) ) )* )
            {
            // InternalReflexOld.g:3636:2: (this_EqualityExpression_0= ruleEqualityExpression ( () this_BIT_AND_2= RULE_BIT_AND ( (lv_right_3_0= ruleBitAndExpression ) ) )* )
            // InternalReflexOld.g:3637:3: this_EqualityExpression_0= ruleEqualityExpression ( () this_BIT_AND_2= RULE_BIT_AND ( (lv_right_3_0= ruleBitAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalReflexOld.g:3645:3: ( () this_BIT_AND_2= RULE_BIT_AND ( (lv_right_3_0= ruleBitAndExpression ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_BIT_AND) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalReflexOld.g:3646:4: () this_BIT_AND_2= RULE_BIT_AND ( (lv_right_3_0= ruleBitAndExpression ) )
            	    {
            	    // InternalReflexOld.g:3646:4: ()
            	    // InternalReflexOld.g:3647:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitAndExpressionAccess().getBitAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_BIT_AND_2=(Token)match(input,RULE_BIT_AND,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_BIT_AND_2, grammarAccess.getBitAndExpressionAccess().getBIT_ANDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalReflexOld.g:3657:4: ( (lv_right_3_0= ruleBitAndExpression ) )
            	    // InternalReflexOld.g:3658:5: (lv_right_3_0= ruleBitAndExpression )
            	    {
            	    // InternalReflexOld.g:3658:5: (lv_right_3_0= ruleBitAndExpression )
            	    // InternalReflexOld.g:3659:6: lv_right_3_0= ruleBitAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitAndExpressionAccess().getRightBitAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_right_3_0=ruleBitAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBitAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"ru.iaie.reflexold.ReflexOld.BitAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitAndExpression"


    // $ANTLR start "entryRuleBitXorExpression"
    // InternalReflexOld.g:3681:1: entryRuleBitXorExpression returns [EObject current=null] : iv_ruleBitXorExpression= ruleBitXorExpression EOF ;
    public final EObject entryRuleBitXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitXorExpression = null;


        try {
            // InternalReflexOld.g:3681:57: (iv_ruleBitXorExpression= ruleBitXorExpression EOF )
            // InternalReflexOld.g:3682:2: iv_ruleBitXorExpression= ruleBitXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitXorExpression=ruleBitXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitXorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitXorExpression"


    // $ANTLR start "ruleBitXorExpression"
    // InternalReflexOld.g:3688:1: ruleBitXorExpression returns [EObject current=null] : (this_BitAndExpression_0= ruleBitAndExpression ( () this_BIT_XOR_2= RULE_BIT_XOR ( (lv_right_3_0= ruleBitXorExpression ) ) )* ) ;
    public final EObject ruleBitXorExpression() throws RecognitionException {
        EObject current = null;

        Token this_BIT_XOR_2=null;
        EObject this_BitAndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3694:2: ( (this_BitAndExpression_0= ruleBitAndExpression ( () this_BIT_XOR_2= RULE_BIT_XOR ( (lv_right_3_0= ruleBitXorExpression ) ) )* ) )
            // InternalReflexOld.g:3695:2: (this_BitAndExpression_0= ruleBitAndExpression ( () this_BIT_XOR_2= RULE_BIT_XOR ( (lv_right_3_0= ruleBitXorExpression ) ) )* )
            {
            // InternalReflexOld.g:3695:2: (this_BitAndExpression_0= ruleBitAndExpression ( () this_BIT_XOR_2= RULE_BIT_XOR ( (lv_right_3_0= ruleBitXorExpression ) ) )* )
            // InternalReflexOld.g:3696:3: this_BitAndExpression_0= ruleBitAndExpression ( () this_BIT_XOR_2= RULE_BIT_XOR ( (lv_right_3_0= ruleBitXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitXorExpressionAccess().getBitAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_BitAndExpression_0=ruleBitAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalReflexOld.g:3704:3: ( () this_BIT_XOR_2= RULE_BIT_XOR ( (lv_right_3_0= ruleBitXorExpression ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_BIT_XOR) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalReflexOld.g:3705:4: () this_BIT_XOR_2= RULE_BIT_XOR ( (lv_right_3_0= ruleBitXorExpression ) )
            	    {
            	    // InternalReflexOld.g:3705:4: ()
            	    // InternalReflexOld.g:3706:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitXorExpressionAccess().getBitXorExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_BIT_XOR_2=(Token)match(input,RULE_BIT_XOR,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_BIT_XOR_2, grammarAccess.getBitXorExpressionAccess().getBIT_XORTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalReflexOld.g:3716:4: ( (lv_right_3_0= ruleBitXorExpression ) )
            	    // InternalReflexOld.g:3717:5: (lv_right_3_0= ruleBitXorExpression )
            	    {
            	    // InternalReflexOld.g:3717:5: (lv_right_3_0= ruleBitXorExpression )
            	    // InternalReflexOld.g:3718:6: lv_right_3_0= ruleBitXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitXorExpressionAccess().getRightBitXorExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_right_3_0=ruleBitXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBitXorExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"ru.iaie.reflexold.ReflexOld.BitXorExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitXorExpression"


    // $ANTLR start "entryRuleBitOrExpression"
    // InternalReflexOld.g:3740:1: entryRuleBitOrExpression returns [EObject current=null] : iv_ruleBitOrExpression= ruleBitOrExpression EOF ;
    public final EObject entryRuleBitOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitOrExpression = null;


        try {
            // InternalReflexOld.g:3740:56: (iv_ruleBitOrExpression= ruleBitOrExpression EOF )
            // InternalReflexOld.g:3741:2: iv_ruleBitOrExpression= ruleBitOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBitOrExpression=ruleBitOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitOrExpression"


    // $ANTLR start "ruleBitOrExpression"
    // InternalReflexOld.g:3747:1: ruleBitOrExpression returns [EObject current=null] : (this_BitXorExpression_0= ruleBitXorExpression ( () this_BIT_OR_2= RULE_BIT_OR ( (lv_right_3_0= ruleBitOrExpression ) ) )* ) ;
    public final EObject ruleBitOrExpression() throws RecognitionException {
        EObject current = null;

        Token this_BIT_OR_2=null;
        EObject this_BitXorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3753:2: ( (this_BitXorExpression_0= ruleBitXorExpression ( () this_BIT_OR_2= RULE_BIT_OR ( (lv_right_3_0= ruleBitOrExpression ) ) )* ) )
            // InternalReflexOld.g:3754:2: (this_BitXorExpression_0= ruleBitXorExpression ( () this_BIT_OR_2= RULE_BIT_OR ( (lv_right_3_0= ruleBitOrExpression ) ) )* )
            {
            // InternalReflexOld.g:3754:2: (this_BitXorExpression_0= ruleBitXorExpression ( () this_BIT_OR_2= RULE_BIT_OR ( (lv_right_3_0= ruleBitOrExpression ) ) )* )
            // InternalReflexOld.g:3755:3: this_BitXorExpression_0= ruleBitXorExpression ( () this_BIT_OR_2= RULE_BIT_OR ( (lv_right_3_0= ruleBitOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitOrExpressionAccess().getBitXorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_BitXorExpression_0=ruleBitXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitXorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalReflexOld.g:3763:3: ( () this_BIT_OR_2= RULE_BIT_OR ( (lv_right_3_0= ruleBitOrExpression ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_BIT_OR) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalReflexOld.g:3764:4: () this_BIT_OR_2= RULE_BIT_OR ( (lv_right_3_0= ruleBitOrExpression ) )
            	    {
            	    // InternalReflexOld.g:3764:4: ()
            	    // InternalReflexOld.g:3765:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBitOrExpressionAccess().getBitOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_BIT_OR_2=(Token)match(input,RULE_BIT_OR,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_BIT_OR_2, grammarAccess.getBitOrExpressionAccess().getBIT_ORTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalReflexOld.g:3775:4: ( (lv_right_3_0= ruleBitOrExpression ) )
            	    // InternalReflexOld.g:3776:5: (lv_right_3_0= ruleBitOrExpression )
            	    {
            	    // InternalReflexOld.g:3776:5: (lv_right_3_0= ruleBitOrExpression )
            	    // InternalReflexOld.g:3777:6: lv_right_3_0= ruleBitOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBitOrExpressionAccess().getRightBitOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_right_3_0=ruleBitOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBitOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"ru.iaie.reflexold.ReflexOld.BitOrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalReflexOld.g:3799:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalReflexOld.g:3799:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalReflexOld.g:3800:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalReflexOld.g:3806:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitOrExpression_0= ruleBitOrExpression ( () this_LOGICAL_AND_2= RULE_LOGICAL_AND ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token this_LOGICAL_AND_2=null;
        EObject this_BitOrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3812:2: ( (this_BitOrExpression_0= ruleBitOrExpression ( () this_LOGICAL_AND_2= RULE_LOGICAL_AND ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* ) )
            // InternalReflexOld.g:3813:2: (this_BitOrExpression_0= ruleBitOrExpression ( () this_LOGICAL_AND_2= RULE_LOGICAL_AND ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // InternalReflexOld.g:3813:2: (this_BitOrExpression_0= ruleBitOrExpression ( () this_LOGICAL_AND_2= RULE_LOGICAL_AND ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* )
            // InternalReflexOld.g:3814:3: this_BitOrExpression_0= ruleBitOrExpression ( () this_LOGICAL_AND_2= RULE_LOGICAL_AND ( (lv_right_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_BitOrExpression_0=ruleBitOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalReflexOld.g:3822:3: ( () this_LOGICAL_AND_2= RULE_LOGICAL_AND ( (lv_right_3_0= ruleLogicalAndExpression ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_LOGICAL_AND) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalReflexOld.g:3823:4: () this_LOGICAL_AND_2= RULE_LOGICAL_AND ( (lv_right_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // InternalReflexOld.g:3823:4: ()
            	    // InternalReflexOld.g:3824:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_LOGICAL_AND_2=(Token)match(input,RULE_LOGICAL_AND,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LOGICAL_AND_2, grammarAccess.getLogicalAndExpressionAccess().getLOGICAL_ANDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalReflexOld.g:3834:4: ( (lv_right_3_0= ruleLogicalAndExpression ) )
            	    // InternalReflexOld.g:3835:5: (lv_right_3_0= ruleLogicalAndExpression )
            	    {
            	    // InternalReflexOld.g:3835:5: (lv_right_3_0= ruleLogicalAndExpression )
            	    // InternalReflexOld.g:3836:6: lv_right_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightLogicalAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_right_3_0=ruleLogicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"ru.iaie.reflexold.ReflexOld.LogicalAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalReflexOld.g:3858:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalReflexOld.g:3858:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalReflexOld.g:3859:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalReflexOld.g:3865:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () this_LOGICAL_OR_2= RULE_LOGICAL_OR ( (lv_right_3_0= ruleLogicalOrExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token this_LOGICAL_OR_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3871:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () this_LOGICAL_OR_2= RULE_LOGICAL_OR ( (lv_right_3_0= ruleLogicalOrExpression ) ) )* ) )
            // InternalReflexOld.g:3872:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () this_LOGICAL_OR_2= RULE_LOGICAL_OR ( (lv_right_3_0= ruleLogicalOrExpression ) ) )* )
            {
            // InternalReflexOld.g:3872:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () this_LOGICAL_OR_2= RULE_LOGICAL_OR ( (lv_right_3_0= ruleLogicalOrExpression ) ) )* )
            // InternalReflexOld.g:3873:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () this_LOGICAL_OR_2= RULE_LOGICAL_OR ( (lv_right_3_0= ruleLogicalOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalReflexOld.g:3881:3: ( () this_LOGICAL_OR_2= RULE_LOGICAL_OR ( (lv_right_3_0= ruleLogicalOrExpression ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_LOGICAL_OR) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalReflexOld.g:3882:4: () this_LOGICAL_OR_2= RULE_LOGICAL_OR ( (lv_right_3_0= ruleLogicalOrExpression ) )
            	    {
            	    // InternalReflexOld.g:3882:4: ()
            	    // InternalReflexOld.g:3883:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_LOGICAL_OR_2=(Token)match(input,RULE_LOGICAL_OR,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LOGICAL_OR_2, grammarAccess.getLogicalOrExpressionAccess().getLOGICAL_ORTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalReflexOld.g:3893:4: ( (lv_right_3_0= ruleLogicalOrExpression ) )
            	    // InternalReflexOld.g:3894:5: (lv_right_3_0= ruleLogicalOrExpression )
            	    {
            	    // InternalReflexOld.g:3894:5: (lv_right_3_0= ruleLogicalOrExpression )
            	    // InternalReflexOld.g:3895:6: lv_right_3_0= ruleLogicalOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightLogicalOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_right_3_0=ruleLogicalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"ru.iaie.reflexold.ReflexOld.LogicalOrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleAssignmentExpression"
    // InternalReflexOld.g:3917:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // InternalReflexOld.g:3917:61: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // InternalReflexOld.g:3918:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // InternalReflexOld.g:3924:1: ruleAssignmentExpression returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_assignOp_1_0= ruleAssignOperator ) ) )? ( (lv_expr_2_0= ruleLogicalOrExpression ) ) ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_assignOp_1_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:3930:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_assignOp_1_0= ruleAssignOperator ) ) )? ( (lv_expr_2_0= ruleLogicalOrExpression ) ) ) )
            // InternalReflexOld.g:3931:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_assignOp_1_0= ruleAssignOperator ) ) )? ( (lv_expr_2_0= ruleLogicalOrExpression ) ) )
            {
            // InternalReflexOld.g:3931:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_assignOp_1_0= ruleAssignOperator ) ) )? ( (lv_expr_2_0= ruleLogicalOrExpression ) ) )
            // InternalReflexOld.g:3932:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_assignOp_1_0= ruleAssignOperator ) ) )? ( (lv_expr_2_0= ruleLogicalOrExpression ) )
            {
            // InternalReflexOld.g:3932:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_assignOp_1_0= ruleAssignOperator ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==53||(LA76_1>=106 && LA76_1<=114)) ) {
                    alt76=1;
                }
            }
            switch (alt76) {
                case 1 :
                    // InternalReflexOld.g:3933:4: ( (otherlv_0= RULE_ID ) ) ( (lv_assignOp_1_0= ruleAssignOperator ) )
                    {
                    // InternalReflexOld.g:3933:4: ( (otherlv_0= RULE_ID ) )
                    // InternalReflexOld.g:3934:5: (otherlv_0= RULE_ID )
                    {
                    // InternalReflexOld.g:3934:5: (otherlv_0= RULE_ID )
                    // InternalReflexOld.g:3935:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAssignmentExpressionRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getAssignmentExpressionAccess().getAssignVarIdReferenceCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    // InternalReflexOld.g:3946:4: ( (lv_assignOp_1_0= ruleAssignOperator ) )
                    // InternalReflexOld.g:3947:5: (lv_assignOp_1_0= ruleAssignOperator )
                    {
                    // InternalReflexOld.g:3947:5: (lv_assignOp_1_0= ruleAssignOperator )
                    // InternalReflexOld.g:3948:6: lv_assignOp_1_0= ruleAssignOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getAssignOpAssignOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_assignOp_1_0=ruleAssignOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                      						}
                      						set(
                      							current,
                      							"assignOp",
                      							lv_assignOp_1_0,
                      							"ru.iaie.reflexold.ReflexOld.AssignOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalReflexOld.g:3966:3: ( (lv_expr_2_0= ruleLogicalOrExpression ) )
            // InternalReflexOld.g:3967:4: (lv_expr_2_0= ruleLogicalOrExpression )
            {
            // InternalReflexOld.g:3967:4: (lv_expr_2_0= ruleLogicalOrExpression )
            // InternalReflexOld.g:3968:5: lv_expr_2_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExprLogicalOrExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"ru.iaie.reflexold.ReflexOld.LogicalOrExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalReflexOld.g:3989:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalReflexOld.g:3989:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalReflexOld.g:3990:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalReflexOld.g:3996:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;



        	enterRule();

        try {
            // InternalReflexOld.g:4002:2: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // InternalReflexOld.g:4003:2: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_AssignmentExpression_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_AssignmentExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "rulePortType"
    // InternalReflexOld.g:4014:1: rulePortType returns [Enumerator current=null] : ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= '\\u0412\\u0425\\u041E\\u0414' ) | (enumLiteral_2= 'OUTPUT' ) | (enumLiteral_3= '\\u0412\\u042B\\u0425\\u041E\\u0414' ) ) ;
    public final Enumerator rulePortType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4020:2: ( ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= '\\u0412\\u0425\\u041E\\u0414' ) | (enumLiteral_2= 'OUTPUT' ) | (enumLiteral_3= '\\u0412\\u042B\\u0425\\u041E\\u0414' ) ) )
            // InternalReflexOld.g:4021:2: ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= '\\u0412\\u0425\\u041E\\u0414' ) | (enumLiteral_2= 'OUTPUT' ) | (enumLiteral_3= '\\u0412\\u042B\\u0425\\u041E\\u0414' ) )
            {
            // InternalReflexOld.g:4021:2: ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= '\\u0412\\u0425\\u041E\\u0414' ) | (enumLiteral_2= 'OUTPUT' ) | (enumLiteral_3= '\\u0412\\u042B\\u0425\\u041E\\u0414' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt77=1;
                }
                break;
            case 97:
                {
                alt77=2;
                }
                break;
            case 98:
                {
                alt77=3;
                }
                break;
            case 99:
                {
                alt77=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalReflexOld.g:4022:3: (enumLiteral_0= 'INPUT' )
                    {
                    // InternalReflexOld.g:4022:3: (enumLiteral_0= 'INPUT' )
                    // InternalReflexOld.g:4023:4: enumLiteral_0= 'INPUT'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPortTypeAccess().getINPUT_ENEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPortTypeAccess().getINPUT_ENEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4030:3: (enumLiteral_1= '\\u0412\\u0425\\u041E\\u0414' )
                    {
                    // InternalReflexOld.g:4030:3: (enumLiteral_1= '\\u0412\\u0425\\u041E\\u0414' )
                    // InternalReflexOld.g:4031:4: enumLiteral_1= '\\u0412\\u0425\\u041E\\u0414'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPortTypeAccess().getINPUT_RUEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPortTypeAccess().getINPUT_RUEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:4038:3: (enumLiteral_2= 'OUTPUT' )
                    {
                    // InternalReflexOld.g:4038:3: (enumLiteral_2= 'OUTPUT' )
                    // InternalReflexOld.g:4039:4: enumLiteral_2= 'OUTPUT'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPortTypeAccess().getOUTPUT_ENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getPortTypeAccess().getOUTPUT_ENEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalReflexOld.g:4046:3: (enumLiteral_3= '\\u0412\\u042B\\u0425\\u041E\\u0414' )
                    {
                    // InternalReflexOld.g:4046:3: (enumLiteral_3= '\\u0412\\u042B\\u0425\\u041E\\u0414' )
                    // InternalReflexOld.g:4047:4: enumLiteral_3= '\\u0412\\u042B\\u0425\\u041E\\u0414'
                    {
                    enumLiteral_3=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPortTypeAccess().getOUTPUT_RUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getPortTypeAccess().getOUTPUT_RUEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortType"


    // $ANTLR start "ruleStateQualifier"
    // InternalReflexOld.g:4057:1: ruleStateQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'ACTIVE' ) | (enumLiteral_1= '\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415' ) | (enumLiteral_2= 'PASSIVE' ) | (enumLiteral_3= '\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= '\\u0421\\u0422\\u041E\\u041F' ) | (enumLiteral_6= 'ERROR' ) | (enumLiteral_7= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' ) ) ;
    public final Enumerator ruleStateQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4063:2: ( ( (enumLiteral_0= 'ACTIVE' ) | (enumLiteral_1= '\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415' ) | (enumLiteral_2= 'PASSIVE' ) | (enumLiteral_3= '\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= '\\u0421\\u0422\\u041E\\u041F' ) | (enumLiteral_6= 'ERROR' ) | (enumLiteral_7= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' ) ) )
            // InternalReflexOld.g:4064:2: ( (enumLiteral_0= 'ACTIVE' ) | (enumLiteral_1= '\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415' ) | (enumLiteral_2= 'PASSIVE' ) | (enumLiteral_3= '\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= '\\u0421\\u0422\\u041E\\u041F' ) | (enumLiteral_6= 'ERROR' ) | (enumLiteral_7= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' ) )
            {
            // InternalReflexOld.g:4064:2: ( (enumLiteral_0= 'ACTIVE' ) | (enumLiteral_1= '\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415' ) | (enumLiteral_2= 'PASSIVE' ) | (enumLiteral_3= '\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= '\\u0421\\u0422\\u041E\\u041F' ) | (enumLiteral_6= 'ERROR' ) | (enumLiteral_7= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' ) )
            int alt78=8;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt78=1;
                }
                break;
            case 101:
                {
                alt78=2;
                }
                break;
            case 102:
                {
                alt78=3;
                }
                break;
            case 103:
                {
                alt78=4;
                }
                break;
            case 81:
                {
                alt78=5;
                }
                break;
            case 82:
                {
                alt78=6;
                }
                break;
            case 83:
                {
                alt78=7;
                }
                break;
            case 84:
                {
                alt78=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalReflexOld.g:4065:3: (enumLiteral_0= 'ACTIVE' )
                    {
                    // InternalReflexOld.g:4065:3: (enumLiteral_0= 'ACTIVE' )
                    // InternalReflexOld.g:4066:4: enumLiteral_0= 'ACTIVE'
                    {
                    enumLiteral_0=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStateQualifierAccess().getACTIVE_ENEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getStateQualifierAccess().getACTIVE_ENEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4073:3: (enumLiteral_1= '\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415' )
                    {
                    // InternalReflexOld.g:4073:3: (enumLiteral_1= '\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415' )
                    // InternalReflexOld.g:4074:4: enumLiteral_1= '\\u0410\\u041A\\u0422\\u0418\\u0412\\u041D\\u041E\\u0415'
                    {
                    enumLiteral_1=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStateQualifierAccess().getACTIVE_RUEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getStateQualifierAccess().getACTIVE_RUEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:4081:3: (enumLiteral_2= 'PASSIVE' )
                    {
                    // InternalReflexOld.g:4081:3: (enumLiteral_2= 'PASSIVE' )
                    // InternalReflexOld.g:4082:4: enumLiteral_2= 'PASSIVE'
                    {
                    enumLiteral_2=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStateQualifierAccess().getPASSIVE_ENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getStateQualifierAccess().getPASSIVE_ENEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalReflexOld.g:4089:3: (enumLiteral_3= '\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415' )
                    {
                    // InternalReflexOld.g:4089:3: (enumLiteral_3= '\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415' )
                    // InternalReflexOld.g:4090:4: enumLiteral_3= '\\u041F\\u0410\\u0421\\u0421\\u0418\\u0412\\u041D\\u041E\\u0415'
                    {
                    enumLiteral_3=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStateQualifierAccess().getPASSIVE_RUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getStateQualifierAccess().getPASSIVE_RUEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalReflexOld.g:4097:3: (enumLiteral_4= 'STOP' )
                    {
                    // InternalReflexOld.g:4097:3: (enumLiteral_4= 'STOP' )
                    // InternalReflexOld.g:4098:4: enumLiteral_4= 'STOP'
                    {
                    enumLiteral_4=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStateQualifierAccess().getSTOP_ENEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getStateQualifierAccess().getSTOP_ENEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalReflexOld.g:4105:3: (enumLiteral_5= '\\u0421\\u0422\\u041E\\u041F' )
                    {
                    // InternalReflexOld.g:4105:3: (enumLiteral_5= '\\u0421\\u0422\\u041E\\u041F' )
                    // InternalReflexOld.g:4106:4: enumLiteral_5= '\\u0421\\u0422\\u041E\\u041F'
                    {
                    enumLiteral_5=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStateQualifierAccess().getSTOP_RUEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getStateQualifierAccess().getSTOP_RUEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalReflexOld.g:4113:3: (enumLiteral_6= 'ERROR' )
                    {
                    // InternalReflexOld.g:4113:3: (enumLiteral_6= 'ERROR' )
                    // InternalReflexOld.g:4114:4: enumLiteral_6= 'ERROR'
                    {
                    enumLiteral_6=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStateQualifierAccess().getERROR_ENEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getStateQualifierAccess().getERROR_ENEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalReflexOld.g:4121:3: (enumLiteral_7= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' )
                    {
                    // InternalReflexOld.g:4121:3: (enumLiteral_7= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410' )
                    // InternalReflexOld.g:4122:4: enumLiteral_7= '\\u041E\\u0428\\u0418\\u0411\\u041A\\u0410'
                    {
                    enumLiteral_7=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStateQualifierAccess().getERROR_RUEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getStateQualifierAccess().getERROR_RUEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateQualifier"


    // $ANTLR start "ruleInfixPostfixOp"
    // InternalReflexOld.g:4132:1: ruleInfixPostfixOp returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleInfixPostfixOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4138:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalReflexOld.g:4139:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalReflexOld.g:4139:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==104) ) {
                alt79=1;
            }
            else if ( (LA79_0==105) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalReflexOld.g:4140:3: (enumLiteral_0= '++' )
                    {
                    // InternalReflexOld.g:4140:3: (enumLiteral_0= '++' )
                    // InternalReflexOld.g:4141:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getInfixPostfixOpAccess().getINCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getInfixPostfixOpAccess().getINCEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4148:3: (enumLiteral_1= '--' )
                    {
                    // InternalReflexOld.g:4148:3: (enumLiteral_1= '--' )
                    // InternalReflexOld.g:4149:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getInfixPostfixOpAccess().getDECEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getInfixPostfixOpAccess().getDECEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfixPostfixOp"


    // $ANTLR start "ruleAssignOperator"
    // InternalReflexOld.g:4159:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '+=' ) | (enumLiteral_4= '-=' ) | (enumLiteral_5= '<<=' ) | (enumLiteral_6= '>>=' ) | (enumLiteral_7= '&=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '|=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4165:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '+=' ) | (enumLiteral_4= '-=' ) | (enumLiteral_5= '<<=' ) | (enumLiteral_6= '>>=' ) | (enumLiteral_7= '&=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '|=' ) ) )
            // InternalReflexOld.g:4166:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '+=' ) | (enumLiteral_4= '-=' ) | (enumLiteral_5= '<<=' ) | (enumLiteral_6= '>>=' ) | (enumLiteral_7= '&=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '|=' ) )
            {
            // InternalReflexOld.g:4166:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '+=' ) | (enumLiteral_4= '-=' ) | (enumLiteral_5= '<<=' ) | (enumLiteral_6= '>>=' ) | (enumLiteral_7= '&=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '|=' ) )
            int alt80=10;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt80=1;
                }
                break;
            case 106:
                {
                alt80=2;
                }
                break;
            case 107:
                {
                alt80=3;
                }
                break;
            case 108:
                {
                alt80=4;
                }
                break;
            case 109:
                {
                alt80=5;
                }
                break;
            case 110:
                {
                alt80=6;
                }
                break;
            case 111:
                {
                alt80=7;
                }
                break;
            case 112:
                {
                alt80=8;
                }
                break;
            case 113:
                {
                alt80=9;
                }
                break;
            case 114:
                {
                alt80=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalReflexOld.g:4167:3: (enumLiteral_0= '=' )
                    {
                    // InternalReflexOld.g:4167:3: (enumLiteral_0= '=' )
                    // InternalReflexOld.g:4168:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4175:3: (enumLiteral_1= '*=' )
                    {
                    // InternalReflexOld.g:4175:3: (enumLiteral_1= '*=' )
                    // InternalReflexOld.g:4176:4: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getMULEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getMULEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:4183:3: (enumLiteral_2= '/=' )
                    {
                    // InternalReflexOld.g:4183:3: (enumLiteral_2= '/=' )
                    // InternalReflexOld.g:4184:4: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getDIVEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getDIVEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalReflexOld.g:4191:3: (enumLiteral_3= '+=' )
                    {
                    // InternalReflexOld.g:4191:3: (enumLiteral_3= '+=' )
                    // InternalReflexOld.g:4192:4: enumLiteral_3= '+='
                    {
                    enumLiteral_3=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getMODEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getMODEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalReflexOld.g:4199:3: (enumLiteral_4= '-=' )
                    {
                    // InternalReflexOld.g:4199:3: (enumLiteral_4= '-=' )
                    // InternalReflexOld.g:4200:4: enumLiteral_4= '-='
                    {
                    enumLiteral_4=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getSUBEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getSUBEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalReflexOld.g:4207:3: (enumLiteral_5= '<<=' )
                    {
                    // InternalReflexOld.g:4207:3: (enumLiteral_5= '<<=' )
                    // InternalReflexOld.g:4208:4: enumLiteral_5= '<<='
                    {
                    enumLiteral_5=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getCINEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAssignOperatorAccess().getCINEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalReflexOld.g:4215:3: (enumLiteral_6= '>>=' )
                    {
                    // InternalReflexOld.g:4215:3: (enumLiteral_6= '>>=' )
                    // InternalReflexOld.g:4216:4: enumLiteral_6= '>>='
                    {
                    enumLiteral_6=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getCOUTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAssignOperatorAccess().getCOUTEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalReflexOld.g:4223:3: (enumLiteral_7= '&=' )
                    {
                    // InternalReflexOld.g:4223:3: (enumLiteral_7= '&=' )
                    // InternalReflexOld.g:4224:4: enumLiteral_7= '&='
                    {
                    enumLiteral_7=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getBIT_ANDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAssignOperatorAccess().getBIT_ANDEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalReflexOld.g:4231:3: (enumLiteral_8= '^=' )
                    {
                    // InternalReflexOld.g:4231:3: (enumLiteral_8= '^=' )
                    // InternalReflexOld.g:4232:4: enumLiteral_8= '^='
                    {
                    enumLiteral_8=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getBIT_XOREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAssignOperatorAccess().getBIT_XOREnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalReflexOld.g:4239:3: (enumLiteral_9= '|=' )
                    {
                    // InternalReflexOld.g:4239:3: (enumLiteral_9= '|=' )
                    // InternalReflexOld.g:4240:4: enumLiteral_9= '|='
                    {
                    enumLiteral_9=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAssignOperatorAccess().getBIT_OREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAssignOperatorAccess().getBIT_OREnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "ruleUnaryOp"
    // InternalReflexOld.g:4250:1: ruleUnaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) | (enumLiteral_3= '!' ) ) ;
    public final Enumerator ruleUnaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4256:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) | (enumLiteral_3= '!' ) ) )
            // InternalReflexOld.g:4257:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) | (enumLiteral_3= '!' ) )
            {
            // InternalReflexOld.g:4257:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) | (enumLiteral_3= '!' ) )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt81=1;
                }
                break;
            case 116:
                {
                alt81=2;
                }
                break;
            case 117:
                {
                alt81=3;
                }
                break;
            case 118:
                {
                alt81=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalReflexOld.g:4258:3: (enumLiteral_0= '+' )
                    {
                    // InternalReflexOld.g:4258:3: (enumLiteral_0= '+' )
                    // InternalReflexOld.g:4259:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOpAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4266:3: (enumLiteral_1= '-' )
                    {
                    // InternalReflexOld.g:4266:3: (enumLiteral_1= '-' )
                    // InternalReflexOld.g:4267:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOpAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:4274:3: (enumLiteral_2= '~' )
                    {
                    // InternalReflexOld.g:4274:3: (enumLiteral_2= '~' )
                    // InternalReflexOld.g:4275:4: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getBIT_NOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnaryOpAccess().getBIT_NOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalReflexOld.g:4282:3: (enumLiteral_3= '!' )
                    {
                    // InternalReflexOld.g:4282:3: (enumLiteral_3= '!' )
                    // InternalReflexOld.g:4283:4: enumLiteral_3= '!'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getLOGICAL_NOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getUnaryOpAccess().getLOGICAL_NOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "ruleCompareOp"
    // InternalReflexOld.g:4293:1: ruleCompareOp returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompareOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4299:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalReflexOld.g:4300:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalReflexOld.g:4300:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt82=1;
                }
                break;
            case 120:
                {
                alt82=2;
                }
                break;
            case 121:
                {
                alt82=3;
                }
                break;
            case 122:
                {
                alt82=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalReflexOld.g:4301:3: (enumLiteral_0= '<' )
                    {
                    // InternalReflexOld.g:4301:3: (enumLiteral_0= '<' )
                    // InternalReflexOld.g:4302:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOpAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOpAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4309:3: (enumLiteral_1= '>' )
                    {
                    // InternalReflexOld.g:4309:3: (enumLiteral_1= '>' )
                    // InternalReflexOld.g:4310:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOpAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOpAccess().getGREATEREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:4317:3: (enumLiteral_2= '<=' )
                    {
                    // InternalReflexOld.g:4317:3: (enumLiteral_2= '<=' )
                    // InternalReflexOld.g:4318:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOpAccess().getLESS_EQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOpAccess().getLESS_EQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalReflexOld.g:4325:3: (enumLiteral_3= '>=' )
                    {
                    // InternalReflexOld.g:4325:3: (enumLiteral_3= '>=' )
                    // InternalReflexOld.g:4326:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOpAccess().getGREATER_EQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOpAccess().getGREATER_EQEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareOp"


    // $ANTLR start "ruleCompareEqOp"
    // InternalReflexOld.g:4336:1: ruleCompareEqOp returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleCompareEqOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4342:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalReflexOld.g:4343:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalReflexOld.g:4343:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==123) ) {
                alt83=1;
            }
            else if ( (LA83_0==124) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalReflexOld.g:4344:3: (enumLiteral_0= '==' )
                    {
                    // InternalReflexOld.g:4344:3: (enumLiteral_0= '==' )
                    // InternalReflexOld.g:4345:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareEqOpAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareEqOpAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4352:3: (enumLiteral_1= '!=' )
                    {
                    // InternalReflexOld.g:4352:3: (enumLiteral_1= '!=' )
                    // InternalReflexOld.g:4353:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareEqOpAccess().getNOT_EQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareEqOpAccess().getNOT_EQEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareEqOp"


    // $ANTLR start "ruleShiftOp"
    // InternalReflexOld.g:4363:1: ruleShiftOp returns [Enumerator current=null] : ( (enumLiteral_0= '>>' ) | (enumLiteral_1= '<<' ) ) ;
    public final Enumerator ruleShiftOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4369:2: ( ( (enumLiteral_0= '>>' ) | (enumLiteral_1= '<<' ) ) )
            // InternalReflexOld.g:4370:2: ( (enumLiteral_0= '>>' ) | (enumLiteral_1= '<<' ) )
            {
            // InternalReflexOld.g:4370:2: ( (enumLiteral_0= '>>' ) | (enumLiteral_1= '<<' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==125) ) {
                alt84=1;
            }
            else if ( (LA84_0==126) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalReflexOld.g:4371:3: (enumLiteral_0= '>>' )
                    {
                    // InternalReflexOld.g:4371:3: (enumLiteral_0= '>>' )
                    // InternalReflexOld.g:4372:4: enumLiteral_0= '>>'
                    {
                    enumLiteral_0=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpAccess().getLEFT_SHIFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getShiftOpAccess().getLEFT_SHIFTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4379:3: (enumLiteral_1= '<<' )
                    {
                    // InternalReflexOld.g:4379:3: (enumLiteral_1= '<<' )
                    // InternalReflexOld.g:4380:4: enumLiteral_1= '<<'
                    {
                    enumLiteral_1=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getShiftOpAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getShiftOpAccess().getRIGHT_SHIFTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShiftOp"


    // $ANTLR start "ruleAdditiveOp"
    // InternalReflexOld.g:4390:1: ruleAdditiveOp returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4396:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalReflexOld.g:4397:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalReflexOld.g:4397:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==115) ) {
                alt85=1;
            }
            else if ( (LA85_0==116) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalReflexOld.g:4398:3: (enumLiteral_0= '+' )
                    {
                    // InternalReflexOld.g:4398:3: (enumLiteral_0= '+' )
                    // InternalReflexOld.g:4399:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditiveOpAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOpAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4406:3: (enumLiteral_1= '-' )
                    {
                    // InternalReflexOld.g:4406:3: (enumLiteral_1= '-' )
                    // InternalReflexOld.g:4407:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditiveOpAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOpAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOp"


    // $ANTLR start "ruleMultiplicativeOp"
    // InternalReflexOld.g:4417:1: ruleMultiplicativeOp returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4423:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // InternalReflexOld.g:4424:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // InternalReflexOld.g:4424:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt86=3;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt86=1;
                }
                break;
            case 128:
                {
                alt86=2;
                }
                break;
            case 129:
                {
                alt86=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalReflexOld.g:4425:3: (enumLiteral_0= '*' )
                    {
                    // InternalReflexOld.g:4425:3: (enumLiteral_0= '*' )
                    // InternalReflexOld.g:4426:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOpAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOpAccess().getMULEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4433:3: (enumLiteral_1= '/' )
                    {
                    // InternalReflexOld.g:4433:3: (enumLiteral_1= '/' )
                    // InternalReflexOld.g:4434:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOpAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOpAccess().getDIVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:4441:3: (enumLiteral_2= '%' )
                    {
                    // InternalReflexOld.g:4441:3: (enumLiteral_2= '%' )
                    // InternalReflexOld.g:4442:4: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeOpAccess().getMODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOpAccess().getMODEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOp"


    // $ANTLR start "ruleType"
    // InternalReflexOld.g:4452:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= '\\u041F\\u0423\\u0421\\u0422\\u041E' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= '\\u041F\\u041B\\u0410\\u0412' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= '\\u0414\\u041F\\u041B\\u0410\\u0412' ) | (enumLiteral_6= 'SHORT' ) | (enumLiteral_7= '\\u041A\\u0426\\u0415\\u041B' ) | (enumLiteral_8= 'UNSIGNED SHORT' ) | (enumLiteral_9= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B' ) | (enumLiteral_10= 'INT' ) | (enumLiteral_11= '\\u0426\\u0415\\u041B' ) | (enumLiteral_12= 'UNSIGNED INT' ) | (enumLiteral_13= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B' ) | (enumLiteral_14= 'LONG' ) | (enumLiteral_15= '\\u0414\\u0426\\u0415\\u041B' ) | (enumLiteral_16= 'UNSIGNED LONG' ) | (enumLiteral_17= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B' ) | (enumLiteral_18= 'LOG' ) | (enumLiteral_19= '\\u041B\\u041E\\u0413' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;


        	enterRule();

        try {
            // InternalReflexOld.g:4458:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= '\\u041F\\u0423\\u0421\\u0422\\u041E' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= '\\u041F\\u041B\\u0410\\u0412' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= '\\u0414\\u041F\\u041B\\u0410\\u0412' ) | (enumLiteral_6= 'SHORT' ) | (enumLiteral_7= '\\u041A\\u0426\\u0415\\u041B' ) | (enumLiteral_8= 'UNSIGNED SHORT' ) | (enumLiteral_9= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B' ) | (enumLiteral_10= 'INT' ) | (enumLiteral_11= '\\u0426\\u0415\\u041B' ) | (enumLiteral_12= 'UNSIGNED INT' ) | (enumLiteral_13= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B' ) | (enumLiteral_14= 'LONG' ) | (enumLiteral_15= '\\u0414\\u0426\\u0415\\u041B' ) | (enumLiteral_16= 'UNSIGNED LONG' ) | (enumLiteral_17= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B' ) | (enumLiteral_18= 'LOG' ) | (enumLiteral_19= '\\u041B\\u041E\\u0413' ) ) )
            // InternalReflexOld.g:4459:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= '\\u041F\\u0423\\u0421\\u0422\\u041E' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= '\\u041F\\u041B\\u0410\\u0412' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= '\\u0414\\u041F\\u041B\\u0410\\u0412' ) | (enumLiteral_6= 'SHORT' ) | (enumLiteral_7= '\\u041A\\u0426\\u0415\\u041B' ) | (enumLiteral_8= 'UNSIGNED SHORT' ) | (enumLiteral_9= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B' ) | (enumLiteral_10= 'INT' ) | (enumLiteral_11= '\\u0426\\u0415\\u041B' ) | (enumLiteral_12= 'UNSIGNED INT' ) | (enumLiteral_13= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B' ) | (enumLiteral_14= 'LONG' ) | (enumLiteral_15= '\\u0414\\u0426\\u0415\\u041B' ) | (enumLiteral_16= 'UNSIGNED LONG' ) | (enumLiteral_17= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B' ) | (enumLiteral_18= 'LOG' ) | (enumLiteral_19= '\\u041B\\u041E\\u0413' ) )
            {
            // InternalReflexOld.g:4459:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= '\\u041F\\u0423\\u0421\\u0422\\u041E' ) | (enumLiteral_2= 'FLOAT' ) | (enumLiteral_3= '\\u041F\\u041B\\u0410\\u0412' ) | (enumLiteral_4= 'DOUBLE' ) | (enumLiteral_5= '\\u0414\\u041F\\u041B\\u0410\\u0412' ) | (enumLiteral_6= 'SHORT' ) | (enumLiteral_7= '\\u041A\\u0426\\u0415\\u041B' ) | (enumLiteral_8= 'UNSIGNED SHORT' ) | (enumLiteral_9= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B' ) | (enumLiteral_10= 'INT' ) | (enumLiteral_11= '\\u0426\\u0415\\u041B' ) | (enumLiteral_12= 'UNSIGNED INT' ) | (enumLiteral_13= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B' ) | (enumLiteral_14= 'LONG' ) | (enumLiteral_15= '\\u0414\\u0426\\u0415\\u041B' ) | (enumLiteral_16= 'UNSIGNED LONG' ) | (enumLiteral_17= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B' ) | (enumLiteral_18= 'LOG' ) | (enumLiteral_19= '\\u041B\\u041E\\u0413' ) )
            int alt87=20;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt87=1;
                }
                break;
            case 131:
                {
                alt87=2;
                }
                break;
            case 132:
                {
                alt87=3;
                }
                break;
            case 133:
                {
                alt87=4;
                }
                break;
            case 134:
                {
                alt87=5;
                }
                break;
            case 135:
                {
                alt87=6;
                }
                break;
            case 136:
                {
                alt87=7;
                }
                break;
            case 137:
                {
                alt87=8;
                }
                break;
            case 138:
                {
                alt87=9;
                }
                break;
            case 139:
                {
                alt87=10;
                }
                break;
            case 140:
                {
                alt87=11;
                }
                break;
            case 141:
                {
                alt87=12;
                }
                break;
            case 142:
                {
                alt87=13;
                }
                break;
            case 143:
                {
                alt87=14;
                }
                break;
            case 144:
                {
                alt87=15;
                }
                break;
            case 145:
                {
                alt87=16;
                }
                break;
            case 146:
                {
                alt87=17;
                }
                break;
            case 147:
                {
                alt87=18;
                }
                break;
            case 148:
                {
                alt87=19;
                }
                break;
            case 149:
                {
                alt87=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalReflexOld.g:4460:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalReflexOld.g:4460:3: (enumLiteral_0= 'VOID' )
                    // InternalReflexOld.g:4461:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getVOID_ENEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getVOID_ENEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReflexOld.g:4468:3: (enumLiteral_1= '\\u041F\\u0423\\u0421\\u0422\\u041E' )
                    {
                    // InternalReflexOld.g:4468:3: (enumLiteral_1= '\\u041F\\u0423\\u0421\\u0422\\u041E' )
                    // InternalReflexOld.g:4469:4: enumLiteral_1= '\\u041F\\u0423\\u0421\\u0422\\u041E'
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getVOID_RUEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getVOID_RUEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalReflexOld.g:4476:3: (enumLiteral_2= 'FLOAT' )
                    {
                    // InternalReflexOld.g:4476:3: (enumLiteral_2= 'FLOAT' )
                    // InternalReflexOld.g:4477:4: enumLiteral_2= 'FLOAT'
                    {
                    enumLiteral_2=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getFLOAT_ENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getFLOAT_ENEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalReflexOld.g:4484:3: (enumLiteral_3= '\\u041F\\u041B\\u0410\\u0412' )
                    {
                    // InternalReflexOld.g:4484:3: (enumLiteral_3= '\\u041F\\u041B\\u0410\\u0412' )
                    // InternalReflexOld.g:4485:4: enumLiteral_3= '\\u041F\\u041B\\u0410\\u0412'
                    {
                    enumLiteral_3=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getFLOAT_RUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFLOAT_RUEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalReflexOld.g:4492:3: (enumLiteral_4= 'DOUBLE' )
                    {
                    // InternalReflexOld.g:4492:3: (enumLiteral_4= 'DOUBLE' )
                    // InternalReflexOld.g:4493:4: enumLiteral_4= 'DOUBLE'
                    {
                    enumLiteral_4=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getDOUBLE_ENEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDOUBLE_ENEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalReflexOld.g:4500:3: (enumLiteral_5= '\\u0414\\u041F\\u041B\\u0410\\u0412' )
                    {
                    // InternalReflexOld.g:4500:3: (enumLiteral_5= '\\u0414\\u041F\\u041B\\u0410\\u0412' )
                    // InternalReflexOld.g:4501:4: enumLiteral_5= '\\u0414\\u041F\\u041B\\u0410\\u0412'
                    {
                    enumLiteral_5=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getDOUBLE_RUEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getDOUBLE_RUEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalReflexOld.g:4508:3: (enumLiteral_6= 'SHORT' )
                    {
                    // InternalReflexOld.g:4508:3: (enumLiteral_6= 'SHORT' )
                    // InternalReflexOld.g:4509:4: enumLiteral_6= 'SHORT'
                    {
                    enumLiteral_6=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getSHORT_ENEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getSHORT_ENEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalReflexOld.g:4516:3: (enumLiteral_7= '\\u041A\\u0426\\u0415\\u041B' )
                    {
                    // InternalReflexOld.g:4516:3: (enumLiteral_7= '\\u041A\\u0426\\u0415\\u041B' )
                    // InternalReflexOld.g:4517:4: enumLiteral_7= '\\u041A\\u0426\\u0415\\u041B'
                    {
                    enumLiteral_7=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getSHORT_RUEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getSHORT_RUEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalReflexOld.g:4524:3: (enumLiteral_8= 'UNSIGNED SHORT' )
                    {
                    // InternalReflexOld.g:4524:3: (enumLiteral_8= 'UNSIGNED SHORT' )
                    // InternalReflexOld.g:4525:4: enumLiteral_8= 'UNSIGNED SHORT'
                    {
                    enumLiteral_8=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getUSHORT_ENEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getUSHORT_ENEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalReflexOld.g:4532:3: (enumLiteral_9= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B' )
                    {
                    // InternalReflexOld.g:4532:3: (enumLiteral_9= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B' )
                    // InternalReflexOld.g:4533:4: enumLiteral_9= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u041A\\u0426\\u0415\\u041B'
                    {
                    enumLiteral_9=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getUSHORT_RUEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getTypeAccess().getUSHORT_RUEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalReflexOld.g:4540:3: (enumLiteral_10= 'INT' )
                    {
                    // InternalReflexOld.g:4540:3: (enumLiteral_10= 'INT' )
                    // InternalReflexOld.g:4541:4: enumLiteral_10= 'INT'
                    {
                    enumLiteral_10=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getINT_ENEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getTypeAccess().getINT_ENEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalReflexOld.g:4548:3: (enumLiteral_11= '\\u0426\\u0415\\u041B' )
                    {
                    // InternalReflexOld.g:4548:3: (enumLiteral_11= '\\u0426\\u0415\\u041B' )
                    // InternalReflexOld.g:4549:4: enumLiteral_11= '\\u0426\\u0415\\u041B'
                    {
                    enumLiteral_11=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getINT_RUEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getTypeAccess().getINT_RUEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalReflexOld.g:4556:3: (enumLiteral_12= 'UNSIGNED INT' )
                    {
                    // InternalReflexOld.g:4556:3: (enumLiteral_12= 'UNSIGNED INT' )
                    // InternalReflexOld.g:4557:4: enumLiteral_12= 'UNSIGNED INT'
                    {
                    enumLiteral_12=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getUINT_ENEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getTypeAccess().getUINT_ENEnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalReflexOld.g:4564:3: (enumLiteral_13= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B' )
                    {
                    // InternalReflexOld.g:4564:3: (enumLiteral_13= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B' )
                    // InternalReflexOld.g:4565:4: enumLiteral_13= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0426\\u0415\\u041B'
                    {
                    enumLiteral_13=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getUINT_RUEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getTypeAccess().getUINT_RUEnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalReflexOld.g:4572:3: (enumLiteral_14= 'LONG' )
                    {
                    // InternalReflexOld.g:4572:3: (enumLiteral_14= 'LONG' )
                    // InternalReflexOld.g:4573:4: enumLiteral_14= 'LONG'
                    {
                    enumLiteral_14=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getLONG_ENEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getTypeAccess().getLONG_ENEnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalReflexOld.g:4580:3: (enumLiteral_15= '\\u0414\\u0426\\u0415\\u041B' )
                    {
                    // InternalReflexOld.g:4580:3: (enumLiteral_15= '\\u0414\\u0426\\u0415\\u041B' )
                    // InternalReflexOld.g:4581:4: enumLiteral_15= '\\u0414\\u0426\\u0415\\u041B'
                    {
                    enumLiteral_15=(Token)match(input,145,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getLONG_RUEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getTypeAccess().getLONG_RUEnumLiteralDeclaration_15());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalReflexOld.g:4588:3: (enumLiteral_16= 'UNSIGNED LONG' )
                    {
                    // InternalReflexOld.g:4588:3: (enumLiteral_16= 'UNSIGNED LONG' )
                    // InternalReflexOld.g:4589:4: enumLiteral_16= 'UNSIGNED LONG'
                    {
                    enumLiteral_16=(Token)match(input,146,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getULONG_ENEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_16, grammarAccess.getTypeAccess().getULONG_ENEnumLiteralDeclaration_16());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalReflexOld.g:4596:3: (enumLiteral_17= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B' )
                    {
                    // InternalReflexOld.g:4596:3: (enumLiteral_17= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B' )
                    // InternalReflexOld.g:4597:4: enumLiteral_17= '\\u0411\\u0415\\u0417\\u0417\\u041D\\u0410\\u041A\\u041E\\u0412\\u041E\\u0415 \\u0414\\u0426\\u0415\\u041B'
                    {
                    enumLiteral_17=(Token)match(input,147,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getULONG_RUEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_17, grammarAccess.getTypeAccess().getULONG_RUEnumLiteralDeclaration_17());
                      			
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalReflexOld.g:4604:3: (enumLiteral_18= 'LOG' )
                    {
                    // InternalReflexOld.g:4604:3: (enumLiteral_18= 'LOG' )
                    // InternalReflexOld.g:4605:4: enumLiteral_18= 'LOG'
                    {
                    enumLiteral_18=(Token)match(input,148,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getBOOL_ENEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_18, grammarAccess.getTypeAccess().getBOOL_ENEnumLiteralDeclaration_18());
                      			
                    }

                    }


                    }
                    break;
                case 20 :
                    // InternalReflexOld.g:4612:3: (enumLiteral_19= '\\u041B\\u041E\\u0413' )
                    {
                    // InternalReflexOld.g:4612:3: (enumLiteral_19= '\\u041B\\u041E\\u0413' )
                    // InternalReflexOld.g:4613:4: enumLiteral_19= '\\u041B\\u041E\\u0413'
                    {
                    enumLiteral_19=(Token)match(input,149,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getBOOL_RUEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_19, grammarAccess.getTypeAccess().getBOOL_RUEnumLiteralDeclaration_19());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // $ANTLR start synpred1_InternalReflexOld
    public final void synpred1_InternalReflexOld_fragment() throws RecognitionException {   
        // InternalReflexOld.g:1857:5: ( ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' ) )
        // InternalReflexOld.g:1857:6: ( 'ELSE' | '\\u0418\\u041D\\u0410\\u0427\\u0415' )
        {
        if ( (input.LA(1)>=68 && input.LA(1)<=69) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalReflexOld

    // Delegated rules

    public final boolean synpred1_InternalReflexOld() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalReflexOld_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\u0082\24\4\1\57\2\uffff";
    static final String dfa_3s = "\1\u0095\24\4\1\65\2\uffff";
    static final String dfa_4s = "\26\uffff\1\2\1\1";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\4\26\2\uffff\1\27",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "621:3: (this_PhysicalVariable_0= rulePhysicalVariable | this_ProgramVariable_1= ruleProgramVariable )";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\4\5\uffff\1\50\1\51\7\uffff";
    static final String dfa_9s = "\1\166\5\uffff\1\127\1\130\7\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\10\1\11\1\12\1\13\1\14\1\7\1\6";
    static final String dfa_11s = "\17\uffff}>";
    static final String[] dfa_12s = {
            "\4\14\33\uffff\1\2\3\uffff\1\1\2\14\20\uffff\1\14\7\uffff\2\12\2\uffff\2\13\7\uffff\2\3\2\4\2\5\1\6\1\7\2\uffff\2\10\2\11\13\uffff\2\14\11\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "\1\16\56\uffff\1\15",
            "\1\16\56\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1562:2: ( ( () otherlv_1= ';' ) | this_CompoundStatement_2= ruleCompoundStatement | this_StartProcStat_3= ruleStartProcStat | this_StopProcStat_4= ruleStopProcStat | this_ErrorStat_5= ruleErrorStat | this_RestartStat_6= ruleRestartStat | this_ResetStat_7= ruleResetStat | this_LoopStat_8= ruleLoopStat | this_SetStateStat_9= ruleSetStateStat | this_IfElseStat_10= ruleIfElseStat | this_SwitchStat_11= ruleSwitchStat | (this_Expression_12= ruleExpression otherlv_13= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xF000031000000000L,0x0000000F00000003L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00003C1000000000L,0x0000000000000000L,0x00000000003FFFFCL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000C1000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x07000398000000F0L,0x007803001E7F80CCL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0300001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0018030000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0400000000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x04000388000000F0L,0x007803001E7F80CCL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000003FFFFCL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0800400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x04000388000000F2L,0x007803001E7F80CCL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x04000398000000F0L,0x007803001E7F80CCL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L,0x0000000000001B00L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x04000398000000F0L,0x007803001E7FE0CCL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x04000388000000F2L,0x007803001E7FE0CCL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000030000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000038000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C0000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0C000388000000F0L,0x007803001E7F80CCL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000090000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x000000F0001E0000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0780000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x1800000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0020000000000000L,0x0007FC0000000000L});

}