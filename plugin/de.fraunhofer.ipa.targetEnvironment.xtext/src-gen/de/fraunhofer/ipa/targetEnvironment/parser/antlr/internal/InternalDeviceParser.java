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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "ComputationDeviceType", "ProcessorArchitecture", "DeviceProperty", "AttributeKind", "SelectionKind", "Description", "DeviceType", "MaximumKind", "MinimumKind", "Properties", "RangeKind", "Interface", "Ethernet", "Address", "X86_64", "Value", "Arm64", "Linux", "MacOS", "Kind", "Name", "Type", "Wlan", "HyphenMinusHyphenMinusHyphenMinus", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=35;
    public static final int Address=18;
    public static final int RULE_DATE_TIME=40;
    public static final int RULE_BOOLEAN=32;
    public static final int AttributeKind=8;
    public static final int RULE_YEAR=37;
    public static final int Name=25;
    public static final int RULE_MIN_SEC=39;
    public static final int Kind=24;
    public static final int X86_64=19;
    public static final int RULE_DEDENT=43;
    public static final int RULE_ID=44;
    public static final int RULE_DIGIT=30;
    public static final int HyphenMinusHyphenMinusHyphenMinus=28;
    public static final int SelectionKind=9;
    public static final int DeviceType=11;
    public static final int DeviceProperty=7;
    public static final int Arm64=21;
    public static final int Linux=22;
    public static final int RULE_INT=45;
    public static final int Ethernet=17;
    public static final int Value=20;
    public static final int RULE_ML_COMMENT=47;
    public static final int MacOS=23;
    public static final int Description=10;
    public static final int ProcessorArchitecture=6;
    public static final int RULE_STRING=46;
    public static final int Wlan=27;
    public static final int Properties=14;
    public static final int RULE_SL_COMMENT=41;
    public static final int CommunicationConnection=4;
    public static final int HyphenMinus=29;
    public static final int RULE_DOUBLE=34;
    public static final int RULE_DECINT=33;
    public static final int MinimumKind=13;
    public static final int EOF=-1;
    public static final int RULE_INDENT=42;
    public static final int RULE_HOUR=38;
    public static final int RULE_WS=48;
    public static final int MaximumKind=12;
    public static final int RULE_ANY_OTHER=49;
    public static final int ComputationDeviceType=5;
    public static final int RangeKind=15;
    public static final int Type=26;
    public static final int RULE_MONTH=36;
    public static final int RULE_BINARY=31;
    public static final int Interface=16;

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
    // InternalDeviceParser.g:64:1: ruleDeviceSet returns [EObject current=null] : ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* ) ;
    public final EObject ruleDeviceSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_device_0_0 = null;

        EObject lv_device_2_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:70:2: ( ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* ) )
            // InternalDeviceParser.g:71:2: ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* )
            {
            // InternalDeviceParser.g:71:2: ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* )
            // InternalDeviceParser.g:72:3: ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )*
            {
            // InternalDeviceParser.g:72:3: ( (lv_device_0_0= ruleDeviceType ) )
            // InternalDeviceParser.g:73:4: (lv_device_0_0= ruleDeviceType )
            {
            // InternalDeviceParser.g:73:4: (lv_device_0_0= ruleDeviceType )
            // InternalDeviceParser.g:74:5: lv_device_0_0= ruleDeviceType
            {

                                newCompositeNode(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_0_0());

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

            // InternalDeviceParser.g:91:3: (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==HyphenMinusHyphenMinusHyphenMinus) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // InternalDeviceParser.g:92:4: otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) )
                    {
                    otherlv_1=(Token)match(input,HyphenMinusHyphenMinusHyphenMinus,FOLLOW_4);

                                    newLeafNode(otherlv_1, grammarAccess.getDeviceSetAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_1_0());

                    // InternalDeviceParser.g:96:4: ( (lv_device_2_0= ruleDeviceType ) )
                    // InternalDeviceParser.g:97:5: (lv_device_2_0= ruleDeviceType )
                    {
                    // InternalDeviceParser.g:97:5: (lv_device_2_0= ruleDeviceType )
                    // InternalDeviceParser.g:98:6: lv_device_2_0= ruleDeviceType
                    {

                                            newCompositeNode(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_1_1_0());

                    pushFollow(FOLLOW_3);
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
                    break loop1;
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
    // InternalDeviceParser.g:120:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalDeviceParser.g:120:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalDeviceParser.g:121:2: iv_ruleDeviceType= ruleDeviceType EOF
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
    // InternalDeviceParser.g:127:1: ruleDeviceType returns [EObject current=null] : (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceType_Impl_0 = null;

        EObject this_ComputationDeviceType_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:133:2: ( (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) )
            // InternalDeviceParser.g:134:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            {
            // InternalDeviceParser.g:134:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DeviceType) ) {
                alt2=1;
            }
            else if ( (LA2_0==ComputationDeviceType) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDeviceParser.g:135:3: this_DeviceType_Impl_0= ruleDeviceType_Impl
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
                    // InternalDeviceParser.g:144:3: this_ComputationDeviceType_1= ruleComputationDeviceType
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
    // InternalDeviceParser.g:156:1: entryRuleAbstractCommunicationConnection returns [EObject current=null] : iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF ;
    public final EObject entryRuleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommunicationConnection = null;


        try {
            // InternalDeviceParser.g:156:72: (iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF )
            // InternalDeviceParser.g:157:2: iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF
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
    // InternalDeviceParser.g:163:1: ruleAbstractCommunicationConnection returns [EObject current=null] : (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) ;
    public final EObject ruleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationConnection_0 = null;

        EObject this_NetworkConnection_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:169:2: ( (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) )
            // InternalDeviceParser.g:170:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            {
            // InternalDeviceParser.g:170:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==HyphenMinus) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==Name) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==RULE_STRING) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==RULE_INDENT) ) {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5==Type) ) {
                                int LA3_6 = input.LA(6);

                                if ( (LA3_6==RULE_ID||LA3_6==RULE_STRING) ) {
                                    alt3=1;
                                }
                                else if ( (LA3_6==Ethernet||LA3_6==Wlan) ) {
                                    alt3=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_2==RULE_ID) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==RULE_INDENT) ) {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5==Type) ) {
                                int LA3_6 = input.LA(6);

                                if ( (LA3_6==RULE_ID||LA3_6==RULE_STRING) ) {
                                    alt3=1;
                                }
                                else if ( (LA3_6==Ethernet||LA3_6==Wlan) ) {
                                    alt3=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDeviceParser.g:171:3: this_CommunicationConnection_0= ruleCommunicationConnection
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
                    // InternalDeviceParser.g:180:3: this_NetworkConnection_1= ruleNetworkConnection
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
    // InternalDeviceParser.g:192:1: entryRuleAbstractNetworkProperty returns [EObject current=null] : iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF ;
    public final EObject entryRuleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetworkProperty = null;


        try {
            // InternalDeviceParser.g:192:64: (iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF )
            // InternalDeviceParser.g:193:2: iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF
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
    // InternalDeviceParser.g:199:1: ruleAbstractNetworkProperty returns [EObject current=null] : (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) ;
    public final EObject ruleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceNetworkProperty_0 = null;

        EObject this_AddressNetworkProperty_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:205:2: ( (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) )
            // InternalDeviceParser.g:206:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            {
            // InternalDeviceParser.g:206:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==HyphenMinus) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==Name) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==Address) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==Interface) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeviceParser.g:207:3: this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty
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
                    // InternalDeviceParser.g:216:3: this_AddressNetworkProperty_1= ruleAddressNetworkProperty
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
    // InternalDeviceParser.g:228:1: entryRuleInterfaceNetworkProperty returns [EObject current=null] : iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF ;
    public final EObject entryRuleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceNetworkProperty = null;


        try {
            // InternalDeviceParser.g:228:65: (iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF )
            // InternalDeviceParser.g:229:2: iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF
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
    // InternalDeviceParser.g:235:1: ruleInterfaceNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:241:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:242:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:242:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:243:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:243:3: ()
            // InternalDeviceParser.g:244:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_6);

                        newLeafNode(otherlv_2, grammarAccess.getInterfaceNetworkPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:261:3: ( (lv_name_3_0= Interface ) )
            // InternalDeviceParser.g:262:4: (lv_name_3_0= Interface )
            {
            // InternalDeviceParser.g:262:4: (lv_name_3_0= Interface )
            // InternalDeviceParser.g:263:5: lv_name_3_0= Interface
            {
            lv_name_3_0=(Token)match(input,Interface,FOLLOW_7);

                                newLeafNode(lv_name_3_0, grammarAccess.getInterfaceNetworkPropertyAccess().getNameInterfaceKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getInterfaceNetworkPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "interface");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_4, grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                        newLeafNode(otherlv_5, grammarAccess.getInterfaceNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:283:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:284:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:284:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:285:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:302:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Description) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeviceParser.g:303:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:307:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:308:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:308:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:309:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:327:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Value) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:328:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:332:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:333:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:333:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:334:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:360:1: entryRuleAddressNetworkProperty returns [EObject current=null] : iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF ;
    public final EObject entryRuleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressNetworkProperty = null;


        try {
            // InternalDeviceParser.g:360:63: (iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF )
            // InternalDeviceParser.g:361:2: iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF
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
    // InternalDeviceParser.g:367:1: ruleAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:373:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:374:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:374:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:375:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:375:3: ()
            // InternalDeviceParser.g:376:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_15);

                        newLeafNode(otherlv_2, grammarAccess.getAddressNetworkPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:393:3: ( (lv_name_3_0= Address ) )
            // InternalDeviceParser.g:394:4: (lv_name_3_0= Address )
            {
            // InternalDeviceParser.g:394:4: (lv_name_3_0= Address )
            // InternalDeviceParser.g:395:5: lv_name_3_0= Address
            {
            lv_name_3_0=(Token)match(input,Address,FOLLOW_7);

                                newLeafNode(lv_name_3_0, grammarAccess.getAddressNetworkPropertyAccess().getNameAddressKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getAddressNetworkPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "address");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_4, grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                        newLeafNode(otherlv_5, grammarAccess.getAddressNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:415:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:416:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:416:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:417:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:434:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Description) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceParser.g:435:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:439:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:440:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:440:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:441:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:459:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Value) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeviceParser.g:460:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:464:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:465:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:465:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:466:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:492:1: entryRuleDeviceType_Impl returns [EObject current=null] : iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF ;
    public final EObject entryRuleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType_Impl = null;


        try {
            // InternalDeviceParser.g:492:56: (iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF )
            // InternalDeviceParser.g:493:2: iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF
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
    // InternalDeviceParser.g:499:1: ruleDeviceType_Impl returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:505:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalDeviceParser.g:506:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalDeviceParser.g:506:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalDeviceParser.g:507:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalDeviceParser.g:507:3: ()
            // InternalDeviceParser.g:508:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,DeviceType,FOLLOW_7);

                        newLeafNode(otherlv_1, grammarAccess.getDeviceType_ImplAccess().getDeviceTypeKeyword_1());

            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_5);

                        newLeafNode(this_INDENT_2, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_2());

            otherlv_3=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_3, grammarAccess.getDeviceType_ImplAccess().getNameKeyword_3());

            // InternalDeviceParser.g:526:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDeviceParser.g:527:4: (lv_name_4_0= ruleEString )
            {
            // InternalDeviceParser.g:527:4: (lv_name_4_0= ruleEString )
            // InternalDeviceParser.g:528:5: lv_name_4_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getNameEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_16);
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

            // InternalDeviceParser.g:545:3: (otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DeviceProperty) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceParser.g:546:4: otherlv_5= DeviceProperty this_INDENT_6= RULE_INDENT ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,DeviceProperty,FOLLOW_7);

                                    newLeafNode(otherlv_5, grammarAccess.getDeviceType_ImplAccess().getDevicePropertyKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_6, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalDeviceParser.g:554:4: ( (lv_deviceProperty_7_0= ruleDeviceProperty ) )+
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
                            // InternalDeviceParser.g:555:5: (lv_deviceProperty_7_0= ruleDeviceProperty )
                            {
                            // InternalDeviceParser.g:555:5: (lv_deviceProperty_7_0= ruleDeviceProperty )
                            // InternalDeviceParser.g:556:6: lv_deviceProperty_7_0= ruleDeviceProperty
                            {

                                                    newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyDevicePropertyParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_19);

                                    newLeafNode(this_DEDENT_8, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalDeviceParser.g:578:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CommunicationConnection) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceParser.g:579:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_7);

                                    newLeafNode(otherlv_9, grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_10, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:587:4: ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+
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
                            // InternalDeviceParser.g:588:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                            {
                            // InternalDeviceParser.g:588:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                            // InternalDeviceParser.g:589:6: lv_communicationConnection_11_0= ruleAbstractCommunicationConnection
                            {

                                                    newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:619:1: entryRuleDeviceProperty returns [EObject current=null] : iv_ruleDeviceProperty= ruleDeviceProperty EOF ;
    public final EObject entryRuleDeviceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceProperty = null;


        try {
            // InternalDeviceParser.g:619:55: (iv_ruleDeviceProperty= ruleDeviceProperty EOF )
            // InternalDeviceParser.g:620:2: iv_ruleDeviceProperty= ruleDeviceProperty EOF
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
    // InternalDeviceParser.g:626:1: ruleDeviceProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:632:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) )
            // InternalDeviceParser.g:633:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            {
            // InternalDeviceParser.g:633:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            // InternalDeviceParser.g:634:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getDevicePropertyAccess().getNameKeyword_1());

            // InternalDeviceParser.g:645:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:646:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:646:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:647:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDevicePropertyAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_3, grammarAccess.getDevicePropertyAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_20);

                        newLeafNode(otherlv_4, grammarAccess.getDevicePropertyAccess().getKindKeyword_4());

            // InternalDeviceParser.g:672:3: ( (lv_kind_5_0= rulePropertyKind ) )
            // InternalDeviceParser.g:673:4: (lv_kind_5_0= rulePropertyKind )
            {
            // InternalDeviceParser.g:673:4: (lv_kind_5_0= rulePropertyKind )
            // InternalDeviceParser.g:674:5: lv_kind_5_0= rulePropertyKind
            {

                                newCompositeNode(grammarAccess.getDevicePropertyAccess().getKindPropertyKindParserRuleCall_5_0());

            pushFollow(FOLLOW_21);
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

            otherlv_6=(Token)match(input,Type,FOLLOW_22);

                        newLeafNode(otherlv_6, grammarAccess.getDevicePropertyAccess().getTypeKeyword_6());

            // InternalDeviceParser.g:695:3: ( (lv_type_7_0= ruleAbstractResouceType ) )
            // InternalDeviceParser.g:696:4: (lv_type_7_0= ruleAbstractResouceType )
            {
            // InternalDeviceParser.g:696:4: (lv_type_7_0= ruleAbstractResouceType )
            // InternalDeviceParser.g:697:5: lv_type_7_0= ruleAbstractResouceType
            {

                                newCompositeNode(grammarAccess.getDevicePropertyAccess().getTypeAbstractResouceTypeParserRuleCall_7_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:714:3: (otherlv_8= Description ( (lv_description_9_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Description) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceParser.g:715:4: otherlv_8= Description ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_8, grammarAccess.getDevicePropertyAccess().getDescriptionKeyword_8_0());

                    // InternalDeviceParser.g:719:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalDeviceParser.g:720:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalDeviceParser.g:720:5: (lv_description_9_0= ruleEString )
                    // InternalDeviceParser.g:721:6: lv_description_9_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getDevicePropertyAccess().getDescriptionEStringParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:739:3: (otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Value) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeviceParser.g:740:4: otherlv_10= Value this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )* this_DEDENT_16= RULE_DEDENT
                    {
                    otherlv_10=(Token)match(input,Value,FOLLOW_7);

                                    newLeafNode(otherlv_10, grammarAccess.getDevicePropertyAccess().getValueKeyword_9_0());

                    this_INDENT_11=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_11, grammarAccess.getDevicePropertyAccess().getINDENTTerminalRuleCall_9_1());


                                    newCompositeNode(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_9_2());

                    pushFollow(FOLLOW_13);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:755:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:756:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:756:5: (lv_value_13_0= rulePropertyValue )
                    // InternalDeviceParser.g:757:6: lv_value_13_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getDevicePropertyAccess().getValuePropertyValueParserRuleCall_9_3_0());

                    pushFollow(FOLLOW_18);
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

                    // InternalDeviceParser.g:774:4: ( rulePreListElement ( (lv_value_15_0= rulePropertyValue ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==HyphenMinus) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                        case 1 :
                            // InternalDeviceParser.g:775:5: rulePreListElement ( (lv_value_15_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_9_4_0());

                            pushFollow(FOLLOW_13);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalDeviceParser.g:782:5: ( (lv_value_15_0= rulePropertyValue ) )
                            // InternalDeviceParser.g:783:6: (lv_value_15_0= rulePropertyValue )
                            {
                            // InternalDeviceParser.g:783:6: (lv_value_15_0= rulePropertyValue )
                            // InternalDeviceParser.g:784:7: lv_value_15_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getDevicePropertyAccess().getValuePropertyValueParserRuleCall_9_4_1_0());

                            pushFollow(FOLLOW_18);
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
                            break loop14;
                        }
                    } while (true);

                    this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:815:1: entryRuleComputationDeviceType returns [EObject current=null] : iv_ruleComputationDeviceType= ruleComputationDeviceType EOF ;
    public final EObject entryRuleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceType = null;


        try {
            // InternalDeviceParser.g:815:62: (iv_ruleComputationDeviceType= ruleComputationDeviceType EOF )
            // InternalDeviceParser.g:816:2: iv_ruleComputationDeviceType= ruleComputationDeviceType EOF
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
    // InternalDeviceParser.g:822:1: ruleComputationDeviceType returns [EObject current=null] : (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:828:2: ( (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT ) )
            // InternalDeviceParser.g:829:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT )
            {
            // InternalDeviceParser.g:829:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT )
            // InternalDeviceParser.g:830:3: otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ComputationDeviceType,FOLLOW_7);

                        newLeafNode(otherlv_0, grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_5);

                        newLeafNode(this_INDENT_1, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_2, grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2());

            // InternalDeviceParser.g:842:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:843:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:843:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:844:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_16);
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

            // InternalDeviceParser.g:861:3: (otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DeviceProperty) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDeviceParser.g:862:4: otherlv_4= DeviceProperty this_INDENT_5= RULE_INDENT ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+ this_DEDENT_7= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,DeviceProperty,FOLLOW_7);

                                    newLeafNode(otherlv_4, grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyKeyword_4_0());

                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_5, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1());

                    // InternalDeviceParser.g:870:4: ( (lv_deviceProperty_6_0= ruleDeviceProperty ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==HyphenMinus) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                        case 1 :
                            // InternalDeviceParser.g:871:5: (lv_deviceProperty_6_0= ruleDeviceProperty )
                            {
                            // InternalDeviceParser.g:871:5: (lv_deviceProperty_6_0= ruleDeviceProperty )
                            // InternalDeviceParser.g:872:6: lv_deviceProperty_6_0= ruleDeviceProperty
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyDevicePropertyParserRuleCall_4_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_19);

                                    newLeafNode(this_DEDENT_7, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3());


                    }
                    break;

            }

            // InternalDeviceParser.g:894:3: (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CommunicationConnection) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDeviceParser.g:895:4: otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,CommunicationConnection,FOLLOW_7);

                                    newLeafNode(otherlv_8, grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_5_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_9, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalDeviceParser.g:903:4: ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+
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
                            // InternalDeviceParser.g:904:5: (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection )
                            {
                            // InternalDeviceParser.g:904:5: (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection )
                            // InternalDeviceParser.g:905:6: lv_communicationConnection_10_0= ruleAbstractCommunicationConnection
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:935:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalDeviceParser.g:935:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalDeviceParser.g:936:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
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
    // InternalDeviceParser.g:942:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:948:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:949:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:949:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:950:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:950:3: ()
            // InternalDeviceParser.g:951:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_2, grammarAccess.getConnectionPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:968:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:969:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:969:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:970:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getConnectionPropertyAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_4, grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                        newLeafNode(otherlv_5, grammarAccess.getConnectionPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:995:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:996:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:996:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:997:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getConnectionPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:1014:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Description) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDeviceParser.g:1015:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getConnectionPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:1019:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:1020:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1020:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:1021:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getConnectionPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:1039:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Value) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeviceParser.g:1040:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getConnectionPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:1044:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1045:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1045:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:1046:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1072:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalDeviceParser.g:1072:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalDeviceParser.g:1073:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
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
    // InternalDeviceParser.g:1079:1: ruleNetworkConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1085:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1086:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1086:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1087:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1087:3: ()
            // InternalDeviceParser.g:1088:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getNetworkConnectionAccess().getNetworkConnectionAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getNetworkConnectionAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_2, grammarAccess.getNetworkConnectionAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1105:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1106:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1106:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1107:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getNetworkConnectionAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_21);

                        newLeafNode(this_INDENT_4, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_23);

                        newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:1132:3: ( (lv_type_6_0= ruleNetworkCommunicationType ) )
            // InternalDeviceParser.g:1133:4: (lv_type_6_0= ruleNetworkCommunicationType )
            {
            // InternalDeviceParser.g:1133:4: (lv_type_6_0= ruleNetworkCommunicationType )
            // InternalDeviceParser.g:1134:5: lv_type_6_0= ruleNetworkCommunicationType
            {

                                newCompositeNode(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_24);
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

            // InternalDeviceParser.g:1151:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Properties) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeviceParser.g:1152:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_7);

                                    newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_8, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:1160:4: ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==HyphenMinus) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                        case 1 :
                            // InternalDeviceParser.g:1161:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                            {
                            // InternalDeviceParser.g:1161:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                            // InternalDeviceParser.g:1162:6: lv_properties_9_0= ruleAbstractNetworkProperty
                            {

                                                    newCompositeNode(grammarAccess.getNetworkConnectionAccess().getPropertiesAbstractNetworkPropertyParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:1192:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalDeviceParser.g:1192:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:1193:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
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
    // InternalDeviceParser.g:1199:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1205:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1206:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1206:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1207:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1207:3: ()
            // InternalDeviceParser.g:1208:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_2, grammarAccess.getCommunicationConnectionAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1225:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1226:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1226:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1227:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_21);

                        newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_11);

                        newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:1252:3: ( (lv_type_6_0= ruleCommunicationType ) )
            // InternalDeviceParser.g:1253:4: (lv_type_6_0= ruleCommunicationType )
            {
            // InternalDeviceParser.g:1253:4: (lv_type_6_0= ruleCommunicationType )
            // InternalDeviceParser.g:1254:5: lv_type_6_0= ruleCommunicationType
            {

                                newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_24);
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

            // InternalDeviceParser.g:1271:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Properties) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDeviceParser.g:1272:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_7);

                                    newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:1280:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==HyphenMinus) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                        case 1 :
                            // InternalDeviceParser.g:1281:5: (lv_properties_9_0= ruleConnectionProperty )
                            {
                            // InternalDeviceParser.g:1281:5: (lv_properties_9_0= ruleConnectionProperty )
                            // InternalDeviceParser.g:1282:6: lv_properties_9_0= ruleConnectionProperty
                            {

                                                    newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPropertiesConnectionPropertyParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:1312:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalDeviceParser.g:1312:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalDeviceParser.g:1313:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalDeviceParser.g:1319:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:1325:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalDeviceParser.g:1326:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalDeviceParser.g:1326:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt26=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt26=1;
                }
                break;
            case MaximumKind:
                {
                alt26=2;
                }
                break;
            case MinimumKind:
                {
                alt26=3;
                }
                break;
            case RangeKind:
                {
                alt26=4;
                }
                break;
            case SelectionKind:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalDeviceParser.g:1327:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalDeviceParser.g:1336:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalDeviceParser.g:1345:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalDeviceParser.g:1354:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalDeviceParser.g:1363:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalDeviceParser.g:1375:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDeviceParser.g:1375:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalDeviceParser.g:1376:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalDeviceParser.g:1382:1: ruleProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:1388:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:1389:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:1389:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalDeviceParser.g:1390:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getNameKeyword_1());

            // InternalDeviceParser.g:1401:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:1402:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:1402:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:1403:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_20);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getKindKeyword_4());

            // InternalDeviceParser.g:1428:3: ( (lv_kind_5_0= rulePropertyKind ) )
            // InternalDeviceParser.g:1429:4: (lv_kind_5_0= rulePropertyKind )
            {
            // InternalDeviceParser.g:1429:4: (lv_kind_5_0= rulePropertyKind )
            // InternalDeviceParser.g:1430:5: lv_kind_5_0= rulePropertyKind
            {

                                newCompositeNode(grammarAccess.getPropertyAccess().getKindPropertyKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalDeviceParser.g:1447:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Description) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDeviceParser.g:1448:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:1452:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:1453:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1453:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:1454:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalDeviceParser.g:1472:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Value) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDeviceParser.g:1473:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_7);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_13);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:1488:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1489:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1489:5: (lv_value_11_0= rulePropertyValue )
                    // InternalDeviceParser.g:1490:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_18);
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

                    // InternalDeviceParser.g:1507:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==HyphenMinus) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                        case 1 :
                            // InternalDeviceParser.g:1508:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_13);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalDeviceParser.g:1515:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalDeviceParser.g:1516:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalDeviceParser.g:1516:6: (lv_value_13_0= rulePropertyValue )
                            // InternalDeviceParser.g:1517:7: lv_value_13_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                            pushFollow(FOLLOW_18);
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
                            break loop28;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_27);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalDeviceParser.g:1540:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DEDENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDeviceParser.g:1541:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalDeviceParser.g:1550:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalDeviceParser.g:1550:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalDeviceParser.g:1551:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalDeviceParser.g:1557:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:1563:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:1564:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:1564:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalDeviceParser.g:1565:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalDeviceParser.g:1576:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:1577:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:1577:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:1578:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_9);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalDeviceParser.g:1603:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:1604:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:1604:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalDeviceParser.g:1605:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalDeviceParser.g:1622:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Description) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDeviceParser.g:1623:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:1627:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:1628:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1628:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:1629:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalDeviceParser.g:1647:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Value) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDeviceParser.g:1648:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalDeviceParser.g:1652:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1653:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1653:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:1654:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_27);
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

            // InternalDeviceParser.g:1672:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_DEDENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDeviceParser.g:1673:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalDeviceParser.g:1682:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalDeviceParser.g:1682:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalDeviceParser.g:1683:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalDeviceParser.g:1689:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:1695:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:1696:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:1696:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalDeviceParser.g:1697:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalDeviceParser.g:1708:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:1709:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:1709:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:1710:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalDeviceParser.g:1735:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalDeviceParser.g:1736:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalDeviceParser.g:1736:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalDeviceParser.g:1737:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalDeviceParser.g:1754:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Description) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDeviceParser.g:1755:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:1759:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:1760:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1760:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:1761:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalDeviceParser.g:1779:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Value) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDeviceParser.g:1780:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalDeviceParser.g:1784:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1785:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1785:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:1786:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_27);
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

            // InternalDeviceParser.g:1804:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DEDENT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDeviceParser.g:1805:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalDeviceParser.g:1814:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalDeviceParser.g:1814:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalDeviceParser.g:1815:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalDeviceParser.g:1821:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:1827:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:1828:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:1828:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalDeviceParser.g:1829:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalDeviceParser.g:1840:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:1841:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:1841:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:1842:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_29);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalDeviceParser.g:1867:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalDeviceParser.g:1868:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalDeviceParser.g:1868:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalDeviceParser.g:1869:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalDeviceParser.g:1886:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Description) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDeviceParser.g:1887:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:1891:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:1892:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1892:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:1893:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalDeviceParser.g:1911:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Value) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDeviceParser.g:1912:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalDeviceParser.g:1916:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1917:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1917:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:1918:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_27);
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

            // InternalDeviceParser.g:1936:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_DEDENT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDeviceParser.g:1937:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalDeviceParser.g:1946:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalDeviceParser.g:1946:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalDeviceParser.g:1947:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalDeviceParser.g:1953:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:1959:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:1960:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:1960:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalDeviceParser.g:1961:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalDeviceParser.g:1972:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:1973:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:1973:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:1974:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_20);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalDeviceParser.g:1999:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalDeviceParser.g:2000:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalDeviceParser.g:2000:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalDeviceParser.g:2001:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalDeviceParser.g:2018:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Description) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDeviceParser.g:2019:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:2023:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:2024:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2024:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:2025:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalDeviceParser.g:2043:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Value) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDeviceParser.g:2044:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_7);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_13);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:2059:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2060:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2060:5: (lv_value_11_0= rulePropertyValue )
                    // InternalDeviceParser.g:2061:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_18);
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

                    // InternalDeviceParser.g:2078:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==HyphenMinus) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                        case 1 :
                            // InternalDeviceParser.g:2079:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_13);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalDeviceParser.g:2086:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalDeviceParser.g:2087:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalDeviceParser.g:2087:6: (lv_value_13_0= rulePropertyValue )
                            // InternalDeviceParser.g:2088:7: lv_value_13_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                            pushFollow(FOLLOW_18);
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
                            break loop41;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_27);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalDeviceParser.g:2111:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DEDENT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDeviceParser.g:2112:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalDeviceParser.g:2121:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalDeviceParser.g:2121:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalDeviceParser.g:2122:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalDeviceParser.g:2128:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:2134:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:2135:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:2135:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalDeviceParser.g:2136:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalDeviceParser.g:2147:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:2148:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:2148:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:2149:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_30);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalDeviceParser.g:2174:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalDeviceParser.g:2175:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalDeviceParser.g:2175:4: (lv_kind_5_0= ruleRangeKind )
            // InternalDeviceParser.g:2176:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalDeviceParser.g:2193:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Description) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDeviceParser.g:2194:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:2198:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:2199:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2199:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:2200:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalDeviceParser.g:2218:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Value) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDeviceParser.g:2219:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_7);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_13);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:2234:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2235:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2235:5: (lv_value_11_0= rulePropertyValue )
                    // InternalDeviceParser.g:2236:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_17);
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

                    pushFollow(FOLLOW_13);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:2260:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2261:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2261:5: (lv_value_13_0= rulePropertyValue )
                    // InternalDeviceParser.g:2262:6: lv_value_13_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_5_0());

                    pushFollow(FOLLOW_14);
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_27);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalDeviceParser.g:2284:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DEDENT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDeviceParser.g:2285:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalDeviceParser.g:2294:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalDeviceParser.g:2294:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalDeviceParser.g:2295:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalDeviceParser.g:2301:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2307:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) )
            // InternalDeviceParser.g:2308:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            {
            // InternalDeviceParser.g:2308:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt47=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt47=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt47=3;
                }
                break;
            case X86_64:
            case Arm64:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalDeviceParser.g:2309:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalDeviceParser.g:2318:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalDeviceParser.g:2327:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalDeviceParser.g:2336:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
    // InternalDeviceParser.g:2348:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalDeviceParser.g:2348:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalDeviceParser.g:2349:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalDeviceParser.g:2355:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2361:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalDeviceParser.g:2362:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalDeviceParser.g:2362:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalDeviceParser.g:2363:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalDeviceParser.g:2363:3: (lv_value_0_0= ruleInteger0 )
            // InternalDeviceParser.g:2364:4: lv_value_0_0= ruleInteger0
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
    // InternalDeviceParser.g:2384:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalDeviceParser.g:2384:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:2385:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalDeviceParser.g:2391:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2397:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalDeviceParser.g:2398:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalDeviceParser.g:2398:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalDeviceParser.g:2399:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalDeviceParser.g:2399:3: (lv_value_0_0= ruleDouble0 )
            // InternalDeviceParser.g:2400:4: lv_value_0_0= ruleDouble0
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
    // InternalDeviceParser.g:2420:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalDeviceParser.g:2420:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalDeviceParser.g:2421:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalDeviceParser.g:2427:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2433:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDeviceParser.g:2434:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDeviceParser.g:2434:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDeviceParser.g:2435:3: (lv_value_0_0= ruleEString )
            {
            // InternalDeviceParser.g:2435:3: (lv_value_0_0= ruleEString )
            // InternalDeviceParser.g:2436:4: lv_value_0_0= ruleEString
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
    // InternalDeviceParser.g:2456:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalDeviceParser.g:2456:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalDeviceParser.g:2457:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalDeviceParser.g:2463:1: ruleProcessorArchitectureValue returns [EObject current=null] : (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject this_X86ProcessorArchitecture_0 = null;

        EObject this_Arm64ProcessorArchitecture_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2469:2: ( (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) )
            // InternalDeviceParser.g:2470:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            {
            // InternalDeviceParser.g:2470:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==X86_64) ) {
                alt48=1;
            }
            else if ( (LA48_0==Arm64) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDeviceParser.g:2471:3: this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture
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
                    // InternalDeviceParser.g:2480:3: this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture
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
    // InternalDeviceParser.g:2492:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalDeviceParser.g:2492:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalDeviceParser.g:2493:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalDeviceParser.g:2499:1: ruleAbstractResouceType returns [EObject current=null] : (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType | this_ResourceType_2= ruleResourceType ) ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_OpertingSystemType_0 = null;

        EObject this_ProcessorArchitectureType_1 = null;

        EObject this_ResourceType_2 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2505:2: ( (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType | this_ResourceType_2= ruleResourceType ) )
            // InternalDeviceParser.g:2506:2: (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType | this_ResourceType_2= ruleResourceType )
            {
            // InternalDeviceParser.g:2506:2: (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType | this_ResourceType_2= ruleResourceType )
            int alt49=3;
            switch ( input.LA(1) ) {
            case Linux:
            case MacOS:
                {
                alt49=1;
                }
                break;
            case ProcessorArchitecture:
                {
                alt49=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalDeviceParser.g:2507:3: this_OpertingSystemType_0= ruleOpertingSystemType
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
                    // InternalDeviceParser.g:2516:3: this_ProcessorArchitectureType_1= ruleProcessorArchitectureType
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
                    // InternalDeviceParser.g:2525:3: this_ResourceType_2= ruleResourceType
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
    // InternalDeviceParser.g:2537:1: entryRuleOpertingSystemType returns [EObject current=null] : iv_ruleOpertingSystemType= ruleOpertingSystemType EOF ;
    public final EObject entryRuleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemType = null;


        try {
            // InternalDeviceParser.g:2537:59: (iv_ruleOpertingSystemType= ruleOpertingSystemType EOF )
            // InternalDeviceParser.g:2538:2: iv_ruleOpertingSystemType= ruleOpertingSystemType EOF
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
    // InternalDeviceParser.g:2544:1: ruleOpertingSystemType returns [EObject current=null] : (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) ;
    public final EObject ruleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystemType_0 = null;

        EObject this_MacOSOpertingSystemType_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2550:2: ( (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) )
            // InternalDeviceParser.g:2551:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            {
            // InternalDeviceParser.g:2551:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Linux) ) {
                alt50=1;
            }
            else if ( (LA50_0==MacOS) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalDeviceParser.g:2552:3: this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType
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
                    // InternalDeviceParser.g:2561:3: this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType
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
    // InternalDeviceParser.g:2573:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalDeviceParser.g:2573:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalDeviceParser.g:2574:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalDeviceParser.g:2580:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2586:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:2587:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:2587:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDeviceParser.g:2588:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDeviceParser.g:2588:3: ()
            // InternalDeviceParser.g:2589:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalDeviceParser.g:2595:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeviceParser.g:2596:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeviceParser.g:2596:4: (lv_name_1_0= ruleEString )
            // InternalDeviceParser.g:2597:5: lv_name_1_0= ruleEString
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
    // InternalDeviceParser.g:2618:1: entryRuleProcessorArchitectureType returns [EObject current=null] : iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF ;
    public final EObject entryRuleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureType = null;


        try {
            // InternalDeviceParser.g:2618:66: (iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF )
            // InternalDeviceParser.g:2619:2: iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF
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
    // InternalDeviceParser.g:2625:1: ruleProcessorArchitectureType returns [EObject current=null] : ( () otherlv_1= ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2631:2: ( ( () otherlv_1= ProcessorArchitecture ) )
            // InternalDeviceParser.g:2632:2: ( () otherlv_1= ProcessorArchitecture )
            {
            // InternalDeviceParser.g:2632:2: ( () otherlv_1= ProcessorArchitecture )
            // InternalDeviceParser.g:2633:3: () otherlv_1= ProcessorArchitecture
            {
            // InternalDeviceParser.g:2633:3: ()
            // InternalDeviceParser.g:2634:4:
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
    // InternalDeviceParser.g:2648:1: entryRuleLinuxOpertingSystemType returns [EObject current=null] : iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF ;
    public final EObject entryRuleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystemType = null;


        try {
            // InternalDeviceParser.g:2648:64: (iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF )
            // InternalDeviceParser.g:2649:2: iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF
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
    // InternalDeviceParser.g:2655:1: ruleLinuxOpertingSystemType returns [EObject current=null] : ( () otherlv_1= Linux ) ;
    public final EObject ruleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2661:2: ( ( () otherlv_1= Linux ) )
            // InternalDeviceParser.g:2662:2: ( () otherlv_1= Linux )
            {
            // InternalDeviceParser.g:2662:2: ( () otherlv_1= Linux )
            // InternalDeviceParser.g:2663:3: () otherlv_1= Linux
            {
            // InternalDeviceParser.g:2663:3: ()
            // InternalDeviceParser.g:2664:4:
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
    // InternalDeviceParser.g:2678:1: entryRuleMacOSOpertingSystemType returns [EObject current=null] : iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF ;
    public final EObject entryRuleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystemType = null;


        try {
            // InternalDeviceParser.g:2678:64: (iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF )
            // InternalDeviceParser.g:2679:2: iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF
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
    // InternalDeviceParser.g:2685:1: ruleMacOSOpertingSystemType returns [EObject current=null] : ( () otherlv_1= MacOS ) ;
    public final EObject ruleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2691:2: ( ( () otherlv_1= MacOS ) )
            // InternalDeviceParser.g:2692:2: ( () otherlv_1= MacOS )
            {
            // InternalDeviceParser.g:2692:2: ( () otherlv_1= MacOS )
            // InternalDeviceParser.g:2693:3: () otherlv_1= MacOS
            {
            // InternalDeviceParser.g:2693:3: ()
            // InternalDeviceParser.g:2694:4:
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
    // InternalDeviceParser.g:2708:1: entryRuleX86ProcessorArchitecture returns [EObject current=null] : iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF ;
    public final EObject entryRuleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX86ProcessorArchitecture = null;


        try {
            // InternalDeviceParser.g:2708:65: (iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF )
            // InternalDeviceParser.g:2709:2: iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:2715:1: ruleX86ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= X86_64 ) ;
    public final EObject ruleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2721:2: ( ( () otherlv_1= X86_64 ) )
            // InternalDeviceParser.g:2722:2: ( () otherlv_1= X86_64 )
            {
            // InternalDeviceParser.g:2722:2: ( () otherlv_1= X86_64 )
            // InternalDeviceParser.g:2723:3: () otherlv_1= X86_64
            {
            // InternalDeviceParser.g:2723:3: ()
            // InternalDeviceParser.g:2724:4:
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
    // InternalDeviceParser.g:2738:1: entryRuleArm64ProcessorArchitecture returns [EObject current=null] : iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF ;
    public final EObject entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm64ProcessorArchitecture = null;


        try {
            // InternalDeviceParser.g:2738:67: (iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF )
            // InternalDeviceParser.g:2739:2: iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:2745:1: ruleArm64ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= Arm64 ) ;
    public final EObject ruleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2751:2: ( ( () otherlv_1= Arm64 ) )
            // InternalDeviceParser.g:2752:2: ( () otherlv_1= Arm64 )
            {
            // InternalDeviceParser.g:2752:2: ( () otherlv_1= Arm64 )
            // InternalDeviceParser.g:2753:3: () otherlv_1= Arm64
            {
            // InternalDeviceParser.g:2753:3: ()
            // InternalDeviceParser.g:2754:4:
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
    // InternalDeviceParser.g:2768:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalDeviceParser.g:2768:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalDeviceParser.g:2769:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalDeviceParser.g:2775:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2781:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:2782:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:2782:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDeviceParser.g:2783:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDeviceParser.g:2783:3: ()
            // InternalDeviceParser.g:2784:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalDeviceParser.g:2790:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeviceParser.g:2791:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeviceParser.g:2791:4: (lv_name_1_0= ruleEString )
            // InternalDeviceParser.g:2792:5: lv_name_1_0= ruleEString
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
    // InternalDeviceParser.g:2813:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalDeviceParser.g:2813:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalDeviceParser.g:2814:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalDeviceParser.g:2820:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2826:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalDeviceParser.g:2827:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalDeviceParser.g:2827:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Ethernet) ) {
                alt51=1;
            }
            else if ( (LA51_0==Wlan) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalDeviceParser.g:2828:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalDeviceParser.g:2837:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalDeviceParser.g:2849:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalDeviceParser.g:2849:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalDeviceParser.g:2850:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalDeviceParser.g:2856:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2862:2: ( ( () otherlv_1= Ethernet ) )
            // InternalDeviceParser.g:2863:2: ( () otherlv_1= Ethernet )
            {
            // InternalDeviceParser.g:2863:2: ( () otherlv_1= Ethernet )
            // InternalDeviceParser.g:2864:3: () otherlv_1= Ethernet
            {
            // InternalDeviceParser.g:2864:3: ()
            // InternalDeviceParser.g:2865:4:
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
    // InternalDeviceParser.g:2879:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalDeviceParser.g:2879:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalDeviceParser.g:2880:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalDeviceParser.g:2886:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2892:2: ( ( () otherlv_1= Wlan ) )
            // InternalDeviceParser.g:2893:2: ( () otherlv_1= Wlan )
            {
            // InternalDeviceParser.g:2893:2: ( () otherlv_1= Wlan )
            // InternalDeviceParser.g:2894:3: () otherlv_1= Wlan
            {
            // InternalDeviceParser.g:2894:3: ()
            // InternalDeviceParser.g:2895:4:
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
    // InternalDeviceParser.g:2909:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalDeviceParser.g:2909:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalDeviceParser.g:2910:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalDeviceParser.g:2916:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2922:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalDeviceParser.g:2923:2: ( () otherlv_1= AttributeKind )
            {
            // InternalDeviceParser.g:2923:2: ( () otherlv_1= AttributeKind )
            // InternalDeviceParser.g:2924:3: () otherlv_1= AttributeKind
            {
            // InternalDeviceParser.g:2924:3: ()
            // InternalDeviceParser.g:2925:4:
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
    // InternalDeviceParser.g:2939:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalDeviceParser.g:2939:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalDeviceParser.g:2940:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalDeviceParser.g:2946:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2952:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalDeviceParser.g:2953:2: ( () otherlv_1= MaximumKind )
            {
            // InternalDeviceParser.g:2953:2: ( () otherlv_1= MaximumKind )
            // InternalDeviceParser.g:2954:3: () otherlv_1= MaximumKind
            {
            // InternalDeviceParser.g:2954:3: ()
            // InternalDeviceParser.g:2955:4:
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
    // InternalDeviceParser.g:2969:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalDeviceParser.g:2969:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalDeviceParser.g:2970:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalDeviceParser.g:2976:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:2982:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalDeviceParser.g:2983:2: ( () otherlv_1= MinimumKind )
            {
            // InternalDeviceParser.g:2983:2: ( () otherlv_1= MinimumKind )
            // InternalDeviceParser.g:2984:3: () otherlv_1= MinimumKind
            {
            // InternalDeviceParser.g:2984:3: ()
            // InternalDeviceParser.g:2985:4:
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
    // InternalDeviceParser.g:2999:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalDeviceParser.g:2999:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalDeviceParser.g:3000:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalDeviceParser.g:3006:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3012:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalDeviceParser.g:3013:2: ( () otherlv_1= SelectionKind )
            {
            // InternalDeviceParser.g:3013:2: ( () otherlv_1= SelectionKind )
            // InternalDeviceParser.g:3014:3: () otherlv_1= SelectionKind
            {
            // InternalDeviceParser.g:3014:3: ()
            // InternalDeviceParser.g:3015:4:
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
    // InternalDeviceParser.g:3029:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalDeviceParser.g:3029:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalDeviceParser.g:3030:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalDeviceParser.g:3036:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3042:2: ( ( () otherlv_1= RangeKind ) )
            // InternalDeviceParser.g:3043:2: ( () otherlv_1= RangeKind )
            {
            // InternalDeviceParser.g:3043:2: ( () otherlv_1= RangeKind )
            // InternalDeviceParser.g:3044:3: () otherlv_1= RangeKind
            {
            // InternalDeviceParser.g:3044:3: ()
            // InternalDeviceParser.g:3045:4:
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
    // InternalDeviceParser.g:3059:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalDeviceParser.g:3059:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalDeviceParser.g:3060:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalDeviceParser.g:3066:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3072:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalDeviceParser.g:3073:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalDeviceParser.g:3083:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalDeviceParser.g:3083:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalDeviceParser.g:3084:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalDeviceParser.g:3090:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3096:2: (this_DECINT_0= RULE_DECINT )
            // InternalDeviceParser.g:3097:2: this_DECINT_0= RULE_DECINT
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
    // InternalDeviceParser.g:3107:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDeviceParser.g:3107:47: (iv_ruleEString= ruleEString EOF )
            // InternalDeviceParser.g:3108:2: iv_ruleEString= ruleEString EOF
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
    // InternalDeviceParser.g:3114:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3120:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDeviceParser.g:3121:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDeviceParser.g:3121:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalDeviceParser.g:3122:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:3130:3: this_ID_1= RULE_ID
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
    // InternalDeviceParser.g:3141:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:3143:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalDeviceParser.g:3144:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalDeviceParser.g:3153:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:3160:2: (kw= HyphenMinus )
            // InternalDeviceParser.g:3161:2: kw= HyphenMinus
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000100400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000500600280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000090L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000B300L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000500000C00040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000100402L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000100002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008000L});

}
