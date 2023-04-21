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
import de.fraunhofer.ipa.targetEnvironment.services.DeviceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "AttributeKind", "SelectionKind", "DeviceType", "MaximumKind", "MinimumKind", "Capability", "Properties", "Value", "Kind", "Name", "Type", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=22;
    public static final int RULE_DATE_TIME=27;
    public static final int RULE_BOOLEAN=19;
    public static final int RULE_STRING=33;
    public static final int AttributeKind=5;
    public static final int RULE_YEAR=24;
    public static final int Properties=11;
    public static final int Name=14;
    public static final int RULE_MIN_SEC=26;
    public static final int RULE_SL_COMMENT=28;
    public static final int CommunicationConnection=4;
    public static final int HyphenMinus=16;
    public static final int RULE_DOUBLE=21;
    public static final int Kind=13;
    public static final int RULE_DECINT=20;
    public static final int MinimumKind=9;
    public static final int EOF=-1;
    public static final int RULE_INDENT=29;
    public static final int RULE_DEDENT=30;
    public static final int RULE_HOUR=25;
    public static final int Capability=10;
    public static final int RULE_ID=31;
    public static final int RULE_WS=35;
    public static final int RULE_DIGIT=17;
    public static final int MaximumKind=8;
    public static final int RULE_ANY_OTHER=36;
    public static final int SelectionKind=6;
    public static final int DeviceType=7;
    public static final int Type=15;
    public static final int RULE_INT=32;
    public static final int Value=12;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_MONTH=23;
    public static final int RULE_BINARY=18;

    // delegates
    // delegators


        public InternalDeviceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDeviceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalDeviceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDeviceParser.g"; }



        private DeviceGrammarAccess grammarAccess;

        public InternalDeviceParser(TokenStream input, DeviceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
            return "DeviceSet";
        }

        @Override
        protected DeviceGrammarAccess getGrammarAccess() {
            return grammarAccess;
        }




    // $ANTLR start "entryRuleDeviceSet"
    // InternalDeviceParser.g:57:1: entryRuleDeviceSet returns [EObject current=null] : iv_ruleDeviceSet= ruleDeviceSet EOF ;
    public final EObject entryRuleDeviceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceSet = null;


        try {
            // InternalDeviceParser.g:57:50: (iv_ruleDeviceSet= ruleDeviceSet EOF )
            // InternalDeviceParser.g:58:2: iv_ruleDeviceSet= ruleDeviceSet EOF
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
    // InternalDeviceParser.g:64:1: ruleDeviceSet returns [EObject current=null] : ( (lv_device_0_0= ruleDeviceType ) )* ;
    public final EObject ruleDeviceSet() throws RecognitionException {
        EObject current = null;

        EObject lv_device_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:70:2: ( ( (lv_device_0_0= ruleDeviceType ) )* )
            // InternalDeviceParser.g:71:2: ( (lv_device_0_0= ruleDeviceType ) )*
            {
            // InternalDeviceParser.g:71:2: ( (lv_device_0_0= ruleDeviceType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DeviceType) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // InternalDeviceParser.g:72:3: (lv_device_0_0= ruleDeviceType )
                    {
                    // InternalDeviceParser.g:72:3: (lv_device_0_0= ruleDeviceType )
                    // InternalDeviceParser.g:73:4: lv_device_0_0= ruleDeviceType
                    {

                                    newCompositeNode(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_0());

                    pushFollow(FOLLOW_3);
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
                    break loop1;
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
    // InternalDeviceParser.g:93:1: entryRuleCapabilityKind returns [EObject current=null] : iv_ruleCapabilityKind= ruleCapabilityKind EOF ;
    public final EObject entryRuleCapabilityKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityKind = null;


        try {
            // InternalDeviceParser.g:93:55: (iv_ruleCapabilityKind= ruleCapabilityKind EOF )
            // InternalDeviceParser.g:94:2: iv_ruleCapabilityKind= ruleCapabilityKind EOF
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
    // InternalDeviceParser.g:100:1: ruleCapabilityKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind ) ;
    public final EObject ruleCapabilityKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_SelectionKind_3 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:106:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind ) )
            // InternalDeviceParser.g:107:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind )
            {
            // InternalDeviceParser.g:107:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind )
            int alt2=4;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt2=1;
                }
                break;
            case MaximumKind:
                {
                alt2=2;
                }
                break;
            case MinimumKind:
                {
                alt2=3;
                }
                break;
            case SelectionKind:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDeviceParser.g:108:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalDeviceParser.g:117:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalDeviceParser.g:126:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalDeviceParser.g:135:3: this_SelectionKind_3= ruleSelectionKind
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
    // InternalDeviceParser.g:147:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalDeviceParser.g:147:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalDeviceParser.g:148:2: iv_ruleDeviceType= ruleDeviceType EOF
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
    // InternalDeviceParser.g:154:1: ruleDeviceType returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:160:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalDeviceParser.g:161:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalDeviceParser.g:161:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalDeviceParser.g:162:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalDeviceParser.g:162:3: ()
            // InternalDeviceParser.g:163:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getDeviceTypeAccess().getDeviceTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,DeviceType,FOLLOW_4);

                        newLeafNode(otherlv_1, grammarAccess.getDeviceTypeAccess().getDeviceTypeKeyword_1());

            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_5);

                        newLeafNode(this_INDENT_2, grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_2());

            otherlv_3=(Token)match(input,Name,FOLLOW_6);

                        newLeafNode(otherlv_3, grammarAccess.getDeviceTypeAccess().getNameKeyword_3());

            // InternalDeviceParser.g:181:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDeviceParser.g:182:4: (lv_name_4_0= ruleEString )
            {
            // InternalDeviceParser.g:182:4: (lv_name_4_0= ruleEString )
            // InternalDeviceParser.g:183:5: lv_name_4_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceTypeAccess().getNameEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_7);
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

            // InternalDeviceParser.g:200:3: (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Capability) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeviceParser.g:201:4: otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,Capability,FOLLOW_4);

                                    newLeafNode(otherlv_5, grammarAccess.getDeviceTypeAccess().getCapabilityKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_6, grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalDeviceParser.g:209:4: ( (lv_capability_7_0= ruleCapabilityProperty ) )+
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
                            // InternalDeviceParser.g:210:5: (lv_capability_7_0= ruleCapabilityProperty )
                            {
                            // InternalDeviceParser.g:210:5: (lv_capability_7_0= ruleCapabilityProperty )
                            // InternalDeviceParser.g:211:6: lv_capability_7_0= ruleCapabilityProperty
                            {

                                                    newCompositeNode(grammarAccess.getDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_9);
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
                            if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_8, grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalDeviceParser.g:233:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CommunicationConnection) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:234:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_4);

                                    newLeafNode(otherlv_9, grammarAccess.getDeviceTypeAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_10, grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:242:4: ( (lv_communicationConnection_11_0= ruleCommunicationConnection ) )+
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
                            // InternalDeviceParser.g:243:5: (lv_communicationConnection_11_0= ruleCommunicationConnection )
                            {
                            // InternalDeviceParser.g:243:5: (lv_communicationConnection_11_0= ruleCommunicationConnection )
                            // InternalDeviceParser.g:244:6: lv_communicationConnection_11_0= ruleCommunicationConnection
                            {

                                                    newCompositeNode(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionCommunicationConnectionParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_9);
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
                            if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_11);

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
    // InternalDeviceParser.g:274:1: entryRuleCapabilityProperty returns [EObject current=null] : iv_ruleCapabilityProperty= ruleCapabilityProperty EOF ;
    public final EObject entryRuleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperty = null;


        try {
            // InternalDeviceParser.g:274:59: (iv_ruleCapabilityProperty= ruleCapabilityProperty EOF )
            // InternalDeviceParser.g:275:2: iv_ruleCapabilityProperty= ruleCapabilityProperty EOF
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
    // InternalDeviceParser.g:281:1: ruleCapabilityProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:287:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalDeviceParser.g:288:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalDeviceParser.g:288:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            // InternalDeviceParser.g:289:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_6);

                        newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertyAccess().getNameKeyword_1());

            // InternalDeviceParser.g:300:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:301:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:301:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:302:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_4);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_12);

                        newLeafNode(this_INDENT_3, grammarAccess.getCapabilityPropertyAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_6);

                        newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertyAccess().getTypeKeyword_4());

            // InternalDeviceParser.g:327:3: ( ( ruleEString ) )
            // InternalDeviceParser.g:328:4: ( ruleEString )
            {
            // InternalDeviceParser.g:328:4: ( ruleEString )
            // InternalDeviceParser.g:329:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getCapabilityPropertyRule());
                                }


                                newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeCrossReference_5_0());

            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_6=(Token)match(input,Kind,FOLLOW_14);

                        newLeafNode(otherlv_6, grammarAccess.getCapabilityPropertyAccess().getKindKeyword_6());

            // InternalDeviceParser.g:347:3: ( (lv_kind_7_0= ruleCapabilityKind ) )
            // InternalDeviceParser.g:348:4: (lv_kind_7_0= ruleCapabilityKind )
            {
            // InternalDeviceParser.g:348:4: (lv_kind_7_0= ruleCapabilityKind )
            // InternalDeviceParser.g:349:5: lv_kind_7_0= ruleCapabilityKind
            {

                                newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_7_0());

            pushFollow(FOLLOW_15);
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

            // InternalDeviceParser.g:366:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Value) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceParser.g:367:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_16);

                                    newLeafNode(otherlv_8, grammarAccess.getCapabilityPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:371:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:372:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:372:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:373:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
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
    // InternalDeviceParser.g:399:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalDeviceParser.g:399:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalDeviceParser.g:400:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalDeviceParser.g:406:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:412:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalDeviceParser.g:413:2: ( () otherlv_1= AttributeKind )
            {
            // InternalDeviceParser.g:413:2: ( () otherlv_1= AttributeKind )
            // InternalDeviceParser.g:414:3: () otherlv_1= AttributeKind
            {
            // InternalDeviceParser.g:414:3: ()
            // InternalDeviceParser.g:415:4:
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
    // InternalDeviceParser.g:429:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalDeviceParser.g:429:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalDeviceParser.g:430:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalDeviceParser.g:436:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:442:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalDeviceParser.g:443:2: ( () otherlv_1= MaximumKind )
            {
            // InternalDeviceParser.g:443:2: ( () otherlv_1= MaximumKind )
            // InternalDeviceParser.g:444:3: () otherlv_1= MaximumKind
            {
            // InternalDeviceParser.g:444:3: ()
            // InternalDeviceParser.g:445:4:
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
    // InternalDeviceParser.g:459:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalDeviceParser.g:459:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalDeviceParser.g:460:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalDeviceParser.g:466:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:472:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalDeviceParser.g:473:2: ( () otherlv_1= MinimumKind )
            {
            // InternalDeviceParser.g:473:2: ( () otherlv_1= MinimumKind )
            // InternalDeviceParser.g:474:3: () otherlv_1= MinimumKind
            {
            // InternalDeviceParser.g:474:3: ()
            // InternalDeviceParser.g:475:4:
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
    // InternalDeviceParser.g:489:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalDeviceParser.g:489:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalDeviceParser.g:490:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalDeviceParser.g:496:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:502:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalDeviceParser.g:503:2: ( () otherlv_1= SelectionKind )
            {
            // InternalDeviceParser.g:503:2: ( () otherlv_1= SelectionKind )
            // InternalDeviceParser.g:504:3: () otherlv_1= SelectionKind
            {
            // InternalDeviceParser.g:504:3: ()
            // InternalDeviceParser.g:505:4:
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
    // InternalDeviceParser.g:519:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalDeviceParser.g:519:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalDeviceParser.g:520:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
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
    // InternalDeviceParser.g:526:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:532:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:533:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:533:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalDeviceParser.g:534:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalDeviceParser.g:534:3: ()
            // InternalDeviceParser.g:535:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getConnectionPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_6);

                        newLeafNode(otherlv_2, grammarAccess.getConnectionPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:552:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:553:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:553:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:554:5: lv_name_3_0= ruleEString
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

            // InternalDeviceParser.g:571:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeviceParser.g:572:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_18);

                                    newLeafNode(this_INDENT_4, grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0());

                    otherlv_5=(Token)match(input,Value,FOLLOW_16);

                                    newLeafNode(otherlv_5, grammarAccess.getConnectionPropertyAccess().getValueKeyword_4_1());

                    // InternalDeviceParser.g:580:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:581:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:581:5: (lv_value_6_0= rulePropertyValue )
                    // InternalDeviceParser.g:582:6: lv_value_6_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());

                    pushFollow(FOLLOW_11);
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
    // InternalDeviceParser.g:608:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalDeviceParser.g:608:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:609:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
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
    // InternalDeviceParser.g:615:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:621:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:622:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:622:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:623:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:623:3: ()
            // InternalDeviceParser.g:624:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_6);

                        newLeafNode(otherlv_2, grammarAccess.getCommunicationConnectionAccess().getNameKeyword_2());

            // InternalDeviceParser.g:641:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:642:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:642:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:643:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_4);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_12);

                        newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_6);

                        newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:668:3: ( (lv_type_6_0= ruleCommunicationType ) )
            // InternalDeviceParser.g:669:4: (lv_type_6_0= ruleCommunicationType )
            {
            // InternalDeviceParser.g:669:4: (lv_type_6_0= ruleCommunicationType )
            // InternalDeviceParser.g:670:5: lv_type_6_0= ruleCommunicationType
            {

                                newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_19);
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

            // InternalDeviceParser.g:687:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Properties) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceParser.g:688:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_4);

                                    newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_8);

                                    newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:696:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
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
                            // InternalDeviceParser.g:697:5: (lv_properties_9_0= ruleConnectionProperty )
                            {
                            // InternalDeviceParser.g:697:5: (lv_properties_9_0= ruleConnectionProperty )
                            // InternalDeviceParser.g:698:6: lv_properties_9_0= ruleConnectionProperty
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
                            if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
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


    // $ANTLR start "entryRuleCommunicationType"
    // InternalDeviceParser.g:728:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalDeviceParser.g:728:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalDeviceParser.g:729:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalDeviceParser.g:735:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:741:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:742:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:742:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDeviceParser.g:743:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDeviceParser.g:743:3: ()
            // InternalDeviceParser.g:744:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalDeviceParser.g:750:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeviceParser.g:751:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeviceParser.g:751:4: (lv_name_1_0= ruleEString )
            // InternalDeviceParser.g:752:5: lv_name_1_0= ruleEString
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
    // InternalDeviceParser.g:773:1: entryRuleCapabilityType returns [EObject current=null] : iv_ruleCapabilityType= ruleCapabilityType EOF ;
    public final EObject entryRuleCapabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityType = null;


        try {
            // InternalDeviceParser.g:773:55: (iv_ruleCapabilityType= ruleCapabilityType EOF )
            // InternalDeviceParser.g:774:2: iv_ruleCapabilityType= ruleCapabilityType EOF
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
    // InternalDeviceParser.g:780:1: ruleCapabilityType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCapabilityType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:786:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:787:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:787:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDeviceParser.g:788:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDeviceParser.g:788:3: ()
            // InternalDeviceParser.g:789:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCapabilityTypeAccess().getCapabilityTypeAction_0(),
                                current);


            }

            // InternalDeviceParser.g:795:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeviceParser.g:796:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeviceParser.g:796:4: (lv_name_1_0= ruleEString )
            // InternalDeviceParser.g:797:5: lv_name_1_0= ruleEString
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
    // InternalDeviceParser.g:818:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalDeviceParser.g:818:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalDeviceParser.g:819:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalDeviceParser.g:825:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:831:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString ) )
            // InternalDeviceParser.g:832:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString )
            {
            // InternalDeviceParser.g:832:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt11=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDeviceParser.g:833:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalDeviceParser.g:842:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalDeviceParser.g:851:3: this_PropertyValueString_2= rulePropertyValueString
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
    // InternalDeviceParser.g:863:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalDeviceParser.g:863:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalDeviceParser.g:864:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalDeviceParser.g:870:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:876:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalDeviceParser.g:877:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalDeviceParser.g:877:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalDeviceParser.g:878:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalDeviceParser.g:878:3: (lv_value_0_0= ruleInteger0 )
            // InternalDeviceParser.g:879:4: lv_value_0_0= ruleInteger0
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
    // InternalDeviceParser.g:899:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalDeviceParser.g:899:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:900:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalDeviceParser.g:906:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:912:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalDeviceParser.g:913:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalDeviceParser.g:913:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalDeviceParser.g:914:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalDeviceParser.g:914:3: (lv_value_0_0= ruleDouble0 )
            // InternalDeviceParser.g:915:4: lv_value_0_0= ruleDouble0
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
    // InternalDeviceParser.g:935:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalDeviceParser.g:935:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalDeviceParser.g:936:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalDeviceParser.g:942:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:948:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDeviceParser.g:949:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDeviceParser.g:949:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDeviceParser.g:950:3: (lv_value_0_0= ruleEString )
            {
            // InternalDeviceParser.g:950:3: (lv_value_0_0= ruleEString )
            // InternalDeviceParser.g:951:4: lv_value_0_0= ruleEString
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
    // InternalDeviceParser.g:971:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalDeviceParser.g:971:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalDeviceParser.g:972:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalDeviceParser.g:978:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalDeviceParser.g:984:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalDeviceParser.g:985:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalDeviceParser.g:995:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalDeviceParser.g:995:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalDeviceParser.g:996:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalDeviceParser.g:1002:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalDeviceParser.g:1008:2: (this_DECINT_0= RULE_DECINT )
            // InternalDeviceParser.g:1009:2: this_DECINT_0= RULE_DECINT
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
    // InternalDeviceParser.g:1019:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDeviceParser.g:1019:47: (iv_ruleEString= ruleEString EOF )
            // InternalDeviceParser.g:1020:2: iv_ruleEString= ruleEString EOF
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
    // InternalDeviceParser.g:1026:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:1032:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDeviceParser.g:1033:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDeviceParser.g:1033:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceParser.g:1034:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1042:3: this_ID_1= RULE_ID
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
    // InternalDeviceParser.g:1053:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:1055:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalDeviceParser.g:1056:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalDeviceParser.g:1065:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:1072:2: (kw= HyphenMinus )
            // InternalDeviceParser.g:1073:2: kw= HyphenMinus
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000410L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000360L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000280300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000800L});

}
