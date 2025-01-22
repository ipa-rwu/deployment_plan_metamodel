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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TargetDeployEnviroment", "RefConnectionProperty", "ConfigDeviceProperty", "LinuxOpertingSystem", "MacOSOpertingSystem", "ComputationDevice", "ConfigConnection", "Configuration", "ConnectDevice", "IncludeDevice", "RefConnection", "RefDeviceType", "AttributeKind", "SelectionKind", "Description", "MaximumKind", "MinimumKind", "Properties", "Os_version", "RefDevice", "Processor", "RangeKind", "Container", "Ethernet", "Device", "Os_name", "Debian", "Ubuntu", "Value", "Arm64", "Focal", "From", "Jammy", "Kind", "Name", "Type", "Wlan", "Usb", "X86", "HyphenMinus", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Configuration=11;
    public static final int AttributeKind=16;
    public static final int RefDeviceType=15;
    public static final int Name=38;
    public static final int Container=26;
    public static final int Debian=30;
    public static final int Kind=37;
    public static final int ConnectDevice=12;
    public static final int Ubuntu=31;
    public static final int RULE_DEDENT=49;
    public static final int LinuxOpertingSystem=7;
    public static final int RULE_ID=50;
    public static final int Device=28;
    public static final int ConfigConnection=10;
    public static final int RULE_DIGIT=44;
    public static final int SelectionKind=17;
    public static final int TargetDeployEnviroment=4;
    public static final int Arm64=33;
    public static final int RULE_INT=51;
    public static final int ComputationDevice=9;
    public static final int Ethernet=27;
    public static final int Value=32;
    public static final int RULE_ML_COMMENT=53;
    public static final int RefConnectionProperty=5;
    public static final int ConfigDeviceProperty=6;
    public static final int Description=18;
    public static final int Processor=24;
    public static final int RULE_STRING=52;
    public static final int Focal=34;
    public static final int Wlan=40;
    public static final int Properties=21;
    public static final int RULE_SL_COMMENT=47;
    public static final int Os_name=29;
    public static final int HyphenMinus=43;
    public static final int RULE_DOUBLE=46;
    public static final int X86=42;
    public static final int RULE_DECINT=45;
    public static final int MinimumKind=20;
    public static final int EOF=-1;
    public static final int RULE_INDENT=48;
    public static final int Jammy=36;
    public static final int RefDevice=23;
    public static final int Usb=41;
    public static final int RULE_WS=54;
    public static final int MaximumKind=19;
    public static final int From=35;
    public static final int RULE_ANY_OTHER=55;
    public static final int RangeKind=25;
    public static final int Os_version=22;
    public static final int RefConnection=14;
    public static final int Type=39;
    public static final int MacOSOpertingSystem=8;
    public static final int IncludeDevice=13;

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
    // InternalTargetEnvironmentParser.g:110:1: ruleDescription returns [EObject current=null] : this_TargetDeployEnviroment_0= ruleTargetDeployEnviroment ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        EObject this_TargetDeployEnviroment_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:116:2: (this_TargetDeployEnviroment_0= ruleTargetDeployEnviroment )
            // InternalTargetEnvironmentParser.g:117:2: this_TargetDeployEnviroment_0= ruleTargetDeployEnviroment
            {

                newCompositeNode(grammarAccess.getDescriptionAccess().getTargetDeployEnviromentParserRuleCall());

            pushFollow(FOLLOW_2);
            this_TargetDeployEnviroment_0=ruleTargetDeployEnviroment();

            state._fsp--;


                current = this_TargetDeployEnviroment_0;
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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTargetDeployEnviroment"
    // InternalTargetEnvironmentParser.g:128:1: entryRuleTargetDeployEnviroment returns [EObject current=null] : iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF ;
    public final EObject entryRuleTargetDeployEnviroment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetDeployEnviroment = null;


        try {
            // InternalTargetEnvironmentParser.g:128:63: (iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF )
            // InternalTargetEnvironmentParser.g:129:2: iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF
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
    // InternalTargetEnvironmentParser.g:135:1: ruleTargetDeployEnviroment returns [EObject current=null] : ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:141:2: ( ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:142:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:142:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:143:3: () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )? (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )? this_DEDENT_20= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:143:3: ()
            // InternalTargetEnvironmentParser.g:144:4:
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

            // InternalTargetEnvironmentParser.g:162:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:163:4: (lv_name_4_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:163:4: (lv_name_4_0= ruleEString )
            // InternalTargetEnvironmentParser.g:164:5: lv_name_4_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:181:3: (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IncludeDevice) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:182:4: otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT otherlv_7= ComputationDevice this_INDENT_8= RULE_INDENT ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+ this_DEDENT_10= RULE_DEDENT otherlv_11= Device this_INDENT_12= RULE_INDENT ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,IncludeDevice,FOLLOW_3);

                            newLeafNode(otherlv_5, grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_7);

                            newLeafNode(this_INDENT_6, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_1());

                    otherlv_7=(Token)match(input,ComputationDevice,FOLLOW_3);

                            newLeafNode(otherlv_7, grammarAccess.getTargetDeployEnviromentAccess().getComputationDeviceKeyword_5_2());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_8, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_3());

                    // InternalTargetEnvironmentParser.g:198:4: ( (lv_includeDevice_9_0= ruleComputationDeviceInstance ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==HyphenMinus) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:199:5: (lv_includeDevice_9_0= ruleComputationDeviceInstance )
                          {
                          // InternalTargetEnvironmentParser.g:199:5: (lv_includeDevice_9_0= ruleComputationDeviceInstance )
                          // InternalTargetEnvironmentParser.g:200:6: lv_includeDevice_9_0= ruleComputationDeviceInstance
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
                          if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                            newLeafNode(this_DEDENT_10, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_5());

                    otherlv_11=(Token)match(input,Device,FOLLOW_3);

                            newLeafNode(otherlv_11, grammarAccess.getTargetDeployEnviromentAccess().getDeviceKeyword_5_6());

                    this_INDENT_12=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_12, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_7());

                    // InternalTargetEnvironmentParser.g:229:4: ( (lv_includeDevice_13_0= ruleDeviceInstance ) )+
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
                          // InternalTargetEnvironmentParser.g:230:5: (lv_includeDevice_13_0= ruleDeviceInstance )
                          {
                          // InternalTargetEnvironmentParser.g:230:5: (lv_includeDevice_13_0= ruleDeviceInstance )
                          // InternalTargetEnvironmentParser.g:231:6: lv_includeDevice_13_0= ruleDeviceInstance
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
                          if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_14, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_9());

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_12);

                            newLeafNode(this_DEDENT_15, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_10());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:257:3: (otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ConfigConnection) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:258:4: otherlv_16= ConfigConnection this_INDENT_17= RULE_INDENT ( (lv_configConnections_18_0= ruleConfigConnection ) )+ this_DEDENT_19= RULE_DEDENT
                    {
                    otherlv_16=(Token)match(input,ConfigConnection,FOLLOW_3);

                            newLeafNode(otherlv_16, grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionKeyword_6_0());

                    this_INDENT_17=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_17, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:266:4: ( (lv_configConnections_18_0= ruleConfigConnection ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==HyphenMinus) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:267:5: (lv_configConnections_18_0= ruleConfigConnection )
                          {
                          // InternalTargetEnvironmentParser.g:267:5: (lv_configConnections_18_0= ruleConfigConnection )
                          // InternalTargetEnvironmentParser.g:268:6: lv_configConnections_18_0= ruleConfigConnection
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
                          if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
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
    // InternalTargetEnvironmentParser.g:298:1: entryRuleDeviceInstance returns [EObject current=null] : iv_ruleDeviceInstance= ruleDeviceInstance EOF ;
    public final EObject entryRuleDeviceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceInstance = null;


        try {
            // InternalTargetEnvironmentParser.g:298:55: (iv_ruleDeviceInstance= ruleDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:299:2: iv_ruleDeviceInstance= ruleDeviceInstance EOF
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
    // InternalTargetEnvironmentParser.g:305:1: ruleDeviceInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:311:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:312:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:312:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:313:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

                  newCompositeNode(grammarAccess.getDeviceInstanceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getDeviceInstanceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:324:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:325:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:325:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:326:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:351:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:352:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:352:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:353:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:367:3: (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ConfigDeviceProperty) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:368:4: otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,ConfigDeviceProperty,FOLLOW_3);

                            newLeafNode(otherlv_6, grammarAccess.getDeviceInstanceAccess().getConfigDevicePropertyKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_7, grammarAccess.getDeviceInstanceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:376:4: ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==HyphenMinus) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:377:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                          {
                          // InternalTargetEnvironmentParser.g:377:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                          // InternalTargetEnvironmentParser.g:378:6: lv_configDeviceProperty_8_0= ruleConfigDeviceProperty
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
                          if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
    // InternalTargetEnvironmentParser.g:408:1: entryRuleComputationDeviceInstance returns [EObject current=null] : iv_ruleComputationDeviceInstance= ruleComputationDeviceInstance EOF ;
    public final EObject entryRuleComputationDeviceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceInstance = null;


        try {
            // InternalTargetEnvironmentParser.g:408:66: (iv_ruleComputationDeviceInstance= ruleComputationDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:409:2: iv_ruleComputationDeviceInstance= ruleComputationDeviceInstance EOF
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
    // InternalTargetEnvironmentParser.g:415:1: ruleComputationDeviceInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:421:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:422:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:422:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:423:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

                  newCompositeNode(grammarAccess.getComputationDeviceInstanceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getComputationDeviceInstanceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:434:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:435:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:435:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:436:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:461:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:462:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:462:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:463:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:477:3: (otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ConfigDeviceProperty) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:478:4: otherlv_6= ConfigDeviceProperty this_INDENT_7= RULE_INDENT ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,ConfigDeviceProperty,FOLLOW_3);

                            newLeafNode(otherlv_6, grammarAccess.getComputationDeviceInstanceAccess().getConfigDevicePropertyKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_7, grammarAccess.getComputationDeviceInstanceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:486:4: ( (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==HyphenMinus) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:487:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                          {
                          // InternalTargetEnvironmentParser.g:487:5: (lv_configDeviceProperty_8_0= ruleConfigDeviceProperty )
                          // InternalTargetEnvironmentParser.g:488:6: lv_configDeviceProperty_8_0= ruleConfigDeviceProperty
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
                          if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
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
    // InternalTargetEnvironmentParser.g:518:1: entryRuleConfigConnection returns [EObject current=null] : iv_ruleConfigConnection= ruleConfigConnection EOF ;
    public final EObject entryRuleConfigConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:518:57: (iv_ruleConfigConnection= ruleConfigConnection EOF )
            // InternalTargetEnvironmentParser.g:519:2: iv_ruleConfigConnection= ruleConfigConnection EOF
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
    // InternalTargetEnvironmentParser.g:525:1: ruleConfigConnection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:531:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:532:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:532:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:533:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT
            {

                  newCompositeNode(grammarAccess.getConfigConnectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getConfigConnectionAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:544:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:545:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:545:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:546:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:575:3: ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+
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
                  // InternalTargetEnvironmentParser.g:576:4: (lv_connectDevice_6_0= ruleConnectedDevice )
                  {
                  // InternalTargetEnvironmentParser.g:576:4: (lv_connectDevice_6_0= ruleConnectedDevice )
                  // InternalTargetEnvironmentParser.g:577:5: lv_connectDevice_6_0= ruleConnectedDevice
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
                  if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalTargetEnvironmentParser.g:606:1: entryRuleConnectedDevice returns [EObject current=null] : iv_ruleConnectedDevice= ruleConnectedDevice EOF ;
    public final EObject entryRuleConnectedDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectedDevice = null;


        try {
            // InternalTargetEnvironmentParser.g:606:56: (iv_ruleConnectedDevice= ruleConnectedDevice EOF )
            // InternalTargetEnvironmentParser.g:607:2: iv_ruleConnectedDevice= ruleConnectedDevice EOF
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
    // InternalTargetEnvironmentParser.g:613:1: ruleConnectedDevice returns [EObject current=null] : ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:619:2: ( ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:620:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:620:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:621:3: rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

                  newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_16);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,RefDevice,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getConnectedDeviceAccess().getRefDeviceKeyword_1());

            // InternalTargetEnvironmentParser.g:632:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:633:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:633:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:634:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:656:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:657:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:657:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:658:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:672:3: (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Configuration) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:673:4: otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Configuration,FOLLOW_3);

                            newLeafNode(otherlv_6, grammarAccess.getConnectedDeviceAccess().getConfigurationKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_8);

                            newLeafNode(this_INDENT_7, grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:681:4: ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+
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
                          // InternalTargetEnvironmentParser.g:682:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                          {
                          // InternalTargetEnvironmentParser.g:682:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                          // InternalTargetEnvironmentParser.g:683:6: lv_properties_8_0= ruleConfigConnectionProperty
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
                          if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
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
    // InternalTargetEnvironmentParser.g:713:1: entryRuleConfigConnectionProperty returns [EObject current=null] : iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF ;
    public final EObject entryRuleConfigConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:713:65: (iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:714:2: iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:720:1: ruleConfigConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:726:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:727:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:727:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:728:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= RefConnectionProperty ( ( ruleEString ) ) (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:728:3: ()
            // InternalTargetEnvironmentParser.g:729:4:
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

            // InternalTargetEnvironmentParser.g:746:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:747:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:747:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:748:5: lv_name_3_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:773:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:774:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:774:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:775:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:789:3: (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Value) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:790:4: otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) )
                    {
                    otherlv_7=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_7, grammarAccess.getConfigConnectionPropertyAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:794:4: ( (lv_value_8_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:795:5: (lv_value_8_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:795:5: (lv_value_8_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:796:6: lv_value_8_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:822:1: entryRuleConfigDeviceProperty returns [EObject current=null] : iv_ruleConfigDeviceProperty= ruleConfigDeviceProperty EOF ;
    public final EObject entryRuleConfigDeviceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigDeviceProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:822:61: (iv_ruleConfigDeviceProperty= ruleConfigDeviceProperty EOF )
            // InternalTargetEnvironmentParser.g:823:2: iv_ruleConfigDeviceProperty= ruleConfigDeviceProperty EOF
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
    // InternalTargetEnvironmentParser.g:829:1: ruleConfigDeviceProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:835:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:836:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:836:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:837:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= From ( ( ruleEString ) ) otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) this_DEDENT_8= RULE_DEDENT
            {

                  newCompositeNode(grammarAccess.getConfigDevicePropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getConfigDevicePropertyAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:848:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:849:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:849:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:850:5: lv_name_2_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:875:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:876:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:876:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:877:5: ruleEString
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

            // InternalTargetEnvironmentParser.g:895:3: ( (lv_value_7_0= rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:896:4: (lv_value_7_0= rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:896:4: (lv_value_7_0= rulePropertyValue )
            // InternalTargetEnvironmentParser.g:897:5: lv_value_7_0= rulePropertyValue
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


    // $ANTLR start "entryRuleAbstractOperatingSystemProperty"
    // InternalTargetEnvironmentParser.g:922:1: entryRuleAbstractOperatingSystemProperty returns [EObject current=null] : iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF ;
    public final EObject entryRuleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperatingSystemProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:922:72: (iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF )
            // InternalTargetEnvironmentParser.g:923:2: iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF
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
    // InternalTargetEnvironmentParser.g:929:1: ruleAbstractOperatingSystemProperty returns [EObject current=null] : (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) ;
    public final EObject ruleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject this_NameOperatingSystemProperty_0 = null;

        EObject this_VersionOperatingSystemProperty_1 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:935:2: ( (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) )
            // InternalTargetEnvironmentParser.g:936:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            {
            // InternalTargetEnvironmentParser.g:936:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==HyphenMinus) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==Name) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==Os_version) ) {
                        alt14=2;
                    }
                    else if ( (LA14_2==Os_name) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:937:3: this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty
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
                    // InternalTargetEnvironmentParser.g:946:3: this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty
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
    // InternalTargetEnvironmentParser.g:958:1: entryRuleNameOperatingSystemProperty returns [EObject current=null] : iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF ;
    public final EObject entryRuleNameOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperatingSystemProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:958:68: (iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF )
            // InternalTargetEnvironmentParser.g:959:2: iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF
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
    // InternalTargetEnvironmentParser.g:965:1: ruleNameOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:971:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:972:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:972:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:973:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:973:3: ()
            // InternalTargetEnvironmentParser.g:974:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_24);

                  newLeafNode(otherlv_2, grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:991:3: ( (lv_name_3_0= Os_name ) )
            // InternalTargetEnvironmentParser.g:992:4: (lv_name_3_0= Os_name )
            {
            // InternalTargetEnvironmentParser.g:992:4: (lv_name_3_0= Os_name )
            // InternalTargetEnvironmentParser.g:993:5: lv_name_3_0= Os_name
            {
            lv_name_3_0=(Token)match(input,Os_name,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getNameOperatingSystemPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "os_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_25);

                  newLeafNode(this_INDENT_4, grammarAccess.getNameOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_26);

                  newLeafNode(otherlv_5, grammarAccess.getNameOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1013:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1014:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1014:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1015:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_27);
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

            // InternalTargetEnvironmentParser.g:1032:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Description) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1033:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1037:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1038:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1038:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1039:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:1057:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Value) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1058:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1062:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1063:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1063:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1064:6: lv_value_10_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:1090:1: entryRuleVersionOperatingSystemProperty returns [EObject current=null] : iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF ;
    public final EObject entryRuleVersionOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionOperatingSystemProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1090:71: (iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF )
            // InternalTargetEnvironmentParser.g:1091:2: iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF
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
    // InternalTargetEnvironmentParser.g:1097:1: ruleVersionOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:1103:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1104:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1104:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1105:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1105:3: ()
            // InternalTargetEnvironmentParser.g:1106:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_28);

                  newLeafNode(otherlv_2, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalTargetEnvironmentParser.g:1123:3: ( (lv_name_3_0= Os_version ) )
            // InternalTargetEnvironmentParser.g:1124:4: (lv_name_3_0= Os_version )
            {
            // InternalTargetEnvironmentParser.g:1124:4: (lv_name_3_0= Os_version )
            // InternalTargetEnvironmentParser.g:1125:5: lv_name_3_0= Os_version
            {
            lv_name_3_0=(Token)match(input,Os_version,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getVersionOperatingSystemPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "os_version");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_25);

                  newLeafNode(this_INDENT_4, grammarAccess.getVersionOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_26);

                  newLeafNode(otherlv_5, grammarAccess.getVersionOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalTargetEnvironmentParser.g:1145:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1146:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1146:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1147:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_27);
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

            // InternalTargetEnvironmentParser.g:1164:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Description) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1165:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1169:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1170:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1170:5: (lv_description_8_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1171:6: lv_description_8_0= ruleEString
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

            // InternalTargetEnvironmentParser.g:1189:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Value) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1190:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_9, grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:1194:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1195:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1195:5: (lv_value_10_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1196:6: lv_value_10_0= rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:1222:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1222:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalTargetEnvironmentParser.g:1223:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalTargetEnvironmentParser.g:1229:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1235:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalTargetEnvironmentParser.g:1236:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalTargetEnvironmentParser.g:1236:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt19=5;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1237:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalTargetEnvironmentParser.g:1246:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalTargetEnvironmentParser.g:1255:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalTargetEnvironmentParser.g:1264:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalTargetEnvironmentParser.g:1273:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalTargetEnvironmentParser.g:1285:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalTargetEnvironmentParser.g:1285:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalTargetEnvironmentParser.g:1286:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalTargetEnvironmentParser.g:1292:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1298:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:1299:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:1299:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt20=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt20=1;
                }
                break;
            case MaximumKind:
                {
                alt20=2;
                }
                break;
            case MinimumKind:
                {
                alt20=3;
                }
                break;
            case RangeKind:
                {
                alt20=4;
                }
                break;
            case SelectionKind:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1300:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalTargetEnvironmentParser.g:1309:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalTargetEnvironmentParser.g:1318:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalTargetEnvironmentParser.g:1327:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalTargetEnvironmentParser.g:1336:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalTargetEnvironmentParser.g:1348:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalTargetEnvironmentParser.g:1348:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalTargetEnvironmentParser.g:1349:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalTargetEnvironmentParser.g:1355:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:1361:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:1362:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:1362:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:1363:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:1374:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1375:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1375:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1376:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_25);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_26);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:1401:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalTargetEnvironmentParser.g:1402:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1402:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalTargetEnvironmentParser.g:1403:5: lv_kind_5_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalTargetEnvironmentParser.g:1420:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Description) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1421:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:1425:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1426:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1426:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1427:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalTargetEnvironmentParser.g:1445:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1446:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1450:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1451:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1451:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1452:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalTargetEnvironmentParser.g:1470:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DEDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1471:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1480:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalTargetEnvironmentParser.g:1480:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalTargetEnvironmentParser.g:1481:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalTargetEnvironmentParser.g:1487:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:1493:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:1494:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:1494:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:1495:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:1506:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1507:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1507:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1508:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_25);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_32);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:1533:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalTargetEnvironmentParser.g:1534:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalTargetEnvironmentParser.g:1534:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalTargetEnvironmentParser.g:1535:5: lv_kind_5_0= ruleMaximumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalTargetEnvironmentParser.g:1552:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Description) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1553:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:1557:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1558:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1558:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1559:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalTargetEnvironmentParser.g:1577:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Value) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1578:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1582:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1583:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1583:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1584:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalTargetEnvironmentParser.g:1602:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DEDENT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1603:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1612:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalTargetEnvironmentParser.g:1612:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalTargetEnvironmentParser.g:1613:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalTargetEnvironmentParser.g:1619:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:1625:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:1626:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:1626:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:1627:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:1638:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1639:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1639:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1640:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_25);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_33);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:1665:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalTargetEnvironmentParser.g:1666:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalTargetEnvironmentParser.g:1666:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalTargetEnvironmentParser.g:1667:5: lv_kind_5_0= ruleMinimumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalTargetEnvironmentParser.g:1684:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Description) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1685:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:1689:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1690:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1690:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1691:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalTargetEnvironmentParser.g:1709:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Value) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1710:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_21);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalTargetEnvironmentParser.g:1714:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1715:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1715:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1716:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalTargetEnvironmentParser.g:1734:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_DEDENT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1735:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1744:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalTargetEnvironmentParser.g:1744:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalTargetEnvironmentParser.g:1745:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalTargetEnvironmentParser.g:1751:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:1757:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:1758:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:1758:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:1759:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:1770:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1771:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1771:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1772:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_25);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_34);

                  newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:1797:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:1798:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:1798:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalTargetEnvironmentParser.g:1799:5: lv_kind_5_0= ruleSelectionKind
            {

                      newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalTargetEnvironmentParser.g:1816:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Description) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1817:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:1821:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1822:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1822:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1823:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalTargetEnvironmentParser.g:1841:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Value) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1842:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
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

                    // InternalTargetEnvironmentParser.g:1857:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1858:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1858:5: (lv_value_11_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1859:6: lv_value_11_0= rulePropertyValue
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

                    // InternalTargetEnvironmentParser.g:1876:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==HyphenMinus) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                      case 1 :
                          // InternalTargetEnvironmentParser.g:1877:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                          pushFollow(FOLLOW_21);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalTargetEnvironmentParser.g:1884:5: ( (lv_value_13_0= rulePropertyValue ) )
                          // InternalTargetEnvironmentParser.g:1885:6: (lv_value_13_0= rulePropertyValue )
                          {
                          // InternalTargetEnvironmentParser.g:1885:6: (lv_value_13_0= rulePropertyValue )
                          // InternalTargetEnvironmentParser.g:1886:7: lv_value_13_0= rulePropertyValue
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
                          break loop31;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_31);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1909:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_DEDENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1910:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1919:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalTargetEnvironmentParser.g:1919:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalTargetEnvironmentParser.g:1920:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalTargetEnvironmentParser.g:1926:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalTargetEnvironmentParser.g:1932:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:1933:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:1933:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:1934:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:1945:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1946:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1946:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1947:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_25);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_35);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalTargetEnvironmentParser.g:1972:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalTargetEnvironmentParser.g:1973:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalTargetEnvironmentParser.g:1973:4: (lv_kind_5_0= ruleRangeKind )
            // InternalTargetEnvironmentParser.g:1974:5: lv_kind_5_0= ruleRangeKind
            {

                      newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalTargetEnvironmentParser.g:1991:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Description) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1992:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalTargetEnvironmentParser.g:1996:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalTargetEnvironmentParser.g:1997:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalTargetEnvironmentParser.g:1997:5: (lv_description_7_0= ruleEString )
                    // InternalTargetEnvironmentParser.g:1998:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalTargetEnvironmentParser.g:2016:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Value) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2017:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
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

                    // InternalTargetEnvironmentParser.g:2032:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2033:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2033:5: (lv_value_11_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2034:6: lv_value_11_0= rulePropertyValue
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

                    // InternalTargetEnvironmentParser.g:2058:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:2059:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:2059:5: (lv_value_13_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:2060:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_31);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:2082:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DEDENT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2083:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2092:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalTargetEnvironmentParser.g:2092:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalTargetEnvironmentParser.g:2093:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalTargetEnvironmentParser.g:2099:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) ;
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
            // InternalTargetEnvironmentParser.g:2105:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) )
            // InternalTargetEnvironmentParser.g:2106:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            {
            // InternalTargetEnvironmentParser.g:2106:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            int alt37=7;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt37=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt37=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt37=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt37=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt37=6;
                }
                break;
            case RULE_INDENT:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2107:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalTargetEnvironmentParser.g:2116:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalTargetEnvironmentParser.g:2125:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalTargetEnvironmentParser.g:2134:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalTargetEnvironmentParser.g:2143:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalTargetEnvironmentParser.g:2152:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
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
                    // InternalTargetEnvironmentParser.g:2161:3: this_PropertyValueList_6= rulePropertyValueList
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
    // InternalTargetEnvironmentParser.g:2173:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalTargetEnvironmentParser.g:2173:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalTargetEnvironmentParser.g:2174:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalTargetEnvironmentParser.g:2180:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2186:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalTargetEnvironmentParser.g:2187:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalTargetEnvironmentParser.g:2187:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalTargetEnvironmentParser.g:2188:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalTargetEnvironmentParser.g:2188:3: (lv_value_0_0= ruleInteger0 )
            // InternalTargetEnvironmentParser.g:2189:4: lv_value_0_0= ruleInteger0
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
    // InternalTargetEnvironmentParser.g:2209:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalTargetEnvironmentParser.g:2209:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalTargetEnvironmentParser.g:2210:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalTargetEnvironmentParser.g:2216:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2222:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalTargetEnvironmentParser.g:2223:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalTargetEnvironmentParser.g:2223:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalTargetEnvironmentParser.g:2224:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalTargetEnvironmentParser.g:2224:3: (lv_value_0_0= ruleDouble0 )
            // InternalTargetEnvironmentParser.g:2225:4: lv_value_0_0= ruleDouble0
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
    // InternalTargetEnvironmentParser.g:2245:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalTargetEnvironmentParser.g:2245:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalTargetEnvironmentParser.g:2246:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalTargetEnvironmentParser.g:2252:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2258:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:2259:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:2259:2: ( (lv_value_0_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2260:3: (lv_value_0_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2260:3: (lv_value_0_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2261:4: lv_value_0_0= ruleEString
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
    // InternalTargetEnvironmentParser.g:2281:1: entryRulePropertyValueList returns [EObject current=null] : iv_rulePropertyValueList= rulePropertyValueList EOF ;
    public final EObject entryRulePropertyValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueList = null;


        try {
            // InternalTargetEnvironmentParser.g:2281:58: (iv_rulePropertyValueList= rulePropertyValueList EOF )
            // InternalTargetEnvironmentParser.g:2282:2: iv_rulePropertyValueList= rulePropertyValueList EOF
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
    // InternalTargetEnvironmentParser.g:2288:1: rulePropertyValueList returns [EObject current=null] : (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject rulePropertyValueList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2294:2: ( (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2295:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2295:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2296:3: this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_0, grammarAccess.getPropertyValueListAccess().getINDENTTerminalRuleCall_0());


                  newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_21);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            // InternalTargetEnvironmentParser.g:2307:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:2308:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:2308:4: (lv_value_2_0= rulePropertyValue )
            // InternalTargetEnvironmentParser.g:2309:5: lv_value_2_0= rulePropertyValue
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

            // InternalTargetEnvironmentParser.g:2326:3: ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==HyphenMinus) ) {
                    alt38=1;
                }


                switch (alt38) {
              case 1 :
                  // InternalTargetEnvironmentParser.g:2327:4: rulePreListElement ( (lv_value_4_0= rulePropertyValue ) )
                  {

                          newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_3_0());

                  pushFollow(FOLLOW_21);
                  rulePreListElement();

                  state._fsp--;


                          afterParserOrEnumRuleCall();

                  // InternalTargetEnvironmentParser.g:2334:4: ( (lv_value_4_0= rulePropertyValue ) )
                  // InternalTargetEnvironmentParser.g:2335:5: (lv_value_4_0= rulePropertyValue )
                  {
                  // InternalTargetEnvironmentParser.g:2335:5: (lv_value_4_0= rulePropertyValue )
                  // InternalTargetEnvironmentParser.g:2336:6: lv_value_4_0= rulePropertyValue
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
                  break loop38;
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
    // InternalTargetEnvironmentParser.g:2362:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalTargetEnvironmentParser.g:2362:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalTargetEnvironmentParser.g:2363:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalTargetEnvironmentParser.g:2369:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2375:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalTargetEnvironmentParser.g:2376:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalTargetEnvironmentParser.g:2376:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalTargetEnvironmentParser.g:2377:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalTargetEnvironmentParser.g:2377:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalTargetEnvironmentParser.g:2378:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalTargetEnvironmentParser.g:2398:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:2398:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalTargetEnvironmentParser.g:2399:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalTargetEnvironmentParser.g:2405:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2411:2: (this_ResourceType_0= ruleResourceType )
            // InternalTargetEnvironmentParser.g:2412:2: this_ResourceType_0= ruleResourceType
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
    // InternalTargetEnvironmentParser.g:2423:1: entryRuleOpertingSystemResouceType returns [EObject current=null] : iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF ;
    public final EObject entryRuleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:2423:66: (iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF )
            // InternalTargetEnvironmentParser.g:2424:2: iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF
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
    // InternalTargetEnvironmentParser.g:2430:1: ruleOpertingSystemResouceType returns [EObject current=null] : (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) ;
    public final EObject ruleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystem_0 = null;

        EObject this_MacOSOpertingSystem_1 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2436:2: ( (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:2437:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:2437:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==LinuxOpertingSystem) ) {
                alt39=1;
            }
            else if ( (LA39_0==MacOSOpertingSystem) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2438:3: this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem
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
                    // InternalTargetEnvironmentParser.g:2447:3: this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem
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
    // InternalTargetEnvironmentParser.g:2459:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalTargetEnvironmentParser.g:2459:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalTargetEnvironmentParser.g:2460:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalTargetEnvironmentParser.g:2466:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2472:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:2473:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:2473:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:2474:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:2474:3: ()
            // InternalTargetEnvironmentParser.g:2475:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                      current);


            }

            // InternalTargetEnvironmentParser.g:2481:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2482:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2482:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2483:5: lv_name_1_0= ruleEString
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


    // $ANTLR start "entryRuleLinuxOpertingSystem"
    // InternalTargetEnvironmentParser.g:2504:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalTargetEnvironmentParser.g:2504:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalTargetEnvironmentParser.g:2505:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalTargetEnvironmentParser.g:2511:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2517:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:2518:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:2518:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalTargetEnvironmentParser.g:2519:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalTargetEnvironmentParser.g:2519:3: ()
            // InternalTargetEnvironmentParser.g:2520:4:
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
    // InternalTargetEnvironmentParser.g:2534:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalTargetEnvironmentParser.g:2534:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalTargetEnvironmentParser.g:2535:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalTargetEnvironmentParser.g:2541:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2547:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:2548:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:2548:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalTargetEnvironmentParser.g:2549:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalTargetEnvironmentParser.g:2549:3: ()
            // InternalTargetEnvironmentParser.g:2550:4:
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
    // InternalTargetEnvironmentParser.g:2564:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:2564:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:2565:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:2571:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2577:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:2578:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:2578:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:2579:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:2579:3: ()
            // InternalTargetEnvironmentParser.g:2580:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                      current);


            }

            // InternalTargetEnvironmentParser.g:2586:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2587:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2587:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2588:5: lv_name_1_0= ruleEString
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
    // InternalTargetEnvironmentParser.g:2609:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:2609:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:2610:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:2616:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2622:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalTargetEnvironmentParser.g:2623:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:2623:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Ethernet) ) {
                alt40=1;
            }
            else if ( (LA40_0==Wlan) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2624:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalTargetEnvironmentParser.g:2633:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalTargetEnvironmentParser.g:2645:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:2645:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:2646:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:2652:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2658:2: ( ( () otherlv_1= Ethernet ) )
            // InternalTargetEnvironmentParser.g:2659:2: ( () otherlv_1= Ethernet )
            {
            // InternalTargetEnvironmentParser.g:2659:2: ( () otherlv_1= Ethernet )
            // InternalTargetEnvironmentParser.g:2660:3: () otherlv_1= Ethernet
            {
            // InternalTargetEnvironmentParser.g:2660:3: ()
            // InternalTargetEnvironmentParser.g:2661:4:
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
    // InternalTargetEnvironmentParser.g:2675:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:2675:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:2676:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:2682:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2688:2: ( ( () otherlv_1= Wlan ) )
            // InternalTargetEnvironmentParser.g:2689:2: ( () otherlv_1= Wlan )
            {
            // InternalTargetEnvironmentParser.g:2689:2: ( () otherlv_1= Wlan )
            // InternalTargetEnvironmentParser.g:2690:3: () otherlv_1= Wlan
            {
            // InternalTargetEnvironmentParser.g:2690:3: ()
            // InternalTargetEnvironmentParser.g:2691:4:
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
    // InternalTargetEnvironmentParser.g:2705:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:2705:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalTargetEnvironmentParser.g:2706:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalTargetEnvironmentParser.g:2712:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2718:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalTargetEnvironmentParser.g:2719:2: ( () otherlv_1= AttributeKind )
            {
            // InternalTargetEnvironmentParser.g:2719:2: ( () otherlv_1= AttributeKind )
            // InternalTargetEnvironmentParser.g:2720:3: () otherlv_1= AttributeKind
            {
            // InternalTargetEnvironmentParser.g:2720:3: ()
            // InternalTargetEnvironmentParser.g:2721:4:
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
    // InternalTargetEnvironmentParser.g:2735:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:2735:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalTargetEnvironmentParser.g:2736:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalTargetEnvironmentParser.g:2742:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2748:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalTargetEnvironmentParser.g:2749:2: ( () otherlv_1= MaximumKind )
            {
            // InternalTargetEnvironmentParser.g:2749:2: ( () otherlv_1= MaximumKind )
            // InternalTargetEnvironmentParser.g:2750:3: () otherlv_1= MaximumKind
            {
            // InternalTargetEnvironmentParser.g:2750:3: ()
            // InternalTargetEnvironmentParser.g:2751:4:
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
    // InternalTargetEnvironmentParser.g:2765:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:2765:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalTargetEnvironmentParser.g:2766:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalTargetEnvironmentParser.g:2772:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2778:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalTargetEnvironmentParser.g:2779:2: ( () otherlv_1= MinimumKind )
            {
            // InternalTargetEnvironmentParser.g:2779:2: ( () otherlv_1= MinimumKind )
            // InternalTargetEnvironmentParser.g:2780:3: () otherlv_1= MinimumKind
            {
            // InternalTargetEnvironmentParser.g:2780:3: ()
            // InternalTargetEnvironmentParser.g:2781:4:
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
    // InternalTargetEnvironmentParser.g:2795:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalTargetEnvironmentParser.g:2795:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalTargetEnvironmentParser.g:2796:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalTargetEnvironmentParser.g:2802:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2808:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalTargetEnvironmentParser.g:2809:2: ( () otherlv_1= SelectionKind )
            {
            // InternalTargetEnvironmentParser.g:2809:2: ( () otherlv_1= SelectionKind )
            // InternalTargetEnvironmentParser.g:2810:3: () otherlv_1= SelectionKind
            {
            // InternalTargetEnvironmentParser.g:2810:3: ()
            // InternalTargetEnvironmentParser.g:2811:4:
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
    // InternalTargetEnvironmentParser.g:2825:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:2825:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalTargetEnvironmentParser.g:2826:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalTargetEnvironmentParser.g:2832:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2838:2: ( ( () otherlv_1= RangeKind ) )
            // InternalTargetEnvironmentParser.g:2839:2: ( () otherlv_1= RangeKind )
            {
            // InternalTargetEnvironmentParser.g:2839:2: ( () otherlv_1= RangeKind )
            // InternalTargetEnvironmentParser.g:2840:3: () otherlv_1= RangeKind
            {
            // InternalTargetEnvironmentParser.g:2840:3: ()
            // InternalTargetEnvironmentParser.g:2841:4:
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
    // InternalTargetEnvironmentParser.g:2855:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalTargetEnvironmentParser.g:2855:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalTargetEnvironmentParser.g:2856:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalTargetEnvironmentParser.g:2862:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2868:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalTargetEnvironmentParser.g:2869:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalTargetEnvironmentParser.g:2869:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalTargetEnvironmentParser.g:2870:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalTargetEnvironmentParser.g:2870:3: ()
            // InternalTargetEnvironmentParser.g:2871:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                      current);


            }

            // InternalTargetEnvironmentParser.g:2877:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalTargetEnvironmentParser.g:2878:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalTargetEnvironmentParser.g:2878:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalTargetEnvironmentParser.g:2879:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalTargetEnvironmentParser.g:2900:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalTargetEnvironmentParser.g:2900:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalTargetEnvironmentParser.g:2901:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalTargetEnvironmentParser.g:2907:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2913:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalTargetEnvironmentParser.g:2914:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalTargetEnvironmentParser.g:2914:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalTargetEnvironmentParser.g:2915:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalTargetEnvironmentParser.g:2915:3: ()
            // InternalTargetEnvironmentParser.g:2916:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                      current);


            }

            // InternalTargetEnvironmentParser.g:2922:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalTargetEnvironmentParser.g:2923:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalTargetEnvironmentParser.g:2923:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalTargetEnvironmentParser.g:2924:5: lv_value_1_0= ruleUbuntuVersion
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
    // InternalTargetEnvironmentParser.g:2945:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalTargetEnvironmentParser.g:2945:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalTargetEnvironmentParser.g:2946:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalTargetEnvironmentParser.g:2952:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2958:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalTargetEnvironmentParser.g:2959:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalTargetEnvironmentParser.g:2969:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalTargetEnvironmentParser.g:2969:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalTargetEnvironmentParser.g:2970:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalTargetEnvironmentParser.g:2976:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2982:2: (this_DECINT_0= RULE_DECINT )
            // InternalTargetEnvironmentParser.g:2983:2: this_DECINT_0= RULE_DECINT
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
    // InternalTargetEnvironmentParser.g:2993:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTargetEnvironmentParser.g:2993:47: (iv_ruleEString= ruleEString EOF )
            // InternalTargetEnvironmentParser.g:2994:2: iv_ruleEString= ruleEString EOF
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
    // InternalTargetEnvironmentParser.g:3000:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3006:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTargetEnvironmentParser.g:3007:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTargetEnvironmentParser.g:3007:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3008:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                          current.merge(this_STRING_0);


                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3016:3: this_ID_1= RULE_ID
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
    // InternalTargetEnvironmentParser.g:3027:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:3029:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalTargetEnvironmentParser.g:3030:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalTargetEnvironmentParser.g:3039:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


          enterRule();
          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:3046:2: (kw= HyphenMinus )
            // InternalTargetEnvironmentParser.g:3047:2: kw= HyphenMinus
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
    // InternalTargetEnvironmentParser.g:3058:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3064:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalTargetEnvironmentParser.g:3065:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalTargetEnvironmentParser.g:3065:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==X86) ) {
                alt42=1;
            }
            else if ( (LA42_0==Arm64) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3066:3: (enumLiteral_0= X86 )
                    {
                    // InternalTargetEnvironmentParser.g:3066:3: (enumLiteral_0= X86 )
                    // InternalTargetEnvironmentParser.g:3067:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                            current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3074:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalTargetEnvironmentParser.g:3074:3: (enumLiteral_1= Arm64 )
                    // InternalTargetEnvironmentParser.g:3075:4: enumLiteral_1= Arm64
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
    // InternalTargetEnvironmentParser.g:3085:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3091:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalTargetEnvironmentParser.g:3092:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalTargetEnvironmentParser.g:3092:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Ubuntu) ) {
                alt43=1;
            }
            else if ( (LA43_0==Debian) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3093:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalTargetEnvironmentParser.g:3093:3: (enumLiteral_0= Ubuntu )
                    // InternalTargetEnvironmentParser.g:3094:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                            current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3101:3: (enumLiteral_1= Debian )
                    {
                    // InternalTargetEnvironmentParser.g:3101:3: (enumLiteral_1= Debian )
                    // InternalTargetEnvironmentParser.g:3102:4: enumLiteral_1= Debian
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
    // InternalTargetEnvironmentParser.g:3112:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalTargetEnvironmentParser.g:3118:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalTargetEnvironmentParser.g:3119:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalTargetEnvironmentParser.g:3119:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Focal) ) {
                alt44=1;
            }
            else if ( (LA44_0==Jammy) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3120:3: (enumLiteral_0= Focal )
                    {
                    // InternalTargetEnvironmentParser.g:3120:3: (enumLiteral_0= Focal )
                    // InternalTargetEnvironmentParser.g:3121:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                            current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:3128:3: (enumLiteral_1= Jammy )
                    {
                    // InternalTargetEnvironmentParser.g:3128:3: (enumLiteral_1= Jammy )
                    // InternalTargetEnvironmentParser.g:3129:4: enumLiteral_1= Jammy
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


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\53\1\46\1\62\2\60\1\45\1\20\5\uffff";
    static final String dfa_3s = "\1\53\1\46\1\64\2\60\1\45\1\31\5\uffff";
    static final String dfa_4s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\1\uffff\1\11\1\10\4\uffff\1\12",
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1236:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000000002400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0002000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00156416C0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000100040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000100040002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000100000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002000000L});

}
