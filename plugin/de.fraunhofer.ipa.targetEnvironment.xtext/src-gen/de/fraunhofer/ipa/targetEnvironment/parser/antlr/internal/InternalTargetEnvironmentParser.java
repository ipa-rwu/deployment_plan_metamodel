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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "TargetDeployEnviroment", "ComputationDeviceType", "Processor_architecture", "RefConnectionProperty", "ConfigDeviceProperty", "LinuxOpertingSystem", "MacOSOpertingSystem", "ComputationResouce", "ComputationDevice", "ConfigConnection", "Configuration", "ConnectDevice", "DeviceResouce", "IncludeDevice", "Interface_name", "RefConnection", "RefDeviceType", "AttributeKind", "SelectionKind", "Device_volume", "Identity_name", "Description", "DeviceType", "MaximumKind", "MinimumKind", "Core_number", "Mac_address", "Properties", "Subnet_mask", "Dns_server", "Ip_address", "Os_version", "RefDevice", "Processor", "RangeKind", "Container", "Ethernet", "Device", "Gateway", "Os_name", "Debian", "Ubuntu", "Value", "Arm64", "Focal", "From", "Jammy", "Kind", "Name", "Type", "Wlan", "Port", "HyphenMinusHyphenMinusHyphenMinus", "Usb", "X86", "HyphenMinus", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Core_number=30;
    public static final int Configuration=15;
    public static final int Port=56;
    public static final int ComputationResouce=12;
    public static final int AttributeKind=22;
    public static final int RefDeviceType=21;
    public static final int Name=53;
    public static final int Container=40;
    public static final int Debian=45;
    public static final int Kind=52;
    public static final int ConnectDevice=16;
    public static final int Ubuntu=46;
    public static final int RULE_DEDENT=66;
    public static final int LinuxOpertingSystem=10;
    public static final int RULE_ID=67;
    public static final int Device=42;
    public static final int ConfigConnection=14;
    public static final int RULE_DIGIT=61;
    public static final int HyphenMinusHyphenMinusHyphenMinus=57;
    public static final int Interface_name=19;
    public static final int SelectionKind=23;
    public static final int DeviceType=27;
    public static final int Subnet_mask=33;
    public static final int TargetDeployEnviroment=5;
    public static final int Arm64=48;
    public static final int RULE_INT=68;
    public static final int ComputationDevice=13;
    public static final int Ethernet=41;
    public static final int Value=47;
    public static final int RULE_ML_COMMENT=70;
    public static final int Dns_server=34;
    public static final int RefConnectionProperty=8;
    public static final int ConfigDeviceProperty=9;
    public static final int Description=26;
    public static final int Processor=38;
    public static final int RULE_STRING=69;
    public static final int Focal=49;
    public static final int Wlan=55;
    public static final int Properties=32;
    public static final int DeviceResouce=17;
    public static final int RULE_SL_COMMENT=64;
    public static final int CommunicationConnection=4;
    public static final int Os_name=44;
    public static final int HyphenMinus=60;
    public static final int RULE_DOUBLE=63;
    public static final int Device_volume=24;
    public static final int Gateway=43;
    public static final int X86=59;
    public static final int RULE_DECINT=62;
    public static final int MinimumKind=29;
    public static final int EOF=-1;
    public static final int RULE_INDENT=65;
    public static final int Mac_address=31;
    public static final int Jammy=51;
    public static final int RefDevice=37;
    public static final int Usb=58;
    public static final int RULE_WS=71;
    public static final int MaximumKind=28;
    public static final int From=50;
    public static final int RULE_ANY_OTHER=72;
    public static final int ComputationDeviceType=6;
    public static final int Processor_architecture=7;
    public static final int Identity_name=25;
    public static final int RangeKind=39;
    public static final int Os_version=36;
    public static final int RefConnection=20;
    public static final int Type=54;
    public static final int MacOSOpertingSystem=11;
    public static final int Ip_address=35;
    public static final int IncludeDevice=18;

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
    // InternalTargetEnvironmentParser.g:146:1: ruleTargetDeployEnviroment returns [EObject current=null] : ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT ) ;
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

        EObject lv_configConnections_18_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:152:2: ( ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:153:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:153:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:154:3: () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT
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

            // InternalTargetEnvironmentParser.g:268:3: (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ConfigConnection) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:269:4: otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT
                    {
                    otherlv_16=(Token)match(input,ConfigConnection,FOLLOW_3);

                            newLeafNode(otherlv_16, grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionKeyword_6_0());

                    this_INDENT_17=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_17, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:277:4: ( (lv_configConnections_18_0= ruleConfigConnection ) )+
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
                          // InternalTargetEnvironmentParser.g:278:5: (lv_configConnections_18_0= ruleConfigConnection )
                          {
                          // InternalTargetEnvironmentParser.g:278:5: (lv_configConnections_18_0= ruleConfigConnection )
                          // InternalTargetEnvironmentParser.g:279:6: lv_configConnections_18_0= ruleConfigConnection
                          {

                                      newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionsConfigConnectionParserRuleCall_6_2_0());

                          pushFollow(FOLLOW_9);
                          lv_configConnections_18_0=ruleConfigConnection();

                          state._fsp--;


                                      if (current==null) {
                                        current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                                      }
                                      add(
                                        current,
                                        "configConnections",
                                        lv_configConnections_18_0,
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
    // InternalTargetEnvironmentParser.g:1039:1: ruleAbstractCommunicationConnection returns [EObject current=null] : (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection ) ;
    public final EObject ruleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationConnection_0 = null;

        EObject this_NetworkConnection_1 = null;

        EObject this_UsbConnection_2 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1045:2: ( (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection ) )
            // InternalTargetEnvironmentParser.g:1046:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection )
            {
            // InternalTargetEnvironmentParser.g:1046:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection )
            int alt17=3;
            alt17 = dfa17.predict(input);
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
                case 3 :
                    // InternalTargetEnvironmentParser.g:1065:3: this_UsbConnection_2= ruleUsbConnection
                    {

                          newCompositeNode(grammarAccess.getAbstractCommunicationConnectionAccess().getUsbConnectionParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_UsbConnection_2=ruleUsbConnection();

                    state._fsp--;


                          current = this_UsbConnection_2;
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
    // InternalTargetEnvironmentParser.g:1077:1: entryRuleAbstractNetworkProperty returns [EObject current=null] : iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF ;
    public final EObject entryRuleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1077:64: (iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1078:2: iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:1084:1: ruleAbstractNetworkProperty returns [EObject current=null] : (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty ) ;
    public final EObject ruleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject this_IdentityNameNetworkProperty_0 = null;

        EObject this_InterfaceNetworkProperty_1 = null;

        EObject this_AddressNetworkProperty_2 = null;

        EObject this_MacAddressNetworkProperty_3 = null;

        EObject this_GatewayNetworkProperty_4 = null;

        EObject this_SubnetMaskNetworkProperty_5 = null;

        EObject this_DNSServerNetworkProperty_6 = null;

        EObject this_PortNetworkProperty_7 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1090:2: ( (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty ) )
            // InternalTargetEnvironmentParser.g:1091:2: (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty )
            {
            // InternalTargetEnvironmentParser.g:1091:2: (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty )
            int alt18=8;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1092:3: this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty
                    {

                          newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getIdentityNameNetworkPropertyParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_IdentityNameNetworkProperty_0=ruleIdentityNameNetworkProperty();

                    state._fsp--;


                          current = this_IdentityNameNetworkProperty_0;
                          afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:1101:3: this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty
                    {

                          newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getInterfaceNetworkPropertyParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_InterfaceNetworkProperty_1=ruleInterfaceNetworkProperty();

                    state._fsp--;


                          current = this_InterfaceNetworkProperty_1;
                          afterParserOrEnumRuleCall();


                    }
                    break;
                case 3 :
                    // InternalTargetEnvironmentParser.g:1110:3: this_AddressNetworkProperty_2= ruleAddressNetworkProperty
                    {

                          newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getAddressNetworkPropertyParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_AddressNetworkProperty_2=ruleAddressNetworkProperty();

                    state._fsp--;


                          current = this_AddressNetworkProperty_2;
                          afterParserOrEnumRuleCall();


                    }
                    break;
                case 4 :
                    // InternalTargetEnvironmentParser.g:1119:3: this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty
                    {

                          newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getMacAddressNetworkPropertyParserRuleCall_3());

                    pushFollow(FOLLOW_2);
                    this_MacAddressNetworkProperty_3=ruleMacAddressNetworkProperty();

                    state._fsp--;


                          current = this_MacAddressNetworkProperty_3;
                          afterParserOrEnumRuleCall();


                    }
                    break;
                case 5 :
                    // InternalTargetEnvironmentParser.g:1128:3: this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty
                    {

                          newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getGatewayNetworkPropertyParserRuleCall_4());

                    pushFollow(FOLLOW_2);
                    this_GatewayNetworkProperty_4=ruleGatewayNetworkProperty();

                    state._fsp--;


                          current = this_GatewayNetworkProperty_4;
                          afterParserOrEnumRuleCall();


                    }
                    break;
                case 6 :
                    // InternalTargetEnvironmentParser.g:1137:3: this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty
                    {

                          newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getSubnetMaskNetworkPropertyParserRuleCall_5());

                    pushFollow(FOLLOW_2);
                    this_SubnetMaskNetworkProperty_5=ruleSubnetMaskNetworkProperty();

                    state._fsp--;


                          current = this_SubnetMaskNetworkProperty_5;
                          afterParserOrEnumRuleCall();


                    }
                    break;
                case 7 :
                    // InternalTargetEnvironmentParser.g:1146:3: this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty
                    {

                          newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getDNSServerNetworkPropertyParserRuleCall_6());

                    pushFollow(FOLLOW_2);
                    this_DNSServerNetworkProperty_6=ruleDNSServerNetworkProperty();

                    state._fsp--;


                          current = this_DNSServerNetworkProperty_6;
                          afterParserOrEnumRuleCall();


                    }
                    break;
                case 8 :
                    // InternalTargetEnvironmentParser.g:1155:3: this_PortNetworkProperty_7= rulePortNetworkProperty
                    {

                          newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getPortNetworkPropertyParserRuleCall_7());

                    pushFollow(FOLLOW_2);
                    this_PortNetworkProperty_7=rulePortNetworkProperty();

                    state._fsp--;


                          current = this_PortNetworkProperty_7;
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


    // $ANTLR start "entryRuleAbstractUsbProperty"
    // InternalTargetEnvironmentParser.g:1167:1: entryRuleAbstractUsbProperty returns [EObject current=null] : iv_ruleAbstractUsbProperty= ruleAbstractUsbProperty EOF ;
    public final EObject entryRuleAbstractUsbProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractUsbProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1167:60: (iv_ruleAbstractUsbProperty= ruleAbstractUsbProperty EOF )
            // InternalTargetEnvironmentParser.g:1168:2: iv_ruleAbstractUsbProperty= ruleAbstractUsbProperty EOF
            {
             newCompositeNode(grammarAccess.getAbstractUsbPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractUsbProperty=ruleAbstractUsbProperty();

            state._fsp--;

             current =iv_ruleAbstractUsbProperty;
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
    // $ANTLR end "entryRuleAbstractUsbProperty"


    // $ANTLR start "ruleAbstractUsbProperty"
    // InternalTargetEnvironmentParser.g:1174:1: ruleAbstractUsbProperty returns [EObject current=null] : this_DeviceVolumeUsbProperty_0= ruleDeviceVolumeUsbProperty ;
    public final EObject ruleAbstractUsbProperty() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceVolumeUsbProperty_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1180:2: (this_DeviceVolumeUsbProperty_0= ruleDeviceVolumeUsbProperty )
            // InternalTargetEnvironmentParser.g:1181:2: this_DeviceVolumeUsbProperty_0= ruleDeviceVolumeUsbProperty
            {

                newCompositeNode(grammarAccess.getAbstractUsbPropertyAccess().getDeviceVolumeUsbPropertyParserRuleCall());

            pushFollow(FOLLOW_2);
            this_DeviceVolumeUsbProperty_0=ruleDeviceVolumeUsbProperty();

            state._fsp--;


                current = this_DeviceVolumeUsbProperty_0;
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
    // $ANTLR end "ruleAbstractUsbProperty"


    // $ANTLR start "entryRuleInterfaceNetworkProperty"
    // InternalTargetEnvironmentParser.g:1192:1: entryRuleInterfaceNetworkProperty returns [EObject current=null] : iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF ;
    public final EObject entryRuleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1192:65: (iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1193:2: iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:1199:1: ruleInterfaceNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:1205:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1206:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1206:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1207:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1207:3: ()
            // InternalTargetEnvironmentParser.g:1208:4:
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

            // InternalTargetEnvironmentParser.g:1225:3: ( (lv_name_3_0= Interface_name ) )
            // InternalTargetEnvironmentParser.g:1226:4: (lv_name_3_0= Interface_name )
            {
            // InternalTargetEnvironmentParser.g:1226:4: (lv_name_3_0= Interface_name )
            // InternalTargetEnvironmentParser.g:1227:5: lv_name_3_0= Interface_name
            {
            lv_name_3_0=(Token)match(input,Interface_name,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getInterfaceNetworkPropertyAccess().getNameInterface_nameKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getInterfaceNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "interface_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                  newLeafNode(this_INDENT_4, grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                  newLeafNode(otherlv_5, grammarAccess.getInterfaceNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1247:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1248:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1248:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1249:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:1266:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Description) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1267:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1271:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1272:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1272:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1273:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:1291:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Value) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1292:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1296:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1297:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1297:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1298:6: lv_value_10_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:1324:1: entryRuleAddressNetworkProperty returns [EObject current=null] : iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF ;
    public final EObject entryRuleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1324:63: (iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1325:2: iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:1331:1: ruleAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:1337:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1338:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1338:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1339:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1339:3: ()
            // InternalTargetEnvironmentParser.g:1340:4:
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

            // InternalTargetEnvironmentParser.g:1357:3: ( (lv_name_3_0= Ip_address ) )
            // InternalTargetEnvironmentParser.g:1358:4: (lv_name_3_0= Ip_address )
            {
            // InternalTargetEnvironmentParser.g:1358:4: (lv_name_3_0= Ip_address )
            // InternalTargetEnvironmentParser.g:1359:5: lv_name_3_0= Ip_address
            {
            lv_name_3_0=(Token)match(input,Ip_address,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getAddressNetworkPropertyAccess().getNameIp_addressKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getAddressNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "ip_address");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                  newLeafNode(this_INDENT_4, grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                  newLeafNode(otherlv_5, grammarAccess.getAddressNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1379:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1380:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1380:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1381:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:1398:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Description) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1399:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1403:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1404:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1404:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1405:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:1423:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1424:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1428:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1429:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1429:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1430:6: lv_value_10_0= rulePropertyValue
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


    // $ANTLR start "entryRuleIdentityNameNetworkProperty"
    // InternalTargetEnvironmentParser.g:1456:1: entryRuleIdentityNameNetworkProperty returns [EObject current=null] : iv_ruleIdentityNameNetworkProperty= ruleIdentityNameNetworkProperty EOF ;
    public final EObject entryRuleIdentityNameNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentityNameNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1456:68: (iv_ruleIdentityNameNetworkProperty= ruleIdentityNameNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1457:2: iv_ruleIdentityNameNetworkProperty= ruleIdentityNameNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getIdentityNameNetworkPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleIdentityNameNetworkProperty=ruleIdentityNameNetworkProperty();

            state._fsp--;

             current =iv_ruleIdentityNameNetworkProperty;
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
    // $ANTLR end "entryRuleIdentityNameNetworkProperty"


    // $ANTLR start "ruleIdentityNameNetworkProperty"
    // InternalTargetEnvironmentParser.g:1463:1: ruleIdentityNameNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
    public final EObject ruleIdentityNameNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_DEDENT_9=null;
        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1469:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1470:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1470:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1471:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1471:3: ()
            // InternalTargetEnvironmentParser.g:1472:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getIdentityNameNetworkPropertyAccess().getIdentityNameNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getIdentityNameNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_31);

                  newLeafNode(otherlv_2, grammarAccess.getIdentityNameNetworkPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1489:3: ( (lv_name_3_0= Identity_name ) )
            // InternalTargetEnvironmentParser.g:1490:4: (lv_name_3_0= Identity_name )
            {
            // InternalTargetEnvironmentParser.g:1490:4: (lv_name_3_0= Identity_name )
            // InternalTargetEnvironmentParser.g:1491:5: lv_name_3_0= Identity_name
            {
            lv_name_3_0=(Token)match(input,Identity_name,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getIdentityNameNetworkPropertyAccess().getNameIdentity_nameKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getIdentityNameNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "identity_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                  newLeafNode(this_INDENT_4, grammarAccess.getIdentityNameNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                  newLeafNode(otherlv_5, grammarAccess.getIdentityNameNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1511:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1512:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1512:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1513:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getIdentityNameNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_32);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getIdentityNameNetworkPropertyRule());
                      }
                      set(
                        current,
                        "kind",
                        lv_kind_6_0,
                        "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1530:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Description) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1531:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getIdentityNameNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1535:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1536:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1536:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1537:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getIdentityNameNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_11);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getIdentityNameNetworkPropertyRule());
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

            this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_9, grammarAccess.getIdentityNameNetworkPropertyAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "ruleIdentityNameNetworkProperty"


    // $ANTLR start "entryRuleMacAddressNetworkProperty"
    // InternalTargetEnvironmentParser.g:1563:1: entryRuleMacAddressNetworkProperty returns [EObject current=null] : iv_ruleMacAddressNetworkProperty= ruleMacAddressNetworkProperty EOF ;
    public final EObject entryRuleMacAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacAddressNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1563:66: (iv_ruleMacAddressNetworkProperty= ruleMacAddressNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1564:2: iv_ruleMacAddressNetworkProperty= ruleMacAddressNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getMacAddressNetworkPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleMacAddressNetworkProperty=ruleMacAddressNetworkProperty();

            state._fsp--;

             current =iv_ruleMacAddressNetworkProperty;
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
    // $ANTLR end "entryRuleMacAddressNetworkProperty"


    // $ANTLR start "ruleMacAddressNetworkProperty"
    // InternalTargetEnvironmentParser.g:1570:1: ruleMacAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
    public final EObject ruleMacAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_DEDENT_9=null;
        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1576:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1577:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1577:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1578:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1578:3: ()
            // InternalTargetEnvironmentParser.g:1579:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getMacAddressNetworkPropertyAccess().getMacAddressNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getMacAddressNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_33);

                  newLeafNode(otherlv_2, grammarAccess.getMacAddressNetworkPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1596:3: ( (lv_name_3_0= Mac_address ) )
            // InternalTargetEnvironmentParser.g:1597:4: (lv_name_3_0= Mac_address )
            {
            // InternalTargetEnvironmentParser.g:1597:4: (lv_name_3_0= Mac_address )
            // InternalTargetEnvironmentParser.g:1598:5: lv_name_3_0= Mac_address
            {
            lv_name_3_0=(Token)match(input,Mac_address,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getMacAddressNetworkPropertyAccess().getNameMac_addressKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getMacAddressNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "mac_address");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                  newLeafNode(this_INDENT_4, grammarAccess.getMacAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                  newLeafNode(otherlv_5, grammarAccess.getMacAddressNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1618:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1619:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1619:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1620:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getMacAddressNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_32);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getMacAddressNetworkPropertyRule());
                      }
                      set(
                        current,
                        "kind",
                        lv_kind_6_0,
                        "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1637:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Description) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1638:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getMacAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1642:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1643:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1643:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1644:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getMacAddressNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_11);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getMacAddressNetworkPropertyRule());
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

            this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_9, grammarAccess.getMacAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "ruleMacAddressNetworkProperty"


    // $ANTLR start "entryRuleGatewayNetworkProperty"
    // InternalTargetEnvironmentParser.g:1670:1: entryRuleGatewayNetworkProperty returns [EObject current=null] : iv_ruleGatewayNetworkProperty= ruleGatewayNetworkProperty EOF ;
    public final EObject entryRuleGatewayNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGatewayNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1670:63: (iv_ruleGatewayNetworkProperty= ruleGatewayNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1671:2: iv_ruleGatewayNetworkProperty= ruleGatewayNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getGatewayNetworkPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleGatewayNetworkProperty=ruleGatewayNetworkProperty();

            state._fsp--;

             current =iv_ruleGatewayNetworkProperty;
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
    // $ANTLR end "entryRuleGatewayNetworkProperty"


    // $ANTLR start "ruleGatewayNetworkProperty"
    // InternalTargetEnvironmentParser.g:1677:1: ruleGatewayNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleGatewayNetworkProperty() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:1683:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1684:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1684:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1685:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1685:3: ()
            // InternalTargetEnvironmentParser.g:1686:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getGatewayNetworkPropertyAccess().getGatewayNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getGatewayNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_34);

                  newLeafNode(otherlv_2, grammarAccess.getGatewayNetworkPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1703:3: ( (lv_name_3_0= Gateway ) )
            // InternalTargetEnvironmentParser.g:1704:4: (lv_name_3_0= Gateway )
            {
            // InternalTargetEnvironmentParser.g:1704:4: (lv_name_3_0= Gateway )
            // InternalTargetEnvironmentParser.g:1705:5: lv_name_3_0= Gateway
            {
            lv_name_3_0=(Token)match(input,Gateway,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getGatewayNetworkPropertyAccess().getNameGatewayKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getGatewayNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "gateway");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                  newLeafNode(this_INDENT_4, grammarAccess.getGatewayNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                  newLeafNode(otherlv_5, grammarAccess.getGatewayNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1725:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1726:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1726:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1727:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getGatewayNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getGatewayNetworkPropertyRule());
                      }
                      set(
                        current,
                        "kind",
                        lv_kind_6_0,
                        "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1744:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Description) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1745:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getGatewayNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1749:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1750:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1750:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1751:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getGatewayNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getGatewayNetworkPropertyRule());
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

            // InternalTargetEnvironmentParser.g:1769:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Value) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1770:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getGatewayNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1774:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1775:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1775:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1776:6: lv_value_10_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getGatewayNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getGatewayNetworkPropertyRule());
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

                  newLeafNode(this_DEDENT_11, grammarAccess.getGatewayNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleGatewayNetworkProperty"


    // $ANTLR start "entryRuleSubnetMaskNetworkProperty"
    // InternalTargetEnvironmentParser.g:1802:1: entryRuleSubnetMaskNetworkProperty returns [EObject current=null] : iv_ruleSubnetMaskNetworkProperty= ruleSubnetMaskNetworkProperty EOF ;
    public final EObject entryRuleSubnetMaskNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubnetMaskNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1802:66: (iv_ruleSubnetMaskNetworkProperty= ruleSubnetMaskNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1803:2: iv_ruleSubnetMaskNetworkProperty= ruleSubnetMaskNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getSubnetMaskNetworkPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleSubnetMaskNetworkProperty=ruleSubnetMaskNetworkProperty();

            state._fsp--;

             current =iv_ruleSubnetMaskNetworkProperty;
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
    // $ANTLR end "entryRuleSubnetMaskNetworkProperty"


    // $ANTLR start "ruleSubnetMaskNetworkProperty"
    // InternalTargetEnvironmentParser.g:1809:1: ruleSubnetMaskNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleSubnetMaskNetworkProperty() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:1815:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1816:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1816:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1817:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1817:3: ()
            // InternalTargetEnvironmentParser.g:1818:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getSubnetMaskNetworkPropertyAccess().getSubnetMaskNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getSubnetMaskNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_35);

                  newLeafNode(otherlv_2, grammarAccess.getSubnetMaskNetworkPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1835:3: ( (lv_name_3_0= Subnet_mask ) )
            // InternalTargetEnvironmentParser.g:1836:4: (lv_name_3_0= Subnet_mask )
            {
            // InternalTargetEnvironmentParser.g:1836:4: (lv_name_3_0= Subnet_mask )
            // InternalTargetEnvironmentParser.g:1837:5: lv_name_3_0= Subnet_mask
            {
            lv_name_3_0=(Token)match(input,Subnet_mask,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getSubnetMaskNetworkPropertyAccess().getNameSubnet_maskKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getSubnetMaskNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "subnet_mask");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                  newLeafNode(this_INDENT_4, grammarAccess.getSubnetMaskNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                  newLeafNode(otherlv_5, grammarAccess.getSubnetMaskNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1857:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1858:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1858:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1859:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getSubnetMaskNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getSubnetMaskNetworkPropertyRule());
                      }
                      set(
                        current,
                        "kind",
                        lv_kind_6_0,
                        "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1876:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Description) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1877:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getSubnetMaskNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1881:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1882:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1882:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1883:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getSubnetMaskNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getSubnetMaskNetworkPropertyRule());
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

            // InternalTargetEnvironmentParser.g:1901:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Value) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1902:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getSubnetMaskNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1906:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1907:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1907:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1908:6: lv_value_10_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getSubnetMaskNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getSubnetMaskNetworkPropertyRule());
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

                  newLeafNode(this_DEDENT_11, grammarAccess.getSubnetMaskNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleSubnetMaskNetworkProperty"


    // $ANTLR start "entryRulePortNetworkProperty"
    // InternalTargetEnvironmentParser.g:1934:1: entryRulePortNetworkProperty returns [EObject current=null] : iv_rulePortNetworkProperty= rulePortNetworkProperty EOF ;
    public final EObject entryRulePortNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1934:60: (iv_rulePortNetworkProperty= rulePortNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:1935:2: iv_rulePortNetworkProperty= rulePortNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getPortNetworkPropertyRule());
            pushFollow(FOLLOW_1);
            iv_rulePortNetworkProperty=rulePortNetworkProperty();

            state._fsp--;

             current =iv_rulePortNetworkProperty;
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
    // $ANTLR end "entryRulePortNetworkProperty"


    // $ANTLR start "rulePortNetworkProperty"
    // InternalTargetEnvironmentParser.g:1941:1: rulePortNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject rulePortNetworkProperty() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:1947:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1948:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1948:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1949:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1949:3: ()
            // InternalTargetEnvironmentParser.g:1950:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getPortNetworkPropertyAccess().getPortNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getPortNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_36);

                  newLeafNode(otherlv_2, grammarAccess.getPortNetworkPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1967:3: ( (lv_name_3_0= Port ) )
            // InternalTargetEnvironmentParser.g:1968:4: (lv_name_3_0= Port )
            {
            // InternalTargetEnvironmentParser.g:1968:4: (lv_name_3_0= Port )
            // InternalTargetEnvironmentParser.g:1969:5: lv_name_3_0= Port
            {
            lv_name_3_0=(Token)match(input,Port,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getPortNetworkPropertyAccess().getNamePortKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getPortNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "port");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                  newLeafNode(this_INDENT_4, grammarAccess.getPortNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_28);

                  newLeafNode(otherlv_5, grammarAccess.getPortNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1989:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1990:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1990:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1991:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getPortNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getPortNetworkPropertyRule());
                      }
                      set(
                        current,
                        "kind",
                        lv_kind_6_0,
                        "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2008:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Description) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2009:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getPortNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2013:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2014:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2014:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2015:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPortNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getPortNetworkPropertyRule());
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

            // InternalTargetEnvironmentParser.g:2033:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Value) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2034:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_37);

                            newLeafNode(otherlv_9, grammarAccess.getPortNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:2038:4: ( (lv_value_10_0= rulePropertyValueInt ) )
                    // InternalTargetEnvironmentParser.g:2039:5: (lv_value_10_0= rulePropertyValueInt )
                    {
                    // InternalTargetEnvironmentParser.g:2039:5: (lv_value_10_0= rulePropertyValueInt )
                    // InternalTargetEnvironmentParser.g:2040:6: lv_value_10_0= rulePropertyValueInt
                    {

                                newCompositeNode(grammarAccess.getPortNetworkPropertyAccess().getValuePropertyValueIntParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
                    lv_value_10_0=rulePropertyValueInt();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getPortNetworkPropertyRule());
                                }
                                set(
                                  current,
                                  "value",
                                  lv_value_10_0,
                                  "de.fraunhofer.ipa.deployment.Util.PropertyValueInt");
                                afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_11, grammarAccess.getPortNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "rulePortNetworkProperty"


    // $ANTLR start "entryRuleDNSServerNetworkProperty"
    // InternalTargetEnvironmentParser.g:2066:1: entryRuleDNSServerNetworkProperty returns [EObject current=null] : iv_ruleDNSServerNetworkProperty= ruleDNSServerNetworkProperty EOF ;
    public final EObject entryRuleDNSServerNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNSServerNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2066:65: (iv_ruleDNSServerNetworkProperty= ruleDNSServerNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:2067:2: iv_ruleDNSServerNetworkProperty= ruleDNSServerNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getDNSServerNetworkPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleDNSServerNetworkProperty=ruleDNSServerNetworkProperty();

            state._fsp--;

             current =iv_ruleDNSServerNetworkProperty;
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
    // $ANTLR end "entryRuleDNSServerNetworkProperty"


    // $ANTLR start "ruleDNSServerNetworkProperty"
    // InternalTargetEnvironmentParser.g:2073:1: ruleDNSServerNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) ;
    public final EObject ruleDNSServerNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_INDENT_10=null;
        Token this_DEDENT_15=null;
        Token this_DEDENT_16=null;
        Token this_DEDENT_17=null;
        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_value_14_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2079:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2080:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2080:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2081:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2081:3: ()
            // InternalTargetEnvironmentParser.g:2082:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getDNSServerNetworkPropertyAccess().getDNSServerNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_38);

                  newLeafNode(otherlv_2, grammarAccess.getDNSServerNetworkPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2099:3: ( (lv_name_3_0= Dns_server ) )
            // InternalTargetEnvironmentParser.g:2100:4: (lv_name_3_0= Dns_server )
            {
            // InternalTargetEnvironmentParser.g:2100:4: (lv_name_3_0= Dns_server )
            // InternalTargetEnvironmentParser.g:2101:5: lv_name_3_0= Dns_server
            {
            lv_name_3_0=(Token)match(input,Dns_server,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getDNSServerNetworkPropertyAccess().getNameDns_serverKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getDNSServerNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "dns_server");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                  newLeafNode(this_INDENT_4, grammarAccess.getDNSServerNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_39);

                  newLeafNode(otherlv_5, grammarAccess.getDNSServerNetworkPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:2121:3: ( (lv_kind_6_0= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:2122:4: (lv_kind_6_0= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:2122:4: (lv_kind_6_0= ruleSelectionKind )
            // InternalTargetEnvironmentParser.g:2123:5: lv_kind_6_0= ruleSelectionKind
            {

                      newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getKindSelectionKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleSelectionKind();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getDNSServerNetworkPropertyRule());
                      }
                      set(
                        current,
                        "kind",
                        lv_kind_6_0,
                        "de.fraunhofer.ipa.deployment.Util.SelectionKind");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2140:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Description) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2141:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getDNSServerNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2145:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2146:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2146:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2147:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getDNSServerNetworkPropertyRule());
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

            // InternalTargetEnvironmentParser.g:2165:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Value) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2166:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_3);

                            newLeafNode(otherlv_9, grammarAccess.getDNSServerNetworkPropertyAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_10, grammarAccess.getDNSServerNetworkPropertyAccess().getINDENTTerminalRuleCall_8_1());


                            newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_21);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalTargetEnvironmentParser.g:2181:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2182:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2182:5: (lv_value_12_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2183:6: lv_value_12_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_3_0());

                    pushFollow(FOLLOW_9);
                    lv_value_12_0=rulePropertyValue();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getDNSServerNetworkPropertyRule());
                                }
                                add(
                                  current,
                                  "value",
                                  lv_value_12_0,
                                  "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalTargetEnvironmentParser.g:2200:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==HyphenMinus) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:2201:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getPreListElementParserRuleCall_8_4_0());

                          pushFollow(FOLLOW_21);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalTargetEnvironmentParser.g:2208:5: ( (lv_value_14_0= rulePropertyValue ) )
                          // InternalTargetEnvironmentParser.g:2209:6: (lv_value_14_0= rulePropertyValue )
                          {
                          // InternalTargetEnvironmentParser.g:2209:6: (lv_value_14_0= rulePropertyValue )
                          // InternalTargetEnvironmentParser.g:2210:7: lv_value_14_0= rulePropertyValue
                          {

                                        newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_4_1_0());

                          pushFollow(FOLLOW_9);
                          lv_value_14_0=rulePropertyValue();

                          state._fsp--;


                                        if (current==null) {
                                          current = createModelElementForParent(grammarAccess.getDNSServerNetworkPropertyRule());
                                        }
                                        add(
                                          current,
                                          "value",
                                          lv_value_14_0,
                                          "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                        afterParserOrEnumRuleCall();


                          }


                          }


                          }
                          break;

                      default :
                          break loop32;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_15, grammarAccess.getDNSServerNetworkPropertyAccess().getDEDENTTerminalRuleCall_8_5());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2233:3: (this_DEDENT_16= RULE_DEDENT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_DEDENT) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_DEDENT) ) {
                    int LA34_3 = input.LA(3);

                    if ( (LA34_3==EOF||LA34_3==HyphenMinus) ) {
                        alt34=1;
                    }
                    else if ( (LA34_3==RULE_DEDENT) ) {
                        int LA34_5 = input.LA(4);

                        if ( (LA34_5==RULE_DEDENT) ) {
                            int LA34_6 = input.LA(5);

                            if ( (LA34_6==EOF||LA34_6==HyphenMinus) ) {
                                alt34=1;
                            }
                            else if ( (LA34_6==RULE_DEDENT) ) {
                                int LA34_7 = input.LA(6);

                                if ( (LA34_7==RULE_DEDENT) ) {
                                    alt34=1;
                                }
                            }
                        }
                    }
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2234:4: this_DEDENT_16= RULE_DEDENT
                    {
                    this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_16, grammarAccess.getDNSServerNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());


                    }
                    break;

            }

            this_DEDENT_17=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_17, grammarAccess.getDNSServerNetworkPropertyAccess().getDEDENTTerminalRuleCall_10());


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
    // $ANTLR end "ruleDNSServerNetworkProperty"


    // $ANTLR start "entryRuleDeviceVolumeUsbProperty"
    // InternalTargetEnvironmentParser.g:2247:1: entryRuleDeviceVolumeUsbProperty returns [EObject current=null] : iv_ruleDeviceVolumeUsbProperty= ruleDeviceVolumeUsbProperty EOF ;
    public final EObject entryRuleDeviceVolumeUsbProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceVolumeUsbProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2247:64: (iv_ruleDeviceVolumeUsbProperty= ruleDeviceVolumeUsbProperty EOF )
            // InternalTargetEnvironmentParser.g:2248:2: iv_ruleDeviceVolumeUsbProperty= ruleDeviceVolumeUsbProperty EOF
            {
             newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeviceVolumeUsbProperty=ruleDeviceVolumeUsbProperty();

            state._fsp--;

             current =iv_ruleDeviceVolumeUsbProperty;
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
    // $ANTLR end "entryRuleDeviceVolumeUsbProperty"


    // $ANTLR start "ruleDeviceVolumeUsbProperty"
    // InternalTargetEnvironmentParser.g:2254:1: ruleDeviceVolumeUsbProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) ;
    public final EObject ruleDeviceVolumeUsbProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_INDENT_10=null;
        Token this_DEDENT_15=null;
        Token this_DEDENT_16=null;
        Token this_DEDENT_17=null;
        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_value_14_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2260:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2261:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2261:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2262:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2262:3: ()
            // InternalTargetEnvironmentParser.g:2263:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getDeviceVolumeUsbPropertyAccess().getDeviceVolumeUsbPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_40);

                  newLeafNode(otherlv_2, grammarAccess.getDeviceVolumeUsbPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2280:3: ( (lv_name_3_0= Device_volume ) )
            // InternalTargetEnvironmentParser.g:2281:4: (lv_name_3_0= Device_volume )
            {
            // InternalTargetEnvironmentParser.g:2281:4: (lv_name_3_0= Device_volume )
            // InternalTargetEnvironmentParser.g:2282:5: lv_name_3_0= Device_volume
            {
            lv_name_3_0=(Token)match(input,Device_volume,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getDeviceVolumeUsbPropertyAccess().getNameDevice_volumeKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getDeviceVolumeUsbPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "device_volume");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27);

                  newLeafNode(this_INDENT_4, grammarAccess.getDeviceVolumeUsbPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_39);

                  newLeafNode(otherlv_5, grammarAccess.getDeviceVolumeUsbPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:2302:3: ( (lv_kind_6_0= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:2303:4: (lv_kind_6_0= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:2303:4: (lv_kind_6_0= ruleSelectionKind )
            // InternalTargetEnvironmentParser.g:2304:5: lv_kind_6_0= ruleSelectionKind
            {

                      newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getKindSelectionKindParserRuleCall_6_0());

            pushFollow(FOLLOW_29);
            lv_kind_6_0=ruleSelectionKind();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getDeviceVolumeUsbPropertyRule());
                      }
                      set(
                        current,
                        "kind",
                        lv_kind_6_0,
                        "de.fraunhofer.ipa.deployment.Util.SelectionKind");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:2321:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Description) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2322:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getDeviceVolumeUsbPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2326:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2327:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2327:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2328:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_20);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getDeviceVolumeUsbPropertyRule());
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

            // InternalTargetEnvironmentParser.g:2346:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Value) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2347:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_3);

                            newLeafNode(otherlv_9, grammarAccess.getDeviceVolumeUsbPropertyAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_10, grammarAccess.getDeviceVolumeUsbPropertyAccess().getINDENTTerminalRuleCall_8_1());


                            newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_21);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalTargetEnvironmentParser.g:2362:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2363:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2363:5: (lv_value_12_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2364:6: lv_value_12_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getValuePropertyValueParserRuleCall_8_3_0());

                    pushFollow(FOLLOW_9);
                    lv_value_12_0=rulePropertyValue();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getDeviceVolumeUsbPropertyRule());
                                }
                                add(
                                  current,
                                  "value",
                                  lv_value_12_0,
                                  "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalTargetEnvironmentParser.g:2381:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==HyphenMinus) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:2382:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getPreListElementParserRuleCall_8_4_0());

                          pushFollow(FOLLOW_21);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalTargetEnvironmentParser.g:2389:5: ( (lv_value_14_0= rulePropertyValue ) )
                          // InternalTargetEnvironmentParser.g:2390:6: (lv_value_14_0= rulePropertyValue )
                          {
                          // InternalTargetEnvironmentParser.g:2390:6: (lv_value_14_0= rulePropertyValue )
                          // InternalTargetEnvironmentParser.g:2391:7: lv_value_14_0= rulePropertyValue
                          {

                                        newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getValuePropertyValueParserRuleCall_8_4_1_0());

                          pushFollow(FOLLOW_9);
                          lv_value_14_0=rulePropertyValue();

                          state._fsp--;


                                        if (current==null) {
                                          current = createModelElementForParent(grammarAccess.getDeviceVolumeUsbPropertyRule());
                                        }
                                        add(
                                          current,
                                          "value",
                                          lv_value_14_0,
                                          "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                        afterParserOrEnumRuleCall();


                          }


                          }


                          }
                          break;

                      default :
                          break loop36;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_15, grammarAccess.getDeviceVolumeUsbPropertyAccess().getDEDENTTerminalRuleCall_8_5());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2414:3: (this_DEDENT_16= RULE_DEDENT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_DEDENT) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==RULE_DEDENT) ) {
                    int LA38_3 = input.LA(3);

                    if ( (LA38_3==RULE_DEDENT) ) {
                        int LA38_4 = input.LA(4);

                        if ( (LA38_4==RULE_DEDENT) ) {
                            int LA38_6 = input.LA(5);

                            if ( (LA38_6==RULE_DEDENT) ) {
                                int LA38_7 = input.LA(6);

                                if ( (LA38_7==RULE_DEDENT) ) {
                                    alt38=1;
                                }
                            }
                            else if ( (LA38_6==EOF||LA38_6==HyphenMinus) ) {
                                alt38=1;
                            }
                        }
                    }
                    else if ( (LA38_3==EOF||LA38_3==HyphenMinus) ) {
                        alt38=1;
                    }
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2415:4: this_DEDENT_16= RULE_DEDENT
                    {
                    this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_16, grammarAccess.getDeviceVolumeUsbPropertyAccess().getDEDENTTerminalRuleCall_9());


                    }
                    break;

            }

            this_DEDENT_17=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_17, grammarAccess.getDeviceVolumeUsbPropertyAccess().getDEDENTTerminalRuleCall_10());


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
    // $ANTLR end "ruleDeviceVolumeUsbProperty"


    // $ANTLR start "entryRuleDeviceType_Impl"
    // InternalTargetEnvironmentParser.g:2428:1: entryRuleDeviceType_Impl returns [EObject current=null] : iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF ;
    public final EObject entryRuleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType_Impl = null;


        try {
            // InternalTargetEnvironmentParser.g:2428:56: (iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF )
            // InternalTargetEnvironmentParser.g:2429:2: iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF
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
    // InternalTargetEnvironmentParser.g:2435:1: ruleDeviceType_Impl returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:2441:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2442:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2442:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2443:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2443:3: ()
            // InternalTargetEnvironmentParser.g:2444:4:
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

            // InternalTargetEnvironmentParser.g:2462:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2463:4: (lv_name_4_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2463:4: (lv_name_4_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2464:5: lv_name_4_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getNameEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_41);
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

            // InternalTargetEnvironmentParser.g:2481:3: (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==DeviceResouce) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2482:4: otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,DeviceResouce,FOLLOW_3);

                            newLeafNode(otherlv_5, grammarAccess.getDeviceType_ImplAccess().getDeviceResouceKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_6, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalTargetEnvironmentParser.g:2490:4: ( (lv_deviceResource_7_0= ruleDeviceResource ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==HyphenMinus) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:2491:5: (lv_deviceResource_7_0= ruleDeviceResource )
                          {
                          // InternalTargetEnvironmentParser.g:2491:5: (lv_deviceResource_7_0= ruleDeviceResource )
                          // InternalTargetEnvironmentParser.g:2492:6: lv_deviceResource_7_0= ruleDeviceResource
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
                          if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_42);

                            newLeafNode(this_DEDENT_8, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2514:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==CommunicationConnection) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2515:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_3);

                            newLeafNode(otherlv_9, grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_10, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:2523:4: ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==HyphenMinus) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:2524:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                          {
                          // InternalTargetEnvironmentParser.g:2524:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                          // InternalTargetEnvironmentParser.g:2525:6: lv_communicationConnection_11_0= ruleAbstractCommunicationConnection
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
                          if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
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
    // InternalTargetEnvironmentParser.g:2555:1: entryRuleAbstractComputationResource returns [EObject current=null] : iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF ;
    public final EObject entryRuleAbstractComputationResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComputationResource = null;


        try {
            // InternalTargetEnvironmentParser.g:2555:68: (iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF )
            // InternalTargetEnvironmentParser.g:2556:2: iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF
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
    // InternalTargetEnvironmentParser.g:2562:1: ruleAbstractComputationResource returns [EObject current=null] : (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce ) ;
    public final EObject ruleAbstractComputationResource() throws RecognitionException {
        EObject current = null;

        EObject this_OperatingSystemResouce_0 = null;

        EObject this_ProcessorResouce_1 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2568:2: ( (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce ) )
            // InternalTargetEnvironmentParser.g:2569:2: (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce )
            {
            // InternalTargetEnvironmentParser.g:2569:2: (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Name) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_STRING) ) {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2==RULE_INDENT) ) {
                        int LA43_4 = input.LA(4);

                        if ( (LA43_4==Type) ) {
                            int LA43_5 = input.LA(5);

                            if ( ((LA43_5>=LinuxOpertingSystem && LA43_5<=MacOSOpertingSystem)) ) {
                                alt43=1;
                            }
                            else if ( (LA43_5==Processor) ) {
                                alt43=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 43, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA43_1==RULE_ID) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==RULE_INDENT) ) {
                        int LA43_4 = input.LA(4);

                        if ( (LA43_4==Type) ) {
                            int LA43_5 = input.LA(5);

                            if ( ((LA43_5>=LinuxOpertingSystem && LA43_5<=MacOSOpertingSystem)) ) {
                                alt43=1;
                            }
                            else if ( (LA43_5==Processor) ) {
                                alt43=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 43, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2570:3: this_OperatingSystemResouce_0= ruleOperatingSystemResouce
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
                    // InternalTargetEnvironmentParser.g:2579:3: this_ProcessorResouce_1= ruleProcessorResouce
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
    // InternalTargetEnvironmentParser.g:2591:1: entryRuleDeviceResource returns [EObject current=null] : iv_ruleDeviceResource= ruleDeviceResource EOF ;
    public final EObject entryRuleDeviceResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceResource = null;


        try {
            // InternalTargetEnvironmentParser.g:2591:55: (iv_ruleDeviceResource= ruleDeviceResource EOF )
            // InternalTargetEnvironmentParser.g:2592:2: iv_ruleDeviceResource= ruleDeviceResource EOF
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
    // InternalTargetEnvironmentParser.g:2598:1: ruleDeviceResource returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:2604:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2605:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2605:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2606:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {

                  newCompositeNode(grammarAccess.getDeviceResourceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getDeviceResourceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:2617:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2618:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2618:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2619:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_43);

                  newLeafNode(this_INDENT_3, grammarAccess.getDeviceResourceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_5);

                  newLeafNode(otherlv_4, grammarAccess.getDeviceResourceAccess().getTypeKeyword_4());

            // InternalTargetEnvironmentParser.g:2644:3: ( (lv_type_5_0= ruleAbstractResouceType ) )
            // InternalTargetEnvironmentParser.g:2645:4: (lv_type_5_0= ruleAbstractResouceType )
            {
            // InternalTargetEnvironmentParser.g:2645:4: (lv_type_5_0= ruleAbstractResouceType )
            // InternalTargetEnvironmentParser.g:2646:5: lv_type_5_0= ruleAbstractResouceType
            {

                      newCompositeNode(grammarAccess.getDeviceResourceAccess().getTypeAbstractResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_44);
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

            // InternalTargetEnvironmentParser.g:2663:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Properties) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2664:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_3);

                            newLeafNode(otherlv_6, grammarAccess.getDeviceResourceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_7, grammarAccess.getDeviceResourceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:2672:4: ( (lv_properties_8_0= ruleAbstractProperty ) )
                    // InternalTargetEnvironmentParser.g:2673:5: (lv_properties_8_0= ruleAbstractProperty )
                    {
                    // InternalTargetEnvironmentParser.g:2673:5: (lv_properties_8_0= ruleAbstractProperty )
                    // InternalTargetEnvironmentParser.g:2674:6: lv_properties_8_0= ruleAbstractProperty
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

                    // InternalTargetEnvironmentParser.g:2691:4: ( (lv_properties_9_0= ruleAbstractProperty ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==HyphenMinus) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:2692:5: (lv_properties_9_0= ruleAbstractProperty )
                          {
                          // InternalTargetEnvironmentParser.g:2692:5: (lv_properties_9_0= ruleAbstractProperty )
                          // InternalTargetEnvironmentParser.g:2693:6: lv_properties_9_0= ruleAbstractProperty
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
                          break loop44;
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
    // InternalTargetEnvironmentParser.g:2723:1: entryRuleComputationDeviceType returns [EObject current=null] : iv_ruleComputationDeviceType= ruleComputationDeviceType EOF ;
    public final EObject entryRuleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceType = null;


        try {
            // InternalTargetEnvironmentParser.g:2723:62: (iv_ruleComputationDeviceType= ruleComputationDeviceType EOF )
            // InternalTargetEnvironmentParser.g:2724:2: iv_ruleComputationDeviceType= ruleComputationDeviceType EOF
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
    // InternalTargetEnvironmentParser.g:2730:1: ruleComputationDeviceType returns [EObject current=null] : (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT ) ;
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
        Token this_DEDENT_14=null;
        Token otherlv_15=null;
        Token this_INDENT_16=null;
        Token this_DEDENT_18=null;
        Token this_DEDENT_19=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_deviceResource_6_0 = null;

        EObject lv_computationResource_11_0 = null;

        EObject lv_computationResource_13_0 = null;

        EObject lv_communicationConnection_17_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2736:2: ( (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2737:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2737:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2738:3: otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ComputationDeviceType,FOLLOW_3);

                  newLeafNode(otherlv_0, grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4);

                  newLeafNode(this_INDENT_1, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_2, grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:2750:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2751:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2751:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2752:5: lv_name_3_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_45);
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

            // InternalTargetEnvironmentParser.g:2769:3: (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DeviceResouce) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2770:4: otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,DeviceResouce,FOLLOW_3);

                            newLeafNode(otherlv_4, grammarAccess.getComputationDeviceTypeAccess().getDeviceResouceKeyword_4_0());

                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_5, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1());

                    // InternalTargetEnvironmentParser.g:2778:4: ( (lv_deviceResource_6_0= ruleDeviceResource ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==HyphenMinus) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:2779:5: (lv_deviceResource_6_0= ruleDeviceResource )
                          {
                          // InternalTargetEnvironmentParser.g:2779:5: (lv_deviceResource_6_0= ruleDeviceResource )
                          // InternalTargetEnvironmentParser.g:2780:6: lv_deviceResource_6_0= ruleDeviceResource
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
                          if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_46);

                            newLeafNode(this_DEDENT_7, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2802:3: (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ComputationResouce) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2803:4: otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,ComputationResouce,FOLLOW_3);

                            newLeafNode(otherlv_8, grammarAccess.getComputationDeviceTypeAccess().getComputationResouceKeyword_5_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_9, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());


                            newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getPreListElementParserRuleCall_5_2());

                    pushFollow(FOLLOW_4);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalTargetEnvironmentParser.g:2818:4: ( (lv_computationResource_11_0= ruleAbstractComputationResource ) )
                    // InternalTargetEnvironmentParser.g:2819:5: (lv_computationResource_11_0= ruleAbstractComputationResource )
                    {
                    // InternalTargetEnvironmentParser.g:2819:5: (lv_computationResource_11_0= ruleAbstractComputationResource )
                    // InternalTargetEnvironmentParser.g:2820:6: lv_computationResource_11_0= ruleAbstractComputationResource
                    {

                                newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getComputationResourceAbstractComputationResourceParserRuleCall_5_3_0());

                    pushFollow(FOLLOW_9);
                    lv_computationResource_11_0=ruleAbstractComputationResource();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                                }
                                add(
                                  current,
                                  "computationResource",
                                  lv_computationResource_11_0,
                                  "de.fraunhofer.ipa.targetEnvironment.Device.AbstractComputationResource");
                                afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalTargetEnvironmentParser.g:2837:4: ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==HyphenMinus) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:2838:5: rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+
                            {

                                      newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getPreListElementParserRuleCall_5_4_0());

                            pushFollow(FOLLOW_4);
                            rulePreListElement();

                            state._fsp--;


                                      afterParserOrEnumRuleCall();

                            // InternalTargetEnvironmentParser.g:2845:5: ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+
                            int cnt48=0;
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==Name) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                              case 1 :
                                  // InternalTargetEnvironmentParser.g:2846:6: (lv_computationResource_13_0= ruleAbstractComputationResource )
                                  {
                                  // InternalTargetEnvironmentParser.g:2846:6: (lv_computationResource_13_0= ruleAbstractComputationResource )
                                  // InternalTargetEnvironmentParser.g:2847:7: lv_computationResource_13_0= ruleAbstractComputationResource
                                  {

                                                newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getComputationResourceAbstractComputationResourceParserRuleCall_5_4_1_0());

                                  pushFollow(FOLLOW_47);
                                  lv_computationResource_13_0=ruleAbstractComputationResource();

                                  state._fsp--;


                                                if (current==null) {
                                                  current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                                                }
                                                add(
                                                  current,
                                                  "computationResource",
                                                  lv_computationResource_13_0,
                                                  "de.fraunhofer.ipa.targetEnvironment.Device.AbstractComputationResource");
                                                afterParserOrEnumRuleCall();


                                  }


                                  }
                                  break;

                              default :
                                  if ( cnt48 >= 1 ) break loop48;
                                        EarlyExitException eee =
                                            new EarlyExitException(48, input);
                                        throw eee;
                                }
                                cnt48++;
                            } while (true);


                            }
                            break;

                    }

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_42);

                            newLeafNode(this_DEDENT_14, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_5_5());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2870:3: (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==CommunicationConnection) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2871:4: otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT
                    {
                    otherlv_15=(Token)match(input,CommunicationConnection,FOLLOW_3);

                            newLeafNode(otherlv_15, grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_16=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_16, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:2879:4: ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==HyphenMinus) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:2880:5: (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection )
                          {
                          // InternalTargetEnvironmentParser.g:2880:5: (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection )
                          // InternalTargetEnvironmentParser.g:2881:6: lv_communicationConnection_17_0= ruleAbstractCommunicationConnection
                          {

                                      newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());

                          pushFollow(FOLLOW_9);
                          lv_communicationConnection_17_0=ruleAbstractCommunicationConnection();

                          state._fsp--;


                                      if (current==null) {
                                        current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                                      }
                                      add(
                                        current,
                                        "communicationConnection",
                                        lv_communicationConnection_17_0,
                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstractCommunicationConnection");
                                      afterParserOrEnumRuleCall();


                          }


                          }
                          break;

                      default :
                          if ( cnt51 >= 1 ) break loop51;
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    this_DEDENT_18=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_18, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_19=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_19, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_7());


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
    // InternalTargetEnvironmentParser.g:2911:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:2911:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:2912:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:2918:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:2924:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2925:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2925:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2926:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:2926:3: ()
            // InternalTargetEnvironmentParser.g:2927:4:
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

            // InternalTargetEnvironmentParser.g:2944:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2945:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2945:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2946:5: lv_name_3_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:2971:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:2972:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:2972:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:2973:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:2990:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Description) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2991:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getConnectionPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:2995:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:2996:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:2996:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:2997:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:3015:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Value) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3016:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getConnectionPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:3020:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3021:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3021:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3022:6: lv_value_10_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:3048:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:3048:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalTargetEnvironmentParser.g:3049:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
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
    // InternalTargetEnvironmentParser.g:3055:1: ruleNetworkConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:3061:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3062:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3062:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3063:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:3063:3: ()
            // InternalTargetEnvironmentParser.g:3064:4:
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

            // InternalTargetEnvironmentParser.g:3081:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3082:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3082:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3083:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_43);

                  newLeafNode(this_INDENT_4, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_48);

                  newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:3108:3: ( (lv_type_6_0= ruleNetworkCommunicationType ) )
            // InternalTargetEnvironmentParser.g:3109:4: (lv_type_6_0= ruleNetworkCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:3109:4: (lv_type_6_0= ruleNetworkCommunicationType )
            // InternalTargetEnvironmentParser.g:3110:5: lv_type_6_0= ruleNetworkCommunicationType
            {

                      newCompositeNode(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_44);
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

            // InternalTargetEnvironmentParser.g:3127:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==Properties) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3128:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                            newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_8, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:3136:4: ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==HyphenMinus) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:3137:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                          {
                          // InternalTargetEnvironmentParser.g:3137:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                          // InternalTargetEnvironmentParser.g:3138:6: lv_properties_9_0= ruleAbstractNetworkProperty
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
                          if ( cnt55 >= 1 ) break loop55;
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
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
    // InternalTargetEnvironmentParser.g:3168:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:3168:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:3169:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
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
    // InternalTargetEnvironmentParser.g:3175:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:3181:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3182:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3182:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3183:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:3183:3: ()
            // InternalTargetEnvironmentParser.g:3184:4:
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

            // InternalTargetEnvironmentParser.g:3201:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3202:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3202:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3203:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_43);

                  newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_5);

                  newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:3228:3: ( (lv_type_6_0= ruleCommunicationType ) )
            // InternalTargetEnvironmentParser.g:3229:4: (lv_type_6_0= ruleCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:3229:4: (lv_type_6_0= ruleCommunicationType )
            // InternalTargetEnvironmentParser.g:3230:5: lv_type_6_0= ruleCommunicationType
            {

                      newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_44);
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

            // InternalTargetEnvironmentParser.g:3247:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Properties) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3248:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                            newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:3256:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==HyphenMinus) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:3257:5: (lv_properties_9_0= ruleConnectionProperty )
                          {
                          // InternalTargetEnvironmentParser.g:3257:5: (lv_properties_9_0= ruleConnectionProperty )
                          // InternalTargetEnvironmentParser.g:3258:6: lv_properties_9_0= ruleConnectionProperty
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
                          if ( cnt57 >= 1 ) break loop57;
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
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


    // $ANTLR start "entryRuleUsbConnection"
    // InternalTargetEnvironmentParser.g:3288:1: entryRuleUsbConnection returns [EObject current=null] : iv_ruleUsbConnection= ruleUsbConnection EOF ;
    public final EObject entryRuleUsbConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsbConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:3288:54: (iv_ruleUsbConnection= ruleUsbConnection EOF )
            // InternalTargetEnvironmentParser.g:3289:2: iv_ruleUsbConnection= ruleUsbConnection EOF
            {
             newCompositeNode(grammarAccess.getUsbConnectionRule());
            pushFollow(FOLLOW_1);
            iv_ruleUsbConnection=ruleUsbConnection();

            state._fsp--;

             current =iv_ruleUsbConnection;
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
    // $ANTLR end "entryRuleUsbConnection"


    // $ANTLR start "ruleUsbConnection"
    // InternalTargetEnvironmentParser.g:3295:1: ruleUsbConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleUsbConnection() throws RecognitionException {
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
            // InternalTargetEnvironmentParser.g:3301:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3302:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3302:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3303:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:3303:3: ()
            // InternalTargetEnvironmentParser.g:3304:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getUsbConnectionAccess().getUsbConnectionAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getUsbConnectionAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_2, grammarAccess.getUsbConnectionAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:3321:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3322:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3322:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3323:5: lv_name_3_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getUsbConnectionAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getUsbConnectionRule());
                      }
                      set(
                        current,
                        "name",
                        lv_name_3_0,
                        "de.fraunhofer.ipa.deployment.Util.EString");
                      afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_43);

                  newLeafNode(this_INDENT_4, grammarAccess.getUsbConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_49);

                  newLeafNode(otherlv_5, grammarAccess.getUsbConnectionAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:3348:3: ( (lv_type_6_0= ruleUsbCommunicationType ) )
            // InternalTargetEnvironmentParser.g:3349:4: (lv_type_6_0= ruleUsbCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:3349:4: (lv_type_6_0= ruleUsbCommunicationType )
            // InternalTargetEnvironmentParser.g:3350:5: lv_type_6_0= ruleUsbCommunicationType
            {

                      newCompositeNode(grammarAccess.getUsbConnectionAccess().getTypeUsbCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_44);
            lv_type_6_0=ruleUsbCommunicationType();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getUsbConnectionRule());
                      }
                      set(
                        current,
                        "type",
                        lv_type_6_0,
                        "de.fraunhofer.ipa.deployment.Util.UsbCommunicationType");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:3367:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Properties) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3368:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                            newLeafNode(otherlv_7, grammarAccess.getUsbConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_8, grammarAccess.getUsbConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:3376:4: ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==HyphenMinus) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:3377:5: (lv_properties_9_0= ruleAbstractUsbProperty )
                          {
                          // InternalTargetEnvironmentParser.g:3377:5: (lv_properties_9_0= ruleAbstractUsbProperty )
                          // InternalTargetEnvironmentParser.g:3378:6: lv_properties_9_0= ruleAbstractUsbProperty
                          {

                                      newCompositeNode(grammarAccess.getUsbConnectionAccess().getPropertiesAbstractUsbPropertyParserRuleCall_7_2_0());

                          pushFollow(FOLLOW_9);
                          lv_properties_9_0=ruleAbstractUsbProperty();

                          state._fsp--;


                                      if (current==null) {
                                        current = createModelElementForParent(grammarAccess.getUsbConnectionRule());
                                      }
                                      add(
                                        current,
                                        "properties",
                                        lv_properties_9_0,
                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstractUsbProperty");
                                      afterParserOrEnumRuleCall();


                          }


                          }
                          break;

                      default :
                          if ( cnt59 >= 1 ) break loop59;
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_10, grammarAccess.getUsbConnectionAccess().getDEDENTTerminalRuleCall_7_3());


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_11, grammarAccess.getUsbConnectionAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "ruleUsbConnection"


    // $ANTLR start "entryRuleProcessorResouce"
    // InternalTargetEnvironmentParser.g:3408:1: entryRuleProcessorResouce returns [EObject current=null] : iv_ruleProcessorResouce= ruleProcessorResouce EOF ;
    public final EObject entryRuleProcessorResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorResouce = null;


        try {
            // InternalTargetEnvironmentParser.g:3408:57: (iv_ruleProcessorResouce= ruleProcessorResouce EOF )
            // InternalTargetEnvironmentParser.g:3409:2: iv_ruleProcessorResouce= ruleProcessorResouce EOF
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
    // InternalTargetEnvironmentParser.g:3415:1: ruleProcessorResouce returns [EObject current=null] : ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleProcessorResouce() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_INDENT_7=null;
        Token this_DEDENT_9=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_properties_8_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3421:2: ( ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3422:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3422:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3423:3: () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:3423:3: ()
            // InternalTargetEnvironmentParser.g:3424:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getProcessorResouceAccess().getProcessorResouceAction_0(),
                      current);


            }

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getProcessorResouceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:3434:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3435:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3435:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3436:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getProcessorResouceAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getProcessorResouceRule());
                      }
                      set(
                        current,
                        "name",
                        lv_name_2_0,
                        "de.fraunhofer.ipa.deployment.Util.EString");
                      afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_43);

                  newLeafNode(this_INDENT_3, grammarAccess.getProcessorResouceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_50);

                  newLeafNode(otherlv_4, grammarAccess.getProcessorResouceAccess().getTypeKeyword_4());

            // InternalTargetEnvironmentParser.g:3461:3: ( (lv_type_5_0= ruleProcessorResouceType ) )
            // InternalTargetEnvironmentParser.g:3462:4: (lv_type_5_0= ruleProcessorResouceType )
            {
            // InternalTargetEnvironmentParser.g:3462:4: (lv_type_5_0= ruleProcessorResouceType )
            // InternalTargetEnvironmentParser.g:3463:5: lv_type_5_0= ruleProcessorResouceType
            {

                      newCompositeNode(grammarAccess.getProcessorResouceAccess().getTypeProcessorResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_44);
            lv_type_5_0=ruleProcessorResouceType();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getProcessorResouceRule());
                      }
                      set(
                        current,
                        "type",
                        lv_type_5_0,
                        "de.fraunhofer.ipa.deployment.Util.ProcessorResouceType");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:3480:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Properties) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3481:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_3);

                            newLeafNode(otherlv_6, grammarAccess.getProcessorResouceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_7, grammarAccess.getProcessorResouceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:3489:4: ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==HyphenMinus) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:3490:5: (lv_properties_8_0= ruleAbstracProcessorProperty )
                          {
                          // InternalTargetEnvironmentParser.g:3490:5: (lv_properties_8_0= ruleAbstracProcessorProperty )
                          // InternalTargetEnvironmentParser.g:3491:6: lv_properties_8_0= ruleAbstracProcessorProperty
                          {

                                      newCompositeNode(grammarAccess.getProcessorResouceAccess().getPropertiesAbstracProcessorPropertyParserRuleCall_6_2_0());

                          pushFollow(FOLLOW_9);
                          lv_properties_8_0=ruleAbstracProcessorProperty();

                          state._fsp--;


                                      if (current==null) {
                                        current = createModelElementForParent(grammarAccess.getProcessorResouceRule());
                                      }
                                      add(
                                        current,
                                        "properties",
                                        lv_properties_8_0,
                                        "de.fraunhofer.ipa.targetEnvironment.Device.AbstracProcessorProperty");
                                      afterParserOrEnumRuleCall();


                          }


                          }
                          break;

                      default :
                          if ( cnt61 >= 1 ) break loop61;
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_9, grammarAccess.getProcessorResouceAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_10, grammarAccess.getProcessorResouceAccess().getDEDENTTerminalRuleCall_7());


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
    // InternalTargetEnvironmentParser.g:3521:1: entryRuleAbstracProcessorProperty returns [EObject current=null] : iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF ;
    public final EObject entryRuleAbstracProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstracProcessorProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:3521:65: (iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF )
            // InternalTargetEnvironmentParser.g:3522:2: iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF
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
    // InternalTargetEnvironmentParser.g:3528:1: ruleAbstracProcessorProperty returns [EObject current=null] : (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty ) ;
    public final EObject ruleAbstracProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ArchitectureProcessorProperty_0 = null;

        EObject this_CoreProcessorProperty_1 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3534:2: ( (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty ) )
            // InternalTargetEnvironmentParser.g:3535:2: (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty )
            {
            // InternalTargetEnvironmentParser.g:3535:2: (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==HyphenMinus) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==Name) ) {
                    int LA63_2 = input.LA(3);

                    if ( (LA63_2==Processor_architecture) ) {
                        alt63=1;
                    }
                    else if ( (LA63_2==Core_number) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3536:3: this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty
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
                    // InternalTargetEnvironmentParser.g:3545:3: this_CoreProcessorProperty_1= ruleCoreProcessorProperty
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
    // InternalTargetEnvironmentParser.g:3557:1: entryRuleArchitectureProcessorProperty returns [EObject current=null] : iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF ;
    public final EObject entryRuleArchitectureProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureProcessorProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:3557:70: (iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF )
            // InternalTargetEnvironmentParser.g:3558:2: iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF
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
    // InternalTargetEnvironmentParser.g:3564:1: ruleArchitectureProcessorProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:3570:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3571:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3571:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3572:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:3572:3: ()
            // InternalTargetEnvironmentParser.g:3573:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_51);

                  newLeafNode(otherlv_2, grammarAccess.getArchitectureProcessorPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:3590:3: ( (lv_name_3_0= Processor_architecture ) )
            // InternalTargetEnvironmentParser.g:3591:4: (lv_name_3_0= Processor_architecture )
            {
            // InternalTargetEnvironmentParser.g:3591:4: (lv_name_3_0= Processor_architecture )
            // InternalTargetEnvironmentParser.g:3592:5: lv_name_3_0= Processor_architecture
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

            // InternalTargetEnvironmentParser.g:3612:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:3613:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:3613:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:3614:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:3631:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Description) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3632:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getArchitectureProcessorPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:3636:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:3637:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:3637:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:3638:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:3656:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Value) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3657:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getArchitectureProcessorPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:3661:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3662:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3662:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3663:6: lv_value_10_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:3689:1: entryRuleCoreProcessorProperty returns [EObject current=null] : iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF ;
    public final EObject entryRuleCoreProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoreProcessorProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:3689:62: (iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF )
            // InternalTargetEnvironmentParser.g:3690:2: iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF
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
    // InternalTargetEnvironmentParser.g:3696:1: ruleCoreProcessorProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:3702:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3703:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3703:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3704:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:3704:3: ()
            // InternalTargetEnvironmentParser.g:3705:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_52);

                  newLeafNode(otherlv_2, grammarAccess.getCoreProcessorPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:3722:3: ( (lv_name_3_0= Core_number ) )
            // InternalTargetEnvironmentParser.g:3723:4: (lv_name_3_0= Core_number )
            {
            // InternalTargetEnvironmentParser.g:3723:4: (lv_name_3_0= Core_number )
            // InternalTargetEnvironmentParser.g:3724:5: lv_name_3_0= Core_number
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

            // InternalTargetEnvironmentParser.g:3744:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:3745:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:3745:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:3746:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:3763:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Description) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3764:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getCoreProcessorPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:3768:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:3769:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:3769:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:3770:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:3788:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Value) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3789:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getCoreProcessorPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:3793:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:3794:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:3794:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:3795:6: lv_value_10_0= rulePropertyValue
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


    // $ANTLR start "entryRuleOperatingSystemResouce"
    // InternalTargetEnvironmentParser.g:3821:1: entryRuleOperatingSystemResouce returns [EObject current=null] : iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF ;
    public final EObject entryRuleOperatingSystemResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatingSystemResouce = null;


        try {
            // InternalTargetEnvironmentParser.g:3821:63: (iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF )
            // InternalTargetEnvironmentParser.g:3822:2: iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF
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
    // InternalTargetEnvironmentParser.g:3828:1: ruleOperatingSystemResouce returns [EObject current=null] : ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleOperatingSystemResouce() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_INDENT_7=null;
        Token this_DEDENT_9=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_properties_8_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3834:2: ( ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3835:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3835:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3836:3: () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:3836:3: ()
            // InternalTargetEnvironmentParser.g:3837:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getOperatingSystemResouceAccess().getOperatingSystemResouceAction_0(),
                      current);


            }

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getOperatingSystemResouceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:3847:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:3848:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:3848:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:3849:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getOperatingSystemResouceRule());
                      }
                      set(
                        current,
                        "name",
                        lv_name_2_0,
                        "de.fraunhofer.ipa.deployment.Util.EString");
                      afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_43);

                  newLeafNode(this_INDENT_3, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_53);

                  newLeafNode(otherlv_4, grammarAccess.getOperatingSystemResouceAccess().getTypeKeyword_4());

            // InternalTargetEnvironmentParser.g:3874:3: ( (lv_type_5_0= ruleOpertingSystemResouceType ) )
            // InternalTargetEnvironmentParser.g:3875:4: (lv_type_5_0= ruleOpertingSystemResouceType )
            {
            // InternalTargetEnvironmentParser.g:3875:4: (lv_type_5_0= ruleOpertingSystemResouceType )
            // InternalTargetEnvironmentParser.g:3876:5: lv_type_5_0= ruleOpertingSystemResouceType
            {

                      newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getTypeOpertingSystemResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_44);
            lv_type_5_0=ruleOpertingSystemResouceType();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getOperatingSystemResouceRule());
                      }
                      set(
                        current,
                        "type",
                        lv_type_5_0,
                        "de.fraunhofer.ipa.deployment.Util.OpertingSystemResouceType");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:3893:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Properties) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3894:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_3);

                            newLeafNode(otherlv_6, grammarAccess.getOperatingSystemResouceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_7, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:3902:4: ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==HyphenMinus) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:3903:5: (lv_properties_8_0= ruleAbstractOperatingSystemProperty )
                          {
                          // InternalTargetEnvironmentParser.g:3903:5: (lv_properties_8_0= ruleAbstractOperatingSystemProperty )
                          // InternalTargetEnvironmentParser.g:3904:6: lv_properties_8_0= ruleAbstractOperatingSystemProperty
                          {

                                      newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getPropertiesAbstractOperatingSystemPropertyParserRuleCall_6_2_0());

                          pushFollow(FOLLOW_9);
                          lv_properties_8_0=ruleAbstractOperatingSystemProperty();

                          state._fsp--;


                                      if (current==null) {
                                        current = createModelElementForParent(grammarAccess.getOperatingSystemResouceRule());
                                      }
                                      add(
                                        current,
                                        "properties",
                                        lv_properties_8_0,
                                        "de.fraunhofer.ipa.deployment.Util.AbstractOperatingSystemProperty");
                                      afterParserOrEnumRuleCall();


                          }


                          }
                          break;

                      default :
                          if ( cnt68 >= 1 ) break loop68;
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_9, grammarAccess.getOperatingSystemResouceAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_10, grammarAccess.getOperatingSystemResouceAccess().getDEDENTTerminalRuleCall_7());


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
    // InternalTargetEnvironmentParser.g:3934:1: entryRuleAbstractOperatingSystemProperty returns [EObject current=null] : iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF ;
    public final EObject entryRuleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperatingSystemProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:3934:72: (iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF )
            // InternalTargetEnvironmentParser.g:3935:2: iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF
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
    // InternalTargetEnvironmentParser.g:3941:1: ruleAbstractOperatingSystemProperty returns [EObject current=null] : (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) ;
    public final EObject ruleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject this_NameOperatingSystemProperty_0 = null;

        EObject this_VersionOperatingSystemProperty_1 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3947:2: ( (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) )
            // InternalTargetEnvironmentParser.g:3948:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            {
            // InternalTargetEnvironmentParser.g:3948:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==HyphenMinus) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==Name) ) {
                    int LA70_2 = input.LA(3);

                    if ( (LA70_2==Os_version) ) {
                        alt70=2;
                    }
                    else if ( (LA70_2==Os_name) ) {
                        alt70=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3949:3: this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty
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
                    // InternalTargetEnvironmentParser.g:3958:3: this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty
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
    // InternalTargetEnvironmentParser.g:3970:1: entryRuleNameOperatingSystemProperty returns [EObject current=null] : iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF ;
    public final EObject entryRuleNameOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperatingSystemProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:3970:68: (iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF )
            // InternalTargetEnvironmentParser.g:3971:2: iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF
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
    // InternalTargetEnvironmentParser.g:3977:1: ruleNameOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:3983:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3984:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3984:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3985:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:3985:3: ()
            // InternalTargetEnvironmentParser.g:3986:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_54);

                  newLeafNode(otherlv_2, grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:4003:3: ( (lv_name_3_0= Os_name ) )
            // InternalTargetEnvironmentParser.g:4004:4: (lv_name_3_0= Os_name )
            {
            // InternalTargetEnvironmentParser.g:4004:4: (lv_name_3_0= Os_name )
            // InternalTargetEnvironmentParser.g:4005:5: lv_name_3_0= Os_name
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

            // InternalTargetEnvironmentParser.g:4025:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:4026:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:4026:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:4027:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:4044:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Description) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4045:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:4049:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:4050:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:4050:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:4051:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:4069:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Value) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4070:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:4074:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:4075:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:4075:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:4076:6: lv_value_10_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:4102:1: entryRuleVersionOperatingSystemProperty returns [EObject current=null] : iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF ;
    public final EObject entryRuleVersionOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionOperatingSystemProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:4102:71: (iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF )
            // InternalTargetEnvironmentParser.g:4103:2: iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF
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
    // InternalTargetEnvironmentParser.g:4109:1: ruleVersionOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:4115:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:4116:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:4116:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:4117:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:4117:3: ()
            // InternalTargetEnvironmentParser.g:4118:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_55);

                  newLeafNode(otherlv_2, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:4135:3: ( (lv_name_3_0= Os_version ) )
            // InternalTargetEnvironmentParser.g:4136:4: (lv_name_3_0= Os_version )
            {
            // InternalTargetEnvironmentParser.g:4136:4: (lv_name_3_0= Os_version )
            // InternalTargetEnvironmentParser.g:4137:5: lv_name_3_0= Os_version
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

            // InternalTargetEnvironmentParser.g:4157:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:4158:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:4158:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:4159:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalTargetEnvironmentParser.g:4176:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==Description) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4177:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:4181:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:4182:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:4182:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:4183:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:4201:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Value) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4202:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:4206:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:4207:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:4207:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:4208:6: lv_value_10_0= rulePropertyValue
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


    // $ANTLR start "entryRuleAbstractProperty"
    // InternalTargetEnvironmentParser.g:4234:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:4234:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalTargetEnvironmentParser.g:4235:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalTargetEnvironmentParser.g:4241:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4247:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalTargetEnvironmentParser.g:4248:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalTargetEnvironmentParser.g:4248:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt75=5;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4249:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalTargetEnvironmentParser.g:4258:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalTargetEnvironmentParser.g:4267:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalTargetEnvironmentParser.g:4276:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalTargetEnvironmentParser.g:4285:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalTargetEnvironmentParser.g:4297:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalTargetEnvironmentParser.g:4297:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalTargetEnvironmentParser.g:4298:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalTargetEnvironmentParser.g:4304:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:4310:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:4311:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:4311:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt76=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt76=1;
                }
                break;
            case MaximumKind:
                {
                alt76=2;
                }
                break;
            case MinimumKind:
                {
                alt76=3;
                }
                break;
            case RangeKind:
                {
                alt76=4;
                }
                break;
            case SelectionKind:
                {
                alt76=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4312:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalTargetEnvironmentParser.g:4321:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalTargetEnvironmentParser.g:4330:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalTargetEnvironmentParser.g:4339:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalTargetEnvironmentParser.g:4348:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalTargetEnvironmentParser.g:4360:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalTargetEnvironmentParser.g:4360:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalTargetEnvironmentParser.g:4361:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalTargetEnvironmentParser.g:4367:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:4373:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:4374:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:4374:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:4375:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:4386:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:4387:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4387:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:4388:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:4413:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:4414:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:4414:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:4415:5: lv_kind_5_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_56);
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

            // InternalTargetEnvironmentParser.g:4432:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Description) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4433:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:4437:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:4438:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:4438:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:4439:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_57);
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

            // InternalTargetEnvironmentParser.g:4457:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==Value) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4458:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:4462:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:4463:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:4463:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:4464:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_58);
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

            // InternalTargetEnvironmentParser.g:4482:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_DEDENT) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==RULE_DEDENT) ) {
                    int LA79_3 = input.LA(3);

                    if ( (LA79_3==RULE_DEDENT) ) {
                        int LA79_5 = input.LA(4);

                        if ( (LA79_5==RULE_DEDENT) ) {
                            int LA79_6 = input.LA(5);

                            if ( (LA79_6==CommunicationConnection||LA79_6==ComputationResouce||LA79_6==RULE_DEDENT) ) {
                                alt79=1;
                            }
                        }
                        else if ( (LA79_5==EOF||LA79_5==HyphenMinus) ) {
                            alt79=1;
                        }
                    }
                }
                else if ( (LA79_1==EOF||LA79_1==HyphenMinus) ) {
                    alt79=1;
                }
            }
            switch (alt79) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4483:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4492:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalTargetEnvironmentParser.g:4492:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalTargetEnvironmentParser.g:4493:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalTargetEnvironmentParser.g:4499:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:4505:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:4506:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:4506:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:4507:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:4518:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:4519:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4519:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:4520:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_59);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:4545:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalTargetEnvironmentParser.g:4546:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalTargetEnvironmentParser.g:4546:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalTargetEnvironmentParser.g:4547:5: lv_kind_5_0= ruleMaximumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_56);
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

            // InternalTargetEnvironmentParser.g:4564:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==Description) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4565:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:4569:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:4570:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:4570:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:4571:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_57);
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

            // InternalTargetEnvironmentParser.g:4589:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==Value) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4590:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:4594:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:4595:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:4595:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:4596:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_58);
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

            // InternalTargetEnvironmentParser.g:4614:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_DEDENT) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==EOF||LA82_1==HyphenMinus) ) {
                    alt82=1;
                }
                else if ( (LA82_1==RULE_DEDENT) ) {
                    int LA82_4 = input.LA(3);

                    if ( (LA82_4==RULE_DEDENT) ) {
                        int LA82_5 = input.LA(4);

                        if ( (LA82_5==RULE_DEDENT) ) {
                            int LA82_6 = input.LA(5);

                            if ( (LA82_6==CommunicationConnection||LA82_6==ComputationResouce||LA82_6==RULE_DEDENT) ) {
                                alt82=1;
                            }
                        }
                        else if ( (LA82_5==EOF||LA82_5==HyphenMinus) ) {
                            alt82=1;
                        }
                    }
                }
            }
            switch (alt82) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4615:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4624:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalTargetEnvironmentParser.g:4624:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalTargetEnvironmentParser.g:4625:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalTargetEnvironmentParser.g:4631:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:4637:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:4638:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:4638:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:4639:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:4650:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:4651:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4651:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:4652:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_60);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:4677:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalTargetEnvironmentParser.g:4678:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalTargetEnvironmentParser.g:4678:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalTargetEnvironmentParser.g:4679:5: lv_kind_5_0= ruleMinimumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_56);
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

            // InternalTargetEnvironmentParser.g:4696:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Description) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4697:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:4701:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:4702:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:4702:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:4703:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_57);
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

            // InternalTargetEnvironmentParser.g:4721:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==Value) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4722:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:4726:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:4727:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:4727:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:4728:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_58);
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

            // InternalTargetEnvironmentParser.g:4746:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_DEDENT) ) {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==RULE_DEDENT) ) {
                    int LA85_3 = input.LA(3);

                    if ( (LA85_3==RULE_DEDENT) ) {
                        int LA85_5 = input.LA(4);

                        if ( (LA85_5==RULE_DEDENT) ) {
                            int LA85_6 = input.LA(5);

                            if ( (LA85_6==CommunicationConnection||LA85_6==ComputationResouce||LA85_6==RULE_DEDENT) ) {
                                alt85=1;
                            }
                        }
                        else if ( (LA85_5==EOF||LA85_5==HyphenMinus) ) {
                            alt85=1;
                        }
                    }
                }
                else if ( (LA85_1==EOF||LA85_1==HyphenMinus) ) {
                    alt85=1;
                }
            }
            switch (alt85) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4747:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4756:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalTargetEnvironmentParser.g:4756:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalTargetEnvironmentParser.g:4757:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalTargetEnvironmentParser.g:4763:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:4769:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:4770:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:4770:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:4771:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:4782:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:4783:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4783:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:4784:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_39);

                  newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:4809:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:4810:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:4810:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalTargetEnvironmentParser.g:4811:5: lv_kind_5_0= ruleSelectionKind
            {

                      newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_56);
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

            // InternalTargetEnvironmentParser.g:4828:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==Description) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4829:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:4833:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:4834:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:4834:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:4835:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_57);
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

            // InternalTargetEnvironmentParser.g:4853:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==Value) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4854:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
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

                    // InternalTargetEnvironmentParser.g:4869:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:4870:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:4870:5: (lv_value_11_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:4871:6: lv_value_11_0= rulePropertyValue
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

                    // InternalTargetEnvironmentParser.g:4888:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==HyphenMinus) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:4889:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                          pushFollow(FOLLOW_21);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalTargetEnvironmentParser.g:4896:5: ( (lv_value_13_0= rulePropertyValue ) )
                          // InternalTargetEnvironmentParser.g:4897:6: (lv_value_13_0= rulePropertyValue )
                          {
                          // InternalTargetEnvironmentParser.g:4897:6: (lv_value_13_0= rulePropertyValue )
                          // InternalTargetEnvironmentParser.g:4898:7: lv_value_13_0= rulePropertyValue
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
                          break loop87;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_58);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:4921:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_DEDENT) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==EOF||LA89_1==HyphenMinus) ) {
                    alt89=1;
                }
                else if ( (LA89_1==RULE_DEDENT) ) {
                    int LA89_4 = input.LA(3);

                    if ( (LA89_4==RULE_DEDENT) ) {
                        int LA89_5 = input.LA(4);

                        if ( (LA89_5==RULE_DEDENT) ) {
                            int LA89_6 = input.LA(5);

                            if ( (LA89_6==CommunicationConnection||LA89_6==ComputationResouce||LA89_6==RULE_DEDENT) ) {
                                alt89=1;
                            }
                        }
                        else if ( (LA89_5==EOF||LA89_5==HyphenMinus) ) {
                            alt89=1;
                        }
                    }
                }
            }
            switch (alt89) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4922:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4931:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalTargetEnvironmentParser.g:4931:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalTargetEnvironmentParser.g:4932:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalTargetEnvironmentParser.g:4938:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:4944:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:4945:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:4945:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:4946:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:4957:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:4958:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4958:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:4959:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_61);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:4984:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalTargetEnvironmentParser.g:4985:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalTargetEnvironmentParser.g:4985:4: (lv_kind_5_0= ruleRangeKind )
            // InternalTargetEnvironmentParser.g:4986:5: lv_kind_5_0= ruleRangeKind
            {

                      newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_56);
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

            // InternalTargetEnvironmentParser.g:5003:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==Description) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5004:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:5008:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:5009:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:5009:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:5010:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_57);
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

            // InternalTargetEnvironmentParser.g:5028:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==Value) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5029:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
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

                    // InternalTargetEnvironmentParser.g:5044:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:5045:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:5045:5: (lv_value_11_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:5046:6: lv_value_11_0= rulePropertyValue
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

                    // InternalTargetEnvironmentParser.g:5070:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:5071:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:5071:5: (lv_value_13_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:5072:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_58);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:5094:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_DEDENT) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==RULE_DEDENT) ) {
                    int LA92_3 = input.LA(3);

                    if ( (LA92_3==RULE_DEDENT) ) {
                        int LA92_5 = input.LA(4);

                        if ( (LA92_5==RULE_DEDENT) ) {
                            int LA92_6 = input.LA(5);

                            if ( (LA92_6==CommunicationConnection||LA92_6==ComputationResouce||LA92_6==RULE_DEDENT) ) {
                                alt92=1;
                            }
                        }
                        else if ( (LA92_5==EOF||LA92_5==HyphenMinus) ) {
                            alt92=1;
                        }
                    }
                }
                else if ( (LA92_1==EOF||LA92_1==HyphenMinus) ) {
                    alt92=1;
                }
            }
            switch (alt92) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5095:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:5104:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalTargetEnvironmentParser.g:5104:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalTargetEnvironmentParser.g:5105:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalTargetEnvironmentParser.g:5111:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;

        EObject this_LinuxDistributionValue_4 = null;

        EObject this_UbuntuVersionValue_5 = null;

        EObject this_PropertyValueList_6 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5117:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) )
            // InternalTargetEnvironmentParser.g:5118:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            {
            // InternalTargetEnvironmentParser.g:5118:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            int alt93=7;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt93=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt93=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt93=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt93=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt93=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt93=6;
                }
                break;
            case RULE_INDENT:
                {
                alt93=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5119:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalTargetEnvironmentParser.g:5128:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalTargetEnvironmentParser.g:5137:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalTargetEnvironmentParser.g:5146:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalTargetEnvironmentParser.g:5155:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalTargetEnvironmentParser.g:5164:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
                    {

                          newCompositeNode(grammarAccess.getPropertyValueAccess().getUbuntuVersionValueParserRuleCall_5());

                    pushFollow(FOLLOW_2);
                    this_UbuntuVersionValue_5=ruleUbuntuVersionValue();

                    state._fsp--;


                          current = this_UbuntuVersionValue_5;
                          afterParserOrEnumRuleCall();


                    }
                    break;
                case 7 :
                    // InternalTargetEnvironmentParser.g:5173:3: this_PropertyValueList_6= rulePropertyValueList
                    {

                          newCompositeNode(grammarAccess.getPropertyValueAccess().getPropertyValueListParserRuleCall_6());

                    pushFollow(FOLLOW_2);
                    this_PropertyValueList_6=rulePropertyValueList();

                    state._fsp--;


                          current = this_PropertyValueList_6;
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
    // InternalTargetEnvironmentParser.g:5185:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalTargetEnvironmentParser.g:5185:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalTargetEnvironmentParser.g:5186:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalTargetEnvironmentParser.g:5192:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5198:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalTargetEnvironmentParser.g:5199:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalTargetEnvironmentParser.g:5199:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalTargetEnvironmentParser.g:5200:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalTargetEnvironmentParser.g:5200:3: (lv_value_0_0= ruleInteger0 )
            // InternalTargetEnvironmentParser.g:5201:4: lv_value_0_0= ruleInteger0
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
    // InternalTargetEnvironmentParser.g:5221:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalTargetEnvironmentParser.g:5221:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalTargetEnvironmentParser.g:5222:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalTargetEnvironmentParser.g:5228:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5234:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalTargetEnvironmentParser.g:5235:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalTargetEnvironmentParser.g:5235:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalTargetEnvironmentParser.g:5236:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalTargetEnvironmentParser.g:5236:3: (lv_value_0_0= ruleDouble0 )
            // InternalTargetEnvironmentParser.g:5237:4: lv_value_0_0= ruleDouble0
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
    // InternalTargetEnvironmentParser.g:5257:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalTargetEnvironmentParser.g:5257:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalTargetEnvironmentParser.g:5258:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalTargetEnvironmentParser.g:5264:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5270:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:5271:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:5271:2: ( (lv_value_0_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:5272:3: (lv_value_0_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:5272:3: (lv_value_0_0= ruleEString )
            // InternalTargetEnvironmentParser.g:5273:4: lv_value_0_0= ruleEString
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


    // $ANTLR start "entryRulePropertyValueList"
    // InternalTargetEnvironmentParser.g:5293:1: entryRulePropertyValueList returns [EObject current=null] : iv_rulePropertyValueList= rulePropertyValueList EOF ;
    public final EObject entryRulePropertyValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueList = null;


        try {
            // InternalTargetEnvironmentParser.g:5293:58: (iv_rulePropertyValueList= rulePropertyValueList EOF )
            // InternalTargetEnvironmentParser.g:5294:2: iv_rulePropertyValueList= rulePropertyValueList EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueListRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyValueList=rulePropertyValueList();

            state._fsp--;

             current =iv_rulePropertyValueList;
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
    // $ANTLR end "entryRulePropertyValueList"


    // $ANTLR start "rulePropertyValueList"
    // InternalTargetEnvironmentParser.g:5300:1: rulePropertyValueList returns [EObject current=null] : (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject rulePropertyValueList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5306:2: ( (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:5307:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:5307:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:5308:3: this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_0, grammarAccess.getPropertyValueListAccess().getINDENTTerminalRuleCall_0());


                  newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_21);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            // InternalTargetEnvironmentParser.g:5319:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:5320:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:5320:4: (lv_value_2_0= rulePropertyValue )
            // InternalTargetEnvironmentParser.g:5321:5: lv_value_2_0= rulePropertyValue
            {

                      newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_2_0());

            pushFollow(FOLLOW_9);
            lv_value_2_0=rulePropertyValue();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getPropertyValueListRule());
                      }
                      add(
                        current,
                        "value",
                        lv_value_2_0,
                        "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:5338:3: ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==HyphenMinus) ) {
                    alt94=1;
                }


                switch (alt94) {
              case 1 :
                  // InternalTargetEnvironmentParser.g:5339:4: rulePreListElement ( (lv_value_4_0= rulePropertyValue ) )
                  {

                          newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_3_0());

                  pushFollow(FOLLOW_21);
                  rulePreListElement();

                  state._fsp--;


                          afterParserOrEnumRuleCall();

                  // InternalTargetEnvironmentParser.g:5346:4: ( (lv_value_4_0= rulePropertyValue ) )
                  // InternalTargetEnvironmentParser.g:5347:5: (lv_value_4_0= rulePropertyValue )
                  {
                  // InternalTargetEnvironmentParser.g:5347:5: (lv_value_4_0= rulePropertyValue )
                  // InternalTargetEnvironmentParser.g:5348:6: lv_value_4_0= rulePropertyValue
                  {

                              newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_3_1_0());

                  pushFollow(FOLLOW_9);
                  lv_value_4_0=rulePropertyValue();

                  state._fsp--;


                              if (current==null) {
                                current = createModelElementForParent(grammarAccess.getPropertyValueListRule());
                              }
                              add(
                                current,
                                "value",
                                lv_value_4_0,
                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                              afterParserOrEnumRuleCall();


                  }


                  }


                  }
                  break;

              default :
                  break loop94;
                }
            } while (true);

            this_DEDENT_5=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_5, grammarAccess.getPropertyValueListAccess().getDEDENTTerminalRuleCall_4());


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
    // $ANTLR end "rulePropertyValueList"


    // $ANTLR start "entryRuleProcessorArchitectureValue"
    // InternalTargetEnvironmentParser.g:5374:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalTargetEnvironmentParser.g:5374:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalTargetEnvironmentParser.g:5375:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalTargetEnvironmentParser.g:5381:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5387:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalTargetEnvironmentParser.g:5388:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalTargetEnvironmentParser.g:5388:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalTargetEnvironmentParser.g:5389:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalTargetEnvironmentParser.g:5389:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalTargetEnvironmentParser.g:5390:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalTargetEnvironmentParser.g:5410:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:5410:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalTargetEnvironmentParser.g:5411:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalTargetEnvironmentParser.g:5417:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5423:2: (this_ResourceType_0= ruleResourceType )
            // InternalTargetEnvironmentParser.g:5424:2: this_ResourceType_0= ruleResourceType
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
    // InternalTargetEnvironmentParser.g:5435:1: entryRuleOpertingSystemResouceType returns [EObject current=null] : iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF ;
    public final EObject entryRuleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:5435:66: (iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF )
            // InternalTargetEnvironmentParser.g:5436:2: iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF
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
    // InternalTargetEnvironmentParser.g:5442:1: ruleOpertingSystemResouceType returns [EObject current=null] : (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) ;
    public final EObject ruleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystem_0 = null;

        EObject this_MacOSOpertingSystem_1 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5448:2: ( (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:5449:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:5449:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==LinuxOpertingSystem) ) {
                alt95=1;
            }
            else if ( (LA95_0==MacOSOpertingSystem) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5450:3: this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem
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
                    // InternalTargetEnvironmentParser.g:5459:3: this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem
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
    // InternalTargetEnvironmentParser.g:5471:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalTargetEnvironmentParser.g:5471:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalTargetEnvironmentParser.g:5472:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalTargetEnvironmentParser.g:5478:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5484:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:5485:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:5485:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:5486:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:5486:3: ()
            // InternalTargetEnvironmentParser.g:5487:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                      current);


            }

            // InternalTargetEnvironmentParser.g:5493:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:5494:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:5494:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:5495:5: lv_name_1_0= ruleEString
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
    // InternalTargetEnvironmentParser.g:5516:1: entryRuleProcessorResouceType returns [EObject current=null] : iv_ruleProcessorResouceType= ruleProcessorResouceType EOF ;
    public final EObject entryRuleProcessorResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:5516:61: (iv_ruleProcessorResouceType= ruleProcessorResouceType EOF )
            // InternalTargetEnvironmentParser.g:5517:2: iv_ruleProcessorResouceType= ruleProcessorResouceType EOF
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
    // InternalTargetEnvironmentParser.g:5523:1: ruleProcessorResouceType returns [EObject current=null] : ( () otherlv_1= Processor ) ;
    public final EObject ruleProcessorResouceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5529:2: ( ( () otherlv_1= Processor ) )
            // InternalTargetEnvironmentParser.g:5530:2: ( () otherlv_1= Processor )
            {
            // InternalTargetEnvironmentParser.g:5530:2: ( () otherlv_1= Processor )
            // InternalTargetEnvironmentParser.g:5531:3: () otherlv_1= Processor
            {
            // InternalTargetEnvironmentParser.g:5531:3: ()
            // InternalTargetEnvironmentParser.g:5532:4:
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
    // InternalTargetEnvironmentParser.g:5546:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalTargetEnvironmentParser.g:5546:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalTargetEnvironmentParser.g:5547:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalTargetEnvironmentParser.g:5553:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5559:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:5560:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:5560:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalTargetEnvironmentParser.g:5561:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalTargetEnvironmentParser.g:5561:3: ()
            // InternalTargetEnvironmentParser.g:5562:4:
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
    // InternalTargetEnvironmentParser.g:5576:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalTargetEnvironmentParser.g:5576:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalTargetEnvironmentParser.g:5577:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalTargetEnvironmentParser.g:5583:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5589:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:5590:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:5590:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalTargetEnvironmentParser.g:5591:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalTargetEnvironmentParser.g:5591:3: ()
            // InternalTargetEnvironmentParser.g:5592:4:
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
    // InternalTargetEnvironmentParser.g:5606:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:5606:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:5607:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:5613:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5619:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:5620:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:5620:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:5621:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:5621:3: ()
            // InternalTargetEnvironmentParser.g:5622:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                      current);


            }

            // InternalTargetEnvironmentParser.g:5628:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:5629:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:5629:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:5630:5: lv_name_1_0= ruleEString
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
    // InternalTargetEnvironmentParser.g:5651:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:5651:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:5652:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:5658:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5664:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalTargetEnvironmentParser.g:5665:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:5665:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==Ethernet) ) {
                alt96=1;
            }
            else if ( (LA96_0==Wlan) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5666:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalTargetEnvironmentParser.g:5675:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalTargetEnvironmentParser.g:5687:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:5687:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:5688:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:5694:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5700:2: ( ( () otherlv_1= Ethernet ) )
            // InternalTargetEnvironmentParser.g:5701:2: ( () otherlv_1= Ethernet )
            {
            // InternalTargetEnvironmentParser.g:5701:2: ( () otherlv_1= Ethernet )
            // InternalTargetEnvironmentParser.g:5702:3: () otherlv_1= Ethernet
            {
            // InternalTargetEnvironmentParser.g:5702:3: ()
            // InternalTargetEnvironmentParser.g:5703:4:
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
    // InternalTargetEnvironmentParser.g:5717:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:5717:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:5718:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:5724:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5730:2: ( ( () otherlv_1= Wlan ) )
            // InternalTargetEnvironmentParser.g:5731:2: ( () otherlv_1= Wlan )
            {
            // InternalTargetEnvironmentParser.g:5731:2: ( () otherlv_1= Wlan )
            // InternalTargetEnvironmentParser.g:5732:3: () otherlv_1= Wlan
            {
            // InternalTargetEnvironmentParser.g:5732:3: ()
            // InternalTargetEnvironmentParser.g:5733:4:
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


    // $ANTLR start "entryRuleUsbCommunicationType"
    // InternalTargetEnvironmentParser.g:5747:1: entryRuleUsbCommunicationType returns [EObject current=null] : iv_ruleUsbCommunicationType= ruleUsbCommunicationType EOF ;
    public final EObject entryRuleUsbCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsbCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:5747:61: (iv_ruleUsbCommunicationType= ruleUsbCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:5748:2: iv_ruleUsbCommunicationType= ruleUsbCommunicationType EOF
            {
             newCompositeNode(grammarAccess.getUsbCommunicationTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleUsbCommunicationType=ruleUsbCommunicationType();

            state._fsp--;

             current =iv_ruleUsbCommunicationType;
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
    // $ANTLR end "entryRuleUsbCommunicationType"


    // $ANTLR start "ruleUsbCommunicationType"
    // InternalTargetEnvironmentParser.g:5754:1: ruleUsbCommunicationType returns [EObject current=null] : ( () otherlv_1= Usb ) ;
    public final EObject ruleUsbCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5760:2: ( ( () otherlv_1= Usb ) )
            // InternalTargetEnvironmentParser.g:5761:2: ( () otherlv_1= Usb )
            {
            // InternalTargetEnvironmentParser.g:5761:2: ( () otherlv_1= Usb )
            // InternalTargetEnvironmentParser.g:5762:3: () otherlv_1= Usb
            {
            // InternalTargetEnvironmentParser.g:5762:3: ()
            // InternalTargetEnvironmentParser.g:5763:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getUsbCommunicationTypeAccess().getUsbCommunicationTypeAction_0(),
                      current);


            }

            otherlv_1=(Token)match(input,Usb,FOLLOW_2);

                  newLeafNode(otherlv_1, grammarAccess.getUsbCommunicationTypeAccess().getUsbKeyword_1());


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
    // $ANTLR end "ruleUsbCommunicationType"


    // $ANTLR start "entryRuleAttributeKind"
    // InternalTargetEnvironmentParser.g:5777:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:5777:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalTargetEnvironmentParser.g:5778:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalTargetEnvironmentParser.g:5784:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5790:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalTargetEnvironmentParser.g:5791:2: ( () otherlv_1= AttributeKind )
            {
            // InternalTargetEnvironmentParser.g:5791:2: ( () otherlv_1= AttributeKind )
            // InternalTargetEnvironmentParser.g:5792:3: () otherlv_1= AttributeKind
            {
            // InternalTargetEnvironmentParser.g:5792:3: ()
            // InternalTargetEnvironmentParser.g:5793:4:
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
    // InternalTargetEnvironmentParser.g:5807:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:5807:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalTargetEnvironmentParser.g:5808:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalTargetEnvironmentParser.g:5814:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5820:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalTargetEnvironmentParser.g:5821:2: ( () otherlv_1= MaximumKind )
            {
            // InternalTargetEnvironmentParser.g:5821:2: ( () otherlv_1= MaximumKind )
            // InternalTargetEnvironmentParser.g:5822:3: () otherlv_1= MaximumKind
            {
            // InternalTargetEnvironmentParser.g:5822:3: ()
            // InternalTargetEnvironmentParser.g:5823:4:
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
    // InternalTargetEnvironmentParser.g:5837:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:5837:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalTargetEnvironmentParser.g:5838:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalTargetEnvironmentParser.g:5844:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5850:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalTargetEnvironmentParser.g:5851:2: ( () otherlv_1= MinimumKind )
            {
            // InternalTargetEnvironmentParser.g:5851:2: ( () otherlv_1= MinimumKind )
            // InternalTargetEnvironmentParser.g:5852:3: () otherlv_1= MinimumKind
            {
            // InternalTargetEnvironmentParser.g:5852:3: ()
            // InternalTargetEnvironmentParser.g:5853:4:
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
    // InternalTargetEnvironmentParser.g:5867:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalTargetEnvironmentParser.g:5867:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalTargetEnvironmentParser.g:5868:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalTargetEnvironmentParser.g:5874:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5880:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalTargetEnvironmentParser.g:5881:2: ( () otherlv_1= SelectionKind )
            {
            // InternalTargetEnvironmentParser.g:5881:2: ( () otherlv_1= SelectionKind )
            // InternalTargetEnvironmentParser.g:5882:3: () otherlv_1= SelectionKind
            {
            // InternalTargetEnvironmentParser.g:5882:3: ()
            // InternalTargetEnvironmentParser.g:5883:4:
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
    // InternalTargetEnvironmentParser.g:5897:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:5897:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalTargetEnvironmentParser.g:5898:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalTargetEnvironmentParser.g:5904:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5910:2: ( ( () otherlv_1= RangeKind ) )
            // InternalTargetEnvironmentParser.g:5911:2: ( () otherlv_1= RangeKind )
            {
            // InternalTargetEnvironmentParser.g:5911:2: ( () otherlv_1= RangeKind )
            // InternalTargetEnvironmentParser.g:5912:3: () otherlv_1= RangeKind
            {
            // InternalTargetEnvironmentParser.g:5912:3: ()
            // InternalTargetEnvironmentParser.g:5913:4:
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
    // InternalTargetEnvironmentParser.g:5927:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalTargetEnvironmentParser.g:5927:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalTargetEnvironmentParser.g:5928:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalTargetEnvironmentParser.g:5934:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5940:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalTargetEnvironmentParser.g:5941:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalTargetEnvironmentParser.g:5941:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalTargetEnvironmentParser.g:5942:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalTargetEnvironmentParser.g:5942:3: ()
            // InternalTargetEnvironmentParser.g:5943:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                      current);


            }

            // InternalTargetEnvironmentParser.g:5949:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalTargetEnvironmentParser.g:5950:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalTargetEnvironmentParser.g:5950:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalTargetEnvironmentParser.g:5951:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalTargetEnvironmentParser.g:5972:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalTargetEnvironmentParser.g:5972:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalTargetEnvironmentParser.g:5973:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalTargetEnvironmentParser.g:5979:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:5985:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalTargetEnvironmentParser.g:5986:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalTargetEnvironmentParser.g:5986:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalTargetEnvironmentParser.g:5987:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalTargetEnvironmentParser.g:5987:3: ()
            // InternalTargetEnvironmentParser.g:5988:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                      current);


            }

            // InternalTargetEnvironmentParser.g:5994:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalTargetEnvironmentParser.g:5995:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalTargetEnvironmentParser.g:5995:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalTargetEnvironmentParser.g:5996:5: lv_value_1_0= ruleUbuntuVersion
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
    // InternalTargetEnvironmentParser.g:6017:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalTargetEnvironmentParser.g:6017:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalTargetEnvironmentParser.g:6018:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalTargetEnvironmentParser.g:6024:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:6030:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalTargetEnvironmentParser.g:6031:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalTargetEnvironmentParser.g:6041:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalTargetEnvironmentParser.g:6041:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalTargetEnvironmentParser.g:6042:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalTargetEnvironmentParser.g:6048:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:6054:2: (this_DECINT_0= RULE_DECINT )
            // InternalTargetEnvironmentParser.g:6055:2: this_DECINT_0= RULE_DECINT
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
    // InternalTargetEnvironmentParser.g:6065:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTargetEnvironmentParser.g:6065:47: (iv_ruleEString= ruleEString EOF )
            // InternalTargetEnvironmentParser.g:6066:2: iv_ruleEString= ruleEString EOF
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
    // InternalTargetEnvironmentParser.g:6072:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:6078:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTargetEnvironmentParser.g:6079:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTargetEnvironmentParser.g:6079:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_STRING) ) {
                alt97=1;
            }
            else if ( (LA97_0==RULE_ID) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:6080:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                          current.merge(this_STRING_0);


                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:6088:3: this_ID_1= RULE_ID
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
    // InternalTargetEnvironmentParser.g:6099:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:6101:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalTargetEnvironmentParser.g:6102:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalTargetEnvironmentParser.g:6111:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


          enterRule();
          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:6118:2: (kw= HyphenMinus )
            // InternalTargetEnvironmentParser.g:6119:2: kw= HyphenMinus
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
    // InternalTargetEnvironmentParser.g:6130:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:6136:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalTargetEnvironmentParser.g:6137:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalTargetEnvironmentParser.g:6137:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==X86) ) {
                alt98=1;
            }
            else if ( (LA98_0==Arm64) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:6138:3: (enumLiteral_0= X86 )
                    {
                    // InternalTargetEnvironmentParser.g:6138:3: (enumLiteral_0= X86 )
                    // InternalTargetEnvironmentParser.g:6139:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                            current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:6146:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalTargetEnvironmentParser.g:6146:3: (enumLiteral_1= Arm64 )
                    // InternalTargetEnvironmentParser.g:6147:4: enumLiteral_1= Arm64
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
    // InternalTargetEnvironmentParser.g:6157:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:6163:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalTargetEnvironmentParser.g:6164:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalTargetEnvironmentParser.g:6164:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==Ubuntu) ) {
                alt99=1;
            }
            else if ( (LA99_0==Debian) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:6165:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalTargetEnvironmentParser.g:6165:3: (enumLiteral_0= Ubuntu )
                    // InternalTargetEnvironmentParser.g:6166:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                            current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:6173:3: (enumLiteral_1= Debian )
                    {
                    // InternalTargetEnvironmentParser.g:6173:3: (enumLiteral_1= Debian )
                    // InternalTargetEnvironmentParser.g:6174:4: enumLiteral_1= Debian
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
    // InternalTargetEnvironmentParser.g:6184:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:6190:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalTargetEnvironmentParser.g:6191:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalTargetEnvironmentParser.g:6191:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==Focal) ) {
                alt100=1;
            }
            else if ( (LA100_0==Jammy) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:6192:3: (enumLiteral_0= Focal )
                    {
                    // InternalTargetEnvironmentParser.g:6192:3: (enumLiteral_0= Focal )
                    // InternalTargetEnvironmentParser.g:6193:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                            current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:6200:3: (enumLiteral_1= Jammy )
                    {
                    // InternalTargetEnvironmentParser.g:6200:3: (enumLiteral_1= Jammy )
                    // InternalTargetEnvironmentParser.g:6201:4: enumLiteral_1= Jammy
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


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA75 dfa75 = new DFA75(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\74\1\65\1\103\2\101\1\66\1\51\3\uffff";
    static final String dfa_3s = "\1\74\1\65\1\105\2\101\1\66\1\105\3\uffff";
    static final String dfa_4s = "\7\uffff\1\2\1\3\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\7\15\uffff\1\7\2\uffff\1\10\10\uffff\1\11\1\uffff\1\11",
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1046:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\74\1\65\1\23\10\uffff";
    static final String dfa_9s = "\1\74\1\65\1\70\10\uffff";
    static final String dfa_10s = "\3\uffff\1\3\1\6\1\2\1\5\1\4\1\7\1\10\1\1";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\5\5\uffff\1\12\5\uffff\1\7\1\uffff\1\4\1\10\1\3\7\uffff\1\6\14\uffff\1\11",
            "",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1091:2: (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty )";
        }
    }
    static final String dfa_13s = "\14\uffff";
    static final String dfa_14s = "\1\74\1\65\1\103\2\101\1\64\1\26\5\uffff";
    static final String dfa_15s = "\1\74\1\65\1\105\2\101\1\64\1\47\5\uffff";
    static final String dfa_16s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_17s = "\14\uffff}>";
    static final String[] dfa_18s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\4\uffff\1\11\1\10\11\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "4248:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000044000L,0x0000000000000004L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000004L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000004L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000004L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xC80B600000000000L,0x000000000000002AL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800004000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000020010L,0x0000000000000004L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000021010L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000001010L,0x0000000000000004L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080020000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000800004000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000008000000000L});

}
