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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "TargetDeployEnviroment", "RefConnectionProperty", "ConfigConnection", "Configuration", "ConnectDevice", "IncludeDevice", "RefConnection", "RefDeviceType", "AttributeKind", "SelectionKind", "DeviceType", "MaximumKind", "MinimumKind", "Capability", "Properties", "RefDevice", "Value", "Kind", "Name", "Type", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=31;
    public static final int Configuration=8;
    public static final int RULE_DATE_TIME=36;
    public static final int RULE_BOOLEAN=28;
    public static final int AttributeKind=13;
    public static final int RULE_YEAR=33;
    public static final int RefDeviceType=12;
    public static final int Name=23;
    public static final int RULE_MIN_SEC=35;
    public static final int Kind=22;
    public static final int ConnectDevice=9;
    public static final int RULE_DEDENT=39;
    public static final int Capability=18;
    public static final int RULE_ID=40;
    public static final int ConfigConnection=7;
    public static final int RULE_DIGIT=26;
    public static final int SelectionKind=14;
    public static final int DeviceType=15;
    public static final int TargetDeployEnviroment=5;
    public static final int RULE_INT=41;
    public static final int Value=21;
    public static final int RULE_ML_COMMENT=43;
    public static final int RefConnectionProperty=6;
    public static final int RULE_STRING=42;
    public static final int Properties=19;
    public static final int RULE_SL_COMMENT=37;
    public static final int CommunicationConnection=4;
    public static final int HyphenMinus=25;
    public static final int RULE_DOUBLE=30;
    public static final int RULE_DECINT=29;
    public static final int MinimumKind=17;
    public static final int EOF=-1;
    public static final int RULE_INDENT=38;
    public static final int RULE_HOUR=34;
    public static final int RefDevice=20;
    public static final int RULE_WS=44;
    public static final int MaximumKind=16;
    public static final int RULE_ANY_OTHER=45;
    public static final int RefConnection=11;
    public static final int Type=24;
    public static final int RULE_MONTH=32;
    public static final int RULE_BINARY=27;
    public static final int IncludeDevice=10;

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

            if ( (LA1_0==EOF||LA1_0==DeviceType) ) {
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
    // InternalTargetEnvironmentParser.g:145:1: ruleTargetDeployEnviroment returns [EObject current=null] : ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
    public final EObject ruleTargetDeployEnviroment() throws RecognitionException {
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

        EObject lv_includeDevice_7_0 = null;

        EObject lv_configConnection_11_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:151:2: ( ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:152:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:152:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:153:3: () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
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
                                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:191:3: (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IncludeDevice) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:192:4: otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,IncludeDevice,FOLLOW_3);

                                    newLeafNode(otherlv_5, grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_6, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalTargetEnvironmentParser.g:200:4: ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+
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
                            // InternalTargetEnvironmentParser.g:201:5: (lv_includeDevice_7_0= ruleDeviceInstance )
                            {
                            // InternalTargetEnvironmentParser.g:201:5: (lv_includeDevice_7_0= ruleDeviceInstance )
                            // InternalTargetEnvironmentParser.g:202:6: lv_includeDevice_7_0= ruleDeviceInstance
                            {

                                                    newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceDeviceInstanceParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_8);
                            lv_includeDevice_7_0=ruleDeviceInstance();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                                                    }
                                                    add(
                                                        current,
                                                        "includeDevice",
                                                        lv_includeDevice_7_0,
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

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_9);

                                    newLeafNode(this_DEDENT_8, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:224:3: (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ConfigConnection) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:225:4: otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,ConfigConnection,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionKeyword_6_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_10, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:233:4: ( (lv_configConnection_11_0= ruleConfigConnection ) )+
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
                            // InternalTargetEnvironmentParser.g:234:5: (lv_configConnection_11_0= ruleConfigConnection )
                            {
                            // InternalTargetEnvironmentParser.g:234:5: (lv_configConnection_11_0= ruleConfigConnection )
                            // InternalTargetEnvironmentParser.g:235:6: lv_configConnection_11_0= ruleConfigConnection
                            {

                                                    newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionConfigConnectionParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_8);
                            lv_configConnection_11_0=ruleConfigConnection();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                                                    }
                                                    add(
                                                        current,
                                                        "configConnection",
                                                        lv_configConnection_11_0,
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

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_12, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_13, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_7());


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
    // InternalTargetEnvironmentParser.g:265:1: entryRuleDeviceInstance returns [EObject current=null] : iv_ruleDeviceInstance= ruleDeviceInstance EOF ;
    public final EObject entryRuleDeviceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceInstance = null;


        try {
            // InternalTargetEnvironmentParser.g:265:55: (iv_ruleDeviceInstance= ruleDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:266:2: iv_ruleDeviceInstance= ruleDeviceInstance EOF
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
    // InternalTargetEnvironmentParser.g:272:1: ruleDeviceInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleDeviceInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:278:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:279:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:279:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:280:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getDeviceInstanceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getDeviceInstanceAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:291:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:292:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:292:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:293:5: lv_name_2_0= ruleEString
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
                                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_11);

                        newLeafNode(this_INDENT_3, grammarAccess.getDeviceInstanceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,RefDeviceType,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeKeyword_4());

            // InternalTargetEnvironmentParser.g:318:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:319:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:319:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:320:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getDeviceInstanceRule());
                                }


                                newCompositeNode(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeCrossReference_5_0());

            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_6, grammarAccess.getDeviceInstanceAccess().getDEDENTTerminalRuleCall_6());


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


    // $ANTLR start "entryRuleConfigConnection"
    // InternalTargetEnvironmentParser.g:342:1: entryRuleConfigConnection returns [EObject current=null] : iv_ruleConfigConnection= ruleConfigConnection EOF ;
    public final EObject entryRuleConfigConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:342:57: (iv_ruleConfigConnection= ruleConfigConnection EOF )
            // InternalTargetEnvironmentParser.g:343:2: iv_ruleConfigConnection= ruleConfigConnection EOF
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
    // InternalTargetEnvironmentParser.g:349:1: ruleConfigConnection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:355:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:356:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:356:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:357:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getConfigConnectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConfigConnectionAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:368:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:369:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:369:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:370:5: lv_name_2_0= ruleEString
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
                                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_12);

                        newLeafNode(this_INDENT_3, grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,ConnectDevice,FOLLOW_3);

                        newLeafNode(otherlv_4, grammarAccess.getConfigConnectionAccess().getConnectDeviceKeyword_4());

            this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_7);

                        newLeafNode(this_INDENT_5, grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_5());

            // InternalTargetEnvironmentParser.g:399:3: ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+
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
                    // InternalTargetEnvironmentParser.g:400:4: (lv_connectDevice_6_0= ruleConnectedDevice )
                    {
                    // InternalTargetEnvironmentParser.g:400:4: (lv_connectDevice_6_0= ruleConnectedDevice )
                    // InternalTargetEnvironmentParser.g:401:5: lv_connectDevice_6_0= ruleConnectedDevice
                    {

                                        newCompositeNode(grammarAccess.getConfigConnectionAccess().getConnectDeviceConnectedDeviceParserRuleCall_6_0());

                    pushFollow(FOLLOW_8);
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
                    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_10);

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
    // InternalTargetEnvironmentParser.g:430:1: entryRuleConnectedDevice returns [EObject current=null] : iv_ruleConnectedDevice= ruleConnectedDevice EOF ;
    public final EObject entryRuleConnectedDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectedDevice = null;


        try {
            // InternalTargetEnvironmentParser.g:430:56: (iv_ruleConnectedDevice= ruleConnectedDevice EOF )
            // InternalTargetEnvironmentParser.g:431:2: iv_ruleConnectedDevice= ruleConnectedDevice EOF
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
    // InternalTargetEnvironmentParser.g:437:1: ruleConnectedDevice returns [EObject current=null] : ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:443:2: ( ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:444:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:444:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:445:3: rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_13);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,RefDevice,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConnectedDeviceAccess().getRefDeviceKeyword_1());

            // InternalTargetEnvironmentParser.g:456:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:457:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:457:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:458:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConnectedDeviceRule());
                                }


                                newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceCrossReference_2_0());

            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_14);

                        newLeafNode(this_INDENT_3, grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,RefConnection,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getConnectedDeviceAccess().getRefConnectionKeyword_4());

            // InternalTargetEnvironmentParser.g:480:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:481:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:481:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:482:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConnectedDeviceRule());
                                }


                                newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefConnectionCommunicationConnectionCrossReference_5_0());

            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:496:3: (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Configuration) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:497:4: otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Configuration,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getConnectedDeviceAccess().getConfigurationKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_7, grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:505:4: ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+
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
                            // InternalTargetEnvironmentParser.g:506:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                            {
                            // InternalTargetEnvironmentParser.g:506:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                            // InternalTargetEnvironmentParser.g:507:6: lv_properties_8_0= ruleConfigConnectionProperty
                            {

                                                    newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPropertiesConfigConnectionPropertyParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_8);
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
                            if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_10);

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
    // InternalTargetEnvironmentParser.g:537:1: entryRuleConfigConnectionProperty returns [EObject current=null] : iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF ;
    public final EObject entryRuleConfigConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:537:65: (iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:538:2: iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:544:1: ruleConfigConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
    public final EObject ruleConfigConnectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;
        EObject lv_value_6_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:550:2: ( ( () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:551:2: ( () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:551:2: ( () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:552:3: () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalTargetEnvironmentParser.g:552:3: ()
            // InternalTargetEnvironmentParser.g:553:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigConnectionPropertyAccess().getConfigConnectionPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_16);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,RefConnectionProperty,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyKeyword_2());

            // InternalTargetEnvironmentParser.g:570:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:571:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:571:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:572:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigConnectionPropertyRule());
                                }


                                newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyConnectionPropertyCrossReference_3_0());

            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:586:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INDENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:587:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_18);

                                    newLeafNode(this_INDENT_4, grammarAccess.getConfigConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0());

                    otherlv_5=(Token)match(input,Value,FOLLOW_19);

                                    newLeafNode(otherlv_5, grammarAccess.getConfigConnectionPropertyAccess().getValueKeyword_4_1());

                    // InternalTargetEnvironmentParser.g:595:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:596:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:596:5: (lv_value_6_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:597:6: lv_value_6_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());

                    pushFollow(FOLLOW_10);
                    lv_value_6_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getConfigConnectionPropertyRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_6_0,
                                                "de.fraunhofer.ipa.targetEnvironment.Base.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_7, grammarAccess.getConfigConnectionPropertyAccess().getDEDENTTerminalRuleCall_4_3());


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
    // $ANTLR end "ruleConfigConnectionProperty"


    // $ANTLR start "entryRuleDeviceSet"
    // InternalTargetEnvironmentParser.g:623:1: entryRuleDeviceSet returns [EObject current=null] : iv_ruleDeviceSet= ruleDeviceSet EOF ;
    public final EObject entryRuleDeviceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceSet = null;


        try {
            // InternalTargetEnvironmentParser.g:623:50: (iv_ruleDeviceSet= ruleDeviceSet EOF )
            // InternalTargetEnvironmentParser.g:624:2: iv_ruleDeviceSet= ruleDeviceSet EOF
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
    // InternalTargetEnvironmentParser.g:630:1: ruleDeviceSet returns [EObject current=null] : ( (lv_device_0_0= ruleDeviceType ) )* ;
    public final EObject ruleDeviceSet() throws RecognitionException {
        EObject current = null;

        EObject lv_device_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:636:2: ( ( (lv_device_0_0= ruleDeviceType ) )* )
            // InternalTargetEnvironmentParser.g:637:2: ( (lv_device_0_0= ruleDeviceType ) )*
            {
            // InternalTargetEnvironmentParser.g:637:2: ( (lv_device_0_0= ruleDeviceType ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DeviceType) ) {
                    alt10=1;
                }


                switch (alt10) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:638:3: (lv_device_0_0= ruleDeviceType )
                    {
                    // InternalTargetEnvironmentParser.g:638:3: (lv_device_0_0= ruleDeviceType )
                    // InternalTargetEnvironmentParser.g:639:4: lv_device_0_0= ruleDeviceType
                    {

                                    newCompositeNode(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_0());

                    pushFollow(FOLLOW_20);
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
                    break;

                default :
                    break loop10;
                }
            } while (true);


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


    // $ANTLR start "entryRuleCapabilityKind"
    // InternalTargetEnvironmentParser.g:659:1: entryRuleCapabilityKind returns [EObject current=null] : iv_ruleCapabilityKind= ruleCapabilityKind EOF ;
    public final EObject entryRuleCapabilityKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityKind = null;


        try {
            // InternalTargetEnvironmentParser.g:659:55: (iv_ruleCapabilityKind= ruleCapabilityKind EOF )
            // InternalTargetEnvironmentParser.g:660:2: iv_ruleCapabilityKind= ruleCapabilityKind EOF
            {
             newCompositeNode(grammarAccess.getCapabilityKindRule());
            pushFollow(FOLLOW_1);
            iv_ruleCapabilityKind=ruleCapabilityKind();

            state._fsp--;

             current =iv_ruleCapabilityKind;
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
    // $ANTLR end "entryRuleCapabilityKind"


    // $ANTLR start "ruleCapabilityKind"
    // InternalTargetEnvironmentParser.g:666:1: ruleCapabilityKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind ) ;
    public final EObject ruleCapabilityKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_SelectionKind_3 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:672:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:673:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:673:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind )
            int alt11=4;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt11=1;
                }
                break;
            case MaximumKind:
                {
                alt11=2;
                }
                break;
            case MinimumKind:
                {
                alt11=3;
                }
                break;
            case SelectionKind:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:674:3: this_AttributeKind_0= ruleAttributeKind
                    {

                                newCompositeNode(grammarAccess.getCapabilityKindAccess().getAttributeKindParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_AttributeKind_0=ruleAttributeKind();

                    state._fsp--;


                                current = this_AttributeKind_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:683:3: this_MaximumKind_1= ruleMaximumKind
                    {

                                newCompositeNode(grammarAccess.getCapabilityKindAccess().getMaximumKindParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_MaximumKind_1=ruleMaximumKind();

                    state._fsp--;


                                current = this_MaximumKind_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 3 :
                    // InternalTargetEnvironmentParser.g:692:3: this_MinimumKind_2= ruleMinimumKind
                    {

                                newCompositeNode(grammarAccess.getCapabilityKindAccess().getMinimumKindParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_MinimumKind_2=ruleMinimumKind();

                    state._fsp--;


                                current = this_MinimumKind_2;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 4 :
                    // InternalTargetEnvironmentParser.g:701:3: this_SelectionKind_3= ruleSelectionKind
                    {

                                newCompositeNode(grammarAccess.getCapabilityKindAccess().getSelectionKindParserRuleCall_3());

                    pushFollow(FOLLOW_2);
                    this_SelectionKind_3=ruleSelectionKind();

                    state._fsp--;


                                current = this_SelectionKind_3;
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
    // $ANTLR end "ruleCapabilityKind"


    // $ANTLR start "entryRuleDeviceType"
    // InternalTargetEnvironmentParser.g:713:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalTargetEnvironmentParser.g:713:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalTargetEnvironmentParser.g:714:2: iv_ruleDeviceType= ruleDeviceType EOF
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
    // InternalTargetEnvironmentParser.g:720:1: ruleDeviceType returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
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

        EObject lv_capability_7_0 = null;

        EObject lv_communicationConnection_11_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:726:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:727:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:727:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:728:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:728:3: ()
            // InternalTargetEnvironmentParser.g:729:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getDeviceTypeAccess().getDeviceTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,DeviceType,FOLLOW_3);

                        newLeafNode(otherlv_1, grammarAccess.getDeviceTypeAccess().getDeviceTypeKeyword_1());

            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_2, grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_2());

            otherlv_3=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_3, grammarAccess.getDeviceTypeAccess().getNameKeyword_3());

            // InternalTargetEnvironmentParser.g:747:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:748:4: (lv_name_4_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:748:4: (lv_name_4_0= ruleEString )
            // InternalTargetEnvironmentParser.g:749:5: lv_name_4_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceTypeAccess().getNameEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_21);
            lv_name_4_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeviceTypeRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_4_0,
                                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:766:3: (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Capability) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:767:4: otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,Capability,FOLLOW_3);

                                    newLeafNode(otherlv_5, grammarAccess.getDeviceTypeAccess().getCapabilityKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_6, grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalTargetEnvironmentParser.g:775:4: ( (lv_capability_7_0= ruleCapabilityProperty ) )+
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
                            // InternalTargetEnvironmentParser.g:776:5: (lv_capability_7_0= ruleCapabilityProperty )
                            {
                            // InternalTargetEnvironmentParser.g:776:5: (lv_capability_7_0= ruleCapabilityProperty )
                            // InternalTargetEnvironmentParser.g:777:6: lv_capability_7_0= ruleCapabilityProperty
                            {

                                                    newCompositeNode(grammarAccess.getDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_8);
                            lv_capability_7_0=ruleCapabilityProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getDeviceTypeRule());
                                                    }
                                                    add(
                                                        current,
                                                        "capability",
                                                        lv_capability_7_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.CapabilityProperty");
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

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_22);

                                    newLeafNode(this_DEDENT_8, grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:799:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CommunicationConnection) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:800:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getDeviceTypeAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_10, grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalTargetEnvironmentParser.g:808:4: ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==HyphenMinus) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:809:5: (lv_communicationConnection_11_0= ruleCommunicationConnection )
                            {
                            // InternalTargetEnvironmentParser.g:809:5: (lv_communicationConnection_11_0= ruleCommunicationConnection )
                            // InternalTargetEnvironmentParser.g:810:6: lv_communicationConnection_11_0= ruleCommunicationConnection
                            {

                                                    newCompositeNode(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionCommunicationConnectionParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_8);
                            lv_communicationConnection_11_0=ruleCommunicationConnection();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getDeviceTypeRule());
                                                    }
                                                    add(
                                                        current,
                                                        "communicationConnection",
                                                        lv_communicationConnection_11_0,
                                                        "de.fraunhofer.ipa.targetEnvironment.Device.CommunicationConnection");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_12, grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_13, grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_7());


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


    // $ANTLR start "entryRuleCapabilityProperty"
    // InternalTargetEnvironmentParser.g:840:1: entryRuleCapabilityProperty returns [EObject current=null] : iv_ruleCapabilityProperty= ruleCapabilityProperty EOF ;
    public final EObject entryRuleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:840:59: (iv_ruleCapabilityProperty= ruleCapabilityProperty EOF )
            // InternalTargetEnvironmentParser.g:841:2: iv_ruleCapabilityProperty= ruleCapabilityProperty EOF
            {
             newCompositeNode(grammarAccess.getCapabilityPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleCapabilityProperty=ruleCapabilityProperty();

            state._fsp--;

             current =iv_ruleCapabilityProperty;
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
    // $ANTLR end "entryRuleCapabilityProperty"


    // $ANTLR start "ruleCapabilityProperty"
    // InternalTargetEnvironmentParser.g:847:1: ruleCapabilityProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_7_0 = null;

        EObject lv_value_9_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:853:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:854:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:854:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:855:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertyAccess().getNameKeyword_1());

            // InternalTargetEnvironmentParser.g:866:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:867:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:867:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:868:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_23);

                        newLeafNode(this_INDENT_3, grammarAccess.getCapabilityPropertyAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertyAccess().getTypeKeyword_4());

            // InternalTargetEnvironmentParser.g:893:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:894:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:894:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:895:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getCapabilityPropertyRule());
                                }


                                newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeCrossReference_5_0());

            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_6=(Token)match(input,Kind,FOLLOW_25);

                        newLeafNode(otherlv_6, grammarAccess.getCapabilityPropertyAccess().getKindKeyword_6());

            // InternalTargetEnvironmentParser.g:913:3: ( (lv_kind_7_0= ruleCapabilityKind ) )
            // InternalTargetEnvironmentParser.g:914:4: (lv_kind_7_0= ruleCapabilityKind )
            {
            // InternalTargetEnvironmentParser.g:914:4: (lv_kind_7_0= ruleCapabilityKind )
            // InternalTargetEnvironmentParser.g:915:5: lv_kind_7_0= ruleCapabilityKind
            {

                                newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_7_0());

            pushFollow(FOLLOW_26);
            lv_kind_7_0=ruleCapabilityKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_7_0,
                                    "de.fraunhofer.ipa.targetEnvironment.Device.CapabilityKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:932:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Value) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:933:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_19);

                                    newLeafNode(otherlv_8, grammarAccess.getCapabilityPropertyAccess().getValueKeyword_8_0());

                    // InternalTargetEnvironmentParser.g:937:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:938:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:938:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:939:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_10);
                    lv_value_9_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_9_0,
                                                "de.fraunhofer.ipa.targetEnvironment.Base.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_10, grammarAccess.getCapabilityPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleCapabilityProperty"


    // $ANTLR start "entryRuleAttributeKind"
    // InternalTargetEnvironmentParser.g:965:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:965:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalTargetEnvironmentParser.g:966:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalTargetEnvironmentParser.g:972:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:978:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalTargetEnvironmentParser.g:979:2: ( () otherlv_1= AttributeKind )
            {
            // InternalTargetEnvironmentParser.g:979:2: ( () otherlv_1= AttributeKind )
            // InternalTargetEnvironmentParser.g:980:3: () otherlv_1= AttributeKind
            {
            // InternalTargetEnvironmentParser.g:980:3: ()
            // InternalTargetEnvironmentParser.g:981:4:
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
    // InternalTargetEnvironmentParser.g:995:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:995:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalTargetEnvironmentParser.g:996:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalTargetEnvironmentParser.g:1002:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1008:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalTargetEnvironmentParser.g:1009:2: ( () otherlv_1= MaximumKind )
            {
            // InternalTargetEnvironmentParser.g:1009:2: ( () otherlv_1= MaximumKind )
            // InternalTargetEnvironmentParser.g:1010:3: () otherlv_1= MaximumKind
            {
            // InternalTargetEnvironmentParser.g:1010:3: ()
            // InternalTargetEnvironmentParser.g:1011:4:
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
    // InternalTargetEnvironmentParser.g:1025:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:1025:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalTargetEnvironmentParser.g:1026:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalTargetEnvironmentParser.g:1032:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1038:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalTargetEnvironmentParser.g:1039:2: ( () otherlv_1= MinimumKind )
            {
            // InternalTargetEnvironmentParser.g:1039:2: ( () otherlv_1= MinimumKind )
            // InternalTargetEnvironmentParser.g:1040:3: () otherlv_1= MinimumKind
            {
            // InternalTargetEnvironmentParser.g:1040:3: ()
            // InternalTargetEnvironmentParser.g:1041:4:
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
    // InternalTargetEnvironmentParser.g:1055:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalTargetEnvironmentParser.g:1055:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalTargetEnvironmentParser.g:1056:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalTargetEnvironmentParser.g:1062:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1068:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalTargetEnvironmentParser.g:1069:2: ( () otherlv_1= SelectionKind )
            {
            // InternalTargetEnvironmentParser.g:1069:2: ( () otherlv_1= SelectionKind )
            // InternalTargetEnvironmentParser.g:1070:3: () otherlv_1= SelectionKind
            {
            // InternalTargetEnvironmentParser.g:1070:3: ()
            // InternalTargetEnvironmentParser.g:1071:4:
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


    // $ANTLR start "entryRuleConnectionProperty"
    // InternalTargetEnvironmentParser.g:1085:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1085:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:1086:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:1092:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
    public final EObject ruleConnectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_value_6_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1098:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:1099:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:1099:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:1100:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalTargetEnvironmentParser.g:1100:3: ()
            // InternalTargetEnvironmentParser.g:1101:4:
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

            // InternalTargetEnvironmentParser.g:1118:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1119:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1119:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1120:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getConnectionPropertyAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_17);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getConnectionPropertyRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1137:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1138:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_18);

                                    newLeafNode(this_INDENT_4, grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0());

                    otherlv_5=(Token)match(input,Value,FOLLOW_19);

                                    newLeafNode(otherlv_5, grammarAccess.getConnectionPropertyAccess().getValueKeyword_4_1());

                    // InternalTargetEnvironmentParser.g:1146:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1147:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1147:5: (lv_value_6_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1148:6: lv_value_6_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());

                    pushFollow(FOLLOW_10);
                    lv_value_6_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getConnectionPropertyRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_6_0,
                                                "de.fraunhofer.ipa.targetEnvironment.Base.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_7, grammarAccess.getConnectionPropertyAccess().getDEDENTTerminalRuleCall_4_3());


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
    // $ANTLR end "ruleConnectionProperty"


    // $ANTLR start "entryRuleCommunicationConnection"
    // InternalTargetEnvironmentParser.g:1174:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:1174:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:1175:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
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
    // InternalTargetEnvironmentParser.g:1181:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalTargetEnvironmentParser.g:1187:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1188:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1188:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1189:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1189:3: ()
            // InternalTargetEnvironmentParser.g:1190:4:
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

            // InternalTargetEnvironmentParser.g:1207:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1208:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1208:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1209:5: lv_name_3_0= ruleEString
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
                                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_23);

                        newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_5);

                        newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());

            // InternalTargetEnvironmentParser.g:1234:3: ( (lv_type_6_0= ruleCommunicationType ) )
            // InternalTargetEnvironmentParser.g:1235:4: (lv_type_6_0= ruleCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:1235:4: (lv_type_6_0= ruleCommunicationType )
            // InternalTargetEnvironmentParser.g:1236:5: lv_type_6_0= ruleCommunicationType
            {

                                newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_27);
            lv_type_6_0=ruleCommunicationType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getCommunicationConnectionRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_6_0,
                                    "de.fraunhofer.ipa.targetEnvironment.Device.CommunicationType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalTargetEnvironmentParser.g:1253:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Properties) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1254:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalTargetEnvironmentParser.g:1262:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==HyphenMinus) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                        case 1 :
                            // InternalTargetEnvironmentParser.g:1263:5: (lv_properties_9_0= ruleConnectionProperty )
                            {
                            // InternalTargetEnvironmentParser.g:1263:5: (lv_properties_9_0= ruleConnectionProperty )
                            // InternalTargetEnvironmentParser.g:1264:6: lv_properties_9_0= ruleConnectionProperty
                            {

                                                    newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPropertiesConnectionPropertyParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_8);
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
                            if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_10);

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


    // $ANTLR start "entryRuleCommunicationType"
    // InternalTargetEnvironmentParser.g:1294:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:1294:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:1295:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:1301:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1307:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:1308:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:1308:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:1309:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:1309:3: ()
            // InternalTargetEnvironmentParser.g:1310:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:1316:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1317:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1317:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1318:5: lv_name_1_0= ruleEString
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
                                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
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


    // $ANTLR start "entryRuleCapabilityType"
    // InternalTargetEnvironmentParser.g:1339:1: entryRuleCapabilityType returns [EObject current=null] : iv_ruleCapabilityType= ruleCapabilityType EOF ;
    public final EObject entryRuleCapabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityType = null;


        try {
            // InternalTargetEnvironmentParser.g:1339:55: (iv_ruleCapabilityType= ruleCapabilityType EOF )
            // InternalTargetEnvironmentParser.g:1340:2: iv_ruleCapabilityType= ruleCapabilityType EOF
            {
             newCompositeNode(grammarAccess.getCapabilityTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleCapabilityType=ruleCapabilityType();

            state._fsp--;

             current =iv_ruleCapabilityType;
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
    // $ANTLR end "entryRuleCapabilityType"


    // $ANTLR start "ruleCapabilityType"
    // InternalTargetEnvironmentParser.g:1346:1: ruleCapabilityType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCapabilityType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1352:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:1353:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:1353:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:1354:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:1354:3: ()
            // InternalTargetEnvironmentParser.g:1355:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCapabilityTypeAccess().getCapabilityTypeAction_0(),
                                current);


            }

            // InternalTargetEnvironmentParser.g:1361:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1362:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1362:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1363:5: lv_name_1_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getCapabilityTypeAccess().getNameEStringParserRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getCapabilityTypeRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_1_0,
                                    "de.fraunhofer.ipa.targetEnvironment.Base.EString");
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
    // $ANTLR end "ruleCapabilityType"


    // $ANTLR start "entryRulePropertyValue"
    // InternalTargetEnvironmentParser.g:1384:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalTargetEnvironmentParser.g:1384:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalTargetEnvironmentParser.g:1385:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalTargetEnvironmentParser.g:1391:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1397:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString ) )
            // InternalTargetEnvironmentParser.g:1398:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString )
            {
            // InternalTargetEnvironmentParser.g:1398:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt20=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1399:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalTargetEnvironmentParser.g:1408:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalTargetEnvironmentParser.g:1417:3: this_PropertyValueString_2= rulePropertyValueString
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getPropertyValueStringParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_PropertyValueString_2=rulePropertyValueString();

                    state._fsp--;


                                current = this_PropertyValueString_2;
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
    // InternalTargetEnvironmentParser.g:1429:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalTargetEnvironmentParser.g:1429:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalTargetEnvironmentParser.g:1430:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalTargetEnvironmentParser.g:1436:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1442:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalTargetEnvironmentParser.g:1443:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalTargetEnvironmentParser.g:1443:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalTargetEnvironmentParser.g:1444:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalTargetEnvironmentParser.g:1444:3: (lv_value_0_0= ruleInteger0 )
            // InternalTargetEnvironmentParser.g:1445:4: lv_value_0_0= ruleInteger0
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
                                "de.fraunhofer.ipa.targetEnvironment.Base.Integer0");
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
    // InternalTargetEnvironmentParser.g:1465:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalTargetEnvironmentParser.g:1465:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalTargetEnvironmentParser.g:1466:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalTargetEnvironmentParser.g:1472:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1478:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalTargetEnvironmentParser.g:1479:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalTargetEnvironmentParser.g:1479:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalTargetEnvironmentParser.g:1480:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalTargetEnvironmentParser.g:1480:3: (lv_value_0_0= ruleDouble0 )
            // InternalTargetEnvironmentParser.g:1481:4: lv_value_0_0= ruleDouble0
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
                                "de.fraunhofer.ipa.targetEnvironment.Base.Double0");
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
    // InternalTargetEnvironmentParser.g:1501:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalTargetEnvironmentParser.g:1501:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalTargetEnvironmentParser.g:1502:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalTargetEnvironmentParser.g:1508:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1514:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:1515:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:1515:2: ( (lv_value_0_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1516:3: (lv_value_0_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1516:3: (lv_value_0_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1517:4: lv_value_0_0= ruleEString
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
                                "de.fraunhofer.ipa.targetEnvironment.Base.EString");
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


    // $ANTLR start "entryRuleDouble0"
    // InternalTargetEnvironmentParser.g:1537:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalTargetEnvironmentParser.g:1537:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalTargetEnvironmentParser.g:1538:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalTargetEnvironmentParser.g:1544:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1550:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalTargetEnvironmentParser.g:1551:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalTargetEnvironmentParser.g:1561:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalTargetEnvironmentParser.g:1561:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalTargetEnvironmentParser.g:1562:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalTargetEnvironmentParser.g:1568:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1574:2: (this_DECINT_0= RULE_DECINT )
            // InternalTargetEnvironmentParser.g:1575:2: this_DECINT_0= RULE_DECINT
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
    // InternalTargetEnvironmentParser.g:1585:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTargetEnvironmentParser.g:1585:47: (iv_ruleEString= ruleEString EOF )
            // InternalTargetEnvironmentParser.g:1586:2: iv_ruleEString= ruleEString EOF
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
    // InternalTargetEnvironmentParser.g:1592:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1598:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTargetEnvironmentParser.g:1599:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTargetEnvironmentParser.g:1599:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1600:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:1608:3: this_ID_1= RULE_ID
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
    // InternalTargetEnvironmentParser.g:1619:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:1621:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalTargetEnvironmentParser.g:1622:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalTargetEnvironmentParser.g:1631:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:1638:2: (kw= HyphenMinus )
            // InternalTargetEnvironmentParser.g:1639:2: kw= HyphenMinus
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000480L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000050060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000040010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000080000L});

}
