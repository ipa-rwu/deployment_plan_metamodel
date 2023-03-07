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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arm64ProcessorArchitecture", "X86ProcessorArchitecture", "CommunicationConnection", "ComputationDeviceType", "ProcessorArchitecture", "AttributeKind", "SelectionKind", "DeviceType", "MaximumKind", "MinimumKind", "Capability", "Properties", "Interface", "Ethernet", "Address", "Value", "Linux", "MacOS", "Kind", "Name", "Type", "Wlan", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=32;
    public static final int Address=18;
    public static final int RULE_DATE_TIME=37;
    public static final int RULE_BOOLEAN=29;
    public static final int AttributeKind=9;
    public static final int RULE_YEAR=34;
    public static final int Name=23;
    public static final int RULE_MIN_SEC=36;
    public static final int Kind=22;
    public static final int RULE_DEDENT=40;
    public static final int Capability=14;
    public static final int RULE_ID=41;
    public static final int RULE_DIGIT=27;
    public static final int SelectionKind=10;
    public static final int Arm64ProcessorArchitecture=4;
    public static final int DeviceType=11;
    public static final int Linux=20;
    public static final int RULE_INT=42;
    public static final int Ethernet=17;
    public static final int Value=19;
    public static final int RULE_ML_COMMENT=44;
    public static final int MacOS=21;
    public static final int ProcessorArchitecture=8;
    public static final int RULE_STRING=43;
    public static final int Wlan=25;
    public static final int Properties=15;
    public static final int RULE_SL_COMMENT=38;
    public static final int CommunicationConnection=6;
    public static final int HyphenMinus=26;
    public static final int RULE_DOUBLE=31;
    public static final int RULE_DECINT=30;
    public static final int MinimumKind=13;
    public static final int EOF=-1;
    public static final int RULE_INDENT=39;
    public static final int RULE_HOUR=35;
    public static final int RULE_WS=45;
    public static final int MaximumKind=12;
    public static final int RULE_ANY_OTHER=46;
    public static final int ComputationDeviceType=7;
    public static final int Type=24;
    public static final int X86ProcessorArchitecture=5;
    public static final int RULE_MONTH=33;
    public static final int RULE_BINARY=28;
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
    // InternalDeviceParser.g:190:1: ruleAbstractCommunicationConnection returns [EObject current=null] : (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) ;
    public final EObject ruleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationConnection_0 = null;

        EObject this_NetworkConnection_1 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:196:2: ( (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) )
            // InternalDeviceParser.g:197:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            {
            // InternalDeviceParser.g:197:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==HyphenMinus) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==Name) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_STRING) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==RULE_INDENT) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==Type) ) {
                                int LA4_6 = input.LA(6);

                                if ( (LA4_6==Ethernet||LA4_6==Wlan) ) {
                                    alt4=2;
                                }
                                else if ( (LA4_6==RULE_ID||LA4_6==RULE_STRING) ) {
                                    alt4=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_2==RULE_ID) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==RULE_INDENT) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==Type) ) {
                                int LA4_6 = input.LA(6);

                                if ( (LA4_6==Ethernet||LA4_6==Wlan) ) {
                                    alt4=2;
                                }
                                else if ( (LA4_6==RULE_ID||LA4_6==RULE_STRING) ) {
                                    alt4=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
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
                    // InternalDeviceParser.g:198:3: this_CommunicationConnection_0= ruleCommunicationConnection
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
                    // InternalDeviceParser.g:207:3: this_NetworkConnection_1= ruleNetworkConnection
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

            if ( (LA5_0==HyphenMinus) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==Name) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==Address) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==Interface) ) {
                        alt5=1;
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
    // InternalDeviceParser.g:262:1: ruleInterfaceNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
    public final EObject ruleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:268:2: ( ( () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:269:2: ( () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:269:2: ( () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalDeviceParser.g:270:3: () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalDeviceParser.g:270:3: ()
            // InternalDeviceParser.g:271:4: 
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
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceNetworkPropertyAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,Interface,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceKeyword_3());
            		
            // InternalDeviceParser.g:292:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:293:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_4, grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Value,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_4_1());
                    			
                    // InternalDeviceParser.g:301:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:302:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:302:5: (lv_value_6_0= rulePropertyValue )
                    // InternalDeviceParser.g:303:6: lv_value_6_0= rulePropertyValue
                    {

                    						newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_value_6_0=rulePropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceNetworkPropertyRule());
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

                    				newLeafNode(this_DEDENT_7, grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_4_3());
                    			

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
    // $ANTLR end "ruleInterfaceNetworkProperty"


    // $ANTLR start "entryRuleAddressNetworkProperty"
    // InternalDeviceParser.g:329:1: entryRuleAddressNetworkProperty returns [EObject current=null] : iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF ;
    public final EObject entryRuleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressNetworkProperty = null;


        try {
            // InternalDeviceParser.g:329:63: (iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF )
            // InternalDeviceParser.g:330:2: iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF
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
    // InternalDeviceParser.g:336:1: ruleAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
    public final EObject ruleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:342:2: ( ( () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:343:2: ( () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:343:2: ( () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalDeviceParser.g:344:3: () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalDeviceParser.g:344:3: ()
            // InternalDeviceParser.g:345:4: 
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
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAddressNetworkPropertyAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,Address,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAddressNetworkPropertyAccess().getAddressKeyword_3());
            		
            // InternalDeviceParser.g:366:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceParser.g:367:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_4, grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Value,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_4_1());
                    			
                    // InternalDeviceParser.g:375:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:376:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:376:5: (lv_value_6_0= rulePropertyValue )
                    // InternalDeviceParser.g:377:6: lv_value_6_0= rulePropertyValue
                    {

                    						newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_value_6_0=rulePropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressNetworkPropertyRule());
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

                    				newLeafNode(this_DEDENT_7, grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_4_3());
                    			

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
    // $ANTLR end "ruleAddressNetworkProperty"


    // $ANTLR start "entryRuleDeviceType_Impl"
    // InternalDeviceParser.g:403:1: entryRuleDeviceType_Impl returns [EObject current=null] : iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF ;
    public final EObject entryRuleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType_Impl = null;


        try {
            // InternalDeviceParser.g:403:56: (iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF )
            // InternalDeviceParser.g:404:2: iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF
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
    // InternalDeviceParser.g:410:1: ruleDeviceType_Impl returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:416:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalDeviceParser.g:417:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalDeviceParser.g:417:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalDeviceParser.g:418:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalDeviceParser.g:418:3: ()
            // InternalDeviceParser.g:419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,DeviceType,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceType_ImplAccess().getDeviceTypeKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_4); 

            			newLeafNode(this_INDENT_2, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceType_ImplAccess().getNameKeyword_3());
            		
            // InternalDeviceParser.g:437:3: ( (lv_name_4_0= ruleEString ) )
            // InternalDeviceParser.g:438:4: (lv_name_4_0= ruleEString )
            {
            // InternalDeviceParser.g:438:4: (lv_name_4_0= ruleEString )
            // InternalDeviceParser.g:439:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalDeviceParser.g:456:3: (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Capability) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeviceParser.g:457:4: otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,Capability,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeviceType_ImplAccess().getCapabilityKeyword_5_0());
                    			
                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_14); 

                    				newLeafNode(this_INDENT_6, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1());
                    			
                    // InternalDeviceParser.g:465:4: ( (lv_capability_7_0= ruleCapabilityProperty ) )+
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
                    	    // InternalDeviceParser.g:466:5: (lv_capability_7_0= ruleCapabilityProperty )
                    	    {
                    	    // InternalDeviceParser.g:466:5: (lv_capability_7_0= ruleCapabilityProperty )
                    	    // InternalDeviceParser.g:467:6: lv_capability_7_0= ruleCapabilityProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getCapabilityCapabilityPropertyParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
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

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_16); 

                    				newLeafNode(this_DEDENT_8, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalDeviceParser.g:489:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CommunicationConnection) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeviceParser.g:490:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0());
                    			
                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_14); 

                    				newLeafNode(this_INDENT_10, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1());
                    			
                    // InternalDeviceParser.g:498:4: ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+
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
                    	    // InternalDeviceParser.g:499:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                    	    {
                    	    // InternalDeviceParser.g:499:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                    	    // InternalDeviceParser.g:500:6: lv_communicationConnection_11_0= ruleAbstractCommunicationConnection
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
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
    // InternalDeviceParser.g:530:1: entryRuleComputationDeviceType returns [EObject current=null] : iv_ruleComputationDeviceType= ruleComputationDeviceType EOF ;
    public final EObject entryRuleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceType = null;


        try {
            // InternalDeviceParser.g:530:62: (iv_ruleComputationDeviceType= ruleComputationDeviceType EOF )
            // InternalDeviceParser.g:531:2: iv_ruleComputationDeviceType= ruleComputationDeviceType EOF
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
    // InternalDeviceParser.g:537:1: ruleComputationDeviceType returns [EObject current=null] : (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT ) ;
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

        EObject lv_capability_6_0 = null;

        EObject lv_communicationConnection_10_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:543:2: ( (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT ) )
            // InternalDeviceParser.g:544:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT )
            {
            // InternalDeviceParser.g:544:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT )
            // InternalDeviceParser.g:545:3: otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ComputationDeviceType,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0());
            		
            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4); 

            			newLeafNode(this_INDENT_1, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2());
            		
            // InternalDeviceParser.g:557:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:558:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:558:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:559:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalDeviceParser.g:576:3: (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Capability) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceParser.g:577:4: otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,Capability,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getComputationDeviceTypeAccess().getCapabilityKeyword_4_0());
                    			
                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_14); 

                    				newLeafNode(this_INDENT_5, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1());
                    			
                    // InternalDeviceParser.g:585:4: ( (lv_capability_6_0= ruleCapabilityProperty ) )+
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
                    	    // InternalDeviceParser.g:586:5: (lv_capability_6_0= ruleCapabilityProperty )
                    	    {
                    	    // InternalDeviceParser.g:586:5: (lv_capability_6_0= ruleCapabilityProperty )
                    	    // InternalDeviceParser.g:587:6: lv_capability_6_0= ruleCapabilityProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_capability_6_0=ruleCapabilityProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"capability",
                    	    							lv_capability_6_0,
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

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_16); 

                    				newLeafNode(this_DEDENT_7, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            // InternalDeviceParser.g:609:3: (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CommunicationConnection) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeviceParser.g:610:4: otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,CommunicationConnection,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_5_0());
                    			
                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_14); 

                    				newLeafNode(this_INDENT_9, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());
                    			
                    // InternalDeviceParser.g:618:4: ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+
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
                    	    // InternalDeviceParser.g:619:5: (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection )
                    	    {
                    	    // InternalDeviceParser.g:619:5: (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection )
                    	    // InternalDeviceParser.g:620:6: lv_communicationConnection_10_0= ruleAbstractCommunicationConnection
                    	    {

                    	    						newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
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
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_9); 

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


    // $ANTLR start "entryRuleCapabilityProperty"
    // InternalDeviceParser.g:650:1: entryRuleCapabilityProperty returns [EObject current=null] : iv_ruleCapabilityProperty= ruleCapabilityProperty EOF ;
    public final EObject entryRuleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperty = null;


        try {
            // InternalDeviceParser.g:650:59: (iv_ruleCapabilityProperty= ruleCapabilityProperty EOF )
            // InternalDeviceParser.g:651:2: iv_ruleCapabilityProperty= ruleCapabilityProperty EOF
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
    // InternalDeviceParser.g:657:1: ruleCapabilityProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:663:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalDeviceParser.g:664:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalDeviceParser.g:664:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            // InternalDeviceParser.g:665:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertyAccess().getNameKeyword_1());
            		
            // InternalDeviceParser.g:676:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDeviceParser.g:677:4: (lv_name_2_0= ruleEString )
            {
            // InternalDeviceParser.g:677:4: (lv_name_2_0= ruleEString )
            // InternalDeviceParser.g:678:5: lv_name_2_0= ruleEString
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
            		
            otherlv_4=(Token)match(input,Kind,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertyAccess().getKindKeyword_4());
            		
            // InternalDeviceParser.g:703:3: ( (lv_kind_5_0= ruleCapabilityKind ) )
            // InternalDeviceParser.g:704:4: (lv_kind_5_0= ruleCapabilityKind )
            {
            // InternalDeviceParser.g:704:4: (lv_kind_5_0= ruleCapabilityKind )
            // InternalDeviceParser.g:705:5: lv_kind_5_0= ruleCapabilityKind
            {

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_kind_5_0=ruleCapabilityKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_5_0,
            						"de.fraunhofer.ipa.targetEnvironment.Device.CapabilityKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Type,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getCapabilityPropertyAccess().getTypeKeyword_6());
            		
            // InternalDeviceParser.g:726:3: ( (lv_type_7_0= ruleAbstractResouceType ) )
            // InternalDeviceParser.g:727:4: (lv_type_7_0= ruleAbstractResouceType )
            {
            // InternalDeviceParser.g:727:4: (lv_type_7_0= ruleAbstractResouceType )
            // InternalDeviceParser.g:728:5: lv_type_7_0= ruleAbstractResouceType
            {

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getTypeAbstractResouceTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_type_7_0=ruleAbstractResouceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"de.fraunhofer.ipa.deployment.Util.AbstractResouceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceParser.g:745:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Value) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDeviceParser.g:746:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getCapabilityPropertyAccess().getValueKeyword_8_0());
                    			
                    // InternalDeviceParser.g:750:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:751:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:751:5: (lv_value_9_0= rulePropertyValue )
                    // InternalDeviceParser.g:752:6: lv_value_9_0= rulePropertyValue
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
    // InternalDeviceParser.g:778:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalDeviceParser.g:778:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalDeviceParser.g:779:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalDeviceParser.g:785:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:791:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalDeviceParser.g:792:2: ( () otherlv_1= AttributeKind )
            {
            // InternalDeviceParser.g:792:2: ( () otherlv_1= AttributeKind )
            // InternalDeviceParser.g:793:3: () otherlv_1= AttributeKind
            {
            // InternalDeviceParser.g:793:3: ()
            // InternalDeviceParser.g:794:4: 
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
    // InternalDeviceParser.g:808:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalDeviceParser.g:808:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalDeviceParser.g:809:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalDeviceParser.g:815:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:821:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalDeviceParser.g:822:2: ( () otherlv_1= MaximumKind )
            {
            // InternalDeviceParser.g:822:2: ( () otherlv_1= MaximumKind )
            // InternalDeviceParser.g:823:3: () otherlv_1= MaximumKind
            {
            // InternalDeviceParser.g:823:3: ()
            // InternalDeviceParser.g:824:4: 
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
    // InternalDeviceParser.g:838:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalDeviceParser.g:838:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalDeviceParser.g:839:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalDeviceParser.g:845:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:851:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalDeviceParser.g:852:2: ( () otherlv_1= MinimumKind )
            {
            // InternalDeviceParser.g:852:2: ( () otherlv_1= MinimumKind )
            // InternalDeviceParser.g:853:3: () otherlv_1= MinimumKind
            {
            // InternalDeviceParser.g:853:3: ()
            // InternalDeviceParser.g:854:4: 
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
    // InternalDeviceParser.g:868:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalDeviceParser.g:868:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalDeviceParser.g:869:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalDeviceParser.g:875:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:881:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalDeviceParser.g:882:2: ( () otherlv_1= SelectionKind )
            {
            // InternalDeviceParser.g:882:2: ( () otherlv_1= SelectionKind )
            // InternalDeviceParser.g:883:3: () otherlv_1= SelectionKind
            {
            // InternalDeviceParser.g:883:3: ()
            // InternalDeviceParser.g:884:4: 
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
    // InternalDeviceParser.g:898:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalDeviceParser.g:898:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalDeviceParser.g:899:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
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
    // InternalDeviceParser.g:905:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
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
            // InternalDeviceParser.g:911:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalDeviceParser.g:912:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:912:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalDeviceParser.g:913:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalDeviceParser.g:913:3: ()
            // InternalDeviceParser.g:914:4: 
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
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionPropertyAccess().getNameKeyword_2());
            		
            // InternalDeviceParser.g:931:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:932:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:932:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:933:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionPropertyAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalDeviceParser.g:950:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDeviceParser.g:951:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_4, grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Value,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectionPropertyAccess().getValueKeyword_4_1());
                    			
                    // InternalDeviceParser.g:959:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalDeviceParser.g:960:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalDeviceParser.g:960:5: (lv_value_6_0= rulePropertyValue )
                    // InternalDeviceParser.g:961:6: lv_value_6_0= rulePropertyValue
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
    // InternalDeviceParser.g:987:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalDeviceParser.g:987:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalDeviceParser.g:988:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
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
    // InternalDeviceParser.g:994:1: ruleNetworkConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1000:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1001:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1001:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1002:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1002:3: ()
            // InternalDeviceParser.g:1003:4: 
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
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkConnectionAccess().getNameKeyword_2());
            		
            // InternalDeviceParser.g:1020:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1021:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1021:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1022:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_19); 

            			newLeafNode(this_INDENT_4, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,Type,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5());
            		
            // InternalDeviceParser.g:1047:3: ( (lv_type_6_0= ruleNetworkCommunicationType ) )
            // InternalDeviceParser.g:1048:4: (lv_type_6_0= ruleNetworkCommunicationType )
            {
            // InternalDeviceParser.g:1048:4: (lv_type_6_0= ruleNetworkCommunicationType )
            // InternalDeviceParser.g:1049:5: lv_type_6_0= ruleNetworkCommunicationType
            {

            					newCompositeNode(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalDeviceParser.g:1066:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Properties) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDeviceParser.g:1067:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0());
                    			
                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_14); 

                    				newLeafNode(this_INDENT_8, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1());
                    			
                    // InternalDeviceParser.g:1075:4: ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+
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
                    	    // InternalDeviceParser.g:1076:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                    	    {
                    	    // InternalDeviceParser.g:1076:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                    	    // InternalDeviceParser.g:1077:6: lv_properties_9_0= ruleAbstractNetworkProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getNetworkConnectionAccess().getPropertiesAbstractNetworkPropertyParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
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

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_9); 

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
    // InternalDeviceParser.g:1107:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalDeviceParser.g:1107:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:1108:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
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
    // InternalDeviceParser.g:1114:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalDeviceParser.g:1120:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalDeviceParser.g:1121:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalDeviceParser.g:1121:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalDeviceParser.g:1122:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalDeviceParser.g:1122:3: ()
            // InternalDeviceParser.g:1123:4: 
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
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationConnectionAccess().getNameKeyword_2());
            		
            // InternalDeviceParser.g:1140:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDeviceParser.g:1141:4: (lv_name_3_0= ruleEString )
            {
            // InternalDeviceParser.g:1141:4: (lv_name_3_0= ruleEString )
            // InternalDeviceParser.g:1142:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_19); 

            			newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,Type,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());
            		
            // InternalDeviceParser.g:1167:3: ( ( ruleEString ) )
            // InternalDeviceParser.g:1168:4: ( ruleEString )
            {
            // InternalDeviceParser.g:1168:4: ( ruleEString )
            // InternalDeviceParser.g:1169:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeCrossReference_6_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeviceParser.g:1183:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Properties) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeviceParser.g:1184:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());
                    			
                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_14); 

                    				newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());
                    			
                    // InternalDeviceParser.g:1192:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
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
                    	    // InternalDeviceParser.g:1193:5: (lv_properties_9_0= ruleConnectionProperty )
                    	    {
                    	    // InternalDeviceParser.g:1193:5: (lv_properties_9_0= ruleConnectionProperty )
                    	    // InternalDeviceParser.g:1194:6: lv_properties_9_0= ruleConnectionProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPropertiesConnectionPropertyParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
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
    // InternalDeviceParser.g:1224:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalDeviceParser.g:1224:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalDeviceParser.g:1225:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalDeviceParser.g:1231:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1237:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) )
            // InternalDeviceParser.g:1238:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            {
            // InternalDeviceParser.g:1238:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            int alt22=4;
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
            case Arm64ProcessorArchitecture:
            case X86ProcessorArchitecture:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalDeviceParser.g:1239:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalDeviceParser.g:1248:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalDeviceParser.g:1257:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalDeviceParser.g:1266:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
    // InternalDeviceParser.g:1278:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalDeviceParser.g:1278:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalDeviceParser.g:1279:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalDeviceParser.g:1285:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1291:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalDeviceParser.g:1292:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalDeviceParser.g:1292:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalDeviceParser.g:1293:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalDeviceParser.g:1293:3: (lv_value_0_0= ruleInteger0 )
            // InternalDeviceParser.g:1294:4: lv_value_0_0= ruleInteger0
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
    // InternalDeviceParser.g:1314:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalDeviceParser.g:1314:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:1315:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalDeviceParser.g:1321:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1327:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalDeviceParser.g:1328:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalDeviceParser.g:1328:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalDeviceParser.g:1329:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalDeviceParser.g:1329:3: (lv_value_0_0= ruleDouble0 )
            // InternalDeviceParser.g:1330:4: lv_value_0_0= ruleDouble0
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
    // InternalDeviceParser.g:1350:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalDeviceParser.g:1350:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalDeviceParser.g:1351:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalDeviceParser.g:1357:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1363:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDeviceParser.g:1364:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDeviceParser.g:1364:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDeviceParser.g:1365:3: (lv_value_0_0= ruleEString )
            {
            // InternalDeviceParser.g:1365:3: (lv_value_0_0= ruleEString )
            // InternalDeviceParser.g:1366:4: lv_value_0_0= ruleEString
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
    // InternalDeviceParser.g:1386:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalDeviceParser.g:1386:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalDeviceParser.g:1387:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalDeviceParser.g:1393:1: ruleProcessorArchitectureValue returns [EObject current=null] : (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject this_X86ProcessorArchitecture_0 = null;

        EObject this_Arm64ProcessorArchitecture_1 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1399:2: ( (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) )
            // InternalDeviceParser.g:1400:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            {
            // InternalDeviceParser.g:1400:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==X86ProcessorArchitecture) ) {
                alt23=1;
            }
            else if ( (LA23_0==Arm64ProcessorArchitecture) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeviceParser.g:1401:3: this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture
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
                    // InternalDeviceParser.g:1410:3: this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture
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
    // InternalDeviceParser.g:1422:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalDeviceParser.g:1422:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalDeviceParser.g:1423:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalDeviceParser.g:1429:1: ruleAbstractResouceType returns [EObject current=null] : (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType ) ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_OpertingSystemType_0 = null;

        EObject this_ProcessorArchitectureType_1 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1435:2: ( (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType ) )
            // InternalDeviceParser.g:1436:2: (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType )
            {
            // InternalDeviceParser.g:1436:2: (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=Linux && LA24_0<=MacOS)) ) {
                alt24=1;
            }
            else if ( (LA24_0==ProcessorArchitecture) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDeviceParser.g:1437:3: this_OpertingSystemType_0= ruleOpertingSystemType
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
                    // InternalDeviceParser.g:1446:3: this_ProcessorArchitectureType_1= ruleProcessorArchitectureType
                    {

                    			newCompositeNode(grammarAccess.getAbstractResouceTypeAccess().getProcessorArchitectureTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessorArchitectureType_1=ruleProcessorArchitectureType();

                    state._fsp--;


                    			current = this_ProcessorArchitectureType_1;
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
    // InternalDeviceParser.g:1458:1: entryRuleOpertingSystemType returns [EObject current=null] : iv_ruleOpertingSystemType= ruleOpertingSystemType EOF ;
    public final EObject entryRuleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemType = null;


        try {
            // InternalDeviceParser.g:1458:59: (iv_ruleOpertingSystemType= ruleOpertingSystemType EOF )
            // InternalDeviceParser.g:1459:2: iv_ruleOpertingSystemType= ruleOpertingSystemType EOF
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
    // InternalDeviceParser.g:1465:1: ruleOpertingSystemType returns [EObject current=null] : (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) ;
    public final EObject ruleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystemType_0 = null;

        EObject this_MacOSOpertingSystemType_1 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1471:2: ( (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) )
            // InternalDeviceParser.g:1472:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            {
            // InternalDeviceParser.g:1472:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Linux) ) {
                alt25=1;
            }
            else if ( (LA25_0==MacOS) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDeviceParser.g:1473:3: this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType
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
                    // InternalDeviceParser.g:1482:3: this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType
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


    // $ANTLR start "entryRuleProcessorArchitectureType"
    // InternalDeviceParser.g:1494:1: entryRuleProcessorArchitectureType returns [EObject current=null] : iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF ;
    public final EObject entryRuleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureType = null;


        try {
            // InternalDeviceParser.g:1494:66: (iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF )
            // InternalDeviceParser.g:1495:2: iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF
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
    // InternalDeviceParser.g:1501:1: ruleProcessorArchitectureType returns [EObject current=null] : ( () otherlv_1= ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1507:2: ( ( () otherlv_1= ProcessorArchitecture ) )
            // InternalDeviceParser.g:1508:2: ( () otherlv_1= ProcessorArchitecture )
            {
            // InternalDeviceParser.g:1508:2: ( () otherlv_1= ProcessorArchitecture )
            // InternalDeviceParser.g:1509:3: () otherlv_1= ProcessorArchitecture
            {
            // InternalDeviceParser.g:1509:3: ()
            // InternalDeviceParser.g:1510:4: 
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
    // InternalDeviceParser.g:1524:1: entryRuleLinuxOpertingSystemType returns [EObject current=null] : iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF ;
    public final EObject entryRuleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystemType = null;


        try {
            // InternalDeviceParser.g:1524:64: (iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF )
            // InternalDeviceParser.g:1525:2: iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF
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
    // InternalDeviceParser.g:1531:1: ruleLinuxOpertingSystemType returns [EObject current=null] : ( () otherlv_1= Linux ) ;
    public final EObject ruleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1537:2: ( ( () otherlv_1= Linux ) )
            // InternalDeviceParser.g:1538:2: ( () otherlv_1= Linux )
            {
            // InternalDeviceParser.g:1538:2: ( () otherlv_1= Linux )
            // InternalDeviceParser.g:1539:3: () otherlv_1= Linux
            {
            // InternalDeviceParser.g:1539:3: ()
            // InternalDeviceParser.g:1540:4: 
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
    // InternalDeviceParser.g:1554:1: entryRuleMacOSOpertingSystemType returns [EObject current=null] : iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF ;
    public final EObject entryRuleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystemType = null;


        try {
            // InternalDeviceParser.g:1554:64: (iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF )
            // InternalDeviceParser.g:1555:2: iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF
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
    // InternalDeviceParser.g:1561:1: ruleMacOSOpertingSystemType returns [EObject current=null] : ( () otherlv_1= MacOS ) ;
    public final EObject ruleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1567:2: ( ( () otherlv_1= MacOS ) )
            // InternalDeviceParser.g:1568:2: ( () otherlv_1= MacOS )
            {
            // InternalDeviceParser.g:1568:2: ( () otherlv_1= MacOS )
            // InternalDeviceParser.g:1569:3: () otherlv_1= MacOS
            {
            // InternalDeviceParser.g:1569:3: ()
            // InternalDeviceParser.g:1570:4: 
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
    // InternalDeviceParser.g:1584:1: entryRuleX86ProcessorArchitecture returns [EObject current=null] : iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF ;
    public final EObject entryRuleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX86ProcessorArchitecture = null;


        try {
            // InternalDeviceParser.g:1584:65: (iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF )
            // InternalDeviceParser.g:1585:2: iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:1591:1: ruleX86ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= X86ProcessorArchitecture ) ;
    public final EObject ruleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1597:2: ( ( () otherlv_1= X86ProcessorArchitecture ) )
            // InternalDeviceParser.g:1598:2: ( () otherlv_1= X86ProcessorArchitecture )
            {
            // InternalDeviceParser.g:1598:2: ( () otherlv_1= X86ProcessorArchitecture )
            // InternalDeviceParser.g:1599:3: () otherlv_1= X86ProcessorArchitecture
            {
            // InternalDeviceParser.g:1599:3: ()
            // InternalDeviceParser.g:1600:4: 
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
    // InternalDeviceParser.g:1614:1: entryRuleArm64ProcessorArchitecture returns [EObject current=null] : iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF ;
    public final EObject entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm64ProcessorArchitecture = null;


        try {
            // InternalDeviceParser.g:1614:67: (iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF )
            // InternalDeviceParser.g:1615:2: iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:1621:1: ruleArm64ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= Arm64ProcessorArchitecture ) ;
    public final EObject ruleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1627:2: ( ( () otherlv_1= Arm64ProcessorArchitecture ) )
            // InternalDeviceParser.g:1628:2: ( () otherlv_1= Arm64ProcessorArchitecture )
            {
            // InternalDeviceParser.g:1628:2: ( () otherlv_1= Arm64ProcessorArchitecture )
            // InternalDeviceParser.g:1629:3: () otherlv_1= Arm64ProcessorArchitecture
            {
            // InternalDeviceParser.g:1629:3: ()
            // InternalDeviceParser.g:1630:4: 
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
    // InternalDeviceParser.g:1644:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalDeviceParser.g:1644:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalDeviceParser.g:1645:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalDeviceParser.g:1651:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1657:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDeviceParser.g:1658:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDeviceParser.g:1658:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalDeviceParser.g:1659:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDeviceParser.g:1659:3: ()
            // InternalDeviceParser.g:1660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
            					current);
            			

            }

            // InternalDeviceParser.g:1666:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDeviceParser.g:1667:4: (lv_name_1_0= ruleEString )
            {
            // InternalDeviceParser.g:1667:4: (lv_name_1_0= ruleEString )
            // InternalDeviceParser.g:1668:5: lv_name_1_0= ruleEString
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
    // InternalDeviceParser.g:1689:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalDeviceParser.g:1689:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalDeviceParser.g:1690:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalDeviceParser.g:1696:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



        	enterRule();

        try {
            // InternalDeviceParser.g:1702:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalDeviceParser.g:1703:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalDeviceParser.g:1703:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Ethernet) ) {
                alt26=1;
            }
            else if ( (LA26_0==Wlan) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDeviceParser.g:1704:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalDeviceParser.g:1713:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalDeviceParser.g:1725:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalDeviceParser.g:1725:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalDeviceParser.g:1726:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalDeviceParser.g:1732:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1738:2: ( ( () otherlv_1= Ethernet ) )
            // InternalDeviceParser.g:1739:2: ( () otherlv_1= Ethernet )
            {
            // InternalDeviceParser.g:1739:2: ( () otherlv_1= Ethernet )
            // InternalDeviceParser.g:1740:3: () otherlv_1= Ethernet
            {
            // InternalDeviceParser.g:1740:3: ()
            // InternalDeviceParser.g:1741:4: 
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
    // InternalDeviceParser.g:1755:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalDeviceParser.g:1755:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalDeviceParser.g:1756:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalDeviceParser.g:1762:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1768:2: ( ( () otherlv_1= Wlan ) )
            // InternalDeviceParser.g:1769:2: ( () otherlv_1= Wlan )
            {
            // InternalDeviceParser.g:1769:2: ( () otherlv_1= Wlan )
            // InternalDeviceParser.g:1770:3: () otherlv_1= Wlan
            {
            // InternalDeviceParser.g:1770:3: ()
            // InternalDeviceParser.g:1771:4: 
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


    // $ANTLR start "entryRuleDouble0"
    // InternalDeviceParser.g:1785:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalDeviceParser.g:1785:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalDeviceParser.g:1786:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalDeviceParser.g:1792:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1798:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalDeviceParser.g:1799:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalDeviceParser.g:1809:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalDeviceParser.g:1809:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalDeviceParser.g:1810:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalDeviceParser.g:1816:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1822:2: (this_DECINT_0= RULE_DECINT )
            // InternalDeviceParser.g:1823:2: this_DECINT_0= RULE_DECINT
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
    // InternalDeviceParser.g:1833:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDeviceParser.g:1833:47: (iv_ruleEString= ruleEString EOF )
            // InternalDeviceParser.g:1834:2: iv_ruleEString= ruleEString EOF
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
    // InternalDeviceParser.g:1840:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDeviceParser.g:1846:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDeviceParser.g:1847:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDeviceParser.g:1847:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDeviceParser.g:1848:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1856:3: this_ID_1= RULE_ID
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
    // InternalDeviceParser.g:1867:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:1869:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalDeviceParser.g:1870:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalDeviceParser.g:1879:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:1886:2: (kw= HyphenMinus )
            // InternalDeviceParser.g:1887:2: kw= HyphenMinus
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000A00C0000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000004040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003600L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000008000L});

}