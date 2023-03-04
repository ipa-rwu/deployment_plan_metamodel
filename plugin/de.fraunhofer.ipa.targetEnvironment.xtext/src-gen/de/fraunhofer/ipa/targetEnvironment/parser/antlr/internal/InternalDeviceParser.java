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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arm64ProcessorArchitecture", "EthernetCommunicationType", "X86ProcessorArchitecture", "CommunicationConnection", "ComputationDeviceType", "ProcessorArchitecture", "WlanCommunicationType", "LinuxOpertingSystem", "CommunicationType", "OperatingSystem", "AttributeKind", "SelectionKind", "DeviceType", "MaximumKind", "MinimumKind", "ResouceType", "Capability", "Properties", "Interface", "Address", "Value", "Kind", "Name", "Type", "HyphenMinus", "RightCurlyBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=35;
    public static final int Address=23;
    public static final int RULE_DATE_TIME=40;
    public static final int RULE_BOOLEAN=32;
    public static final int AttributeKind=14;
    public static final int RULE_YEAR=37;
    public static final int Name=26;
    public static final int RULE_MIN_SEC=39;
    public static final int WlanCommunicationType=10;
    public static final int Kind=25;
    public static final int RULE_DEDENT=43;
    public static final int LinuxOpertingSystem=11;
    public static final int Capability=20;
    public static final int RULE_ID=44;
    public static final int RULE_DIGIT=30;
    public static final int SelectionKind=15;
    public static final int Arm64ProcessorArchitecture=4;
    public static final int DeviceType=16;
    public static final int RULE_INT=45;
    public static final int Value=24;
    public static final int RULE_ML_COMMENT=47;
    public static final int OperatingSystem=13;
    public static final int ProcessorArchitecture=9;
    public static final int RULE_STRING=46;
    public static final int Properties=21;
    public static final int RULE_SL_COMMENT=41;
    public static final int CommunicationConnection=7;
    public static final int HyphenMinus=28;
    public static final int RULE_DOUBLE=34;
    public static final int ResouceType=19;
    public static final int RightCurlyBracket=29;
    public static final int RULE_DECINT=33;
    public static final int MinimumKind=18;
    public static final int EOF=-1;
    public static final int RULE_INDENT=42;
    public static final int RULE_HOUR=38;
    public static final int EthernetCommunicationType=5;
    public static final int RULE_WS=48;
    public static final int MaximumKind=17;
    public static final int RULE_ANY_OTHER=49;
    public static final int ComputationDeviceType=8;
    public static final int CommunicationType=12;
    public static final int Type=27;
    public static final int X86ProcessorArchitecture=6;
    public static final int RULE_MONTH=36;
    public static final int RULE_BINARY=31;
    public static final int Interface=22;

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

                if ( (LA1_0==ComputationDeviceType||LA1_0==DeviceType) ) {
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
    // InternalDeviceParser.g:154:1: ruleDeviceType returns [EObject current=null] : (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceType_Impl_0 = null;

        EObject this_ComputationDeviceType_1 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:160:2: ( (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) )
            // InternalDeviceParser.g:161:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            {
            // InternalDeviceParser.g:161:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DeviceType) ) {
                alt3=1;
            }
            else if ( (LA3_0==ComputationDeviceType) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDeviceParser.g:162:3: this_DeviceType_Impl_0= ruleDeviceType_Impl
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
                    // InternalDeviceParser.g:171:3: this_ComputationDeviceType_1= ruleComputationDeviceType
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
    // InternalDeviceParser.g:183:1: entryRuleAbstractCommunicationConnection returns [EObject current=null] : iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF ;
    public final EObject entryRuleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommunicationConnection = null;


        try {
            // InternalDeviceParser.g:183:72: (iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF )
            // InternalDeviceParser.g:184:2: iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF
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
    // InternalDeviceParser.g:190:1: ruleAbstractCommunicationConnection returns [EObject current=null] : (this_NetworkConnection_0= ruleNetworkConnection | this_CommunicationConnection_1= ruleCommunicationConnection ) ;
    public final EObject ruleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject this_NetworkConnection_0 = null;

        EObject this_CommunicationConnection_1 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:196:2: ( (this_NetworkConnection_0= ruleNetworkConnection | this_CommunicationConnection_1= ruleCommunicationConnection ) )
            // InternalDeviceParser.g:197:2: (this_NetworkConnection_0= ruleNetworkConnection | this_CommunicationConnection_1= ruleCommunicationConnection )
            {
            // InternalDeviceParser.g:197:2: (this_NetworkConnection_0= ruleNetworkConnection | this_CommunicationConnection_1= ruleCommunicationConnection )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalDeviceParser.g:198:3: this_NetworkConnection_0= ruleNetworkConnection
                    {

                    			newCompositeNode(grammarAccess.getAbstractCommunicationConnectionAccess().getNetworkConnectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NetworkConnection_0=ruleNetworkConnection();

                    state._fsp--;


                    			current = this_NetworkConnection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:207:3: this_CommunicationConnection_1= ruleCommunicationConnection
                    {

                    			newCompositeNode(grammarAccess.getAbstractCommunicationConnectionAccess().getCommunicationConnectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommunicationConnection_1=ruleCommunicationConnection();

                    state._fsp--;


                    			current = this_CommunicationConnection_1;
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
    // InternalDeviceParser.g:219:1: entryRuleAbstractNetworkProperty returns [EObject current=null] : iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF ;
    public final EObject entryRuleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetworkProperty = null;


        try {
            // InternalDeviceParser.g:219:64: (iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF )
            // InternalDeviceParser.g:220:2: iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF
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
    // InternalDeviceParser.g:226:1: ruleAbstractNetworkProperty returns [EObject current=null] : (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) ;
    public final EObject ruleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceNetworkProperty_0 = null;

        EObject this_AddressNetworkProperty_1 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:232:2: ( (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) )
            // InternalDeviceParser.g:233:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            {
            // InternalDeviceParser.g:233:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INDENT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==HyphenMinus) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==Name) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==Address) ) {
                            alt5=2;
                        }
                        else if ( (LA5_3==Interface) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeviceParser.g:234:3: this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty
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
                    // InternalDeviceParser.g:243:3: this_AddressNetworkProperty_1= ruleAddressNetworkProperty
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
    // InternalDeviceParser.g:255:1: entryRuleInterfaceNetworkProperty returns [EObject current=null] : iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF ;
    public final EObject entryRuleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceNetworkProperty = null;


        try {
            // InternalDeviceParser.g:255:65: (iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF )
            // InternalDeviceParser.g:256:2: iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF
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
    // InternalDeviceParser.g:262:1: ruleInterfaceNetworkProperty returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Interface (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT ) ;
    public final EObject ruleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:268:2: ( ( () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Interface (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT ) )
            // InternalDeviceParser.g:269:2: ( () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Interface (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT )
            {
            // InternalDeviceParser.g:269:2: ( () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Interface (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT )
            // InternalDeviceParser.g:270:3: () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Interface (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT
            {
            // InternalDeviceParser.g:270:3: ()
            // InternalDeviceParser.g:271:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0(),
            					current);
            			

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4); 

            			newLeafNode(this_INDENT_1, grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_1());
            		

            			newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getPreListElementParserRuleCall_2());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceNetworkPropertyAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,Interface,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceKeyword_4());
            		
            // InternalDeviceParser.g:296:3: (otherlv_5= Value ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Value) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:297:4: otherlv_5= Value ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,Value,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_5_0());
                    			
                    // InternalDeviceParser.g:301:4: ( ( ruleEString ) )
                    // InternalDeviceParser.g:302:5: ( ruleEString )
                    {
                    // InternalDeviceParser.g:302:5: ( ruleEString )
                    // InternalDeviceParser.g:303:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceNetworkPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_7, grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

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
    // InternalDeviceParser.g:326:1: entryRuleAddressNetworkProperty returns [EObject current=null] : iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF ;
    public final EObject entryRuleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressNetworkProperty = null;


        try {
            // InternalDeviceParser.g:326:63: (iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF )
            // InternalDeviceParser.g:327:2: iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF
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
    // InternalDeviceParser.g:333:1: ruleAddressNetworkProperty returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Address (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT ) ;
    public final EObject ruleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:339:2: ( ( () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Address (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT ) )
            // InternalDeviceParser.g:340:2: ( () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Address (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT )
            {
            // InternalDeviceParser.g:340:2: ( () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Address (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT )
            // InternalDeviceParser.g:341:3: () this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Name otherlv_4= Address (otherlv_5= Value ( ( ruleEString ) ) )? this_DEDENT_7= RULE_DEDENT
            {
            // InternalDeviceParser.g:341:3: ()
            // InternalDeviceParser.g:342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0(),
            					current);
            			

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4); 

            			newLeafNode(this_INDENT_1, grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_1());
            		

            			newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getPreListElementParserRuleCall_2());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAddressNetworkPropertyAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,Address,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAddressNetworkPropertyAccess().getAddressKeyword_4());
            		
            // InternalDeviceParser.g:367:3: (otherlv_5= Value ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Value) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceParser.g:368:4: otherlv_5= Value ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,Value,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_5_0());
                    			
                    // InternalDeviceParser.g:372:4: ( ( ruleEString ) )
                    // InternalDeviceParser.g:373:5: ( ruleEString )
                    {
                    // InternalDeviceParser.g:373:5: ( ruleEString )
                    // InternalDeviceParser.g:374:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddressNetworkPropertyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_7, grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

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
    // InternalDeviceParser.g:397:1: entryRuleDeviceType_Impl returns [EObject current=null] : iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF ;
    public final EObject entryRuleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType_Impl = null;


        try {
            // InternalDeviceParser.g:397:56: (iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF )
            // InternalDeviceParser.g:398:2: iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF
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
    // InternalDeviceParser.g:404:1: ruleDeviceType_Impl returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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

        EObject lv_capability_7_0 = null;

        EObject lv_communicationConnection_11_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:410:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalDeviceParser.g:411:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalDeviceParser.g:411:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalDeviceParser.g:412:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalDeviceParser.g:412:3: ()
            // InternalDeviceParser.g:413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,DeviceType,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceType_ImplAccess().getDeviceTypeKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_5); 

            			newLeafNode(this_INDENT_2, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceType_ImplAccess().getNameKeyword_3());
            		
            // InternalDeviceParser.g:431:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDeviceParser.g:432:4: (lv_name_4_0= ruleEString )
            {
            // InternalDeviceParser.g:432:4: (lv_name_4_0= ruleEString )
            // InternalDeviceParser.g:433:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalDeviceParser.g:450:3: (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Capability) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeviceParser.g:451:4: otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,Capability,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeviceType_ImplAccess().getCapabilityKeyword_5_0());
                    			
                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_4); 

                    				newLeafNode(this_INDENT_6, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1());
                    			
                    // InternalDeviceParser.g:459:4: ( (lv_capability_7_0= ruleCapabilityProperty ) )+
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
                    	    // InternalDeviceParser.g:460:5: (lv_capability_7_0= ruleCapabilityProperty )
                    	    {
                    	    // InternalDeviceParser.g:460:5: (lv_capability_7_0= ruleCapabilityProperty )
                    	    // InternalDeviceParser.g:461:6: lv_capability_7_0= ruleCapabilityProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getCapabilityCapabilityPropertyParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_capability_7_0=ruleCapabilityProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDeviceType_ImplRule());
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_14); 

                    				newLeafNode(this_DEDENT_8, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalDeviceParser.g:483:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CommunicationConnection) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeviceParser.g:484:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0());
                    			
                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_4); 

                    				newLeafNode(this_INDENT_10, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1());
                    			
                    // InternalDeviceParser.g:492:4: ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+
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
                    	    // InternalDeviceParser.g:493:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                    	    {
                    	    // InternalDeviceParser.g:493:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                    	    // InternalDeviceParser.g:494:6: lv_communicationConnection_11_0= ruleAbstractCommunicationConnection
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_9); 

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


    // $ANTLR start "entryRuleComputationDeviceType"
    // InternalDeviceParser.g:524:1: entryRuleComputationDeviceType returns [EObject current=null] : iv_ruleComputationDeviceType= ruleComputationDeviceType EOF ;
    public final EObject entryRuleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceType = null;


        try {
            // InternalDeviceParser.g:524:62: (iv_ruleComputationDeviceType= ruleComputationDeviceType EOF )
            // InternalDeviceParser.g:525:2: iv_ruleComputationDeviceType= ruleComputationDeviceType EOF
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
    // InternalDeviceParser.g:531:1: ruleComputationDeviceType returns [EObject current=null] : (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= OperatingSystem ( ( ruleEString ) ) otherlv_6= ProcessorArchitecture ( ( ruleEString ) ) (otherlv_8= Capability this_INDENT_9= RULE_INDENT ( (lv_capability_10_0= ruleCapabilityProperty ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
    public final EObject ruleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_11=null;
        Token otherlv_12=null;
        Token this_INDENT_13=null;
        Token this_DEDENT_15=null;
        Token this_DEDENT_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_capability_10_0 = null;

        EObject lv_communicationConnection_14_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:537:2: ( (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= OperatingSystem ( ( ruleEString ) ) otherlv_6= ProcessorArchitecture ( ( ruleEString ) ) (otherlv_8= Capability this_INDENT_9= RULE_INDENT ( (lv_capability_10_0= ruleCapabilityProperty ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalDeviceParser.g:538:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= OperatingSystem ( ( ruleEString ) ) otherlv_6= ProcessorArchitecture ( ( ruleEString ) ) (otherlv_8= Capability this_INDENT_9= RULE_INDENT ( (lv_capability_10_0= ruleCapabilityProperty ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalDeviceParser.g:538:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= OperatingSystem ( ( ruleEString ) ) otherlv_6= ProcessorArchitecture ( ( ruleEString ) ) (otherlv_8= Capability this_INDENT_9= RULE_INDENT ( (lv_capability_10_0= ruleCapabilityProperty ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalDeviceParser.g:539:3: otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= OperatingSystem ( ( ruleEString ) ) otherlv_6= ProcessorArchitecture ( ( ruleEString ) ) (otherlv_8= Capability this_INDENT_9= RULE_INDENT ( (lv_capability_10_0= ruleCapabilityProperty ) )+ this_DEDENT_11= RULE_DEDENT )? (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ComputationDeviceType,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0());
            		
            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_5); 

            			newLeafNode(this_INDENT_1, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2());
            		
            // InternalDeviceParser.g:551:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:552:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:552:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:553:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_4=(Token)match(input,OperatingSystem,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemKeyword_4());
            		
            // InternalDeviceParser.g:574:3: ( ( ruleEString ) )
            // InternalDeviceParser.g:575:4: ( ruleEString )
            {
            // InternalDeviceParser.g:575:4: ( ruleEString )
            // InternalDeviceParser.g:576:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputationDeviceTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemOpertingSystemCrossReference_5_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,ProcessorArchitecture,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureKeyword_6());
            		
            // InternalDeviceParser.g:594:3: ( ( ruleEString ) )
            // InternalDeviceParser.g:595:4: ( ruleEString )
            {
            // InternalDeviceParser.g:595:4: ( ruleEString )
            // InternalDeviceParser.g:596:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputationDeviceTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureProcessorArchitectureCrossReference_7_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceParser.g:610:3: (otherlv_8= Capability this_INDENT_9= RULE_INDENT ( (lv_capability_10_0= ruleCapabilityProperty ) )+ this_DEDENT_11= RULE_DEDENT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Capability) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceParser.g:611:4: otherlv_8= Capability this_INDENT_9= RULE_INDENT ( (lv_capability_10_0= ruleCapabilityProperty ) )+ this_DEDENT_11= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Capability,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getComputationDeviceTypeAccess().getCapabilityKeyword_8_0());
                    			
                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_4); 

                    				newLeafNode(this_INDENT_9, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_8_1());
                    			
                    // InternalDeviceParser.g:619:4: ( (lv_capability_10_0= ruleCapabilityProperty ) )+
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
                    	    // InternalDeviceParser.g:620:5: (lv_capability_10_0= ruleCapabilityProperty )
                    	    {
                    	    // InternalDeviceParser.g:620:5: (lv_capability_10_0= ruleCapabilityProperty )
                    	    // InternalDeviceParser.g:621:6: lv_capability_10_0= ruleCapabilityProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_capability_10_0=ruleCapabilityProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"capability",
                    	    							lv_capability_10_0,
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

                    this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_14); 

                    				newLeafNode(this_DEDENT_11, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalDeviceParser.g:643:3: (otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CommunicationConnection) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeviceParser.g:644:4: otherlv_12= CommunicationConnection this_INDENT_13= RULE_INDENT ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_12=(Token)match(input,CommunicationConnection,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_9_0());
                    			
                    this_INDENT_13=(Token)match(input,RULE_INDENT,FOLLOW_4); 

                    				newLeafNode(this_INDENT_13, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_9_1());
                    			
                    // InternalDeviceParser.g:652:4: ( (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection ) )+
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
                    	    // InternalDeviceParser.g:653:5: (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection )
                    	    {
                    	    // InternalDeviceParser.g:653:5: (lv_communicationConnection_14_0= ruleAbstractCommunicationConnection )
                    	    // InternalDeviceParser.g:654:6: lv_communicationConnection_14_0= ruleAbstractCommunicationConnection
                    	    {

                    	    						newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
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
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_9); 

                    				newLeafNode(this_DEDENT_15, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_16, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleCapabilityProperty"
    // InternalDeviceParser.g:684:1: entryRuleCapabilityProperty returns [EObject current=null] : iv_ruleCapabilityProperty= ruleCapabilityProperty EOF ;
    public final EObject entryRuleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperty = null;


        try {
            // InternalDeviceParser.g:684:59: (iv_ruleCapabilityProperty= ruleCapabilityProperty EOF )
            // InternalDeviceParser.g:685:2: iv_ruleCapabilityProperty= ruleCapabilityProperty EOF
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
    // InternalDeviceParser.g:691:1: ruleCapabilityProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:697:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalDeviceParser.g:698:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalDeviceParser.g:698:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            // InternalDeviceParser.g:699:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( ( ruleEString ) ) otherlv_6= Kind ( (lv_kind_7_0= ruleCapabilityKind ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertyAccess().getNameKeyword_1());
            		
            // InternalDeviceParser.g:710:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:711:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:711:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:712:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_17); 

            			newLeafNode(this_INDENT_3, grammarAccess.getCapabilityPropertyAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertyAccess().getTypeKeyword_4());
            		
            // InternalDeviceParser.g:737:3: ( ( ruleEString ) )
            // InternalDeviceParser.g:738:4: ( ruleEString )
            {
            // InternalDeviceParser.g:738:4: ( ruleEString )
            // InternalDeviceParser.g:739:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Kind,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getCapabilityPropertyAccess().getKindKeyword_6());
            		
            // InternalDeviceParser.g:757:3: ( (lv_kind_7_0= ruleCapabilityKind ) )
            // InternalDeviceParser.g:758:4: (lv_kind_7_0= ruleCapabilityKind )
            {
            // InternalDeviceParser.g:758:4: (lv_kind_7_0= ruleCapabilityKind )
            // InternalDeviceParser.g:759:5: lv_kind_7_0= ruleCapabilityKind
            {

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalDeviceParser.g:776:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Value) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDeviceParser.g:777:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getCapabilityPropertyAccess().getValueKeyword_8_0());
                    			
                    // InternalDeviceParser.g:781:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:782:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:782:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:783:6: lv_value_9_0= rulePropertyValue
                    {

                    						newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_value_9_0=rulePropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
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
    // InternalDeviceParser.g:809:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalDeviceParser.g:809:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalDeviceParser.g:810:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalDeviceParser.g:816:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:822:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalDeviceParser.g:823:2: ( () otherlv_1= AttributeKind )
            {
            // InternalDeviceParser.g:823:2: ( () otherlv_1= AttributeKind )
            // InternalDeviceParser.g:824:3: () otherlv_1= AttributeKind
            {
            // InternalDeviceParser.g:824:3: ()
            // InternalDeviceParser.g:825:4: 
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
    // InternalDeviceParser.g:839:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalDeviceParser.g:839:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalDeviceParser.g:840:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalDeviceParser.g:846:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:852:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalDeviceParser.g:853:2: ( () otherlv_1= MaximumKind )
            {
            // InternalDeviceParser.g:853:2: ( () otherlv_1= MaximumKind )
            // InternalDeviceParser.g:854:3: () otherlv_1= MaximumKind
            {
            // InternalDeviceParser.g:854:3: ()
            // InternalDeviceParser.g:855:4: 
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
    // InternalDeviceParser.g:869:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalDeviceParser.g:869:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalDeviceParser.g:870:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalDeviceParser.g:876:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:882:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalDeviceParser.g:883:2: ( () otherlv_1= MinimumKind )
            {
            // InternalDeviceParser.g:883:2: ( () otherlv_1= MinimumKind )
            // InternalDeviceParser.g:884:3: () otherlv_1= MinimumKind
            {
            // InternalDeviceParser.g:884:3: ()
            // InternalDeviceParser.g:885:4: 
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
    // InternalDeviceParser.g:899:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalDeviceParser.g:899:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalDeviceParser.g:900:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalDeviceParser.g:906:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:912:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalDeviceParser.g:913:2: ( () otherlv_1= SelectionKind )
            {
            // InternalDeviceParser.g:913:2: ( () otherlv_1= SelectionKind )
            // InternalDeviceParser.g:914:3: () otherlv_1= SelectionKind
            {
            // InternalDeviceParser.g:914:3: ()
            // InternalDeviceParser.g:915:4: 
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
    // InternalDeviceParser.g:929:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalDeviceParser.g:929:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalDeviceParser.g:930:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
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
    // InternalDeviceParser.g:936:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:942:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:943:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:943:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalDeviceParser.g:944:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalDeviceParser.g:944:3: ()
            // InternalDeviceParser.g:945:4: 
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
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionPropertyAccess().getNameKeyword_2());
            		
            // InternalDeviceParser.g:962:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:963:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:963:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:964:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionPropertyAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalDeviceParser.g:981:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDeviceParser.g:982:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_22); 

                    				newLeafNode(this_INDENT_4, grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Value,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectionPropertyAccess().getValueKeyword_4_1());
                    			
                    // InternalDeviceParser.g:990:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:991:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:991:5: (lv_value_6_0= rulePropertyValue )
                    // InternalDeviceParser.g:992:6: lv_value_6_0= rulePropertyValue
                    {

                    						newCompositeNode(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_value_6_0=rulePropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"de.fraunhofer.ipa.deployment.Util.PropertyValue");
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


    // $ANTLR start "entryRuleNetworkConnection"
    // InternalDeviceParser.g:1018:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalDeviceParser.g:1018:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalDeviceParser.g:1019:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
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
    // InternalDeviceParser.g:1025:1: ruleNetworkConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? otherlv_11= RightCurlyBracket ) ;
    public final EObject ruleNetworkConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_INDENT_8=null;
        Token this_DEDENT_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_properties_9_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1031:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? otherlv_11= RightCurlyBracket ) )
            // InternalDeviceParser.g:1032:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? otherlv_11= RightCurlyBracket )
            {
            // InternalDeviceParser.g:1032:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? otherlv_11= RightCurlyBracket )
            // InternalDeviceParser.g:1033:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? otherlv_11= RightCurlyBracket
            {
            // InternalDeviceParser.g:1033:3: ()
            // InternalDeviceParser.g:1034:4: 
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
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkConnectionAccess().getNameKeyword_2());
            		
            // InternalDeviceParser.g:1051:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1052:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1052:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1053:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkConnectionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_17); 

            			newLeafNode(this_INDENT_4, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,Type,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5());
            		
            // InternalDeviceParser.g:1078:3: ( ( ruleEString ) )
            // InternalDeviceParser.g:1079:4: ( ruleEString )
            {
            // InternalDeviceParser.g:1079:4: ( ruleEString )
            // InternalDeviceParser.g:1080:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeCrossReference_6_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceParser.g:1094:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Properties) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDeviceParser.g:1095:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0());
                    			
                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_11); 

                    				newLeafNode(this_INDENT_8, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1());
                    			
                    // InternalDeviceParser.g:1103:4: ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_INDENT) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDeviceParser.g:1104:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                    	    {
                    	    // InternalDeviceParser.g:1104:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                    	    // InternalDeviceParser.g:1105:6: lv_properties_9_0= ruleAbstractNetworkProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getNetworkConnectionAccess().getPropertiesAbstractNetworkPropertyParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
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
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_25); 

                    				newLeafNode(this_DEDENT_10, grammarAccess.getNetworkConnectionAccess().getDEDENTTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

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
    // InternalDeviceParser.g:1135:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalDeviceParser.g:1135:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:1136:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
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
    // InternalDeviceParser.g:1142:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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

        EObject lv_properties_9_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1148:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1149:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1149:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1150:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1150:3: ()
            // InternalDeviceParser.g:1151:4: 
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
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationConnectionAccess().getNameKeyword_2());
            		
            // InternalDeviceParser.g:1168:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1169:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1169:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1170:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_17); 

            			newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,Type,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());
            		
            // InternalDeviceParser.g:1195:3: ( ( ruleEString ) )
            // InternalDeviceParser.g:1196:4: ( ruleEString )
            {
            // InternalDeviceParser.g:1196:4: ( ruleEString )
            // InternalDeviceParser.g:1197:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeCrossReference_6_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceParser.g:1211:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Properties) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeviceParser.g:1212:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());
                    			
                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_4); 

                    				newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());
                    			
                    // InternalDeviceParser.g:1220:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
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
                    	    // InternalDeviceParser.g:1221:5: (lv_properties_9_0= ruleConnectionProperty )
                    	    {
                    	    // InternalDeviceParser.g:1221:5: (lv_properties_9_0= ruleConnectionProperty )
                    	    // InternalDeviceParser.g:1222:6: lv_properties_9_0= ruleConnectionProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPropertiesConnectionPropertyParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
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
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_9); 

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


    // $ANTLR start "entryRulePropertyValue"
    // InternalDeviceParser.g:1252:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalDeviceParser.g:1252:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalDeviceParser.g:1253:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalDeviceParser.g:1259:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1265:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString ) )
            // InternalDeviceParser.g:1266:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString )
            {
            // InternalDeviceParser.g:1266:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt22=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalDeviceParser.g:1267:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalDeviceParser.g:1276:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalDeviceParser.g:1285:3: this_PropertyValueString_2= rulePropertyValueString
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
    // InternalDeviceParser.g:1297:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalDeviceParser.g:1297:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalDeviceParser.g:1298:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalDeviceParser.g:1304:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1310:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalDeviceParser.g:1311:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalDeviceParser.g:1311:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalDeviceParser.g:1312:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalDeviceParser.g:1312:3: (lv_value_0_0= ruleInteger0 )
            // InternalDeviceParser.g:1313:4: lv_value_0_0= ruleInteger0
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
    // InternalDeviceParser.g:1333:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalDeviceParser.g:1333:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:1334:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalDeviceParser.g:1340:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1346:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalDeviceParser.g:1347:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalDeviceParser.g:1347:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalDeviceParser.g:1348:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalDeviceParser.g:1348:3: (lv_value_0_0= ruleDouble0 )
            // InternalDeviceParser.g:1349:4: lv_value_0_0= ruleDouble0
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
    // InternalDeviceParser.g:1369:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalDeviceParser.g:1369:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalDeviceParser.g:1370:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalDeviceParser.g:1376:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1382:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDeviceParser.g:1383:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDeviceParser.g:1383:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDeviceParser.g:1384:3: (lv_value_0_0= ruleEString )
            {
            // InternalDeviceParser.g:1384:3: (lv_value_0_0= ruleEString )
            // InternalDeviceParser.g:1385:4: lv_value_0_0= ruleEString
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


    // $ANTLR start "entryRuleResouceType_Impl"
    // InternalDeviceParser.g:1405:1: entryRuleResouceType_Impl returns [EObject current=null] : iv_ruleResouceType_Impl= ruleResouceType_Impl EOF ;
    public final EObject entryRuleResouceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResouceType_Impl = null;


        try {
            // InternalDeviceParser.g:1405:57: (iv_ruleResouceType_Impl= ruleResouceType_Impl EOF )
            // InternalDeviceParser.g:1406:2: iv_ruleResouceType_Impl= ruleResouceType_Impl EOF
            {
             newCompositeNode(grammarAccess.getResouceType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResouceType_Impl=ruleResouceType_Impl();

            state._fsp--;

             current =iv_ruleResouceType_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResouceType_Impl"


    // $ANTLR start "ruleResouceType_Impl"
    // InternalDeviceParser.g:1412:1: ruleResouceType_Impl returns [EObject current=null] : ( () otherlv_1= ResouceType ) ;
    public final EObject ruleResouceType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1418:2: ( ( () otherlv_1= ResouceType ) )
            // InternalDeviceParser.g:1419:2: ( () otherlv_1= ResouceType )
            {
            // InternalDeviceParser.g:1419:2: ( () otherlv_1= ResouceType )
            // InternalDeviceParser.g:1420:3: () otherlv_1= ResouceType
            {
            // InternalDeviceParser.g:1420:3: ()
            // InternalDeviceParser.g:1421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResouceType_ImplAccess().getResouceTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ResouceType,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getResouceType_ImplAccess().getResouceTypeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResouceType_Impl"


    // $ANTLR start "entryRuleLinuxOpertingSystem"
    // InternalDeviceParser.g:1435:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalDeviceParser.g:1435:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalDeviceParser.g:1436:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalDeviceParser.g:1442:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1448:2: ( ( () otherlv_1= LinuxOpertingSystem ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:1449:2: ( () otherlv_1= LinuxOpertingSystem ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:1449:2: ( () otherlv_1= LinuxOpertingSystem ( (lv_name_2_0= ruleEString ) ) )
            // InternalDeviceParser.g:1450:3: () otherlv_1= LinuxOpertingSystem ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDeviceParser.g:1450:3: ()
            // InternalDeviceParser.g:1451:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LinuxOpertingSystem,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemKeyword_1());
            		
            // InternalDeviceParser.g:1461:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:1462:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:1462:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:1463:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinuxOpertingSystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinuxOpertingSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleLinuxOpertingSystem"


    // $ANTLR start "entryRuleX86ProcessorArchitecture"
    // InternalDeviceParser.g:1484:1: entryRuleX86ProcessorArchitecture returns [EObject current=null] : iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF ;
    public final EObject entryRuleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX86ProcessorArchitecture = null;


        try {
            // InternalDeviceParser.g:1484:65: (iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF )
            // InternalDeviceParser.g:1485:2: iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:1491:1: ruleX86ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= X86ProcessorArchitecture ) ;
    public final EObject ruleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1497:2: ( ( () otherlv_1= X86ProcessorArchitecture ) )
            // InternalDeviceParser.g:1498:2: ( () otherlv_1= X86ProcessorArchitecture )
            {
            // InternalDeviceParser.g:1498:2: ( () otherlv_1= X86ProcessorArchitecture )
            // InternalDeviceParser.g:1499:3: () otherlv_1= X86ProcessorArchitecture
            {
            // InternalDeviceParser.g:1499:3: ()
            // InternalDeviceParser.g:1500:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,X86ProcessorArchitecture,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalDeviceParser.g:1514:1: entryRuleArm64ProcessorArchitecture returns [EObject current=null] : iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF ;
    public final EObject entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm64ProcessorArchitecture = null;


        try {
            // InternalDeviceParser.g:1514:67: (iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF )
            // InternalDeviceParser.g:1515:2: iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:1521:1: ruleArm64ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= Arm64ProcessorArchitecture ) ;
    public final EObject ruleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1527:2: ( ( () otherlv_1= Arm64ProcessorArchitecture ) )
            // InternalDeviceParser.g:1528:2: ( () otherlv_1= Arm64ProcessorArchitecture )
            {
            // InternalDeviceParser.g:1528:2: ( () otherlv_1= Arm64ProcessorArchitecture )
            // InternalDeviceParser.g:1529:3: () otherlv_1= Arm64ProcessorArchitecture
            {
            // InternalDeviceParser.g:1529:3: ()
            // InternalDeviceParser.g:1530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Arm64ProcessorArchitecture,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalDeviceParser.g:1544:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalDeviceParser.g:1544:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalDeviceParser.g:1545:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalDeviceParser.g:1551:1: ruleCommunicationType returns [EObject current=null] : ( () otherlv_1= CommunicationType ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1557:2: ( ( () otherlv_1= CommunicationType ) )
            // InternalDeviceParser.g:1558:2: ( () otherlv_1= CommunicationType )
            {
            // InternalDeviceParser.g:1558:2: ( () otherlv_1= CommunicationType )
            // InternalDeviceParser.g:1559:3: () otherlv_1= CommunicationType
            {
            // InternalDeviceParser.g:1559:3: ()
            // InternalDeviceParser.g:1560:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,CommunicationType,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCommunicationTypeAccess().getCommunicationTypeKeyword_1());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEthernetCommunicationType"
    // InternalDeviceParser.g:1574:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalDeviceParser.g:1574:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalDeviceParser.g:1575:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalDeviceParser.g:1581:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= EthernetCommunicationType ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1587:2: ( ( () otherlv_1= EthernetCommunicationType ) )
            // InternalDeviceParser.g:1588:2: ( () otherlv_1= EthernetCommunicationType )
            {
            // InternalDeviceParser.g:1588:2: ( () otherlv_1= EthernetCommunicationType )
            // InternalDeviceParser.g:1589:3: () otherlv_1= EthernetCommunicationType
            {
            // InternalDeviceParser.g:1589:3: ()
            // InternalDeviceParser.g:1590:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,EthernetCommunicationType,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalDeviceParser.g:1604:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalDeviceParser.g:1604:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalDeviceParser.g:1605:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalDeviceParser.g:1611:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= WlanCommunicationType ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1617:2: ( ( () otherlv_1= WlanCommunicationType ) )
            // InternalDeviceParser.g:1618:2: ( () otherlv_1= WlanCommunicationType )
            {
            // InternalDeviceParser.g:1618:2: ( () otherlv_1= WlanCommunicationType )
            // InternalDeviceParser.g:1619:3: () otherlv_1= WlanCommunicationType
            {
            // InternalDeviceParser.g:1619:3: ()
            // InternalDeviceParser.g:1620:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,WlanCommunicationType,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeKeyword_1());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleDouble0"
    // InternalDeviceParser.g:1634:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalDeviceParser.g:1634:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalDeviceParser.g:1635:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalDeviceParser.g:1641:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1647:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalDeviceParser.g:1648:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalDeviceParser.g:1658:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalDeviceParser.g:1658:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalDeviceParser.g:1659:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalDeviceParser.g:1665:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1671:2: (this_DECINT_0= RULE_DECINT )
            // InternalDeviceParser.g:1672:2: this_DECINT_0= RULE_DECINT
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
    // InternalDeviceParser.g:1682:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDeviceParser.g:1682:47: (iv_ruleEString= ruleEString EOF )
            // InternalDeviceParser.g:1683:2: iv_ruleEString= ruleEString EOF
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
    // InternalDeviceParser.g:1689:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1695:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDeviceParser.g:1696:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDeviceParser.g:1696:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeviceParser.g:1697:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1705:3: this_ID_1= RULE_ID
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
    // InternalDeviceParser.g:1716:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:1718:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalDeviceParser.g:1719:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalDeviceParser.g:1728:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:1735:2: (kw= HyphenMinus )
            // InternalDeviceParser.g:1736:2: kw= HyphenMinus
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\34\1\32\1\54\2\52\1\33\1\54\2\25\1\52\2\uffff\1\34";
    static final String dfa_3s = "\1\34\1\32\1\56\2\52\1\33\1\56\2\53\1\52\2\uffff\1\52";
    static final String dfa_4s = "\12\uffff\1\2\1\1\1\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\10\1\uffff\1\7",
            "\1\11\7\uffff\1\13\15\uffff\1\12",
            "\1\11\7\uffff\1\13\15\uffff\1\12",
            "\1\14",
            "",
            "",
            "\1\12\15\uffff\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "197:2: (this_NetworkConnection_0= ruleNetworkConnection | this_CommunicationConnection_1= ruleCommunicationConnection )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000100080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000006C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000500600000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000200000L});

}