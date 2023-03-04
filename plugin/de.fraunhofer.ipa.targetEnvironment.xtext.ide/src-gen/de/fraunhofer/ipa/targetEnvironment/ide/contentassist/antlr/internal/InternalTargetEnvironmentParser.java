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
import de.fraunhofer.ipa.targetEnvironment.services.TargetEnvironmentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetEnvironmentParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arm64ProcessorArchitecture", "EthernetCommunicationType", "X86ProcessorArchitecture", "CommunicationConnection", "TargetDeployEnviroment", "ComputationDeviceType", "ProcessorArchitecture", "RefConnectionProperty", "WlanCommunicationType", "LinuxOpertingSystem", "CommunicationType", "ConfigConnection", "OperatingSystem", "Configuration", "ConnectDevice", "IncludeDevice", "RefConnection", "RefDeviceType", "AttributeKind", "SelectionKind", "DeviceType", "MaximumKind", "MinimumKind", "ResouceType", "Capability", "Properties", "RefDevice", "Interface", "Address", "Value", "Kind", "Name", "Type", "HyphenMinus", "RightCurlyBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=44;
    public static final int Configuration=17;
    public static final int Address=32;
    public static final int RULE_DATE_TIME=49;
    public static final int RULE_BOOLEAN=41;
    public static final int AttributeKind=22;
    public static final int RULE_YEAR=46;
    public static final int RefDeviceType=21;
    public static final int Name=35;
    public static final int RULE_MIN_SEC=48;
    public static final int WlanCommunicationType=12;
    public static final int Kind=34;
    public static final int ConnectDevice=18;
    public static final int RULE_DEDENT=52;
    public static final int LinuxOpertingSystem=13;
    public static final int Capability=28;
    public static final int RULE_ID=53;
    public static final int ConfigConnection=15;
    public static final int RULE_DIGIT=39;
    public static final int SelectionKind=23;
    public static final int Arm64ProcessorArchitecture=4;
    public static final int DeviceType=24;
    public static final int TargetDeployEnviroment=8;
    public static final int RULE_INT=54;
    public static final int Value=33;
    public static final int RULE_ML_COMMENT=56;
    public static final int OperatingSystem=16;
    public static final int RefConnectionProperty=11;
    public static final int ProcessorArchitecture=10;
    public static final int RULE_STRING=55;
    public static final int Properties=29;
    public static final int RULE_SL_COMMENT=50;
    public static final int CommunicationConnection=7;
    public static final int HyphenMinus=37;
    public static final int RULE_DOUBLE=43;
    public static final int ResouceType=27;
    public static final int RightCurlyBracket=38;
    public static final int RULE_DECINT=42;
    public static final int MinimumKind=26;
    public static final int EOF=-1;
    public static final int RULE_INDENT=51;
    public static final int RULE_HOUR=47;
    public static final int RefDevice=30;
    public static final int EthernetCommunicationType=5;
    public static final int RULE_WS=57;
    public static final int MaximumKind=25;
    public static final int RULE_ANY_OTHER=58;
    public static final int ComputationDeviceType=9;
    public static final int CommunicationType=14;
    public static final int RefConnection=20;
    public static final int Type=36;
    public static final int X86ProcessorArchitecture=6;
    public static final int RULE_MONTH=45;
    public static final int RULE_BINARY=40;
    public static final int IncludeDevice=19;
    public static final int Interface=31;

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
    		tokenNameToValue.put("RefDevice", "'refDevice:'");
    		tokenNameToValue.put("DeviceType", "'DeviceType:'");
    		tokenNameToValue.put("MaximumKind", "'MaximumKind'");
    		tokenNameToValue.put("MinimumKind", "'MinimumKind'");
    		tokenNameToValue.put("ResouceType", "'ResouceType'");
    		tokenNameToValue.put("Capability", "'capability:'");
    		tokenNameToValue.put("Properties", "'properties:'");
    		tokenNameToValue.put("AttributeKind", "'AttributeKind'");
    		tokenNameToValue.put("SelectionKind", "'SelectionKind'");
    		tokenNameToValue.put("Configuration", "'configuration:'");
    		tokenNameToValue.put("ConnectDevice", "'connectDevice:'");
    		tokenNameToValue.put("IncludeDevice", "'includeDevice:'");
    		tokenNameToValue.put("RefConnection", "'refConnection:'");
    		tokenNameToValue.put("RefDeviceType", "'refDeviceType:'");
    		tokenNameToValue.put("OperatingSystem", "'operatingSystem:'");
    		tokenNameToValue.put("CommunicationType", "'CommunicationType'");
    		tokenNameToValue.put("ConfigConnection", "'configConnection:'");
    		tokenNameToValue.put("LinuxOpertingSystem", "'LinuxOpertingSystem'");
    		tokenNameToValue.put("WlanCommunicationType", "'WlanCommunicationType'");
    		tokenNameToValue.put("ComputationDeviceType", "'ComputationDeviceType:'");
    		tokenNameToValue.put("ProcessorArchitecture", "'processorArchitecture:'");
    		tokenNameToValue.put("RefConnectionProperty", "'refConnectionProperty:'");
    		tokenNameToValue.put("TargetDeployEnviroment", "'TargetDeployEnviroment:'");
    		tokenNameToValue.put("X86ProcessorArchitecture", "'X86ProcessorArchitecture'");
    		tokenNameToValue.put("CommunicationConnection", "'communicationConnection:'");
    		tokenNameToValue.put("EthernetCommunicationType", "'EthernetCommunicationType'");
    		tokenNameToValue.put("Arm64ProcessorArchitecture", "'Arm64ProcessorArchitecture'");
    	}

    	public void setGrammarAccess(TargetEnvironmentGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTargetEnvironment"
    // InternalTargetEnvironmentParser.g:90:1: entryRuleTargetEnvironment : ruleTargetEnvironment EOF ;
    public final void entryRuleTargetEnvironment() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:91:1: ( ruleTargetEnvironment EOF )
            // InternalTargetEnvironmentParser.g:92:1: ruleTargetEnvironment EOF
            {
             before(grammarAccess.getTargetEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetEnvironment();

            state._fsp--;

             after(grammarAccess.getTargetEnvironmentRule()); 
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
    // $ANTLR end "entryRuleTargetEnvironment"


    // $ANTLR start "ruleTargetEnvironment"
    // InternalTargetEnvironmentParser.g:99:1: ruleTargetEnvironment : ( ( rule__TargetEnvironment__Group__0 ) ) ;
    public final void ruleTargetEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:103:2: ( ( ( rule__TargetEnvironment__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:104:2: ( ( rule__TargetEnvironment__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:104:2: ( ( rule__TargetEnvironment__Group__0 ) )
            // InternalTargetEnvironmentParser.g:105:3: ( rule__TargetEnvironment__Group__0 )
            {
             before(grammarAccess.getTargetEnvironmentAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:106:3: ( rule__TargetEnvironment__Group__0 )
            // InternalTargetEnvironmentParser.g:106:4: rule__TargetEnvironment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetEnvironment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetEnvironmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetEnvironment"


    // $ANTLR start "entryRuleDescription"
    // InternalTargetEnvironmentParser.g:115:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:116:1: ( ruleDescription EOF )
            // InternalTargetEnvironmentParser.g:117:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalTargetEnvironmentParser.g:124:1: ruleDescription : ( ( rule__Description__Alternatives ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:128:2: ( ( ( rule__Description__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:129:2: ( ( rule__Description__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:129:2: ( ( rule__Description__Alternatives ) )
            // InternalTargetEnvironmentParser.g:130:3: ( rule__Description__Alternatives )
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:131:3: ( rule__Description__Alternatives )
            // InternalTargetEnvironmentParser.g:131:4: rule__Description__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Description__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTargetDeployEnviroment"
    // InternalTargetEnvironmentParser.g:140:1: entryRuleTargetDeployEnviroment : ruleTargetDeployEnviroment EOF ;
    public final void entryRuleTargetDeployEnviroment() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:141:1: ( ruleTargetDeployEnviroment EOF )
            // InternalTargetEnvironmentParser.g:142:1: ruleTargetDeployEnviroment EOF
            {
             before(grammarAccess.getTargetDeployEnviromentRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetDeployEnviroment();

            state._fsp--;

             after(grammarAccess.getTargetDeployEnviromentRule()); 
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
    // $ANTLR end "entryRuleTargetDeployEnviroment"


    // $ANTLR start "ruleTargetDeployEnviroment"
    // InternalTargetEnvironmentParser.g:149:1: ruleTargetDeployEnviroment : ( ( rule__TargetDeployEnviroment__Group__0 ) ) ;
    public final void ruleTargetDeployEnviroment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:153:2: ( ( ( rule__TargetDeployEnviroment__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:154:2: ( ( rule__TargetDeployEnviroment__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:154:2: ( ( rule__TargetDeployEnviroment__Group__0 ) )
            // InternalTargetEnvironmentParser.g:155:3: ( rule__TargetDeployEnviroment__Group__0 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:156:3: ( rule__TargetDeployEnviroment__Group__0 )
            // InternalTargetEnvironmentParser.g:156:4: rule__TargetDeployEnviroment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetDeployEnviroment"


    // $ANTLR start "entryRuleDeviceInstance"
    // InternalTargetEnvironmentParser.g:165:1: entryRuleDeviceInstance : ruleDeviceInstance EOF ;
    public final void entryRuleDeviceInstance() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:166:1: ( ruleDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:167:1: ruleDeviceInstance EOF
            {
             before(grammarAccess.getDeviceInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceInstance();

            state._fsp--;

             after(grammarAccess.getDeviceInstanceRule()); 
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
    // $ANTLR end "entryRuleDeviceInstance"


    // $ANTLR start "ruleDeviceInstance"
    // InternalTargetEnvironmentParser.g:174:1: ruleDeviceInstance : ( ( rule__DeviceInstance__Group__0 ) ) ;
    public final void ruleDeviceInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:178:2: ( ( ( rule__DeviceInstance__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:179:2: ( ( rule__DeviceInstance__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:179:2: ( ( rule__DeviceInstance__Group__0 ) )
            // InternalTargetEnvironmentParser.g:180:3: ( rule__DeviceInstance__Group__0 )
            {
             before(grammarAccess.getDeviceInstanceAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:181:3: ( rule__DeviceInstance__Group__0 )
            // InternalTargetEnvironmentParser.g:181:4: rule__DeviceInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceInstance"


    // $ANTLR start "entryRuleConfigConnection"
    // InternalTargetEnvironmentParser.g:190:1: entryRuleConfigConnection : ruleConfigConnection EOF ;
    public final void entryRuleConfigConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:191:1: ( ruleConfigConnection EOF )
            // InternalTargetEnvironmentParser.g:192:1: ruleConfigConnection EOF
            {
             before(grammarAccess.getConfigConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigConnection();

            state._fsp--;

             after(grammarAccess.getConfigConnectionRule()); 
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
    // $ANTLR end "entryRuleConfigConnection"


    // $ANTLR start "ruleConfigConnection"
    // InternalTargetEnvironmentParser.g:199:1: ruleConfigConnection : ( ( rule__ConfigConnection__Group__0 ) ) ;
    public final void ruleConfigConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:203:2: ( ( ( rule__ConfigConnection__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:204:2: ( ( rule__ConfigConnection__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:204:2: ( ( rule__ConfigConnection__Group__0 ) )
            // InternalTargetEnvironmentParser.g:205:3: ( rule__ConfigConnection__Group__0 )
            {
             before(grammarAccess.getConfigConnectionAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:206:3: ( rule__ConfigConnection__Group__0 )
            // InternalTargetEnvironmentParser.g:206:4: rule__ConfigConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigConnection"


    // $ANTLR start "entryRuleConnectedDevice"
    // InternalTargetEnvironmentParser.g:215:1: entryRuleConnectedDevice : ruleConnectedDevice EOF ;
    public final void entryRuleConnectedDevice() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:216:1: ( ruleConnectedDevice EOF )
            // InternalTargetEnvironmentParser.g:217:1: ruleConnectedDevice EOF
            {
             before(grammarAccess.getConnectedDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectedDevice();

            state._fsp--;

             after(grammarAccess.getConnectedDeviceRule()); 
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
    // $ANTLR end "entryRuleConnectedDevice"


    // $ANTLR start "ruleConnectedDevice"
    // InternalTargetEnvironmentParser.g:224:1: ruleConnectedDevice : ( ( rule__ConnectedDevice__Group__0 ) ) ;
    public final void ruleConnectedDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:228:2: ( ( ( rule__ConnectedDevice__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:229:2: ( ( rule__ConnectedDevice__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:229:2: ( ( rule__ConnectedDevice__Group__0 ) )
            // InternalTargetEnvironmentParser.g:230:3: ( rule__ConnectedDevice__Group__0 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:231:3: ( rule__ConnectedDevice__Group__0 )
            // InternalTargetEnvironmentParser.g:231:4: rule__ConnectedDevice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectedDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectedDevice"


    // $ANTLR start "entryRuleConfigConnectionProperty"
    // InternalTargetEnvironmentParser.g:240:1: entryRuleConfigConnectionProperty : ruleConfigConnectionProperty EOF ;
    public final void entryRuleConfigConnectionProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:241:1: ( ruleConfigConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:242:1: ruleConfigConnectionProperty EOF
            {
             before(grammarAccess.getConfigConnectionPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigConnectionProperty();

            state._fsp--;

             after(grammarAccess.getConfigConnectionPropertyRule()); 
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
    // $ANTLR end "entryRuleConfigConnectionProperty"


    // $ANTLR start "ruleConfigConnectionProperty"
    // InternalTargetEnvironmentParser.g:249:1: ruleConfigConnectionProperty : ( ( rule__ConfigConnectionProperty__Group__0 ) ) ;
    public final void ruleConfigConnectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:253:2: ( ( ( rule__ConfigConnectionProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:254:2: ( ( rule__ConfigConnectionProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:254:2: ( ( rule__ConfigConnectionProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:255:3: ( rule__ConfigConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:256:3: ( rule__ConfigConnectionProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:256:4: rule__ConfigConnectionProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigConnectionPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigConnectionProperty"


    // $ANTLR start "entryRuleDeviceSet"
    // InternalTargetEnvironmentParser.g:265:1: entryRuleDeviceSet : ruleDeviceSet EOF ;
    public final void entryRuleDeviceSet() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:266:1: ( ruleDeviceSet EOF )
            // InternalTargetEnvironmentParser.g:267:1: ruleDeviceSet EOF
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
    // InternalTargetEnvironmentParser.g:274:1: ruleDeviceSet : ( ( rule__DeviceSet__DeviceAssignment )* ) ;
    public final void ruleDeviceSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:278:2: ( ( ( rule__DeviceSet__DeviceAssignment )* ) )
            // InternalTargetEnvironmentParser.g:279:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            {
            // InternalTargetEnvironmentParser.g:279:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            // InternalTargetEnvironmentParser.g:280:3: ( rule__DeviceSet__DeviceAssignment )*
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceAssignment()); 
            // InternalTargetEnvironmentParser.g:281:3: ( rule__DeviceSet__DeviceAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ComputationDeviceType||LA1_0==DeviceType) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:281:4: rule__DeviceSet__DeviceAssignment
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
    // InternalTargetEnvironmentParser.g:290:1: entryRuleCapabilityKind : ruleCapabilityKind EOF ;
    public final void entryRuleCapabilityKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:291:1: ( ruleCapabilityKind EOF )
            // InternalTargetEnvironmentParser.g:292:1: ruleCapabilityKind EOF
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
    // InternalTargetEnvironmentParser.g:299:1: ruleCapabilityKind : ( ( rule__CapabilityKind__Alternatives ) ) ;
    public final void ruleCapabilityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:303:2: ( ( ( rule__CapabilityKind__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:304:2: ( ( rule__CapabilityKind__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:304:2: ( ( rule__CapabilityKind__Alternatives ) )
            // InternalTargetEnvironmentParser.g:305:3: ( rule__CapabilityKind__Alternatives )
            {
             before(grammarAccess.getCapabilityKindAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:306:3: ( rule__CapabilityKind__Alternatives )
            // InternalTargetEnvironmentParser.g:306:4: rule__CapabilityKind__Alternatives
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
    // InternalTargetEnvironmentParser.g:315:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:316:1: ( ruleDeviceType EOF )
            // InternalTargetEnvironmentParser.g:317:1: ruleDeviceType EOF
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
    // InternalTargetEnvironmentParser.g:324:1: ruleDeviceType : ( ( rule__DeviceType__Alternatives ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:328:2: ( ( ( rule__DeviceType__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:329:2: ( ( rule__DeviceType__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:329:2: ( ( rule__DeviceType__Alternatives ) )
            // InternalTargetEnvironmentParser.g:330:3: ( rule__DeviceType__Alternatives )
            {
             before(grammarAccess.getDeviceTypeAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:331:3: ( rule__DeviceType__Alternatives )
            // InternalTargetEnvironmentParser.g:331:4: rule__DeviceType__Alternatives
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
    // InternalTargetEnvironmentParser.g:340:1: entryRuleAbstractCommunicationConnection : ruleAbstractCommunicationConnection EOF ;
    public final void entryRuleAbstractCommunicationConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:341:1: ( ruleAbstractCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:342:1: ruleAbstractCommunicationConnection EOF
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
    // InternalTargetEnvironmentParser.g:349:1: ruleAbstractCommunicationConnection : ( ( rule__AbstractCommunicationConnection__Alternatives ) ) ;
    public final void ruleAbstractCommunicationConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:353:2: ( ( ( rule__AbstractCommunicationConnection__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:354:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:354:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            // InternalTargetEnvironmentParser.g:355:3: ( rule__AbstractCommunicationConnection__Alternatives )
            {
             before(grammarAccess.getAbstractCommunicationConnectionAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:356:3: ( rule__AbstractCommunicationConnection__Alternatives )
            // InternalTargetEnvironmentParser.g:356:4: rule__AbstractCommunicationConnection__Alternatives
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
    // InternalTargetEnvironmentParser.g:365:1: entryRuleAbstractNetworkProperty : ruleAbstractNetworkProperty EOF ;
    public final void entryRuleAbstractNetworkProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:366:1: ( ruleAbstractNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:367:1: ruleAbstractNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:374:1: ruleAbstractNetworkProperty : ( ( rule__AbstractNetworkProperty__Alternatives ) ) ;
    public final void ruleAbstractNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:378:2: ( ( ( rule__AbstractNetworkProperty__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:379:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:379:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            // InternalTargetEnvironmentParser.g:380:3: ( rule__AbstractNetworkProperty__Alternatives )
            {
             before(grammarAccess.getAbstractNetworkPropertyAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:381:3: ( rule__AbstractNetworkProperty__Alternatives )
            // InternalTargetEnvironmentParser.g:381:4: rule__AbstractNetworkProperty__Alternatives
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
    // InternalTargetEnvironmentParser.g:390:1: entryRuleInterfaceNetworkProperty : ruleInterfaceNetworkProperty EOF ;
    public final void entryRuleInterfaceNetworkProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:391:1: ( ruleInterfaceNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:392:1: ruleInterfaceNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:399:1: ruleInterfaceNetworkProperty : ( ( rule__InterfaceNetworkProperty__Group__0 ) ) ;
    public final void ruleInterfaceNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:403:2: ( ( ( rule__InterfaceNetworkProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:404:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:404:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:405:3: ( rule__InterfaceNetworkProperty__Group__0 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:406:3: ( rule__InterfaceNetworkProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:406:4: rule__InterfaceNetworkProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:415:1: entryRuleAddressNetworkProperty : ruleAddressNetworkProperty EOF ;
    public final void entryRuleAddressNetworkProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:416:1: ( ruleAddressNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:417:1: ruleAddressNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:424:1: ruleAddressNetworkProperty : ( ( rule__AddressNetworkProperty__Group__0 ) ) ;
    public final void ruleAddressNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:428:2: ( ( ( rule__AddressNetworkProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:429:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:429:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:430:3: ( rule__AddressNetworkProperty__Group__0 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:431:3: ( rule__AddressNetworkProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:431:4: rule__AddressNetworkProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:440:1: entryRuleDeviceType_Impl : ruleDeviceType_Impl EOF ;
    public final void entryRuleDeviceType_Impl() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:441:1: ( ruleDeviceType_Impl EOF )
            // InternalTargetEnvironmentParser.g:442:1: ruleDeviceType_Impl EOF
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
    // InternalTargetEnvironmentParser.g:449:1: ruleDeviceType_Impl : ( ( rule__DeviceType_Impl__Group__0 ) ) ;
    public final void ruleDeviceType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:453:2: ( ( ( rule__DeviceType_Impl__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:454:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:454:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            // InternalTargetEnvironmentParser.g:455:3: ( rule__DeviceType_Impl__Group__0 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:456:3: ( rule__DeviceType_Impl__Group__0 )
            // InternalTargetEnvironmentParser.g:456:4: rule__DeviceType_Impl__Group__0
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
    // InternalTargetEnvironmentParser.g:465:1: entryRuleComputationDeviceType : ruleComputationDeviceType EOF ;
    public final void entryRuleComputationDeviceType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:466:1: ( ruleComputationDeviceType EOF )
            // InternalTargetEnvironmentParser.g:467:1: ruleComputationDeviceType EOF
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
    // InternalTargetEnvironmentParser.g:474:1: ruleComputationDeviceType : ( ( rule__ComputationDeviceType__Group__0 ) ) ;
    public final void ruleComputationDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:478:2: ( ( ( rule__ComputationDeviceType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:479:2: ( ( rule__ComputationDeviceType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:479:2: ( ( rule__ComputationDeviceType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:480:3: ( rule__ComputationDeviceType__Group__0 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:481:3: ( rule__ComputationDeviceType__Group__0 )
            // InternalTargetEnvironmentParser.g:481:4: rule__ComputationDeviceType__Group__0
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
    // InternalTargetEnvironmentParser.g:490:1: entryRuleCapabilityProperty : ruleCapabilityProperty EOF ;
    public final void entryRuleCapabilityProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:491:1: ( ruleCapabilityProperty EOF )
            // InternalTargetEnvironmentParser.g:492:1: ruleCapabilityProperty EOF
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
    // InternalTargetEnvironmentParser.g:499:1: ruleCapabilityProperty : ( ( rule__CapabilityProperty__Group__0 ) ) ;
    public final void ruleCapabilityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:503:2: ( ( ( rule__CapabilityProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:504:2: ( ( rule__CapabilityProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:504:2: ( ( rule__CapabilityProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:505:3: ( rule__CapabilityProperty__Group__0 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:506:3: ( rule__CapabilityProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:506:4: rule__CapabilityProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:515:1: entryRuleAttributeKind : ruleAttributeKind EOF ;
    public final void entryRuleAttributeKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:516:1: ( ruleAttributeKind EOF )
            // InternalTargetEnvironmentParser.g:517:1: ruleAttributeKind EOF
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
    // InternalTargetEnvironmentParser.g:524:1: ruleAttributeKind : ( ( rule__AttributeKind__Group__0 ) ) ;
    public final void ruleAttributeKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:528:2: ( ( ( rule__AttributeKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:529:2: ( ( rule__AttributeKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:529:2: ( ( rule__AttributeKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:530:3: ( rule__AttributeKind__Group__0 )
            {
             before(grammarAccess.getAttributeKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:531:3: ( rule__AttributeKind__Group__0 )
            // InternalTargetEnvironmentParser.g:531:4: rule__AttributeKind__Group__0
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
    // InternalTargetEnvironmentParser.g:540:1: entryRuleMaximumKind : ruleMaximumKind EOF ;
    public final void entryRuleMaximumKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:541:1: ( ruleMaximumKind EOF )
            // InternalTargetEnvironmentParser.g:542:1: ruleMaximumKind EOF
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
    // InternalTargetEnvironmentParser.g:549:1: ruleMaximumKind : ( ( rule__MaximumKind__Group__0 ) ) ;
    public final void ruleMaximumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:553:2: ( ( ( rule__MaximumKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:554:2: ( ( rule__MaximumKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:554:2: ( ( rule__MaximumKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:555:3: ( rule__MaximumKind__Group__0 )
            {
             before(grammarAccess.getMaximumKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:556:3: ( rule__MaximumKind__Group__0 )
            // InternalTargetEnvironmentParser.g:556:4: rule__MaximumKind__Group__0
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
    // InternalTargetEnvironmentParser.g:565:1: entryRuleMinimumKind : ruleMinimumKind EOF ;
    public final void entryRuleMinimumKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:566:1: ( ruleMinimumKind EOF )
            // InternalTargetEnvironmentParser.g:567:1: ruleMinimumKind EOF
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
    // InternalTargetEnvironmentParser.g:574:1: ruleMinimumKind : ( ( rule__MinimumKind__Group__0 ) ) ;
    public final void ruleMinimumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:578:2: ( ( ( rule__MinimumKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:579:2: ( ( rule__MinimumKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:579:2: ( ( rule__MinimumKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:580:3: ( rule__MinimumKind__Group__0 )
            {
             before(grammarAccess.getMinimumKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:581:3: ( rule__MinimumKind__Group__0 )
            // InternalTargetEnvironmentParser.g:581:4: rule__MinimumKind__Group__0
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
    // InternalTargetEnvironmentParser.g:590:1: entryRuleSelectionKind : ruleSelectionKind EOF ;
    public final void entryRuleSelectionKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:591:1: ( ruleSelectionKind EOF )
            // InternalTargetEnvironmentParser.g:592:1: ruleSelectionKind EOF
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
    // InternalTargetEnvironmentParser.g:599:1: ruleSelectionKind : ( ( rule__SelectionKind__Group__0 ) ) ;
    public final void ruleSelectionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:603:2: ( ( ( rule__SelectionKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:604:2: ( ( rule__SelectionKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:604:2: ( ( rule__SelectionKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:605:3: ( rule__SelectionKind__Group__0 )
            {
             before(grammarAccess.getSelectionKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:606:3: ( rule__SelectionKind__Group__0 )
            // InternalTargetEnvironmentParser.g:606:4: rule__SelectionKind__Group__0
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
    // InternalTargetEnvironmentParser.g:615:1: entryRuleConnectionProperty : ruleConnectionProperty EOF ;
    public final void entryRuleConnectionProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:616:1: ( ruleConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:617:1: ruleConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:624:1: ruleConnectionProperty : ( ( rule__ConnectionProperty__Group__0 ) ) ;
    public final void ruleConnectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:628:2: ( ( ( rule__ConnectionProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:629:2: ( ( rule__ConnectionProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:629:2: ( ( rule__ConnectionProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:630:3: ( rule__ConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:631:3: ( rule__ConnectionProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:631:4: rule__ConnectionProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:640:1: entryRuleNetworkConnection : ruleNetworkConnection EOF ;
    public final void entryRuleNetworkConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:641:1: ( ruleNetworkConnection EOF )
            // InternalTargetEnvironmentParser.g:642:1: ruleNetworkConnection EOF
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
    // InternalTargetEnvironmentParser.g:649:1: ruleNetworkConnection : ( ( rule__NetworkConnection__Group__0 ) ) ;
    public final void ruleNetworkConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:653:2: ( ( ( rule__NetworkConnection__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:654:2: ( ( rule__NetworkConnection__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:654:2: ( ( rule__NetworkConnection__Group__0 ) )
            // InternalTargetEnvironmentParser.g:655:3: ( rule__NetworkConnection__Group__0 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:656:3: ( rule__NetworkConnection__Group__0 )
            // InternalTargetEnvironmentParser.g:656:4: rule__NetworkConnection__Group__0
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
    // InternalTargetEnvironmentParser.g:665:1: entryRuleCommunicationConnection : ruleCommunicationConnection EOF ;
    public final void entryRuleCommunicationConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:666:1: ( ruleCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:667:1: ruleCommunicationConnection EOF
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
    // InternalTargetEnvironmentParser.g:674:1: ruleCommunicationConnection : ( ( rule__CommunicationConnection__Group__0 ) ) ;
    public final void ruleCommunicationConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:678:2: ( ( ( rule__CommunicationConnection__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:679:2: ( ( rule__CommunicationConnection__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:679:2: ( ( rule__CommunicationConnection__Group__0 ) )
            // InternalTargetEnvironmentParser.g:680:3: ( rule__CommunicationConnection__Group__0 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:681:3: ( rule__CommunicationConnection__Group__0 )
            // InternalTargetEnvironmentParser.g:681:4: rule__CommunicationConnection__Group__0
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
    // InternalTargetEnvironmentParser.g:690:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:691:1: ( rulePropertyValue EOF )
            // InternalTargetEnvironmentParser.g:692:1: rulePropertyValue EOF
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
    // InternalTargetEnvironmentParser.g:699:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:703:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:704:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:704:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalTargetEnvironmentParser.g:705:3: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:706:3: ( rule__PropertyValue__Alternatives )
            // InternalTargetEnvironmentParser.g:706:4: rule__PropertyValue__Alternatives
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
    // InternalTargetEnvironmentParser.g:715:1: entryRulePropertyValueInt : rulePropertyValueInt EOF ;
    public final void entryRulePropertyValueInt() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:716:1: ( rulePropertyValueInt EOF )
            // InternalTargetEnvironmentParser.g:717:1: rulePropertyValueInt EOF
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
    // InternalTargetEnvironmentParser.g:724:1: rulePropertyValueInt : ( ( rule__PropertyValueInt__ValueAssignment ) ) ;
    public final void rulePropertyValueInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:728:2: ( ( ( rule__PropertyValueInt__ValueAssignment ) ) )
            // InternalTargetEnvironmentParser.g:729:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            {
            // InternalTargetEnvironmentParser.g:729:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            // InternalTargetEnvironmentParser.g:730:3: ( rule__PropertyValueInt__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueIntAccess().getValueAssignment()); 
            // InternalTargetEnvironmentParser.g:731:3: ( rule__PropertyValueInt__ValueAssignment )
            // InternalTargetEnvironmentParser.g:731:4: rule__PropertyValueInt__ValueAssignment
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
    // InternalTargetEnvironmentParser.g:740:1: entryRulePropertyValueDouble : rulePropertyValueDouble EOF ;
    public final void entryRulePropertyValueDouble() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:741:1: ( rulePropertyValueDouble EOF )
            // InternalTargetEnvironmentParser.g:742:1: rulePropertyValueDouble EOF
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
    // InternalTargetEnvironmentParser.g:749:1: rulePropertyValueDouble : ( ( rule__PropertyValueDouble__ValueAssignment ) ) ;
    public final void rulePropertyValueDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:753:2: ( ( ( rule__PropertyValueDouble__ValueAssignment ) ) )
            // InternalTargetEnvironmentParser.g:754:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            {
            // InternalTargetEnvironmentParser.g:754:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            // InternalTargetEnvironmentParser.g:755:3: ( rule__PropertyValueDouble__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment()); 
            // InternalTargetEnvironmentParser.g:756:3: ( rule__PropertyValueDouble__ValueAssignment )
            // InternalTargetEnvironmentParser.g:756:4: rule__PropertyValueDouble__ValueAssignment
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
    // InternalTargetEnvironmentParser.g:765:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:766:1: ( rulePropertyValueString EOF )
            // InternalTargetEnvironmentParser.g:767:1: rulePropertyValueString EOF
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
    // InternalTargetEnvironmentParser.g:774:1: rulePropertyValueString : ( ( rule__PropertyValueString__ValueAssignment ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:778:2: ( ( ( rule__PropertyValueString__ValueAssignment ) ) )
            // InternalTargetEnvironmentParser.g:779:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            {
            // InternalTargetEnvironmentParser.g:779:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            // InternalTargetEnvironmentParser.g:780:3: ( rule__PropertyValueString__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueStringAccess().getValueAssignment()); 
            // InternalTargetEnvironmentParser.g:781:3: ( rule__PropertyValueString__ValueAssignment )
            // InternalTargetEnvironmentParser.g:781:4: rule__PropertyValueString__ValueAssignment
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
    // InternalTargetEnvironmentParser.g:790:1: entryRuleResouceType_Impl : ruleResouceType_Impl EOF ;
    public final void entryRuleResouceType_Impl() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:791:1: ( ruleResouceType_Impl EOF )
            // InternalTargetEnvironmentParser.g:792:1: ruleResouceType_Impl EOF
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
    // InternalTargetEnvironmentParser.g:799:1: ruleResouceType_Impl : ( ( rule__ResouceType_Impl__Group__0 ) ) ;
    public final void ruleResouceType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:803:2: ( ( ( rule__ResouceType_Impl__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:804:2: ( ( rule__ResouceType_Impl__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:804:2: ( ( rule__ResouceType_Impl__Group__0 ) )
            // InternalTargetEnvironmentParser.g:805:3: ( rule__ResouceType_Impl__Group__0 )
            {
             before(grammarAccess.getResouceType_ImplAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:806:3: ( rule__ResouceType_Impl__Group__0 )
            // InternalTargetEnvironmentParser.g:806:4: rule__ResouceType_Impl__Group__0
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
    // InternalTargetEnvironmentParser.g:815:1: entryRuleLinuxOpertingSystem : ruleLinuxOpertingSystem EOF ;
    public final void entryRuleLinuxOpertingSystem() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:816:1: ( ruleLinuxOpertingSystem EOF )
            // InternalTargetEnvironmentParser.g:817:1: ruleLinuxOpertingSystem EOF
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
    // InternalTargetEnvironmentParser.g:824:1: ruleLinuxOpertingSystem : ( ( rule__LinuxOpertingSystem__Group__0 ) ) ;
    public final void ruleLinuxOpertingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:828:2: ( ( ( rule__LinuxOpertingSystem__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:829:2: ( ( rule__LinuxOpertingSystem__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:829:2: ( ( rule__LinuxOpertingSystem__Group__0 ) )
            // InternalTargetEnvironmentParser.g:830:3: ( rule__LinuxOpertingSystem__Group__0 )
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:831:3: ( rule__LinuxOpertingSystem__Group__0 )
            // InternalTargetEnvironmentParser.g:831:4: rule__LinuxOpertingSystem__Group__0
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
    // InternalTargetEnvironmentParser.g:840:1: entryRuleX86ProcessorArchitecture : ruleX86ProcessorArchitecture EOF ;
    public final void entryRuleX86ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:841:1: ( ruleX86ProcessorArchitecture EOF )
            // InternalTargetEnvironmentParser.g:842:1: ruleX86ProcessorArchitecture EOF
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
    // InternalTargetEnvironmentParser.g:849:1: ruleX86ProcessorArchitecture : ( ( rule__X86ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleX86ProcessorArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:853:2: ( ( ( rule__X86ProcessorArchitecture__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:854:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:854:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            // InternalTargetEnvironmentParser.g:855:3: ( rule__X86ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:856:3: ( rule__X86ProcessorArchitecture__Group__0 )
            // InternalTargetEnvironmentParser.g:856:4: rule__X86ProcessorArchitecture__Group__0
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
    // InternalTargetEnvironmentParser.g:865:1: entryRuleArm64ProcessorArchitecture : ruleArm64ProcessorArchitecture EOF ;
    public final void entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:866:1: ( ruleArm64ProcessorArchitecture EOF )
            // InternalTargetEnvironmentParser.g:867:1: ruleArm64ProcessorArchitecture EOF
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
    // InternalTargetEnvironmentParser.g:874:1: ruleArm64ProcessorArchitecture : ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleArm64ProcessorArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:878:2: ( ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:879:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:879:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            // InternalTargetEnvironmentParser.g:880:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:881:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            // InternalTargetEnvironmentParser.g:881:4: rule__Arm64ProcessorArchitecture__Group__0
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
    // InternalTargetEnvironmentParser.g:890:1: entryRuleCommunicationType : ruleCommunicationType EOF ;
    public final void entryRuleCommunicationType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:891:1: ( ruleCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:892:1: ruleCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:899:1: ruleCommunicationType : ( ( rule__CommunicationType__Group__0 ) ) ;
    public final void ruleCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:903:2: ( ( ( rule__CommunicationType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:904:2: ( ( rule__CommunicationType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:904:2: ( ( rule__CommunicationType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:905:3: ( rule__CommunicationType__Group__0 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:906:3: ( rule__CommunicationType__Group__0 )
            // InternalTargetEnvironmentParser.g:906:4: rule__CommunicationType__Group__0
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
    // InternalTargetEnvironmentParser.g:915:1: entryRuleEthernetCommunicationType : ruleEthernetCommunicationType EOF ;
    public final void entryRuleEthernetCommunicationType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:916:1: ( ruleEthernetCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:917:1: ruleEthernetCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:924:1: ruleEthernetCommunicationType : ( ( rule__EthernetCommunicationType__Group__0 ) ) ;
    public final void ruleEthernetCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:928:2: ( ( ( rule__EthernetCommunicationType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:929:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:929:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:930:3: ( rule__EthernetCommunicationType__Group__0 )
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:931:3: ( rule__EthernetCommunicationType__Group__0 )
            // InternalTargetEnvironmentParser.g:931:4: rule__EthernetCommunicationType__Group__0
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
    // InternalTargetEnvironmentParser.g:940:1: entryRuleWlanCommunicationType : ruleWlanCommunicationType EOF ;
    public final void entryRuleWlanCommunicationType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:941:1: ( ruleWlanCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:942:1: ruleWlanCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:949:1: ruleWlanCommunicationType : ( ( rule__WlanCommunicationType__Group__0 ) ) ;
    public final void ruleWlanCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:953:2: ( ( ( rule__WlanCommunicationType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:954:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:954:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:955:3: ( rule__WlanCommunicationType__Group__0 )
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:956:3: ( rule__WlanCommunicationType__Group__0 )
            // InternalTargetEnvironmentParser.g:956:4: rule__WlanCommunicationType__Group__0
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
    // InternalTargetEnvironmentParser.g:965:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:966:1: ( ruleDouble0 EOF )
            // InternalTargetEnvironmentParser.g:967:1: ruleDouble0 EOF
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
    // InternalTargetEnvironmentParser.g:974:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:978:2: ( ( RULE_DOUBLE ) )
            // InternalTargetEnvironmentParser.g:979:2: ( RULE_DOUBLE )
            {
            // InternalTargetEnvironmentParser.g:979:2: ( RULE_DOUBLE )
            // InternalTargetEnvironmentParser.g:980:3: RULE_DOUBLE
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
    // InternalTargetEnvironmentParser.g:990:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:991:1: ( ruleInteger0 EOF )
            // InternalTargetEnvironmentParser.g:992:1: ruleInteger0 EOF
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
    // InternalTargetEnvironmentParser.g:999:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1003:2: ( ( RULE_DECINT ) )
            // InternalTargetEnvironmentParser.g:1004:2: ( RULE_DECINT )
            {
            // InternalTargetEnvironmentParser.g:1004:2: ( RULE_DECINT )
            // InternalTargetEnvironmentParser.g:1005:3: RULE_DECINT
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
    // InternalTargetEnvironmentParser.g:1015:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:1016:1: ( ruleEString EOF )
            // InternalTargetEnvironmentParser.g:1017:1: ruleEString EOF
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
    // InternalTargetEnvironmentParser.g:1024:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1028:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:1029:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:1029:2: ( ( rule__EString__Alternatives ) )
            // InternalTargetEnvironmentParser.g:1030:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:1031:3: ( rule__EString__Alternatives )
            // InternalTargetEnvironmentParser.g:1031:4: rule__EString__Alternatives
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
    // InternalTargetEnvironmentParser.g:1040:1: entryRulePreListElement : rulePreListElement EOF ;
    public final void entryRulePreListElement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:1044:1: ( rulePreListElement EOF )
            // InternalTargetEnvironmentParser.g:1045:1: rulePreListElement EOF
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
    // InternalTargetEnvironmentParser.g:1055:1: rulePreListElement : ( HyphenMinus ) ;
    public final void rulePreListElement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1060:2: ( ( HyphenMinus ) )
            // InternalTargetEnvironmentParser.g:1061:2: ( HyphenMinus )
            {
            // InternalTargetEnvironmentParser.g:1061:2: ( HyphenMinus )
            // InternalTargetEnvironmentParser.g:1062:3: HyphenMinus
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


    // $ANTLR start "rule__Description__Alternatives"
    // InternalTargetEnvironmentParser.g:1072:1: rule__Description__Alternatives : ( ( ruleDeviceSet ) | ( ruleTargetDeployEnviroment ) );
    public final void rule__Description__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1076:1: ( ( ruleDeviceSet ) | ( ruleTargetDeployEnviroment ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||LA2_0==ComputationDeviceType||LA2_0==DeviceType) ) {
                alt2=1;
            }
            else if ( (LA2_0==TargetDeployEnviroment) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1077:2: ( ruleDeviceSet )
                    {
                    // InternalTargetEnvironmentParser.g:1077:2: ( ruleDeviceSet )
                    // InternalTargetEnvironmentParser.g:1078:3: ruleDeviceSet
                    {
                     before(grammarAccess.getDescriptionAccess().getDeviceSetParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeviceSet();

                    state._fsp--;

                     after(grammarAccess.getDescriptionAccess().getDeviceSetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:1083:2: ( ruleTargetDeployEnviroment )
                    {
                    // InternalTargetEnvironmentParser.g:1083:2: ( ruleTargetDeployEnviroment )
                    // InternalTargetEnvironmentParser.g:1084:3: ruleTargetDeployEnviroment
                    {
                     before(grammarAccess.getDescriptionAccess().getTargetDeployEnviromentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTargetDeployEnviroment();

                    state._fsp--;

                     after(grammarAccess.getDescriptionAccess().getTargetDeployEnviromentParserRuleCall_1()); 

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
    // $ANTLR end "rule__Description__Alternatives"


    // $ANTLR start "rule__CapabilityKind__Alternatives"
    // InternalTargetEnvironmentParser.g:1093:1: rule__CapabilityKind__Alternatives : ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) );
    public final void rule__CapabilityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1097:1: ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt3=1;
                }
                break;
            case MaximumKind:
                {
                alt3=2;
                }
                break;
            case MinimumKind:
                {
                alt3=3;
                }
                break;
            case SelectionKind:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1098:2: ( ruleAttributeKind )
                    {
                    // InternalTargetEnvironmentParser.g:1098:2: ( ruleAttributeKind )
                    // InternalTargetEnvironmentParser.g:1099:3: ruleAttributeKind
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
                    // InternalTargetEnvironmentParser.g:1104:2: ( ruleMaximumKind )
                    {
                    // InternalTargetEnvironmentParser.g:1104:2: ( ruleMaximumKind )
                    // InternalTargetEnvironmentParser.g:1105:3: ruleMaximumKind
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
                    // InternalTargetEnvironmentParser.g:1110:2: ( ruleMinimumKind )
                    {
                    // InternalTargetEnvironmentParser.g:1110:2: ( ruleMinimumKind )
                    // InternalTargetEnvironmentParser.g:1111:3: ruleMinimumKind
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
                    // InternalTargetEnvironmentParser.g:1116:2: ( ruleSelectionKind )
                    {
                    // InternalTargetEnvironmentParser.g:1116:2: ( ruleSelectionKind )
                    // InternalTargetEnvironmentParser.g:1117:3: ruleSelectionKind
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
    // InternalTargetEnvironmentParser.g:1126:1: rule__DeviceType__Alternatives : ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) );
    public final void rule__DeviceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1130:1: ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DeviceType) ) {
                alt4=1;
            }
            else if ( (LA4_0==ComputationDeviceType) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1131:2: ( ruleDeviceType_Impl )
                    {
                    // InternalTargetEnvironmentParser.g:1131:2: ( ruleDeviceType_Impl )
                    // InternalTargetEnvironmentParser.g:1132:3: ruleDeviceType_Impl
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
                    // InternalTargetEnvironmentParser.g:1137:2: ( ruleComputationDeviceType )
                    {
                    // InternalTargetEnvironmentParser.g:1137:2: ( ruleComputationDeviceType )
                    // InternalTargetEnvironmentParser.g:1138:3: ruleComputationDeviceType
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
    // InternalTargetEnvironmentParser.g:1147:1: rule__AbstractCommunicationConnection__Alternatives : ( ( ruleNetworkConnection ) | ( ruleCommunicationConnection ) );
    public final void rule__AbstractCommunicationConnection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1151:1: ( ( ruleNetworkConnection ) | ( ruleCommunicationConnection ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1152:2: ( ruleNetworkConnection )
                    {
                    // InternalTargetEnvironmentParser.g:1152:2: ( ruleNetworkConnection )
                    // InternalTargetEnvironmentParser.g:1153:3: ruleNetworkConnection
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
                    // InternalTargetEnvironmentParser.g:1158:2: ( ruleCommunicationConnection )
                    {
                    // InternalTargetEnvironmentParser.g:1158:2: ( ruleCommunicationConnection )
                    // InternalTargetEnvironmentParser.g:1159:3: ruleCommunicationConnection
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
    // InternalTargetEnvironmentParser.g:1168:1: rule__AbstractNetworkProperty__Alternatives : ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) );
    public final void rule__AbstractNetworkProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1172:1: ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INDENT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==HyphenMinus) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==Name) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==Address) ) {
                            alt6=2;
                        }
                        else if ( (LA6_3==Interface) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1173:2: ( ruleInterfaceNetworkProperty )
                    {
                    // InternalTargetEnvironmentParser.g:1173:2: ( ruleInterfaceNetworkProperty )
                    // InternalTargetEnvironmentParser.g:1174:3: ruleInterfaceNetworkProperty
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
                    // InternalTargetEnvironmentParser.g:1179:2: ( ruleAddressNetworkProperty )
                    {
                    // InternalTargetEnvironmentParser.g:1179:2: ( ruleAddressNetworkProperty )
                    // InternalTargetEnvironmentParser.g:1180:3: ruleAddressNetworkProperty
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
    // InternalTargetEnvironmentParser.g:1189:1: rule__PropertyValue__Alternatives : ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1193:1: ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt7=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1194:2: ( rulePropertyValueInt )
                    {
                    // InternalTargetEnvironmentParser.g:1194:2: ( rulePropertyValueInt )
                    // InternalTargetEnvironmentParser.g:1195:3: rulePropertyValueInt
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
                    // InternalTargetEnvironmentParser.g:1200:2: ( rulePropertyValueDouble )
                    {
                    // InternalTargetEnvironmentParser.g:1200:2: ( rulePropertyValueDouble )
                    // InternalTargetEnvironmentParser.g:1201:3: rulePropertyValueDouble
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
                    // InternalTargetEnvironmentParser.g:1206:2: ( rulePropertyValueString )
                    {
                    // InternalTargetEnvironmentParser.g:1206:2: ( rulePropertyValueString )
                    // InternalTargetEnvironmentParser.g:1207:3: rulePropertyValueString
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
    // InternalTargetEnvironmentParser.g:1216:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1220:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1221:2: ( RULE_STRING )
                    {
                    // InternalTargetEnvironmentParser.g:1221:2: ( RULE_STRING )
                    // InternalTargetEnvironmentParser.g:1222:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:1227:2: ( RULE_ID )
                    {
                    // InternalTargetEnvironmentParser.g:1227:2: ( RULE_ID )
                    // InternalTargetEnvironmentParser.g:1228:3: RULE_ID
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


    // $ANTLR start "rule__TargetEnvironment__Group__0"
    // InternalTargetEnvironmentParser.g:1237:1: rule__TargetEnvironment__Group__0 : rule__TargetEnvironment__Group__0__Impl rule__TargetEnvironment__Group__1 ;
    public final void rule__TargetEnvironment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1241:1: ( rule__TargetEnvironment__Group__0__Impl rule__TargetEnvironment__Group__1 )
            // InternalTargetEnvironmentParser.g:1242:2: rule__TargetEnvironment__Group__0__Impl rule__TargetEnvironment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TargetEnvironment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetEnvironment__Group__1();

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
    // $ANTLR end "rule__TargetEnvironment__Group__0"


    // $ANTLR start "rule__TargetEnvironment__Group__0__Impl"
    // InternalTargetEnvironmentParser.g:1249:1: rule__TargetEnvironment__Group__0__Impl : ( () ) ;
    public final void rule__TargetEnvironment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1253:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:1254:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:1254:1: ( () )
            // InternalTargetEnvironmentParser.g:1255:2: ()
            {
             before(grammarAccess.getTargetEnvironmentAccess().getTargetEnvironmentAction_0()); 
            // InternalTargetEnvironmentParser.g:1256:2: ()
            // InternalTargetEnvironmentParser.g:1256:3: 
            {
            }

             after(grammarAccess.getTargetEnvironmentAccess().getTargetEnvironmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetEnvironment__Group__0__Impl"


    // $ANTLR start "rule__TargetEnvironment__Group__1"
    // InternalTargetEnvironmentParser.g:1264:1: rule__TargetEnvironment__Group__1 : rule__TargetEnvironment__Group__1__Impl ;
    public final void rule__TargetEnvironment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1268:1: ( rule__TargetEnvironment__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:1269:2: rule__TargetEnvironment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetEnvironment__Group__1__Impl();

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
    // $ANTLR end "rule__TargetEnvironment__Group__1"


    // $ANTLR start "rule__TargetEnvironment__Group__1__Impl"
    // InternalTargetEnvironmentParser.g:1275:1: rule__TargetEnvironment__Group__1__Impl : ( ( rule__TargetEnvironment__TypeAssignment_1 ) ) ;
    public final void rule__TargetEnvironment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1279:1: ( ( ( rule__TargetEnvironment__TypeAssignment_1 ) ) )
            // InternalTargetEnvironmentParser.g:1280:1: ( ( rule__TargetEnvironment__TypeAssignment_1 ) )
            {
            // InternalTargetEnvironmentParser.g:1280:1: ( ( rule__TargetEnvironment__TypeAssignment_1 ) )
            // InternalTargetEnvironmentParser.g:1281:2: ( rule__TargetEnvironment__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetEnvironmentAccess().getTypeAssignment_1()); 
            // InternalTargetEnvironmentParser.g:1282:2: ( rule__TargetEnvironment__TypeAssignment_1 )
            // InternalTargetEnvironmentParser.g:1282:3: rule__TargetEnvironment__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetEnvironment__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetEnvironmentAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetEnvironment__Group__1__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__0"
    // InternalTargetEnvironmentParser.g:1291:1: rule__TargetDeployEnviroment__Group__0 : rule__TargetDeployEnviroment__Group__0__Impl rule__TargetDeployEnviroment__Group__1 ;
    public final void rule__TargetDeployEnviroment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1295:1: ( rule__TargetDeployEnviroment__Group__0__Impl rule__TargetDeployEnviroment__Group__1 )
            // InternalTargetEnvironmentParser.g:1296:2: rule__TargetDeployEnviroment__Group__0__Impl rule__TargetDeployEnviroment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TargetDeployEnviroment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group__1();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group__0"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__0__Impl"
    // InternalTargetEnvironmentParser.g:1303:1: rule__TargetDeployEnviroment__Group__0__Impl : ( () ) ;
    public final void rule__TargetDeployEnviroment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1307:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:1308:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:1308:1: ( () )
            // InternalTargetEnvironmentParser.g:1309:2: ()
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentAction_0()); 
            // InternalTargetEnvironmentParser.g:1310:2: ()
            // InternalTargetEnvironmentParser.g:1310:3: 
            {
            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group__0__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__1"
    // InternalTargetEnvironmentParser.g:1318:1: rule__TargetDeployEnviroment__Group__1 : rule__TargetDeployEnviroment__Group__1__Impl rule__TargetDeployEnviroment__Group__2 ;
    public final void rule__TargetDeployEnviroment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1322:1: ( rule__TargetDeployEnviroment__Group__1__Impl rule__TargetDeployEnviroment__Group__2 )
            // InternalTargetEnvironmentParser.g:1323:2: rule__TargetDeployEnviroment__Group__1__Impl rule__TargetDeployEnviroment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TargetDeployEnviroment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group__2();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group__1"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__1__Impl"
    // InternalTargetEnvironmentParser.g:1330:1: rule__TargetDeployEnviroment__Group__1__Impl : ( TargetDeployEnviroment ) ;
    public final void rule__TargetDeployEnviroment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1334:1: ( ( TargetDeployEnviroment ) )
            // InternalTargetEnvironmentParser.g:1335:1: ( TargetDeployEnviroment )
            {
            // InternalTargetEnvironmentParser.g:1335:1: ( TargetDeployEnviroment )
            // InternalTargetEnvironmentParser.g:1336:2: TargetDeployEnviroment
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentKeyword_1()); 
            match(input,TargetDeployEnviroment,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group__1__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__2"
    // InternalTargetEnvironmentParser.g:1345:1: rule__TargetDeployEnviroment__Group__2 : rule__TargetDeployEnviroment__Group__2__Impl rule__TargetDeployEnviroment__Group__3 ;
    public final void rule__TargetDeployEnviroment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1349:1: ( rule__TargetDeployEnviroment__Group__2__Impl rule__TargetDeployEnviroment__Group__3 )
            // InternalTargetEnvironmentParser.g:1350:2: rule__TargetDeployEnviroment__Group__2__Impl rule__TargetDeployEnviroment__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TargetDeployEnviroment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group__3();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group__2"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__2__Impl"
    // InternalTargetEnvironmentParser.g:1357:1: rule__TargetDeployEnviroment__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__TargetDeployEnviroment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1361:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1362:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1362:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1363:2: RULE_INDENT
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_2()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group__2__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__3"
    // InternalTargetEnvironmentParser.g:1372:1: rule__TargetDeployEnviroment__Group__3 : rule__TargetDeployEnviroment__Group__3__Impl rule__TargetDeployEnviroment__Group__4 ;
    public final void rule__TargetDeployEnviroment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1376:1: ( rule__TargetDeployEnviroment__Group__3__Impl rule__TargetDeployEnviroment__Group__4 )
            // InternalTargetEnvironmentParser.g:1377:2: rule__TargetDeployEnviroment__Group__3__Impl rule__TargetDeployEnviroment__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__TargetDeployEnviroment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group__4();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group__3"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__3__Impl"
    // InternalTargetEnvironmentParser.g:1384:1: rule__TargetDeployEnviroment__Group__3__Impl : ( Name ) ;
    public final void rule__TargetDeployEnviroment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1388:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:1389:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:1389:1: ( Name )
            // InternalTargetEnvironmentParser.g:1390:2: Name
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getNameKeyword_3()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group__3__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__4"
    // InternalTargetEnvironmentParser.g:1399:1: rule__TargetDeployEnviroment__Group__4 : rule__TargetDeployEnviroment__Group__4__Impl rule__TargetDeployEnviroment__Group__5 ;
    public final void rule__TargetDeployEnviroment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1403:1: ( rule__TargetDeployEnviroment__Group__4__Impl rule__TargetDeployEnviroment__Group__5 )
            // InternalTargetEnvironmentParser.g:1404:2: rule__TargetDeployEnviroment__Group__4__Impl rule__TargetDeployEnviroment__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__TargetDeployEnviroment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group__5();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group__4"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__4__Impl"
    // InternalTargetEnvironmentParser.g:1411:1: rule__TargetDeployEnviroment__Group__4__Impl : ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) ) ;
    public final void rule__TargetDeployEnviroment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1415:1: ( ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) ) )
            // InternalTargetEnvironmentParser.g:1416:1: ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) )
            {
            // InternalTargetEnvironmentParser.g:1416:1: ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) )
            // InternalTargetEnvironmentParser.g:1417:2: ( rule__TargetDeployEnviroment__NameAssignment_4 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getNameAssignment_4()); 
            // InternalTargetEnvironmentParser.g:1418:2: ( rule__TargetDeployEnviroment__NameAssignment_4 )
            // InternalTargetEnvironmentParser.g:1418:3: rule__TargetDeployEnviroment__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group__4__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__5"
    // InternalTargetEnvironmentParser.g:1426:1: rule__TargetDeployEnviroment__Group__5 : rule__TargetDeployEnviroment__Group__5__Impl rule__TargetDeployEnviroment__Group__6 ;
    public final void rule__TargetDeployEnviroment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1430:1: ( rule__TargetDeployEnviroment__Group__5__Impl rule__TargetDeployEnviroment__Group__6 )
            // InternalTargetEnvironmentParser.g:1431:2: rule__TargetDeployEnviroment__Group__5__Impl rule__TargetDeployEnviroment__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__TargetDeployEnviroment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group__6();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group__5"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__5__Impl"
    // InternalTargetEnvironmentParser.g:1438:1: rule__TargetDeployEnviroment__Group__5__Impl : ( ( rule__TargetDeployEnviroment__Group_5__0 )? ) ;
    public final void rule__TargetDeployEnviroment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1442:1: ( ( ( rule__TargetDeployEnviroment__Group_5__0 )? ) )
            // InternalTargetEnvironmentParser.g:1443:1: ( ( rule__TargetDeployEnviroment__Group_5__0 )? )
            {
            // InternalTargetEnvironmentParser.g:1443:1: ( ( rule__TargetDeployEnviroment__Group_5__0 )? )
            // InternalTargetEnvironmentParser.g:1444:2: ( rule__TargetDeployEnviroment__Group_5__0 )?
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getGroup_5()); 
            // InternalTargetEnvironmentParser.g:1445:2: ( rule__TargetDeployEnviroment__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IncludeDevice) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1445:3: rule__TargetDeployEnviroment__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetDeployEnviroment__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group__5__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__6"
    // InternalTargetEnvironmentParser.g:1453:1: rule__TargetDeployEnviroment__Group__6 : rule__TargetDeployEnviroment__Group__6__Impl rule__TargetDeployEnviroment__Group__7 ;
    public final void rule__TargetDeployEnviroment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1457:1: ( rule__TargetDeployEnviroment__Group__6__Impl rule__TargetDeployEnviroment__Group__7 )
            // InternalTargetEnvironmentParser.g:1458:2: rule__TargetDeployEnviroment__Group__6__Impl rule__TargetDeployEnviroment__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__TargetDeployEnviroment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group__7();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group__6"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__6__Impl"
    // InternalTargetEnvironmentParser.g:1465:1: rule__TargetDeployEnviroment__Group__6__Impl : ( ( rule__TargetDeployEnviroment__Group_6__0 )? ) ;
    public final void rule__TargetDeployEnviroment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1469:1: ( ( ( rule__TargetDeployEnviroment__Group_6__0 )? ) )
            // InternalTargetEnvironmentParser.g:1470:1: ( ( rule__TargetDeployEnviroment__Group_6__0 )? )
            {
            // InternalTargetEnvironmentParser.g:1470:1: ( ( rule__TargetDeployEnviroment__Group_6__0 )? )
            // InternalTargetEnvironmentParser.g:1471:2: ( rule__TargetDeployEnviroment__Group_6__0 )?
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getGroup_6()); 
            // InternalTargetEnvironmentParser.g:1472:2: ( rule__TargetDeployEnviroment__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ConfigConnection) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1472:3: rule__TargetDeployEnviroment__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetDeployEnviroment__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group__6__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__7"
    // InternalTargetEnvironmentParser.g:1480:1: rule__TargetDeployEnviroment__Group__7 : rule__TargetDeployEnviroment__Group__7__Impl ;
    public final void rule__TargetDeployEnviroment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1484:1: ( rule__TargetDeployEnviroment__Group__7__Impl )
            // InternalTargetEnvironmentParser.g:1485:2: rule__TargetDeployEnviroment__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group__7__Impl();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group__7"


    // $ANTLR start "rule__TargetDeployEnviroment__Group__7__Impl"
    // InternalTargetEnvironmentParser.g:1491:1: rule__TargetDeployEnviroment__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__TargetDeployEnviroment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1495:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1496:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1496:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1497:2: RULE_DEDENT
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_7()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group__7__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_5__0"
    // InternalTargetEnvironmentParser.g:1507:1: rule__TargetDeployEnviroment__Group_5__0 : rule__TargetDeployEnviroment__Group_5__0__Impl rule__TargetDeployEnviroment__Group_5__1 ;
    public final void rule__TargetDeployEnviroment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1511:1: ( rule__TargetDeployEnviroment__Group_5__0__Impl rule__TargetDeployEnviroment__Group_5__1 )
            // InternalTargetEnvironmentParser.g:1512:2: rule__TargetDeployEnviroment__Group_5__0__Impl rule__TargetDeployEnviroment__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__TargetDeployEnviroment__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group_5__1();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_5__0"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_5__0__Impl"
    // InternalTargetEnvironmentParser.g:1519:1: rule__TargetDeployEnviroment__Group_5__0__Impl : ( IncludeDevice ) ;
    public final void rule__TargetDeployEnviroment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1523:1: ( ( IncludeDevice ) )
            // InternalTargetEnvironmentParser.g:1524:1: ( IncludeDevice )
            {
            // InternalTargetEnvironmentParser.g:1524:1: ( IncludeDevice )
            // InternalTargetEnvironmentParser.g:1525:2: IncludeDevice
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceKeyword_5_0()); 
            match(input,IncludeDevice,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group_5__0__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_5__1"
    // InternalTargetEnvironmentParser.g:1534:1: rule__TargetDeployEnviroment__Group_5__1 : rule__TargetDeployEnviroment__Group_5__1__Impl rule__TargetDeployEnviroment__Group_5__2 ;
    public final void rule__TargetDeployEnviroment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1538:1: ( rule__TargetDeployEnviroment__Group_5__1__Impl rule__TargetDeployEnviroment__Group_5__2 )
            // InternalTargetEnvironmentParser.g:1539:2: rule__TargetDeployEnviroment__Group_5__1__Impl rule__TargetDeployEnviroment__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__TargetDeployEnviroment__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group_5__2();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_5__1"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_5__1__Impl"
    // InternalTargetEnvironmentParser.g:1546:1: rule__TargetDeployEnviroment__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1550:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1551:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1551:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1552:2: RULE_INDENT
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group_5__1__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_5__2"
    // InternalTargetEnvironmentParser.g:1561:1: rule__TargetDeployEnviroment__Group_5__2 : rule__TargetDeployEnviroment__Group_5__2__Impl rule__TargetDeployEnviroment__Group_5__3 ;
    public final void rule__TargetDeployEnviroment__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1565:1: ( rule__TargetDeployEnviroment__Group_5__2__Impl rule__TargetDeployEnviroment__Group_5__3 )
            // InternalTargetEnvironmentParser.g:1566:2: rule__TargetDeployEnviroment__Group_5__2__Impl rule__TargetDeployEnviroment__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__TargetDeployEnviroment__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group_5__3();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_5__2"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_5__2__Impl"
    // InternalTargetEnvironmentParser.g:1573:1: rule__TargetDeployEnviroment__Group_5__2__Impl : ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) ) ;
    public final void rule__TargetDeployEnviroment__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1577:1: ( ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:1578:1: ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:1578:1: ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) )
            // InternalTargetEnvironmentParser.g:1579:2: ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* )
            {
            // InternalTargetEnvironmentParser.g:1579:2: ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) )
            // InternalTargetEnvironmentParser.g:1580:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:1581:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )
            // InternalTargetEnvironmentParser.g:1581:4: rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2
            {
            pushFollow(FOLLOW_11);
            rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 

            }

            // InternalTargetEnvironmentParser.g:1584:2: ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* )
            // InternalTargetEnvironmentParser.g:1585:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )*
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:1586:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==HyphenMinus) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:1586:4: rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_5__2__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_5__3"
    // InternalTargetEnvironmentParser.g:1595:1: rule__TargetDeployEnviroment__Group_5__3 : rule__TargetDeployEnviroment__Group_5__3__Impl ;
    public final void rule__TargetDeployEnviroment__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1599:1: ( rule__TargetDeployEnviroment__Group_5__3__Impl )
            // InternalTargetEnvironmentParser.g:1600:2: rule__TargetDeployEnviroment__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group_5__3__Impl();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_5__3"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_5__3__Impl"
    // InternalTargetEnvironmentParser.g:1606:1: rule__TargetDeployEnviroment__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1610:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1611:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1611:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1612:2: RULE_DEDENT
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group_5__3__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_6__0"
    // InternalTargetEnvironmentParser.g:1622:1: rule__TargetDeployEnviroment__Group_6__0 : rule__TargetDeployEnviroment__Group_6__0__Impl rule__TargetDeployEnviroment__Group_6__1 ;
    public final void rule__TargetDeployEnviroment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1626:1: ( rule__TargetDeployEnviroment__Group_6__0__Impl rule__TargetDeployEnviroment__Group_6__1 )
            // InternalTargetEnvironmentParser.g:1627:2: rule__TargetDeployEnviroment__Group_6__0__Impl rule__TargetDeployEnviroment__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__TargetDeployEnviroment__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group_6__1();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_6__0"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_6__0__Impl"
    // InternalTargetEnvironmentParser.g:1634:1: rule__TargetDeployEnviroment__Group_6__0__Impl : ( ConfigConnection ) ;
    public final void rule__TargetDeployEnviroment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1638:1: ( ( ConfigConnection ) )
            // InternalTargetEnvironmentParser.g:1639:1: ( ConfigConnection )
            {
            // InternalTargetEnvironmentParser.g:1639:1: ( ConfigConnection )
            // InternalTargetEnvironmentParser.g:1640:2: ConfigConnection
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionKeyword_6_0()); 
            match(input,ConfigConnection,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group_6__0__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_6__1"
    // InternalTargetEnvironmentParser.g:1649:1: rule__TargetDeployEnviroment__Group_6__1 : rule__TargetDeployEnviroment__Group_6__1__Impl rule__TargetDeployEnviroment__Group_6__2 ;
    public final void rule__TargetDeployEnviroment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1653:1: ( rule__TargetDeployEnviroment__Group_6__1__Impl rule__TargetDeployEnviroment__Group_6__2 )
            // InternalTargetEnvironmentParser.g:1654:2: rule__TargetDeployEnviroment__Group_6__1__Impl rule__TargetDeployEnviroment__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__TargetDeployEnviroment__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group_6__2();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_6__1"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_6__1__Impl"
    // InternalTargetEnvironmentParser.g:1661:1: rule__TargetDeployEnviroment__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1665:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1666:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1666:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1667:2: RULE_INDENT
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_6_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group_6__1__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_6__2"
    // InternalTargetEnvironmentParser.g:1676:1: rule__TargetDeployEnviroment__Group_6__2 : rule__TargetDeployEnviroment__Group_6__2__Impl rule__TargetDeployEnviroment__Group_6__3 ;
    public final void rule__TargetDeployEnviroment__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1680:1: ( rule__TargetDeployEnviroment__Group_6__2__Impl rule__TargetDeployEnviroment__Group_6__3 )
            // InternalTargetEnvironmentParser.g:1681:2: rule__TargetDeployEnviroment__Group_6__2__Impl rule__TargetDeployEnviroment__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__TargetDeployEnviroment__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group_6__3();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_6__2"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_6__2__Impl"
    // InternalTargetEnvironmentParser.g:1688:1: rule__TargetDeployEnviroment__Group_6__2__Impl : ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) ) ;
    public final void rule__TargetDeployEnviroment__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1692:1: ( ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:1693:1: ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:1693:1: ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) )
            // InternalTargetEnvironmentParser.g:1694:2: ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* )
            {
            // InternalTargetEnvironmentParser.g:1694:2: ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) )
            // InternalTargetEnvironmentParser.g:1695:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:1696:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )
            // InternalTargetEnvironmentParser.g:1696:4: rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 

            }

            // InternalTargetEnvironmentParser.g:1699:2: ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* )
            // InternalTargetEnvironmentParser.g:1700:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:1701:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==HyphenMinus) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:1701:4: rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_6__2__Impl"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_6__3"
    // InternalTargetEnvironmentParser.g:1710:1: rule__TargetDeployEnviroment__Group_6__3 : rule__TargetDeployEnviroment__Group_6__3__Impl ;
    public final void rule__TargetDeployEnviroment__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1714:1: ( rule__TargetDeployEnviroment__Group_6__3__Impl )
            // InternalTargetEnvironmentParser.g:1715:2: rule__TargetDeployEnviroment__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetDeployEnviroment__Group_6__3__Impl();

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
    // $ANTLR end "rule__TargetDeployEnviroment__Group_6__3"


    // $ANTLR start "rule__TargetDeployEnviroment__Group_6__3__Impl"
    // InternalTargetEnvironmentParser.g:1721:1: rule__TargetDeployEnviroment__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1725:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1726:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1726:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1727:2: RULE_DEDENT
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_6_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__Group_6__3__Impl"


    // $ANTLR start "rule__DeviceInstance__Group__0"
    // InternalTargetEnvironmentParser.g:1737:1: rule__DeviceInstance__Group__0 : rule__DeviceInstance__Group__0__Impl rule__DeviceInstance__Group__1 ;
    public final void rule__DeviceInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1741:1: ( rule__DeviceInstance__Group__0__Impl rule__DeviceInstance__Group__1 )
            // InternalTargetEnvironmentParser.g:1742:2: rule__DeviceInstance__Group__0__Impl rule__DeviceInstance__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DeviceInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceInstance__Group__1();

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
    // $ANTLR end "rule__DeviceInstance__Group__0"


    // $ANTLR start "rule__DeviceInstance__Group__0__Impl"
    // InternalTargetEnvironmentParser.g:1749:1: rule__DeviceInstance__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__DeviceInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1753:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:1754:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:1754:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:1755:2: rulePreListElement
            {
             before(grammarAccess.getDeviceInstanceAccess().getPreListElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getDeviceInstanceAccess().getPreListElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceInstance__Group__0__Impl"


    // $ANTLR start "rule__DeviceInstance__Group__1"
    // InternalTargetEnvironmentParser.g:1764:1: rule__DeviceInstance__Group__1 : rule__DeviceInstance__Group__1__Impl rule__DeviceInstance__Group__2 ;
    public final void rule__DeviceInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1768:1: ( rule__DeviceInstance__Group__1__Impl rule__DeviceInstance__Group__2 )
            // InternalTargetEnvironmentParser.g:1769:2: rule__DeviceInstance__Group__1__Impl rule__DeviceInstance__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DeviceInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceInstance__Group__2();

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
    // $ANTLR end "rule__DeviceInstance__Group__1"


    // $ANTLR start "rule__DeviceInstance__Group__1__Impl"
    // InternalTargetEnvironmentParser.g:1776:1: rule__DeviceInstance__Group__1__Impl : ( Name ) ;
    public final void rule__DeviceInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1780:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:1781:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:1781:1: ( Name )
            // InternalTargetEnvironmentParser.g:1782:2: Name
            {
             before(grammarAccess.getDeviceInstanceAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getDeviceInstanceAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceInstance__Group__1__Impl"


    // $ANTLR start "rule__DeviceInstance__Group__2"
    // InternalTargetEnvironmentParser.g:1791:1: rule__DeviceInstance__Group__2 : rule__DeviceInstance__Group__2__Impl rule__DeviceInstance__Group__3 ;
    public final void rule__DeviceInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1795:1: ( rule__DeviceInstance__Group__2__Impl rule__DeviceInstance__Group__3 )
            // InternalTargetEnvironmentParser.g:1796:2: rule__DeviceInstance__Group__2__Impl rule__DeviceInstance__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DeviceInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceInstance__Group__3();

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
    // $ANTLR end "rule__DeviceInstance__Group__2"


    // $ANTLR start "rule__DeviceInstance__Group__2__Impl"
    // InternalTargetEnvironmentParser.g:1803:1: rule__DeviceInstance__Group__2__Impl : ( ( rule__DeviceInstance__NameAssignment_2 ) ) ;
    public final void rule__DeviceInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1807:1: ( ( ( rule__DeviceInstance__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:1808:1: ( ( rule__DeviceInstance__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:1808:1: ( ( rule__DeviceInstance__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:1809:2: ( rule__DeviceInstance__NameAssignment_2 )
            {
             before(grammarAccess.getDeviceInstanceAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:1810:2: ( rule__DeviceInstance__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:1810:3: rule__DeviceInstance__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeviceInstance__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceInstanceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceInstance__Group__2__Impl"


    // $ANTLR start "rule__DeviceInstance__Group__3"
    // InternalTargetEnvironmentParser.g:1818:1: rule__DeviceInstance__Group__3 : rule__DeviceInstance__Group__3__Impl rule__DeviceInstance__Group__4 ;
    public final void rule__DeviceInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1822:1: ( rule__DeviceInstance__Group__3__Impl rule__DeviceInstance__Group__4 )
            // InternalTargetEnvironmentParser.g:1823:2: rule__DeviceInstance__Group__3__Impl rule__DeviceInstance__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__DeviceInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceInstance__Group__4();

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
    // $ANTLR end "rule__DeviceInstance__Group__3"


    // $ANTLR start "rule__DeviceInstance__Group__3__Impl"
    // InternalTargetEnvironmentParser.g:1830:1: rule__DeviceInstance__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1834:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1835:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1835:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1836:2: RULE_INDENT
            {
             before(grammarAccess.getDeviceInstanceAccess().getINDENTTerminalRuleCall_3()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceInstanceAccess().getINDENTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceInstance__Group__3__Impl"


    // $ANTLR start "rule__DeviceInstance__Group__4"
    // InternalTargetEnvironmentParser.g:1845:1: rule__DeviceInstance__Group__4 : rule__DeviceInstance__Group__4__Impl rule__DeviceInstance__Group__5 ;
    public final void rule__DeviceInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1849:1: ( rule__DeviceInstance__Group__4__Impl rule__DeviceInstance__Group__5 )
            // InternalTargetEnvironmentParser.g:1850:2: rule__DeviceInstance__Group__4__Impl rule__DeviceInstance__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__DeviceInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceInstance__Group__5();

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
    // $ANTLR end "rule__DeviceInstance__Group__4"


    // $ANTLR start "rule__DeviceInstance__Group__4__Impl"
    // InternalTargetEnvironmentParser.g:1857:1: rule__DeviceInstance__Group__4__Impl : ( RefDeviceType ) ;
    public final void rule__DeviceInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1861:1: ( ( RefDeviceType ) )
            // InternalTargetEnvironmentParser.g:1862:1: ( RefDeviceType )
            {
            // InternalTargetEnvironmentParser.g:1862:1: ( RefDeviceType )
            // InternalTargetEnvironmentParser.g:1863:2: RefDeviceType
            {
             before(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeKeyword_4()); 
            match(input,RefDeviceType,FOLLOW_2); 
             after(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceInstance__Group__4__Impl"


    // $ANTLR start "rule__DeviceInstance__Group__5"
    // InternalTargetEnvironmentParser.g:1872:1: rule__DeviceInstance__Group__5 : rule__DeviceInstance__Group__5__Impl rule__DeviceInstance__Group__6 ;
    public final void rule__DeviceInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1876:1: ( rule__DeviceInstance__Group__5__Impl rule__DeviceInstance__Group__6 )
            // InternalTargetEnvironmentParser.g:1877:2: rule__DeviceInstance__Group__5__Impl rule__DeviceInstance__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__DeviceInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceInstance__Group__6();

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
    // $ANTLR end "rule__DeviceInstance__Group__5"


    // $ANTLR start "rule__DeviceInstance__Group__5__Impl"
    // InternalTargetEnvironmentParser.g:1884:1: rule__DeviceInstance__Group__5__Impl : ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) ) ;
    public final void rule__DeviceInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1888:1: ( ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:1889:1: ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:1889:1: ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:1890:2: ( rule__DeviceInstance__RefDeviceTypeAssignment_5 )
            {
             before(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeAssignment_5()); 
            // InternalTargetEnvironmentParser.g:1891:2: ( rule__DeviceInstance__RefDeviceTypeAssignment_5 )
            // InternalTargetEnvironmentParser.g:1891:3: rule__DeviceInstance__RefDeviceTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DeviceInstance__RefDeviceTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceInstance__Group__5__Impl"


    // $ANTLR start "rule__DeviceInstance__Group__6"
    // InternalTargetEnvironmentParser.g:1899:1: rule__DeviceInstance__Group__6 : rule__DeviceInstance__Group__6__Impl ;
    public final void rule__DeviceInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1903:1: ( rule__DeviceInstance__Group__6__Impl )
            // InternalTargetEnvironmentParser.g:1904:2: rule__DeviceInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceInstance__Group__6__Impl();

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
    // $ANTLR end "rule__DeviceInstance__Group__6"


    // $ANTLR start "rule__DeviceInstance__Group__6__Impl"
    // InternalTargetEnvironmentParser.g:1910:1: rule__DeviceInstance__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1914:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1915:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1915:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1916:2: RULE_DEDENT
            {
             before(grammarAccess.getDeviceInstanceAccess().getDEDENTTerminalRuleCall_6()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceInstanceAccess().getDEDENTTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceInstance__Group__6__Impl"


    // $ANTLR start "rule__ConfigConnection__Group__0"
    // InternalTargetEnvironmentParser.g:1926:1: rule__ConfigConnection__Group__0 : rule__ConfigConnection__Group__0__Impl rule__ConfigConnection__Group__1 ;
    public final void rule__ConfigConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1930:1: ( rule__ConfigConnection__Group__0__Impl rule__ConfigConnection__Group__1 )
            // InternalTargetEnvironmentParser.g:1931:2: rule__ConfigConnection__Group__0__Impl rule__ConfigConnection__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ConfigConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__1();

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
    // $ANTLR end "rule__ConfigConnection__Group__0"


    // $ANTLR start "rule__ConfigConnection__Group__0__Impl"
    // InternalTargetEnvironmentParser.g:1938:1: rule__ConfigConnection__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__ConfigConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1942:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:1943:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:1943:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:1944:2: rulePreListElement
            {
             before(grammarAccess.getConfigConnectionAccess().getPreListElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getConfigConnectionAccess().getPreListElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__Group__0__Impl"


    // $ANTLR start "rule__ConfigConnection__Group__1"
    // InternalTargetEnvironmentParser.g:1953:1: rule__ConfigConnection__Group__1 : rule__ConfigConnection__Group__1__Impl rule__ConfigConnection__Group__2 ;
    public final void rule__ConfigConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1957:1: ( rule__ConfigConnection__Group__1__Impl rule__ConfigConnection__Group__2 )
            // InternalTargetEnvironmentParser.g:1958:2: rule__ConfigConnection__Group__1__Impl rule__ConfigConnection__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ConfigConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__2();

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
    // $ANTLR end "rule__ConfigConnection__Group__1"


    // $ANTLR start "rule__ConfigConnection__Group__1__Impl"
    // InternalTargetEnvironmentParser.g:1965:1: rule__ConfigConnection__Group__1__Impl : ( Name ) ;
    public final void rule__ConfigConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1969:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:1970:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:1970:1: ( Name )
            // InternalTargetEnvironmentParser.g:1971:2: Name
            {
             before(grammarAccess.getConfigConnectionAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__Group__1__Impl"


    // $ANTLR start "rule__ConfigConnection__Group__2"
    // InternalTargetEnvironmentParser.g:1980:1: rule__ConfigConnection__Group__2 : rule__ConfigConnection__Group__2__Impl rule__ConfigConnection__Group__3 ;
    public final void rule__ConfigConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1984:1: ( rule__ConfigConnection__Group__2__Impl rule__ConfigConnection__Group__3 )
            // InternalTargetEnvironmentParser.g:1985:2: rule__ConfigConnection__Group__2__Impl rule__ConfigConnection__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ConfigConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__3();

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
    // $ANTLR end "rule__ConfigConnection__Group__2"


    // $ANTLR start "rule__ConfigConnection__Group__2__Impl"
    // InternalTargetEnvironmentParser.g:1992:1: rule__ConfigConnection__Group__2__Impl : ( ( rule__ConfigConnection__NameAssignment_2 ) ) ;
    public final void rule__ConfigConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1996:1: ( ( ( rule__ConfigConnection__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:1997:1: ( ( rule__ConfigConnection__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:1997:1: ( ( rule__ConfigConnection__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:1998:2: ( rule__ConfigConnection__NameAssignment_2 )
            {
             before(grammarAccess.getConfigConnectionAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:1999:2: ( rule__ConfigConnection__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:1999:3: rule__ConfigConnection__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigConnection__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigConnectionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__Group__2__Impl"


    // $ANTLR start "rule__ConfigConnection__Group__3"
    // InternalTargetEnvironmentParser.g:2007:1: rule__ConfigConnection__Group__3 : rule__ConfigConnection__Group__3__Impl rule__ConfigConnection__Group__4 ;
    public final void rule__ConfigConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2011:1: ( rule__ConfigConnection__Group__3__Impl rule__ConfigConnection__Group__4 )
            // InternalTargetEnvironmentParser.g:2012:2: rule__ConfigConnection__Group__3__Impl rule__ConfigConnection__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ConfigConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__4();

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
    // $ANTLR end "rule__ConfigConnection__Group__3"


    // $ANTLR start "rule__ConfigConnection__Group__3__Impl"
    // InternalTargetEnvironmentParser.g:2019:1: rule__ConfigConnection__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__ConfigConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2023:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2024:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2024:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2025:2: RULE_INDENT
            {
             before(grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_3()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__Group__3__Impl"


    // $ANTLR start "rule__ConfigConnection__Group__4"
    // InternalTargetEnvironmentParser.g:2034:1: rule__ConfigConnection__Group__4 : rule__ConfigConnection__Group__4__Impl rule__ConfigConnection__Group__5 ;
    public final void rule__ConfigConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2038:1: ( rule__ConfigConnection__Group__4__Impl rule__ConfigConnection__Group__5 )
            // InternalTargetEnvironmentParser.g:2039:2: rule__ConfigConnection__Group__4__Impl rule__ConfigConnection__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ConfigConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__5();

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
    // $ANTLR end "rule__ConfigConnection__Group__4"


    // $ANTLR start "rule__ConfigConnection__Group__4__Impl"
    // InternalTargetEnvironmentParser.g:2046:1: rule__ConfigConnection__Group__4__Impl : ( ConnectDevice ) ;
    public final void rule__ConfigConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2050:1: ( ( ConnectDevice ) )
            // InternalTargetEnvironmentParser.g:2051:1: ( ConnectDevice )
            {
            // InternalTargetEnvironmentParser.g:2051:1: ( ConnectDevice )
            // InternalTargetEnvironmentParser.g:2052:2: ConnectDevice
            {
             before(grammarAccess.getConfigConnectionAccess().getConnectDeviceKeyword_4()); 
            match(input,ConnectDevice,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionAccess().getConnectDeviceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__Group__4__Impl"


    // $ANTLR start "rule__ConfigConnection__Group__5"
    // InternalTargetEnvironmentParser.g:2061:1: rule__ConfigConnection__Group__5 : rule__ConfigConnection__Group__5__Impl rule__ConfigConnection__Group__6 ;
    public final void rule__ConfigConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2065:1: ( rule__ConfigConnection__Group__5__Impl rule__ConfigConnection__Group__6 )
            // InternalTargetEnvironmentParser.g:2066:2: rule__ConfigConnection__Group__5__Impl rule__ConfigConnection__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ConfigConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__6();

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
    // $ANTLR end "rule__ConfigConnection__Group__5"


    // $ANTLR start "rule__ConfigConnection__Group__5__Impl"
    // InternalTargetEnvironmentParser.g:2073:1: rule__ConfigConnection__Group__5__Impl : ( RULE_INDENT ) ;
    public final void rule__ConfigConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2077:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2078:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2078:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2079:2: RULE_INDENT
            {
             before(grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_5()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__Group__5__Impl"


    // $ANTLR start "rule__ConfigConnection__Group__6"
    // InternalTargetEnvironmentParser.g:2088:1: rule__ConfigConnection__Group__6 : rule__ConfigConnection__Group__6__Impl rule__ConfigConnection__Group__7 ;
    public final void rule__ConfigConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2092:1: ( rule__ConfigConnection__Group__6__Impl rule__ConfigConnection__Group__7 )
            // InternalTargetEnvironmentParser.g:2093:2: rule__ConfigConnection__Group__6__Impl rule__ConfigConnection__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__ConfigConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__7();

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
    // $ANTLR end "rule__ConfigConnection__Group__6"


    // $ANTLR start "rule__ConfigConnection__Group__6__Impl"
    // InternalTargetEnvironmentParser.g:2100:1: rule__ConfigConnection__Group__6__Impl : ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) ) ;
    public final void rule__ConfigConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2104:1: ( ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) ) )
            // InternalTargetEnvironmentParser.g:2105:1: ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) )
            {
            // InternalTargetEnvironmentParser.g:2105:1: ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) )
            // InternalTargetEnvironmentParser.g:2106:2: ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* )
            {
            // InternalTargetEnvironmentParser.g:2106:2: ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) )
            // InternalTargetEnvironmentParser.g:2107:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )
            {
             before(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 
            // InternalTargetEnvironmentParser.g:2108:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )
            // InternalTargetEnvironmentParser.g:2108:4: rule__ConfigConnection__ConnectDeviceAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__ConfigConnection__ConnectDeviceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 

            }

            // InternalTargetEnvironmentParser.g:2111:2: ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* )
            // InternalTargetEnvironmentParser.g:2112:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )*
            {
             before(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 
            // InternalTargetEnvironmentParser.g:2113:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==HyphenMinus) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:2113:4: rule__ConfigConnection__ConnectDeviceAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConfigConnection__ConnectDeviceAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 

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
    // $ANTLR end "rule__ConfigConnection__Group__6__Impl"


    // $ANTLR start "rule__ConfigConnection__Group__7"
    // InternalTargetEnvironmentParser.g:2122:1: rule__ConfigConnection__Group__7 : rule__ConfigConnection__Group__7__Impl rule__ConfigConnection__Group__8 ;
    public final void rule__ConfigConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2126:1: ( rule__ConfigConnection__Group__7__Impl rule__ConfigConnection__Group__8 )
            // InternalTargetEnvironmentParser.g:2127:2: rule__ConfigConnection__Group__7__Impl rule__ConfigConnection__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__ConfigConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__8();

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
    // $ANTLR end "rule__ConfigConnection__Group__7"


    // $ANTLR start "rule__ConfigConnection__Group__7__Impl"
    // InternalTargetEnvironmentParser.g:2134:1: rule__ConfigConnection__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConfigConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2138:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2139:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2139:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2140:2: RULE_DEDENT
            {
             before(grammarAccess.getConfigConnectionAccess().getDEDENTTerminalRuleCall_7()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionAccess().getDEDENTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__Group__7__Impl"


    // $ANTLR start "rule__ConfigConnection__Group__8"
    // InternalTargetEnvironmentParser.g:2149:1: rule__ConfigConnection__Group__8 : rule__ConfigConnection__Group__8__Impl ;
    public final void rule__ConfigConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2153:1: ( rule__ConfigConnection__Group__8__Impl )
            // InternalTargetEnvironmentParser.g:2154:2: rule__ConfigConnection__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigConnection__Group__8__Impl();

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
    // $ANTLR end "rule__ConfigConnection__Group__8"


    // $ANTLR start "rule__ConfigConnection__Group__8__Impl"
    // InternalTargetEnvironmentParser.g:2160:1: rule__ConfigConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConfigConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2164:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2165:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2165:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2166:2: RULE_DEDENT
            {
             before(grammarAccess.getConfigConnectionAccess().getDEDENTTerminalRuleCall_8()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionAccess().getDEDENTTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__Group__8__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group__0"
    // InternalTargetEnvironmentParser.g:2176:1: rule__ConnectedDevice__Group__0 : rule__ConnectedDevice__Group__0__Impl rule__ConnectedDevice__Group__1 ;
    public final void rule__ConnectedDevice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2180:1: ( rule__ConnectedDevice__Group__0__Impl rule__ConnectedDevice__Group__1 )
            // InternalTargetEnvironmentParser.g:2181:2: rule__ConnectedDevice__Group__0__Impl rule__ConnectedDevice__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ConnectedDevice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group__1();

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
    // $ANTLR end "rule__ConnectedDevice__Group__0"


    // $ANTLR start "rule__ConnectedDevice__Group__0__Impl"
    // InternalTargetEnvironmentParser.g:2188:1: rule__ConnectedDevice__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectedDevice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2192:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:2193:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:2193:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:2194:2: rulePreListElement
            {
             before(grammarAccess.getConnectedDeviceAccess().getPreListElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getConnectedDeviceAccess().getPreListElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group__0__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group__1"
    // InternalTargetEnvironmentParser.g:2203:1: rule__ConnectedDevice__Group__1 : rule__ConnectedDevice__Group__1__Impl rule__ConnectedDevice__Group__2 ;
    public final void rule__ConnectedDevice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2207:1: ( rule__ConnectedDevice__Group__1__Impl rule__ConnectedDevice__Group__2 )
            // InternalTargetEnvironmentParser.g:2208:2: rule__ConnectedDevice__Group__1__Impl rule__ConnectedDevice__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ConnectedDevice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group__2();

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
    // $ANTLR end "rule__ConnectedDevice__Group__1"


    // $ANTLR start "rule__ConnectedDevice__Group__1__Impl"
    // InternalTargetEnvironmentParser.g:2215:1: rule__ConnectedDevice__Group__1__Impl : ( RefDevice ) ;
    public final void rule__ConnectedDevice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2219:1: ( ( RefDevice ) )
            // InternalTargetEnvironmentParser.g:2220:1: ( RefDevice )
            {
            // InternalTargetEnvironmentParser.g:2220:1: ( RefDevice )
            // InternalTargetEnvironmentParser.g:2221:2: RefDevice
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefDeviceKeyword_1()); 
            match(input,RefDevice,FOLLOW_2); 
             after(grammarAccess.getConnectedDeviceAccess().getRefDeviceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group__1__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group__2"
    // InternalTargetEnvironmentParser.g:2230:1: rule__ConnectedDevice__Group__2 : rule__ConnectedDevice__Group__2__Impl rule__ConnectedDevice__Group__3 ;
    public final void rule__ConnectedDevice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2234:1: ( rule__ConnectedDevice__Group__2__Impl rule__ConnectedDevice__Group__3 )
            // InternalTargetEnvironmentParser.g:2235:2: rule__ConnectedDevice__Group__2__Impl rule__ConnectedDevice__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ConnectedDevice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group__3();

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
    // $ANTLR end "rule__ConnectedDevice__Group__2"


    // $ANTLR start "rule__ConnectedDevice__Group__2__Impl"
    // InternalTargetEnvironmentParser.g:2242:1: rule__ConnectedDevice__Group__2__Impl : ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) ) ;
    public final void rule__ConnectedDevice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2246:1: ( ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:2247:1: ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:2247:1: ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:2248:2: ( rule__ConnectedDevice__RefDeviceAssignment_2 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefDeviceAssignment_2()); 
            // InternalTargetEnvironmentParser.g:2249:2: ( rule__ConnectedDevice__RefDeviceAssignment_2 )
            // InternalTargetEnvironmentParser.g:2249:3: rule__ConnectedDevice__RefDeviceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__RefDeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectedDeviceAccess().getRefDeviceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group__2__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group__3"
    // InternalTargetEnvironmentParser.g:2257:1: rule__ConnectedDevice__Group__3 : rule__ConnectedDevice__Group__3__Impl rule__ConnectedDevice__Group__4 ;
    public final void rule__ConnectedDevice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2261:1: ( rule__ConnectedDevice__Group__3__Impl rule__ConnectedDevice__Group__4 )
            // InternalTargetEnvironmentParser.g:2262:2: rule__ConnectedDevice__Group__3__Impl rule__ConnectedDevice__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ConnectedDevice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group__4();

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
    // $ANTLR end "rule__ConnectedDevice__Group__3"


    // $ANTLR start "rule__ConnectedDevice__Group__3__Impl"
    // InternalTargetEnvironmentParser.g:2269:1: rule__ConnectedDevice__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectedDevice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2273:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2274:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2274:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2275:2: RULE_INDENT
            {
             before(grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_3()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group__3__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group__4"
    // InternalTargetEnvironmentParser.g:2284:1: rule__ConnectedDevice__Group__4 : rule__ConnectedDevice__Group__4__Impl rule__ConnectedDevice__Group__5 ;
    public final void rule__ConnectedDevice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2288:1: ( rule__ConnectedDevice__Group__4__Impl rule__ConnectedDevice__Group__5 )
            // InternalTargetEnvironmentParser.g:2289:2: rule__ConnectedDevice__Group__4__Impl rule__ConnectedDevice__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ConnectedDevice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group__5();

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
    // $ANTLR end "rule__ConnectedDevice__Group__4"


    // $ANTLR start "rule__ConnectedDevice__Group__4__Impl"
    // InternalTargetEnvironmentParser.g:2296:1: rule__ConnectedDevice__Group__4__Impl : ( RefConnection ) ;
    public final void rule__ConnectedDevice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2300:1: ( ( RefConnection ) )
            // InternalTargetEnvironmentParser.g:2301:1: ( RefConnection )
            {
            // InternalTargetEnvironmentParser.g:2301:1: ( RefConnection )
            // InternalTargetEnvironmentParser.g:2302:2: RefConnection
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefConnectionKeyword_4()); 
            match(input,RefConnection,FOLLOW_2); 
             after(grammarAccess.getConnectedDeviceAccess().getRefConnectionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group__4__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group__5"
    // InternalTargetEnvironmentParser.g:2311:1: rule__ConnectedDevice__Group__5 : rule__ConnectedDevice__Group__5__Impl rule__ConnectedDevice__Group__6 ;
    public final void rule__ConnectedDevice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2315:1: ( rule__ConnectedDevice__Group__5__Impl rule__ConnectedDevice__Group__6 )
            // InternalTargetEnvironmentParser.g:2316:2: rule__ConnectedDevice__Group__5__Impl rule__ConnectedDevice__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ConnectedDevice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group__6();

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
    // $ANTLR end "rule__ConnectedDevice__Group__5"


    // $ANTLR start "rule__ConnectedDevice__Group__5__Impl"
    // InternalTargetEnvironmentParser.g:2323:1: rule__ConnectedDevice__Group__5__Impl : ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) ) ;
    public final void rule__ConnectedDevice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2327:1: ( ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:2328:1: ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:2328:1: ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:2329:2: ( rule__ConnectedDevice__RefConnectionAssignment_5 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefConnectionAssignment_5()); 
            // InternalTargetEnvironmentParser.g:2330:2: ( rule__ConnectedDevice__RefConnectionAssignment_5 )
            // InternalTargetEnvironmentParser.g:2330:3: rule__ConnectedDevice__RefConnectionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__RefConnectionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConnectedDeviceAccess().getRefConnectionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group__5__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group__6"
    // InternalTargetEnvironmentParser.g:2338:1: rule__ConnectedDevice__Group__6 : rule__ConnectedDevice__Group__6__Impl rule__ConnectedDevice__Group__7 ;
    public final void rule__ConnectedDevice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2342:1: ( rule__ConnectedDevice__Group__6__Impl rule__ConnectedDevice__Group__7 )
            // InternalTargetEnvironmentParser.g:2343:2: rule__ConnectedDevice__Group__6__Impl rule__ConnectedDevice__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__ConnectedDevice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group__7();

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
    // $ANTLR end "rule__ConnectedDevice__Group__6"


    // $ANTLR start "rule__ConnectedDevice__Group__6__Impl"
    // InternalTargetEnvironmentParser.g:2350:1: rule__ConnectedDevice__Group__6__Impl : ( ( rule__ConnectedDevice__Group_6__0 )? ) ;
    public final void rule__ConnectedDevice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2354:1: ( ( ( rule__ConnectedDevice__Group_6__0 )? ) )
            // InternalTargetEnvironmentParser.g:2355:1: ( ( rule__ConnectedDevice__Group_6__0 )? )
            {
            // InternalTargetEnvironmentParser.g:2355:1: ( ( rule__ConnectedDevice__Group_6__0 )? )
            // InternalTargetEnvironmentParser.g:2356:2: ( rule__ConnectedDevice__Group_6__0 )?
            {
             before(grammarAccess.getConnectedDeviceAccess().getGroup_6()); 
            // InternalTargetEnvironmentParser.g:2357:2: ( rule__ConnectedDevice__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Configuration) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2357:3: rule__ConnectedDevice__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectedDevice__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectedDeviceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group__6__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group__7"
    // InternalTargetEnvironmentParser.g:2365:1: rule__ConnectedDevice__Group__7 : rule__ConnectedDevice__Group__7__Impl ;
    public final void rule__ConnectedDevice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2369:1: ( rule__ConnectedDevice__Group__7__Impl )
            // InternalTargetEnvironmentParser.g:2370:2: rule__ConnectedDevice__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group__7__Impl();

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
    // $ANTLR end "rule__ConnectedDevice__Group__7"


    // $ANTLR start "rule__ConnectedDevice__Group__7__Impl"
    // InternalTargetEnvironmentParser.g:2376:1: rule__ConnectedDevice__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectedDevice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2380:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2381:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2381:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2382:2: RULE_DEDENT
            {
             before(grammarAccess.getConnectedDeviceAccess().getDEDENTTerminalRuleCall_7()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getConnectedDeviceAccess().getDEDENTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group__7__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group_6__0"
    // InternalTargetEnvironmentParser.g:2392:1: rule__ConnectedDevice__Group_6__0 : rule__ConnectedDevice__Group_6__0__Impl rule__ConnectedDevice__Group_6__1 ;
    public final void rule__ConnectedDevice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2396:1: ( rule__ConnectedDevice__Group_6__0__Impl rule__ConnectedDevice__Group_6__1 )
            // InternalTargetEnvironmentParser.g:2397:2: rule__ConnectedDevice__Group_6__0__Impl rule__ConnectedDevice__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__ConnectedDevice__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group_6__1();

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
    // $ANTLR end "rule__ConnectedDevice__Group_6__0"


    // $ANTLR start "rule__ConnectedDevice__Group_6__0__Impl"
    // InternalTargetEnvironmentParser.g:2404:1: rule__ConnectedDevice__Group_6__0__Impl : ( Configuration ) ;
    public final void rule__ConnectedDevice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2408:1: ( ( Configuration ) )
            // InternalTargetEnvironmentParser.g:2409:1: ( Configuration )
            {
            // InternalTargetEnvironmentParser.g:2409:1: ( Configuration )
            // InternalTargetEnvironmentParser.g:2410:2: Configuration
            {
             before(grammarAccess.getConnectedDeviceAccess().getConfigurationKeyword_6_0()); 
            match(input,Configuration,FOLLOW_2); 
             after(grammarAccess.getConnectedDeviceAccess().getConfigurationKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group_6__0__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group_6__1"
    // InternalTargetEnvironmentParser.g:2419:1: rule__ConnectedDevice__Group_6__1 : rule__ConnectedDevice__Group_6__1__Impl rule__ConnectedDevice__Group_6__2 ;
    public final void rule__ConnectedDevice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2423:1: ( rule__ConnectedDevice__Group_6__1__Impl rule__ConnectedDevice__Group_6__2 )
            // InternalTargetEnvironmentParser.g:2424:2: rule__ConnectedDevice__Group_6__1__Impl rule__ConnectedDevice__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__ConnectedDevice__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group_6__2();

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
    // $ANTLR end "rule__ConnectedDevice__Group_6__1"


    // $ANTLR start "rule__ConnectedDevice__Group_6__1__Impl"
    // InternalTargetEnvironmentParser.g:2431:1: rule__ConnectedDevice__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectedDevice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2435:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2436:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2436:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2437:2: RULE_INDENT
            {
             before(grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_6_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group_6__1__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group_6__2"
    // InternalTargetEnvironmentParser.g:2446:1: rule__ConnectedDevice__Group_6__2 : rule__ConnectedDevice__Group_6__2__Impl rule__ConnectedDevice__Group_6__3 ;
    public final void rule__ConnectedDevice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2450:1: ( rule__ConnectedDevice__Group_6__2__Impl rule__ConnectedDevice__Group_6__3 )
            // InternalTargetEnvironmentParser.g:2451:2: rule__ConnectedDevice__Group_6__2__Impl rule__ConnectedDevice__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__ConnectedDevice__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group_6__3();

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
    // $ANTLR end "rule__ConnectedDevice__Group_6__2"


    // $ANTLR start "rule__ConnectedDevice__Group_6__2__Impl"
    // InternalTargetEnvironmentParser.g:2458:1: rule__ConnectedDevice__Group_6__2__Impl : ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) ) ;
    public final void rule__ConnectedDevice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2462:1: ( ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:2463:1: ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:2463:1: ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) )
            // InternalTargetEnvironmentParser.g:2464:2: ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* )
            {
            // InternalTargetEnvironmentParser.g:2464:2: ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) )
            // InternalTargetEnvironmentParser.g:2465:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:2466:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )
            // InternalTargetEnvironmentParser.g:2466:4: rule__ConnectedDevice__PropertiesAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__ConnectedDevice__PropertiesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 

            }

            // InternalTargetEnvironmentParser.g:2469:2: ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* )
            // InternalTargetEnvironmentParser.g:2470:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )*
            {
             before(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:2471:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==HyphenMinus) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:2471:4: rule__ConnectedDevice__PropertiesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConnectedDevice__PropertiesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 

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
    // $ANTLR end "rule__ConnectedDevice__Group_6__2__Impl"


    // $ANTLR start "rule__ConnectedDevice__Group_6__3"
    // InternalTargetEnvironmentParser.g:2480:1: rule__ConnectedDevice__Group_6__3 : rule__ConnectedDevice__Group_6__3__Impl ;
    public final void rule__ConnectedDevice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2484:1: ( rule__ConnectedDevice__Group_6__3__Impl )
            // InternalTargetEnvironmentParser.g:2485:2: rule__ConnectedDevice__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectedDevice__Group_6__3__Impl();

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
    // $ANTLR end "rule__ConnectedDevice__Group_6__3"


    // $ANTLR start "rule__ConnectedDevice__Group_6__3__Impl"
    // InternalTargetEnvironmentParser.g:2491:1: rule__ConnectedDevice__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectedDevice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2495:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2496:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2496:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2497:2: RULE_DEDENT
            {
             before(grammarAccess.getConnectedDeviceAccess().getDEDENTTerminalRuleCall_6_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getConnectedDeviceAccess().getDEDENTTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__Group_6__3__Impl"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__0"
    // InternalTargetEnvironmentParser.g:2507:1: rule__ConfigConnectionProperty__Group__0 : rule__ConfigConnectionProperty__Group__0__Impl rule__ConfigConnectionProperty__Group__1 ;
    public final void rule__ConfigConnectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2511:1: ( rule__ConfigConnectionProperty__Group__0__Impl rule__ConfigConnectionProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:2512:2: rule__ConfigConnectionProperty__Group__0__Impl rule__ConfigConnectionProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ConfigConnectionProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group__1();

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
    // $ANTLR end "rule__ConfigConnectionProperty__Group__0"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__0__Impl"
    // InternalTargetEnvironmentParser.g:2519:1: rule__ConfigConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConfigConnectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2523:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:2524:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:2524:1: ( () )
            // InternalTargetEnvironmentParser.g:2525:2: ()
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getConfigConnectionPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:2526:2: ()
            // InternalTargetEnvironmentParser.g:2526:3: 
            {
            }

             after(grammarAccess.getConfigConnectionPropertyAccess().getConfigConnectionPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__Group__0__Impl"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__1"
    // InternalTargetEnvironmentParser.g:2534:1: rule__ConfigConnectionProperty__Group__1 : rule__ConfigConnectionProperty__Group__1__Impl rule__ConfigConnectionProperty__Group__2 ;
    public final void rule__ConfigConnectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2538:1: ( rule__ConfigConnectionProperty__Group__1__Impl rule__ConfigConnectionProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:2539:2: rule__ConfigConnectionProperty__Group__1__Impl rule__ConfigConnectionProperty__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ConfigConnectionProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group__2();

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
    // $ANTLR end "rule__ConfigConnectionProperty__Group__1"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__1__Impl"
    // InternalTargetEnvironmentParser.g:2546:1: rule__ConfigConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConfigConnectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2550:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:2551:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:2551:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:2552:2: rulePreListElement
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getPreListElementParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getConfigConnectionPropertyAccess().getPreListElementParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__Group__1__Impl"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__2"
    // InternalTargetEnvironmentParser.g:2561:1: rule__ConfigConnectionProperty__Group__2 : rule__ConfigConnectionProperty__Group__2__Impl rule__ConfigConnectionProperty__Group__3 ;
    public final void rule__ConfigConnectionProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2565:1: ( rule__ConfigConnectionProperty__Group__2__Impl rule__ConfigConnectionProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:2566:2: rule__ConfigConnectionProperty__Group__2__Impl rule__ConfigConnectionProperty__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ConfigConnectionProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group__3();

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
    // $ANTLR end "rule__ConfigConnectionProperty__Group__2"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__2__Impl"
    // InternalTargetEnvironmentParser.g:2573:1: rule__ConfigConnectionProperty__Group__2__Impl : ( RefConnectionProperty ) ;
    public final void rule__ConfigConnectionProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2577:1: ( ( RefConnectionProperty ) )
            // InternalTargetEnvironmentParser.g:2578:1: ( RefConnectionProperty )
            {
            // InternalTargetEnvironmentParser.g:2578:1: ( RefConnectionProperty )
            // InternalTargetEnvironmentParser.g:2579:2: RefConnectionProperty
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyKeyword_2()); 
            match(input,RefConnectionProperty,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__Group__2__Impl"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__3"
    // InternalTargetEnvironmentParser.g:2588:1: rule__ConfigConnectionProperty__Group__3 : rule__ConfigConnectionProperty__Group__3__Impl rule__ConfigConnectionProperty__Group__4 ;
    public final void rule__ConfigConnectionProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2592:1: ( rule__ConfigConnectionProperty__Group__3__Impl rule__ConfigConnectionProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:2593:2: rule__ConfigConnectionProperty__Group__3__Impl rule__ConfigConnectionProperty__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ConfigConnectionProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group__4();

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
    // $ANTLR end "rule__ConfigConnectionProperty__Group__3"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__3__Impl"
    // InternalTargetEnvironmentParser.g:2600:1: rule__ConfigConnectionProperty__Group__3__Impl : ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) ) ;
    public final void rule__ConfigConnectionProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2604:1: ( ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:2605:1: ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:2605:1: ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:2606:2: ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyAssignment_3()); 
            // InternalTargetEnvironmentParser.g:2607:2: ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 )
            // InternalTargetEnvironmentParser.g:2607:3: rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__Group__3__Impl"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__4"
    // InternalTargetEnvironmentParser.g:2615:1: rule__ConfigConnectionProperty__Group__4 : rule__ConfigConnectionProperty__Group__4__Impl ;
    public final void rule__ConfigConnectionProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2619:1: ( rule__ConfigConnectionProperty__Group__4__Impl )
            // InternalTargetEnvironmentParser.g:2620:2: rule__ConfigConnectionProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group__4__Impl();

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
    // $ANTLR end "rule__ConfigConnectionProperty__Group__4"


    // $ANTLR start "rule__ConfigConnectionProperty__Group__4__Impl"
    // InternalTargetEnvironmentParser.g:2626:1: rule__ConfigConnectionProperty__Group__4__Impl : ( ( rule__ConfigConnectionProperty__Group_4__0 )? ) ;
    public final void rule__ConfigConnectionProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2630:1: ( ( ( rule__ConfigConnectionProperty__Group_4__0 )? ) )
            // InternalTargetEnvironmentParser.g:2631:1: ( ( rule__ConfigConnectionProperty__Group_4__0 )? )
            {
            // InternalTargetEnvironmentParser.g:2631:1: ( ( rule__ConfigConnectionProperty__Group_4__0 )? )
            // InternalTargetEnvironmentParser.g:2632:2: ( rule__ConfigConnectionProperty__Group_4__0 )?
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getGroup_4()); 
            // InternalTargetEnvironmentParser.g:2633:2: ( rule__ConfigConnectionProperty__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INDENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2633:3: rule__ConfigConnectionProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigConnectionProperty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigConnectionPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__Group__4__Impl"


    // $ANTLR start "rule__ConfigConnectionProperty__Group_4__0"
    // InternalTargetEnvironmentParser.g:2642:1: rule__ConfigConnectionProperty__Group_4__0 : rule__ConfigConnectionProperty__Group_4__0__Impl rule__ConfigConnectionProperty__Group_4__1 ;
    public final void rule__ConfigConnectionProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2646:1: ( rule__ConfigConnectionProperty__Group_4__0__Impl rule__ConfigConnectionProperty__Group_4__1 )
            // InternalTargetEnvironmentParser.g:2647:2: rule__ConfigConnectionProperty__Group_4__0__Impl rule__ConfigConnectionProperty__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__ConfigConnectionProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group_4__1();

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
    // $ANTLR end "rule__ConfigConnectionProperty__Group_4__0"


    // $ANTLR start "rule__ConfigConnectionProperty__Group_4__0__Impl"
    // InternalTargetEnvironmentParser.g:2654:1: rule__ConfigConnectionProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__ConfigConnectionProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2658:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2659:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2659:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2660:2: RULE_INDENT
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__Group_4__0__Impl"


    // $ANTLR start "rule__ConfigConnectionProperty__Group_4__1"
    // InternalTargetEnvironmentParser.g:2669:1: rule__ConfigConnectionProperty__Group_4__1 : rule__ConfigConnectionProperty__Group_4__1__Impl rule__ConfigConnectionProperty__Group_4__2 ;
    public final void rule__ConfigConnectionProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2673:1: ( rule__ConfigConnectionProperty__Group_4__1__Impl rule__ConfigConnectionProperty__Group_4__2 )
            // InternalTargetEnvironmentParser.g:2674:2: rule__ConfigConnectionProperty__Group_4__1__Impl rule__ConfigConnectionProperty__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__ConfigConnectionProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group_4__2();

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
    // $ANTLR end "rule__ConfigConnectionProperty__Group_4__1"


    // $ANTLR start "rule__ConfigConnectionProperty__Group_4__1__Impl"
    // InternalTargetEnvironmentParser.g:2681:1: rule__ConfigConnectionProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__ConfigConnectionProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2685:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:2686:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:2686:1: ( Value )
            // InternalTargetEnvironmentParser.g:2687:2: Value
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getValueKeyword_4_1()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionPropertyAccess().getValueKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__Group_4__1__Impl"


    // $ANTLR start "rule__ConfigConnectionProperty__Group_4__2"
    // InternalTargetEnvironmentParser.g:2696:1: rule__ConfigConnectionProperty__Group_4__2 : rule__ConfigConnectionProperty__Group_4__2__Impl rule__ConfigConnectionProperty__Group_4__3 ;
    public final void rule__ConfigConnectionProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2700:1: ( rule__ConfigConnectionProperty__Group_4__2__Impl rule__ConfigConnectionProperty__Group_4__3 )
            // InternalTargetEnvironmentParser.g:2701:2: rule__ConfigConnectionProperty__Group_4__2__Impl rule__ConfigConnectionProperty__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__ConfigConnectionProperty__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group_4__3();

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
    // $ANTLR end "rule__ConfigConnectionProperty__Group_4__2"


    // $ANTLR start "rule__ConfigConnectionProperty__Group_4__2__Impl"
    // InternalTargetEnvironmentParser.g:2708:1: rule__ConfigConnectionProperty__Group_4__2__Impl : ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__ConfigConnectionProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2712:1: ( ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) ) )
            // InternalTargetEnvironmentParser.g:2713:1: ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) )
            {
            // InternalTargetEnvironmentParser.g:2713:1: ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) )
            // InternalTargetEnvironmentParser.g:2714:2: ( rule__ConfigConnectionProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getValueAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:2715:2: ( rule__ConfigConnectionProperty__ValueAssignment_4_2 )
            // InternalTargetEnvironmentParser.g:2715:3: rule__ConfigConnectionProperty__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigConnectionPropertyAccess().getValueAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__Group_4__2__Impl"


    // $ANTLR start "rule__ConfigConnectionProperty__Group_4__3"
    // InternalTargetEnvironmentParser.g:2723:1: rule__ConfigConnectionProperty__Group_4__3 : rule__ConfigConnectionProperty__Group_4__3__Impl ;
    public final void rule__ConfigConnectionProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2727:1: ( rule__ConfigConnectionProperty__Group_4__3__Impl )
            // InternalTargetEnvironmentParser.g:2728:2: rule__ConfigConnectionProperty__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigConnectionProperty__Group_4__3__Impl();

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
    // $ANTLR end "rule__ConfigConnectionProperty__Group_4__3"


    // $ANTLR start "rule__ConfigConnectionProperty__Group_4__3__Impl"
    // InternalTargetEnvironmentParser.g:2734:1: rule__ConfigConnectionProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConfigConnectionProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2738:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2739:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2739:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2740:2: RULE_DEDENT
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getDEDENTTerminalRuleCall_4_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getConfigConnectionPropertyAccess().getDEDENTTerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__Group_4__3__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__0"
    // InternalTargetEnvironmentParser.g:2750:1: rule__InterfaceNetworkProperty__Group__0 : rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 ;
    public final void rule__InterfaceNetworkProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2754:1: ( rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:2755:2: rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:2762:1: rule__InterfaceNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__InterfaceNetworkProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2766:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:2767:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:2767:1: ( () )
            // InternalTargetEnvironmentParser.g:2768:2: ()
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:2769:2: ()
            // InternalTargetEnvironmentParser.g:2769:3: 
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
    // InternalTargetEnvironmentParser.g:2777:1: rule__InterfaceNetworkProperty__Group__1 : rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 ;
    public final void rule__InterfaceNetworkProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2781:1: ( rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:2782:2: rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:2789:1: rule__InterfaceNetworkProperty__Group__1__Impl : ( RULE_INDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2793:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2794:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2794:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2795:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2804:1: rule__InterfaceNetworkProperty__Group__2 : rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 ;
    public final void rule__InterfaceNetworkProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2808:1: ( rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:2809:2: rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3
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
    // InternalTargetEnvironmentParser.g:2816:1: rule__InterfaceNetworkProperty__Group__2__Impl : ( rulePreListElement ) ;
    public final void rule__InterfaceNetworkProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2820:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:2821:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:2821:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:2822:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:2831:1: rule__InterfaceNetworkProperty__Group__3 : rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 ;
    public final void rule__InterfaceNetworkProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2835:1: ( rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:2836:2: rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalTargetEnvironmentParser.g:2843:1: rule__InterfaceNetworkProperty__Group__3__Impl : ( Name ) ;
    public final void rule__InterfaceNetworkProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2847:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:2848:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:2848:1: ( Name )
            // InternalTargetEnvironmentParser.g:2849:2: Name
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
    // InternalTargetEnvironmentParser.g:2858:1: rule__InterfaceNetworkProperty__Group__4 : rule__InterfaceNetworkProperty__Group__4__Impl rule__InterfaceNetworkProperty__Group__5 ;
    public final void rule__InterfaceNetworkProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2862:1: ( rule__InterfaceNetworkProperty__Group__4__Impl rule__InterfaceNetworkProperty__Group__5 )
            // InternalTargetEnvironmentParser.g:2863:2: rule__InterfaceNetworkProperty__Group__4__Impl rule__InterfaceNetworkProperty__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalTargetEnvironmentParser.g:2870:1: rule__InterfaceNetworkProperty__Group__4__Impl : ( Interface ) ;
    public final void rule__InterfaceNetworkProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2874:1: ( ( Interface ) )
            // InternalTargetEnvironmentParser.g:2875:1: ( Interface )
            {
            // InternalTargetEnvironmentParser.g:2875:1: ( Interface )
            // InternalTargetEnvironmentParser.g:2876:2: Interface
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
    // InternalTargetEnvironmentParser.g:2885:1: rule__InterfaceNetworkProperty__Group__5 : rule__InterfaceNetworkProperty__Group__5__Impl rule__InterfaceNetworkProperty__Group__6 ;
    public final void rule__InterfaceNetworkProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2889:1: ( rule__InterfaceNetworkProperty__Group__5__Impl rule__InterfaceNetworkProperty__Group__6 )
            // InternalTargetEnvironmentParser.g:2890:2: rule__InterfaceNetworkProperty__Group__5__Impl rule__InterfaceNetworkProperty__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalTargetEnvironmentParser.g:2897:1: rule__InterfaceNetworkProperty__Group__5__Impl : ( ( rule__InterfaceNetworkProperty__Group_5__0 )? ) ;
    public final void rule__InterfaceNetworkProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2901:1: ( ( ( rule__InterfaceNetworkProperty__Group_5__0 )? ) )
            // InternalTargetEnvironmentParser.g:2902:1: ( ( rule__InterfaceNetworkProperty__Group_5__0 )? )
            {
            // InternalTargetEnvironmentParser.g:2902:1: ( ( rule__InterfaceNetworkProperty__Group_5__0 )? )
            // InternalTargetEnvironmentParser.g:2903:2: ( rule__InterfaceNetworkProperty__Group_5__0 )?
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_5()); 
            // InternalTargetEnvironmentParser.g:2904:2: ( rule__InterfaceNetworkProperty__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Value) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2904:3: rule__InterfaceNetworkProperty__Group_5__0
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
    // InternalTargetEnvironmentParser.g:2912:1: rule__InterfaceNetworkProperty__Group__6 : rule__InterfaceNetworkProperty__Group__6__Impl ;
    public final void rule__InterfaceNetworkProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2916:1: ( rule__InterfaceNetworkProperty__Group__6__Impl )
            // InternalTargetEnvironmentParser.g:2917:2: rule__InterfaceNetworkProperty__Group__6__Impl
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
    // InternalTargetEnvironmentParser.g:2923:1: rule__InterfaceNetworkProperty__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2927:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2928:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2928:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2929:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2939:1: rule__InterfaceNetworkProperty__Group_5__0 : rule__InterfaceNetworkProperty__Group_5__0__Impl rule__InterfaceNetworkProperty__Group_5__1 ;
    public final void rule__InterfaceNetworkProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2943:1: ( rule__InterfaceNetworkProperty__Group_5__0__Impl rule__InterfaceNetworkProperty__Group_5__1 )
            // InternalTargetEnvironmentParser.g:2944:2: rule__InterfaceNetworkProperty__Group_5__0__Impl rule__InterfaceNetworkProperty__Group_5__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:2951:1: rule__InterfaceNetworkProperty__Group_5__0__Impl : ( Value ) ;
    public final void rule__InterfaceNetworkProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2955:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:2956:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:2956:1: ( Value )
            // InternalTargetEnvironmentParser.g:2957:2: Value
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
    // InternalTargetEnvironmentParser.g:2966:1: rule__InterfaceNetworkProperty__Group_5__1 : rule__InterfaceNetworkProperty__Group_5__1__Impl ;
    public final void rule__InterfaceNetworkProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2970:1: ( rule__InterfaceNetworkProperty__Group_5__1__Impl )
            // InternalTargetEnvironmentParser.g:2971:2: rule__InterfaceNetworkProperty__Group_5__1__Impl
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
    // InternalTargetEnvironmentParser.g:2977:1: rule__InterfaceNetworkProperty__Group_5__1__Impl : ( ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 ) ) ;
    public final void rule__InterfaceNetworkProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2981:1: ( ( ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 ) ) )
            // InternalTargetEnvironmentParser.g:2982:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 ) )
            {
            // InternalTargetEnvironmentParser.g:2982:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 ) )
            // InternalTargetEnvironmentParser.g:2983:2: ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValueAssignment_5_1()); 
            // InternalTargetEnvironmentParser.g:2984:2: ( rule__InterfaceNetworkProperty__ValueAssignment_5_1 )
            // InternalTargetEnvironmentParser.g:2984:3: rule__InterfaceNetworkProperty__ValueAssignment_5_1
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
    // InternalTargetEnvironmentParser.g:2993:1: rule__AddressNetworkProperty__Group__0 : rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 ;
    public final void rule__AddressNetworkProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2997:1: ( rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:2998:2: rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:3005:1: rule__AddressNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__AddressNetworkProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3009:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3010:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3010:1: ( () )
            // InternalTargetEnvironmentParser.g:3011:2: ()
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:3012:2: ()
            // InternalTargetEnvironmentParser.g:3012:3: 
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
    // InternalTargetEnvironmentParser.g:3020:1: rule__AddressNetworkProperty__Group__1 : rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 ;
    public final void rule__AddressNetworkProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3024:1: ( rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:3025:2: rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:3032:1: rule__AddressNetworkProperty__Group__1__Impl : ( RULE_INDENT ) ;
    public final void rule__AddressNetworkProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3036:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3037:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3037:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3038:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3047:1: rule__AddressNetworkProperty__Group__2 : rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 ;
    public final void rule__AddressNetworkProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3051:1: ( rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:3052:2: rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3
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
    // InternalTargetEnvironmentParser.g:3059:1: rule__AddressNetworkProperty__Group__2__Impl : ( rulePreListElement ) ;
    public final void rule__AddressNetworkProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3063:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:3064:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:3064:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:3065:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:3074:1: rule__AddressNetworkProperty__Group__3 : rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 ;
    public final void rule__AddressNetworkProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3078:1: ( rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:3079:2: rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalTargetEnvironmentParser.g:3086:1: rule__AddressNetworkProperty__Group__3__Impl : ( Name ) ;
    public final void rule__AddressNetworkProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3090:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:3091:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:3091:1: ( Name )
            // InternalTargetEnvironmentParser.g:3092:2: Name
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
    // InternalTargetEnvironmentParser.g:3101:1: rule__AddressNetworkProperty__Group__4 : rule__AddressNetworkProperty__Group__4__Impl rule__AddressNetworkProperty__Group__5 ;
    public final void rule__AddressNetworkProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3105:1: ( rule__AddressNetworkProperty__Group__4__Impl rule__AddressNetworkProperty__Group__5 )
            // InternalTargetEnvironmentParser.g:3106:2: rule__AddressNetworkProperty__Group__4__Impl rule__AddressNetworkProperty__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalTargetEnvironmentParser.g:3113:1: rule__AddressNetworkProperty__Group__4__Impl : ( Address ) ;
    public final void rule__AddressNetworkProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3117:1: ( ( Address ) )
            // InternalTargetEnvironmentParser.g:3118:1: ( Address )
            {
            // InternalTargetEnvironmentParser.g:3118:1: ( Address )
            // InternalTargetEnvironmentParser.g:3119:2: Address
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
    // InternalTargetEnvironmentParser.g:3128:1: rule__AddressNetworkProperty__Group__5 : rule__AddressNetworkProperty__Group__5__Impl rule__AddressNetworkProperty__Group__6 ;
    public final void rule__AddressNetworkProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3132:1: ( rule__AddressNetworkProperty__Group__5__Impl rule__AddressNetworkProperty__Group__6 )
            // InternalTargetEnvironmentParser.g:3133:2: rule__AddressNetworkProperty__Group__5__Impl rule__AddressNetworkProperty__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalTargetEnvironmentParser.g:3140:1: rule__AddressNetworkProperty__Group__5__Impl : ( ( rule__AddressNetworkProperty__Group_5__0 )? ) ;
    public final void rule__AddressNetworkProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3144:1: ( ( ( rule__AddressNetworkProperty__Group_5__0 )? ) )
            // InternalTargetEnvironmentParser.g:3145:1: ( ( rule__AddressNetworkProperty__Group_5__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3145:1: ( ( rule__AddressNetworkProperty__Group_5__0 )? )
            // InternalTargetEnvironmentParser.g:3146:2: ( rule__AddressNetworkProperty__Group_5__0 )?
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup_5()); 
            // InternalTargetEnvironmentParser.g:3147:2: ( rule__AddressNetworkProperty__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Value) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3147:3: rule__AddressNetworkProperty__Group_5__0
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
    // InternalTargetEnvironmentParser.g:3155:1: rule__AddressNetworkProperty__Group__6 : rule__AddressNetworkProperty__Group__6__Impl ;
    public final void rule__AddressNetworkProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3159:1: ( rule__AddressNetworkProperty__Group__6__Impl )
            // InternalTargetEnvironmentParser.g:3160:2: rule__AddressNetworkProperty__Group__6__Impl
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
    // InternalTargetEnvironmentParser.g:3166:1: rule__AddressNetworkProperty__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__AddressNetworkProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3170:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3171:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3171:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3172:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3182:1: rule__AddressNetworkProperty__Group_5__0 : rule__AddressNetworkProperty__Group_5__0__Impl rule__AddressNetworkProperty__Group_5__1 ;
    public final void rule__AddressNetworkProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3186:1: ( rule__AddressNetworkProperty__Group_5__0__Impl rule__AddressNetworkProperty__Group_5__1 )
            // InternalTargetEnvironmentParser.g:3187:2: rule__AddressNetworkProperty__Group_5__0__Impl rule__AddressNetworkProperty__Group_5__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:3194:1: rule__AddressNetworkProperty__Group_5__0__Impl : ( Value ) ;
    public final void rule__AddressNetworkProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3198:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:3199:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:3199:1: ( Value )
            // InternalTargetEnvironmentParser.g:3200:2: Value
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
    // InternalTargetEnvironmentParser.g:3209:1: rule__AddressNetworkProperty__Group_5__1 : rule__AddressNetworkProperty__Group_5__1__Impl ;
    public final void rule__AddressNetworkProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3213:1: ( rule__AddressNetworkProperty__Group_5__1__Impl )
            // InternalTargetEnvironmentParser.g:3214:2: rule__AddressNetworkProperty__Group_5__1__Impl
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
    // InternalTargetEnvironmentParser.g:3220:1: rule__AddressNetworkProperty__Group_5__1__Impl : ( ( rule__AddressNetworkProperty__ValueAssignment_5_1 ) ) ;
    public final void rule__AddressNetworkProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3224:1: ( ( ( rule__AddressNetworkProperty__ValueAssignment_5_1 ) ) )
            // InternalTargetEnvironmentParser.g:3225:1: ( ( rule__AddressNetworkProperty__ValueAssignment_5_1 ) )
            {
            // InternalTargetEnvironmentParser.g:3225:1: ( ( rule__AddressNetworkProperty__ValueAssignment_5_1 ) )
            // InternalTargetEnvironmentParser.g:3226:2: ( rule__AddressNetworkProperty__ValueAssignment_5_1 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValueAssignment_5_1()); 
            // InternalTargetEnvironmentParser.g:3227:2: ( rule__AddressNetworkProperty__ValueAssignment_5_1 )
            // InternalTargetEnvironmentParser.g:3227:3: rule__AddressNetworkProperty__ValueAssignment_5_1
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
    // InternalTargetEnvironmentParser.g:3236:1: rule__DeviceType_Impl__Group__0 : rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 ;
    public final void rule__DeviceType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3240:1: ( rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 )
            // InternalTargetEnvironmentParser.g:3241:2: rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalTargetEnvironmentParser.g:3248:1: rule__DeviceType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__DeviceType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3252:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3253:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3253:1: ( () )
            // InternalTargetEnvironmentParser.g:3254:2: ()
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:3255:2: ()
            // InternalTargetEnvironmentParser.g:3255:3: 
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
    // InternalTargetEnvironmentParser.g:3263:1: rule__DeviceType_Impl__Group__1 : rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 ;
    public final void rule__DeviceType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3267:1: ( rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 )
            // InternalTargetEnvironmentParser.g:3268:2: rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:3275:1: rule__DeviceType_Impl__Group__1__Impl : ( DeviceType ) ;
    public final void rule__DeviceType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3279:1: ( ( DeviceType ) )
            // InternalTargetEnvironmentParser.g:3280:1: ( DeviceType )
            {
            // InternalTargetEnvironmentParser.g:3280:1: ( DeviceType )
            // InternalTargetEnvironmentParser.g:3281:2: DeviceType
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
    // InternalTargetEnvironmentParser.g:3290:1: rule__DeviceType_Impl__Group__2 : rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 ;
    public final void rule__DeviceType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3294:1: ( rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 )
            // InternalTargetEnvironmentParser.g:3295:2: rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3
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
    // InternalTargetEnvironmentParser.g:3302:1: rule__DeviceType_Impl__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3306:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3307:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3307:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3308:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3317:1: rule__DeviceType_Impl__Group__3 : rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 ;
    public final void rule__DeviceType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3321:1: ( rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 )
            // InternalTargetEnvironmentParser.g:3322:2: rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:3329:1: rule__DeviceType_Impl__Group__3__Impl : ( Name ) ;
    public final void rule__DeviceType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3333:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:3334:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:3334:1: ( Name )
            // InternalTargetEnvironmentParser.g:3335:2: Name
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
    // InternalTargetEnvironmentParser.g:3344:1: rule__DeviceType_Impl__Group__4 : rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 ;
    public final void rule__DeviceType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3348:1: ( rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 )
            // InternalTargetEnvironmentParser.g:3349:2: rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalTargetEnvironmentParser.g:3356:1: rule__DeviceType_Impl__Group__4__Impl : ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) ;
    public final void rule__DeviceType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3360:1: ( ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) )
            // InternalTargetEnvironmentParser.g:3361:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            {
            // InternalTargetEnvironmentParser.g:3361:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            // InternalTargetEnvironmentParser.g:3362:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getNameAssignment_4()); 
            // InternalTargetEnvironmentParser.g:3363:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            // InternalTargetEnvironmentParser.g:3363:3: rule__DeviceType_Impl__NameAssignment_4
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
    // InternalTargetEnvironmentParser.g:3371:1: rule__DeviceType_Impl__Group__5 : rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 ;
    public final void rule__DeviceType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3375:1: ( rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 )
            // InternalTargetEnvironmentParser.g:3376:2: rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalTargetEnvironmentParser.g:3383:1: rule__DeviceType_Impl__Group__5__Impl : ( ( rule__DeviceType_Impl__Group_5__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3387:1: ( ( ( rule__DeviceType_Impl__Group_5__0 )? ) )
            // InternalTargetEnvironmentParser.g:3388:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3388:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            // InternalTargetEnvironmentParser.g:3389:2: ( rule__DeviceType_Impl__Group_5__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_5()); 
            // InternalTargetEnvironmentParser.g:3390:2: ( rule__DeviceType_Impl__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Capability) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3390:3: rule__DeviceType_Impl__Group_5__0
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
    // InternalTargetEnvironmentParser.g:3398:1: rule__DeviceType_Impl__Group__6 : rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 ;
    public final void rule__DeviceType_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3402:1: ( rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 )
            // InternalTargetEnvironmentParser.g:3403:2: rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalTargetEnvironmentParser.g:3410:1: rule__DeviceType_Impl__Group__6__Impl : ( ( rule__DeviceType_Impl__Group_6__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3414:1: ( ( ( rule__DeviceType_Impl__Group_6__0 )? ) )
            // InternalTargetEnvironmentParser.g:3415:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3415:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            // InternalTargetEnvironmentParser.g:3416:2: ( rule__DeviceType_Impl__Group_6__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_6()); 
            // InternalTargetEnvironmentParser.g:3417:2: ( rule__DeviceType_Impl__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==CommunicationConnection) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3417:3: rule__DeviceType_Impl__Group_6__0
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
    // InternalTargetEnvironmentParser.g:3425:1: rule__DeviceType_Impl__Group__7 : rule__DeviceType_Impl__Group__7__Impl ;
    public final void rule__DeviceType_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3429:1: ( rule__DeviceType_Impl__Group__7__Impl )
            // InternalTargetEnvironmentParser.g:3430:2: rule__DeviceType_Impl__Group__7__Impl
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
    // InternalTargetEnvironmentParser.g:3436:1: rule__DeviceType_Impl__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3440:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3441:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3441:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3442:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3452:1: rule__DeviceType_Impl__Group_5__0 : rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 ;
    public final void rule__DeviceType_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3456:1: ( rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 )
            // InternalTargetEnvironmentParser.g:3457:2: rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:3464:1: rule__DeviceType_Impl__Group_5__0__Impl : ( Capability ) ;
    public final void rule__DeviceType_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3468:1: ( ( Capability ) )
            // InternalTargetEnvironmentParser.g:3469:1: ( Capability )
            {
            // InternalTargetEnvironmentParser.g:3469:1: ( Capability )
            // InternalTargetEnvironmentParser.g:3470:2: Capability
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
    // InternalTargetEnvironmentParser.g:3479:1: rule__DeviceType_Impl__Group_5__1 : rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 ;
    public final void rule__DeviceType_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3483:1: ( rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 )
            // InternalTargetEnvironmentParser.g:3484:2: rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:3491:1: rule__DeviceType_Impl__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3495:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3496:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3496:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3497:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3506:1: rule__DeviceType_Impl__Group_5__2 : rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 ;
    public final void rule__DeviceType_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3510:1: ( rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 )
            // InternalTargetEnvironmentParser.g:3511:2: rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3
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
    // InternalTargetEnvironmentParser.g:3518:1: rule__DeviceType_Impl__Group_5__2__Impl : ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3522:1: ( ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:3523:1: ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:3523:1: ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) )
            // InternalTargetEnvironmentParser.g:3524:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* )
            {
            // InternalTargetEnvironmentParser.g:3524:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) )
            // InternalTargetEnvironmentParser.g:3525:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:3526:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )
            // InternalTargetEnvironmentParser.g:3526:4: rule__DeviceType_Impl__CapabilityAssignment_5_2
            {
            pushFollow(FOLLOW_11);
            rule__DeviceType_Impl__CapabilityAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 

            }

            // InternalTargetEnvironmentParser.g:3529:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* )
            // InternalTargetEnvironmentParser.g:3530:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:3531:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==HyphenMinus) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:3531:4: rule__DeviceType_Impl__CapabilityAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeviceType_Impl__CapabilityAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalTargetEnvironmentParser.g:3540:1: rule__DeviceType_Impl__Group_5__3 : rule__DeviceType_Impl__Group_5__3__Impl ;
    public final void rule__DeviceType_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3544:1: ( rule__DeviceType_Impl__Group_5__3__Impl )
            // InternalTargetEnvironmentParser.g:3545:2: rule__DeviceType_Impl__Group_5__3__Impl
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
    // InternalTargetEnvironmentParser.g:3551:1: rule__DeviceType_Impl__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3555:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3556:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3556:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3557:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3567:1: rule__DeviceType_Impl__Group_6__0 : rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 ;
    public final void rule__DeviceType_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3571:1: ( rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 )
            // InternalTargetEnvironmentParser.g:3572:2: rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:3579:1: rule__DeviceType_Impl__Group_6__0__Impl : ( CommunicationConnection ) ;
    public final void rule__DeviceType_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3583:1: ( ( CommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:3584:1: ( CommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:3584:1: ( CommunicationConnection )
            // InternalTargetEnvironmentParser.g:3585:2: CommunicationConnection
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
    // InternalTargetEnvironmentParser.g:3594:1: rule__DeviceType_Impl__Group_6__1 : rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 ;
    public final void rule__DeviceType_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3598:1: ( rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 )
            // InternalTargetEnvironmentParser.g:3599:2: rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:3606:1: rule__DeviceType_Impl__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3610:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3611:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3611:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3612:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3621:1: rule__DeviceType_Impl__Group_6__2 : rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 ;
    public final void rule__DeviceType_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3625:1: ( rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 )
            // InternalTargetEnvironmentParser.g:3626:2: rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3
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
    // InternalTargetEnvironmentParser.g:3633:1: rule__DeviceType_Impl__Group_6__2__Impl : ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3637:1: ( ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:3638:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:3638:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            // InternalTargetEnvironmentParser.g:3639:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            {
            // InternalTargetEnvironmentParser.g:3639:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) )
            // InternalTargetEnvironmentParser.g:3640:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:3641:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            // InternalTargetEnvironmentParser.g:3641:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 

            }

            // InternalTargetEnvironmentParser.g:3644:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            // InternalTargetEnvironmentParser.g:3645:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:3646:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==HyphenMinus) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:3646:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalTargetEnvironmentParser.g:3655:1: rule__DeviceType_Impl__Group_6__3 : rule__DeviceType_Impl__Group_6__3__Impl ;
    public final void rule__DeviceType_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3659:1: ( rule__DeviceType_Impl__Group_6__3__Impl )
            // InternalTargetEnvironmentParser.g:3660:2: rule__DeviceType_Impl__Group_6__3__Impl
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
    // InternalTargetEnvironmentParser.g:3666:1: rule__DeviceType_Impl__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3670:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3671:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3671:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3672:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3682:1: rule__ComputationDeviceType__Group__0 : rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 ;
    public final void rule__ComputationDeviceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3686:1: ( rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 )
            // InternalTargetEnvironmentParser.g:3687:2: rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:3694:1: rule__ComputationDeviceType__Group__0__Impl : ( ComputationDeviceType ) ;
    public final void rule__ComputationDeviceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3698:1: ( ( ComputationDeviceType ) )
            // InternalTargetEnvironmentParser.g:3699:1: ( ComputationDeviceType )
            {
            // InternalTargetEnvironmentParser.g:3699:1: ( ComputationDeviceType )
            // InternalTargetEnvironmentParser.g:3700:2: ComputationDeviceType
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
    // InternalTargetEnvironmentParser.g:3709:1: rule__ComputationDeviceType__Group__1 : rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 ;
    public final void rule__ComputationDeviceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3713:1: ( rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 )
            // InternalTargetEnvironmentParser.g:3714:2: rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2
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
    // InternalTargetEnvironmentParser.g:3721:1: rule__ComputationDeviceType__Group__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3725:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3726:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3726:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3727:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3736:1: rule__ComputationDeviceType__Group__2 : rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 ;
    public final void rule__ComputationDeviceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3740:1: ( rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 )
            // InternalTargetEnvironmentParser.g:3741:2: rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:3748:1: rule__ComputationDeviceType__Group__2__Impl : ( Name ) ;
    public final void rule__ComputationDeviceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3752:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:3753:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:3753:1: ( Name )
            // InternalTargetEnvironmentParser.g:3754:2: Name
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
    // InternalTargetEnvironmentParser.g:3763:1: rule__ComputationDeviceType__Group__3 : rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 ;
    public final void rule__ComputationDeviceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3767:1: ( rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 )
            // InternalTargetEnvironmentParser.g:3768:2: rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalTargetEnvironmentParser.g:3775:1: rule__ComputationDeviceType__Group__3__Impl : ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) ;
    public final void rule__ComputationDeviceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3779:1: ( ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:3780:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:3780:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:3781:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:3782:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:3782:3: rule__ComputationDeviceType__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:3790:1: rule__ComputationDeviceType__Group__4 : rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 ;
    public final void rule__ComputationDeviceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3794:1: ( rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 )
            // InternalTargetEnvironmentParser.g:3795:2: rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:3802:1: rule__ComputationDeviceType__Group__4__Impl : ( OperatingSystem ) ;
    public final void rule__ComputationDeviceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3806:1: ( ( OperatingSystem ) )
            // InternalTargetEnvironmentParser.g:3807:1: ( OperatingSystem )
            {
            // InternalTargetEnvironmentParser.g:3807:1: ( OperatingSystem )
            // InternalTargetEnvironmentParser.g:3808:2: OperatingSystem
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
    // InternalTargetEnvironmentParser.g:3817:1: rule__ComputationDeviceType__Group__5 : rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 ;
    public final void rule__ComputationDeviceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3821:1: ( rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 )
            // InternalTargetEnvironmentParser.g:3822:2: rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalTargetEnvironmentParser.g:3829:1: rule__ComputationDeviceType__Group__5__Impl : ( ( rule__ComputationDeviceType__OperatingSystemAssignment_5 ) ) ;
    public final void rule__ComputationDeviceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3833:1: ( ( ( rule__ComputationDeviceType__OperatingSystemAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:3834:1: ( ( rule__ComputationDeviceType__OperatingSystemAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:3834:1: ( ( rule__ComputationDeviceType__OperatingSystemAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:3835:2: ( rule__ComputationDeviceType__OperatingSystemAssignment_5 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemAssignment_5()); 
            // InternalTargetEnvironmentParser.g:3836:2: ( rule__ComputationDeviceType__OperatingSystemAssignment_5 )
            // InternalTargetEnvironmentParser.g:3836:3: rule__ComputationDeviceType__OperatingSystemAssignment_5
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
    // InternalTargetEnvironmentParser.g:3844:1: rule__ComputationDeviceType__Group__6 : rule__ComputationDeviceType__Group__6__Impl rule__ComputationDeviceType__Group__7 ;
    public final void rule__ComputationDeviceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3848:1: ( rule__ComputationDeviceType__Group__6__Impl rule__ComputationDeviceType__Group__7 )
            // InternalTargetEnvironmentParser.g:3849:2: rule__ComputationDeviceType__Group__6__Impl rule__ComputationDeviceType__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:3856:1: rule__ComputationDeviceType__Group__6__Impl : ( ProcessorArchitecture ) ;
    public final void rule__ComputationDeviceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3860:1: ( ( ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:3861:1: ( ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:3861:1: ( ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:3862:2: ProcessorArchitecture
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
    // InternalTargetEnvironmentParser.g:3871:1: rule__ComputationDeviceType__Group__7 : rule__ComputationDeviceType__Group__7__Impl rule__ComputationDeviceType__Group__8 ;
    public final void rule__ComputationDeviceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3875:1: ( rule__ComputationDeviceType__Group__7__Impl rule__ComputationDeviceType__Group__8 )
            // InternalTargetEnvironmentParser.g:3876:2: rule__ComputationDeviceType__Group__7__Impl rule__ComputationDeviceType__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalTargetEnvironmentParser.g:3883:1: rule__ComputationDeviceType__Group__7__Impl : ( ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 ) ) ;
    public final void rule__ComputationDeviceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3887:1: ( ( ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 ) ) )
            // InternalTargetEnvironmentParser.g:3888:1: ( ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 ) )
            {
            // InternalTargetEnvironmentParser.g:3888:1: ( ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 ) )
            // InternalTargetEnvironmentParser.g:3889:2: ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureAssignment_7()); 
            // InternalTargetEnvironmentParser.g:3890:2: ( rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 )
            // InternalTargetEnvironmentParser.g:3890:3: rule__ComputationDeviceType__ProcessorArchitectureAssignment_7
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
    // InternalTargetEnvironmentParser.g:3898:1: rule__ComputationDeviceType__Group__8 : rule__ComputationDeviceType__Group__8__Impl rule__ComputationDeviceType__Group__9 ;
    public final void rule__ComputationDeviceType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3902:1: ( rule__ComputationDeviceType__Group__8__Impl rule__ComputationDeviceType__Group__9 )
            // InternalTargetEnvironmentParser.g:3903:2: rule__ComputationDeviceType__Group__8__Impl rule__ComputationDeviceType__Group__9
            {
            pushFollow(FOLLOW_24);
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
    // InternalTargetEnvironmentParser.g:3910:1: rule__ComputationDeviceType__Group__8__Impl : ( ( rule__ComputationDeviceType__Group_8__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3914:1: ( ( ( rule__ComputationDeviceType__Group_8__0 )? ) )
            // InternalTargetEnvironmentParser.g:3915:1: ( ( rule__ComputationDeviceType__Group_8__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3915:1: ( ( rule__ComputationDeviceType__Group_8__0 )? )
            // InternalTargetEnvironmentParser.g:3916:2: ( rule__ComputationDeviceType__Group_8__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_8()); 
            // InternalTargetEnvironmentParser.g:3917:2: ( rule__ComputationDeviceType__Group_8__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Capability) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3917:3: rule__ComputationDeviceType__Group_8__0
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
    // InternalTargetEnvironmentParser.g:3925:1: rule__ComputationDeviceType__Group__9 : rule__ComputationDeviceType__Group__9__Impl rule__ComputationDeviceType__Group__10 ;
    public final void rule__ComputationDeviceType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3929:1: ( rule__ComputationDeviceType__Group__9__Impl rule__ComputationDeviceType__Group__10 )
            // InternalTargetEnvironmentParser.g:3930:2: rule__ComputationDeviceType__Group__9__Impl rule__ComputationDeviceType__Group__10
            {
            pushFollow(FOLLOW_24);
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
    // InternalTargetEnvironmentParser.g:3937:1: rule__ComputationDeviceType__Group__9__Impl : ( ( rule__ComputationDeviceType__Group_9__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3941:1: ( ( ( rule__ComputationDeviceType__Group_9__0 )? ) )
            // InternalTargetEnvironmentParser.g:3942:1: ( ( rule__ComputationDeviceType__Group_9__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3942:1: ( ( rule__ComputationDeviceType__Group_9__0 )? )
            // InternalTargetEnvironmentParser.g:3943:2: ( rule__ComputationDeviceType__Group_9__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_9()); 
            // InternalTargetEnvironmentParser.g:3944:2: ( rule__ComputationDeviceType__Group_9__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==CommunicationConnection) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3944:3: rule__ComputationDeviceType__Group_9__0
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
    // InternalTargetEnvironmentParser.g:3952:1: rule__ComputationDeviceType__Group__10 : rule__ComputationDeviceType__Group__10__Impl ;
    public final void rule__ComputationDeviceType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3956:1: ( rule__ComputationDeviceType__Group__10__Impl )
            // InternalTargetEnvironmentParser.g:3957:2: rule__ComputationDeviceType__Group__10__Impl
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
    // InternalTargetEnvironmentParser.g:3963:1: rule__ComputationDeviceType__Group__10__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3967:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3968:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3968:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3969:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3979:1: rule__ComputationDeviceType__Group_8__0 : rule__ComputationDeviceType__Group_8__0__Impl rule__ComputationDeviceType__Group_8__1 ;
    public final void rule__ComputationDeviceType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3983:1: ( rule__ComputationDeviceType__Group_8__0__Impl rule__ComputationDeviceType__Group_8__1 )
            // InternalTargetEnvironmentParser.g:3984:2: rule__ComputationDeviceType__Group_8__0__Impl rule__ComputationDeviceType__Group_8__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:3991:1: rule__ComputationDeviceType__Group_8__0__Impl : ( Capability ) ;
    public final void rule__ComputationDeviceType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3995:1: ( ( Capability ) )
            // InternalTargetEnvironmentParser.g:3996:1: ( Capability )
            {
            // InternalTargetEnvironmentParser.g:3996:1: ( Capability )
            // InternalTargetEnvironmentParser.g:3997:2: Capability
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
    // InternalTargetEnvironmentParser.g:4006:1: rule__ComputationDeviceType__Group_8__1 : rule__ComputationDeviceType__Group_8__1__Impl rule__ComputationDeviceType__Group_8__2 ;
    public final void rule__ComputationDeviceType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4010:1: ( rule__ComputationDeviceType__Group_8__1__Impl rule__ComputationDeviceType__Group_8__2 )
            // InternalTargetEnvironmentParser.g:4011:2: rule__ComputationDeviceType__Group_8__1__Impl rule__ComputationDeviceType__Group_8__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:4018:1: rule__ComputationDeviceType__Group_8__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4022:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:4023:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:4023:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:4024:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:4033:1: rule__ComputationDeviceType__Group_8__2 : rule__ComputationDeviceType__Group_8__2__Impl rule__ComputationDeviceType__Group_8__3 ;
    public final void rule__ComputationDeviceType__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4037:1: ( rule__ComputationDeviceType__Group_8__2__Impl rule__ComputationDeviceType__Group_8__3 )
            // InternalTargetEnvironmentParser.g:4038:2: rule__ComputationDeviceType__Group_8__2__Impl rule__ComputationDeviceType__Group_8__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalTargetEnvironmentParser.g:4045:1: rule__ComputationDeviceType__Group_8__2__Impl : ( ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4049:1: ( ( ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:4050:1: ( ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:4050:1: ( ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* ) )
            // InternalTargetEnvironmentParser.g:4051:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* )
            {
            // InternalTargetEnvironmentParser.g:4051:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 ) )
            // InternalTargetEnvironmentParser.g:4052:3: ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_8_2()); 
            // InternalTargetEnvironmentParser.g:4053:3: ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )
            // InternalTargetEnvironmentParser.g:4053:4: rule__ComputationDeviceType__CapabilityAssignment_8_2
            {
            pushFollow(FOLLOW_11);
            rule__ComputationDeviceType__CapabilityAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_8_2()); 

            }

            // InternalTargetEnvironmentParser.g:4056:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )* )
            // InternalTargetEnvironmentParser.g:4057:3: ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_8_2()); 
            // InternalTargetEnvironmentParser.g:4058:3: ( rule__ComputationDeviceType__CapabilityAssignment_8_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==HyphenMinus) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:4058:4: rule__ComputationDeviceType__CapabilityAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComputationDeviceType__CapabilityAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalTargetEnvironmentParser.g:4067:1: rule__ComputationDeviceType__Group_8__3 : rule__ComputationDeviceType__Group_8__3__Impl ;
    public final void rule__ComputationDeviceType__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4071:1: ( rule__ComputationDeviceType__Group_8__3__Impl )
            // InternalTargetEnvironmentParser.g:4072:2: rule__ComputationDeviceType__Group_8__3__Impl
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
    // InternalTargetEnvironmentParser.g:4078:1: rule__ComputationDeviceType__Group_8__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4082:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:4083:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:4083:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:4084:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4094:1: rule__ComputationDeviceType__Group_9__0 : rule__ComputationDeviceType__Group_9__0__Impl rule__ComputationDeviceType__Group_9__1 ;
    public final void rule__ComputationDeviceType__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4098:1: ( rule__ComputationDeviceType__Group_9__0__Impl rule__ComputationDeviceType__Group_9__1 )
            // InternalTargetEnvironmentParser.g:4099:2: rule__ComputationDeviceType__Group_9__0__Impl rule__ComputationDeviceType__Group_9__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:4106:1: rule__ComputationDeviceType__Group_9__0__Impl : ( CommunicationConnection ) ;
    public final void rule__ComputationDeviceType__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4110:1: ( ( CommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:4111:1: ( CommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:4111:1: ( CommunicationConnection )
            // InternalTargetEnvironmentParser.g:4112:2: CommunicationConnection
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
    // InternalTargetEnvironmentParser.g:4121:1: rule__ComputationDeviceType__Group_9__1 : rule__ComputationDeviceType__Group_9__1__Impl rule__ComputationDeviceType__Group_9__2 ;
    public final void rule__ComputationDeviceType__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4125:1: ( rule__ComputationDeviceType__Group_9__1__Impl rule__ComputationDeviceType__Group_9__2 )
            // InternalTargetEnvironmentParser.g:4126:2: rule__ComputationDeviceType__Group_9__1__Impl rule__ComputationDeviceType__Group_9__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:4133:1: rule__ComputationDeviceType__Group_9__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4137:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:4138:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:4138:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:4139:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:4148:1: rule__ComputationDeviceType__Group_9__2 : rule__ComputationDeviceType__Group_9__2__Impl rule__ComputationDeviceType__Group_9__3 ;
    public final void rule__ComputationDeviceType__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4152:1: ( rule__ComputationDeviceType__Group_9__2__Impl rule__ComputationDeviceType__Group_9__3 )
            // InternalTargetEnvironmentParser.g:4153:2: rule__ComputationDeviceType__Group_9__2__Impl rule__ComputationDeviceType__Group_9__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalTargetEnvironmentParser.g:4160:1: rule__ComputationDeviceType__Group_9__2__Impl : ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4164:1: ( ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:4165:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:4165:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* ) )
            // InternalTargetEnvironmentParser.g:4166:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* )
            {
            // InternalTargetEnvironmentParser.g:4166:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 ) )
            // InternalTargetEnvironmentParser.g:4167:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_9_2()); 
            // InternalTargetEnvironmentParser.g:4168:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )
            // InternalTargetEnvironmentParser.g:4168:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2
            {
            pushFollow(FOLLOW_11);
            rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_9_2()); 

            }

            // InternalTargetEnvironmentParser.g:4171:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )* )
            // InternalTargetEnvironmentParser.g:4172:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_9_2()); 
            // InternalTargetEnvironmentParser.g:4173:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==HyphenMinus) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:4173:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalTargetEnvironmentParser.g:4182:1: rule__ComputationDeviceType__Group_9__3 : rule__ComputationDeviceType__Group_9__3__Impl ;
    public final void rule__ComputationDeviceType__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4186:1: ( rule__ComputationDeviceType__Group_9__3__Impl )
            // InternalTargetEnvironmentParser.g:4187:2: rule__ComputationDeviceType__Group_9__3__Impl
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
    // InternalTargetEnvironmentParser.g:4193:1: rule__ComputationDeviceType__Group_9__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4197:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:4198:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:4198:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:4199:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4209:1: rule__CapabilityProperty__Group__0 : rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 ;
    public final void rule__CapabilityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4213:1: ( rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:4214:2: rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1
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
    // InternalTargetEnvironmentParser.g:4221:1: rule__CapabilityProperty__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__CapabilityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4225:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:4226:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:4226:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:4227:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:4236:1: rule__CapabilityProperty__Group__1 : rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 ;
    public final void rule__CapabilityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4240:1: ( rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:4241:2: rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:4248:1: rule__CapabilityProperty__Group__1__Impl : ( Name ) ;
    public final void rule__CapabilityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4252:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:4253:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:4253:1: ( Name )
            // InternalTargetEnvironmentParser.g:4254:2: Name
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
    // InternalTargetEnvironmentParser.g:4263:1: rule__CapabilityProperty__Group__2 : rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 ;
    public final void rule__CapabilityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4267:1: ( rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:4268:2: rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:4275:1: rule__CapabilityProperty__Group__2__Impl : ( ( rule__CapabilityProperty__NameAssignment_2 ) ) ;
    public final void rule__CapabilityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4279:1: ( ( ( rule__CapabilityProperty__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:4280:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:4280:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:4281:2: ( rule__CapabilityProperty__NameAssignment_2 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:4282:2: ( rule__CapabilityProperty__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:4282:3: rule__CapabilityProperty__NameAssignment_2
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
    // InternalTargetEnvironmentParser.g:4290:1: rule__CapabilityProperty__Group__3 : rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 ;
    public final void rule__CapabilityProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4294:1: ( rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:4295:2: rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetEnvironmentParser.g:4302:1: rule__CapabilityProperty__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__CapabilityProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4306:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:4307:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:4307:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:4308:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:4317:1: rule__CapabilityProperty__Group__4 : rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 ;
    public final void rule__CapabilityProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4321:1: ( rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 )
            // InternalTargetEnvironmentParser.g:4322:2: rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:4329:1: rule__CapabilityProperty__Group__4__Impl : ( Type ) ;
    public final void rule__CapabilityProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4333:1: ( ( Type ) )
            // InternalTargetEnvironmentParser.g:4334:1: ( Type )
            {
            // InternalTargetEnvironmentParser.g:4334:1: ( Type )
            // InternalTargetEnvironmentParser.g:4335:2: Type
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
    // InternalTargetEnvironmentParser.g:4344:1: rule__CapabilityProperty__Group__5 : rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 ;
    public final void rule__CapabilityProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4348:1: ( rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 )
            // InternalTargetEnvironmentParser.g:4349:2: rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalTargetEnvironmentParser.g:4356:1: rule__CapabilityProperty__Group__5__Impl : ( ( rule__CapabilityProperty__TypeAssignment_5 ) ) ;
    public final void rule__CapabilityProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4360:1: ( ( ( rule__CapabilityProperty__TypeAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:4361:1: ( ( rule__CapabilityProperty__TypeAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:4361:1: ( ( rule__CapabilityProperty__TypeAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:4362:2: ( rule__CapabilityProperty__TypeAssignment_5 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeAssignment_5()); 
            // InternalTargetEnvironmentParser.g:4363:2: ( rule__CapabilityProperty__TypeAssignment_5 )
            // InternalTargetEnvironmentParser.g:4363:3: rule__CapabilityProperty__TypeAssignment_5
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
    // InternalTargetEnvironmentParser.g:4371:1: rule__CapabilityProperty__Group__6 : rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 ;
    public final void rule__CapabilityProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4375:1: ( rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 )
            // InternalTargetEnvironmentParser.g:4376:2: rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalTargetEnvironmentParser.g:4383:1: rule__CapabilityProperty__Group__6__Impl : ( Kind ) ;
    public final void rule__CapabilityProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4387:1: ( ( Kind ) )
            // InternalTargetEnvironmentParser.g:4388:1: ( Kind )
            {
            // InternalTargetEnvironmentParser.g:4388:1: ( Kind )
            // InternalTargetEnvironmentParser.g:4389:2: Kind
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
    // InternalTargetEnvironmentParser.g:4398:1: rule__CapabilityProperty__Group__7 : rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 ;
    public final void rule__CapabilityProperty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4402:1: ( rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 )
            // InternalTargetEnvironmentParser.g:4403:2: rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalTargetEnvironmentParser.g:4410:1: rule__CapabilityProperty__Group__7__Impl : ( ( rule__CapabilityProperty__KindAssignment_7 ) ) ;
    public final void rule__CapabilityProperty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4414:1: ( ( ( rule__CapabilityProperty__KindAssignment_7 ) ) )
            // InternalTargetEnvironmentParser.g:4415:1: ( ( rule__CapabilityProperty__KindAssignment_7 ) )
            {
            // InternalTargetEnvironmentParser.g:4415:1: ( ( rule__CapabilityProperty__KindAssignment_7 ) )
            // InternalTargetEnvironmentParser.g:4416:2: ( rule__CapabilityProperty__KindAssignment_7 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindAssignment_7()); 
            // InternalTargetEnvironmentParser.g:4417:2: ( rule__CapabilityProperty__KindAssignment_7 )
            // InternalTargetEnvironmentParser.g:4417:3: rule__CapabilityProperty__KindAssignment_7
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
    // InternalTargetEnvironmentParser.g:4425:1: rule__CapabilityProperty__Group__8 : rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 ;
    public final void rule__CapabilityProperty__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4429:1: ( rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 )
            // InternalTargetEnvironmentParser.g:4430:2: rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalTargetEnvironmentParser.g:4437:1: rule__CapabilityProperty__Group__8__Impl : ( ( rule__CapabilityProperty__Group_8__0 )? ) ;
    public final void rule__CapabilityProperty__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4441:1: ( ( ( rule__CapabilityProperty__Group_8__0 )? ) )
            // InternalTargetEnvironmentParser.g:4442:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            {
            // InternalTargetEnvironmentParser.g:4442:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            // InternalTargetEnvironmentParser.g:4443:2: ( rule__CapabilityProperty__Group_8__0 )?
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup_8()); 
            // InternalTargetEnvironmentParser.g:4444:2: ( rule__CapabilityProperty__Group_8__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Value) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4444:3: rule__CapabilityProperty__Group_8__0
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
    // InternalTargetEnvironmentParser.g:4452:1: rule__CapabilityProperty__Group__9 : rule__CapabilityProperty__Group__9__Impl ;
    public final void rule__CapabilityProperty__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4456:1: ( rule__CapabilityProperty__Group__9__Impl )
            // InternalTargetEnvironmentParser.g:4457:2: rule__CapabilityProperty__Group__9__Impl
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
    // InternalTargetEnvironmentParser.g:4463:1: rule__CapabilityProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__CapabilityProperty__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4467:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:4468:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:4468:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:4469:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4479:1: rule__CapabilityProperty__Group_8__0 : rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 ;
    public final void rule__CapabilityProperty__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4483:1: ( rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 )
            // InternalTargetEnvironmentParser.g:4484:2: rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTargetEnvironmentParser.g:4491:1: rule__CapabilityProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__CapabilityProperty__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4495:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:4496:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:4496:1: ( Value )
            // InternalTargetEnvironmentParser.g:4497:2: Value
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
    // InternalTargetEnvironmentParser.g:4506:1: rule__CapabilityProperty__Group_8__1 : rule__CapabilityProperty__Group_8__1__Impl ;
    public final void rule__CapabilityProperty__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4510:1: ( rule__CapabilityProperty__Group_8__1__Impl )
            // InternalTargetEnvironmentParser.g:4511:2: rule__CapabilityProperty__Group_8__1__Impl
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
    // InternalTargetEnvironmentParser.g:4517:1: rule__CapabilityProperty__Group_8__1__Impl : ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__CapabilityProperty__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4521:1: ( ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) )
            // InternalTargetEnvironmentParser.g:4522:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            {
            // InternalTargetEnvironmentParser.g:4522:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            // InternalTargetEnvironmentParser.g:4523:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getValueAssignment_8_1()); 
            // InternalTargetEnvironmentParser.g:4524:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            // InternalTargetEnvironmentParser.g:4524:3: rule__CapabilityProperty__ValueAssignment_8_1
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
    // InternalTargetEnvironmentParser.g:4533:1: rule__AttributeKind__Group__0 : rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 ;
    public final void rule__AttributeKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4537:1: ( rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 )
            // InternalTargetEnvironmentParser.g:4538:2: rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalTargetEnvironmentParser.g:4545:1: rule__AttributeKind__Group__0__Impl : ( () ) ;
    public final void rule__AttributeKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4549:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4550:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4550:1: ( () )
            // InternalTargetEnvironmentParser.g:4551:2: ()
            {
             before(grammarAccess.getAttributeKindAccess().getAttributeKindAction_0()); 
            // InternalTargetEnvironmentParser.g:4552:2: ()
            // InternalTargetEnvironmentParser.g:4552:3: 
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
    // InternalTargetEnvironmentParser.g:4560:1: rule__AttributeKind__Group__1 : rule__AttributeKind__Group__1__Impl ;
    public final void rule__AttributeKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4564:1: ( rule__AttributeKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:4565:2: rule__AttributeKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:4571:1: rule__AttributeKind__Group__1__Impl : ( AttributeKind ) ;
    public final void rule__AttributeKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4575:1: ( ( AttributeKind ) )
            // InternalTargetEnvironmentParser.g:4576:1: ( AttributeKind )
            {
            // InternalTargetEnvironmentParser.g:4576:1: ( AttributeKind )
            // InternalTargetEnvironmentParser.g:4577:2: AttributeKind
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
    // InternalTargetEnvironmentParser.g:4587:1: rule__MaximumKind__Group__0 : rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 ;
    public final void rule__MaximumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4591:1: ( rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 )
            // InternalTargetEnvironmentParser.g:4592:2: rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTargetEnvironmentParser.g:4599:1: rule__MaximumKind__Group__0__Impl : ( () ) ;
    public final void rule__MaximumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4603:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4604:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4604:1: ( () )
            // InternalTargetEnvironmentParser.g:4605:2: ()
            {
             before(grammarAccess.getMaximumKindAccess().getMaximumKindAction_0()); 
            // InternalTargetEnvironmentParser.g:4606:2: ()
            // InternalTargetEnvironmentParser.g:4606:3: 
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
    // InternalTargetEnvironmentParser.g:4614:1: rule__MaximumKind__Group__1 : rule__MaximumKind__Group__1__Impl ;
    public final void rule__MaximumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4618:1: ( rule__MaximumKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:4619:2: rule__MaximumKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:4625:1: rule__MaximumKind__Group__1__Impl : ( MaximumKind ) ;
    public final void rule__MaximumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4629:1: ( ( MaximumKind ) )
            // InternalTargetEnvironmentParser.g:4630:1: ( MaximumKind )
            {
            // InternalTargetEnvironmentParser.g:4630:1: ( MaximumKind )
            // InternalTargetEnvironmentParser.g:4631:2: MaximumKind
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
    // InternalTargetEnvironmentParser.g:4641:1: rule__MinimumKind__Group__0 : rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 ;
    public final void rule__MinimumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4645:1: ( rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 )
            // InternalTargetEnvironmentParser.g:4646:2: rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalTargetEnvironmentParser.g:4653:1: rule__MinimumKind__Group__0__Impl : ( () ) ;
    public final void rule__MinimumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4657:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4658:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4658:1: ( () )
            // InternalTargetEnvironmentParser.g:4659:2: ()
            {
             before(grammarAccess.getMinimumKindAccess().getMinimumKindAction_0()); 
            // InternalTargetEnvironmentParser.g:4660:2: ()
            // InternalTargetEnvironmentParser.g:4660:3: 
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
    // InternalTargetEnvironmentParser.g:4668:1: rule__MinimumKind__Group__1 : rule__MinimumKind__Group__1__Impl ;
    public final void rule__MinimumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4672:1: ( rule__MinimumKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:4673:2: rule__MinimumKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:4679:1: rule__MinimumKind__Group__1__Impl : ( MinimumKind ) ;
    public final void rule__MinimumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4683:1: ( ( MinimumKind ) )
            // InternalTargetEnvironmentParser.g:4684:1: ( MinimumKind )
            {
            // InternalTargetEnvironmentParser.g:4684:1: ( MinimumKind )
            // InternalTargetEnvironmentParser.g:4685:2: MinimumKind
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
    // InternalTargetEnvironmentParser.g:4695:1: rule__SelectionKind__Group__0 : rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 ;
    public final void rule__SelectionKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4699:1: ( rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 )
            // InternalTargetEnvironmentParser.g:4700:2: rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTargetEnvironmentParser.g:4707:1: rule__SelectionKind__Group__0__Impl : ( () ) ;
    public final void rule__SelectionKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4711:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4712:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4712:1: ( () )
            // InternalTargetEnvironmentParser.g:4713:2: ()
            {
             before(grammarAccess.getSelectionKindAccess().getSelectionKindAction_0()); 
            // InternalTargetEnvironmentParser.g:4714:2: ()
            // InternalTargetEnvironmentParser.g:4714:3: 
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
    // InternalTargetEnvironmentParser.g:4722:1: rule__SelectionKind__Group__1 : rule__SelectionKind__Group__1__Impl ;
    public final void rule__SelectionKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4726:1: ( rule__SelectionKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:4727:2: rule__SelectionKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:4733:1: rule__SelectionKind__Group__1__Impl : ( SelectionKind ) ;
    public final void rule__SelectionKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4737:1: ( ( SelectionKind ) )
            // InternalTargetEnvironmentParser.g:4738:1: ( SelectionKind )
            {
            // InternalTargetEnvironmentParser.g:4738:1: ( SelectionKind )
            // InternalTargetEnvironmentParser.g:4739:2: SelectionKind
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
    // InternalTargetEnvironmentParser.g:4749:1: rule__ConnectionProperty__Group__0 : rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 ;
    public final void rule__ConnectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4753:1: ( rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:4754:2: rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:4761:1: rule__ConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4765:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4766:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4766:1: ( () )
            // InternalTargetEnvironmentParser.g:4767:2: ()
            {
             before(grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:4768:2: ()
            // InternalTargetEnvironmentParser.g:4768:3: 
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
    // InternalTargetEnvironmentParser.g:4776:1: rule__ConnectionProperty__Group__1 : rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 ;
    public final void rule__ConnectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4780:1: ( rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:4781:2: rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2
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
    // InternalTargetEnvironmentParser.g:4788:1: rule__ConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4792:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:4793:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:4793:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:4794:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:4803:1: rule__ConnectionProperty__Group__2 : rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 ;
    public final void rule__ConnectionProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4807:1: ( rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:4808:2: rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:4815:1: rule__ConnectionProperty__Group__2__Impl : ( Name ) ;
    public final void rule__ConnectionProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4819:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:4820:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:4820:1: ( Name )
            // InternalTargetEnvironmentParser.g:4821:2: Name
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
    // InternalTargetEnvironmentParser.g:4830:1: rule__ConnectionProperty__Group__3 : rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 ;
    public final void rule__ConnectionProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4834:1: ( rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:4835:2: rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:4842:1: rule__ConnectionProperty__Group__3__Impl : ( ( rule__ConnectionProperty__NameAssignment_3 ) ) ;
    public final void rule__ConnectionProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4846:1: ( ( ( rule__ConnectionProperty__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:4847:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:4847:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:4848:2: ( rule__ConnectionProperty__NameAssignment_3 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:4849:2: ( rule__ConnectionProperty__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:4849:3: rule__ConnectionProperty__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:4857:1: rule__ConnectionProperty__Group__4 : rule__ConnectionProperty__Group__4__Impl ;
    public final void rule__ConnectionProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4861:1: ( rule__ConnectionProperty__Group__4__Impl )
            // InternalTargetEnvironmentParser.g:4862:2: rule__ConnectionProperty__Group__4__Impl
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
    // InternalTargetEnvironmentParser.g:4868:1: rule__ConnectionProperty__Group__4__Impl : ( ( rule__ConnectionProperty__Group_4__0 )? ) ;
    public final void rule__ConnectionProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4872:1: ( ( ( rule__ConnectionProperty__Group_4__0 )? ) )
            // InternalTargetEnvironmentParser.g:4873:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            {
            // InternalTargetEnvironmentParser.g:4873:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            // InternalTargetEnvironmentParser.g:4874:2: ( rule__ConnectionProperty__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup_4()); 
            // InternalTargetEnvironmentParser.g:4875:2: ( rule__ConnectionProperty__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INDENT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4875:3: rule__ConnectionProperty__Group_4__0
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
    // InternalTargetEnvironmentParser.g:4884:1: rule__ConnectionProperty__Group_4__0 : rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 ;
    public final void rule__ConnectionProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4888:1: ( rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 )
            // InternalTargetEnvironmentParser.g:4889:2: rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTargetEnvironmentParser.g:4896:1: rule__ConnectionProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectionProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4900:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:4901:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:4901:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:4902:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:4911:1: rule__ConnectionProperty__Group_4__1 : rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 ;
    public final void rule__ConnectionProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4915:1: ( rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 )
            // InternalTargetEnvironmentParser.g:4916:2: rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTargetEnvironmentParser.g:4923:1: rule__ConnectionProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__ConnectionProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4927:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:4928:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:4928:1: ( Value )
            // InternalTargetEnvironmentParser.g:4929:2: Value
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
    // InternalTargetEnvironmentParser.g:4938:1: rule__ConnectionProperty__Group_4__2 : rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 ;
    public final void rule__ConnectionProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4942:1: ( rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 )
            // InternalTargetEnvironmentParser.g:4943:2: rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3
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
    // InternalTargetEnvironmentParser.g:4950:1: rule__ConnectionProperty__Group_4__2__Impl : ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__ConnectionProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4954:1: ( ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) )
            // InternalTargetEnvironmentParser.g:4955:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            {
            // InternalTargetEnvironmentParser.g:4955:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            // InternalTargetEnvironmentParser.g:4956:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getValueAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:4957:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            // InternalTargetEnvironmentParser.g:4957:3: rule__ConnectionProperty__ValueAssignment_4_2
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
    // InternalTargetEnvironmentParser.g:4965:1: rule__ConnectionProperty__Group_4__3 : rule__ConnectionProperty__Group_4__3__Impl ;
    public final void rule__ConnectionProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4969:1: ( rule__ConnectionProperty__Group_4__3__Impl )
            // InternalTargetEnvironmentParser.g:4970:2: rule__ConnectionProperty__Group_4__3__Impl
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
    // InternalTargetEnvironmentParser.g:4976:1: rule__ConnectionProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectionProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4980:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:4981:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:4981:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:4982:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4992:1: rule__NetworkConnection__Group__0 : rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 ;
    public final void rule__NetworkConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4996:1: ( rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 )
            // InternalTargetEnvironmentParser.g:4997:2: rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:5004:1: rule__NetworkConnection__Group__0__Impl : ( () ) ;
    public final void rule__NetworkConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5008:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5009:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5009:1: ( () )
            // InternalTargetEnvironmentParser.g:5010:2: ()
            {
             before(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionAction_0()); 
            // InternalTargetEnvironmentParser.g:5011:2: ()
            // InternalTargetEnvironmentParser.g:5011:3: 
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
    // InternalTargetEnvironmentParser.g:5019:1: rule__NetworkConnection__Group__1 : rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 ;
    public final void rule__NetworkConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5023:1: ( rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 )
            // InternalTargetEnvironmentParser.g:5024:2: rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2
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
    // InternalTargetEnvironmentParser.g:5031:1: rule__NetworkConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__NetworkConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5035:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:5036:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:5036:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:5037:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:5046:1: rule__NetworkConnection__Group__2 : rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 ;
    public final void rule__NetworkConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5050:1: ( rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 )
            // InternalTargetEnvironmentParser.g:5051:2: rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:5058:1: rule__NetworkConnection__Group__2__Impl : ( Name ) ;
    public final void rule__NetworkConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5062:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:5063:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:5063:1: ( Name )
            // InternalTargetEnvironmentParser.g:5064:2: Name
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
    // InternalTargetEnvironmentParser.g:5073:1: rule__NetworkConnection__Group__3 : rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 ;
    public final void rule__NetworkConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5077:1: ( rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 )
            // InternalTargetEnvironmentParser.g:5078:2: rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:5085:1: rule__NetworkConnection__Group__3__Impl : ( ( rule__NetworkConnection__NameAssignment_3 ) ) ;
    public final void rule__NetworkConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5089:1: ( ( ( rule__NetworkConnection__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:5090:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:5090:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:5091:2: ( rule__NetworkConnection__NameAssignment_3 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:5092:2: ( rule__NetworkConnection__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:5092:3: rule__NetworkConnection__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:5100:1: rule__NetworkConnection__Group__4 : rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 ;
    public final void rule__NetworkConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5104:1: ( rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 )
            // InternalTargetEnvironmentParser.g:5105:2: rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetEnvironmentParser.g:5112:1: rule__NetworkConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5116:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:5117:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:5117:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:5118:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:5127:1: rule__NetworkConnection__Group__5 : rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 ;
    public final void rule__NetworkConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5131:1: ( rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 )
            // InternalTargetEnvironmentParser.g:5132:2: rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:5139:1: rule__NetworkConnection__Group__5__Impl : ( Type ) ;
    public final void rule__NetworkConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5143:1: ( ( Type ) )
            // InternalTargetEnvironmentParser.g:5144:1: ( Type )
            {
            // InternalTargetEnvironmentParser.g:5144:1: ( Type )
            // InternalTargetEnvironmentParser.g:5145:2: Type
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
    // InternalTargetEnvironmentParser.g:5154:1: rule__NetworkConnection__Group__6 : rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 ;
    public final void rule__NetworkConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5158:1: ( rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 )
            // InternalTargetEnvironmentParser.g:5159:2: rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalTargetEnvironmentParser.g:5166:1: rule__NetworkConnection__Group__6__Impl : ( ( rule__NetworkConnection__TypeAssignment_6 ) ) ;
    public final void rule__NetworkConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5170:1: ( ( ( rule__NetworkConnection__TypeAssignment_6 ) ) )
            // InternalTargetEnvironmentParser.g:5171:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            {
            // InternalTargetEnvironmentParser.g:5171:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            // InternalTargetEnvironmentParser.g:5172:2: ( rule__NetworkConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeAssignment_6()); 
            // InternalTargetEnvironmentParser.g:5173:2: ( rule__NetworkConnection__TypeAssignment_6 )
            // InternalTargetEnvironmentParser.g:5173:3: rule__NetworkConnection__TypeAssignment_6
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
    // InternalTargetEnvironmentParser.g:5181:1: rule__NetworkConnection__Group__7 : rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 ;
    public final void rule__NetworkConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5185:1: ( rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 )
            // InternalTargetEnvironmentParser.g:5186:2: rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8
            {
            pushFollow(FOLLOW_33);
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
    // InternalTargetEnvironmentParser.g:5193:1: rule__NetworkConnection__Group__7__Impl : ( ( rule__NetworkConnection__Group_7__0 )? ) ;
    public final void rule__NetworkConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5197:1: ( ( ( rule__NetworkConnection__Group_7__0 )? ) )
            // InternalTargetEnvironmentParser.g:5198:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            {
            // InternalTargetEnvironmentParser.g:5198:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            // InternalTargetEnvironmentParser.g:5199:2: ( rule__NetworkConnection__Group_7__0 )?
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup_7()); 
            // InternalTargetEnvironmentParser.g:5200:2: ( rule__NetworkConnection__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Properties) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5200:3: rule__NetworkConnection__Group_7__0
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
    // InternalTargetEnvironmentParser.g:5208:1: rule__NetworkConnection__Group__8 : rule__NetworkConnection__Group__8__Impl ;
    public final void rule__NetworkConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5212:1: ( rule__NetworkConnection__Group__8__Impl )
            // InternalTargetEnvironmentParser.g:5213:2: rule__NetworkConnection__Group__8__Impl
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
    // InternalTargetEnvironmentParser.g:5219:1: rule__NetworkConnection__Group__8__Impl : ( RightCurlyBracket ) ;
    public final void rule__NetworkConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5223:1: ( ( RightCurlyBracket ) )
            // InternalTargetEnvironmentParser.g:5224:1: ( RightCurlyBracket )
            {
            // InternalTargetEnvironmentParser.g:5224:1: ( RightCurlyBracket )
            // InternalTargetEnvironmentParser.g:5225:2: RightCurlyBracket
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
    // InternalTargetEnvironmentParser.g:5235:1: rule__NetworkConnection__Group_7__0 : rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 ;
    public final void rule__NetworkConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5239:1: ( rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 )
            // InternalTargetEnvironmentParser.g:5240:2: rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:5247:1: rule__NetworkConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__NetworkConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5251:1: ( ( Properties ) )
            // InternalTargetEnvironmentParser.g:5252:1: ( Properties )
            {
            // InternalTargetEnvironmentParser.g:5252:1: ( Properties )
            // InternalTargetEnvironmentParser.g:5253:2: Properties
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
    // InternalTargetEnvironmentParser.g:5262:1: rule__NetworkConnection__Group_7__1 : rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 ;
    public final void rule__NetworkConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5266:1: ( rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 )
            // InternalTargetEnvironmentParser.g:5267:2: rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:5274:1: rule__NetworkConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5278:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:5279:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:5279:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:5280:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:5289:1: rule__NetworkConnection__Group_7__2 : rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 ;
    public final void rule__NetworkConnection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5293:1: ( rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 )
            // InternalTargetEnvironmentParser.g:5294:2: rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3
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
    // InternalTargetEnvironmentParser.g:5301:1: rule__NetworkConnection__Group_7__2__Impl : ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__NetworkConnection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5305:1: ( ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:5306:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:5306:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            // InternalTargetEnvironmentParser.g:5307:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalTargetEnvironmentParser.g:5307:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) )
            // InternalTargetEnvironmentParser.g:5308:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:5309:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            // InternalTargetEnvironmentParser.g:5309:4: rule__NetworkConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_34);
            rule__NetworkConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 

            }

            // InternalTargetEnvironmentParser.g:5312:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            // InternalTargetEnvironmentParser.g:5313:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:5314:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_INDENT) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:5314:4: rule__NetworkConnection__PropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__NetworkConnection__PropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalTargetEnvironmentParser.g:5323:1: rule__NetworkConnection__Group_7__3 : rule__NetworkConnection__Group_7__3__Impl ;
    public final void rule__NetworkConnection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5327:1: ( rule__NetworkConnection__Group_7__3__Impl )
            // InternalTargetEnvironmentParser.g:5328:2: rule__NetworkConnection__Group_7__3__Impl
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
    // InternalTargetEnvironmentParser.g:5334:1: rule__NetworkConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__NetworkConnection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5338:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:5339:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:5339:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:5340:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:5350:1: rule__CommunicationConnection__Group__0 : rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 ;
    public final void rule__CommunicationConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5354:1: ( rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 )
            // InternalTargetEnvironmentParser.g:5355:2: rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:5362:1: rule__CommunicationConnection__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5366:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5367:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5367:1: ( () )
            // InternalTargetEnvironmentParser.g:5368:2: ()
            {
             before(grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0()); 
            // InternalTargetEnvironmentParser.g:5369:2: ()
            // InternalTargetEnvironmentParser.g:5369:3: 
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
    // InternalTargetEnvironmentParser.g:5377:1: rule__CommunicationConnection__Group__1 : rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 ;
    public final void rule__CommunicationConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5381:1: ( rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 )
            // InternalTargetEnvironmentParser.g:5382:2: rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2
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
    // InternalTargetEnvironmentParser.g:5389:1: rule__CommunicationConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__CommunicationConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5393:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:5394:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:5394:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:5395:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:5404:1: rule__CommunicationConnection__Group__2 : rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 ;
    public final void rule__CommunicationConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5408:1: ( rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 )
            // InternalTargetEnvironmentParser.g:5409:2: rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:5416:1: rule__CommunicationConnection__Group__2__Impl : ( Name ) ;
    public final void rule__CommunicationConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5420:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:5421:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:5421:1: ( Name )
            // InternalTargetEnvironmentParser.g:5422:2: Name
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
    // InternalTargetEnvironmentParser.g:5431:1: rule__CommunicationConnection__Group__3 : rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 ;
    public final void rule__CommunicationConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5435:1: ( rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 )
            // InternalTargetEnvironmentParser.g:5436:2: rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:5443:1: rule__CommunicationConnection__Group__3__Impl : ( ( rule__CommunicationConnection__NameAssignment_3 ) ) ;
    public final void rule__CommunicationConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5447:1: ( ( ( rule__CommunicationConnection__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:5448:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:5448:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:5449:2: ( rule__CommunicationConnection__NameAssignment_3 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:5450:2: ( rule__CommunicationConnection__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:5450:3: rule__CommunicationConnection__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:5458:1: rule__CommunicationConnection__Group__4 : rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 ;
    public final void rule__CommunicationConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5462:1: ( rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 )
            // InternalTargetEnvironmentParser.g:5463:2: rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetEnvironmentParser.g:5470:1: rule__CommunicationConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5474:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:5475:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:5475:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:5476:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:5485:1: rule__CommunicationConnection__Group__5 : rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 ;
    public final void rule__CommunicationConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5489:1: ( rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 )
            // InternalTargetEnvironmentParser.g:5490:2: rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:5497:1: rule__CommunicationConnection__Group__5__Impl : ( Type ) ;
    public final void rule__CommunicationConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5501:1: ( ( Type ) )
            // InternalTargetEnvironmentParser.g:5502:1: ( Type )
            {
            // InternalTargetEnvironmentParser.g:5502:1: ( Type )
            // InternalTargetEnvironmentParser.g:5503:2: Type
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
    // InternalTargetEnvironmentParser.g:5512:1: rule__CommunicationConnection__Group__6 : rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 ;
    public final void rule__CommunicationConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5516:1: ( rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 )
            // InternalTargetEnvironmentParser.g:5517:2: rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalTargetEnvironmentParser.g:5524:1: rule__CommunicationConnection__Group__6__Impl : ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) ;
    public final void rule__CommunicationConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5528:1: ( ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) )
            // InternalTargetEnvironmentParser.g:5529:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            {
            // InternalTargetEnvironmentParser.g:5529:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            // InternalTargetEnvironmentParser.g:5530:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6()); 
            // InternalTargetEnvironmentParser.g:5531:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            // InternalTargetEnvironmentParser.g:5531:3: rule__CommunicationConnection__TypeAssignment_6
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
    // InternalTargetEnvironmentParser.g:5539:1: rule__CommunicationConnection__Group__7 : rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 ;
    public final void rule__CommunicationConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5543:1: ( rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 )
            // InternalTargetEnvironmentParser.g:5544:2: rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8
            {
            pushFollow(FOLLOW_35);
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
    // InternalTargetEnvironmentParser.g:5551:1: rule__CommunicationConnection__Group__7__Impl : ( ( rule__CommunicationConnection__Group_7__0 )? ) ;
    public final void rule__CommunicationConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5555:1: ( ( ( rule__CommunicationConnection__Group_7__0 )? ) )
            // InternalTargetEnvironmentParser.g:5556:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            {
            // InternalTargetEnvironmentParser.g:5556:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            // InternalTargetEnvironmentParser.g:5557:2: ( rule__CommunicationConnection__Group_7__0 )?
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup_7()); 
            // InternalTargetEnvironmentParser.g:5558:2: ( rule__CommunicationConnection__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Properties) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5558:3: rule__CommunicationConnection__Group_7__0
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
    // InternalTargetEnvironmentParser.g:5566:1: rule__CommunicationConnection__Group__8 : rule__CommunicationConnection__Group__8__Impl ;
    public final void rule__CommunicationConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5570:1: ( rule__CommunicationConnection__Group__8__Impl )
            // InternalTargetEnvironmentParser.g:5571:2: rule__CommunicationConnection__Group__8__Impl
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
    // InternalTargetEnvironmentParser.g:5577:1: rule__CommunicationConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5581:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:5582:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:5582:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:5583:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:5593:1: rule__CommunicationConnection__Group_7__0 : rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 ;
    public final void rule__CommunicationConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5597:1: ( rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 )
            // InternalTargetEnvironmentParser.g:5598:2: rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:5605:1: rule__CommunicationConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__CommunicationConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5609:1: ( ( Properties ) )
            // InternalTargetEnvironmentParser.g:5610:1: ( Properties )
            {
            // InternalTargetEnvironmentParser.g:5610:1: ( Properties )
            // InternalTargetEnvironmentParser.g:5611:2: Properties
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
    // InternalTargetEnvironmentParser.g:5620:1: rule__CommunicationConnection__Group_7__1 : rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 ;
    public final void rule__CommunicationConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5624:1: ( rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 )
            // InternalTargetEnvironmentParser.g:5625:2: rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:5632:1: rule__CommunicationConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5636:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:5637:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:5637:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:5638:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:5647:1: rule__CommunicationConnection__Group_7__2 : rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 ;
    public final void rule__CommunicationConnection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5651:1: ( rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 )
            // InternalTargetEnvironmentParser.g:5652:2: rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3
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
    // InternalTargetEnvironmentParser.g:5659:1: rule__CommunicationConnection__Group_7__2__Impl : ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__CommunicationConnection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5663:1: ( ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:5664:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:5664:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            // InternalTargetEnvironmentParser.g:5665:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalTargetEnvironmentParser.g:5665:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) )
            // InternalTargetEnvironmentParser.g:5666:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:5667:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            // InternalTargetEnvironmentParser.g:5667:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_11);
            rule__CommunicationConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 

            }

            // InternalTargetEnvironmentParser.g:5670:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            // InternalTargetEnvironmentParser.g:5671:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:5672:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==HyphenMinus) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:5672:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CommunicationConnection__PropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalTargetEnvironmentParser.g:5681:1: rule__CommunicationConnection__Group_7__3 : rule__CommunicationConnection__Group_7__3__Impl ;
    public final void rule__CommunicationConnection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5685:1: ( rule__CommunicationConnection__Group_7__3__Impl )
            // InternalTargetEnvironmentParser.g:5686:2: rule__CommunicationConnection__Group_7__3__Impl
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
    // InternalTargetEnvironmentParser.g:5692:1: rule__CommunicationConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5696:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:5697:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:5697:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:5698:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:5708:1: rule__ResouceType_Impl__Group__0 : rule__ResouceType_Impl__Group__0__Impl rule__ResouceType_Impl__Group__1 ;
    public final void rule__ResouceType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5712:1: ( rule__ResouceType_Impl__Group__0__Impl rule__ResouceType_Impl__Group__1 )
            // InternalTargetEnvironmentParser.g:5713:2: rule__ResouceType_Impl__Group__0__Impl rule__ResouceType_Impl__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalTargetEnvironmentParser.g:5720:1: rule__ResouceType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ResouceType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5724:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5725:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5725:1: ( () )
            // InternalTargetEnvironmentParser.g:5726:2: ()
            {
             before(grammarAccess.getResouceType_ImplAccess().getResouceTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:5727:2: ()
            // InternalTargetEnvironmentParser.g:5727:3: 
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
    // InternalTargetEnvironmentParser.g:5735:1: rule__ResouceType_Impl__Group__1 : rule__ResouceType_Impl__Group__1__Impl ;
    public final void rule__ResouceType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5739:1: ( rule__ResouceType_Impl__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:5740:2: rule__ResouceType_Impl__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:5746:1: rule__ResouceType_Impl__Group__1__Impl : ( ResouceType ) ;
    public final void rule__ResouceType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5750:1: ( ( ResouceType ) )
            // InternalTargetEnvironmentParser.g:5751:1: ( ResouceType )
            {
            // InternalTargetEnvironmentParser.g:5751:1: ( ResouceType )
            // InternalTargetEnvironmentParser.g:5752:2: ResouceType
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
    // InternalTargetEnvironmentParser.g:5762:1: rule__LinuxOpertingSystem__Group__0 : rule__LinuxOpertingSystem__Group__0__Impl rule__LinuxOpertingSystem__Group__1 ;
    public final void rule__LinuxOpertingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5766:1: ( rule__LinuxOpertingSystem__Group__0__Impl rule__LinuxOpertingSystem__Group__1 )
            // InternalTargetEnvironmentParser.g:5767:2: rule__LinuxOpertingSystem__Group__0__Impl rule__LinuxOpertingSystem__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalTargetEnvironmentParser.g:5774:1: rule__LinuxOpertingSystem__Group__0__Impl : ( () ) ;
    public final void rule__LinuxOpertingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5778:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5779:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5779:1: ( () )
            // InternalTargetEnvironmentParser.g:5780:2: ()
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemAction_0()); 
            // InternalTargetEnvironmentParser.g:5781:2: ()
            // InternalTargetEnvironmentParser.g:5781:3: 
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
    // InternalTargetEnvironmentParser.g:5789:1: rule__LinuxOpertingSystem__Group__1 : rule__LinuxOpertingSystem__Group__1__Impl rule__LinuxOpertingSystem__Group__2 ;
    public final void rule__LinuxOpertingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5793:1: ( rule__LinuxOpertingSystem__Group__1__Impl rule__LinuxOpertingSystem__Group__2 )
            // InternalTargetEnvironmentParser.g:5794:2: rule__LinuxOpertingSystem__Group__1__Impl rule__LinuxOpertingSystem__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:5801:1: rule__LinuxOpertingSystem__Group__1__Impl : ( LinuxOpertingSystem ) ;
    public final void rule__LinuxOpertingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5805:1: ( ( LinuxOpertingSystem ) )
            // InternalTargetEnvironmentParser.g:5806:1: ( LinuxOpertingSystem )
            {
            // InternalTargetEnvironmentParser.g:5806:1: ( LinuxOpertingSystem )
            // InternalTargetEnvironmentParser.g:5807:2: LinuxOpertingSystem
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
    // InternalTargetEnvironmentParser.g:5816:1: rule__LinuxOpertingSystem__Group__2 : rule__LinuxOpertingSystem__Group__2__Impl ;
    public final void rule__LinuxOpertingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5820:1: ( rule__LinuxOpertingSystem__Group__2__Impl )
            // InternalTargetEnvironmentParser.g:5821:2: rule__LinuxOpertingSystem__Group__2__Impl
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
    // InternalTargetEnvironmentParser.g:5827:1: rule__LinuxOpertingSystem__Group__2__Impl : ( ( rule__LinuxOpertingSystem__NameAssignment_2 ) ) ;
    public final void rule__LinuxOpertingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5831:1: ( ( ( rule__LinuxOpertingSystem__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:5832:1: ( ( rule__LinuxOpertingSystem__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:5832:1: ( ( rule__LinuxOpertingSystem__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:5833:2: ( rule__LinuxOpertingSystem__NameAssignment_2 )
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:5834:2: ( rule__LinuxOpertingSystem__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:5834:3: rule__LinuxOpertingSystem__NameAssignment_2
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
    // InternalTargetEnvironmentParser.g:5843:1: rule__X86ProcessorArchitecture__Group__0 : rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 ;
    public final void rule__X86ProcessorArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5847:1: ( rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 )
            // InternalTargetEnvironmentParser.g:5848:2: rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalTargetEnvironmentParser.g:5855:1: rule__X86ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__X86ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5859:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5860:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5860:1: ( () )
            // InternalTargetEnvironmentParser.g:5861:2: ()
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0()); 
            // InternalTargetEnvironmentParser.g:5862:2: ()
            // InternalTargetEnvironmentParser.g:5862:3: 
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
    // InternalTargetEnvironmentParser.g:5870:1: rule__X86ProcessorArchitecture__Group__1 : rule__X86ProcessorArchitecture__Group__1__Impl ;
    public final void rule__X86ProcessorArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5874:1: ( rule__X86ProcessorArchitecture__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:5875:2: rule__X86ProcessorArchitecture__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:5881:1: rule__X86ProcessorArchitecture__Group__1__Impl : ( X86ProcessorArchitecture ) ;
    public final void rule__X86ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5885:1: ( ( X86ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:5886:1: ( X86ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:5886:1: ( X86ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:5887:2: X86ProcessorArchitecture
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
    // InternalTargetEnvironmentParser.g:5897:1: rule__Arm64ProcessorArchitecture__Group__0 : rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 ;
    public final void rule__Arm64ProcessorArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5901:1: ( rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 )
            // InternalTargetEnvironmentParser.g:5902:2: rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalTargetEnvironmentParser.g:5909:1: rule__Arm64ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5913:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5914:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5914:1: ( () )
            // InternalTargetEnvironmentParser.g:5915:2: ()
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0()); 
            // InternalTargetEnvironmentParser.g:5916:2: ()
            // InternalTargetEnvironmentParser.g:5916:3: 
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
    // InternalTargetEnvironmentParser.g:5924:1: rule__Arm64ProcessorArchitecture__Group__1 : rule__Arm64ProcessorArchitecture__Group__1__Impl ;
    public final void rule__Arm64ProcessorArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5928:1: ( rule__Arm64ProcessorArchitecture__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:5929:2: rule__Arm64ProcessorArchitecture__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:5935:1: rule__Arm64ProcessorArchitecture__Group__1__Impl : ( Arm64ProcessorArchitecture ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5939:1: ( ( Arm64ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:5940:1: ( Arm64ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:5940:1: ( Arm64ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:5941:2: Arm64ProcessorArchitecture
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
    // InternalTargetEnvironmentParser.g:5951:1: rule__CommunicationType__Group__0 : rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 ;
    public final void rule__CommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5955:1: ( rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 )
            // InternalTargetEnvironmentParser.g:5956:2: rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalTargetEnvironmentParser.g:5963:1: rule__CommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5967:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5968:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5968:1: ( () )
            // InternalTargetEnvironmentParser.g:5969:2: ()
            {
             before(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:5970:2: ()
            // InternalTargetEnvironmentParser.g:5970:3: 
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
    // InternalTargetEnvironmentParser.g:5978:1: rule__CommunicationType__Group__1 : rule__CommunicationType__Group__1__Impl ;
    public final void rule__CommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5982:1: ( rule__CommunicationType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:5983:2: rule__CommunicationType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:5989:1: rule__CommunicationType__Group__1__Impl : ( CommunicationType ) ;
    public final void rule__CommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5993:1: ( ( CommunicationType ) )
            // InternalTargetEnvironmentParser.g:5994:1: ( CommunicationType )
            {
            // InternalTargetEnvironmentParser.g:5994:1: ( CommunicationType )
            // InternalTargetEnvironmentParser.g:5995:2: CommunicationType
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
    // InternalTargetEnvironmentParser.g:6005:1: rule__EthernetCommunicationType__Group__0 : rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 ;
    public final void rule__EthernetCommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6009:1: ( rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 )
            // InternalTargetEnvironmentParser.g:6010:2: rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalTargetEnvironmentParser.g:6017:1: rule__EthernetCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__EthernetCommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6021:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:6022:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:6022:1: ( () )
            // InternalTargetEnvironmentParser.g:6023:2: ()
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:6024:2: ()
            // InternalTargetEnvironmentParser.g:6024:3: 
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
    // InternalTargetEnvironmentParser.g:6032:1: rule__EthernetCommunicationType__Group__1 : rule__EthernetCommunicationType__Group__1__Impl ;
    public final void rule__EthernetCommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6036:1: ( rule__EthernetCommunicationType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:6037:2: rule__EthernetCommunicationType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:6043:1: rule__EthernetCommunicationType__Group__1__Impl : ( EthernetCommunicationType ) ;
    public final void rule__EthernetCommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6047:1: ( ( EthernetCommunicationType ) )
            // InternalTargetEnvironmentParser.g:6048:1: ( EthernetCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:6048:1: ( EthernetCommunicationType )
            // InternalTargetEnvironmentParser.g:6049:2: EthernetCommunicationType
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
    // InternalTargetEnvironmentParser.g:6059:1: rule__WlanCommunicationType__Group__0 : rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 ;
    public final void rule__WlanCommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6063:1: ( rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 )
            // InternalTargetEnvironmentParser.g:6064:2: rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalTargetEnvironmentParser.g:6071:1: rule__WlanCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__WlanCommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6075:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:6076:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:6076:1: ( () )
            // InternalTargetEnvironmentParser.g:6077:2: ()
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:6078:2: ()
            // InternalTargetEnvironmentParser.g:6078:3: 
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
    // InternalTargetEnvironmentParser.g:6086:1: rule__WlanCommunicationType__Group__1 : rule__WlanCommunicationType__Group__1__Impl ;
    public final void rule__WlanCommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6090:1: ( rule__WlanCommunicationType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:6091:2: rule__WlanCommunicationType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:6097:1: rule__WlanCommunicationType__Group__1__Impl : ( WlanCommunicationType ) ;
    public final void rule__WlanCommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6101:1: ( ( WlanCommunicationType ) )
            // InternalTargetEnvironmentParser.g:6102:1: ( WlanCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:6102:1: ( WlanCommunicationType )
            // InternalTargetEnvironmentParser.g:6103:2: WlanCommunicationType
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


    // $ANTLR start "rule__TargetEnvironment__TypeAssignment_1"
    // InternalTargetEnvironmentParser.g:6113:1: rule__TargetEnvironment__TypeAssignment_1 : ( ruleDescription ) ;
    public final void rule__TargetEnvironment__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6117:1: ( ( ruleDescription ) )
            // InternalTargetEnvironmentParser.g:6118:2: ( ruleDescription )
            {
            // InternalTargetEnvironmentParser.g:6118:2: ( ruleDescription )
            // InternalTargetEnvironmentParser.g:6119:3: ruleDescription
            {
             before(grammarAccess.getTargetEnvironmentAccess().getTypeDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getTargetEnvironmentAccess().getTypeDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetEnvironment__TypeAssignment_1"


    // $ANTLR start "rule__TargetDeployEnviroment__NameAssignment_4"
    // InternalTargetEnvironmentParser.g:6128:1: rule__TargetDeployEnviroment__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__TargetDeployEnviroment__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6132:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6133:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6133:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6134:3: ruleEString
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTargetDeployEnviromentAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__NameAssignment_4"


    // $ANTLR start "rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2"
    // InternalTargetEnvironmentParser.g:6143:1: rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 : ( ruleDeviceInstance ) ;
    public final void rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6147:1: ( ( ruleDeviceInstance ) )
            // InternalTargetEnvironmentParser.g:6148:2: ( ruleDeviceInstance )
            {
            // InternalTargetEnvironmentParser.g:6148:2: ( ruleDeviceInstance )
            // InternalTargetEnvironmentParser.g:6149:3: ruleDeviceInstance
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceDeviceInstanceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceInstance();

            state._fsp--;

             after(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceDeviceInstanceParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2"


    // $ANTLR start "rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2"
    // InternalTargetEnvironmentParser.g:6158:1: rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 : ( ruleConfigConnection ) ;
    public final void rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6162:1: ( ( ruleConfigConnection ) )
            // InternalTargetEnvironmentParser.g:6163:2: ( ruleConfigConnection )
            {
            // InternalTargetEnvironmentParser.g:6163:2: ( ruleConfigConnection )
            // InternalTargetEnvironmentParser.g:6164:3: ruleConfigConnection
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionConfigConnectionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigConnection();

            state._fsp--;

             after(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionConfigConnectionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2"


    // $ANTLR start "rule__DeviceInstance__NameAssignment_2"
    // InternalTargetEnvironmentParser.g:6173:1: rule__DeviceInstance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DeviceInstance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6177:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6178:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6178:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6179:3: ruleEString
            {
             before(grammarAccess.getDeviceInstanceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeviceInstanceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceInstance__NameAssignment_2"


    // $ANTLR start "rule__DeviceInstance__RefDeviceTypeAssignment_5"
    // InternalTargetEnvironmentParser.g:6188:1: rule__DeviceInstance__RefDeviceTypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DeviceInstance__RefDeviceTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6192:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6193:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6193:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6194:3: ( ruleEString )
            {
             before(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeCrossReference_5_0()); 
            // InternalTargetEnvironmentParser.g:6195:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6196:4: ruleEString
            {
             before(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceInstance__RefDeviceTypeAssignment_5"


    // $ANTLR start "rule__ConfigConnection__NameAssignment_2"
    // InternalTargetEnvironmentParser.g:6207:1: rule__ConfigConnection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ConfigConnection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6211:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6212:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6212:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6213:3: ruleEString
            {
             before(grammarAccess.getConfigConnectionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigConnectionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__NameAssignment_2"


    // $ANTLR start "rule__ConfigConnection__ConnectDeviceAssignment_6"
    // InternalTargetEnvironmentParser.g:6222:1: rule__ConfigConnection__ConnectDeviceAssignment_6 : ( ruleConnectedDevice ) ;
    public final void rule__ConfigConnection__ConnectDeviceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6226:1: ( ( ruleConnectedDevice ) )
            // InternalTargetEnvironmentParser.g:6227:2: ( ruleConnectedDevice )
            {
            // InternalTargetEnvironmentParser.g:6227:2: ( ruleConnectedDevice )
            // InternalTargetEnvironmentParser.g:6228:3: ruleConnectedDevice
            {
             before(grammarAccess.getConfigConnectionAccess().getConnectDeviceConnectedDeviceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectedDevice();

            state._fsp--;

             after(grammarAccess.getConfigConnectionAccess().getConnectDeviceConnectedDeviceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnection__ConnectDeviceAssignment_6"


    // $ANTLR start "rule__ConnectedDevice__RefDeviceAssignment_2"
    // InternalTargetEnvironmentParser.g:6237:1: rule__ConnectedDevice__RefDeviceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ConnectedDevice__RefDeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6241:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6242:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6242:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6243:3: ( ruleEString )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceCrossReference_2_0()); 
            // InternalTargetEnvironmentParser.g:6244:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6245:4: ruleEString
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__RefDeviceAssignment_2"


    // $ANTLR start "rule__ConnectedDevice__RefConnectionAssignment_5"
    // InternalTargetEnvironmentParser.g:6256:1: rule__ConnectedDevice__RefConnectionAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ConnectedDevice__RefConnectionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6260:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6261:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6261:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6262:3: ( ruleEString )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefConnectionCommunicationConnectionCrossReference_5_0()); 
            // InternalTargetEnvironmentParser.g:6263:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6264:4: ruleEString
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefConnectionCommunicationConnectionEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectedDeviceAccess().getRefConnectionCommunicationConnectionEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getConnectedDeviceAccess().getRefConnectionCommunicationConnectionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__RefConnectionAssignment_5"


    // $ANTLR start "rule__ConnectedDevice__PropertiesAssignment_6_2"
    // InternalTargetEnvironmentParser.g:6275:1: rule__ConnectedDevice__PropertiesAssignment_6_2 : ( ruleConfigConnectionProperty ) ;
    public final void rule__ConnectedDevice__PropertiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6279:1: ( ( ruleConfigConnectionProperty ) )
            // InternalTargetEnvironmentParser.g:6280:2: ( ruleConfigConnectionProperty )
            {
            // InternalTargetEnvironmentParser.g:6280:2: ( ruleConfigConnectionProperty )
            // InternalTargetEnvironmentParser.g:6281:3: ruleConfigConnectionProperty
            {
             before(grammarAccess.getConnectedDeviceAccess().getPropertiesConfigConnectionPropertyParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigConnectionProperty();

            state._fsp--;

             after(grammarAccess.getConnectedDeviceAccess().getPropertiesConfigConnectionPropertyParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectedDevice__PropertiesAssignment_6_2"


    // $ANTLR start "rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3"
    // InternalTargetEnvironmentParser.g:6290:1: rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6294:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6295:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6295:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6296:3: ( ruleEString )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyConnectionPropertyCrossReference_3_0()); 
            // InternalTargetEnvironmentParser.g:6297:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6298:4: ruleEString
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyConnectionPropertyEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyConnectionPropertyEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyConnectionPropertyCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3"


    // $ANTLR start "rule__ConfigConnectionProperty__ValueAssignment_4_2"
    // InternalTargetEnvironmentParser.g:6309:1: rule__ConfigConnectionProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__ConfigConnectionProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6313:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:6314:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:6314:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:6315:3: rulePropertyValue
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getConfigConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigConnectionProperty__ValueAssignment_4_2"


    // $ANTLR start "rule__DeviceSet__DeviceAssignment"
    // InternalTargetEnvironmentParser.g:6324:1: rule__DeviceSet__DeviceAssignment : ( ruleDeviceType ) ;
    public final void rule__DeviceSet__DeviceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6328:1: ( ( ruleDeviceType ) )
            // InternalTargetEnvironmentParser.g:6329:2: ( ruleDeviceType )
            {
            // InternalTargetEnvironmentParser.g:6329:2: ( ruleDeviceType )
            // InternalTargetEnvironmentParser.g:6330:3: ruleDeviceType
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
    // InternalTargetEnvironmentParser.g:6339:1: rule__InterfaceNetworkProperty__ValueAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__InterfaceNetworkProperty__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6343:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6344:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6344:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6345:3: ( ruleEString )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueCrossReference_5_1_0()); 
            // InternalTargetEnvironmentParser.g:6346:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6347:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6358:1: rule__AddressNetworkProperty__ValueAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__AddressNetworkProperty__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6362:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6363:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6363:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6364:3: ( ruleEString )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueCrossReference_5_1_0()); 
            // InternalTargetEnvironmentParser.g:6365:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6366:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6377:1: rule__DeviceType_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__DeviceType_Impl__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6381:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6382:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6382:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6383:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6392:1: rule__DeviceType_Impl__CapabilityAssignment_5_2 : ( ruleCapabilityProperty ) ;
    public final void rule__DeviceType_Impl__CapabilityAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6396:1: ( ( ruleCapabilityProperty ) )
            // InternalTargetEnvironmentParser.g:6397:2: ( ruleCapabilityProperty )
            {
            // InternalTargetEnvironmentParser.g:6397:2: ( ruleCapabilityProperty )
            // InternalTargetEnvironmentParser.g:6398:3: ruleCapabilityProperty
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
    // InternalTargetEnvironmentParser.g:6407:1: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6411:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:6412:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:6412:2: ( ruleAbstractCommunicationConnection )
            // InternalTargetEnvironmentParser.g:6413:3: ruleAbstractCommunicationConnection
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
    // InternalTargetEnvironmentParser.g:6422:1: rule__ComputationDeviceType__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComputationDeviceType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6426:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6427:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6427:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6428:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6437:1: rule__ComputationDeviceType__OperatingSystemAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ComputationDeviceType__OperatingSystemAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6441:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6442:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6442:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6443:3: ( ruleEString )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getOperatingSystemOpertingSystemCrossReference_5_0()); 
            // InternalTargetEnvironmentParser.g:6444:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6445:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6456:1: rule__ComputationDeviceType__ProcessorArchitectureAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ComputationDeviceType__ProcessorArchitectureAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6460:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6461:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6461:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6462:3: ( ruleEString )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getProcessorArchitectureProcessorArchitectureCrossReference_7_0()); 
            // InternalTargetEnvironmentParser.g:6463:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6464:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6475:1: rule__ComputationDeviceType__CapabilityAssignment_8_2 : ( ruleCapabilityProperty ) ;
    public final void rule__ComputationDeviceType__CapabilityAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6479:1: ( ( ruleCapabilityProperty ) )
            // InternalTargetEnvironmentParser.g:6480:2: ( ruleCapabilityProperty )
            {
            // InternalTargetEnvironmentParser.g:6480:2: ( ruleCapabilityProperty )
            // InternalTargetEnvironmentParser.g:6481:3: ruleCapabilityProperty
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
    // InternalTargetEnvironmentParser.g:6490:1: rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__ComputationDeviceType__CommunicationConnectionAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6494:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:6495:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:6495:2: ( ruleAbstractCommunicationConnection )
            // InternalTargetEnvironmentParser.g:6496:3: ruleAbstractCommunicationConnection
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
    // InternalTargetEnvironmentParser.g:6505:1: rule__CapabilityProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CapabilityProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6509:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6510:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6510:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6511:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6520:1: rule__CapabilityProperty__TypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__CapabilityProperty__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6524:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6525:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6525:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6526:3: ( ruleEString )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeCrossReference_5_0()); 
            // InternalTargetEnvironmentParser.g:6527:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6528:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6539:1: rule__CapabilityProperty__KindAssignment_7 : ( ruleCapabilityKind ) ;
    public final void rule__CapabilityProperty__KindAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6543:1: ( ( ruleCapabilityKind ) )
            // InternalTargetEnvironmentParser.g:6544:2: ( ruleCapabilityKind )
            {
            // InternalTargetEnvironmentParser.g:6544:2: ( ruleCapabilityKind )
            // InternalTargetEnvironmentParser.g:6545:3: ruleCapabilityKind
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
    // InternalTargetEnvironmentParser.g:6554:1: rule__CapabilityProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__CapabilityProperty__ValueAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6558:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:6559:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:6559:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:6560:3: rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:6569:1: rule__ConnectionProperty__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ConnectionProperty__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6573:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6574:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6574:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6575:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6584:1: rule__ConnectionProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__ConnectionProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6588:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:6589:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:6589:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:6590:3: rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:6599:1: rule__NetworkConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__NetworkConnection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6603:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6604:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6604:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6605:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6614:1: rule__NetworkConnection__TypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__NetworkConnection__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6618:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6619:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6619:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6620:3: ( ruleEString )
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeCrossReference_6_0()); 
            // InternalTargetEnvironmentParser.g:6621:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6622:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6633:1: rule__NetworkConnection__PropertiesAssignment_7_2 : ( ruleAbstractNetworkProperty ) ;
    public final void rule__NetworkConnection__PropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6637:1: ( ( ruleAbstractNetworkProperty ) )
            // InternalTargetEnvironmentParser.g:6638:2: ( ruleAbstractNetworkProperty )
            {
            // InternalTargetEnvironmentParser.g:6638:2: ( ruleAbstractNetworkProperty )
            // InternalTargetEnvironmentParser.g:6639:3: ruleAbstractNetworkProperty
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
    // InternalTargetEnvironmentParser.g:6648:1: rule__CommunicationConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__CommunicationConnection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6652:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6653:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6653:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6654:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6663:1: rule__CommunicationConnection__TypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__CommunicationConnection__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6667:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6668:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6668:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6669:3: ( ruleEString )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeCrossReference_6_0()); 
            // InternalTargetEnvironmentParser.g:6670:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6671:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6682:1: rule__CommunicationConnection__PropertiesAssignment_7_2 : ( ruleConnectionProperty ) ;
    public final void rule__CommunicationConnection__PropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6686:1: ( ( ruleConnectionProperty ) )
            // InternalTargetEnvironmentParser.g:6687:2: ( ruleConnectionProperty )
            {
            // InternalTargetEnvironmentParser.g:6687:2: ( ruleConnectionProperty )
            // InternalTargetEnvironmentParser.g:6688:3: ruleConnectionProperty
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
    // InternalTargetEnvironmentParser.g:6697:1: rule__PropertyValueInt__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__PropertyValueInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6701:1: ( ( ruleInteger0 ) )
            // InternalTargetEnvironmentParser.g:6702:2: ( ruleInteger0 )
            {
            // InternalTargetEnvironmentParser.g:6702:2: ( ruleInteger0 )
            // InternalTargetEnvironmentParser.g:6703:3: ruleInteger0
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
    // InternalTargetEnvironmentParser.g:6712:1: rule__PropertyValueDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__PropertyValueDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6716:1: ( ( ruleDouble0 ) )
            // InternalTargetEnvironmentParser.g:6717:2: ( ruleDouble0 )
            {
            // InternalTargetEnvironmentParser.g:6717:2: ( ruleDouble0 )
            // InternalTargetEnvironmentParser.g:6718:3: ruleDouble0
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
    // InternalTargetEnvironmentParser.g:6727:1: rule__PropertyValueString__ValueAssignment : ( ruleEString ) ;
    public final void rule__PropertyValueString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6731:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6732:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6732:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6733:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6742:1: rule__LinuxOpertingSystem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LinuxOpertingSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6746:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6747:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6747:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6748:3: ruleEString
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


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\45\1\43\1\65\2\63\1\44\1\65\2\35\1\63\2\uffff\1\45";
    static final String dfa_3s = "\1\45\1\43\1\67\2\63\1\44\1\67\2\64\1\63\2\uffff\1\63";
    static final String dfa_4s = "\12\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\10\1\uffff\1\7",
            "\1\11\10\uffff\1\12\15\uffff\1\13",
            "\1\11\10\uffff\1\12\15\uffff\1\13",
            "\1\14",
            "",
            "",
            "\1\13\15\uffff\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1147:1: rule__AbstractCommunicationConnection__Alternatives : ( ( ruleNetworkConnection ) | ( ruleCommunicationConnection ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000202L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000300L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010000000088000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0010000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00A00C0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000010000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000006C00000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000001000L});

}