package de.fraunhofer.ipa.targetEnvironment.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fraunhofer.ipa.targetEnvironment.services.DeviceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Kind", "'kind:'");
    		tokenNameToValue.put("Name", "'name:'");
    		tokenNameToValue.put("Type", "'type:'");
    		tokenNameToValue.put("Value", "'value:'");
    		tokenNameToValue.put("Address", "'address'");
    		tokenNameToValue.put("Interface", "'interface'");
    		tokenNameToValue.put("DeviceType", "'DeviceType:'");
    		tokenNameToValue.put("MaximumKind", "'MaximumKind'");
    		tokenNameToValue.put("MinimumKind", "'MinimumKind'");
    		tokenNameToValue.put("ResouceType", "'ResouceType'");
    		tokenNameToValue.put("Capability", "'capability:'");
    		tokenNameToValue.put("Properties", "'properties:'");
    		tokenNameToValue.put("AttributeKind", "'AttributeKind'");
    		tokenNameToValue.put("SelectionKind", "'SelectionKind'");
    		tokenNameToValue.put("OperatingSystem", "'operatingSystem:'");
    		tokenNameToValue.put("CommunicationType", "'CommunicationType'");
    		tokenNameToValue.put("LinuxOpertingSystem", "'LinuxOpertingSystem'");
    		tokenNameToValue.put("WlanCommunicationType", "'WlanCommunicationType'");
    		tokenNameToValue.put("ComputationDeviceType", "'ComputationDeviceType:'");
    		tokenNameToValue.put("ProcessorArchitecture", "'processorArchitecture:'");
    		tokenNameToValue.put("X86ProcessorArchitecture", "'X86ProcessorArchitecture'");
    		tokenNameToValue.put("CommunicationConnection", "'communicationConnection:'");
    		tokenNameToValue.put("EthernetCommunicationType", "'EthernetCommunicationType'");
    		tokenNameToValue.put("Arm64ProcessorArchitecture", "'Arm64ProcessorArchitecture'");
    	}

    	public void setGrammarAccess(DeviceGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleDeviceSet"
    // InternalDeviceParser.g:81:1: entryRuleDeviceSet : ruleDeviceSet EOF ;
    public final void entryRuleDeviceSet() throws RecognitionException {
        try {
            // InternalDeviceParser.g:82:1: ( ruleDeviceSet EOF )
            // InternalDeviceParser.g:83:1: ruleDeviceSet EOF
            {
             before(grammarAccess.getDeviceSetRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceSet();

            state._fsp--;

             after(grammarAccess.getDeviceSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceSet"


    // $ANTLR start "ruleDeviceSet"
    // InternalDeviceParser.g:90:1: ruleDeviceSet : ( ( rule__DeviceSet__DeviceAssignment )* ) ;
    public final void ruleDeviceSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:94:2: ( ( ( rule__DeviceSet__DeviceAssignment )* ) )
            // InternalDeviceParser.g:95:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            {
            // InternalDeviceParser.g:95:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            // InternalDeviceParser.g:96:3: ( rule__DeviceSet__DeviceAssignment )*
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceAssignment()); 
            // InternalDeviceParser.g:97:3: ( rule__DeviceSet__DeviceAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ComputationDeviceType||LA1_0==DeviceType) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDeviceParser.g:97:4: rule__DeviceSet__DeviceAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DeviceSet__DeviceAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDeviceSetAccess().getDeviceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceSet"


    // $ANTLR start "entryRuleCapabilityKind"
    // InternalDeviceParser.g:106:1: entryRuleCapabilityKind : ruleCapabilityKind EOF ;
    public final void entryRuleCapabilityKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:107:1: ( ruleCapabilityKind EOF )
            // InternalDeviceParser.g:108:1: ruleCapabilityKind EOF
            {
             before(grammarAccess.getCapabilityKindRule()); 
            pushFollow(FOLLOW_1);
            ruleCapabilityKind();

            state._fsp--;

             after(grammarAccess.getCapabilityKindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCapabilityKind"


    // $ANTLR start "ruleCapabilityKind"
    // InternalDeviceParser.g:115:1: ruleCapabilityKind : ( ( rule__CapabilityKind__Alternatives ) ) ;
    public final void ruleCapabilityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:119:2: ( ( ( rule__CapabilityKind__Alternatives ) ) )
            // InternalDeviceParser.g:120:2: ( ( rule__CapabilityKind__Alternatives ) )
            {
            // InternalDeviceParser.g:120:2: ( ( rule__CapabilityKind__Alternatives ) )
            // InternalDeviceParser.g:121:3: ( rule__CapabilityKind__Alternatives )
            {
             before(grammarAccess.getCapabilityKindAccess().getAlternatives()); 
            // InternalDeviceParser.g:122:3: ( rule__CapabilityKind__Alternatives )
            // InternalDeviceParser.g:122:4: rule__CapabilityKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapabilityKind"


    // $ANTLR start "entryRuleDeviceType"
    // InternalDeviceParser.g:131:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:132:1: ( ruleDeviceType EOF )
            // InternalDeviceParser.g:133:1: ruleDeviceType EOF
            {
             before(grammarAccess.getDeviceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceType"


    // $ANTLR start "ruleDeviceType"
    // InternalDeviceParser.g:140:1: ruleDeviceType : ( ( rule__DeviceType__Alternatives ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:144:2: ( ( ( rule__DeviceType__Alternatives ) ) )
            // InternalDeviceParser.g:145:2: ( ( rule__DeviceType__Alternatives ) )
            {
            // InternalDeviceParser.g:145:2: ( ( rule__DeviceType__Alternatives ) )
            // InternalDeviceParser.g:146:3: ( rule__DeviceType__Alternatives )
            {
             before(grammarAccess.getDeviceTypeAccess().getAlternatives()); 
            // InternalDeviceParser.g:147:3: ( rule__DeviceType__Alternatives )
            // InternalDeviceParser.g:147:4: rule__DeviceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "entryRuleAbstractCommunicationConnection"
    // InternalDeviceParser.g:156:1: entryRuleAbstractCommunicationConnection : ruleAbstractCommunicationConnection EOF ;
    public final void entryRuleAbstractCommunicationConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:157:1: ( ruleAbstractCommunicationConnection EOF )
            // InternalDeviceParser.g:158:1: ruleAbstractCommunicationConnection EOF
            {
             before(grammarAccess.getAbstractCommunicationConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractCommunicationConnection();

            state._fsp--;

             after(grammarAccess.getAbstractCommunicationConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractCommunicationConnection"


    // $ANTLR start "ruleAbstractCommunicationConnection"
    // InternalDeviceParser.g:165:1: ruleAbstractCommunicationConnection : ( ( rule__AbstractCommunicationConnection__Alternatives ) ) ;
    public final void ruleAbstractCommunicationConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:169:2: ( ( ( rule__AbstractCommunicationConnection__Alternatives ) ) )
            // InternalDeviceParser.g:170:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            {
            // InternalDeviceParser.g:170:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            // InternalDeviceParser.g:171:3: ( rule__AbstractCommunicationConnection__Alternatives )
            {
             before(grammarAccess.getAbstractCommunicationConnectionAccess().getAlternatives()); 
            // InternalDeviceParser.g:172:3: ( rule__AbstractCommunicationConnection__Alternatives )
            // InternalDeviceParser.g:172:4: rule__AbstractCommunicationConnection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommunicationConnection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractCommunicationConnectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractCommunicationConnection"


    // $ANTLR start "entryRuleAbstractNetworkProperty"
    // InternalDeviceParser.g:181:1: entryRuleAbstractNetworkProperty : ruleAbstractNetworkProperty EOF ;
    public final void entryRuleAbstractNetworkProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:182:1: ( ruleAbstractNetworkProperty EOF )
            // InternalDeviceParser.g:183:1: ruleAbstractNetworkProperty EOF
            {
             before(grammarAccess.getAbstractNetworkPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractNetworkProperty();

            state._fsp--;

             after(grammarAccess.getAbstractNetworkPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractNetworkProperty"


    // $ANTLR start "ruleAbstractNetworkProperty"
    // InternalDeviceParser.g:190:1: ruleAbstractNetworkProperty : ( ( rule__AbstractNetworkProperty__Alternatives ) ) ;
    public final void ruleAbstractNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:194:2: ( ( ( rule__AbstractNetworkProperty__Alternatives ) ) )
            // InternalDeviceParser.g:195:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            {
            // InternalDeviceParser.g:195:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            // InternalDeviceParser.g:196:3: ( rule__AbstractNetworkProperty__Alternatives )
            {
             before(grammarAccess.getAbstractNetworkPropertyAccess().getAlternatives()); 
            // InternalDeviceParser.g:197:3: ( rule__AbstractNetworkProperty__Alternatives )
            // InternalDeviceParser.g:197:4: rule__AbstractNetworkProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractNetworkProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractNetworkPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractNetworkProperty"


    // $ANTLR start "entryRuleInterfaceNetworkProperty"
    // InternalDeviceParser.g:206:1: entryRuleInterfaceNetworkProperty : ruleInterfaceNetworkProperty EOF ;
    public final void entryRuleInterfaceNetworkProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:207:1: ( ruleInterfaceNetworkProperty EOF )
            // InternalDeviceParser.g:208:1: ruleInterfaceNetworkProperty EOF
            {
             before(grammarAccess.getInterfaceNetworkPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceNetworkProperty();

            state._fsp--;

             after(grammarAccess.getInterfaceNetworkPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterfaceNetworkProperty"


    // $ANTLR start "ruleInterfaceNetworkProperty"
    // InternalDeviceParser.g:215:1: ruleInterfaceNetworkProperty : ( ( rule__InterfaceNetworkProperty__Group__0 ) ) ;
    public final void ruleInterfaceNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:219:2: ( ( ( rule__InterfaceNetworkProperty__Group__0 ) ) )
            // InternalDeviceParser.g:220:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:220:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            // InternalDeviceParser.g:221:3: ( rule__InterfaceNetworkProperty__Group__0 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup()); 
            // InternalDeviceParser.g:222:3: ( rule__InterfaceNetworkProperty__Group__0 )
            // InternalDeviceParser.g:222:4: rule__InterfaceNetworkProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceNetworkProperty"


    // $ANTLR start "entryRuleAddressNetworkProperty"
    // InternalDeviceParser.g:231:1: entryRuleAddressNetworkProperty : ruleAddressNetworkProperty EOF ;
    public final void entryRuleAddressNetworkProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:232:1: ( ruleAddressNetworkProperty EOF )
            // InternalDeviceParser.g:233:1: ruleAddressNetworkProperty EOF
            {
             before(grammarAccess.getAddressNetworkPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleAddressNetworkProperty();

            state._fsp--;

             after(grammarAccess.getAddressNetworkPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressNetworkProperty"


    // $ANTLR start "ruleAddressNetworkProperty"
    // InternalDeviceParser.g:240:1: ruleAddressNetworkProperty : ( ( rule__AddressNetworkProperty__Group__0 ) ) ;
    public final void ruleAddressNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:244:2: ( ( ( rule__AddressNetworkProperty__Group__0 ) ) )
            // InternalDeviceParser.g:245:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:245:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            // InternalDeviceParser.g:246:3: ( rule__AddressNetworkProperty__Group__0 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup()); 
            // InternalDeviceParser.g:247:3: ( rule__AddressNetworkProperty__Group__0 )
            // InternalDeviceParser.g:247:4: rule__AddressNetworkProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressNetworkProperty"


    // $ANTLR start "entryRuleDeviceType_Impl"
    // InternalDeviceParser.g:256:1: entryRuleDeviceType_Impl : ruleDeviceType_Impl EOF ;
    public final void entryRuleDeviceType_Impl() throws RecognitionException {
        try {
            // InternalDeviceParser.g:257:1: ( ruleDeviceType_Impl EOF )
            // InternalDeviceParser.g:258:1: ruleDeviceType_Impl EOF
            {
             before(grammarAccess.getDeviceType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceType_Impl();

            state._fsp--;

             after(grammarAccess.getDeviceType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceType_Impl"


    // $ANTLR start "ruleDeviceType_Impl"
    // InternalDeviceParser.g:265:1: ruleDeviceType_Impl : ( ( rule__DeviceType_Impl__Group__0 ) ) ;
    public final void ruleDeviceType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:269:2: ( ( ( rule__DeviceType_Impl__Group__0 ) ) )
            // InternalDeviceParser.g:270:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            {
            // InternalDeviceParser.g:270:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            // InternalDeviceParser.g:271:3: ( rule__DeviceType_Impl__Group__0 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup()); 
            // InternalDeviceParser.g:272:3: ( rule__DeviceType_Impl__Group__0 )
            // InternalDeviceParser.g:272:4: rule__DeviceType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceType_Impl"


    // $ANTLR start "entryRuleComputationDeviceType"
    // InternalDeviceParser.g:281:1: entryRuleComputationDeviceType : ruleComputationDeviceType EOF ;
    public final void entryRuleComputationDeviceType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:282:1: ( ruleComputationDeviceType EOF )
            // InternalDeviceParser.g:283:1: ruleComputationDeviceType EOF
            {
             before(grammarAccess.getComputationDeviceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComputationDeviceType();

            state._fsp--;

             after(grammarAccess.getComputationDeviceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComputationDeviceType"


    // $ANTLR start "ruleComputationDeviceType"
    // InternalDeviceParser.g:290:1: ruleComputationDeviceType : ( ( rule__ComputationDeviceType__Group__0 ) ) ;
    public final void ruleComputationDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:294:2: ( ( ( rule__ComputationDeviceType__Group__0 ) ) )
            // InternalDeviceParser.g:295:2: ( ( rule__ComputationDeviceType__Group__0 ) )
            {
            // InternalDeviceParser.g:295:2: ( ( rule__ComputationDeviceType__Group__0 ) )
            // InternalDeviceParser.g:296:3: ( rule__ComputationDeviceType__Group__0 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup()); 
            // InternalDeviceParser.g:297:3: ( rule__ComputationDeviceType__Group__0 )
            // InternalDeviceParser.g:297:4: rule__ComputationDeviceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComputationDeviceType"


    // $ANTLR start "entryRuleCapabilityProperty"
    // InternalDeviceParser.g:306:1: entryRuleCapabilityProperty : ruleCapabilityProperty EOF ;
    public final void entryRuleCapabilityProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:307:1: ( ruleCapabilityProperty EOF )
            // InternalDeviceParser.g:308:1: ruleCapabilityProperty EOF
            {
             before(grammarAccess.getCapabilityPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleCapabilityProperty();

            state._fsp--;

             after(grammarAccess.getCapabilityPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCapabilityProperty"


    // $ANTLR start "ruleCapabilityProperty"
    // InternalDeviceParser.g:315:1: ruleCapabilityProperty : ( ( rule__CapabilityProperty__Group__0 ) ) ;
    public final void ruleCapabilityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:319:2: ( ( ( rule__CapabilityProperty__Group__0 ) ) )
            // InternalDeviceParser.g:320:2: ( ( rule__CapabilityProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:320:2: ( ( rule__CapabilityProperty__Group__0 ) )
            // InternalDeviceParser.g:321:3: ( rule__CapabilityProperty__Group__0 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup()); 
            // InternalDeviceParser.g:322:3: ( rule__CapabilityProperty__Group__0 )
            // InternalDeviceParser.g:322:4: rule__CapabilityProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapabilityProperty"


    // $ANTLR start "entryRuleAttributeKind"
    // InternalDeviceParser.g:331:1: entryRuleAttributeKind : ruleAttributeKind EOF ;
    public final void entryRuleAttributeKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:332:1: ( ruleAttributeKind EOF )
            // InternalDeviceParser.g:333:1: ruleAttributeKind EOF
            {
             before(grammarAccess.getAttributeKindRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeKind();

            state._fsp--;

             after(grammarAccess.getAttributeKindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeKind"


    // $ANTLR start "ruleAttributeKind"
    // InternalDeviceParser.g:340:1: ruleAttributeKind : ( ( rule__AttributeKind__Group__0 ) ) ;
    public final void ruleAttributeKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:344:2: ( ( ( rule__AttributeKind__Group__0 ) ) )
            // InternalDeviceParser.g:345:2: ( ( rule__AttributeKind__Group__0 ) )
            {
            // InternalDeviceParser.g:345:2: ( ( rule__AttributeKind__Group__0 ) )
            // InternalDeviceParser.g:346:3: ( rule__AttributeKind__Group__0 )
            {
             before(grammarAccess.getAttributeKindAccess().getGroup()); 
            // InternalDeviceParser.g:347:3: ( rule__AttributeKind__Group__0 )
            // InternalDeviceParser.g:347:4: rule__AttributeKind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeKind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeKind"


    // $ANTLR start "entryRuleMaximumKind"
    // InternalDeviceParser.g:356:1: entryRuleMaximumKind : ruleMaximumKind EOF ;
    public final void entryRuleMaximumKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:357:1: ( ruleMaximumKind EOF )
            // InternalDeviceParser.g:358:1: ruleMaximumKind EOF
            {
             before(grammarAccess.getMaximumKindRule()); 
            pushFollow(FOLLOW_1);
            ruleMaximumKind();

            state._fsp--;

             after(grammarAccess.getMaximumKindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaximumKind"


    // $ANTLR start "ruleMaximumKind"
    // InternalDeviceParser.g:365:1: ruleMaximumKind : ( ( rule__MaximumKind__Group__0 ) ) ;
    public final void ruleMaximumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:369:2: ( ( ( rule__MaximumKind__Group__0 ) ) )
            // InternalDeviceParser.g:370:2: ( ( rule__MaximumKind__Group__0 ) )
            {
            // InternalDeviceParser.g:370:2: ( ( rule__MaximumKind__Group__0 ) )
            // InternalDeviceParser.g:371:3: ( rule__MaximumKind__Group__0 )
            {
             before(grammarAccess.getMaximumKindAccess().getGroup()); 
            // InternalDeviceParser.g:372:3: ( rule__MaximumKind__Group__0 )
            // InternalDeviceParser.g:372:4: rule__MaximumKind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaximumKind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaximumKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaximumKind"


    // $ANTLR start "entryRuleMinimumKind"
    // InternalDeviceParser.g:381:1: entryRuleMinimumKind : ruleMinimumKind EOF ;
    public final void entryRuleMinimumKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:382:1: ( ruleMinimumKind EOF )
            // InternalDeviceParser.g:383:1: ruleMinimumKind EOF
            {
             before(grammarAccess.getMinimumKindRule()); 
            pushFollow(FOLLOW_1);
            ruleMinimumKind();

            state._fsp--;

             after(grammarAccess.getMinimumKindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinimumKind"


    // $ANTLR start "ruleMinimumKind"
    // InternalDeviceParser.g:390:1: ruleMinimumKind : ( ( rule__MinimumKind__Group__0 ) ) ;
    public final void ruleMinimumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:394:2: ( ( ( rule__MinimumKind__Group__0 ) ) )
            // InternalDeviceParser.g:395:2: ( ( rule__MinimumKind__Group__0 ) )
            {
            // InternalDeviceParser.g:395:2: ( ( rule__MinimumKind__Group__0 ) )
            // InternalDeviceParser.g:396:3: ( rule__MinimumKind__Group__0 )
            {
             before(grammarAccess.getMinimumKindAccess().getGroup()); 
            // InternalDeviceParser.g:397:3: ( rule__MinimumKind__Group__0 )
            // InternalDeviceParser.g:397:4: rule__MinimumKind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinimumKind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinimumKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinimumKind"


    // $ANTLR start "entryRuleSelectionKind"
    // InternalDeviceParser.g:406:1: entryRuleSelectionKind : ruleSelectionKind EOF ;
    public final void entryRuleSelectionKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:407:1: ( ruleSelectionKind EOF )
            // InternalDeviceParser.g:408:1: ruleSelectionKind EOF
            {
             before(grammarAccess.getSelectionKindRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectionKind();

            state._fsp--;

             after(grammarAccess.getSelectionKindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionKind"


    // $ANTLR start "ruleSelectionKind"
    // InternalDeviceParser.g:415:1: ruleSelectionKind : ( ( rule__SelectionKind__Group__0 ) ) ;
    public final void ruleSelectionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:419:2: ( ( ( rule__SelectionKind__Group__0 ) ) )
            // InternalDeviceParser.g:420:2: ( ( rule__SelectionKind__Group__0 ) )
            {
            // InternalDeviceParser.g:420:2: ( ( rule__SelectionKind__Group__0 ) )
            // InternalDeviceParser.g:421:3: ( rule__SelectionKind__Group__0 )
            {
             before(grammarAccess.getSelectionKindAccess().getGroup()); 
            // InternalDeviceParser.g:422:3: ( rule__SelectionKind__Group__0 )
            // InternalDeviceParser.g:422:4: rule__SelectionKind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionKind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionKind"


    // $ANTLR start "entryRuleConnectionProperty"
    // InternalDeviceParser.g:431:1: entryRuleConnectionProperty : ruleConnectionProperty EOF ;
    public final void entryRuleConnectionProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:432:1: ( ruleConnectionProperty EOF )
            // InternalDeviceParser.g:433:1: ruleConnectionProperty EOF
            {
             before(grammarAccess.getConnectionPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectionProperty();

            state._fsp--;

             after(grammarAccess.getConnectionPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnectionProperty"


    // $ANTLR start "ruleConnectionProperty"
    // InternalDeviceParser.g:440:1: ruleConnectionProperty : ( ( rule__ConnectionProperty__Group__0 ) ) ;
    public final void ruleConnectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:444:2: ( ( ( rule__ConnectionProperty__Group__0 ) ) )
            // InternalDeviceParser.g:445:2: ( ( rule__ConnectionProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:445:2: ( ( rule__ConnectionProperty__Group__0 ) )
            // InternalDeviceParser.g:446:3: ( rule__ConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup()); 
            // InternalDeviceParser.g:447:3: ( rule__ConnectionProperty__Group__0 )
            // InternalDeviceParser.g:447:4: rule__ConnectionProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectionProperty"


    // $ANTLR start "entryRuleNetworkConnection"
    // InternalDeviceParser.g:456:1: entryRuleNetworkConnection : ruleNetworkConnection EOF ;
    public final void entryRuleNetworkConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:457:1: ( ruleNetworkConnection EOF )
            // InternalDeviceParser.g:458:1: ruleNetworkConnection EOF
            {
             before(grammarAccess.getNetworkConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkConnection();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNetworkConnection"


    // $ANTLR start "ruleNetworkConnection"
    // InternalDeviceParser.g:465:1: ruleNetworkConnection : ( ( rule__NetworkConnection__Group__0 ) ) ;
    public final void ruleNetworkConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:469:2: ( ( ( rule__NetworkConnection__Group__0 ) ) )
            // InternalDeviceParser.g:470:2: ( ( rule__NetworkConnection__Group__0 ) )
            {
            // InternalDeviceParser.g:470:2: ( ( rule__NetworkConnection__Group__0 ) )
            // InternalDeviceParser.g:471:3: ( rule__NetworkConnection__Group__0 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup()); 
            // InternalDeviceParser.g:472:3: ( rule__NetworkConnection__Group__0 )
            // InternalDeviceParser.g:472:4: rule__NetworkConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetworkConnection"


    // $ANTLR start "entryRuleCommunicationConnection"
    // InternalDeviceParser.g:481:1: entryRuleCommunicationConnection : ruleCommunicationConnection EOF ;
    public final void entryRuleCommunicationConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:482:1: ( ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:483:1: ruleCommunicationConnection EOF
            {
             before(grammarAccess.getCommunicationConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleCommunicationConnection();

            state._fsp--;

             after(grammarAccess.getCommunicationConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommunicationConnection"


    // $ANTLR start "ruleCommunicationConnection"
    // InternalDeviceParser.g:490:1: ruleCommunicationConnection : ( ( rule__CommunicationConnection__Group__0 ) ) ;
    public final void ruleCommunicationConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:494:2: ( ( ( rule__CommunicationConnection__Group__0 ) ) )
            // InternalDeviceParser.g:495:2: ( ( rule__CommunicationConnection__Group__0 ) )
            {
            // InternalDeviceParser.g:495:2: ( ( rule__CommunicationConnection__Group__0 ) )
            // InternalDeviceParser.g:496:3: ( rule__CommunicationConnection__Group__0 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup()); 
            // InternalDeviceParser.g:497:3: ( rule__CommunicationConnection__Group__0 )
            // InternalDeviceParser.g:497:4: rule__CommunicationConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommunicationConnection"


    // $ANTLR start "entryRulePropertyValue"
    // InternalDeviceParser.g:506:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalDeviceParser.g:507:1: ( rulePropertyValue EOF )
            // InternalDeviceParser.g:508:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalDeviceParser.g:515:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:519:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalDeviceParser.g:520:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalDeviceParser.g:520:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalDeviceParser.g:521:3: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            // InternalDeviceParser.g:522:3: ( rule__PropertyValue__Alternatives )
            // InternalDeviceParser.g:522:4: rule__PropertyValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePropertyValueInt"
    // InternalDeviceParser.g:531:1: entryRulePropertyValueInt : rulePropertyValueInt EOF ;
    public final void entryRulePropertyValueInt() throws RecognitionException {
        try {
            // InternalDeviceParser.g:532:1: ( rulePropertyValueInt EOF )
            // InternalDeviceParser.g:533:1: rulePropertyValueInt EOF
            {
             before(grammarAccess.getPropertyValueIntRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValueInt();

            state._fsp--;

             after(grammarAccess.getPropertyValueIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyValueInt"


    // $ANTLR start "rulePropertyValueInt"
    // InternalDeviceParser.g:540:1: rulePropertyValueInt : ( ( rule__PropertyValueInt__ValueAssignment ) ) ;
    public final void rulePropertyValueInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:544:2: ( ( ( rule__PropertyValueInt__ValueAssignment ) ) )
            // InternalDeviceParser.g:545:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            {
            // InternalDeviceParser.g:545:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            // InternalDeviceParser.g:546:3: ( rule__PropertyValueInt__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueIntAccess().getValueAssignment()); 
            // InternalDeviceParser.g:547:3: ( rule__PropertyValueInt__ValueAssignment )
            // InternalDeviceParser.g:547:4: rule__PropertyValueInt__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValueInt__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueIntAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValueInt"


    // $ANTLR start "entryRulePropertyValueDouble"
    // InternalDeviceParser.g:556:1: entryRulePropertyValueDouble : rulePropertyValueDouble EOF ;
    public final void entryRulePropertyValueDouble() throws RecognitionException {
        try {
            // InternalDeviceParser.g:557:1: ( rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:558:1: rulePropertyValueDouble EOF
            {
             before(grammarAccess.getPropertyValueDoubleRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValueDouble();

            state._fsp--;

             after(grammarAccess.getPropertyValueDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyValueDouble"


    // $ANTLR start "rulePropertyValueDouble"
    // InternalDeviceParser.g:565:1: rulePropertyValueDouble : ( ( rule__PropertyValueDouble__ValueAssignment ) ) ;
    public final void rulePropertyValueDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:569:2: ( ( ( rule__PropertyValueDouble__ValueAssignment ) ) )
            // InternalDeviceParser.g:570:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            {
            // InternalDeviceParser.g:570:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            // InternalDeviceParser.g:571:3: ( rule__PropertyValueDouble__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment()); 
            // InternalDeviceParser.g:572:3: ( rule__PropertyValueDouble__ValueAssignment )
            // InternalDeviceParser.g:572:4: rule__PropertyValueDouble__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValueDouble__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValueDouble"


    // $ANTLR start "entryRulePropertyValueString"
    // InternalDeviceParser.g:581:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // InternalDeviceParser.g:582:1: ( rulePropertyValueString EOF )
            // InternalDeviceParser.g:583:1: rulePropertyValueString EOF
            {
             before(grammarAccess.getPropertyValueStringRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValueString();

            state._fsp--;

             after(grammarAccess.getPropertyValueStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyValueString"


    // $ANTLR start "rulePropertyValueString"
    // InternalDeviceParser.g:590:1: rulePropertyValueString : ( ( rule__PropertyValueString__ValueAssignment ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:594:2: ( ( ( rule__PropertyValueString__ValueAssignment ) ) )
            // InternalDeviceParser.g:595:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            {
            // InternalDeviceParser.g:595:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            // InternalDeviceParser.g:596:3: ( rule__PropertyValueString__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueStringAccess().getValueAssignment()); 
            // InternalDeviceParser.g:597:3: ( rule__PropertyValueString__ValueAssignment )
            // InternalDeviceParser.g:597:4: rule__PropertyValueString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValueString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValueString"


    // $ANTLR start "entryRuleResouceType_Impl"
    // InternalDeviceParser.g:606:1: entryRuleResouceType_Impl : ruleResouceType_Impl EOF ;
    public final void entryRuleResouceType_Impl() throws RecognitionException {
        try {
            // InternalDeviceParser.g:607:1: ( ruleResouceType_Impl EOF )
            // InternalDeviceParser.g:608:1: ruleResouceType_Impl EOF
            {
             before(grammarAccess.getResouceType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleResouceType_Impl();

            state._fsp--;

             after(grammarAccess.getResouceType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResouceType_Impl"


    // $ANTLR start "ruleResouceType_Impl"
    // InternalDeviceParser.g:615:1: ruleResouceType_Impl : ( ( rule__ResouceType_Impl__Group__0 ) ) ;
    public final void ruleResouceType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:619:2: ( ( ( rule__ResouceType_Impl__Group__0 ) ) )
            // InternalDeviceParser.g:620:2: ( ( rule__ResouceType_Impl__Group__0 ) )
            {
            // InternalDeviceParser.g:620:2: ( ( rule__ResouceType_Impl__Group__0 ) )
            // InternalDeviceParser.g:621:3: ( rule__ResouceType_Impl__Group__0 )
            {
             before(grammarAccess.getResouceType_ImplAccess().getGroup()); 
            // InternalDeviceParser.g:622:3: ( rule__ResouceType_Impl__Group__0 )
            // InternalDeviceParser.g:622:4: rule__ResouceType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResouceType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResouceType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResouceType_Impl"


    // $ANTLR start "entryRuleLinuxOpertingSystem"
    // InternalDeviceParser.g:631:1: entryRuleLinuxOpertingSystem : ruleLinuxOpertingSystem EOF ;
    public final void entryRuleLinuxOpertingSystem() throws RecognitionException {
        try {
            // InternalDeviceParser.g:632:1: ( ruleLinuxOpertingSystem EOF )
            // InternalDeviceParser.g:633:1: ruleLinuxOpertingSystem EOF
            {
             before(grammarAccess.getLinuxOpertingSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleLinuxOpertingSystem();

            state._fsp--;

             after(grammarAccess.getLinuxOpertingSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinuxOpertingSystem"


    // $ANTLR start "ruleLinuxOpertingSystem"
    // InternalDeviceParser.g:640:1: ruleLinuxOpertingSystem : ( ( rule__LinuxOpertingSystem__Group__0 ) ) ;
    public final void ruleLinuxOpertingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:644:2: ( ( ( rule__LinuxOpertingSystem__Group__0 ) ) )
            // InternalDeviceParser.g:645:2: ( ( rule__LinuxOpertingSystem__Group__0 ) )
            {
            // InternalDeviceParser.g:645:2: ( ( rule__LinuxOpertingSystem__Group__0 ) )
            // InternalDeviceParser.g:646:3: ( rule__LinuxOpertingSystem__Group__0 )
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getGroup()); 
            // InternalDeviceParser.g:647:3: ( rule__LinuxOpertingSystem__Group__0 )
            // InternalDeviceParser.g:647:4: rule__LinuxOpertingSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinuxOpertingSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinuxOpertingSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinuxOpertingSystem"


    // $ANTLR start "entryRuleX86ProcessorArchitecture"
    // InternalDeviceParser.g:656:1: entryRuleX86ProcessorArchitecture : ruleX86ProcessorArchitecture EOF ;
    public final void entryRuleX86ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalDeviceParser.g:657:1: ( ruleX86ProcessorArchitecture EOF )
            // InternalDeviceParser.g:658:1: ruleX86ProcessorArchitecture EOF
            {
             before(grammarAccess.getX86ProcessorArchitectureRule()); 
            pushFollow(FOLLOW_1);
            ruleX86ProcessorArchitecture();

            state._fsp--;

             after(grammarAccess.getX86ProcessorArchitectureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleX86ProcessorArchitecture"


    // $ANTLR start "ruleX86ProcessorArchitecture"
    // InternalDeviceParser.g:665:1: ruleX86ProcessorArchitecture : ( ( rule__X86ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleX86ProcessorArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:669:2: ( ( ( rule__X86ProcessorArchitecture__Group__0 ) ) )
            // InternalDeviceParser.g:670:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            {
            // InternalDeviceParser.g:670:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            // InternalDeviceParser.g:671:3: ( rule__X86ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getGroup()); 
            // InternalDeviceParser.g:672:3: ( rule__X86ProcessorArchitecture__Group__0 )
            // InternalDeviceParser.g:672:4: rule__X86ProcessorArchitecture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__X86ProcessorArchitecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getX86ProcessorArchitectureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleX86ProcessorArchitecture"


    // $ANTLR start "entryRuleArm64ProcessorArchitecture"
    // InternalDeviceParser.g:681:1: entryRuleArm64ProcessorArchitecture : ruleArm64ProcessorArchitecture EOF ;
    public final void entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalDeviceParser.g:682:1: ( ruleArm64ProcessorArchitecture EOF )
            // InternalDeviceParser.g:683:1: ruleArm64ProcessorArchitecture EOF
            {
             before(grammarAccess.getArm64ProcessorArchitectureRule()); 
            pushFollow(FOLLOW_1);
            ruleArm64ProcessorArchitecture();

            state._fsp--;

             after(grammarAccess.getArm64ProcessorArchitectureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArm64ProcessorArchitecture"


    // $ANTLR start "ruleArm64ProcessorArchitecture"
    // InternalDeviceParser.g:690:1: ruleArm64ProcessorArchitecture : ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleArm64ProcessorArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:694:2: ( ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) )
            // InternalDeviceParser.g:695:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            {
            // InternalDeviceParser.g:695:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            // InternalDeviceParser.g:696:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getGroup()); 
            // InternalDeviceParser.g:697:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            // InternalDeviceParser.g:697:4: rule__Arm64ProcessorArchitecture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arm64ProcessorArchitecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArm64ProcessorArchitectureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArm64ProcessorArchitecture"


    // $ANTLR start "entryRuleCommunicationType"
    // InternalDeviceParser.g:706:1: entryRuleCommunicationType : ruleCommunicationType EOF ;
    public final void entryRuleCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:707:1: ( ruleCommunicationType EOF )
            // InternalDeviceParser.g:708:1: ruleCommunicationType EOF
            {
             before(grammarAccess.getCommunicationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCommunicationType();

            state._fsp--;

             after(grammarAccess.getCommunicationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommunicationType"


    // $ANTLR start "ruleCommunicationType"
    // InternalDeviceParser.g:715:1: ruleCommunicationType : ( ( rule__CommunicationType__Group__0 ) ) ;
    public final void ruleCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:719:2: ( ( ( rule__CommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:720:2: ( ( rule__CommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:720:2: ( ( rule__CommunicationType__Group__0 ) )
            // InternalDeviceParser.g:721:3: ( rule__CommunicationType__Group__0 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getGroup()); 
            // InternalDeviceParser.g:722:3: ( rule__CommunicationType__Group__0 )
            // InternalDeviceParser.g:722:4: rule__CommunicationType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommunicationType"


    // $ANTLR start "entryRuleEthernetCommunicationType"
    // InternalDeviceParser.g:731:1: entryRuleEthernetCommunicationType : ruleEthernetCommunicationType EOF ;
    public final void entryRuleEthernetCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:732:1: ( ruleEthernetCommunicationType EOF )
            // InternalDeviceParser.g:733:1: ruleEthernetCommunicationType EOF
            {
             before(grammarAccess.getEthernetCommunicationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEthernetCommunicationType();

            state._fsp--;

             after(grammarAccess.getEthernetCommunicationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEthernetCommunicationType"


    // $ANTLR start "ruleEthernetCommunicationType"
    // InternalDeviceParser.g:740:1: ruleEthernetCommunicationType : ( ( rule__EthernetCommunicationType__Group__0 ) ) ;
    public final void ruleEthernetCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:744:2: ( ( ( rule__EthernetCommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:745:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:745:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            // InternalDeviceParser.g:746:3: ( rule__EthernetCommunicationType__Group__0 )
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getGroup()); 
            // InternalDeviceParser.g:747:3: ( rule__EthernetCommunicationType__Group__0 )
            // InternalDeviceParser.g:747:4: rule__EthernetCommunicationType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EthernetCommunicationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEthernetCommunicationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEthernetCommunicationType"


    // $ANTLR start "entryRuleWlanCommunicationType"
    // InternalDeviceParser.g:756:1: entryRuleWlanCommunicationType : ruleWlanCommunicationType EOF ;
    public final void entryRuleWlanCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:757:1: ( ruleWlanCommunicationType EOF )
            // InternalDeviceParser.g:758:1: ruleWlanCommunicationType EOF
            {
             before(grammarAccess.getWlanCommunicationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleWlanCommunicationType();

            state._fsp--;

             after(grammarAccess.getWlanCommunicationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWlanCommunicationType"


    // $ANTLR start "ruleWlanCommunicationType"
    // InternalDeviceParser.g:765:1: ruleWlanCommunicationType : ( ( rule__WlanCommunicationType__Group__0 ) ) ;
    public final void ruleWlanCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:769:2: ( ( ( rule__WlanCommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:770:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:770:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            // InternalDeviceParser.g:771:3: ( rule__WlanCommunicationType__Group__0 )
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getGroup()); 
            // InternalDeviceParser.g:772:3: ( rule__WlanCommunicationType__Group__0 )
            // InternalDeviceParser.g:772:4: rule__WlanCommunicationType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WlanCommunicationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWlanCommunicationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWlanCommunicationType"


    // $ANTLR start "entryRuleDouble0"
    // InternalDeviceParser.g:781:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalDeviceParser.g:782:1: ( ruleDouble0 EOF )
            // InternalDeviceParser.g:783:1: ruleDouble0 EOF
            {
             before(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getDouble0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalDeviceParser.g:790:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:794:2: ( ( RULE_DOUBLE ) )
            // InternalDeviceParser.g:795:2: ( RULE_DOUBLE )
            {
            // InternalDeviceParser.g:795:2: ( RULE_DOUBLE )
            // InternalDeviceParser.g:796:3: RULE_DOUBLE
            {
             before(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalDeviceParser.g:806:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalDeviceParser.g:807:1: ( ruleInteger0 EOF )
            // InternalDeviceParser.g:808:1: ruleInteger0 EOF
            {
             before(grammarAccess.getInteger0Rule()); 
            pushFollow(FOLLOW_1);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getInteger0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalDeviceParser.g:815:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:819:2: ( ( RULE_DECINT ) )
            // InternalDeviceParser.g:820:2: ( RULE_DECINT )
            {
            // InternalDeviceParser.g:820:2: ( RULE_DECINT )
            // InternalDeviceParser.g:821:3: RULE_DECINT
            {
             before(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall()); 
            match(input,RULE_DECINT,FOLLOW_2); 
             after(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "entryRuleEString"
    // InternalDeviceParser.g:831:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDeviceParser.g:832:1: ( ruleEString EOF )
            // InternalDeviceParser.g:833:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDeviceParser.g:840:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:844:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDeviceParser.g:845:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDeviceParser.g:845:2: ( ( rule__EString__Alternatives ) )
            // InternalDeviceParser.g:846:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDeviceParser.g:847:3: ( rule__EString__Alternatives )
            // InternalDeviceParser.g:847:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePreListElement"
    // InternalDeviceParser.g:856:1: entryRulePreListElement : rulePreListElement EOF ;
    public final void entryRulePreListElement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:860:1: ( rulePreListElement EOF )
            // InternalDeviceParser.g:861:1: rulePreListElement EOF
            {
             before(grammarAccess.getPreListElementRule()); 
            pushFollow(FOLLOW_1);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPreListElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulePreListElement"


    // $ANTLR start "rulePreListElement"
    // InternalDeviceParser.g:871:1: rulePreListElement : ( HyphenMinus ) ;
    public final void rulePreListElement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:876:2: ( ( HyphenMinus ) )
            // InternalDeviceParser.g:877:2: ( HyphenMinus )
            {
            // InternalDeviceParser.g:877:2: ( HyphenMinus )
            // InternalDeviceParser.g:878:3: HyphenMinus
            {
             before(grammarAccess.getPreListElementAccess().getHyphenMinusKeyword()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getPreListElementAccess().getHyphenMinusKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulePreListElement"


    // $ANTLR start "rule__CapabilityKind__Alternatives"
    // InternalDeviceParser.g:888:1: rule__CapabilityKind__Alternatives : ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) );
    public final void rule__CapabilityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:892:1: ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) )
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
                    // InternalDeviceParser.g:893:2: ( ruleAttributeKind )
                    {
                    // InternalDeviceParser.g:893:2: ( ruleAttributeKind )
                    // InternalDeviceParser.g:894:3: ruleAttributeKind
                    {
                     before(grammarAccess.getCapabilityKindAccess().getAttributeKindParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeKind();

                    state._fsp--;

                     after(grammarAccess.getCapabilityKindAccess().getAttributeKindParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:899:2: ( ruleMaximumKind )
                    {
                    // InternalDeviceParser.g:899:2: ( ruleMaximumKind )
                    // InternalDeviceParser.g:900:3: ruleMaximumKind
                    {
                     before(grammarAccess.getCapabilityKindAccess().getMaximumKindParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMaximumKind();

                    state._fsp--;

                     after(grammarAccess.getCapabilityKindAccess().getMaximumKindParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceParser.g:905:2: ( ruleMinimumKind )
                    {
                    // InternalDeviceParser.g:905:2: ( ruleMinimumKind )
                    // InternalDeviceParser.g:906:3: ruleMinimumKind
                    {
                     before(grammarAccess.getCapabilityKindAccess().getMinimumKindParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMinimumKind();

                    state._fsp--;

                     after(grammarAccess.getCapabilityKindAccess().getMinimumKindParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceParser.g:911:2: ( ruleSelectionKind )
                    {
                    // InternalDeviceParser.g:911:2: ( ruleSelectionKind )
                    // InternalDeviceParser.g:912:3: ruleSelectionKind
                    {
                     before(grammarAccess.getCapabilityKindAccess().getSelectionKindParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectionKind();

                    state._fsp--;

                     after(grammarAccess.getCapabilityKindAccess().getSelectionKindParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityKind__Alternatives"


    // $ANTLR start "rule__DeviceType__Alternatives"
    // InternalDeviceParser.g:921:1: rule__DeviceType__Alternatives : ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) );
    public final void rule__DeviceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:925:1: ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) )
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
                    // InternalDeviceParser.g:926:2: ( ruleDeviceType_Impl )
                    {
                    // InternalDeviceParser.g:926:2: ( ruleDeviceType_Impl )
                    // InternalDeviceParser.g:927:3: ruleDeviceType_Impl
                    {
                     before(grammarAccess.getDeviceTypeAccess().getDeviceType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeviceType_Impl();

                    state._fsp--;

                     after(grammarAccess.getDeviceTypeAccess().getDeviceType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:932:2: ( ruleComputationDeviceType )
                    {
                    // InternalDeviceParser.g:932:2: ( ruleComputationDeviceType )
                    // InternalDeviceParser.g:933:3: ruleComputationDeviceType
                    {
                     before(grammarAccess.getDeviceTypeAccess().getComputationDeviceTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComputationDeviceType();

                    state._fsp--;

                     after(grammarAccess.getDeviceTypeAccess().getComputationDeviceTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Alternatives"


    // $ANTLR start "rule__AbstractCommunicationConnection__Alternatives"
    // InternalDeviceParser.g:942:1: rule__AbstractCommunicationConnection__Alternatives : ( ( ruleNetworkConnection ) | ( ruleCommunicationConnection ) );
    public final void rule__AbstractCommunicationConnection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:946:1: ( ( ruleNetworkConnection ) | ( ruleCommunicationConnection ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalDeviceParser.g:947:2: ( ruleNetworkConnection )
                    {
                    // InternalDeviceParser.g:947:2: ( ruleNetworkConnection )
                    // InternalDeviceParser.g:948:3: ruleNetworkConnection
                    {
                     before(grammarAccess.getAbstractCommunicationConnectionAccess().getNetworkConnectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNetworkConnection();

                    state._fsp--;

                     after(grammarAccess.getAbstractCommunicationConnectionAccess().getNetworkConnectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:953:2: ( ruleCommunicationConnection )
                    {
                    // InternalDeviceParser.g:953:2: ( ruleCommunicationConnection )
                    // InternalDeviceParser.g:954:3: ruleCommunicationConnection
                    {
                     before(grammarAccess.getAbstractCommunicationConnectionAccess().getCommunicationConnectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCommunicationConnection();

                    state._fsp--;

                     after(grammarAccess.getAbstractCommunicationConnectionAccess().getCommunicationConnectionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCommunicationConnection__Alternatives"


    // $ANTLR start "rule__AbstractNetworkProperty__Alternatives"
    // InternalDeviceParser.g:963:1: rule__AbstractNetworkProperty__Alternatives : ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) );
    public final void rule__AbstractNetworkProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:967:1: ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) )
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
                    // InternalDeviceParser.g:968:2: ( ruleInterfaceNetworkProperty )
                    {
                    // InternalDeviceParser.g:968:2: ( ruleInterfaceNetworkProperty )
                    // InternalDeviceParser.g:969:3: ruleInterfaceNetworkProperty
                    {
                     before(grammarAccess.getAbstractNetworkPropertyAccess().getInterfaceNetworkPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfaceNetworkProperty();

                    state._fsp--;

                     after(grammarAccess.getAbstractNetworkPropertyAccess().getInterfaceNetworkPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:974:2: ( ruleAddressNetworkProperty )
                    {
                    // InternalDeviceParser.g:974:2: ( ruleAddressNetworkProperty )
                    // InternalDeviceParser.g:975:3: ruleAddressNetworkProperty
                    {
                     before(grammarAccess.getAbstractNetworkPropertyAccess().getAddressNetworkPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAddressNetworkProperty();

                    state._fsp--;

                     after(grammarAccess.getAbstractNetworkPropertyAccess().getAddressNetworkPropertyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractNetworkProperty__Alternatives"


    // $ANTLR start "rule__PropertyValue__Alternatives"
    // InternalDeviceParser.g:984:1: rule__PropertyValue__Alternatives : ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:988:1: ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt6=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:989:2: ( rulePropertyValueInt )
                    {
                    // InternalDeviceParser.g:989:2: ( rulePropertyValueInt )
                    // InternalDeviceParser.g:990:3: rulePropertyValueInt
                    {
                     before(grammarAccess.getPropertyValueAccess().getPropertyValueIntParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyValueInt();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getPropertyValueIntParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:995:2: ( rulePropertyValueDouble )
                    {
                    // InternalDeviceParser.g:995:2: ( rulePropertyValueDouble )
                    // InternalDeviceParser.g:996:3: rulePropertyValueDouble
                    {
                     before(grammarAccess.getPropertyValueAccess().getPropertyValueDoubleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyValueDouble();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getPropertyValueDoubleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceParser.g:1001:2: ( rulePropertyValueString )
                    {
                    // InternalDeviceParser.g:1001:2: ( rulePropertyValueString )
                    // InternalDeviceParser.g:1002:3: rulePropertyValueString
                    {
                     before(grammarAccess.getPropertyValueAccess().getPropertyValueStringParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyValueString();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getPropertyValueStringParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDeviceParser.g:1011:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1015:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceParser.g:1016:2: ( RULE_STRING )
                    {
                    // InternalDeviceParser.g:1016:2: ( RULE_STRING )
                    // InternalDeviceParser.g:1017:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1022:2: ( RULE_ID )
                    {
                    // InternalDeviceParser.g:1022:2: ( RULE_ID )
                    // InternalDeviceParser.g:1023:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__0"
    // InternalDeviceParser.g:1032:1: rule__InterfaceNetworkProperty__Group__0 : rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 ;
    public final void rule__InterfaceNetworkProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1036:1: ( rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 )
            // InternalDeviceParser.g:1037:2: rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InterfaceNetworkProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__0"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__0__Impl"
    // InternalDeviceParser.g:1044:1: rule__InterfaceNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__InterfaceNetworkProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1048:1: ( ( () ) )
            // InternalDeviceParser.g:1049:1: ( () )
            {
            // InternalDeviceParser.g:1049:1: ( () )
            // InternalDeviceParser.g:1050:2: ()
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0()); 
            // InternalDeviceParser.g:1051:2: ()
            // InternalDeviceParser.g:1051:3: 
            {
            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__0__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__1"
    // InternalDeviceParser.g:1059:1: rule__InterfaceNetworkProperty__Group__1 : rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 ;
    public final void rule__InterfaceNetworkProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1063:1: ( rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 )
            // InternalDeviceParser.g:1064:2: rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__InterfaceNetworkProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__1"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__1__Impl"
    // InternalDeviceParser.g:1071:1: rule__InterfaceNetworkProperty__Group__1__Impl : ( RULE_INDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1075:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1076:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1076:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1077:2: RULE_INDENT
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__1__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__2"
    // InternalDeviceParser.g:1086:1: rule__InterfaceNetworkProperty__Group__2 : rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 ;
    public final void rule__InterfaceNetworkProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1090:1: ( rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 )
            // InternalDeviceParser.g:1091:2: rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__InterfaceNetworkProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__2"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__2__Impl"
    // InternalDeviceParser.g:1098:1: rule__InterfaceNetworkProperty__Group__2__Impl : ( rulePreListElement ) ;
    public final void rule__InterfaceNetworkProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1102:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:1103:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:1103:1: ( rulePreListElement )
            // InternalDeviceParser.g:1104:2: rulePreListElement
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getPreListElementParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getPreListElementParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__2__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__3"
    // InternalDeviceParser.g:1113:1: rule__InterfaceNetworkProperty__Group__3 : rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 ;
    public final void rule__InterfaceNetworkProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1117:1: ( rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 )
            // InternalDeviceParser.g:1118:2: rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__InterfaceNetworkProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__3"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__3__Impl"
    // InternalDeviceParser.g:1125:1: rule__InterfaceNetworkProperty__Group__3__Impl : ( Name ) ;
    public final void rule__InterfaceNetworkProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1129:1: ( ( Name ) )
            // InternalDeviceParser.g:1130:1: ( Name )
            {
            // InternalDeviceParser.g:1130:1: ( Name )
            // InternalDeviceParser.g:1131:2: Name
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getNameKeyword_3()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__3__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__4"
    // InternalDeviceParser.g:1140:1: rule__InterfaceNetworkProperty__Group__4 : rule__InterfaceNetworkProperty__Group__4__Impl rule__InterfaceNetworkProperty__Group__5 ;
    public final void rule__InterfaceNetworkProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1144:1: ( rule__InterfaceNetworkProperty__Group__4__Impl rule__InterfaceNetworkProperty__Group__5 )
            // InternalDeviceParser.g:1145:2: rule__InterfaceNetworkProperty__Group__4__Impl rule__InterfaceNetworkProperty__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__InterfaceNetworkProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__4"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__4__Impl"
    // InternalDeviceParser.g:1152:1: rule__InterfaceNetworkProperty__Group__4__Impl : ( Interface ) ;
    public final void rule__InterfaceNetworkProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1156:1: ( ( Interface ) )
            // InternalDeviceParser.g:1157:1: ( Interface )
            {
            // InternalDeviceParser.g:1157:1: ( Interface )
            // InternalDeviceParser.g:1158:2: Interface
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceKeyword_4()); 
            match(input,Interface,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__4__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__5"
    // InternalDeviceParser.g:1167:1: rule__InterfaceNetworkProperty__Group__5 : rule__InterfaceNetworkProperty__Group__5__Impl rule__InterfaceNetworkProperty__Group__6 ;
    public final void rule__InterfaceNetworkProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1171:1: ( rule__InterfaceNetworkProperty__Group__5__Impl rule__InterfaceNetworkProperty__Group__6 )
            // InternalDeviceParser.g:1172:2: rule__InterfaceNetworkProperty__Group__5__Impl rule__InterfaceNetworkProperty__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__InterfaceNetworkProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__5"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__5__Impl"
    // InternalDeviceParser.g:1179:1: rule__InterfaceNetworkProperty__Group__5__Impl : ( ( rule__InterfaceNetworkProperty__Group_5__0 )? ) ;
    public final void rule__InterfaceNetworkProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1183:1: ( ( ( rule__InterfaceNetworkProperty__Group_5__0 )? ) )
            // InternalDeviceParser.g:1184:1: ( ( rule__InterfaceNetworkProperty__Group_5__0 )? )
            {
            // InternalDeviceParser.g:1184:1: ( ( rule__InterfaceNetworkProperty__Group_5__0 )? )
            // InternalDeviceParser.g:1185:2: ( rule__InterfaceNetworkProperty__Group_5__0 )?
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_5()); 
            // InternalDeviceParser.g:1186:2: ( rule__InterfaceNetworkProperty__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Value) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeviceParser.g:1186:3: rule__InterfaceNetworkProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceNetworkProperty__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__5__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__6"
    // InternalDeviceParser.g:1194:1: rule__InterfaceNetworkProperty__Group__6 : rule__InterfaceNetworkProperty__Group__6__Impl ;
    public final void rule__InterfaceNetworkProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1198:1: ( rule__InterfaceNetworkProperty__Group__6__Impl )
            // InternalDeviceParser.g:1199:2: rule__InterfaceNetworkProperty__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__6"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__6__Impl"
    // InternalDeviceParser.g:1205:1: rule__InterfaceNetworkProperty__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1209:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1210:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1210:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1211:2: RULE_DEDENT
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_6()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__6__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_5__0"
    // InternalDeviceParser.g:1221:1: rule__InterfaceNetworkProperty__Group_5__0 : rule__InterfaceNetworkProperty__Group_5__0__Impl rule__InterfaceNetworkProperty__Group_5__1 ;
    public final void rule__InterfaceNetworkProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1225:1: ( rule__InterfaceNetworkProperty__Group_5__0__Impl rule__InterfaceNetworkProperty__Group_5__1 )
            // InternalDeviceParser.g:1226:2: rule__InterfaceNetworkProperty__Group_5__0__Impl rule__InterfaceNetworkProperty__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__InterfaceNetworkProperty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_5__0"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_5__0__Impl"
    // InternalDeviceParser.g:1233:1: rule__InterfaceNetworkProperty__Group_5__0__Impl : ( Value ) ;
    public final void rule__InterfaceNetworkProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1237:1: ( ( Value ) )
            // InternalDeviceParser.g:1238:1: ( Value )
            {
            // InternalDeviceParser.g:1238:1: ( Value )
            // InternalDeviceParser.g:1239:2: Value
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_5_0()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_5__0__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_5__1"
    // InternalDeviceParser.g:1248:1: rule__InterfaceNetworkProperty__Group_5__1 : rule__InterfaceNetworkProperty__Group_5__1__Impl ;
    public final void rule__InterfaceNetworkProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1252:1: ( rule__InterfaceNetworkProperty__Group_5__1__Impl )
            // InternalDeviceParser.g:1253:2: rule__InterfaceNetworkProperty__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_5__1"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_5__1__Impl"
    // InternalDeviceParser.g:1259:1: rule__InterfaceNetworkProperty__Group_5__1__Impl : ( ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 ) ) ;
    public final void rule__InterfaceNetworkProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1263:1: ( ( ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 ) ) )
            // InternalDeviceParser.g:1264:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 ) )
            {
            // InternalDeviceParser.g:1264:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 ) )
            // InternalDeviceParser.g:1265:2: ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValueAssignment_5_1()); 
            // InternalDeviceParser.g:1266:2: ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 )
            // InternalDeviceParser.g:1266:3: rule__InterfaceNetworkProperty__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_5__1__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__0"
    // InternalDeviceParser.g:1275:1: rule__AddressNetworkProperty__Group__0 : rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 ;
    public final void rule__AddressNetworkProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1279:1: ( rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 )
            // InternalDeviceParser.g:1280:2: rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AddressNetworkProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__0"


    // $ANTLR start "rule__AddressNetworkProperty__Group__0__Impl"
    // InternalDeviceParser.g:1287:1: rule__AddressNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__AddressNetworkProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1291:1: ( ( () ) )
            // InternalDeviceParser.g:1292:1: ( () )
            {
            // InternalDeviceParser.g:1292:1: ( () )
            // InternalDeviceParser.g:1293:2: ()
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0()); 
            // InternalDeviceParser.g:1294:2: ()
            // InternalDeviceParser.g:1294:3: 
            {
            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__0__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__1"
    // InternalDeviceParser.g:1302:1: rule__AddressNetworkProperty__Group__1 : rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 ;
    public final void rule__AddressNetworkProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1306:1: ( rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 )
            // InternalDeviceParser.g:1307:2: rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AddressNetworkProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__1"


    // $ANTLR start "rule__AddressNetworkProperty__Group__1__Impl"
    // InternalDeviceParser.g:1314:1: rule__AddressNetworkProperty__Group__1__Impl : ( RULE_INDENT ) ;
    public final void rule__AddressNetworkProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1318:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1319:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1319:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1320:2: RULE_INDENT
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__1__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__2"
    // InternalDeviceParser.g:1329:1: rule__AddressNetworkProperty__Group__2 : rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 ;
    public final void rule__AddressNetworkProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1333:1: ( rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 )
            // InternalDeviceParser.g:1334:2: rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AddressNetworkProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__2"


    // $ANTLR start "rule__AddressNetworkProperty__Group__2__Impl"
    // InternalDeviceParser.g:1341:1: rule__AddressNetworkProperty__Group__2__Impl : ( rulePreListElement ) ;
    public final void rule__AddressNetworkProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1345:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:1346:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:1346:1: ( rulePreListElement )
            // InternalDeviceParser.g:1347:2: rulePreListElement
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getPreListElementParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getAddressNetworkPropertyAccess().getPreListElementParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__2__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__3"
    // InternalDeviceParser.g:1356:1: rule__AddressNetworkProperty__Group__3 : rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 ;
    public final void rule__AddressNetworkProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1360:1: ( rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 )
            // InternalDeviceParser.g:1361:2: rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__AddressNetworkProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__3"


    // $ANTLR start "rule__AddressNetworkProperty__Group__3__Impl"
    // InternalDeviceParser.g:1368:1: rule__AddressNetworkProperty__Group__3__Impl : ( Name ) ;
    public final void rule__AddressNetworkProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1372:1: ( ( Name ) )
            // InternalDeviceParser.g:1373:1: ( Name )
            {
            // InternalDeviceParser.g:1373:1: ( Name )
            // InternalDeviceParser.g:1374:2: Name
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getNameKeyword_3()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__3__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__4"
    // InternalDeviceParser.g:1383:1: rule__AddressNetworkProperty__Group__4 : rule__AddressNetworkProperty__Group__4__Impl rule__AddressNetworkProperty__Group__5 ;
    public final void rule__AddressNetworkProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1387:1: ( rule__AddressNetworkProperty__Group__4__Impl rule__AddressNetworkProperty__Group__5 )
            // InternalDeviceParser.g:1388:2: rule__AddressNetworkProperty__Group__4__Impl rule__AddressNetworkProperty__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__AddressNetworkProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__4"


    // $ANTLR start "rule__AddressNetworkProperty__Group__4__Impl"
    // InternalDeviceParser.g:1395:1: rule__AddressNetworkProperty__Group__4__Impl : ( Address ) ;
    public final void rule__AddressNetworkProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1399:1: ( ( Address ) )
            // InternalDeviceParser.g:1400:1: ( Address )
            {
            // InternalDeviceParser.g:1400:1: ( Address )
            // InternalDeviceParser.g:1401:2: Address
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getAddressKeyword_4()); 
            match(input,Address,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getAddressKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__4__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__5"
    // InternalDeviceParser.g:1410:1: rule__AddressNetworkProperty__Group__5 : rule__AddressNetworkProperty__Group__5__Impl rule__AddressNetworkProperty__Group__6 ;
    public final void rule__AddressNetworkProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1414:1: ( rule__AddressNetworkProperty__Group__5__Impl rule__AddressNetworkProperty__Group__6 )
            // InternalDeviceParser.g:1415:2: rule__AddressNetworkProperty__Group__5__Impl rule__AddressNetworkProperty__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__AddressNetworkProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__5"


    // $ANTLR start "rule__AddressNetworkProperty__Group__5__Impl"
    // InternalDeviceParser.g:1422:1: rule__AddressNetworkProperty__Group__5__Impl : ( ( rule__AddressNetworkProperty__Group_5__0 )? ) ;
    public final void rule__AddressNetworkProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1426:1: ( ( ( rule__AddressNetworkProperty__Group_5__0 )? ) )
            // InternalDeviceParser.g:1427:1: ( ( rule__AddressNetworkProperty__Group_5__0 )? )
            {
            // InternalDeviceParser.g:1427:1: ( ( rule__AddressNetworkProperty__Group_5__0 )? )
            // InternalDeviceParser.g:1428:2: ( rule__AddressNetworkProperty__Group_5__0 )?
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup_5()); 
            // InternalDeviceParser.g:1429:2: ( rule__AddressNetworkProperty__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Value) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeviceParser.g:1429:3: rule__AddressNetworkProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddressNetworkProperty__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__5__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__6"
    // InternalDeviceParser.g:1437:1: rule__AddressNetworkProperty__Group__6 : rule__AddressNetworkProperty__Group__6__Impl ;
    public final void rule__AddressNetworkProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1441:1: ( rule__AddressNetworkProperty__Group__6__Impl )
            // InternalDeviceParser.g:1442:2: rule__AddressNetworkProperty__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__6"


    // $ANTLR start "rule__AddressNetworkProperty__Group__6__Impl"
    // InternalDeviceParser.g:1448:1: rule__AddressNetworkProperty__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__AddressNetworkProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1452:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1453:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1453:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1454:2: RULE_DEDENT
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_6()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__6__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group_5__0"
    // InternalDeviceParser.g:1464:1: rule__AddressNetworkProperty__Group_5__0 : rule__AddressNetworkProperty__Group_5__0__Impl rule__AddressNetworkProperty__Group_5__1 ;
    public final void rule__AddressNetworkProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1468:1: ( rule__AddressNetworkProperty__Group_5__0__Impl rule__AddressNetworkProperty__Group_5__1 )
            // InternalDeviceParser.g:1469:2: rule__AddressNetworkProperty__Group_5__0__Impl rule__AddressNetworkProperty__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__AddressNetworkProperty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_5__0"


    // $ANTLR start "rule__AddressNetworkProperty__Group_5__0__Impl"
    // InternalDeviceParser.g:1476:1: rule__AddressNetworkProperty__Group_5__0__Impl : ( Value ) ;
    public final void rule__AddressNetworkProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1480:1: ( ( Value ) )
            // InternalDeviceParser.g:1481:1: ( Value )
            {
            // InternalDeviceParser.g:1481:1: ( Value )
            // InternalDeviceParser.g:1482:2: Value
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_5_0()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_5__0__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group_5__1"
    // InternalDeviceParser.g:1491:1: rule__AddressNetworkProperty__Group_5__1 : rule__AddressNetworkProperty__Group_5__1__Impl ;
    public final void rule__AddressNetworkProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1495:1: ( rule__AddressNetworkProperty__Group_5__1__Impl )
            // InternalDeviceParser.g:1496:2: rule__AddressNetworkProperty__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_5__1"


    // $ANTLR start "rule__AddressNetworkProperty__Group_5__1__Impl"
    // InternalDeviceParser.g:1502:1: rule__AddressNetworkProperty__Group_5__1__Impl : ( ( rule__AddressNetworkProperty__ValueAssignment_5_1 ) ) ;
    public final void rule__AddressNetworkProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1506:1: ( ( ( rule__AddressNetworkProperty__ValueAssignment_5_1 ) ) )
            // InternalDeviceParser.g:1507:1: ( ( rule__AddressNetworkProperty__ValueAssignment_5_1 ) )
            {
            // InternalDeviceParser.g:1507:1: ( ( rule__AddressNetworkProperty__ValueAssignment_5_1 ) )
            // InternalDeviceParser.g:1508:2: ( rule__AddressNetworkProperty__ValueAssignment_5_1 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValueAssignment_5_1()); 
            // InternalDeviceParser.g:1509:2: ( rule__AddressNetworkProperty__ValueAssignment_5_1 )
            // InternalDeviceParser.g:1509:3: rule__AddressNetworkProperty__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_5__1__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__0"
    // InternalDeviceParser.g:1518:1: rule__DeviceType_Impl__Group__0 : rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 ;
    public final void rule__DeviceType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1522:1: ( rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 )
            // InternalDeviceParser.g:1523:2: rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DeviceType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__0"


    // $ANTLR start "rule__DeviceType_Impl__Group__0__Impl"
    // InternalDeviceParser.g:1530:1: rule__DeviceType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__DeviceType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1534:1: ( ( () ) )
            // InternalDeviceParser.g:1535:1: ( () )
            {
            // InternalDeviceParser.g:1535:1: ( () )
            // InternalDeviceParser.g:1536:2: ()
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0()); 
            // InternalDeviceParser.g:1537:2: ()
            // InternalDeviceParser.g:1537:3: 
            {
            }

             after(grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__0__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__1"
    // InternalDeviceParser.g:1545:1: rule__DeviceType_Impl__Group__1 : rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 ;
    public final void rule__DeviceType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1549:1: ( rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 )
            // InternalDeviceParser.g:1550:2: rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DeviceType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__1"


    // $ANTLR start "rule__DeviceType_Impl__Group__1__Impl"
    // InternalDeviceParser.g:1557:1: rule__DeviceType_Impl__Group__1__Impl : ( DeviceType ) ;
    public final void rule__DeviceType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1561:1: ( ( DeviceType ) )
            // InternalDeviceParser.g:1562:1: ( DeviceType )
            {
            // InternalDeviceParser.g:1562:1: ( DeviceType )
            // InternalDeviceParser.g:1563:2: DeviceType
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDeviceTypeKeyword_1()); 
            match(input,DeviceType,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getDeviceTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__1__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__2"
    // InternalDeviceParser.g:1572:1: rule__DeviceType_Impl__Group__2 : rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 ;
    public final void rule__DeviceType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1576:1: ( rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 )
            // InternalDeviceParser.g:1577:2: rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DeviceType_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__2"


    // $ANTLR start "rule__DeviceType_Impl__Group__2__Impl"
    // InternalDeviceParser.g:1584:1: rule__DeviceType_Impl__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1588:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1589:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1589:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1590:2: RULE_INDENT
            {
             before(grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_2()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__2__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__3"
    // InternalDeviceParser.g:1599:1: rule__DeviceType_Impl__Group__3 : rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 ;
    public final void rule__DeviceType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1603:1: ( rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 )
            // InternalDeviceParser.g:1604:2: rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DeviceType_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__3"


    // $ANTLR start "rule__DeviceType_Impl__Group__3__Impl"
    // InternalDeviceParser.g:1611:1: rule__DeviceType_Impl__Group__3__Impl : ( Name ) ;
    public final void rule__DeviceType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1615:1: ( ( Name ) )
            // InternalDeviceParser.g:1616:1: ( Name )
            {
            // InternalDeviceParser.g:1616:1: ( Name )
            // InternalDeviceParser.g:1617:2: Name
            {
             before(grammarAccess.getDeviceType_ImplAccess().getNameKeyword_3()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__3__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__4"
    // InternalDeviceParser.g:1626:1: rule__DeviceType_Impl__Group__4 : rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 ;
    public final void rule__DeviceType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1630:1: ( rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 )
            // InternalDeviceParser.g:1631:2: rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__DeviceType_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__4"


    // $ANTLR start "rule__DeviceType_Impl__Group__4__Impl"
    // InternalDeviceParser.g:1638:1: rule__DeviceType_Impl__Group__4__Impl : ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) ;
    public final void rule__DeviceType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1642:1: ( ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) )
            // InternalDeviceParser.g:1643:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            {
            // InternalDeviceParser.g:1643:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            // InternalDeviceParser.g:1644:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getNameAssignment_4()); 
            // InternalDeviceParser.g:1645:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            // InternalDeviceParser.g:1645:3: rule__DeviceType_Impl__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__4__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__5"
    // InternalDeviceParser.g:1653:1: rule__DeviceType_Impl__Group__5 : rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 ;
    public final void rule__DeviceType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1657:1: ( rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 )
            // InternalDeviceParser.g:1658:2: rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__DeviceType_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__5"


    // $ANTLR start "rule__DeviceType_Impl__Group__5__Impl"
    // InternalDeviceParser.g:1665:1: rule__DeviceType_Impl__Group__5__Impl : ( ( rule__DeviceType_Impl__Group_5__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1669:1: ( ( ( rule__DeviceType_Impl__Group_5__0 )? ) )
            // InternalDeviceParser.g:1670:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            {
            // InternalDeviceParser.g:1670:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            // InternalDeviceParser.g:1671:2: ( rule__DeviceType_Impl__Group_5__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_5()); 
            // InternalDeviceParser.g:1672:2: ( rule__DeviceType_Impl__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Capability) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceParser.g:1672:3: rule__DeviceType_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceType_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceType_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__5__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__6"
    // InternalDeviceParser.g:1680:1: rule__DeviceType_Impl__Group__6 : rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 ;
    public final void rule__DeviceType_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1684:1: ( rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 )
            // InternalDeviceParser.g:1685:2: rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__DeviceType_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__6"


    // $ANTLR start "rule__DeviceType_Impl__Group__6__Impl"
    // InternalDeviceParser.g:1692:1: rule__DeviceType_Impl__Group__6__Impl : ( ( rule__DeviceType_Impl__Group_6__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1696:1: ( ( ( rule__DeviceType_Impl__Group_6__0 )? ) )
            // InternalDeviceParser.g:1697:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            {
            // InternalDeviceParser.g:1697:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            // InternalDeviceParser.g:1698:2: ( rule__DeviceType_Impl__Group_6__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_6()); 
            // InternalDeviceParser.g:1699:2: ( rule__DeviceType_Impl__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CommunicationConnection) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeviceParser.g:1699:3: rule__DeviceType_Impl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceType_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceType_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__6__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__7"
    // InternalDeviceParser.g:1707:1: rule__DeviceType_Impl__Group__7 : rule__DeviceType_Impl__Group__7__Impl ;
    public final void rule__DeviceType_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1711:1: ( rule__DeviceType_Impl__Group__7__Impl )
            // InternalDeviceParser.g:1712:2: rule__DeviceType_Impl__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__7"


    // $ANTLR start "rule__DeviceType_Impl__Group__7__Impl"
    // InternalDeviceParser.g:1718:1: rule__DeviceType_Impl__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1722:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1723:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1723:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1724:2: RULE_DEDENT
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_7()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group__7__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group_5__0"
    // InternalDeviceParser.g:1734:1: rule__DeviceType_Impl__Group_5__0 : rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 ;
    public final void rule__DeviceType_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1738:1: ( rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 )
            // InternalDeviceParser.g:1739:2: rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceType_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_5__0"


    // $ANTLR start "rule__DeviceType_Impl__Group_5__0__Impl"
    // InternalDeviceParser.g:1746:1: rule__DeviceType_Impl__Group_5__0__Impl : ( Capability ) ;
    public final void rule__DeviceType_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1750:1: ( ( Capability ) )
            // InternalDeviceParser.g:1751:1: ( Capability )
            {
            // InternalDeviceParser.g:1751:1: ( Capability )
            // InternalDeviceParser.g:1752:2: Capability
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityKeyword_5_0()); 
            match(input,Capability,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getCapabilityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group_5__1"
    // InternalDeviceParser.g:1761:1: rule__DeviceType_Impl__Group_5__1 : rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 ;
    public final void rule__DeviceType_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1765:1: ( rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 )
            // InternalDeviceParser.g:1766:2: rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2
            {
            pushFollow(FOLLOW_5);
            rule__DeviceType_Impl__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_5__1"


    // $ANTLR start "rule__DeviceType_Impl__Group_5__1__Impl"
    // InternalDeviceParser.g:1773:1: rule__DeviceType_Impl__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1777:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1778:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1778:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1779:2: RULE_INDENT
            {
             before(grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group_5__2"
    // InternalDeviceParser.g:1788:1: rule__DeviceType_Impl__Group_5__2 : rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 ;
    public final void rule__DeviceType_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1792:1: ( rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 )
            // InternalDeviceParser.g:1793:2: rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__DeviceType_Impl__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_5__2"


    // $ANTLR start "rule__DeviceType_Impl__Group_5__2__Impl"
    // InternalDeviceParser.g:1800:1: rule__DeviceType_Impl__Group_5__2__Impl : ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1804:1: ( ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) ) )
            // InternalDeviceParser.g:1805:1: ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) )
            {
            // InternalDeviceParser.g:1805:1: ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) )
            // InternalDeviceParser.g:1806:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* )
            {
            // InternalDeviceParser.g:1806:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) )
            // InternalDeviceParser.g:1807:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 
            // InternalDeviceParser.g:1808:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )
            // InternalDeviceParser.g:1808:4: rule__DeviceType_Impl__CapabilityAssignment_5_2
            {
            pushFollow(FOLLOW_14);
            rule__DeviceType_Impl__CapabilityAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 

            }

            // InternalDeviceParser.g:1811:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* )
            // InternalDeviceParser.g:1812:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 
            // InternalDeviceParser.g:1813:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==HyphenMinus) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDeviceParser.g:1813:4: rule__DeviceType_Impl__CapabilityAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DeviceType_Impl__CapabilityAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_5__2__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group_5__3"
    // InternalDeviceParser.g:1822:1: rule__DeviceType_Impl__Group_5__3 : rule__DeviceType_Impl__Group_5__3__Impl ;
    public final void rule__DeviceType_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1826:1: ( rule__DeviceType_Impl__Group_5__3__Impl )
            // InternalDeviceParser.g:1827:2: rule__DeviceType_Impl__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_5__3"


    // $ANTLR start "rule__DeviceType_Impl__Group_5__3__Impl"
    // InternalDeviceParser.g:1833:1: rule__DeviceType_Impl__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1837:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1838:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1838:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1839:2: RULE_DEDENT
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_5__3__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group_6__0"
    // InternalDeviceParser.g:1849:1: rule__DeviceType_Impl__Group_6__0 : rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 ;
    public final void rule__DeviceType_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1853:1: ( rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 )
            // InternalDeviceParser.g:1854:2: rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceType_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_6__0"


    // $ANTLR start "rule__DeviceType_Impl__Group_6__0__Impl"
    // InternalDeviceParser.g:1861:1: rule__DeviceType_Impl__Group_6__0__Impl : ( CommunicationConnection ) ;
    public final void rule__DeviceType_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1865:1: ( ( CommunicationConnection ) )
            // InternalDeviceParser.g:1866:1: ( CommunicationConnection )
            {
            // InternalDeviceParser.g:1866:1: ( CommunicationConnection )
            // InternalDeviceParser.g:1867:2: CommunicationConnection
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0()); 
            match(input,CommunicationConnection,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group_6__1"
    // InternalDeviceParser.g:1876:1: rule__DeviceType_Impl__Group_6__1 : rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 ;
    public final void rule__DeviceType_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1880:1: ( rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 )
            // InternalDeviceParser.g:1881:2: rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2
            {
            pushFollow(FOLLOW_5);
            rule__DeviceType_Impl__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_6__1"


    // $ANTLR start "rule__DeviceType_Impl__Group_6__1__Impl"
    // InternalDeviceParser.g:1888:1: rule__DeviceType_Impl__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1892:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1893:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1893:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1894:2: RULE_INDENT
            {
             before(grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group_6__2"
    // InternalDeviceParser.g:1903:1: rule__DeviceType_Impl__Group_6__2 : rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 ;
    public final void rule__DeviceType_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1907:1: ( rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 )
            // InternalDeviceParser.g:1908:2: rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__DeviceType_Impl__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_6__2"


    // $ANTLR start "rule__DeviceType_Impl__Group_6__2__Impl"
    // InternalDeviceParser.g:1915:1: rule__DeviceType_Impl__Group_6__2__Impl : ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1919:1: ( ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) )
            // InternalDeviceParser.g:1920:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            {
            // InternalDeviceParser.g:1920:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            // InternalDeviceParser.g:1921:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            {
            // InternalDeviceParser.g:1921:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) )
            // InternalDeviceParser.g:1922:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalDeviceParser.g:1923:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            // InternalDeviceParser.g:1923:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_14);
            rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 

            }

            // InternalDeviceParser.g:1926:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            // InternalDeviceParser.g:1927:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalDeviceParser.g:1928:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==HyphenMinus) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDeviceParser.g:1928:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_6__2__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group_6__3"
    // InternalDeviceParser.g:1937:1: rule__DeviceType_Impl__Group_6__3 : rule__DeviceType_Impl__Group_6__3__Impl ;
    public final void rule__DeviceType_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1941:1: ( rule__DeviceType_Impl__Group_6__3__Impl )
            // InternalDeviceParser.g:1942:2: rule__DeviceType_Impl__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType_Impl__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_6__3"


    // $ANTLR start "rule__DeviceType_Impl__Group_6__3__Impl"
    // InternalDeviceParser.g:1948:1: rule__DeviceType_Impl__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1952:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1953:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1953:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1954:2: RULE_DEDENT
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_6_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__Group_6__3__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__0"
    // InternalDeviceParser.g:1964:1: rule__ComputationDeviceType__Group__0 : rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 ;
    public final void rule__ComputationDeviceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1968:1: ( rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 )
            // InternalDeviceParser.g:1969:2: rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComputationDeviceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__0"


    // $ANTLR start "rule__ComputationDeviceType__Group__0__Impl"
    // InternalDeviceParser.g:1976:1: rule__ComputationDeviceType__Group__0__Impl : ( ComputationDeviceType ) ;
    public final void rule__ComputationDeviceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1980:1: ( ( ComputationDeviceType ) )
            // InternalDeviceParser.g:1981:1: ( ComputationDeviceType )
            {
            // InternalDeviceParser.g:1981:1: ( ComputationDeviceType )
            // InternalDeviceParser.g:1982:2: ComputationDeviceType
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0()); 
            match(input,ComputationDeviceType,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__0__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__1"
    // InternalDeviceParser.g:1991:1: rule__ComputationDeviceType__Group__1 : rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 ;
    public final void rule__ComputationDeviceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1995:1: ( rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 )
            // InternalDeviceParser.g:1996:2: rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ComputationDeviceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__1"


    // $ANTLR start "rule__ComputationDeviceType__Group__1__Impl"
    // InternalDeviceParser.g:2003:1: rule__ComputationDeviceType__Group__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2007:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2008:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2008:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2009:2: RULE_INDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__1__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__2"
    // InternalDeviceParser.g:2018:1: rule__ComputationDeviceType__Group__2 : rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 ;
    public final void rule__ComputationDeviceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2022:1: ( rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 )
            // InternalDeviceParser.g:2023:2: rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ComputationDeviceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__2"


    // $ANTLR start "rule__ComputationDeviceType__Group__2__Impl"
    // InternalDeviceParser.g:2030:1: rule__ComputationDeviceType__Group__2__Impl : ( Name ) ;
    public final void rule__ComputationDeviceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2034:1: ( ( Name ) )
            // InternalDeviceParser.g:2035:1: ( Name )
            {
            // InternalDeviceParser.g:2035:1: ( Name )
            // InternalDeviceParser.g:2036:2: Name
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__2__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__3"
    // InternalDeviceParser.g:2045:1: rule__ComputationDeviceType__Group__3 : rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 ;
    public final void rule__ComputationDeviceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2049:1: ( rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 )
            // InternalDeviceParser.g:2050:2: rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ComputationDeviceType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__3"


    // $ANTLR start "rule__ComputationDeviceType__Group__3__Impl"
    // InternalDeviceParser.g:2057:1: rule__ComputationDeviceType__Group__3__Impl : ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) ;
    public final void rule__ComputationDeviceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2061:1: ( ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:2062:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:2062:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            // InternalDeviceParser.g:2063:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getNameAssignment_3()); 
            // InternalDeviceParser.g:2064:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            // InternalDeviceParser.g:2064:3: rule__ComputationDeviceType__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__3__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__4"
    // InternalDeviceParser.g:2072:1: rule__ComputationDeviceType__Group__4 : rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 ;
    public final void rule__ComputationDeviceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2076:1: ( rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 )
            // InternalDeviceParser.g:2077:2: rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ComputationDeviceType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__4"


    // $ANTLR start "rule__ComputationDeviceType__Group__4__Impl"
    // InternalDeviceParser.g:2084:1: rule__ComputationDeviceType__Group__4__Impl : ( OperatingSystem ) ;
    public final void rule__ComputationDeviceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2088:1: ( ( OperatingSystem ) )
            // InternalDeviceParser.g:2089:1: ( OperatingSystem )
            {
            // InternalDeviceParser.g:2089:1: ( OperatingSystem )
            // InternalDeviceParser.g:2090:2: OperatingSystem
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemKeyword_4()); 
            match(input,OperatingSystem,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__4__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__5"
    // InternalDeviceParser.g:2099:1: rule__ComputationDeviceType__Group__5 : rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 ;
    public final void rule__ComputationDeviceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2103:1: ( rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 )
            // InternalDeviceParser.g:2104:2: rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ComputationDeviceType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__5"


    // $ANTLR start "rule__ComputationDeviceType__Group__5__Impl"
    // InternalDeviceParser.g:2111:1: rule__ComputationDeviceType__Group__5__Impl : ( ( rule__ComputationDeviceType__OperatingSystemAssignment_5 ) ) ;
    public final void rule__ComputationDeviceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2115:1: ( ( ( rule__ComputationDeviceType__OperatingSystemAssignment_5 ) ) )
            // InternalDeviceParser.g:2116:1: ( ( rule__ComputationDeviceType__OperatingSystemAssignment_5 ) )
            {
            // InternalDeviceParser.g:2116:1: ( ( rule__ComputationDeviceType__OperatingSystemAssignment_5 ) )
            // InternalDeviceParser.g:2117:2: ( rule__ComputationDeviceType__OperatingSystemAssignment_5 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemAssignment_5()); 
            // InternalDeviceParser.g:2118:2: ( rule__ComputationDeviceType__OperatingSystemAssignment_5 )
            // InternalDeviceParser.g:2118:3: rule__ComputationDeviceType__OperatingSystemAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__OperatingSystemAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__5__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__6"
    // InternalDeviceParser.g:2126:1: rule__ComputationDeviceType__Group__6 : rule__ComputationDeviceType__Group__6__Impl rule__ComputationDeviceType__Group__7 ;
    public final void rule__ComputationDeviceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2130:1: ( rule__ComputationDeviceType__Group__6__Impl rule__ComputationDeviceType__Group__7 )
            // InternalDeviceParser.g:2131:2: rule__ComputationDeviceType__Group__6__Impl rule__ComputationDeviceType__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ComputationDeviceType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__6"


    // $ANTLR start "rule__ComputationDeviceType__Group__6__Impl"
    // InternalDeviceParser.g:2138:1: rule__ComputationDeviceType__Group__6__Impl : ( ProcessorArchitecture ) ;
    public final void rule__ComputationDeviceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2142:1: ( ( ProcessorArchitecture ) )
            // InternalDeviceParser.g:2143:1: ( ProcessorArchitecture )
            {
            // InternalDeviceParser.g:2143:1: ( ProcessorArchitecture )
            // InternalDeviceParser.g:2144:2: ProcessorArchitecture
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureKeyword_6()); 
            match(input,ProcessorArchitecture,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__6__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__7"
    // InternalDeviceParser.g:2153:1: rule__ComputationDeviceType__Group__7 : rule__ComputationDeviceType__Group__7__Impl rule__ComputationDeviceType__Group__8 ;
    public final void rule__ComputationDeviceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2157:1: ( rule__ComputationDeviceType__Group__7__Impl rule__ComputationDeviceType__Group__8 )
            // InternalDeviceParser.g:2158:2: rule__ComputationDeviceType__Group__7__Impl rule__ComputationDeviceType__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__ComputationDeviceType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__7"


    // $ANTLR start "rule__ComputationDeviceType__Group__7__Impl"
    // InternalDeviceParser.g:2165:1: rule__ComputationDeviceType__Group__7__Impl : ( ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 ) ) ;
    public final void rule__ComputationDeviceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2169:1: ( ( ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 ) ) )
            // InternalDeviceParser.g:2170:1: ( ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 ) )
            {
            // InternalDeviceParser.g:2170:1: ( ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 ) )
            // InternalDeviceParser.g:2171:2: ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureAssignment_7()); 
            // InternalDeviceParser.g:2172:2: ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 )
            // InternalDeviceParser.g:2172:3: rule__ComputationDeviceType__ProcessorArchitectureAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__ProcessorArchitectureAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__7__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__8"
    // InternalDeviceParser.g:2180:1: rule__ComputationDeviceType__Group__8 : rule__ComputationDeviceType__Group__8__Impl rule__ComputationDeviceType__Group__9 ;
    public final void rule__ComputationDeviceType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2184:1: ( rule__ComputationDeviceType__Group__8__Impl rule__ComputationDeviceType__Group__9 )
            // InternalDeviceParser.g:2185:2: rule__ComputationDeviceType__Group__8__Impl rule__ComputationDeviceType__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__ComputationDeviceType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__8"


    // $ANTLR start "rule__ComputationDeviceType__Group__8__Impl"
    // InternalDeviceParser.g:2192:1: rule__ComputationDeviceType__Group__8__Impl : ( ( rule__ComputationDeviceType__Group_8__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2196:1: ( ( ( rule__ComputationDeviceType__Group_8__0 )? ) )
            // InternalDeviceParser.g:2197:1: ( ( rule__ComputationDeviceType__Group_8__0 )? )
            {
            // InternalDeviceParser.g:2197:1: ( ( rule__ComputationDeviceType__Group_8__0 )? )
            // InternalDeviceParser.g:2198:2: ( rule__ComputationDeviceType__Group_8__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_8()); 
            // InternalDeviceParser.g:2199:2: ( rule__ComputationDeviceType__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Capability) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceParser.g:2199:3: rule__ComputationDeviceType__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComputationDeviceType__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComputationDeviceTypeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__8__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__9"
    // InternalDeviceParser.g:2207:1: rule__ComputationDeviceType__Group__9 : rule__ComputationDeviceType__Group__9__Impl rule__ComputationDeviceType__Group__10 ;
    public final void rule__ComputationDeviceType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2211:1: ( rule__ComputationDeviceType__Group__9__Impl rule__ComputationDeviceType__Group__10 )
            // InternalDeviceParser.g:2212:2: rule__ComputationDeviceType__Group__9__Impl rule__ComputationDeviceType__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__ComputationDeviceType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__9"


    // $ANTLR start "rule__ComputationDeviceType__Group__9__Impl"
    // InternalDeviceParser.g:2219:1: rule__ComputationDeviceType__Group__9__Impl : ( ( rule__ComputationDeviceType__Group_9__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2223:1: ( ( ( rule__ComputationDeviceType__Group_9__0 )? ) )
            // InternalDeviceParser.g:2224:1: ( ( rule__ComputationDeviceType__Group_9__0 )? )
            {
            // InternalDeviceParser.g:2224:1: ( ( rule__ComputationDeviceType__Group_9__0 )? )
            // InternalDeviceParser.g:2225:2: ( rule__ComputationDeviceType__Group_9__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_9()); 
            // InternalDeviceParser.g:2226:2: ( rule__ComputationDeviceType__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CommunicationConnection) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeviceParser.g:2226:3: rule__ComputationDeviceType__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComputationDeviceType__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComputationDeviceTypeAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__9__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__10"
    // InternalDeviceParser.g:2234:1: rule__ComputationDeviceType__Group__10 : rule__ComputationDeviceType__Group__10__Impl ;
    public final void rule__ComputationDeviceType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2238:1: ( rule__ComputationDeviceType__Group__10__Impl )
            // InternalDeviceParser.g:2239:2: rule__ComputationDeviceType__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__10"


    // $ANTLR start "rule__ComputationDeviceType__Group__10__Impl"
    // InternalDeviceParser.g:2245:1: rule__ComputationDeviceType__Group__10__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2249:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2250:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2250:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2251:2: RULE_DEDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_10()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group__10__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_8__0"
    // InternalDeviceParser.g:2261:1: rule__ComputationDeviceType__Group_8__0 : rule__ComputationDeviceType__Group_8__0__Impl rule__ComputationDeviceType__Group_8__1 ;
    public final void rule__ComputationDeviceType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2265:1: ( rule__ComputationDeviceType__Group_8__0__Impl rule__ComputationDeviceType__Group_8__1 )
            // InternalDeviceParser.g:2266:2: rule__ComputationDeviceType__Group_8__0__Impl rule__ComputationDeviceType__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__ComputationDeviceType__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_8__0"


    // $ANTLR start "rule__ComputationDeviceType__Group_8__0__Impl"
    // InternalDeviceParser.g:2273:1: rule__ComputationDeviceType__Group_8__0__Impl : ( Capability ) ;
    public final void rule__ComputationDeviceType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2277:1: ( ( Capability ) )
            // InternalDeviceParser.g:2278:1: ( Capability )
            {
            // InternalDeviceParser.g:2278:1: ( Capability )
            // InternalDeviceParser.g:2279:2: Capability
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityKeyword_8_0()); 
            match(input,Capability,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_8__0__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_8__1"
    // InternalDeviceParser.g:2288:1: rule__ComputationDeviceType__Group_8__1 : rule__ComputationDeviceType__Group_8__1__Impl rule__ComputationDeviceType__Group_8__2 ;
    public final void rule__ComputationDeviceType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2292:1: ( rule__ComputationDeviceType__Group_8__1__Impl rule__ComputationDeviceType__Group_8__2 )
            // InternalDeviceParser.g:2293:2: rule__ComputationDeviceType__Group_8__1__Impl rule__ComputationDeviceType__Group_8__2
            {
            pushFollow(FOLLOW_5);
            rule__ComputationDeviceType__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_8__1"


    // $ANTLR start "rule__ComputationDeviceType__Group_8__1__Impl"
    // InternalDeviceParser.g:2300:1: rule__ComputationDeviceType__Group_8__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2304:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2305:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2305:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2306:2: RULE_INDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_8_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_8__1__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_8__2"
    // InternalDeviceParser.g:2315:1: rule__ComputationDeviceType__Group_8__2 : rule__ComputationDeviceType__Group_8__2__Impl rule__ComputationDeviceType__Group_8__3 ;
    public final void rule__ComputationDeviceType__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2319:1: ( rule__ComputationDeviceType__Group_8__2__Impl rule__ComputationDeviceType__Group_8__3 )
            // InternalDeviceParser.g:2320:2: rule__ComputationDeviceType__Group_8__2__Impl rule__ComputationDeviceType__Group_8__3
            {
            pushFollow(FOLLOW_13);
            rule__ComputationDeviceType__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_8__2"


    // $ANTLR start "rule__ComputationDeviceType__Group_8__2__Impl"
    // InternalDeviceParser.g:2327:1: rule__ComputationDeviceType__Group_8__2__Impl : ( ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2331:1: ( ( ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* ) ) )
            // InternalDeviceParser.g:2332:1: ( ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* ) )
            {
            // InternalDeviceParser.g:2332:1: ( ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* ) )
            // InternalDeviceParser.g:2333:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* )
            {
            // InternalDeviceParser.g:2333:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) )
            // InternalDeviceParser.g:2334:3: ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_8_2()); 
            // InternalDeviceParser.g:2335:3: ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )
            // InternalDeviceParser.g:2335:4: rule__ComputationDeviceType__CapabilityAssignment_8_2
            {
            pushFollow(FOLLOW_14);
            rule__ComputationDeviceType__CapabilityAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_8_2()); 

            }

            // InternalDeviceParser.g:2338:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* )
            // InternalDeviceParser.g:2339:3: ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_8_2()); 
            // InternalDeviceParser.g:2340:3: ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==HyphenMinus) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDeviceParser.g:2340:4: rule__ComputationDeviceType__CapabilityAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ComputationDeviceType__CapabilityAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_8_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_8__2__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_8__3"
    // InternalDeviceParser.g:2349:1: rule__ComputationDeviceType__Group_8__3 : rule__ComputationDeviceType__Group_8__3__Impl ;
    public final void rule__ComputationDeviceType__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2353:1: ( rule__ComputationDeviceType__Group_8__3__Impl )
            // InternalDeviceParser.g:2354:2: rule__ComputationDeviceType__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_8__3"


    // $ANTLR start "rule__ComputationDeviceType__Group_8__3__Impl"
    // InternalDeviceParser.g:2360:1: rule__ComputationDeviceType__Group_8__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2364:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2365:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2365:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2366:2: RULE_DEDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_8_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_8__3__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_9__0"
    // InternalDeviceParser.g:2376:1: rule__ComputationDeviceType__Group_9__0 : rule__ComputationDeviceType__Group_9__0__Impl rule__ComputationDeviceType__Group_9__1 ;
    public final void rule__ComputationDeviceType__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2380:1: ( rule__ComputationDeviceType__Group_9__0__Impl rule__ComputationDeviceType__Group_9__1 )
            // InternalDeviceParser.g:2381:2: rule__ComputationDeviceType__Group_9__0__Impl rule__ComputationDeviceType__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__ComputationDeviceType__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_9__0"


    // $ANTLR start "rule__ComputationDeviceType__Group_9__0__Impl"
    // InternalDeviceParser.g:2388:1: rule__ComputationDeviceType__Group_9__0__Impl : ( CommunicationConnection ) ;
    public final void rule__ComputationDeviceType__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2392:1: ( ( CommunicationConnection ) )
            // InternalDeviceParser.g:2393:1: ( CommunicationConnection )
            {
            // InternalDeviceParser.g:2393:1: ( CommunicationConnection )
            // InternalDeviceParser.g:2394:2: CommunicationConnection
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_9_0()); 
            match(input,CommunicationConnection,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_9__0__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_9__1"
    // InternalDeviceParser.g:2403:1: rule__ComputationDeviceType__Group_9__1 : rule__ComputationDeviceType__Group_9__1__Impl rule__ComputationDeviceType__Group_9__2 ;
    public final void rule__ComputationDeviceType__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2407:1: ( rule__ComputationDeviceType__Group_9__1__Impl rule__ComputationDeviceType__Group_9__2 )
            // InternalDeviceParser.g:2408:2: rule__ComputationDeviceType__Group_9__1__Impl rule__ComputationDeviceType__Group_9__2
            {
            pushFollow(FOLLOW_5);
            rule__ComputationDeviceType__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_9__1"


    // $ANTLR start "rule__ComputationDeviceType__Group_9__1__Impl"
    // InternalDeviceParser.g:2415:1: rule__ComputationDeviceType__Group_9__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2419:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2420:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2420:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2421:2: RULE_INDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_9_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_9__1__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_9__2"
    // InternalDeviceParser.g:2430:1: rule__ComputationDeviceType__Group_9__2 : rule__ComputationDeviceType__Group_9__2__Impl rule__ComputationDeviceType__Group_9__3 ;
    public final void rule__ComputationDeviceType__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2434:1: ( rule__ComputationDeviceType__Group_9__2__Impl rule__ComputationDeviceType__Group_9__3 )
            // InternalDeviceParser.g:2435:2: rule__ComputationDeviceType__Group_9__2__Impl rule__ComputationDeviceType__Group_9__3
            {
            pushFollow(FOLLOW_13);
            rule__ComputationDeviceType__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_9__2"


    // $ANTLR start "rule__ComputationDeviceType__Group_9__2__Impl"
    // InternalDeviceParser.g:2442:1: rule__ComputationDeviceType__Group_9__2__Impl : ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2446:1: ( ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* ) ) )
            // InternalDeviceParser.g:2447:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* ) )
            {
            // InternalDeviceParser.g:2447:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* ) )
            // InternalDeviceParser.g:2448:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* )
            {
            // InternalDeviceParser.g:2448:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) )
            // InternalDeviceParser.g:2449:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_9_2()); 
            // InternalDeviceParser.g:2450:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )
            // InternalDeviceParser.g:2450:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2
            {
            pushFollow(FOLLOW_14);
            rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_9_2()); 

            }

            // InternalDeviceParser.g:2453:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* )
            // InternalDeviceParser.g:2454:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_9_2()); 
            // InternalDeviceParser.g:2455:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==HyphenMinus) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDeviceParser.g:2455:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_9_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_9__2__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_9__3"
    // InternalDeviceParser.g:2464:1: rule__ComputationDeviceType__Group_9__3 : rule__ComputationDeviceType__Group_9__3__Impl ;
    public final void rule__ComputationDeviceType__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2468:1: ( rule__ComputationDeviceType__Group_9__3__Impl )
            // InternalDeviceParser.g:2469:2: rule__ComputationDeviceType__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_9__3"


    // $ANTLR start "rule__ComputationDeviceType__Group_9__3__Impl"
    // InternalDeviceParser.g:2475:1: rule__ComputationDeviceType__Group_9__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2479:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2480:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2480:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2481:2: RULE_DEDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_9_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__Group_9__3__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__0"
    // InternalDeviceParser.g:2491:1: rule__CapabilityProperty__Group__0 : rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 ;
    public final void rule__CapabilityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2495:1: ( rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 )
            // InternalDeviceParser.g:2496:2: rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CapabilityProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__0"


    // $ANTLR start "rule__CapabilityProperty__Group__0__Impl"
    // InternalDeviceParser.g:2503:1: rule__CapabilityProperty__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__CapabilityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2507:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:2508:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:2508:1: ( rulePreListElement )
            // InternalDeviceParser.g:2509:2: rulePreListElement
            {
             before(grammarAccess.getCapabilityPropertyAccess().getPreListElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getCapabilityPropertyAccess().getPreListElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__0__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__1"
    // InternalDeviceParser.g:2518:1: rule__CapabilityProperty__Group__1 : rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 ;
    public final void rule__CapabilityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2522:1: ( rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 )
            // InternalDeviceParser.g:2523:2: rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CapabilityProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__1"


    // $ANTLR start "rule__CapabilityProperty__Group__1__Impl"
    // InternalDeviceParser.g:2530:1: rule__CapabilityProperty__Group__1__Impl : ( Name ) ;
    public final void rule__CapabilityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2534:1: ( ( Name ) )
            // InternalDeviceParser.g:2535:1: ( Name )
            {
            // InternalDeviceParser.g:2535:1: ( Name )
            // InternalDeviceParser.g:2536:2: Name
            {
             before(grammarAccess.getCapabilityPropertyAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getCapabilityPropertyAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__1__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__2"
    // InternalDeviceParser.g:2545:1: rule__CapabilityProperty__Group__2 : rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 ;
    public final void rule__CapabilityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2549:1: ( rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 )
            // InternalDeviceParser.g:2550:2: rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CapabilityProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__2"


    // $ANTLR start "rule__CapabilityProperty__Group__2__Impl"
    // InternalDeviceParser.g:2557:1: rule__CapabilityProperty__Group__2__Impl : ( ( rule__CapabilityProperty__NameAssignment_2 ) ) ;
    public final void rule__CapabilityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2561:1: ( ( ( rule__CapabilityProperty__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:2562:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:2562:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            // InternalDeviceParser.g:2563:2: ( rule__CapabilityProperty__NameAssignment_2 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getNameAssignment_2()); 
            // InternalDeviceParser.g:2564:2: ( rule__CapabilityProperty__NameAssignment_2 )
            // InternalDeviceParser.g:2564:3: rule__CapabilityProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__2__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__3"
    // InternalDeviceParser.g:2572:1: rule__CapabilityProperty__Group__3 : rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 ;
    public final void rule__CapabilityProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2576:1: ( rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 )
            // InternalDeviceParser.g:2577:2: rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__CapabilityProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__3"


    // $ANTLR start "rule__CapabilityProperty__Group__3__Impl"
    // InternalDeviceParser.g:2584:1: rule__CapabilityProperty__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__CapabilityProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2588:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2589:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2589:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2590:2: RULE_INDENT
            {
             before(grammarAccess.getCapabilityPropertyAccess().getINDENTTerminalRuleCall_3()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getCapabilityPropertyAccess().getINDENTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__3__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__4"
    // InternalDeviceParser.g:2599:1: rule__CapabilityProperty__Group__4 : rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 ;
    public final void rule__CapabilityProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2603:1: ( rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 )
            // InternalDeviceParser.g:2604:2: rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__CapabilityProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__4"


    // $ANTLR start "rule__CapabilityProperty__Group__4__Impl"
    // InternalDeviceParser.g:2611:1: rule__CapabilityProperty__Group__4__Impl : ( Type ) ;
    public final void rule__CapabilityProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2615:1: ( ( Type ) )
            // InternalDeviceParser.g:2616:1: ( Type )
            {
            // InternalDeviceParser.g:2616:1: ( Type )
            // InternalDeviceParser.g:2617:2: Type
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeKeyword_4()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getCapabilityPropertyAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__4__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__5"
    // InternalDeviceParser.g:2626:1: rule__CapabilityProperty__Group__5 : rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 ;
    public final void rule__CapabilityProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2630:1: ( rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 )
            // InternalDeviceParser.g:2631:2: rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__CapabilityProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__5"


    // $ANTLR start "rule__CapabilityProperty__Group__5__Impl"
    // InternalDeviceParser.g:2638:1: rule__CapabilityProperty__Group__5__Impl : ( ( rule__CapabilityProperty__TypeAssignment_5 ) ) ;
    public final void rule__CapabilityProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2642:1: ( ( ( rule__CapabilityProperty__TypeAssignment_5 ) ) )
            // InternalDeviceParser.g:2643:1: ( ( rule__CapabilityProperty__TypeAssignment_5 ) )
            {
            // InternalDeviceParser.g:2643:1: ( ( rule__CapabilityProperty__TypeAssignment_5 ) )
            // InternalDeviceParser.g:2644:2: ( rule__CapabilityProperty__TypeAssignment_5 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeAssignment_5()); 
            // InternalDeviceParser.g:2645:2: ( rule__CapabilityProperty__TypeAssignment_5 )
            // InternalDeviceParser.g:2645:3: rule__CapabilityProperty__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityPropertyAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__5__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__6"
    // InternalDeviceParser.g:2653:1: rule__CapabilityProperty__Group__6 : rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 ;
    public final void rule__CapabilityProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2657:1: ( rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 )
            // InternalDeviceParser.g:2658:2: rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__CapabilityProperty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__6"


    // $ANTLR start "rule__CapabilityProperty__Group__6__Impl"
    // InternalDeviceParser.g:2665:1: rule__CapabilityProperty__Group__6__Impl : ( Kind ) ;
    public final void rule__CapabilityProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2669:1: ( ( Kind ) )
            // InternalDeviceParser.g:2670:1: ( Kind )
            {
            // InternalDeviceParser.g:2670:1: ( Kind )
            // InternalDeviceParser.g:2671:2: Kind
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindKeyword_6()); 
            match(input,Kind,FOLLOW_2); 
             after(grammarAccess.getCapabilityPropertyAccess().getKindKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__6__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__7"
    // InternalDeviceParser.g:2680:1: rule__CapabilityProperty__Group__7 : rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 ;
    public final void rule__CapabilityProperty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2684:1: ( rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 )
            // InternalDeviceParser.g:2685:2: rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__CapabilityProperty__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__7"


    // $ANTLR start "rule__CapabilityProperty__Group__7__Impl"
    // InternalDeviceParser.g:2692:1: rule__CapabilityProperty__Group__7__Impl : ( ( rule__CapabilityProperty__KindAssignment_7 ) ) ;
    public final void rule__CapabilityProperty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2696:1: ( ( ( rule__CapabilityProperty__KindAssignment_7 ) ) )
            // InternalDeviceParser.g:2697:1: ( ( rule__CapabilityProperty__KindAssignment_7 ) )
            {
            // InternalDeviceParser.g:2697:1: ( ( rule__CapabilityProperty__KindAssignment_7 ) )
            // InternalDeviceParser.g:2698:2: ( rule__CapabilityProperty__KindAssignment_7 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindAssignment_7()); 
            // InternalDeviceParser.g:2699:2: ( rule__CapabilityProperty__KindAssignment_7 )
            // InternalDeviceParser.g:2699:3: rule__CapabilityProperty__KindAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__KindAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityPropertyAccess().getKindAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__7__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__8"
    // InternalDeviceParser.g:2707:1: rule__CapabilityProperty__Group__8 : rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 ;
    public final void rule__CapabilityProperty__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2711:1: ( rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 )
            // InternalDeviceParser.g:2712:2: rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__CapabilityProperty__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__8"


    // $ANTLR start "rule__CapabilityProperty__Group__8__Impl"
    // InternalDeviceParser.g:2719:1: rule__CapabilityProperty__Group__8__Impl : ( ( rule__CapabilityProperty__Group_8__0 )? ) ;
    public final void rule__CapabilityProperty__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2723:1: ( ( ( rule__CapabilityProperty__Group_8__0 )? ) )
            // InternalDeviceParser.g:2724:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            {
            // InternalDeviceParser.g:2724:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            // InternalDeviceParser.g:2725:2: ( rule__CapabilityProperty__Group_8__0 )?
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup_8()); 
            // InternalDeviceParser.g:2726:2: ( rule__CapabilityProperty__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Value) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDeviceParser.g:2726:3: rule__CapabilityProperty__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CapabilityProperty__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCapabilityPropertyAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__8__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__9"
    // InternalDeviceParser.g:2734:1: rule__CapabilityProperty__Group__9 : rule__CapabilityProperty__Group__9__Impl ;
    public final void rule__CapabilityProperty__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2738:1: ( rule__CapabilityProperty__Group__9__Impl )
            // InternalDeviceParser.g:2739:2: rule__CapabilityProperty__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__9"


    // $ANTLR start "rule__CapabilityProperty__Group__9__Impl"
    // InternalDeviceParser.g:2745:1: rule__CapabilityProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__CapabilityProperty__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2749:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2750:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2750:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2751:2: RULE_DEDENT
            {
             before(grammarAccess.getCapabilityPropertyAccess().getDEDENTTerminalRuleCall_9()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getCapabilityPropertyAccess().getDEDENTTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group__9__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group_8__0"
    // InternalDeviceParser.g:2761:1: rule__CapabilityProperty__Group_8__0 : rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 ;
    public final void rule__CapabilityProperty__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2765:1: ( rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 )
            // InternalDeviceParser.g:2766:2: rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1
            {
            pushFollow(FOLLOW_20);
            rule__CapabilityProperty__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group_8__0"


    // $ANTLR start "rule__CapabilityProperty__Group_8__0__Impl"
    // InternalDeviceParser.g:2773:1: rule__CapabilityProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__CapabilityProperty__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2777:1: ( ( Value ) )
            // InternalDeviceParser.g:2778:1: ( Value )
            {
            // InternalDeviceParser.g:2778:1: ( Value )
            // InternalDeviceParser.g:2779:2: Value
            {
             before(grammarAccess.getCapabilityPropertyAccess().getValueKeyword_8_0()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getCapabilityPropertyAccess().getValueKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group_8__0__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group_8__1"
    // InternalDeviceParser.g:2788:1: rule__CapabilityProperty__Group_8__1 : rule__CapabilityProperty__Group_8__1__Impl ;
    public final void rule__CapabilityProperty__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2792:1: ( rule__CapabilityProperty__Group_8__1__Impl )
            // InternalDeviceParser.g:2793:2: rule__CapabilityProperty__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group_8__1"


    // $ANTLR start "rule__CapabilityProperty__Group_8__1__Impl"
    // InternalDeviceParser.g:2799:1: rule__CapabilityProperty__Group_8__1__Impl : ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__CapabilityProperty__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2803:1: ( ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) )
            // InternalDeviceParser.g:2804:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            {
            // InternalDeviceParser.g:2804:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            // InternalDeviceParser.g:2805:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getValueAssignment_8_1()); 
            // InternalDeviceParser.g:2806:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            // InternalDeviceParser.g:2806:3: rule__CapabilityProperty__ValueAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__ValueAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityPropertyAccess().getValueAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__Group_8__1__Impl"


    // $ANTLR start "rule__AttributeKind__Group__0"
    // InternalDeviceParser.g:2815:1: rule__AttributeKind__Group__0 : rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 ;
    public final void rule__AttributeKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2819:1: ( rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 )
            // InternalDeviceParser.g:2820:2: rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__AttributeKind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeKind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeKind__Group__0"


    // $ANTLR start "rule__AttributeKind__Group__0__Impl"
    // InternalDeviceParser.g:2827:1: rule__AttributeKind__Group__0__Impl : ( () ) ;
    public final void rule__AttributeKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2831:1: ( ( () ) )
            // InternalDeviceParser.g:2832:1: ( () )
            {
            // InternalDeviceParser.g:2832:1: ( () )
            // InternalDeviceParser.g:2833:2: ()
            {
             before(grammarAccess.getAttributeKindAccess().getAttributeKindAction_0()); 
            // InternalDeviceParser.g:2834:2: ()
            // InternalDeviceParser.g:2834:3: 
            {
            }

             after(grammarAccess.getAttributeKindAccess().getAttributeKindAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeKind__Group__0__Impl"


    // $ANTLR start "rule__AttributeKind__Group__1"
    // InternalDeviceParser.g:2842:1: rule__AttributeKind__Group__1 : rule__AttributeKind__Group__1__Impl ;
    public final void rule__AttributeKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2846:1: ( rule__AttributeKind__Group__1__Impl )
            // InternalDeviceParser.g:2847:2: rule__AttributeKind__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeKind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeKind__Group__1"


    // $ANTLR start "rule__AttributeKind__Group__1__Impl"
    // InternalDeviceParser.g:2853:1: rule__AttributeKind__Group__1__Impl : ( AttributeKind ) ;
    public final void rule__AttributeKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2857:1: ( ( AttributeKind ) )
            // InternalDeviceParser.g:2858:1: ( AttributeKind )
            {
            // InternalDeviceParser.g:2858:1: ( AttributeKind )
            // InternalDeviceParser.g:2859:2: AttributeKind
            {
             before(grammarAccess.getAttributeKindAccess().getAttributeKindKeyword_1()); 
            match(input,AttributeKind,FOLLOW_2); 
             after(grammarAccess.getAttributeKindAccess().getAttributeKindKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeKind__Group__1__Impl"


    // $ANTLR start "rule__MaximumKind__Group__0"
    // InternalDeviceParser.g:2869:1: rule__MaximumKind__Group__0 : rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 ;
    public final void rule__MaximumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2873:1: ( rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 )
            // InternalDeviceParser.g:2874:2: rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MaximumKind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaximumKind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumKind__Group__0"


    // $ANTLR start "rule__MaximumKind__Group__0__Impl"
    // InternalDeviceParser.g:2881:1: rule__MaximumKind__Group__0__Impl : ( () ) ;
    public final void rule__MaximumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2885:1: ( ( () ) )
            // InternalDeviceParser.g:2886:1: ( () )
            {
            // InternalDeviceParser.g:2886:1: ( () )
            // InternalDeviceParser.g:2887:2: ()
            {
             before(grammarAccess.getMaximumKindAccess().getMaximumKindAction_0()); 
            // InternalDeviceParser.g:2888:2: ()
            // InternalDeviceParser.g:2888:3: 
            {
            }

             after(grammarAccess.getMaximumKindAccess().getMaximumKindAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumKind__Group__0__Impl"


    // $ANTLR start "rule__MaximumKind__Group__1"
    // InternalDeviceParser.g:2896:1: rule__MaximumKind__Group__1 : rule__MaximumKind__Group__1__Impl ;
    public final void rule__MaximumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2900:1: ( rule__MaximumKind__Group__1__Impl )
            // InternalDeviceParser.g:2901:2: rule__MaximumKind__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaximumKind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumKind__Group__1"


    // $ANTLR start "rule__MaximumKind__Group__1__Impl"
    // InternalDeviceParser.g:2907:1: rule__MaximumKind__Group__1__Impl : ( MaximumKind ) ;
    public final void rule__MaximumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2911:1: ( ( MaximumKind ) )
            // InternalDeviceParser.g:2912:1: ( MaximumKind )
            {
            // InternalDeviceParser.g:2912:1: ( MaximumKind )
            // InternalDeviceParser.g:2913:2: MaximumKind
            {
             before(grammarAccess.getMaximumKindAccess().getMaximumKindKeyword_1()); 
            match(input,MaximumKind,FOLLOW_2); 
             after(grammarAccess.getMaximumKindAccess().getMaximumKindKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumKind__Group__1__Impl"


    // $ANTLR start "rule__MinimumKind__Group__0"
    // InternalDeviceParser.g:2923:1: rule__MinimumKind__Group__0 : rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 ;
    public final void rule__MinimumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2927:1: ( rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 )
            // InternalDeviceParser.g:2928:2: rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__MinimumKind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinimumKind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumKind__Group__0"


    // $ANTLR start "rule__MinimumKind__Group__0__Impl"
    // InternalDeviceParser.g:2935:1: rule__MinimumKind__Group__0__Impl : ( () ) ;
    public final void rule__MinimumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2939:1: ( ( () ) )
            // InternalDeviceParser.g:2940:1: ( () )
            {
            // InternalDeviceParser.g:2940:1: ( () )
            // InternalDeviceParser.g:2941:2: ()
            {
             before(grammarAccess.getMinimumKindAccess().getMinimumKindAction_0()); 
            // InternalDeviceParser.g:2942:2: ()
            // InternalDeviceParser.g:2942:3: 
            {
            }

             after(grammarAccess.getMinimumKindAccess().getMinimumKindAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumKind__Group__0__Impl"


    // $ANTLR start "rule__MinimumKind__Group__1"
    // InternalDeviceParser.g:2950:1: rule__MinimumKind__Group__1 : rule__MinimumKind__Group__1__Impl ;
    public final void rule__MinimumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2954:1: ( rule__MinimumKind__Group__1__Impl )
            // InternalDeviceParser.g:2955:2: rule__MinimumKind__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinimumKind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumKind__Group__1"


    // $ANTLR start "rule__MinimumKind__Group__1__Impl"
    // InternalDeviceParser.g:2961:1: rule__MinimumKind__Group__1__Impl : ( MinimumKind ) ;
    public final void rule__MinimumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2965:1: ( ( MinimumKind ) )
            // InternalDeviceParser.g:2966:1: ( MinimumKind )
            {
            // InternalDeviceParser.g:2966:1: ( MinimumKind )
            // InternalDeviceParser.g:2967:2: MinimumKind
            {
             before(grammarAccess.getMinimumKindAccess().getMinimumKindKeyword_1()); 
            match(input,MinimumKind,FOLLOW_2); 
             after(grammarAccess.getMinimumKindAccess().getMinimumKindKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumKind__Group__1__Impl"


    // $ANTLR start "rule__SelectionKind__Group__0"
    // InternalDeviceParser.g:2977:1: rule__SelectionKind__Group__0 : rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 ;
    public final void rule__SelectionKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2981:1: ( rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 )
            // InternalDeviceParser.g:2982:2: rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SelectionKind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectionKind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionKind__Group__0"


    // $ANTLR start "rule__SelectionKind__Group__0__Impl"
    // InternalDeviceParser.g:2989:1: rule__SelectionKind__Group__0__Impl : ( () ) ;
    public final void rule__SelectionKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2993:1: ( ( () ) )
            // InternalDeviceParser.g:2994:1: ( () )
            {
            // InternalDeviceParser.g:2994:1: ( () )
            // InternalDeviceParser.g:2995:2: ()
            {
             before(grammarAccess.getSelectionKindAccess().getSelectionKindAction_0()); 
            // InternalDeviceParser.g:2996:2: ()
            // InternalDeviceParser.g:2996:3: 
            {
            }

             after(grammarAccess.getSelectionKindAccess().getSelectionKindAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionKind__Group__0__Impl"


    // $ANTLR start "rule__SelectionKind__Group__1"
    // InternalDeviceParser.g:3004:1: rule__SelectionKind__Group__1 : rule__SelectionKind__Group__1__Impl ;
    public final void rule__SelectionKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3008:1: ( rule__SelectionKind__Group__1__Impl )
            // InternalDeviceParser.g:3009:2: rule__SelectionKind__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionKind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionKind__Group__1"


    // $ANTLR start "rule__SelectionKind__Group__1__Impl"
    // InternalDeviceParser.g:3015:1: rule__SelectionKind__Group__1__Impl : ( SelectionKind ) ;
    public final void rule__SelectionKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3019:1: ( ( SelectionKind ) )
            // InternalDeviceParser.g:3020:1: ( SelectionKind )
            {
            // InternalDeviceParser.g:3020:1: ( SelectionKind )
            // InternalDeviceParser.g:3021:2: SelectionKind
            {
             before(grammarAccess.getSelectionKindAccess().getSelectionKindKeyword_1()); 
            match(input,SelectionKind,FOLLOW_2); 
             after(grammarAccess.getSelectionKindAccess().getSelectionKindKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionKind__Group__1__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group__0"
    // InternalDeviceParser.g:3031:1: rule__ConnectionProperty__Group__0 : rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 ;
    public final void rule__ConnectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3035:1: ( rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 )
            // InternalDeviceParser.g:3036:2: rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ConnectionProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__0"


    // $ANTLR start "rule__ConnectionProperty__Group__0__Impl"
    // InternalDeviceParser.g:3043:1: rule__ConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3047:1: ( ( () ) )
            // InternalDeviceParser.g:3048:1: ( () )
            {
            // InternalDeviceParser.g:3048:1: ( () )
            // InternalDeviceParser.g:3049:2: ()
            {
             before(grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0()); 
            // InternalDeviceParser.g:3050:2: ()
            // InternalDeviceParser.g:3050:3: 
            {
            }

             after(grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__0__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group__1"
    // InternalDeviceParser.g:3058:1: rule__ConnectionProperty__Group__1 : rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 ;
    public final void rule__ConnectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3062:1: ( rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 )
            // InternalDeviceParser.g:3063:2: rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ConnectionProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__1"


    // $ANTLR start "rule__ConnectionProperty__Group__1__Impl"
    // InternalDeviceParser.g:3070:1: rule__ConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3074:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:3075:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:3075:1: ( rulePreListElement )
            // InternalDeviceParser.g:3076:2: rulePreListElement
            {
             before(grammarAccess.getConnectionPropertyAccess().getPreListElementParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getConnectionPropertyAccess().getPreListElementParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__1__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group__2"
    // InternalDeviceParser.g:3085:1: rule__ConnectionProperty__Group__2 : rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 ;
    public final void rule__ConnectionProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3089:1: ( rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 )
            // InternalDeviceParser.g:3090:2: rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ConnectionProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__2"


    // $ANTLR start "rule__ConnectionProperty__Group__2__Impl"
    // InternalDeviceParser.g:3097:1: rule__ConnectionProperty__Group__2__Impl : ( Name ) ;
    public final void rule__ConnectionProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3101:1: ( ( Name ) )
            // InternalDeviceParser.g:3102:1: ( Name )
            {
            // InternalDeviceParser.g:3102:1: ( Name )
            // InternalDeviceParser.g:3103:2: Name
            {
             before(grammarAccess.getConnectionPropertyAccess().getNameKeyword_2()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getConnectionPropertyAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__2__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group__3"
    // InternalDeviceParser.g:3112:1: rule__ConnectionProperty__Group__3 : rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 ;
    public final void rule__ConnectionProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3116:1: ( rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 )
            // InternalDeviceParser.g:3117:2: rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ConnectionProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__3"


    // $ANTLR start "rule__ConnectionProperty__Group__3__Impl"
    // InternalDeviceParser.g:3124:1: rule__ConnectionProperty__Group__3__Impl : ( ( rule__ConnectionProperty__NameAssignment_3 ) ) ;
    public final void rule__ConnectionProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3128:1: ( ( ( rule__ConnectionProperty__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:3129:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:3129:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            // InternalDeviceParser.g:3130:2: ( rule__ConnectionProperty__NameAssignment_3 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3()); 
            // InternalDeviceParser.g:3131:2: ( rule__ConnectionProperty__NameAssignment_3 )
            // InternalDeviceParser.g:3131:3: rule__ConnectionProperty__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__3__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group__4"
    // InternalDeviceParser.g:3139:1: rule__ConnectionProperty__Group__4 : rule__ConnectionProperty__Group__4__Impl ;
    public final void rule__ConnectionProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3143:1: ( rule__ConnectionProperty__Group__4__Impl )
            // InternalDeviceParser.g:3144:2: rule__ConnectionProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__4"


    // $ANTLR start "rule__ConnectionProperty__Group__4__Impl"
    // InternalDeviceParser.g:3150:1: rule__ConnectionProperty__Group__4__Impl : ( ( rule__ConnectionProperty__Group_4__0 )? ) ;
    public final void rule__ConnectionProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3154:1: ( ( ( rule__ConnectionProperty__Group_4__0 )? ) )
            // InternalDeviceParser.g:3155:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            {
            // InternalDeviceParser.g:3155:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            // InternalDeviceParser.g:3156:2: ( rule__ConnectionProperty__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup_4()); 
            // InternalDeviceParser.g:3157:2: ( rule__ConnectionProperty__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDeviceParser.g:3157:3: rule__ConnectionProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectionProperty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__4__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group_4__0"
    // InternalDeviceParser.g:3166:1: rule__ConnectionProperty__Group_4__0 : rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 ;
    public final void rule__ConnectionProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3170:1: ( rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 )
            // InternalDeviceParser.g:3171:2: rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__ConnectionProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_4__0"


    // $ANTLR start "rule__ConnectionProperty__Group_4__0__Impl"
    // InternalDeviceParser.g:3178:1: rule__ConnectionProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectionProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3182:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3183:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3183:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3184:2: RULE_INDENT
            {
             before(grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_4__0__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group_4__1"
    // InternalDeviceParser.g:3193:1: rule__ConnectionProperty__Group_4__1 : rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 ;
    public final void rule__ConnectionProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3197:1: ( rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 )
            // InternalDeviceParser.g:3198:2: rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__ConnectionProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_4__1"


    // $ANTLR start "rule__ConnectionProperty__Group_4__1__Impl"
    // InternalDeviceParser.g:3205:1: rule__ConnectionProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__ConnectionProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3209:1: ( ( Value ) )
            // InternalDeviceParser.g:3210:1: ( Value )
            {
            // InternalDeviceParser.g:3210:1: ( Value )
            // InternalDeviceParser.g:3211:2: Value
            {
             before(grammarAccess.getConnectionPropertyAccess().getValueKeyword_4_1()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getConnectionPropertyAccess().getValueKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_4__1__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group_4__2"
    // InternalDeviceParser.g:3220:1: rule__ConnectionProperty__Group_4__2 : rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 ;
    public final void rule__ConnectionProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3224:1: ( rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 )
            // InternalDeviceParser.g:3225:2: rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__ConnectionProperty__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_4__2"


    // $ANTLR start "rule__ConnectionProperty__Group_4__2__Impl"
    // InternalDeviceParser.g:3232:1: rule__ConnectionProperty__Group_4__2__Impl : ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__ConnectionProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3236:1: ( ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) )
            // InternalDeviceParser.g:3237:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            {
            // InternalDeviceParser.g:3237:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            // InternalDeviceParser.g:3238:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getValueAssignment_4_2()); 
            // InternalDeviceParser.g:3239:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            // InternalDeviceParser.g:3239:3: rule__ConnectionProperty__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPropertyAccess().getValueAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_4__2__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group_4__3"
    // InternalDeviceParser.g:3247:1: rule__ConnectionProperty__Group_4__3 : rule__ConnectionProperty__Group_4__3__Impl ;
    public final void rule__ConnectionProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3251:1: ( rule__ConnectionProperty__Group_4__3__Impl )
            // InternalDeviceParser.g:3252:2: rule__ConnectionProperty__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_4__3"


    // $ANTLR start "rule__ConnectionProperty__Group_4__3__Impl"
    // InternalDeviceParser.g:3258:1: rule__ConnectionProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectionProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3262:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3263:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3263:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3264:2: RULE_DEDENT
            {
             before(grammarAccess.getConnectionPropertyAccess().getDEDENTTerminalRuleCall_4_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getConnectionPropertyAccess().getDEDENTTerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_4__3__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__0"
    // InternalDeviceParser.g:3274:1: rule__NetworkConnection__Group__0 : rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 ;
    public final void rule__NetworkConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3278:1: ( rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 )
            // InternalDeviceParser.g:3279:2: rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NetworkConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__0"


    // $ANTLR start "rule__NetworkConnection__Group__0__Impl"
    // InternalDeviceParser.g:3286:1: rule__NetworkConnection__Group__0__Impl : ( () ) ;
    public final void rule__NetworkConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3290:1: ( ( () ) )
            // InternalDeviceParser.g:3291:1: ( () )
            {
            // InternalDeviceParser.g:3291:1: ( () )
            // InternalDeviceParser.g:3292:2: ()
            {
             before(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionAction_0()); 
            // InternalDeviceParser.g:3293:2: ()
            // InternalDeviceParser.g:3293:3: 
            {
            }

             after(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__0__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__1"
    // InternalDeviceParser.g:3301:1: rule__NetworkConnection__Group__1 : rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 ;
    public final void rule__NetworkConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3305:1: ( rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 )
            // InternalDeviceParser.g:3306:2: rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__NetworkConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__1"


    // $ANTLR start "rule__NetworkConnection__Group__1__Impl"
    // InternalDeviceParser.g:3313:1: rule__NetworkConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__NetworkConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3317:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:3318:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:3318:1: ( rulePreListElement )
            // InternalDeviceParser.g:3319:2: rulePreListElement
            {
             before(grammarAccess.getNetworkConnectionAccess().getPreListElementParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionAccess().getPreListElementParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__1__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__2"
    // InternalDeviceParser.g:3328:1: rule__NetworkConnection__Group__2 : rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 ;
    public final void rule__NetworkConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3332:1: ( rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 )
            // InternalDeviceParser.g:3333:2: rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__NetworkConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__2"


    // $ANTLR start "rule__NetworkConnection__Group__2__Impl"
    // InternalDeviceParser.g:3340:1: rule__NetworkConnection__Group__2__Impl : ( Name ) ;
    public final void rule__NetworkConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3344:1: ( ( Name ) )
            // InternalDeviceParser.g:3345:1: ( Name )
            {
            // InternalDeviceParser.g:3345:1: ( Name )
            // InternalDeviceParser.g:3346:2: Name
            {
             before(grammarAccess.getNetworkConnectionAccess().getNameKeyword_2()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__2__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__3"
    // InternalDeviceParser.g:3355:1: rule__NetworkConnection__Group__3 : rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 ;
    public final void rule__NetworkConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3359:1: ( rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 )
            // InternalDeviceParser.g:3360:2: rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__NetworkConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__3"


    // $ANTLR start "rule__NetworkConnection__Group__3__Impl"
    // InternalDeviceParser.g:3367:1: rule__NetworkConnection__Group__3__Impl : ( ( rule__NetworkConnection__NameAssignment_3 ) ) ;
    public final void rule__NetworkConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3371:1: ( ( ( rule__NetworkConnection__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:3372:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:3372:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            // InternalDeviceParser.g:3373:2: ( rule__NetworkConnection__NameAssignment_3 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getNameAssignment_3()); 
            // InternalDeviceParser.g:3374:2: ( rule__NetworkConnection__NameAssignment_3 )
            // InternalDeviceParser.g:3374:3: rule__NetworkConnection__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__3__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__4"
    // InternalDeviceParser.g:3382:1: rule__NetworkConnection__Group__4 : rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 ;
    public final void rule__NetworkConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3386:1: ( rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 )
            // InternalDeviceParser.g:3387:2: rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__NetworkConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__4"


    // $ANTLR start "rule__NetworkConnection__Group__4__Impl"
    // InternalDeviceParser.g:3394:1: rule__NetworkConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3398:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3399:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3399:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3400:2: RULE_INDENT
            {
             before(grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__4__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__5"
    // InternalDeviceParser.g:3409:1: rule__NetworkConnection__Group__5 : rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 ;
    public final void rule__NetworkConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3413:1: ( rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 )
            // InternalDeviceParser.g:3414:2: rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__NetworkConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__5"


    // $ANTLR start "rule__NetworkConnection__Group__5__Impl"
    // InternalDeviceParser.g:3421:1: rule__NetworkConnection__Group__5__Impl : ( Type ) ;
    public final void rule__NetworkConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3425:1: ( ( Type ) )
            // InternalDeviceParser.g:3426:1: ( Type )
            {
            // InternalDeviceParser.g:3426:1: ( Type )
            // InternalDeviceParser.g:3427:2: Type
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__5__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__6"
    // InternalDeviceParser.g:3436:1: rule__NetworkConnection__Group__6 : rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 ;
    public final void rule__NetworkConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3440:1: ( rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 )
            // InternalDeviceParser.g:3441:2: rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__NetworkConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__6"


    // $ANTLR start "rule__NetworkConnection__Group__6__Impl"
    // InternalDeviceParser.g:3448:1: rule__NetworkConnection__Group__6__Impl : ( ( rule__NetworkConnection__TypeAssignment_6 ) ) ;
    public final void rule__NetworkConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3452:1: ( ( ( rule__NetworkConnection__TypeAssignment_6 ) ) )
            // InternalDeviceParser.g:3453:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            {
            // InternalDeviceParser.g:3453:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            // InternalDeviceParser.g:3454:2: ( rule__NetworkConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeAssignment_6()); 
            // InternalDeviceParser.g:3455:2: ( rule__NetworkConnection__TypeAssignment_6 )
            // InternalDeviceParser.g:3455:3: rule__NetworkConnection__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__6__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__7"
    // InternalDeviceParser.g:3463:1: rule__NetworkConnection__Group__7 : rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 ;
    public final void rule__NetworkConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3467:1: ( rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 )
            // InternalDeviceParser.g:3468:2: rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__NetworkConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__7"


    // $ANTLR start "rule__NetworkConnection__Group__7__Impl"
    // InternalDeviceParser.g:3475:1: rule__NetworkConnection__Group__7__Impl : ( ( rule__NetworkConnection__Group_7__0 )? ) ;
    public final void rule__NetworkConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3479:1: ( ( ( rule__NetworkConnection__Group_7__0 )? ) )
            // InternalDeviceParser.g:3480:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            {
            // InternalDeviceParser.g:3480:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            // InternalDeviceParser.g:3481:2: ( rule__NetworkConnection__Group_7__0 )?
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup_7()); 
            // InternalDeviceParser.g:3482:2: ( rule__NetworkConnection__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Properties) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDeviceParser.g:3482:3: rule__NetworkConnection__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConnection__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNetworkConnectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__7__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__8"
    // InternalDeviceParser.g:3490:1: rule__NetworkConnection__Group__8 : rule__NetworkConnection__Group__8__Impl ;
    public final void rule__NetworkConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3494:1: ( rule__NetworkConnection__Group__8__Impl )
            // InternalDeviceParser.g:3495:2: rule__NetworkConnection__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__8"


    // $ANTLR start "rule__NetworkConnection__Group__8__Impl"
    // InternalDeviceParser.g:3501:1: rule__NetworkConnection__Group__8__Impl : ( RightCurlyBracket ) ;
    public final void rule__NetworkConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3505:1: ( ( RightCurlyBracket ) )
            // InternalDeviceParser.g:3506:1: ( RightCurlyBracket )
            {
            // InternalDeviceParser.g:3506:1: ( RightCurlyBracket )
            // InternalDeviceParser.g:3507:2: RightCurlyBracket
            {
             before(grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__8__Impl"


    // $ANTLR start "rule__NetworkConnection__Group_7__0"
    // InternalDeviceParser.g:3517:1: rule__NetworkConnection__Group_7__0 : rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 ;
    public final void rule__NetworkConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3521:1: ( rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 )
            // InternalDeviceParser.g:3522:2: rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__NetworkConnection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_7__0"


    // $ANTLR start "rule__NetworkConnection__Group_7__0__Impl"
    // InternalDeviceParser.g:3529:1: rule__NetworkConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__NetworkConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3533:1: ( ( Properties ) )
            // InternalDeviceParser.g:3534:1: ( Properties )
            {
            // InternalDeviceParser.g:3534:1: ( Properties )
            // InternalDeviceParser.g:3535:2: Properties
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0()); 
            match(input,Properties,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_7__0__Impl"


    // $ANTLR start "rule__NetworkConnection__Group_7__1"
    // InternalDeviceParser.g:3544:1: rule__NetworkConnection__Group_7__1 : rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 ;
    public final void rule__NetworkConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3548:1: ( rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 )
            // InternalDeviceParser.g:3549:2: rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__NetworkConnection__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_7__1"


    // $ANTLR start "rule__NetworkConnection__Group_7__1__Impl"
    // InternalDeviceParser.g:3556:1: rule__NetworkConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3560:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3561:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3561:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3562:2: RULE_INDENT
            {
             before(grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_7__1__Impl"


    // $ANTLR start "rule__NetworkConnection__Group_7__2"
    // InternalDeviceParser.g:3571:1: rule__NetworkConnection__Group_7__2 : rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 ;
    public final void rule__NetworkConnection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3575:1: ( rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 )
            // InternalDeviceParser.g:3576:2: rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__NetworkConnection__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_7__2"


    // $ANTLR start "rule__NetworkConnection__Group_7__2__Impl"
    // InternalDeviceParser.g:3583:1: rule__NetworkConnection__Group_7__2__Impl : ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__NetworkConnection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3587:1: ( ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalDeviceParser.g:3588:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalDeviceParser.g:3588:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            // InternalDeviceParser.g:3589:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalDeviceParser.g:3589:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) )
            // InternalDeviceParser.g:3590:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalDeviceParser.g:3591:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            // InternalDeviceParser.g:3591:4: rule__NetworkConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_26);
            rule__NetworkConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 

            }

            // InternalDeviceParser.g:3594:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            // InternalDeviceParser.g:3595:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalDeviceParser.g:3596:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_INDENT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDeviceParser.g:3596:4: rule__NetworkConnection__PropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__NetworkConnection__PropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_7__2__Impl"


    // $ANTLR start "rule__NetworkConnection__Group_7__3"
    // InternalDeviceParser.g:3605:1: rule__NetworkConnection__Group_7__3 : rule__NetworkConnection__Group_7__3__Impl ;
    public final void rule__NetworkConnection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3609:1: ( rule__NetworkConnection__Group_7__3__Impl )
            // InternalDeviceParser.g:3610:2: rule__NetworkConnection__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_7__3"


    // $ANTLR start "rule__NetworkConnection__Group_7__3__Impl"
    // InternalDeviceParser.g:3616:1: rule__NetworkConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__NetworkConnection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3620:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3621:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3621:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3622:2: RULE_DEDENT
            {
             before(grammarAccess.getNetworkConnectionAccess().getDEDENTTerminalRuleCall_7_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getDEDENTTerminalRuleCall_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_7__3__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group__0"
    // InternalDeviceParser.g:3632:1: rule__CommunicationConnection__Group__0 : rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 ;
    public final void rule__CommunicationConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3636:1: ( rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 )
            // InternalDeviceParser.g:3637:2: rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CommunicationConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__0"


    // $ANTLR start "rule__CommunicationConnection__Group__0__Impl"
    // InternalDeviceParser.g:3644:1: rule__CommunicationConnection__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3648:1: ( ( () ) )
            // InternalDeviceParser.g:3649:1: ( () )
            {
            // InternalDeviceParser.g:3649:1: ( () )
            // InternalDeviceParser.g:3650:2: ()
            {
             before(grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0()); 
            // InternalDeviceParser.g:3651:2: ()
            // InternalDeviceParser.g:3651:3: 
            {
            }

             after(grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__0__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group__1"
    // InternalDeviceParser.g:3659:1: rule__CommunicationConnection__Group__1 : rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 ;
    public final void rule__CommunicationConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3663:1: ( rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 )
            // InternalDeviceParser.g:3664:2: rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CommunicationConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__1"


    // $ANTLR start "rule__CommunicationConnection__Group__1__Impl"
    // InternalDeviceParser.g:3671:1: rule__CommunicationConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__CommunicationConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3675:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:3676:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:3676:1: ( rulePreListElement )
            // InternalDeviceParser.g:3677:2: rulePreListElement
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPreListElementParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getCommunicationConnectionAccess().getPreListElementParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__1__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group__2"
    // InternalDeviceParser.g:3686:1: rule__CommunicationConnection__Group__2 : rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 ;
    public final void rule__CommunicationConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3690:1: ( rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 )
            // InternalDeviceParser.g:3691:2: rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CommunicationConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__2"


    // $ANTLR start "rule__CommunicationConnection__Group__2__Impl"
    // InternalDeviceParser.g:3698:1: rule__CommunicationConnection__Group__2__Impl : ( Name ) ;
    public final void rule__CommunicationConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3702:1: ( ( Name ) )
            // InternalDeviceParser.g:3703:1: ( Name )
            {
            // InternalDeviceParser.g:3703:1: ( Name )
            // InternalDeviceParser.g:3704:2: Name
            {
             before(grammarAccess.getCommunicationConnectionAccess().getNameKeyword_2()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getCommunicationConnectionAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__2__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group__3"
    // InternalDeviceParser.g:3713:1: rule__CommunicationConnection__Group__3 : rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 ;
    public final void rule__CommunicationConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3717:1: ( rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 )
            // InternalDeviceParser.g:3718:2: rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__CommunicationConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__3"


    // $ANTLR start "rule__CommunicationConnection__Group__3__Impl"
    // InternalDeviceParser.g:3725:1: rule__CommunicationConnection__Group__3__Impl : ( ( rule__CommunicationConnection__NameAssignment_3 ) ) ;
    public final void rule__CommunicationConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3729:1: ( ( ( rule__CommunicationConnection__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:3730:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:3730:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            // InternalDeviceParser.g:3731:2: ( rule__CommunicationConnection__NameAssignment_3 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3()); 
            // InternalDeviceParser.g:3732:2: ( rule__CommunicationConnection__NameAssignment_3 )
            // InternalDeviceParser.g:3732:3: rule__CommunicationConnection__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__3__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group__4"
    // InternalDeviceParser.g:3740:1: rule__CommunicationConnection__Group__4 : rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 ;
    public final void rule__CommunicationConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3744:1: ( rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 )
            // InternalDeviceParser.g:3745:2: rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__CommunicationConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__4"


    // $ANTLR start "rule__CommunicationConnection__Group__4__Impl"
    // InternalDeviceParser.g:3752:1: rule__CommunicationConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3756:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3757:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3757:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3758:2: RULE_INDENT
            {
             before(grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__4__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group__5"
    // InternalDeviceParser.g:3767:1: rule__CommunicationConnection__Group__5 : rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 ;
    public final void rule__CommunicationConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3771:1: ( rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 )
            // InternalDeviceParser.g:3772:2: rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__CommunicationConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__5"


    // $ANTLR start "rule__CommunicationConnection__Group__5__Impl"
    // InternalDeviceParser.g:3779:1: rule__CommunicationConnection__Group__5__Impl : ( Type ) ;
    public final void rule__CommunicationConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3783:1: ( ( Type ) )
            // InternalDeviceParser.g:3784:1: ( Type )
            {
            // InternalDeviceParser.g:3784:1: ( Type )
            // InternalDeviceParser.g:3785:2: Type
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__5__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group__6"
    // InternalDeviceParser.g:3794:1: rule__CommunicationConnection__Group__6 : rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 ;
    public final void rule__CommunicationConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3798:1: ( rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 )
            // InternalDeviceParser.g:3799:2: rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__CommunicationConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__6"


    // $ANTLR start "rule__CommunicationConnection__Group__6__Impl"
    // InternalDeviceParser.g:3806:1: rule__CommunicationConnection__Group__6__Impl : ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) ;
    public final void rule__CommunicationConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3810:1: ( ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) )
            // InternalDeviceParser.g:3811:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            {
            // InternalDeviceParser.g:3811:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            // InternalDeviceParser.g:3812:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6()); 
            // InternalDeviceParser.g:3813:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            // InternalDeviceParser.g:3813:3: rule__CommunicationConnection__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__6__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group__7"
    // InternalDeviceParser.g:3821:1: rule__CommunicationConnection__Group__7 : rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 ;
    public final void rule__CommunicationConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3825:1: ( rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 )
            // InternalDeviceParser.g:3826:2: rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__CommunicationConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__7"


    // $ANTLR start "rule__CommunicationConnection__Group__7__Impl"
    // InternalDeviceParser.g:3833:1: rule__CommunicationConnection__Group__7__Impl : ( ( rule__CommunicationConnection__Group_7__0 )? ) ;
    public final void rule__CommunicationConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3837:1: ( ( ( rule__CommunicationConnection__Group_7__0 )? ) )
            // InternalDeviceParser.g:3838:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            {
            // InternalDeviceParser.g:3838:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            // InternalDeviceParser.g:3839:2: ( rule__CommunicationConnection__Group_7__0 )?
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup_7()); 
            // InternalDeviceParser.g:3840:2: ( rule__CommunicationConnection__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Properties) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDeviceParser.g:3840:3: rule__CommunicationConnection__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommunicationConnection__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommunicationConnectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__7__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group__8"
    // InternalDeviceParser.g:3848:1: rule__CommunicationConnection__Group__8 : rule__CommunicationConnection__Group__8__Impl ;
    public final void rule__CommunicationConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3852:1: ( rule__CommunicationConnection__Group__8__Impl )
            // InternalDeviceParser.g:3853:2: rule__CommunicationConnection__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__8"


    // $ANTLR start "rule__CommunicationConnection__Group__8__Impl"
    // InternalDeviceParser.g:3859:1: rule__CommunicationConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3863:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3864:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3864:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3865:2: RULE_DEDENT
            {
             before(grammarAccess.getCommunicationConnectionAccess().getDEDENTTerminalRuleCall_8()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getCommunicationConnectionAccess().getDEDENTTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group__8__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group_7__0"
    // InternalDeviceParser.g:3875:1: rule__CommunicationConnection__Group_7__0 : rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 ;
    public final void rule__CommunicationConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3879:1: ( rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 )
            // InternalDeviceParser.g:3880:2: rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__CommunicationConnection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group_7__0"


    // $ANTLR start "rule__CommunicationConnection__Group_7__0__Impl"
    // InternalDeviceParser.g:3887:1: rule__CommunicationConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__CommunicationConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3891:1: ( ( Properties ) )
            // InternalDeviceParser.g:3892:1: ( Properties )
            {
            // InternalDeviceParser.g:3892:1: ( Properties )
            // InternalDeviceParser.g:3893:2: Properties
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0()); 
            match(input,Properties,FOLLOW_2); 
             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group_7__0__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group_7__1"
    // InternalDeviceParser.g:3902:1: rule__CommunicationConnection__Group_7__1 : rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 ;
    public final void rule__CommunicationConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3906:1: ( rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 )
            // InternalDeviceParser.g:3907:2: rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2
            {
            pushFollow(FOLLOW_5);
            rule__CommunicationConnection__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group_7__1"


    // $ANTLR start "rule__CommunicationConnection__Group_7__1__Impl"
    // InternalDeviceParser.g:3914:1: rule__CommunicationConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3918:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3919:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3919:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3920:2: RULE_INDENT
            {
             before(grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group_7__1__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group_7__2"
    // InternalDeviceParser.g:3929:1: rule__CommunicationConnection__Group_7__2 : rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 ;
    public final void rule__CommunicationConnection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3933:1: ( rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 )
            // InternalDeviceParser.g:3934:2: rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__CommunicationConnection__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group_7__2"


    // $ANTLR start "rule__CommunicationConnection__Group_7__2__Impl"
    // InternalDeviceParser.g:3941:1: rule__CommunicationConnection__Group_7__2__Impl : ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__CommunicationConnection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3945:1: ( ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalDeviceParser.g:3946:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalDeviceParser.g:3946:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            // InternalDeviceParser.g:3947:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalDeviceParser.g:3947:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) )
            // InternalDeviceParser.g:3948:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalDeviceParser.g:3949:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            // InternalDeviceParser.g:3949:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_14);
            rule__CommunicationConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 

            }

            // InternalDeviceParser.g:3952:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            // InternalDeviceParser.g:3953:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalDeviceParser.g:3954:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==HyphenMinus) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDeviceParser.g:3954:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__CommunicationConnection__PropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group_7__2__Impl"


    // $ANTLR start "rule__CommunicationConnection__Group_7__3"
    // InternalDeviceParser.g:3963:1: rule__CommunicationConnection__Group_7__3 : rule__CommunicationConnection__Group_7__3__Impl ;
    public final void rule__CommunicationConnection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3967:1: ( rule__CommunicationConnection__Group_7__3__Impl )
            // InternalDeviceParser.g:3968:2: rule__CommunicationConnection__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationConnection__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group_7__3"


    // $ANTLR start "rule__CommunicationConnection__Group_7__3__Impl"
    // InternalDeviceParser.g:3974:1: rule__CommunicationConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3978:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3979:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3979:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3980:2: RULE_DEDENT
            {
             before(grammarAccess.getCommunicationConnectionAccess().getDEDENTTerminalRuleCall_7_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getCommunicationConnectionAccess().getDEDENTTerminalRuleCall_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__Group_7__3__Impl"


    // $ANTLR start "rule__ResouceType_Impl__Group__0"
    // InternalDeviceParser.g:3990:1: rule__ResouceType_Impl__Group__0 : rule__ResouceType_Impl__Group__0__Impl rule__ResouceType_Impl__Group__1 ;
    public final void rule__ResouceType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3994:1: ( rule__ResouceType_Impl__Group__0__Impl rule__ResouceType_Impl__Group__1 )
            // InternalDeviceParser.g:3995:2: rule__ResouceType_Impl__Group__0__Impl rule__ResouceType_Impl__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ResouceType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResouceType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResouceType_Impl__Group__0"


    // $ANTLR start "rule__ResouceType_Impl__Group__0__Impl"
    // InternalDeviceParser.g:4002:1: rule__ResouceType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ResouceType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4006:1: ( ( () ) )
            // InternalDeviceParser.g:4007:1: ( () )
            {
            // InternalDeviceParser.g:4007:1: ( () )
            // InternalDeviceParser.g:4008:2: ()
            {
             before(grammarAccess.getResouceType_ImplAccess().getResouceTypeAction_0()); 
            // InternalDeviceParser.g:4009:2: ()
            // InternalDeviceParser.g:4009:3: 
            {
            }

             after(grammarAccess.getResouceType_ImplAccess().getResouceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResouceType_Impl__Group__0__Impl"


    // $ANTLR start "rule__ResouceType_Impl__Group__1"
    // InternalDeviceParser.g:4017:1: rule__ResouceType_Impl__Group__1 : rule__ResouceType_Impl__Group__1__Impl ;
    public final void rule__ResouceType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4021:1: ( rule__ResouceType_Impl__Group__1__Impl )
            // InternalDeviceParser.g:4022:2: rule__ResouceType_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResouceType_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResouceType_Impl__Group__1"


    // $ANTLR start "rule__ResouceType_Impl__Group__1__Impl"
    // InternalDeviceParser.g:4028:1: rule__ResouceType_Impl__Group__1__Impl : ( ResouceType ) ;
    public final void rule__ResouceType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4032:1: ( ( ResouceType ) )
            // InternalDeviceParser.g:4033:1: ( ResouceType )
            {
            // InternalDeviceParser.g:4033:1: ( ResouceType )
            // InternalDeviceParser.g:4034:2: ResouceType
            {
             before(grammarAccess.getResouceType_ImplAccess().getResouceTypeKeyword_1()); 
            match(input,ResouceType,FOLLOW_2); 
             after(grammarAccess.getResouceType_ImplAccess().getResouceTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResouceType_Impl__Group__1__Impl"


    // $ANTLR start "rule__LinuxOpertingSystem__Group__0"
    // InternalDeviceParser.g:4044:1: rule__LinuxOpertingSystem__Group__0 : rule__LinuxOpertingSystem__Group__0__Impl rule__LinuxOpertingSystem__Group__1 ;
    public final void rule__LinuxOpertingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4048:1: ( rule__LinuxOpertingSystem__Group__0__Impl rule__LinuxOpertingSystem__Group__1 )
            // InternalDeviceParser.g:4049:2: rule__LinuxOpertingSystem__Group__0__Impl rule__LinuxOpertingSystem__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__LinuxOpertingSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinuxOpertingSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxOpertingSystem__Group__0"


    // $ANTLR start "rule__LinuxOpertingSystem__Group__0__Impl"
    // InternalDeviceParser.g:4056:1: rule__LinuxOpertingSystem__Group__0__Impl : ( () ) ;
    public final void rule__LinuxOpertingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4060:1: ( ( () ) )
            // InternalDeviceParser.g:4061:1: ( () )
            {
            // InternalDeviceParser.g:4061:1: ( () )
            // InternalDeviceParser.g:4062:2: ()
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemAction_0()); 
            // InternalDeviceParser.g:4063:2: ()
            // InternalDeviceParser.g:4063:3: 
            {
            }

             after(grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxOpertingSystem__Group__0__Impl"


    // $ANTLR start "rule__LinuxOpertingSystem__Group__1"
    // InternalDeviceParser.g:4071:1: rule__LinuxOpertingSystem__Group__1 : rule__LinuxOpertingSystem__Group__1__Impl rule__LinuxOpertingSystem__Group__2 ;
    public final void rule__LinuxOpertingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4075:1: ( rule__LinuxOpertingSystem__Group__1__Impl rule__LinuxOpertingSystem__Group__2 )
            // InternalDeviceParser.g:4076:2: rule__LinuxOpertingSystem__Group__1__Impl rule__LinuxOpertingSystem__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__LinuxOpertingSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinuxOpertingSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxOpertingSystem__Group__1"


    // $ANTLR start "rule__LinuxOpertingSystem__Group__1__Impl"
    // InternalDeviceParser.g:4083:1: rule__LinuxOpertingSystem__Group__1__Impl : ( LinuxOpertingSystem ) ;
    public final void rule__LinuxOpertingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4087:1: ( ( LinuxOpertingSystem ) )
            // InternalDeviceParser.g:4088:1: ( LinuxOpertingSystem )
            {
            // InternalDeviceParser.g:4088:1: ( LinuxOpertingSystem )
            // InternalDeviceParser.g:4089:2: LinuxOpertingSystem
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemKeyword_1()); 
            match(input,LinuxOpertingSystem,FOLLOW_2); 
             after(grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxOpertingSystem__Group__1__Impl"


    // $ANTLR start "rule__LinuxOpertingSystem__Group__2"
    // InternalDeviceParser.g:4098:1: rule__LinuxOpertingSystem__Group__2 : rule__LinuxOpertingSystem__Group__2__Impl ;
    public final void rule__LinuxOpertingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4102:1: ( rule__LinuxOpertingSystem__Group__2__Impl )
            // InternalDeviceParser.g:4103:2: rule__LinuxOpertingSystem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinuxOpertingSystem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxOpertingSystem__Group__2"


    // $ANTLR start "rule__LinuxOpertingSystem__Group__2__Impl"
    // InternalDeviceParser.g:4109:1: rule__LinuxOpertingSystem__Group__2__Impl : ( ( rule__LinuxOpertingSystem__NameAssignment_2 ) ) ;
    public final void rule__LinuxOpertingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4113:1: ( ( ( rule__LinuxOpertingSystem__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:4114:1: ( ( rule__LinuxOpertingSystem__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:4114:1: ( ( rule__LinuxOpertingSystem__NameAssignment_2 ) )
            // InternalDeviceParser.g:4115:2: ( rule__LinuxOpertingSystem__NameAssignment_2 )
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getNameAssignment_2()); 
            // InternalDeviceParser.g:4116:2: ( rule__LinuxOpertingSystem__NameAssignment_2 )
            // InternalDeviceParser.g:4116:3: rule__LinuxOpertingSystem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LinuxOpertingSystem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinuxOpertingSystemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxOpertingSystem__Group__2__Impl"


    // $ANTLR start "rule__X86ProcessorArchitecture__Group__0"
    // InternalDeviceParser.g:4125:1: rule__X86ProcessorArchitecture__Group__0 : rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 ;
    public final void rule__X86ProcessorArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4129:1: ( rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 )
            // InternalDeviceParser.g:4130:2: rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__X86ProcessorArchitecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__X86ProcessorArchitecture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X86ProcessorArchitecture__Group__0"


    // $ANTLR start "rule__X86ProcessorArchitecture__Group__0__Impl"
    // InternalDeviceParser.g:4137:1: rule__X86ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__X86ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4141:1: ( ( () ) )
            // InternalDeviceParser.g:4142:1: ( () )
            {
            // InternalDeviceParser.g:4142:1: ( () )
            // InternalDeviceParser.g:4143:2: ()
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0()); 
            // InternalDeviceParser.g:4144:2: ()
            // InternalDeviceParser.g:4144:3: 
            {
            }

             after(grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X86ProcessorArchitecture__Group__0__Impl"


    // $ANTLR start "rule__X86ProcessorArchitecture__Group__1"
    // InternalDeviceParser.g:4152:1: rule__X86ProcessorArchitecture__Group__1 : rule__X86ProcessorArchitecture__Group__1__Impl ;
    public final void rule__X86ProcessorArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4156:1: ( rule__X86ProcessorArchitecture__Group__1__Impl )
            // InternalDeviceParser.g:4157:2: rule__X86ProcessorArchitecture__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__X86ProcessorArchitecture__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X86ProcessorArchitecture__Group__1"


    // $ANTLR start "rule__X86ProcessorArchitecture__Group__1__Impl"
    // InternalDeviceParser.g:4163:1: rule__X86ProcessorArchitecture__Group__1__Impl : ( X86ProcessorArchitecture ) ;
    public final void rule__X86ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4167:1: ( ( X86ProcessorArchitecture ) )
            // InternalDeviceParser.g:4168:1: ( X86ProcessorArchitecture )
            {
            // InternalDeviceParser.g:4168:1: ( X86ProcessorArchitecture )
            // InternalDeviceParser.g:4169:2: X86ProcessorArchitecture
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureKeyword_1()); 
            match(input,X86ProcessorArchitecture,FOLLOW_2); 
             after(grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X86ProcessorArchitecture__Group__1__Impl"


    // $ANTLR start "rule__Arm64ProcessorArchitecture__Group__0"
    // InternalDeviceParser.g:4179:1: rule__Arm64ProcessorArchitecture__Group__0 : rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 ;
    public final void rule__Arm64ProcessorArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4183:1: ( rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 )
            // InternalDeviceParser.g:4184:2: rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Arm64ProcessorArchitecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arm64ProcessorArchitecture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm64ProcessorArchitecture__Group__0"


    // $ANTLR start "rule__Arm64ProcessorArchitecture__Group__0__Impl"
    // InternalDeviceParser.g:4191:1: rule__Arm64ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4195:1: ( ( () ) )
            // InternalDeviceParser.g:4196:1: ( () )
            {
            // InternalDeviceParser.g:4196:1: ( () )
            // InternalDeviceParser.g:4197:2: ()
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0()); 
            // InternalDeviceParser.g:4198:2: ()
            // InternalDeviceParser.g:4198:3: 
            {
            }

             after(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm64ProcessorArchitecture__Group__0__Impl"


    // $ANTLR start "rule__Arm64ProcessorArchitecture__Group__1"
    // InternalDeviceParser.g:4206:1: rule__Arm64ProcessorArchitecture__Group__1 : rule__Arm64ProcessorArchitecture__Group__1__Impl ;
    public final void rule__Arm64ProcessorArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4210:1: ( rule__Arm64ProcessorArchitecture__Group__1__Impl )
            // InternalDeviceParser.g:4211:2: rule__Arm64ProcessorArchitecture__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arm64ProcessorArchitecture__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm64ProcessorArchitecture__Group__1"


    // $ANTLR start "rule__Arm64ProcessorArchitecture__Group__1__Impl"
    // InternalDeviceParser.g:4217:1: rule__Arm64ProcessorArchitecture__Group__1__Impl : ( Arm64ProcessorArchitecture ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4221:1: ( ( Arm64ProcessorArchitecture ) )
            // InternalDeviceParser.g:4222:1: ( Arm64ProcessorArchitecture )
            {
            // InternalDeviceParser.g:4222:1: ( Arm64ProcessorArchitecture )
            // InternalDeviceParser.g:4223:2: Arm64ProcessorArchitecture
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureKeyword_1()); 
            match(input,Arm64ProcessorArchitecture,FOLLOW_2); 
             after(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arm64ProcessorArchitecture__Group__1__Impl"


    // $ANTLR start "rule__CommunicationType__Group__0"
    // InternalDeviceParser.g:4233:1: rule__CommunicationType__Group__0 : rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 ;
    public final void rule__CommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4237:1: ( rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 )
            // InternalDeviceParser.g:4238:2: rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__CommunicationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationType__Group__0"


    // $ANTLR start "rule__CommunicationType__Group__0__Impl"
    // InternalDeviceParser.g:4245:1: rule__CommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4249:1: ( ( () ) )
            // InternalDeviceParser.g:4250:1: ( () )
            {
            // InternalDeviceParser.g:4250:1: ( () )
            // InternalDeviceParser.g:4251:2: ()
            {
             before(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0()); 
            // InternalDeviceParser.g:4252:2: ()
            // InternalDeviceParser.g:4252:3: 
            {
            }

             after(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationType__Group__0__Impl"


    // $ANTLR start "rule__CommunicationType__Group__1"
    // InternalDeviceParser.g:4260:1: rule__CommunicationType__Group__1 : rule__CommunicationType__Group__1__Impl ;
    public final void rule__CommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4264:1: ( rule__CommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:4265:2: rule__CommunicationType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationType__Group__1"


    // $ANTLR start "rule__CommunicationType__Group__1__Impl"
    // InternalDeviceParser.g:4271:1: rule__CommunicationType__Group__1__Impl : ( CommunicationType ) ;
    public final void rule__CommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4275:1: ( ( CommunicationType ) )
            // InternalDeviceParser.g:4276:1: ( CommunicationType )
            {
            // InternalDeviceParser.g:4276:1: ( CommunicationType )
            // InternalDeviceParser.g:4277:2: CommunicationType
            {
             before(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeKeyword_1()); 
            match(input,CommunicationType,FOLLOW_2); 
             after(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationType__Group__1__Impl"


    // $ANTLR start "rule__EthernetCommunicationType__Group__0"
    // InternalDeviceParser.g:4287:1: rule__EthernetCommunicationType__Group__0 : rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 ;
    public final void rule__EthernetCommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4291:1: ( rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 )
            // InternalDeviceParser.g:4292:2: rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__EthernetCommunicationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EthernetCommunicationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EthernetCommunicationType__Group__0"


    // $ANTLR start "rule__EthernetCommunicationType__Group__0__Impl"
    // InternalDeviceParser.g:4299:1: rule__EthernetCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__EthernetCommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4303:1: ( ( () ) )
            // InternalDeviceParser.g:4304:1: ( () )
            {
            // InternalDeviceParser.g:4304:1: ( () )
            // InternalDeviceParser.g:4305:2: ()
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeAction_0()); 
            // InternalDeviceParser.g:4306:2: ()
            // InternalDeviceParser.g:4306:3: 
            {
            }

             after(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EthernetCommunicationType__Group__0__Impl"


    // $ANTLR start "rule__EthernetCommunicationType__Group__1"
    // InternalDeviceParser.g:4314:1: rule__EthernetCommunicationType__Group__1 : rule__EthernetCommunicationType__Group__1__Impl ;
    public final void rule__EthernetCommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4318:1: ( rule__EthernetCommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:4319:2: rule__EthernetCommunicationType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EthernetCommunicationType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EthernetCommunicationType__Group__1"


    // $ANTLR start "rule__EthernetCommunicationType__Group__1__Impl"
    // InternalDeviceParser.g:4325:1: rule__EthernetCommunicationType__Group__1__Impl : ( EthernetCommunicationType ) ;
    public final void rule__EthernetCommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4329:1: ( ( EthernetCommunicationType ) )
            // InternalDeviceParser.g:4330:1: ( EthernetCommunicationType )
            {
            // InternalDeviceParser.g:4330:1: ( EthernetCommunicationType )
            // InternalDeviceParser.g:4331:2: EthernetCommunicationType
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeKeyword_1()); 
            match(input,EthernetCommunicationType,FOLLOW_2); 
             after(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EthernetCommunicationType__Group__1__Impl"


    // $ANTLR start "rule__WlanCommunicationType__Group__0"
    // InternalDeviceParser.g:4341:1: rule__WlanCommunicationType__Group__0 : rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 ;
    public final void rule__WlanCommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4345:1: ( rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 )
            // InternalDeviceParser.g:4346:2: rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__WlanCommunicationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WlanCommunicationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WlanCommunicationType__Group__0"


    // $ANTLR start "rule__WlanCommunicationType__Group__0__Impl"
    // InternalDeviceParser.g:4353:1: rule__WlanCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__WlanCommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4357:1: ( ( () ) )
            // InternalDeviceParser.g:4358:1: ( () )
            {
            // InternalDeviceParser.g:4358:1: ( () )
            // InternalDeviceParser.g:4359:2: ()
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeAction_0()); 
            // InternalDeviceParser.g:4360:2: ()
            // InternalDeviceParser.g:4360:3: 
            {
            }

             after(grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WlanCommunicationType__Group__0__Impl"


    // $ANTLR start "rule__WlanCommunicationType__Group__1"
    // InternalDeviceParser.g:4368:1: rule__WlanCommunicationType__Group__1 : rule__WlanCommunicationType__Group__1__Impl ;
    public final void rule__WlanCommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4372:1: ( rule__WlanCommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:4373:2: rule__WlanCommunicationType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WlanCommunicationType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WlanCommunicationType__Group__1"


    // $ANTLR start "rule__WlanCommunicationType__Group__1__Impl"
    // InternalDeviceParser.g:4379:1: rule__WlanCommunicationType__Group__1__Impl : ( WlanCommunicationType ) ;
    public final void rule__WlanCommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4383:1: ( ( WlanCommunicationType ) )
            // InternalDeviceParser.g:4384:1: ( WlanCommunicationType )
            {
            // InternalDeviceParser.g:4384:1: ( WlanCommunicationType )
            // InternalDeviceParser.g:4385:2: WlanCommunicationType
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeKeyword_1()); 
            match(input,WlanCommunicationType,FOLLOW_2); 
             after(grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WlanCommunicationType__Group__1__Impl"


    // $ANTLR start "rule__DeviceSet__DeviceAssignment"
    // InternalDeviceParser.g:4395:1: rule__DeviceSet__DeviceAssignment : ( ruleDeviceType ) ;
    public final void rule__DeviceSet__DeviceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4399:1: ( ( ruleDeviceType ) )
            // InternalDeviceParser.g:4400:2: ( ruleDeviceType )
            {
            // InternalDeviceParser.g:4400:2: ( ruleDeviceType )
            // InternalDeviceParser.g:4401:3: ruleDeviceType
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__DeviceAssignment"


    // $ANTLR start "rule__InterfaceNetworkProperty__ValueAssignment_5_1"
    // InternalDeviceParser.g:4410:1: rule__InterfaceNetworkProperty__ValueAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__InterfaceNetworkProperty__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4414:1: ( ( ( ruleEString ) ) )
            // InternalDeviceParser.g:4415:2: ( ( ruleEString ) )
            {
            // InternalDeviceParser.g:4415:2: ( ( ruleEString ) )
            // InternalDeviceParser.g:4416:3: ( ruleEString )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueCrossReference_5_1_0()); 
            // InternalDeviceParser.g:4417:3: ( ruleEString )
            // InternalDeviceParser.g:4418:4: ruleEString
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__ValueAssignment_5_1"


    // $ANTLR start "rule__AddressNetworkProperty__ValueAssignment_5_1"
    // InternalDeviceParser.g:4429:1: rule__AddressNetworkProperty__ValueAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__AddressNetworkProperty__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4433:1: ( ( ( ruleEString ) ) )
            // InternalDeviceParser.g:4434:2: ( ( ruleEString ) )
            {
            // InternalDeviceParser.g:4434:2: ( ( ruleEString ) )
            // InternalDeviceParser.g:4435:3: ( ruleEString )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueCrossReference_5_1_0()); 
            // InternalDeviceParser.g:4436:3: ( ruleEString )
            // InternalDeviceParser.g:4437:4: ruleEString
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__ValueAssignment_5_1"


    // $ANTLR start "rule__DeviceType_Impl__NameAssignment_4"
    // InternalDeviceParser.g:4448:1: rule__DeviceType_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__DeviceType_Impl__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4452:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4453:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4453:2: ( ruleEString )
            // InternalDeviceParser.g:4454:3: ruleEString
            {
             before(grammarAccess.getDeviceType_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeviceType_ImplAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__NameAssignment_4"


    // $ANTLR start "rule__DeviceType_Impl__CapabilityAssignment_5_2"
    // InternalDeviceParser.g:4463:1: rule__DeviceType_Impl__CapabilityAssignment_5_2 : ( ruleCapabilityProperty ) ;
    public final void rule__DeviceType_Impl__CapabilityAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4467:1: ( ( ruleCapabilityProperty ) )
            // InternalDeviceParser.g:4468:2: ( ruleCapabilityProperty )
            {
            // InternalDeviceParser.g:4468:2: ( ruleCapabilityProperty )
            // InternalDeviceParser.g:4469:3: ruleCapabilityProperty
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityCapabilityPropertyParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCapabilityProperty();

            state._fsp--;

             after(grammarAccess.getDeviceType_ImplAccess().getCapabilityCapabilityPropertyParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__CapabilityAssignment_5_2"


    // $ANTLR start "rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2"
    // InternalDeviceParser.g:4478:1: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4482:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalDeviceParser.g:4483:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalDeviceParser.g:4483:2: ( ruleAbstractCommunicationConnection )
            // InternalDeviceParser.g:4484:3: ruleAbstractCommunicationConnection
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractCommunicationConnection();

            state._fsp--;

             after(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2"


    // $ANTLR start "rule__ComputationDeviceType__NameAssignment_3"
    // InternalDeviceParser.g:4493:1: rule__ComputationDeviceType__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComputationDeviceType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4497:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4498:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4498:2: ( ruleEString )
            // InternalDeviceParser.g:4499:3: ruleEString
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__NameAssignment_3"


    // $ANTLR start "rule__ComputationDeviceType__OperatingSystemAssignment_5"
    // InternalDeviceParser.g:4508:1: rule__ComputationDeviceType__OperatingSystemAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ComputationDeviceType__OperatingSystemAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4512:1: ( ( ( ruleEString ) ) )
            // InternalDeviceParser.g:4513:2: ( ( ruleEString ) )
            {
            // InternalDeviceParser.g:4513:2: ( ( ruleEString ) )
            // InternalDeviceParser.g:4514:3: ( ruleEString )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemOpertingSystemCrossReference_5_0()); 
            // InternalDeviceParser.g:4515:3: ( ruleEString )
            // InternalDeviceParser.g:4516:4: ruleEString
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemOpertingSystemEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemOpertingSystemEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemOpertingSystemCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__OperatingSystemAssignment_5"


    // $ANTLR start "rule__ComputationDeviceType__ProcessorArchitectureAssignment_7"
    // InternalDeviceParser.g:4527:1: rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ComputationDeviceType__ProcessorArchitectureAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4531:1: ( ( ( ruleEString ) ) )
            // InternalDeviceParser.g:4532:2: ( ( ruleEString ) )
            {
            // InternalDeviceParser.g:4532:2: ( ( ruleEString ) )
            // InternalDeviceParser.g:4533:3: ( ruleEString )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureProcessorArchitectureCrossReference_7_0()); 
            // InternalDeviceParser.g:4534:3: ( ruleEString )
            // InternalDeviceParser.g:4535:4: ruleEString
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureProcessorArchitectureEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureProcessorArchitectureEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureProcessorArchitectureCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__ProcessorArchitectureAssignment_7"


    // $ANTLR start "rule__ComputationDeviceType__CapabilityAssignment_8_2"
    // InternalDeviceParser.g:4546:1: rule__ComputationDeviceType__CapabilityAssignment_8_2 : ( ruleCapabilityProperty ) ;
    public final void rule__ComputationDeviceType__CapabilityAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4550:1: ( ( ruleCapabilityProperty ) )
            // InternalDeviceParser.g:4551:2: ( ruleCapabilityProperty )
            {
            // InternalDeviceParser.g:4551:2: ( ruleCapabilityProperty )
            // InternalDeviceParser.g:4552:3: ruleCapabilityProperty
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCapabilityProperty();

            state._fsp--;

             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__CapabilityAssignment_8_2"


    // $ANTLR start "rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2"
    // InternalDeviceParser.g:4561:1: rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4565:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalDeviceParser.g:4566:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalDeviceParser.g:4566:2: ( ruleAbstractCommunicationConnection )
            // InternalDeviceParser.g:4567:3: ruleAbstractCommunicationConnection
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractCommunicationConnection();

            state._fsp--;

             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2"


    // $ANTLR start "rule__CapabilityProperty__NameAssignment_2"
    // InternalDeviceParser.g:4576:1: rule__CapabilityProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CapabilityProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4580:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4581:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4581:2: ( ruleEString )
            // InternalDeviceParser.g:4582:3: ruleEString
            {
             before(grammarAccess.getCapabilityPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCapabilityPropertyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__NameAssignment_2"


    // $ANTLR start "rule__CapabilityProperty__TypeAssignment_5"
    // InternalDeviceParser.g:4591:1: rule__CapabilityProperty__TypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__CapabilityProperty__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4595:1: ( ( ( ruleEString ) ) )
            // InternalDeviceParser.g:4596:2: ( ( ruleEString ) )
            {
            // InternalDeviceParser.g:4596:2: ( ( ruleEString ) )
            // InternalDeviceParser.g:4597:3: ( ruleEString )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeCrossReference_5_0()); 
            // InternalDeviceParser.g:4598:3: ( ruleEString )
            // InternalDeviceParser.g:4599:4: ruleEString
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__TypeAssignment_5"


    // $ANTLR start "rule__CapabilityProperty__KindAssignment_7"
    // InternalDeviceParser.g:4610:1: rule__CapabilityProperty__KindAssignment_7 : ( ruleCapabilityKind ) ;
    public final void rule__CapabilityProperty__KindAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4614:1: ( ( ruleCapabilityKind ) )
            // InternalDeviceParser.g:4615:2: ( ruleCapabilityKind )
            {
            // InternalDeviceParser.g:4615:2: ( ruleCapabilityKind )
            // InternalDeviceParser.g:4616:3: ruleCapabilityKind
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCapabilityKind();

            state._fsp--;

             after(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__KindAssignment_7"


    // $ANTLR start "rule__CapabilityProperty__ValueAssignment_8_1"
    // InternalDeviceParser.g:4625:1: rule__CapabilityProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__CapabilityProperty__ValueAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4629:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:4630:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:4630:2: ( rulePropertyValue )
            // InternalDeviceParser.g:4631:3: rulePropertyValue
            {
             before(grammarAccess.getCapabilityPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getCapabilityPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityProperty__ValueAssignment_8_1"


    // $ANTLR start "rule__ConnectionProperty__NameAssignment_3"
    // InternalDeviceParser.g:4640:1: rule__ConnectionProperty__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ConnectionProperty__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4644:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4645:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4645:2: ( ruleEString )
            // InternalDeviceParser.g:4646:3: ruleEString
            {
             before(grammarAccess.getConnectionPropertyAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionPropertyAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__NameAssignment_3"


    // $ANTLR start "rule__ConnectionProperty__ValueAssignment_4_2"
    // InternalDeviceParser.g:4655:1: rule__ConnectionProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__ConnectionProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4659:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:4660:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:4660:2: ( rulePropertyValue )
            // InternalDeviceParser.g:4661:3: rulePropertyValue
            {
             before(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__ValueAssignment_4_2"


    // $ANTLR start "rule__NetworkConnection__NameAssignment_3"
    // InternalDeviceParser.g:4670:1: rule__NetworkConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__NetworkConnection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4674:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4675:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4675:2: ( ruleEString )
            // InternalDeviceParser.g:4676:3: ruleEString
            {
             before(grammarAccess.getNetworkConnectionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__NameAssignment_3"


    // $ANTLR start "rule__NetworkConnection__TypeAssignment_6"
    // InternalDeviceParser.g:4685:1: rule__NetworkConnection__TypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__NetworkConnection__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4689:1: ( ( ( ruleEString ) ) )
            // InternalDeviceParser.g:4690:2: ( ( ruleEString ) )
            {
            // InternalDeviceParser.g:4690:2: ( ( ruleEString ) )
            // InternalDeviceParser.g:4691:3: ( ruleEString )
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeCrossReference_6_0()); 
            // InternalDeviceParser.g:4692:3: ( ruleEString )
            // InternalDeviceParser.g:4693:4: ruleEString
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__TypeAssignment_6"


    // $ANTLR start "rule__NetworkConnection__PropertiesAssignment_7_2"
    // InternalDeviceParser.g:4704:1: rule__NetworkConnection__PropertiesAssignment_7_2 : ( ruleAbstractNetworkProperty ) ;
    public final void rule__NetworkConnection__PropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4708:1: ( ( ruleAbstractNetworkProperty ) )
            // InternalDeviceParser.g:4709:2: ( ruleAbstractNetworkProperty )
            {
            // InternalDeviceParser.g:4709:2: ( ruleAbstractNetworkProperty )
            // InternalDeviceParser.g:4710:3: ruleAbstractNetworkProperty
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAbstractNetworkPropertyParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractNetworkProperty();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionAccess().getPropertiesAbstractNetworkPropertyParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__PropertiesAssignment_7_2"


    // $ANTLR start "rule__CommunicationConnection__NameAssignment_3"
    // InternalDeviceParser.g:4719:1: rule__CommunicationConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__CommunicationConnection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4723:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4724:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4724:2: ( ruleEString )
            // InternalDeviceParser.g:4725:3: ruleEString
            {
             before(grammarAccess.getCommunicationConnectionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommunicationConnectionAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__NameAssignment_3"


    // $ANTLR start "rule__CommunicationConnection__TypeAssignment_6"
    // InternalDeviceParser.g:4734:1: rule__CommunicationConnection__TypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__CommunicationConnection__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4738:1: ( ( ( ruleEString ) ) )
            // InternalDeviceParser.g:4739:2: ( ( ruleEString ) )
            {
            // InternalDeviceParser.g:4739:2: ( ( ruleEString ) )
            // InternalDeviceParser.g:4740:3: ( ruleEString )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeCrossReference_6_0()); 
            // InternalDeviceParser.g:4741:3: ( ruleEString )
            // InternalDeviceParser.g:4742:4: ruleEString
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__TypeAssignment_6"


    // $ANTLR start "rule__CommunicationConnection__PropertiesAssignment_7_2"
    // InternalDeviceParser.g:4753:1: rule__CommunicationConnection__PropertiesAssignment_7_2 : ( ruleConnectionProperty ) ;
    public final void rule__CommunicationConnection__PropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4757:1: ( ( ruleConnectionProperty ) )
            // InternalDeviceParser.g:4758:2: ( ruleConnectionProperty )
            {
            // InternalDeviceParser.g:4758:2: ( ruleConnectionProperty )
            // InternalDeviceParser.g:4759:3: ruleConnectionProperty
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesConnectionPropertyParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectionProperty();

            state._fsp--;

             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesConnectionPropertyParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationConnection__PropertiesAssignment_7_2"


    // $ANTLR start "rule__PropertyValueInt__ValueAssignment"
    // InternalDeviceParser.g:4768:1: rule__PropertyValueInt__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__PropertyValueInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4772:1: ( ( ruleInteger0 ) )
            // InternalDeviceParser.g:4773:2: ( ruleInteger0 )
            {
            // InternalDeviceParser.g:4773:2: ( ruleInteger0 )
            // InternalDeviceParser.g:4774:3: ruleInteger0
            {
             before(grammarAccess.getPropertyValueIntAccess().getValueInteger0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getPropertyValueIntAccess().getValueInteger0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueInt__ValueAssignment"


    // $ANTLR start "rule__PropertyValueDouble__ValueAssignment"
    // InternalDeviceParser.g:4783:1: rule__PropertyValueDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__PropertyValueDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4787:1: ( ( ruleDouble0 ) )
            // InternalDeviceParser.g:4788:2: ( ruleDouble0 )
            {
            // InternalDeviceParser.g:4788:2: ( ruleDouble0 )
            // InternalDeviceParser.g:4789:3: ruleDouble0
            {
             before(grammarAccess.getPropertyValueDoubleAccess().getValueDouble0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getPropertyValueDoubleAccess().getValueDouble0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueDouble__ValueAssignment"


    // $ANTLR start "rule__PropertyValueString__ValueAssignment"
    // InternalDeviceParser.g:4798:1: rule__PropertyValueString__ValueAssignment : ( ruleEString ) ;
    public final void rule__PropertyValueString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4802:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4803:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4803:2: ( ruleEString )
            // InternalDeviceParser.g:4804:3: ruleEString
            {
             before(grammarAccess.getPropertyValueStringAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyValueStringAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueString__ValueAssignment"


    // $ANTLR start "rule__LinuxOpertingSystem__NameAssignment_2"
    // InternalDeviceParser.g:4813:1: rule__LinuxOpertingSystem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LinuxOpertingSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4817:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4818:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4818:2: ( ruleEString )
            // InternalDeviceParser.g:4819:3: ruleEString
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinuxOpertingSystemAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxOpertingSystem__NameAssignment_2"

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
            return "942:1: rule__AbstractCommunicationConnection__Alternatives : ( ( ruleNetworkConnection ) | ( ruleCommunicationConnection ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000100080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000006C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000500600000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000400L});

}