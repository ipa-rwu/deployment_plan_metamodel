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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Wlan", "'Wlan'");
    		tokenNameToValue.put("Linux", "'Linux'");
    		tokenNameToValue.put("MacOS", "'MacOS'");
    		tokenNameToValue.put("Kind", "'kind:'");
    		tokenNameToValue.put("Name", "'name:'");
    		tokenNameToValue.put("Type", "'type:'");
    		tokenNameToValue.put("Value", "'value:'");
    		tokenNameToValue.put("Address", "'address'");
    		tokenNameToValue.put("Ethernet", "'Ethernet'");
    		tokenNameToValue.put("Interface", "'interface'");
    		tokenNameToValue.put("DeviceType", "'DeviceType:'");
    		tokenNameToValue.put("MaximumKind", "'MaximumKind'");
    		tokenNameToValue.put("MinimumKind", "'MinimumKind'");
    		tokenNameToValue.put("Capability", "'capability:'");
    		tokenNameToValue.put("Properties", "'properties:'");
    		tokenNameToValue.put("AttributeKind", "'AttributeKind'");
    		tokenNameToValue.put("SelectionKind", "'SelectionKind'");
    		tokenNameToValue.put("ProcessorArchitecture", "'ProcessorArchitecture'");
    		tokenNameToValue.put("ComputationDeviceType", "'ComputationDeviceType:'");
    		tokenNameToValue.put("X86ProcessorArchitecture", "'X86ProcessorArchitecture'");
    		tokenNameToValue.put("CommunicationConnection", "'communicationConnection:'");
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
    // InternalDeviceParser.g:78:1: entryRuleDeviceSet : ruleDeviceSet EOF ;
    public final void entryRuleDeviceSet() throws RecognitionException {
        try {
            // InternalDeviceParser.g:79:1: ( ruleDeviceSet EOF )
            // InternalDeviceParser.g:80:1: ruleDeviceSet EOF
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
    // InternalDeviceParser.g:87:1: ruleDeviceSet : ( ( rule__DeviceSet__DeviceAssignment )* ) ;
    public final void ruleDeviceSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:91:2: ( ( ( rule__DeviceSet__DeviceAssignment )* ) )
            // InternalDeviceParser.g:92:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            {
            // InternalDeviceParser.g:92:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            // InternalDeviceParser.g:93:3: ( rule__DeviceSet__DeviceAssignment )*
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceAssignment()); 
            // InternalDeviceParser.g:94:3: ( rule__DeviceSet__DeviceAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ComputationDeviceType||LA1_0==DeviceType) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDeviceParser.g:94:4: rule__DeviceSet__DeviceAssignment
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
    // InternalDeviceParser.g:103:1: entryRuleCapabilityKind : ruleCapabilityKind EOF ;
    public final void entryRuleCapabilityKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:104:1: ( ruleCapabilityKind EOF )
            // InternalDeviceParser.g:105:1: ruleCapabilityKind EOF
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
    // InternalDeviceParser.g:112:1: ruleCapabilityKind : ( ( rule__CapabilityKind__Alternatives ) ) ;
    public final void ruleCapabilityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:116:2: ( ( ( rule__CapabilityKind__Alternatives ) ) )
            // InternalDeviceParser.g:117:2: ( ( rule__CapabilityKind__Alternatives ) )
            {
            // InternalDeviceParser.g:117:2: ( ( rule__CapabilityKind__Alternatives ) )
            // InternalDeviceParser.g:118:3: ( rule__CapabilityKind__Alternatives )
            {
             before(grammarAccess.getCapabilityKindAccess().getAlternatives()); 
            // InternalDeviceParser.g:119:3: ( rule__CapabilityKind__Alternatives )
            // InternalDeviceParser.g:119:4: rule__CapabilityKind__Alternatives
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
    // InternalDeviceParser.g:128:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:129:1: ( ruleDeviceType EOF )
            // InternalDeviceParser.g:130:1: ruleDeviceType EOF
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
    // InternalDeviceParser.g:137:1: ruleDeviceType : ( ( rule__DeviceType__Alternatives ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:141:2: ( ( ( rule__DeviceType__Alternatives ) ) )
            // InternalDeviceParser.g:142:2: ( ( rule__DeviceType__Alternatives ) )
            {
            // InternalDeviceParser.g:142:2: ( ( rule__DeviceType__Alternatives ) )
            // InternalDeviceParser.g:143:3: ( rule__DeviceType__Alternatives )
            {
             before(grammarAccess.getDeviceTypeAccess().getAlternatives()); 
            // InternalDeviceParser.g:144:3: ( rule__DeviceType__Alternatives )
            // InternalDeviceParser.g:144:4: rule__DeviceType__Alternatives
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
    // InternalDeviceParser.g:153:1: entryRuleAbstractCommunicationConnection : ruleAbstractCommunicationConnection EOF ;
    public final void entryRuleAbstractCommunicationConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:154:1: ( ruleAbstractCommunicationConnection EOF )
            // InternalDeviceParser.g:155:1: ruleAbstractCommunicationConnection EOF
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
    // InternalDeviceParser.g:162:1: ruleAbstractCommunicationConnection : ( ( rule__AbstractCommunicationConnection__Alternatives ) ) ;
    public final void ruleAbstractCommunicationConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:166:2: ( ( ( rule__AbstractCommunicationConnection__Alternatives ) ) )
            // InternalDeviceParser.g:167:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            {
            // InternalDeviceParser.g:167:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            // InternalDeviceParser.g:168:3: ( rule__AbstractCommunicationConnection__Alternatives )
            {
             before(grammarAccess.getAbstractCommunicationConnectionAccess().getAlternatives()); 
            // InternalDeviceParser.g:169:3: ( rule__AbstractCommunicationConnection__Alternatives )
            // InternalDeviceParser.g:169:4: rule__AbstractCommunicationConnection__Alternatives
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
    // InternalDeviceParser.g:178:1: entryRuleAbstractNetworkProperty : ruleAbstractNetworkProperty EOF ;
    public final void entryRuleAbstractNetworkProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:179:1: ( ruleAbstractNetworkProperty EOF )
            // InternalDeviceParser.g:180:1: ruleAbstractNetworkProperty EOF
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
    // InternalDeviceParser.g:187:1: ruleAbstractNetworkProperty : ( ( rule__AbstractNetworkProperty__Alternatives ) ) ;
    public final void ruleAbstractNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:191:2: ( ( ( rule__AbstractNetworkProperty__Alternatives ) ) )
            // InternalDeviceParser.g:192:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            {
            // InternalDeviceParser.g:192:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            // InternalDeviceParser.g:193:3: ( rule__AbstractNetworkProperty__Alternatives )
            {
             before(grammarAccess.getAbstractNetworkPropertyAccess().getAlternatives()); 
            // InternalDeviceParser.g:194:3: ( rule__AbstractNetworkProperty__Alternatives )
            // InternalDeviceParser.g:194:4: rule__AbstractNetworkProperty__Alternatives
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
    // InternalDeviceParser.g:203:1: entryRuleInterfaceNetworkProperty : ruleInterfaceNetworkProperty EOF ;
    public final void entryRuleInterfaceNetworkProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:204:1: ( ruleInterfaceNetworkProperty EOF )
            // InternalDeviceParser.g:205:1: ruleInterfaceNetworkProperty EOF
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
    // InternalDeviceParser.g:212:1: ruleInterfaceNetworkProperty : ( ( rule__InterfaceNetworkProperty__Group__0 ) ) ;
    public final void ruleInterfaceNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:216:2: ( ( ( rule__InterfaceNetworkProperty__Group__0 ) ) )
            // InternalDeviceParser.g:217:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:217:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            // InternalDeviceParser.g:218:3: ( rule__InterfaceNetworkProperty__Group__0 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup()); 
            // InternalDeviceParser.g:219:3: ( rule__InterfaceNetworkProperty__Group__0 )
            // InternalDeviceParser.g:219:4: rule__InterfaceNetworkProperty__Group__0
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
    // InternalDeviceParser.g:228:1: entryRuleAddressNetworkProperty : ruleAddressNetworkProperty EOF ;
    public final void entryRuleAddressNetworkProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:229:1: ( ruleAddressNetworkProperty EOF )
            // InternalDeviceParser.g:230:1: ruleAddressNetworkProperty EOF
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
    // InternalDeviceParser.g:237:1: ruleAddressNetworkProperty : ( ( rule__AddressNetworkProperty__Group__0 ) ) ;
    public final void ruleAddressNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:241:2: ( ( ( rule__AddressNetworkProperty__Group__0 ) ) )
            // InternalDeviceParser.g:242:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:242:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            // InternalDeviceParser.g:243:3: ( rule__AddressNetworkProperty__Group__0 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup()); 
            // InternalDeviceParser.g:244:3: ( rule__AddressNetworkProperty__Group__0 )
            // InternalDeviceParser.g:244:4: rule__AddressNetworkProperty__Group__0
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
    // InternalDeviceParser.g:253:1: entryRuleDeviceType_Impl : ruleDeviceType_Impl EOF ;
    public final void entryRuleDeviceType_Impl() throws RecognitionException {
        try {
            // InternalDeviceParser.g:254:1: ( ruleDeviceType_Impl EOF )
            // InternalDeviceParser.g:255:1: ruleDeviceType_Impl EOF
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
    // InternalDeviceParser.g:262:1: ruleDeviceType_Impl : ( ( rule__DeviceType_Impl__Group__0 ) ) ;
    public final void ruleDeviceType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:266:2: ( ( ( rule__DeviceType_Impl__Group__0 ) ) )
            // InternalDeviceParser.g:267:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            {
            // InternalDeviceParser.g:267:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            // InternalDeviceParser.g:268:3: ( rule__DeviceType_Impl__Group__0 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup()); 
            // InternalDeviceParser.g:269:3: ( rule__DeviceType_Impl__Group__0 )
            // InternalDeviceParser.g:269:4: rule__DeviceType_Impl__Group__0
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
    // InternalDeviceParser.g:278:1: entryRuleComputationDeviceType : ruleComputationDeviceType EOF ;
    public final void entryRuleComputationDeviceType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:279:1: ( ruleComputationDeviceType EOF )
            // InternalDeviceParser.g:280:1: ruleComputationDeviceType EOF
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
    // InternalDeviceParser.g:287:1: ruleComputationDeviceType : ( ( rule__ComputationDeviceType__Group__0 ) ) ;
    public final void ruleComputationDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:291:2: ( ( ( rule__ComputationDeviceType__Group__0 ) ) )
            // InternalDeviceParser.g:292:2: ( ( rule__ComputationDeviceType__Group__0 ) )
            {
            // InternalDeviceParser.g:292:2: ( ( rule__ComputationDeviceType__Group__0 ) )
            // InternalDeviceParser.g:293:3: ( rule__ComputationDeviceType__Group__0 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup()); 
            // InternalDeviceParser.g:294:3: ( rule__ComputationDeviceType__Group__0 )
            // InternalDeviceParser.g:294:4: rule__ComputationDeviceType__Group__0
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
    // InternalDeviceParser.g:303:1: entryRuleCapabilityProperty : ruleCapabilityProperty EOF ;
    public final void entryRuleCapabilityProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:304:1: ( ruleCapabilityProperty EOF )
            // InternalDeviceParser.g:305:1: ruleCapabilityProperty EOF
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
    // InternalDeviceParser.g:312:1: ruleCapabilityProperty : ( ( rule__CapabilityProperty__Group__0 ) ) ;
    public final void ruleCapabilityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:316:2: ( ( ( rule__CapabilityProperty__Group__0 ) ) )
            // InternalDeviceParser.g:317:2: ( ( rule__CapabilityProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:317:2: ( ( rule__CapabilityProperty__Group__0 ) )
            // InternalDeviceParser.g:318:3: ( rule__CapabilityProperty__Group__0 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup()); 
            // InternalDeviceParser.g:319:3: ( rule__CapabilityProperty__Group__0 )
            // InternalDeviceParser.g:319:4: rule__CapabilityProperty__Group__0
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
    // InternalDeviceParser.g:328:1: entryRuleAttributeKind : ruleAttributeKind EOF ;
    public final void entryRuleAttributeKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:329:1: ( ruleAttributeKind EOF )
            // InternalDeviceParser.g:330:1: ruleAttributeKind EOF
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
    // InternalDeviceParser.g:337:1: ruleAttributeKind : ( ( rule__AttributeKind__Group__0 ) ) ;
    public final void ruleAttributeKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:341:2: ( ( ( rule__AttributeKind__Group__0 ) ) )
            // InternalDeviceParser.g:342:2: ( ( rule__AttributeKind__Group__0 ) )
            {
            // InternalDeviceParser.g:342:2: ( ( rule__AttributeKind__Group__0 ) )
            // InternalDeviceParser.g:343:3: ( rule__AttributeKind__Group__0 )
            {
             before(grammarAccess.getAttributeKindAccess().getGroup()); 
            // InternalDeviceParser.g:344:3: ( rule__AttributeKind__Group__0 )
            // InternalDeviceParser.g:344:4: rule__AttributeKind__Group__0
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
    // InternalDeviceParser.g:353:1: entryRuleMaximumKind : ruleMaximumKind EOF ;
    public final void entryRuleMaximumKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:354:1: ( ruleMaximumKind EOF )
            // InternalDeviceParser.g:355:1: ruleMaximumKind EOF
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
    // InternalDeviceParser.g:362:1: ruleMaximumKind : ( ( rule__MaximumKind__Group__0 ) ) ;
    public final void ruleMaximumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:366:2: ( ( ( rule__MaximumKind__Group__0 ) ) )
            // InternalDeviceParser.g:367:2: ( ( rule__MaximumKind__Group__0 ) )
            {
            // InternalDeviceParser.g:367:2: ( ( rule__MaximumKind__Group__0 ) )
            // InternalDeviceParser.g:368:3: ( rule__MaximumKind__Group__0 )
            {
             before(grammarAccess.getMaximumKindAccess().getGroup()); 
            // InternalDeviceParser.g:369:3: ( rule__MaximumKind__Group__0 )
            // InternalDeviceParser.g:369:4: rule__MaximumKind__Group__0
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
    // InternalDeviceParser.g:378:1: entryRuleMinimumKind : ruleMinimumKind EOF ;
    public final void entryRuleMinimumKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:379:1: ( ruleMinimumKind EOF )
            // InternalDeviceParser.g:380:1: ruleMinimumKind EOF
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
    // InternalDeviceParser.g:387:1: ruleMinimumKind : ( ( rule__MinimumKind__Group__0 ) ) ;
    public final void ruleMinimumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:391:2: ( ( ( rule__MinimumKind__Group__0 ) ) )
            // InternalDeviceParser.g:392:2: ( ( rule__MinimumKind__Group__0 ) )
            {
            // InternalDeviceParser.g:392:2: ( ( rule__MinimumKind__Group__0 ) )
            // InternalDeviceParser.g:393:3: ( rule__MinimumKind__Group__0 )
            {
             before(grammarAccess.getMinimumKindAccess().getGroup()); 
            // InternalDeviceParser.g:394:3: ( rule__MinimumKind__Group__0 )
            // InternalDeviceParser.g:394:4: rule__MinimumKind__Group__0
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
    // InternalDeviceParser.g:403:1: entryRuleSelectionKind : ruleSelectionKind EOF ;
    public final void entryRuleSelectionKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:404:1: ( ruleSelectionKind EOF )
            // InternalDeviceParser.g:405:1: ruleSelectionKind EOF
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
    // InternalDeviceParser.g:412:1: ruleSelectionKind : ( ( rule__SelectionKind__Group__0 ) ) ;
    public final void ruleSelectionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:416:2: ( ( ( rule__SelectionKind__Group__0 ) ) )
            // InternalDeviceParser.g:417:2: ( ( rule__SelectionKind__Group__0 ) )
            {
            // InternalDeviceParser.g:417:2: ( ( rule__SelectionKind__Group__0 ) )
            // InternalDeviceParser.g:418:3: ( rule__SelectionKind__Group__0 )
            {
             before(grammarAccess.getSelectionKindAccess().getGroup()); 
            // InternalDeviceParser.g:419:3: ( rule__SelectionKind__Group__0 )
            // InternalDeviceParser.g:419:4: rule__SelectionKind__Group__0
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
    // InternalDeviceParser.g:428:1: entryRuleConnectionProperty : ruleConnectionProperty EOF ;
    public final void entryRuleConnectionProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:429:1: ( ruleConnectionProperty EOF )
            // InternalDeviceParser.g:430:1: ruleConnectionProperty EOF
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
    // InternalDeviceParser.g:437:1: ruleConnectionProperty : ( ( rule__ConnectionProperty__Group__0 ) ) ;
    public final void ruleConnectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:441:2: ( ( ( rule__ConnectionProperty__Group__0 ) ) )
            // InternalDeviceParser.g:442:2: ( ( rule__ConnectionProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:442:2: ( ( rule__ConnectionProperty__Group__0 ) )
            // InternalDeviceParser.g:443:3: ( rule__ConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup()); 
            // InternalDeviceParser.g:444:3: ( rule__ConnectionProperty__Group__0 )
            // InternalDeviceParser.g:444:4: rule__ConnectionProperty__Group__0
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
    // InternalDeviceParser.g:453:1: entryRuleNetworkConnection : ruleNetworkConnection EOF ;
    public final void entryRuleNetworkConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:454:1: ( ruleNetworkConnection EOF )
            // InternalDeviceParser.g:455:1: ruleNetworkConnection EOF
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
    // InternalDeviceParser.g:462:1: ruleNetworkConnection : ( ( rule__NetworkConnection__Group__0 ) ) ;
    public final void ruleNetworkConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:466:2: ( ( ( rule__NetworkConnection__Group__0 ) ) )
            // InternalDeviceParser.g:467:2: ( ( rule__NetworkConnection__Group__0 ) )
            {
            // InternalDeviceParser.g:467:2: ( ( rule__NetworkConnection__Group__0 ) )
            // InternalDeviceParser.g:468:3: ( rule__NetworkConnection__Group__0 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup()); 
            // InternalDeviceParser.g:469:3: ( rule__NetworkConnection__Group__0 )
            // InternalDeviceParser.g:469:4: rule__NetworkConnection__Group__0
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
    // InternalDeviceParser.g:478:1: entryRuleCommunicationConnection : ruleCommunicationConnection EOF ;
    public final void entryRuleCommunicationConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:479:1: ( ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:480:1: ruleCommunicationConnection EOF
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
    // InternalDeviceParser.g:487:1: ruleCommunicationConnection : ( ( rule__CommunicationConnection__Group__0 ) ) ;
    public final void ruleCommunicationConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:491:2: ( ( ( rule__CommunicationConnection__Group__0 ) ) )
            // InternalDeviceParser.g:492:2: ( ( rule__CommunicationConnection__Group__0 ) )
            {
            // InternalDeviceParser.g:492:2: ( ( rule__CommunicationConnection__Group__0 ) )
            // InternalDeviceParser.g:493:3: ( rule__CommunicationConnection__Group__0 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup()); 
            // InternalDeviceParser.g:494:3: ( rule__CommunicationConnection__Group__0 )
            // InternalDeviceParser.g:494:4: rule__CommunicationConnection__Group__0
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
    // InternalDeviceParser.g:503:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalDeviceParser.g:504:1: ( rulePropertyValue EOF )
            // InternalDeviceParser.g:505:1: rulePropertyValue EOF
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
    // InternalDeviceParser.g:512:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:516:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalDeviceParser.g:517:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalDeviceParser.g:517:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalDeviceParser.g:518:3: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            // InternalDeviceParser.g:519:3: ( rule__PropertyValue__Alternatives )
            // InternalDeviceParser.g:519:4: rule__PropertyValue__Alternatives
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
    // InternalDeviceParser.g:528:1: entryRulePropertyValueInt : rulePropertyValueInt EOF ;
    public final void entryRulePropertyValueInt() throws RecognitionException {
        try {
            // InternalDeviceParser.g:529:1: ( rulePropertyValueInt EOF )
            // InternalDeviceParser.g:530:1: rulePropertyValueInt EOF
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
    // InternalDeviceParser.g:537:1: rulePropertyValueInt : ( ( rule__PropertyValueInt__ValueAssignment ) ) ;
    public final void rulePropertyValueInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:541:2: ( ( ( rule__PropertyValueInt__ValueAssignment ) ) )
            // InternalDeviceParser.g:542:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            {
            // InternalDeviceParser.g:542:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            // InternalDeviceParser.g:543:3: ( rule__PropertyValueInt__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueIntAccess().getValueAssignment()); 
            // InternalDeviceParser.g:544:3: ( rule__PropertyValueInt__ValueAssignment )
            // InternalDeviceParser.g:544:4: rule__PropertyValueInt__ValueAssignment
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
    // InternalDeviceParser.g:553:1: entryRulePropertyValueDouble : rulePropertyValueDouble EOF ;
    public final void entryRulePropertyValueDouble() throws RecognitionException {
        try {
            // InternalDeviceParser.g:554:1: ( rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:555:1: rulePropertyValueDouble EOF
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
    // InternalDeviceParser.g:562:1: rulePropertyValueDouble : ( ( rule__PropertyValueDouble__ValueAssignment ) ) ;
    public final void rulePropertyValueDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:566:2: ( ( ( rule__PropertyValueDouble__ValueAssignment ) ) )
            // InternalDeviceParser.g:567:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            {
            // InternalDeviceParser.g:567:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            // InternalDeviceParser.g:568:3: ( rule__PropertyValueDouble__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment()); 
            // InternalDeviceParser.g:569:3: ( rule__PropertyValueDouble__ValueAssignment )
            // InternalDeviceParser.g:569:4: rule__PropertyValueDouble__ValueAssignment
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
    // InternalDeviceParser.g:578:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // InternalDeviceParser.g:579:1: ( rulePropertyValueString EOF )
            // InternalDeviceParser.g:580:1: rulePropertyValueString EOF
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
    // InternalDeviceParser.g:587:1: rulePropertyValueString : ( ( rule__PropertyValueString__ValueAssignment ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:591:2: ( ( ( rule__PropertyValueString__ValueAssignment ) ) )
            // InternalDeviceParser.g:592:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            {
            // InternalDeviceParser.g:592:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            // InternalDeviceParser.g:593:3: ( rule__PropertyValueString__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueStringAccess().getValueAssignment()); 
            // InternalDeviceParser.g:594:3: ( rule__PropertyValueString__ValueAssignment )
            // InternalDeviceParser.g:594:4: rule__PropertyValueString__ValueAssignment
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


    // $ANTLR start "entryRuleProcessorArchitectureValue"
    // InternalDeviceParser.g:603:1: entryRuleProcessorArchitectureValue : ruleProcessorArchitectureValue EOF ;
    public final void entryRuleProcessorArchitectureValue() throws RecognitionException {
        try {
            // InternalDeviceParser.g:604:1: ( ruleProcessorArchitectureValue EOF )
            // InternalDeviceParser.g:605:1: ruleProcessorArchitectureValue EOF
            {
             before(grammarAccess.getProcessorArchitectureValueRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessorArchitectureValue();

            state._fsp--;

             after(grammarAccess.getProcessorArchitectureValueRule()); 
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
    // $ANTLR end "entryRuleProcessorArchitectureValue"


    // $ANTLR start "ruleProcessorArchitectureValue"
    // InternalDeviceParser.g:612:1: ruleProcessorArchitectureValue : ( ( rule__ProcessorArchitectureValue__Alternatives ) ) ;
    public final void ruleProcessorArchitectureValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:616:2: ( ( ( rule__ProcessorArchitectureValue__Alternatives ) ) )
            // InternalDeviceParser.g:617:2: ( ( rule__ProcessorArchitectureValue__Alternatives ) )
            {
            // InternalDeviceParser.g:617:2: ( ( rule__ProcessorArchitectureValue__Alternatives ) )
            // InternalDeviceParser.g:618:3: ( rule__ProcessorArchitectureValue__Alternatives )
            {
             before(grammarAccess.getProcessorArchitectureValueAccess().getAlternatives()); 
            // InternalDeviceParser.g:619:3: ( rule__ProcessorArchitectureValue__Alternatives )
            // InternalDeviceParser.g:619:4: rule__ProcessorArchitectureValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorArchitectureValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessorArchitectureValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProcessorArchitectureValue"


    // $ANTLR start "entryRuleAbstractResouceType"
    // InternalDeviceParser.g:628:1: entryRuleAbstractResouceType : ruleAbstractResouceType EOF ;
    public final void entryRuleAbstractResouceType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:629:1: ( ruleAbstractResouceType EOF )
            // InternalDeviceParser.g:630:1: ruleAbstractResouceType EOF
            {
             before(grammarAccess.getAbstractResouceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractResouceType();

            state._fsp--;

             after(grammarAccess.getAbstractResouceTypeRule()); 
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
    // $ANTLR end "entryRuleAbstractResouceType"


    // $ANTLR start "ruleAbstractResouceType"
    // InternalDeviceParser.g:637:1: ruleAbstractResouceType : ( ( rule__AbstractResouceType__Alternatives ) ) ;
    public final void ruleAbstractResouceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:641:2: ( ( ( rule__AbstractResouceType__Alternatives ) ) )
            // InternalDeviceParser.g:642:2: ( ( rule__AbstractResouceType__Alternatives ) )
            {
            // InternalDeviceParser.g:642:2: ( ( rule__AbstractResouceType__Alternatives ) )
            // InternalDeviceParser.g:643:3: ( rule__AbstractResouceType__Alternatives )
            {
             before(grammarAccess.getAbstractResouceTypeAccess().getAlternatives()); 
            // InternalDeviceParser.g:644:3: ( rule__AbstractResouceType__Alternatives )
            // InternalDeviceParser.g:644:4: rule__AbstractResouceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractResouceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractResouceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractResouceType"


    // $ANTLR start "entryRuleOpertingSystemType"
    // InternalDeviceParser.g:653:1: entryRuleOpertingSystemType : ruleOpertingSystemType EOF ;
    public final void entryRuleOpertingSystemType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:654:1: ( ruleOpertingSystemType EOF )
            // InternalDeviceParser.g:655:1: ruleOpertingSystemType EOF
            {
             before(grammarAccess.getOpertingSystemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOpertingSystemType();

            state._fsp--;

             after(grammarAccess.getOpertingSystemTypeRule()); 
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
    // $ANTLR end "entryRuleOpertingSystemType"


    // $ANTLR start "ruleOpertingSystemType"
    // InternalDeviceParser.g:662:1: ruleOpertingSystemType : ( ( rule__OpertingSystemType__Alternatives ) ) ;
    public final void ruleOpertingSystemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:666:2: ( ( ( rule__OpertingSystemType__Alternatives ) ) )
            // InternalDeviceParser.g:667:2: ( ( rule__OpertingSystemType__Alternatives ) )
            {
            // InternalDeviceParser.g:667:2: ( ( rule__OpertingSystemType__Alternatives ) )
            // InternalDeviceParser.g:668:3: ( rule__OpertingSystemType__Alternatives )
            {
             before(grammarAccess.getOpertingSystemTypeAccess().getAlternatives()); 
            // InternalDeviceParser.g:669:3: ( rule__OpertingSystemType__Alternatives )
            // InternalDeviceParser.g:669:4: rule__OpertingSystemType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpertingSystemType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpertingSystemTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOpertingSystemType"


    // $ANTLR start "entryRuleProcessorArchitectureType"
    // InternalDeviceParser.g:678:1: entryRuleProcessorArchitectureType : ruleProcessorArchitectureType EOF ;
    public final void entryRuleProcessorArchitectureType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:679:1: ( ruleProcessorArchitectureType EOF )
            // InternalDeviceParser.g:680:1: ruleProcessorArchitectureType EOF
            {
             before(grammarAccess.getProcessorArchitectureTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessorArchitectureType();

            state._fsp--;

             after(grammarAccess.getProcessorArchitectureTypeRule()); 
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
    // $ANTLR end "entryRuleProcessorArchitectureType"


    // $ANTLR start "ruleProcessorArchitectureType"
    // InternalDeviceParser.g:687:1: ruleProcessorArchitectureType : ( ( rule__ProcessorArchitectureType__Group__0 ) ) ;
    public final void ruleProcessorArchitectureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:691:2: ( ( ( rule__ProcessorArchitectureType__Group__0 ) ) )
            // InternalDeviceParser.g:692:2: ( ( rule__ProcessorArchitectureType__Group__0 ) )
            {
            // InternalDeviceParser.g:692:2: ( ( rule__ProcessorArchitectureType__Group__0 ) )
            // InternalDeviceParser.g:693:3: ( rule__ProcessorArchitectureType__Group__0 )
            {
             before(grammarAccess.getProcessorArchitectureTypeAccess().getGroup()); 
            // InternalDeviceParser.g:694:3: ( rule__ProcessorArchitectureType__Group__0 )
            // InternalDeviceParser.g:694:4: rule__ProcessorArchitectureType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorArchitectureType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessorArchitectureTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleProcessorArchitectureType"


    // $ANTLR start "entryRuleLinuxOpertingSystemType"
    // InternalDeviceParser.g:703:1: entryRuleLinuxOpertingSystemType : ruleLinuxOpertingSystemType EOF ;
    public final void entryRuleLinuxOpertingSystemType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:704:1: ( ruleLinuxOpertingSystemType EOF )
            // InternalDeviceParser.g:705:1: ruleLinuxOpertingSystemType EOF
            {
             before(grammarAccess.getLinuxOpertingSystemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLinuxOpertingSystemType();

            state._fsp--;

             after(grammarAccess.getLinuxOpertingSystemTypeRule()); 
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
    // $ANTLR end "entryRuleLinuxOpertingSystemType"


    // $ANTLR start "ruleLinuxOpertingSystemType"
    // InternalDeviceParser.g:712:1: ruleLinuxOpertingSystemType : ( ( rule__LinuxOpertingSystemType__Group__0 ) ) ;
    public final void ruleLinuxOpertingSystemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:716:2: ( ( ( rule__LinuxOpertingSystemType__Group__0 ) ) )
            // InternalDeviceParser.g:717:2: ( ( rule__LinuxOpertingSystemType__Group__0 ) )
            {
            // InternalDeviceParser.g:717:2: ( ( rule__LinuxOpertingSystemType__Group__0 ) )
            // InternalDeviceParser.g:718:3: ( rule__LinuxOpertingSystemType__Group__0 )
            {
             before(grammarAccess.getLinuxOpertingSystemTypeAccess().getGroup()); 
            // InternalDeviceParser.g:719:3: ( rule__LinuxOpertingSystemType__Group__0 )
            // InternalDeviceParser.g:719:4: rule__LinuxOpertingSystemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinuxOpertingSystemType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinuxOpertingSystemTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleLinuxOpertingSystemType"


    // $ANTLR start "entryRuleMacOSOpertingSystemType"
    // InternalDeviceParser.g:728:1: entryRuleMacOSOpertingSystemType : ruleMacOSOpertingSystemType EOF ;
    public final void entryRuleMacOSOpertingSystemType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:729:1: ( ruleMacOSOpertingSystemType EOF )
            // InternalDeviceParser.g:730:1: ruleMacOSOpertingSystemType EOF
            {
             before(grammarAccess.getMacOSOpertingSystemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMacOSOpertingSystemType();

            state._fsp--;

             after(grammarAccess.getMacOSOpertingSystemTypeRule()); 
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
    // $ANTLR end "entryRuleMacOSOpertingSystemType"


    // $ANTLR start "ruleMacOSOpertingSystemType"
    // InternalDeviceParser.g:737:1: ruleMacOSOpertingSystemType : ( ( rule__MacOSOpertingSystemType__Group__0 ) ) ;
    public final void ruleMacOSOpertingSystemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:741:2: ( ( ( rule__MacOSOpertingSystemType__Group__0 ) ) )
            // InternalDeviceParser.g:742:2: ( ( rule__MacOSOpertingSystemType__Group__0 ) )
            {
            // InternalDeviceParser.g:742:2: ( ( rule__MacOSOpertingSystemType__Group__0 ) )
            // InternalDeviceParser.g:743:3: ( rule__MacOSOpertingSystemType__Group__0 )
            {
             before(grammarAccess.getMacOSOpertingSystemTypeAccess().getGroup()); 
            // InternalDeviceParser.g:744:3: ( rule__MacOSOpertingSystemType__Group__0 )
            // InternalDeviceParser.g:744:4: rule__MacOSOpertingSystemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MacOSOpertingSystemType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMacOSOpertingSystemTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleMacOSOpertingSystemType"


    // $ANTLR start "entryRuleX86ProcessorArchitecture"
    // InternalDeviceParser.g:753:1: entryRuleX86ProcessorArchitecture : ruleX86ProcessorArchitecture EOF ;
    public final void entryRuleX86ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalDeviceParser.g:754:1: ( ruleX86ProcessorArchitecture EOF )
            // InternalDeviceParser.g:755:1: ruleX86ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:762:1: ruleX86ProcessorArchitecture : ( ( rule__X86ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleX86ProcessorArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:766:2: ( ( ( rule__X86ProcessorArchitecture__Group__0 ) ) )
            // InternalDeviceParser.g:767:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            {
            // InternalDeviceParser.g:767:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            // InternalDeviceParser.g:768:3: ( rule__X86ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getGroup()); 
            // InternalDeviceParser.g:769:3: ( rule__X86ProcessorArchitecture__Group__0 )
            // InternalDeviceParser.g:769:4: rule__X86ProcessorArchitecture__Group__0
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
    // InternalDeviceParser.g:778:1: entryRuleArm64ProcessorArchitecture : ruleArm64ProcessorArchitecture EOF ;
    public final void entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalDeviceParser.g:779:1: ( ruleArm64ProcessorArchitecture EOF )
            // InternalDeviceParser.g:780:1: ruleArm64ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:787:1: ruleArm64ProcessorArchitecture : ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleArm64ProcessorArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:791:2: ( ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) )
            // InternalDeviceParser.g:792:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            {
            // InternalDeviceParser.g:792:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            // InternalDeviceParser.g:793:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getGroup()); 
            // InternalDeviceParser.g:794:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            // InternalDeviceParser.g:794:4: rule__Arm64ProcessorArchitecture__Group__0
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
    // InternalDeviceParser.g:803:1: entryRuleCommunicationType : ruleCommunicationType EOF ;
    public final void entryRuleCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:804:1: ( ruleCommunicationType EOF )
            // InternalDeviceParser.g:805:1: ruleCommunicationType EOF
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
    // InternalDeviceParser.g:812:1: ruleCommunicationType : ( ( rule__CommunicationType__Group__0 ) ) ;
    public final void ruleCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:816:2: ( ( ( rule__CommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:817:2: ( ( rule__CommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:817:2: ( ( rule__CommunicationType__Group__0 ) )
            // InternalDeviceParser.g:818:3: ( rule__CommunicationType__Group__0 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getGroup()); 
            // InternalDeviceParser.g:819:3: ( rule__CommunicationType__Group__0 )
            // InternalDeviceParser.g:819:4: rule__CommunicationType__Group__0
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


    // $ANTLR start "entryRuleNetworkCommunicationType"
    // InternalDeviceParser.g:828:1: entryRuleNetworkCommunicationType : ruleNetworkCommunicationType EOF ;
    public final void entryRuleNetworkCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:829:1: ( ruleNetworkCommunicationType EOF )
            // InternalDeviceParser.g:830:1: ruleNetworkCommunicationType EOF
            {
             before(grammarAccess.getNetworkCommunicationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkCommunicationType();

            state._fsp--;

             after(grammarAccess.getNetworkCommunicationTypeRule()); 
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
    // $ANTLR end "entryRuleNetworkCommunicationType"


    // $ANTLR start "ruleNetworkCommunicationType"
    // InternalDeviceParser.g:837:1: ruleNetworkCommunicationType : ( ( rule__NetworkCommunicationType__Alternatives ) ) ;
    public final void ruleNetworkCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:841:2: ( ( ( rule__NetworkCommunicationType__Alternatives ) ) )
            // InternalDeviceParser.g:842:2: ( ( rule__NetworkCommunicationType__Alternatives ) )
            {
            // InternalDeviceParser.g:842:2: ( ( rule__NetworkCommunicationType__Alternatives ) )
            // InternalDeviceParser.g:843:3: ( rule__NetworkCommunicationType__Alternatives )
            {
             before(grammarAccess.getNetworkCommunicationTypeAccess().getAlternatives()); 
            // InternalDeviceParser.g:844:3: ( rule__NetworkCommunicationType__Alternatives )
            // InternalDeviceParser.g:844:4: rule__NetworkCommunicationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NetworkCommunicationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNetworkCommunicationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNetworkCommunicationType"


    // $ANTLR start "entryRuleEthernetCommunicationType"
    // InternalDeviceParser.g:853:1: entryRuleEthernetCommunicationType : ruleEthernetCommunicationType EOF ;
    public final void entryRuleEthernetCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:854:1: ( ruleEthernetCommunicationType EOF )
            // InternalDeviceParser.g:855:1: ruleEthernetCommunicationType EOF
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
    // InternalDeviceParser.g:862:1: ruleEthernetCommunicationType : ( ( rule__EthernetCommunicationType__Group__0 ) ) ;
    public final void ruleEthernetCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:866:2: ( ( ( rule__EthernetCommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:867:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:867:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            // InternalDeviceParser.g:868:3: ( rule__EthernetCommunicationType__Group__0 )
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getGroup()); 
            // InternalDeviceParser.g:869:3: ( rule__EthernetCommunicationType__Group__0 )
            // InternalDeviceParser.g:869:4: rule__EthernetCommunicationType__Group__0
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
    // InternalDeviceParser.g:878:1: entryRuleWlanCommunicationType : ruleWlanCommunicationType EOF ;
    public final void entryRuleWlanCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:879:1: ( ruleWlanCommunicationType EOF )
            // InternalDeviceParser.g:880:1: ruleWlanCommunicationType EOF
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
    // InternalDeviceParser.g:887:1: ruleWlanCommunicationType : ( ( rule__WlanCommunicationType__Group__0 ) ) ;
    public final void ruleWlanCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:891:2: ( ( ( rule__WlanCommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:892:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:892:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            // InternalDeviceParser.g:893:3: ( rule__WlanCommunicationType__Group__0 )
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getGroup()); 
            // InternalDeviceParser.g:894:3: ( rule__WlanCommunicationType__Group__0 )
            // InternalDeviceParser.g:894:4: rule__WlanCommunicationType__Group__0
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
    // InternalDeviceParser.g:903:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalDeviceParser.g:904:1: ( ruleDouble0 EOF )
            // InternalDeviceParser.g:905:1: ruleDouble0 EOF
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
    // InternalDeviceParser.g:912:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:916:2: ( ( RULE_DOUBLE ) )
            // InternalDeviceParser.g:917:2: ( RULE_DOUBLE )
            {
            // InternalDeviceParser.g:917:2: ( RULE_DOUBLE )
            // InternalDeviceParser.g:918:3: RULE_DOUBLE
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
    // InternalDeviceParser.g:928:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalDeviceParser.g:929:1: ( ruleInteger0 EOF )
            // InternalDeviceParser.g:930:1: ruleInteger0 EOF
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
    // InternalDeviceParser.g:937:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:941:2: ( ( RULE_DECINT ) )
            // InternalDeviceParser.g:942:2: ( RULE_DECINT )
            {
            // InternalDeviceParser.g:942:2: ( RULE_DECINT )
            // InternalDeviceParser.g:943:3: RULE_DECINT
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
    // InternalDeviceParser.g:953:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDeviceParser.g:954:1: ( ruleEString EOF )
            // InternalDeviceParser.g:955:1: ruleEString EOF
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
    // InternalDeviceParser.g:962:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:966:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDeviceParser.g:967:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDeviceParser.g:967:2: ( ( rule__EString__Alternatives ) )
            // InternalDeviceParser.g:968:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDeviceParser.g:969:3: ( rule__EString__Alternatives )
            // InternalDeviceParser.g:969:4: rule__EString__Alternatives
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
    // InternalDeviceParser.g:978:1: entryRulePreListElement : rulePreListElement EOF ;
    public final void entryRulePreListElement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:982:1: ( rulePreListElement EOF )
            // InternalDeviceParser.g:983:1: rulePreListElement EOF
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
    // InternalDeviceParser.g:993:1: rulePreListElement : ( HyphenMinus ) ;
    public final void rulePreListElement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:998:2: ( ( HyphenMinus ) )
            // InternalDeviceParser.g:999:2: ( HyphenMinus )
            {
            // InternalDeviceParser.g:999:2: ( HyphenMinus )
            // InternalDeviceParser.g:1000:3: HyphenMinus
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
    // InternalDeviceParser.g:1010:1: rule__CapabilityKind__Alternatives : ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) );
    public final void rule__CapabilityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1014:1: ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) )
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
                    // InternalDeviceParser.g:1015:2: ( ruleAttributeKind )
                    {
                    // InternalDeviceParser.g:1015:2: ( ruleAttributeKind )
                    // InternalDeviceParser.g:1016:3: ruleAttributeKind
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
                    // InternalDeviceParser.g:1021:2: ( ruleMaximumKind )
                    {
                    // InternalDeviceParser.g:1021:2: ( ruleMaximumKind )
                    // InternalDeviceParser.g:1022:3: ruleMaximumKind
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
                    // InternalDeviceParser.g:1027:2: ( ruleMinimumKind )
                    {
                    // InternalDeviceParser.g:1027:2: ( ruleMinimumKind )
                    // InternalDeviceParser.g:1028:3: ruleMinimumKind
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
                    // InternalDeviceParser.g:1033:2: ( ruleSelectionKind )
                    {
                    // InternalDeviceParser.g:1033:2: ( ruleSelectionKind )
                    // InternalDeviceParser.g:1034:3: ruleSelectionKind
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
    // InternalDeviceParser.g:1043:1: rule__DeviceType__Alternatives : ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) );
    public final void rule__DeviceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1047:1: ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) )
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
                    // InternalDeviceParser.g:1048:2: ( ruleDeviceType_Impl )
                    {
                    // InternalDeviceParser.g:1048:2: ( ruleDeviceType_Impl )
                    // InternalDeviceParser.g:1049:3: ruleDeviceType_Impl
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
                    // InternalDeviceParser.g:1054:2: ( ruleComputationDeviceType )
                    {
                    // InternalDeviceParser.g:1054:2: ( ruleComputationDeviceType )
                    // InternalDeviceParser.g:1055:3: ruleComputationDeviceType
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
    // InternalDeviceParser.g:1064:1: rule__AbstractCommunicationConnection__Alternatives : ( ( ruleCommunicationConnection ) | ( ruleNetworkConnection ) );
    public final void rule__AbstractCommunicationConnection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1068:1: ( ( ruleCommunicationConnection ) | ( ruleNetworkConnection ) )
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

                                if ( (LA4_6==RULE_ID||LA4_6==RULE_STRING) ) {
                                    alt4=1;
                                }
                                else if ( (LA4_6==Ethernet||LA4_6==Wlan) ) {
                                    alt4=2;
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

                                if ( (LA4_6==RULE_ID||LA4_6==RULE_STRING) ) {
                                    alt4=1;
                                }
                                else if ( (LA4_6==Ethernet||LA4_6==Wlan) ) {
                                    alt4=2;
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
                    // InternalDeviceParser.g:1069:2: ( ruleCommunicationConnection )
                    {
                    // InternalDeviceParser.g:1069:2: ( ruleCommunicationConnection )
                    // InternalDeviceParser.g:1070:3: ruleCommunicationConnection
                    {
                     before(grammarAccess.getAbstractCommunicationConnectionAccess().getCommunicationConnectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommunicationConnection();

                    state._fsp--;

                     after(grammarAccess.getAbstractCommunicationConnectionAccess().getCommunicationConnectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1075:2: ( ruleNetworkConnection )
                    {
                    // InternalDeviceParser.g:1075:2: ( ruleNetworkConnection )
                    // InternalDeviceParser.g:1076:3: ruleNetworkConnection
                    {
                     before(grammarAccess.getAbstractCommunicationConnectionAccess().getNetworkConnectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNetworkConnection();

                    state._fsp--;

                     after(grammarAccess.getAbstractCommunicationConnectionAccess().getNetworkConnectionParserRuleCall_1()); 

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
    // InternalDeviceParser.g:1085:1: rule__AbstractNetworkProperty__Alternatives : ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) );
    public final void rule__AbstractNetworkProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1089:1: ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==HyphenMinus) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==Name) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==Interface) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==Address) ) {
                        alt5=2;
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
                    // InternalDeviceParser.g:1090:2: ( ruleInterfaceNetworkProperty )
                    {
                    // InternalDeviceParser.g:1090:2: ( ruleInterfaceNetworkProperty )
                    // InternalDeviceParser.g:1091:3: ruleInterfaceNetworkProperty
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
                    // InternalDeviceParser.g:1096:2: ( ruleAddressNetworkProperty )
                    {
                    // InternalDeviceParser.g:1096:2: ( ruleAddressNetworkProperty )
                    // InternalDeviceParser.g:1097:3: ruleAddressNetworkProperty
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
    // InternalDeviceParser.g:1106:1: rule__PropertyValue__Alternatives : ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) | ( ruleProcessorArchitectureValue ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1110:1: ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) | ( ruleProcessorArchitectureValue ) )
            int alt6=4;
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
            case Arm64ProcessorArchitecture:
            case X86ProcessorArchitecture:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:1111:2: ( rulePropertyValueInt )
                    {
                    // InternalDeviceParser.g:1111:2: ( rulePropertyValueInt )
                    // InternalDeviceParser.g:1112:3: rulePropertyValueInt
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
                    // InternalDeviceParser.g:1117:2: ( rulePropertyValueDouble )
                    {
                    // InternalDeviceParser.g:1117:2: ( rulePropertyValueDouble )
                    // InternalDeviceParser.g:1118:3: rulePropertyValueDouble
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
                    // InternalDeviceParser.g:1123:2: ( rulePropertyValueString )
                    {
                    // InternalDeviceParser.g:1123:2: ( rulePropertyValueString )
                    // InternalDeviceParser.g:1124:3: rulePropertyValueString
                    {
                     before(grammarAccess.getPropertyValueAccess().getPropertyValueStringParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyValueString();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getPropertyValueStringParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceParser.g:1129:2: ( ruleProcessorArchitectureValue )
                    {
                    // InternalDeviceParser.g:1129:2: ( ruleProcessorArchitectureValue )
                    // InternalDeviceParser.g:1130:3: ruleProcessorArchitectureValue
                    {
                     before(grammarAccess.getPropertyValueAccess().getProcessorArchitectureValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleProcessorArchitectureValue();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getProcessorArchitectureValueParserRuleCall_3()); 

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


    // $ANTLR start "rule__ProcessorArchitectureValue__Alternatives"
    // InternalDeviceParser.g:1139:1: rule__ProcessorArchitectureValue__Alternatives : ( ( ruleX86ProcessorArchitecture ) | ( ruleArm64ProcessorArchitecture ) );
    public final void rule__ProcessorArchitectureValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1143:1: ( ( ruleX86ProcessorArchitecture ) | ( ruleArm64ProcessorArchitecture ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==X86ProcessorArchitecture) ) {
                alt7=1;
            }
            else if ( (LA7_0==Arm64ProcessorArchitecture) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeviceParser.g:1144:2: ( ruleX86ProcessorArchitecture )
                    {
                    // InternalDeviceParser.g:1144:2: ( ruleX86ProcessorArchitecture )
                    // InternalDeviceParser.g:1145:3: ruleX86ProcessorArchitecture
                    {
                     before(grammarAccess.getProcessorArchitectureValueAccess().getX86ProcessorArchitectureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleX86ProcessorArchitecture();

                    state._fsp--;

                     after(grammarAccess.getProcessorArchitectureValueAccess().getX86ProcessorArchitectureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1150:2: ( ruleArm64ProcessorArchitecture )
                    {
                    // InternalDeviceParser.g:1150:2: ( ruleArm64ProcessorArchitecture )
                    // InternalDeviceParser.g:1151:3: ruleArm64ProcessorArchitecture
                    {
                     before(grammarAccess.getProcessorArchitectureValueAccess().getArm64ProcessorArchitectureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArm64ProcessorArchitecture();

                    state._fsp--;

                     after(grammarAccess.getProcessorArchitectureValueAccess().getArm64ProcessorArchitectureParserRuleCall_1()); 

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
    // $ANTLR end "rule__ProcessorArchitectureValue__Alternatives"


    // $ANTLR start "rule__AbstractResouceType__Alternatives"
    // InternalDeviceParser.g:1160:1: rule__AbstractResouceType__Alternatives : ( ( ruleOpertingSystemType ) | ( ruleProcessorArchitectureType ) );
    public final void rule__AbstractResouceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1164:1: ( ( ruleOpertingSystemType ) | ( ruleProcessorArchitectureType ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=Linux && LA8_0<=MacOS)) ) {
                alt8=1;
            }
            else if ( (LA8_0==ProcessorArchitecture) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeviceParser.g:1165:2: ( ruleOpertingSystemType )
                    {
                    // InternalDeviceParser.g:1165:2: ( ruleOpertingSystemType )
                    // InternalDeviceParser.g:1166:3: ruleOpertingSystemType
                    {
                     before(grammarAccess.getAbstractResouceTypeAccess().getOpertingSystemTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOpertingSystemType();

                    state._fsp--;

                     after(grammarAccess.getAbstractResouceTypeAccess().getOpertingSystemTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1171:2: ( ruleProcessorArchitectureType )
                    {
                    // InternalDeviceParser.g:1171:2: ( ruleProcessorArchitectureType )
                    // InternalDeviceParser.g:1172:3: ruleProcessorArchitectureType
                    {
                     before(grammarAccess.getAbstractResouceTypeAccess().getProcessorArchitectureTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProcessorArchitectureType();

                    state._fsp--;

                     after(grammarAccess.getAbstractResouceTypeAccess().getProcessorArchitectureTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractResouceType__Alternatives"


    // $ANTLR start "rule__OpertingSystemType__Alternatives"
    // InternalDeviceParser.g:1181:1: rule__OpertingSystemType__Alternatives : ( ( ruleLinuxOpertingSystemType ) | ( ruleMacOSOpertingSystemType ) );
    public final void rule__OpertingSystemType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1185:1: ( ( ruleLinuxOpertingSystemType ) | ( ruleMacOSOpertingSystemType ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Linux) ) {
                alt9=1;
            }
            else if ( (LA9_0==MacOS) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeviceParser.g:1186:2: ( ruleLinuxOpertingSystemType )
                    {
                    // InternalDeviceParser.g:1186:2: ( ruleLinuxOpertingSystemType )
                    // InternalDeviceParser.g:1187:3: ruleLinuxOpertingSystemType
                    {
                     before(grammarAccess.getOpertingSystemTypeAccess().getLinuxOpertingSystemTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLinuxOpertingSystemType();

                    state._fsp--;

                     after(grammarAccess.getOpertingSystemTypeAccess().getLinuxOpertingSystemTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1192:2: ( ruleMacOSOpertingSystemType )
                    {
                    // InternalDeviceParser.g:1192:2: ( ruleMacOSOpertingSystemType )
                    // InternalDeviceParser.g:1193:3: ruleMacOSOpertingSystemType
                    {
                     before(grammarAccess.getOpertingSystemTypeAccess().getMacOSOpertingSystemTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMacOSOpertingSystemType();

                    state._fsp--;

                     after(grammarAccess.getOpertingSystemTypeAccess().getMacOSOpertingSystemTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__OpertingSystemType__Alternatives"


    // $ANTLR start "rule__NetworkCommunicationType__Alternatives"
    // InternalDeviceParser.g:1202:1: rule__NetworkCommunicationType__Alternatives : ( ( ruleEthernetCommunicationType ) | ( ruleWlanCommunicationType ) );
    public final void rule__NetworkCommunicationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1206:1: ( ( ruleEthernetCommunicationType ) | ( ruleWlanCommunicationType ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Ethernet) ) {
                alt10=1;
            }
            else if ( (LA10_0==Wlan) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceParser.g:1207:2: ( ruleEthernetCommunicationType )
                    {
                    // InternalDeviceParser.g:1207:2: ( ruleEthernetCommunicationType )
                    // InternalDeviceParser.g:1208:3: ruleEthernetCommunicationType
                    {
                     before(grammarAccess.getNetworkCommunicationTypeAccess().getEthernetCommunicationTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEthernetCommunicationType();

                    state._fsp--;

                     after(grammarAccess.getNetworkCommunicationTypeAccess().getEthernetCommunicationTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1213:2: ( ruleWlanCommunicationType )
                    {
                    // InternalDeviceParser.g:1213:2: ( ruleWlanCommunicationType )
                    // InternalDeviceParser.g:1214:3: ruleWlanCommunicationType
                    {
                     before(grammarAccess.getNetworkCommunicationTypeAccess().getWlanCommunicationTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWlanCommunicationType();

                    state._fsp--;

                     after(grammarAccess.getNetworkCommunicationTypeAccess().getWlanCommunicationTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__NetworkCommunicationType__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDeviceParser.g:1223:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1227:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeviceParser.g:1228:2: ( RULE_STRING )
                    {
                    // InternalDeviceParser.g:1228:2: ( RULE_STRING )
                    // InternalDeviceParser.g:1229:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1234:2: ( RULE_ID )
                    {
                    // InternalDeviceParser.g:1234:2: ( RULE_ID )
                    // InternalDeviceParser.g:1235:3: RULE_ID
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
    // InternalDeviceParser.g:1244:1: rule__InterfaceNetworkProperty__Group__0 : rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 ;
    public final void rule__InterfaceNetworkProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1248:1: ( rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 )
            // InternalDeviceParser.g:1249:2: rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1
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
    // InternalDeviceParser.g:1256:1: rule__InterfaceNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__InterfaceNetworkProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1260:1: ( ( () ) )
            // InternalDeviceParser.g:1261:1: ( () )
            {
            // InternalDeviceParser.g:1261:1: ( () )
            // InternalDeviceParser.g:1262:2: ()
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0()); 
            // InternalDeviceParser.g:1263:2: ()
            // InternalDeviceParser.g:1263:3: 
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
    // InternalDeviceParser.g:1271:1: rule__InterfaceNetworkProperty__Group__1 : rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 ;
    public final void rule__InterfaceNetworkProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1275:1: ( rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 )
            // InternalDeviceParser.g:1276:2: rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2
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
    // InternalDeviceParser.g:1283:1: rule__InterfaceNetworkProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__InterfaceNetworkProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1287:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:1288:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:1288:1: ( rulePreListElement )
            // InternalDeviceParser.g:1289:2: rulePreListElement
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getPreListElementParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getPreListElementParserRuleCall_1()); 

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
    // InternalDeviceParser.g:1298:1: rule__InterfaceNetworkProperty__Group__2 : rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 ;
    public final void rule__InterfaceNetworkProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1302:1: ( rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 )
            // InternalDeviceParser.g:1303:2: rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3
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
    // InternalDeviceParser.g:1310:1: rule__InterfaceNetworkProperty__Group__2__Impl : ( Name ) ;
    public final void rule__InterfaceNetworkProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1314:1: ( ( Name ) )
            // InternalDeviceParser.g:1315:1: ( Name )
            {
            // InternalDeviceParser.g:1315:1: ( Name )
            // InternalDeviceParser.g:1316:2: Name
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getNameKeyword_2()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getNameKeyword_2()); 

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
    // InternalDeviceParser.g:1325:1: rule__InterfaceNetworkProperty__Group__3 : rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 ;
    public final void rule__InterfaceNetworkProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1329:1: ( rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 )
            // InternalDeviceParser.g:1330:2: rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4
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
    // InternalDeviceParser.g:1337:1: rule__InterfaceNetworkProperty__Group__3__Impl : ( Interface ) ;
    public final void rule__InterfaceNetworkProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1341:1: ( ( Interface ) )
            // InternalDeviceParser.g:1342:1: ( Interface )
            {
            // InternalDeviceParser.g:1342:1: ( Interface )
            // InternalDeviceParser.g:1343:2: Interface
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceKeyword_3()); 
            match(input,Interface,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceKeyword_3()); 

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
    // InternalDeviceParser.g:1352:1: rule__InterfaceNetworkProperty__Group__4 : rule__InterfaceNetworkProperty__Group__4__Impl ;
    public final void rule__InterfaceNetworkProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1356:1: ( rule__InterfaceNetworkProperty__Group__4__Impl )
            // InternalDeviceParser.g:1357:2: rule__InterfaceNetworkProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__4__Impl();

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
    // InternalDeviceParser.g:1363:1: rule__InterfaceNetworkProperty__Group__4__Impl : ( ( rule__InterfaceNetworkProperty__Group_4__0 )? ) ;
    public final void rule__InterfaceNetworkProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1367:1: ( ( ( rule__InterfaceNetworkProperty__Group_4__0 )? ) )
            // InternalDeviceParser.g:1368:1: ( ( rule__InterfaceNetworkProperty__Group_4__0 )? )
            {
            // InternalDeviceParser.g:1368:1: ( ( rule__InterfaceNetworkProperty__Group_4__0 )? )
            // InternalDeviceParser.g:1369:2: ( rule__InterfaceNetworkProperty__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_4()); 
            // InternalDeviceParser.g:1370:2: ( rule__InterfaceNetworkProperty__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INDENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceParser.g:1370:3: rule__InterfaceNetworkProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceNetworkProperty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_4()); 

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


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_4__0"
    // InternalDeviceParser.g:1379:1: rule__InterfaceNetworkProperty__Group_4__0 : rule__InterfaceNetworkProperty__Group_4__0__Impl rule__InterfaceNetworkProperty__Group_4__1 ;
    public final void rule__InterfaceNetworkProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1383:1: ( rule__InterfaceNetworkProperty__Group_4__0__Impl rule__InterfaceNetworkProperty__Group_4__1 )
            // InternalDeviceParser.g:1384:2: rule__InterfaceNetworkProperty__Group_4__0__Impl rule__InterfaceNetworkProperty__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__InterfaceNetworkProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_4__1();

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
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_4__0"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_4__0__Impl"
    // InternalDeviceParser.g:1391:1: rule__InterfaceNetworkProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1395:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1396:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1396:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1397:2: RULE_INDENT
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4_0()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_4__0__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_4__1"
    // InternalDeviceParser.g:1406:1: rule__InterfaceNetworkProperty__Group_4__1 : rule__InterfaceNetworkProperty__Group_4__1__Impl rule__InterfaceNetworkProperty__Group_4__2 ;
    public final void rule__InterfaceNetworkProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1410:1: ( rule__InterfaceNetworkProperty__Group_4__1__Impl rule__InterfaceNetworkProperty__Group_4__2 )
            // InternalDeviceParser.g:1411:2: rule__InterfaceNetworkProperty__Group_4__1__Impl rule__InterfaceNetworkProperty__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__InterfaceNetworkProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_4__2();

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
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_4__1"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_4__1__Impl"
    // InternalDeviceParser.g:1418:1: rule__InterfaceNetworkProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__InterfaceNetworkProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1422:1: ( ( Value ) )
            // InternalDeviceParser.g:1423:1: ( Value )
            {
            // InternalDeviceParser.g:1423:1: ( Value )
            // InternalDeviceParser.g:1424:2: Value
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_4_1()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_4_1()); 

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
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_4__1__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_4__2"
    // InternalDeviceParser.g:1433:1: rule__InterfaceNetworkProperty__Group_4__2 : rule__InterfaceNetworkProperty__Group_4__2__Impl rule__InterfaceNetworkProperty__Group_4__3 ;
    public final void rule__InterfaceNetworkProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1437:1: ( rule__InterfaceNetworkProperty__Group_4__2__Impl rule__InterfaceNetworkProperty__Group_4__3 )
            // InternalDeviceParser.g:1438:2: rule__InterfaceNetworkProperty__Group_4__2__Impl rule__InterfaceNetworkProperty__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__InterfaceNetworkProperty__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_4__3();

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
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_4__2"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_4__2__Impl"
    // InternalDeviceParser.g:1445:1: rule__InterfaceNetworkProperty__Group_4__2__Impl : ( ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__InterfaceNetworkProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1449:1: ( ( ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 ) ) )
            // InternalDeviceParser.g:1450:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 ) )
            {
            // InternalDeviceParser.g:1450:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 ) )
            // InternalDeviceParser.g:1451:2: ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValueAssignment_4_2()); 
            // InternalDeviceParser.g:1452:2: ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 )
            // InternalDeviceParser.g:1452:3: rule__InterfaceNetworkProperty__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValueAssignment_4_2()); 

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
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_4__2__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_4__3"
    // InternalDeviceParser.g:1460:1: rule__InterfaceNetworkProperty__Group_4__3 : rule__InterfaceNetworkProperty__Group_4__3__Impl ;
    public final void rule__InterfaceNetworkProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1464:1: ( rule__InterfaceNetworkProperty__Group_4__3__Impl )
            // InternalDeviceParser.g:1465:2: rule__InterfaceNetworkProperty__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_4__3__Impl();

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
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_4__3"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_4__3__Impl"
    // InternalDeviceParser.g:1471:1: rule__InterfaceNetworkProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1475:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1476:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1476:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1477:2: RULE_DEDENT
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_4_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_4_3()); 

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
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_4__3__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__0"
    // InternalDeviceParser.g:1487:1: rule__AddressNetworkProperty__Group__0 : rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 ;
    public final void rule__AddressNetworkProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1491:1: ( rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 )
            // InternalDeviceParser.g:1492:2: rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1
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
    // InternalDeviceParser.g:1499:1: rule__AddressNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__AddressNetworkProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1503:1: ( ( () ) )
            // InternalDeviceParser.g:1504:1: ( () )
            {
            // InternalDeviceParser.g:1504:1: ( () )
            // InternalDeviceParser.g:1505:2: ()
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0()); 
            // InternalDeviceParser.g:1506:2: ()
            // InternalDeviceParser.g:1506:3: 
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
    // InternalDeviceParser.g:1514:1: rule__AddressNetworkProperty__Group__1 : rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 ;
    public final void rule__AddressNetworkProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1518:1: ( rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 )
            // InternalDeviceParser.g:1519:2: rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2
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
    // InternalDeviceParser.g:1526:1: rule__AddressNetworkProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__AddressNetworkProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1530:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:1531:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:1531:1: ( rulePreListElement )
            // InternalDeviceParser.g:1532:2: rulePreListElement
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getPreListElementParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getAddressNetworkPropertyAccess().getPreListElementParserRuleCall_1()); 

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
    // InternalDeviceParser.g:1541:1: rule__AddressNetworkProperty__Group__2 : rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 ;
    public final void rule__AddressNetworkProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1545:1: ( rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 )
            // InternalDeviceParser.g:1546:2: rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalDeviceParser.g:1553:1: rule__AddressNetworkProperty__Group__2__Impl : ( Name ) ;
    public final void rule__AddressNetworkProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1557:1: ( ( Name ) )
            // InternalDeviceParser.g:1558:1: ( Name )
            {
            // InternalDeviceParser.g:1558:1: ( Name )
            // InternalDeviceParser.g:1559:2: Name
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getNameKeyword_2()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getNameKeyword_2()); 

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
    // InternalDeviceParser.g:1568:1: rule__AddressNetworkProperty__Group__3 : rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 ;
    public final void rule__AddressNetworkProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1572:1: ( rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 )
            // InternalDeviceParser.g:1573:2: rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:1580:1: rule__AddressNetworkProperty__Group__3__Impl : ( Address ) ;
    public final void rule__AddressNetworkProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1584:1: ( ( Address ) )
            // InternalDeviceParser.g:1585:1: ( Address )
            {
            // InternalDeviceParser.g:1585:1: ( Address )
            // InternalDeviceParser.g:1586:2: Address
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getAddressKeyword_3()); 
            match(input,Address,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getAddressKeyword_3()); 

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
    // InternalDeviceParser.g:1595:1: rule__AddressNetworkProperty__Group__4 : rule__AddressNetworkProperty__Group__4__Impl ;
    public final void rule__AddressNetworkProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1599:1: ( rule__AddressNetworkProperty__Group__4__Impl )
            // InternalDeviceParser.g:1600:2: rule__AddressNetworkProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__4__Impl();

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
    // InternalDeviceParser.g:1606:1: rule__AddressNetworkProperty__Group__4__Impl : ( ( rule__AddressNetworkProperty__Group_4__0 )? ) ;
    public final void rule__AddressNetworkProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1610:1: ( ( ( rule__AddressNetworkProperty__Group_4__0 )? ) )
            // InternalDeviceParser.g:1611:1: ( ( rule__AddressNetworkProperty__Group_4__0 )? )
            {
            // InternalDeviceParser.g:1611:1: ( ( rule__AddressNetworkProperty__Group_4__0 )? )
            // InternalDeviceParser.g:1612:2: ( rule__AddressNetworkProperty__Group_4__0 )?
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup_4()); 
            // InternalDeviceParser.g:1613:2: ( rule__AddressNetworkProperty__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INDENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceParser.g:1613:3: rule__AddressNetworkProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddressNetworkProperty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getGroup_4()); 

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


    // $ANTLR start "rule__AddressNetworkProperty__Group_4__0"
    // InternalDeviceParser.g:1622:1: rule__AddressNetworkProperty__Group_4__0 : rule__AddressNetworkProperty__Group_4__0__Impl rule__AddressNetworkProperty__Group_4__1 ;
    public final void rule__AddressNetworkProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1626:1: ( rule__AddressNetworkProperty__Group_4__0__Impl rule__AddressNetworkProperty__Group_4__1 )
            // InternalDeviceParser.g:1627:2: rule__AddressNetworkProperty__Group_4__0__Impl rule__AddressNetworkProperty__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__AddressNetworkProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_4__1();

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
    // $ANTLR end "rule__AddressNetworkProperty__Group_4__0"


    // $ANTLR start "rule__AddressNetworkProperty__Group_4__0__Impl"
    // InternalDeviceParser.g:1634:1: rule__AddressNetworkProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__AddressNetworkProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1638:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1639:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1639:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1640:2: RULE_INDENT
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4_0()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__AddressNetworkProperty__Group_4__0__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group_4__1"
    // InternalDeviceParser.g:1649:1: rule__AddressNetworkProperty__Group_4__1 : rule__AddressNetworkProperty__Group_4__1__Impl rule__AddressNetworkProperty__Group_4__2 ;
    public final void rule__AddressNetworkProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1653:1: ( rule__AddressNetworkProperty__Group_4__1__Impl rule__AddressNetworkProperty__Group_4__2 )
            // InternalDeviceParser.g:1654:2: rule__AddressNetworkProperty__Group_4__1__Impl rule__AddressNetworkProperty__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__AddressNetworkProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_4__2();

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
    // $ANTLR end "rule__AddressNetworkProperty__Group_4__1"


    // $ANTLR start "rule__AddressNetworkProperty__Group_4__1__Impl"
    // InternalDeviceParser.g:1661:1: rule__AddressNetworkProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__AddressNetworkProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1665:1: ( ( Value ) )
            // InternalDeviceParser.g:1666:1: ( Value )
            {
            // InternalDeviceParser.g:1666:1: ( Value )
            // InternalDeviceParser.g:1667:2: Value
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_4_1()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_4_1()); 

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
    // $ANTLR end "rule__AddressNetworkProperty__Group_4__1__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group_4__2"
    // InternalDeviceParser.g:1676:1: rule__AddressNetworkProperty__Group_4__2 : rule__AddressNetworkProperty__Group_4__2__Impl rule__AddressNetworkProperty__Group_4__3 ;
    public final void rule__AddressNetworkProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1680:1: ( rule__AddressNetworkProperty__Group_4__2__Impl rule__AddressNetworkProperty__Group_4__3 )
            // InternalDeviceParser.g:1681:2: rule__AddressNetworkProperty__Group_4__2__Impl rule__AddressNetworkProperty__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__AddressNetworkProperty__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_4__3();

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
    // $ANTLR end "rule__AddressNetworkProperty__Group_4__2"


    // $ANTLR start "rule__AddressNetworkProperty__Group_4__2__Impl"
    // InternalDeviceParser.g:1688:1: rule__AddressNetworkProperty__Group_4__2__Impl : ( ( rule__AddressNetworkProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__AddressNetworkProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1692:1: ( ( ( rule__AddressNetworkProperty__ValueAssignment_4_2 ) ) )
            // InternalDeviceParser.g:1693:1: ( ( rule__AddressNetworkProperty__ValueAssignment_4_2 ) )
            {
            // InternalDeviceParser.g:1693:1: ( ( rule__AddressNetworkProperty__ValueAssignment_4_2 ) )
            // InternalDeviceParser.g:1694:2: ( rule__AddressNetworkProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValueAssignment_4_2()); 
            // InternalDeviceParser.g:1695:2: ( rule__AddressNetworkProperty__ValueAssignment_4_2 )
            // InternalDeviceParser.g:1695:3: rule__AddressNetworkProperty__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getValueAssignment_4_2()); 

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
    // $ANTLR end "rule__AddressNetworkProperty__Group_4__2__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group_4__3"
    // InternalDeviceParser.g:1703:1: rule__AddressNetworkProperty__Group_4__3 : rule__AddressNetworkProperty__Group_4__3__Impl ;
    public final void rule__AddressNetworkProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1707:1: ( rule__AddressNetworkProperty__Group_4__3__Impl )
            // InternalDeviceParser.g:1708:2: rule__AddressNetworkProperty__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_4__3__Impl();

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
    // $ANTLR end "rule__AddressNetworkProperty__Group_4__3"


    // $ANTLR start "rule__AddressNetworkProperty__Group_4__3__Impl"
    // InternalDeviceParser.g:1714:1: rule__AddressNetworkProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__AddressNetworkProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1718:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1719:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1719:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1720:2: RULE_DEDENT
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_4_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_4_3()); 

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
    // $ANTLR end "rule__AddressNetworkProperty__Group_4__3__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__0"
    // InternalDeviceParser.g:1730:1: rule__DeviceType_Impl__Group__0 : rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 ;
    public final void rule__DeviceType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1734:1: ( rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 )
            // InternalDeviceParser.g:1735:2: rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDeviceParser.g:1742:1: rule__DeviceType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__DeviceType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1746:1: ( ( () ) )
            // InternalDeviceParser.g:1747:1: ( () )
            {
            // InternalDeviceParser.g:1747:1: ( () )
            // InternalDeviceParser.g:1748:2: ()
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0()); 
            // InternalDeviceParser.g:1749:2: ()
            // InternalDeviceParser.g:1749:3: 
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
    // InternalDeviceParser.g:1757:1: rule__DeviceType_Impl__Group__1 : rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 ;
    public final void rule__DeviceType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1761:1: ( rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 )
            // InternalDeviceParser.g:1762:2: rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:1769:1: rule__DeviceType_Impl__Group__1__Impl : ( DeviceType ) ;
    public final void rule__DeviceType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1773:1: ( ( DeviceType ) )
            // InternalDeviceParser.g:1774:1: ( DeviceType )
            {
            // InternalDeviceParser.g:1774:1: ( DeviceType )
            // InternalDeviceParser.g:1775:2: DeviceType
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
    // InternalDeviceParser.g:1784:1: rule__DeviceType_Impl__Group__2 : rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 ;
    public final void rule__DeviceType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1788:1: ( rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 )
            // InternalDeviceParser.g:1789:2: rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeviceParser.g:1796:1: rule__DeviceType_Impl__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1800:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1801:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1801:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1802:2: RULE_INDENT
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
    // InternalDeviceParser.g:1811:1: rule__DeviceType_Impl__Group__3 : rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 ;
    public final void rule__DeviceType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1815:1: ( rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 )
            // InternalDeviceParser.g:1816:2: rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeviceParser.g:1823:1: rule__DeviceType_Impl__Group__3__Impl : ( Name ) ;
    public final void rule__DeviceType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1827:1: ( ( Name ) )
            // InternalDeviceParser.g:1828:1: ( Name )
            {
            // InternalDeviceParser.g:1828:1: ( Name )
            // InternalDeviceParser.g:1829:2: Name
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
    // InternalDeviceParser.g:1838:1: rule__DeviceType_Impl__Group__4 : rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 ;
    public final void rule__DeviceType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1842:1: ( rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 )
            // InternalDeviceParser.g:1843:2: rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1850:1: rule__DeviceType_Impl__Group__4__Impl : ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) ;
    public final void rule__DeviceType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1854:1: ( ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) )
            // InternalDeviceParser.g:1855:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            {
            // InternalDeviceParser.g:1855:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            // InternalDeviceParser.g:1856:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getNameAssignment_4()); 
            // InternalDeviceParser.g:1857:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            // InternalDeviceParser.g:1857:3: rule__DeviceType_Impl__NameAssignment_4
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
    // InternalDeviceParser.g:1865:1: rule__DeviceType_Impl__Group__5 : rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 ;
    public final void rule__DeviceType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1869:1: ( rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 )
            // InternalDeviceParser.g:1870:2: rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1877:1: rule__DeviceType_Impl__Group__5__Impl : ( ( rule__DeviceType_Impl__Group_5__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1881:1: ( ( ( rule__DeviceType_Impl__Group_5__0 )? ) )
            // InternalDeviceParser.g:1882:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            {
            // InternalDeviceParser.g:1882:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            // InternalDeviceParser.g:1883:2: ( rule__DeviceType_Impl__Group_5__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_5()); 
            // InternalDeviceParser.g:1884:2: ( rule__DeviceType_Impl__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Capability) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceParser.g:1884:3: rule__DeviceType_Impl__Group_5__0
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
    // InternalDeviceParser.g:1892:1: rule__DeviceType_Impl__Group__6 : rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 ;
    public final void rule__DeviceType_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1896:1: ( rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 )
            // InternalDeviceParser.g:1897:2: rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1904:1: rule__DeviceType_Impl__Group__6__Impl : ( ( rule__DeviceType_Impl__Group_6__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1908:1: ( ( ( rule__DeviceType_Impl__Group_6__0 )? ) )
            // InternalDeviceParser.g:1909:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            {
            // InternalDeviceParser.g:1909:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            // InternalDeviceParser.g:1910:2: ( rule__DeviceType_Impl__Group_6__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_6()); 
            // InternalDeviceParser.g:1911:2: ( rule__DeviceType_Impl__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CommunicationConnection) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeviceParser.g:1911:3: rule__DeviceType_Impl__Group_6__0
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
    // InternalDeviceParser.g:1919:1: rule__DeviceType_Impl__Group__7 : rule__DeviceType_Impl__Group__7__Impl ;
    public final void rule__DeviceType_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1923:1: ( rule__DeviceType_Impl__Group__7__Impl )
            // InternalDeviceParser.g:1924:2: rule__DeviceType_Impl__Group__7__Impl
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
    // InternalDeviceParser.g:1930:1: rule__DeviceType_Impl__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1934:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1935:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1935:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1936:2: RULE_DEDENT
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
    // InternalDeviceParser.g:1946:1: rule__DeviceType_Impl__Group_5__0 : rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 ;
    public final void rule__DeviceType_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1950:1: ( rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 )
            // InternalDeviceParser.g:1951:2: rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:1958:1: rule__DeviceType_Impl__Group_5__0__Impl : ( Capability ) ;
    public final void rule__DeviceType_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1962:1: ( ( Capability ) )
            // InternalDeviceParser.g:1963:1: ( Capability )
            {
            // InternalDeviceParser.g:1963:1: ( Capability )
            // InternalDeviceParser.g:1964:2: Capability
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
    // InternalDeviceParser.g:1973:1: rule__DeviceType_Impl__Group_5__1 : rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 ;
    public final void rule__DeviceType_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1977:1: ( rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 )
            // InternalDeviceParser.g:1978:2: rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeviceParser.g:1985:1: rule__DeviceType_Impl__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:1989:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1990:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1990:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1991:2: RULE_INDENT
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
    // InternalDeviceParser.g:2000:1: rule__DeviceType_Impl__Group_5__2 : rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 ;
    public final void rule__DeviceType_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2004:1: ( rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 )
            // InternalDeviceParser.g:2005:2: rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDeviceParser.g:2012:1: rule__DeviceType_Impl__Group_5__2__Impl : ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2016:1: ( ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) ) )
            // InternalDeviceParser.g:2017:1: ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) )
            {
            // InternalDeviceParser.g:2017:1: ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) )
            // InternalDeviceParser.g:2018:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* )
            {
            // InternalDeviceParser.g:2018:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) )
            // InternalDeviceParser.g:2019:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 
            // InternalDeviceParser.g:2020:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )
            // InternalDeviceParser.g:2020:4: rule__DeviceType_Impl__CapabilityAssignment_5_2
            {
            pushFollow(FOLLOW_15);
            rule__DeviceType_Impl__CapabilityAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 

            }

            // InternalDeviceParser.g:2023:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* )
            // InternalDeviceParser.g:2024:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 
            // InternalDeviceParser.g:2025:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==HyphenMinus) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDeviceParser.g:2025:4: rule__DeviceType_Impl__CapabilityAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DeviceType_Impl__CapabilityAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDeviceParser.g:2034:1: rule__DeviceType_Impl__Group_5__3 : rule__DeviceType_Impl__Group_5__3__Impl ;
    public final void rule__DeviceType_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2038:1: ( rule__DeviceType_Impl__Group_5__3__Impl )
            // InternalDeviceParser.g:2039:2: rule__DeviceType_Impl__Group_5__3__Impl
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
    // InternalDeviceParser.g:2045:1: rule__DeviceType_Impl__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2049:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2050:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2050:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2051:2: RULE_DEDENT
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
    // InternalDeviceParser.g:2061:1: rule__DeviceType_Impl__Group_6__0 : rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 ;
    public final void rule__DeviceType_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2065:1: ( rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 )
            // InternalDeviceParser.g:2066:2: rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:2073:1: rule__DeviceType_Impl__Group_6__0__Impl : ( CommunicationConnection ) ;
    public final void rule__DeviceType_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2077:1: ( ( CommunicationConnection ) )
            // InternalDeviceParser.g:2078:1: ( CommunicationConnection )
            {
            // InternalDeviceParser.g:2078:1: ( CommunicationConnection )
            // InternalDeviceParser.g:2079:2: CommunicationConnection
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
    // InternalDeviceParser.g:2088:1: rule__DeviceType_Impl__Group_6__1 : rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 ;
    public final void rule__DeviceType_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2092:1: ( rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 )
            // InternalDeviceParser.g:2093:2: rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeviceParser.g:2100:1: rule__DeviceType_Impl__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2104:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2105:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2105:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2106:2: RULE_INDENT
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
    // InternalDeviceParser.g:2115:1: rule__DeviceType_Impl__Group_6__2 : rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 ;
    public final void rule__DeviceType_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2119:1: ( rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 )
            // InternalDeviceParser.g:2120:2: rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDeviceParser.g:2127:1: rule__DeviceType_Impl__Group_6__2__Impl : ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2131:1: ( ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) )
            // InternalDeviceParser.g:2132:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            {
            // InternalDeviceParser.g:2132:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            // InternalDeviceParser.g:2133:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            {
            // InternalDeviceParser.g:2133:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) )
            // InternalDeviceParser.g:2134:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalDeviceParser.g:2135:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            // InternalDeviceParser.g:2135:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_15);
            rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 

            }

            // InternalDeviceParser.g:2138:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            // InternalDeviceParser.g:2139:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalDeviceParser.g:2140:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==HyphenMinus) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDeviceParser.g:2140:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDeviceParser.g:2149:1: rule__DeviceType_Impl__Group_6__3 : rule__DeviceType_Impl__Group_6__3__Impl ;
    public final void rule__DeviceType_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2153:1: ( rule__DeviceType_Impl__Group_6__3__Impl )
            // InternalDeviceParser.g:2154:2: rule__DeviceType_Impl__Group_6__3__Impl
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
    // InternalDeviceParser.g:2160:1: rule__DeviceType_Impl__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2164:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2165:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2165:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2166:2: RULE_DEDENT
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
    // InternalDeviceParser.g:2176:1: rule__ComputationDeviceType__Group__0 : rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 ;
    public final void rule__ComputationDeviceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2180:1: ( rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 )
            // InternalDeviceParser.g:2181:2: rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:2188:1: rule__ComputationDeviceType__Group__0__Impl : ( ComputationDeviceType ) ;
    public final void rule__ComputationDeviceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2192:1: ( ( ComputationDeviceType ) )
            // InternalDeviceParser.g:2193:1: ( ComputationDeviceType )
            {
            // InternalDeviceParser.g:2193:1: ( ComputationDeviceType )
            // InternalDeviceParser.g:2194:2: ComputationDeviceType
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
    // InternalDeviceParser.g:2203:1: rule__ComputationDeviceType__Group__1 : rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 ;
    public final void rule__ComputationDeviceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2207:1: ( rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 )
            // InternalDeviceParser.g:2208:2: rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeviceParser.g:2215:1: rule__ComputationDeviceType__Group__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2219:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2220:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2220:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2221:2: RULE_INDENT
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
    // InternalDeviceParser.g:2230:1: rule__ComputationDeviceType__Group__2 : rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 ;
    public final void rule__ComputationDeviceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2234:1: ( rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 )
            // InternalDeviceParser.g:2235:2: rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeviceParser.g:2242:1: rule__ComputationDeviceType__Group__2__Impl : ( Name ) ;
    public final void rule__ComputationDeviceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2246:1: ( ( Name ) )
            // InternalDeviceParser.g:2247:1: ( Name )
            {
            // InternalDeviceParser.g:2247:1: ( Name )
            // InternalDeviceParser.g:2248:2: Name
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
    // InternalDeviceParser.g:2257:1: rule__ComputationDeviceType__Group__3 : rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 ;
    public final void rule__ComputationDeviceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2261:1: ( rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 )
            // InternalDeviceParser.g:2262:2: rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:2269:1: rule__ComputationDeviceType__Group__3__Impl : ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) ;
    public final void rule__ComputationDeviceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2273:1: ( ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:2274:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:2274:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            // InternalDeviceParser.g:2275:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getNameAssignment_3()); 
            // InternalDeviceParser.g:2276:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            // InternalDeviceParser.g:2276:3: rule__ComputationDeviceType__NameAssignment_3
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
    // InternalDeviceParser.g:2284:1: rule__ComputationDeviceType__Group__4 : rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 ;
    public final void rule__ComputationDeviceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2288:1: ( rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 )
            // InternalDeviceParser.g:2289:2: rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:2296:1: rule__ComputationDeviceType__Group__4__Impl : ( ( rule__ComputationDeviceType__Group_4__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2300:1: ( ( ( rule__ComputationDeviceType__Group_4__0 )? ) )
            // InternalDeviceParser.g:2301:1: ( ( rule__ComputationDeviceType__Group_4__0 )? )
            {
            // InternalDeviceParser.g:2301:1: ( ( rule__ComputationDeviceType__Group_4__0 )? )
            // InternalDeviceParser.g:2302:2: ( rule__ComputationDeviceType__Group_4__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_4()); 
            // InternalDeviceParser.g:2303:2: ( rule__ComputationDeviceType__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Capability) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDeviceParser.g:2303:3: rule__ComputationDeviceType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComputationDeviceType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComputationDeviceTypeAccess().getGroup_4()); 

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
    // InternalDeviceParser.g:2311:1: rule__ComputationDeviceType__Group__5 : rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 ;
    public final void rule__ComputationDeviceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2315:1: ( rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 )
            // InternalDeviceParser.g:2316:2: rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:2323:1: rule__ComputationDeviceType__Group__5__Impl : ( ( rule__ComputationDeviceType__Group_5__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2327:1: ( ( ( rule__ComputationDeviceType__Group_5__0 )? ) )
            // InternalDeviceParser.g:2328:1: ( ( rule__ComputationDeviceType__Group_5__0 )? )
            {
            // InternalDeviceParser.g:2328:1: ( ( rule__ComputationDeviceType__Group_5__0 )? )
            // InternalDeviceParser.g:2329:2: ( rule__ComputationDeviceType__Group_5__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_5()); 
            // InternalDeviceParser.g:2330:2: ( rule__ComputationDeviceType__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CommunicationConnection) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDeviceParser.g:2330:3: rule__ComputationDeviceType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComputationDeviceType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComputationDeviceTypeAccess().getGroup_5()); 

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
    // InternalDeviceParser.g:2338:1: rule__ComputationDeviceType__Group__6 : rule__ComputationDeviceType__Group__6__Impl ;
    public final void rule__ComputationDeviceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2342:1: ( rule__ComputationDeviceType__Group__6__Impl )
            // InternalDeviceParser.g:2343:2: rule__ComputationDeviceType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group__6__Impl();

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
    // InternalDeviceParser.g:2349:1: rule__ComputationDeviceType__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2353:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2354:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2354:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2355:2: RULE_DEDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_6()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_6()); 

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


    // $ANTLR start "rule__ComputationDeviceType__Group_4__0"
    // InternalDeviceParser.g:2365:1: rule__ComputationDeviceType__Group_4__0 : rule__ComputationDeviceType__Group_4__0__Impl rule__ComputationDeviceType__Group_4__1 ;
    public final void rule__ComputationDeviceType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2369:1: ( rule__ComputationDeviceType__Group_4__0__Impl rule__ComputationDeviceType__Group_4__1 )
            // InternalDeviceParser.g:2370:2: rule__ComputationDeviceType__Group_4__0__Impl rule__ComputationDeviceType__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ComputationDeviceType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_4__1();

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
    // $ANTLR end "rule__ComputationDeviceType__Group_4__0"


    // $ANTLR start "rule__ComputationDeviceType__Group_4__0__Impl"
    // InternalDeviceParser.g:2377:1: rule__ComputationDeviceType__Group_4__0__Impl : ( Capability ) ;
    public final void rule__ComputationDeviceType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2381:1: ( ( Capability ) )
            // InternalDeviceParser.g:2382:1: ( Capability )
            {
            // InternalDeviceParser.g:2382:1: ( Capability )
            // InternalDeviceParser.g:2383:2: Capability
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityKeyword_4_0()); 
            match(input,Capability,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityKeyword_4_0()); 

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
    // $ANTLR end "rule__ComputationDeviceType__Group_4__0__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_4__1"
    // InternalDeviceParser.g:2392:1: rule__ComputationDeviceType__Group_4__1 : rule__ComputationDeviceType__Group_4__1__Impl rule__ComputationDeviceType__Group_4__2 ;
    public final void rule__ComputationDeviceType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2396:1: ( rule__ComputationDeviceType__Group_4__1__Impl rule__ComputationDeviceType__Group_4__2 )
            // InternalDeviceParser.g:2397:2: rule__ComputationDeviceType__Group_4__1__Impl rule__ComputationDeviceType__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__ComputationDeviceType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_4__2();

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
    // $ANTLR end "rule__ComputationDeviceType__Group_4__1"


    // $ANTLR start "rule__ComputationDeviceType__Group_4__1__Impl"
    // InternalDeviceParser.g:2404:1: rule__ComputationDeviceType__Group_4__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2408:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2409:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2409:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2410:2: RULE_INDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__ComputationDeviceType__Group_4__1__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_4__2"
    // InternalDeviceParser.g:2419:1: rule__ComputationDeviceType__Group_4__2 : rule__ComputationDeviceType__Group_4__2__Impl rule__ComputationDeviceType__Group_4__3 ;
    public final void rule__ComputationDeviceType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2423:1: ( rule__ComputationDeviceType__Group_4__2__Impl rule__ComputationDeviceType__Group_4__3 )
            // InternalDeviceParser.g:2424:2: rule__ComputationDeviceType__Group_4__2__Impl rule__ComputationDeviceType__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__ComputationDeviceType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_4__3();

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
    // $ANTLR end "rule__ComputationDeviceType__Group_4__2"


    // $ANTLR start "rule__ComputationDeviceType__Group_4__2__Impl"
    // InternalDeviceParser.g:2431:1: rule__ComputationDeviceType__Group_4__2__Impl : ( ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2435:1: ( ( ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* ) ) )
            // InternalDeviceParser.g:2436:1: ( ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* ) )
            {
            // InternalDeviceParser.g:2436:1: ( ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* ) )
            // InternalDeviceParser.g:2437:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* )
            {
            // InternalDeviceParser.g:2437:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) )
            // InternalDeviceParser.g:2438:3: ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_4_2()); 
            // InternalDeviceParser.g:2439:3: ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )
            // InternalDeviceParser.g:2439:4: rule__ComputationDeviceType__CapabilityAssignment_4_2
            {
            pushFollow(FOLLOW_15);
            rule__ComputationDeviceType__CapabilityAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_4_2()); 

            }

            // InternalDeviceParser.g:2442:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* )
            // InternalDeviceParser.g:2443:3: ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_4_2()); 
            // InternalDeviceParser.g:2444:3: ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==HyphenMinus) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDeviceParser.g:2444:4: rule__ComputationDeviceType__CapabilityAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ComputationDeviceType__CapabilityAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_4_2()); 

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
    // $ANTLR end "rule__ComputationDeviceType__Group_4__2__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_4__3"
    // InternalDeviceParser.g:2453:1: rule__ComputationDeviceType__Group_4__3 : rule__ComputationDeviceType__Group_4__3__Impl ;
    public final void rule__ComputationDeviceType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2457:1: ( rule__ComputationDeviceType__Group_4__3__Impl )
            // InternalDeviceParser.g:2458:2: rule__ComputationDeviceType__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_4__3__Impl();

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
    // $ANTLR end "rule__ComputationDeviceType__Group_4__3"


    // $ANTLR start "rule__ComputationDeviceType__Group_4__3__Impl"
    // InternalDeviceParser.g:2464:1: rule__ComputationDeviceType__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2468:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2469:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2469:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2470:2: RULE_DEDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3()); 

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
    // $ANTLR end "rule__ComputationDeviceType__Group_4__3__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_5__0"
    // InternalDeviceParser.g:2480:1: rule__ComputationDeviceType__Group_5__0 : rule__ComputationDeviceType__Group_5__0__Impl rule__ComputationDeviceType__Group_5__1 ;
    public final void rule__ComputationDeviceType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2484:1: ( rule__ComputationDeviceType__Group_5__0__Impl rule__ComputationDeviceType__Group_5__1 )
            // InternalDeviceParser.g:2485:2: rule__ComputationDeviceType__Group_5__0__Impl rule__ComputationDeviceType__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__ComputationDeviceType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_5__1();

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
    // $ANTLR end "rule__ComputationDeviceType__Group_5__0"


    // $ANTLR start "rule__ComputationDeviceType__Group_5__0__Impl"
    // InternalDeviceParser.g:2492:1: rule__ComputationDeviceType__Group_5__0__Impl : ( CommunicationConnection ) ;
    public final void rule__ComputationDeviceType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2496:1: ( ( CommunicationConnection ) )
            // InternalDeviceParser.g:2497:1: ( CommunicationConnection )
            {
            // InternalDeviceParser.g:2497:1: ( CommunicationConnection )
            // InternalDeviceParser.g:2498:2: CommunicationConnection
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_5_0()); 
            match(input,CommunicationConnection,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_5_0()); 

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
    // $ANTLR end "rule__ComputationDeviceType__Group_5__0__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_5__1"
    // InternalDeviceParser.g:2507:1: rule__ComputationDeviceType__Group_5__1 : rule__ComputationDeviceType__Group_5__1__Impl rule__ComputationDeviceType__Group_5__2 ;
    public final void rule__ComputationDeviceType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2511:1: ( rule__ComputationDeviceType__Group_5__1__Impl rule__ComputationDeviceType__Group_5__2 )
            // InternalDeviceParser.g:2512:2: rule__ComputationDeviceType__Group_5__1__Impl rule__ComputationDeviceType__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__ComputationDeviceType__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_5__2();

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
    // $ANTLR end "rule__ComputationDeviceType__Group_5__1"


    // $ANTLR start "rule__ComputationDeviceType__Group_5__1__Impl"
    // InternalDeviceParser.g:2519:1: rule__ComputationDeviceType__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2523:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2524:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2524:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2525:2: RULE_INDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1()); 

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
    // $ANTLR end "rule__ComputationDeviceType__Group_5__1__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_5__2"
    // InternalDeviceParser.g:2534:1: rule__ComputationDeviceType__Group_5__2 : rule__ComputationDeviceType__Group_5__2__Impl rule__ComputationDeviceType__Group_5__3 ;
    public final void rule__ComputationDeviceType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2538:1: ( rule__ComputationDeviceType__Group_5__2__Impl rule__ComputationDeviceType__Group_5__3 )
            // InternalDeviceParser.g:2539:2: rule__ComputationDeviceType__Group_5__2__Impl rule__ComputationDeviceType__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__ComputationDeviceType__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_5__3();

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
    // $ANTLR end "rule__ComputationDeviceType__Group_5__2"


    // $ANTLR start "rule__ComputationDeviceType__Group_5__2__Impl"
    // InternalDeviceParser.g:2546:1: rule__ComputationDeviceType__Group_5__2__Impl : ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2550:1: ( ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) ) )
            // InternalDeviceParser.g:2551:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) )
            {
            // InternalDeviceParser.g:2551:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) )
            // InternalDeviceParser.g:2552:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* )
            {
            // InternalDeviceParser.g:2552:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) )
            // InternalDeviceParser.g:2553:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2()); 
            // InternalDeviceParser.g:2554:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )
            // InternalDeviceParser.g:2554:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2
            {
            pushFollow(FOLLOW_15);
            rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2()); 

            }

            // InternalDeviceParser.g:2557:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* )
            // InternalDeviceParser.g:2558:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2()); 
            // InternalDeviceParser.g:2559:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==HyphenMinus) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDeviceParser.g:2559:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2()); 

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
    // $ANTLR end "rule__ComputationDeviceType__Group_5__2__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group_5__3"
    // InternalDeviceParser.g:2568:1: rule__ComputationDeviceType__Group_5__3 : rule__ComputationDeviceType__Group_5__3__Impl ;
    public final void rule__ComputationDeviceType__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2572:1: ( rule__ComputationDeviceType__Group_5__3__Impl )
            // InternalDeviceParser.g:2573:2: rule__ComputationDeviceType__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComputationDeviceType__Group_5__3__Impl();

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
    // $ANTLR end "rule__ComputationDeviceType__Group_5__3"


    // $ANTLR start "rule__ComputationDeviceType__Group_5__3__Impl"
    // InternalDeviceParser.g:2579:1: rule__ComputationDeviceType__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2583:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2584:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2584:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2585:2: RULE_DEDENT
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3()); 

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
    // $ANTLR end "rule__ComputationDeviceType__Group_5__3__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__0"
    // InternalDeviceParser.g:2595:1: rule__CapabilityProperty__Group__0 : rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 ;
    public final void rule__CapabilityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2599:1: ( rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 )
            // InternalDeviceParser.g:2600:2: rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeviceParser.g:2607:1: rule__CapabilityProperty__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__CapabilityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2611:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:2612:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:2612:1: ( rulePreListElement )
            // InternalDeviceParser.g:2613:2: rulePreListElement
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
    // InternalDeviceParser.g:2622:1: rule__CapabilityProperty__Group__1 : rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 ;
    public final void rule__CapabilityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2626:1: ( rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 )
            // InternalDeviceParser.g:2627:2: rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeviceParser.g:2634:1: rule__CapabilityProperty__Group__1__Impl : ( Name ) ;
    public final void rule__CapabilityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2638:1: ( ( Name ) )
            // InternalDeviceParser.g:2639:1: ( Name )
            {
            // InternalDeviceParser.g:2639:1: ( Name )
            // InternalDeviceParser.g:2640:2: Name
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
    // InternalDeviceParser.g:2649:1: rule__CapabilityProperty__Group__2 : rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 ;
    public final void rule__CapabilityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2653:1: ( rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 )
            // InternalDeviceParser.g:2654:2: rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:2661:1: rule__CapabilityProperty__Group__2__Impl : ( ( rule__CapabilityProperty__NameAssignment_2 ) ) ;
    public final void rule__CapabilityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2665:1: ( ( ( rule__CapabilityProperty__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:2666:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:2666:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            // InternalDeviceParser.g:2667:2: ( rule__CapabilityProperty__NameAssignment_2 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getNameAssignment_2()); 
            // InternalDeviceParser.g:2668:2: ( rule__CapabilityProperty__NameAssignment_2 )
            // InternalDeviceParser.g:2668:3: rule__CapabilityProperty__NameAssignment_2
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
    // InternalDeviceParser.g:2676:1: rule__CapabilityProperty__Group__3 : rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 ;
    public final void rule__CapabilityProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2680:1: ( rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 )
            // InternalDeviceParser.g:2681:2: rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalDeviceParser.g:2688:1: rule__CapabilityProperty__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__CapabilityProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2692:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2693:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2693:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2694:2: RULE_INDENT
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
    // InternalDeviceParser.g:2703:1: rule__CapabilityProperty__Group__4 : rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 ;
    public final void rule__CapabilityProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2707:1: ( rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 )
            // InternalDeviceParser.g:2708:2: rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalDeviceParser.g:2715:1: rule__CapabilityProperty__Group__4__Impl : ( Kind ) ;
    public final void rule__CapabilityProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2719:1: ( ( Kind ) )
            // InternalDeviceParser.g:2720:1: ( Kind )
            {
            // InternalDeviceParser.g:2720:1: ( Kind )
            // InternalDeviceParser.g:2721:2: Kind
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindKeyword_4()); 
            match(input,Kind,FOLLOW_2); 
             after(grammarAccess.getCapabilityPropertyAccess().getKindKeyword_4()); 

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
    // InternalDeviceParser.g:2730:1: rule__CapabilityProperty__Group__5 : rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 ;
    public final void rule__CapabilityProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2734:1: ( rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 )
            // InternalDeviceParser.g:2735:2: rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6
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
    // InternalDeviceParser.g:2742:1: rule__CapabilityProperty__Group__5__Impl : ( ( rule__CapabilityProperty__KindAssignment_5 ) ) ;
    public final void rule__CapabilityProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2746:1: ( ( ( rule__CapabilityProperty__KindAssignment_5 ) ) )
            // InternalDeviceParser.g:2747:1: ( ( rule__CapabilityProperty__KindAssignment_5 ) )
            {
            // InternalDeviceParser.g:2747:1: ( ( rule__CapabilityProperty__KindAssignment_5 ) )
            // InternalDeviceParser.g:2748:2: ( rule__CapabilityProperty__KindAssignment_5 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindAssignment_5()); 
            // InternalDeviceParser.g:2749:2: ( rule__CapabilityProperty__KindAssignment_5 )
            // InternalDeviceParser.g:2749:3: rule__CapabilityProperty__KindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__KindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityPropertyAccess().getKindAssignment_5()); 

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
    // InternalDeviceParser.g:2757:1: rule__CapabilityProperty__Group__6 : rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 ;
    public final void rule__CapabilityProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2761:1: ( rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 )
            // InternalDeviceParser.g:2762:2: rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7
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
    // InternalDeviceParser.g:2769:1: rule__CapabilityProperty__Group__6__Impl : ( Type ) ;
    public final void rule__CapabilityProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2773:1: ( ( Type ) )
            // InternalDeviceParser.g:2774:1: ( Type )
            {
            // InternalDeviceParser.g:2774:1: ( Type )
            // InternalDeviceParser.g:2775:2: Type
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeKeyword_6()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getCapabilityPropertyAccess().getTypeKeyword_6()); 

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
    // InternalDeviceParser.g:2784:1: rule__CapabilityProperty__Group__7 : rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 ;
    public final void rule__CapabilityProperty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2788:1: ( rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 )
            // InternalDeviceParser.g:2789:2: rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalDeviceParser.g:2796:1: rule__CapabilityProperty__Group__7__Impl : ( ( rule__CapabilityProperty__TypeAssignment_7 ) ) ;
    public final void rule__CapabilityProperty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2800:1: ( ( ( rule__CapabilityProperty__TypeAssignment_7 ) ) )
            // InternalDeviceParser.g:2801:1: ( ( rule__CapabilityProperty__TypeAssignment_7 ) )
            {
            // InternalDeviceParser.g:2801:1: ( ( rule__CapabilityProperty__TypeAssignment_7 ) )
            // InternalDeviceParser.g:2802:2: ( rule__CapabilityProperty__TypeAssignment_7 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeAssignment_7()); 
            // InternalDeviceParser.g:2803:2: ( rule__CapabilityProperty__TypeAssignment_7 )
            // InternalDeviceParser.g:2803:3: rule__CapabilityProperty__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityProperty__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityPropertyAccess().getTypeAssignment_7()); 

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
    // InternalDeviceParser.g:2811:1: rule__CapabilityProperty__Group__8 : rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 ;
    public final void rule__CapabilityProperty__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2815:1: ( rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 )
            // InternalDeviceParser.g:2816:2: rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalDeviceParser.g:2823:1: rule__CapabilityProperty__Group__8__Impl : ( ( rule__CapabilityProperty__Group_8__0 )? ) ;
    public final void rule__CapabilityProperty__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2827:1: ( ( ( rule__CapabilityProperty__Group_8__0 )? ) )
            // InternalDeviceParser.g:2828:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            {
            // InternalDeviceParser.g:2828:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            // InternalDeviceParser.g:2829:2: ( rule__CapabilityProperty__Group_8__0 )?
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup_8()); 
            // InternalDeviceParser.g:2830:2: ( rule__CapabilityProperty__Group_8__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDeviceParser.g:2830:3: rule__CapabilityProperty__Group_8__0
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
    // InternalDeviceParser.g:2838:1: rule__CapabilityProperty__Group__9 : rule__CapabilityProperty__Group__9__Impl ;
    public final void rule__CapabilityProperty__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2842:1: ( rule__CapabilityProperty__Group__9__Impl )
            // InternalDeviceParser.g:2843:2: rule__CapabilityProperty__Group__9__Impl
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
    // InternalDeviceParser.g:2849:1: rule__CapabilityProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__CapabilityProperty__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2853:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2854:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2854:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2855:2: RULE_DEDENT
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
    // InternalDeviceParser.g:2865:1: rule__CapabilityProperty__Group_8__0 : rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 ;
    public final void rule__CapabilityProperty__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2869:1: ( rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 )
            // InternalDeviceParser.g:2870:2: rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:2877:1: rule__CapabilityProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__CapabilityProperty__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2881:1: ( ( Value ) )
            // InternalDeviceParser.g:2882:1: ( Value )
            {
            // InternalDeviceParser.g:2882:1: ( Value )
            // InternalDeviceParser.g:2883:2: Value
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
    // InternalDeviceParser.g:2892:1: rule__CapabilityProperty__Group_8__1 : rule__CapabilityProperty__Group_8__1__Impl ;
    public final void rule__CapabilityProperty__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2896:1: ( rule__CapabilityProperty__Group_8__1__Impl )
            // InternalDeviceParser.g:2897:2: rule__CapabilityProperty__Group_8__1__Impl
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
    // InternalDeviceParser.g:2903:1: rule__CapabilityProperty__Group_8__1__Impl : ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__CapabilityProperty__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2907:1: ( ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) )
            // InternalDeviceParser.g:2908:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            {
            // InternalDeviceParser.g:2908:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            // InternalDeviceParser.g:2909:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getValueAssignment_8_1()); 
            // InternalDeviceParser.g:2910:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            // InternalDeviceParser.g:2910:3: rule__CapabilityProperty__ValueAssignment_8_1
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
    // InternalDeviceParser.g:2919:1: rule__AttributeKind__Group__0 : rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 ;
    public final void rule__AttributeKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2923:1: ( rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 )
            // InternalDeviceParser.g:2924:2: rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1
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
    // InternalDeviceParser.g:2931:1: rule__AttributeKind__Group__0__Impl : ( () ) ;
    public final void rule__AttributeKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2935:1: ( ( () ) )
            // InternalDeviceParser.g:2936:1: ( () )
            {
            // InternalDeviceParser.g:2936:1: ( () )
            // InternalDeviceParser.g:2937:2: ()
            {
             before(grammarAccess.getAttributeKindAccess().getAttributeKindAction_0()); 
            // InternalDeviceParser.g:2938:2: ()
            // InternalDeviceParser.g:2938:3: 
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
    // InternalDeviceParser.g:2946:1: rule__AttributeKind__Group__1 : rule__AttributeKind__Group__1__Impl ;
    public final void rule__AttributeKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2950:1: ( rule__AttributeKind__Group__1__Impl )
            // InternalDeviceParser.g:2951:2: rule__AttributeKind__Group__1__Impl
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
    // InternalDeviceParser.g:2957:1: rule__AttributeKind__Group__1__Impl : ( AttributeKind ) ;
    public final void rule__AttributeKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2961:1: ( ( AttributeKind ) )
            // InternalDeviceParser.g:2962:1: ( AttributeKind )
            {
            // InternalDeviceParser.g:2962:1: ( AttributeKind )
            // InternalDeviceParser.g:2963:2: AttributeKind
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
    // InternalDeviceParser.g:2973:1: rule__MaximumKind__Group__0 : rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 ;
    public final void rule__MaximumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2977:1: ( rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 )
            // InternalDeviceParser.g:2978:2: rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1
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
    // InternalDeviceParser.g:2985:1: rule__MaximumKind__Group__0__Impl : ( () ) ;
    public final void rule__MaximumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:2989:1: ( ( () ) )
            // InternalDeviceParser.g:2990:1: ( () )
            {
            // InternalDeviceParser.g:2990:1: ( () )
            // InternalDeviceParser.g:2991:2: ()
            {
             before(grammarAccess.getMaximumKindAccess().getMaximumKindAction_0()); 
            // InternalDeviceParser.g:2992:2: ()
            // InternalDeviceParser.g:2992:3: 
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
    // InternalDeviceParser.g:3000:1: rule__MaximumKind__Group__1 : rule__MaximumKind__Group__1__Impl ;
    public final void rule__MaximumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3004:1: ( rule__MaximumKind__Group__1__Impl )
            // InternalDeviceParser.g:3005:2: rule__MaximumKind__Group__1__Impl
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
    // InternalDeviceParser.g:3011:1: rule__MaximumKind__Group__1__Impl : ( MaximumKind ) ;
    public final void rule__MaximumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3015:1: ( ( MaximumKind ) )
            // InternalDeviceParser.g:3016:1: ( MaximumKind )
            {
            // InternalDeviceParser.g:3016:1: ( MaximumKind )
            // InternalDeviceParser.g:3017:2: MaximumKind
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
    // InternalDeviceParser.g:3027:1: rule__MinimumKind__Group__0 : rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 ;
    public final void rule__MinimumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3031:1: ( rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 )
            // InternalDeviceParser.g:3032:2: rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1
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
    // InternalDeviceParser.g:3039:1: rule__MinimumKind__Group__0__Impl : ( () ) ;
    public final void rule__MinimumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3043:1: ( ( () ) )
            // InternalDeviceParser.g:3044:1: ( () )
            {
            // InternalDeviceParser.g:3044:1: ( () )
            // InternalDeviceParser.g:3045:2: ()
            {
             before(grammarAccess.getMinimumKindAccess().getMinimumKindAction_0()); 
            // InternalDeviceParser.g:3046:2: ()
            // InternalDeviceParser.g:3046:3: 
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
    // InternalDeviceParser.g:3054:1: rule__MinimumKind__Group__1 : rule__MinimumKind__Group__1__Impl ;
    public final void rule__MinimumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3058:1: ( rule__MinimumKind__Group__1__Impl )
            // InternalDeviceParser.g:3059:2: rule__MinimumKind__Group__1__Impl
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
    // InternalDeviceParser.g:3065:1: rule__MinimumKind__Group__1__Impl : ( MinimumKind ) ;
    public final void rule__MinimumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3069:1: ( ( MinimumKind ) )
            // InternalDeviceParser.g:3070:1: ( MinimumKind )
            {
            // InternalDeviceParser.g:3070:1: ( MinimumKind )
            // InternalDeviceParser.g:3071:2: MinimumKind
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
    // InternalDeviceParser.g:3081:1: rule__SelectionKind__Group__0 : rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 ;
    public final void rule__SelectionKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3085:1: ( rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 )
            // InternalDeviceParser.g:3086:2: rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDeviceParser.g:3093:1: rule__SelectionKind__Group__0__Impl : ( () ) ;
    public final void rule__SelectionKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3097:1: ( ( () ) )
            // InternalDeviceParser.g:3098:1: ( () )
            {
            // InternalDeviceParser.g:3098:1: ( () )
            // InternalDeviceParser.g:3099:2: ()
            {
             before(grammarAccess.getSelectionKindAccess().getSelectionKindAction_0()); 
            // InternalDeviceParser.g:3100:2: ()
            // InternalDeviceParser.g:3100:3: 
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
    // InternalDeviceParser.g:3108:1: rule__SelectionKind__Group__1 : rule__SelectionKind__Group__1__Impl ;
    public final void rule__SelectionKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3112:1: ( rule__SelectionKind__Group__1__Impl )
            // InternalDeviceParser.g:3113:2: rule__SelectionKind__Group__1__Impl
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
    // InternalDeviceParser.g:3119:1: rule__SelectionKind__Group__1__Impl : ( SelectionKind ) ;
    public final void rule__SelectionKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3123:1: ( ( SelectionKind ) )
            // InternalDeviceParser.g:3124:1: ( SelectionKind )
            {
            // InternalDeviceParser.g:3124:1: ( SelectionKind )
            // InternalDeviceParser.g:3125:2: SelectionKind
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
    // InternalDeviceParser.g:3135:1: rule__ConnectionProperty__Group__0 : rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 ;
    public final void rule__ConnectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3139:1: ( rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 )
            // InternalDeviceParser.g:3140:2: rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeviceParser.g:3147:1: rule__ConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3151:1: ( ( () ) )
            // InternalDeviceParser.g:3152:1: ( () )
            {
            // InternalDeviceParser.g:3152:1: ( () )
            // InternalDeviceParser.g:3153:2: ()
            {
             before(grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0()); 
            // InternalDeviceParser.g:3154:2: ()
            // InternalDeviceParser.g:3154:3: 
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
    // InternalDeviceParser.g:3162:1: rule__ConnectionProperty__Group__1 : rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 ;
    public final void rule__ConnectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3166:1: ( rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 )
            // InternalDeviceParser.g:3167:2: rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeviceParser.g:3174:1: rule__ConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3178:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:3179:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:3179:1: ( rulePreListElement )
            // InternalDeviceParser.g:3180:2: rulePreListElement
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
    // InternalDeviceParser.g:3189:1: rule__ConnectionProperty__Group__2 : rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 ;
    public final void rule__ConnectionProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3193:1: ( rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 )
            // InternalDeviceParser.g:3194:2: rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeviceParser.g:3201:1: rule__ConnectionProperty__Group__2__Impl : ( Name ) ;
    public final void rule__ConnectionProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3205:1: ( ( Name ) )
            // InternalDeviceParser.g:3206:1: ( Name )
            {
            // InternalDeviceParser.g:3206:1: ( Name )
            // InternalDeviceParser.g:3207:2: Name
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
    // InternalDeviceParser.g:3216:1: rule__ConnectionProperty__Group__3 : rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 ;
    public final void rule__ConnectionProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3220:1: ( rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 )
            // InternalDeviceParser.g:3221:2: rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:3228:1: rule__ConnectionProperty__Group__3__Impl : ( ( rule__ConnectionProperty__NameAssignment_3 ) ) ;
    public final void rule__ConnectionProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3232:1: ( ( ( rule__ConnectionProperty__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:3233:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:3233:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            // InternalDeviceParser.g:3234:2: ( rule__ConnectionProperty__NameAssignment_3 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3()); 
            // InternalDeviceParser.g:3235:2: ( rule__ConnectionProperty__NameAssignment_3 )
            // InternalDeviceParser.g:3235:3: rule__ConnectionProperty__NameAssignment_3
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
    // InternalDeviceParser.g:3243:1: rule__ConnectionProperty__Group__4 : rule__ConnectionProperty__Group__4__Impl ;
    public final void rule__ConnectionProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3247:1: ( rule__ConnectionProperty__Group__4__Impl )
            // InternalDeviceParser.g:3248:2: rule__ConnectionProperty__Group__4__Impl
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
    // InternalDeviceParser.g:3254:1: rule__ConnectionProperty__Group__4__Impl : ( ( rule__ConnectionProperty__Group_4__0 )? ) ;
    public final void rule__ConnectionProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3258:1: ( ( ( rule__ConnectionProperty__Group_4__0 )? ) )
            // InternalDeviceParser.g:3259:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            {
            // InternalDeviceParser.g:3259:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            // InternalDeviceParser.g:3260:2: ( rule__ConnectionProperty__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup_4()); 
            // InternalDeviceParser.g:3261:2: ( rule__ConnectionProperty__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeviceParser.g:3261:3: rule__ConnectionProperty__Group_4__0
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
    // InternalDeviceParser.g:3270:1: rule__ConnectionProperty__Group_4__0 : rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 ;
    public final void rule__ConnectionProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3274:1: ( rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 )
            // InternalDeviceParser.g:3275:2: rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeviceParser.g:3282:1: rule__ConnectionProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectionProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3286:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3287:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3287:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3288:2: RULE_INDENT
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
    // InternalDeviceParser.g:3297:1: rule__ConnectionProperty__Group_4__1 : rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 ;
    public final void rule__ConnectionProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3301:1: ( rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 )
            // InternalDeviceParser.g:3302:2: rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:3309:1: rule__ConnectionProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__ConnectionProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3313:1: ( ( Value ) )
            // InternalDeviceParser.g:3314:1: ( Value )
            {
            // InternalDeviceParser.g:3314:1: ( Value )
            // InternalDeviceParser.g:3315:2: Value
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
    // InternalDeviceParser.g:3324:1: rule__ConnectionProperty__Group_4__2 : rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 ;
    public final void rule__ConnectionProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3328:1: ( rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 )
            // InternalDeviceParser.g:3329:2: rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDeviceParser.g:3336:1: rule__ConnectionProperty__Group_4__2__Impl : ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__ConnectionProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3340:1: ( ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) )
            // InternalDeviceParser.g:3341:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            {
            // InternalDeviceParser.g:3341:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            // InternalDeviceParser.g:3342:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getValueAssignment_4_2()); 
            // InternalDeviceParser.g:3343:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            // InternalDeviceParser.g:3343:3: rule__ConnectionProperty__ValueAssignment_4_2
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
    // InternalDeviceParser.g:3351:1: rule__ConnectionProperty__Group_4__3 : rule__ConnectionProperty__Group_4__3__Impl ;
    public final void rule__ConnectionProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3355:1: ( rule__ConnectionProperty__Group_4__3__Impl )
            // InternalDeviceParser.g:3356:2: rule__ConnectionProperty__Group_4__3__Impl
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
    // InternalDeviceParser.g:3362:1: rule__ConnectionProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectionProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3366:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3367:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3367:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3368:2: RULE_DEDENT
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
    // InternalDeviceParser.g:3378:1: rule__NetworkConnection__Group__0 : rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 ;
    public final void rule__NetworkConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3382:1: ( rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 )
            // InternalDeviceParser.g:3383:2: rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeviceParser.g:3390:1: rule__NetworkConnection__Group__0__Impl : ( () ) ;
    public final void rule__NetworkConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3394:1: ( ( () ) )
            // InternalDeviceParser.g:3395:1: ( () )
            {
            // InternalDeviceParser.g:3395:1: ( () )
            // InternalDeviceParser.g:3396:2: ()
            {
             before(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionAction_0()); 
            // InternalDeviceParser.g:3397:2: ()
            // InternalDeviceParser.g:3397:3: 
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
    // InternalDeviceParser.g:3405:1: rule__NetworkConnection__Group__1 : rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 ;
    public final void rule__NetworkConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3409:1: ( rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 )
            // InternalDeviceParser.g:3410:2: rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeviceParser.g:3417:1: rule__NetworkConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__NetworkConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3421:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:3422:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:3422:1: ( rulePreListElement )
            // InternalDeviceParser.g:3423:2: rulePreListElement
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
    // InternalDeviceParser.g:3432:1: rule__NetworkConnection__Group__2 : rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 ;
    public final void rule__NetworkConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3436:1: ( rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 )
            // InternalDeviceParser.g:3437:2: rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeviceParser.g:3444:1: rule__NetworkConnection__Group__2__Impl : ( Name ) ;
    public final void rule__NetworkConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3448:1: ( ( Name ) )
            // InternalDeviceParser.g:3449:1: ( Name )
            {
            // InternalDeviceParser.g:3449:1: ( Name )
            // InternalDeviceParser.g:3450:2: Name
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
    // InternalDeviceParser.g:3459:1: rule__NetworkConnection__Group__3 : rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 ;
    public final void rule__NetworkConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3463:1: ( rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 )
            // InternalDeviceParser.g:3464:2: rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:3471:1: rule__NetworkConnection__Group__3__Impl : ( ( rule__NetworkConnection__NameAssignment_3 ) ) ;
    public final void rule__NetworkConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3475:1: ( ( ( rule__NetworkConnection__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:3476:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:3476:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            // InternalDeviceParser.g:3477:2: ( rule__NetworkConnection__NameAssignment_3 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getNameAssignment_3()); 
            // InternalDeviceParser.g:3478:2: ( rule__NetworkConnection__NameAssignment_3 )
            // InternalDeviceParser.g:3478:3: rule__NetworkConnection__NameAssignment_3
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
    // InternalDeviceParser.g:3486:1: rule__NetworkConnection__Group__4 : rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 ;
    public final void rule__NetworkConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3490:1: ( rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 )
            // InternalDeviceParser.g:3491:2: rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalDeviceParser.g:3498:1: rule__NetworkConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3502:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3503:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3503:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3504:2: RULE_INDENT
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
    // InternalDeviceParser.g:3513:1: rule__NetworkConnection__Group__5 : rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 ;
    public final void rule__NetworkConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3517:1: ( rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 )
            // InternalDeviceParser.g:3518:2: rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalDeviceParser.g:3525:1: rule__NetworkConnection__Group__5__Impl : ( Type ) ;
    public final void rule__NetworkConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3529:1: ( ( Type ) )
            // InternalDeviceParser.g:3530:1: ( Type )
            {
            // InternalDeviceParser.g:3530:1: ( Type )
            // InternalDeviceParser.g:3531:2: Type
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
    // InternalDeviceParser.g:3540:1: rule__NetworkConnection__Group__6 : rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 ;
    public final void rule__NetworkConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3544:1: ( rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 )
            // InternalDeviceParser.g:3545:2: rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7
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
    // InternalDeviceParser.g:3552:1: rule__NetworkConnection__Group__6__Impl : ( ( rule__NetworkConnection__TypeAssignment_6 ) ) ;
    public final void rule__NetworkConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3556:1: ( ( ( rule__NetworkConnection__TypeAssignment_6 ) ) )
            // InternalDeviceParser.g:3557:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            {
            // InternalDeviceParser.g:3557:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            // InternalDeviceParser.g:3558:2: ( rule__NetworkConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeAssignment_6()); 
            // InternalDeviceParser.g:3559:2: ( rule__NetworkConnection__TypeAssignment_6 )
            // InternalDeviceParser.g:3559:3: rule__NetworkConnection__TypeAssignment_6
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
    // InternalDeviceParser.g:3567:1: rule__NetworkConnection__Group__7 : rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 ;
    public final void rule__NetworkConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3571:1: ( rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 )
            // InternalDeviceParser.g:3572:2: rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8
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
    // InternalDeviceParser.g:3579:1: rule__NetworkConnection__Group__7__Impl : ( ( rule__NetworkConnection__Group_7__0 )? ) ;
    public final void rule__NetworkConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3583:1: ( ( ( rule__NetworkConnection__Group_7__0 )? ) )
            // InternalDeviceParser.g:3584:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            {
            // InternalDeviceParser.g:3584:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            // InternalDeviceParser.g:3585:2: ( rule__NetworkConnection__Group_7__0 )?
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup_7()); 
            // InternalDeviceParser.g:3586:2: ( rule__NetworkConnection__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Properties) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDeviceParser.g:3586:3: rule__NetworkConnection__Group_7__0
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
    // InternalDeviceParser.g:3594:1: rule__NetworkConnection__Group__8 : rule__NetworkConnection__Group__8__Impl ;
    public final void rule__NetworkConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3598:1: ( rule__NetworkConnection__Group__8__Impl )
            // InternalDeviceParser.g:3599:2: rule__NetworkConnection__Group__8__Impl
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
    // InternalDeviceParser.g:3605:1: rule__NetworkConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__NetworkConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3609:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3610:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3610:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3611:2: RULE_DEDENT
            {
             before(grammarAccess.getNetworkConnectionAccess().getDEDENTTerminalRuleCall_8()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getDEDENTTerminalRuleCall_8()); 

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
    // InternalDeviceParser.g:3621:1: rule__NetworkConnection__Group_7__0 : rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 ;
    public final void rule__NetworkConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3625:1: ( rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 )
            // InternalDeviceParser.g:3626:2: rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:3633:1: rule__NetworkConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__NetworkConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3637:1: ( ( Properties ) )
            // InternalDeviceParser.g:3638:1: ( Properties )
            {
            // InternalDeviceParser.g:3638:1: ( Properties )
            // InternalDeviceParser.g:3639:2: Properties
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
    // InternalDeviceParser.g:3648:1: rule__NetworkConnection__Group_7__1 : rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 ;
    public final void rule__NetworkConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3652:1: ( rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 )
            // InternalDeviceParser.g:3653:2: rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2
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
    // InternalDeviceParser.g:3660:1: rule__NetworkConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3664:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3665:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3665:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3666:2: RULE_INDENT
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
    // InternalDeviceParser.g:3675:1: rule__NetworkConnection__Group_7__2 : rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 ;
    public final void rule__NetworkConnection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3679:1: ( rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 )
            // InternalDeviceParser.g:3680:2: rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDeviceParser.g:3687:1: rule__NetworkConnection__Group_7__2__Impl : ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__NetworkConnection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3691:1: ( ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalDeviceParser.g:3692:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalDeviceParser.g:3692:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            // InternalDeviceParser.g:3693:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalDeviceParser.g:3693:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) )
            // InternalDeviceParser.g:3694:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalDeviceParser.g:3695:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            // InternalDeviceParser.g:3695:4: rule__NetworkConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_15);
            rule__NetworkConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 

            }

            // InternalDeviceParser.g:3698:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            // InternalDeviceParser.g:3699:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalDeviceParser.g:3700:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==HyphenMinus) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDeviceParser.g:3700:4: rule__NetworkConnection__PropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__NetworkConnection__PropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalDeviceParser.g:3709:1: rule__NetworkConnection__Group_7__3 : rule__NetworkConnection__Group_7__3__Impl ;
    public final void rule__NetworkConnection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3713:1: ( rule__NetworkConnection__Group_7__3__Impl )
            // InternalDeviceParser.g:3714:2: rule__NetworkConnection__Group_7__3__Impl
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
    // InternalDeviceParser.g:3720:1: rule__NetworkConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__NetworkConnection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3724:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3725:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3725:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3726:2: RULE_DEDENT
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
    // InternalDeviceParser.g:3736:1: rule__CommunicationConnection__Group__0 : rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 ;
    public final void rule__CommunicationConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3740:1: ( rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 )
            // InternalDeviceParser.g:3741:2: rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeviceParser.g:3748:1: rule__CommunicationConnection__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3752:1: ( ( () ) )
            // InternalDeviceParser.g:3753:1: ( () )
            {
            // InternalDeviceParser.g:3753:1: ( () )
            // InternalDeviceParser.g:3754:2: ()
            {
             before(grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0()); 
            // InternalDeviceParser.g:3755:2: ()
            // InternalDeviceParser.g:3755:3: 
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
    // InternalDeviceParser.g:3763:1: rule__CommunicationConnection__Group__1 : rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 ;
    public final void rule__CommunicationConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3767:1: ( rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 )
            // InternalDeviceParser.g:3768:2: rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDeviceParser.g:3775:1: rule__CommunicationConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__CommunicationConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3779:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:3780:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:3780:1: ( rulePreListElement )
            // InternalDeviceParser.g:3781:2: rulePreListElement
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
    // InternalDeviceParser.g:3790:1: rule__CommunicationConnection__Group__2 : rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 ;
    public final void rule__CommunicationConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3794:1: ( rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 )
            // InternalDeviceParser.g:3795:2: rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeviceParser.g:3802:1: rule__CommunicationConnection__Group__2__Impl : ( Name ) ;
    public final void rule__CommunicationConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3806:1: ( ( Name ) )
            // InternalDeviceParser.g:3807:1: ( Name )
            {
            // InternalDeviceParser.g:3807:1: ( Name )
            // InternalDeviceParser.g:3808:2: Name
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
    // InternalDeviceParser.g:3817:1: rule__CommunicationConnection__Group__3 : rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 ;
    public final void rule__CommunicationConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3821:1: ( rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 )
            // InternalDeviceParser.g:3822:2: rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:3829:1: rule__CommunicationConnection__Group__3__Impl : ( ( rule__CommunicationConnection__NameAssignment_3 ) ) ;
    public final void rule__CommunicationConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3833:1: ( ( ( rule__CommunicationConnection__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:3834:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:3834:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            // InternalDeviceParser.g:3835:2: ( rule__CommunicationConnection__NameAssignment_3 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3()); 
            // InternalDeviceParser.g:3836:2: ( rule__CommunicationConnection__NameAssignment_3 )
            // InternalDeviceParser.g:3836:3: rule__CommunicationConnection__NameAssignment_3
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
    // InternalDeviceParser.g:3844:1: rule__CommunicationConnection__Group__4 : rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 ;
    public final void rule__CommunicationConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3848:1: ( rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 )
            // InternalDeviceParser.g:3849:2: rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalDeviceParser.g:3856:1: rule__CommunicationConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3860:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3861:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3861:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3862:2: RULE_INDENT
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
    // InternalDeviceParser.g:3871:1: rule__CommunicationConnection__Group__5 : rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 ;
    public final void rule__CommunicationConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3875:1: ( rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 )
            // InternalDeviceParser.g:3876:2: rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeviceParser.g:3883:1: rule__CommunicationConnection__Group__5__Impl : ( Type ) ;
    public final void rule__CommunicationConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3887:1: ( ( Type ) )
            // InternalDeviceParser.g:3888:1: ( Type )
            {
            // InternalDeviceParser.g:3888:1: ( Type )
            // InternalDeviceParser.g:3889:2: Type
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
    // InternalDeviceParser.g:3898:1: rule__CommunicationConnection__Group__6 : rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 ;
    public final void rule__CommunicationConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3902:1: ( rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 )
            // InternalDeviceParser.g:3903:2: rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalDeviceParser.g:3910:1: rule__CommunicationConnection__Group__6__Impl : ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) ;
    public final void rule__CommunicationConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3914:1: ( ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) )
            // InternalDeviceParser.g:3915:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            {
            // InternalDeviceParser.g:3915:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            // InternalDeviceParser.g:3916:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6()); 
            // InternalDeviceParser.g:3917:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            // InternalDeviceParser.g:3917:3: rule__CommunicationConnection__TypeAssignment_6
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
    // InternalDeviceParser.g:3925:1: rule__CommunicationConnection__Group__7 : rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 ;
    public final void rule__CommunicationConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3929:1: ( rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 )
            // InternalDeviceParser.g:3930:2: rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalDeviceParser.g:3937:1: rule__CommunicationConnection__Group__7__Impl : ( ( rule__CommunicationConnection__Group_7__0 )? ) ;
    public final void rule__CommunicationConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3941:1: ( ( ( rule__CommunicationConnection__Group_7__0 )? ) )
            // InternalDeviceParser.g:3942:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            {
            // InternalDeviceParser.g:3942:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            // InternalDeviceParser.g:3943:2: ( rule__CommunicationConnection__Group_7__0 )?
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup_7()); 
            // InternalDeviceParser.g:3944:2: ( rule__CommunicationConnection__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Properties) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDeviceParser.g:3944:3: rule__CommunicationConnection__Group_7__0
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
    // InternalDeviceParser.g:3952:1: rule__CommunicationConnection__Group__8 : rule__CommunicationConnection__Group__8__Impl ;
    public final void rule__CommunicationConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3956:1: ( rule__CommunicationConnection__Group__8__Impl )
            // InternalDeviceParser.g:3957:2: rule__CommunicationConnection__Group__8__Impl
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
    // InternalDeviceParser.g:3963:1: rule__CommunicationConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3967:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3968:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3968:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3969:2: RULE_DEDENT
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
    // InternalDeviceParser.g:3979:1: rule__CommunicationConnection__Group_7__0 : rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 ;
    public final void rule__CommunicationConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3983:1: ( rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 )
            // InternalDeviceParser.g:3984:2: rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:3991:1: rule__CommunicationConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__CommunicationConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:3995:1: ( ( Properties ) )
            // InternalDeviceParser.g:3996:1: ( Properties )
            {
            // InternalDeviceParser.g:3996:1: ( Properties )
            // InternalDeviceParser.g:3997:2: Properties
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
    // InternalDeviceParser.g:4006:1: rule__CommunicationConnection__Group_7__1 : rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 ;
    public final void rule__CommunicationConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4010:1: ( rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 )
            // InternalDeviceParser.g:4011:2: rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeviceParser.g:4018:1: rule__CommunicationConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4022:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:4023:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:4023:1: ( RULE_INDENT )
            // InternalDeviceParser.g:4024:2: RULE_INDENT
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
    // InternalDeviceParser.g:4033:1: rule__CommunicationConnection__Group_7__2 : rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 ;
    public final void rule__CommunicationConnection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4037:1: ( rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 )
            // InternalDeviceParser.g:4038:2: rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDeviceParser.g:4045:1: rule__CommunicationConnection__Group_7__2__Impl : ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__CommunicationConnection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4049:1: ( ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalDeviceParser.g:4050:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalDeviceParser.g:4050:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            // InternalDeviceParser.g:4051:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalDeviceParser.g:4051:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) )
            // InternalDeviceParser.g:4052:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalDeviceParser.g:4053:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            // InternalDeviceParser.g:4053:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_15);
            rule__CommunicationConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 

            }

            // InternalDeviceParser.g:4056:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            // InternalDeviceParser.g:4057:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalDeviceParser.g:4058:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==HyphenMinus) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDeviceParser.g:4058:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CommunicationConnection__PropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalDeviceParser.g:4067:1: rule__CommunicationConnection__Group_7__3 : rule__CommunicationConnection__Group_7__3__Impl ;
    public final void rule__CommunicationConnection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4071:1: ( rule__CommunicationConnection__Group_7__3__Impl )
            // InternalDeviceParser.g:4072:2: rule__CommunicationConnection__Group_7__3__Impl
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
    // InternalDeviceParser.g:4078:1: rule__CommunicationConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4082:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:4083:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:4083:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:4084:2: RULE_DEDENT
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


    // $ANTLR start "rule__ProcessorArchitectureType__Group__0"
    // InternalDeviceParser.g:4094:1: rule__ProcessorArchitectureType__Group__0 : rule__ProcessorArchitectureType__Group__0__Impl rule__ProcessorArchitectureType__Group__1 ;
    public final void rule__ProcessorArchitectureType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4098:1: ( rule__ProcessorArchitectureType__Group__0__Impl rule__ProcessorArchitectureType__Group__1 )
            // InternalDeviceParser.g:4099:2: rule__ProcessorArchitectureType__Group__0__Impl rule__ProcessorArchitectureType__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ProcessorArchitectureType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessorArchitectureType__Group__1();

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
    // $ANTLR end "rule__ProcessorArchitectureType__Group__0"


    // $ANTLR start "rule__ProcessorArchitectureType__Group__0__Impl"
    // InternalDeviceParser.g:4106:1: rule__ProcessorArchitectureType__Group__0__Impl : ( () ) ;
    public final void rule__ProcessorArchitectureType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4110:1: ( ( () ) )
            // InternalDeviceParser.g:4111:1: ( () )
            {
            // InternalDeviceParser.g:4111:1: ( () )
            // InternalDeviceParser.g:4112:2: ()
            {
             before(grammarAccess.getProcessorArchitectureTypeAccess().getProcessorArchitectureTypeAction_0()); 
            // InternalDeviceParser.g:4113:2: ()
            // InternalDeviceParser.g:4113:3: 
            {
            }

             after(grammarAccess.getProcessorArchitectureTypeAccess().getProcessorArchitectureTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorArchitectureType__Group__0__Impl"


    // $ANTLR start "rule__ProcessorArchitectureType__Group__1"
    // InternalDeviceParser.g:4121:1: rule__ProcessorArchitectureType__Group__1 : rule__ProcessorArchitectureType__Group__1__Impl ;
    public final void rule__ProcessorArchitectureType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4125:1: ( rule__ProcessorArchitectureType__Group__1__Impl )
            // InternalDeviceParser.g:4126:2: rule__ProcessorArchitectureType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorArchitectureType__Group__1__Impl();

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
    // $ANTLR end "rule__ProcessorArchitectureType__Group__1"


    // $ANTLR start "rule__ProcessorArchitectureType__Group__1__Impl"
    // InternalDeviceParser.g:4132:1: rule__ProcessorArchitectureType__Group__1__Impl : ( ProcessorArchitecture ) ;
    public final void rule__ProcessorArchitectureType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4136:1: ( ( ProcessorArchitecture ) )
            // InternalDeviceParser.g:4137:1: ( ProcessorArchitecture )
            {
            // InternalDeviceParser.g:4137:1: ( ProcessorArchitecture )
            // InternalDeviceParser.g:4138:2: ProcessorArchitecture
            {
             before(grammarAccess.getProcessorArchitectureTypeAccess().getProcessorArchitectureKeyword_1()); 
            match(input,ProcessorArchitecture,FOLLOW_2); 
             after(grammarAccess.getProcessorArchitectureTypeAccess().getProcessorArchitectureKeyword_1()); 

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
    // $ANTLR end "rule__ProcessorArchitectureType__Group__1__Impl"


    // $ANTLR start "rule__LinuxOpertingSystemType__Group__0"
    // InternalDeviceParser.g:4148:1: rule__LinuxOpertingSystemType__Group__0 : rule__LinuxOpertingSystemType__Group__0__Impl rule__LinuxOpertingSystemType__Group__1 ;
    public final void rule__LinuxOpertingSystemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4152:1: ( rule__LinuxOpertingSystemType__Group__0__Impl rule__LinuxOpertingSystemType__Group__1 )
            // InternalDeviceParser.g:4153:2: rule__LinuxOpertingSystemType__Group__0__Impl rule__LinuxOpertingSystemType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__LinuxOpertingSystemType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinuxOpertingSystemType__Group__1();

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
    // $ANTLR end "rule__LinuxOpertingSystemType__Group__0"


    // $ANTLR start "rule__LinuxOpertingSystemType__Group__0__Impl"
    // InternalDeviceParser.g:4160:1: rule__LinuxOpertingSystemType__Group__0__Impl : ( () ) ;
    public final void rule__LinuxOpertingSystemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4164:1: ( ( () ) )
            // InternalDeviceParser.g:4165:1: ( () )
            {
            // InternalDeviceParser.g:4165:1: ( () )
            // InternalDeviceParser.g:4166:2: ()
            {
             before(grammarAccess.getLinuxOpertingSystemTypeAccess().getLinuxOpertingSystemTypeAction_0()); 
            // InternalDeviceParser.g:4167:2: ()
            // InternalDeviceParser.g:4167:3: 
            {
            }

             after(grammarAccess.getLinuxOpertingSystemTypeAccess().getLinuxOpertingSystemTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxOpertingSystemType__Group__0__Impl"


    // $ANTLR start "rule__LinuxOpertingSystemType__Group__1"
    // InternalDeviceParser.g:4175:1: rule__LinuxOpertingSystemType__Group__1 : rule__LinuxOpertingSystemType__Group__1__Impl ;
    public final void rule__LinuxOpertingSystemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4179:1: ( rule__LinuxOpertingSystemType__Group__1__Impl )
            // InternalDeviceParser.g:4180:2: rule__LinuxOpertingSystemType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinuxOpertingSystemType__Group__1__Impl();

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
    // $ANTLR end "rule__LinuxOpertingSystemType__Group__1"


    // $ANTLR start "rule__LinuxOpertingSystemType__Group__1__Impl"
    // InternalDeviceParser.g:4186:1: rule__LinuxOpertingSystemType__Group__1__Impl : ( Linux ) ;
    public final void rule__LinuxOpertingSystemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4190:1: ( ( Linux ) )
            // InternalDeviceParser.g:4191:1: ( Linux )
            {
            // InternalDeviceParser.g:4191:1: ( Linux )
            // InternalDeviceParser.g:4192:2: Linux
            {
             before(grammarAccess.getLinuxOpertingSystemTypeAccess().getLinuxKeyword_1()); 
            match(input,Linux,FOLLOW_2); 
             after(grammarAccess.getLinuxOpertingSystemTypeAccess().getLinuxKeyword_1()); 

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
    // $ANTLR end "rule__LinuxOpertingSystemType__Group__1__Impl"


    // $ANTLR start "rule__MacOSOpertingSystemType__Group__0"
    // InternalDeviceParser.g:4202:1: rule__MacOSOpertingSystemType__Group__0 : rule__MacOSOpertingSystemType__Group__0__Impl rule__MacOSOpertingSystemType__Group__1 ;
    public final void rule__MacOSOpertingSystemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4206:1: ( rule__MacOSOpertingSystemType__Group__0__Impl rule__MacOSOpertingSystemType__Group__1 )
            // InternalDeviceParser.g:4207:2: rule__MacOSOpertingSystemType__Group__0__Impl rule__MacOSOpertingSystemType__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__MacOSOpertingSystemType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacOSOpertingSystemType__Group__1();

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
    // $ANTLR end "rule__MacOSOpertingSystemType__Group__0"


    // $ANTLR start "rule__MacOSOpertingSystemType__Group__0__Impl"
    // InternalDeviceParser.g:4214:1: rule__MacOSOpertingSystemType__Group__0__Impl : ( () ) ;
    public final void rule__MacOSOpertingSystemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4218:1: ( ( () ) )
            // InternalDeviceParser.g:4219:1: ( () )
            {
            // InternalDeviceParser.g:4219:1: ( () )
            // InternalDeviceParser.g:4220:2: ()
            {
             before(grammarAccess.getMacOSOpertingSystemTypeAccess().getMacOSOpertingSystemTypeAction_0()); 
            // InternalDeviceParser.g:4221:2: ()
            // InternalDeviceParser.g:4221:3: 
            {
            }

             after(grammarAccess.getMacOSOpertingSystemTypeAccess().getMacOSOpertingSystemTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOSOpertingSystemType__Group__0__Impl"


    // $ANTLR start "rule__MacOSOpertingSystemType__Group__1"
    // InternalDeviceParser.g:4229:1: rule__MacOSOpertingSystemType__Group__1 : rule__MacOSOpertingSystemType__Group__1__Impl ;
    public final void rule__MacOSOpertingSystemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4233:1: ( rule__MacOSOpertingSystemType__Group__1__Impl )
            // InternalDeviceParser.g:4234:2: rule__MacOSOpertingSystemType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MacOSOpertingSystemType__Group__1__Impl();

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
    // $ANTLR end "rule__MacOSOpertingSystemType__Group__1"


    // $ANTLR start "rule__MacOSOpertingSystemType__Group__1__Impl"
    // InternalDeviceParser.g:4240:1: rule__MacOSOpertingSystemType__Group__1__Impl : ( MacOS ) ;
    public final void rule__MacOSOpertingSystemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4244:1: ( ( MacOS ) )
            // InternalDeviceParser.g:4245:1: ( MacOS )
            {
            // InternalDeviceParser.g:4245:1: ( MacOS )
            // InternalDeviceParser.g:4246:2: MacOS
            {
             before(grammarAccess.getMacOSOpertingSystemTypeAccess().getMacOSKeyword_1()); 
            match(input,MacOS,FOLLOW_2); 
             after(grammarAccess.getMacOSOpertingSystemTypeAccess().getMacOSKeyword_1()); 

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
    // $ANTLR end "rule__MacOSOpertingSystemType__Group__1__Impl"


    // $ANTLR start "rule__X86ProcessorArchitecture__Group__0"
    // InternalDeviceParser.g:4256:1: rule__X86ProcessorArchitecture__Group__0 : rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 ;
    public final void rule__X86ProcessorArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4260:1: ( rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 )
            // InternalDeviceParser.g:4261:2: rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDeviceParser.g:4268:1: rule__X86ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__X86ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4272:1: ( ( () ) )
            // InternalDeviceParser.g:4273:1: ( () )
            {
            // InternalDeviceParser.g:4273:1: ( () )
            // InternalDeviceParser.g:4274:2: ()
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0()); 
            // InternalDeviceParser.g:4275:2: ()
            // InternalDeviceParser.g:4275:3: 
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
    // InternalDeviceParser.g:4283:1: rule__X86ProcessorArchitecture__Group__1 : rule__X86ProcessorArchitecture__Group__1__Impl ;
    public final void rule__X86ProcessorArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4287:1: ( rule__X86ProcessorArchitecture__Group__1__Impl )
            // InternalDeviceParser.g:4288:2: rule__X86ProcessorArchitecture__Group__1__Impl
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
    // InternalDeviceParser.g:4294:1: rule__X86ProcessorArchitecture__Group__1__Impl : ( X86ProcessorArchitecture ) ;
    public final void rule__X86ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4298:1: ( ( X86ProcessorArchitecture ) )
            // InternalDeviceParser.g:4299:1: ( X86ProcessorArchitecture )
            {
            // InternalDeviceParser.g:4299:1: ( X86ProcessorArchitecture )
            // InternalDeviceParser.g:4300:2: X86ProcessorArchitecture
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
    // InternalDeviceParser.g:4310:1: rule__Arm64ProcessorArchitecture__Group__0 : rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 ;
    public final void rule__Arm64ProcessorArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4314:1: ( rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 )
            // InternalDeviceParser.g:4315:2: rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:4322:1: rule__Arm64ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4326:1: ( ( () ) )
            // InternalDeviceParser.g:4327:1: ( () )
            {
            // InternalDeviceParser.g:4327:1: ( () )
            // InternalDeviceParser.g:4328:2: ()
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0()); 
            // InternalDeviceParser.g:4329:2: ()
            // InternalDeviceParser.g:4329:3: 
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
    // InternalDeviceParser.g:4337:1: rule__Arm64ProcessorArchitecture__Group__1 : rule__Arm64ProcessorArchitecture__Group__1__Impl ;
    public final void rule__Arm64ProcessorArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4341:1: ( rule__Arm64ProcessorArchitecture__Group__1__Impl )
            // InternalDeviceParser.g:4342:2: rule__Arm64ProcessorArchitecture__Group__1__Impl
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
    // InternalDeviceParser.g:4348:1: rule__Arm64ProcessorArchitecture__Group__1__Impl : ( Arm64ProcessorArchitecture ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4352:1: ( ( Arm64ProcessorArchitecture ) )
            // InternalDeviceParser.g:4353:1: ( Arm64ProcessorArchitecture )
            {
            // InternalDeviceParser.g:4353:1: ( Arm64ProcessorArchitecture )
            // InternalDeviceParser.g:4354:2: Arm64ProcessorArchitecture
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
    // InternalDeviceParser.g:4364:1: rule__CommunicationType__Group__0 : rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 ;
    public final void rule__CommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4368:1: ( rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 )
            // InternalDeviceParser.g:4369:2: rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeviceParser.g:4376:1: rule__CommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4380:1: ( ( () ) )
            // InternalDeviceParser.g:4381:1: ( () )
            {
            // InternalDeviceParser.g:4381:1: ( () )
            // InternalDeviceParser.g:4382:2: ()
            {
             before(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0()); 
            // InternalDeviceParser.g:4383:2: ()
            // InternalDeviceParser.g:4383:3: 
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
    // InternalDeviceParser.g:4391:1: rule__CommunicationType__Group__1 : rule__CommunicationType__Group__1__Impl ;
    public final void rule__CommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4395:1: ( rule__CommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:4396:2: rule__CommunicationType__Group__1__Impl
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
    // InternalDeviceParser.g:4402:1: rule__CommunicationType__Group__1__Impl : ( ( rule__CommunicationType__NameAssignment_1 ) ) ;
    public final void rule__CommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4406:1: ( ( ( rule__CommunicationType__NameAssignment_1 ) ) )
            // InternalDeviceParser.g:4407:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            {
            // InternalDeviceParser.g:4407:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            // InternalDeviceParser.g:4408:2: ( rule__CommunicationType__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1()); 
            // InternalDeviceParser.g:4409:2: ( rule__CommunicationType__NameAssignment_1 )
            // InternalDeviceParser.g:4409:3: rule__CommunicationType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1()); 

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
    // InternalDeviceParser.g:4418:1: rule__EthernetCommunicationType__Group__0 : rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 ;
    public final void rule__EthernetCommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4422:1: ( rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 )
            // InternalDeviceParser.g:4423:2: rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDeviceParser.g:4430:1: rule__EthernetCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__EthernetCommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4434:1: ( ( () ) )
            // InternalDeviceParser.g:4435:1: ( () )
            {
            // InternalDeviceParser.g:4435:1: ( () )
            // InternalDeviceParser.g:4436:2: ()
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeAction_0()); 
            // InternalDeviceParser.g:4437:2: ()
            // InternalDeviceParser.g:4437:3: 
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
    // InternalDeviceParser.g:4445:1: rule__EthernetCommunicationType__Group__1 : rule__EthernetCommunicationType__Group__1__Impl ;
    public final void rule__EthernetCommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4449:1: ( rule__EthernetCommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:4450:2: rule__EthernetCommunicationType__Group__1__Impl
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
    // InternalDeviceParser.g:4456:1: rule__EthernetCommunicationType__Group__1__Impl : ( Ethernet ) ;
    public final void rule__EthernetCommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4460:1: ( ( Ethernet ) )
            // InternalDeviceParser.g:4461:1: ( Ethernet )
            {
            // InternalDeviceParser.g:4461:1: ( Ethernet )
            // InternalDeviceParser.g:4462:2: Ethernet
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetKeyword_1()); 
            match(input,Ethernet,FOLLOW_2); 
             after(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetKeyword_1()); 

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
    // InternalDeviceParser.g:4472:1: rule__WlanCommunicationType__Group__0 : rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 ;
    public final void rule__WlanCommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4476:1: ( rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 )
            // InternalDeviceParser.g:4477:2: rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDeviceParser.g:4484:1: rule__WlanCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__WlanCommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4488:1: ( ( () ) )
            // InternalDeviceParser.g:4489:1: ( () )
            {
            // InternalDeviceParser.g:4489:1: ( () )
            // InternalDeviceParser.g:4490:2: ()
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeAction_0()); 
            // InternalDeviceParser.g:4491:2: ()
            // InternalDeviceParser.g:4491:3: 
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
    // InternalDeviceParser.g:4499:1: rule__WlanCommunicationType__Group__1 : rule__WlanCommunicationType__Group__1__Impl ;
    public final void rule__WlanCommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4503:1: ( rule__WlanCommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:4504:2: rule__WlanCommunicationType__Group__1__Impl
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
    // InternalDeviceParser.g:4510:1: rule__WlanCommunicationType__Group__1__Impl : ( Wlan ) ;
    public final void rule__WlanCommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4514:1: ( ( Wlan ) )
            // InternalDeviceParser.g:4515:1: ( Wlan )
            {
            // InternalDeviceParser.g:4515:1: ( Wlan )
            // InternalDeviceParser.g:4516:2: Wlan
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getWlanKeyword_1()); 
            match(input,Wlan,FOLLOW_2); 
             after(grammarAccess.getWlanCommunicationTypeAccess().getWlanKeyword_1()); 

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
    // InternalDeviceParser.g:4526:1: rule__DeviceSet__DeviceAssignment : ( ruleDeviceType ) ;
    public final void rule__DeviceSet__DeviceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4530:1: ( ( ruleDeviceType ) )
            // InternalDeviceParser.g:4531:2: ( ruleDeviceType )
            {
            // InternalDeviceParser.g:4531:2: ( ruleDeviceType )
            // InternalDeviceParser.g:4532:3: ruleDeviceType
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


    // $ANTLR start "rule__InterfaceNetworkProperty__ValueAssignment_4_2"
    // InternalDeviceParser.g:4541:1: rule__InterfaceNetworkProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__InterfaceNetworkProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4545:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:4546:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:4546:2: ( rulePropertyValue )
            // InternalDeviceParser.g:4547:3: rulePropertyValue
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__InterfaceNetworkProperty__ValueAssignment_4_2"


    // $ANTLR start "rule__AddressNetworkProperty__ValueAssignment_4_2"
    // InternalDeviceParser.g:4556:1: rule__AddressNetworkProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__AddressNetworkProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4560:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:4561:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:4561:2: ( rulePropertyValue )
            // InternalDeviceParser.g:4562:3: rulePropertyValue
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__AddressNetworkProperty__ValueAssignment_4_2"


    // $ANTLR start "rule__DeviceType_Impl__NameAssignment_4"
    // InternalDeviceParser.g:4571:1: rule__DeviceType_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__DeviceType_Impl__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4575:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4576:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4576:2: ( ruleEString )
            // InternalDeviceParser.g:4577:3: ruleEString
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
    // InternalDeviceParser.g:4586:1: rule__DeviceType_Impl__CapabilityAssignment_5_2 : ( ruleCapabilityProperty ) ;
    public final void rule__DeviceType_Impl__CapabilityAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4590:1: ( ( ruleCapabilityProperty ) )
            // InternalDeviceParser.g:4591:2: ( ruleCapabilityProperty )
            {
            // InternalDeviceParser.g:4591:2: ( ruleCapabilityProperty )
            // InternalDeviceParser.g:4592:3: ruleCapabilityProperty
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
    // InternalDeviceParser.g:4601:1: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4605:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalDeviceParser.g:4606:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalDeviceParser.g:4606:2: ( ruleAbstractCommunicationConnection )
            // InternalDeviceParser.g:4607:3: ruleAbstractCommunicationConnection
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
    // InternalDeviceParser.g:4616:1: rule__ComputationDeviceType__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComputationDeviceType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4620:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4621:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4621:2: ( ruleEString )
            // InternalDeviceParser.g:4622:3: ruleEString
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


    // $ANTLR start "rule__ComputationDeviceType__CapabilityAssignment_4_2"
    // InternalDeviceParser.g:4631:1: rule__ComputationDeviceType__CapabilityAssignment_4_2 : ( ruleCapabilityProperty ) ;
    public final void rule__ComputationDeviceType__CapabilityAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4635:1: ( ( ruleCapabilityProperty ) )
            // InternalDeviceParser.g:4636:2: ( ruleCapabilityProperty )
            {
            // InternalDeviceParser.g:4636:2: ( ruleCapabilityProperty )
            // InternalDeviceParser.g:4637:3: ruleCapabilityProperty
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCapabilityProperty();

            state._fsp--;

             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__ComputationDeviceType__CapabilityAssignment_4_2"


    // $ANTLR start "rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2"
    // InternalDeviceParser.g:4646:1: rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4650:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalDeviceParser.g:4651:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalDeviceParser.g:4651:2: ( ruleAbstractCommunicationConnection )
            // InternalDeviceParser.g:4652:3: ruleAbstractCommunicationConnection
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractCommunicationConnection();

            state._fsp--;

             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2"


    // $ANTLR start "rule__CapabilityProperty__NameAssignment_2"
    // InternalDeviceParser.g:4661:1: rule__CapabilityProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CapabilityProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4665:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4666:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4666:2: ( ruleEString )
            // InternalDeviceParser.g:4667:3: ruleEString
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


    // $ANTLR start "rule__CapabilityProperty__KindAssignment_5"
    // InternalDeviceParser.g:4676:1: rule__CapabilityProperty__KindAssignment_5 : ( ruleCapabilityKind ) ;
    public final void rule__CapabilityProperty__KindAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4680:1: ( ( ruleCapabilityKind ) )
            // InternalDeviceParser.g:4681:2: ( ruleCapabilityKind )
            {
            // InternalDeviceParser.g:4681:2: ( ruleCapabilityKind )
            // InternalDeviceParser.g:4682:3: ruleCapabilityKind
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCapabilityKind();

            state._fsp--;

             after(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__CapabilityProperty__KindAssignment_5"


    // $ANTLR start "rule__CapabilityProperty__TypeAssignment_7"
    // InternalDeviceParser.g:4691:1: rule__CapabilityProperty__TypeAssignment_7 : ( ruleAbstractResouceType ) ;
    public final void rule__CapabilityProperty__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4695:1: ( ( ruleAbstractResouceType ) )
            // InternalDeviceParser.g:4696:2: ( ruleAbstractResouceType )
            {
            // InternalDeviceParser.g:4696:2: ( ruleAbstractResouceType )
            // InternalDeviceParser.g:4697:3: ruleAbstractResouceType
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeAbstractResouceTypeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractResouceType();

            state._fsp--;

             after(grammarAccess.getCapabilityPropertyAccess().getTypeAbstractResouceTypeParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__CapabilityProperty__TypeAssignment_7"


    // $ANTLR start "rule__CapabilityProperty__ValueAssignment_8_1"
    // InternalDeviceParser.g:4706:1: rule__CapabilityProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__CapabilityProperty__ValueAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4710:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:4711:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:4711:2: ( rulePropertyValue )
            // InternalDeviceParser.g:4712:3: rulePropertyValue
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
    // InternalDeviceParser.g:4721:1: rule__ConnectionProperty__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ConnectionProperty__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4725:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4726:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4726:2: ( ruleEString )
            // InternalDeviceParser.g:4727:3: ruleEString
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
    // InternalDeviceParser.g:4736:1: rule__ConnectionProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__ConnectionProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4740:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:4741:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:4741:2: ( rulePropertyValue )
            // InternalDeviceParser.g:4742:3: rulePropertyValue
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
    // InternalDeviceParser.g:4751:1: rule__NetworkConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__NetworkConnection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4755:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4756:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4756:2: ( ruleEString )
            // InternalDeviceParser.g:4757:3: ruleEString
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
    // InternalDeviceParser.g:4766:1: rule__NetworkConnection__TypeAssignment_6 : ( ruleNetworkCommunicationType ) ;
    public final void rule__NetworkConnection__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4770:1: ( ( ruleNetworkCommunicationType ) )
            // InternalDeviceParser.g:4771:2: ( ruleNetworkCommunicationType )
            {
            // InternalDeviceParser.g:4771:2: ( ruleNetworkCommunicationType )
            // InternalDeviceParser.g:4772:3: ruleNetworkCommunicationType
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkCommunicationType();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0()); 

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
    // InternalDeviceParser.g:4781:1: rule__NetworkConnection__PropertiesAssignment_7_2 : ( ruleAbstractNetworkProperty ) ;
    public final void rule__NetworkConnection__PropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4785:1: ( ( ruleAbstractNetworkProperty ) )
            // InternalDeviceParser.g:4786:2: ( ruleAbstractNetworkProperty )
            {
            // InternalDeviceParser.g:4786:2: ( ruleAbstractNetworkProperty )
            // InternalDeviceParser.g:4787:3: ruleAbstractNetworkProperty
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
    // InternalDeviceParser.g:4796:1: rule__CommunicationConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__CommunicationConnection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4800:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4801:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4801:2: ( ruleEString )
            // InternalDeviceParser.g:4802:3: ruleEString
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
    // InternalDeviceParser.g:4811:1: rule__CommunicationConnection__TypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__CommunicationConnection__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4815:1: ( ( ( ruleEString ) ) )
            // InternalDeviceParser.g:4816:2: ( ( ruleEString ) )
            {
            // InternalDeviceParser.g:4816:2: ( ( ruleEString ) )
            // InternalDeviceParser.g:4817:3: ( ruleEString )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeCrossReference_6_0()); 
            // InternalDeviceParser.g:4818:3: ( ruleEString )
            // InternalDeviceParser.g:4819:4: ruleEString
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
    // InternalDeviceParser.g:4830:1: rule__CommunicationConnection__PropertiesAssignment_7_2 : ( ruleConnectionProperty ) ;
    public final void rule__CommunicationConnection__PropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4834:1: ( ( ruleConnectionProperty ) )
            // InternalDeviceParser.g:4835:2: ( ruleConnectionProperty )
            {
            // InternalDeviceParser.g:4835:2: ( ruleConnectionProperty )
            // InternalDeviceParser.g:4836:3: ruleConnectionProperty
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
    // InternalDeviceParser.g:4845:1: rule__PropertyValueInt__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__PropertyValueInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4849:1: ( ( ruleInteger0 ) )
            // InternalDeviceParser.g:4850:2: ( ruleInteger0 )
            {
            // InternalDeviceParser.g:4850:2: ( ruleInteger0 )
            // InternalDeviceParser.g:4851:3: ruleInteger0
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
    // InternalDeviceParser.g:4860:1: rule__PropertyValueDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__PropertyValueDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4864:1: ( ( ruleDouble0 ) )
            // InternalDeviceParser.g:4865:2: ( ruleDouble0 )
            {
            // InternalDeviceParser.g:4865:2: ( ruleDouble0 )
            // InternalDeviceParser.g:4866:3: ruleDouble0
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
    // InternalDeviceParser.g:4875:1: rule__PropertyValueString__ValueAssignment : ( ruleEString ) ;
    public final void rule__PropertyValueString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4879:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4880:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4880:2: ( ruleEString )
            // InternalDeviceParser.g:4881:3: ruleEString
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


    // $ANTLR start "rule__CommunicationType__NameAssignment_1"
    // InternalDeviceParser.g:4890:1: rule__CommunicationType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CommunicationType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDeviceParser.g:4894:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:4895:2: ( ruleEString )
            {
            // InternalDeviceParser.g:4895:2: ( ruleEString )
            // InternalDeviceParser.g:4896:3: ruleEString
            {
             before(grammarAccess.getCommunicationTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommunicationTypeAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CommunicationType__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000A00C0000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000004040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003600L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000300100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L});

}