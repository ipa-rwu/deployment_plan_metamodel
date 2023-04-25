package de.fraunhofer.ipa.targetEnvironment.parser.antlr.internal;

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
import de.fraunhofer.ipa.targetEnvironment.services.TargetEnvironmentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetEnvironmentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "TargetDeployEnviroment", "ComputationDeviceType", "Processor_architecture", "RefConnectionProperty", "ConfigDeviceProperty", "LinuxOpertingSystem", "MacOSOpertingSystem", "ComputationResouce", "ComputationDevice", "ConfigConnection", "Configuration", "ConnectDevice", "DeviceResouce", "IncludeDevice", "RefConnection", "RefDeviceType", "AttributeKind", "SelectionKind", "Description", "DeviceType", "MaximumKind", "MinimumKind", "Core_number", "Properties", "Os_version", "RefDevice", "Processor", "RangeKind", "Container", "Interface", "Ethernet", "Address", "Device", "Os_name", "Debian", "Ubuntu", "Value", "Arm64", "Focal", "From", "Jammy", "Kind", "Name", "Type", "Wlan", "HyphenMinusHyphenMinusHyphenMinus", "X86", "HyphenMinus", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Core_number=27;
    public static final int Configuration=15;
    public static final int Address=36;
    public static final int ComputationResouce=12;
    public static final int AttributeKind=21;
    public static final int RefDeviceType=20;
    public static final int Name=47;
    public static final int Container=33;
    public static final int Debian=39;
    public static final int Kind=46;
    public static final int ConnectDevice=16;
    public static final int Ubuntu=40;
    public static final int RULE_DEDENT=58;
    public static final int LinuxOpertingSystem=10;
    public static final int RULE_ID=59;
    public static final int Device=37;
    public static final int ConfigConnection=14;
    public static final int RULE_DIGIT=53;
    public static final int HyphenMinusHyphenMinusHyphenMinus=50;
    public static final int SelectionKind=22;
    public static final int DeviceType=24;
    public static final int TargetDeployEnviroment=5;
    public static final int Arm64=42;
    public static final int RULE_INT=60;
    public static final int ComputationDevice=13;
    public static final int Ethernet=35;
    public static final int Value=41;
    public static final int RULE_ML_COMMENT=62;
    public static final int RefConnectionProperty=8;
    public static final int ConfigDeviceProperty=9;
    public static final int Description=23;
    public static final int Processor=31;
    public static final int RULE_STRING=61;
    public static final int Focal=43;
    public static final int Wlan=49;
    public static final int Properties=28;
    public static final int DeviceResouce=17;
    public static final int RULE_SL_COMMENT=56;
    public static final int CommunicationConnection=4;
    public static final int Os_name=38;
    public static final int HyphenMinus=52;
    public static final int RULE_DOUBLE=55;
    public static final int X86=51;
    public static final int RULE_DECINT=54;
    public static final int MinimumKind=26;
    public static final int EOF=-1;
    public static final int RULE_INDENT=57;
    public static final int Jammy=45;
    public static final int RefDevice=30;
    public static final int RULE_WS=63;
    public static final int MaximumKind=25;
    public static final int From=44;
    public static final int RULE_ANY_OTHER=64;
    public static final int ComputationDeviceType=6;
    public static final int Processor_architecture=7;
    public static final int RangeKind=32;
    public static final int Os_version=29;
    public static final int RefConnection=19;
    public static final int Type=48;
    public static final int MacOSOpertingSystem=11;
    public static final int IncludeDevice=18;
    public static final int Interface=34;

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
    // InternalTargetEnvironmentParser.g:58:1: entryRuleTargetEnvironment returns [EObject current=null] : iv_ruleTargetEnvironment= ruleTargetEnvironment EOF ;
    public final EObject entryRuleTargetEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetEnvironment = null;


        try {
            // InternalTargetEnvironmentParser.g:58:58: (iv_ruleTargetEnvironment= ruleTargetEnvironment EOF )
            // InternalTargetEnvironmentParser.g:59:2: iv_ruleTargetEnvironment= ruleTargetEnvironment EOF
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
    // InternalTargetEnvironmentParser.g:65:1: ruleTargetEnvironment returns [EObject current=null] : ( () ( (lv_type_1_0= ruleDescription ) ) ) ;
    public final EObject ruleTargetEnvironment() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:71:2: ( ( () ( (lv_type_1_0= ruleDescription ) ) ) )
            // InternalTargetEnvironmentParser.g:72:2: ( () ( (lv_type_1_0= ruleDescription ) ) )
            {
            // InternalTargetEnvironmentParser.g:72:2: ( () ( (lv_type_1_0= ruleDescription ) ) )
            // InternalTargetEnvironmentParser.g:73:3: () ( (lv_type_1_0= ruleDescription ) )
            {
            // InternalTargetEnvironmentParser.g:73:3: ()
            // InternalTargetEnvironmentParser.g:74:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getTargetEnvironmentAccess().getTargetEnvironmentAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:80:3: ( (lv_type_1_0= ruleDescription ) )
            // InternalTargetEnvironmentParser.g:81:4: (lv_type_1_0= ruleDescription )
            {
            // InternalTargetEnvironmentParser.g:81:4: (lv_type_1_0= ruleDescription )
            // InternalTargetEnvironmentParser.g:82:5: lv_type_1_0= ruleDescription
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
    // InternalTargetEnvironmentParser.g:103:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalTargetEnvironmentParser.g:103:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalTargetEnvironmentParser.g:104:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalTargetEnvironmentParser.g:110:1: ruleDescription returns [EObject current=null] : (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceSet_0 = null;

        EObject this_TargetDeployEnviroment_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:116:2: ( (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment ) )
            // InternalTargetEnvironmentParser.g:117:2: (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment )
            {
            // InternalTargetEnvironmentParser.g:117:2: (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment )
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
                    // InternalTargetEnvironmentParser.g:118:3: this_DeviceSet_0= ruleDeviceSet
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
                    // InternalTargetEnvironmentParser.g:127:3: this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment
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
    // InternalTargetEnvironmentParser.g:139:1: entryRuleTargetDeployEnviroment returns [EObject current=null] : iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF ;
    public final EObject entryRuleTargetDeployEnviroment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetDeployEnviroment = null;


        try {
            // InternalTargetEnvironmentParser.g:139:63: (iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF )
            // InternalTargetEnvironmentParser.g:140:2: iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF
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
    // InternalTargetEnvironmentParser.g:146:1: ruleTargetDeployEnviroment returns [EObject current=null] : ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:152:2: ( ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:153:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:153:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:154:3: () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:154:3: ()
            // InternalTargetEnvironmentParser.g:155:4:
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

            // InternalTargetEnvironmentParser.g:173:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:174:4: (lv_name_4_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:174:4: (lv_name_4_0= ruleEString )
            // InternalTargetEnvironmentParser.g:175:5: lv_name_4_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:192:3: (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IncludeDevice) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:193:4: otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,IncludeDevice,FOLLOW_3);

                                    newLeafNode(otherlv_5, grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_6, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_1());

                    otherlv_7=(Token)match(input,ComputationDevice,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getTargetDeployEnviromentAccess().getComputationDeviceKeyword_5_2());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_8, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_3());

                    // InternalTargetEnvironmentParser.g:209:4: ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+
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
                            // InternalTargetEnvironmentParser.g:210:5: (lv_includeDevice_9_0= ruleComputationDeviceInstance )
                            {
                            // InternalTargetEnvironmentParser.g:210:5: (lv_includeDevice_9_0= ruleComputationDeviceInstance )
                            // InternalTargetEnvironmentParser.g:211:6: lv_includeDevice_9_0= ruleComputationDeviceInstance
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

                    // InternalTargetEnvironmentParser.g:240:4: ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+
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
                            // InternalTargetEnvironmentParser.g:241:5: (lv_includeDevice_13_0= ruleDeviceInstance )
                            {
                            // InternalTargetEnvironmentParser.g:241:5: (lv_includeDevice_13_0= ruleDeviceInstance )
                            // InternalTargetEnvironmentParser.g:242:6: lv_includeDevice_13_0= ruleDeviceInstance
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

            // InternalTargetEnvironmentParser.g:268:3: (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ConfigConnection) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:269:4: otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnection_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT
                    {
                    otherlv_16=(Token)match(input,ConfigConnection,FOLLOW_3);

                                    newLeafNode(otherlv_16, grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionKeyword_6_0());

                    this_INDENT_17=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_17, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:277:4: ( (lv_configConnection_18_0= ruleConfigConnection ) )+
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
                            // InternalTargetEnvironmentParser.g:278:5: (lv_configConnection_18_0= ruleConfigConnection )
                            {
                            // InternalTargetEnvironmentParser.g:278:5: (lv_configConnection_18_0= ruleConfigConnection )
                            // InternalTargetEnvironmentParser.g:279:6: lv_configConnection_18_0= ruleConfigConnection
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
    // InternalTargetEnvironmentParser.g:309:1: entryRuleDeviceInstance returns [EObject current=null] : iv_ruleDeviceInstance= ruleDeviceInstance EOF ;
    public final EObject entryRuleDeviceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceInstance = null;


        try {
            // InternalTargetEnvironmentParser.g:309:55: (iv_ruleDeviceInstance= ruleDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:310:2: iv_ruleDeviceInstance= ruleDeviceInstance EOF
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
    // InternalTargetEnvironmentParser.g:316:1: ruleDeviceInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:322:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:323:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:323:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:324:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getDeviceInstanceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getDeviceInstanceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:335:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:336:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:336:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:337:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:362:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:363:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:363:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:364:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:378:3: (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ConfigDeviceProperty) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:379:4: otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,ConfigDeviceProperty,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getDeviceInstanceAccess().getConfigDevicePropertyKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_7, grammarAccess.getDeviceInstanceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:387:4: ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+
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
                            // InternalTargetEnvironmentParser.g:388:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                            {
                            // InternalTargetEnvironmentParser.g:388:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                            // InternalTargetEnvironmentParser.g:389:6: lv_configDeviceProperty_8_0= ruleConfigDeviceProperty
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
    // InternalTargetEnvironmentParser.g:419:1: entryRuleComputationDeviceInstance returns [EObject current=null] : iv_ruleComputationDeviceInstance= ruleComputationDeviceInstance EOF ;
    public final EObject entryRuleComputationDeviceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceInstance = null;


        try {
            // InternalTargetEnvironmentParser.g:419:66: (iv_ruleComputationDeviceInstance= ruleComputationDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:420:2: iv_ruleComputationDeviceInstance= ruleComputationDeviceInstance EOF
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
    // InternalTargetEnvironmentParser.g:426:1: ruleComputationDeviceInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleComputationDeviceInstance() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:432:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:433:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:433:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:434:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getComputationDeviceInstanceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getComputationDeviceInstanceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:445:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:446:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:446:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:447:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:472:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:473:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:473:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:474:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getComputationDeviceInstanceRule());
                                }


                                newCompositeNode(grammarAccess.getComputationDeviceInstanceAccess().getRefDeviceTypeComputationDeviceTypeCrossReference_5_0());

            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:488:3: (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ConfigDeviceProperty) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:489:4: otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,ConfigDeviceProperty,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getComputationDeviceInstanceAccess().getConfigDevicePropertyKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_7, grammarAccess.getComputationDeviceInstanceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:497:4: ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+
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
                            // InternalTargetEnvironmentParser.g:498:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                            {
                            // InternalTargetEnvironmentParser.g:498:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                            // InternalTargetEnvironmentParser.g:499:6: lv_configDeviceProperty_8_0= ruleConfigDeviceProperty
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceInstanceAccess().getConfigDevicePropertyConfigDevicePropertyParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_9);
                            lv_configDeviceProperty_8_0=ruleConfigDeviceProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getComputationDeviceInstanceRule());
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
                            if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_9, grammarAccess.getComputationDeviceInstanceAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_10, grammarAccess.getComputationDeviceInstanceAccess().getDEDENTTerminalRuleCall_7());


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
    // InternalTargetEnvironmentParser.g:529:1: entryRuleConfigConnection returns [EObject current=null] : iv_ruleConfigConnection= ruleConfigConnection EOF ;
    public final EObject entryRuleConfigConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:529:57: (iv_ruleConfigConnection= ruleConfigConnection EOF )
            // InternalTargetEnvironmentParser.g:530:2: iv_ruleConfigConnection= ruleConfigConnection EOF
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
    // InternalTargetEnvironmentParser.g:536:1: ruleConfigConnection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:542:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:543:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:543:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:544:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getConfigConnectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConfigConnectionAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:555:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:556:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:556:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:557:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:586:3: ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==HyphenMinus) ) {
                    alt11=1;
                }


                switch (alt11) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:587:4: (lv_connectDevice_6_0= ruleConnectedDevice )
                    {
                    // InternalTargetEnvironmentParser.g:587:4: (lv_connectDevice_6_0= ruleConnectedDevice )
                    // InternalTargetEnvironmentParser.g:588:5: lv_connectDevice_6_0= ruleConnectedDevice
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
                    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalTargetEnvironmentParser.g:617:1: entryRuleConnectedDevice returns [EObject current=null] : iv_ruleConnectedDevice= ruleConnectedDevice EOF ;
    public final EObject entryRuleConnectedDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectedDevice = null;


        try {
            // InternalTargetEnvironmentParser.g:617:56: (iv_ruleConnectedDevice= ruleConnectedDevice EOF )
            // InternalTargetEnvironmentParser.g:618:2: iv_ruleConnectedDevice= ruleConnectedDevice EOF
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
    // InternalTargetEnvironmentParser.g:624:1: ruleConnectedDevice returns [EObject current=null] : ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:630:2: ( ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:631:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:631:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:632:3: rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_16);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,RefDevice,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConnectedDeviceAccess().getRefDeviceKeyword_1());

            // InternalTargetEnvironmentParser.g:643:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:644:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:644:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:645:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:667:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:668:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:668:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:669:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:683:3: (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Configuration) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:684:4: otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Configuration,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getConnectedDeviceAccess().getConfigurationKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_7, grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:692:4: ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==HyphenMinus) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:693:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                            {
                            // InternalTargetEnvironmentParser.g:693:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                            // InternalTargetEnvironmentParser.g:694:6: lv_properties_8_0= ruleConfigConnectionProperty
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
                            if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
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
    // InternalTargetEnvironmentParser.g:724:1: entryRuleConfigConnectionProperty returns [EObject current=null] : iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF ;
    public final EObject entryRuleConfigConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:724:65: (iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:725:2: iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:731:1: ruleConfigConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:737:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:738:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:738:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:739:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:739:3: ()
            // InternalTargetEnvironmentParser.g:740:4:
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

            // InternalTargetEnvironmentParser.g:757:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:758:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:758:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:759:5: lv_name_3_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:784:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:785:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:785:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:786:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:800:3: (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Value) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:801:4: otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) )
                    {
                    otherlv_7=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_7, grammarAccess.getConfigConnectionPropertyAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:805:4: ( (lv_value_8_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:806:5: (lv_value_8_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:806:5: (lv_value_8_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:807:6: lv_value_8_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:833:1: entryRuleConfigDeviceProperty returns [EObject current=null] : iv_ruleConfigDeviceProperty= ruleConfigDeviceProperty EOF ;
    public final EObject entryRuleConfigDeviceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigDeviceProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:833:61: (iv_ruleConfigDeviceProperty= ruleConfigDeviceProperty EOF )
            // InternalTargetEnvironmentParser.g:834:2: iv_ruleConfigDeviceProperty= ruleConfigDeviceProperty EOF
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
    // InternalTargetEnvironmentParser.g:840:1: ruleConfigDeviceProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:846:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:847:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:847:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:848:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getConfigDevicePropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConfigDevicePropertyAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:859:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:860:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:860:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:861:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:886:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:887:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:887:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:888:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigDevicePropertyRule());
                                }


                                newCompositeNode(grammarAccess.getConfigDevicePropertyAccess().getRefPropertyAbstractPropertyCrossReference_5_0());

            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_6=(Token)match(input,Value,FOLLOW_21);

                        newLeafNode(otherlv_6, grammarAccess.getConfigDevicePropertyAccess().getValueKeyword_6());

            // InternalTargetEnvironmentParser.g:906:3: ( (lv_value_7_0= rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:907:4: (lv_value_7_0= rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:907:4: (lv_value_7_0= rulePropertyValue )
            // InternalTargetEnvironmentParser.g:908:5: lv_value_7_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:933:1: entryRuleDeviceSet returns [EObject current=null] : iv_ruleDeviceSet= ruleDeviceSet EOF ;
    public final EObject entryRuleDeviceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceSet = null;


        try {
            // InternalTargetEnvironmentParser.g:933:50: (iv_ruleDeviceSet= ruleDeviceSet EOF )
            // InternalTargetEnvironmentParser.g:934:2: iv_ruleDeviceSet= ruleDeviceSet EOF
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
    // InternalTargetEnvironmentParser.g:940:1: ruleDeviceSet returns [EObject current=null] : ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* ) ;
    public final EObject ruleDeviceSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_device_0_0 = null;

        EObject lv_device_2_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:946:2: ( ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* ) )
            // InternalTargetEnvironmentParser.g:947:2: ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* )
            {
            // InternalTargetEnvironmentParser.g:947:2: ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* )
            // InternalTargetEnvironmentParser.g:948:3: ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )*
            {
            // InternalTargetEnvironmentParser.g:948:3: ( (lv_device_0_0= ruleDeviceType ) )
            // InternalTargetEnvironmentParser.g:949:4: (lv_device_0_0= ruleDeviceType )
            {
            // InternalTargetEnvironmentParser.g:949:4: (lv_device_0_0= ruleDeviceType )
            // InternalTargetEnvironmentParser.g:950:5: lv_device_0_0= ruleDeviceType
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

            // InternalTargetEnvironmentParser.g:967:3: (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==HyphenMinusHyphenMinusHyphenMinus) ) {
                    alt15=1;
                }


                switch (alt15) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:968:4: otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) )
                    {
                    otherlv_1=(Token)match(input,HyphenMinusHyphenMinusHyphenMinus,FOLLOW_25);

                                    newLeafNode(otherlv_1, grammarAccess.getDeviceSetAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_1_0());

                    // InternalTargetEnvironmentParser.g:972:4: ( (lv_device_2_0= ruleDeviceType ) )
                    // InternalTargetEnvironmentParser.g:973:5: (lv_device_2_0= ruleDeviceType )
                    {
                    // InternalTargetEnvironmentParser.g:973:5: (lv_device_2_0= ruleDeviceType )
                    // InternalTargetEnvironmentParser.g:974:6: lv_device_2_0= ruleDeviceType
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
                    break loop15;
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
    // InternalTargetEnvironmentParser.g:996:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalTargetEnvironmentParser.g:996:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalTargetEnvironmentParser.g:997:2: iv_ruleDeviceType= ruleDeviceType EOF
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
    // InternalTargetEnvironmentParser.g:1003:1: ruleDeviceType returns [EObject current=null] : (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceType_Impl_0 = null;

        EObject this_ComputationDeviceType_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1009:2: ( (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) )
            // InternalTargetEnvironmentParser.g:1010:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            {
            // InternalTargetEnvironmentParser.g:1010:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==DeviceType) ) {
                alt16=1;
            }
            else if ( (LA16_0==ComputationDeviceType) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1011:3: this_DeviceType_Impl_0= ruleDeviceType_Impl
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
                    // InternalTargetEnvironmentParser.g:1020:3: this_ComputationDeviceType_1= ruleComputationDeviceType
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
    // InternalTargetEnvironmentParser.g:1032:1: entryRuleAbstractCommunicationConnection returns [EObject current=null] : iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF ;
    public final EObject entryRuleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommunicationConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:1032:72: (iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:1033:2: iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF
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
    // InternalTargetEnvironmentParser.g:1039:1: ruleAbstractCommunicationConnection returns [EObject current=null] : (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) ;
    public final EObject ruleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationConnection_0 = null;

        EObject this_NetworkConnection_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1045:2: ( (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) )
            // InternalTargetEnvironmentParser.g:1046:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            {
            // InternalTargetEnvironmentParser.g:1046:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinus) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==Name) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==RULE_STRING) ) {
                        int LA17_3 = input.LA(4);

                        if ( (LA17_3==RULE_INDENT) ) {
                            int LA17_5 = input.LA(5);

                            if ( (LA17_5==Type) ) {
                                int LA17_6 = input.LA(6);

                                if ( (LA17_6==RULE_ID||LA17_6==RULE_STRING) ) {
                                    alt17=1;
                                }
                                else if ( (LA17_6==Ethernet||LA17_6==Wlan) ) {
                                    alt17=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 17, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA17_2==RULE_ID) ) {
                        int LA17_4 = input.LA(4);

                        if ( (LA17_4==RULE_INDENT) ) {
                            int LA17_5 = input.LA(5);

                            if ( (LA17_5==Type) ) {
                                int LA17_6 = input.LA(6);

                                if ( (LA17_6==RULE_ID||LA17_6==RULE_STRING) ) {
                                    alt17=1;
                                }
                                else if ( (LA17_6==Ethernet||LA17_6==Wlan) ) {
                                    alt17=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 17, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1047:3: this_CommunicationConnection_0= ruleCommunicationConnection
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
                    // InternalTargetEnvironmentParser.g:1056:3: this_NetworkConnection_1= ruleNetworkConnection
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
    // InternalTargetEnvironmentParser.g:1068:1: entryRuleAbstractNetworkProperty returns [EObject current=null] : iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF ;
    public final EObject entryRuleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1068:64: (iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1069:2: iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:1075:1: ruleAbstractNetworkProperty returns [EObject current=null] : (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) ;
    public final EObject ruleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceNetworkProperty_0 = null;

        EObject this_AddressNetworkProperty_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1081:2: ( (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) )
            // InternalTargetEnvironmentParser.g:1082:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            {
            // InternalTargetEnvironmentParser.g:1082:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==HyphenMinus) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==Name) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==Address) ) {
                        alt18=2;
                    }
                    else if ( (LA18_2==Interface) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1083:3: this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty
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
                    // InternalTargetEnvironmentParser.g:1092:3: this_AddressNetworkProperty_1= ruleAddressNetworkProperty
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
    // InternalTargetEnvironmentParser.g:1104:1: entryRuleInterfaceNetworkProperty returns [EObject current=null] : iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF ;
    public final EObject entryRuleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1104:65: (iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1105:2: iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:1111:1: ruleInterfaceNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:1117:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1118:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1118:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1119:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1119:3: ()
            // InternalTargetEnvironmentParser.g:1120:4:
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

            // InternalTargetEnvironmentParser.g:1137:3: ( (lv_name_3_0= Interface ) )
            // InternalTargetEnvironmentParser.g:1138:4: (lv_name_3_0= Interface )
            {
            // InternalTargetEnvironmentParser.g:1138:4: (lv_name_3_0= Interface )
            // InternalTargetEnvironmentParser.g:1139:5: lv_name_3_0= Interface
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

            // InternalTargetEnvironmentParser.g:1159:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1160:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1160:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1161:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:1178:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Description) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1179:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1183:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1184:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1184:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1185:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:1203:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Value) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1204:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1208:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1209:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1209:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1210:6: lv_value_10_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:1236:1: entryRuleAddressNetworkProperty returns [EObject current=null] : iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF ;
    public final EObject entryRuleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1236:63: (iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1237:2: iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:1243:1: ruleAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:1249:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1250:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1250:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1251:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1251:3: ()
            // InternalTargetEnvironmentParser.g:1252:4:
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

            // InternalTargetEnvironmentParser.g:1269:3: ( (lv_name_3_0= Address ) )
            // InternalTargetEnvironmentParser.g:1270:4: (lv_name_3_0= Address )
            {
            // InternalTargetEnvironmentParser.g:1270:4: (lv_name_3_0= Address )
            // InternalTargetEnvironmentParser.g:1271:5: lv_name_3_0= Address
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

            // InternalTargetEnvironmentParser.g:1291:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1292:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1292:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1293:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:1310:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Description) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1311:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1315:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1316:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1316:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1317:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:1335:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1336:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1340:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1341:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1341:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1342:6: lv_value_10_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:1368:1: entryRuleDeviceType_Impl returns [EObject current=null] : iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF ;
    public final EObject entryRuleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType_Impl = null;


        try {
            // InternalTargetEnvironmentParser.g:1368:56: (iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF )
            // InternalTargetEnvironmentParser.g:1369:2: iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF
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
    // InternalTargetEnvironmentParser.g:1375:1: ruleDeviceType_Impl returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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

        EObject lv_deviceResource_7_0 = null;

        EObject lv_communicationConnection_11_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1381:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1382:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1382:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1383:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1383:3: ()
            // InternalTargetEnvironmentParser.g:1384:4:
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

            // InternalTargetEnvironmentParser.g:1402:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1403:4: (lv_name_4_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1403:4: (lv_name_4_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1404:5: lv_name_4_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:1421:3: (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==DeviceResouce) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1422:4: otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,DeviceResouce,FOLLOW_3);

                                    newLeafNode(otherlv_5, grammarAccess.getDeviceType_ImplAccess().getDeviceResouceKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_6, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalTargetEnvironmentParser.g:1430:4: ( (lv_deviceResource_7_0= ruleDeviceResource ) )+
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
                            // InternalTargetEnvironmentParser.g:1431:5: (lv_deviceResource_7_0= ruleDeviceResource )
                            {
                            // InternalTargetEnvironmentParser.g:1431:5: (lv_deviceResource_7_0= ruleDeviceResource )
                            // InternalTargetEnvironmentParser.g:1432:6: lv_deviceResource_7_0= ruleDeviceResource
                            {

                                                    newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getDeviceResourceDeviceResourceParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_9);
                            lv_deviceResource_7_0=ruleDeviceResource();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getDeviceType_ImplRule());
                                                    }
                                                    add(
                                                        current,
                                                        "deviceResource",
                                                        lv_deviceResource_7_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.DeviceResource");
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

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_32);

                                    newLeafNode(this_DEDENT_8, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1454:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==CommunicationConnection) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1455:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_10, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:1463:4: ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==HyphenMinus) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:1464:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                            {
                            // InternalTargetEnvironmentParser.g:1464:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                            // InternalTargetEnvironmentParser.g:1465:6: lv_communicationConnection_11_0= ruleAbstractCommunicationConnection
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
                            if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
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


    // $ANTLR start "entryRuleAbstractComputationResource"
    // InternalTargetEnvironmentParser.g:1495:1: entryRuleAbstractComputationResource returns [EObject current=null] : iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF ;
    public final EObject entryRuleAbstractComputationResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComputationResource = null;


        try {
            // InternalTargetEnvironmentParser.g:1495:68: (iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF )
            // InternalTargetEnvironmentParser.g:1496:2: iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF
            {
             newCompositeNode(grammarAccess.getAbstractComputationResourceRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComputationResource=ruleAbstractComputationResource();

            state._fsp--;

             current =iv_ruleAbstractComputationResource;
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
    // $ANTLR end "entryRuleAbstractComputationResource"


    // $ANTLR start "ruleAbstractComputationResource"
    // InternalTargetEnvironmentParser.g:1502:1: ruleAbstractComputationResource returns [EObject current=null] : (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce ) ;
    public final EObject ruleAbstractComputationResource() throws RecognitionException {
        EObject current = null;

        EObject this_OperatingSystemResouce_0 = null;

        EObject this_ProcessorResouce_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1508:2: ( (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce ) )
            // InternalTargetEnvironmentParser.g:1509:2: (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce )
            {
            // InternalTargetEnvironmentParser.g:1509:2: (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==HyphenMinus) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==Name) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==RULE_STRING) ) {
                        int LA27_3 = input.LA(4);

                        if ( (LA27_3==RULE_INDENT) ) {
                            int LA27_5 = input.LA(5);

                            if ( (LA27_5==Type) ) {
                                int LA27_6 = input.LA(6);

                                if ( (LA27_6==Processor) ) {
                                    alt27=2;
                                }
                                else if ( ((LA27_6>=LinuxOpertingSystem && LA27_6<=MacOSOpertingSystem)) ) {
                                    alt27=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 27, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA27_2==RULE_ID) ) {
                        int LA27_4 = input.LA(4);

                        if ( (LA27_4==RULE_INDENT) ) {
                            int LA27_5 = input.LA(5);

                            if ( (LA27_5==Type) ) {
                                int LA27_6 = input.LA(6);

                                if ( (LA27_6==Processor) ) {
                                    alt27=2;
                                }
                                else if ( ((LA27_6>=LinuxOpertingSystem && LA27_6<=MacOSOpertingSystem)) ) {
                                    alt27=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 27, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 27, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1510:3: this_OperatingSystemResouce_0= ruleOperatingSystemResouce
                    {

                                newCompositeNode(grammarAccess.getAbstractComputationResourceAccess().getOperatingSystemResouceParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_OperatingSystemResouce_0=ruleOperatingSystemResouce();

                    state._fsp--;


                                current = this_OperatingSystemResouce_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:1519:3: this_ProcessorResouce_1= ruleProcessorResouce
                    {

                                newCompositeNode(grammarAccess.getAbstractComputationResourceAccess().getProcessorResouceParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_ProcessorResouce_1=ruleProcessorResouce();

                    state._fsp--;


                                current = this_ProcessorResouce_1;
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
    // $ANTLR end "ruleAbstractComputationResource"


    // $ANTLR start "entryRuleDeviceResource"
    // InternalTargetEnvironmentParser.g:1531:1: entryRuleDeviceResource returns [EObject current=null] : iv_ruleDeviceResource= ruleDeviceResource EOF ;
    public final EObject entryRuleDeviceResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceResource = null;


        try {
            // InternalTargetEnvironmentParser.g:1531:55: (iv_ruleDeviceResource= ruleDeviceResource EOF )
            // InternalTargetEnvironmentParser.g:1532:2: iv_ruleDeviceResource= ruleDeviceResource EOF
            {
             newCompositeNode(grammarAccess.getDeviceResourceRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeviceResource=ruleDeviceResource();

            state._fsp--;

             current =iv_ruleDeviceResource;
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
    // $ANTLR end "entryRuleDeviceResource"


    // $ANTLR start "ruleDeviceResource"
    // InternalTargetEnvironmentParser.g:1538:1: ruleDeviceResource returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleDeviceResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_INDENT_7=null;
        Token this_DEDENT_10=null;
        Token this_DEDENT_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_9_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1544:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1545:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1545:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1546:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getDeviceResourceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getDeviceResourceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:1557:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1558:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1558:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1559:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceResourceAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeviceResourceRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_33);

                        newLeafNode(this_INDENT_3, grammarAccess.getDeviceResourceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getDeviceResourceAccess().getTypeKeyword_4());

            // InternalTargetEnvironmentParser.g:1584:3: ( (lv_type_5_0= ruleAbstractResouceType ) )
            // InternalTargetEnvironmentParser.g:1585:4: (lv_type_5_0= ruleAbstractResouceType )
            {
            // InternalTargetEnvironmentParser.g:1585:4: (lv_type_5_0= ruleAbstractResouceType )
            // InternalTargetEnvironmentParser.g:1586:5: lv_type_5_0= ruleAbstractResouceType
            {

                                newCompositeNode(grammarAccess.getDeviceResourceAccess().getTypeAbstractResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_34);
            lv_type_5_0=ruleAbstractResouceType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeviceResourceRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.AbstractResouceType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1603:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Properties) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1604:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getDeviceResourceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_7, grammarAccess.getDeviceResourceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:1612:4: ( (lv_properties_8_0= ruleAbstractProperty ) )
                    // InternalTargetEnvironmentParser.g:1613:5: (lv_properties_8_0= ruleAbstractProperty )
                    {
                    // InternalTargetEnvironmentParser.g:1613:5: (lv_properties_8_0= ruleAbstractProperty )
                    // InternalTargetEnvironmentParser.g:1614:6: lv_properties_8_0= ruleAbstractProperty
                    {

                                            newCompositeNode(grammarAccess.getDeviceResourceAccess().getPropertiesAbstractPropertyParserRuleCall_6_2_0());

                    pushFollow(FOLLOW_9);
                    lv_properties_8_0=ruleAbstractProperty();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getDeviceResourceRule());
                                            }
                                            add(
                                                current,
                                                "properties",
                                                lv_properties_8_0,
                                                "de.fraunhofer.ipa.deployment.Util.AbstractProperty");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalTargetEnvironmentParser.g:1631:4: ( (lv_properties_9_0= ruleAbstractProperty ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==HyphenMinus) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:1632:5: (lv_properties_9_0= ruleAbstractProperty )
                            {
                            // InternalTargetEnvironmentParser.g:1632:5: (lv_properties_9_0= ruleAbstractProperty )
                            // InternalTargetEnvironmentParser.g:1633:6: lv_properties_9_0= ruleAbstractProperty
                            {

                                                    newCompositeNode(grammarAccess.getDeviceResourceAccess().getPropertiesAbstractPropertyParserRuleCall_6_3_0());

                            pushFollow(FOLLOW_9);
                            lv_properties_9_0=ruleAbstractProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getDeviceResourceRule());
                                                    }
                                                    add(
                                                        current,
                                                        "properties",
                                                        lv_properties_9_0,
                                                        "de.fraunhofer.ipa.deployment.Util.AbstractProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            break loop28;
                        }
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getDeviceResourceAccess().getDEDENTTerminalRuleCall_6_4());


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getDeviceResourceAccess().getDEDENTTerminalRuleCall_7());


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
    // $ANTLR end "ruleDeviceResource"


    // $ANTLR start "entryRuleComputationDeviceType"
    // InternalTargetEnvironmentParser.g:1663:1: entryRuleComputationDeviceType returns [EObject current=null] : iv_ruleComputationDeviceType= ruleComputationDeviceType EOF ;
    public final EObject entryRuleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceType = null;


        try {
            // InternalTargetEnvironmentParser.g:1663:62: (iv_ruleComputationDeviceType= ruleComputationDeviceType EOF )
            // InternalTargetEnvironmentParser.g:1664:2: iv_ruleComputationDeviceType= ruleComputationDeviceType EOF
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
    // InternalTargetEnvironmentParser.g:1670:1: ruleComputationDeviceType returns [EObject current=null] : (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
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
        Token otherlv_12=null;
        Token this_INDENT_13=null;
        Token this_DEDENT_15=null;
        Token this_DEDENT_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_deviceResource_6_0 = null;

        EObject lv_computationResource_10_0 = null;

        EObject lv_communicationConnection_14_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1676:2: ( (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1677:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1677:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1678:3: otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ComputationDeviceType,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_1, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1690:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1691:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1691:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1692:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_35);
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

            // InternalTargetEnvironmentParser.g:1709:3: (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==DeviceResouce) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1710:4: otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,DeviceResouce,FOLLOW_3);

                                    newLeafNode(otherlv_4, grammarAccess.getComputationDeviceTypeAccess().getDeviceResouceKeyword_4_0());

                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_5, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1());

                    // InternalTargetEnvironmentParser.g:1718:4: ( (lv_deviceResource_6_0= ruleDeviceResource ) )+
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
                            // InternalTargetEnvironmentParser.g:1719:5: (lv_deviceResource_6_0= ruleDeviceResource )
                            {
                            // InternalTargetEnvironmentParser.g:1719:5: (lv_deviceResource_6_0= ruleDeviceResource )
                            // InternalTargetEnvironmentParser.g:1720:6: lv_deviceResource_6_0= ruleDeviceResource
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getDeviceResourceDeviceResourceParserRuleCall_4_2_0());

                            pushFollow(FOLLOW_9);
                            lv_deviceResource_6_0=ruleDeviceResource();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                                                    }
                                                    add(
                                                        current,
                                                        "deviceResource",
                                                        lv_deviceResource_6_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.DeviceResource");
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

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_36);

                                    newLeafNode(this_DEDENT_7, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1742:3: (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ComputationResouce) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1743:4: otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,ComputationResouce,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getComputationDeviceTypeAccess().getComputationResouceKeyword_5_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_9, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalTargetEnvironmentParser.g:1751:4: ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==HyphenMinus) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:1752:5: (lv_computationResource_10_0= ruleAbstractComputationResource )
                            {
                            // InternalTargetEnvironmentParser.g:1752:5: (lv_computationResource_10_0= ruleAbstractComputationResource )
                            // InternalTargetEnvironmentParser.g:1753:6: lv_computationResource_10_0= ruleAbstractComputationResource
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getComputationResourceAbstractComputationResourceParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_9);
                            lv_computationResource_10_0=ruleAbstractComputationResource();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                                                    }
                                                    add(
                                                        current,
                                                        "computationResource",
                                                        lv_computationResource_10_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstractComputationResource");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_32);

                                    newLeafNode(this_DEDENT_11, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1775:3: (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==CommunicationConnection) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1776:4: otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_12=(Token)match(input,CommunicationConnection,FOLLOW_3);

                                    newLeafNode(otherlv_12, grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_13=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_13, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:1784:4: ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+
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
                            // InternalTargetEnvironmentParser.g:1785:5: (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection )
                            {
                            // InternalTargetEnvironmentParser.g:1785:5: (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection )
                            // InternalTargetEnvironmentParser.g:1786:6: lv_communicationConnection_14_0= ruleAbstractCommunicationConnection
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_9);
                            lv_communicationConnection_14_0=ruleAbstractCommunicationConnection();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                                                    }
                                                    add(
                                                        current,
                                                        "communicationConnection",
                                                        lv_communicationConnection_14_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstractCommunicationConnection");
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

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_16, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_7());


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
    // InternalTargetEnvironmentParser.g:1816:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1816:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:1817:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:1823:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:1829:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1830:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1830:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1831:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1831:3: ()
            // InternalTargetEnvironmentParser.g:1832:4:
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

            // InternalTargetEnvironmentParser.g:1849:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1850:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1850:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1851:5: lv_name_3_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:1876:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1877:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1877:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1878:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:1895:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Description) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1896:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getConnectionPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1900:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1901:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1901:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1902:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:1920:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Value) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1921:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getConnectionPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1925:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1926:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1926:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1927:6: lv_value_10_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:1953:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:1953:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalTargetEnvironmentParser.g:1954:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
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
    // InternalTargetEnvironmentParser.g:1960:1: ruleNetworkConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:1966:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1967:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1967:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1968:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1968:3: ()
            // InternalTargetEnvironmentParser.g:1969:4:
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

            // InternalTargetEnvironmentParser.g:1986:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1987:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1987:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1988:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_33);

                        newLeafNode(this_INDENT_4, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_37);

                        newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:2013:3: ( (lv_type_6_0= ruleNetworkCommunicationType ) )
            // InternalTargetEnvironmentParser.g:2014:4: (lv_type_6_0= ruleNetworkCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:2014:4: (lv_type_6_0= ruleNetworkCommunicationType )
            // InternalTargetEnvironmentParser.g:2015:5: lv_type_6_0= ruleNetworkCommunicationType
            {

                                newCompositeNode(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_34);
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

            // InternalTargetEnvironmentParser.g:2032:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Properties) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2033:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_8, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:2041:4: ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==HyphenMinus) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:2042:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                            {
                            // InternalTargetEnvironmentParser.g:2042:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                            // InternalTargetEnvironmentParser.g:2043:6: lv_properties_9_0= ruleAbstractNetworkProperty
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
                            if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
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
    // InternalTargetEnvironmentParser.g:2073:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:2073:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:2074:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
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
    // InternalTargetEnvironmentParser.g:2080:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:2086:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2087:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2087:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2088:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2088:3: ()
            // InternalTargetEnvironmentParser.g:2089:4:
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

            // InternalTargetEnvironmentParser.g:2106:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2107:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2107:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2108:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_33);

                        newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_5);

                        newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:2133:3: ( (lv_type_6_0= ruleCommunicationType ) )
            // InternalTargetEnvironmentParser.g:2134:4: (lv_type_6_0= ruleCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:2134:4: (lv_type_6_0= ruleCommunicationType )
            // InternalTargetEnvironmentParser.g:2135:5: lv_type_6_0= ruleCommunicationType
            {

                                newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_34);
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

            // InternalTargetEnvironmentParser.g:2152:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Properties) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2153:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:2161:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==HyphenMinus) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:2162:5: (lv_properties_9_0= ruleConnectionProperty )
                            {
                            // InternalTargetEnvironmentParser.g:2162:5: (lv_properties_9_0= ruleConnectionProperty )
                            // InternalTargetEnvironmentParser.g:2163:6: lv_properties_9_0= ruleConnectionProperty
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
                            if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
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


    // $ANTLR start "entryRuleOperatingSystemResouce"
    // InternalTargetEnvironmentParser.g:2193:1: entryRuleOperatingSystemResouce returns [EObject current=null] : iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF ;
    public final EObject entryRuleOperatingSystemResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatingSystemResouce = null;


        try {
            // InternalTargetEnvironmentParser.g:2193:63: (iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF )
            // InternalTargetEnvironmentParser.g:2194:2: iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF
            {
             newCompositeNode(grammarAccess.getOperatingSystemResouceRule());
            pushFollow(FOLLOW_1);
            iv_ruleOperatingSystemResouce=ruleOperatingSystemResouce();

            state._fsp--;

             current =iv_ruleOperatingSystemResouce;
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
    // $ANTLR end "entryRuleOperatingSystemResouce"


    // $ANTLR start "ruleOperatingSystemResouce"
    // InternalTargetEnvironmentParser.g:2200:1: ruleOperatingSystemResouce returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleOperatingSystemResouce() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:2206:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2207:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2207:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2208:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2208:3: ()
            // InternalTargetEnvironmentParser.g:2209:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getOperatingSystemResouceAccess().getOperatingSystemResouceAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getOperatingSystemResouceAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2226:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2227:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2227:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2228:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getOperatingSystemResouceRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_33);

                        newLeafNode(this_INDENT_4, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_38);

                        newLeafNode(otherlv_5, grammarAccess.getOperatingSystemResouceAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:2253:3: ( (lv_type_6_0= ruleOpertingSystemResouceType ) )
            // InternalTargetEnvironmentParser.g:2254:4: (lv_type_6_0= ruleOpertingSystemResouceType )
            {
            // InternalTargetEnvironmentParser.g:2254:4: (lv_type_6_0= ruleOpertingSystemResouceType )
            // InternalTargetEnvironmentParser.g:2255:5: lv_type_6_0= ruleOpertingSystemResouceType
            {

                                newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getTypeOpertingSystemResouceTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_34);
            lv_type_6_0=ruleOpertingSystemResouceType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getOperatingSystemResouceRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.OpertingSystemResouceType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2272:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Properties) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2273:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getOperatingSystemResouceAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_8, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:2281:4: ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==HyphenMinus) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:2282:5: (lv_properties_9_0= ruleAbstractOperatingSystemProperty )
                            {
                            // InternalTargetEnvironmentParser.g:2282:5: (lv_properties_9_0= ruleAbstractOperatingSystemProperty )
                            // InternalTargetEnvironmentParser.g:2283:6: lv_properties_9_0= ruleAbstractOperatingSystemProperty
                            {

                                                    newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getPropertiesAbstractOperatingSystemPropertyParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_9);
                            lv_properties_9_0=ruleAbstractOperatingSystemProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getOperatingSystemResouceRule());
                                                    }
                                                    add(
                                                        current,
                                                        "properties",
                                                        lv_properties_9_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstractOperatingSystemProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getOperatingSystemResouceAccess().getDEDENTTerminalRuleCall_7_3());


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getOperatingSystemResouceAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "ruleOperatingSystemResouce"


    // $ANTLR start "entryRuleAbstractOperatingSystemProperty"
    // InternalTargetEnvironmentParser.g:2313:1: entryRuleAbstractOperatingSystemProperty returns [EObject current=null] : iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF ;
    public final EObject entryRuleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperatingSystemProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2313:72: (iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF )
            // InternalTargetEnvironmentParser.g:2314:2: iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF
            {
             newCompositeNode(grammarAccess.getAbstractOperatingSystemPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractOperatingSystemProperty=ruleAbstractOperatingSystemProperty();

            state._fsp--;

             current =iv_ruleAbstractOperatingSystemProperty;
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
    // $ANTLR end "entryRuleAbstractOperatingSystemProperty"


    // $ANTLR start "ruleAbstractOperatingSystemProperty"
    // InternalTargetEnvironmentParser.g:2320:1: ruleAbstractOperatingSystemProperty returns [EObject current=null] : (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) ;
    public final EObject ruleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject this_NameOperatingSystemProperty_0 = null;

        EObject this_VersionOperatingSystemProperty_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2326:2: ( (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) )
            // InternalTargetEnvironmentParser.g:2327:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            {
            // InternalTargetEnvironmentParser.g:2327:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==HyphenMinus) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==Name) ) {
                    int LA44_2 = input.LA(3);

                    if ( (LA44_2==Os_version) ) {
                        alt44=2;
                    }
                    else if ( (LA44_2==Os_name) ) {
                        alt44=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2328:3: this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty
                    {

                                newCompositeNode(grammarAccess.getAbstractOperatingSystemPropertyAccess().getNameOperatingSystemPropertyParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_NameOperatingSystemProperty_0=ruleNameOperatingSystemProperty();

                    state._fsp--;


                                current = this_NameOperatingSystemProperty_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:2337:3: this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty
                    {

                                newCompositeNode(grammarAccess.getAbstractOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_VersionOperatingSystemProperty_1=ruleVersionOperatingSystemProperty();

                    state._fsp--;


                                current = this_VersionOperatingSystemProperty_1;
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
    // $ANTLR end "ruleAbstractOperatingSystemProperty"


    // $ANTLR start "entryRuleNameOperatingSystemProperty"
    // InternalTargetEnvironmentParser.g:2349:1: entryRuleNameOperatingSystemProperty returns [EObject current=null] : iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF ;
    public final EObject entryRuleNameOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperatingSystemProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2349:68: (iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF )
            // InternalTargetEnvironmentParser.g:2350:2: iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF
            {
             newCompositeNode(grammarAccess.getNameOperatingSystemPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleNameOperatingSystemProperty=ruleNameOperatingSystemProperty();

            state._fsp--;

             current =iv_ruleNameOperatingSystemProperty;
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
    // $ANTLR end "entryRuleNameOperatingSystemProperty"


    // $ANTLR start "ruleNameOperatingSystemProperty"
    // InternalTargetEnvironmentParser.g:2356:1: ruleNameOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleNameOperatingSystemProperty() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:2362:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2363:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2363:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2364:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2364:3: ()
            // InternalTargetEnvironmentParser.g:2365:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getNameOperatingSystemPropertyAccess().getNameOperatingSystemPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_39);

                        newLeafNode(otherlv_2, grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2382:3: ( (lv_name_3_0= Os_name ) )
            // InternalTargetEnvironmentParser.g:2383:4: (lv_name_3_0= Os_name )
            {
            // InternalTargetEnvironmentParser.g:2383:4: (lv_name_3_0= Os_name )
            // InternalTargetEnvironmentParser.g:2384:5: lv_name_3_0= Os_name
            {
            lv_name_3_0=(Token)match(input,Os_name,FOLLOW_3);

                                newLeafNode(lv_name_3_0, grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getNameOperatingSystemPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "os_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_4, grammarAccess.getNameOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_5, grammarAccess.getNameOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:2404:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:2405:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:2405:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:2406:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getNameOperatingSystemPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2423:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Description) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2424:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2428:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2429:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2429:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2430:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getNameOperatingSystemPropertyRule());
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

            // InternalTargetEnvironmentParser.g:2448:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Value) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2449:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:2453:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2454:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2454:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2455:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getNameOperatingSystemPropertyRule());
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

                        newLeafNode(this_DEDENT_11, grammarAccess.getNameOperatingSystemPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleNameOperatingSystemProperty"


    // $ANTLR start "entryRuleVersionOperatingSystemProperty"
    // InternalTargetEnvironmentParser.g:2481:1: entryRuleVersionOperatingSystemProperty returns [EObject current=null] : iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF ;
    public final EObject entryRuleVersionOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionOperatingSystemProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2481:71: (iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF )
            // InternalTargetEnvironmentParser.g:2482:2: iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF
            {
             newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleVersionOperatingSystemProperty=ruleVersionOperatingSystemProperty();

            state._fsp--;

             current =iv_ruleVersionOperatingSystemProperty;
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
    // $ANTLR end "entryRuleVersionOperatingSystemProperty"


    // $ANTLR start "ruleVersionOperatingSystemProperty"
    // InternalTargetEnvironmentParser.g:2488:1: ruleVersionOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleVersionOperatingSystemProperty() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:2494:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2495:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2495:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2496:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2496:3: ()
            // InternalTargetEnvironmentParser.g:2497:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getVersionOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_40);

                        newLeafNode(otherlv_2, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2514:3: ( (lv_name_3_0= Os_version ) )
            // InternalTargetEnvironmentParser.g:2515:4: (lv_name_3_0= Os_version )
            {
            // InternalTargetEnvironmentParser.g:2515:4: (lv_name_3_0= Os_version )
            // InternalTargetEnvironmentParser.g:2516:5: lv_name_3_0= Os_version
            {
            lv_name_3_0=(Token)match(input,Os_version,FOLLOW_3);

                                newLeafNode(lv_name_3_0, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getVersionOperatingSystemPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "os_version");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_4, grammarAccess.getVersionOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_5, grammarAccess.getVersionOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:2536:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:2537:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:2537:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:2538:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getVersionOperatingSystemPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2555:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Description) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2556:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2560:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2561:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2561:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2562:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getVersionOperatingSystemPropertyRule());
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

            // InternalTargetEnvironmentParser.g:2580:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Value) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2581:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:2585:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2586:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2586:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2587:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getVersionOperatingSystemPropertyRule());
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

                        newLeafNode(this_DEDENT_11, grammarAccess.getVersionOperatingSystemPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleVersionOperatingSystemProperty"


    // $ANTLR start "entryRuleProcessorResouce"
    // InternalTargetEnvironmentParser.g:2613:1: entryRuleProcessorResouce returns [EObject current=null] : iv_ruleProcessorResouce= ruleProcessorResouce EOF ;
    public final EObject entryRuleProcessorResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorResouce = null;


        try {
            // InternalTargetEnvironmentParser.g:2613:57: (iv_ruleProcessorResouce= ruleProcessorResouce EOF )
            // InternalTargetEnvironmentParser.g:2614:2: iv_ruleProcessorResouce= ruleProcessorResouce EOF
            {
             newCompositeNode(grammarAccess.getProcessorResouceRule());
            pushFollow(FOLLOW_1);
            iv_ruleProcessorResouce=ruleProcessorResouce();

            state._fsp--;

             current =iv_ruleProcessorResouce;
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
    // $ANTLR end "entryRuleProcessorResouce"


    // $ANTLR start "ruleProcessorResouce"
    // InternalTargetEnvironmentParser.g:2620:1: ruleProcessorResouce returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleProcessorResouce() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:2626:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2627:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2627:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2628:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2628:3: ()
            // InternalTargetEnvironmentParser.g:2629:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getProcessorResouceAccess().getProcessorResouceAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getProcessorResouceAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getProcessorResouceAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2646:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2647:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2647:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2648:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getProcessorResouceAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getProcessorResouceRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_33);

                        newLeafNode(this_INDENT_4, grammarAccess.getProcessorResouceAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_41);

                        newLeafNode(otherlv_5, grammarAccess.getProcessorResouceAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:2673:3: ( (lv_type_6_0= ruleProcessorResouceType ) )
            // InternalTargetEnvironmentParser.g:2674:4: (lv_type_6_0= ruleProcessorResouceType )
            {
            // InternalTargetEnvironmentParser.g:2674:4: (lv_type_6_0= ruleProcessorResouceType )
            // InternalTargetEnvironmentParser.g:2675:5: lv_type_6_0= ruleProcessorResouceType
            {

                                newCompositeNode(grammarAccess.getProcessorResouceAccess().getTypeProcessorResouceTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_34);
            lv_type_6_0=ruleProcessorResouceType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getProcessorResouceRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.ProcessorResouceType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2692:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Properties) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2693:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getProcessorResouceAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_8, grammarAccess.getProcessorResouceAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:2701:4: ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==HyphenMinus) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:2702:5: (lv_properties_9_0= ruleAbstracProcessorProperty )
                            {
                            // InternalTargetEnvironmentParser.g:2702:5: (lv_properties_9_0= ruleAbstracProcessorProperty )
                            // InternalTargetEnvironmentParser.g:2703:6: lv_properties_9_0= ruleAbstracProcessorProperty
                            {

                                                    newCompositeNode(grammarAccess.getProcessorResouceAccess().getPropertiesAbstracProcessorPropertyParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_9);
                            lv_properties_9_0=ruleAbstracProcessorProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getProcessorResouceRule());
                                                    }
                                                    add(
                                                        current,
                                                        "properties",
                                                        lv_properties_9_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstracProcessorProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getProcessorResouceAccess().getDEDENTTerminalRuleCall_7_3());


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getProcessorResouceAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "ruleProcessorResouce"


    // $ANTLR start "entryRuleAbstracProcessorProperty"
    // InternalTargetEnvironmentParser.g:2733:1: entryRuleAbstracProcessorProperty returns [EObject current=null] : iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF ;
    public final EObject entryRuleAbstracProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstracProcessorProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2733:65: (iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF )
            // InternalTargetEnvironmentParser.g:2734:2: iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF
            {
             newCompositeNode(grammarAccess.getAbstracProcessorPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstracProcessorProperty=ruleAbstracProcessorProperty();

            state._fsp--;

             current =iv_ruleAbstracProcessorProperty;
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
    // $ANTLR end "entryRuleAbstracProcessorProperty"


    // $ANTLR start "ruleAbstracProcessorProperty"
    // InternalTargetEnvironmentParser.g:2740:1: ruleAbstracProcessorProperty returns [EObject current=null] : (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty ) ;
    public final EObject ruleAbstracProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ArchitectureProcessorProperty_0 = null;

        EObject this_CoreProcessorProperty_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2746:2: ( (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty ) )
            // InternalTargetEnvironmentParser.g:2747:2: (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty )
            {
            // InternalTargetEnvironmentParser.g:2747:2: (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==HyphenMinus) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==Name) ) {
                    int LA51_2 = input.LA(3);

                    if ( (LA51_2==Core_number) ) {
                        alt51=2;
                    }
                    else if ( (LA51_2==Processor_architecture) ) {
                        alt51=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2748:3: this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty
                    {

                                newCompositeNode(grammarAccess.getAbstracProcessorPropertyAccess().getArchitectureProcessorPropertyParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_ArchitectureProcessorProperty_0=ruleArchitectureProcessorProperty();

                    state._fsp--;


                                current = this_ArchitectureProcessorProperty_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:2757:3: this_CoreProcessorProperty_1= ruleCoreProcessorProperty
                    {

                                newCompositeNode(grammarAccess.getAbstracProcessorPropertyAccess().getCoreProcessorPropertyParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_CoreProcessorProperty_1=ruleCoreProcessorProperty();

                    state._fsp--;


                                current = this_CoreProcessorProperty_1;
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
    // $ANTLR end "ruleAbstracProcessorProperty"


    // $ANTLR start "entryRuleArchitectureProcessorProperty"
    // InternalTargetEnvironmentParser.g:2769:1: entryRuleArchitectureProcessorProperty returns [EObject current=null] : iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF ;
    public final EObject entryRuleArchitectureProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureProcessorProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2769:70: (iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF )
            // InternalTargetEnvironmentParser.g:2770:2: iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF
            {
             newCompositeNode(grammarAccess.getArchitectureProcessorPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleArchitectureProcessorProperty=ruleArchitectureProcessorProperty();

            state._fsp--;

             current =iv_ruleArchitectureProcessorProperty;
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
    // $ANTLR end "entryRuleArchitectureProcessorProperty"


    // $ANTLR start "ruleArchitectureProcessorProperty"
    // InternalTargetEnvironmentParser.g:2776:1: ruleArchitectureProcessorProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleArchitectureProcessorProperty() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:2782:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2783:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2783:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2784:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2784:3: ()
            // InternalTargetEnvironmentParser.g:2785:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getArchitectureProcessorPropertyAccess().getArchitectureProcessorPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getArchitectureProcessorPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_42);

                        newLeafNode(otherlv_2, grammarAccess.getArchitectureProcessorPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2802:3: ( (lv_name_3_0= Processor_architecture ) )
            // InternalTargetEnvironmentParser.g:2803:4: (lv_name_3_0= Processor_architecture )
            {
            // InternalTargetEnvironmentParser.g:2803:4: (lv_name_3_0= Processor_architecture )
            // InternalTargetEnvironmentParser.g:2804:5: lv_name_3_0= Processor_architecture
            {
            lv_name_3_0=(Token)match(input,Processor_architecture,FOLLOW_3);

                                newLeafNode(lv_name_3_0, grammarAccess.getArchitectureProcessorPropertyAccess().getNameProcessor_architectureKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getArchitectureProcessorPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "processor_architecture");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_4, grammarAccess.getArchitectureProcessorPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_5, grammarAccess.getArchitectureProcessorPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:2824:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:2825:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:2825:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:2826:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getArchitectureProcessorPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getArchitectureProcessorPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2843:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Description) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2844:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getArchitectureProcessorPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2848:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2849:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2849:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2850:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getArchitectureProcessorPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getArchitectureProcessorPropertyRule());
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

            // InternalTargetEnvironmentParser.g:2868:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Value) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2869:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getArchitectureProcessorPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:2873:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2874:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2874:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2875:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getArchitectureProcessorPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getArchitectureProcessorPropertyRule());
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

                        newLeafNode(this_DEDENT_11, grammarAccess.getArchitectureProcessorPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleArchitectureProcessorProperty"


    // $ANTLR start "entryRuleCoreProcessorProperty"
    // InternalTargetEnvironmentParser.g:2901:1: entryRuleCoreProcessorProperty returns [EObject current=null] : iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF ;
    public final EObject entryRuleCoreProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoreProcessorProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2901:62: (iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF )
            // InternalTargetEnvironmentParser.g:2902:2: iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF
            {
             newCompositeNode(grammarAccess.getCoreProcessorPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleCoreProcessorProperty=ruleCoreProcessorProperty();

            state._fsp--;

             current =iv_ruleCoreProcessorProperty;
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
    // $ANTLR end "entryRuleCoreProcessorProperty"


    // $ANTLR start "ruleCoreProcessorProperty"
    // InternalTargetEnvironmentParser.g:2908:1: ruleCoreProcessorProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleCoreProcessorProperty() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:2914:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2915:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2915:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2916:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2916:3: ()
            // InternalTargetEnvironmentParser.g:2917:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCoreProcessorPropertyAccess().getCoreProcessorPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getCoreProcessorPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_43);

                        newLeafNode(otherlv_2, grammarAccess.getCoreProcessorPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2934:3: ( (lv_name_3_0= Core_number ) )
            // InternalTargetEnvironmentParser.g:2935:4: (lv_name_3_0= Core_number )
            {
            // InternalTargetEnvironmentParser.g:2935:4: (lv_name_3_0= Core_number )
            // InternalTargetEnvironmentParser.g:2936:5: lv_name_3_0= Core_number
            {
            lv_name_3_0=(Token)match(input,Core_number,FOLLOW_3);

                                newLeafNode(lv_name_3_0, grammarAccess.getCoreProcessorPropertyAccess().getNameCore_numberKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getCoreProcessorPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "core_number");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                        newLeafNode(this_INDENT_4, grammarAccess.getCoreProcessorPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_5, grammarAccess.getCoreProcessorPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:2956:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:2957:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:2957:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:2958:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getCoreProcessorPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getCoreProcessorPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2975:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Description) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2976:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getCoreProcessorPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2980:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2981:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2981:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2982:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getCoreProcessorPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getCoreProcessorPropertyRule());
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

            // InternalTargetEnvironmentParser.g:3000:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Value) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3001:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_9, grammarAccess.getCoreProcessorPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:3005:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3006:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3006:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3007:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getCoreProcessorPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getCoreProcessorPropertyRule());
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

                        newLeafNode(this_DEDENT_11, grammarAccess.getCoreProcessorPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleCoreProcessorProperty"


    // $ANTLR start "entryRuleAbstractProperty"
    // InternalTargetEnvironmentParser.g:3033:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:3033:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalTargetEnvironmentParser.g:3034:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
            {
             newCompositeNode(grammarAccess.getAbstractPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractProperty=ruleAbstractProperty();

            state._fsp--;

             current =iv_ruleAbstractProperty;
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
    // $ANTLR end "entryRuleAbstractProperty"


    // $ANTLR start "ruleAbstractProperty"
    // InternalTargetEnvironmentParser.g:3040:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3046:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalTargetEnvironmentParser.g:3047:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalTargetEnvironmentParser.g:3047:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt56=5;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3048:3: this_PropertyAttribute_0= rulePropertyAttribute
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertyAttributeParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_PropertyAttribute_0=rulePropertyAttribute();

                    state._fsp--;


                                current = this_PropertyAttribute_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3057:3: this_PropertyMaximun_1= rulePropertyMaximun
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertyMaximunParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_PropertyMaximun_1=rulePropertyMaximun();

                    state._fsp--;


                                current = this_PropertyMaximun_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 3 :
                    // InternalTargetEnvironmentParser.g:3066:3: this_PropertyMinimum_2= rulePropertyMinimum
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertyMinimumParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_PropertyMinimum_2=rulePropertyMinimum();

                    state._fsp--;


                                current = this_PropertyMinimum_2;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 4 :
                    // InternalTargetEnvironmentParser.g:3075:3: this_PropertySelection_3= rulePropertySelection
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertySelectionParserRuleCall_3());

                    pushFollow(FOLLOW_2);
                    this_PropertySelection_3=rulePropertySelection();

                    state._fsp--;


                                current = this_PropertySelection_3;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 5 :
                    // InternalTargetEnvironmentParser.g:3084:3: this_PropertyRange_4= rulePropertyRange
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertyRangeParserRuleCall_4());

                    pushFollow(FOLLOW_2);
                    this_PropertyRange_4=rulePropertyRange();

                    state._fsp--;


                                current = this_PropertyRange_4;
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
    // $ANTLR end "ruleAbstractProperty"


    // $ANTLR start "entryRulePropertyKind"
    // InternalTargetEnvironmentParser.g:3096:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalTargetEnvironmentParser.g:3096:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalTargetEnvironmentParser.g:3097:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalTargetEnvironmentParser.g:3103:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3109:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:3110:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:3110:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt57=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt57=1;
                }
                break;
            case MaximumKind:
                {
                alt57=2;
                }
                break;
            case MinimumKind:
                {
                alt57=3;
                }
                break;
            case RangeKind:
                {
                alt57=4;
                }
                break;
            case SelectionKind:
                {
                alt57=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3111:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalTargetEnvironmentParser.g:3120:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalTargetEnvironmentParser.g:3129:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalTargetEnvironmentParser.g:3138:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalTargetEnvironmentParser.g:3147:3: this_SelectionKind_4= ruleSelectionKind
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


    // $ANTLR start "entryRulePropertyAttribute"
    // InternalTargetEnvironmentParser.g:3159:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalTargetEnvironmentParser.g:3159:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalTargetEnvironmentParser.g:3160:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalTargetEnvironmentParser.g:3166:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:3172:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:3173:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:3173:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:3174:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:3185:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3186:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3186:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3187:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:3212:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:3213:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:3213:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:3214:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_44);
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

            // InternalTargetEnvironmentParser.g:3231:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Description) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3232:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:3236:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:3237:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:3237:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:3238:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_45);
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

            // InternalTargetEnvironmentParser.g:3256:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Value) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3257:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:3261:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3262:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3262:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3263:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_46);
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

            // InternalTargetEnvironmentParser.g:3281:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_DEDENT) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_DEDENT) ) {
                    int LA60_3 = input.LA(3);

                    if ( (LA60_3==RULE_DEDENT) ) {
                        int LA60_5 = input.LA(4);

                        if ( (LA60_5==RULE_DEDENT) ) {
                            int LA60_6 = input.LA(5);

                            if ( (LA60_6==CommunicationConnection||LA60_6==ComputationResouce||LA60_6==RULE_DEDENT) ) {
                                alt60=1;
                            }
                        }
                        else if ( (LA60_5==EOF||LA60_5==HyphenMinus) ) {
                            alt60=1;
                        }
                    }
                }
                else if ( (LA60_1==EOF||LA60_1==HyphenMinus) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3282:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3291:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalTargetEnvironmentParser.g:3291:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalTargetEnvironmentParser.g:3292:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalTargetEnvironmentParser.g:3298:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:3304:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:3305:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:3305:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:3306:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:3317:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3318:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3318:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3319:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_47);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:3344:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalTargetEnvironmentParser.g:3345:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalTargetEnvironmentParser.g:3345:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalTargetEnvironmentParser.g:3346:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_44);
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

            // InternalTargetEnvironmentParser.g:3363:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Description) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3364:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:3368:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:3369:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:3369:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:3370:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_45);
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

            // InternalTargetEnvironmentParser.g:3388:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Value) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3389:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:3393:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3394:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3394:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3395:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_46);
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

            // InternalTargetEnvironmentParser.g:3413:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_DEDENT) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==EOF||LA63_1==HyphenMinus) ) {
                    alt63=1;
                }
                else if ( (LA63_1==RULE_DEDENT) ) {
                    int LA63_4 = input.LA(3);

                    if ( (LA63_4==RULE_DEDENT) ) {
                        int LA63_5 = input.LA(4);

                        if ( (LA63_5==RULE_DEDENT) ) {
                            int LA63_6 = input.LA(5);

                            if ( (LA63_6==CommunicationConnection||LA63_6==ComputationResouce||LA63_6==RULE_DEDENT) ) {
                                alt63=1;
                            }
                        }
                        else if ( (LA63_5==EOF||LA63_5==HyphenMinus) ) {
                            alt63=1;
                        }
                    }
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3414:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3423:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalTargetEnvironmentParser.g:3423:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalTargetEnvironmentParser.g:3424:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalTargetEnvironmentParser.g:3430:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:3436:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:3437:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:3437:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:3438:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:3449:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3450:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3450:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3451:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_48);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:3476:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalTargetEnvironmentParser.g:3477:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalTargetEnvironmentParser.g:3477:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalTargetEnvironmentParser.g:3478:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_44);
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

            // InternalTargetEnvironmentParser.g:3495:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Description) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3496:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:3500:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:3501:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:3501:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:3502:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_45);
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

            // InternalTargetEnvironmentParser.g:3520:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Value) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3521:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:3525:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3526:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3526:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3527:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_46);
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

            // InternalTargetEnvironmentParser.g:3545:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_DEDENT) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==RULE_DEDENT) ) {
                    int LA66_3 = input.LA(3);

                    if ( (LA66_3==RULE_DEDENT) ) {
                        int LA66_5 = input.LA(4);

                        if ( (LA66_5==RULE_DEDENT) ) {
                            int LA66_6 = input.LA(5);

                            if ( (LA66_6==CommunicationConnection||LA66_6==ComputationResouce||LA66_6==RULE_DEDENT) ) {
                                alt66=1;
                            }
                        }
                        else if ( (LA66_5==EOF||LA66_5==HyphenMinus) ) {
                            alt66=1;
                        }
                    }
                }
                else if ( (LA66_1==EOF||LA66_1==HyphenMinus) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3546:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3555:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalTargetEnvironmentParser.g:3555:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalTargetEnvironmentParser.g:3556:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalTargetEnvironmentParser.g:3562:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:3568:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:3569:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:3569:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:3570:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:3581:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3582:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3582:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3583:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_49);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:3608:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:3609:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:3609:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalTargetEnvironmentParser.g:3610:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_44);
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

            // InternalTargetEnvironmentParser.g:3627:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Description) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3628:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:3632:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:3633:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:3633:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:3634:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_45);
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

            // InternalTargetEnvironmentParser.g:3652:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Value) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3653:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
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

                    // InternalTargetEnvironmentParser.g:3668:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3669:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3669:5: (lv_value_11_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3670:6: lv_value_11_0= rulePropertyValue
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

                    // InternalTargetEnvironmentParser.g:3687:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==HyphenMinus) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:3688:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_21);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalTargetEnvironmentParser.g:3695:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalTargetEnvironmentParser.g:3696:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalTargetEnvironmentParser.g:3696:6: (lv_value_13_0= rulePropertyValue )
                            // InternalTargetEnvironmentParser.g:3697:7: lv_value_13_0= rulePropertyValue
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
                            break loop68;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_46);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:3720:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_DEDENT) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==EOF||LA70_1==HyphenMinus) ) {
                    alt70=1;
                }
                else if ( (LA70_1==RULE_DEDENT) ) {
                    int LA70_4 = input.LA(3);

                    if ( (LA70_4==RULE_DEDENT) ) {
                        int LA70_5 = input.LA(4);

                        if ( (LA70_5==RULE_DEDENT) ) {
                            int LA70_6 = input.LA(5);

                            if ( (LA70_6==CommunicationConnection||LA70_6==ComputationResouce||LA70_6==RULE_DEDENT) ) {
                                alt70=1;
                            }
                        }
                        else if ( (LA70_5==EOF||LA70_5==HyphenMinus) ) {
                            alt70=1;
                        }
                    }
                }
            }
            switch (alt70) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3721:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3730:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalTargetEnvironmentParser.g:3730:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalTargetEnvironmentParser.g:3731:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalTargetEnvironmentParser.g:3737:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:3743:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:3744:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:3744:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:3745:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:3756:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3757:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3757:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3758:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_50);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:3783:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalTargetEnvironmentParser.g:3784:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalTargetEnvironmentParser.g:3784:4: (lv_kind_5_0= ruleRangeKind )
            // InternalTargetEnvironmentParser.g:3785:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_44);
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

            // InternalTargetEnvironmentParser.g:3802:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Description) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3803:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:3807:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:3808:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:3808:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:3809:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_45);
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

            // InternalTargetEnvironmentParser.g:3827:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Value) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3828:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
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

                    // InternalTargetEnvironmentParser.g:3843:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3844:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3844:5: (lv_value_11_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3845:6: lv_value_11_0= rulePropertyValue
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

                    // InternalTargetEnvironmentParser.g:3869:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3870:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3870:5: (lv_value_13_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3871:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_46);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:3893:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_DEDENT) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==EOF||LA73_1==HyphenMinus) ) {
                    alt73=1;
                }
                else if ( (LA73_1==RULE_DEDENT) ) {
                    int LA73_4 = input.LA(3);

                    if ( (LA73_4==RULE_DEDENT) ) {
                        int LA73_5 = input.LA(4);

                        if ( (LA73_5==RULE_DEDENT) ) {
                            int LA73_6 = input.LA(5);

                            if ( (LA73_6==CommunicationConnection||LA73_6==ComputationResouce||LA73_6==RULE_DEDENT) ) {
                                alt73=1;
                            }
                        }
                        else if ( (LA73_5==EOF||LA73_5==HyphenMinus) ) {
                            alt73=1;
                        }
                    }
                }
            }
            switch (alt73) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3894:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3903:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalTargetEnvironmentParser.g:3903:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalTargetEnvironmentParser.g:3904:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalTargetEnvironmentParser.g:3910:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;

        EObject this_LinuxDistributionValue_4 = null;

        EObject this_UbuntuVersionValue_5 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3916:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) )
            // InternalTargetEnvironmentParser.g:3917:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            {
            // InternalTargetEnvironmentParser.g:3917:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            int alt74=6;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt74=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt74=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt74=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt74=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt74=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt74=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3918:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalTargetEnvironmentParser.g:3927:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalTargetEnvironmentParser.g:3936:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalTargetEnvironmentParser.g:3945:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getProcessorArchitectureValueParserRuleCall_3());

                    pushFollow(FOLLOW_2);
                    this_ProcessorArchitectureValue_3=ruleProcessorArchitectureValue();

                    state._fsp--;


                                current = this_ProcessorArchitectureValue_3;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 5 :
                    // InternalTargetEnvironmentParser.g:3954:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getLinuxDistributionValueParserRuleCall_4());

                    pushFollow(FOLLOW_2);
                    this_LinuxDistributionValue_4=ruleLinuxDistributionValue();

                    state._fsp--;


                                current = this_LinuxDistributionValue_4;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 6 :
                    // InternalTargetEnvironmentParser.g:3963:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getUbuntuVersionValueParserRuleCall_5());

                    pushFollow(FOLLOW_2);
                    this_UbuntuVersionValue_5=ruleUbuntuVersionValue();

                    state._fsp--;


                                current = this_UbuntuVersionValue_5;
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
    // InternalTargetEnvironmentParser.g:3975:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalTargetEnvironmentParser.g:3975:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalTargetEnvironmentParser.g:3976:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalTargetEnvironmentParser.g:3982:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3988:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalTargetEnvironmentParser.g:3989:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalTargetEnvironmentParser.g:3989:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalTargetEnvironmentParser.g:3990:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalTargetEnvironmentParser.g:3990:3: (lv_value_0_0= ruleInteger0 )
            // InternalTargetEnvironmentParser.g:3991:4: lv_value_0_0= ruleInteger0
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
    // InternalTargetEnvironmentParser.g:4011:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalTargetEnvironmentParser.g:4011:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalTargetEnvironmentParser.g:4012:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalTargetEnvironmentParser.g:4018:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4024:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalTargetEnvironmentParser.g:4025:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalTargetEnvironmentParser.g:4025:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalTargetEnvironmentParser.g:4026:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalTargetEnvironmentParser.g:4026:3: (lv_value_0_0= ruleDouble0 )
            // InternalTargetEnvironmentParser.g:4027:4: lv_value_0_0= ruleDouble0
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
    // InternalTargetEnvironmentParser.g:4047:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalTargetEnvironmentParser.g:4047:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalTargetEnvironmentParser.g:4048:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalTargetEnvironmentParser.g:4054:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4060:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:4061:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:4061:2: ( (lv_value_0_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:4062:3: (lv_value_0_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4062:3: (lv_value_0_0= ruleEString )
            // InternalTargetEnvironmentParser.g:4063:4: lv_value_0_0= ruleEString
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
    // InternalTargetEnvironmentParser.g:4083:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalTargetEnvironmentParser.g:4083:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalTargetEnvironmentParser.g:4084:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalTargetEnvironmentParser.g:4090:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4096:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalTargetEnvironmentParser.g:4097:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalTargetEnvironmentParser.g:4097:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalTargetEnvironmentParser.g:4098:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalTargetEnvironmentParser.g:4098:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalTargetEnvironmentParser.g:4099:4: lv_value_0_0= ruleProcessorArchitectureType
            {

                            newCompositeNode(grammarAccess.getProcessorArchitectureValueAccess().getValueProcessorArchitectureTypeEnumRuleCall_0());

            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleProcessorArchitectureType();

            state._fsp--;


                            if (current==null) {
                                current = createModelElementForParent(grammarAccess.getProcessorArchitectureValueRule());
                            }
                            set(
                                current,
                                "value",
                                lv_value_0_0,
                                "de.fraunhofer.ipa.deployment.Util.ProcessorArchitectureType");
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
    // $ANTLR end "ruleProcessorArchitectureValue"


    // $ANTLR start "entryRuleAbstractResouceType"
    // InternalTargetEnvironmentParser.g:4119:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:4119:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalTargetEnvironmentParser.g:4120:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalTargetEnvironmentParser.g:4126:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4132:2: (this_ResourceType_0= ruleResourceType )
            // InternalTargetEnvironmentParser.g:4133:2: this_ResourceType_0= ruleResourceType
            {

                    newCompositeNode(grammarAccess.getAbstractResouceTypeAccess().getResourceTypeParserRuleCall());

            pushFollow(FOLLOW_2);
            this_ResourceType_0=ruleResourceType();

            state._fsp--;


                    current = this_ResourceType_0;
                    afterParserOrEnumRuleCall();


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


    // $ANTLR start "entryRuleOpertingSystemResouceType"
    // InternalTargetEnvironmentParser.g:4144:1: entryRuleOpertingSystemResouceType returns [EObject current=null] : iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF ;
    public final EObject entryRuleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:4144:66: (iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF )
            // InternalTargetEnvironmentParser.g:4145:2: iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF
            {
             newCompositeNode(grammarAccess.getOpertingSystemResouceTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleOpertingSystemResouceType=ruleOpertingSystemResouceType();

            state._fsp--;

             current =iv_ruleOpertingSystemResouceType;
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
    // $ANTLR end "entryRuleOpertingSystemResouceType"


    // $ANTLR start "ruleOpertingSystemResouceType"
    // InternalTargetEnvironmentParser.g:4151:1: ruleOpertingSystemResouceType returns [EObject current=null] : (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) ;
    public final EObject ruleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystem_0 = null;

        EObject this_MacOSOpertingSystem_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4157:2: ( (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:4158:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:4158:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==LinuxOpertingSystem) ) {
                alt75=1;
            }
            else if ( (LA75_0==MacOSOpertingSystem) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4159:3: this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem
                    {

                                newCompositeNode(grammarAccess.getOpertingSystemResouceTypeAccess().getLinuxOpertingSystemParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_LinuxOpertingSystem_0=ruleLinuxOpertingSystem();

                    state._fsp--;


                                current = this_LinuxOpertingSystem_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:4168:3: this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem
                    {

                                newCompositeNode(grammarAccess.getOpertingSystemResouceTypeAccess().getMacOSOpertingSystemParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_MacOSOpertingSystem_1=ruleMacOSOpertingSystem();

                    state._fsp--;


                                current = this_MacOSOpertingSystem_1;
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
    // $ANTLR end "ruleOpertingSystemResouceType"


    // $ANTLR start "entryRuleResourceType"
    // InternalTargetEnvironmentParser.g:4180:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalTargetEnvironmentParser.g:4180:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalTargetEnvironmentParser.g:4181:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalTargetEnvironmentParser.g:4187:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4193:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:4194:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:4194:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:4195:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:4195:3: ()
            // InternalTargetEnvironmentParser.g:4196:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:4202:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:4203:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4203:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:4204:5: lv_name_1_0= ruleEString
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


    // $ANTLR start "entryRuleProcessorResouceType"
    // InternalTargetEnvironmentParser.g:4225:1: entryRuleProcessorResouceType returns [EObject current=null] : iv_ruleProcessorResouceType= ruleProcessorResouceType EOF ;
    public final EObject entryRuleProcessorResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:4225:61: (iv_ruleProcessorResouceType= ruleProcessorResouceType EOF )
            // InternalTargetEnvironmentParser.g:4226:2: iv_ruleProcessorResouceType= ruleProcessorResouceType EOF
            {
             newCompositeNode(grammarAccess.getProcessorResouceTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleProcessorResouceType=ruleProcessorResouceType();

            state._fsp--;

             current =iv_ruleProcessorResouceType;
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
    // $ANTLR end "entryRuleProcessorResouceType"


    // $ANTLR start "ruleProcessorResouceType"
    // InternalTargetEnvironmentParser.g:4232:1: ruleProcessorResouceType returns [EObject current=null] : ( () otherlv_1= Processor ) ;
    public final EObject ruleProcessorResouceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4238:2: ( ( () otherlv_1= Processor ) )
            // InternalTargetEnvironmentParser.g:4239:2: ( () otherlv_1= Processor )
            {
            // InternalTargetEnvironmentParser.g:4239:2: ( () otherlv_1= Processor )
            // InternalTargetEnvironmentParser.g:4240:3: () otherlv_1= Processor
            {
            // InternalTargetEnvironmentParser.g:4240:3: ()
            // InternalTargetEnvironmentParser.g:4241:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getProcessorResouceTypeAccess().getProcessorResouceTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Processor,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getProcessorResouceTypeAccess().getProcessorKeyword_1());


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
    // $ANTLR end "ruleProcessorResouceType"


    // $ANTLR start "entryRuleLinuxOpertingSystem"
    // InternalTargetEnvironmentParser.g:4255:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalTargetEnvironmentParser.g:4255:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalTargetEnvironmentParser.g:4256:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
            {
             newCompositeNode(grammarAccess.getLinuxOpertingSystemRule());
            pushFollow(FOLLOW_1);
            iv_ruleLinuxOpertingSystem=ruleLinuxOpertingSystem();

            state._fsp--;

             current =iv_ruleLinuxOpertingSystem;
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
    // $ANTLR end "entryRuleLinuxOpertingSystem"


    // $ANTLR start "ruleLinuxOpertingSystem"
    // InternalTargetEnvironmentParser.g:4262:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4268:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:4269:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:4269:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalTargetEnvironmentParser.g:4270:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalTargetEnvironmentParser.g:4270:3: ()
            // InternalTargetEnvironmentParser.g:4271:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,LinuxOpertingSystem,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemKeyword_1());


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
    // $ANTLR end "ruleLinuxOpertingSystem"


    // $ANTLR start "entryRuleMacOSOpertingSystem"
    // InternalTargetEnvironmentParser.g:4285:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalTargetEnvironmentParser.g:4285:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalTargetEnvironmentParser.g:4286:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
            {
             newCompositeNode(grammarAccess.getMacOSOpertingSystemRule());
            pushFollow(FOLLOW_1);
            iv_ruleMacOSOpertingSystem=ruleMacOSOpertingSystem();

            state._fsp--;

             current =iv_ruleMacOSOpertingSystem;
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
    // $ANTLR end "entryRuleMacOSOpertingSystem"


    // $ANTLR start "ruleMacOSOpertingSystem"
    // InternalTargetEnvironmentParser.g:4292:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4298:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:4299:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:4299:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalTargetEnvironmentParser.g:4300:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalTargetEnvironmentParser.g:4300:3: ()
            // InternalTargetEnvironmentParser.g:4301:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getMacOSOpertingSystemAccess().getMacOSOpertingSystemAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,MacOSOpertingSystem,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getMacOSOpertingSystemAccess().getMacOSOpertingSystemKeyword_1());


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
    // $ANTLR end "ruleMacOSOpertingSystem"


    // $ANTLR start "entryRuleCommunicationType"
    // InternalTargetEnvironmentParser.g:4315:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:4315:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:4316:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:4322:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4328:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:4329:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:4329:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:4330:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:4330:3: ()
            // InternalTargetEnvironmentParser.g:4331:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:4337:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:4338:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4338:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:4339:5: lv_name_1_0= ruleEString
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
    // InternalTargetEnvironmentParser.g:4360:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:4360:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:4361:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:4367:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4373:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalTargetEnvironmentParser.g:4374:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:4374:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==Ethernet) ) {
                alt76=1;
            }
            else if ( (LA76_0==Wlan) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4375:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalTargetEnvironmentParser.g:4384:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalTargetEnvironmentParser.g:4396:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:4396:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:4397:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:4403:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4409:2: ( ( () otherlv_1= Ethernet ) )
            // InternalTargetEnvironmentParser.g:4410:2: ( () otherlv_1= Ethernet )
            {
            // InternalTargetEnvironmentParser.g:4410:2: ( () otherlv_1= Ethernet )
            // InternalTargetEnvironmentParser.g:4411:3: () otherlv_1= Ethernet
            {
            // InternalTargetEnvironmentParser.g:4411:3: ()
            // InternalTargetEnvironmentParser.g:4412:4:
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
    // InternalTargetEnvironmentParser.g:4426:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:4426:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:4427:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:4433:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4439:2: ( ( () otherlv_1= Wlan ) )
            // InternalTargetEnvironmentParser.g:4440:2: ( () otherlv_1= Wlan )
            {
            // InternalTargetEnvironmentParser.g:4440:2: ( () otherlv_1= Wlan )
            // InternalTargetEnvironmentParser.g:4441:3: () otherlv_1= Wlan
            {
            // InternalTargetEnvironmentParser.g:4441:3: ()
            // InternalTargetEnvironmentParser.g:4442:4:
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
    // InternalTargetEnvironmentParser.g:4456:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:4456:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalTargetEnvironmentParser.g:4457:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalTargetEnvironmentParser.g:4463:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4469:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalTargetEnvironmentParser.g:4470:2: ( () otherlv_1= AttributeKind )
            {
            // InternalTargetEnvironmentParser.g:4470:2: ( () otherlv_1= AttributeKind )
            // InternalTargetEnvironmentParser.g:4471:3: () otherlv_1= AttributeKind
            {
            // InternalTargetEnvironmentParser.g:4471:3: ()
            // InternalTargetEnvironmentParser.g:4472:4:
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
    // InternalTargetEnvironmentParser.g:4486:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:4486:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalTargetEnvironmentParser.g:4487:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalTargetEnvironmentParser.g:4493:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4499:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalTargetEnvironmentParser.g:4500:2: ( () otherlv_1= MaximumKind )
            {
            // InternalTargetEnvironmentParser.g:4500:2: ( () otherlv_1= MaximumKind )
            // InternalTargetEnvironmentParser.g:4501:3: () otherlv_1= MaximumKind
            {
            // InternalTargetEnvironmentParser.g:4501:3: ()
            // InternalTargetEnvironmentParser.g:4502:4:
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
    // InternalTargetEnvironmentParser.g:4516:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:4516:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalTargetEnvironmentParser.g:4517:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalTargetEnvironmentParser.g:4523:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4529:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalTargetEnvironmentParser.g:4530:2: ( () otherlv_1= MinimumKind )
            {
            // InternalTargetEnvironmentParser.g:4530:2: ( () otherlv_1= MinimumKind )
            // InternalTargetEnvironmentParser.g:4531:3: () otherlv_1= MinimumKind
            {
            // InternalTargetEnvironmentParser.g:4531:3: ()
            // InternalTargetEnvironmentParser.g:4532:4:
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
    // InternalTargetEnvironmentParser.g:4546:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalTargetEnvironmentParser.g:4546:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalTargetEnvironmentParser.g:4547:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalTargetEnvironmentParser.g:4553:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4559:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalTargetEnvironmentParser.g:4560:2: ( () otherlv_1= SelectionKind )
            {
            // InternalTargetEnvironmentParser.g:4560:2: ( () otherlv_1= SelectionKind )
            // InternalTargetEnvironmentParser.g:4561:3: () otherlv_1= SelectionKind
            {
            // InternalTargetEnvironmentParser.g:4561:3: ()
            // InternalTargetEnvironmentParser.g:4562:4:
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
    // InternalTargetEnvironmentParser.g:4576:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:4576:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalTargetEnvironmentParser.g:4577:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalTargetEnvironmentParser.g:4583:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4589:2: ( ( () otherlv_1= RangeKind ) )
            // InternalTargetEnvironmentParser.g:4590:2: ( () otherlv_1= RangeKind )
            {
            // InternalTargetEnvironmentParser.g:4590:2: ( () otherlv_1= RangeKind )
            // InternalTargetEnvironmentParser.g:4591:3: () otherlv_1= RangeKind
            {
            // InternalTargetEnvironmentParser.g:4591:3: ()
            // InternalTargetEnvironmentParser.g:4592:4:
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


    // $ANTLR start "entryRuleLinuxDistributionValue"
    // InternalTargetEnvironmentParser.g:4606:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalTargetEnvironmentParser.g:4606:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalTargetEnvironmentParser.g:4607:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
            {
             newCompositeNode(grammarAccess.getLinuxDistributionValueRule());
            pushFollow(FOLLOW_1);
            iv_ruleLinuxDistributionValue=ruleLinuxDistributionValue();

            state._fsp--;

             current =iv_ruleLinuxDistributionValue;
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
    // $ANTLR end "entryRuleLinuxDistributionValue"


    // $ANTLR start "ruleLinuxDistributionValue"
    // InternalTargetEnvironmentParser.g:4613:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4619:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalTargetEnvironmentParser.g:4620:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalTargetEnvironmentParser.g:4620:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalTargetEnvironmentParser.g:4621:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalTargetEnvironmentParser.g:4621:3: ()
            // InternalTargetEnvironmentParser.g:4622:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:4628:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalTargetEnvironmentParser.g:4629:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalTargetEnvironmentParser.g:4629:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalTargetEnvironmentParser.g:4630:5: lv_value_1_0= ruleLinuxDistribution
            {

                                newCompositeNode(grammarAccess.getLinuxDistributionValueAccess().getValueLinuxDistributionEnumRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleLinuxDistribution();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getLinuxDistributionValueRule());
                                }
                                set(
                                    current,
                                    "value",
                                    lv_value_1_0,
                                    "de.fraunhofer.ipa.deployment.Util.LinuxDistribution");
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
    // $ANTLR end "ruleLinuxDistributionValue"


    // $ANTLR start "entryRuleUbuntuVersionValue"
    // InternalTargetEnvironmentParser.g:4651:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalTargetEnvironmentParser.g:4651:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalTargetEnvironmentParser.g:4652:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
            {
             newCompositeNode(grammarAccess.getUbuntuVersionValueRule());
            pushFollow(FOLLOW_1);
            iv_ruleUbuntuVersionValue=ruleUbuntuVersionValue();

            state._fsp--;

             current =iv_ruleUbuntuVersionValue;
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
    // $ANTLR end "entryRuleUbuntuVersionValue"


    // $ANTLR start "ruleUbuntuVersionValue"
    // InternalTargetEnvironmentParser.g:4658:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4664:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalTargetEnvironmentParser.g:4665:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalTargetEnvironmentParser.g:4665:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalTargetEnvironmentParser.g:4666:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalTargetEnvironmentParser.g:4666:3: ()
            // InternalTargetEnvironmentParser.g:4667:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:4673:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalTargetEnvironmentParser.g:4674:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalTargetEnvironmentParser.g:4674:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalTargetEnvironmentParser.g:4675:5: lv_value_1_0= ruleUbuntuVersion
            {

                                newCompositeNode(grammarAccess.getUbuntuVersionValueAccess().getValueUbuntuVersionEnumRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleUbuntuVersion();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getUbuntuVersionValueRule());
                                }
                                set(
                                    current,
                                    "value",
                                    lv_value_1_0,
                                    "de.fraunhofer.ipa.deployment.Util.UbuntuVersion");
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
    // $ANTLR end "ruleUbuntuVersionValue"


    // $ANTLR start "entryRuleDouble0"
    // InternalTargetEnvironmentParser.g:4696:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalTargetEnvironmentParser.g:4696:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalTargetEnvironmentParser.g:4697:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalTargetEnvironmentParser.g:4703:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4709:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalTargetEnvironmentParser.g:4710:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalTargetEnvironmentParser.g:4720:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalTargetEnvironmentParser.g:4720:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalTargetEnvironmentParser.g:4721:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalTargetEnvironmentParser.g:4727:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4733:2: (this_DECINT_0= RULE_DECINT )
            // InternalTargetEnvironmentParser.g:4734:2: this_DECINT_0= RULE_DECINT
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
    // InternalTargetEnvironmentParser.g:4744:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTargetEnvironmentParser.g:4744:47: (iv_ruleEString= ruleEString EOF )
            // InternalTargetEnvironmentParser.g:4745:2: iv_ruleEString= ruleEString EOF
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
    // InternalTargetEnvironmentParser.g:4751:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4757:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTargetEnvironmentParser.g:4758:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTargetEnvironmentParser.g:4758:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_STRING) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_ID) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4759:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:4767:3: this_ID_1= RULE_ID
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
    // InternalTargetEnvironmentParser.g:4778:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:4780:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalTargetEnvironmentParser.g:4781:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalTargetEnvironmentParser.g:4790:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:4797:2: (kw= HyphenMinus )
            // InternalTargetEnvironmentParser.g:4798:2: kw= HyphenMinus
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


    // $ANTLR start "ruleProcessorArchitectureType"
    // InternalTargetEnvironmentParser.g:4809:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4815:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalTargetEnvironmentParser.g:4816:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalTargetEnvironmentParser.g:4816:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==X86) ) {
                alt78=1;
            }
            else if ( (LA78_0==Arm64) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4817:3: (enumLiteral_0= X86 )
                    {
                    // InternalTargetEnvironmentParser.g:4817:3: (enumLiteral_0= X86 )
                    // InternalTargetEnvironmentParser.g:4818:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                                    current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:4825:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalTargetEnvironmentParser.g:4825:3: (enumLiteral_1= Arm64 )
                    // InternalTargetEnvironmentParser.g:4826:4: enumLiteral_1= Arm64
                    {
                    enumLiteral_1=(Token)match(input,Arm64,FOLLOW_2);

                                    current = grammarAccess.getProcessorArchitectureTypeAccess().getArm64EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_1, grammarAccess.getProcessorArchitectureTypeAccess().getArm64EnumLiteralDeclaration_1());


                    }


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
    // $ANTLR end "ruleProcessorArchitectureType"


    // $ANTLR start "ruleLinuxDistribution"
    // InternalTargetEnvironmentParser.g:4836:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4842:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalTargetEnvironmentParser.g:4843:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalTargetEnvironmentParser.g:4843:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==Ubuntu) ) {
                alt79=1;
            }
            else if ( (LA79_0==Debian) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4844:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalTargetEnvironmentParser.g:4844:3: (enumLiteral_0= Ubuntu )
                    // InternalTargetEnvironmentParser.g:4845:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                                    current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:4852:3: (enumLiteral_1= Debian )
                    {
                    // InternalTargetEnvironmentParser.g:4852:3: (enumLiteral_1= Debian )
                    // InternalTargetEnvironmentParser.g:4853:4: enumLiteral_1= Debian
                    {
                    enumLiteral_1=(Token)match(input,Debian,FOLLOW_2);

                                    current = grammarAccess.getLinuxDistributionAccess().getDebianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_1, grammarAccess.getLinuxDistributionAccess().getDebianEnumLiteralDeclaration_1());


                    }


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
    // $ANTLR end "ruleLinuxDistribution"


    // $ANTLR start "ruleUbuntuVersion"
    // InternalTargetEnvironmentParser.g:4863:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4869:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalTargetEnvironmentParser.g:4870:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalTargetEnvironmentParser.g:4870:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==Focal) ) {
                alt80=1;
            }
            else if ( (LA80_0==Jammy) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4871:3: (enumLiteral_0= Focal )
                    {
                    // InternalTargetEnvironmentParser.g:4871:3: (enumLiteral_0= Focal )
                    // InternalTargetEnvironmentParser.g:4872:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                                    current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:4879:3: (enumLiteral_1= Jammy )
                    {
                    // InternalTargetEnvironmentParser.g:4879:3: (enumLiteral_1= Jammy )
                    // InternalTargetEnvironmentParser.g:4880:4: enumLiteral_1= Jammy
                    {
                    enumLiteral_1=(Token)match(input,Jammy,FOLLOW_2);

                                    current = grammarAccess.getUbuntuVersionAccess().getJammyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_1, grammarAccess.getUbuntuVersionAccess().getJammyEnumLiteralDeclaration_1());


                    }


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
    // $ANTLR end "ruleUbuntuVersion"

    // Delegated rules


    protected DFA56 dfa56 = new DFA56(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\64\1\57\1\73\2\71\1\56\1\25\5\uffff";
    static final String dfa_3s = "\1\64\1\57\1\75\2\71\1\56\1\40\5\uffff";
    static final String dfa_4s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\2\uffff\1\11\1\10\5\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3047:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0400000000044000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0410000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0400000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0400000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0400020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x28C82D8000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400020000800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400000000020010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000021010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000001010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400020000800002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400020000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000100000000L});

}
