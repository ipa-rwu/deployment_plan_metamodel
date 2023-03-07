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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arm64ProcessorArchitecture", "X86ProcessorArchitecture", "CommunicationConnection", "TargetDeployEnviroment", "ComputationDeviceType", "RefConnectionProperty", "ProcessorArchitecture", "ConfigConnection", "Configuration", "ConnectDevice", "IncludeDevice", "RefConnection", "RefDeviceType", "AttributeKind", "SelectionKind", "DeviceType", "MaximumKind", "MinimumKind", "Capability", "Properties", "RefDevice", "Interface", "Ethernet", "Address", "Value", "Linux", "MacOS", "Kind", "Name", "Type", "Wlan", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=41;
    public static final int Configuration=12;
    public static final int Address=27;
    public static final int RULE_DATE_TIME=46;
    public static final int RULE_BOOLEAN=38;
    public static final int AttributeKind=17;
    public static final int RULE_YEAR=43;
    public static final int RefDeviceType=16;
    public static final int Name=32;
    public static final int RULE_MIN_SEC=45;
    public static final int Kind=31;
    public static final int ConnectDevice=13;
    public static final int RULE_DEDENT=49;
    public static final int Capability=22;
    public static final int RULE_ID=50;
    public static final int ConfigConnection=11;
    public static final int RULE_DIGIT=36;
    public static final int SelectionKind=18;
    public static final int Arm64ProcessorArchitecture=4;
    public static final int DeviceType=19;
    public static final int TargetDeployEnviroment=7;
    public static final int Linux=29;
    public static final int RULE_INT=51;
    public static final int Ethernet=26;
    public static final int Value=28;
    public static final int RULE_ML_COMMENT=53;
    public static final int MacOS=30;
    public static final int RefConnectionProperty=9;
    public static final int ProcessorArchitecture=10;
    public static final int RULE_STRING=52;
    public static final int Wlan=34;
    public static final int Properties=23;
    public static final int RULE_SL_COMMENT=47;
    public static final int CommunicationConnection=6;
    public static final int HyphenMinus=35;
    public static final int RULE_DOUBLE=40;
    public static final int RULE_DECINT=39;
    public static final int MinimumKind=21;
    public static final int EOF=-1;
    public static final int RULE_INDENT=48;
    public static final int RULE_HOUR=44;
    public static final int RefDevice=24;
    public static final int RULE_WS=54;
    public static final int MaximumKind=20;
    public static final int RULE_ANY_OTHER=55;
    public static final int ComputationDeviceType=8;
    public static final int RefConnection=15;
    public static final int Type=33;
    public static final int X86ProcessorArchitecture=5;
    public static final int RULE_MONTH=42;
    public static final int RULE_BINARY=37;
    public static final int IncludeDevice=14;
    public static final int Interface=25;

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
    		tokenNameToValue.put("RefDevice", "'refDevice:'");
    		tokenNameToValue.put("DeviceType", "'DeviceType:'");
    		tokenNameToValue.put("MaximumKind", "'MaximumKind'");
    		tokenNameToValue.put("MinimumKind", "'MinimumKind'");
    		tokenNameToValue.put("Capability", "'capability:'");
    		tokenNameToValue.put("Properties", "'properties:'");
    		tokenNameToValue.put("AttributeKind", "'AttributeKind'");
    		tokenNameToValue.put("SelectionKind", "'SelectionKind'");
    		tokenNameToValue.put("Configuration", "'configuration:'");
    		tokenNameToValue.put("ConnectDevice", "'connectDevice:'");
    		tokenNameToValue.put("IncludeDevice", "'includeDevice:'");
    		tokenNameToValue.put("RefConnection", "'refConnection:'");
    		tokenNameToValue.put("RefDeviceType", "'refDeviceType:'");
    		tokenNameToValue.put("ConfigConnection", "'configConnection:'");
    		tokenNameToValue.put("ProcessorArchitecture", "'ProcessorArchitecture'");
    		tokenNameToValue.put("ComputationDeviceType", "'ComputationDeviceType:'");
    		tokenNameToValue.put("RefConnectionProperty", "'refConnectionProperty:'");
    		tokenNameToValue.put("TargetDeployEnviroment", "'TargetDeployEnviroment:'");
    		tokenNameToValue.put("X86ProcessorArchitecture", "'X86ProcessorArchitecture'");
    		tokenNameToValue.put("CommunicationConnection", "'communicationConnection:'");
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
    // InternalTargetEnvironmentParser.g:87:1: entryRuleTargetEnvironment : ruleTargetEnvironment EOF ;
    public final void entryRuleTargetEnvironment() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:88:1: ( ruleTargetEnvironment EOF )
            // InternalTargetEnvironmentParser.g:89:1: ruleTargetEnvironment EOF
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
    // InternalTargetEnvironmentParser.g:96:1: ruleTargetEnvironment : ( ( rule__TargetEnvironment__Group__0 ) ) ;
    public final void ruleTargetEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:100:2: ( ( ( rule__TargetEnvironment__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:101:2: ( ( rule__TargetEnvironment__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:101:2: ( ( rule__TargetEnvironment__Group__0 ) )
            // InternalTargetEnvironmentParser.g:102:3: ( rule__TargetEnvironment__Group__0 )
            {
             before(grammarAccess.getTargetEnvironmentAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:103:3: ( rule__TargetEnvironment__Group__0 )
            // InternalTargetEnvironmentParser.g:103:4: rule__TargetEnvironment__Group__0
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
    // InternalTargetEnvironmentParser.g:112:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:113:1: ( ruleDescription EOF )
            // InternalTargetEnvironmentParser.g:114:1: ruleDescription EOF
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
    // InternalTargetEnvironmentParser.g:121:1: ruleDescription : ( ( rule__Description__Alternatives ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:125:2: ( ( ( rule__Description__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:126:2: ( ( rule__Description__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:126:2: ( ( rule__Description__Alternatives ) )
            // InternalTargetEnvironmentParser.g:127:3: ( rule__Description__Alternatives )
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:128:3: ( rule__Description__Alternatives )
            // InternalTargetEnvironmentParser.g:128:4: rule__Description__Alternatives
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
    // InternalTargetEnvironmentParser.g:137:1: entryRuleTargetDeployEnviroment : ruleTargetDeployEnviroment EOF ;
    public final void entryRuleTargetDeployEnviroment() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:138:1: ( ruleTargetDeployEnviroment EOF )
            // InternalTargetEnvironmentParser.g:139:1: ruleTargetDeployEnviroment EOF
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
    // InternalTargetEnvironmentParser.g:146:1: ruleTargetDeployEnviroment : ( ( rule__TargetDeployEnviroment__Group__0 ) ) ;
    public final void ruleTargetDeployEnviroment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:150:2: ( ( ( rule__TargetDeployEnviroment__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:151:2: ( ( rule__TargetDeployEnviroment__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:151:2: ( ( rule__TargetDeployEnviroment__Group__0 ) )
            // InternalTargetEnvironmentParser.g:152:3: ( rule__TargetDeployEnviroment__Group__0 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:153:3: ( rule__TargetDeployEnviroment__Group__0 )
            // InternalTargetEnvironmentParser.g:153:4: rule__TargetDeployEnviroment__Group__0
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
    // InternalTargetEnvironmentParser.g:162:1: entryRuleDeviceInstance : ruleDeviceInstance EOF ;
    public final void entryRuleDeviceInstance() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:163:1: ( ruleDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:164:1: ruleDeviceInstance EOF
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
    // InternalTargetEnvironmentParser.g:171:1: ruleDeviceInstance : ( ( rule__DeviceInstance__Group__0 ) ) ;
    public final void ruleDeviceInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:175:2: ( ( ( rule__DeviceInstance__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:176:2: ( ( rule__DeviceInstance__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:176:2: ( ( rule__DeviceInstance__Group__0 ) )
            // InternalTargetEnvironmentParser.g:177:3: ( rule__DeviceInstance__Group__0 )
            {
             before(grammarAccess.getDeviceInstanceAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:178:3: ( rule__DeviceInstance__Group__0 )
            // InternalTargetEnvironmentParser.g:178:4: rule__DeviceInstance__Group__0
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
    // InternalTargetEnvironmentParser.g:187:1: entryRuleConfigConnection : ruleConfigConnection EOF ;
    public final void entryRuleConfigConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:188:1: ( ruleConfigConnection EOF )
            // InternalTargetEnvironmentParser.g:189:1: ruleConfigConnection EOF
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
    // InternalTargetEnvironmentParser.g:196:1: ruleConfigConnection : ( ( rule__ConfigConnection__Group__0 ) ) ;
    public final void ruleConfigConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:200:2: ( ( ( rule__ConfigConnection__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:201:2: ( ( rule__ConfigConnection__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:201:2: ( ( rule__ConfigConnection__Group__0 ) )
            // InternalTargetEnvironmentParser.g:202:3: ( rule__ConfigConnection__Group__0 )
            {
             before(grammarAccess.getConfigConnectionAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:203:3: ( rule__ConfigConnection__Group__0 )
            // InternalTargetEnvironmentParser.g:203:4: rule__ConfigConnection__Group__0
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
    // InternalTargetEnvironmentParser.g:212:1: entryRuleConnectedDevice : ruleConnectedDevice EOF ;
    public final void entryRuleConnectedDevice() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:213:1: ( ruleConnectedDevice EOF )
            // InternalTargetEnvironmentParser.g:214:1: ruleConnectedDevice EOF
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
    // InternalTargetEnvironmentParser.g:221:1: ruleConnectedDevice : ( ( rule__ConnectedDevice__Group__0 ) ) ;
    public final void ruleConnectedDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:225:2: ( ( ( rule__ConnectedDevice__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:226:2: ( ( rule__ConnectedDevice__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:226:2: ( ( rule__ConnectedDevice__Group__0 ) )
            // InternalTargetEnvironmentParser.g:227:3: ( rule__ConnectedDevice__Group__0 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:228:3: ( rule__ConnectedDevice__Group__0 )
            // InternalTargetEnvironmentParser.g:228:4: rule__ConnectedDevice__Group__0
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
    // InternalTargetEnvironmentParser.g:237:1: entryRuleConfigConnectionProperty : ruleConfigConnectionProperty EOF ;
    public final void entryRuleConfigConnectionProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:238:1: ( ruleConfigConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:239:1: ruleConfigConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:246:1: ruleConfigConnectionProperty : ( ( rule__ConfigConnectionProperty__Group__0 ) ) ;
    public final void ruleConfigConnectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:250:2: ( ( ( rule__ConfigConnectionProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:251:2: ( ( rule__ConfigConnectionProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:251:2: ( ( rule__ConfigConnectionProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:252:3: ( rule__ConfigConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:253:3: ( rule__ConfigConnectionProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:253:4: rule__ConfigConnectionProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:262:1: entryRuleDeviceSet : ruleDeviceSet EOF ;
    public final void entryRuleDeviceSet() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:263:1: ( ruleDeviceSet EOF )
            // InternalTargetEnvironmentParser.g:264:1: ruleDeviceSet EOF
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
    // InternalTargetEnvironmentParser.g:271:1: ruleDeviceSet : ( ( rule__DeviceSet__DeviceAssignment )* ) ;
    public final void ruleDeviceSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:275:2: ( ( ( rule__DeviceSet__DeviceAssignment )* ) )
            // InternalTargetEnvironmentParser.g:276:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            {
            // InternalTargetEnvironmentParser.g:276:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            // InternalTargetEnvironmentParser.g:277:3: ( rule__DeviceSet__DeviceAssignment )*
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceAssignment()); 
            // InternalTargetEnvironmentParser.g:278:3: ( rule__DeviceSet__DeviceAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ComputationDeviceType||LA1_0==DeviceType) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:278:4: rule__DeviceSet__DeviceAssignment
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
    // InternalTargetEnvironmentParser.g:287:1: entryRuleCapabilityKind : ruleCapabilityKind EOF ;
    public final void entryRuleCapabilityKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:288:1: ( ruleCapabilityKind EOF )
            // InternalTargetEnvironmentParser.g:289:1: ruleCapabilityKind EOF
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
    // InternalTargetEnvironmentParser.g:296:1: ruleCapabilityKind : ( ( rule__CapabilityKind__Alternatives ) ) ;
    public final void ruleCapabilityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:300:2: ( ( ( rule__CapabilityKind__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:301:2: ( ( rule__CapabilityKind__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:301:2: ( ( rule__CapabilityKind__Alternatives ) )
            // InternalTargetEnvironmentParser.g:302:3: ( rule__CapabilityKind__Alternatives )
            {
             before(grammarAccess.getCapabilityKindAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:303:3: ( rule__CapabilityKind__Alternatives )
            // InternalTargetEnvironmentParser.g:303:4: rule__CapabilityKind__Alternatives
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
    // InternalTargetEnvironmentParser.g:312:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:313:1: ( ruleDeviceType EOF )
            // InternalTargetEnvironmentParser.g:314:1: ruleDeviceType EOF
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
    // InternalTargetEnvironmentParser.g:321:1: ruleDeviceType : ( ( rule__DeviceType__Alternatives ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:325:2: ( ( ( rule__DeviceType__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:326:2: ( ( rule__DeviceType__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:326:2: ( ( rule__DeviceType__Alternatives ) )
            // InternalTargetEnvironmentParser.g:327:3: ( rule__DeviceType__Alternatives )
            {
             before(grammarAccess.getDeviceTypeAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:328:3: ( rule__DeviceType__Alternatives )
            // InternalTargetEnvironmentParser.g:328:4: rule__DeviceType__Alternatives
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
    // InternalTargetEnvironmentParser.g:337:1: entryRuleAbstractCommunicationConnection : ruleAbstractCommunicationConnection EOF ;
    public final void entryRuleAbstractCommunicationConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:338:1: ( ruleAbstractCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:339:1: ruleAbstractCommunicationConnection EOF
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
    // InternalTargetEnvironmentParser.g:346:1: ruleAbstractCommunicationConnection : ( ( rule__AbstractCommunicationConnection__Alternatives ) ) ;
    public final void ruleAbstractCommunicationConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:350:2: ( ( ( rule__AbstractCommunicationConnection__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:351:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:351:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            // InternalTargetEnvironmentParser.g:352:3: ( rule__AbstractCommunicationConnection__Alternatives )
            {
             before(grammarAccess.getAbstractCommunicationConnectionAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:353:3: ( rule__AbstractCommunicationConnection__Alternatives )
            // InternalTargetEnvironmentParser.g:353:4: rule__AbstractCommunicationConnection__Alternatives
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
    // InternalTargetEnvironmentParser.g:362:1: entryRuleAbstractNetworkProperty : ruleAbstractNetworkProperty EOF ;
    public final void entryRuleAbstractNetworkProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:363:1: ( ruleAbstractNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:364:1: ruleAbstractNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:371:1: ruleAbstractNetworkProperty : ( ( rule__AbstractNetworkProperty__Alternatives ) ) ;
    public final void ruleAbstractNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:375:2: ( ( ( rule__AbstractNetworkProperty__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:376:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:376:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            // InternalTargetEnvironmentParser.g:377:3: ( rule__AbstractNetworkProperty__Alternatives )
            {
             before(grammarAccess.getAbstractNetworkPropertyAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:378:3: ( rule__AbstractNetworkProperty__Alternatives )
            // InternalTargetEnvironmentParser.g:378:4: rule__AbstractNetworkProperty__Alternatives
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
    // InternalTargetEnvironmentParser.g:387:1: entryRuleInterfaceNetworkProperty : ruleInterfaceNetworkProperty EOF ;
    public final void entryRuleInterfaceNetworkProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:388:1: ( ruleInterfaceNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:389:1: ruleInterfaceNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:396:1: ruleInterfaceNetworkProperty : ( ( rule__InterfaceNetworkProperty__Group__0 ) ) ;
    public final void ruleInterfaceNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:400:2: ( ( ( rule__InterfaceNetworkProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:401:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:401:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:402:3: ( rule__InterfaceNetworkProperty__Group__0 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:403:3: ( rule__InterfaceNetworkProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:403:4: rule__InterfaceNetworkProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:412:1: entryRuleAddressNetworkProperty : ruleAddressNetworkProperty EOF ;
    public final void entryRuleAddressNetworkProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:413:1: ( ruleAddressNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:414:1: ruleAddressNetworkProperty EOF
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
    // InternalTargetEnvironmentParser.g:421:1: ruleAddressNetworkProperty : ( ( rule__AddressNetworkProperty__Group__0 ) ) ;
    public final void ruleAddressNetworkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:425:2: ( ( ( rule__AddressNetworkProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:426:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:426:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:427:3: ( rule__AddressNetworkProperty__Group__0 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:428:3: ( rule__AddressNetworkProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:428:4: rule__AddressNetworkProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:437:1: entryRuleDeviceType_Impl : ruleDeviceType_Impl EOF ;
    public final void entryRuleDeviceType_Impl() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:438:1: ( ruleDeviceType_Impl EOF )
            // InternalTargetEnvironmentParser.g:439:1: ruleDeviceType_Impl EOF
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
    // InternalTargetEnvironmentParser.g:446:1: ruleDeviceType_Impl : ( ( rule__DeviceType_Impl__Group__0 ) ) ;
    public final void ruleDeviceType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:450:2: ( ( ( rule__DeviceType_Impl__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:451:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:451:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            // InternalTargetEnvironmentParser.g:452:3: ( rule__DeviceType_Impl__Group__0 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:453:3: ( rule__DeviceType_Impl__Group__0 )
            // InternalTargetEnvironmentParser.g:453:4: rule__DeviceType_Impl__Group__0
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
    // InternalTargetEnvironmentParser.g:462:1: entryRuleComputationDeviceType : ruleComputationDeviceType EOF ;
    public final void entryRuleComputationDeviceType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:463:1: ( ruleComputationDeviceType EOF )
            // InternalTargetEnvironmentParser.g:464:1: ruleComputationDeviceType EOF
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
    // InternalTargetEnvironmentParser.g:471:1: ruleComputationDeviceType : ( ( rule__ComputationDeviceType__Group__0 ) ) ;
    public final void ruleComputationDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:475:2: ( ( ( rule__ComputationDeviceType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:476:2: ( ( rule__ComputationDeviceType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:476:2: ( ( rule__ComputationDeviceType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:477:3: ( rule__ComputationDeviceType__Group__0 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:478:3: ( rule__ComputationDeviceType__Group__0 )
            // InternalTargetEnvironmentParser.g:478:4: rule__ComputationDeviceType__Group__0
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
    // InternalTargetEnvironmentParser.g:487:1: entryRuleCapabilityProperty : ruleCapabilityProperty EOF ;
    public final void entryRuleCapabilityProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:488:1: ( ruleCapabilityProperty EOF )
            // InternalTargetEnvironmentParser.g:489:1: ruleCapabilityProperty EOF
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
    // InternalTargetEnvironmentParser.g:496:1: ruleCapabilityProperty : ( ( rule__CapabilityProperty__Group__0 ) ) ;
    public final void ruleCapabilityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:500:2: ( ( ( rule__CapabilityProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:501:2: ( ( rule__CapabilityProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:501:2: ( ( rule__CapabilityProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:502:3: ( rule__CapabilityProperty__Group__0 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:503:3: ( rule__CapabilityProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:503:4: rule__CapabilityProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:512:1: entryRuleAttributeKind : ruleAttributeKind EOF ;
    public final void entryRuleAttributeKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:513:1: ( ruleAttributeKind EOF )
            // InternalTargetEnvironmentParser.g:514:1: ruleAttributeKind EOF
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
    // InternalTargetEnvironmentParser.g:521:1: ruleAttributeKind : ( ( rule__AttributeKind__Group__0 ) ) ;
    public final void ruleAttributeKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:525:2: ( ( ( rule__AttributeKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:526:2: ( ( rule__AttributeKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:526:2: ( ( rule__AttributeKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:527:3: ( rule__AttributeKind__Group__0 )
            {
             before(grammarAccess.getAttributeKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:528:3: ( rule__AttributeKind__Group__0 )
            // InternalTargetEnvironmentParser.g:528:4: rule__AttributeKind__Group__0
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
    // InternalTargetEnvironmentParser.g:537:1: entryRuleMaximumKind : ruleMaximumKind EOF ;
    public final void entryRuleMaximumKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:538:1: ( ruleMaximumKind EOF )
            // InternalTargetEnvironmentParser.g:539:1: ruleMaximumKind EOF
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
    // InternalTargetEnvironmentParser.g:546:1: ruleMaximumKind : ( ( rule__MaximumKind__Group__0 ) ) ;
    public final void ruleMaximumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:550:2: ( ( ( rule__MaximumKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:551:2: ( ( rule__MaximumKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:551:2: ( ( rule__MaximumKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:552:3: ( rule__MaximumKind__Group__0 )
            {
             before(grammarAccess.getMaximumKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:553:3: ( rule__MaximumKind__Group__0 )
            // InternalTargetEnvironmentParser.g:553:4: rule__MaximumKind__Group__0
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
    // InternalTargetEnvironmentParser.g:562:1: entryRuleMinimumKind : ruleMinimumKind EOF ;
    public final void entryRuleMinimumKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:563:1: ( ruleMinimumKind EOF )
            // InternalTargetEnvironmentParser.g:564:1: ruleMinimumKind EOF
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
    // InternalTargetEnvironmentParser.g:571:1: ruleMinimumKind : ( ( rule__MinimumKind__Group__0 ) ) ;
    public final void ruleMinimumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:575:2: ( ( ( rule__MinimumKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:576:2: ( ( rule__MinimumKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:576:2: ( ( rule__MinimumKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:577:3: ( rule__MinimumKind__Group__0 )
            {
             before(grammarAccess.getMinimumKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:578:3: ( rule__MinimumKind__Group__0 )
            // InternalTargetEnvironmentParser.g:578:4: rule__MinimumKind__Group__0
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
    // InternalTargetEnvironmentParser.g:587:1: entryRuleSelectionKind : ruleSelectionKind EOF ;
    public final void entryRuleSelectionKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:588:1: ( ruleSelectionKind EOF )
            // InternalTargetEnvironmentParser.g:589:1: ruleSelectionKind EOF
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
    // InternalTargetEnvironmentParser.g:596:1: ruleSelectionKind : ( ( rule__SelectionKind__Group__0 ) ) ;
    public final void ruleSelectionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:600:2: ( ( ( rule__SelectionKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:601:2: ( ( rule__SelectionKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:601:2: ( ( rule__SelectionKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:602:3: ( rule__SelectionKind__Group__0 )
            {
             before(grammarAccess.getSelectionKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:603:3: ( rule__SelectionKind__Group__0 )
            // InternalTargetEnvironmentParser.g:603:4: rule__SelectionKind__Group__0
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
    // InternalTargetEnvironmentParser.g:612:1: entryRuleConnectionProperty : ruleConnectionProperty EOF ;
    public final void entryRuleConnectionProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:613:1: ( ruleConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:614:1: ruleConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:621:1: ruleConnectionProperty : ( ( rule__ConnectionProperty__Group__0 ) ) ;
    public final void ruleConnectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:625:2: ( ( ( rule__ConnectionProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:626:2: ( ( rule__ConnectionProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:626:2: ( ( rule__ConnectionProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:627:3: ( rule__ConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:628:3: ( rule__ConnectionProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:628:4: rule__ConnectionProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:637:1: entryRuleNetworkConnection : ruleNetworkConnection EOF ;
    public final void entryRuleNetworkConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:638:1: ( ruleNetworkConnection EOF )
            // InternalTargetEnvironmentParser.g:639:1: ruleNetworkConnection EOF
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
    // InternalTargetEnvironmentParser.g:646:1: ruleNetworkConnection : ( ( rule__NetworkConnection__Group__0 ) ) ;
    public final void ruleNetworkConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:650:2: ( ( ( rule__NetworkConnection__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:651:2: ( ( rule__NetworkConnection__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:651:2: ( ( rule__NetworkConnection__Group__0 ) )
            // InternalTargetEnvironmentParser.g:652:3: ( rule__NetworkConnection__Group__0 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:653:3: ( rule__NetworkConnection__Group__0 )
            // InternalTargetEnvironmentParser.g:653:4: rule__NetworkConnection__Group__0
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
    // InternalTargetEnvironmentParser.g:662:1: entryRuleCommunicationConnection : ruleCommunicationConnection EOF ;
    public final void entryRuleCommunicationConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:663:1: ( ruleCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:664:1: ruleCommunicationConnection EOF
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
    // InternalTargetEnvironmentParser.g:671:1: ruleCommunicationConnection : ( ( rule__CommunicationConnection__Group__0 ) ) ;
    public final void ruleCommunicationConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:675:2: ( ( ( rule__CommunicationConnection__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:676:2: ( ( rule__CommunicationConnection__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:676:2: ( ( rule__CommunicationConnection__Group__0 ) )
            // InternalTargetEnvironmentParser.g:677:3: ( rule__CommunicationConnection__Group__0 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:678:3: ( rule__CommunicationConnection__Group__0 )
            // InternalTargetEnvironmentParser.g:678:4: rule__CommunicationConnection__Group__0
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
    // InternalTargetEnvironmentParser.g:687:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:688:1: ( rulePropertyValue EOF )
            // InternalTargetEnvironmentParser.g:689:1: rulePropertyValue EOF
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
    // InternalTargetEnvironmentParser.g:696:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:700:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:701:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:701:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalTargetEnvironmentParser.g:702:3: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:703:3: ( rule__PropertyValue__Alternatives )
            // InternalTargetEnvironmentParser.g:703:4: rule__PropertyValue__Alternatives
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
    // InternalTargetEnvironmentParser.g:712:1: entryRulePropertyValueInt : rulePropertyValueInt EOF ;
    public final void entryRulePropertyValueInt() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:713:1: ( rulePropertyValueInt EOF )
            // InternalTargetEnvironmentParser.g:714:1: rulePropertyValueInt EOF
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
    // InternalTargetEnvironmentParser.g:721:1: rulePropertyValueInt : ( ( rule__PropertyValueInt__ValueAssignment ) ) ;
    public final void rulePropertyValueInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:725:2: ( ( ( rule__PropertyValueInt__ValueAssignment ) ) )
            // InternalTargetEnvironmentParser.g:726:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            {
            // InternalTargetEnvironmentParser.g:726:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            // InternalTargetEnvironmentParser.g:727:3: ( rule__PropertyValueInt__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueIntAccess().getValueAssignment()); 
            // InternalTargetEnvironmentParser.g:728:3: ( rule__PropertyValueInt__ValueAssignment )
            // InternalTargetEnvironmentParser.g:728:4: rule__PropertyValueInt__ValueAssignment
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
    // InternalTargetEnvironmentParser.g:737:1: entryRulePropertyValueDouble : rulePropertyValueDouble EOF ;
    public final void entryRulePropertyValueDouble() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:738:1: ( rulePropertyValueDouble EOF )
            // InternalTargetEnvironmentParser.g:739:1: rulePropertyValueDouble EOF
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
    // InternalTargetEnvironmentParser.g:746:1: rulePropertyValueDouble : ( ( rule__PropertyValueDouble__ValueAssignment ) ) ;
    public final void rulePropertyValueDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:750:2: ( ( ( rule__PropertyValueDouble__ValueAssignment ) ) )
            // InternalTargetEnvironmentParser.g:751:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            {
            // InternalTargetEnvironmentParser.g:751:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            // InternalTargetEnvironmentParser.g:752:3: ( rule__PropertyValueDouble__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment()); 
            // InternalTargetEnvironmentParser.g:753:3: ( rule__PropertyValueDouble__ValueAssignment )
            // InternalTargetEnvironmentParser.g:753:4: rule__PropertyValueDouble__ValueAssignment
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
    // InternalTargetEnvironmentParser.g:762:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:763:1: ( rulePropertyValueString EOF )
            // InternalTargetEnvironmentParser.g:764:1: rulePropertyValueString EOF
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
    // InternalTargetEnvironmentParser.g:771:1: rulePropertyValueString : ( ( rule__PropertyValueString__ValueAssignment ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:775:2: ( ( ( rule__PropertyValueString__ValueAssignment ) ) )
            // InternalTargetEnvironmentParser.g:776:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            {
            // InternalTargetEnvironmentParser.g:776:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            // InternalTargetEnvironmentParser.g:777:3: ( rule__PropertyValueString__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueStringAccess().getValueAssignment()); 
            // InternalTargetEnvironmentParser.g:778:3: ( rule__PropertyValueString__ValueAssignment )
            // InternalTargetEnvironmentParser.g:778:4: rule__PropertyValueString__ValueAssignment
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
    // InternalTargetEnvironmentParser.g:787:1: entryRuleProcessorArchitectureValue : ruleProcessorArchitectureValue EOF ;
    public final void entryRuleProcessorArchitectureValue() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:788:1: ( ruleProcessorArchitectureValue EOF )
            // InternalTargetEnvironmentParser.g:789:1: ruleProcessorArchitectureValue EOF
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
    // InternalTargetEnvironmentParser.g:796:1: ruleProcessorArchitectureValue : ( ( rule__ProcessorArchitectureValue__Alternatives ) ) ;
    public final void ruleProcessorArchitectureValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:800:2: ( ( ( rule__ProcessorArchitectureValue__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:801:2: ( ( rule__ProcessorArchitectureValue__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:801:2: ( ( rule__ProcessorArchitectureValue__Alternatives ) )
            // InternalTargetEnvironmentParser.g:802:3: ( rule__ProcessorArchitectureValue__Alternatives )
            {
             before(grammarAccess.getProcessorArchitectureValueAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:803:3: ( rule__ProcessorArchitectureValue__Alternatives )
            // InternalTargetEnvironmentParser.g:803:4: rule__ProcessorArchitectureValue__Alternatives
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
    // InternalTargetEnvironmentParser.g:812:1: entryRuleAbstractResouceType : ruleAbstractResouceType EOF ;
    public final void entryRuleAbstractResouceType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:813:1: ( ruleAbstractResouceType EOF )
            // InternalTargetEnvironmentParser.g:814:1: ruleAbstractResouceType EOF
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
    // InternalTargetEnvironmentParser.g:821:1: ruleAbstractResouceType : ( ( rule__AbstractResouceType__Alternatives ) ) ;
    public final void ruleAbstractResouceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:825:2: ( ( ( rule__AbstractResouceType__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:826:2: ( ( rule__AbstractResouceType__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:826:2: ( ( rule__AbstractResouceType__Alternatives ) )
            // InternalTargetEnvironmentParser.g:827:3: ( rule__AbstractResouceType__Alternatives )
            {
             before(grammarAccess.getAbstractResouceTypeAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:828:3: ( rule__AbstractResouceType__Alternatives )
            // InternalTargetEnvironmentParser.g:828:4: rule__AbstractResouceType__Alternatives
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
    // InternalTargetEnvironmentParser.g:837:1: entryRuleOpertingSystemType : ruleOpertingSystemType EOF ;
    public final void entryRuleOpertingSystemType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:838:1: ( ruleOpertingSystemType EOF )
            // InternalTargetEnvironmentParser.g:839:1: ruleOpertingSystemType EOF
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
    // InternalTargetEnvironmentParser.g:846:1: ruleOpertingSystemType : ( ( rule__OpertingSystemType__Alternatives ) ) ;
    public final void ruleOpertingSystemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:850:2: ( ( ( rule__OpertingSystemType__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:851:2: ( ( rule__OpertingSystemType__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:851:2: ( ( rule__OpertingSystemType__Alternatives ) )
            // InternalTargetEnvironmentParser.g:852:3: ( rule__OpertingSystemType__Alternatives )
            {
             before(grammarAccess.getOpertingSystemTypeAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:853:3: ( rule__OpertingSystemType__Alternatives )
            // InternalTargetEnvironmentParser.g:853:4: rule__OpertingSystemType__Alternatives
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
    // InternalTargetEnvironmentParser.g:862:1: entryRuleProcessorArchitectureType : ruleProcessorArchitectureType EOF ;
    public final void entryRuleProcessorArchitectureType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:863:1: ( ruleProcessorArchitectureType EOF )
            // InternalTargetEnvironmentParser.g:864:1: ruleProcessorArchitectureType EOF
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
    // InternalTargetEnvironmentParser.g:871:1: ruleProcessorArchitectureType : ( ( rule__ProcessorArchitectureType__Group__0 ) ) ;
    public final void ruleProcessorArchitectureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:875:2: ( ( ( rule__ProcessorArchitectureType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:876:2: ( ( rule__ProcessorArchitectureType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:876:2: ( ( rule__ProcessorArchitectureType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:877:3: ( rule__ProcessorArchitectureType__Group__0 )
            {
             before(grammarAccess.getProcessorArchitectureTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:878:3: ( rule__ProcessorArchitectureType__Group__0 )
            // InternalTargetEnvironmentParser.g:878:4: rule__ProcessorArchitectureType__Group__0
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
    // InternalTargetEnvironmentParser.g:887:1: entryRuleLinuxOpertingSystemType : ruleLinuxOpertingSystemType EOF ;
    public final void entryRuleLinuxOpertingSystemType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:888:1: ( ruleLinuxOpertingSystemType EOF )
            // InternalTargetEnvironmentParser.g:889:1: ruleLinuxOpertingSystemType EOF
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
    // InternalTargetEnvironmentParser.g:896:1: ruleLinuxOpertingSystemType : ( ( rule__LinuxOpertingSystemType__Group__0 ) ) ;
    public final void ruleLinuxOpertingSystemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:900:2: ( ( ( rule__LinuxOpertingSystemType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:901:2: ( ( rule__LinuxOpertingSystemType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:901:2: ( ( rule__LinuxOpertingSystemType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:902:3: ( rule__LinuxOpertingSystemType__Group__0 )
            {
             before(grammarAccess.getLinuxOpertingSystemTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:903:3: ( rule__LinuxOpertingSystemType__Group__0 )
            // InternalTargetEnvironmentParser.g:903:4: rule__LinuxOpertingSystemType__Group__0
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
    // InternalTargetEnvironmentParser.g:912:1: entryRuleMacOSOpertingSystemType : ruleMacOSOpertingSystemType EOF ;
    public final void entryRuleMacOSOpertingSystemType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:913:1: ( ruleMacOSOpertingSystemType EOF )
            // InternalTargetEnvironmentParser.g:914:1: ruleMacOSOpertingSystemType EOF
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
    // InternalTargetEnvironmentParser.g:921:1: ruleMacOSOpertingSystemType : ( ( rule__MacOSOpertingSystemType__Group__0 ) ) ;
    public final void ruleMacOSOpertingSystemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:925:2: ( ( ( rule__MacOSOpertingSystemType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:926:2: ( ( rule__MacOSOpertingSystemType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:926:2: ( ( rule__MacOSOpertingSystemType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:927:3: ( rule__MacOSOpertingSystemType__Group__0 )
            {
             before(grammarAccess.getMacOSOpertingSystemTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:928:3: ( rule__MacOSOpertingSystemType__Group__0 )
            // InternalTargetEnvironmentParser.g:928:4: rule__MacOSOpertingSystemType__Group__0
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
    // InternalTargetEnvironmentParser.g:937:1: entryRuleX86ProcessorArchitecture : ruleX86ProcessorArchitecture EOF ;
    public final void entryRuleX86ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:938:1: ( ruleX86ProcessorArchitecture EOF )
            // InternalTargetEnvironmentParser.g:939:1: ruleX86ProcessorArchitecture EOF
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
    // InternalTargetEnvironmentParser.g:946:1: ruleX86ProcessorArchitecture : ( ( rule__X86ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleX86ProcessorArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:950:2: ( ( ( rule__X86ProcessorArchitecture__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:951:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:951:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            // InternalTargetEnvironmentParser.g:952:3: ( rule__X86ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:953:3: ( rule__X86ProcessorArchitecture__Group__0 )
            // InternalTargetEnvironmentParser.g:953:4: rule__X86ProcessorArchitecture__Group__0
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
    // InternalTargetEnvironmentParser.g:962:1: entryRuleArm64ProcessorArchitecture : ruleArm64ProcessorArchitecture EOF ;
    public final void entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:963:1: ( ruleArm64ProcessorArchitecture EOF )
            // InternalTargetEnvironmentParser.g:964:1: ruleArm64ProcessorArchitecture EOF
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
    // InternalTargetEnvironmentParser.g:971:1: ruleArm64ProcessorArchitecture : ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleArm64ProcessorArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:975:2: ( ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:976:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:976:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            // InternalTargetEnvironmentParser.g:977:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:978:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            // InternalTargetEnvironmentParser.g:978:4: rule__Arm64ProcessorArchitecture__Group__0
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
    // InternalTargetEnvironmentParser.g:987:1: entryRuleCommunicationType : ruleCommunicationType EOF ;
    public final void entryRuleCommunicationType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:988:1: ( ruleCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:989:1: ruleCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:996:1: ruleCommunicationType : ( ( rule__CommunicationType__Group__0 ) ) ;
    public final void ruleCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1000:2: ( ( ( rule__CommunicationType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:1001:2: ( ( rule__CommunicationType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:1001:2: ( ( rule__CommunicationType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:1002:3: ( rule__CommunicationType__Group__0 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:1003:3: ( rule__CommunicationType__Group__0 )
            // InternalTargetEnvironmentParser.g:1003:4: rule__CommunicationType__Group__0
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
    // InternalTargetEnvironmentParser.g:1012:1: entryRuleNetworkCommunicationType : ruleNetworkCommunicationType EOF ;
    public final void entryRuleNetworkCommunicationType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:1013:1: ( ruleNetworkCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:1014:1: ruleNetworkCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:1021:1: ruleNetworkCommunicationType : ( ( rule__NetworkCommunicationType__Alternatives ) ) ;
    public final void ruleNetworkCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1025:2: ( ( ( rule__NetworkCommunicationType__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:1026:2: ( ( rule__NetworkCommunicationType__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:1026:2: ( ( rule__NetworkCommunicationType__Alternatives ) )
            // InternalTargetEnvironmentParser.g:1027:3: ( rule__NetworkCommunicationType__Alternatives )
            {
             before(grammarAccess.getNetworkCommunicationTypeAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:1028:3: ( rule__NetworkCommunicationType__Alternatives )
            // InternalTargetEnvironmentParser.g:1028:4: rule__NetworkCommunicationType__Alternatives
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
    // InternalTargetEnvironmentParser.g:1037:1: entryRuleEthernetCommunicationType : ruleEthernetCommunicationType EOF ;
    public final void entryRuleEthernetCommunicationType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:1038:1: ( ruleEthernetCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:1039:1: ruleEthernetCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:1046:1: ruleEthernetCommunicationType : ( ( rule__EthernetCommunicationType__Group__0 ) ) ;
    public final void ruleEthernetCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1050:2: ( ( ( rule__EthernetCommunicationType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:1051:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:1051:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:1052:3: ( rule__EthernetCommunicationType__Group__0 )
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:1053:3: ( rule__EthernetCommunicationType__Group__0 )
            // InternalTargetEnvironmentParser.g:1053:4: rule__EthernetCommunicationType__Group__0
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
    // InternalTargetEnvironmentParser.g:1062:1: entryRuleWlanCommunicationType : ruleWlanCommunicationType EOF ;
    public final void entryRuleWlanCommunicationType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:1063:1: ( ruleWlanCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:1064:1: ruleWlanCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:1071:1: ruleWlanCommunicationType : ( ( rule__WlanCommunicationType__Group__0 ) ) ;
    public final void ruleWlanCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1075:2: ( ( ( rule__WlanCommunicationType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:1076:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:1076:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:1077:3: ( rule__WlanCommunicationType__Group__0 )
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:1078:3: ( rule__WlanCommunicationType__Group__0 )
            // InternalTargetEnvironmentParser.g:1078:4: rule__WlanCommunicationType__Group__0
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
    // InternalTargetEnvironmentParser.g:1087:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:1088:1: ( ruleDouble0 EOF )
            // InternalTargetEnvironmentParser.g:1089:1: ruleDouble0 EOF
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
    // InternalTargetEnvironmentParser.g:1096:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1100:2: ( ( RULE_DOUBLE ) )
            // InternalTargetEnvironmentParser.g:1101:2: ( RULE_DOUBLE )
            {
            // InternalTargetEnvironmentParser.g:1101:2: ( RULE_DOUBLE )
            // InternalTargetEnvironmentParser.g:1102:3: RULE_DOUBLE
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
    // InternalTargetEnvironmentParser.g:1112:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:1113:1: ( ruleInteger0 EOF )
            // InternalTargetEnvironmentParser.g:1114:1: ruleInteger0 EOF
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
    // InternalTargetEnvironmentParser.g:1121:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1125:2: ( ( RULE_DECINT ) )
            // InternalTargetEnvironmentParser.g:1126:2: ( RULE_DECINT )
            {
            // InternalTargetEnvironmentParser.g:1126:2: ( RULE_DECINT )
            // InternalTargetEnvironmentParser.g:1127:3: RULE_DECINT
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
    // InternalTargetEnvironmentParser.g:1137:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:1138:1: ( ruleEString EOF )
            // InternalTargetEnvironmentParser.g:1139:1: ruleEString EOF
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
    // InternalTargetEnvironmentParser.g:1146:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1150:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:1151:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:1151:2: ( ( rule__EString__Alternatives ) )
            // InternalTargetEnvironmentParser.g:1152:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:1153:3: ( rule__EString__Alternatives )
            // InternalTargetEnvironmentParser.g:1153:4: rule__EString__Alternatives
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
    // InternalTargetEnvironmentParser.g:1162:1: entryRulePreListElement : rulePreListElement EOF ;
    public final void entryRulePreListElement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:1166:1: ( rulePreListElement EOF )
            // InternalTargetEnvironmentParser.g:1167:1: rulePreListElement EOF
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
    // InternalTargetEnvironmentParser.g:1177:1: rulePreListElement : ( HyphenMinus ) ;
    public final void rulePreListElement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1182:2: ( ( HyphenMinus ) )
            // InternalTargetEnvironmentParser.g:1183:2: ( HyphenMinus )
            {
            // InternalTargetEnvironmentParser.g:1183:2: ( HyphenMinus )
            // InternalTargetEnvironmentParser.g:1184:3: HyphenMinus
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
    // InternalTargetEnvironmentParser.g:1194:1: rule__Description__Alternatives : ( ( ruleDeviceSet ) | ( ruleTargetDeployEnviroment ) );
    public final void rule__Description__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1198:1: ( ( ruleDeviceSet ) | ( ruleTargetDeployEnviroment ) )
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
                    // InternalTargetEnvironmentParser.g:1199:2: ( ruleDeviceSet )
                    {
                    // InternalTargetEnvironmentParser.g:1199:2: ( ruleDeviceSet )
                    // InternalTargetEnvironmentParser.g:1200:3: ruleDeviceSet
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
                    // InternalTargetEnvironmentParser.g:1205:2: ( ruleTargetDeployEnviroment )
                    {
                    // InternalTargetEnvironmentParser.g:1205:2: ( ruleTargetDeployEnviroment )
                    // InternalTargetEnvironmentParser.g:1206:3: ruleTargetDeployEnviroment
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
    // InternalTargetEnvironmentParser.g:1215:1: rule__CapabilityKind__Alternatives : ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) );
    public final void rule__CapabilityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1219:1: ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) )
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
                    // InternalTargetEnvironmentParser.g:1220:2: ( ruleAttributeKind )
                    {
                    // InternalTargetEnvironmentParser.g:1220:2: ( ruleAttributeKind )
                    // InternalTargetEnvironmentParser.g:1221:3: ruleAttributeKind
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
                    // InternalTargetEnvironmentParser.g:1226:2: ( ruleMaximumKind )
                    {
                    // InternalTargetEnvironmentParser.g:1226:2: ( ruleMaximumKind )
                    // InternalTargetEnvironmentParser.g:1227:3: ruleMaximumKind
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
                    // InternalTargetEnvironmentParser.g:1232:2: ( ruleMinimumKind )
                    {
                    // InternalTargetEnvironmentParser.g:1232:2: ( ruleMinimumKind )
                    // InternalTargetEnvironmentParser.g:1233:3: ruleMinimumKind
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
                    // InternalTargetEnvironmentParser.g:1238:2: ( ruleSelectionKind )
                    {
                    // InternalTargetEnvironmentParser.g:1238:2: ( ruleSelectionKind )
                    // InternalTargetEnvironmentParser.g:1239:3: ruleSelectionKind
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
    // InternalTargetEnvironmentParser.g:1248:1: rule__DeviceType__Alternatives : ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) );
    public final void rule__DeviceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1252:1: ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) )
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
                    // InternalTargetEnvironmentParser.g:1253:2: ( ruleDeviceType_Impl )
                    {
                    // InternalTargetEnvironmentParser.g:1253:2: ( ruleDeviceType_Impl )
                    // InternalTargetEnvironmentParser.g:1254:3: ruleDeviceType_Impl
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
                    // InternalTargetEnvironmentParser.g:1259:2: ( ruleComputationDeviceType )
                    {
                    // InternalTargetEnvironmentParser.g:1259:2: ( ruleComputationDeviceType )
                    // InternalTargetEnvironmentParser.g:1260:3: ruleComputationDeviceType
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
    // InternalTargetEnvironmentParser.g:1269:1: rule__AbstractCommunicationConnection__Alternatives : ( ( ruleCommunicationConnection ) | ( ruleNetworkConnection ) );
    public final void rule__AbstractCommunicationConnection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1273:1: ( ( ruleCommunicationConnection ) | ( ruleNetworkConnection ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==HyphenMinus) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==Name) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_STRING) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==RULE_INDENT) ) {
                            int LA5_5 = input.LA(5);

                            if ( (LA5_5==Type) ) {
                                int LA5_6 = input.LA(6);

                                if ( (LA5_6==RULE_ID||LA5_6==RULE_STRING) ) {
                                    alt5=1;
                                }
                                else if ( (LA5_6==Ethernet||LA5_6==Wlan) ) {
                                    alt5=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_2==RULE_ID) ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==RULE_INDENT) ) {
                            int LA5_5 = input.LA(5);

                            if ( (LA5_5==Type) ) {
                                int LA5_6 = input.LA(6);

                                if ( (LA5_6==RULE_ID||LA5_6==RULE_STRING) ) {
                                    alt5=1;
                                }
                                else if ( (LA5_6==Ethernet||LA5_6==Wlan) ) {
                                    alt5=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

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
                    // InternalTargetEnvironmentParser.g:1274:2: ( ruleCommunicationConnection )
                    {
                    // InternalTargetEnvironmentParser.g:1274:2: ( ruleCommunicationConnection )
                    // InternalTargetEnvironmentParser.g:1275:3: ruleCommunicationConnection
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
                    // InternalTargetEnvironmentParser.g:1280:2: ( ruleNetworkConnection )
                    {
                    // InternalTargetEnvironmentParser.g:1280:2: ( ruleNetworkConnection )
                    // InternalTargetEnvironmentParser.g:1281:3: ruleNetworkConnection
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
    // InternalTargetEnvironmentParser.g:1290:1: rule__AbstractNetworkProperty__Alternatives : ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) );
    public final void rule__AbstractNetworkProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1294:1: ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==HyphenMinus) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==Name) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==Address) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==Interface) ) {
                        alt6=1;
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
                    // InternalTargetEnvironmentParser.g:1295:2: ( ruleInterfaceNetworkProperty )
                    {
                    // InternalTargetEnvironmentParser.g:1295:2: ( ruleInterfaceNetworkProperty )
                    // InternalTargetEnvironmentParser.g:1296:3: ruleInterfaceNetworkProperty
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
                    // InternalTargetEnvironmentParser.g:1301:2: ( ruleAddressNetworkProperty )
                    {
                    // InternalTargetEnvironmentParser.g:1301:2: ( ruleAddressNetworkProperty )
                    // InternalTargetEnvironmentParser.g:1302:3: ruleAddressNetworkProperty
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
    // InternalTargetEnvironmentParser.g:1311:1: rule__PropertyValue__Alternatives : ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) | ( ruleProcessorArchitectureValue ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1315:1: ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) | ( ruleProcessorArchitectureValue ) )
            int alt7=4;
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
            case Arm64ProcessorArchitecture:
            case X86ProcessorArchitecture:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1316:2: ( rulePropertyValueInt )
                    {
                    // InternalTargetEnvironmentParser.g:1316:2: ( rulePropertyValueInt )
                    // InternalTargetEnvironmentParser.g:1317:3: rulePropertyValueInt
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
                    // InternalTargetEnvironmentParser.g:1322:2: ( rulePropertyValueDouble )
                    {
                    // InternalTargetEnvironmentParser.g:1322:2: ( rulePropertyValueDouble )
                    // InternalTargetEnvironmentParser.g:1323:3: rulePropertyValueDouble
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
                    // InternalTargetEnvironmentParser.g:1328:2: ( rulePropertyValueString )
                    {
                    // InternalTargetEnvironmentParser.g:1328:2: ( rulePropertyValueString )
                    // InternalTargetEnvironmentParser.g:1329:3: rulePropertyValueString
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
                    // InternalTargetEnvironmentParser.g:1334:2: ( ruleProcessorArchitectureValue )
                    {
                    // InternalTargetEnvironmentParser.g:1334:2: ( ruleProcessorArchitectureValue )
                    // InternalTargetEnvironmentParser.g:1335:3: ruleProcessorArchitectureValue
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
    // InternalTargetEnvironmentParser.g:1344:1: rule__ProcessorArchitectureValue__Alternatives : ( ( ruleX86ProcessorArchitecture ) | ( ruleArm64ProcessorArchitecture ) );
    public final void rule__ProcessorArchitectureValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1348:1: ( ( ruleX86ProcessorArchitecture ) | ( ruleArm64ProcessorArchitecture ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==X86ProcessorArchitecture) ) {
                alt8=1;
            }
            else if ( (LA8_0==Arm64ProcessorArchitecture) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1349:2: ( ruleX86ProcessorArchitecture )
                    {
                    // InternalTargetEnvironmentParser.g:1349:2: ( ruleX86ProcessorArchitecture )
                    // InternalTargetEnvironmentParser.g:1350:3: ruleX86ProcessorArchitecture
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
                    // InternalTargetEnvironmentParser.g:1355:2: ( ruleArm64ProcessorArchitecture )
                    {
                    // InternalTargetEnvironmentParser.g:1355:2: ( ruleArm64ProcessorArchitecture )
                    // InternalTargetEnvironmentParser.g:1356:3: ruleArm64ProcessorArchitecture
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
    // InternalTargetEnvironmentParser.g:1365:1: rule__AbstractResouceType__Alternatives : ( ( ruleOpertingSystemType ) | ( ruleProcessorArchitectureType ) );
    public final void rule__AbstractResouceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1369:1: ( ( ruleOpertingSystemType ) | ( ruleProcessorArchitectureType ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Linux && LA9_0<=MacOS)) ) {
                alt9=1;
            }
            else if ( (LA9_0==ProcessorArchitecture) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1370:2: ( ruleOpertingSystemType )
                    {
                    // InternalTargetEnvironmentParser.g:1370:2: ( ruleOpertingSystemType )
                    // InternalTargetEnvironmentParser.g:1371:3: ruleOpertingSystemType
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
                    // InternalTargetEnvironmentParser.g:1376:2: ( ruleProcessorArchitectureType )
                    {
                    // InternalTargetEnvironmentParser.g:1376:2: ( ruleProcessorArchitectureType )
                    // InternalTargetEnvironmentParser.g:1377:3: ruleProcessorArchitectureType
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
    // InternalTargetEnvironmentParser.g:1386:1: rule__OpertingSystemType__Alternatives : ( ( ruleLinuxOpertingSystemType ) | ( ruleMacOSOpertingSystemType ) );
    public final void rule__OpertingSystemType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1390:1: ( ( ruleLinuxOpertingSystemType ) | ( ruleMacOSOpertingSystemType ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Linux) ) {
                alt10=1;
            }
            else if ( (LA10_0==MacOS) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1391:2: ( ruleLinuxOpertingSystemType )
                    {
                    // InternalTargetEnvironmentParser.g:1391:2: ( ruleLinuxOpertingSystemType )
                    // InternalTargetEnvironmentParser.g:1392:3: ruleLinuxOpertingSystemType
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
                    // InternalTargetEnvironmentParser.g:1397:2: ( ruleMacOSOpertingSystemType )
                    {
                    // InternalTargetEnvironmentParser.g:1397:2: ( ruleMacOSOpertingSystemType )
                    // InternalTargetEnvironmentParser.g:1398:3: ruleMacOSOpertingSystemType
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
    // InternalTargetEnvironmentParser.g:1407:1: rule__NetworkCommunicationType__Alternatives : ( ( ruleEthernetCommunicationType ) | ( ruleWlanCommunicationType ) );
    public final void rule__NetworkCommunicationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1411:1: ( ( ruleEthernetCommunicationType ) | ( ruleWlanCommunicationType ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Ethernet) ) {
                alt11=1;
            }
            else if ( (LA11_0==Wlan) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1412:2: ( ruleEthernetCommunicationType )
                    {
                    // InternalTargetEnvironmentParser.g:1412:2: ( ruleEthernetCommunicationType )
                    // InternalTargetEnvironmentParser.g:1413:3: ruleEthernetCommunicationType
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
                    // InternalTargetEnvironmentParser.g:1418:2: ( ruleWlanCommunicationType )
                    {
                    // InternalTargetEnvironmentParser.g:1418:2: ( ruleWlanCommunicationType )
                    // InternalTargetEnvironmentParser.g:1419:3: ruleWlanCommunicationType
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
    // InternalTargetEnvironmentParser.g:1428:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1432:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalTargetEnvironmentParser.g:1433:2: ( RULE_STRING )
                    {
                    // InternalTargetEnvironmentParser.g:1433:2: ( RULE_STRING )
                    // InternalTargetEnvironmentParser.g:1434:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:1439:2: ( RULE_ID )
                    {
                    // InternalTargetEnvironmentParser.g:1439:2: ( RULE_ID )
                    // InternalTargetEnvironmentParser.g:1440:3: RULE_ID
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
    // InternalTargetEnvironmentParser.g:1449:1: rule__TargetEnvironment__Group__0 : rule__TargetEnvironment__Group__0__Impl rule__TargetEnvironment__Group__1 ;
    public final void rule__TargetEnvironment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1453:1: ( rule__TargetEnvironment__Group__0__Impl rule__TargetEnvironment__Group__1 )
            // InternalTargetEnvironmentParser.g:1454:2: rule__TargetEnvironment__Group__0__Impl rule__TargetEnvironment__Group__1
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
    // InternalTargetEnvironmentParser.g:1461:1: rule__TargetEnvironment__Group__0__Impl : ( () ) ;
    public final void rule__TargetEnvironment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1465:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:1466:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:1466:1: ( () )
            // InternalTargetEnvironmentParser.g:1467:2: ()
            {
             before(grammarAccess.getTargetEnvironmentAccess().getTargetEnvironmentAction_0()); 
            // InternalTargetEnvironmentParser.g:1468:2: ()
            // InternalTargetEnvironmentParser.g:1468:3: 
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
    // InternalTargetEnvironmentParser.g:1476:1: rule__TargetEnvironment__Group__1 : rule__TargetEnvironment__Group__1__Impl ;
    public final void rule__TargetEnvironment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1480:1: ( rule__TargetEnvironment__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:1481:2: rule__TargetEnvironment__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:1487:1: rule__TargetEnvironment__Group__1__Impl : ( ( rule__TargetEnvironment__TypeAssignment_1 ) ) ;
    public final void rule__TargetEnvironment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1491:1: ( ( ( rule__TargetEnvironment__TypeAssignment_1 ) ) )
            // InternalTargetEnvironmentParser.g:1492:1: ( ( rule__TargetEnvironment__TypeAssignment_1 ) )
            {
            // InternalTargetEnvironmentParser.g:1492:1: ( ( rule__TargetEnvironment__TypeAssignment_1 ) )
            // InternalTargetEnvironmentParser.g:1493:2: ( rule__TargetEnvironment__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetEnvironmentAccess().getTypeAssignment_1()); 
            // InternalTargetEnvironmentParser.g:1494:2: ( rule__TargetEnvironment__TypeAssignment_1 )
            // InternalTargetEnvironmentParser.g:1494:3: rule__TargetEnvironment__TypeAssignment_1
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
    // InternalTargetEnvironmentParser.g:1503:1: rule__TargetDeployEnviroment__Group__0 : rule__TargetDeployEnviroment__Group__0__Impl rule__TargetDeployEnviroment__Group__1 ;
    public final void rule__TargetDeployEnviroment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1507:1: ( rule__TargetDeployEnviroment__Group__0__Impl rule__TargetDeployEnviroment__Group__1 )
            // InternalTargetEnvironmentParser.g:1508:2: rule__TargetDeployEnviroment__Group__0__Impl rule__TargetDeployEnviroment__Group__1
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
    // InternalTargetEnvironmentParser.g:1515:1: rule__TargetDeployEnviroment__Group__0__Impl : ( () ) ;
    public final void rule__TargetDeployEnviroment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1519:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:1520:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:1520:1: ( () )
            // InternalTargetEnvironmentParser.g:1521:2: ()
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentAction_0()); 
            // InternalTargetEnvironmentParser.g:1522:2: ()
            // InternalTargetEnvironmentParser.g:1522:3: 
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
    // InternalTargetEnvironmentParser.g:1530:1: rule__TargetDeployEnviroment__Group__1 : rule__TargetDeployEnviroment__Group__1__Impl rule__TargetDeployEnviroment__Group__2 ;
    public final void rule__TargetDeployEnviroment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1534:1: ( rule__TargetDeployEnviroment__Group__1__Impl rule__TargetDeployEnviroment__Group__2 )
            // InternalTargetEnvironmentParser.g:1535:2: rule__TargetDeployEnviroment__Group__1__Impl rule__TargetDeployEnviroment__Group__2
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
    // InternalTargetEnvironmentParser.g:1542:1: rule__TargetDeployEnviroment__Group__1__Impl : ( TargetDeployEnviroment ) ;
    public final void rule__TargetDeployEnviroment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1546:1: ( ( TargetDeployEnviroment ) )
            // InternalTargetEnvironmentParser.g:1547:1: ( TargetDeployEnviroment )
            {
            // InternalTargetEnvironmentParser.g:1547:1: ( TargetDeployEnviroment )
            // InternalTargetEnvironmentParser.g:1548:2: TargetDeployEnviroment
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
    // InternalTargetEnvironmentParser.g:1557:1: rule__TargetDeployEnviroment__Group__2 : rule__TargetDeployEnviroment__Group__2__Impl rule__TargetDeployEnviroment__Group__3 ;
    public final void rule__TargetDeployEnviroment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1561:1: ( rule__TargetDeployEnviroment__Group__2__Impl rule__TargetDeployEnviroment__Group__3 )
            // InternalTargetEnvironmentParser.g:1562:2: rule__TargetDeployEnviroment__Group__2__Impl rule__TargetDeployEnviroment__Group__3
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
    // InternalTargetEnvironmentParser.g:1569:1: rule__TargetDeployEnviroment__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__TargetDeployEnviroment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1573:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1574:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1574:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1575:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:1584:1: rule__TargetDeployEnviroment__Group__3 : rule__TargetDeployEnviroment__Group__3__Impl rule__TargetDeployEnviroment__Group__4 ;
    public final void rule__TargetDeployEnviroment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1588:1: ( rule__TargetDeployEnviroment__Group__3__Impl rule__TargetDeployEnviroment__Group__4 )
            // InternalTargetEnvironmentParser.g:1589:2: rule__TargetDeployEnviroment__Group__3__Impl rule__TargetDeployEnviroment__Group__4
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
    // InternalTargetEnvironmentParser.g:1596:1: rule__TargetDeployEnviroment__Group__3__Impl : ( Name ) ;
    public final void rule__TargetDeployEnviroment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1600:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:1601:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:1601:1: ( Name )
            // InternalTargetEnvironmentParser.g:1602:2: Name
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
    // InternalTargetEnvironmentParser.g:1611:1: rule__TargetDeployEnviroment__Group__4 : rule__TargetDeployEnviroment__Group__4__Impl rule__TargetDeployEnviroment__Group__5 ;
    public final void rule__TargetDeployEnviroment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1615:1: ( rule__TargetDeployEnviroment__Group__4__Impl rule__TargetDeployEnviroment__Group__5 )
            // InternalTargetEnvironmentParser.g:1616:2: rule__TargetDeployEnviroment__Group__4__Impl rule__TargetDeployEnviroment__Group__5
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
    // InternalTargetEnvironmentParser.g:1623:1: rule__TargetDeployEnviroment__Group__4__Impl : ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) ) ;
    public final void rule__TargetDeployEnviroment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1627:1: ( ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) ) )
            // InternalTargetEnvironmentParser.g:1628:1: ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) )
            {
            // InternalTargetEnvironmentParser.g:1628:1: ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) )
            // InternalTargetEnvironmentParser.g:1629:2: ( rule__TargetDeployEnviroment__NameAssignment_4 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getNameAssignment_4()); 
            // InternalTargetEnvironmentParser.g:1630:2: ( rule__TargetDeployEnviroment__NameAssignment_4 )
            // InternalTargetEnvironmentParser.g:1630:3: rule__TargetDeployEnviroment__NameAssignment_4
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
    // InternalTargetEnvironmentParser.g:1638:1: rule__TargetDeployEnviroment__Group__5 : rule__TargetDeployEnviroment__Group__5__Impl rule__TargetDeployEnviroment__Group__6 ;
    public final void rule__TargetDeployEnviroment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1642:1: ( rule__TargetDeployEnviroment__Group__5__Impl rule__TargetDeployEnviroment__Group__6 )
            // InternalTargetEnvironmentParser.g:1643:2: rule__TargetDeployEnviroment__Group__5__Impl rule__TargetDeployEnviroment__Group__6
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
    // InternalTargetEnvironmentParser.g:1650:1: rule__TargetDeployEnviroment__Group__5__Impl : ( ( rule__TargetDeployEnviroment__Group_5__0 )? ) ;
    public final void rule__TargetDeployEnviroment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1654:1: ( ( ( rule__TargetDeployEnviroment__Group_5__0 )? ) )
            // InternalTargetEnvironmentParser.g:1655:1: ( ( rule__TargetDeployEnviroment__Group_5__0 )? )
            {
            // InternalTargetEnvironmentParser.g:1655:1: ( ( rule__TargetDeployEnviroment__Group_5__0 )? )
            // InternalTargetEnvironmentParser.g:1656:2: ( rule__TargetDeployEnviroment__Group_5__0 )?
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getGroup_5()); 
            // InternalTargetEnvironmentParser.g:1657:2: ( rule__TargetDeployEnviroment__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IncludeDevice) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1657:3: rule__TargetDeployEnviroment__Group_5__0
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
    // InternalTargetEnvironmentParser.g:1665:1: rule__TargetDeployEnviroment__Group__6 : rule__TargetDeployEnviroment__Group__6__Impl rule__TargetDeployEnviroment__Group__7 ;
    public final void rule__TargetDeployEnviroment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1669:1: ( rule__TargetDeployEnviroment__Group__6__Impl rule__TargetDeployEnviroment__Group__7 )
            // InternalTargetEnvironmentParser.g:1670:2: rule__TargetDeployEnviroment__Group__6__Impl rule__TargetDeployEnviroment__Group__7
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
    // InternalTargetEnvironmentParser.g:1677:1: rule__TargetDeployEnviroment__Group__6__Impl : ( ( rule__TargetDeployEnviroment__Group_6__0 )? ) ;
    public final void rule__TargetDeployEnviroment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1681:1: ( ( ( rule__TargetDeployEnviroment__Group_6__0 )? ) )
            // InternalTargetEnvironmentParser.g:1682:1: ( ( rule__TargetDeployEnviroment__Group_6__0 )? )
            {
            // InternalTargetEnvironmentParser.g:1682:1: ( ( rule__TargetDeployEnviroment__Group_6__0 )? )
            // InternalTargetEnvironmentParser.g:1683:2: ( rule__TargetDeployEnviroment__Group_6__0 )?
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getGroup_6()); 
            // InternalTargetEnvironmentParser.g:1684:2: ( rule__TargetDeployEnviroment__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ConfigConnection) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1684:3: rule__TargetDeployEnviroment__Group_6__0
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
    // InternalTargetEnvironmentParser.g:1692:1: rule__TargetDeployEnviroment__Group__7 : rule__TargetDeployEnviroment__Group__7__Impl ;
    public final void rule__TargetDeployEnviroment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1696:1: ( rule__TargetDeployEnviroment__Group__7__Impl )
            // InternalTargetEnvironmentParser.g:1697:2: rule__TargetDeployEnviroment__Group__7__Impl
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
    // InternalTargetEnvironmentParser.g:1703:1: rule__TargetDeployEnviroment__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__TargetDeployEnviroment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1707:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1708:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1708:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1709:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1719:1: rule__TargetDeployEnviroment__Group_5__0 : rule__TargetDeployEnviroment__Group_5__0__Impl rule__TargetDeployEnviroment__Group_5__1 ;
    public final void rule__TargetDeployEnviroment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1723:1: ( rule__TargetDeployEnviroment__Group_5__0__Impl rule__TargetDeployEnviroment__Group_5__1 )
            // InternalTargetEnvironmentParser.g:1724:2: rule__TargetDeployEnviroment__Group_5__0__Impl rule__TargetDeployEnviroment__Group_5__1
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
    // InternalTargetEnvironmentParser.g:1731:1: rule__TargetDeployEnviroment__Group_5__0__Impl : ( IncludeDevice ) ;
    public final void rule__TargetDeployEnviroment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1735:1: ( ( IncludeDevice ) )
            // InternalTargetEnvironmentParser.g:1736:1: ( IncludeDevice )
            {
            // InternalTargetEnvironmentParser.g:1736:1: ( IncludeDevice )
            // InternalTargetEnvironmentParser.g:1737:2: IncludeDevice
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
    // InternalTargetEnvironmentParser.g:1746:1: rule__TargetDeployEnviroment__Group_5__1 : rule__TargetDeployEnviroment__Group_5__1__Impl rule__TargetDeployEnviroment__Group_5__2 ;
    public final void rule__TargetDeployEnviroment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1750:1: ( rule__TargetDeployEnviroment__Group_5__1__Impl rule__TargetDeployEnviroment__Group_5__2 )
            // InternalTargetEnvironmentParser.g:1751:2: rule__TargetDeployEnviroment__Group_5__1__Impl rule__TargetDeployEnviroment__Group_5__2
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
    // InternalTargetEnvironmentParser.g:1758:1: rule__TargetDeployEnviroment__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1762:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1763:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1763:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1764:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:1773:1: rule__TargetDeployEnviroment__Group_5__2 : rule__TargetDeployEnviroment__Group_5__2__Impl rule__TargetDeployEnviroment__Group_5__3 ;
    public final void rule__TargetDeployEnviroment__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1777:1: ( rule__TargetDeployEnviroment__Group_5__2__Impl rule__TargetDeployEnviroment__Group_5__3 )
            // InternalTargetEnvironmentParser.g:1778:2: rule__TargetDeployEnviroment__Group_5__2__Impl rule__TargetDeployEnviroment__Group_5__3
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
    // InternalTargetEnvironmentParser.g:1785:1: rule__TargetDeployEnviroment__Group_5__2__Impl : ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) ) ;
    public final void rule__TargetDeployEnviroment__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1789:1: ( ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:1790:1: ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:1790:1: ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) )
            // InternalTargetEnvironmentParser.g:1791:2: ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* )
            {
            // InternalTargetEnvironmentParser.g:1791:2: ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) )
            // InternalTargetEnvironmentParser.g:1792:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:1793:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )
            // InternalTargetEnvironmentParser.g:1793:4: rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2
            {
            pushFollow(FOLLOW_11);
            rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 

            }

            // InternalTargetEnvironmentParser.g:1796:2: ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* )
            // InternalTargetEnvironmentParser.g:1797:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )*
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:1798:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==HyphenMinus) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:1798:4: rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalTargetEnvironmentParser.g:1807:1: rule__TargetDeployEnviroment__Group_5__3 : rule__TargetDeployEnviroment__Group_5__3__Impl ;
    public final void rule__TargetDeployEnviroment__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1811:1: ( rule__TargetDeployEnviroment__Group_5__3__Impl )
            // InternalTargetEnvironmentParser.g:1812:2: rule__TargetDeployEnviroment__Group_5__3__Impl
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
    // InternalTargetEnvironmentParser.g:1818:1: rule__TargetDeployEnviroment__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1822:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1823:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1823:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1824:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1834:1: rule__TargetDeployEnviroment__Group_6__0 : rule__TargetDeployEnviroment__Group_6__0__Impl rule__TargetDeployEnviroment__Group_6__1 ;
    public final void rule__TargetDeployEnviroment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1838:1: ( rule__TargetDeployEnviroment__Group_6__0__Impl rule__TargetDeployEnviroment__Group_6__1 )
            // InternalTargetEnvironmentParser.g:1839:2: rule__TargetDeployEnviroment__Group_6__0__Impl rule__TargetDeployEnviroment__Group_6__1
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
    // InternalTargetEnvironmentParser.g:1846:1: rule__TargetDeployEnviroment__Group_6__0__Impl : ( ConfigConnection ) ;
    public final void rule__TargetDeployEnviroment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1850:1: ( ( ConfigConnection ) )
            // InternalTargetEnvironmentParser.g:1851:1: ( ConfigConnection )
            {
            // InternalTargetEnvironmentParser.g:1851:1: ( ConfigConnection )
            // InternalTargetEnvironmentParser.g:1852:2: ConfigConnection
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
    // InternalTargetEnvironmentParser.g:1861:1: rule__TargetDeployEnviroment__Group_6__1 : rule__TargetDeployEnviroment__Group_6__1__Impl rule__TargetDeployEnviroment__Group_6__2 ;
    public final void rule__TargetDeployEnviroment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1865:1: ( rule__TargetDeployEnviroment__Group_6__1__Impl rule__TargetDeployEnviroment__Group_6__2 )
            // InternalTargetEnvironmentParser.g:1866:2: rule__TargetDeployEnviroment__Group_6__1__Impl rule__TargetDeployEnviroment__Group_6__2
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
    // InternalTargetEnvironmentParser.g:1873:1: rule__TargetDeployEnviroment__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1877:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1878:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1878:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1879:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:1888:1: rule__TargetDeployEnviroment__Group_6__2 : rule__TargetDeployEnviroment__Group_6__2__Impl rule__TargetDeployEnviroment__Group_6__3 ;
    public final void rule__TargetDeployEnviroment__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1892:1: ( rule__TargetDeployEnviroment__Group_6__2__Impl rule__TargetDeployEnviroment__Group_6__3 )
            // InternalTargetEnvironmentParser.g:1893:2: rule__TargetDeployEnviroment__Group_6__2__Impl rule__TargetDeployEnviroment__Group_6__3
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
    // InternalTargetEnvironmentParser.g:1900:1: rule__TargetDeployEnviroment__Group_6__2__Impl : ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) ) ;
    public final void rule__TargetDeployEnviroment__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1904:1: ( ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:1905:1: ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:1905:1: ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) )
            // InternalTargetEnvironmentParser.g:1906:2: ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* )
            {
            // InternalTargetEnvironmentParser.g:1906:2: ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) )
            // InternalTargetEnvironmentParser.g:1907:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:1908:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )
            // InternalTargetEnvironmentParser.g:1908:4: rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 

            }

            // InternalTargetEnvironmentParser.g:1911:2: ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* )
            // InternalTargetEnvironmentParser.g:1912:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:1913:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==HyphenMinus) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:1913:4: rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalTargetEnvironmentParser.g:1922:1: rule__TargetDeployEnviroment__Group_6__3 : rule__TargetDeployEnviroment__Group_6__3__Impl ;
    public final void rule__TargetDeployEnviroment__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1926:1: ( rule__TargetDeployEnviroment__Group_6__3__Impl )
            // InternalTargetEnvironmentParser.g:1927:2: rule__TargetDeployEnviroment__Group_6__3__Impl
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
    // InternalTargetEnvironmentParser.g:1933:1: rule__TargetDeployEnviroment__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1937:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1938:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1938:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1939:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1949:1: rule__DeviceInstance__Group__0 : rule__DeviceInstance__Group__0__Impl rule__DeviceInstance__Group__1 ;
    public final void rule__DeviceInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1953:1: ( rule__DeviceInstance__Group__0__Impl rule__DeviceInstance__Group__1 )
            // InternalTargetEnvironmentParser.g:1954:2: rule__DeviceInstance__Group__0__Impl rule__DeviceInstance__Group__1
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
    // InternalTargetEnvironmentParser.g:1961:1: rule__DeviceInstance__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__DeviceInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1965:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:1966:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:1966:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:1967:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:1976:1: rule__DeviceInstance__Group__1 : rule__DeviceInstance__Group__1__Impl rule__DeviceInstance__Group__2 ;
    public final void rule__DeviceInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1980:1: ( rule__DeviceInstance__Group__1__Impl rule__DeviceInstance__Group__2 )
            // InternalTargetEnvironmentParser.g:1981:2: rule__DeviceInstance__Group__1__Impl rule__DeviceInstance__Group__2
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
    // InternalTargetEnvironmentParser.g:1988:1: rule__DeviceInstance__Group__1__Impl : ( Name ) ;
    public final void rule__DeviceInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1992:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:1993:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:1993:1: ( Name )
            // InternalTargetEnvironmentParser.g:1994:2: Name
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
    // InternalTargetEnvironmentParser.g:2003:1: rule__DeviceInstance__Group__2 : rule__DeviceInstance__Group__2__Impl rule__DeviceInstance__Group__3 ;
    public final void rule__DeviceInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2007:1: ( rule__DeviceInstance__Group__2__Impl rule__DeviceInstance__Group__3 )
            // InternalTargetEnvironmentParser.g:2008:2: rule__DeviceInstance__Group__2__Impl rule__DeviceInstance__Group__3
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
    // InternalTargetEnvironmentParser.g:2015:1: rule__DeviceInstance__Group__2__Impl : ( ( rule__DeviceInstance__NameAssignment_2 ) ) ;
    public final void rule__DeviceInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2019:1: ( ( ( rule__DeviceInstance__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:2020:1: ( ( rule__DeviceInstance__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:2020:1: ( ( rule__DeviceInstance__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:2021:2: ( rule__DeviceInstance__NameAssignment_2 )
            {
             before(grammarAccess.getDeviceInstanceAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:2022:2: ( rule__DeviceInstance__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:2022:3: rule__DeviceInstance__NameAssignment_2
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
    // InternalTargetEnvironmentParser.g:2030:1: rule__DeviceInstance__Group__3 : rule__DeviceInstance__Group__3__Impl rule__DeviceInstance__Group__4 ;
    public final void rule__DeviceInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2034:1: ( rule__DeviceInstance__Group__3__Impl rule__DeviceInstance__Group__4 )
            // InternalTargetEnvironmentParser.g:2035:2: rule__DeviceInstance__Group__3__Impl rule__DeviceInstance__Group__4
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
    // InternalTargetEnvironmentParser.g:2042:1: rule__DeviceInstance__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2046:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2047:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2047:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2048:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2057:1: rule__DeviceInstance__Group__4 : rule__DeviceInstance__Group__4__Impl rule__DeviceInstance__Group__5 ;
    public final void rule__DeviceInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2061:1: ( rule__DeviceInstance__Group__4__Impl rule__DeviceInstance__Group__5 )
            // InternalTargetEnvironmentParser.g:2062:2: rule__DeviceInstance__Group__4__Impl rule__DeviceInstance__Group__5
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
    // InternalTargetEnvironmentParser.g:2069:1: rule__DeviceInstance__Group__4__Impl : ( RefDeviceType ) ;
    public final void rule__DeviceInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2073:1: ( ( RefDeviceType ) )
            // InternalTargetEnvironmentParser.g:2074:1: ( RefDeviceType )
            {
            // InternalTargetEnvironmentParser.g:2074:1: ( RefDeviceType )
            // InternalTargetEnvironmentParser.g:2075:2: RefDeviceType
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
    // InternalTargetEnvironmentParser.g:2084:1: rule__DeviceInstance__Group__5 : rule__DeviceInstance__Group__5__Impl rule__DeviceInstance__Group__6 ;
    public final void rule__DeviceInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2088:1: ( rule__DeviceInstance__Group__5__Impl rule__DeviceInstance__Group__6 )
            // InternalTargetEnvironmentParser.g:2089:2: rule__DeviceInstance__Group__5__Impl rule__DeviceInstance__Group__6
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
    // InternalTargetEnvironmentParser.g:2096:1: rule__DeviceInstance__Group__5__Impl : ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) ) ;
    public final void rule__DeviceInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2100:1: ( ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:2101:1: ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:2101:1: ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:2102:2: ( rule__DeviceInstance__RefDeviceTypeAssignment_5 )
            {
             before(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeAssignment_5()); 
            // InternalTargetEnvironmentParser.g:2103:2: ( rule__DeviceInstance__RefDeviceTypeAssignment_5 )
            // InternalTargetEnvironmentParser.g:2103:3: rule__DeviceInstance__RefDeviceTypeAssignment_5
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
    // InternalTargetEnvironmentParser.g:2111:1: rule__DeviceInstance__Group__6 : rule__DeviceInstance__Group__6__Impl ;
    public final void rule__DeviceInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2115:1: ( rule__DeviceInstance__Group__6__Impl )
            // InternalTargetEnvironmentParser.g:2116:2: rule__DeviceInstance__Group__6__Impl
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
    // InternalTargetEnvironmentParser.g:2122:1: rule__DeviceInstance__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2126:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2127:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2127:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2128:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2138:1: rule__ConfigConnection__Group__0 : rule__ConfigConnection__Group__0__Impl rule__ConfigConnection__Group__1 ;
    public final void rule__ConfigConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2142:1: ( rule__ConfigConnection__Group__0__Impl rule__ConfigConnection__Group__1 )
            // InternalTargetEnvironmentParser.g:2143:2: rule__ConfigConnection__Group__0__Impl rule__ConfigConnection__Group__1
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
    // InternalTargetEnvironmentParser.g:2150:1: rule__ConfigConnection__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__ConfigConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2154:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:2155:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:2155:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:2156:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:2165:1: rule__ConfigConnection__Group__1 : rule__ConfigConnection__Group__1__Impl rule__ConfigConnection__Group__2 ;
    public final void rule__ConfigConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2169:1: ( rule__ConfigConnection__Group__1__Impl rule__ConfigConnection__Group__2 )
            // InternalTargetEnvironmentParser.g:2170:2: rule__ConfigConnection__Group__1__Impl rule__ConfigConnection__Group__2
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
    // InternalTargetEnvironmentParser.g:2177:1: rule__ConfigConnection__Group__1__Impl : ( Name ) ;
    public final void rule__ConfigConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2181:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:2182:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:2182:1: ( Name )
            // InternalTargetEnvironmentParser.g:2183:2: Name
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
    // InternalTargetEnvironmentParser.g:2192:1: rule__ConfigConnection__Group__2 : rule__ConfigConnection__Group__2__Impl rule__ConfigConnection__Group__3 ;
    public final void rule__ConfigConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2196:1: ( rule__ConfigConnection__Group__2__Impl rule__ConfigConnection__Group__3 )
            // InternalTargetEnvironmentParser.g:2197:2: rule__ConfigConnection__Group__2__Impl rule__ConfigConnection__Group__3
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
    // InternalTargetEnvironmentParser.g:2204:1: rule__ConfigConnection__Group__2__Impl : ( ( rule__ConfigConnection__NameAssignment_2 ) ) ;
    public final void rule__ConfigConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2208:1: ( ( ( rule__ConfigConnection__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:2209:1: ( ( rule__ConfigConnection__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:2209:1: ( ( rule__ConfigConnection__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:2210:2: ( rule__ConfigConnection__NameAssignment_2 )
            {
             before(grammarAccess.getConfigConnectionAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:2211:2: ( rule__ConfigConnection__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:2211:3: rule__ConfigConnection__NameAssignment_2
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
    // InternalTargetEnvironmentParser.g:2219:1: rule__ConfigConnection__Group__3 : rule__ConfigConnection__Group__3__Impl rule__ConfigConnection__Group__4 ;
    public final void rule__ConfigConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2223:1: ( rule__ConfigConnection__Group__3__Impl rule__ConfigConnection__Group__4 )
            // InternalTargetEnvironmentParser.g:2224:2: rule__ConfigConnection__Group__3__Impl rule__ConfigConnection__Group__4
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
    // InternalTargetEnvironmentParser.g:2231:1: rule__ConfigConnection__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__ConfigConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2235:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2236:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2236:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2237:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2246:1: rule__ConfigConnection__Group__4 : rule__ConfigConnection__Group__4__Impl rule__ConfigConnection__Group__5 ;
    public final void rule__ConfigConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2250:1: ( rule__ConfigConnection__Group__4__Impl rule__ConfigConnection__Group__5 )
            // InternalTargetEnvironmentParser.g:2251:2: rule__ConfigConnection__Group__4__Impl rule__ConfigConnection__Group__5
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
    // InternalTargetEnvironmentParser.g:2258:1: rule__ConfigConnection__Group__4__Impl : ( ConnectDevice ) ;
    public final void rule__ConfigConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2262:1: ( ( ConnectDevice ) )
            // InternalTargetEnvironmentParser.g:2263:1: ( ConnectDevice )
            {
            // InternalTargetEnvironmentParser.g:2263:1: ( ConnectDevice )
            // InternalTargetEnvironmentParser.g:2264:2: ConnectDevice
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
    // InternalTargetEnvironmentParser.g:2273:1: rule__ConfigConnection__Group__5 : rule__ConfigConnection__Group__5__Impl rule__ConfigConnection__Group__6 ;
    public final void rule__ConfigConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2277:1: ( rule__ConfigConnection__Group__5__Impl rule__ConfigConnection__Group__6 )
            // InternalTargetEnvironmentParser.g:2278:2: rule__ConfigConnection__Group__5__Impl rule__ConfigConnection__Group__6
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
    // InternalTargetEnvironmentParser.g:2285:1: rule__ConfigConnection__Group__5__Impl : ( RULE_INDENT ) ;
    public final void rule__ConfigConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2289:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2290:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2290:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2291:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2300:1: rule__ConfigConnection__Group__6 : rule__ConfigConnection__Group__6__Impl rule__ConfigConnection__Group__7 ;
    public final void rule__ConfigConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2304:1: ( rule__ConfigConnection__Group__6__Impl rule__ConfigConnection__Group__7 )
            // InternalTargetEnvironmentParser.g:2305:2: rule__ConfigConnection__Group__6__Impl rule__ConfigConnection__Group__7
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
    // InternalTargetEnvironmentParser.g:2312:1: rule__ConfigConnection__Group__6__Impl : ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) ) ;
    public final void rule__ConfigConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2316:1: ( ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) ) )
            // InternalTargetEnvironmentParser.g:2317:1: ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) )
            {
            // InternalTargetEnvironmentParser.g:2317:1: ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) )
            // InternalTargetEnvironmentParser.g:2318:2: ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* )
            {
            // InternalTargetEnvironmentParser.g:2318:2: ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) )
            // InternalTargetEnvironmentParser.g:2319:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )
            {
             before(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 
            // InternalTargetEnvironmentParser.g:2320:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )
            // InternalTargetEnvironmentParser.g:2320:4: rule__ConfigConnection__ConnectDeviceAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__ConfigConnection__ConnectDeviceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 

            }

            // InternalTargetEnvironmentParser.g:2323:2: ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* )
            // InternalTargetEnvironmentParser.g:2324:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )*
            {
             before(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 
            // InternalTargetEnvironmentParser.g:2325:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==HyphenMinus) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:2325:4: rule__ConfigConnection__ConnectDeviceAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConfigConnection__ConnectDeviceAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalTargetEnvironmentParser.g:2334:1: rule__ConfigConnection__Group__7 : rule__ConfigConnection__Group__7__Impl rule__ConfigConnection__Group__8 ;
    public final void rule__ConfigConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2338:1: ( rule__ConfigConnection__Group__7__Impl rule__ConfigConnection__Group__8 )
            // InternalTargetEnvironmentParser.g:2339:2: rule__ConfigConnection__Group__7__Impl rule__ConfigConnection__Group__8
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
    // InternalTargetEnvironmentParser.g:2346:1: rule__ConfigConnection__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConfigConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2350:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2351:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2351:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2352:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2361:1: rule__ConfigConnection__Group__8 : rule__ConfigConnection__Group__8__Impl ;
    public final void rule__ConfigConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2365:1: ( rule__ConfigConnection__Group__8__Impl )
            // InternalTargetEnvironmentParser.g:2366:2: rule__ConfigConnection__Group__8__Impl
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
    // InternalTargetEnvironmentParser.g:2372:1: rule__ConfigConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConfigConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2376:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2377:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2377:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2378:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2388:1: rule__ConnectedDevice__Group__0 : rule__ConnectedDevice__Group__0__Impl rule__ConnectedDevice__Group__1 ;
    public final void rule__ConnectedDevice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2392:1: ( rule__ConnectedDevice__Group__0__Impl rule__ConnectedDevice__Group__1 )
            // InternalTargetEnvironmentParser.g:2393:2: rule__ConnectedDevice__Group__0__Impl rule__ConnectedDevice__Group__1
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
    // InternalTargetEnvironmentParser.g:2400:1: rule__ConnectedDevice__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectedDevice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2404:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:2405:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:2405:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:2406:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:2415:1: rule__ConnectedDevice__Group__1 : rule__ConnectedDevice__Group__1__Impl rule__ConnectedDevice__Group__2 ;
    public final void rule__ConnectedDevice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2419:1: ( rule__ConnectedDevice__Group__1__Impl rule__ConnectedDevice__Group__2 )
            // InternalTargetEnvironmentParser.g:2420:2: rule__ConnectedDevice__Group__1__Impl rule__ConnectedDevice__Group__2
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
    // InternalTargetEnvironmentParser.g:2427:1: rule__ConnectedDevice__Group__1__Impl : ( RefDevice ) ;
    public final void rule__ConnectedDevice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2431:1: ( ( RefDevice ) )
            // InternalTargetEnvironmentParser.g:2432:1: ( RefDevice )
            {
            // InternalTargetEnvironmentParser.g:2432:1: ( RefDevice )
            // InternalTargetEnvironmentParser.g:2433:2: RefDevice
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
    // InternalTargetEnvironmentParser.g:2442:1: rule__ConnectedDevice__Group__2 : rule__ConnectedDevice__Group__2__Impl rule__ConnectedDevice__Group__3 ;
    public final void rule__ConnectedDevice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2446:1: ( rule__ConnectedDevice__Group__2__Impl rule__ConnectedDevice__Group__3 )
            // InternalTargetEnvironmentParser.g:2447:2: rule__ConnectedDevice__Group__2__Impl rule__ConnectedDevice__Group__3
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
    // InternalTargetEnvironmentParser.g:2454:1: rule__ConnectedDevice__Group__2__Impl : ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) ) ;
    public final void rule__ConnectedDevice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2458:1: ( ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:2459:1: ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:2459:1: ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:2460:2: ( rule__ConnectedDevice__RefDeviceAssignment_2 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefDeviceAssignment_2()); 
            // InternalTargetEnvironmentParser.g:2461:2: ( rule__ConnectedDevice__RefDeviceAssignment_2 )
            // InternalTargetEnvironmentParser.g:2461:3: rule__ConnectedDevice__RefDeviceAssignment_2
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
    // InternalTargetEnvironmentParser.g:2469:1: rule__ConnectedDevice__Group__3 : rule__ConnectedDevice__Group__3__Impl rule__ConnectedDevice__Group__4 ;
    public final void rule__ConnectedDevice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2473:1: ( rule__ConnectedDevice__Group__3__Impl rule__ConnectedDevice__Group__4 )
            // InternalTargetEnvironmentParser.g:2474:2: rule__ConnectedDevice__Group__3__Impl rule__ConnectedDevice__Group__4
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
    // InternalTargetEnvironmentParser.g:2481:1: rule__ConnectedDevice__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectedDevice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2485:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2486:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2486:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2487:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2496:1: rule__ConnectedDevice__Group__4 : rule__ConnectedDevice__Group__4__Impl rule__ConnectedDevice__Group__5 ;
    public final void rule__ConnectedDevice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2500:1: ( rule__ConnectedDevice__Group__4__Impl rule__ConnectedDevice__Group__5 )
            // InternalTargetEnvironmentParser.g:2501:2: rule__ConnectedDevice__Group__4__Impl rule__ConnectedDevice__Group__5
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
    // InternalTargetEnvironmentParser.g:2508:1: rule__ConnectedDevice__Group__4__Impl : ( RefConnection ) ;
    public final void rule__ConnectedDevice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2512:1: ( ( RefConnection ) )
            // InternalTargetEnvironmentParser.g:2513:1: ( RefConnection )
            {
            // InternalTargetEnvironmentParser.g:2513:1: ( RefConnection )
            // InternalTargetEnvironmentParser.g:2514:2: RefConnection
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
    // InternalTargetEnvironmentParser.g:2523:1: rule__ConnectedDevice__Group__5 : rule__ConnectedDevice__Group__5__Impl rule__ConnectedDevice__Group__6 ;
    public final void rule__ConnectedDevice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2527:1: ( rule__ConnectedDevice__Group__5__Impl rule__ConnectedDevice__Group__6 )
            // InternalTargetEnvironmentParser.g:2528:2: rule__ConnectedDevice__Group__5__Impl rule__ConnectedDevice__Group__6
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
    // InternalTargetEnvironmentParser.g:2535:1: rule__ConnectedDevice__Group__5__Impl : ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) ) ;
    public final void rule__ConnectedDevice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2539:1: ( ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:2540:1: ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:2540:1: ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:2541:2: ( rule__ConnectedDevice__RefConnectionAssignment_5 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefConnectionAssignment_5()); 
            // InternalTargetEnvironmentParser.g:2542:2: ( rule__ConnectedDevice__RefConnectionAssignment_5 )
            // InternalTargetEnvironmentParser.g:2542:3: rule__ConnectedDevice__RefConnectionAssignment_5
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
    // InternalTargetEnvironmentParser.g:2550:1: rule__ConnectedDevice__Group__6 : rule__ConnectedDevice__Group__6__Impl rule__ConnectedDevice__Group__7 ;
    public final void rule__ConnectedDevice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2554:1: ( rule__ConnectedDevice__Group__6__Impl rule__ConnectedDevice__Group__7 )
            // InternalTargetEnvironmentParser.g:2555:2: rule__ConnectedDevice__Group__6__Impl rule__ConnectedDevice__Group__7
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
    // InternalTargetEnvironmentParser.g:2562:1: rule__ConnectedDevice__Group__6__Impl : ( ( rule__ConnectedDevice__Group_6__0 )? ) ;
    public final void rule__ConnectedDevice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2566:1: ( ( ( rule__ConnectedDevice__Group_6__0 )? ) )
            // InternalTargetEnvironmentParser.g:2567:1: ( ( rule__ConnectedDevice__Group_6__0 )? )
            {
            // InternalTargetEnvironmentParser.g:2567:1: ( ( rule__ConnectedDevice__Group_6__0 )? )
            // InternalTargetEnvironmentParser.g:2568:2: ( rule__ConnectedDevice__Group_6__0 )?
            {
             before(grammarAccess.getConnectedDeviceAccess().getGroup_6()); 
            // InternalTargetEnvironmentParser.g:2569:2: ( rule__ConnectedDevice__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Configuration) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2569:3: rule__ConnectedDevice__Group_6__0
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
    // InternalTargetEnvironmentParser.g:2577:1: rule__ConnectedDevice__Group__7 : rule__ConnectedDevice__Group__7__Impl ;
    public final void rule__ConnectedDevice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2581:1: ( rule__ConnectedDevice__Group__7__Impl )
            // InternalTargetEnvironmentParser.g:2582:2: rule__ConnectedDevice__Group__7__Impl
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
    // InternalTargetEnvironmentParser.g:2588:1: rule__ConnectedDevice__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectedDevice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2592:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2593:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2593:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2594:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2604:1: rule__ConnectedDevice__Group_6__0 : rule__ConnectedDevice__Group_6__0__Impl rule__ConnectedDevice__Group_6__1 ;
    public final void rule__ConnectedDevice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2608:1: ( rule__ConnectedDevice__Group_6__0__Impl rule__ConnectedDevice__Group_6__1 )
            // InternalTargetEnvironmentParser.g:2609:2: rule__ConnectedDevice__Group_6__0__Impl rule__ConnectedDevice__Group_6__1
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
    // InternalTargetEnvironmentParser.g:2616:1: rule__ConnectedDevice__Group_6__0__Impl : ( Configuration ) ;
    public final void rule__ConnectedDevice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2620:1: ( ( Configuration ) )
            // InternalTargetEnvironmentParser.g:2621:1: ( Configuration )
            {
            // InternalTargetEnvironmentParser.g:2621:1: ( Configuration )
            // InternalTargetEnvironmentParser.g:2622:2: Configuration
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
    // InternalTargetEnvironmentParser.g:2631:1: rule__ConnectedDevice__Group_6__1 : rule__ConnectedDevice__Group_6__1__Impl rule__ConnectedDevice__Group_6__2 ;
    public final void rule__ConnectedDevice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2635:1: ( rule__ConnectedDevice__Group_6__1__Impl rule__ConnectedDevice__Group_6__2 )
            // InternalTargetEnvironmentParser.g:2636:2: rule__ConnectedDevice__Group_6__1__Impl rule__ConnectedDevice__Group_6__2
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
    // InternalTargetEnvironmentParser.g:2643:1: rule__ConnectedDevice__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectedDevice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2647:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2648:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2648:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2649:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2658:1: rule__ConnectedDevice__Group_6__2 : rule__ConnectedDevice__Group_6__2__Impl rule__ConnectedDevice__Group_6__3 ;
    public final void rule__ConnectedDevice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2662:1: ( rule__ConnectedDevice__Group_6__2__Impl rule__ConnectedDevice__Group_6__3 )
            // InternalTargetEnvironmentParser.g:2663:2: rule__ConnectedDevice__Group_6__2__Impl rule__ConnectedDevice__Group_6__3
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
    // InternalTargetEnvironmentParser.g:2670:1: rule__ConnectedDevice__Group_6__2__Impl : ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) ) ;
    public final void rule__ConnectedDevice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2674:1: ( ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:2675:1: ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:2675:1: ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) )
            // InternalTargetEnvironmentParser.g:2676:2: ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* )
            {
            // InternalTargetEnvironmentParser.g:2676:2: ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) )
            // InternalTargetEnvironmentParser.g:2677:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:2678:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )
            // InternalTargetEnvironmentParser.g:2678:4: rule__ConnectedDevice__PropertiesAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__ConnectedDevice__PropertiesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 

            }

            // InternalTargetEnvironmentParser.g:2681:2: ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* )
            // InternalTargetEnvironmentParser.g:2682:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )*
            {
             before(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:2683:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==HyphenMinus) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:2683:4: rule__ConnectedDevice__PropertiesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConnectedDevice__PropertiesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTargetEnvironmentParser.g:2692:1: rule__ConnectedDevice__Group_6__3 : rule__ConnectedDevice__Group_6__3__Impl ;
    public final void rule__ConnectedDevice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2696:1: ( rule__ConnectedDevice__Group_6__3__Impl )
            // InternalTargetEnvironmentParser.g:2697:2: rule__ConnectedDevice__Group_6__3__Impl
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
    // InternalTargetEnvironmentParser.g:2703:1: rule__ConnectedDevice__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectedDevice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2707:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2708:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2708:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2709:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2719:1: rule__ConfigConnectionProperty__Group__0 : rule__ConfigConnectionProperty__Group__0__Impl rule__ConfigConnectionProperty__Group__1 ;
    public final void rule__ConfigConnectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2723:1: ( rule__ConfigConnectionProperty__Group__0__Impl rule__ConfigConnectionProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:2724:2: rule__ConfigConnectionProperty__Group__0__Impl rule__ConfigConnectionProperty__Group__1
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
    // InternalTargetEnvironmentParser.g:2731:1: rule__ConfigConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConfigConnectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2735:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:2736:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:2736:1: ( () )
            // InternalTargetEnvironmentParser.g:2737:2: ()
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getConfigConnectionPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:2738:2: ()
            // InternalTargetEnvironmentParser.g:2738:3: 
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
    // InternalTargetEnvironmentParser.g:2746:1: rule__ConfigConnectionProperty__Group__1 : rule__ConfigConnectionProperty__Group__1__Impl rule__ConfigConnectionProperty__Group__2 ;
    public final void rule__ConfigConnectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2750:1: ( rule__ConfigConnectionProperty__Group__1__Impl rule__ConfigConnectionProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:2751:2: rule__ConfigConnectionProperty__Group__1__Impl rule__ConfigConnectionProperty__Group__2
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
    // InternalTargetEnvironmentParser.g:2758:1: rule__ConfigConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConfigConnectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2762:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:2763:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:2763:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:2764:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:2773:1: rule__ConfigConnectionProperty__Group__2 : rule__ConfigConnectionProperty__Group__2__Impl rule__ConfigConnectionProperty__Group__3 ;
    public final void rule__ConfigConnectionProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2777:1: ( rule__ConfigConnectionProperty__Group__2__Impl rule__ConfigConnectionProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:2778:2: rule__ConfigConnectionProperty__Group__2__Impl rule__ConfigConnectionProperty__Group__3
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
    // InternalTargetEnvironmentParser.g:2785:1: rule__ConfigConnectionProperty__Group__2__Impl : ( RefConnectionProperty ) ;
    public final void rule__ConfigConnectionProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2789:1: ( ( RefConnectionProperty ) )
            // InternalTargetEnvironmentParser.g:2790:1: ( RefConnectionProperty )
            {
            // InternalTargetEnvironmentParser.g:2790:1: ( RefConnectionProperty )
            // InternalTargetEnvironmentParser.g:2791:2: RefConnectionProperty
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
    // InternalTargetEnvironmentParser.g:2800:1: rule__ConfigConnectionProperty__Group__3 : rule__ConfigConnectionProperty__Group__3__Impl rule__ConfigConnectionProperty__Group__4 ;
    public final void rule__ConfigConnectionProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2804:1: ( rule__ConfigConnectionProperty__Group__3__Impl rule__ConfigConnectionProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:2805:2: rule__ConfigConnectionProperty__Group__3__Impl rule__ConfigConnectionProperty__Group__4
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
    // InternalTargetEnvironmentParser.g:2812:1: rule__ConfigConnectionProperty__Group__3__Impl : ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) ) ;
    public final void rule__ConfigConnectionProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2816:1: ( ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:2817:1: ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:2817:1: ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:2818:2: ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyAssignment_3()); 
            // InternalTargetEnvironmentParser.g:2819:2: ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 )
            // InternalTargetEnvironmentParser.g:2819:3: rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3
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
    // InternalTargetEnvironmentParser.g:2827:1: rule__ConfigConnectionProperty__Group__4 : rule__ConfigConnectionProperty__Group__4__Impl ;
    public final void rule__ConfigConnectionProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2831:1: ( rule__ConfigConnectionProperty__Group__4__Impl )
            // InternalTargetEnvironmentParser.g:2832:2: rule__ConfigConnectionProperty__Group__4__Impl
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
    // InternalTargetEnvironmentParser.g:2838:1: rule__ConfigConnectionProperty__Group__4__Impl : ( ( rule__ConfigConnectionProperty__Group_4__0 )? ) ;
    public final void rule__ConfigConnectionProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2842:1: ( ( ( rule__ConfigConnectionProperty__Group_4__0 )? ) )
            // InternalTargetEnvironmentParser.g:2843:1: ( ( rule__ConfigConnectionProperty__Group_4__0 )? )
            {
            // InternalTargetEnvironmentParser.g:2843:1: ( ( rule__ConfigConnectionProperty__Group_4__0 )? )
            // InternalTargetEnvironmentParser.g:2844:2: ( rule__ConfigConnectionProperty__Group_4__0 )?
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getGroup_4()); 
            // InternalTargetEnvironmentParser.g:2845:2: ( rule__ConfigConnectionProperty__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2845:3: rule__ConfigConnectionProperty__Group_4__0
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
    // InternalTargetEnvironmentParser.g:2854:1: rule__ConfigConnectionProperty__Group_4__0 : rule__ConfigConnectionProperty__Group_4__0__Impl rule__ConfigConnectionProperty__Group_4__1 ;
    public final void rule__ConfigConnectionProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2858:1: ( rule__ConfigConnectionProperty__Group_4__0__Impl rule__ConfigConnectionProperty__Group_4__1 )
            // InternalTargetEnvironmentParser.g:2859:2: rule__ConfigConnectionProperty__Group_4__0__Impl rule__ConfigConnectionProperty__Group_4__1
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
    // InternalTargetEnvironmentParser.g:2866:1: rule__ConfigConnectionProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__ConfigConnectionProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2870:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2871:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2871:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2872:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2881:1: rule__ConfigConnectionProperty__Group_4__1 : rule__ConfigConnectionProperty__Group_4__1__Impl rule__ConfigConnectionProperty__Group_4__2 ;
    public final void rule__ConfigConnectionProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2885:1: ( rule__ConfigConnectionProperty__Group_4__1__Impl rule__ConfigConnectionProperty__Group_4__2 )
            // InternalTargetEnvironmentParser.g:2886:2: rule__ConfigConnectionProperty__Group_4__1__Impl rule__ConfigConnectionProperty__Group_4__2
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
    // InternalTargetEnvironmentParser.g:2893:1: rule__ConfigConnectionProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__ConfigConnectionProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2897:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:2898:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:2898:1: ( Value )
            // InternalTargetEnvironmentParser.g:2899:2: Value
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
    // InternalTargetEnvironmentParser.g:2908:1: rule__ConfigConnectionProperty__Group_4__2 : rule__ConfigConnectionProperty__Group_4__2__Impl rule__ConfigConnectionProperty__Group_4__3 ;
    public final void rule__ConfigConnectionProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2912:1: ( rule__ConfigConnectionProperty__Group_4__2__Impl rule__ConfigConnectionProperty__Group_4__3 )
            // InternalTargetEnvironmentParser.g:2913:2: rule__ConfigConnectionProperty__Group_4__2__Impl rule__ConfigConnectionProperty__Group_4__3
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
    // InternalTargetEnvironmentParser.g:2920:1: rule__ConfigConnectionProperty__Group_4__2__Impl : ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__ConfigConnectionProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2924:1: ( ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) ) )
            // InternalTargetEnvironmentParser.g:2925:1: ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) )
            {
            // InternalTargetEnvironmentParser.g:2925:1: ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) )
            // InternalTargetEnvironmentParser.g:2926:2: ( rule__ConfigConnectionProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getValueAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:2927:2: ( rule__ConfigConnectionProperty__ValueAssignment_4_2 )
            // InternalTargetEnvironmentParser.g:2927:3: rule__ConfigConnectionProperty__ValueAssignment_4_2
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
    // InternalTargetEnvironmentParser.g:2935:1: rule__ConfigConnectionProperty__Group_4__3 : rule__ConfigConnectionProperty__Group_4__3__Impl ;
    public final void rule__ConfigConnectionProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2939:1: ( rule__ConfigConnectionProperty__Group_4__3__Impl )
            // InternalTargetEnvironmentParser.g:2940:2: rule__ConfigConnectionProperty__Group_4__3__Impl
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
    // InternalTargetEnvironmentParser.g:2946:1: rule__ConfigConnectionProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConfigConnectionProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2950:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2951:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2951:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2952:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2962:1: rule__InterfaceNetworkProperty__Group__0 : rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 ;
    public final void rule__InterfaceNetworkProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2966:1: ( rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:2967:2: rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:2974:1: rule__InterfaceNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__InterfaceNetworkProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2978:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:2979:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:2979:1: ( () )
            // InternalTargetEnvironmentParser.g:2980:2: ()
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:2981:2: ()
            // InternalTargetEnvironmentParser.g:2981:3: 
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
    // InternalTargetEnvironmentParser.g:2989:1: rule__InterfaceNetworkProperty__Group__1 : rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 ;
    public final void rule__InterfaceNetworkProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2993:1: ( rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:2994:2: rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalTargetEnvironmentParser.g:3001:1: rule__InterfaceNetworkProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__InterfaceNetworkProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3005:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:3006:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:3006:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:3007:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:3016:1: rule__InterfaceNetworkProperty__Group__2 : rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 ;
    public final void rule__InterfaceNetworkProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3020:1: ( rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:3021:2: rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalTargetEnvironmentParser.g:3028:1: rule__InterfaceNetworkProperty__Group__2__Impl : ( Name ) ;
    public final void rule__InterfaceNetworkProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3032:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:3033:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:3033:1: ( Name )
            // InternalTargetEnvironmentParser.g:3034:2: Name
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
    // InternalTargetEnvironmentParser.g:3043:1: rule__InterfaceNetworkProperty__Group__3 : rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 ;
    public final void rule__InterfaceNetworkProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3047:1: ( rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:3048:2: rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:3055:1: rule__InterfaceNetworkProperty__Group__3__Impl : ( Interface ) ;
    public final void rule__InterfaceNetworkProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3059:1: ( ( Interface ) )
            // InternalTargetEnvironmentParser.g:3060:1: ( Interface )
            {
            // InternalTargetEnvironmentParser.g:3060:1: ( Interface )
            // InternalTargetEnvironmentParser.g:3061:2: Interface
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
    // InternalTargetEnvironmentParser.g:3070:1: rule__InterfaceNetworkProperty__Group__4 : rule__InterfaceNetworkProperty__Group__4__Impl ;
    public final void rule__InterfaceNetworkProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3074:1: ( rule__InterfaceNetworkProperty__Group__4__Impl )
            // InternalTargetEnvironmentParser.g:3075:2: rule__InterfaceNetworkProperty__Group__4__Impl
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
    // InternalTargetEnvironmentParser.g:3081:1: rule__InterfaceNetworkProperty__Group__4__Impl : ( ( rule__InterfaceNetworkProperty__Group_4__0 )? ) ;
    public final void rule__InterfaceNetworkProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3085:1: ( ( ( rule__InterfaceNetworkProperty__Group_4__0 )? ) )
            // InternalTargetEnvironmentParser.g:3086:1: ( ( rule__InterfaceNetworkProperty__Group_4__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3086:1: ( ( rule__InterfaceNetworkProperty__Group_4__0 )? )
            // InternalTargetEnvironmentParser.g:3087:2: ( rule__InterfaceNetworkProperty__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_4()); 
            // InternalTargetEnvironmentParser.g:3088:2: ( rule__InterfaceNetworkProperty__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INDENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3088:3: rule__InterfaceNetworkProperty__Group_4__0
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
    // InternalTargetEnvironmentParser.g:3097:1: rule__InterfaceNetworkProperty__Group_4__0 : rule__InterfaceNetworkProperty__Group_4__0__Impl rule__InterfaceNetworkProperty__Group_4__1 ;
    public final void rule__InterfaceNetworkProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3101:1: ( rule__InterfaceNetworkProperty__Group_4__0__Impl rule__InterfaceNetworkProperty__Group_4__1 )
            // InternalTargetEnvironmentParser.g:3102:2: rule__InterfaceNetworkProperty__Group_4__0__Impl rule__InterfaceNetworkProperty__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTargetEnvironmentParser.g:3109:1: rule__InterfaceNetworkProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3113:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3114:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3114:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3115:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3124:1: rule__InterfaceNetworkProperty__Group_4__1 : rule__InterfaceNetworkProperty__Group_4__1__Impl rule__InterfaceNetworkProperty__Group_4__2 ;
    public final void rule__InterfaceNetworkProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3128:1: ( rule__InterfaceNetworkProperty__Group_4__1__Impl rule__InterfaceNetworkProperty__Group_4__2 )
            // InternalTargetEnvironmentParser.g:3129:2: rule__InterfaceNetworkProperty__Group_4__1__Impl rule__InterfaceNetworkProperty__Group_4__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTargetEnvironmentParser.g:3136:1: rule__InterfaceNetworkProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__InterfaceNetworkProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3140:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:3141:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:3141:1: ( Value )
            // InternalTargetEnvironmentParser.g:3142:2: Value
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
    // InternalTargetEnvironmentParser.g:3151:1: rule__InterfaceNetworkProperty__Group_4__2 : rule__InterfaceNetworkProperty__Group_4__2__Impl rule__InterfaceNetworkProperty__Group_4__3 ;
    public final void rule__InterfaceNetworkProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3155:1: ( rule__InterfaceNetworkProperty__Group_4__2__Impl rule__InterfaceNetworkProperty__Group_4__3 )
            // InternalTargetEnvironmentParser.g:3156:2: rule__InterfaceNetworkProperty__Group_4__2__Impl rule__InterfaceNetworkProperty__Group_4__3
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
    // InternalTargetEnvironmentParser.g:3163:1: rule__InterfaceNetworkProperty__Group_4__2__Impl : ( ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__InterfaceNetworkProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3167:1: ( ( ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 ) ) )
            // InternalTargetEnvironmentParser.g:3168:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 ) )
            {
            // InternalTargetEnvironmentParser.g:3168:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 ) )
            // InternalTargetEnvironmentParser.g:3169:2: ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValueAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:3170:2: ( rule__InterfaceNetworkProperty__ValueAssignment_4_2 )
            // InternalTargetEnvironmentParser.g:3170:3: rule__InterfaceNetworkProperty__ValueAssignment_4_2
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
    // InternalTargetEnvironmentParser.g:3178:1: rule__InterfaceNetworkProperty__Group_4__3 : rule__InterfaceNetworkProperty__Group_4__3__Impl ;
    public final void rule__InterfaceNetworkProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3182:1: ( rule__InterfaceNetworkProperty__Group_4__3__Impl )
            // InternalTargetEnvironmentParser.g:3183:2: rule__InterfaceNetworkProperty__Group_4__3__Impl
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
    // InternalTargetEnvironmentParser.g:3189:1: rule__InterfaceNetworkProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3193:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3194:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3194:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3195:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3205:1: rule__AddressNetworkProperty__Group__0 : rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 ;
    public final void rule__AddressNetworkProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3209:1: ( rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:3210:2: rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:3217:1: rule__AddressNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__AddressNetworkProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3221:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3222:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3222:1: ( () )
            // InternalTargetEnvironmentParser.g:3223:2: ()
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:3224:2: ()
            // InternalTargetEnvironmentParser.g:3224:3: 
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
    // InternalTargetEnvironmentParser.g:3232:1: rule__AddressNetworkProperty__Group__1 : rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 ;
    public final void rule__AddressNetworkProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3236:1: ( rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:3237:2: rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalTargetEnvironmentParser.g:3244:1: rule__AddressNetworkProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__AddressNetworkProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3248:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:3249:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:3249:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:3250:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:3259:1: rule__AddressNetworkProperty__Group__2 : rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 ;
    public final void rule__AddressNetworkProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3263:1: ( rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:3264:2: rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalTargetEnvironmentParser.g:3271:1: rule__AddressNetworkProperty__Group__2__Impl : ( Name ) ;
    public final void rule__AddressNetworkProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3275:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:3276:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:3276:1: ( Name )
            // InternalTargetEnvironmentParser.g:3277:2: Name
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
    // InternalTargetEnvironmentParser.g:3286:1: rule__AddressNetworkProperty__Group__3 : rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 ;
    public final void rule__AddressNetworkProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3290:1: ( rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:3291:2: rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:3298:1: rule__AddressNetworkProperty__Group__3__Impl : ( Address ) ;
    public final void rule__AddressNetworkProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3302:1: ( ( Address ) )
            // InternalTargetEnvironmentParser.g:3303:1: ( Address )
            {
            // InternalTargetEnvironmentParser.g:3303:1: ( Address )
            // InternalTargetEnvironmentParser.g:3304:2: Address
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
    // InternalTargetEnvironmentParser.g:3313:1: rule__AddressNetworkProperty__Group__4 : rule__AddressNetworkProperty__Group__4__Impl ;
    public final void rule__AddressNetworkProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3317:1: ( rule__AddressNetworkProperty__Group__4__Impl )
            // InternalTargetEnvironmentParser.g:3318:2: rule__AddressNetworkProperty__Group__4__Impl
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
    // InternalTargetEnvironmentParser.g:3324:1: rule__AddressNetworkProperty__Group__4__Impl : ( ( rule__AddressNetworkProperty__Group_4__0 )? ) ;
    public final void rule__AddressNetworkProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3328:1: ( ( ( rule__AddressNetworkProperty__Group_4__0 )? ) )
            // InternalTargetEnvironmentParser.g:3329:1: ( ( rule__AddressNetworkProperty__Group_4__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3329:1: ( ( rule__AddressNetworkProperty__Group_4__0 )? )
            // InternalTargetEnvironmentParser.g:3330:2: ( rule__AddressNetworkProperty__Group_4__0 )?
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup_4()); 
            // InternalTargetEnvironmentParser.g:3331:2: ( rule__AddressNetworkProperty__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3331:3: rule__AddressNetworkProperty__Group_4__0
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
    // InternalTargetEnvironmentParser.g:3340:1: rule__AddressNetworkProperty__Group_4__0 : rule__AddressNetworkProperty__Group_4__0__Impl rule__AddressNetworkProperty__Group_4__1 ;
    public final void rule__AddressNetworkProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3344:1: ( rule__AddressNetworkProperty__Group_4__0__Impl rule__AddressNetworkProperty__Group_4__1 )
            // InternalTargetEnvironmentParser.g:3345:2: rule__AddressNetworkProperty__Group_4__0__Impl rule__AddressNetworkProperty__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTargetEnvironmentParser.g:3352:1: rule__AddressNetworkProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__AddressNetworkProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3356:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3357:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3357:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3358:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3367:1: rule__AddressNetworkProperty__Group_4__1 : rule__AddressNetworkProperty__Group_4__1__Impl rule__AddressNetworkProperty__Group_4__2 ;
    public final void rule__AddressNetworkProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3371:1: ( rule__AddressNetworkProperty__Group_4__1__Impl rule__AddressNetworkProperty__Group_4__2 )
            // InternalTargetEnvironmentParser.g:3372:2: rule__AddressNetworkProperty__Group_4__1__Impl rule__AddressNetworkProperty__Group_4__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTargetEnvironmentParser.g:3379:1: rule__AddressNetworkProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__AddressNetworkProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3383:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:3384:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:3384:1: ( Value )
            // InternalTargetEnvironmentParser.g:3385:2: Value
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
    // InternalTargetEnvironmentParser.g:3394:1: rule__AddressNetworkProperty__Group_4__2 : rule__AddressNetworkProperty__Group_4__2__Impl rule__AddressNetworkProperty__Group_4__3 ;
    public final void rule__AddressNetworkProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3398:1: ( rule__AddressNetworkProperty__Group_4__2__Impl rule__AddressNetworkProperty__Group_4__3 )
            // InternalTargetEnvironmentParser.g:3399:2: rule__AddressNetworkProperty__Group_4__2__Impl rule__AddressNetworkProperty__Group_4__3
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
    // InternalTargetEnvironmentParser.g:3406:1: rule__AddressNetworkProperty__Group_4__2__Impl : ( ( rule__AddressNetworkProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__AddressNetworkProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3410:1: ( ( ( rule__AddressNetworkProperty__ValueAssignment_4_2 ) ) )
            // InternalTargetEnvironmentParser.g:3411:1: ( ( rule__AddressNetworkProperty__ValueAssignment_4_2 ) )
            {
            // InternalTargetEnvironmentParser.g:3411:1: ( ( rule__AddressNetworkProperty__ValueAssignment_4_2 ) )
            // InternalTargetEnvironmentParser.g:3412:2: ( rule__AddressNetworkProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValueAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:3413:2: ( rule__AddressNetworkProperty__ValueAssignment_4_2 )
            // InternalTargetEnvironmentParser.g:3413:3: rule__AddressNetworkProperty__ValueAssignment_4_2
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
    // InternalTargetEnvironmentParser.g:3421:1: rule__AddressNetworkProperty__Group_4__3 : rule__AddressNetworkProperty__Group_4__3__Impl ;
    public final void rule__AddressNetworkProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3425:1: ( rule__AddressNetworkProperty__Group_4__3__Impl )
            // InternalTargetEnvironmentParser.g:3426:2: rule__AddressNetworkProperty__Group_4__3__Impl
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
    // InternalTargetEnvironmentParser.g:3432:1: rule__AddressNetworkProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__AddressNetworkProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3436:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3437:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3437:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3438:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3448:1: rule__DeviceType_Impl__Group__0 : rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 ;
    public final void rule__DeviceType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3452:1: ( rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 )
            // InternalTargetEnvironmentParser.g:3453:2: rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTargetEnvironmentParser.g:3460:1: rule__DeviceType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__DeviceType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3464:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3465:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3465:1: ( () )
            // InternalTargetEnvironmentParser.g:3466:2: ()
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:3467:2: ()
            // InternalTargetEnvironmentParser.g:3467:3: 
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
    // InternalTargetEnvironmentParser.g:3475:1: rule__DeviceType_Impl__Group__1 : rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 ;
    public final void rule__DeviceType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3479:1: ( rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 )
            // InternalTargetEnvironmentParser.g:3480:2: rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2
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
    // InternalTargetEnvironmentParser.g:3487:1: rule__DeviceType_Impl__Group__1__Impl : ( DeviceType ) ;
    public final void rule__DeviceType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3491:1: ( ( DeviceType ) )
            // InternalTargetEnvironmentParser.g:3492:1: ( DeviceType )
            {
            // InternalTargetEnvironmentParser.g:3492:1: ( DeviceType )
            // InternalTargetEnvironmentParser.g:3493:2: DeviceType
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
    // InternalTargetEnvironmentParser.g:3502:1: rule__DeviceType_Impl__Group__2 : rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 ;
    public final void rule__DeviceType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3506:1: ( rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 )
            // InternalTargetEnvironmentParser.g:3507:2: rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3
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
    // InternalTargetEnvironmentParser.g:3514:1: rule__DeviceType_Impl__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3518:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3519:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3519:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3520:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3529:1: rule__DeviceType_Impl__Group__3 : rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 ;
    public final void rule__DeviceType_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3533:1: ( rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 )
            // InternalTargetEnvironmentParser.g:3534:2: rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4
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
    // InternalTargetEnvironmentParser.g:3541:1: rule__DeviceType_Impl__Group__3__Impl : ( Name ) ;
    public final void rule__DeviceType_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3545:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:3546:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:3546:1: ( Name )
            // InternalTargetEnvironmentParser.g:3547:2: Name
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
    // InternalTargetEnvironmentParser.g:3556:1: rule__DeviceType_Impl__Group__4 : rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 ;
    public final void rule__DeviceType_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3560:1: ( rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 )
            // InternalTargetEnvironmentParser.g:3561:2: rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalTargetEnvironmentParser.g:3568:1: rule__DeviceType_Impl__Group__4__Impl : ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) ;
    public final void rule__DeviceType_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3572:1: ( ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) )
            // InternalTargetEnvironmentParser.g:3573:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            {
            // InternalTargetEnvironmentParser.g:3573:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            // InternalTargetEnvironmentParser.g:3574:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getNameAssignment_4()); 
            // InternalTargetEnvironmentParser.g:3575:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            // InternalTargetEnvironmentParser.g:3575:3: rule__DeviceType_Impl__NameAssignment_4
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
    // InternalTargetEnvironmentParser.g:3583:1: rule__DeviceType_Impl__Group__5 : rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 ;
    public final void rule__DeviceType_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3587:1: ( rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 )
            // InternalTargetEnvironmentParser.g:3588:2: rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalTargetEnvironmentParser.g:3595:1: rule__DeviceType_Impl__Group__5__Impl : ( ( rule__DeviceType_Impl__Group_5__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3599:1: ( ( ( rule__DeviceType_Impl__Group_5__0 )? ) )
            // InternalTargetEnvironmentParser.g:3600:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3600:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            // InternalTargetEnvironmentParser.g:3601:2: ( rule__DeviceType_Impl__Group_5__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_5()); 
            // InternalTargetEnvironmentParser.g:3602:2: ( rule__DeviceType_Impl__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Capability) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3602:3: rule__DeviceType_Impl__Group_5__0
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
    // InternalTargetEnvironmentParser.g:3610:1: rule__DeviceType_Impl__Group__6 : rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 ;
    public final void rule__DeviceType_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3614:1: ( rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 )
            // InternalTargetEnvironmentParser.g:3615:2: rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalTargetEnvironmentParser.g:3622:1: rule__DeviceType_Impl__Group__6__Impl : ( ( rule__DeviceType_Impl__Group_6__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3626:1: ( ( ( rule__DeviceType_Impl__Group_6__0 )? ) )
            // InternalTargetEnvironmentParser.g:3627:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3627:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            // InternalTargetEnvironmentParser.g:3628:2: ( rule__DeviceType_Impl__Group_6__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_6()); 
            // InternalTargetEnvironmentParser.g:3629:2: ( rule__DeviceType_Impl__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==CommunicationConnection) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3629:3: rule__DeviceType_Impl__Group_6__0
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
    // InternalTargetEnvironmentParser.g:3637:1: rule__DeviceType_Impl__Group__7 : rule__DeviceType_Impl__Group__7__Impl ;
    public final void rule__DeviceType_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3641:1: ( rule__DeviceType_Impl__Group__7__Impl )
            // InternalTargetEnvironmentParser.g:3642:2: rule__DeviceType_Impl__Group__7__Impl
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
    // InternalTargetEnvironmentParser.g:3648:1: rule__DeviceType_Impl__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3652:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3653:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3653:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3654:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3664:1: rule__DeviceType_Impl__Group_5__0 : rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 ;
    public final void rule__DeviceType_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3668:1: ( rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 )
            // InternalTargetEnvironmentParser.g:3669:2: rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1
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
    // InternalTargetEnvironmentParser.g:3676:1: rule__DeviceType_Impl__Group_5__0__Impl : ( Capability ) ;
    public final void rule__DeviceType_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3680:1: ( ( Capability ) )
            // InternalTargetEnvironmentParser.g:3681:1: ( Capability )
            {
            // InternalTargetEnvironmentParser.g:3681:1: ( Capability )
            // InternalTargetEnvironmentParser.g:3682:2: Capability
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
    // InternalTargetEnvironmentParser.g:3691:1: rule__DeviceType_Impl__Group_5__1 : rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 ;
    public final void rule__DeviceType_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3695:1: ( rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 )
            // InternalTargetEnvironmentParser.g:3696:2: rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2
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
    // InternalTargetEnvironmentParser.g:3703:1: rule__DeviceType_Impl__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3707:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3708:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3708:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3709:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3718:1: rule__DeviceType_Impl__Group_5__2 : rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 ;
    public final void rule__DeviceType_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3722:1: ( rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 )
            // InternalTargetEnvironmentParser.g:3723:2: rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3
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
    // InternalTargetEnvironmentParser.g:3730:1: rule__DeviceType_Impl__Group_5__2__Impl : ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3734:1: ( ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:3735:1: ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:3735:1: ( ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* ) )
            // InternalTargetEnvironmentParser.g:3736:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* )
            {
            // InternalTargetEnvironmentParser.g:3736:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 ) )
            // InternalTargetEnvironmentParser.g:3737:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:3738:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )
            // InternalTargetEnvironmentParser.g:3738:4: rule__DeviceType_Impl__CapabilityAssignment_5_2
            {
            pushFollow(FOLLOW_11);
            rule__DeviceType_Impl__CapabilityAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 

            }

            // InternalTargetEnvironmentParser.g:3741:2: ( ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )* )
            // InternalTargetEnvironmentParser.g:3742:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCapabilityAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:3743:3: ( rule__DeviceType_Impl__CapabilityAssignment_5_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==HyphenMinus) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:3743:4: rule__DeviceType_Impl__CapabilityAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeviceType_Impl__CapabilityAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalTargetEnvironmentParser.g:3752:1: rule__DeviceType_Impl__Group_5__3 : rule__DeviceType_Impl__Group_5__3__Impl ;
    public final void rule__DeviceType_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3756:1: ( rule__DeviceType_Impl__Group_5__3__Impl )
            // InternalTargetEnvironmentParser.g:3757:2: rule__DeviceType_Impl__Group_5__3__Impl
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
    // InternalTargetEnvironmentParser.g:3763:1: rule__DeviceType_Impl__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3767:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3768:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3768:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3769:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3779:1: rule__DeviceType_Impl__Group_6__0 : rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 ;
    public final void rule__DeviceType_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3783:1: ( rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 )
            // InternalTargetEnvironmentParser.g:3784:2: rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1
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
    // InternalTargetEnvironmentParser.g:3791:1: rule__DeviceType_Impl__Group_6__0__Impl : ( CommunicationConnection ) ;
    public final void rule__DeviceType_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3795:1: ( ( CommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:3796:1: ( CommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:3796:1: ( CommunicationConnection )
            // InternalTargetEnvironmentParser.g:3797:2: CommunicationConnection
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
    // InternalTargetEnvironmentParser.g:3806:1: rule__DeviceType_Impl__Group_6__1 : rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 ;
    public final void rule__DeviceType_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3810:1: ( rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 )
            // InternalTargetEnvironmentParser.g:3811:2: rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2
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
    // InternalTargetEnvironmentParser.g:3818:1: rule__DeviceType_Impl__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3822:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3823:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3823:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3824:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3833:1: rule__DeviceType_Impl__Group_6__2 : rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 ;
    public final void rule__DeviceType_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3837:1: ( rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 )
            // InternalTargetEnvironmentParser.g:3838:2: rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3
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
    // InternalTargetEnvironmentParser.g:3845:1: rule__DeviceType_Impl__Group_6__2__Impl : ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3849:1: ( ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:3850:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:3850:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            // InternalTargetEnvironmentParser.g:3851:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            {
            // InternalTargetEnvironmentParser.g:3851:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) )
            // InternalTargetEnvironmentParser.g:3852:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:3853:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            // InternalTargetEnvironmentParser.g:3853:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 

            }

            // InternalTargetEnvironmentParser.g:3856:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            // InternalTargetEnvironmentParser.g:3857:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:3858:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==HyphenMinus) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:3858:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalTargetEnvironmentParser.g:3867:1: rule__DeviceType_Impl__Group_6__3 : rule__DeviceType_Impl__Group_6__3__Impl ;
    public final void rule__DeviceType_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3871:1: ( rule__DeviceType_Impl__Group_6__3__Impl )
            // InternalTargetEnvironmentParser.g:3872:2: rule__DeviceType_Impl__Group_6__3__Impl
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
    // InternalTargetEnvironmentParser.g:3878:1: rule__DeviceType_Impl__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3882:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3883:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3883:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3884:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3894:1: rule__ComputationDeviceType__Group__0 : rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 ;
    public final void rule__ComputationDeviceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3898:1: ( rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 )
            // InternalTargetEnvironmentParser.g:3899:2: rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1
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
    // InternalTargetEnvironmentParser.g:3906:1: rule__ComputationDeviceType__Group__0__Impl : ( ComputationDeviceType ) ;
    public final void rule__ComputationDeviceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3910:1: ( ( ComputationDeviceType ) )
            // InternalTargetEnvironmentParser.g:3911:1: ( ComputationDeviceType )
            {
            // InternalTargetEnvironmentParser.g:3911:1: ( ComputationDeviceType )
            // InternalTargetEnvironmentParser.g:3912:2: ComputationDeviceType
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
    // InternalTargetEnvironmentParser.g:3921:1: rule__ComputationDeviceType__Group__1 : rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 ;
    public final void rule__ComputationDeviceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3925:1: ( rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 )
            // InternalTargetEnvironmentParser.g:3926:2: rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2
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
    // InternalTargetEnvironmentParser.g:3933:1: rule__ComputationDeviceType__Group__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3937:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3938:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3938:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3939:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3948:1: rule__ComputationDeviceType__Group__2 : rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 ;
    public final void rule__ComputationDeviceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3952:1: ( rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 )
            // InternalTargetEnvironmentParser.g:3953:2: rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3
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
    // InternalTargetEnvironmentParser.g:3960:1: rule__ComputationDeviceType__Group__2__Impl : ( Name ) ;
    public final void rule__ComputationDeviceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3964:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:3965:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:3965:1: ( Name )
            // InternalTargetEnvironmentParser.g:3966:2: Name
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
    // InternalTargetEnvironmentParser.g:3975:1: rule__ComputationDeviceType__Group__3 : rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 ;
    public final void rule__ComputationDeviceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3979:1: ( rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 )
            // InternalTargetEnvironmentParser.g:3980:2: rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalTargetEnvironmentParser.g:3987:1: rule__ComputationDeviceType__Group__3__Impl : ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) ;
    public final void rule__ComputationDeviceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3991:1: ( ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:3992:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:3992:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:3993:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:3994:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:3994:3: rule__ComputationDeviceType__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:4002:1: rule__ComputationDeviceType__Group__4 : rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 ;
    public final void rule__ComputationDeviceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4006:1: ( rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 )
            // InternalTargetEnvironmentParser.g:4007:2: rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalTargetEnvironmentParser.g:4014:1: rule__ComputationDeviceType__Group__4__Impl : ( ( rule__ComputationDeviceType__Group_4__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4018:1: ( ( ( rule__ComputationDeviceType__Group_4__0 )? ) )
            // InternalTargetEnvironmentParser.g:4019:1: ( ( rule__ComputationDeviceType__Group_4__0 )? )
            {
            // InternalTargetEnvironmentParser.g:4019:1: ( ( rule__ComputationDeviceType__Group_4__0 )? )
            // InternalTargetEnvironmentParser.g:4020:2: ( rule__ComputationDeviceType__Group_4__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_4()); 
            // InternalTargetEnvironmentParser.g:4021:2: ( rule__ComputationDeviceType__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Capability) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4021:3: rule__ComputationDeviceType__Group_4__0
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
    // InternalTargetEnvironmentParser.g:4029:1: rule__ComputationDeviceType__Group__5 : rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 ;
    public final void rule__ComputationDeviceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4033:1: ( rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 )
            // InternalTargetEnvironmentParser.g:4034:2: rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalTargetEnvironmentParser.g:4041:1: rule__ComputationDeviceType__Group__5__Impl : ( ( rule__ComputationDeviceType__Group_5__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4045:1: ( ( ( rule__ComputationDeviceType__Group_5__0 )? ) )
            // InternalTargetEnvironmentParser.g:4046:1: ( ( rule__ComputationDeviceType__Group_5__0 )? )
            {
            // InternalTargetEnvironmentParser.g:4046:1: ( ( rule__ComputationDeviceType__Group_5__0 )? )
            // InternalTargetEnvironmentParser.g:4047:2: ( rule__ComputationDeviceType__Group_5__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_5()); 
            // InternalTargetEnvironmentParser.g:4048:2: ( rule__ComputationDeviceType__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CommunicationConnection) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4048:3: rule__ComputationDeviceType__Group_5__0
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
    // InternalTargetEnvironmentParser.g:4056:1: rule__ComputationDeviceType__Group__6 : rule__ComputationDeviceType__Group__6__Impl ;
    public final void rule__ComputationDeviceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4060:1: ( rule__ComputationDeviceType__Group__6__Impl )
            // InternalTargetEnvironmentParser.g:4061:2: rule__ComputationDeviceType__Group__6__Impl
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
    // InternalTargetEnvironmentParser.g:4067:1: rule__ComputationDeviceType__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4071:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:4072:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:4072:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:4073:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4083:1: rule__ComputationDeviceType__Group_4__0 : rule__ComputationDeviceType__Group_4__0__Impl rule__ComputationDeviceType__Group_4__1 ;
    public final void rule__ComputationDeviceType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4087:1: ( rule__ComputationDeviceType__Group_4__0__Impl rule__ComputationDeviceType__Group_4__1 )
            // InternalTargetEnvironmentParser.g:4088:2: rule__ComputationDeviceType__Group_4__0__Impl rule__ComputationDeviceType__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:4095:1: rule__ComputationDeviceType__Group_4__0__Impl : ( Capability ) ;
    public final void rule__ComputationDeviceType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4099:1: ( ( Capability ) )
            // InternalTargetEnvironmentParser.g:4100:1: ( Capability )
            {
            // InternalTargetEnvironmentParser.g:4100:1: ( Capability )
            // InternalTargetEnvironmentParser.g:4101:2: Capability
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
    // InternalTargetEnvironmentParser.g:4110:1: rule__ComputationDeviceType__Group_4__1 : rule__ComputationDeviceType__Group_4__1__Impl rule__ComputationDeviceType__Group_4__2 ;
    public final void rule__ComputationDeviceType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4114:1: ( rule__ComputationDeviceType__Group_4__1__Impl rule__ComputationDeviceType__Group_4__2 )
            // InternalTargetEnvironmentParser.g:4115:2: rule__ComputationDeviceType__Group_4__1__Impl rule__ComputationDeviceType__Group_4__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:4122:1: rule__ComputationDeviceType__Group_4__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4126:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:4127:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:4127:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:4128:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:4137:1: rule__ComputationDeviceType__Group_4__2 : rule__ComputationDeviceType__Group_4__2__Impl rule__ComputationDeviceType__Group_4__3 ;
    public final void rule__ComputationDeviceType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4141:1: ( rule__ComputationDeviceType__Group_4__2__Impl rule__ComputationDeviceType__Group_4__3 )
            // InternalTargetEnvironmentParser.g:4142:2: rule__ComputationDeviceType__Group_4__2__Impl rule__ComputationDeviceType__Group_4__3
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
    // InternalTargetEnvironmentParser.g:4149:1: rule__ComputationDeviceType__Group_4__2__Impl : ( ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4153:1: ( ( ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:4154:1: ( ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:4154:1: ( ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* ) )
            // InternalTargetEnvironmentParser.g:4155:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* )
            {
            // InternalTargetEnvironmentParser.g:4155:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 ) )
            // InternalTargetEnvironmentParser.g:4156:3: ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:4157:3: ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )
            // InternalTargetEnvironmentParser.g:4157:4: rule__ComputationDeviceType__CapabilityAssignment_4_2
            {
            pushFollow(FOLLOW_11);
            rule__ComputationDeviceType__CapabilityAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_4_2()); 

            }

            // InternalTargetEnvironmentParser.g:4160:2: ( ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )* )
            // InternalTargetEnvironmentParser.g:4161:3: ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCapabilityAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:4162:3: ( rule__ComputationDeviceType__CapabilityAssignment_4_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==HyphenMinus) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:4162:4: rule__ComputationDeviceType__CapabilityAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComputationDeviceType__CapabilityAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalTargetEnvironmentParser.g:4171:1: rule__ComputationDeviceType__Group_4__3 : rule__ComputationDeviceType__Group_4__3__Impl ;
    public final void rule__ComputationDeviceType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4175:1: ( rule__ComputationDeviceType__Group_4__3__Impl )
            // InternalTargetEnvironmentParser.g:4176:2: rule__ComputationDeviceType__Group_4__3__Impl
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
    // InternalTargetEnvironmentParser.g:4182:1: rule__ComputationDeviceType__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4186:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:4187:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:4187:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:4188:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4198:1: rule__ComputationDeviceType__Group_5__0 : rule__ComputationDeviceType__Group_5__0__Impl rule__ComputationDeviceType__Group_5__1 ;
    public final void rule__ComputationDeviceType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4202:1: ( rule__ComputationDeviceType__Group_5__0__Impl rule__ComputationDeviceType__Group_5__1 )
            // InternalTargetEnvironmentParser.g:4203:2: rule__ComputationDeviceType__Group_5__0__Impl rule__ComputationDeviceType__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTargetEnvironmentParser.g:4210:1: rule__ComputationDeviceType__Group_5__0__Impl : ( CommunicationConnection ) ;
    public final void rule__ComputationDeviceType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4214:1: ( ( CommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:4215:1: ( CommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:4215:1: ( CommunicationConnection )
            // InternalTargetEnvironmentParser.g:4216:2: CommunicationConnection
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
    // InternalTargetEnvironmentParser.g:4225:1: rule__ComputationDeviceType__Group_5__1 : rule__ComputationDeviceType__Group_5__1__Impl rule__ComputationDeviceType__Group_5__2 ;
    public final void rule__ComputationDeviceType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4229:1: ( rule__ComputationDeviceType__Group_5__1__Impl rule__ComputationDeviceType__Group_5__2 )
            // InternalTargetEnvironmentParser.g:4230:2: rule__ComputationDeviceType__Group_5__1__Impl rule__ComputationDeviceType__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:4237:1: rule__ComputationDeviceType__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4241:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:4242:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:4242:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:4243:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:4252:1: rule__ComputationDeviceType__Group_5__2 : rule__ComputationDeviceType__Group_5__2__Impl rule__ComputationDeviceType__Group_5__3 ;
    public final void rule__ComputationDeviceType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4256:1: ( rule__ComputationDeviceType__Group_5__2__Impl rule__ComputationDeviceType__Group_5__3 )
            // InternalTargetEnvironmentParser.g:4257:2: rule__ComputationDeviceType__Group_5__2__Impl rule__ComputationDeviceType__Group_5__3
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
    // InternalTargetEnvironmentParser.g:4264:1: rule__ComputationDeviceType__Group_5__2__Impl : ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4268:1: ( ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:4269:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:4269:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) )
            // InternalTargetEnvironmentParser.g:4270:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* )
            {
            // InternalTargetEnvironmentParser.g:4270:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) )
            // InternalTargetEnvironmentParser.g:4271:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:4272:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )
            // InternalTargetEnvironmentParser.g:4272:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2
            {
            pushFollow(FOLLOW_11);
            rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2()); 

            }

            // InternalTargetEnvironmentParser.g:4275:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* )
            // InternalTargetEnvironmentParser.g:4276:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:4277:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==HyphenMinus) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:4277:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalTargetEnvironmentParser.g:4286:1: rule__ComputationDeviceType__Group_5__3 : rule__ComputationDeviceType__Group_5__3__Impl ;
    public final void rule__ComputationDeviceType__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4290:1: ( rule__ComputationDeviceType__Group_5__3__Impl )
            // InternalTargetEnvironmentParser.g:4291:2: rule__ComputationDeviceType__Group_5__3__Impl
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
    // InternalTargetEnvironmentParser.g:4297:1: rule__ComputationDeviceType__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4301:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:4302:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:4302:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:4303:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4313:1: rule__CapabilityProperty__Group__0 : rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 ;
    public final void rule__CapabilityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4317:1: ( rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:4318:2: rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1
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
    // InternalTargetEnvironmentParser.g:4325:1: rule__CapabilityProperty__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__CapabilityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4329:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:4330:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:4330:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:4331:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:4340:1: rule__CapabilityProperty__Group__1 : rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 ;
    public final void rule__CapabilityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4344:1: ( rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:4345:2: rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2
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
    // InternalTargetEnvironmentParser.g:4352:1: rule__CapabilityProperty__Group__1__Impl : ( Name ) ;
    public final void rule__CapabilityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4356:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:4357:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:4357:1: ( Name )
            // InternalTargetEnvironmentParser.g:4358:2: Name
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
    // InternalTargetEnvironmentParser.g:4367:1: rule__CapabilityProperty__Group__2 : rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 ;
    public final void rule__CapabilityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4371:1: ( rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:4372:2: rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3
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
    // InternalTargetEnvironmentParser.g:4379:1: rule__CapabilityProperty__Group__2__Impl : ( ( rule__CapabilityProperty__NameAssignment_2 ) ) ;
    public final void rule__CapabilityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4383:1: ( ( ( rule__CapabilityProperty__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:4384:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:4384:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:4385:2: ( rule__CapabilityProperty__NameAssignment_2 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:4386:2: ( rule__CapabilityProperty__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:4386:3: rule__CapabilityProperty__NameAssignment_2
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
    // InternalTargetEnvironmentParser.g:4394:1: rule__CapabilityProperty__Group__3 : rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 ;
    public final void rule__CapabilityProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4398:1: ( rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:4399:2: rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalTargetEnvironmentParser.g:4406:1: rule__CapabilityProperty__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__CapabilityProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4410:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:4411:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:4411:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:4412:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:4421:1: rule__CapabilityProperty__Group__4 : rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 ;
    public final void rule__CapabilityProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4425:1: ( rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 )
            // InternalTargetEnvironmentParser.g:4426:2: rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalTargetEnvironmentParser.g:4433:1: rule__CapabilityProperty__Group__4__Impl : ( Kind ) ;
    public final void rule__CapabilityProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4437:1: ( ( Kind ) )
            // InternalTargetEnvironmentParser.g:4438:1: ( Kind )
            {
            // InternalTargetEnvironmentParser.g:4438:1: ( Kind )
            // InternalTargetEnvironmentParser.g:4439:2: Kind
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
    // InternalTargetEnvironmentParser.g:4448:1: rule__CapabilityProperty__Group__5 : rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 ;
    public final void rule__CapabilityProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4452:1: ( rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 )
            // InternalTargetEnvironmentParser.g:4453:2: rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalTargetEnvironmentParser.g:4460:1: rule__CapabilityProperty__Group__5__Impl : ( ( rule__CapabilityProperty__KindAssignment_5 ) ) ;
    public final void rule__CapabilityProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4464:1: ( ( ( rule__CapabilityProperty__KindAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:4465:1: ( ( rule__CapabilityProperty__KindAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:4465:1: ( ( rule__CapabilityProperty__KindAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:4466:2: ( rule__CapabilityProperty__KindAssignment_5 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindAssignment_5()); 
            // InternalTargetEnvironmentParser.g:4467:2: ( rule__CapabilityProperty__KindAssignment_5 )
            // InternalTargetEnvironmentParser.g:4467:3: rule__CapabilityProperty__KindAssignment_5
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
    // InternalTargetEnvironmentParser.g:4475:1: rule__CapabilityProperty__Group__6 : rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 ;
    public final void rule__CapabilityProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4479:1: ( rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 )
            // InternalTargetEnvironmentParser.g:4480:2: rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetEnvironmentParser.g:4487:1: rule__CapabilityProperty__Group__6__Impl : ( Type ) ;
    public final void rule__CapabilityProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4491:1: ( ( Type ) )
            // InternalTargetEnvironmentParser.g:4492:1: ( Type )
            {
            // InternalTargetEnvironmentParser.g:4492:1: ( Type )
            // InternalTargetEnvironmentParser.g:4493:2: Type
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
    // InternalTargetEnvironmentParser.g:4502:1: rule__CapabilityProperty__Group__7 : rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 ;
    public final void rule__CapabilityProperty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4506:1: ( rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 )
            // InternalTargetEnvironmentParser.g:4507:2: rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8
            {
            pushFollow(FOLLOW_28);
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
    // InternalTargetEnvironmentParser.g:4514:1: rule__CapabilityProperty__Group__7__Impl : ( ( rule__CapabilityProperty__TypeAssignment_7 ) ) ;
    public final void rule__CapabilityProperty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4518:1: ( ( ( rule__CapabilityProperty__TypeAssignment_7 ) ) )
            // InternalTargetEnvironmentParser.g:4519:1: ( ( rule__CapabilityProperty__TypeAssignment_7 ) )
            {
            // InternalTargetEnvironmentParser.g:4519:1: ( ( rule__CapabilityProperty__TypeAssignment_7 ) )
            // InternalTargetEnvironmentParser.g:4520:2: ( rule__CapabilityProperty__TypeAssignment_7 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeAssignment_7()); 
            // InternalTargetEnvironmentParser.g:4521:2: ( rule__CapabilityProperty__TypeAssignment_7 )
            // InternalTargetEnvironmentParser.g:4521:3: rule__CapabilityProperty__TypeAssignment_7
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
    // InternalTargetEnvironmentParser.g:4529:1: rule__CapabilityProperty__Group__8 : rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 ;
    public final void rule__CapabilityProperty__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4533:1: ( rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 )
            // InternalTargetEnvironmentParser.g:4534:2: rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9
            {
            pushFollow(FOLLOW_28);
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
    // InternalTargetEnvironmentParser.g:4541:1: rule__CapabilityProperty__Group__8__Impl : ( ( rule__CapabilityProperty__Group_8__0 )? ) ;
    public final void rule__CapabilityProperty__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4545:1: ( ( ( rule__CapabilityProperty__Group_8__0 )? ) )
            // InternalTargetEnvironmentParser.g:4546:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            {
            // InternalTargetEnvironmentParser.g:4546:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            // InternalTargetEnvironmentParser.g:4547:2: ( rule__CapabilityProperty__Group_8__0 )?
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup_8()); 
            // InternalTargetEnvironmentParser.g:4548:2: ( rule__CapabilityProperty__Group_8__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Value) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4548:3: rule__CapabilityProperty__Group_8__0
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
    // InternalTargetEnvironmentParser.g:4556:1: rule__CapabilityProperty__Group__9 : rule__CapabilityProperty__Group__9__Impl ;
    public final void rule__CapabilityProperty__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4560:1: ( rule__CapabilityProperty__Group__9__Impl )
            // InternalTargetEnvironmentParser.g:4561:2: rule__CapabilityProperty__Group__9__Impl
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
    // InternalTargetEnvironmentParser.g:4567:1: rule__CapabilityProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__CapabilityProperty__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4571:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:4572:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:4572:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:4573:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:4583:1: rule__CapabilityProperty__Group_8__0 : rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 ;
    public final void rule__CapabilityProperty__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4587:1: ( rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 )
            // InternalTargetEnvironmentParser.g:4588:2: rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1
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
    // InternalTargetEnvironmentParser.g:4595:1: rule__CapabilityProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__CapabilityProperty__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4599:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:4600:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:4600:1: ( Value )
            // InternalTargetEnvironmentParser.g:4601:2: Value
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
    // InternalTargetEnvironmentParser.g:4610:1: rule__CapabilityProperty__Group_8__1 : rule__CapabilityProperty__Group_8__1__Impl ;
    public final void rule__CapabilityProperty__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4614:1: ( rule__CapabilityProperty__Group_8__1__Impl )
            // InternalTargetEnvironmentParser.g:4615:2: rule__CapabilityProperty__Group_8__1__Impl
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
    // InternalTargetEnvironmentParser.g:4621:1: rule__CapabilityProperty__Group_8__1__Impl : ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__CapabilityProperty__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4625:1: ( ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) )
            // InternalTargetEnvironmentParser.g:4626:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            {
            // InternalTargetEnvironmentParser.g:4626:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            // InternalTargetEnvironmentParser.g:4627:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getValueAssignment_8_1()); 
            // InternalTargetEnvironmentParser.g:4628:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            // InternalTargetEnvironmentParser.g:4628:3: rule__CapabilityProperty__ValueAssignment_8_1
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
    // InternalTargetEnvironmentParser.g:4637:1: rule__AttributeKind__Group__0 : rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 ;
    public final void rule__AttributeKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4641:1: ( rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 )
            // InternalTargetEnvironmentParser.g:4642:2: rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTargetEnvironmentParser.g:4649:1: rule__AttributeKind__Group__0__Impl : ( () ) ;
    public final void rule__AttributeKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4653:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4654:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4654:1: ( () )
            // InternalTargetEnvironmentParser.g:4655:2: ()
            {
             before(grammarAccess.getAttributeKindAccess().getAttributeKindAction_0()); 
            // InternalTargetEnvironmentParser.g:4656:2: ()
            // InternalTargetEnvironmentParser.g:4656:3: 
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
    // InternalTargetEnvironmentParser.g:4664:1: rule__AttributeKind__Group__1 : rule__AttributeKind__Group__1__Impl ;
    public final void rule__AttributeKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4668:1: ( rule__AttributeKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:4669:2: rule__AttributeKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:4675:1: rule__AttributeKind__Group__1__Impl : ( AttributeKind ) ;
    public final void rule__AttributeKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4679:1: ( ( AttributeKind ) )
            // InternalTargetEnvironmentParser.g:4680:1: ( AttributeKind )
            {
            // InternalTargetEnvironmentParser.g:4680:1: ( AttributeKind )
            // InternalTargetEnvironmentParser.g:4681:2: AttributeKind
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
    // InternalTargetEnvironmentParser.g:4691:1: rule__MaximumKind__Group__0 : rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 ;
    public final void rule__MaximumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4695:1: ( rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 )
            // InternalTargetEnvironmentParser.g:4696:2: rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalTargetEnvironmentParser.g:4703:1: rule__MaximumKind__Group__0__Impl : ( () ) ;
    public final void rule__MaximumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4707:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4708:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4708:1: ( () )
            // InternalTargetEnvironmentParser.g:4709:2: ()
            {
             before(grammarAccess.getMaximumKindAccess().getMaximumKindAction_0()); 
            // InternalTargetEnvironmentParser.g:4710:2: ()
            // InternalTargetEnvironmentParser.g:4710:3: 
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
    // InternalTargetEnvironmentParser.g:4718:1: rule__MaximumKind__Group__1 : rule__MaximumKind__Group__1__Impl ;
    public final void rule__MaximumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4722:1: ( rule__MaximumKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:4723:2: rule__MaximumKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:4729:1: rule__MaximumKind__Group__1__Impl : ( MaximumKind ) ;
    public final void rule__MaximumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4733:1: ( ( MaximumKind ) )
            // InternalTargetEnvironmentParser.g:4734:1: ( MaximumKind )
            {
            // InternalTargetEnvironmentParser.g:4734:1: ( MaximumKind )
            // InternalTargetEnvironmentParser.g:4735:2: MaximumKind
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
    // InternalTargetEnvironmentParser.g:4745:1: rule__MinimumKind__Group__0 : rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 ;
    public final void rule__MinimumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4749:1: ( rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 )
            // InternalTargetEnvironmentParser.g:4750:2: rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTargetEnvironmentParser.g:4757:1: rule__MinimumKind__Group__0__Impl : ( () ) ;
    public final void rule__MinimumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4761:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4762:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4762:1: ( () )
            // InternalTargetEnvironmentParser.g:4763:2: ()
            {
             before(grammarAccess.getMinimumKindAccess().getMinimumKindAction_0()); 
            // InternalTargetEnvironmentParser.g:4764:2: ()
            // InternalTargetEnvironmentParser.g:4764:3: 
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
    // InternalTargetEnvironmentParser.g:4772:1: rule__MinimumKind__Group__1 : rule__MinimumKind__Group__1__Impl ;
    public final void rule__MinimumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4776:1: ( rule__MinimumKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:4777:2: rule__MinimumKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:4783:1: rule__MinimumKind__Group__1__Impl : ( MinimumKind ) ;
    public final void rule__MinimumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4787:1: ( ( MinimumKind ) )
            // InternalTargetEnvironmentParser.g:4788:1: ( MinimumKind )
            {
            // InternalTargetEnvironmentParser.g:4788:1: ( MinimumKind )
            // InternalTargetEnvironmentParser.g:4789:2: MinimumKind
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
    // InternalTargetEnvironmentParser.g:4799:1: rule__SelectionKind__Group__0 : rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 ;
    public final void rule__SelectionKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4803:1: ( rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 )
            // InternalTargetEnvironmentParser.g:4804:2: rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTargetEnvironmentParser.g:4811:1: rule__SelectionKind__Group__0__Impl : ( () ) ;
    public final void rule__SelectionKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4815:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4816:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4816:1: ( () )
            // InternalTargetEnvironmentParser.g:4817:2: ()
            {
             before(grammarAccess.getSelectionKindAccess().getSelectionKindAction_0()); 
            // InternalTargetEnvironmentParser.g:4818:2: ()
            // InternalTargetEnvironmentParser.g:4818:3: 
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
    // InternalTargetEnvironmentParser.g:4826:1: rule__SelectionKind__Group__1 : rule__SelectionKind__Group__1__Impl ;
    public final void rule__SelectionKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4830:1: ( rule__SelectionKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:4831:2: rule__SelectionKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:4837:1: rule__SelectionKind__Group__1__Impl : ( SelectionKind ) ;
    public final void rule__SelectionKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4841:1: ( ( SelectionKind ) )
            // InternalTargetEnvironmentParser.g:4842:1: ( SelectionKind )
            {
            // InternalTargetEnvironmentParser.g:4842:1: ( SelectionKind )
            // InternalTargetEnvironmentParser.g:4843:2: SelectionKind
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
    // InternalTargetEnvironmentParser.g:4853:1: rule__ConnectionProperty__Group__0 : rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 ;
    public final void rule__ConnectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4857:1: ( rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:4858:2: rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1
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
    // InternalTargetEnvironmentParser.g:4865:1: rule__ConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4869:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4870:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4870:1: ( () )
            // InternalTargetEnvironmentParser.g:4871:2: ()
            {
             before(grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:4872:2: ()
            // InternalTargetEnvironmentParser.g:4872:3: 
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
    // InternalTargetEnvironmentParser.g:4880:1: rule__ConnectionProperty__Group__1 : rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 ;
    public final void rule__ConnectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4884:1: ( rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:4885:2: rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2
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
    // InternalTargetEnvironmentParser.g:4892:1: rule__ConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4896:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:4897:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:4897:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:4898:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:4907:1: rule__ConnectionProperty__Group__2 : rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 ;
    public final void rule__ConnectionProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4911:1: ( rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:4912:2: rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3
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
    // InternalTargetEnvironmentParser.g:4919:1: rule__ConnectionProperty__Group__2__Impl : ( Name ) ;
    public final void rule__ConnectionProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4923:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:4924:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:4924:1: ( Name )
            // InternalTargetEnvironmentParser.g:4925:2: Name
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
    // InternalTargetEnvironmentParser.g:4934:1: rule__ConnectionProperty__Group__3 : rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 ;
    public final void rule__ConnectionProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4938:1: ( rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:4939:2: rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4
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
    // InternalTargetEnvironmentParser.g:4946:1: rule__ConnectionProperty__Group__3__Impl : ( ( rule__ConnectionProperty__NameAssignment_3 ) ) ;
    public final void rule__ConnectionProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4950:1: ( ( ( rule__ConnectionProperty__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:4951:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:4951:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:4952:2: ( rule__ConnectionProperty__NameAssignment_3 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:4953:2: ( rule__ConnectionProperty__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:4953:3: rule__ConnectionProperty__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:4961:1: rule__ConnectionProperty__Group__4 : rule__ConnectionProperty__Group__4__Impl ;
    public final void rule__ConnectionProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4965:1: ( rule__ConnectionProperty__Group__4__Impl )
            // InternalTargetEnvironmentParser.g:4966:2: rule__ConnectionProperty__Group__4__Impl
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
    // InternalTargetEnvironmentParser.g:4972:1: rule__ConnectionProperty__Group__4__Impl : ( ( rule__ConnectionProperty__Group_4__0 )? ) ;
    public final void rule__ConnectionProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4976:1: ( ( ( rule__ConnectionProperty__Group_4__0 )? ) )
            // InternalTargetEnvironmentParser.g:4977:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            {
            // InternalTargetEnvironmentParser.g:4977:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            // InternalTargetEnvironmentParser.g:4978:2: ( rule__ConnectionProperty__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup_4()); 
            // InternalTargetEnvironmentParser.g:4979:2: ( rule__ConnectionProperty__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INDENT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:4979:3: rule__ConnectionProperty__Group_4__0
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
    // InternalTargetEnvironmentParser.g:4988:1: rule__ConnectionProperty__Group_4__0 : rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 ;
    public final void rule__ConnectionProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4992:1: ( rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 )
            // InternalTargetEnvironmentParser.g:4993:2: rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1
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
    // InternalTargetEnvironmentParser.g:5000:1: rule__ConnectionProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectionProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5004:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:5005:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:5005:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:5006:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:5015:1: rule__ConnectionProperty__Group_4__1 : rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 ;
    public final void rule__ConnectionProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5019:1: ( rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 )
            // InternalTargetEnvironmentParser.g:5020:2: rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2
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
    // InternalTargetEnvironmentParser.g:5027:1: rule__ConnectionProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__ConnectionProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5031:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:5032:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:5032:1: ( Value )
            // InternalTargetEnvironmentParser.g:5033:2: Value
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
    // InternalTargetEnvironmentParser.g:5042:1: rule__ConnectionProperty__Group_4__2 : rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 ;
    public final void rule__ConnectionProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5046:1: ( rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 )
            // InternalTargetEnvironmentParser.g:5047:2: rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3
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
    // InternalTargetEnvironmentParser.g:5054:1: rule__ConnectionProperty__Group_4__2__Impl : ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__ConnectionProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5058:1: ( ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) )
            // InternalTargetEnvironmentParser.g:5059:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            {
            // InternalTargetEnvironmentParser.g:5059:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            // InternalTargetEnvironmentParser.g:5060:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getValueAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:5061:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            // InternalTargetEnvironmentParser.g:5061:3: rule__ConnectionProperty__ValueAssignment_4_2
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
    // InternalTargetEnvironmentParser.g:5069:1: rule__ConnectionProperty__Group_4__3 : rule__ConnectionProperty__Group_4__3__Impl ;
    public final void rule__ConnectionProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5073:1: ( rule__ConnectionProperty__Group_4__3__Impl )
            // InternalTargetEnvironmentParser.g:5074:2: rule__ConnectionProperty__Group_4__3__Impl
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
    // InternalTargetEnvironmentParser.g:5080:1: rule__ConnectionProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectionProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5084:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:5085:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:5085:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:5086:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:5096:1: rule__NetworkConnection__Group__0 : rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 ;
    public final void rule__NetworkConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5100:1: ( rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 )
            // InternalTargetEnvironmentParser.g:5101:2: rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1
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
    // InternalTargetEnvironmentParser.g:5108:1: rule__NetworkConnection__Group__0__Impl : ( () ) ;
    public final void rule__NetworkConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5112:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5113:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5113:1: ( () )
            // InternalTargetEnvironmentParser.g:5114:2: ()
            {
             before(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionAction_0()); 
            // InternalTargetEnvironmentParser.g:5115:2: ()
            // InternalTargetEnvironmentParser.g:5115:3: 
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
    // InternalTargetEnvironmentParser.g:5123:1: rule__NetworkConnection__Group__1 : rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 ;
    public final void rule__NetworkConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5127:1: ( rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 )
            // InternalTargetEnvironmentParser.g:5128:2: rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2
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
    // InternalTargetEnvironmentParser.g:5135:1: rule__NetworkConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__NetworkConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5139:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:5140:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:5140:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:5141:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:5150:1: rule__NetworkConnection__Group__2 : rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 ;
    public final void rule__NetworkConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5154:1: ( rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 )
            // InternalTargetEnvironmentParser.g:5155:2: rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3
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
    // InternalTargetEnvironmentParser.g:5162:1: rule__NetworkConnection__Group__2__Impl : ( Name ) ;
    public final void rule__NetworkConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5166:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:5167:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:5167:1: ( Name )
            // InternalTargetEnvironmentParser.g:5168:2: Name
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
    // InternalTargetEnvironmentParser.g:5177:1: rule__NetworkConnection__Group__3 : rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 ;
    public final void rule__NetworkConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5181:1: ( rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 )
            // InternalTargetEnvironmentParser.g:5182:2: rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4
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
    // InternalTargetEnvironmentParser.g:5189:1: rule__NetworkConnection__Group__3__Impl : ( ( rule__NetworkConnection__NameAssignment_3 ) ) ;
    public final void rule__NetworkConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5193:1: ( ( ( rule__NetworkConnection__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:5194:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:5194:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:5195:2: ( rule__NetworkConnection__NameAssignment_3 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:5196:2: ( rule__NetworkConnection__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:5196:3: rule__NetworkConnection__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:5204:1: rule__NetworkConnection__Group__4 : rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 ;
    public final void rule__NetworkConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5208:1: ( rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 )
            // InternalTargetEnvironmentParser.g:5209:2: rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalTargetEnvironmentParser.g:5216:1: rule__NetworkConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5220:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:5221:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:5221:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:5222:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:5231:1: rule__NetworkConnection__Group__5 : rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 ;
    public final void rule__NetworkConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5235:1: ( rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 )
            // InternalTargetEnvironmentParser.g:5236:2: rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalTargetEnvironmentParser.g:5243:1: rule__NetworkConnection__Group__5__Impl : ( Type ) ;
    public final void rule__NetworkConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5247:1: ( ( Type ) )
            // InternalTargetEnvironmentParser.g:5248:1: ( Type )
            {
            // InternalTargetEnvironmentParser.g:5248:1: ( Type )
            // InternalTargetEnvironmentParser.g:5249:2: Type
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
    // InternalTargetEnvironmentParser.g:5258:1: rule__NetworkConnection__Group__6 : rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 ;
    public final void rule__NetworkConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5262:1: ( rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 )
            // InternalTargetEnvironmentParser.g:5263:2: rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7
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
    // InternalTargetEnvironmentParser.g:5270:1: rule__NetworkConnection__Group__6__Impl : ( ( rule__NetworkConnection__TypeAssignment_6 ) ) ;
    public final void rule__NetworkConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5274:1: ( ( ( rule__NetworkConnection__TypeAssignment_6 ) ) )
            // InternalTargetEnvironmentParser.g:5275:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            {
            // InternalTargetEnvironmentParser.g:5275:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            // InternalTargetEnvironmentParser.g:5276:2: ( rule__NetworkConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeAssignment_6()); 
            // InternalTargetEnvironmentParser.g:5277:2: ( rule__NetworkConnection__TypeAssignment_6 )
            // InternalTargetEnvironmentParser.g:5277:3: rule__NetworkConnection__TypeAssignment_6
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
    // InternalTargetEnvironmentParser.g:5285:1: rule__NetworkConnection__Group__7 : rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 ;
    public final void rule__NetworkConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5289:1: ( rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 )
            // InternalTargetEnvironmentParser.g:5290:2: rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8
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
    // InternalTargetEnvironmentParser.g:5297:1: rule__NetworkConnection__Group__7__Impl : ( ( rule__NetworkConnection__Group_7__0 )? ) ;
    public final void rule__NetworkConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5301:1: ( ( ( rule__NetworkConnection__Group_7__0 )? ) )
            // InternalTargetEnvironmentParser.g:5302:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            {
            // InternalTargetEnvironmentParser.g:5302:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            // InternalTargetEnvironmentParser.g:5303:2: ( rule__NetworkConnection__Group_7__0 )?
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup_7()); 
            // InternalTargetEnvironmentParser.g:5304:2: ( rule__NetworkConnection__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Properties) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5304:3: rule__NetworkConnection__Group_7__0
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
    // InternalTargetEnvironmentParser.g:5312:1: rule__NetworkConnection__Group__8 : rule__NetworkConnection__Group__8__Impl ;
    public final void rule__NetworkConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5316:1: ( rule__NetworkConnection__Group__8__Impl )
            // InternalTargetEnvironmentParser.g:5317:2: rule__NetworkConnection__Group__8__Impl
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
    // InternalTargetEnvironmentParser.g:5323:1: rule__NetworkConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__NetworkConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5327:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:5328:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:5328:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:5329:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:5339:1: rule__NetworkConnection__Group_7__0 : rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 ;
    public final void rule__NetworkConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5343:1: ( rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 )
            // InternalTargetEnvironmentParser.g:5344:2: rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1
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
    // InternalTargetEnvironmentParser.g:5351:1: rule__NetworkConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__NetworkConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5355:1: ( ( Properties ) )
            // InternalTargetEnvironmentParser.g:5356:1: ( Properties )
            {
            // InternalTargetEnvironmentParser.g:5356:1: ( Properties )
            // InternalTargetEnvironmentParser.g:5357:2: Properties
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
    // InternalTargetEnvironmentParser.g:5366:1: rule__NetworkConnection__Group_7__1 : rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 ;
    public final void rule__NetworkConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5370:1: ( rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 )
            // InternalTargetEnvironmentParser.g:5371:2: rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetEnvironmentParser.g:5378:1: rule__NetworkConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5382:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:5383:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:5383:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:5384:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:5393:1: rule__NetworkConnection__Group_7__2 : rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 ;
    public final void rule__NetworkConnection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5397:1: ( rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 )
            // InternalTargetEnvironmentParser.g:5398:2: rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3
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
    // InternalTargetEnvironmentParser.g:5405:1: rule__NetworkConnection__Group_7__2__Impl : ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__NetworkConnection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5409:1: ( ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:5410:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:5410:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            // InternalTargetEnvironmentParser.g:5411:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalTargetEnvironmentParser.g:5411:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) )
            // InternalTargetEnvironmentParser.g:5412:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:5413:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            // InternalTargetEnvironmentParser.g:5413:4: rule__NetworkConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_11);
            rule__NetworkConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 

            }

            // InternalTargetEnvironmentParser.g:5416:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            // InternalTargetEnvironmentParser.g:5417:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:5418:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==HyphenMinus) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:5418:4: rule__NetworkConnection__PropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__NetworkConnection__PropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalTargetEnvironmentParser.g:5427:1: rule__NetworkConnection__Group_7__3 : rule__NetworkConnection__Group_7__3__Impl ;
    public final void rule__NetworkConnection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5431:1: ( rule__NetworkConnection__Group_7__3__Impl )
            // InternalTargetEnvironmentParser.g:5432:2: rule__NetworkConnection__Group_7__3__Impl
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
    // InternalTargetEnvironmentParser.g:5438:1: rule__NetworkConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__NetworkConnection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5442:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:5443:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:5443:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:5444:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:5454:1: rule__CommunicationConnection__Group__0 : rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 ;
    public final void rule__CommunicationConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5458:1: ( rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 )
            // InternalTargetEnvironmentParser.g:5459:2: rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1
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
    // InternalTargetEnvironmentParser.g:5466:1: rule__CommunicationConnection__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5470:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5471:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5471:1: ( () )
            // InternalTargetEnvironmentParser.g:5472:2: ()
            {
             before(grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0()); 
            // InternalTargetEnvironmentParser.g:5473:2: ()
            // InternalTargetEnvironmentParser.g:5473:3: 
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
    // InternalTargetEnvironmentParser.g:5481:1: rule__CommunicationConnection__Group__1 : rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 ;
    public final void rule__CommunicationConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5485:1: ( rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 )
            // InternalTargetEnvironmentParser.g:5486:2: rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2
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
    // InternalTargetEnvironmentParser.g:5493:1: rule__CommunicationConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__CommunicationConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5497:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:5498:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:5498:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:5499:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:5508:1: rule__CommunicationConnection__Group__2 : rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 ;
    public final void rule__CommunicationConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5512:1: ( rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 )
            // InternalTargetEnvironmentParser.g:5513:2: rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3
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
    // InternalTargetEnvironmentParser.g:5520:1: rule__CommunicationConnection__Group__2__Impl : ( Name ) ;
    public final void rule__CommunicationConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5524:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:5525:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:5525:1: ( Name )
            // InternalTargetEnvironmentParser.g:5526:2: Name
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
    // InternalTargetEnvironmentParser.g:5535:1: rule__CommunicationConnection__Group__3 : rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 ;
    public final void rule__CommunicationConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5539:1: ( rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 )
            // InternalTargetEnvironmentParser.g:5540:2: rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4
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
    // InternalTargetEnvironmentParser.g:5547:1: rule__CommunicationConnection__Group__3__Impl : ( ( rule__CommunicationConnection__NameAssignment_3 ) ) ;
    public final void rule__CommunicationConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5551:1: ( ( ( rule__CommunicationConnection__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:5552:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:5552:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:5553:2: ( rule__CommunicationConnection__NameAssignment_3 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:5554:2: ( rule__CommunicationConnection__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:5554:3: rule__CommunicationConnection__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:5562:1: rule__CommunicationConnection__Group__4 : rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 ;
    public final void rule__CommunicationConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5566:1: ( rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 )
            // InternalTargetEnvironmentParser.g:5567:2: rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalTargetEnvironmentParser.g:5574:1: rule__CommunicationConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5578:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:5579:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:5579:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:5580:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:5589:1: rule__CommunicationConnection__Group__5 : rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 ;
    public final void rule__CommunicationConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5593:1: ( rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 )
            // InternalTargetEnvironmentParser.g:5594:2: rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6
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
    // InternalTargetEnvironmentParser.g:5601:1: rule__CommunicationConnection__Group__5__Impl : ( Type ) ;
    public final void rule__CommunicationConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5605:1: ( ( Type ) )
            // InternalTargetEnvironmentParser.g:5606:1: ( Type )
            {
            // InternalTargetEnvironmentParser.g:5606:1: ( Type )
            // InternalTargetEnvironmentParser.g:5607:2: Type
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
    // InternalTargetEnvironmentParser.g:5616:1: rule__CommunicationConnection__Group__6 : rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 ;
    public final void rule__CommunicationConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5620:1: ( rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 )
            // InternalTargetEnvironmentParser.g:5621:2: rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalTargetEnvironmentParser.g:5628:1: rule__CommunicationConnection__Group__6__Impl : ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) ;
    public final void rule__CommunicationConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5632:1: ( ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) )
            // InternalTargetEnvironmentParser.g:5633:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            {
            // InternalTargetEnvironmentParser.g:5633:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            // InternalTargetEnvironmentParser.g:5634:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6()); 
            // InternalTargetEnvironmentParser.g:5635:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            // InternalTargetEnvironmentParser.g:5635:3: rule__CommunicationConnection__TypeAssignment_6
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
    // InternalTargetEnvironmentParser.g:5643:1: rule__CommunicationConnection__Group__7 : rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 ;
    public final void rule__CommunicationConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5647:1: ( rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 )
            // InternalTargetEnvironmentParser.g:5648:2: rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8
            {
            pushFollow(FOLLOW_33);
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
    // InternalTargetEnvironmentParser.g:5655:1: rule__CommunicationConnection__Group__7__Impl : ( ( rule__CommunicationConnection__Group_7__0 )? ) ;
    public final void rule__CommunicationConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5659:1: ( ( ( rule__CommunicationConnection__Group_7__0 )? ) )
            // InternalTargetEnvironmentParser.g:5660:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            {
            // InternalTargetEnvironmentParser.g:5660:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            // InternalTargetEnvironmentParser.g:5661:2: ( rule__CommunicationConnection__Group_7__0 )?
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup_7()); 
            // InternalTargetEnvironmentParser.g:5662:2: ( rule__CommunicationConnection__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Properties) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:5662:3: rule__CommunicationConnection__Group_7__0
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
    // InternalTargetEnvironmentParser.g:5670:1: rule__CommunicationConnection__Group__8 : rule__CommunicationConnection__Group__8__Impl ;
    public final void rule__CommunicationConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5674:1: ( rule__CommunicationConnection__Group__8__Impl )
            // InternalTargetEnvironmentParser.g:5675:2: rule__CommunicationConnection__Group__8__Impl
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
    // InternalTargetEnvironmentParser.g:5681:1: rule__CommunicationConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5685:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:5686:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:5686:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:5687:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:5697:1: rule__CommunicationConnection__Group_7__0 : rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 ;
    public final void rule__CommunicationConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5701:1: ( rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 )
            // InternalTargetEnvironmentParser.g:5702:2: rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1
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
    // InternalTargetEnvironmentParser.g:5709:1: rule__CommunicationConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__CommunicationConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5713:1: ( ( Properties ) )
            // InternalTargetEnvironmentParser.g:5714:1: ( Properties )
            {
            // InternalTargetEnvironmentParser.g:5714:1: ( Properties )
            // InternalTargetEnvironmentParser.g:5715:2: Properties
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
    // InternalTargetEnvironmentParser.g:5724:1: rule__CommunicationConnection__Group_7__1 : rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 ;
    public final void rule__CommunicationConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5728:1: ( rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 )
            // InternalTargetEnvironmentParser.g:5729:2: rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2
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
    // InternalTargetEnvironmentParser.g:5736:1: rule__CommunicationConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5740:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:5741:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:5741:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:5742:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:5751:1: rule__CommunicationConnection__Group_7__2 : rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 ;
    public final void rule__CommunicationConnection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5755:1: ( rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 )
            // InternalTargetEnvironmentParser.g:5756:2: rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3
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
    // InternalTargetEnvironmentParser.g:5763:1: rule__CommunicationConnection__Group_7__2__Impl : ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__CommunicationConnection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5767:1: ( ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:5768:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:5768:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            // InternalTargetEnvironmentParser.g:5769:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalTargetEnvironmentParser.g:5769:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) )
            // InternalTargetEnvironmentParser.g:5770:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:5771:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            // InternalTargetEnvironmentParser.g:5771:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_11);
            rule__CommunicationConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 

            }

            // InternalTargetEnvironmentParser.g:5774:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            // InternalTargetEnvironmentParser.g:5775:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:5776:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==HyphenMinus) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:5776:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CommunicationConnection__PropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalTargetEnvironmentParser.g:5785:1: rule__CommunicationConnection__Group_7__3 : rule__CommunicationConnection__Group_7__3__Impl ;
    public final void rule__CommunicationConnection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5789:1: ( rule__CommunicationConnection__Group_7__3__Impl )
            // InternalTargetEnvironmentParser.g:5790:2: rule__CommunicationConnection__Group_7__3__Impl
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
    // InternalTargetEnvironmentParser.g:5796:1: rule__CommunicationConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5800:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:5801:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:5801:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:5802:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:5812:1: rule__ProcessorArchitectureType__Group__0 : rule__ProcessorArchitectureType__Group__0__Impl rule__ProcessorArchitectureType__Group__1 ;
    public final void rule__ProcessorArchitectureType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5816:1: ( rule__ProcessorArchitectureType__Group__0__Impl rule__ProcessorArchitectureType__Group__1 )
            // InternalTargetEnvironmentParser.g:5817:2: rule__ProcessorArchitectureType__Group__0__Impl rule__ProcessorArchitectureType__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetEnvironmentParser.g:5824:1: rule__ProcessorArchitectureType__Group__0__Impl : ( () ) ;
    public final void rule__ProcessorArchitectureType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5828:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5829:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5829:1: ( () )
            // InternalTargetEnvironmentParser.g:5830:2: ()
            {
             before(grammarAccess.getProcessorArchitectureTypeAccess().getProcessorArchitectureTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:5831:2: ()
            // InternalTargetEnvironmentParser.g:5831:3: 
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
    // InternalTargetEnvironmentParser.g:5839:1: rule__ProcessorArchitectureType__Group__1 : rule__ProcessorArchitectureType__Group__1__Impl ;
    public final void rule__ProcessorArchitectureType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5843:1: ( rule__ProcessorArchitectureType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:5844:2: rule__ProcessorArchitectureType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:5850:1: rule__ProcessorArchitectureType__Group__1__Impl : ( ProcessorArchitecture ) ;
    public final void rule__ProcessorArchitectureType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5854:1: ( ( ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:5855:1: ( ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:5855:1: ( ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:5856:2: ProcessorArchitecture
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
    // InternalTargetEnvironmentParser.g:5866:1: rule__LinuxOpertingSystemType__Group__0 : rule__LinuxOpertingSystemType__Group__0__Impl rule__LinuxOpertingSystemType__Group__1 ;
    public final void rule__LinuxOpertingSystemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5870:1: ( rule__LinuxOpertingSystemType__Group__0__Impl rule__LinuxOpertingSystemType__Group__1 )
            // InternalTargetEnvironmentParser.g:5871:2: rule__LinuxOpertingSystemType__Group__0__Impl rule__LinuxOpertingSystemType__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalTargetEnvironmentParser.g:5878:1: rule__LinuxOpertingSystemType__Group__0__Impl : ( () ) ;
    public final void rule__LinuxOpertingSystemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5882:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5883:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5883:1: ( () )
            // InternalTargetEnvironmentParser.g:5884:2: ()
            {
             before(grammarAccess.getLinuxOpertingSystemTypeAccess().getLinuxOpertingSystemTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:5885:2: ()
            // InternalTargetEnvironmentParser.g:5885:3: 
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
    // InternalTargetEnvironmentParser.g:5893:1: rule__LinuxOpertingSystemType__Group__1 : rule__LinuxOpertingSystemType__Group__1__Impl ;
    public final void rule__LinuxOpertingSystemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5897:1: ( rule__LinuxOpertingSystemType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:5898:2: rule__LinuxOpertingSystemType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:5904:1: rule__LinuxOpertingSystemType__Group__1__Impl : ( Linux ) ;
    public final void rule__LinuxOpertingSystemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5908:1: ( ( Linux ) )
            // InternalTargetEnvironmentParser.g:5909:1: ( Linux )
            {
            // InternalTargetEnvironmentParser.g:5909:1: ( Linux )
            // InternalTargetEnvironmentParser.g:5910:2: Linux
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
    // InternalTargetEnvironmentParser.g:5920:1: rule__MacOSOpertingSystemType__Group__0 : rule__MacOSOpertingSystemType__Group__0__Impl rule__MacOSOpertingSystemType__Group__1 ;
    public final void rule__MacOSOpertingSystemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5924:1: ( rule__MacOSOpertingSystemType__Group__0__Impl rule__MacOSOpertingSystemType__Group__1 )
            // InternalTargetEnvironmentParser.g:5925:2: rule__MacOSOpertingSystemType__Group__0__Impl rule__MacOSOpertingSystemType__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalTargetEnvironmentParser.g:5932:1: rule__MacOSOpertingSystemType__Group__0__Impl : ( () ) ;
    public final void rule__MacOSOpertingSystemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5936:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5937:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5937:1: ( () )
            // InternalTargetEnvironmentParser.g:5938:2: ()
            {
             before(grammarAccess.getMacOSOpertingSystemTypeAccess().getMacOSOpertingSystemTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:5939:2: ()
            // InternalTargetEnvironmentParser.g:5939:3: 
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
    // InternalTargetEnvironmentParser.g:5947:1: rule__MacOSOpertingSystemType__Group__1 : rule__MacOSOpertingSystemType__Group__1__Impl ;
    public final void rule__MacOSOpertingSystemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5951:1: ( rule__MacOSOpertingSystemType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:5952:2: rule__MacOSOpertingSystemType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:5958:1: rule__MacOSOpertingSystemType__Group__1__Impl : ( MacOS ) ;
    public final void rule__MacOSOpertingSystemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5962:1: ( ( MacOS ) )
            // InternalTargetEnvironmentParser.g:5963:1: ( MacOS )
            {
            // InternalTargetEnvironmentParser.g:5963:1: ( MacOS )
            // InternalTargetEnvironmentParser.g:5964:2: MacOS
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
    // InternalTargetEnvironmentParser.g:5974:1: rule__X86ProcessorArchitecture__Group__0 : rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 ;
    public final void rule__X86ProcessorArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5978:1: ( rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 )
            // InternalTargetEnvironmentParser.g:5979:2: rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalTargetEnvironmentParser.g:5986:1: rule__X86ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__X86ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:5990:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:5991:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:5991:1: ( () )
            // InternalTargetEnvironmentParser.g:5992:2: ()
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0()); 
            // InternalTargetEnvironmentParser.g:5993:2: ()
            // InternalTargetEnvironmentParser.g:5993:3: 
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
    // InternalTargetEnvironmentParser.g:6001:1: rule__X86ProcessorArchitecture__Group__1 : rule__X86ProcessorArchitecture__Group__1__Impl ;
    public final void rule__X86ProcessorArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6005:1: ( rule__X86ProcessorArchitecture__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:6006:2: rule__X86ProcessorArchitecture__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:6012:1: rule__X86ProcessorArchitecture__Group__1__Impl : ( X86ProcessorArchitecture ) ;
    public final void rule__X86ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6016:1: ( ( X86ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:6017:1: ( X86ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:6017:1: ( X86ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:6018:2: X86ProcessorArchitecture
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
    // InternalTargetEnvironmentParser.g:6028:1: rule__Arm64ProcessorArchitecture__Group__0 : rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 ;
    public final void rule__Arm64ProcessorArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6032:1: ( rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 )
            // InternalTargetEnvironmentParser.g:6033:2: rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTargetEnvironmentParser.g:6040:1: rule__Arm64ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6044:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:6045:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:6045:1: ( () )
            // InternalTargetEnvironmentParser.g:6046:2: ()
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0()); 
            // InternalTargetEnvironmentParser.g:6047:2: ()
            // InternalTargetEnvironmentParser.g:6047:3: 
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
    // InternalTargetEnvironmentParser.g:6055:1: rule__Arm64ProcessorArchitecture__Group__1 : rule__Arm64ProcessorArchitecture__Group__1__Impl ;
    public final void rule__Arm64ProcessorArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6059:1: ( rule__Arm64ProcessorArchitecture__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:6060:2: rule__Arm64ProcessorArchitecture__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:6066:1: rule__Arm64ProcessorArchitecture__Group__1__Impl : ( Arm64ProcessorArchitecture ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6070:1: ( ( Arm64ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:6071:1: ( Arm64ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:6071:1: ( Arm64ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:6072:2: Arm64ProcessorArchitecture
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
    // InternalTargetEnvironmentParser.g:6082:1: rule__CommunicationType__Group__0 : rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 ;
    public final void rule__CommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6086:1: ( rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 )
            // InternalTargetEnvironmentParser.g:6087:2: rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTargetEnvironmentParser.g:6094:1: rule__CommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6098:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:6099:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:6099:1: ( () )
            // InternalTargetEnvironmentParser.g:6100:2: ()
            {
             before(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:6101:2: ()
            // InternalTargetEnvironmentParser.g:6101:3: 
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
    // InternalTargetEnvironmentParser.g:6109:1: rule__CommunicationType__Group__1 : rule__CommunicationType__Group__1__Impl ;
    public final void rule__CommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6113:1: ( rule__CommunicationType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:6114:2: rule__CommunicationType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:6120:1: rule__CommunicationType__Group__1__Impl : ( ( rule__CommunicationType__NameAssignment_1 ) ) ;
    public final void rule__CommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6124:1: ( ( ( rule__CommunicationType__NameAssignment_1 ) ) )
            // InternalTargetEnvironmentParser.g:6125:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            {
            // InternalTargetEnvironmentParser.g:6125:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            // InternalTargetEnvironmentParser.g:6126:2: ( rule__CommunicationType__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1()); 
            // InternalTargetEnvironmentParser.g:6127:2: ( rule__CommunicationType__NameAssignment_1 )
            // InternalTargetEnvironmentParser.g:6127:3: rule__CommunicationType__NameAssignment_1
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
    // InternalTargetEnvironmentParser.g:6136:1: rule__EthernetCommunicationType__Group__0 : rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 ;
    public final void rule__EthernetCommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6140:1: ( rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 )
            // InternalTargetEnvironmentParser.g:6141:2: rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalTargetEnvironmentParser.g:6148:1: rule__EthernetCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__EthernetCommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6152:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:6153:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:6153:1: ( () )
            // InternalTargetEnvironmentParser.g:6154:2: ()
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:6155:2: ()
            // InternalTargetEnvironmentParser.g:6155:3: 
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
    // InternalTargetEnvironmentParser.g:6163:1: rule__EthernetCommunicationType__Group__1 : rule__EthernetCommunicationType__Group__1__Impl ;
    public final void rule__EthernetCommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6167:1: ( rule__EthernetCommunicationType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:6168:2: rule__EthernetCommunicationType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:6174:1: rule__EthernetCommunicationType__Group__1__Impl : ( Ethernet ) ;
    public final void rule__EthernetCommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6178:1: ( ( Ethernet ) )
            // InternalTargetEnvironmentParser.g:6179:1: ( Ethernet )
            {
            // InternalTargetEnvironmentParser.g:6179:1: ( Ethernet )
            // InternalTargetEnvironmentParser.g:6180:2: Ethernet
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
    // InternalTargetEnvironmentParser.g:6190:1: rule__WlanCommunicationType__Group__0 : rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 ;
    public final void rule__WlanCommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6194:1: ( rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 )
            // InternalTargetEnvironmentParser.g:6195:2: rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalTargetEnvironmentParser.g:6202:1: rule__WlanCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__WlanCommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6206:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:6207:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:6207:1: ( () )
            // InternalTargetEnvironmentParser.g:6208:2: ()
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:6209:2: ()
            // InternalTargetEnvironmentParser.g:6209:3: 
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
    // InternalTargetEnvironmentParser.g:6217:1: rule__WlanCommunicationType__Group__1 : rule__WlanCommunicationType__Group__1__Impl ;
    public final void rule__WlanCommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6221:1: ( rule__WlanCommunicationType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:6222:2: rule__WlanCommunicationType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:6228:1: rule__WlanCommunicationType__Group__1__Impl : ( Wlan ) ;
    public final void rule__WlanCommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6232:1: ( ( Wlan ) )
            // InternalTargetEnvironmentParser.g:6233:1: ( Wlan )
            {
            // InternalTargetEnvironmentParser.g:6233:1: ( Wlan )
            // InternalTargetEnvironmentParser.g:6234:2: Wlan
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


    // $ANTLR start "rule__TargetEnvironment__TypeAssignment_1"
    // InternalTargetEnvironmentParser.g:6244:1: rule__TargetEnvironment__TypeAssignment_1 : ( ruleDescription ) ;
    public final void rule__TargetEnvironment__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6248:1: ( ( ruleDescription ) )
            // InternalTargetEnvironmentParser.g:6249:2: ( ruleDescription )
            {
            // InternalTargetEnvironmentParser.g:6249:2: ( ruleDescription )
            // InternalTargetEnvironmentParser.g:6250:3: ruleDescription
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
    // InternalTargetEnvironmentParser.g:6259:1: rule__TargetDeployEnviroment__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__TargetDeployEnviroment__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6263:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6264:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6264:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6265:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6274:1: rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 : ( ruleDeviceInstance ) ;
    public final void rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6278:1: ( ( ruleDeviceInstance ) )
            // InternalTargetEnvironmentParser.g:6279:2: ( ruleDeviceInstance )
            {
            // InternalTargetEnvironmentParser.g:6279:2: ( ruleDeviceInstance )
            // InternalTargetEnvironmentParser.g:6280:3: ruleDeviceInstance
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
    // InternalTargetEnvironmentParser.g:6289:1: rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 : ( ruleConfigConnection ) ;
    public final void rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6293:1: ( ( ruleConfigConnection ) )
            // InternalTargetEnvironmentParser.g:6294:2: ( ruleConfigConnection )
            {
            // InternalTargetEnvironmentParser.g:6294:2: ( ruleConfigConnection )
            // InternalTargetEnvironmentParser.g:6295:3: ruleConfigConnection
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
    // InternalTargetEnvironmentParser.g:6304:1: rule__DeviceInstance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DeviceInstance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6308:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6309:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6309:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6310:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6319:1: rule__DeviceInstance__RefDeviceTypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DeviceInstance__RefDeviceTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6323:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6324:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6324:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6325:3: ( ruleEString )
            {
             before(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeCrossReference_5_0()); 
            // InternalTargetEnvironmentParser.g:6326:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6327:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6338:1: rule__ConfigConnection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ConfigConnection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6342:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6343:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6343:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6344:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6353:1: rule__ConfigConnection__ConnectDeviceAssignment_6 : ( ruleConnectedDevice ) ;
    public final void rule__ConfigConnection__ConnectDeviceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6357:1: ( ( ruleConnectedDevice ) )
            // InternalTargetEnvironmentParser.g:6358:2: ( ruleConnectedDevice )
            {
            // InternalTargetEnvironmentParser.g:6358:2: ( ruleConnectedDevice )
            // InternalTargetEnvironmentParser.g:6359:3: ruleConnectedDevice
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
    // InternalTargetEnvironmentParser.g:6368:1: rule__ConnectedDevice__RefDeviceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ConnectedDevice__RefDeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6372:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6373:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6373:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6374:3: ( ruleEString )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceCrossReference_2_0()); 
            // InternalTargetEnvironmentParser.g:6375:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6376:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6387:1: rule__ConnectedDevice__RefConnectionAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ConnectedDevice__RefConnectionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6391:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6392:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6392:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6393:3: ( ruleEString )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefConnectionCommunicationConnectionCrossReference_5_0()); 
            // InternalTargetEnvironmentParser.g:6394:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6395:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6406:1: rule__ConnectedDevice__PropertiesAssignment_6_2 : ( ruleConfigConnectionProperty ) ;
    public final void rule__ConnectedDevice__PropertiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6410:1: ( ( ruleConfigConnectionProperty ) )
            // InternalTargetEnvironmentParser.g:6411:2: ( ruleConfigConnectionProperty )
            {
            // InternalTargetEnvironmentParser.g:6411:2: ( ruleConfigConnectionProperty )
            // InternalTargetEnvironmentParser.g:6412:3: ruleConfigConnectionProperty
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
    // InternalTargetEnvironmentParser.g:6421:1: rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6425:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6426:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6426:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6427:3: ( ruleEString )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyConnectionPropertyCrossReference_3_0()); 
            // InternalTargetEnvironmentParser.g:6428:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6429:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6440:1: rule__ConfigConnectionProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__ConfigConnectionProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6444:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:6445:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:6445:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:6446:3: rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:6455:1: rule__DeviceSet__DeviceAssignment : ( ruleDeviceType ) ;
    public final void rule__DeviceSet__DeviceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6459:1: ( ( ruleDeviceType ) )
            // InternalTargetEnvironmentParser.g:6460:2: ( ruleDeviceType )
            {
            // InternalTargetEnvironmentParser.g:6460:2: ( ruleDeviceType )
            // InternalTargetEnvironmentParser.g:6461:3: ruleDeviceType
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
    // InternalTargetEnvironmentParser.g:6470:1: rule__InterfaceNetworkProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__InterfaceNetworkProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6474:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:6475:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:6475:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:6476:3: rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:6485:1: rule__AddressNetworkProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__AddressNetworkProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6489:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:6490:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:6490:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:6491:3: rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:6500:1: rule__DeviceType_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__DeviceType_Impl__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6504:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6505:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6505:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6506:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6515:1: rule__DeviceType_Impl__CapabilityAssignment_5_2 : ( ruleCapabilityProperty ) ;
    public final void rule__DeviceType_Impl__CapabilityAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6519:1: ( ( ruleCapabilityProperty ) )
            // InternalTargetEnvironmentParser.g:6520:2: ( ruleCapabilityProperty )
            {
            // InternalTargetEnvironmentParser.g:6520:2: ( ruleCapabilityProperty )
            // InternalTargetEnvironmentParser.g:6521:3: ruleCapabilityProperty
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
    // InternalTargetEnvironmentParser.g:6530:1: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6534:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:6535:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:6535:2: ( ruleAbstractCommunicationConnection )
            // InternalTargetEnvironmentParser.g:6536:3: ruleAbstractCommunicationConnection
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
    // InternalTargetEnvironmentParser.g:6545:1: rule__ComputationDeviceType__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComputationDeviceType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6549:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6550:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6550:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6551:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6560:1: rule__ComputationDeviceType__CapabilityAssignment_4_2 : ( ruleCapabilityProperty ) ;
    public final void rule__ComputationDeviceType__CapabilityAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6564:1: ( ( ruleCapabilityProperty ) )
            // InternalTargetEnvironmentParser.g:6565:2: ( ruleCapabilityProperty )
            {
            // InternalTargetEnvironmentParser.g:6565:2: ( ruleCapabilityProperty )
            // InternalTargetEnvironmentParser.g:6566:3: ruleCapabilityProperty
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
    // InternalTargetEnvironmentParser.g:6575:1: rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6579:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:6580:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:6580:2: ( ruleAbstractCommunicationConnection )
            // InternalTargetEnvironmentParser.g:6581:3: ruleAbstractCommunicationConnection
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
    // InternalTargetEnvironmentParser.g:6590:1: rule__CapabilityProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CapabilityProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6594:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6595:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6595:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6596:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6605:1: rule__CapabilityProperty__KindAssignment_5 : ( ruleCapabilityKind ) ;
    public final void rule__CapabilityProperty__KindAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6609:1: ( ( ruleCapabilityKind ) )
            // InternalTargetEnvironmentParser.g:6610:2: ( ruleCapabilityKind )
            {
            // InternalTargetEnvironmentParser.g:6610:2: ( ruleCapabilityKind )
            // InternalTargetEnvironmentParser.g:6611:3: ruleCapabilityKind
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
    // InternalTargetEnvironmentParser.g:6620:1: rule__CapabilityProperty__TypeAssignment_7 : ( ruleAbstractResouceType ) ;
    public final void rule__CapabilityProperty__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6624:1: ( ( ruleAbstractResouceType ) )
            // InternalTargetEnvironmentParser.g:6625:2: ( ruleAbstractResouceType )
            {
            // InternalTargetEnvironmentParser.g:6625:2: ( ruleAbstractResouceType )
            // InternalTargetEnvironmentParser.g:6626:3: ruleAbstractResouceType
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
    // InternalTargetEnvironmentParser.g:6635:1: rule__CapabilityProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__CapabilityProperty__ValueAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6639:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:6640:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:6640:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:6641:3: rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:6650:1: rule__ConnectionProperty__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ConnectionProperty__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6654:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6655:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6655:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6656:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6665:1: rule__ConnectionProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__ConnectionProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6669:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:6670:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:6670:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:6671:3: rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:6680:1: rule__NetworkConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__NetworkConnection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6684:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6685:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6685:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6686:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6695:1: rule__NetworkConnection__TypeAssignment_6 : ( ruleNetworkCommunicationType ) ;
    public final void rule__NetworkConnection__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6699:1: ( ( ruleNetworkCommunicationType ) )
            // InternalTargetEnvironmentParser.g:6700:2: ( ruleNetworkCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:6700:2: ( ruleNetworkCommunicationType )
            // InternalTargetEnvironmentParser.g:6701:3: ruleNetworkCommunicationType
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
    // InternalTargetEnvironmentParser.g:6710:1: rule__NetworkConnection__PropertiesAssignment_7_2 : ( ruleAbstractNetworkProperty ) ;
    public final void rule__NetworkConnection__PropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6714:1: ( ( ruleAbstractNetworkProperty ) )
            // InternalTargetEnvironmentParser.g:6715:2: ( ruleAbstractNetworkProperty )
            {
            // InternalTargetEnvironmentParser.g:6715:2: ( ruleAbstractNetworkProperty )
            // InternalTargetEnvironmentParser.g:6716:3: ruleAbstractNetworkProperty
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
    // InternalTargetEnvironmentParser.g:6725:1: rule__CommunicationConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__CommunicationConnection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6729:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6730:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6730:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6731:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6740:1: rule__CommunicationConnection__TypeAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__CommunicationConnection__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6744:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:6745:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:6745:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6746:3: ( ruleEString )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeCrossReference_6_0()); 
            // InternalTargetEnvironmentParser.g:6747:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6748:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:6759:1: rule__CommunicationConnection__PropertiesAssignment_7_2 : ( ruleConnectionProperty ) ;
    public final void rule__CommunicationConnection__PropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6763:1: ( ( ruleConnectionProperty ) )
            // InternalTargetEnvironmentParser.g:6764:2: ( ruleConnectionProperty )
            {
            // InternalTargetEnvironmentParser.g:6764:2: ( ruleConnectionProperty )
            // InternalTargetEnvironmentParser.g:6765:3: ruleConnectionProperty
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
    // InternalTargetEnvironmentParser.g:6774:1: rule__PropertyValueInt__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__PropertyValueInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6778:1: ( ( ruleInteger0 ) )
            // InternalTargetEnvironmentParser.g:6779:2: ( ruleInteger0 )
            {
            // InternalTargetEnvironmentParser.g:6779:2: ( ruleInteger0 )
            // InternalTargetEnvironmentParser.g:6780:3: ruleInteger0
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
    // InternalTargetEnvironmentParser.g:6789:1: rule__PropertyValueDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__PropertyValueDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6793:1: ( ( ruleDouble0 ) )
            // InternalTargetEnvironmentParser.g:6794:2: ( ruleDouble0 )
            {
            // InternalTargetEnvironmentParser.g:6794:2: ( ruleDouble0 )
            // InternalTargetEnvironmentParser.g:6795:3: ruleDouble0
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
    // InternalTargetEnvironmentParser.g:6804:1: rule__PropertyValueString__ValueAssignment : ( ruleEString ) ;
    public final void rule__PropertyValueString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6808:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6809:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6809:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6810:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:6819:1: rule__CommunicationType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CommunicationType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:6823:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:6824:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:6824:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:6825:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080102L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080180L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000000004800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0014018000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000400040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000360000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000060000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000004000000L});

}