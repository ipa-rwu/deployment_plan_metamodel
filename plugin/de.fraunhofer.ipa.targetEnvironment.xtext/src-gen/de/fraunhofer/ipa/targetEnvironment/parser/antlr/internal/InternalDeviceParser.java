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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "ComputationDeviceType", "Processor_architecture", "LinuxOpertingSystem", "MacOSOpertingSystem", "ComputationResouce", "DeviceResouce", "Interface_name", "AttributeKind", "SelectionKind", "Device_volume", "Identity_name", "Description", "DeviceType", "MaximumKind", "MinimumKind", "Core_number", "Mac_address", "Properties", "Subnet_mask", "Dns_server", "Ip_address", "Os_version", "Processor", "RangeKind", "Container", "Ethernet", "Gateway", "Os_name", "Debian", "Ubuntu", "Value", "Arm64", "Focal", "Jammy", "Kind", "Name", "Type", "Wlan", "Port", "HyphenMinusHyphenMinusHyphenMinus", "Usb", "X86", "HyphenMinus", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Core_number=20;
    public static final int Port=43;
    public static final int ComputationResouce=9;
    public static final int AttributeKind=12;
    public static final int Name=40;
    public static final int Container=29;
    public static final int Debian=33;
    public static final int Kind=39;
    public static final int Ubuntu=34;
    public static final int RULE_DEDENT=53;
    public static final int LinuxOpertingSystem=7;
    public static final int RULE_ID=54;
    public static final int RULE_DIGIT=48;
    public static final int HyphenMinusHyphenMinusHyphenMinus=44;
    public static final int Interface_name=11;
    public static final int SelectionKind=13;
    public static final int DeviceType=17;
    public static final int Subnet_mask=23;
    public static final int Arm64=36;
    public static final int RULE_INT=55;
    public static final int Ethernet=30;
    public static final int Value=35;
    public static final int RULE_ML_COMMENT=57;
    public static final int Dns_server=24;
    public static final int Description=16;
    public static final int Processor=27;
    public static final int RULE_STRING=56;
    public static final int Focal=37;
    public static final int Wlan=42;
    public static final int Properties=22;
    public static final int DeviceResouce=10;
    public static final int RULE_SL_COMMENT=51;
    public static final int CommunicationConnection=4;
    public static final int Os_name=32;
    public static final int HyphenMinus=47;
    public static final int RULE_DOUBLE=50;
    public static final int Device_volume=14;
    public static final int Gateway=31;
    public static final int X86=46;
    public static final int RULE_DECINT=49;
    public static final int MinimumKind=19;
    public static final int EOF=-1;
    public static final int RULE_INDENT=52;
    public static final int Mac_address=21;
    public static final int Jammy=38;
    public static final int Usb=45;
    public static final int RULE_WS=58;
    public static final int MaximumKind=18;
    public static final int RULE_ANY_OTHER=59;
    public static final int ComputationDeviceType=5;
    public static final int Processor_architecture=6;
    public static final int Identity_name=15;
    public static final int RangeKind=28;
    public static final int Os_version=26;
    public static final int Type=41;
    public static final int MacOSOpertingSystem=8;
    public static final int Ip_address=25;

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
    // InternalDeviceParser.g:164:1: ruleAbstractCommunicationConnection returns [EObject current=null] : (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection ) ;
    public final EObject ruleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationConnection_0 = null;

        EObject this_NetworkConnection_1 = null;

        EObject this_UsbConnection_2 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:170:2: ( (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection ) )
            // InternalDeviceParser.g:171:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection )
            {
            // InternalDeviceParser.g:171:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection )
            int alt3=3;
            alt3 = dfa3.predict(input);
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
                case 3 :
                    // InternalDeviceParser.g:190:3: this_UsbConnection_2= ruleUsbConnection
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
    // InternalDeviceParser.g:202:1: entryRuleAbstractNetworkProperty returns [EObject current=null] : iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF ;
    public final EObject entryRuleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetworkProperty = null;


        try {
            // InternalDeviceParser.g:202:64: (iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF )
            // InternalDeviceParser.g:203:2: iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF
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
    // InternalDeviceParser.g:209:1: ruleAbstractNetworkProperty returns [EObject current=null] : (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty ) ;
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
            // InternalDeviceParser.g:215:2: ( (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty ) )
            // InternalDeviceParser.g:216:2: (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty )
            {
            // InternalDeviceParser.g:216:2: (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalDeviceParser.g:217:3: this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty
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
                    // InternalDeviceParser.g:226:3: this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty
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
                    // InternalDeviceParser.g:235:3: this_AddressNetworkProperty_2= ruleAddressNetworkProperty
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
                    // InternalDeviceParser.g:244:3: this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty
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
                    // InternalDeviceParser.g:253:3: this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty
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
                    // InternalDeviceParser.g:262:3: this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty
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
                    // InternalDeviceParser.g:271:3: this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty
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
                    // InternalDeviceParser.g:280:3: this_PortNetworkProperty_7= rulePortNetworkProperty
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
    // InternalDeviceParser.g:292:1: entryRuleAbstractUsbProperty returns [EObject current=null] : iv_ruleAbstractUsbProperty= ruleAbstractUsbProperty EOF ;
    public final EObject entryRuleAbstractUsbProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractUsbProperty = null;


        try {
            // InternalDeviceParser.g:292:60: (iv_ruleAbstractUsbProperty= ruleAbstractUsbProperty EOF )
            // InternalDeviceParser.g:293:2: iv_ruleAbstractUsbProperty= ruleAbstractUsbProperty EOF
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
    // InternalDeviceParser.g:299:1: ruleAbstractUsbProperty returns [EObject current=null] : this_DeviceVolumeUsbProperty_0= ruleDeviceVolumeUsbProperty ;
    public final EObject ruleAbstractUsbProperty() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceVolumeUsbProperty_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:305:2: (this_DeviceVolumeUsbProperty_0= ruleDeviceVolumeUsbProperty )
            // InternalDeviceParser.g:306:2: this_DeviceVolumeUsbProperty_0= ruleDeviceVolumeUsbProperty
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
    // InternalDeviceParser.g:317:1: entryRuleInterfaceNetworkProperty returns [EObject current=null] : iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF ;
    public final EObject entryRuleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceNetworkProperty = null;


        try {
            // InternalDeviceParser.g:317:65: (iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF )
            // InternalDeviceParser.g:318:2: iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF
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
    // InternalDeviceParser.g:324:1: ruleInterfaceNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:330:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:331:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:331:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:332:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Interface_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:332:3: ()
            // InternalDeviceParser.g:333:4:
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

            // InternalDeviceParser.g:350:3: ( (lv_name_3_0= Interface_name ) )
            // InternalDeviceParser.g:351:4: (lv_name_3_0= Interface_name )
            {
            // InternalDeviceParser.g:351:4: (lv_name_3_0= Interface_name )
            // InternalDeviceParser.g:352:5: lv_name_3_0= Interface_name
            {
            lv_name_3_0=(Token)match(input,Interface_name,FOLLOW_7);

                      newLeafNode(lv_name_3_0, grammarAccess.getInterfaceNetworkPropertyAccess().getNameInterface_nameKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getInterfaceNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "interface_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_4, grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                  newLeafNode(otherlv_5, grammarAccess.getInterfaceNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:372:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:373:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:373:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:374:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:391:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Description) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeviceParser.g:392:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:396:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:397:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:397:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:398:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:416:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Value) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:417:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_9, grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:421:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:422:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:422:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:423:6: lv_value_10_0= rulePropertyValue
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
    // InternalDeviceParser.g:449:1: entryRuleAddressNetworkProperty returns [EObject current=null] : iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF ;
    public final EObject entryRuleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressNetworkProperty = null;


        try {
            // InternalDeviceParser.g:449:63: (iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF )
            // InternalDeviceParser.g:450:2: iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF
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
    // InternalDeviceParser.g:456:1: ruleAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:462:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:463:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:463:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:464:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Ip_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:464:3: ()
            // InternalDeviceParser.g:465:4:
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

            // InternalDeviceParser.g:482:3: ( (lv_name_3_0= Ip_address ) )
            // InternalDeviceParser.g:483:4: (lv_name_3_0= Ip_address )
            {
            // InternalDeviceParser.g:483:4: (lv_name_3_0= Ip_address )
            // InternalDeviceParser.g:484:5: lv_name_3_0= Ip_address
            {
            lv_name_3_0=(Token)match(input,Ip_address,FOLLOW_7);

                      newLeafNode(lv_name_3_0, grammarAccess.getAddressNetworkPropertyAccess().getNameIp_addressKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getAddressNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "ip_address");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_4, grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                  newLeafNode(otherlv_5, grammarAccess.getAddressNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:504:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:505:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:505:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:506:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:523:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Description) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceParser.g:524:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:528:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:529:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:529:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:530:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:548:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Value) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeviceParser.g:549:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_9, grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:553:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:554:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:554:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:555:6: lv_value_10_0= rulePropertyValue
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


    // $ANTLR start "entryRuleIdentityNameNetworkProperty"
    // InternalDeviceParser.g:581:1: entryRuleIdentityNameNetworkProperty returns [EObject current=null] : iv_ruleIdentityNameNetworkProperty= ruleIdentityNameNetworkProperty EOF ;
    public final EObject entryRuleIdentityNameNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentityNameNetworkProperty = null;


        try {
            // InternalDeviceParser.g:581:68: (iv_ruleIdentityNameNetworkProperty= ruleIdentityNameNetworkProperty EOF )
            // InternalDeviceParser.g:582:2: iv_ruleIdentityNameNetworkProperty= ruleIdentityNameNetworkProperty EOF
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
    // InternalDeviceParser.g:588:1: ruleIdentityNameNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:594:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalDeviceParser.g:595:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalDeviceParser.g:595:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalDeviceParser.g:596:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Identity_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalDeviceParser.g:596:3: ()
            // InternalDeviceParser.g:597:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getIdentityNameNetworkPropertyAccess().getIdentityNameNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getIdentityNameNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_16);

                  newLeafNode(otherlv_2, grammarAccess.getIdentityNameNetworkPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:614:3: ( (lv_name_3_0= Identity_name ) )
            // InternalDeviceParser.g:615:4: (lv_name_3_0= Identity_name )
            {
            // InternalDeviceParser.g:615:4: (lv_name_3_0= Identity_name )
            // InternalDeviceParser.g:616:5: lv_name_3_0= Identity_name
            {
            lv_name_3_0=(Token)match(input,Identity_name,FOLLOW_7);

                      newLeafNode(lv_name_3_0, grammarAccess.getIdentityNameNetworkPropertyAccess().getNameIdentity_nameKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getIdentityNameNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "identity_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_4, grammarAccess.getIdentityNameNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                  newLeafNode(otherlv_5, grammarAccess.getIdentityNameNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:636:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:637:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:637:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:638:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getIdentityNameNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_17);
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

            // InternalDeviceParser.g:655:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Description) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeviceParser.g:656:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getIdentityNameNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:660:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:661:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:661:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:662:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getIdentityNameNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:688:1: entryRuleMacAddressNetworkProperty returns [EObject current=null] : iv_ruleMacAddressNetworkProperty= ruleMacAddressNetworkProperty EOF ;
    public final EObject entryRuleMacAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacAddressNetworkProperty = null;


        try {
            // InternalDeviceParser.g:688:66: (iv_ruleMacAddressNetworkProperty= ruleMacAddressNetworkProperty EOF )
            // InternalDeviceParser.g:689:2: iv_ruleMacAddressNetworkProperty= ruleMacAddressNetworkProperty EOF
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
    // InternalDeviceParser.g:695:1: ruleMacAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:701:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalDeviceParser.g:702:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalDeviceParser.g:702:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalDeviceParser.g:703:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Mac_address ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalDeviceParser.g:703:3: ()
            // InternalDeviceParser.g:704:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getMacAddressNetworkPropertyAccess().getMacAddressNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getMacAddressNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_18);

                  newLeafNode(otherlv_2, grammarAccess.getMacAddressNetworkPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:721:3: ( (lv_name_3_0= Mac_address ) )
            // InternalDeviceParser.g:722:4: (lv_name_3_0= Mac_address )
            {
            // InternalDeviceParser.g:722:4: (lv_name_3_0= Mac_address )
            // InternalDeviceParser.g:723:5: lv_name_3_0= Mac_address
            {
            lv_name_3_0=(Token)match(input,Mac_address,FOLLOW_7);

                      newLeafNode(lv_name_3_0, grammarAccess.getMacAddressNetworkPropertyAccess().getNameMac_addressKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getMacAddressNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "mac_address");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_4, grammarAccess.getMacAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                  newLeafNode(otherlv_5, grammarAccess.getMacAddressNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:743:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:744:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:744:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:745:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getMacAddressNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_17);
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

            // InternalDeviceParser.g:762:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Description) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceParser.g:763:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getMacAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:767:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:768:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:768:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:769:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getMacAddressNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:795:1: entryRuleGatewayNetworkProperty returns [EObject current=null] : iv_ruleGatewayNetworkProperty= ruleGatewayNetworkProperty EOF ;
    public final EObject entryRuleGatewayNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGatewayNetworkProperty = null;


        try {
            // InternalDeviceParser.g:795:63: (iv_ruleGatewayNetworkProperty= ruleGatewayNetworkProperty EOF )
            // InternalDeviceParser.g:796:2: iv_ruleGatewayNetworkProperty= ruleGatewayNetworkProperty EOF
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
    // InternalDeviceParser.g:802:1: ruleGatewayNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:808:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:809:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:809:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:810:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Gateway ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:810:3: ()
            // InternalDeviceParser.g:811:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getGatewayNetworkPropertyAccess().getGatewayNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getGatewayNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_19);

                  newLeafNode(otherlv_2, grammarAccess.getGatewayNetworkPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:828:3: ( (lv_name_3_0= Gateway ) )
            // InternalDeviceParser.g:829:4: (lv_name_3_0= Gateway )
            {
            // InternalDeviceParser.g:829:4: (lv_name_3_0= Gateway )
            // InternalDeviceParser.g:830:5: lv_name_3_0= Gateway
            {
            lv_name_3_0=(Token)match(input,Gateway,FOLLOW_7);

                      newLeafNode(lv_name_3_0, grammarAccess.getGatewayNetworkPropertyAccess().getNameGatewayKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getGatewayNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "gateway");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_4, grammarAccess.getGatewayNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                  newLeafNode(otherlv_5, grammarAccess.getGatewayNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:850:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:851:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:851:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:852:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getGatewayNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:869:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Description) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeviceParser.g:870:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getGatewayNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:874:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:875:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:875:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:876:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getGatewayNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:894:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Value) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceParser.g:895:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_9, grammarAccess.getGatewayNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:899:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:900:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:900:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:901:6: lv_value_10_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getGatewayNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:927:1: entryRuleSubnetMaskNetworkProperty returns [EObject current=null] : iv_ruleSubnetMaskNetworkProperty= ruleSubnetMaskNetworkProperty EOF ;
    public final EObject entryRuleSubnetMaskNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubnetMaskNetworkProperty = null;


        try {
            // InternalDeviceParser.g:927:66: (iv_ruleSubnetMaskNetworkProperty= ruleSubnetMaskNetworkProperty EOF )
            // InternalDeviceParser.g:928:2: iv_ruleSubnetMaskNetworkProperty= ruleSubnetMaskNetworkProperty EOF
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
    // InternalDeviceParser.g:934:1: ruleSubnetMaskNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:940:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:941:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:941:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:942:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Subnet_mask ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:942:3: ()
            // InternalDeviceParser.g:943:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getSubnetMaskNetworkPropertyAccess().getSubnetMaskNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getSubnetMaskNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_20);

                  newLeafNode(otherlv_2, grammarAccess.getSubnetMaskNetworkPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:960:3: ( (lv_name_3_0= Subnet_mask ) )
            // InternalDeviceParser.g:961:4: (lv_name_3_0= Subnet_mask )
            {
            // InternalDeviceParser.g:961:4: (lv_name_3_0= Subnet_mask )
            // InternalDeviceParser.g:962:5: lv_name_3_0= Subnet_mask
            {
            lv_name_3_0=(Token)match(input,Subnet_mask,FOLLOW_7);

                      newLeafNode(lv_name_3_0, grammarAccess.getSubnetMaskNetworkPropertyAccess().getNameSubnet_maskKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getSubnetMaskNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "subnet_mask");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_4, grammarAccess.getSubnetMaskNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                  newLeafNode(otherlv_5, grammarAccess.getSubnetMaskNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:982:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:983:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:983:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:984:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getSubnetMaskNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:1001:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Description) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceParser.g:1002:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getSubnetMaskNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:1006:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:1007:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1007:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:1008:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getSubnetMaskNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:1026:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Value) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceParser.g:1027:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_9, grammarAccess.getSubnetMaskNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:1031:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1032:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1032:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:1033:6: lv_value_10_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getSubnetMaskNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1059:1: entryRulePortNetworkProperty returns [EObject current=null] : iv_rulePortNetworkProperty= rulePortNetworkProperty EOF ;
    public final EObject entryRulePortNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortNetworkProperty = null;


        try {
            // InternalDeviceParser.g:1059:60: (iv_rulePortNetworkProperty= rulePortNetworkProperty EOF )
            // InternalDeviceParser.g:1060:2: iv_rulePortNetworkProperty= rulePortNetworkProperty EOF
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
    // InternalDeviceParser.g:1066:1: rulePortNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1072:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1073:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1073:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1074:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Port ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1074:3: ()
            // InternalDeviceParser.g:1075:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getPortNetworkPropertyAccess().getPortNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getPortNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_21);

                  newLeafNode(otherlv_2, grammarAccess.getPortNetworkPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1092:3: ( (lv_name_3_0= Port ) )
            // InternalDeviceParser.g:1093:4: (lv_name_3_0= Port )
            {
            // InternalDeviceParser.g:1093:4: (lv_name_3_0= Port )
            // InternalDeviceParser.g:1094:5: lv_name_3_0= Port
            {
            lv_name_3_0=(Token)match(input,Port,FOLLOW_7);

                      newLeafNode(lv_name_3_0, grammarAccess.getPortNetworkPropertyAccess().getNamePortKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getPortNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "port");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_4, grammarAccess.getPortNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_9);

                  newLeafNode(otherlv_5, grammarAccess.getPortNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:1114:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:1115:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:1115:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:1116:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getPortNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:1133:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Description) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeviceParser.g:1134:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getPortNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:1138:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:1139:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1139:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:1140:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPortNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:1158:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Value) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDeviceParser.g:1159:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValueInt ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_22);

                            newLeafNode(otherlv_9, grammarAccess.getPortNetworkPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:1163:4: ( (lv_value_10_0= rulePropertyValueInt ) )
                    // InternalDeviceParser.g:1164:5: (lv_value_10_0= rulePropertyValueInt )
                    {
                    // InternalDeviceParser.g:1164:5: (lv_value_10_0= rulePropertyValueInt )
                    // InternalDeviceParser.g:1165:6: lv_value_10_0= rulePropertyValueInt
                    {

                                newCompositeNode(grammarAccess.getPortNetworkPropertyAccess().getValuePropertyValueIntParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1191:1: entryRuleDNSServerNetworkProperty returns [EObject current=null] : iv_ruleDNSServerNetworkProperty= ruleDNSServerNetworkProperty EOF ;
    public final EObject entryRuleDNSServerNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNSServerNetworkProperty = null;


        try {
            // InternalDeviceParser.g:1191:65: (iv_ruleDNSServerNetworkProperty= ruleDNSServerNetworkProperty EOF )
            // InternalDeviceParser.g:1192:2: iv_ruleDNSServerNetworkProperty= ruleDNSServerNetworkProperty EOF
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
    // InternalDeviceParser.g:1198:1: ruleDNSServerNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1204:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) )
            // InternalDeviceParser.g:1205:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1205:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            // InternalDeviceParser.g:1206:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Dns_server ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT
            {
            // InternalDeviceParser.g:1206:3: ()
            // InternalDeviceParser.g:1207:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getDNSServerNetworkPropertyAccess().getDNSServerNetworkPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_23);

                  newLeafNode(otherlv_2, grammarAccess.getDNSServerNetworkPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1224:3: ( (lv_name_3_0= Dns_server ) )
            // InternalDeviceParser.g:1225:4: (lv_name_3_0= Dns_server )
            {
            // InternalDeviceParser.g:1225:4: (lv_name_3_0= Dns_server )
            // InternalDeviceParser.g:1226:5: lv_name_3_0= Dns_server
            {
            lv_name_3_0=(Token)match(input,Dns_server,FOLLOW_7);

                      newLeafNode(lv_name_3_0, grammarAccess.getDNSServerNetworkPropertyAccess().getNameDns_serverKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getDNSServerNetworkPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "dns_server");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_4, grammarAccess.getDNSServerNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_24);

                  newLeafNode(otherlv_5, grammarAccess.getDNSServerNetworkPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:1246:3: ( (lv_kind_6_0= ruleSelectionKind ) )
            // InternalDeviceParser.g:1247:4: (lv_kind_6_0= ruleSelectionKind )
            {
            // InternalDeviceParser.g:1247:4: (lv_kind_6_0= ruleSelectionKind )
            // InternalDeviceParser.g:1248:5: lv_kind_6_0= ruleSelectionKind
            {

                      newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getKindSelectionKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:1265:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Description) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDeviceParser.g:1266:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getDNSServerNetworkPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:1270:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:1271:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1271:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:1272:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:1290:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Value) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDeviceParser.g:1291:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_7);

                            newLeafNode(otherlv_9, grammarAccess.getDNSServerNetworkPropertyAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_10, grammarAccess.getDNSServerNetworkPropertyAccess().getINDENTTerminalRuleCall_8_1());


                            newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_13);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:1306:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1307:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1307:5: (lv_value_12_0= rulePropertyValue )
                    // InternalDeviceParser.g:1308:6: lv_value_12_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_3_0());

                    pushFollow(FOLLOW_26);
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

                    // InternalDeviceParser.g:1325:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==HyphenMinus) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                      case 1 :
                          // InternalDeviceParser.g:1326:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getPreListElementParserRuleCall_8_4_0());

                          pushFollow(FOLLOW_13);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalDeviceParser.g:1333:5: ( (lv_value_14_0= rulePropertyValue ) )
                          // InternalDeviceParser.g:1334:6: (lv_value_14_0= rulePropertyValue )
                          {
                          // InternalDeviceParser.g:1334:6: (lv_value_14_0= rulePropertyValue )
                          // InternalDeviceParser.g:1335:7: lv_value_14_0= rulePropertyValue
                          {

                                        newCompositeNode(grammarAccess.getDNSServerNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_4_1_0());

                          pushFollow(FOLLOW_26);
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
                          break loop18;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_14);

                            newLeafNode(this_DEDENT_15, grammarAccess.getDNSServerNetworkPropertyAccess().getDEDENTTerminalRuleCall_8_5());


                    }
                    break;

            }

            // InternalDeviceParser.g:1358:3: (this_DEDENT_16= RULE_DEDENT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DEDENT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_DEDENT) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==EOF||LA20_3==HyphenMinus) ) {
                        alt20=1;
                    }
                    else if ( (LA20_3==RULE_DEDENT) ) {
                        int LA20_5 = input.LA(4);

                        if ( (LA20_5==RULE_DEDENT) ) {
                            int LA20_6 = input.LA(5);

                            if ( (LA20_6==EOF||LA20_6==HyphenMinus) ) {
                                alt20=1;
                            }
                            else if ( (LA20_6==RULE_DEDENT) ) {
                                int LA20_7 = input.LA(6);

                                if ( (LA20_7==RULE_DEDENT) ) {
                                    alt20=1;
                                }
                            }
                        }
                    }
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalDeviceParser.g:1359:4: this_DEDENT_16= RULE_DEDENT
                    {
                    this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:1372:1: entryRuleDeviceVolumeUsbProperty returns [EObject current=null] : iv_ruleDeviceVolumeUsbProperty= ruleDeviceVolumeUsbProperty EOF ;
    public final EObject entryRuleDeviceVolumeUsbProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceVolumeUsbProperty = null;


        try {
            // InternalDeviceParser.g:1372:64: (iv_ruleDeviceVolumeUsbProperty= ruleDeviceVolumeUsbProperty EOF )
            // InternalDeviceParser.g:1373:2: iv_ruleDeviceVolumeUsbProperty= ruleDeviceVolumeUsbProperty EOF
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
    // InternalDeviceParser.g:1379:1: ruleDeviceVolumeUsbProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1385:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT ) )
            // InternalDeviceParser.g:1386:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1386:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT )
            // InternalDeviceParser.g:1387:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Device_volume ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleSelectionKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? (this_DEDENT_16= RULE_DEDENT )? this_DEDENT_17= RULE_DEDENT
            {
            // InternalDeviceParser.g:1387:3: ()
            // InternalDeviceParser.g:1388:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getDeviceVolumeUsbPropertyAccess().getDeviceVolumeUsbPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_27);

                  newLeafNode(otherlv_2, grammarAccess.getDeviceVolumeUsbPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1405:3: ( (lv_name_3_0= Device_volume ) )
            // InternalDeviceParser.g:1406:4: (lv_name_3_0= Device_volume )
            {
            // InternalDeviceParser.g:1406:4: (lv_name_3_0= Device_volume )
            // InternalDeviceParser.g:1407:5: lv_name_3_0= Device_volume
            {
            lv_name_3_0=(Token)match(input,Device_volume,FOLLOW_7);

                      newLeafNode(lv_name_3_0, grammarAccess.getDeviceVolumeUsbPropertyAccess().getNameDevice_volumeKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getDeviceVolumeUsbPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "device_volume");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_8);

                  newLeafNode(this_INDENT_4, grammarAccess.getDeviceVolumeUsbPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_24);

                  newLeafNode(otherlv_5, grammarAccess.getDeviceVolumeUsbPropertyAccess().getKindKeyword_5());

            // InternalDeviceParser.g:1427:3: ( (lv_kind_6_0= ruleSelectionKind ) )
            // InternalDeviceParser.g:1428:4: (lv_kind_6_0= ruleSelectionKind )
            {
            // InternalDeviceParser.g:1428:4: (lv_kind_6_0= ruleSelectionKind )
            // InternalDeviceParser.g:1429:5: lv_kind_6_0= ruleSelectionKind
            {

                      newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getKindSelectionKindParserRuleCall_6_0());

            pushFollow(FOLLOW_10);
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

            // InternalDeviceParser.g:1446:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Description) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeviceParser.g:1447:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getDeviceVolumeUsbPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:1451:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:1452:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:1452:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:1453:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:1471:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Value) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeviceParser.g:1472:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_7);

                            newLeafNode(otherlv_9, grammarAccess.getDeviceVolumeUsbPropertyAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_10, grammarAccess.getDeviceVolumeUsbPropertyAccess().getINDENTTerminalRuleCall_8_1());


                            newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_13);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:1487:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:1488:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:1488:5: (lv_value_12_0= rulePropertyValue )
                    // InternalDeviceParser.g:1489:6: lv_value_12_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getValuePropertyValueParserRuleCall_8_3_0());

                    pushFollow(FOLLOW_26);
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

                    // InternalDeviceParser.g:1506:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==HyphenMinus) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                      case 1 :
                          // InternalDeviceParser.g:1507:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getPreListElementParserRuleCall_8_4_0());

                          pushFollow(FOLLOW_13);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalDeviceParser.g:1514:5: ( (lv_value_14_0= rulePropertyValue ) )
                          // InternalDeviceParser.g:1515:6: (lv_value_14_0= rulePropertyValue )
                          {
                          // InternalDeviceParser.g:1515:6: (lv_value_14_0= rulePropertyValue )
                          // InternalDeviceParser.g:1516:7: lv_value_14_0= rulePropertyValue
                          {

                                        newCompositeNode(grammarAccess.getDeviceVolumeUsbPropertyAccess().getValuePropertyValueParserRuleCall_8_4_1_0());

                          pushFollow(FOLLOW_26);
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
                          break loop22;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_14);

                            newLeafNode(this_DEDENT_15, grammarAccess.getDeviceVolumeUsbPropertyAccess().getDEDENTTerminalRuleCall_8_5());


                    }
                    break;

            }

            // InternalDeviceParser.g:1539:3: (this_DEDENT_16= RULE_DEDENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DEDENT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_DEDENT) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==RULE_DEDENT) ) {
                        int LA24_4 = input.LA(4);

                        if ( (LA24_4==RULE_DEDENT) ) {
                            int LA24_6 = input.LA(5);

                            if ( (LA24_6==RULE_DEDENT) ) {
                                int LA24_7 = input.LA(6);

                                if ( (LA24_7==RULE_DEDENT) ) {
                                    alt24=1;
                                }
                            }
                            else if ( (LA24_6==EOF||LA24_6==HyphenMinus) ) {
                                alt24=1;
                            }
                        }
                    }
                    else if ( (LA24_3==EOF||LA24_3==HyphenMinus) ) {
                        alt24=1;
                    }
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalDeviceParser.g:1540:4: this_DEDENT_16= RULE_DEDENT
                    {
                    this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:1553:1: entryRuleDeviceType_Impl returns [EObject current=null] : iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF ;
    public final EObject entryRuleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType_Impl = null;


        try {
            // InternalDeviceParser.g:1553:56: (iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF )
            // InternalDeviceParser.g:1554:2: iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF
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
    // InternalDeviceParser.g:1560:1: ruleDeviceType_Impl returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1566:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalDeviceParser.g:1567:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1567:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalDeviceParser.g:1568:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalDeviceParser.g:1568:3: ()
            // InternalDeviceParser.g:1569:4:
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

            // InternalDeviceParser.g:1587:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDeviceParser.g:1588:4: (lv_name_4_0= ruleEString )
            {
            // InternalDeviceParser.g:1588:4: (lv_name_4_0= ruleEString )
            // InternalDeviceParser.g:1589:5: lv_name_4_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getNameEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_28);
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

            // InternalDeviceParser.g:1606:3: (otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==DeviceResouce) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDeviceParser.g:1607:4: otherlv_5= DeviceResouce this_INDENT_6= RULE_INDENT ( (lv_deviceResource_7_0= ruleDeviceResource ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,DeviceResouce,FOLLOW_7);

                            newLeafNode(otherlv_5, grammarAccess.getDeviceType_ImplAccess().getDeviceResouceKeyword_5_0());

                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_6, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1());

                    // InternalDeviceParser.g:1615:4: ( (lv_deviceResource_7_0= ruleDeviceResource ) )+
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
                          // InternalDeviceParser.g:1616:5: (lv_deviceResource_7_0= ruleDeviceResource )
                          {
                          // InternalDeviceParser.g:1616:5: (lv_deviceResource_7_0= ruleDeviceResource )
                          // InternalDeviceParser.g:1617:6: lv_deviceResource_7_0= ruleDeviceResource
                          {

                                      newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getDeviceResourceDeviceResourceParserRuleCall_5_2_0());

                          pushFollow(FOLLOW_26);
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
                          if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_29);

                            newLeafNode(this_DEDENT_8, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3());


                    }
                    break;

            }

            // InternalDeviceParser.g:1639:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CommunicationConnection) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDeviceParser.g:1640:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_7);

                            newLeafNode(otherlv_9, grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_10, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:1648:4: ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==HyphenMinus) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                      case 1 :
                          // InternalDeviceParser.g:1649:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                          {
                          // InternalDeviceParser.g:1649:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                          // InternalDeviceParser.g:1650:6: lv_communicationConnection_11_0= ruleAbstractCommunicationConnection
                          {

                                      newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());

                          pushFollow(FOLLOW_26);
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
                          if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
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
    // InternalDeviceParser.g:1680:1: entryRuleAbstractComputationResource returns [EObject current=null] : iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF ;
    public final EObject entryRuleAbstractComputationResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComputationResource = null;


        try {
            // InternalDeviceParser.g:1680:68: (iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF )
            // InternalDeviceParser.g:1681:2: iv_ruleAbstractComputationResource= ruleAbstractComputationResource EOF
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
    // InternalDeviceParser.g:1687:1: ruleAbstractComputationResource returns [EObject current=null] : (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce ) ;
    public final EObject ruleAbstractComputationResource() throws RecognitionException {
        EObject current = null;

        EObject this_OperatingSystemResouce_0 = null;

        EObject this_ProcessorResouce_1 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:1693:2: ( (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce ) )
            // InternalDeviceParser.g:1694:2: (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce )
            {
            // InternalDeviceParser.g:1694:2: (this_OperatingSystemResouce_0= ruleOperatingSystemResouce | this_ProcessorResouce_1= ruleProcessorResouce )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Name) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_STRING) ) {
                    int LA29_2 = input.LA(3);

                    if ( (LA29_2==RULE_INDENT) ) {
                        int LA29_4 = input.LA(4);

                        if ( (LA29_4==Type) ) {
                            int LA29_5 = input.LA(5);

                            if ( ((LA29_5>=LinuxOpertingSystem && LA29_5<=MacOSOpertingSystem)) ) {
                                alt29=1;
                            }
                            else if ( (LA29_5==Processor) ) {
                                alt29=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 29, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 29, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA29_1==RULE_ID) ) {
                    int LA29_3 = input.LA(3);

                    if ( (LA29_3==RULE_INDENT) ) {
                        int LA29_4 = input.LA(4);

                        if ( (LA29_4==Type) ) {
                            int LA29_5 = input.LA(5);

                            if ( ((LA29_5>=LinuxOpertingSystem && LA29_5<=MacOSOpertingSystem)) ) {
                                alt29=1;
                            }
                            else if ( (LA29_5==Processor) ) {
                                alt29=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 29, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 29, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDeviceParser.g:1695:3: this_OperatingSystemResouce_0= ruleOperatingSystemResouce
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
                    // InternalDeviceParser.g:1704:3: this_ProcessorResouce_1= ruleProcessorResouce
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
    // InternalDeviceParser.g:1716:1: entryRuleDeviceResource returns [EObject current=null] : iv_ruleDeviceResource= ruleDeviceResource EOF ;
    public final EObject entryRuleDeviceResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceResource = null;


        try {
            // InternalDeviceParser.g:1716:55: (iv_ruleDeviceResource= ruleDeviceResource EOF )
            // InternalDeviceParser.g:1717:2: iv_ruleDeviceResource= ruleDeviceResource EOF
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
    // InternalDeviceParser.g:1723:1: ruleDeviceResource returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1729:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1730:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1730:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1731:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleAbstractResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {

                  newCompositeNode(grammarAccess.getDeviceResourceAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_1, grammarAccess.getDeviceResourceAccess().getNameKeyword_1());

            // InternalDeviceParser.g:1742:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:1743:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:1743:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:1744:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_30);

                  newLeafNode(this_INDENT_3, grammarAccess.getDeviceResourceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_11);

                  newLeafNode(otherlv_4, grammarAccess.getDeviceResourceAccess().getTypeKeyword_4());

            // InternalDeviceParser.g:1769:3: ( (lv_type_5_0= ruleAbstractResouceType ) )
            // InternalDeviceParser.g:1770:4: (lv_type_5_0= ruleAbstractResouceType )
            {
            // InternalDeviceParser.g:1770:4: (lv_type_5_0= ruleAbstractResouceType )
            // InternalDeviceParser.g:1771:5: lv_type_5_0= ruleAbstractResouceType
            {

                      newCompositeNode(grammarAccess.getDeviceResourceAccess().getTypeAbstractResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:1788:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Properties) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDeviceParser.g:1789:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractProperty ) ) ( (lv_properties_9_0= ruleAbstractProperty ) )* this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_7);

                            newLeafNode(otherlv_6, grammarAccess.getDeviceResourceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_7, grammarAccess.getDeviceResourceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:1797:4: ( (lv_properties_8_0= ruleAbstractProperty ) )
                    // InternalDeviceParser.g:1798:5: (lv_properties_8_0= ruleAbstractProperty )
                    {
                    // InternalDeviceParser.g:1798:5: (lv_properties_8_0= ruleAbstractProperty )
                    // InternalDeviceParser.g:1799:6: lv_properties_8_0= ruleAbstractProperty
                    {

                                newCompositeNode(grammarAccess.getDeviceResourceAccess().getPropertiesAbstractPropertyParserRuleCall_6_2_0());

                    pushFollow(FOLLOW_26);
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

                    // InternalDeviceParser.g:1816:4: ( (lv_properties_9_0= ruleAbstractProperty ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==HyphenMinus) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                      case 1 :
                          // InternalDeviceParser.g:1817:5: (lv_properties_9_0= ruleAbstractProperty )
                          {
                          // InternalDeviceParser.g:1817:5: (lv_properties_9_0= ruleAbstractProperty )
                          // InternalDeviceParser.g:1818:6: lv_properties_9_0= ruleAbstractProperty
                          {

                                      newCompositeNode(grammarAccess.getDeviceResourceAccess().getPropertiesAbstractPropertyParserRuleCall_6_3_0());

                          pushFollow(FOLLOW_26);
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
                          break loop30;
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
    // InternalDeviceParser.g:1848:1: entryRuleComputationDeviceType returns [EObject current=null] : iv_ruleComputationDeviceType= ruleComputationDeviceType EOF ;
    public final EObject entryRuleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceType = null;


        try {
            // InternalDeviceParser.g:1848:62: (iv_ruleComputationDeviceType= ruleComputationDeviceType EOF )
            // InternalDeviceParser.g:1849:2: iv_ruleComputationDeviceType= ruleComputationDeviceType EOF
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
    // InternalDeviceParser.g:1855:1: ruleComputationDeviceType returns [EObject current=null] : (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1861:2: ( (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT ) )
            // InternalDeviceParser.g:1862:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1862:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT )
            // InternalDeviceParser.g:1863:3: otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )? (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )? this_DEDENT_19= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ComputationDeviceType,FOLLOW_7);

                  newLeafNode(otherlv_0, grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_5);

                  newLeafNode(this_INDENT_1, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_2, grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2());

            // InternalDeviceParser.g:1875:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1876:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1876:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1877:5: lv_name_3_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_32);
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

            // InternalDeviceParser.g:1894:3: (otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DeviceResouce) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDeviceParser.g:1895:4: otherlv_4= DeviceResouce this_INDENT_5= RULE_INDENT ( (lv_deviceResource_6_0= ruleDeviceResource ) )+ this_DEDENT_7= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,DeviceResouce,FOLLOW_7);

                            newLeafNode(otherlv_4, grammarAccess.getComputationDeviceTypeAccess().getDeviceResouceKeyword_4_0());

                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_5, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1());

                    // InternalDeviceParser.g:1903:4: ( (lv_deviceResource_6_0= ruleDeviceResource ) )+
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
                          // InternalDeviceParser.g:1904:5: (lv_deviceResource_6_0= ruleDeviceResource )
                          {
                          // InternalDeviceParser.g:1904:5: (lv_deviceResource_6_0= ruleDeviceResource )
                          // InternalDeviceParser.g:1905:6: lv_deviceResource_6_0= ruleDeviceResource
                          {

                                      newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getDeviceResourceDeviceResourceParserRuleCall_4_2_0());

                          pushFollow(FOLLOW_26);
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
                          if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_33);

                            newLeafNode(this_DEDENT_7, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3());


                    }
                    break;

            }

            // InternalDeviceParser.g:1927:3: (otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ComputationResouce) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDeviceParser.g:1928:4: otherlv_8= ComputationResouce this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_computationResource_11_0= ruleAbstractComputationResource ) ) ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )? this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,ComputationResouce,FOLLOW_7);

                            newLeafNode(otherlv_8, grammarAccess.getComputationDeviceTypeAccess().getComputationResouceKeyword_5_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_9, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());


                            newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getPreListElementParserRuleCall_5_2());

                    pushFollow(FOLLOW_5);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:1943:4: ( (lv_computationResource_11_0= ruleAbstractComputationResource ) )
                    // InternalDeviceParser.g:1944:5: (lv_computationResource_11_0= ruleAbstractComputationResource )
                    {
                    // InternalDeviceParser.g:1944:5: (lv_computationResource_11_0= ruleAbstractComputationResource )
                    // InternalDeviceParser.g:1945:6: lv_computationResource_11_0= ruleAbstractComputationResource
                    {

                                newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getComputationResourceAbstractComputationResourceParserRuleCall_5_3_0());

                    pushFollow(FOLLOW_26);
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

                    // InternalDeviceParser.g:1962:4: ( rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+ )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==HyphenMinus) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalDeviceParser.g:1963:5: rulePreListElement ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+
                            {

                                      newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getPreListElementParserRuleCall_5_4_0());

                            pushFollow(FOLLOW_5);
                            rulePreListElement();

                            state._fsp--;


                                      afterParserOrEnumRuleCall();

                            // InternalDeviceParser.g:1970:5: ( (lv_computationResource_13_0= ruleAbstractComputationResource ) )+
                            int cnt34=0;
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==Name) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                              case 1 :
                                  // InternalDeviceParser.g:1971:6: (lv_computationResource_13_0= ruleAbstractComputationResource )
                                  {
                                  // InternalDeviceParser.g:1971:6: (lv_computationResource_13_0= ruleAbstractComputationResource )
                                  // InternalDeviceParser.g:1972:7: lv_computationResource_13_0= ruleAbstractComputationResource
                                  {

                                                newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getComputationResourceAbstractComputationResourceParserRuleCall_5_4_1_0());

                                  pushFollow(FOLLOW_34);
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
                                  if ( cnt34 >= 1 ) break loop34;
                                        EarlyExitException eee =
                                            new EarlyExitException(34, input);
                                        throw eee;
                                }
                                cnt34++;
                            } while (true);


                            }
                            break;

                    }

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_29);

                            newLeafNode(this_DEDENT_14, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_5_5());


                    }
                    break;

            }

            // InternalDeviceParser.g:1995:3: (otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==CommunicationConnection) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDeviceParser.g:1996:4: otherlv_15= CommunicationConnection this_INDENT_16= RULE_INDENT ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_18= RULE_DEDENT
                    {
                    otherlv_15=(Token)match(input,CommunicationConnection,FOLLOW_7);

                            newLeafNode(otherlv_15, grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_6_0());

                    this_INDENT_16=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_16, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:2004:4: ( (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==HyphenMinus) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                      case 1 :
                          // InternalDeviceParser.g:2005:5: (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection )
                          {
                          // InternalDeviceParser.g:2005:5: (lv_communicationConnection_17_0= ruleAbstractCommunicationConnection )
                          // InternalDeviceParser.g:2006:6: lv_communicationConnection_17_0= ruleAbstractCommunicationConnection
                          {

                                      newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());

                          pushFollow(FOLLOW_26);
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
                          if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    this_DEDENT_18=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:2036:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalDeviceParser.g:2036:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalDeviceParser.g:2037:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
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
    // InternalDeviceParser.g:2043:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:2049:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:2050:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:2050:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:2051:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:2051:3: ()
            // InternalDeviceParser.g:2052:4:
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

            // InternalDeviceParser.g:2069:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:2070:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:2070:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:2071:5: lv_name_3_0= ruleEString
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

            // InternalDeviceParser.g:2096:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:2097:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:2097:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:2098:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:2115:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Description) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDeviceParser.g:2116:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getConnectionPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:2120:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:2121:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2121:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:2122:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:2140:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Value) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDeviceParser.g:2141:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_9, grammarAccess.getConnectionPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:2145:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2146:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2146:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:2147:6: lv_value_10_0= rulePropertyValue
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
    // InternalDeviceParser.g:2173:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalDeviceParser.g:2173:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalDeviceParser.g:2174:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
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
    // InternalDeviceParser.g:2180:1: ruleNetworkConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:2186:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:2187:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:2187:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:2188:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:2188:3: ()
            // InternalDeviceParser.g:2189:4:
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

            // InternalDeviceParser.g:2206:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:2207:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:2207:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:2208:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_30);

                  newLeafNode(this_INDENT_4, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_35);

                  newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:2233:3: ( (lv_type_6_0= ruleNetworkCommunicationType ) )
            // InternalDeviceParser.g:2234:4: (lv_type_6_0= ruleNetworkCommunicationType )
            {
            // InternalDeviceParser.g:2234:4: (lv_type_6_0= ruleNetworkCommunicationType )
            // InternalDeviceParser.g:2235:5: lv_type_6_0= ruleNetworkCommunicationType
            {

                      newCompositeNode(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:2252:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Properties) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDeviceParser.g:2253:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_7);

                            newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_8, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:2261:4: ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+
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
                          // InternalDeviceParser.g:2262:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                          {
                          // InternalDeviceParser.g:2262:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                          // InternalDeviceParser.g:2263:6: lv_properties_9_0= ruleAbstractNetworkProperty
                          {

                                      newCompositeNode(grammarAccess.getNetworkConnectionAccess().getPropertiesAbstractNetworkPropertyParserRuleCall_7_2_0());

                          pushFollow(FOLLOW_26);
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
                          if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
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
    // InternalDeviceParser.g:2293:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalDeviceParser.g:2293:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:2294:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
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
    // InternalDeviceParser.g:2300:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:2306:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:2307:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:2307:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:2308:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:2308:3: ()
            // InternalDeviceParser.g:2309:4:
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

            // InternalDeviceParser.g:2326:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:2327:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:2327:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:2328:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_30);

                  newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_11);

                  newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:2353:3: ( (lv_type_6_0= ruleCommunicationType ) )
            // InternalDeviceParser.g:2354:4: (lv_type_6_0= ruleCommunicationType )
            {
            // InternalDeviceParser.g:2354:4: (lv_type_6_0= ruleCommunicationType )
            // InternalDeviceParser.g:2355:5: lv_type_6_0= ruleCommunicationType
            {

                      newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:2372:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Properties) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDeviceParser.g:2373:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_7);

                            newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:2381:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==HyphenMinus) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                      case 1 :
                          // InternalDeviceParser.g:2382:5: (lv_properties_9_0= ruleConnectionProperty )
                          {
                          // InternalDeviceParser.g:2382:5: (lv_properties_9_0= ruleConnectionProperty )
                          // InternalDeviceParser.g:2383:6: lv_properties_9_0= ruleConnectionProperty
                          {

                                      newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPropertiesConnectionPropertyParserRuleCall_7_2_0());

                          pushFollow(FOLLOW_26);
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
                          if ( cnt43 >= 1 ) break loop43;
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
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


    // $ANTLR start "entryRuleUsbConnection"
    // InternalDeviceParser.g:2413:1: entryRuleUsbConnection returns [EObject current=null] : iv_ruleUsbConnection= ruleUsbConnection EOF ;
    public final EObject entryRuleUsbConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsbConnection = null;


        try {
            // InternalDeviceParser.g:2413:54: (iv_ruleUsbConnection= ruleUsbConnection EOF )
            // InternalDeviceParser.g:2414:2: iv_ruleUsbConnection= ruleUsbConnection EOF
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
    // InternalDeviceParser.g:2420:1: ruleUsbConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:2426:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:2427:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:2427:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:2428:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleUsbCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:2428:3: ()
            // InternalDeviceParser.g:2429:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getUsbConnectionAccess().getUsbConnectionAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getUsbConnectionAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_2, grammarAccess.getUsbConnectionAccess().getNameKeyword_2());

            // InternalDeviceParser.g:2446:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:2447:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:2447:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:2448:5: lv_name_3_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getUsbConnectionAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_30);

                  newLeafNode(this_INDENT_4, grammarAccess.getUsbConnectionAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Type,FOLLOW_36);

                  newLeafNode(otherlv_5, grammarAccess.getUsbConnectionAccess().getTypeKeyword_5());

            // InternalDeviceParser.g:2473:3: ( (lv_type_6_0= ruleUsbCommunicationType ) )
            // InternalDeviceParser.g:2474:4: (lv_type_6_0= ruleUsbCommunicationType )
            {
            // InternalDeviceParser.g:2474:4: (lv_type_6_0= ruleUsbCommunicationType )
            // InternalDeviceParser.g:2475:5: lv_type_6_0= ruleUsbCommunicationType
            {

                      newCompositeNode(grammarAccess.getUsbConnectionAccess().getTypeUsbCommunicationTypeParserRuleCall_6_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:2492:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Properties) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDeviceParser.g:2493:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_7);

                            newLeafNode(otherlv_7, grammarAccess.getUsbConnectionAccess().getPropertiesKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_8, grammarAccess.getUsbConnectionAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalDeviceParser.g:2501:4: ( (lv_properties_9_0= ruleAbstractUsbProperty ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==HyphenMinus) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                      case 1 :
                          // InternalDeviceParser.g:2502:5: (lv_properties_9_0= ruleAbstractUsbProperty )
                          {
                          // InternalDeviceParser.g:2502:5: (lv_properties_9_0= ruleAbstractUsbProperty )
                          // InternalDeviceParser.g:2503:6: lv_properties_9_0= ruleAbstractUsbProperty
                          {

                                      newCompositeNode(grammarAccess.getUsbConnectionAccess().getPropertiesAbstractUsbPropertyParserRuleCall_7_2_0());

                          pushFollow(FOLLOW_26);
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
                          if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:2533:1: entryRuleProcessorResouce returns [EObject current=null] : iv_ruleProcessorResouce= ruleProcessorResouce EOF ;
    public final EObject entryRuleProcessorResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorResouce = null;


        try {
            // InternalDeviceParser.g:2533:57: (iv_ruleProcessorResouce= ruleProcessorResouce EOF )
            // InternalDeviceParser.g:2534:2: iv_ruleProcessorResouce= ruleProcessorResouce EOF
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
    // InternalDeviceParser.g:2540:1: ruleProcessorResouce returns [EObject current=null] : ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:2546:2: ( ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalDeviceParser.g:2547:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalDeviceParser.g:2547:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalDeviceParser.g:2548:3: () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleProcessorResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {
            // InternalDeviceParser.g:2548:3: ()
            // InternalDeviceParser.g:2549:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getProcessorResouceAccess().getProcessorResouceAction_0(),
                      current);


            }

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_1, grammarAccess.getProcessorResouceAccess().getNameKeyword_1());

            // InternalDeviceParser.g:2559:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:2560:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:2560:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:2561:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getProcessorResouceAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_30);

                  newLeafNode(this_INDENT_3, grammarAccess.getProcessorResouceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_37);

                  newLeafNode(otherlv_4, grammarAccess.getProcessorResouceAccess().getTypeKeyword_4());

            // InternalDeviceParser.g:2586:3: ( (lv_type_5_0= ruleProcessorResouceType ) )
            // InternalDeviceParser.g:2587:4: (lv_type_5_0= ruleProcessorResouceType )
            {
            // InternalDeviceParser.g:2587:4: (lv_type_5_0= ruleProcessorResouceType )
            // InternalDeviceParser.g:2588:5: lv_type_5_0= ruleProcessorResouceType
            {

                      newCompositeNode(grammarAccess.getProcessorResouceAccess().getTypeProcessorResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:2605:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Properties) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDeviceParser.g:2606:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_7);

                            newLeafNode(otherlv_6, grammarAccess.getProcessorResouceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_7, grammarAccess.getProcessorResouceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:2614:4: ( (lv_properties_8_0= ruleAbstracProcessorProperty ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==HyphenMinus) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                      case 1 :
                          // InternalDeviceParser.g:2615:5: (lv_properties_8_0= ruleAbstracProcessorProperty )
                          {
                          // InternalDeviceParser.g:2615:5: (lv_properties_8_0= ruleAbstracProcessorProperty )
                          // InternalDeviceParser.g:2616:6: lv_properties_8_0= ruleAbstracProcessorProperty
                          {

                                      newCompositeNode(grammarAccess.getProcessorResouceAccess().getPropertiesAbstracProcessorPropertyParserRuleCall_6_2_0());

                          pushFollow(FOLLOW_26);
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
                          if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:2646:1: entryRuleAbstracProcessorProperty returns [EObject current=null] : iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF ;
    public final EObject entryRuleAbstracProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstracProcessorProperty = null;


        try {
            // InternalDeviceParser.g:2646:65: (iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF )
            // InternalDeviceParser.g:2647:2: iv_ruleAbstracProcessorProperty= ruleAbstracProcessorProperty EOF
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
    // InternalDeviceParser.g:2653:1: ruleAbstracProcessorProperty returns [EObject current=null] : (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty ) ;
    public final EObject ruleAbstracProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ArchitectureProcessorProperty_0 = null;

        EObject this_CoreProcessorProperty_1 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:2659:2: ( (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty ) )
            // InternalDeviceParser.g:2660:2: (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty )
            {
            // InternalDeviceParser.g:2660:2: (this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty | this_CoreProcessorProperty_1= ruleCoreProcessorProperty )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==HyphenMinus) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==Name) ) {
                    int LA49_2 = input.LA(3);

                    if ( (LA49_2==Processor_architecture) ) {
                        alt49=1;
                    }
                    else if ( (LA49_2==Core_number) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalDeviceParser.g:2661:3: this_ArchitectureProcessorProperty_0= ruleArchitectureProcessorProperty
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
                    // InternalDeviceParser.g:2670:3: this_CoreProcessorProperty_1= ruleCoreProcessorProperty
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
    // InternalDeviceParser.g:2682:1: entryRuleArchitectureProcessorProperty returns [EObject current=null] : iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF ;
    public final EObject entryRuleArchitectureProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureProcessorProperty = null;


        try {
            // InternalDeviceParser.g:2682:70: (iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF )
            // InternalDeviceParser.g:2683:2: iv_ruleArchitectureProcessorProperty= ruleArchitectureProcessorProperty EOF
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
    // InternalDeviceParser.g:2689:1: ruleArchitectureProcessorProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:2695:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:2696:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:2696:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:2697:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Processor_architecture ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:2697:3: ()
            // InternalDeviceParser.g:2698:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_38);

                  newLeafNode(otherlv_2, grammarAccess.getArchitectureProcessorPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:2715:3: ( (lv_name_3_0= Processor_architecture ) )
            // InternalDeviceParser.g:2716:4: (lv_name_3_0= Processor_architecture )
            {
            // InternalDeviceParser.g:2716:4: (lv_name_3_0= Processor_architecture )
            // InternalDeviceParser.g:2717:5: lv_name_3_0= Processor_architecture
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

            // InternalDeviceParser.g:2737:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:2738:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:2738:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:2739:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:2756:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Description) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDeviceParser.g:2757:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getArchitectureProcessorPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:2761:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:2762:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2762:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:2763:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:2781:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Value) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDeviceParser.g:2782:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_9, grammarAccess.getArchitectureProcessorPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:2786:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2787:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2787:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:2788:6: lv_value_10_0= rulePropertyValue
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
    // InternalDeviceParser.g:2814:1: entryRuleCoreProcessorProperty returns [EObject current=null] : iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF ;
    public final EObject entryRuleCoreProcessorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoreProcessorProperty = null;


        try {
            // InternalDeviceParser.g:2814:62: (iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF )
            // InternalDeviceParser.g:2815:2: iv_ruleCoreProcessorProperty= ruleCoreProcessorProperty EOF
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
    // InternalDeviceParser.g:2821:1: ruleCoreProcessorProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:2827:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:2828:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:2828:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:2829:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Core_number ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:2829:3: ()
            // InternalDeviceParser.g:2830:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_39);

                  newLeafNode(otherlv_2, grammarAccess.getCoreProcessorPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:2847:3: ( (lv_name_3_0= Core_number ) )
            // InternalDeviceParser.g:2848:4: (lv_name_3_0= Core_number )
            {
            // InternalDeviceParser.g:2848:4: (lv_name_3_0= Core_number )
            // InternalDeviceParser.g:2849:5: lv_name_3_0= Core_number
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

            // InternalDeviceParser.g:2869:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:2870:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:2870:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:2871:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:2888:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Description) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDeviceParser.g:2889:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getCoreProcessorPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:2893:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:2894:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:2894:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:2895:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:2913:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Value) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDeviceParser.g:2914:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_9, grammarAccess.getCoreProcessorPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:2918:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:2919:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:2919:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:2920:6: lv_value_10_0= rulePropertyValue
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


    // $ANTLR start "entryRuleOperatingSystemResouce"
    // InternalDeviceParser.g:2946:1: entryRuleOperatingSystemResouce returns [EObject current=null] : iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF ;
    public final EObject entryRuleOperatingSystemResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatingSystemResouce = null;


        try {
            // InternalDeviceParser.g:2946:63: (iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF )
            // InternalDeviceParser.g:2947:2: iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF
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
    // InternalDeviceParser.g:2953:1: ruleOperatingSystemResouce returns [EObject current=null] : ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:2959:2: ( ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalDeviceParser.g:2960:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalDeviceParser.g:2960:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalDeviceParser.g:2961:3: () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {
            // InternalDeviceParser.g:2961:3: ()
            // InternalDeviceParser.g:2962:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getOperatingSystemResouceAccess().getOperatingSystemResouceAction_0(),
                      current);


            }

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_1, grammarAccess.getOperatingSystemResouceAccess().getNameKeyword_1());

            // InternalDeviceParser.g:2972:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:2973:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:2973:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:2974:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_7);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_30);

                  newLeafNode(this_INDENT_3, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_40);

                  newLeafNode(otherlv_4, grammarAccess.getOperatingSystemResouceAccess().getTypeKeyword_4());

            // InternalDeviceParser.g:2999:3: ( (lv_type_5_0= ruleOpertingSystemResouceType ) )
            // InternalDeviceParser.g:3000:4: (lv_type_5_0= ruleOpertingSystemResouceType )
            {
            // InternalDeviceParser.g:3000:4: (lv_type_5_0= ruleOpertingSystemResouceType )
            // InternalDeviceParser.g:3001:5: lv_type_5_0= ruleOpertingSystemResouceType
            {

                      newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getTypeOpertingSystemResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_31);
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

            // InternalDeviceParser.g:3018:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Properties) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDeviceParser.g:3019:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_7);

                            newLeafNode(otherlv_6, grammarAccess.getOperatingSystemResouceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_7, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalDeviceParser.g:3027:4: ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==HyphenMinus) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                      case 1 :
                          // InternalDeviceParser.g:3028:5: (lv_properties_8_0= ruleAbstractOperatingSystemProperty )
                          {
                          // InternalDeviceParser.g:3028:5: (lv_properties_8_0= ruleAbstractOperatingSystemProperty )
                          // InternalDeviceParser.g:3029:6: lv_properties_8_0= ruleAbstractOperatingSystemProperty
                          {

                                      newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getPropertiesAbstractOperatingSystemPropertyParserRuleCall_6_2_0());

                          pushFollow(FOLLOW_26);
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
                          if ( cnt54 >= 1 ) break loop54;
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_14);

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
    // InternalDeviceParser.g:3059:1: entryRuleAbstractOperatingSystemProperty returns [EObject current=null] : iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF ;
    public final EObject entryRuleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperatingSystemProperty = null;


        try {
            // InternalDeviceParser.g:3059:72: (iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF )
            // InternalDeviceParser.g:3060:2: iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF
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
    // InternalDeviceParser.g:3066:1: ruleAbstractOperatingSystemProperty returns [EObject current=null] : (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) ;
    public final EObject ruleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject this_NameOperatingSystemProperty_0 = null;

        EObject this_VersionOperatingSystemProperty_1 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:3072:2: ( (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) )
            // InternalDeviceParser.g:3073:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            {
            // InternalDeviceParser.g:3073:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==HyphenMinus) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==Name) ) {
                    int LA56_2 = input.LA(3);

                    if ( (LA56_2==Os_version) ) {
                        alt56=2;
                    }
                    else if ( (LA56_2==Os_name) ) {
                        alt56=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalDeviceParser.g:3074:3: this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty
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
                    // InternalDeviceParser.g:3083:3: this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty
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
    // InternalDeviceParser.g:3095:1: entryRuleNameOperatingSystemProperty returns [EObject current=null] : iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF ;
    public final EObject entryRuleNameOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperatingSystemProperty = null;


        try {
            // InternalDeviceParser.g:3095:68: (iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF )
            // InternalDeviceParser.g:3096:2: iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF
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
    // InternalDeviceParser.g:3102:1: ruleNameOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:3108:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:3109:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:3109:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:3110:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:3110:3: ()
            // InternalDeviceParser.g:3111:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_41);

                  newLeafNode(otherlv_2, grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:3128:3: ( (lv_name_3_0= Os_name ) )
            // InternalDeviceParser.g:3129:4: (lv_name_3_0= Os_name )
            {
            // InternalDeviceParser.g:3129:4: (lv_name_3_0= Os_name )
            // InternalDeviceParser.g:3130:5: lv_name_3_0= Os_name
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

            // InternalDeviceParser.g:3150:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:3151:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:3151:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:3152:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:3169:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Description) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDeviceParser.g:3170:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:3174:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:3175:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:3175:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:3176:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:3194:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Value) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDeviceParser.g:3195:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_9, grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:3199:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:3200:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:3200:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:3201:6: lv_value_10_0= rulePropertyValue
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
    // InternalDeviceParser.g:3227:1: entryRuleVersionOperatingSystemProperty returns [EObject current=null] : iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF ;
    public final EObject entryRuleVersionOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionOperatingSystemProperty = null;


        try {
            // InternalDeviceParser.g:3227:71: (iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF )
            // InternalDeviceParser.g:3228:2: iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF
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
    // InternalDeviceParser.g:3234:1: ruleVersionOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:3240:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:3241:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:3241:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:3242:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:3242:3: ()
            // InternalDeviceParser.g:3243:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_42);

                  newLeafNode(otherlv_2, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalDeviceParser.g:3260:3: ( (lv_name_3_0= Os_version ) )
            // InternalDeviceParser.g:3261:4: (lv_name_3_0= Os_version )
            {
            // InternalDeviceParser.g:3261:4: (lv_name_3_0= Os_version )
            // InternalDeviceParser.g:3262:5: lv_name_3_0= Os_version
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

            // InternalDeviceParser.g:3282:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:3283:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:3283:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalDeviceParser.g:3284:5: lv_kind_6_0= ruleAttributeKind
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

            // InternalDeviceParser.g:3301:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Description) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDeviceParser.g:3302:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_7, grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalDeviceParser.g:3306:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDeviceParser.g:3307:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDeviceParser.g:3307:5: (lv_description_8_0= ruleEString )
                    // InternalDeviceParser.g:3308:6: lv_description_8_0= ruleEString
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

            // InternalDeviceParser.g:3326:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Value) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDeviceParser.g:3327:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_9, grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalDeviceParser.g:3331:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:3332:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:3332:5: (lv_value_10_0= rulePropertyValue )
                    // InternalDeviceParser.g:3333:6: lv_value_10_0= rulePropertyValue
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


    // $ANTLR start "entryRuleAbstractProperty"
    // InternalDeviceParser.g:3359:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalDeviceParser.g:3359:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalDeviceParser.g:3360:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalDeviceParser.g:3366:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:3372:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalDeviceParser.g:3373:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalDeviceParser.g:3373:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt61=5;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalDeviceParser.g:3374:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalDeviceParser.g:3383:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalDeviceParser.g:3392:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalDeviceParser.g:3401:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalDeviceParser.g:3410:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalDeviceParser.g:3422:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalDeviceParser.g:3422:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalDeviceParser.g:3423:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalDeviceParser.g:3429:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:3435:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalDeviceParser.g:3436:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalDeviceParser.g:3436:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt62=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt62=1;
                }
                break;
            case MaximumKind:
                {
                alt62=2;
                }
                break;
            case MinimumKind:
                {
                alt62=3;
                }
                break;
            case RangeKind:
                {
                alt62=4;
                }
                break;
            case SelectionKind:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalDeviceParser.g:3437:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalDeviceParser.g:3446:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalDeviceParser.g:3455:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalDeviceParser.g:3464:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalDeviceParser.g:3473:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalDeviceParser.g:3485:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalDeviceParser.g:3485:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalDeviceParser.g:3486:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalDeviceParser.g:3492:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:3498:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:3499:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:3499:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalDeviceParser.g:3500:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalDeviceParser.g:3511:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:3512:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:3512:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:3513:5: lv_name_2_0= ruleEString
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

            // InternalDeviceParser.g:3538:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalDeviceParser.g:3539:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalDeviceParser.g:3539:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalDeviceParser.g:3540:5: lv_kind_5_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_43);
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

            // InternalDeviceParser.g:3557:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Description) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDeviceParser.g:3558:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:3562:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:3563:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:3563:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:3564:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_44);
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

            // InternalDeviceParser.g:3582:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Value) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDeviceParser.g:3583:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalDeviceParser.g:3587:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:3588:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:3588:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:3589:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_45);
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

            // InternalDeviceParser.g:3607:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_DEDENT) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==RULE_DEDENT) ) {
                    int LA65_3 = input.LA(3);

                    if ( (LA65_3==RULE_DEDENT) ) {
                        int LA65_5 = input.LA(4);

                        if ( (LA65_5==RULE_DEDENT) ) {
                            int LA65_6 = input.LA(5);

                            if ( (LA65_6==CommunicationConnection||LA65_6==ComputationResouce||LA65_6==RULE_DEDENT) ) {
                                alt65=1;
                            }
                        }
                        else if ( (LA65_5==EOF||LA65_5==HyphenMinus) ) {
                            alt65=1;
                        }
                    }
                }
                else if ( (LA65_1==EOF||LA65_1==HyphenMinus) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalDeviceParser.g:3608:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalDeviceParser.g:3617:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalDeviceParser.g:3617:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalDeviceParser.g:3618:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalDeviceParser.g:3624:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:3630:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:3631:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:3631:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalDeviceParser.g:3632:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalDeviceParser.g:3643:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:3644:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:3644:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:3645:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_46);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalDeviceParser.g:3670:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalDeviceParser.g:3671:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalDeviceParser.g:3671:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalDeviceParser.g:3672:5: lv_kind_5_0= ruleMaximumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_43);
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

            // InternalDeviceParser.g:3689:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Description) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDeviceParser.g:3690:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:3694:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:3695:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:3695:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:3696:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_44);
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

            // InternalDeviceParser.g:3714:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Value) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDeviceParser.g:3715:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalDeviceParser.g:3719:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:3720:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:3720:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:3721:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_45);
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

            // InternalDeviceParser.g:3739:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_DEDENT) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==EOF||LA68_1==HyphenMinus) ) {
                    alt68=1;
                }
                else if ( (LA68_1==RULE_DEDENT) ) {
                    int LA68_4 = input.LA(3);

                    if ( (LA68_4==RULE_DEDENT) ) {
                        int LA68_5 = input.LA(4);

                        if ( (LA68_5==RULE_DEDENT) ) {
                            int LA68_6 = input.LA(5);

                            if ( (LA68_6==CommunicationConnection||LA68_6==ComputationResouce||LA68_6==RULE_DEDENT) ) {
                                alt68=1;
                            }
                        }
                        else if ( (LA68_5==EOF||LA68_5==HyphenMinus) ) {
                            alt68=1;
                        }
                    }
                }
            }
            switch (alt68) {
                case 1 :
                    // InternalDeviceParser.g:3740:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalDeviceParser.g:3749:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalDeviceParser.g:3749:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalDeviceParser.g:3750:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalDeviceParser.g:3756:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:3762:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:3763:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:3763:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalDeviceParser.g:3764:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalDeviceParser.g:3775:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:3776:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:3776:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:3777:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_47);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalDeviceParser.g:3802:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalDeviceParser.g:3803:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalDeviceParser.g:3803:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalDeviceParser.g:3804:5: lv_kind_5_0= ruleMinimumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_43);
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

            // InternalDeviceParser.g:3821:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Description) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDeviceParser.g:3822:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:3826:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:3827:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:3827:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:3828:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_44);
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

            // InternalDeviceParser.g:3846:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Value) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDeviceParser.g:3847:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_13);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalDeviceParser.g:3851:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:3852:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:3852:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:3853:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_45);
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

            // InternalDeviceParser.g:3871:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_DEDENT) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==RULE_DEDENT) ) {
                    int LA71_3 = input.LA(3);

                    if ( (LA71_3==RULE_DEDENT) ) {
                        int LA71_5 = input.LA(4);

                        if ( (LA71_5==RULE_DEDENT) ) {
                            int LA71_6 = input.LA(5);

                            if ( (LA71_6==CommunicationConnection||LA71_6==ComputationResouce||LA71_6==RULE_DEDENT) ) {
                                alt71=1;
                            }
                        }
                        else if ( (LA71_5==EOF||LA71_5==HyphenMinus) ) {
                            alt71=1;
                        }
                    }
                }
                else if ( (LA71_1==EOF||LA71_1==HyphenMinus) ) {
                    alt71=1;
                }
            }
            switch (alt71) {
                case 1 :
                    // InternalDeviceParser.g:3872:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalDeviceParser.g:3881:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalDeviceParser.g:3881:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalDeviceParser.g:3882:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalDeviceParser.g:3888:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:3894:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:3895:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:3895:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalDeviceParser.g:3896:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalDeviceParser.g:3907:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:3908:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:3908:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:3909:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_24);

                  newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalDeviceParser.g:3934:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalDeviceParser.g:3935:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalDeviceParser.g:3935:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalDeviceParser.g:3936:5: lv_kind_5_0= ruleSelectionKind
            {

                      newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_43);
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

            // InternalDeviceParser.g:3953:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Description) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDeviceParser.g:3954:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:3958:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:3959:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:3959:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:3960:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_44);
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

            // InternalDeviceParser.g:3978:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==Value) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalDeviceParser.g:3979:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_7);

                            newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_13);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:3994:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:3995:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:3995:5: (lv_value_11_0= rulePropertyValue )
                    // InternalDeviceParser.g:3996:6: lv_value_11_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_26);
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

                    // InternalDeviceParser.g:4013:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==HyphenMinus) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                      case 1 :
                          // InternalDeviceParser.g:4014:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                          pushFollow(FOLLOW_13);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalDeviceParser.g:4021:5: ( (lv_value_13_0= rulePropertyValue ) )
                          // InternalDeviceParser.g:4022:6: (lv_value_13_0= rulePropertyValue )
                          {
                          // InternalDeviceParser.g:4022:6: (lv_value_13_0= rulePropertyValue )
                          // InternalDeviceParser.g:4023:7: lv_value_13_0= rulePropertyValue
                          {

                                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                          pushFollow(FOLLOW_26);
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
                          break loop73;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_45);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalDeviceParser.g:4046:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_DEDENT) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==EOF||LA75_1==HyphenMinus) ) {
                    alt75=1;
                }
                else if ( (LA75_1==RULE_DEDENT) ) {
                    int LA75_4 = input.LA(3);

                    if ( (LA75_4==RULE_DEDENT) ) {
                        int LA75_5 = input.LA(4);

                        if ( (LA75_5==RULE_DEDENT) ) {
                            int LA75_6 = input.LA(5);

                            if ( (LA75_6==CommunicationConnection||LA75_6==ComputationResouce||LA75_6==RULE_DEDENT) ) {
                                alt75=1;
                            }
                        }
                        else if ( (LA75_5==EOF||LA75_5==HyphenMinus) ) {
                            alt75=1;
                        }
                    }
                }
            }
            switch (alt75) {
                case 1 :
                    // InternalDeviceParser.g:4047:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalDeviceParser.g:4056:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalDeviceParser.g:4056:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalDeviceParser.g:4057:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalDeviceParser.g:4063:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:4069:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:4070:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:4070:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalDeviceParser.g:4071:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_11);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalDeviceParser.g:4082:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:4083:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:4083:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:4084:5: lv_name_2_0= ruleEString
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

            otherlv_4=(Token)match(input,Kind,FOLLOW_48);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalDeviceParser.g:4109:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalDeviceParser.g:4110:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalDeviceParser.g:4110:4: (lv_kind_5_0= ruleRangeKind )
            // InternalDeviceParser.g:4111:5: lv_kind_5_0= ruleRangeKind
            {

                      newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_43);
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

            // InternalDeviceParser.g:4128:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==Description) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDeviceParser.g:4129:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_11);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalDeviceParser.g:4133:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDeviceParser.g:4134:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDeviceParser.g:4134:5: (lv_description_7_0= ruleEString )
                    // InternalDeviceParser.g:4135:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_44);
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

            // InternalDeviceParser.g:4153:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Value) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDeviceParser.g:4154:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_7);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_13);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalDeviceParser.g:4169:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:4170:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:4170:5: (lv_value_11_0= rulePropertyValue )
                    // InternalDeviceParser.g:4171:6: lv_value_11_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_25);
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

                    // InternalDeviceParser.g:4195:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:4196:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:4196:5: (lv_value_13_0= rulePropertyValue )
                    // InternalDeviceParser.g:4197:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_45);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalDeviceParser.g:4219:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_DEDENT) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==RULE_DEDENT) ) {
                    int LA78_3 = input.LA(3);

                    if ( (LA78_3==RULE_DEDENT) ) {
                        int LA78_5 = input.LA(4);

                        if ( (LA78_5==RULE_DEDENT) ) {
                            int LA78_6 = input.LA(5);

                            if ( (LA78_6==CommunicationConnection||LA78_6==ComputationResouce||LA78_6==RULE_DEDENT) ) {
                                alt78=1;
                            }
                        }
                        else if ( (LA78_5==EOF||LA78_5==HyphenMinus) ) {
                            alt78=1;
                        }
                    }
                }
                else if ( (LA78_1==EOF||LA78_1==HyphenMinus) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // InternalDeviceParser.g:4220:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalDeviceParser.g:4229:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalDeviceParser.g:4229:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalDeviceParser.g:4230:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalDeviceParser.g:4236:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) ;
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
            // InternalDeviceParser.g:4242:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) )
            // InternalDeviceParser.g:4243:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            {
            // InternalDeviceParser.g:4243:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            int alt79=7;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt79=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt79=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt79=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt79=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt79=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt79=6;
                }
                break;
            case RULE_INDENT:
                {
                alt79=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalDeviceParser.g:4244:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalDeviceParser.g:4253:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalDeviceParser.g:4262:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalDeviceParser.g:4271:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalDeviceParser.g:4280:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalDeviceParser.g:4289:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
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
                    // InternalDeviceParser.g:4298:3: this_PropertyValueList_6= rulePropertyValueList
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
    // InternalDeviceParser.g:4310:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalDeviceParser.g:4310:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalDeviceParser.g:4311:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalDeviceParser.g:4317:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4323:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalDeviceParser.g:4324:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalDeviceParser.g:4324:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalDeviceParser.g:4325:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalDeviceParser.g:4325:3: (lv_value_0_0= ruleInteger0 )
            // InternalDeviceParser.g:4326:4: lv_value_0_0= ruleInteger0
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
    // InternalDeviceParser.g:4346:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalDeviceParser.g:4346:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:4347:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalDeviceParser.g:4353:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4359:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalDeviceParser.g:4360:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalDeviceParser.g:4360:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalDeviceParser.g:4361:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalDeviceParser.g:4361:3: (lv_value_0_0= ruleDouble0 )
            // InternalDeviceParser.g:4362:4: lv_value_0_0= ruleDouble0
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
    // InternalDeviceParser.g:4382:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalDeviceParser.g:4382:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalDeviceParser.g:4383:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalDeviceParser.g:4389:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4395:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDeviceParser.g:4396:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDeviceParser.g:4396:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDeviceParser.g:4397:3: (lv_value_0_0= ruleEString )
            {
            // InternalDeviceParser.g:4397:3: (lv_value_0_0= ruleEString )
            // InternalDeviceParser.g:4398:4: lv_value_0_0= ruleEString
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
    // InternalDeviceParser.g:4418:1: entryRulePropertyValueList returns [EObject current=null] : iv_rulePropertyValueList= rulePropertyValueList EOF ;
    public final EObject entryRulePropertyValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueList = null;


        try {
            // InternalDeviceParser.g:4418:58: (iv_rulePropertyValueList= rulePropertyValueList EOF )
            // InternalDeviceParser.g:4419:2: iv_rulePropertyValueList= rulePropertyValueList EOF
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
    // InternalDeviceParser.g:4425:1: rulePropertyValueList returns [EObject current=null] : (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject rulePropertyValueList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4431:2: ( (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) )
            // InternalDeviceParser.g:4432:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            {
            // InternalDeviceParser.g:4432:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            // InternalDeviceParser.g:4433:3: this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_25);

                  newLeafNode(this_INDENT_0, grammarAccess.getPropertyValueListAccess().getINDENTTerminalRuleCall_0());


                  newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_13);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            // InternalDeviceParser.g:4444:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalDeviceParser.g:4445:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalDeviceParser.g:4445:4: (lv_value_2_0= rulePropertyValue )
            // InternalDeviceParser.g:4446:5: lv_value_2_0= rulePropertyValue
            {

                      newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_2_0());

            pushFollow(FOLLOW_26);
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

            // InternalDeviceParser.g:4463:3: ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==HyphenMinus) ) {
                    alt80=1;
                }


                switch (alt80) {
              case 1 :
                  // InternalDeviceParser.g:4464:4: rulePreListElement ( (lv_value_4_0= rulePropertyValue ) )
                  {

                          newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_3_0());

                  pushFollow(FOLLOW_13);
                  rulePreListElement();

                  state._fsp--;


                          afterParserOrEnumRuleCall();

                  // InternalDeviceParser.g:4471:4: ( (lv_value_4_0= rulePropertyValue ) )
                  // InternalDeviceParser.g:4472:5: (lv_value_4_0= rulePropertyValue )
                  {
                  // InternalDeviceParser.g:4472:5: (lv_value_4_0= rulePropertyValue )
                  // InternalDeviceParser.g:4473:6: lv_value_4_0= rulePropertyValue
                  {

                              newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_3_1_0());

                  pushFollow(FOLLOW_26);
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
                  break loop80;
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
    // InternalDeviceParser.g:4499:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalDeviceParser.g:4499:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalDeviceParser.g:4500:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalDeviceParser.g:4506:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4512:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalDeviceParser.g:4513:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalDeviceParser.g:4513:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalDeviceParser.g:4514:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalDeviceParser.g:4514:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalDeviceParser.g:4515:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalDeviceParser.g:4535:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalDeviceParser.g:4535:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalDeviceParser.g:4536:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalDeviceParser.g:4542:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4548:2: (this_ResourceType_0= ruleResourceType )
            // InternalDeviceParser.g:4549:2: this_ResourceType_0= ruleResourceType
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
    // InternalDeviceParser.g:4560:1: entryRuleOpertingSystemResouceType returns [EObject current=null] : iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF ;
    public final EObject entryRuleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemResouceType = null;


        try {
            // InternalDeviceParser.g:4560:66: (iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF )
            // InternalDeviceParser.g:4561:2: iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF
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
    // InternalDeviceParser.g:4567:1: ruleOpertingSystemResouceType returns [EObject current=null] : (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) ;
    public final EObject ruleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystem_0 = null;

        EObject this_MacOSOpertingSystem_1 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4573:2: ( (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) )
            // InternalDeviceParser.g:4574:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            {
            // InternalDeviceParser.g:4574:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==LinuxOpertingSystem) ) {
                alt81=1;
            }
            else if ( (LA81_0==MacOSOpertingSystem) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalDeviceParser.g:4575:3: this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem
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
                    // InternalDeviceParser.g:4584:3: this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem
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
    // InternalDeviceParser.g:4596:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalDeviceParser.g:4596:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalDeviceParser.g:4597:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalDeviceParser.g:4603:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4609:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:4610:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:4610:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDeviceParser.g:4611:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDeviceParser.g:4611:3: ()
            // InternalDeviceParser.g:4612:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                      current);


            }

            // InternalDeviceParser.g:4618:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeviceParser.g:4619:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeviceParser.g:4619:4: (lv_name_1_0= ruleEString )
            // InternalDeviceParser.g:4620:5: lv_name_1_0= ruleEString
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
    // InternalDeviceParser.g:4641:1: entryRuleProcessorResouceType returns [EObject current=null] : iv_ruleProcessorResouceType= ruleProcessorResouceType EOF ;
    public final EObject entryRuleProcessorResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorResouceType = null;


        try {
            // InternalDeviceParser.g:4641:61: (iv_ruleProcessorResouceType= ruleProcessorResouceType EOF )
            // InternalDeviceParser.g:4642:2: iv_ruleProcessorResouceType= ruleProcessorResouceType EOF
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
    // InternalDeviceParser.g:4648:1: ruleProcessorResouceType returns [EObject current=null] : ( () otherlv_1= Processor ) ;
    public final EObject ruleProcessorResouceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:4654:2: ( ( () otherlv_1= Processor ) )
            // InternalDeviceParser.g:4655:2: ( () otherlv_1= Processor )
            {
            // InternalDeviceParser.g:4655:2: ( () otherlv_1= Processor )
            // InternalDeviceParser.g:4656:3: () otherlv_1= Processor
            {
            // InternalDeviceParser.g:4656:3: ()
            // InternalDeviceParser.g:4657:4:
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
    // InternalDeviceParser.g:4671:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalDeviceParser.g:4671:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalDeviceParser.g:4672:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalDeviceParser.g:4678:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:4684:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalDeviceParser.g:4685:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalDeviceParser.g:4685:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalDeviceParser.g:4686:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalDeviceParser.g:4686:3: ()
            // InternalDeviceParser.g:4687:4:
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
    // InternalDeviceParser.g:4701:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalDeviceParser.g:4701:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalDeviceParser.g:4702:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalDeviceParser.g:4708:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:4714:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalDeviceParser.g:4715:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalDeviceParser.g:4715:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalDeviceParser.g:4716:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalDeviceParser.g:4716:3: ()
            // InternalDeviceParser.g:4717:4:
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
    // InternalDeviceParser.g:4731:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalDeviceParser.g:4731:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalDeviceParser.g:4732:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalDeviceParser.g:4738:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4744:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:4745:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:4745:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDeviceParser.g:4746:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDeviceParser.g:4746:3: ()
            // InternalDeviceParser.g:4747:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                      current);


            }

            // InternalDeviceParser.g:4753:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeviceParser.g:4754:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeviceParser.g:4754:4: (lv_name_1_0= ruleEString )
            // InternalDeviceParser.g:4755:5: lv_name_1_0= ruleEString
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
    // InternalDeviceParser.g:4776:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalDeviceParser.g:4776:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalDeviceParser.g:4777:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalDeviceParser.g:4783:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:4789:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalDeviceParser.g:4790:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalDeviceParser.g:4790:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==Ethernet) ) {
                alt82=1;
            }
            else if ( (LA82_0==Wlan) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalDeviceParser.g:4791:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalDeviceParser.g:4800:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalDeviceParser.g:4812:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalDeviceParser.g:4812:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalDeviceParser.g:4813:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalDeviceParser.g:4819:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:4825:2: ( ( () otherlv_1= Ethernet ) )
            // InternalDeviceParser.g:4826:2: ( () otherlv_1= Ethernet )
            {
            // InternalDeviceParser.g:4826:2: ( () otherlv_1= Ethernet )
            // InternalDeviceParser.g:4827:3: () otherlv_1= Ethernet
            {
            // InternalDeviceParser.g:4827:3: ()
            // InternalDeviceParser.g:4828:4:
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
    // InternalDeviceParser.g:4842:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalDeviceParser.g:4842:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalDeviceParser.g:4843:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalDeviceParser.g:4849:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:4855:2: ( ( () otherlv_1= Wlan ) )
            // InternalDeviceParser.g:4856:2: ( () otherlv_1= Wlan )
            {
            // InternalDeviceParser.g:4856:2: ( () otherlv_1= Wlan )
            // InternalDeviceParser.g:4857:3: () otherlv_1= Wlan
            {
            // InternalDeviceParser.g:4857:3: ()
            // InternalDeviceParser.g:4858:4:
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
    // InternalDeviceParser.g:4872:1: entryRuleUsbCommunicationType returns [EObject current=null] : iv_ruleUsbCommunicationType= ruleUsbCommunicationType EOF ;
    public final EObject entryRuleUsbCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsbCommunicationType = null;


        try {
            // InternalDeviceParser.g:4872:61: (iv_ruleUsbCommunicationType= ruleUsbCommunicationType EOF )
            // InternalDeviceParser.g:4873:2: iv_ruleUsbCommunicationType= ruleUsbCommunicationType EOF
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
    // InternalDeviceParser.g:4879:1: ruleUsbCommunicationType returns [EObject current=null] : ( () otherlv_1= Usb ) ;
    public final EObject ruleUsbCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:4885:2: ( ( () otherlv_1= Usb ) )
            // InternalDeviceParser.g:4886:2: ( () otherlv_1= Usb )
            {
            // InternalDeviceParser.g:4886:2: ( () otherlv_1= Usb )
            // InternalDeviceParser.g:4887:3: () otherlv_1= Usb
            {
            // InternalDeviceParser.g:4887:3: ()
            // InternalDeviceParser.g:4888:4:
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
    // InternalDeviceParser.g:4902:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalDeviceParser.g:4902:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalDeviceParser.g:4903:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalDeviceParser.g:4909:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:4915:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalDeviceParser.g:4916:2: ( () otherlv_1= AttributeKind )
            {
            // InternalDeviceParser.g:4916:2: ( () otherlv_1= AttributeKind )
            // InternalDeviceParser.g:4917:3: () otherlv_1= AttributeKind
            {
            // InternalDeviceParser.g:4917:3: ()
            // InternalDeviceParser.g:4918:4:
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
    // InternalDeviceParser.g:4932:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalDeviceParser.g:4932:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalDeviceParser.g:4933:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalDeviceParser.g:4939:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:4945:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalDeviceParser.g:4946:2: ( () otherlv_1= MaximumKind )
            {
            // InternalDeviceParser.g:4946:2: ( () otherlv_1= MaximumKind )
            // InternalDeviceParser.g:4947:3: () otherlv_1= MaximumKind
            {
            // InternalDeviceParser.g:4947:3: ()
            // InternalDeviceParser.g:4948:4:
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
    // InternalDeviceParser.g:4962:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalDeviceParser.g:4962:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalDeviceParser.g:4963:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalDeviceParser.g:4969:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:4975:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalDeviceParser.g:4976:2: ( () otherlv_1= MinimumKind )
            {
            // InternalDeviceParser.g:4976:2: ( () otherlv_1= MinimumKind )
            // InternalDeviceParser.g:4977:3: () otherlv_1= MinimumKind
            {
            // InternalDeviceParser.g:4977:3: ()
            // InternalDeviceParser.g:4978:4:
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
    // InternalDeviceParser.g:4992:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalDeviceParser.g:4992:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalDeviceParser.g:4993:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalDeviceParser.g:4999:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:5005:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalDeviceParser.g:5006:2: ( () otherlv_1= SelectionKind )
            {
            // InternalDeviceParser.g:5006:2: ( () otherlv_1= SelectionKind )
            // InternalDeviceParser.g:5007:3: () otherlv_1= SelectionKind
            {
            // InternalDeviceParser.g:5007:3: ()
            // InternalDeviceParser.g:5008:4:
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
    // InternalDeviceParser.g:5022:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalDeviceParser.g:5022:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalDeviceParser.g:5023:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalDeviceParser.g:5029:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:5035:2: ( ( () otherlv_1= RangeKind ) )
            // InternalDeviceParser.g:5036:2: ( () otherlv_1= RangeKind )
            {
            // InternalDeviceParser.g:5036:2: ( () otherlv_1= RangeKind )
            // InternalDeviceParser.g:5037:3: () otherlv_1= RangeKind
            {
            // InternalDeviceParser.g:5037:3: ()
            // InternalDeviceParser.g:5038:4:
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
    // InternalDeviceParser.g:5052:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalDeviceParser.g:5052:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalDeviceParser.g:5053:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalDeviceParser.g:5059:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:5065:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalDeviceParser.g:5066:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalDeviceParser.g:5066:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalDeviceParser.g:5067:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalDeviceParser.g:5067:3: ()
            // InternalDeviceParser.g:5068:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                      current);


            }

            // InternalDeviceParser.g:5074:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalDeviceParser.g:5075:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalDeviceParser.g:5075:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalDeviceParser.g:5076:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalDeviceParser.g:5097:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalDeviceParser.g:5097:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalDeviceParser.g:5098:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalDeviceParser.g:5104:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalDeviceParser.g:5110:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalDeviceParser.g:5111:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalDeviceParser.g:5111:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalDeviceParser.g:5112:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalDeviceParser.g:5112:3: ()
            // InternalDeviceParser.g:5113:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                      current);


            }

            // InternalDeviceParser.g:5119:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalDeviceParser.g:5120:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalDeviceParser.g:5120:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalDeviceParser.g:5121:5: lv_value_1_0= ruleUbuntuVersion
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
    // InternalDeviceParser.g:5142:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalDeviceParser.g:5142:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalDeviceParser.g:5143:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalDeviceParser.g:5149:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


          enterRule();

        try {
            // InternalDeviceParser.g:5155:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalDeviceParser.g:5156:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalDeviceParser.g:5166:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalDeviceParser.g:5166:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalDeviceParser.g:5167:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalDeviceParser.g:5173:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


          enterRule();

        try {
            // InternalDeviceParser.g:5179:2: (this_DECINT_0= RULE_DECINT )
            // InternalDeviceParser.g:5180:2: this_DECINT_0= RULE_DECINT
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
    // InternalDeviceParser.g:5190:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDeviceParser.g:5190:47: (iv_ruleEString= ruleEString EOF )
            // InternalDeviceParser.g:5191:2: iv_ruleEString= ruleEString EOF
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
    // InternalDeviceParser.g:5197:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:5203:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDeviceParser.g:5204:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDeviceParser.g:5204:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_STRING) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_ID) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalDeviceParser.g:5205:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                          current.merge(this_STRING_0);


                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:5213:3: this_ID_1= RULE_ID
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
    // InternalDeviceParser.g:5224:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:5226:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalDeviceParser.g:5227:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalDeviceParser.g:5236:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


          enterRule();
          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:5243:2: (kw= HyphenMinus )
            // InternalDeviceParser.g:5244:2: kw= HyphenMinus
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
    // InternalDeviceParser.g:5255:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:5261:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalDeviceParser.g:5262:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalDeviceParser.g:5262:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==X86) ) {
                alt84=1;
            }
            else if ( (LA84_0==Arm64) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalDeviceParser.g:5263:3: (enumLiteral_0= X86 )
                    {
                    // InternalDeviceParser.g:5263:3: (enumLiteral_0= X86 )
                    // InternalDeviceParser.g:5264:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                            current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:5271:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalDeviceParser.g:5271:3: (enumLiteral_1= Arm64 )
                    // InternalDeviceParser.g:5272:4: enumLiteral_1= Arm64
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
    // InternalDeviceParser.g:5282:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:5288:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalDeviceParser.g:5289:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalDeviceParser.g:5289:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==Ubuntu) ) {
                alt85=1;
            }
            else if ( (LA85_0==Debian) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalDeviceParser.g:5290:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalDeviceParser.g:5290:3: (enumLiteral_0= Ubuntu )
                    // InternalDeviceParser.g:5291:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                            current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:5298:3: (enumLiteral_1= Debian )
                    {
                    // InternalDeviceParser.g:5298:3: (enumLiteral_1= Debian )
                    // InternalDeviceParser.g:5299:4: enumLiteral_1= Debian
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
    // InternalDeviceParser.g:5309:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalDeviceParser.g:5315:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalDeviceParser.g:5316:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalDeviceParser.g:5316:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==Focal) ) {
                alt86=1;
            }
            else if ( (LA86_0==Jammy) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalDeviceParser.g:5317:3: (enumLiteral_0= Focal )
                    {
                    // InternalDeviceParser.g:5317:3: (enumLiteral_0= Focal )
                    // InternalDeviceParser.g:5318:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                            current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:5325:3: (enumLiteral_1= Jammy )
                    {
                    // InternalDeviceParser.g:5325:3: (enumLiteral_1= Jammy )
                    // InternalDeviceParser.g:5326:4: enumLiteral_1= Jammy
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\57\1\50\1\66\2\64\1\51\1\36\3\uffff";
    static final String dfa_3s = "\1\57\1\50\1\70\2\64\1\51\1\70\3\uffff";
    static final String dfa_4s = "\7\uffff\1\3\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\11\13\uffff\1\11\2\uffff\1\7\10\uffff\1\10\1\uffff\1\10",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "171:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection | this_UsbConnection_2= ruleUsbConnection )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\57\1\50\1\13\10\uffff";
    static final String dfa_9s = "\1\57\1\50\1\53\10\uffff";
    static final String dfa_10s = "\3\uffff\1\3\1\6\1\5\1\4\1\7\1\2\1\10\1\1";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\10\3\uffff\1\12\5\uffff\1\6\1\uffff\1\4\1\7\1\3\5\uffff\1\5\13\uffff\1\11",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "216:2: (this_IdentityNameNetworkProperty_0= ruleIdentityNameNetworkProperty | this_InterfaceNetworkProperty_1= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_2= ruleAddressNetworkProperty | this_MacAddressNetworkProperty_3= ruleMacAddressNetworkProperty | this_GatewayNetworkProperty_4= ruleGatewayNetworkProperty | this_SubnetMaskNetworkProperty_5= ruleSubnetMaskNetworkProperty | this_DNSServerNetworkProperty_6= ruleDNSServerNetworkProperty | this_PortNetworkProperty_7= rulePortNetworkProperty )";
        }
    }
    static final String dfa_13s = "\14\uffff";
    static final String dfa_14s = "\1\57\1\50\1\66\2\64\1\47\1\14\5\uffff";
    static final String dfa_15s = "\1\57\1\50\1\70\2\64\1\47\1\34\5\uffff";
    static final String dfa_16s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_17s = "\14\uffff}>";
    static final String[] dfa_18s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\4\uffff\1\11\1\10\10\uffff\1\12",
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

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "3373:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0020000800010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0020000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0156407600000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000410L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000610L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000210L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000800010002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000800000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000010000000L});

}
