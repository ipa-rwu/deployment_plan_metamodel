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
import de.fraunhofer.ipa.targetEnvironment.services.DeviceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "ComputationDeviceType", "Processor_architecture", "LinuxOpertingSystem", "MacOSOpertingSystem", "ComputationResouce", "DeviceResouce", "AttributeKind", "SelectionKind", "Description", "DeviceType", "MaximumKind", "MinimumKind", "Core_number", "Properties", "Os_version", "Processor", "RangeKind", "Container", "Interface", "Ethernet", "Address", "Os_name", "Debian", "Ubuntu", "Value", "Arm64", "Focal", "Jammy", "Kind", "Name", "Type", "Wlan", "HyphenMinusHyphenMinusHyphenMinus", "X86", "HyphenMinus", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Core_number=17;
    public static final int Address=25;
    public static final int ComputationResouce=9;
    public static final int AttributeKind=11;
    public static final int Name=34;
    public static final int Container=22;
    public static final int Debian=27;
    public static final int Kind=33;
    public static final int Ubuntu=28;
    public static final int RULE_DEDENT=45;
    public static final int LinuxOpertingSystem=7;
    public static final int RULE_ID=46;
    public static final int RULE_DIGIT=40;
    public static final int HyphenMinusHyphenMinusHyphenMinus=37;
    public static final int SelectionKind=12;
    public static final int DeviceType=14;
    public static final int Arm64=30;
    public static final int RULE_INT=47;
    public static final int Ethernet=24;
    public static final int Value=29;
    public static final int RULE_ML_COMMENT=49;
    public static final int Description=13;
    public static final int Processor=20;
    public static final int RULE_STRING=48;
    public static final int Focal=31;
    public static final int Wlan=36;
    public static final int Properties=18;
    public static final int DeviceResouce=10;
    public static final int RULE_SL_COMMENT=43;
    public static final int CommunicationConnection=4;
    public static final int Os_name=26;
    public static final int HyphenMinus=39;
    public static final int RULE_DOUBLE=42;
    public static final int X86=38;
    public static final int RULE_DECINT=41;
    public static final int MinimumKind=16;
    public static final int EOF=-1;
    public static final int RULE_INDENT=44;
    public static final int Jammy=32;
    public static final int RULE_WS=50;
    public static final int MaximumKind=15;
    public static final int RULE_ANY_OTHER=51;
    public static final int ComputationDeviceType=5;
    public static final int Processor_architecture=6;
    public static final int RangeKind=21;
    public static final int Os_version=19;
    public static final int Type=35;
    public static final int MacOSOpertingSystem=8;
    public static final int Interface=23;

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
    // InternalDeviceParser.g:58:1: entryRuleDeviceSet returns [EObject current=null] : iv_ruleDeviceSet= ruleDeviceSet EOF ;
    public final EObject entryRuleDeviceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceSet = null;


        try {
            // InternalDeviceParser.g:58:50: (iv_ruleDeviceSet= ruleDeviceSet EOF )
            // InternalDeviceParser.g:59:2: iv_ruleDeviceSet= ruleDeviceSet EOF
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
    // InternalDeviceParser.g:65:1: ruleDeviceSet returns [EObject current=null] : ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* ) ;
    public final EObject ruleDeviceSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_device_0_0 = null;

        EObject lv_device_2_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:71:2: ( ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* ) )
            // InternalDeviceParser.g:72:2: ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* )
            {
            // InternalDeviceParser.g:72:2: ( ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )* )
            // InternalDeviceParser.g:73:3: ( (lv_device_0_0= ruleDeviceType ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )*
            {
            // InternalDeviceParser.g:73:3: ( (lv_device_0_0= ruleDeviceType ) )
            // InternalDeviceParser.g:74:4: (lv_device_0_0= ruleDeviceType )
            {
            // InternalDeviceParser.g:74:4: (lv_device_0_0= ruleDeviceType )
            // InternalDeviceParser.g:75:5: lv_device_0_0= ruleDeviceType
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

            // InternalDeviceParser.g:92:3: (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==HyphenMinusHyphenMinusHyphenMinus) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // InternalDeviceParser.g:93:4: otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_device_2_0= ruleDeviceType ) )
                    {
                    otherlv_1=(Token)match(input,HyphenMinusHyphenMinusHyphenMinus,FOLLOW_4);

                                    newLeafNode(otherlv_1, grammarAccess.getDeviceSetAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_1_0());

                    // InternalDeviceParser.g:97:4: ( (lv_device_2_0= ruleDeviceType ) )
                    // InternalDeviceParser.g:98:5: (lv_device_2_0= ruleDeviceType )
                    {
                    // InternalDeviceParser.g:98:5: (lv_device_2_0= ruleDeviceType )
                    // InternalDeviceParser.g:99:6: lv_device_2_0= ruleDeviceType
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
    // InternalDeviceParser.g:121:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalDeviceParser.g:121:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalDeviceParser.g:122:2: iv_ruleDeviceType= ruleDeviceType EOF
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
    // InternalDeviceParser.g:128:1: ruleDeviceType returns [EObject current=null] : (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceType_Impl_0 = null;

        EObject this_ComputationDeviceType_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:134:2: ( (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) )
            // InternalDeviceParser.g:135:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            {
            // InternalDeviceParser.g:135:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
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
                    // InternalDeviceParser.g:136:3: this_DeviceType_Impl_0= ruleDeviceType_Impl
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
                    // InternalDeviceParser.g:145:3: this_ComputationDeviceType_1= ruleComputationDeviceType
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
    // InternalDeviceParser.g:157:1: entryRuleAbstractCommunicationConnection returns [EObject current=null] : iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF ;
    public final EObject entryRuleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommunicationConnection = null;


        try {
            // InternalDeviceParser.g:157:72: (iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF )
            // InternalDeviceParser.g:158:2: iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF
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
    // InternalDeviceParser.g:164:1: ruleAbstractCommunicationConnection returns [EObject current=null] : (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) ;
    public final EObject ruleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationConnection_0 = null;

        EObject this_NetworkConnection_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:170:2: ( (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) )
            // InternalDeviceParser.g:171:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            {
            // InternalDeviceParser.g:171:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
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

                                if ( (LA3_6==Ethernet||LA3_6==Wlan) ) {
                                    alt3=2;
                                }
                                else if ( (LA3_6==RULE_ID||LA3_6==RULE_STRING) ) {
                                    alt3=1;
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

                                if ( (LA3_6==Ethernet||LA3_6==Wlan) ) {
                                    alt3=2;
                                }
                                else if ( (LA3_6==RULE_ID||LA3_6==RULE_STRING) ) {
                                    alt3=1;
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
                    // InternalDeviceParser.g:172:3: this_CommunicationConnection_0= ruleCommunicationConnection
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
                    // InternalDeviceParser.g:181:3: this_NetworkConnection_1= ruleNetworkConnection
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
    // InternalDeviceParser.g:193:1: entryRuleAbstractNetworkProperty returns [EObject current=null] : iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF ;
    public final EObject entryRuleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetworkProperty = null;


        try {
            // InternalDeviceParser.g:193:64: (iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF )
            // InternalDeviceParser.g:194:2: iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF
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
    // InternalDeviceParser.g:200:1: ruleAbstractNetworkProperty returns [EObject current=null] : (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) ;
    public final EObject ruleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceNetworkProperty_0 = null;

        EObject this_AddressNetworkProperty_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:206:2: ( (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) )
            // InternalDeviceParser.g:207:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            {
            // InternalDeviceParser.g:207:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==HyphenMinus) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==Name) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==Interface) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==Address) ) {
                        alt4=2;
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
                    // InternalDeviceParser.g:208:3: this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty
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
                    // InternalDeviceParser.g:217:3: this_AddressNetworkProperty_1= ruleAddressNetworkProperty
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
    // InternalDeviceParser.g:229:1: entryRuleInterfaceNetworkProperty returns [EObject current=null] : iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF ;
    public final EObject entryRuleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceNetworkProperty = null;


        try {
            // InternalDeviceParser.g:229:65: (iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF )
            // InternalDeviceParser.g:230:2: iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF
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
    // InternalDeviceParser.g:236:1: ruleInterfaceNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:242:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:243:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:243:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:244:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:244:3: ()
            // InternalDeviceParser.g:245:4:
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

            // InternalDeviceParser.g:262:3: ( (lv_name_3_0= Interface ) )
            // InternalDeviceParser.g:263:4: (lv_name_3_0= Interface )
            {
            // InternalDeviceParser.g:263:4: (lv_name_3_0= Interface )
            // InternalDeviceParser.g:264:5: lv_name_3_0= Interface
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

            // InternalDeviceParser.g:284:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:285:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:285:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:286:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:303:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Description) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeviceParser.g:304:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:308:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:309:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:309:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:310:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:328:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Value) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:329:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:333:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:334:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:334:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:335:6: lv_value_10_0= rulePropertyValue
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
    // InternalDeviceParser.g:361:1: entryRuleAddressNetworkProperty returns [EObject current=null] : iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF ;
    public final EObject entryRuleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressNetworkProperty = null;


        try {
            // InternalDeviceParser.g:361:63: (iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF )
            // InternalDeviceParser.g:362:2: iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF
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
    // InternalDeviceParser.g:368:1: ruleAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:374:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:375:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:375:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:376:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:376:3: ()
            // InternalDeviceParser.g:377:4:
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

            // InternalDeviceParser.g:394:3: ( (lv_name_3_0= Address ) )
            // InternalDeviceParser.g:395:4: (lv_name_3_0= Address )
            {
            // InternalDeviceParser.g:395:4: (lv_name_3_0= Address )
            // InternalDeviceParser.g:396:5: lv_name_3_0= Address
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

            // InternalDeviceParser.g:416:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:417:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:417:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:418:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:435:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Description) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceParser.g:436:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:440:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:441:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:441:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:442:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:460:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Value) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeviceParser.g:461:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:465:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:466:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:466:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:467:6: lv_value_10_0= rulePropertyValue
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
    // InternalDeviceParser.g:493:1: entryRuleDeviceType_Impl returns [EObject current=null] : iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF ;
    public final EObject entryRuleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType_Impl = null;


        try {
            // InternalDeviceParser.g:493:56: (iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF )
            // InternalDeviceParser.g:494:2: iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF
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
    // InternalDeviceParser.g:500:1: ruleDeviceType_Impl returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:506:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalDeviceParser.g:507:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalDeviceParser.g:507:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalDeviceParser.g:508:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalDeviceParser.g:508:3: ()
            // InternalDeviceParser.g:509:4:
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

            // InternalDeviceParser.g:527:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDeviceParser.g:528:4: (lv_name_4_0= ruleEString )
            {
            // InternalDeviceParser.g:528:4: (lv_name_4_0= ruleEString )
            // InternalDeviceParser.g:529:5: lv_name_4_0= ruleEString
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

            // InternalDeviceParser.g:546:3: (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DeviceResouce) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceParser.g:547:4: otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,DeviceResouce,FOLLOW_7);

                                    newLeafNode(otherlv_5, grammarAccess.getDeviceType_ImplAccess().getDeviceResouceKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_6, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalDeviceParser.g:555:4: ( (lv_deviceResource_7_0= ruleDeviceResource ) )+
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
                            // InternalDeviceParser.g:556:5: (lv_deviceResource_7_0= ruleDeviceResource )
                            {
                            // InternalDeviceParser.g:556:5: (lv_deviceResource_7_0= ruleDeviceResource )
                            // InternalDeviceParser.g:557:6: lv_deviceResource_7_0= ruleDeviceResource
                            {

                                                    newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getDeviceResourceDeviceResourceParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_18);
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

            // InternalDeviceParser.g:579:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CommunicationConnection) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceParser.g:580:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_7);

                                    newLeafNode(otherlv_9, grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_10, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:588:4: ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+
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
                            // InternalDeviceParser.g:589:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                            {
                            // InternalDeviceParser.g:589:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                            // InternalDeviceParser.g:590:6: lv_communicationConnection_11_0= ruleAbstractCommunicationConnection
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


    // $ANTLR start "entryRuleAbstractComputationResource"
    // InternalDeviceParser.g:620:1: entryRuleAbstractComputationResource returns [EObject current=null] : iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF ;
    public final EObject entryRuleAbstractComputationResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComputationResource = null;


        try {
            // InternalDeviceParser.g:620:68: (iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF )
            // InternalDeviceParser.g:621:2: iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF
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
    // InternalDeviceParser.g:627:1: ruleAbstractComputationResource returns [EObject current=null] : (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce ) ;
    public final EObject ruleAbstractComputationResource() throws RecognitionException {
        EObject current = null;

        EObject this_OperatingSystemResouce_0 = null;

        EObject this_ProcessorResouce_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:633:2: ( (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce ) )
            // InternalDeviceParser.g:634:2: (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce )
            {
            // InternalDeviceParser.g:634:2: (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==HyphenMinus) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==Name) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_STRING) ) {
                        int LA13_3 = input.LA(4);

                        if ( (LA13_3==RULE_INDENT) ) {
                            int LA13_5 = input.LA(5);

                            if ( (LA13_5==Type) ) {
                                int LA13_6 = input.LA(6);

                                if ( (LA13_6==Processor) ) {
                                    alt13=2;
                                }
                                else if ( ((LA13_6>=LinuxOpertingSystem && LA13_6<=MacOSOpertingSystem)) ) {
                                    alt13=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 13, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA13_2==RULE_ID) ) {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4==RULE_INDENT) ) {
                            int LA13_5 = input.LA(5);

                            if ( (LA13_5==Type) ) {
                                int LA13_6 = input.LA(6);

                                if ( (LA13_6==Processor) ) {
                                    alt13=2;
                                }
                                else if ( ((LA13_6>=LinuxOpertingSystem && LA13_6<=MacOSOpertingSystem)) ) {
                                    alt13=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 13, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceParser.g:635:3: this_OperatingSystemResouce_0= ruleOperatingSystemResouce
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
                    // InternalDeviceParser.g:644:3: this_ProcessorResouce_1= ruleProcessorResouce
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
    // InternalDeviceParser.g:656:1: entryRuleDeviceResource returns [EObject current=null] : iv_ruleDeviceResource= ruleDeviceResource EOF ;
    public final EObject entryRuleDeviceResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceResource = null;


        try {
            // InternalDeviceParser.g:656:55: (iv_ruleDeviceResource= ruleDeviceResource EOF )
            // InternalDeviceParser.g:657:2: iv_ruleDeviceResource= ruleDeviceResource EOF
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
    // InternalDeviceParser.g:663:1: ruleDeviceResource returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:669:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:670:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:670:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:671:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getDeviceResourceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getDeviceResourceAccess().getNameKeyword_1());

            // InternalDeviceParser.g:682:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:683:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:683:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:684:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceResourceAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_3, grammarAccess.getDeviceResourceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_11);

                        newLeafNode(otherlv_4, grammarAccess.getDeviceResourceAccess().getTypeKeyword_4());

            // InternalDeviceParser.g:709:3: ( (lv_type_5_0= ruleAbstractResouceType ) )
            // InternalDeviceParser.g:710:4: (lv_type_5_0= ruleAbstractResouceType )
            {
            // InternalDeviceParser.g:710:4: (lv_type_5_0= ruleAbstractResouceType )
            // InternalDeviceParser.g:711:5: lv_type_5_0= ruleAbstractResouceType
            {

                                newCompositeNode(grammarAccess.getDeviceResourceAccess().getTypeAbstractResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_21);
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

            // InternalDeviceParser.g:728:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Properties) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeviceParser.g:729:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_7);

                                    newLeafNode(otherlv_6, grammarAccess.getDeviceResourceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_7, grammarAccess.getDeviceResourceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:737:4: ( (lv_properties_8_0= ruleAbstractProperty ) )
                    // InternalDeviceParser.g:738:5: (lv_properties_8_0= ruleAbstractProperty )
                    {
                    // InternalDeviceParser.g:738:5: (lv_properties_8_0= ruleAbstractProperty )
                    // InternalDeviceParser.g:739:6: lv_properties_8_0= ruleAbstractProperty
                    {

                                            newCompositeNode(grammarAccess.getDeviceResourceAccess().getPropertiesAbstractPropertyParserRuleCall_6_2_0());

                    pushFollow(FOLLOW_18);
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

                    // InternalDeviceParser.g:756:4: ( (lv_properties_9_0= ruleAbstractProperty ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==HyphenMinus) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                        case 1 :
                            // InternalDeviceParser.g:757:5: (lv_properties_9_0= ruleAbstractProperty )
                            {
                            // InternalDeviceParser.g:757:5: (lv_properties_9_0= ruleAbstractProperty )
                            // InternalDeviceParser.g:758:6: lv_properties_9_0= ruleAbstractProperty
                            {

                                                    newCompositeNode(grammarAccess.getDeviceResourceAccess().getPropertiesAbstractPropertyParserRuleCall_6_3_0());

                            pushFollow(FOLLOW_18);
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
                            break loop14;
                        }
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:788:1: entryRuleComputationDeviceType returns [EObject current=null] : iv_ruleComputationDeviceType= ruleComputationDeviceType EOF ;
    public final EObject entryRuleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceType = null;


        try {
            // InternalDeviceParser.g:788:62: (iv_ruleComputationDeviceType= ruleComputationDeviceType EOF )
            // InternalDeviceParser.g:789:2: iv_ruleComputationDeviceType= ruleComputationDeviceType EOF
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
    // InternalDeviceParser.g:795:1: ruleComputationDeviceType returns [EObject current=null] : (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:801:2: ( (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalDeviceParser.g:802:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalDeviceParser.g:802:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalDeviceParser.g:803:3: otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ComputationDeviceType,FOLLOW_7);

                        newLeafNode(otherlv_0, grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_5);

                        newLeafNode(this_INDENT_1, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_2, grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2());

            // InternalDeviceParser.g:815:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:816:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:816:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:817:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_22);
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

            // InternalDeviceParser.g:834:3: (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DeviceResouce) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDeviceParser.g:835:4: otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,DeviceResouce,FOLLOW_7);

                                    newLeafNode(otherlv_4, grammarAccess.getComputationDeviceTypeAccess().getDeviceResouceKeyword_4_0());

                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_5, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1());

                    // InternalDeviceParser.g:843:4: ( (lv_deviceResource_6_0= ruleDeviceResource ) )+
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
                            // InternalDeviceParser.g:844:5: (lv_deviceResource_6_0= ruleDeviceResource )
                            {
                            // InternalDeviceParser.g:844:5: (lv_deviceResource_6_0= ruleDeviceResource )
                            // InternalDeviceParser.g:845:6: lv_deviceResource_6_0= ruleDeviceResource
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getDeviceResourceDeviceResourceParserRuleCall_4_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_23);

                                    newLeafNode(this_DEDENT_7, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3());


                    }
                    break;

            }

            // InternalDeviceParser.g:867:3: (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ComputationResouce) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDeviceParser.g:868:4: otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+ this_DEDENT_11= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,ComputationResouce,FOLLOW_7);

                                    newLeafNode(otherlv_8, grammarAccess.getComputationDeviceTypeAccess().getComputationResouceKeyword_5_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_9, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalDeviceParser.g:876:4: ( (lv_computationResource_10_0= ruleAbstractComputationResource ) )+
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
                            // InternalDeviceParser.g:877:5: (lv_computationResource_10_0= ruleAbstractComputationResource )
                            {
                            // InternalDeviceParser.g:877:5: (lv_computationResource_10_0= ruleAbstractComputationResource )
                            // InternalDeviceParser.g:878:6: lv_computationResource_10_0= ruleAbstractComputationResource
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getComputationResourceAbstractComputationResourceParserRuleCall_5_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_19);

                                    newLeafNode(this_DEDENT_11, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalDeviceParser.g:900:3: (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CommunicationConnection) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeviceParser.g:901:4: otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_12=(Token)match(input,CommunicationConnection,FOLLOW_7);

                                    newLeafNode(otherlv_12, grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_13=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_13, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:909:4: ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==HyphenMinus) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                        case 1 :
                            // InternalDeviceParser.g:910:5: (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection )
                            {
                            // InternalDeviceParser.g:910:5: (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection )
                            // InternalDeviceParser.g:911:6: lv_communicationConnection_14_0= ruleAbstractCommunicationConnection
                            {

                                                    newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:941:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalDeviceParser.g:941:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalDeviceParser.g:942:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
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
    // InternalDeviceParser.g:948:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:954:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:955:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:955:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:956:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:956:3: ()
            // InternalDeviceParser.g:957:4:
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

            // InternalDeviceParser.g:974:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:975:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:975:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:976:5: lv_name_3_0= ruleEString
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

            // InternalDeviceParser.g:1001:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:1002:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:1002:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:1003:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:1020:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Description) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDeviceParser.g:1021:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getConnectionPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:1025:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:1026:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1026:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:1027:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:1045:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Value) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeviceParser.g:1046:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getConnectionPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:1050:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1051:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1051:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:1052:6: lv_value_10_0= rulePropertyValue
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
    // InternalDeviceParser.g:1078:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalDeviceParser.g:1078:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalDeviceParser.g:1079:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
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
    // InternalDeviceParser.g:1085:1: ruleNetworkConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1091:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1092:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1092:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1093:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1093:3: ()
            // InternalDeviceParser.g:1094:4:
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

            // InternalDeviceParser.g:1111:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1112:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1112:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1113:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_4, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_24);

                        newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:1138:3: ( (lv_type_6_0= ruleNetworkCommunicationType ) )
            // InternalDeviceParser.g:1139:4: (lv_type_6_0= ruleNetworkCommunicationType )
            {
            // InternalDeviceParser.g:1139:4: (lv_type_6_0= ruleNetworkCommunicationType )
            // InternalDeviceParser.g:1140:5: lv_type_6_0= ruleNetworkCommunicationType
            {

                                newCompositeNode(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_21);
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

            // InternalDeviceParser.g:1157:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Properties) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDeviceParser.g:1158:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_7);

                                    newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_8, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:1166:4: ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+
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
                            // InternalDeviceParser.g:1167:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                            {
                            // InternalDeviceParser.g:1167:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                            // InternalDeviceParser.g:1168:6: lv_properties_9_0= ruleAbstractNetworkProperty
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
                            if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
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
    // InternalDeviceParser.g:1198:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalDeviceParser.g:1198:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:1199:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
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
    // InternalDeviceParser.g:1205:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1211:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1212:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1212:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1213:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1213:3: ()
            // InternalDeviceParser.g:1214:4:
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

            // InternalDeviceParser.g:1231:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1232:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1232:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1233:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_11);

                        newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:1258:3: ( (lv_type_6_0= ruleCommunicationType ) )
            // InternalDeviceParser.g:1259:4: (lv_type_6_0= ruleCommunicationType )
            {
            // InternalDeviceParser.g:1259:4: (lv_type_6_0= ruleCommunicationType )
            // InternalDeviceParser.g:1260:5: lv_type_6_0= ruleCommunicationType
            {

                                newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_21);
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

            // InternalDeviceParser.g:1277:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Properties) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDeviceParser.g:1278:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_7);

                                    newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:1286:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==HyphenMinus) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                        case 1 :
                            // InternalDeviceParser.g:1287:5: (lv_properties_9_0= ruleConnectionProperty )
                            {
                            // InternalDeviceParser.g:1287:5: (lv_properties_9_0= ruleConnectionProperty )
                            // InternalDeviceParser.g:1288:6: lv_properties_9_0= ruleConnectionProperty
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
                            if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
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


    // $ANTLR start "entryRuleOperatingSystemResouce"
    // InternalDeviceParser.g:1318:1: entryRuleOperatingSystemResouce returns [EObject current=null] : iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF ;
    public final EObject entryRuleOperatingSystemResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatingSystemResouce = null;


        try {
            // InternalDeviceParser.g:1318:63: (iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF )
            // InternalDeviceParser.g:1319:2: iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF
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
    // InternalDeviceParser.g:1325:1: ruleOperatingSystemResouce returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1331:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1332:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1332:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1333:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleOpertingSystemResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1333:3: ()
            // InternalDeviceParser.g:1334:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getOperatingSystemResouceAccess().getOperatingSystemResouceAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_2, grammarAccess.getOperatingSystemResouceAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1351:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1352:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1352:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1353:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_4, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_25);

                        newLeafNode(otherlv_5, grammarAccess.getOperatingSystemResouceAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:1378:3: ( (lv_type_6_0= ruleOpertingSystemResouceType ) )
            // InternalDeviceParser.g:1379:4: (lv_type_6_0= ruleOpertingSystemResouceType )
            {
            // InternalDeviceParser.g:1379:4: (lv_type_6_0= ruleOpertingSystemResouceType )
            // InternalDeviceParser.g:1380:5: lv_type_6_0= ruleOpertingSystemResouceType
            {

                                newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getTypeOpertingSystemResouceTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_21);
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

            // InternalDeviceParser.g:1397:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Properties) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDeviceParser.g:1398:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_7);

                                    newLeafNode(otherlv_7, grammarAccess.getOperatingSystemResouceAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_8, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:1406:4: ( (lv_properties_9_0= ruleAbstractOperatingSystemProperty ) )+
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
                            // InternalDeviceParser.g:1407:5: (lv_properties_9_0= ruleAbstractOperatingSystemProperty )
                            {
                            // InternalDeviceParser.g:1407:5: (lv_properties_9_0= ruleAbstractOperatingSystemProperty )
                            // InternalDeviceParser.g:1408:6: lv_properties_9_0= ruleAbstractOperatingSystemProperty
                            {

                                                    newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getPropertiesAbstractOperatingSystemPropertyParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:1438:1: entryRuleAbstractOperatingSystemProperty returns [EObject current=null] : iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF ;
    public final EObject entryRuleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperatingSystemProperty = null;


        try {
            // InternalDeviceParser.g:1438:72: (iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF )
            // InternalDeviceParser.g:1439:2: iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF
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
    // InternalDeviceParser.g:1445:1: ruleAbstractOperatingSystemProperty returns [EObject current=null] : (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) ;
    public final EObject ruleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject this_NameOperatingSystemProperty_0 = null;

        EObject this_VersionOperatingSystemProperty_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:1451:2: ( (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) )
            // InternalDeviceParser.g:1452:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            {
            // InternalDeviceParser.g:1452:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==HyphenMinus) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==Name) ) {
                    int LA30_2 = input.LA(3);

                    if ( (LA30_2==Os_version) ) {
                        alt30=2;
                    }
                    else if ( (LA30_2==Os_name) ) {
                        alt30=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDeviceParser.g:1453:3: this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty
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
                    // InternalDeviceParser.g:1462:3: this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty
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
    // InternalDeviceParser.g:1474:1: entryRuleNameOperatingSystemProperty returns [EObject current=null] : iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF ;
    public final EObject entryRuleNameOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperatingSystemProperty = null;


        try {
            // InternalDeviceParser.g:1474:68: (iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF )
            // InternalDeviceParser.g:1475:2: iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF
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
    // InternalDeviceParser.g:1481:1: ruleNameOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1487:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1488:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1488:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1489:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1489:3: ()
            // InternalDeviceParser.g:1490:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getNameOperatingSystemPropertyAccess().getNameOperatingSystemPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_26);

                        newLeafNode(otherlv_2, grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1507:3: ( (lv_name_3_0= Os_name ) )
            // InternalDeviceParser.g:1508:4: (lv_name_3_0= Os_name )
            {
            // InternalDeviceParser.g:1508:4: (lv_name_3_0= Os_name )
            // InternalDeviceParser.g:1509:5: lv_name_3_0= Os_name
            {
            lv_name_3_0=(Token)match(input,Os_name,FOLLOW_7);

                                newLeafNode(lv_name_3_0, grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getNameOperatingSystemPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "os_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_4, grammarAccess.getNameOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                        newLeafNode(otherlv_5, grammarAccess.getNameOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:1529:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:1530:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:1530:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:1531:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:1548:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Description) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDeviceParser.g:1549:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:1553:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:1554:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1554:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:1555:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:1573:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Value) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDeviceParser.g:1574:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:1578:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1579:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1579:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:1580:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1606:1: entryRuleVersionOperatingSystemProperty returns [EObject current=null] : iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF ;
    public final EObject entryRuleVersionOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionOperatingSystemProperty = null;


        try {
            // InternalDeviceParser.g:1606:71: (iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF )
            // InternalDeviceParser.g:1607:2: iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF
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
    // InternalDeviceParser.g:1613:1: ruleVersionOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1619:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1620:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1620:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1621:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1621:3: ()
            // InternalDeviceParser.g:1622:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getVersionOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_27);

                        newLeafNode(otherlv_2, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1639:3: ( (lv_name_3_0= Os_version ) )
            // InternalDeviceParser.g:1640:4: (lv_name_3_0= Os_version )
            {
            // InternalDeviceParser.g:1640:4: (lv_name_3_0= Os_version )
            // InternalDeviceParser.g:1641:5: lv_name_3_0= Os_version
            {
            lv_name_3_0=(Token)match(input,Os_version,FOLLOW_7);

                                newLeafNode(lv_name_3_0, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getVersionOperatingSystemPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "os_version");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_4, grammarAccess.getVersionOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                        newLeafNode(otherlv_5, grammarAccess.getVersionOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:1661:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:1662:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:1662:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:1663:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:1680:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Description) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDeviceParser.g:1681:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:1685:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:1686:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1686:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:1687:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:1705:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Value) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDeviceParser.g:1706:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:1710:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1711:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1711:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:1712:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1738:1: entryRuleProcessorResouce returns [EObject current=null] : iv_ruleProcessorResouce= ruleProcessorResouce EOF ;
    public final EObject entryRuleProcessorResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorResouce = null;


        try {
            // InternalDeviceParser.g:1738:57: (iv_ruleProcessorResouce= ruleProcessorResouce EOF )
            // InternalDeviceParser.g:1739:2: iv_ruleProcessorResouce= ruleProcessorResouce EOF
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
    // InternalDeviceParser.g:1745:1: ruleProcessorResouce returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1751:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1752:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1752:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1753:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleProcessorResouceType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1753:3: ()
            // InternalDeviceParser.g:1754:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getProcessorResouceAccess().getProcessorResouceAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getProcessorResouceAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_2, grammarAccess.getProcessorResouceAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1771:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1772:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1772:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1773:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getProcessorResouceAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_4, grammarAccess.getProcessorResouceAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_28);

                        newLeafNode(otherlv_5, grammarAccess.getProcessorResouceAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:1798:3: ( (lv_type_6_0= ruleProcessorResouceType ) )
            // InternalDeviceParser.g:1799:4: (lv_type_6_0= ruleProcessorResouceType )
            {
            // InternalDeviceParser.g:1799:4: (lv_type_6_0= ruleProcessorResouceType )
            // InternalDeviceParser.g:1800:5: lv_type_6_0= ruleProcessorResouceType
            {

                                newCompositeNode(grammarAccess.getProcessorResouceAccess().getTypeProcessorResouceTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_21);
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

            // InternalDeviceParser.g:1817:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Properties) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDeviceParser.g:1818:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_7);

                                    newLeafNode(otherlv_7, grammarAccess.getProcessorResouceAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_8, grammarAccess.getProcessorResouceAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:1826:4: ( (lv_properties_9_0= ruleAbstracProcessorProperty ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==HyphenMinus) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                        case 1 :
                            // InternalDeviceParser.g:1827:5: (lv_properties_9_0= ruleAbstracProcessorProperty )
                            {
                            // InternalDeviceParser.g:1827:5: (lv_properties_9_0= ruleAbstracProcessorProperty )
                            // InternalDeviceParser.g:1828:6: lv_properties_9_0= ruleAbstracProcessorProperty
                            {

                                                    newCompositeNode(grammarAccess.getProcessorResouceAccess().getPropertiesAbstracProcessorPropertyParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_18);
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
                            if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:1858:1: entryRuleAbstracProcessorProperty returns [EObject current=null] : iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF ;
    public final EObject entryRuleAbstracProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstracProcessorProperty = null;


        try {
            // InternalDeviceParser.g:1858:65: (iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF )
            // InternalDeviceParser.g:1859:2: iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF
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
    // InternalDeviceParser.g:1865:1: ruleAbstracProcessorProperty returns [EObject current=null] : (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty ) ;
    public final EObject ruleAbstracProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ArchitectureProcessorProperty_0 = null;

        EObject this_CoreProcessorProperty_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:1871:2: ( (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty ) )
            // InternalDeviceParser.g:1872:2: (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty )
            {
            // InternalDeviceParser.g:1872:2: (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==HyphenMinus) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==Name) ) {
                    int LA37_2 = input.LA(3);

                    if ( (LA37_2==Core_number) ) {
                        alt37=2;
                    }
                    else if ( (LA37_2==Processor_architecture) ) {
                        alt37=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDeviceParser.g:1873:3: this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty
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
                    // InternalDeviceParser.g:1882:3: this_CoreProcessorProperty_1= ruleCoreProcessorProperty
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
    // InternalDeviceParser.g:1894:1: entryRuleArchitectureProcessorProperty returns [EObject current=null] : iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF ;
    public final EObject entryRuleArchitectureProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureProcessorProperty = null;


        try {
            // InternalDeviceParser.g:1894:70: (iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF )
            // InternalDeviceParser.g:1895:2: iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF
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
    // InternalDeviceParser.g:1901:1: ruleArchitectureProcessorProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1907:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1908:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1908:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1909:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1909:3: ()
            // InternalDeviceParser.g:1910:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getArchitectureProcessorPropertyAccess().getArchitectureProcessorPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getArchitectureProcessorPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_29);

                        newLeafNode(otherlv_2, grammarAccess.getArchitectureProcessorPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1927:3: ( (lv_name_3_0= Processor_architecture ) )
            // InternalDeviceParser.g:1928:4: (lv_name_3_0= Processor_architecture )
            {
            // InternalDeviceParser.g:1928:4: (lv_name_3_0= Processor_architecture )
            // InternalDeviceParser.g:1929:5: lv_name_3_0= Processor_architecture
            {
            lv_name_3_0=(Token)match(input,Processor_architecture,FOLLOW_7);

                                newLeafNode(lv_name_3_0, grammarAccess.getArchitectureProcessorPropertyAccess().getNameProcessor_architectureKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getArchitectureProcessorPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "processor_architecture");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_4, grammarAccess.getArchitectureProcessorPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                        newLeafNode(otherlv_5, grammarAccess.getArchitectureProcessorPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:1949:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:1950:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:1950:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:1951:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getArchitectureProcessorPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:1968:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Description) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDeviceParser.g:1969:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getArchitectureProcessorPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:1973:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:1974:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1974:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:1975:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getArchitectureProcessorPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:1993:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Value) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDeviceParser.g:1994:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getArchitectureProcessorPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:1998:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1999:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1999:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:2000:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getArchitectureProcessorPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:2026:1: entryRuleCoreProcessorProperty returns [EObject current=null] : iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF ;
    public final EObject entryRuleCoreProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoreProcessorProperty = null;


        try {
            // InternalDeviceParser.g:2026:62: (iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF )
            // InternalDeviceParser.g:2027:2: iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF
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
    // InternalDeviceParser.g:2033:1: ruleCoreProcessorProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:2039:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:2040:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:2040:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:2041:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:2041:3: ()
            // InternalDeviceParser.g:2042:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCoreProcessorPropertyAccess().getCoreProcessorPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getCoreProcessorPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_30);

                        newLeafNode(otherlv_2, grammarAccess.getCoreProcessorPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:2059:3: ( (lv_name_3_0= Core_number ) )
            // InternalDeviceParser.g:2060:4: (lv_name_3_0= Core_number )
            {
            // InternalDeviceParser.g:2060:4: (lv_name_3_0= Core_number )
            // InternalDeviceParser.g:2061:5: lv_name_3_0= Core_number
            {
            lv_name_3_0=(Token)match(input,Core_number,FOLLOW_7);

                                newLeafNode(lv_name_3_0, grammarAccess.getCoreProcessorPropertyAccess().getNameCore_numberKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getCoreProcessorPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "core_number");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                        newLeafNode(this_INDENT_4, grammarAccess.getCoreProcessorPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                        newLeafNode(otherlv_5, grammarAccess.getCoreProcessorPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:2081:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:2082:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:2082:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:2083:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getCoreProcessorPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:2100:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Description) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDeviceParser.g:2101:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_7, grammarAccess.getCoreProcessorPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:2105:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:2106:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2106:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:2107:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getCoreProcessorPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:2125:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Value) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDeviceParser.g:2126:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_9, grammarAccess.getCoreProcessorPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:2130:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2131:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2131:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:2132:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getCoreProcessorPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:2158:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalDeviceParser.g:2158:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalDeviceParser.g:2159:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalDeviceParser.g:2165:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2171:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalDeviceParser.g:2172:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalDeviceParser.g:2172:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt42=5;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalDeviceParser.g:2173:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalDeviceParser.g:2182:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalDeviceParser.g:2191:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalDeviceParser.g:2200:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalDeviceParser.g:2209:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalDeviceParser.g:2221:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalDeviceParser.g:2221:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalDeviceParser.g:2222:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalDeviceParser.g:2228:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:2234:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalDeviceParser.g:2235:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalDeviceParser.g:2235:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt43=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt43=1;
                }
                break;
            case MaximumKind:
                {
                alt43=2;
                }
                break;
            case MinimumKind:
                {
                alt43=3;
                }
                break;
            case RangeKind:
                {
                alt43=4;
                }
                break;
            case SelectionKind:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalDeviceParser.g:2236:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalDeviceParser.g:2245:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalDeviceParser.g:2254:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalDeviceParser.g:2263:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalDeviceParser.g:2272:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalDeviceParser.g:2284:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalDeviceParser.g:2284:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalDeviceParser.g:2285:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalDeviceParser.g:2291:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:2297:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:2298:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:2298:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalDeviceParser.g:2299:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalDeviceParser.g:2310:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:2311:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:2311:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:2312:5: lv_name_2_0= ruleEString
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

            // InternalDeviceParser.g:2337:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:2338:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:2338:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalDeviceParser.g:2339:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:2356:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Description) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDeviceParser.g:2357:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:2361:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:2362:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2362:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:2363:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_32);
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

            // InternalDeviceParser.g:2381:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Value) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDeviceParser.g:2382:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalDeviceParser.g:2386:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2387:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2387:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:2388:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_33);
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

            // InternalDeviceParser.g:2406:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DEDENT) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==RULE_DEDENT) ) {
                    int LA46_3 = input.LA(3);

                    if ( (LA46_3==RULE_DEDENT) ) {
                        int LA46_5 = input.LA(4);

                        if ( (LA46_5==RULE_DEDENT) ) {
                            int LA46_6 = input.LA(5);

                            if ( (LA46_6==CommunicationConnection||LA46_6==ComputationResouce||LA46_6==RULE_DEDENT) ) {
                                alt46=1;
                            }
                        }
                        else if ( (LA46_5==EOF||LA46_5==HyphenMinus) ) {
                            alt46=1;
                        }
                    }
                }
                else if ( (LA46_1==EOF||LA46_1==HyphenMinus) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalDeviceParser.g:2407:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalDeviceParser.g:2416:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalDeviceParser.g:2416:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalDeviceParser.g:2417:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalDeviceParser.g:2423:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:2429:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:2430:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:2430:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalDeviceParser.g:2431:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalDeviceParser.g:2442:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:2443:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:2443:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:2444:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_34);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalDeviceParser.g:2469:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalDeviceParser.g:2470:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalDeviceParser.g:2470:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalDeviceParser.g:2471:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:2488:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Description) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDeviceParser.g:2489:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:2493:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:2494:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2494:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:2495:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_32);
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

            // InternalDeviceParser.g:2513:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Value) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDeviceParser.g:2514:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalDeviceParser.g:2518:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2519:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2519:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:2520:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_33);
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

            // InternalDeviceParser.g:2538:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_DEDENT) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==EOF||LA49_1==HyphenMinus) ) {
                    alt49=1;
                }
                else if ( (LA49_1==RULE_DEDENT) ) {
                    int LA49_4 = input.LA(3);

                    if ( (LA49_4==RULE_DEDENT) ) {
                        int LA49_5 = input.LA(4);

                        if ( (LA49_5==RULE_DEDENT) ) {
                            int LA49_6 = input.LA(5);

                            if ( (LA49_6==CommunicationConnection||LA49_6==ComputationResouce||LA49_6==RULE_DEDENT) ) {
                                alt49=1;
                            }
                        }
                        else if ( (LA49_5==EOF||LA49_5==HyphenMinus) ) {
                            alt49=1;
                        }
                    }
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalDeviceParser.g:2539:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalDeviceParser.g:2548:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalDeviceParser.g:2548:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalDeviceParser.g:2549:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalDeviceParser.g:2555:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:2561:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:2562:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:2562:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalDeviceParser.g:2563:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalDeviceParser.g:2574:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:2575:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:2575:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:2576:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_35);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalDeviceParser.g:2601:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalDeviceParser.g:2602:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalDeviceParser.g:2602:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalDeviceParser.g:2603:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:2620:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Description) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDeviceParser.g:2621:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:2625:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:2626:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2626:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:2627:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_32);
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

            // InternalDeviceParser.g:2645:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Value) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDeviceParser.g:2646:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_13);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalDeviceParser.g:2650:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2651:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2651:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:2652:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_33);
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

            // InternalDeviceParser.g:2670:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_DEDENT) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_DEDENT) ) {
                    int LA52_3 = input.LA(3);

                    if ( (LA52_3==RULE_DEDENT) ) {
                        int LA52_5 = input.LA(4);

                        if ( (LA52_5==RULE_DEDENT) ) {
                            int LA52_6 = input.LA(5);

                            if ( (LA52_6==CommunicationConnection||LA52_6==ComputationResouce||LA52_6==RULE_DEDENT) ) {
                                alt52=1;
                            }
                        }
                        else if ( (LA52_5==EOF||LA52_5==HyphenMinus) ) {
                            alt52=1;
                        }
                    }
                }
                else if ( (LA52_1==EOF||LA52_1==HyphenMinus) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalDeviceParser.g:2671:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalDeviceParser.g:2680:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalDeviceParser.g:2680:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalDeviceParser.g:2681:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalDeviceParser.g:2687:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:2693:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:2694:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:2694:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalDeviceParser.g:2695:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalDeviceParser.g:2706:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:2707:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:2707:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:2708:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_36);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalDeviceParser.g:2733:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalDeviceParser.g:2734:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalDeviceParser.g:2734:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalDeviceParser.g:2735:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:2752:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Description) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDeviceParser.g:2753:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:2757:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:2758:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2758:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:2759:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_32);
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

            // InternalDeviceParser.g:2777:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Value) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDeviceParser.g:2778:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
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

                    // InternalDeviceParser.g:2793:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2794:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2794:5: (lv_value_11_0= rulePropertyValue )
                    // InternalDeviceParser.g:2795:6: lv_value_11_0= rulePropertyValue
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

                    // InternalDeviceParser.g:2812:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==HyphenMinus) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                        case 1 :
                            // InternalDeviceParser.g:2813:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_13);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalDeviceParser.g:2820:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalDeviceParser.g:2821:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalDeviceParser.g:2821:6: (lv_value_13_0= rulePropertyValue )
                            // InternalDeviceParser.g:2822:7: lv_value_13_0= rulePropertyValue
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
                            break loop54;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_33);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalDeviceParser.g:2845:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_DEDENT) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==EOF||LA56_1==HyphenMinus) ) {
                    alt56=1;
                }
                else if ( (LA56_1==RULE_DEDENT) ) {
                    int LA56_4 = input.LA(3);

                    if ( (LA56_4==RULE_DEDENT) ) {
                        int LA56_5 = input.LA(4);

                        if ( (LA56_5==RULE_DEDENT) ) {
                            int LA56_6 = input.LA(5);

                            if ( (LA56_6==CommunicationConnection||LA56_6==ComputationResouce||LA56_6==RULE_DEDENT) ) {
                                alt56=1;
                            }
                        }
                        else if ( (LA56_5==EOF||LA56_5==HyphenMinus) ) {
                            alt56=1;
                        }
                    }
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalDeviceParser.g:2846:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalDeviceParser.g:2855:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalDeviceParser.g:2855:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalDeviceParser.g:2856:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalDeviceParser.g:2862:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:2868:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:2869:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:2869:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalDeviceParser.g:2870:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalDeviceParser.g:2881:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:2882:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:2882:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:2883:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_37);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalDeviceParser.g:2908:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalDeviceParser.g:2909:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalDeviceParser.g:2909:4: (lv_kind_5_0= ruleRangeKind )
            // InternalDeviceParser.g:2910:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:2927:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Description) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDeviceParser.g:2928:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:2932:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:2933:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2933:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:2934:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_32);
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

            // InternalDeviceParser.g:2952:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Value) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDeviceParser.g:2953:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
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

                    // InternalDeviceParser.g:2968:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2969:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2969:5: (lv_value_11_0= rulePropertyValue )
                    // InternalDeviceParser.g:2970:6: lv_value_11_0= rulePropertyValue
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

                    // InternalDeviceParser.g:2994:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2995:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2995:5: (lv_value_13_0= rulePropertyValue )
                    // InternalDeviceParser.g:2996:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_33);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalDeviceParser.g:3018:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_DEDENT) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==EOF||LA59_1==HyphenMinus) ) {
                    alt59=1;
                }
                else if ( (LA59_1==RULE_DEDENT) ) {
                    int LA59_4 = input.LA(3);

                    if ( (LA59_4==RULE_DEDENT) ) {
                        int LA59_5 = input.LA(4);

                        if ( (LA59_5==RULE_DEDENT) ) {
                            int LA59_6 = input.LA(5);

                            if ( (LA59_6==CommunicationConnection||LA59_6==ComputationResouce||LA59_6==RULE_DEDENT) ) {
                                alt59=1;
                            }
                        }
                        else if ( (LA59_5==EOF||LA59_5==HyphenMinus) ) {
                            alt59=1;
                        }
                    }
                }
            }
            switch (alt59) {
                case 1 :
                    // InternalDeviceParser.g:3019:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalDeviceParser.g:3028:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalDeviceParser.g:3028:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalDeviceParser.g:3029:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalDeviceParser.g:3035:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) ;
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
            // InternalDeviceParser.g:3041:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) )
            // InternalDeviceParser.g:3042:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            {
            // InternalDeviceParser.g:3042:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            int alt60=6;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt60=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt60=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt60=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt60=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt60=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt60=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalDeviceParser.g:3043:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalDeviceParser.g:3052:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalDeviceParser.g:3061:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalDeviceParser.g:3070:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalDeviceParser.g:3079:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalDeviceParser.g:3088:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
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
    // InternalDeviceParser.g:3100:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalDeviceParser.g:3100:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalDeviceParser.g:3101:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalDeviceParser.g:3107:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3113:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalDeviceParser.g:3114:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalDeviceParser.g:3114:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalDeviceParser.g:3115:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalDeviceParser.g:3115:3: (lv_value_0_0= ruleInteger0 )
            // InternalDeviceParser.g:3116:4: lv_value_0_0= ruleInteger0
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
    // InternalDeviceParser.g:3136:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalDeviceParser.g:3136:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:3137:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalDeviceParser.g:3143:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3149:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalDeviceParser.g:3150:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalDeviceParser.g:3150:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalDeviceParser.g:3151:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalDeviceParser.g:3151:3: (lv_value_0_0= ruleDouble0 )
            // InternalDeviceParser.g:3152:4: lv_value_0_0= ruleDouble0
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
    // InternalDeviceParser.g:3172:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalDeviceParser.g:3172:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalDeviceParser.g:3173:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalDeviceParser.g:3179:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3185:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDeviceParser.g:3186:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDeviceParser.g:3186:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDeviceParser.g:3187:3: (lv_value_0_0= ruleEString )
            {
            // InternalDeviceParser.g:3187:3: (lv_value_0_0= ruleEString )
            // InternalDeviceParser.g:3188:4: lv_value_0_0= ruleEString
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
    // InternalDeviceParser.g:3208:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalDeviceParser.g:3208:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalDeviceParser.g:3209:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalDeviceParser.g:3215:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3221:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalDeviceParser.g:3222:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalDeviceParser.g:3222:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalDeviceParser.g:3223:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalDeviceParser.g:3223:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalDeviceParser.g:3224:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalDeviceParser.g:3244:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalDeviceParser.g:3244:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalDeviceParser.g:3245:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalDeviceParser.g:3251:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3257:2: (this_ResourceType_0= ruleResourceType )
            // InternalDeviceParser.g:3258:2: this_ResourceType_0= ruleResourceType
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
    // InternalDeviceParser.g:3269:1: entryRuleOpertingSystemResouceType returns [EObject current=null] : iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF ;
    public final EObject entryRuleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemResouceType = null;


        try {
            // InternalDeviceParser.g:3269:66: (iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF )
            // InternalDeviceParser.g:3270:2: iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF
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
    // InternalDeviceParser.g:3276:1: ruleOpertingSystemResouceType returns [EObject current=null] : (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) ;
    public final EObject ruleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystem_0 = null;

        EObject this_MacOSOpertingSystem_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3282:2: ( (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) )
            // InternalDeviceParser.g:3283:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            {
            // InternalDeviceParser.g:3283:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LinuxOpertingSystem) ) {
                alt61=1;
            }
            else if ( (LA61_0==MacOSOpertingSystem) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalDeviceParser.g:3284:3: this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem
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
                    // InternalDeviceParser.g:3293:3: this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem
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
    // InternalDeviceParser.g:3305:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalDeviceParser.g:3305:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalDeviceParser.g:3306:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalDeviceParser.g:3312:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3318:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:3319:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:3319:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDeviceParser.g:3320:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDeviceParser.g:3320:3: ()
            // InternalDeviceParser.g:3321:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalDeviceParser.g:3327:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeviceParser.g:3328:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeviceParser.g:3328:4: (lv_name_1_0= ruleEString )
            // InternalDeviceParser.g:3329:5: lv_name_1_0= ruleEString
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
    // InternalDeviceParser.g:3350:1: entryRuleProcessorResouceType returns [EObject current=null] : iv_ruleProcessorResouceType= ruleProcessorResouceType EOF ;
    public final EObject entryRuleProcessorResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorResouceType = null;


        try {
            // InternalDeviceParser.g:3350:61: (iv_ruleProcessorResouceType= ruleProcessorResouceType EOF )
            // InternalDeviceParser.g:3351:2: iv_ruleProcessorResouceType= ruleProcessorResouceType EOF
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
    // InternalDeviceParser.g:3357:1: ruleProcessorResouceType returns [EObject current=null] : ( () otherlv_1= Processor ) ;
    public final EObject ruleProcessorResouceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3363:2: ( ( () otherlv_1= Processor ) )
            // InternalDeviceParser.g:3364:2: ( () otherlv_1= Processor )
            {
            // InternalDeviceParser.g:3364:2: ( () otherlv_1= Processor )
            // InternalDeviceParser.g:3365:3: () otherlv_1= Processor
            {
            // InternalDeviceParser.g:3365:3: ()
            // InternalDeviceParser.g:3366:4:
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
    // InternalDeviceParser.g:3380:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalDeviceParser.g:3380:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalDeviceParser.g:3381:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalDeviceParser.g:3387:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3393:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalDeviceParser.g:3394:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalDeviceParser.g:3394:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalDeviceParser.g:3395:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalDeviceParser.g:3395:3: ()
            // InternalDeviceParser.g:3396:4:
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
    // InternalDeviceParser.g:3410:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalDeviceParser.g:3410:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalDeviceParser.g:3411:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalDeviceParser.g:3417:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3423:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalDeviceParser.g:3424:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalDeviceParser.g:3424:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalDeviceParser.g:3425:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalDeviceParser.g:3425:3: ()
            // InternalDeviceParser.g:3426:4:
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
    // InternalDeviceParser.g:3440:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalDeviceParser.g:3440:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalDeviceParser.g:3441:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalDeviceParser.g:3447:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3453:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:3454:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:3454:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDeviceParser.g:3455:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDeviceParser.g:3455:3: ()
            // InternalDeviceParser.g:3456:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalDeviceParser.g:3462:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeviceParser.g:3463:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeviceParser.g:3463:4: (lv_name_1_0= ruleEString )
            // InternalDeviceParser.g:3464:5: lv_name_1_0= ruleEString
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
    // InternalDeviceParser.g:3485:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalDeviceParser.g:3485:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalDeviceParser.g:3486:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalDeviceParser.g:3492:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3498:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalDeviceParser.g:3499:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalDeviceParser.g:3499:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Ethernet) ) {
                alt62=1;
            }
            else if ( (LA62_0==Wlan) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalDeviceParser.g:3500:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalDeviceParser.g:3509:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalDeviceParser.g:3521:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalDeviceParser.g:3521:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalDeviceParser.g:3522:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalDeviceParser.g:3528:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3534:2: ( ( () otherlv_1= Ethernet ) )
            // InternalDeviceParser.g:3535:2: ( () otherlv_1= Ethernet )
            {
            // InternalDeviceParser.g:3535:2: ( () otherlv_1= Ethernet )
            // InternalDeviceParser.g:3536:3: () otherlv_1= Ethernet
            {
            // InternalDeviceParser.g:3536:3: ()
            // InternalDeviceParser.g:3537:4:
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
    // InternalDeviceParser.g:3551:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalDeviceParser.g:3551:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalDeviceParser.g:3552:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalDeviceParser.g:3558:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3564:2: ( ( () otherlv_1= Wlan ) )
            // InternalDeviceParser.g:3565:2: ( () otherlv_1= Wlan )
            {
            // InternalDeviceParser.g:3565:2: ( () otherlv_1= Wlan )
            // InternalDeviceParser.g:3566:3: () otherlv_1= Wlan
            {
            // InternalDeviceParser.g:3566:3: ()
            // InternalDeviceParser.g:3567:4:
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
    // InternalDeviceParser.g:3581:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalDeviceParser.g:3581:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalDeviceParser.g:3582:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalDeviceParser.g:3588:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3594:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalDeviceParser.g:3595:2: ( () otherlv_1= AttributeKind )
            {
            // InternalDeviceParser.g:3595:2: ( () otherlv_1= AttributeKind )
            // InternalDeviceParser.g:3596:3: () otherlv_1= AttributeKind
            {
            // InternalDeviceParser.g:3596:3: ()
            // InternalDeviceParser.g:3597:4:
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
    // InternalDeviceParser.g:3611:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalDeviceParser.g:3611:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalDeviceParser.g:3612:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalDeviceParser.g:3618:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3624:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalDeviceParser.g:3625:2: ( () otherlv_1= MaximumKind )
            {
            // InternalDeviceParser.g:3625:2: ( () otherlv_1= MaximumKind )
            // InternalDeviceParser.g:3626:3: () otherlv_1= MaximumKind
            {
            // InternalDeviceParser.g:3626:3: ()
            // InternalDeviceParser.g:3627:4:
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
    // InternalDeviceParser.g:3641:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalDeviceParser.g:3641:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalDeviceParser.g:3642:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalDeviceParser.g:3648:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3654:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalDeviceParser.g:3655:2: ( () otherlv_1= MinimumKind )
            {
            // InternalDeviceParser.g:3655:2: ( () otherlv_1= MinimumKind )
            // InternalDeviceParser.g:3656:3: () otherlv_1= MinimumKind
            {
            // InternalDeviceParser.g:3656:3: ()
            // InternalDeviceParser.g:3657:4:
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
    // InternalDeviceParser.g:3671:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalDeviceParser.g:3671:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalDeviceParser.g:3672:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalDeviceParser.g:3678:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3684:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalDeviceParser.g:3685:2: ( () otherlv_1= SelectionKind )
            {
            // InternalDeviceParser.g:3685:2: ( () otherlv_1= SelectionKind )
            // InternalDeviceParser.g:3686:3: () otherlv_1= SelectionKind
            {
            // InternalDeviceParser.g:3686:3: ()
            // InternalDeviceParser.g:3687:4:
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
    // InternalDeviceParser.g:3701:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalDeviceParser.g:3701:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalDeviceParser.g:3702:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalDeviceParser.g:3708:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3714:2: ( ( () otherlv_1= RangeKind ) )
            // InternalDeviceParser.g:3715:2: ( () otherlv_1= RangeKind )
            {
            // InternalDeviceParser.g:3715:2: ( () otherlv_1= RangeKind )
            // InternalDeviceParser.g:3716:3: () otherlv_1= RangeKind
            {
            // InternalDeviceParser.g:3716:3: ()
            // InternalDeviceParser.g:3717:4:
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
    // InternalDeviceParser.g:3731:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalDeviceParser.g:3731:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalDeviceParser.g:3732:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalDeviceParser.g:3738:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3744:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalDeviceParser.g:3745:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalDeviceParser.g:3745:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalDeviceParser.g:3746:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalDeviceParser.g:3746:3: ()
            // InternalDeviceParser.g:3747:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                                current);


            }

            // InternalDeviceParser.g:3753:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalDeviceParser.g:3754:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalDeviceParser.g:3754:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalDeviceParser.g:3755:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalDeviceParser.g:3776:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalDeviceParser.g:3776:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalDeviceParser.g:3777:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalDeviceParser.g:3783:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalDeviceParser.g:3789:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalDeviceParser.g:3790:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalDeviceParser.g:3790:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalDeviceParser.g:3791:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalDeviceParser.g:3791:3: ()
            // InternalDeviceParser.g:3792:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                                current);


            }

            // InternalDeviceParser.g:3798:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalDeviceParser.g:3799:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalDeviceParser.g:3799:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalDeviceParser.g:3800:5: lv_value_1_0= ruleUbuntuVersion
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
    // InternalDeviceParser.g:3821:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalDeviceParser.g:3821:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalDeviceParser.g:3822:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalDeviceParser.g:3828:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3834:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalDeviceParser.g:3835:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalDeviceParser.g:3845:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalDeviceParser.g:3845:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalDeviceParser.g:3846:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalDeviceParser.g:3852:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3858:2: (this_DECINT_0= RULE_DECINT )
            // InternalDeviceParser.g:3859:2: this_DECINT_0= RULE_DECINT
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
    // InternalDeviceParser.g:3869:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDeviceParser.g:3869:47: (iv_ruleEString= ruleEString EOF )
            // InternalDeviceParser.g:3870:2: iv_ruleEString= ruleEString EOF
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
    // InternalDeviceParser.g:3876:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3882:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDeviceParser.g:3883:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDeviceParser.g:3883:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalDeviceParser.g:3884:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:3892:3: this_ID_1= RULE_ID
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
    // InternalDeviceParser.g:3903:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:3905:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalDeviceParser.g:3906:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalDeviceParser.g:3915:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:3922:2: (kw= HyphenMinus )
            // InternalDeviceParser.g:3923:2: kw= HyphenMinus
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
    // InternalDeviceParser.g:3934:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3940:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalDeviceParser.g:3941:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalDeviceParser.g:3941:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==X86) ) {
                alt64=1;
            }
            else if ( (LA64_0==Arm64) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalDeviceParser.g:3942:3: (enumLiteral_0= X86 )
                    {
                    // InternalDeviceParser.g:3942:3: (enumLiteral_0= X86 )
                    // InternalDeviceParser.g:3943:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                                    current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:3950:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalDeviceParser.g:3950:3: (enumLiteral_1= Arm64 )
                    // InternalDeviceParser.g:3951:4: enumLiteral_1= Arm64
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
    // InternalDeviceParser.g:3961:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3967:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalDeviceParser.g:3968:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalDeviceParser.g:3968:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Ubuntu) ) {
                alt65=1;
            }
            else if ( (LA65_0==Debian) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalDeviceParser.g:3969:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalDeviceParser.g:3969:3: (enumLiteral_0= Ubuntu )
                    // InternalDeviceParser.g:3970:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                                    current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:3977:3: (enumLiteral_1= Debian )
                    {
                    // InternalDeviceParser.g:3977:3: (enumLiteral_1= Debian )
                    // InternalDeviceParser.g:3978:4: enumLiteral_1= Debian
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
    // InternalDeviceParser.g:3988:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalDeviceParser.g:3994:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalDeviceParser.g:3995:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalDeviceParser.g:3995:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Focal) ) {
                alt66=1;
            }
            else if ( (LA66_0==Jammy) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalDeviceParser.g:3996:3: (enumLiteral_0= Focal )
                    {
                    // InternalDeviceParser.g:3996:3: (enumLiteral_0= Focal )
                    // InternalDeviceParser.g:3997:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                                    current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:4004:3: (enumLiteral_1= Jammy )
                    {
                    // InternalDeviceParser.g:4004:3: (enumLiteral_1= Jammy )
                    // InternalDeviceParser.g:4005:4: enumLiteral_1= Jammy
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


    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\47\1\42\1\56\2\54\1\41\1\13\5\uffff";
    static final String dfa_3s = "\1\47\1\42\1\60\2\54\1\41\1\25\5\uffff";
    static final String dfa_4s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\2\uffff\1\11\1\10\4\uffff\1\12",
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

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2172:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200020002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00014641D8000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000000410L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000610L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000210L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200020002002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200020000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000200000L});

}
