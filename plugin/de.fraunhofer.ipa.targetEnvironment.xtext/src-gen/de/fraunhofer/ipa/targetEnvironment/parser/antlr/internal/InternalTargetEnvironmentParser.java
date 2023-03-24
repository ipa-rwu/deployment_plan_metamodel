package de.fraunhofer.ipa.targetEnvironment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.targetEnvironment.services.TargetEnvironmentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetEnvironmentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "TargetDeployEnviroment", "ComputationDeviceType", "RefConnectionProperty", "ProcessorArchitecture", "ConfigDeviceProperty", "ComputationDevice", "ConfigConnection", "DeviceProperty", "Configuration", "ConnectDevice", "IncludeDevice", "RefConnection", "RefDeviceType", "AttributeKind", "SelectionKind", "Description", "DeviceType", "MaximumKind", "MinimumKind", "Properties", "RefDevice", "RangeKind", "Interface", "Ethernet", "Address", "Device", "X86_64", "Value", "Arm64", "Linux", "MacOS", "From", "Kind", "Name", "Type", "Wlan", "HyphenMinusHyphenMinusHyphenMinus", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=48;
    public static final int Configuration=13;
    public static final int Address=29;
    public static final int RULE_DATE_TIME=53;
    public static final int RULE_BOOLEAN=45;
    public static final int AttributeKind=18;
    public static final int RULE_YEAR=50;
    public static final int RefDeviceType=17;
    public static final int Name=38;
    public static final int RULE_MIN_SEC=52;
    public static final int Kind=37;
    public static final int ConnectDevice=14;
    public static final int X86_64=31;
    public static final int RULE_DEDENT=56;
    public static final int RULE_ID=57;
    public static final int Device=30;
    public static final int ConfigConnection=11;
    public static final int RULE_DIGIT=43;
    public static final int HyphenMinusHyphenMinusHyphenMinus=41;
    public static final int SelectionKind=19;
    public static final int DeviceType=21;
    public static final int TargetDeployEnviroment=5;
    public static final int DeviceProperty=12;
    public static final int Arm64=33;
    public static final int Linux=34;
    public static final int RULE_INT=58;
    public static final int ComputationDevice=10;
    public static final int Ethernet=28;
    public static final int Value=32;
    public static final int RULE_ML_COMMENT=60;
    public static final int MacOS=35;
    public static final int RefConnectionProperty=7;
    public static final int ConfigDeviceProperty=9;
    public static final int Description=20;
    public static final int ProcessorArchitecture=8;
    public static final int RULE_STRING=59;
    public static final int Wlan=40;
    public static final int Properties=24;
    public static final int RULE_SL_COMMENT=54;
    public static final int CommunicationConnection=4;
    public static final int HyphenMinus=42;
    public static final int RULE_DOUBLE=47;
    public static final int RULE_DECINT=46;
    public static final int MinimumKind=23;
    public static final int EOF=-1;
    public static final int RULE_INDENT=55;
    public static final int RULE_HOUR=51;
    public static final int RefDevice=25;
    public static final int RULE_WS=61;
    public static final int MaximumKind=22;
    public static final int From=36;
    public static final int RULE_ANY_OTHER=62;
    public static final int ComputationDeviceType=6;
    public static final int RangeKind=26;
    public static final int RefConnection=16;
    public static final int Type=39;
    public static final int RULE_MONTH=49;
    public static final int RULE_BINARY=44;
    public static final int IncludeDevice=15;
    public static final int Interface=27;

    // delegates
    // delegators


        public InternalTargetEnvironmentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTargetEnvironmentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalTargetEnvironmentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTargetEnvironmentParser.g"; }



        private TargetEnvironmentGrammarAccess grammarAccess;

        public InternalTargetEnvironmentParser(TokenStream input, TargetEnvironmentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
            return "TargetEnvironment";
        }

        @Override
        protected TargetEnvironmentGrammarAccess getGrammarAccess() {
            return grammarAccess;
        }




    // $ANTLR start "entryRuleTargetEnvironment"
    // InternalTargetEnvironmentParser.g:57:1: entryRuleTargetEnvironment returns [EObject current=null] : iv_ruleTargetEnvironment= ruleTargetEnvironment EOF ;
    public final EObject entryRuleTargetEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetEnvironment = null;


        try {
            // InternalTargetEnvironmentParser.g:57:58: (iv_ruleTargetEnvironment= ruleTargetEnvironment EOF )
            // InternalTargetEnvironmentParser.g:58:2: iv_ruleTargetEnvironment= ruleTargetEnvironment EOF
            {
             newCompositeNode(grammarAccess.getTargetEnvironmentRule());
            pushFollow(FOLLOW_1);
            iv_ruleTargetEnvironment=ruleTargetEnvironment();

            state._fsp--;

             current =iv_ruleTargetEnvironment;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleTargetEnvironment"


    // $ANTLR start "ruleTargetEnvironment"
    // InternalTargetEnvironmentParser.g:64:1: ruleTargetEnvironment returns [EObject current=null] : ( () ( (lv_type_1_0= ruleDescription ) ) ) ;
    public final EObject ruleTargetEnvironment() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:70:2: ( ( () ( (lv_type_1_0= ruleDescription ) ) ) )
            // InternalTargetEnvironmentParser.g:71:2: ( () ( (lv_type_1_0= ruleDescription ) ) )
            {
            // InternalTargetEnvironmentParser.g:71:2: ( () ( (lv_type_1_0= ruleDescription ) ) )
            // InternalTargetEnvironmentParser.g:72:3: () ( (lv_type_1_0= ruleDescription ) )
            {
            // InternalTargetEnvironmentParser.g:72:3: ()
            // InternalTargetEnvironmentParser.g:73:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getTargetEnvironmentAccess().getTargetEnvironmentAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:79:3: ( (lv_type_1_0= ruleDescription ) )
            // InternalTargetEnvironmentParser.g:80:4: (lv_type_1_0= ruleDescription )
            {
            // InternalTargetEnvironmentParser.g:80:4: (lv_type_1_0= ruleDescription )
            // InternalTargetEnvironmentParser.g:81:5: lv_type_1_0= ruleDescription
            {

                                newCompositeNode(grammarAccess.getTargetEnvironmentAccess().getTypeDescriptionParserRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleDescription();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getTargetEnvironmentRule());
                                }
                                add(
                                    current,
                                    "type",
                                    lv_type_1_0,
                                    "de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Description");
                                afterParserOrEnumRuleCall();


            }


            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetEnvironment"


    // $ANTLR start "entryRuleDescription"
    // InternalTargetEnvironmentParser.g:102:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalTargetEnvironmentParser.g:102:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalTargetEnvironmentParser.g:103:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule());
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalTargetEnvironmentParser.g:109:1: ruleDescription returns [EObject current=null] : (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceSet_0 = null;

        EObject this_TargetDeployEnviroment_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:115:2: ( (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment ) )
            // InternalTargetEnvironmentParser.g:116:2: (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment )
            {
            // InternalTargetEnvironmentParser.g:116:2: (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ComputationDeviceType||LA1_0==DeviceType) ) {
                alt1=1;
            }
            else if ( (LA1_0==TargetDeployEnviroment) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:117:3: this_DeviceSet_0= ruleDeviceSet
                    {

                                newCompositeNode(grammarAccess.getDescriptionAccess().getDeviceSetParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_DeviceSet_0=ruleDeviceSet();

                    state._fsp--;


                                current = this_DeviceSet_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:126:3: this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment
                    {

                                newCompositeNode(grammarAccess.getDescriptionAccess().getTargetDeployEnviromentParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_TargetDeployEnviroment_1=ruleTargetDeployEnviroment();

                    state._fsp--;


                                current = this_TargetDeployEnviroment_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTargetDeployEnviroment"
    // InternalTargetEnvironmentParser.g:138:1: entryRuleTargetDeployEnviroment returns [EObject current=null] : iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF ;
    public final EObject entryRuleTargetDeployEnviroment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetDeployEnviroment = null;


        try {
            // InternalTargetEnvironmentParser.g:138:63: (iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF )
            // InternalTargetEnvironmentParser.g:139:2: iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF
            {
             newCompositeNode(grammarAccess.getTargetDeployEnviromentRule());
            pushFollow(FOLLOW_1);
            iv_ruleTargetDeployEnviroment=ruleTargetDeployEnviroment();

            state._fsp--;

             current =iv_ruleTargetDeployEnviroment;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleTargetDeployEnviroment"


    // $ANTLR start "ruleTargetDeployEnviroment"
    // InternalTargetEnvironmentParser.g:145:1: ruleTargetDeployEnviroment returns [EObject current=null] : ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT ) ;
    public final EObject ruleTargetDeployEnviroment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_INDENT_6=null;
        Token otherlv_7=null;
        Token this_INDENT_8=null;
        Token this_DEDENT_10=null;
        Token otherlv_11=null;
        Token this_INDENT_12=null;
        Token this_DEDENT_14=null;
        Token this_DEDENT_15=null;
        Token otherlv_16=null;
        Token this_INDENT_17=null;
        Token this_DEDENT_19=null;
        Token this_DEDENT_20=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_includeDevice_9_0 = null;

        EObject lv_includeDevice_13_0 = null;

        EObject lv_configConnection_18_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:151:2: ( ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:152:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:152:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:153:3: () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:153:3: ()
            // InternalTargetEnvironmentParser.g:154:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,TargetDeployEnviroment,FOLLOW_3);

                        newLeafNode(otherlv_1, grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentKeyword_1());

            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_2, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_2());

            otherlv_3=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_3, grammarAccess.getTargetDeployEnviromentAccess().getNameKeyword_3());

            // InternalTargetEnvironmentParser.g:172:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:173:4: (lv_name_4_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:173:4: (lv_name_4_0= ruleEString )
            // InternalTargetEnvironmentParser.g:174:5: lv_name_4_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getNameEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_4_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:191:3: (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IncludeDevice) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:192:4: otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,IncludeDevice,FOLLOW_3);

                                    newLeafNode(otherlv_5, grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_6, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_1());

                    otherlv_7=(Token)match(input,ComputationDevice,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getTargetDeployEnviromentAccess().getComputationDeviceKeyword_5_2());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_8, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_3());

                    // InternalTargetEnvironmentParser.g:208:4: ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==HyphenMinus) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:209:5: (lv_includeDevice_9_0= ruleComputationDeviceInstance )
                            {
                            // InternalTargetEnvironmentParser.g:209:5: (lv_includeDevice_9_0= ruleComputationDeviceInstance )
                            // InternalTargetEnvironmentParser.g:210:6: lv_includeDevice_9_0= ruleComputationDeviceInstance
                            {

                                                    newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceComputationDeviceInstanceParserRuleCall_5_4_0());

                            pushFollow(FOLLOW_9);
                            lv_includeDevice_9_0=ruleComputationDeviceInstance();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                                                    }
                                                    add(
                                                        current,
                                                        "includeDevice",
                                                        lv_includeDevice_9_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ComputationDeviceInstance");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_5());

                    otherlv_11=(Token)match(input,Device,FOLLOW_3);

                                    newLeafNode(otherlv_11, grammarAccess.getTargetDeployEnviromentAccess().getDeviceKeyword_5_6());

                    this_INDENT_12=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_12, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_7());

                    // InternalTargetEnvironmentParser.g:239:4: ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==HyphenMinus) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:240:5: (lv_includeDevice_13_0= ruleDeviceInstance )
                            {
                            // InternalTargetEnvironmentParser.g:240:5: (lv_includeDevice_13_0= ruleDeviceInstance )
                            // InternalTargetEnvironmentParser.g:241:6: lv_includeDevice_13_0= ruleDeviceInstance
                            {

                                                    newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceDeviceInstanceParserRuleCall_5_8_0());

                            pushFollow(FOLLOW_9);
                            lv_includeDevice_13_0=ruleDeviceInstance();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                                                    }
                                                    add(
                                                        current,
                                                        "includeDevice",
                                                        lv_includeDevice_13_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.DeviceInstance");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_9());

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_12);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_10());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:267:3: (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ConfigConnection) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:268:4: otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT
                    {
                    otherlv_16=(Token)match(input,ConfigConnection,FOLLOW_3);

                                    newLeafNode(otherlv_16, grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionKeyword_6_0());

                    this_INDENT_17=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_17, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:276:4: ( (lv_configConnection_18_0= ruleConfigConnection ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==HyphenMinus) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:277:5: (lv_configConnection_18_0= ruleConfigConnection )
                            {
                            // InternalTargetEnvironmentParser.g:277:5: (lv_configConnection_18_0= ruleConfigConnection )
                            // InternalTargetEnvironmentParser.g:278:6: lv_configConnection_18_0= ruleConfigConnection
                            {

                                                    newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionConfigConnectionParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_9);
                            lv_configConnection_18_0=ruleConfigConnection();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                                                    }
                                                    add(
                                                        current,
                                                        "configConnection",
                                                        lv_configConnection_18_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConfigConnection");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    this_DEDENT_19=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_19, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_20=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_20, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_7());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetDeployEnviroment"


    // $ANTLR start "entryRuleDeviceInstance"
    // InternalTargetEnvironmentParser.g:308:1: entryRuleDeviceInstance returns [EObject current=null] : iv_ruleDeviceInstance= ruleDeviceInstance EOF ;
    public final EObject entryRuleDeviceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceInstance = null;


        try {
            // InternalTargetEnvironmentParser.g:308:55: (iv_ruleDeviceInstance= ruleDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:309:2: iv_ruleDeviceInstance= ruleDeviceInstance EOF
            {
             newCompositeNode(grammarAccess.getDeviceInstanceRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeviceInstance=ruleDeviceInstance();

            state._fsp--;

             current =iv_ruleDeviceInstance;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleDeviceInstance"


    // $ANTLR start "ruleDeviceInstance"
    // InternalTargetEnvironmentParser.g:315:1: ruleDeviceInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleDeviceInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_INDENT_7=null;
        Token this_DEDENT_9=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_configDeviceProperty_8_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:321:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:322:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:322:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:323:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getDeviceInstanceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getDeviceInstanceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:334:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:335:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:335:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:336:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceInstanceAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeviceInstanceRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_13);

                        newLeafNode(this_INDENT_3, grammarAccess.getDeviceInstanceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,RefDeviceType,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeKeyword_4());

            // InternalTargetEnvironmentParser.g:361:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:362:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:362:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:363:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getDeviceInstanceRule());
                                }


                                newCompositeNode(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeCrossReference_5_0());

            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:377:3: (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ConfigDeviceProperty) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:378:4: otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,ConfigDeviceProperty,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getDeviceInstanceAccess().getConfigDevicePropertyKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_7, grammarAccess.getDeviceInstanceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:386:4: ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==HyphenMinus) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:387:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                            {
                            // InternalTargetEnvironmentParser.g:387:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                            // InternalTargetEnvironmentParser.g:388:6: lv_configDeviceProperty_8_0= ruleConfigDeviceProperty
                            {

                                                    newCompositeNode(grammarAccess.getDeviceInstanceAccess().getConfigDevicePropertyConfigDevicePropertyParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_9);
                            lv_configDeviceProperty_8_0=ruleConfigDeviceProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getDeviceInstanceRule());
                                                    }
                                                    add(
                                                        current,
                                                        "configDeviceProperty",
                                                        lv_configDeviceProperty_8_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConfigDeviceProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_9, grammarAccess.getDeviceInstanceAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_10, grammarAccess.getDeviceInstanceAccess().getDEDENTTerminalRuleCall_7());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceInstance"


    // $ANTLR start "entryRuleComputationDeviceInstance"
    // InternalTargetEnvironmentParser.g:418:1: entryRuleComputationDeviceInstance returns [EObject current=null] : iv_ruleComputationDeviceInstance= ruleComputationDeviceInstance EOF ;
    public final EObject entryRuleComputationDeviceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceInstance = null;


        try {
            // InternalTargetEnvironmentParser.g:418:66: (iv_ruleComputationDeviceInstance= ruleComputationDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:419:2: iv_ruleComputationDeviceInstance= ruleComputationDeviceInstance EOF
            {
             newCompositeNode(grammarAccess.getComputationDeviceInstanceRule());
            pushFollow(FOLLOW_1);
            iv_ruleComputationDeviceInstance=ruleComputationDeviceInstance();

            state._fsp--;

             current =iv_ruleComputationDeviceInstance;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleComputationDeviceInstance"


    // $ANTLR start "ruleComputationDeviceInstance"
    // InternalTargetEnvironmentParser.g:425:1: ruleComputationDeviceInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleComputationDeviceInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:431:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:432:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:432:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:433:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getComputationDeviceInstanceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getComputationDeviceInstanceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:444:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:445:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:445:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:446:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getComputationDeviceInstanceAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getComputationDeviceInstanceRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_13);

                        newLeafNode(this_INDENT_3, grammarAccess.getComputationDeviceInstanceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,RefDeviceType,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getComputationDeviceInstanceAccess().getRefDeviceTypeKeyword_4());

            // InternalTargetEnvironmentParser.g:471:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:472:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:472:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:473:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getComputationDeviceInstanceRule());
                                }


                                newCompositeNode(grammarAccess.getComputationDeviceInstanceAccess().getRefDeviceTypeComputationDeviceTypeCrossReference_5_0());

            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_6, grammarAccess.getComputationDeviceInstanceAccess().getDEDENTTerminalRuleCall_6());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComputationDeviceInstance"


    // $ANTLR start "entryRuleConfigConnection"
    // InternalTargetEnvironmentParser.g:495:1: entryRuleConfigConnection returns [EObject current=null] : iv_ruleConfigConnection= ruleConfigConnection EOF ;
    public final EObject entryRuleConfigConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:495:57: (iv_ruleConfigConnection= ruleConfigConnection EOF )
            // InternalTargetEnvironmentParser.g:496:2: iv_ruleConfigConnection= ruleConfigConnection EOF
            {
             newCompositeNode(grammarAccess.getConfigConnectionRule());
            pushFollow(FOLLOW_1);
            iv_ruleConfigConnection=ruleConfigConnection();

            state._fsp--;

             current =iv_ruleConfigConnection;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleConfigConnection"


    // $ANTLR start "ruleConfigConnection"
    // InternalTargetEnvironmentParser.g:502:1: ruleConfigConnection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) ;
    public final EObject ruleConfigConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_INDENT_5=null;
        Token this_DEDENT_7=null;
        Token this_DEDENT_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_connectDevice_6_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:508:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:509:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:509:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:510:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getConfigConnectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConfigConnectionAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:521:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:522:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:522:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:523:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getConfigConnectionAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_15);

                        newLeafNode(this_INDENT_3, grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,ConnectDevice,FOLLOW_3);

                        newLeafNode(otherlv_4, grammarAccess.getConfigConnectionAccess().getConnectDeviceKeyword_4());

            this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_5, grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_5());

            // InternalTargetEnvironmentParser.g:552:3: ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==HyphenMinus) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:553:4: (lv_connectDevice_6_0= ruleConnectedDevice )
                    {
                    // InternalTargetEnvironmentParser.g:553:4: (lv_connectDevice_6_0= ruleConnectedDevice )
                    // InternalTargetEnvironmentParser.g:554:5: lv_connectDevice_6_0= ruleConnectedDevice
                    {

                                        newCompositeNode(grammarAccess.getConfigConnectionAccess().getConnectDeviceConnectedDeviceParserRuleCall_6_0());

                    pushFollow(FOLLOW_9);
                    lv_connectDevice_6_0=ruleConnectedDevice();

                    state._fsp--;


                                        if (current==null) {
                                            current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
                                        }
                                        add(
                                            current,
                                            "connectDevice",
                                            lv_connectDevice_6_0,
                                            "de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConnectedDevice");
                                        afterParserOrEnumRuleCall();


                    }


                    }
                    break;

                default :
                    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                        newLeafNode(this_DEDENT_7, grammarAccess.getConfigConnectionAccess().getDEDENTTerminalRuleCall_7());

            this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_8, grammarAccess.getConfigConnectionAccess().getDEDENTTerminalRuleCall_8());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigConnection"


    // $ANTLR start "entryRuleConnectedDevice"
    // InternalTargetEnvironmentParser.g:583:1: entryRuleConnectedDevice returns [EObject current=null] : iv_ruleConnectedDevice= ruleConnectedDevice EOF ;
    public final EObject entryRuleConnectedDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectedDevice = null;


        try {
            // InternalTargetEnvironmentParser.g:583:56: (iv_ruleConnectedDevice= ruleConnectedDevice EOF )
            // InternalTargetEnvironmentParser.g:584:2: iv_ruleConnectedDevice= ruleConnectedDevice EOF
            {
             newCompositeNode(grammarAccess.getConnectedDeviceRule());
            pushFollow(FOLLOW_1);
            iv_ruleConnectedDevice=ruleConnectedDevice();

            state._fsp--;

             current =iv_ruleConnectedDevice;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleConnectedDevice"


    // $ANTLR start "ruleConnectedDevice"
    // InternalTargetEnvironmentParser.g:590:1: ruleConnectedDevice returns [EObject current=null] : ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleConnectedDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_INDENT_7=null;
        Token this_DEDENT_9=null;
        Token this_DEDENT_10=null;
        EObject lv_properties_8_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:596:2: ( ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:597:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:597:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:598:3: rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_16);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,RefDevice,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConnectedDeviceAccess().getRefDeviceKeyword_1());

            // InternalTargetEnvironmentParser.g:609:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:610:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:610:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:611:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConnectedDeviceRule());
                                }


                                newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefDeviceAbstractDeviceInstanceCrossReference_2_0());

            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_17);

                        newLeafNode(this_INDENT_3, grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,RefConnection,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getConnectedDeviceAccess().getRefConnectionKeyword_4());

            // InternalTargetEnvironmentParser.g:633:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:634:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:634:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:635:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConnectedDeviceRule());
                                }


                                newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefConnectionCommunicationConnectionCrossReference_5_0());

            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:649:3: (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Configuration) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:650:4: otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Configuration,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getConnectedDeviceAccess().getConfigurationKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_7, grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:658:4: ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==HyphenMinus) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:659:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                            {
                            // InternalTargetEnvironmentParser.g:659:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                            // InternalTargetEnvironmentParser.g:660:6: lv_properties_8_0= ruleConfigConnectionProperty
                            {

                                                    newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPropertiesConfigConnectionPropertyParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_9);
                            lv_properties_8_0=ruleConfigConnectionProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getConnectedDeviceRule());
                                                    }
                                                    add(
                                                        current,
                                                        "properties",
                                                        lv_properties_8_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConfigConnectionProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_9, grammarAccess.getConnectedDeviceAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_10, grammarAccess.getConnectedDeviceAccess().getDEDENTTerminalRuleCall_7());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectedDevice"


    // $ANTLR start "entryRuleConfigConnectionProperty"
    // InternalTargetEnvironmentParser.g:690:1: entryRuleConfigConnectionProperty returns [EObject current=null] : iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF ;
    public final EObject entryRuleConfigConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:690:65: (iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:691:2: iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF
            {
             newCompositeNode(grammarAccess.getConfigConnectionPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleConfigConnectionProperty=ruleConfigConnectionProperty();

            state._fsp--;

             current =iv_ruleConfigConnectionProperty;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleConfigConnectionProperty"


    // $ANTLR start "ruleConfigConnectionProperty"
    // InternalTargetEnvironmentParser.g:697:1: ruleConfigConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
    public final EObject ruleConfigConnectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_DEDENT_9=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_value_8_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:703:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:704:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:704:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:705:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:705:3: ()
            // InternalTargetEnvironmentParser.g:706:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigConnectionPropertyAccess().getConfigConnectionPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getConfigConnectionPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:723:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:724:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:724:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:725:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getConfigConnectionPropertyRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_19);

                        newLeafNode(this_INDENT_4, grammarAccess.getConfigConnectionPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,RefConnectionProperty,FOLLOW_5);

                        newLeafNode(otherlv_5, grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyKeyword_5());

            // InternalTargetEnvironmentParser.g:750:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:751:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:751:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:752:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigConnectionPropertyRule());
                                }


                                newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyConnectionPropertyCrossReference_6_0());

            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:766:3: (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Value) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:767:4: otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) )
                    {
                    otherlv_7=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_7, grammarAccess.getConfigConnectionPropertyAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:771:4: ( (lv_value_8_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:772:5: (lv_value_8_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:772:5: (lv_value_8_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:773:6: lv_value_8_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_8_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getConfigConnectionPropertyRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_8_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_9, grammarAccess.getConfigConnectionPropertyAccess().getDEDENTTerminalRuleCall_8());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigConnectionProperty"


    // $ANTLR start "entryRuleConfigDeviceProperty"
    // InternalTargetEnvironmentParser.g:799:1: entryRuleConfigDeviceProperty returns [EObject current=null] : iv_ruleConfigDeviceProperty= ruleConfigDeviceProperty EOF ;
    public final EObject entryRuleConfigDeviceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigDeviceProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:799:61: (iv_ruleConfigDeviceProperty= ruleConfigDeviceProperty EOF )
            // InternalTargetEnvironmentParser.g:800:2: iv_ruleConfigDeviceProperty= ruleConfigDeviceProperty EOF
            {
             newCompositeNode(grammarAccess.getConfigDevicePropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleConfigDeviceProperty=ruleConfigDeviceProperty();

            state._fsp--;

             current =iv_ruleConfigDeviceProperty;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleConfigDeviceProperty"


    // $ANTLR start "ruleConfigDeviceProperty"
    // InternalTargetEnvironmentParser.g:806:1: ruleConfigDeviceProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT ) ;
    public final EObject ruleConfigDeviceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_DEDENT_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_value_7_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:812:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:813:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:813:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:814:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getConfigDevicePropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConfigDevicePropertyAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:825:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:826:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:826:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:827:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getConfigDevicePropertyAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getConfigDevicePropertyRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_22);

                        newLeafNode(this_INDENT_3, grammarAccess.getConfigDevicePropertyAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,From,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getConfigDevicePropertyAccess().getFromKeyword_4());

            // InternalTargetEnvironmentParser.g:852:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:853:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:853:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:854:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigDevicePropertyRule());
                                }


                                newCompositeNode(grammarAccess.getConfigDevicePropertyAccess().getFromDevicePropertyCrossReference_5_0());

            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_6=(Token)match(input,Value,FOLLOW_21);

                        newLeafNode(otherlv_6, grammarAccess.getConfigDevicePropertyAccess().getValueKeyword_6());

            // InternalTargetEnvironmentParser.g:872:3: ( (lv_value_7_0= rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:873:4: (lv_value_7_0= rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:873:4: (lv_value_7_0= rulePropertyValue )
            // InternalTargetEnvironmentParser.g:874:5: lv_value_7_0= rulePropertyValue
            {

                                newCompositeNode(grammarAccess.getConfigDevicePropertyAccess().getValuePropertyValueParserRuleCall_7_0());

            pushFollow(FOLLOW_11);
            lv_value_7_0=rulePropertyValue();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getConfigDevicePropertyRule());
                                }
                                set(
                                    current,
                                    "value",
                                    lv_value_7_0,
                                    "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                afterParserOrEnumRuleCall();


            }


            }

            this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_8, grammarAccess.getConfigDevicePropertyAccess().getDEDENTTerminalRuleCall_8());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigDeviceProperty"


    // $ANTLR start "entryRuleDeviceSet"
    // InternalTargetEnvironmentParser.g:899:1: entryRuleDeviceSet returns [EObject current=null] : iv_ruleDeviceSet= ruleDeviceSet EOF ;
    public final EObject entryRuleDeviceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceSet = null;


        try {
            // InternalTargetEnvironmentParser.g:899:50: (iv_ruleDeviceSet= ruleDeviceSet EOF )
            // InternalTargetEnvironmentParser.g:900:2: iv_ruleDeviceSet= ruleDeviceSet EOF
            {
             newCompositeNode(grammarAccess.getDeviceSetRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeviceSet=ruleDeviceSet();

            state._fsp--;

             current =iv_ruleDeviceSet;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleDeviceSet"


    // $ANTLR start "ruleDeviceSet"
    // InternalTargetEnvironmentParser.g:906:1: ruleDeviceSet returns [EObject current=null] : ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* ) ;
    public final EObject ruleDeviceSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_device_0_0 = null;

        EObject lv_device_2_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:912:2: ( ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* ) )
            // InternalTargetEnvironmentParser.g:913:2: ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* )
            {
            // InternalTargetEnvironmentParser.g:913:2: ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* )
            // InternalTargetEnvironmentParser.g:914:3: ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )*
            {
            // InternalTargetEnvironmentParser.g:914:3: ( (lv_device_0_0= ruleDeviceType ) )
            // InternalTargetEnvironmentParser.g:915:4: (lv_device_0_0= ruleDeviceType )
            {
            // InternalTargetEnvironmentParser.g:915:4: (lv_device_0_0= ruleDeviceType )
            // InternalTargetEnvironmentParser.g:916:5: lv_device_0_0= ruleDeviceType
            {

                                newCompositeNode(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_0_0());

            pushFollow(FOLLOW_24);
            lv_device_0_0=ruleDeviceType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeviceSetRule());
                                }
                                add(
                                    current,
                                    "device",
                                    lv_device_0_0,
                                    "de.fraunhofer.ipa.targetEnvironment.Device.DeviceType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:933:3: (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==HyphenMinusHyphenMinusHyphenMinus) ) {
                    alt13=1;
                }


                switch (alt13) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:934:4: otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) )
                    {
                    otherlv_1=(Token)match(input,HyphenMinusHyphenMinusHyphenMinus,FOLLOW_25);

                                    newLeafNode(otherlv_1, grammarAccess.getDeviceSetAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_1_0());

                    // InternalTargetEnvironmentParser.g:938:4: ( (lv_device_2_0= ruleDeviceType ) )
                    // InternalTargetEnvironmentParser.g:939:5: (lv_device_2_0= ruleDeviceType )
                    {
                    // InternalTargetEnvironmentParser.g:939:5: (lv_device_2_0= ruleDeviceType )
                    // InternalTargetEnvironmentParser.g:940:6: lv_device_2_0= ruleDeviceType
                    {

                                            newCompositeNode(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_1_1_0());

                    pushFollow(FOLLOW_24);
                    lv_device_2_0=ruleDeviceType();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getDeviceSetRule());
                                            }
                                            add(
                                                current,
                                                "device",
                                                lv_device_2_0,
                                                "de.fraunhofer.ipa.targetEnvironment.Device.DeviceType");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

                default :
                    break loop13;
                }
            } while (true);


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceSet"


    // $ANTLR start "entryRuleDeviceType"
    // InternalTargetEnvironmentParser.g:962:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalTargetEnvironmentParser.g:962:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalTargetEnvironmentParser.g:963:2: iv_ruleDeviceType= ruleDeviceType EOF
            {
             newCompositeNode(grammarAccess.getDeviceTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeviceType=ruleDeviceType();

            state._fsp--;

             current =iv_ruleDeviceType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleDeviceType"


    // $ANTLR start "ruleDeviceType"
    // InternalTargetEnvironmentParser.g:969:1: ruleDeviceType returns [EObject current=null] : (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceType_Impl_0 = null;

        EObject this_ComputationDeviceType_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:975:2: ( (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) )
            // InternalTargetEnvironmentParser.g:976:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            {
            // InternalTargetEnvironmentParser.g:976:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DeviceType) ) {
                alt14=1;
            }
            else if ( (LA14_0==ComputationDeviceType) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:977:3: this_DeviceType_Impl_0= ruleDeviceType_Impl
                    {

                                newCompositeNode(grammarAccess.getDeviceTypeAccess().getDeviceType_ImplParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_DeviceType_Impl_0=ruleDeviceType_Impl();

                    state._fsp--;


                                current = this_DeviceType_Impl_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:986:3: this_ComputationDeviceType_1= ruleComputationDeviceType
                    {

                                newCompositeNode(grammarAccess.getDeviceTypeAccess().getComputationDeviceTypeParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_ComputationDeviceType_1=ruleComputationDeviceType();

                    state._fsp--;


                                current = this_ComputationDeviceType_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "entryRuleAbstractCommunicationConnection"
    // InternalTargetEnvironmentParser.g:998:1: entryRuleAbstractCommunicationConnection returns [EObject current=null] : iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF ;
    public final EObject entryRuleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommunicationConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:998:72: (iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:999:2: iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF
            {
             newCompositeNode(grammarAccess.getAbstractCommunicationConnectionRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractCommunicationConnection=ruleAbstractCommunicationConnection();

            state._fsp--;

             current =iv_ruleAbstractCommunicationConnection;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleAbstractCommunicationConnection"


    // $ANTLR start "ruleAbstractCommunicationConnection"
    // InternalTargetEnvironmentParser.g:1005:1: ruleAbstractCommunicationConnection returns [EObject current=null] : (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) ;
    public final EObject ruleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationConnection_0 = null;

        EObject this_NetworkConnection_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1011:2: ( (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) )
            // InternalTargetEnvironmentParser.g:1012:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            {
            // InternalTargetEnvironmentParser.g:1012:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==HyphenMinus) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==Name) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==RULE_STRING) ) {
                        int LA15_3 = input.LA(4);

                        if ( (LA15_3==RULE_INDENT) ) {
                            int LA15_5 = input.LA(5);

                            if ( (LA15_5==Type) ) {
                                int LA15_6 = input.LA(6);

                                if ( (LA15_6==RULE_ID||LA15_6==RULE_STRING) ) {
                                    alt15=1;
                                }
                                else if ( (LA15_6==Ethernet||LA15_6==Wlan) ) {
                                    alt15=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA15_2==RULE_ID) ) {
                        int LA15_4 = input.LA(4);

                        if ( (LA15_4==RULE_INDENT) ) {
                            int LA15_5 = input.LA(5);

                            if ( (LA15_5==Type) ) {
                                int LA15_6 = input.LA(6);

                                if ( (LA15_6==RULE_ID||LA15_6==RULE_STRING) ) {
                                    alt15=1;
                                }
                                else if ( (LA15_6==Ethernet||LA15_6==Wlan) ) {
                                    alt15=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1013:3: this_CommunicationConnection_0= ruleCommunicationConnection
                    {

                                newCompositeNode(grammarAccess.getAbstractCommunicationConnectionAccess().getCommunicationConnectionParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_CommunicationConnection_0=ruleCommunicationConnection();

                    state._fsp--;


                                current = this_CommunicationConnection_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:1022:3: this_NetworkConnection_1= ruleNetworkConnection
                    {

                                newCompositeNode(grammarAccess.getAbstractCommunicationConnectionAccess().getNetworkConnectionParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_NetworkConnection_1=ruleNetworkConnection();

                    state._fsp--;


                                current = this_NetworkConnection_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractCommunicationConnection"


    // $ANTLR start "entryRuleAbstractNetworkProperty"
    // InternalTargetEnvironmentParser.g:1034:1: entryRuleAbstractNetworkProperty returns [EObject current=null] : iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF ;
    public final EObject entryRuleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1034:64: (iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1035:2: iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getAbstractNetworkPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractNetworkProperty=ruleAbstractNetworkProperty();

            state._fsp--;

             current =iv_ruleAbstractNetworkProperty;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleAbstractNetworkProperty"


    // $ANTLR start "ruleAbstractNetworkProperty"
    // InternalTargetEnvironmentParser.g:1041:1: ruleAbstractNetworkProperty returns [EObject current=null] : (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) ;
    public final EObject ruleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceNetworkProperty_0 = null;

        EObject this_AddressNetworkProperty_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1047:2: ( (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) )
            // InternalTargetEnvironmentParser.g:1048:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            {
            // InternalTargetEnvironmentParser.g:1048:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==HyphenMinus) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==Name) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==Address) ) {
                        alt16=2;
                    }
                    else if ( (LA16_2==Interface) ) {
                        alt16=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1049:3: this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty
                    {

                                newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getInterfaceNetworkPropertyParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_InterfaceNetworkProperty_0=ruleInterfaceNetworkProperty();

                    state._fsp--;


                                current = this_InterfaceNetworkProperty_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:1058:3: this_AddressNetworkProperty_1= ruleAddressNetworkProperty
                    {

                                newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getAddressNetworkPropertyParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_AddressNetworkProperty_1=ruleAddressNetworkProperty();

                    state._fsp--;


                                current = this_AddressNetworkProperty_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractNetworkProperty"


    // $ANTLR start "entryRuleInterfaceNetworkProperty"
    // InternalTargetEnvironmentParser.g:1070:1: entryRuleInterfaceNetworkProperty returns [EObject current=null] : iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF ;
    public final EObject entryRuleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1070:65: (iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1071:2: iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getInterfaceNetworkPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceNetworkProperty=ruleInterfaceNetworkProperty();

            state._fsp--;

             current =iv_ruleInterfaceNetworkProperty;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleInterfaceNetworkProperty"


    // $ANTLR start "ruleInterfaceNetworkProperty"
    // InternalTargetEnvironmentParser.g:1077:1: ruleInterfaceNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_DEDENT_11=null;
        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_10_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1083:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1084:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1084:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1085:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1085:3: ()
            // InternalTargetEnvironmentParser.g:1086:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_26);

                        newLeafNode(otherlv_2, grammarAccess.getInterfaceNetworkPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1103:3: ( (lv_name_3_0= Interface ) )
            // InternalTargetEnvironmentParser.g:1104:4: (lv_name_3_0= Interface )
            {
            // InternalTargetEnvironmentParser.g:1104:4: (lv_name_3_0= Interface )
            // InternalTargetEnvironmentParser.g:1105:5: lv_name_3_0= Interface
            {
            lv_name_3_0=(Token)match(input,Interface,FOLLOW_3);

                                newLeafNode(lv_name_3_0, grammarAccess.getInterfaceNetworkPropertyAccess().getNameInterfaceKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getInterfaceNetworkPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "interface");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_4, grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_5, grammarAccess.getInterfaceNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1125:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1126:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1126:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1127:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getInterfaceNetworkPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1144:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Description) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1145:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1149:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1150:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1150:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1151:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getInterfaceNetworkPropertyRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_8_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1169:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Value) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1170:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1174:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1175:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1175:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1176:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getInterfaceNetworkPropertyRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_10_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceNetworkProperty"


    // $ANTLR start "entryRuleAddressNetworkProperty"
    // InternalTargetEnvironmentParser.g:1202:1: entryRuleAddressNetworkProperty returns [EObject current=null] : iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF ;
    public final EObject entryRuleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1202:63: (iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1203:2: iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getAddressNetworkPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleAddressNetworkProperty=ruleAddressNetworkProperty();

            state._fsp--;

             current =iv_ruleAddressNetworkProperty;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleAddressNetworkProperty"


    // $ANTLR start "ruleAddressNetworkProperty"
    // InternalTargetEnvironmentParser.g:1209:1: ruleAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_DEDENT_11=null;
        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_10_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1215:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1216:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1216:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1217:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1217:3: ()
            // InternalTargetEnvironmentParser.g:1218:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_30);

                        newLeafNode(otherlv_2, grammarAccess.getAddressNetworkPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1235:3: ( (lv_name_3_0= Address ) )
            // InternalTargetEnvironmentParser.g:1236:4: (lv_name_3_0= Address )
            {
            // InternalTargetEnvironmentParser.g:1236:4: (lv_name_3_0= Address )
            // InternalTargetEnvironmentParser.g:1237:5: lv_name_3_0= Address
            {
            lv_name_3_0=(Token)match(input,Address,FOLLOW_3);

                                newLeafNode(lv_name_3_0, grammarAccess.getAddressNetworkPropertyAccess().getNameAddressKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getAddressNetworkPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "address");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_4, grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_5, grammarAccess.getAddressNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1257:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1258:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1258:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1259:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getAddressNetworkPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1276:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Description) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1277:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1281:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1282:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1282:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1283:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getAddressNetworkPropertyRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_8_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1301:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Value) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1302:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1306:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1307:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1307:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1308:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getAddressNetworkPropertyRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_10_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressNetworkProperty"


    // $ANTLR start "entryRuleDeviceType_Impl"
    // InternalTargetEnvironmentParser.g:1334:1: entryRuleDeviceType_Impl returns [EObject current=null] : iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF ;
    public final EObject entryRuleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType_Impl = null;


        try {
            // InternalTargetEnvironmentParser.g:1334:56: (iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF )
            // InternalTargetEnvironmentParser.g:1335:2: iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF
            {
             newCompositeNode(grammarAccess.getDeviceType_ImplRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeviceType_Impl=ruleDeviceType_Impl();

            state._fsp--;

             current =iv_ruleDeviceType_Impl;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleDeviceType_Impl"


    // $ANTLR start "ruleDeviceType_Impl"
    // InternalTargetEnvironmentParser.g:1341:1: ruleDeviceType_Impl returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
    public final EObject ruleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_INDENT_6=null;
        Token this_DEDENT_8=null;
        Token otherlv_9=null;
        Token this_INDENT_10=null;
        Token this_DEDENT_12=null;
        Token this_DEDENT_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_deviceProperty_7_0 = null;

        EObject lv_communicationConnection_11_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1347:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1348:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1348:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1349:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1349:3: ()
            // InternalTargetEnvironmentParser.g:1350:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,DeviceType,FOLLOW_3);

                        newLeafNode(otherlv_1, grammarAccess.getDeviceType_ImplAccess().getDeviceTypeKeyword_1());

            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_2, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_2());

            otherlv_3=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_3, grammarAccess.getDeviceType_ImplAccess().getNameKeyword_3());

            // InternalTargetEnvironmentParser.g:1368:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1369:4: (lv_name_4_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1369:4: (lv_name_4_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1370:5: lv_name_4_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getNameEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_31);
            lv_name_4_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeviceType_ImplRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_4_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1387:3: (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==DeviceProperty) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1388:4: otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,DeviceProperty,FOLLOW_3);

                                    newLeafNode(otherlv_5, grammarAccess.getDeviceType_ImplAccess().getDevicePropertyKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_6, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalTargetEnvironmentParser.g:1396:4: ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==HyphenMinus) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:1397:5: (lv_deviceProperty_7_0= ruleDeviceProperty )
                            {
                            // InternalTargetEnvironmentParser.g:1397:5: (lv_deviceProperty_7_0= ruleDeviceProperty )
                            // InternalTargetEnvironmentParser.g:1398:6: lv_deviceProperty_7_0= ruleDeviceProperty
                            {

                                                    newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyDevicePropertyParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_9);
                            lv_deviceProperty_7_0=ruleDeviceProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getDeviceType_ImplRule());
                                                    }
                                                    add(
                                                        current,
                                                        "deviceProperty",
                                                        lv_deviceProperty_7_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.DeviceProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_32);

                                    newLeafNode(this_DEDENT_8, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1420:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==CommunicationConnection) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1421:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_10, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:1429:4: ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==HyphenMinus) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:1430:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                            {
                            // InternalTargetEnvironmentParser.g:1430:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                            // InternalTargetEnvironmentParser.g:1431:6: lv_communicationConnection_11_0= ruleAbstractCommunicationConnection
                            {

                                                    newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_9);
                            lv_communicationConnection_11_0=ruleAbstractCommunicationConnection();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getDeviceType_ImplRule());
                                                    }
                                                    add(
                                                        current,
                                                        "communicationConnection",
                                                        lv_communicationConnection_11_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstractCommunicationConnection");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_12, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_13, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_7());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceType_Impl"


    // $ANTLR start "entryRuleDeviceProperty"
    // InternalTargetEnvironmentParser.g:1461:1: entryRuleDeviceProperty returns [EObject current=null] : iv_ruleDeviceProperty= ruleDeviceProperty EOF ;
    public final EObject entryRuleDeviceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1461:55: (iv_ruleDeviceProperty= ruleDeviceProperty EOF )
            // InternalTargetEnvironmentParser.g:1462:2: iv_ruleDeviceProperty= ruleDeviceProperty EOF
            {
             newCompositeNode(grammarAccess.getDevicePropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeviceProperty=ruleDeviceProperty();

            state._fsp--;

             current =iv_ruleDeviceProperty;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleDeviceProperty"


    // $ANTLR start "ruleDeviceProperty"
    // InternalTargetEnvironmentParser.g:1468:1: ruleDeviceProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) ;
    public final EObject ruleDeviceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_INDENT_11=null;
        Token this_DEDENT_16=null;
        Token this_DEDENT_17=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        EObject lv_type_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        EObject lv_value_13_0 = null;

        EObject lv_value_15_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1474:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1475:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1475:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1476:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getDevicePropertyAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:1487:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1488:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1488:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1489:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDevicePropertyAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDevicePropertyRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_3, grammarAccess.getDevicePropertyAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_33);

                        newLeafNode(otherlv_4, grammarAccess.getDevicePropertyAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:1514:3: ( (lv_kind_5_0= rulePropertyKind ) )
            // InternalTargetEnvironmentParser.g:1515:4: (lv_kind_5_0= rulePropertyKind )
            {
            // InternalTargetEnvironmentParser.g:1515:4: (lv_kind_5_0= rulePropertyKind )
            // InternalTargetEnvironmentParser.g:1516:5: lv_kind_5_0= rulePropertyKind
            {

                                newCompositeNode(grammarAccess.getDevicePropertyAccess().getKindPropertyKindParserRuleCall_5_0());

            pushFollow(FOLLOW_34);
            lv_kind_5_0=rulePropertyKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDevicePropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.PropertyKind");
                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_6=(Token)match(input,Type,FOLLOW_35);

                        newLeafNode(otherlv_6, grammarAccess.getDevicePropertyAccess().getTypeKeyword_6());

            // InternalTargetEnvironmentParser.g:1537:3: ( (lv_type_7_0= ruleAbstractResouceType ) )
            // InternalTargetEnvironmentParser.g:1538:4: (lv_type_7_0= ruleAbstractResouceType )
            {
            // InternalTargetEnvironmentParser.g:1538:4: (lv_type_7_0= ruleAbstractResouceType )
            // InternalTargetEnvironmentParser.g:1539:5: lv_type_7_0= ruleAbstractResouceType
            {

                                newCompositeNode(grammarAccess.getDevicePropertyAccess().getTypeAbstractResouceTypeParserRuleCall_7_0());

            pushFollow(FOLLOW_29);
            lv_type_7_0=ruleAbstractResouceType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDevicePropertyRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_7_0,
                                    "de.fraunhofer.ipa.deployment.Util.AbstractResouceType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1556:3: (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Description) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1557:4: otherlv_8= Description ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_8, grammarAccess.getDevicePropertyAccess().getDescriptionKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1561:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1562:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1562:5: (lv_description_9_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1563:6: lv_description_9_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getDevicePropertyAccess().getDescriptionEStringParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getDevicePropertyRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_9_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1581:3: (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Value) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1582:4: otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT
                    {
                    otherlv_10=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_10, grammarAccess.getDevicePropertyAccess().getValueKeyword_9_0());

                    this_INDENT_11=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_11, grammarAccess.getDevicePropertyAccess().getINDENTTerminalRuleCall_9_1());


                                    newCompositeNode(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_9_2());

                    pushFollow(FOLLOW_21);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalTargetEnvironmentParser.g:1597:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1598:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1598:5: (lv_value_13_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1599:6: lv_value_13_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getDevicePropertyAccess().getValuePropertyValueParserRuleCall_9_3_0());

                    pushFollow(FOLLOW_9);
                    lv_value_13_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getDevicePropertyRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_13_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalTargetEnvironmentParser.g:1616:4: ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==HyphenMinus) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:1617:5: rulePreListElement ( (lv_value_15_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_9_4_0());

                            pushFollow(FOLLOW_21);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalTargetEnvironmentParser.g:1624:5: ( (lv_value_15_0= rulePropertyValue ) )
                            // InternalTargetEnvironmentParser.g:1625:6: (lv_value_15_0= rulePropertyValue )
                            {
                            // InternalTargetEnvironmentParser.g:1625:6: (lv_value_15_0= rulePropertyValue )
                            // InternalTargetEnvironmentParser.g:1626:7: lv_value_15_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getDevicePropertyAccess().getValuePropertyValueParserRuleCall_9_4_1_0());

                            pushFollow(FOLLOW_9);
                            lv_value_15_0=rulePropertyValue();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getDevicePropertyRule());
                                                        }
                                                        add(
                                                            current,
                                                            "value",
                                                            lv_value_15_0,
                                                            "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop26;
                        }
                    } while (true);

                    this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_16, grammarAccess.getDevicePropertyAccess().getDEDENTTerminalRuleCall_9_5());


                    }
                    break;

            }

            this_DEDENT_17=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_17, grammarAccess.getDevicePropertyAccess().getDEDENTTerminalRuleCall_10());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceProperty"


    // $ANTLR start "entryRuleComputationDeviceType"
    // InternalTargetEnvironmentParser.g:1657:1: entryRuleComputationDeviceType returns [EObject current=null] : iv_ruleComputationDeviceType= ruleComputationDeviceType EOF ;
    public final EObject entryRuleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceType = null;


        try {
            // InternalTargetEnvironmentParser.g:1657:62: (iv_ruleComputationDeviceType= ruleComputationDeviceType EOF )
            // InternalTargetEnvironmentParser.g:1658:2: iv_ruleComputationDeviceType= ruleComputationDeviceType EOF
            {
             newCompositeNode(grammarAccess.getComputationDeviceTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleComputationDeviceType=ruleComputationDeviceType();

            state._fsp--;

             current =iv_ruleComputationDeviceType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleComputationDeviceType"


    // $ANTLR start "ruleComputationDeviceType"
    // InternalTargetEnvironmentParser.g:1664:1: ruleComputationDeviceType returns [EObject current=null] : (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT ) ;
    public final EObject ruleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_INDENT_5=null;
        Token this_DEDENT_7=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_11=null;
        Token this_DEDENT_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_deviceProperty_6_0 = null;

        EObject lv_communicationConnection_10_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1670:2: ( (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1671:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1671:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1672:3: otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ComputationDeviceType,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_1, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1684:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1685:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1685:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1686:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_31);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1703:3: (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DeviceProperty) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1704:4: otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,DeviceProperty,FOLLOW_3);

                                    newLeafNode(otherlv_4, grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyKeyword_4_0());

                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_5, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1());

                    // InternalTargetEnvironmentParser.g:1712:4: ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==HyphenMinus) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:1713:5: (lv_deviceProperty_6_0= ruleDeviceProperty )
                            {
                            // InternalTargetEnvironmentParser.g:1713:5: (lv_deviceProperty_6_0= ruleDeviceProperty )
                            // InternalTargetEnvironmentParser.g:1714:6: lv_deviceProperty_6_0= ruleDeviceProperty
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyDevicePropertyParserRuleCall_4_2_0());

                            pushFollow(FOLLOW_9);
                            lv_deviceProperty_6_0=ruleDeviceProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                                                    }
                                                    add(
                                                        current,
                                                        "deviceProperty",
                                                        lv_deviceProperty_6_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.DeviceProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_32);

                                    newLeafNode(this_DEDENT_7, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1736:3: (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==CommunicationConnection) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1737:4: otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,CommunicationConnection,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_5_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_9, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalTargetEnvironmentParser.g:1745:4: ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==HyphenMinus) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:1746:5: (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection )
                            {
                            // InternalTargetEnvironmentParser.g:1746:5: (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection )
                            // InternalTargetEnvironmentParser.g:1747:6: lv_communicationConnection_10_0= ruleAbstractCommunicationConnection
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_9);
                            lv_communicationConnection_10_0=ruleAbstractCommunicationConnection();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                                                    }
                                                    add(
                                                        current,
                                                        "communicationConnection",
                                                        lv_communicationConnection_10_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstractCommunicationConnection");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_11, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_12, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_6());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComputationDeviceType"


    // $ANTLR start "entryRuleConnectionProperty"
    // InternalTargetEnvironmentParser.g:1777:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1777:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:1778:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
            {
             newCompositeNode(grammarAccess.getConnectionPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleConnectionProperty=ruleConnectionProperty();

            state._fsp--;

             current =iv_ruleConnectionProperty;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleConnectionProperty"


    // $ANTLR start "ruleConnectionProperty"
    // InternalTargetEnvironmentParser.g:1784:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleConnectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_DEDENT_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_10_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1790:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1791:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1791:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1792:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1792:3: ()
            // InternalTargetEnvironmentParser.g:1793:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getConnectionPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getConnectionPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1810:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1811:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1811:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1812:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getConnectionPropertyAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getConnectionPropertyRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_4, grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_5, grammarAccess.getConnectionPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1837:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1838:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1838:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1839:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getConnectionPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getConnectionPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1856:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Description) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1857:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getConnectionPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1861:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1862:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1862:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1863:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getConnectionPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getConnectionPropertyRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_8_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1881:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Value) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1882:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getConnectionPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1886:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1887:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1887:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1888:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getConnectionPropertyRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_10_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getConnectionPropertyAccess().getDEDENTTerminalRuleCall_9());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionProperty"


    // $ANTLR start "entryRuleNetworkConnection"
    // InternalTargetEnvironmentParser.g:1914:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:1914:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalTargetEnvironmentParser.g:1915:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
            {
             newCompositeNode(grammarAccess.getNetworkConnectionRule());
            pushFollow(FOLLOW_1);
            iv_ruleNetworkConnection=ruleNetworkConnection();

            state._fsp--;

             current =iv_ruleNetworkConnection;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleNetworkConnection"


    // $ANTLR start "ruleNetworkConnection"
    // InternalTargetEnvironmentParser.g:1921:1: ruleNetworkConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleNetworkConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_INDENT_8=null;
        Token this_DEDENT_10=null;
        Token this_DEDENT_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_properties_9_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1927:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1928:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1928:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1929:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1929:3: ()
            // InternalTargetEnvironmentParser.g:1930:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getNetworkConnectionAccess().getNetworkConnectionAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getNetworkConnectionAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getNetworkConnectionAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1947:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1948:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1948:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1949:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getNetworkConnectionAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getNetworkConnectionRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_34);

                        newLeafNode(this_INDENT_4, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_36);

                        newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:1974:3: ( (lv_type_6_0= ruleNetworkCommunicationType ) )
            // InternalTargetEnvironmentParser.g:1975:4: (lv_type_6_0= ruleNetworkCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:1975:4: (lv_type_6_0= ruleNetworkCommunicationType )
            // InternalTargetEnvironmentParser.g:1976:5: lv_type_6_0= ruleNetworkCommunicationType
            {

                                newCompositeNode(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_37);
            lv_type_6_0=ruleNetworkCommunicationType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getNetworkConnectionRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.NetworkCommunicationType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1993:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Properties) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1994:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_8, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:2002:4: ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==HyphenMinus) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:2003:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                            {
                            // InternalTargetEnvironmentParser.g:2003:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                            // InternalTargetEnvironmentParser.g:2004:6: lv_properties_9_0= ruleAbstractNetworkProperty
                            {

                                                    newCompositeNode(grammarAccess.getNetworkConnectionAccess().getPropertiesAbstractNetworkPropertyParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_9);
                            lv_properties_9_0=ruleAbstractNetworkProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getNetworkConnectionRule());
                                                    }
                                                    add(
                                                        current,
                                                        "properties",
                                                        lv_properties_9_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstractNetworkProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getNetworkConnectionAccess().getDEDENTTerminalRuleCall_7_3());


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getNetworkConnectionAccess().getDEDENTTerminalRuleCall_8());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetworkConnection"


    // $ANTLR start "entryRuleCommunicationConnection"
    // InternalTargetEnvironmentParser.g:2034:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:2034:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:2035:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
            {
             newCompositeNode(grammarAccess.getCommunicationConnectionRule());
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationConnection=ruleCommunicationConnection();

            state._fsp--;

             current =iv_ruleCommunicationConnection;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleCommunicationConnection"


    // $ANTLR start "ruleCommunicationConnection"
    // InternalTargetEnvironmentParser.g:2041:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_INDENT_8=null;
        Token this_DEDENT_10=null;
        Token this_DEDENT_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_properties_9_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2047:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2048:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2048:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2049:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2049:3: ()
            // InternalTargetEnvironmentParser.g:2050:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getCommunicationConnectionAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2067:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2068:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2068:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2069:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getCommunicationConnectionRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_34);

                        newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_5);

                        newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:2094:3: ( (lv_type_6_0= ruleCommunicationType ) )
            // InternalTargetEnvironmentParser.g:2095:4: (lv_type_6_0= ruleCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:2095:4: (lv_type_6_0= ruleCommunicationType )
            // InternalTargetEnvironmentParser.g:2096:5: lv_type_6_0= ruleCommunicationType
            {

                                newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_37);
            lv_type_6_0=ruleCommunicationType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getCommunicationConnectionRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.CommunicationType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2113:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Properties) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2114:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:2122:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==HyphenMinus) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:2123:5: (lv_properties_9_0= ruleConnectionProperty )
                            {
                            // InternalTargetEnvironmentParser.g:2123:5: (lv_properties_9_0= ruleConnectionProperty )
                            // InternalTargetEnvironmentParser.g:2124:6: lv_properties_9_0= ruleConnectionProperty
                            {

                                                    newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPropertiesConnectionPropertyParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_9);
                            lv_properties_9_0=ruleConnectionProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getCommunicationConnectionRule());
                                                    }
                                                    add(
                                                        current,
                                                        "properties",
                                                        lv_properties_9_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.ConnectionProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getCommunicationConnectionAccess().getDEDENTTerminalRuleCall_7_3());


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getCommunicationConnectionAccess().getDEDENTTerminalRuleCall_8());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommunicationConnection"


    // $ANTLR start "entryRulePropertyKind"
    // InternalTargetEnvironmentParser.g:2154:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalTargetEnvironmentParser.g:2154:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalTargetEnvironmentParser.g:2155:2: iv_rulePropertyKind= rulePropertyKind EOF
            {
             newCompositeNode(grammarAccess.getPropertyKindRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyKind=rulePropertyKind();

            state._fsp--;

             current =iv_rulePropertyKind;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertyKind"


    // $ANTLR start "rulePropertyKind"
    // InternalTargetEnvironmentParser.g:2161:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2167:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:2168:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:2168:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt38=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt38=1;
                }
                break;
            case MaximumKind:
                {
                alt38=2;
                }
                break;
            case MinimumKind:
                {
                alt38=3;
                }
                break;
            case RangeKind:
                {
                alt38=4;
                }
                break;
            case SelectionKind:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2169:3: this_AttributeKind_0= ruleAttributeKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getAttributeKindParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_AttributeKind_0=ruleAttributeKind();

                    state._fsp--;


                                current = this_AttributeKind_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:2178:3: this_MaximumKind_1= ruleMaximumKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getMaximumKindParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_MaximumKind_1=ruleMaximumKind();

                    state._fsp--;


                                current = this_MaximumKind_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 3 :
                    // InternalTargetEnvironmentParser.g:2187:3: this_MinimumKind_2= ruleMinimumKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getMinimumKindParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_MinimumKind_2=ruleMinimumKind();

                    state._fsp--;


                                current = this_MinimumKind_2;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 4 :
                    // InternalTargetEnvironmentParser.g:2196:3: this_RangeKind_3= ruleRangeKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getRangeKindParserRuleCall_3());

                    pushFollow(FOLLOW_2);
                    this_RangeKind_3=ruleRangeKind();

                    state._fsp--;


                                current = this_RangeKind_3;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 5 :
                    // InternalTargetEnvironmentParser.g:2205:3: this_SelectionKind_4= ruleSelectionKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getSelectionKindParserRuleCall_4());

                    pushFollow(FOLLOW_2);
                    this_SelectionKind_4=ruleSelectionKind();

                    state._fsp--;


                                current = this_SelectionKind_4;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyKind"


    // $ANTLR start "entryRuleProperty"
    // InternalTargetEnvironmentParser.g:2217:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2217:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalTargetEnvironmentParser.g:2218:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalTargetEnvironmentParser.g:2224:1: ruleProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_14=null;
        Token this_DEDENT_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_11_0 = null;

        EObject lv_value_13_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2230:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:2231:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:2231:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:2232:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:2243:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2244:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2244:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2245:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_33);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:2270:3: ( (lv_kind_5_0= rulePropertyKind ) )
            // InternalTargetEnvironmentParser.g:2271:4: (lv_kind_5_0= rulePropertyKind )
            {
            // InternalTargetEnvironmentParser.g:2271:4: (lv_kind_5_0= rulePropertyKind )
            // InternalTargetEnvironmentParser.g:2272:5: lv_kind_5_0= rulePropertyKind
            {

                                newCompositeNode(grammarAccess.getPropertyAccess().getKindPropertyKindParserRuleCall_5_0());

            pushFollow(FOLLOW_38);
            lv_kind_5_0=rulePropertyKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.PropertyKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2289:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Description) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2290:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:2294:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2295:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2295:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2296:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_39);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2314:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Value) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2315:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_21);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalTargetEnvironmentParser.g:2330:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2331:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2331:5: (lv_value_11_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2332:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_9);
                    lv_value_11_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_11_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalTargetEnvironmentParser.g:2349:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==HyphenMinus) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:2350:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_21);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalTargetEnvironmentParser.g:2357:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalTargetEnvironmentParser.g:2358:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalTargetEnvironmentParser.g:2358:6: (lv_value_13_0= rulePropertyValue )
                            // InternalTargetEnvironmentParser.g:2359:7: lv_value_13_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                            pushFollow(FOLLOW_9);
                            lv_value_13_0=rulePropertyValue();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getPropertyRule());
                                                        }
                                                        add(
                                                            current,
                                                            "value",
                                                            lv_value_13_0,
                                                            "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop40;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_40);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2382:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DEDENT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2383:4: this_DEDENT_15= RULE_DEDENT
                    {
                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_8());


                    }
                    break;

            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyAttribute"
    // InternalTargetEnvironmentParser.g:2392:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalTargetEnvironmentParser.g:2392:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalTargetEnvironmentParser.g:2393:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
            {
             newCompositeNode(grammarAccess.getPropertyAttributeRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyAttribute=rulePropertyAttribute();

            state._fsp--;

             current =iv_rulePropertyAttribute;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertyAttribute"


    // $ANTLR start "rulePropertyAttribute"
    // InternalTargetEnvironmentParser.g:2399:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
    public final EObject rulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_9_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2405:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:2406:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:2406:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:2407:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:2418:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2419:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2419:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2420:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyAttributeRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:2445:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:2446:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:2446:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:2447:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_38);
            lv_kind_5_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyAttributeRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2464:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Description) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2465:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:2469:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2470:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2470:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2471:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_39);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyAttributeRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2489:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Value) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2490:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2494:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2495:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2495:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2496:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_40);
                    lv_value_9_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyAttributeRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_9_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2514:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DEDENT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2515:4: this_DEDENT_10= RULE_DEDENT
                    {
                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getPropertyAttributeAccess().getDEDENTTerminalRuleCall_8());


                    }
                    break;

            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyAttribute"


    // $ANTLR start "entryRulePropertyMaximun"
    // InternalTargetEnvironmentParser.g:2524:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalTargetEnvironmentParser.g:2524:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalTargetEnvironmentParser.g:2525:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
            {
             newCompositeNode(grammarAccess.getPropertyMaximunRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyMaximun=rulePropertyMaximun();

            state._fsp--;

             current =iv_rulePropertyMaximun;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertyMaximun"


    // $ANTLR start "rulePropertyMaximun"
    // InternalTargetEnvironmentParser.g:2531:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
    public final EObject rulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_9_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2537:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:2538:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:2538:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:2539:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:2550:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2551:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2551:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2552:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyMaximunRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_41);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:2577:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalTargetEnvironmentParser.g:2578:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalTargetEnvironmentParser.g:2578:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalTargetEnvironmentParser.g:2579:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_38);
            lv_kind_5_0=ruleMaximumKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyMaximunRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.MaximumKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2596:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Description) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2597:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:2601:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2602:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2602:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2603:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_39);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyMaximunRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2621:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Value) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2622:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2626:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2627:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2627:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2628:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_40);
                    lv_value_9_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyMaximunRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_9_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2646:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_DEDENT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2647:4: this_DEDENT_10= RULE_DEDENT
                    {
                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getPropertyMaximunAccess().getDEDENTTerminalRuleCall_8());


                    }
                    break;

            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyMaximun"


    // $ANTLR start "entryRulePropertyMinimum"
    // InternalTargetEnvironmentParser.g:2656:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalTargetEnvironmentParser.g:2656:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalTargetEnvironmentParser.g:2657:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
            {
             newCompositeNode(grammarAccess.getPropertyMinimumRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyMinimum=rulePropertyMinimum();

            state._fsp--;

             current =iv_rulePropertyMinimum;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertyMinimum"


    // $ANTLR start "rulePropertyMinimum"
    // InternalTargetEnvironmentParser.g:2663:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
    public final EObject rulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_9_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2669:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:2670:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:2670:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:2671:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:2682:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2683:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2683:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2684:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyMinimumRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_42);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:2709:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalTargetEnvironmentParser.g:2710:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalTargetEnvironmentParser.g:2710:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalTargetEnvironmentParser.g:2711:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_38);
            lv_kind_5_0=ruleMinimumKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyMinimumRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.MinimumKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2728:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Description) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2729:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:2733:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2734:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2734:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2735:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_39);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyMinimumRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2753:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Value) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2754:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2758:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2759:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2759:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2760:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_40);
                    lv_value_9_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyMinimumRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_9_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2778:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_DEDENT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2779:4: this_DEDENT_10= RULE_DEDENT
                    {
                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getPropertyMinimumAccess().getDEDENTTerminalRuleCall_8());


                    }
                    break;

            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyMinimum"


    // $ANTLR start "entryRulePropertySelection"
    // InternalTargetEnvironmentParser.g:2788:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalTargetEnvironmentParser.g:2788:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalTargetEnvironmentParser.g:2789:2: iv_rulePropertySelection= rulePropertySelection EOF
            {
             newCompositeNode(grammarAccess.getPropertySelectionRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertySelection=rulePropertySelection();

            state._fsp--;

             current =iv_rulePropertySelection;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertySelection"


    // $ANTLR start "rulePropertySelection"
    // InternalTargetEnvironmentParser.g:2795:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
    public final EObject rulePropertySelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_14=null;
        Token this_DEDENT_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_11_0 = null;

        EObject lv_value_13_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2801:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:2802:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:2802:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:2803:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:2814:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2815:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2815:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2816:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_33);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:2841:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:2842:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:2842:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalTargetEnvironmentParser.g:2843:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_38);
            lv_kind_5_0=ruleSelectionKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.SelectionKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2860:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Description) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2861:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:2865:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2866:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2866:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2867:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_39);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2885:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Value) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2886:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_21);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalTargetEnvironmentParser.g:2901:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2902:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2902:5: (lv_value_11_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2903:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_9);
                    lv_value_11_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_11_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalTargetEnvironmentParser.g:2920:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==HyphenMinus) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:2921:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_21);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalTargetEnvironmentParser.g:2928:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalTargetEnvironmentParser.g:2929:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalTargetEnvironmentParser.g:2929:6: (lv_value_13_0= rulePropertyValue )
                            // InternalTargetEnvironmentParser.g:2930:7: lv_value_13_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                            pushFollow(FOLLOW_9);
                            lv_value_13_0=rulePropertyValue();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                                        }
                                                        add(
                                                            current,
                                                            "value",
                                                            lv_value_13_0,
                                                            "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop53;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_40);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2953:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_DEDENT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2954:4: this_DEDENT_15= RULE_DEDENT
                    {
                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_8());


                    }
                    break;

            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertySelection"


    // $ANTLR start "entryRulePropertyRange"
    // InternalTargetEnvironmentParser.g:2963:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalTargetEnvironmentParser.g:2963:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalTargetEnvironmentParser.g:2964:2: iv_rulePropertyRange= rulePropertyRange EOF
            {
             newCompositeNode(grammarAccess.getPropertyRangeRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyRange=rulePropertyRange();

            state._fsp--;

             current =iv_rulePropertyRange;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertyRange"


    // $ANTLR start "rulePropertyRange"
    // InternalTargetEnvironmentParser.g:2970:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
    public final EObject rulePropertyRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_14=null;
        Token this_DEDENT_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_11_0 = null;

        EObject lv_value_13_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2976:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:2977:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:2977:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:2978:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:2989:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2990:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2990:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2991:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_43);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:3016:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalTargetEnvironmentParser.g:3017:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalTargetEnvironmentParser.g:3017:4: (lv_kind_5_0= ruleRangeKind )
            // InternalTargetEnvironmentParser.g:3018:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_38);
            lv_kind_5_0=ruleRangeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.RangeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:3035:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==Description) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3036:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:3040:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:3041:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:3041:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:3042:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_39);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:3060:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Value) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3061:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_21);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalTargetEnvironmentParser.g:3076:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3077:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3077:5: (lv_value_11_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3078:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_8);
                    lv_value_11_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_11_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_4());

                    pushFollow(FOLLOW_21);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalTargetEnvironmentParser.g:3102:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3103:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3103:5: (lv_value_13_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3104:6: lv_value_13_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_5_0());

                    pushFollow(FOLLOW_11);
                    lv_value_13_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_13_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_40);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:3126:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_DEDENT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3127:4: this_DEDENT_15= RULE_DEDENT
                    {
                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_8());


                    }
                    break;

            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyRange"


    // $ANTLR start "entryRulePropertyValue"
    // InternalTargetEnvironmentParser.g:3136:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalTargetEnvironmentParser.g:3136:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalTargetEnvironmentParser.g:3137:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalTargetEnvironmentParser.g:3143:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3149:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) )
            // InternalTargetEnvironmentParser.g:3150:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            {
            // InternalTargetEnvironmentParser.g:3150:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            int alt59=4;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt59=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt59=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt59=3;
                }
                break;
            case X86_64:
            case Arm64:
                {
                alt59=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3151:3: this_PropertyValueInt_0= rulePropertyValueInt
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getPropertyValueIntParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_PropertyValueInt_0=rulePropertyValueInt();

                    state._fsp--;


                                current = this_PropertyValueInt_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3160:3: this_PropertyValueDouble_1= rulePropertyValueDouble
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getPropertyValueDoubleParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_PropertyValueDouble_1=rulePropertyValueDouble();

                    state._fsp--;


                                current = this_PropertyValueDouble_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 3 :
                    // InternalTargetEnvironmentParser.g:3169:3: this_PropertyValueString_2= rulePropertyValueString
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getPropertyValueStringParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_PropertyValueString_2=rulePropertyValueString();

                    state._fsp--;


                                current = this_PropertyValueString_2;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 4 :
                    // InternalTargetEnvironmentParser.g:3178:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getProcessorArchitectureValueParserRuleCall_3());

                    pushFollow(FOLLOW_2);
                    this_ProcessorArchitectureValue_3=ruleProcessorArchitectureValue();

                    state._fsp--;


                                current = this_ProcessorArchitectureValue_3;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePropertyValueInt"
    // InternalTargetEnvironmentParser.g:3190:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalTargetEnvironmentParser.g:3190:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalTargetEnvironmentParser.g:3191:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueIntRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyValueInt=rulePropertyValueInt();

            state._fsp--;

             current =iv_rulePropertyValueInt;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertyValueInt"


    // $ANTLR start "rulePropertyValueInt"
    // InternalTargetEnvironmentParser.g:3197:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3203:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalTargetEnvironmentParser.g:3204:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalTargetEnvironmentParser.g:3204:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalTargetEnvironmentParser.g:3205:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalTargetEnvironmentParser.g:3205:3: (lv_value_0_0= ruleInteger0 )
            // InternalTargetEnvironmentParser.g:3206:4: lv_value_0_0= ruleInteger0
            {

                            newCompositeNode(grammarAccess.getPropertyValueIntAccess().getValueInteger0ParserRuleCall_0());

            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleInteger0();

            state._fsp--;


                            if (current==null) {
                                current = createModelElementForParent(grammarAccess.getPropertyValueIntRule());
                            }
                            set(
                                current,
                                "value",
                                lv_value_0_0,
                                "de.fraunhofer.ipa.deployment.Util.Integer0");
                            afterParserOrEnumRuleCall();


            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValueInt"


    // $ANTLR start "entryRulePropertyValueDouble"
    // InternalTargetEnvironmentParser.g:3226:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalTargetEnvironmentParser.g:3226:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalTargetEnvironmentParser.g:3227:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueDoubleRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyValueDouble=rulePropertyValueDouble();

            state._fsp--;

             current =iv_rulePropertyValueDouble;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertyValueDouble"


    // $ANTLR start "rulePropertyValueDouble"
    // InternalTargetEnvironmentParser.g:3233:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3239:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalTargetEnvironmentParser.g:3240:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalTargetEnvironmentParser.g:3240:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalTargetEnvironmentParser.g:3241:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalTargetEnvironmentParser.g:3241:3: (lv_value_0_0= ruleDouble0 )
            // InternalTargetEnvironmentParser.g:3242:4: lv_value_0_0= ruleDouble0
            {

                            newCompositeNode(grammarAccess.getPropertyValueDoubleAccess().getValueDouble0ParserRuleCall_0());

            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDouble0();

            state._fsp--;


                            if (current==null) {
                                current = createModelElementForParent(grammarAccess.getPropertyValueDoubleRule());
                            }
                            set(
                                current,
                                "value",
                                lv_value_0_0,
                                "de.fraunhofer.ipa.deployment.Util.Double0");
                            afterParserOrEnumRuleCall();


            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValueDouble"


    // $ANTLR start "entryRulePropertyValueString"
    // InternalTargetEnvironmentParser.g:3262:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalTargetEnvironmentParser.g:3262:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalTargetEnvironmentParser.g:3263:2: iv_rulePropertyValueString= rulePropertyValueString EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueStringRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyValueString=rulePropertyValueString();

            state._fsp--;

             current =iv_rulePropertyValueString;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRulePropertyValueString"


    // $ANTLR start "rulePropertyValueString"
    // InternalTargetEnvironmentParser.g:3269:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3275:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:3276:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:3276:2: ( (lv_value_0_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3277:3: (lv_value_0_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3277:3: (lv_value_0_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3278:4: lv_value_0_0= ruleEString
            {

                            newCompositeNode(grammarAccess.getPropertyValueStringAccess().getValueEStringParserRuleCall_0());

            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


                            if (current==null) {
                                current = createModelElementForParent(grammarAccess.getPropertyValueStringRule());
                            }
                            set(
                                current,
                                "value",
                                lv_value_0_0,
                                "de.fraunhofer.ipa.deployment.Util.EString");
                            afterParserOrEnumRuleCall();


            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValueString"


    // $ANTLR start "entryRuleProcessorArchitectureValue"
    // InternalTargetEnvironmentParser.g:3298:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalTargetEnvironmentParser.g:3298:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalTargetEnvironmentParser.g:3299:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
            {
             newCompositeNode(grammarAccess.getProcessorArchitectureValueRule());
            pushFollow(FOLLOW_1);
            iv_ruleProcessorArchitectureValue=ruleProcessorArchitectureValue();

            state._fsp--;

             current =iv_ruleProcessorArchitectureValue;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleProcessorArchitectureValue"


    // $ANTLR start "ruleProcessorArchitectureValue"
    // InternalTargetEnvironmentParser.g:3305:1: ruleProcessorArchitectureValue returns [EObject current=null] : (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject this_X86ProcessorArchitecture_0 = null;

        EObject this_Arm64ProcessorArchitecture_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3311:2: ( (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:3312:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:3312:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==X86_64) ) {
                alt60=1;
            }
            else if ( (LA60_0==Arm64) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3313:3: this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture
                    {

                                newCompositeNode(grammarAccess.getProcessorArchitectureValueAccess().getX86ProcessorArchitectureParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_X86ProcessorArchitecture_0=ruleX86ProcessorArchitecture();

                    state._fsp--;


                                current = this_X86ProcessorArchitecture_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3322:3: this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture
                    {

                                newCompositeNode(grammarAccess.getProcessorArchitectureValueAccess().getArm64ProcessorArchitectureParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_Arm64ProcessorArchitecture_1=ruleArm64ProcessorArchitecture();

                    state._fsp--;


                                current = this_Arm64ProcessorArchitecture_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessorArchitectureValue"


    // $ANTLR start "entryRuleAbstractResouceType"
    // InternalTargetEnvironmentParser.g:3334:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:3334:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalTargetEnvironmentParser.g:3335:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
            {
             newCompositeNode(grammarAccess.getAbstractResouceTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractResouceType=ruleAbstractResouceType();

            state._fsp--;

             current =iv_ruleAbstractResouceType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleAbstractResouceType"


    // $ANTLR start "ruleAbstractResouceType"
    // InternalTargetEnvironmentParser.g:3341:1: ruleAbstractResouceType returns [EObject current=null] : (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType | this_ResourceType_2= ruleResourceType ) ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_OpertingSystemType_0 = null;

        EObject this_ProcessorArchitectureType_1 = null;

        EObject this_ResourceType_2 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3347:2: ( (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType | this_ResourceType_2= ruleResourceType ) )
            // InternalTargetEnvironmentParser.g:3348:2: (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType | this_ResourceType_2= ruleResourceType )
            {
            // InternalTargetEnvironmentParser.g:3348:2: (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType | this_ResourceType_2= ruleResourceType )
            int alt61=3;
            switch ( input.LA(1) ) {
            case Linux:
            case MacOS:
                {
                alt61=1;
                }
                break;
            case ProcessorArchitecture:
                {
                alt61=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt61=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3349:3: this_OpertingSystemType_0= ruleOpertingSystemType
                    {

                                newCompositeNode(grammarAccess.getAbstractResouceTypeAccess().getOpertingSystemTypeParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_OpertingSystemType_0=ruleOpertingSystemType();

                    state._fsp--;


                                current = this_OpertingSystemType_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3358:3: this_ProcessorArchitectureType_1= ruleProcessorArchitectureType
                    {

                                newCompositeNode(grammarAccess.getAbstractResouceTypeAccess().getProcessorArchitectureTypeParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_ProcessorArchitectureType_1=ruleProcessorArchitectureType();

                    state._fsp--;


                                current = this_ProcessorArchitectureType_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 3 :
                    // InternalTargetEnvironmentParser.g:3367:3: this_ResourceType_2= ruleResourceType
                    {

                                newCompositeNode(grammarAccess.getAbstractResouceTypeAccess().getResourceTypeParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_ResourceType_2=ruleResourceType();

                    state._fsp--;


                                current = this_ResourceType_2;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractResouceType"


    // $ANTLR start "entryRuleOpertingSystemType"
    // InternalTargetEnvironmentParser.g:3379:1: entryRuleOpertingSystemType returns [EObject current=null] : iv_ruleOpertingSystemType= ruleOpertingSystemType EOF ;
    public final EObject entryRuleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemType = null;


        try {
            // InternalTargetEnvironmentParser.g:3379:59: (iv_ruleOpertingSystemType= ruleOpertingSystemType EOF )
            // InternalTargetEnvironmentParser.g:3380:2: iv_ruleOpertingSystemType= ruleOpertingSystemType EOF
            {
             newCompositeNode(grammarAccess.getOpertingSystemTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleOpertingSystemType=ruleOpertingSystemType();

            state._fsp--;

             current =iv_ruleOpertingSystemType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleOpertingSystemType"


    // $ANTLR start "ruleOpertingSystemType"
    // InternalTargetEnvironmentParser.g:3386:1: ruleOpertingSystemType returns [EObject current=null] : (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) ;
    public final EObject ruleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystemType_0 = null;

        EObject this_MacOSOpertingSystemType_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3392:2: ( (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) )
            // InternalTargetEnvironmentParser.g:3393:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            {
            // InternalTargetEnvironmentParser.g:3393:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Linux) ) {
                alt62=1;
            }
            else if ( (LA62_0==MacOS) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3394:3: this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType
                    {

                                newCompositeNode(grammarAccess.getOpertingSystemTypeAccess().getLinuxOpertingSystemTypeParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_LinuxOpertingSystemType_0=ruleLinuxOpertingSystemType();

                    state._fsp--;


                                current = this_LinuxOpertingSystemType_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3403:3: this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType
                    {

                                newCompositeNode(grammarAccess.getOpertingSystemTypeAccess().getMacOSOpertingSystemTypeParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_MacOSOpertingSystemType_1=ruleMacOSOpertingSystemType();

                    state._fsp--;


                                current = this_MacOSOpertingSystemType_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpertingSystemType"


    // $ANTLR start "entryRuleResourceType"
    // InternalTargetEnvironmentParser.g:3415:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalTargetEnvironmentParser.g:3415:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalTargetEnvironmentParser.g:3416:2: iv_ruleResourceType= ruleResourceType EOF
            {
             newCompositeNode(grammarAccess.getResourceTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleResourceType=ruleResourceType();

            state._fsp--;

             current =iv_ruleResourceType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleResourceType"


    // $ANTLR start "ruleResourceType"
    // InternalTargetEnvironmentParser.g:3422:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3428:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:3429:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:3429:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:3430:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:3430:3: ()
            // InternalTargetEnvironmentParser.g:3431:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:3437:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3438:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3438:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3439:5: lv_name_1_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getResourceTypeRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_1_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "entryRuleProcessorArchitectureType"
    // InternalTargetEnvironmentParser.g:3460:1: entryRuleProcessorArchitectureType returns [EObject current=null] : iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF ;
    public final EObject entryRuleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureType = null;


        try {
            // InternalTargetEnvironmentParser.g:3460:66: (iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF )
            // InternalTargetEnvironmentParser.g:3461:2: iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF
            {
             newCompositeNode(grammarAccess.getProcessorArchitectureTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleProcessorArchitectureType=ruleProcessorArchitectureType();

            state._fsp--;

             current =iv_ruleProcessorArchitectureType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleProcessorArchitectureType"


    // $ANTLR start "ruleProcessorArchitectureType"
    // InternalTargetEnvironmentParser.g:3467:1: ruleProcessorArchitectureType returns [EObject current=null] : ( () otherlv_1= ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3473:2: ( ( () otherlv_1= ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:3474:2: ( () otherlv_1= ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:3474:2: ( () otherlv_1= ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:3475:3: () otherlv_1= ProcessorArchitecture
            {
            // InternalTargetEnvironmentParser.g:3475:3: ()
            // InternalTargetEnvironmentParser.g:3476:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getProcessorArchitectureTypeAccess().getProcessorArchitectureTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,ProcessorArchitecture,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getProcessorArchitectureTypeAccess().getProcessorArchitectureKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessorArchitectureType"


    // $ANTLR start "entryRuleLinuxOpertingSystemType"
    // InternalTargetEnvironmentParser.g:3490:1: entryRuleLinuxOpertingSystemType returns [EObject current=null] : iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF ;
    public final EObject entryRuleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystemType = null;


        try {
            // InternalTargetEnvironmentParser.g:3490:64: (iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF )
            // InternalTargetEnvironmentParser.g:3491:2: iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF
            {
             newCompositeNode(grammarAccess.getLinuxOpertingSystemTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleLinuxOpertingSystemType=ruleLinuxOpertingSystemType();

            state._fsp--;

             current =iv_ruleLinuxOpertingSystemType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleLinuxOpertingSystemType"


    // $ANTLR start "ruleLinuxOpertingSystemType"
    // InternalTargetEnvironmentParser.g:3497:1: ruleLinuxOpertingSystemType returns [EObject current=null] : ( () otherlv_1= Linux ) ;
    public final EObject ruleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3503:2: ( ( () otherlv_1= Linux ) )
            // InternalTargetEnvironmentParser.g:3504:2: ( () otherlv_1= Linux )
            {
            // InternalTargetEnvironmentParser.g:3504:2: ( () otherlv_1= Linux )
            // InternalTargetEnvironmentParser.g:3505:3: () otherlv_1= Linux
            {
            // InternalTargetEnvironmentParser.g:3505:3: ()
            // InternalTargetEnvironmentParser.g:3506:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxOpertingSystemTypeAccess().getLinuxOpertingSystemTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Linux,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getLinuxOpertingSystemTypeAccess().getLinuxKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinuxOpertingSystemType"


    // $ANTLR start "entryRuleMacOSOpertingSystemType"
    // InternalTargetEnvironmentParser.g:3520:1: entryRuleMacOSOpertingSystemType returns [EObject current=null] : iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF ;
    public final EObject entryRuleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystemType = null;


        try {
            // InternalTargetEnvironmentParser.g:3520:64: (iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF )
            // InternalTargetEnvironmentParser.g:3521:2: iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF
            {
             newCompositeNode(grammarAccess.getMacOSOpertingSystemTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleMacOSOpertingSystemType=ruleMacOSOpertingSystemType();

            state._fsp--;

             current =iv_ruleMacOSOpertingSystemType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleMacOSOpertingSystemType"


    // $ANTLR start "ruleMacOSOpertingSystemType"
    // InternalTargetEnvironmentParser.g:3527:1: ruleMacOSOpertingSystemType returns [EObject current=null] : ( () otherlv_1= MacOS ) ;
    public final EObject ruleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3533:2: ( ( () otherlv_1= MacOS ) )
            // InternalTargetEnvironmentParser.g:3534:2: ( () otherlv_1= MacOS )
            {
            // InternalTargetEnvironmentParser.g:3534:2: ( () otherlv_1= MacOS )
            // InternalTargetEnvironmentParser.g:3535:3: () otherlv_1= MacOS
            {
            // InternalTargetEnvironmentParser.g:3535:3: ()
            // InternalTargetEnvironmentParser.g:3536:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getMacOSOpertingSystemTypeAccess().getMacOSOpertingSystemTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,MacOS,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getMacOSOpertingSystemTypeAccess().getMacOSKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMacOSOpertingSystemType"


    // $ANTLR start "entryRuleX86ProcessorArchitecture"
    // InternalTargetEnvironmentParser.g:3550:1: entryRuleX86ProcessorArchitecture returns [EObject current=null] : iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF ;
    public final EObject entryRuleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX86ProcessorArchitecture = null;


        try {
            // InternalTargetEnvironmentParser.g:3550:65: (iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF )
            // InternalTargetEnvironmentParser.g:3551:2: iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF
            {
             newCompositeNode(grammarAccess.getX86ProcessorArchitectureRule());
            pushFollow(FOLLOW_1);
            iv_ruleX86ProcessorArchitecture=ruleX86ProcessorArchitecture();

            state._fsp--;

             current =iv_ruleX86ProcessorArchitecture;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleX86ProcessorArchitecture"


    // $ANTLR start "ruleX86ProcessorArchitecture"
    // InternalTargetEnvironmentParser.g:3557:1: ruleX86ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= X86_64 ) ;
    public final EObject ruleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3563:2: ( ( () otherlv_1= X86_64 ) )
            // InternalTargetEnvironmentParser.g:3564:2: ( () otherlv_1= X86_64 )
            {
            // InternalTargetEnvironmentParser.g:3564:2: ( () otherlv_1= X86_64 )
            // InternalTargetEnvironmentParser.g:3565:3: () otherlv_1= X86_64
            {
            // InternalTargetEnvironmentParser.g:3565:3: ()
            // InternalTargetEnvironmentParser.g:3566:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,X86_64,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getX86ProcessorArchitectureAccess().getX86_64Keyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleX86ProcessorArchitecture"


    // $ANTLR start "entryRuleArm64ProcessorArchitecture"
    // InternalTargetEnvironmentParser.g:3580:1: entryRuleArm64ProcessorArchitecture returns [EObject current=null] : iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF ;
    public final EObject entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm64ProcessorArchitecture = null;


        try {
            // InternalTargetEnvironmentParser.g:3580:67: (iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF )
            // InternalTargetEnvironmentParser.g:3581:2: iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArm64ProcessorArchitectureRule());
            pushFollow(FOLLOW_1);
            iv_ruleArm64ProcessorArchitecture=ruleArm64ProcessorArchitecture();

            state._fsp--;

             current =iv_ruleArm64ProcessorArchitecture;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleArm64ProcessorArchitecture"


    // $ANTLR start "ruleArm64ProcessorArchitecture"
    // InternalTargetEnvironmentParser.g:3587:1: ruleArm64ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= Arm64 ) ;
    public final EObject ruleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3593:2: ( ( () otherlv_1= Arm64 ) )
            // InternalTargetEnvironmentParser.g:3594:2: ( () otherlv_1= Arm64 )
            {
            // InternalTargetEnvironmentParser.g:3594:2: ( () otherlv_1= Arm64 )
            // InternalTargetEnvironmentParser.g:3595:3: () otherlv_1= Arm64
            {
            // InternalTargetEnvironmentParser.g:3595:3: ()
            // InternalTargetEnvironmentParser.g:3596:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Arm64,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getArm64ProcessorArchitectureAccess().getArm64Keyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArm64ProcessorArchitecture"


    // $ANTLR start "entryRuleCommunicationType"
    // InternalTargetEnvironmentParser.g:3610:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:3610:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:3611:2: iv_ruleCommunicationType= ruleCommunicationType EOF
            {
             newCompositeNode(grammarAccess.getCommunicationTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationType=ruleCommunicationType();

            state._fsp--;

             current =iv_ruleCommunicationType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleCommunicationType"


    // $ANTLR start "ruleCommunicationType"
    // InternalTargetEnvironmentParser.g:3617:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3623:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:3624:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:3624:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:3625:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:3625:3: ()
            // InternalTargetEnvironmentParser.g:3626:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:3632:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3633:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3633:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3634:5: lv_name_1_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getCommunicationTypeAccess().getNameEStringParserRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getCommunicationTypeRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_1_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommunicationType"


    // $ANTLR start "entryRuleNetworkCommunicationType"
    // InternalTargetEnvironmentParser.g:3655:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:3655:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:3656:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
            {
             newCompositeNode(grammarAccess.getNetworkCommunicationTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleNetworkCommunicationType=ruleNetworkCommunicationType();

            state._fsp--;

             current =iv_ruleNetworkCommunicationType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleNetworkCommunicationType"


    // $ANTLR start "ruleNetworkCommunicationType"
    // InternalTargetEnvironmentParser.g:3662:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3668:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalTargetEnvironmentParser.g:3669:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:3669:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Ethernet) ) {
                alt63=1;
            }
            else if ( (LA63_0==Wlan) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3670:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
                    {

                                newCompositeNode(grammarAccess.getNetworkCommunicationTypeAccess().getEthernetCommunicationTypeParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_EthernetCommunicationType_0=ruleEthernetCommunicationType();

                    state._fsp--;


                                current = this_EthernetCommunicationType_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3679:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
                    {

                                newCompositeNode(grammarAccess.getNetworkCommunicationTypeAccess().getWlanCommunicationTypeParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_WlanCommunicationType_1=ruleWlanCommunicationType();

                    state._fsp--;


                                current = this_WlanCommunicationType_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetworkCommunicationType"


    // $ANTLR start "entryRuleEthernetCommunicationType"
    // InternalTargetEnvironmentParser.g:3691:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:3691:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:3692:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
            {
             newCompositeNode(grammarAccess.getEthernetCommunicationTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleEthernetCommunicationType=ruleEthernetCommunicationType();

            state._fsp--;

             current =iv_ruleEthernetCommunicationType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleEthernetCommunicationType"


    // $ANTLR start "ruleEthernetCommunicationType"
    // InternalTargetEnvironmentParser.g:3698:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3704:2: ( ( () otherlv_1= Ethernet ) )
            // InternalTargetEnvironmentParser.g:3705:2: ( () otherlv_1= Ethernet )
            {
            // InternalTargetEnvironmentParser.g:3705:2: ( () otherlv_1= Ethernet )
            // InternalTargetEnvironmentParser.g:3706:3: () otherlv_1= Ethernet
            {
            // InternalTargetEnvironmentParser.g:3706:3: ()
            // InternalTargetEnvironmentParser.g:3707:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Ethernet,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getEthernetCommunicationTypeAccess().getEthernetKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEthernetCommunicationType"


    // $ANTLR start "entryRuleWlanCommunicationType"
    // InternalTargetEnvironmentParser.g:3721:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:3721:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:3722:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
            {
             newCompositeNode(grammarAccess.getWlanCommunicationTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleWlanCommunicationType=ruleWlanCommunicationType();

            state._fsp--;

             current =iv_ruleWlanCommunicationType;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleWlanCommunicationType"


    // $ANTLR start "ruleWlanCommunicationType"
    // InternalTargetEnvironmentParser.g:3728:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3734:2: ( ( () otherlv_1= Wlan ) )
            // InternalTargetEnvironmentParser.g:3735:2: ( () otherlv_1= Wlan )
            {
            // InternalTargetEnvironmentParser.g:3735:2: ( () otherlv_1= Wlan )
            // InternalTargetEnvironmentParser.g:3736:3: () otherlv_1= Wlan
            {
            // InternalTargetEnvironmentParser.g:3736:3: ()
            // InternalTargetEnvironmentParser.g:3737:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Wlan,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getWlanCommunicationTypeAccess().getWlanKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWlanCommunicationType"


    // $ANTLR start "entryRuleAttributeKind"
    // InternalTargetEnvironmentParser.g:3751:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:3751:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalTargetEnvironmentParser.g:3752:2: iv_ruleAttributeKind= ruleAttributeKind EOF
            {
             newCompositeNode(grammarAccess.getAttributeKindRule());
            pushFollow(FOLLOW_1);
            iv_ruleAttributeKind=ruleAttributeKind();

            state._fsp--;

             current =iv_ruleAttributeKind;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleAttributeKind"


    // $ANTLR start "ruleAttributeKind"
    // InternalTargetEnvironmentParser.g:3758:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3764:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalTargetEnvironmentParser.g:3765:2: ( () otherlv_1= AttributeKind )
            {
            // InternalTargetEnvironmentParser.g:3765:2: ( () otherlv_1= AttributeKind )
            // InternalTargetEnvironmentParser.g:3766:3: () otherlv_1= AttributeKind
            {
            // InternalTargetEnvironmentParser.g:3766:3: ()
            // InternalTargetEnvironmentParser.g:3767:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getAttributeKindAccess().getAttributeKindAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,AttributeKind,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getAttributeKindAccess().getAttributeKindKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeKind"


    // $ANTLR start "entryRuleMaximumKind"
    // InternalTargetEnvironmentParser.g:3781:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:3781:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalTargetEnvironmentParser.g:3782:2: iv_ruleMaximumKind= ruleMaximumKind EOF
            {
             newCompositeNode(grammarAccess.getMaximumKindRule());
            pushFollow(FOLLOW_1);
            iv_ruleMaximumKind=ruleMaximumKind();

            state._fsp--;

             current =iv_ruleMaximumKind;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleMaximumKind"


    // $ANTLR start "ruleMaximumKind"
    // InternalTargetEnvironmentParser.g:3788:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3794:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalTargetEnvironmentParser.g:3795:2: ( () otherlv_1= MaximumKind )
            {
            // InternalTargetEnvironmentParser.g:3795:2: ( () otherlv_1= MaximumKind )
            // InternalTargetEnvironmentParser.g:3796:3: () otherlv_1= MaximumKind
            {
            // InternalTargetEnvironmentParser.g:3796:3: ()
            // InternalTargetEnvironmentParser.g:3797:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getMaximumKindAccess().getMaximumKindAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,MaximumKind,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getMaximumKindAccess().getMaximumKindKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaximumKind"


    // $ANTLR start "entryRuleMinimumKind"
    // InternalTargetEnvironmentParser.g:3811:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:3811:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalTargetEnvironmentParser.g:3812:2: iv_ruleMinimumKind= ruleMinimumKind EOF
            {
             newCompositeNode(grammarAccess.getMinimumKindRule());
            pushFollow(FOLLOW_1);
            iv_ruleMinimumKind=ruleMinimumKind();

            state._fsp--;

             current =iv_ruleMinimumKind;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleMinimumKind"


    // $ANTLR start "ruleMinimumKind"
    // InternalTargetEnvironmentParser.g:3818:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3824:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalTargetEnvironmentParser.g:3825:2: ( () otherlv_1= MinimumKind )
            {
            // InternalTargetEnvironmentParser.g:3825:2: ( () otherlv_1= MinimumKind )
            // InternalTargetEnvironmentParser.g:3826:3: () otherlv_1= MinimumKind
            {
            // InternalTargetEnvironmentParser.g:3826:3: ()
            // InternalTargetEnvironmentParser.g:3827:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getMinimumKindAccess().getMinimumKindAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,MinimumKind,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getMinimumKindAccess().getMinimumKindKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinimumKind"


    // $ANTLR start "entryRuleSelectionKind"
    // InternalTargetEnvironmentParser.g:3841:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalTargetEnvironmentParser.g:3841:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalTargetEnvironmentParser.g:3842:2: iv_ruleSelectionKind= ruleSelectionKind EOF
            {
             newCompositeNode(grammarAccess.getSelectionKindRule());
            pushFollow(FOLLOW_1);
            iv_ruleSelectionKind=ruleSelectionKind();

            state._fsp--;

             current =iv_ruleSelectionKind;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleSelectionKind"


    // $ANTLR start "ruleSelectionKind"
    // InternalTargetEnvironmentParser.g:3848:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3854:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalTargetEnvironmentParser.g:3855:2: ( () otherlv_1= SelectionKind )
            {
            // InternalTargetEnvironmentParser.g:3855:2: ( () otherlv_1= SelectionKind )
            // InternalTargetEnvironmentParser.g:3856:3: () otherlv_1= SelectionKind
            {
            // InternalTargetEnvironmentParser.g:3856:3: ()
            // InternalTargetEnvironmentParser.g:3857:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getSelectionKindAccess().getSelectionKindAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,SelectionKind,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getSelectionKindAccess().getSelectionKindKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionKind"


    // $ANTLR start "entryRuleRangeKind"
    // InternalTargetEnvironmentParser.g:3871:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:3871:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalTargetEnvironmentParser.g:3872:2: iv_ruleRangeKind= ruleRangeKind EOF
            {
             newCompositeNode(grammarAccess.getRangeKindRule());
            pushFollow(FOLLOW_1);
            iv_ruleRangeKind=ruleRangeKind();

            state._fsp--;

             current =iv_ruleRangeKind;
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleRangeKind"


    // $ANTLR start "ruleRangeKind"
    // InternalTargetEnvironmentParser.g:3878:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3884:2: ( ( () otherlv_1= RangeKind ) )
            // InternalTargetEnvironmentParser.g:3885:2: ( () otherlv_1= RangeKind )
            {
            // InternalTargetEnvironmentParser.g:3885:2: ( () otherlv_1= RangeKind )
            // InternalTargetEnvironmentParser.g:3886:3: () otherlv_1= RangeKind
            {
            // InternalTargetEnvironmentParser.g:3886:3: ()
            // InternalTargetEnvironmentParser.g:3887:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getRangeKindAccess().getRangeKindAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,RangeKind,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getRangeKindAccess().getRangeKindKeyword_1());


            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeKind"


    // $ANTLR start "entryRuleDouble0"
    // InternalTargetEnvironmentParser.g:3901:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalTargetEnvironmentParser.g:3901:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalTargetEnvironmentParser.g:3902:2: iv_ruleDouble0= ruleDouble0 EOF
            {
             newCompositeNode(grammarAccess.getDouble0Rule());
            pushFollow(FOLLOW_1);
            iv_ruleDouble0=ruleDouble0();

            state._fsp--;

             current =iv_ruleDouble0.getText();
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalTargetEnvironmentParser.g:3908:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3914:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalTargetEnvironmentParser.g:3915:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2);

                    current.merge(this_DOUBLE_0);


                    newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalTargetEnvironmentParser.g:3925:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalTargetEnvironmentParser.g:3925:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalTargetEnvironmentParser.g:3926:2: iv_ruleInteger0= ruleInteger0 EOF
            {
             newCompositeNode(grammarAccess.getInteger0Rule());
            pushFollow(FOLLOW_1);
            iv_ruleInteger0=ruleInteger0();

            state._fsp--;

             current =iv_ruleInteger0.getText();
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalTargetEnvironmentParser.g:3932:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3938:2: (this_DECINT_0= RULE_DECINT )
            // InternalTargetEnvironmentParser.g:3939:2: this_DECINT_0= RULE_DECINT
            {
            this_DECINT_0=(Token)match(input,RULE_DECINT,FOLLOW_2);

                    current.merge(this_DECINT_0);


                    newLeafNode(this_DECINT_0, grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "entryRuleEString"
    // InternalTargetEnvironmentParser.g:3949:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTargetEnvironmentParser.g:3949:47: (iv_ruleEString= ruleEString EOF )
            // InternalTargetEnvironmentParser.g:3950:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule());
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText();
            match(input,EOF,FOLLOW_2);

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTargetEnvironmentParser.g:3956:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3962:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTargetEnvironmentParser.g:3963:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTargetEnvironmentParser.g:3963:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_ID) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3964:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3972:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2);

                                current.merge(this_ID_1);


                                newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());


                    }
                    break;

            }


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePreListElement"
    // InternalTargetEnvironmentParser.g:3983:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:3985:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalTargetEnvironmentParser.g:3986:2: iv_rulePreListElement= rulePreListElement EOF
            {
             newCompositeNode(grammarAccess.getPreListElementRule());
            pushFollow(FOLLOW_1);
            iv_rulePreListElement=rulePreListElement();

            state._fsp--;

             current =iv_rulePreListElement.getText();
            match(input,EOF,FOLLOW_2);

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

                myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePreListElement"


    // $ANTLR start "rulePreListElement"
    // InternalTargetEnvironmentParser.g:3995:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:4002:2: (kw= HyphenMinus )
            // InternalTargetEnvironmentParser.g:4003:2: kw= HyphenMinus
            {
            kw=(Token)match(input,HyphenMinus,FOLLOW_2);

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPreListElementAccess().getHyphenMinusKeyword());


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

                myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePreListElement"

    // Delegated rules




    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0100000000008800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0100040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0100000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0100000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0100000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0100000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0A00C00280000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000100100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000001010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000004CC0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0A00000C00000100L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000001000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000100100002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000100000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000004000000L});

}
