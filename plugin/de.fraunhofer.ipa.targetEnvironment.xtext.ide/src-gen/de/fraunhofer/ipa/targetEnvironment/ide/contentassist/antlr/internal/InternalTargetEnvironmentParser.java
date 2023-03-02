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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "TargetDeployEnviroment", "RefConnectionProperty", "ConfigConnection", "Configuration", "ConnectDevice", "IncludeDevice", "RefConnection", "RefDeviceType", "AttributeKind", "SelectionKind", "DeviceType", "MaximumKind", "MinimumKind", "Capability", "Properties", "RefDevice", "Value", "Kind", "Name", "Type", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=31;
    public static final int Configuration=8;
    public static final int RULE_DATE_TIME=36;
    public static final int RULE_BOOLEAN=28;
    public static final int AttributeKind=13;
    public static final int RULE_YEAR=33;
    public static final int RefDeviceType=12;
    public static final int Name=23;
    public static final int RULE_MIN_SEC=35;
    public static final int Kind=22;
    public static final int ConnectDevice=9;
    public static final int RULE_DEDENT=39;
    public static final int Capability=18;
    public static final int RULE_ID=40;
    public static final int ConfigConnection=7;
    public static final int RULE_DIGIT=26;
    public static final int SelectionKind=14;
    public static final int DeviceType=15;
    public static final int TargetDeployEnviroment=5;
    public static final int RULE_INT=41;
    public static final int Value=21;
    public static final int RULE_ML_COMMENT=43;
    public static final int RefConnectionProperty=6;
    public static final int RULE_STRING=42;
    public static final int Properties=19;
    public static final int RULE_SL_COMMENT=37;
    public static final int CommunicationConnection=4;
    public static final int HyphenMinus=25;
    public static final int RULE_DOUBLE=30;
    public static final int RULE_DECINT=29;
    public static final int MinimumKind=17;
    public static final int EOF=-1;
    public static final int RULE_INDENT=38;
    public static final int RULE_HOUR=34;
    public static final int RefDevice=20;
    public static final int RULE_WS=44;
    public static final int MaximumKind=16;
    public static final int RULE_ANY_OTHER=45;
    public static final int RefConnection=11;
    public static final int Type=24;
    public static final int RULE_MONTH=32;
    public static final int RULE_BINARY=27;
    public static final int IncludeDevice=10;

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
    		tokenNameToValue.put("Kind", "'kind:'");
    		tokenNameToValue.put("Name", "'name:'");
    		tokenNameToValue.put("Type", "'type:'");
    		tokenNameToValue.put("Value", "'value:'");
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
    		tokenNameToValue.put("RefConnectionProperty", "'refConnectionProperty:'");
    		tokenNameToValue.put("TargetDeployEnviroment", "'TargetDeployEnviroment:'");
    		tokenNameToValue.put("CommunicationConnection", "'communicationConnection:'");
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
    // InternalTargetEnvironmentParser.g:77:1: entryRuleTargetEnvironment : ruleTargetEnvironment EOF ;
    public final void entryRuleTargetEnvironment() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:78:1: ( ruleTargetEnvironment EOF )
            // InternalTargetEnvironmentParser.g:79:1: ruleTargetEnvironment EOF
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
    // InternalTargetEnvironmentParser.g:86:1: ruleTargetEnvironment : ( ( rule__TargetEnvironment__Group__0 ) ) ;
    public final void ruleTargetEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:90:2: ( ( ( rule__TargetEnvironment__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:91:2: ( ( rule__TargetEnvironment__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:91:2: ( ( rule__TargetEnvironment__Group__0 ) )
            // InternalTargetEnvironmentParser.g:92:3: ( rule__TargetEnvironment__Group__0 )
            {
             before(grammarAccess.getTargetEnvironmentAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:93:3: ( rule__TargetEnvironment__Group__0 )
            // InternalTargetEnvironmentParser.g:93:4: rule__TargetEnvironment__Group__0
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
    // InternalTargetEnvironmentParser.g:102:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:103:1: ( ruleDescription EOF )
            // InternalTargetEnvironmentParser.g:104:1: ruleDescription EOF
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
    // InternalTargetEnvironmentParser.g:111:1: ruleDescription : ( ( rule__Description__Alternatives ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:115:2: ( ( ( rule__Description__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:116:2: ( ( rule__Description__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:116:2: ( ( rule__Description__Alternatives ) )
            // InternalTargetEnvironmentParser.g:117:3: ( rule__Description__Alternatives )
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:118:3: ( rule__Description__Alternatives )
            // InternalTargetEnvironmentParser.g:118:4: rule__Description__Alternatives
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
    // InternalTargetEnvironmentParser.g:127:1: entryRuleTargetDeployEnviroment : ruleTargetDeployEnviroment EOF ;
    public final void entryRuleTargetDeployEnviroment() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:128:1: ( ruleTargetDeployEnviroment EOF )
            // InternalTargetEnvironmentParser.g:129:1: ruleTargetDeployEnviroment EOF
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
    // InternalTargetEnvironmentParser.g:136:1: ruleTargetDeployEnviroment : ( ( rule__TargetDeployEnviroment__Group__0 ) ) ;
    public final void ruleTargetDeployEnviroment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:140:2: ( ( ( rule__TargetDeployEnviroment__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:141:2: ( ( rule__TargetDeployEnviroment__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:141:2: ( ( rule__TargetDeployEnviroment__Group__0 ) )
            // InternalTargetEnvironmentParser.g:142:3: ( rule__TargetDeployEnviroment__Group__0 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:143:3: ( rule__TargetDeployEnviroment__Group__0 )
            // InternalTargetEnvironmentParser.g:143:4: rule__TargetDeployEnviroment__Group__0
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
    // InternalTargetEnvironmentParser.g:152:1: entryRuleDeviceInstance : ruleDeviceInstance EOF ;
    public final void entryRuleDeviceInstance() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:153:1: ( ruleDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:154:1: ruleDeviceInstance EOF
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
    // InternalTargetEnvironmentParser.g:161:1: ruleDeviceInstance : ( ( rule__DeviceInstance__Group__0 ) ) ;
    public final void ruleDeviceInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:165:2: ( ( ( rule__DeviceInstance__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:166:2: ( ( rule__DeviceInstance__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:166:2: ( ( rule__DeviceInstance__Group__0 ) )
            // InternalTargetEnvironmentParser.g:167:3: ( rule__DeviceInstance__Group__0 )
            {
             before(grammarAccess.getDeviceInstanceAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:168:3: ( rule__DeviceInstance__Group__0 )
            // InternalTargetEnvironmentParser.g:168:4: rule__DeviceInstance__Group__0
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
    // InternalTargetEnvironmentParser.g:177:1: entryRuleConfigConnection : ruleConfigConnection EOF ;
    public final void entryRuleConfigConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:178:1: ( ruleConfigConnection EOF )
            // InternalTargetEnvironmentParser.g:179:1: ruleConfigConnection EOF
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
    // InternalTargetEnvironmentParser.g:186:1: ruleConfigConnection : ( ( rule__ConfigConnection__Group__0 ) ) ;
    public final void ruleConfigConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:190:2: ( ( ( rule__ConfigConnection__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:191:2: ( ( rule__ConfigConnection__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:191:2: ( ( rule__ConfigConnection__Group__0 ) )
            // InternalTargetEnvironmentParser.g:192:3: ( rule__ConfigConnection__Group__0 )
            {
             before(grammarAccess.getConfigConnectionAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:193:3: ( rule__ConfigConnection__Group__0 )
            // InternalTargetEnvironmentParser.g:193:4: rule__ConfigConnection__Group__0
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
    // InternalTargetEnvironmentParser.g:202:1: entryRuleConnectedDevice : ruleConnectedDevice EOF ;
    public final void entryRuleConnectedDevice() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:203:1: ( ruleConnectedDevice EOF )
            // InternalTargetEnvironmentParser.g:204:1: ruleConnectedDevice EOF
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
    // InternalTargetEnvironmentParser.g:211:1: ruleConnectedDevice : ( ( rule__ConnectedDevice__Group__0 ) ) ;
    public final void ruleConnectedDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:215:2: ( ( ( rule__ConnectedDevice__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:216:2: ( ( rule__ConnectedDevice__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:216:2: ( ( rule__ConnectedDevice__Group__0 ) )
            // InternalTargetEnvironmentParser.g:217:3: ( rule__ConnectedDevice__Group__0 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:218:3: ( rule__ConnectedDevice__Group__0 )
            // InternalTargetEnvironmentParser.g:218:4: rule__ConnectedDevice__Group__0
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
    // InternalTargetEnvironmentParser.g:227:1: entryRuleConfigConnectionProperty : ruleConfigConnectionProperty EOF ;
    public final void entryRuleConfigConnectionProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:228:1: ( ruleConfigConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:229:1: ruleConfigConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:236:1: ruleConfigConnectionProperty : ( ( rule__ConfigConnectionProperty__Group__0 ) ) ;
    public final void ruleConfigConnectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:240:2: ( ( ( rule__ConfigConnectionProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:241:2: ( ( rule__ConfigConnectionProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:241:2: ( ( rule__ConfigConnectionProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:242:3: ( rule__ConfigConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:243:3: ( rule__ConfigConnectionProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:243:4: rule__ConfigConnectionProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:252:1: entryRuleDeviceSet : ruleDeviceSet EOF ;
    public final void entryRuleDeviceSet() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:253:1: ( ruleDeviceSet EOF )
            // InternalTargetEnvironmentParser.g:254:1: ruleDeviceSet EOF
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
    // InternalTargetEnvironmentParser.g:261:1: ruleDeviceSet : ( ( rule__DeviceSet__DeviceAssignment )* ) ;
    public final void ruleDeviceSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:265:2: ( ( ( rule__DeviceSet__DeviceAssignment )* ) )
            // InternalTargetEnvironmentParser.g:266:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            {
            // InternalTargetEnvironmentParser.g:266:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            // InternalTargetEnvironmentParser.g:267:3: ( rule__DeviceSet__DeviceAssignment )*
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceAssignment()); 
            // InternalTargetEnvironmentParser.g:268:3: ( rule__DeviceSet__DeviceAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DeviceType) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:268:4: rule__DeviceSet__DeviceAssignment
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
    // InternalTargetEnvironmentParser.g:277:1: entryRuleCapabilityKind : ruleCapabilityKind EOF ;
    public final void entryRuleCapabilityKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:278:1: ( ruleCapabilityKind EOF )
            // InternalTargetEnvironmentParser.g:279:1: ruleCapabilityKind EOF
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
    // InternalTargetEnvironmentParser.g:286:1: ruleCapabilityKind : ( ( rule__CapabilityKind__Alternatives ) ) ;
    public final void ruleCapabilityKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:290:2: ( ( ( rule__CapabilityKind__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:291:2: ( ( rule__CapabilityKind__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:291:2: ( ( rule__CapabilityKind__Alternatives ) )
            // InternalTargetEnvironmentParser.g:292:3: ( rule__CapabilityKind__Alternatives )
            {
             before(grammarAccess.getCapabilityKindAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:293:3: ( rule__CapabilityKind__Alternatives )
            // InternalTargetEnvironmentParser.g:293:4: rule__CapabilityKind__Alternatives
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
    // InternalTargetEnvironmentParser.g:302:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:303:1: ( ruleDeviceType EOF )
            // InternalTargetEnvironmentParser.g:304:1: ruleDeviceType EOF
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
    // InternalTargetEnvironmentParser.g:311:1: ruleDeviceType : ( ( rule__DeviceType__Group__0 ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:315:2: ( ( ( rule__DeviceType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:316:2: ( ( rule__DeviceType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:316:2: ( ( rule__DeviceType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:317:3: ( rule__DeviceType__Group__0 )
            {
             before(grammarAccess.getDeviceTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:318:3: ( rule__DeviceType__Group__0 )
            // InternalTargetEnvironmentParser.g:318:4: rule__DeviceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCapabilityProperty"
    // InternalTargetEnvironmentParser.g:327:1: entryRuleCapabilityProperty : ruleCapabilityProperty EOF ;
    public final void entryRuleCapabilityProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:328:1: ( ruleCapabilityProperty EOF )
            // InternalTargetEnvironmentParser.g:329:1: ruleCapabilityProperty EOF
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
    // InternalTargetEnvironmentParser.g:336:1: ruleCapabilityProperty : ( ( rule__CapabilityProperty__Group__0 ) ) ;
    public final void ruleCapabilityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:340:2: ( ( ( rule__CapabilityProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:341:2: ( ( rule__CapabilityProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:341:2: ( ( rule__CapabilityProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:342:3: ( rule__CapabilityProperty__Group__0 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:343:3: ( rule__CapabilityProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:343:4: rule__CapabilityProperty__Group__0
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
    // InternalTargetEnvironmentParser.g:352:1: entryRuleAttributeKind : ruleAttributeKind EOF ;
    public final void entryRuleAttributeKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:353:1: ( ruleAttributeKind EOF )
            // InternalTargetEnvironmentParser.g:354:1: ruleAttributeKind EOF
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
    // InternalTargetEnvironmentParser.g:361:1: ruleAttributeKind : ( ( rule__AttributeKind__Group__0 ) ) ;
    public final void ruleAttributeKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:365:2: ( ( ( rule__AttributeKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:366:2: ( ( rule__AttributeKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:366:2: ( ( rule__AttributeKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:367:3: ( rule__AttributeKind__Group__0 )
            {
             before(grammarAccess.getAttributeKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:368:3: ( rule__AttributeKind__Group__0 )
            // InternalTargetEnvironmentParser.g:368:4: rule__AttributeKind__Group__0
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
    // InternalTargetEnvironmentParser.g:377:1: entryRuleMaximumKind : ruleMaximumKind EOF ;
    public final void entryRuleMaximumKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:378:1: ( ruleMaximumKind EOF )
            // InternalTargetEnvironmentParser.g:379:1: ruleMaximumKind EOF
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
    // InternalTargetEnvironmentParser.g:386:1: ruleMaximumKind : ( ( rule__MaximumKind__Group__0 ) ) ;
    public final void ruleMaximumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:390:2: ( ( ( rule__MaximumKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:391:2: ( ( rule__MaximumKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:391:2: ( ( rule__MaximumKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:392:3: ( rule__MaximumKind__Group__0 )
            {
             before(grammarAccess.getMaximumKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:393:3: ( rule__MaximumKind__Group__0 )
            // InternalTargetEnvironmentParser.g:393:4: rule__MaximumKind__Group__0
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
    // InternalTargetEnvironmentParser.g:402:1: entryRuleMinimumKind : ruleMinimumKind EOF ;
    public final void entryRuleMinimumKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:403:1: ( ruleMinimumKind EOF )
            // InternalTargetEnvironmentParser.g:404:1: ruleMinimumKind EOF
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
    // InternalTargetEnvironmentParser.g:411:1: ruleMinimumKind : ( ( rule__MinimumKind__Group__0 ) ) ;
    public final void ruleMinimumKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:415:2: ( ( ( rule__MinimumKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:416:2: ( ( rule__MinimumKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:416:2: ( ( rule__MinimumKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:417:3: ( rule__MinimumKind__Group__0 )
            {
             before(grammarAccess.getMinimumKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:418:3: ( rule__MinimumKind__Group__0 )
            // InternalTargetEnvironmentParser.g:418:4: rule__MinimumKind__Group__0
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
    // InternalTargetEnvironmentParser.g:427:1: entryRuleSelectionKind : ruleSelectionKind EOF ;
    public final void entryRuleSelectionKind() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:428:1: ( ruleSelectionKind EOF )
            // InternalTargetEnvironmentParser.g:429:1: ruleSelectionKind EOF
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
    // InternalTargetEnvironmentParser.g:436:1: ruleSelectionKind : ( ( rule__SelectionKind__Group__0 ) ) ;
    public final void ruleSelectionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:440:2: ( ( ( rule__SelectionKind__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:441:2: ( ( rule__SelectionKind__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:441:2: ( ( rule__SelectionKind__Group__0 ) )
            // InternalTargetEnvironmentParser.g:442:3: ( rule__SelectionKind__Group__0 )
            {
             before(grammarAccess.getSelectionKindAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:443:3: ( rule__SelectionKind__Group__0 )
            // InternalTargetEnvironmentParser.g:443:4: rule__SelectionKind__Group__0
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
    // InternalTargetEnvironmentParser.g:452:1: entryRuleConnectionProperty : ruleConnectionProperty EOF ;
    public final void entryRuleConnectionProperty() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:453:1: ( ruleConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:454:1: ruleConnectionProperty EOF
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
    // InternalTargetEnvironmentParser.g:461:1: ruleConnectionProperty : ( ( rule__ConnectionProperty__Group__0 ) ) ;
    public final void ruleConnectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:465:2: ( ( ( rule__ConnectionProperty__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:466:2: ( ( rule__ConnectionProperty__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:466:2: ( ( rule__ConnectionProperty__Group__0 ) )
            // InternalTargetEnvironmentParser.g:467:3: ( rule__ConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:468:3: ( rule__ConnectionProperty__Group__0 )
            // InternalTargetEnvironmentParser.g:468:4: rule__ConnectionProperty__Group__0
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


    // $ANTLR start "entryRuleCommunicationConnection"
    // InternalTargetEnvironmentParser.g:477:1: entryRuleCommunicationConnection : ruleCommunicationConnection EOF ;
    public final void entryRuleCommunicationConnection() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:478:1: ( ruleCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:479:1: ruleCommunicationConnection EOF
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
    // InternalTargetEnvironmentParser.g:486:1: ruleCommunicationConnection : ( ( rule__CommunicationConnection__Group__0 ) ) ;
    public final void ruleCommunicationConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:490:2: ( ( ( rule__CommunicationConnection__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:491:2: ( ( rule__CommunicationConnection__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:491:2: ( ( rule__CommunicationConnection__Group__0 ) )
            // InternalTargetEnvironmentParser.g:492:3: ( rule__CommunicationConnection__Group__0 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:493:3: ( rule__CommunicationConnection__Group__0 )
            // InternalTargetEnvironmentParser.g:493:4: rule__CommunicationConnection__Group__0
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


    // $ANTLR start "entryRuleCommunicationType"
    // InternalTargetEnvironmentParser.g:502:1: entryRuleCommunicationType : ruleCommunicationType EOF ;
    public final void entryRuleCommunicationType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:503:1: ( ruleCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:504:1: ruleCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:511:1: ruleCommunicationType : ( ( rule__CommunicationType__Group__0 ) ) ;
    public final void ruleCommunicationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:515:2: ( ( ( rule__CommunicationType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:516:2: ( ( rule__CommunicationType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:516:2: ( ( rule__CommunicationType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:517:3: ( rule__CommunicationType__Group__0 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:518:3: ( rule__CommunicationType__Group__0 )
            // InternalTargetEnvironmentParser.g:518:4: rule__CommunicationType__Group__0
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


    // $ANTLR start "entryRuleCapabilityType"
    // InternalTargetEnvironmentParser.g:527:1: entryRuleCapabilityType : ruleCapabilityType EOF ;
    public final void entryRuleCapabilityType() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:528:1: ( ruleCapabilityType EOF )
            // InternalTargetEnvironmentParser.g:529:1: ruleCapabilityType EOF
            {
             before(grammarAccess.getCapabilityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCapabilityType();

            state._fsp--;

             after(grammarAccess.getCapabilityTypeRule()); 
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
    // $ANTLR end "entryRuleCapabilityType"


    // $ANTLR start "ruleCapabilityType"
    // InternalTargetEnvironmentParser.g:536:1: ruleCapabilityType : ( ( rule__CapabilityType__Group__0 ) ) ;
    public final void ruleCapabilityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:540:2: ( ( ( rule__CapabilityType__Group__0 ) ) )
            // InternalTargetEnvironmentParser.g:541:2: ( ( rule__CapabilityType__Group__0 ) )
            {
            // InternalTargetEnvironmentParser.g:541:2: ( ( rule__CapabilityType__Group__0 ) )
            // InternalTargetEnvironmentParser.g:542:3: ( rule__CapabilityType__Group__0 )
            {
             before(grammarAccess.getCapabilityTypeAccess().getGroup()); 
            // InternalTargetEnvironmentParser.g:543:3: ( rule__CapabilityType__Group__0 )
            // InternalTargetEnvironmentParser.g:543:4: rule__CapabilityType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapabilityType"


    // $ANTLR start "entryRulePropertyValue"
    // InternalTargetEnvironmentParser.g:552:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:553:1: ( rulePropertyValue EOF )
            // InternalTargetEnvironmentParser.g:554:1: rulePropertyValue EOF
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
    // InternalTargetEnvironmentParser.g:561:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:565:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:566:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:566:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalTargetEnvironmentParser.g:567:3: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:568:3: ( rule__PropertyValue__Alternatives )
            // InternalTargetEnvironmentParser.g:568:4: rule__PropertyValue__Alternatives
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
    // InternalTargetEnvironmentParser.g:577:1: entryRulePropertyValueInt : rulePropertyValueInt EOF ;
    public final void entryRulePropertyValueInt() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:578:1: ( rulePropertyValueInt EOF )
            // InternalTargetEnvironmentParser.g:579:1: rulePropertyValueInt EOF
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
    // InternalTargetEnvironmentParser.g:586:1: rulePropertyValueInt : ( ( rule__PropertyValueInt__ValueAssignment ) ) ;
    public final void rulePropertyValueInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:590:2: ( ( ( rule__PropertyValueInt__ValueAssignment ) ) )
            // InternalTargetEnvironmentParser.g:591:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            {
            // InternalTargetEnvironmentParser.g:591:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            // InternalTargetEnvironmentParser.g:592:3: ( rule__PropertyValueInt__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueIntAccess().getValueAssignment()); 
            // InternalTargetEnvironmentParser.g:593:3: ( rule__PropertyValueInt__ValueAssignment )
            // InternalTargetEnvironmentParser.g:593:4: rule__PropertyValueInt__ValueAssignment
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
    // InternalTargetEnvironmentParser.g:602:1: entryRulePropertyValueDouble : rulePropertyValueDouble EOF ;
    public final void entryRulePropertyValueDouble() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:603:1: ( rulePropertyValueDouble EOF )
            // InternalTargetEnvironmentParser.g:604:1: rulePropertyValueDouble EOF
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
    // InternalTargetEnvironmentParser.g:611:1: rulePropertyValueDouble : ( ( rule__PropertyValueDouble__ValueAssignment ) ) ;
    public final void rulePropertyValueDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:615:2: ( ( ( rule__PropertyValueDouble__ValueAssignment ) ) )
            // InternalTargetEnvironmentParser.g:616:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            {
            // InternalTargetEnvironmentParser.g:616:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            // InternalTargetEnvironmentParser.g:617:3: ( rule__PropertyValueDouble__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment()); 
            // InternalTargetEnvironmentParser.g:618:3: ( rule__PropertyValueDouble__ValueAssignment )
            // InternalTargetEnvironmentParser.g:618:4: rule__PropertyValueDouble__ValueAssignment
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
    // InternalTargetEnvironmentParser.g:627:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:628:1: ( rulePropertyValueString EOF )
            // InternalTargetEnvironmentParser.g:629:1: rulePropertyValueString EOF
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
    // InternalTargetEnvironmentParser.g:636:1: rulePropertyValueString : ( ( rule__PropertyValueString__ValueAssignment ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:640:2: ( ( ( rule__PropertyValueString__ValueAssignment ) ) )
            // InternalTargetEnvironmentParser.g:641:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            {
            // InternalTargetEnvironmentParser.g:641:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            // InternalTargetEnvironmentParser.g:642:3: ( rule__PropertyValueString__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueStringAccess().getValueAssignment()); 
            // InternalTargetEnvironmentParser.g:643:3: ( rule__PropertyValueString__ValueAssignment )
            // InternalTargetEnvironmentParser.g:643:4: rule__PropertyValueString__ValueAssignment
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


    // $ANTLR start "entryRuleDouble0"
    // InternalTargetEnvironmentParser.g:652:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:653:1: ( ruleDouble0 EOF )
            // InternalTargetEnvironmentParser.g:654:1: ruleDouble0 EOF
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
    // InternalTargetEnvironmentParser.g:661:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:665:2: ( ( RULE_DOUBLE ) )
            // InternalTargetEnvironmentParser.g:666:2: ( RULE_DOUBLE )
            {
            // InternalTargetEnvironmentParser.g:666:2: ( RULE_DOUBLE )
            // InternalTargetEnvironmentParser.g:667:3: RULE_DOUBLE
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
    // InternalTargetEnvironmentParser.g:677:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:678:1: ( ruleInteger0 EOF )
            // InternalTargetEnvironmentParser.g:679:1: ruleInteger0 EOF
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
    // InternalTargetEnvironmentParser.g:686:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:690:2: ( ( RULE_DECINT ) )
            // InternalTargetEnvironmentParser.g:691:2: ( RULE_DECINT )
            {
            // InternalTargetEnvironmentParser.g:691:2: ( RULE_DECINT )
            // InternalTargetEnvironmentParser.g:692:3: RULE_DECINT
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
    // InternalTargetEnvironmentParser.g:702:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTargetEnvironmentParser.g:703:1: ( ruleEString EOF )
            // InternalTargetEnvironmentParser.g:704:1: ruleEString EOF
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
    // InternalTargetEnvironmentParser.g:711:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:715:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTargetEnvironmentParser.g:716:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTargetEnvironmentParser.g:716:2: ( ( rule__EString__Alternatives ) )
            // InternalTargetEnvironmentParser.g:717:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTargetEnvironmentParser.g:718:3: ( rule__EString__Alternatives )
            // InternalTargetEnvironmentParser.g:718:4: rule__EString__Alternatives
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
    // InternalTargetEnvironmentParser.g:727:1: entryRulePreListElement : rulePreListElement EOF ;
    public final void entryRulePreListElement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:731:1: ( rulePreListElement EOF )
            // InternalTargetEnvironmentParser.g:732:1: rulePreListElement EOF
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
    // InternalTargetEnvironmentParser.g:742:1: rulePreListElement : ( HyphenMinus ) ;
    public final void rulePreListElement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:747:2: ( ( HyphenMinus ) )
            // InternalTargetEnvironmentParser.g:748:2: ( HyphenMinus )
            {
            // InternalTargetEnvironmentParser.g:748:2: ( HyphenMinus )
            // InternalTargetEnvironmentParser.g:749:3: HyphenMinus
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
    // InternalTargetEnvironmentParser.g:759:1: rule__Description__Alternatives : ( ( ruleDeviceSet ) | ( ruleTargetDeployEnviroment ) );
    public final void rule__Description__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:763:1: ( ( ruleDeviceSet ) | ( ruleTargetDeployEnviroment ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF||LA2_0==DeviceType) ) {
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
                    // InternalTargetEnvironmentParser.g:764:2: ( ruleDeviceSet )
                    {
                    // InternalTargetEnvironmentParser.g:764:2: ( ruleDeviceSet )
                    // InternalTargetEnvironmentParser.g:765:3: ruleDeviceSet
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
                    // InternalTargetEnvironmentParser.g:770:2: ( ruleTargetDeployEnviroment )
                    {
                    // InternalTargetEnvironmentParser.g:770:2: ( ruleTargetDeployEnviroment )
                    // InternalTargetEnvironmentParser.g:771:3: ruleTargetDeployEnviroment
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
    // InternalTargetEnvironmentParser.g:780:1: rule__CapabilityKind__Alternatives : ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) );
    public final void rule__CapabilityKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:784:1: ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) )
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
                    // InternalTargetEnvironmentParser.g:785:2: ( ruleAttributeKind )
                    {
                    // InternalTargetEnvironmentParser.g:785:2: ( ruleAttributeKind )
                    // InternalTargetEnvironmentParser.g:786:3: ruleAttributeKind
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
                    // InternalTargetEnvironmentParser.g:791:2: ( ruleMaximumKind )
                    {
                    // InternalTargetEnvironmentParser.g:791:2: ( ruleMaximumKind )
                    // InternalTargetEnvironmentParser.g:792:3: ruleMaximumKind
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
                    // InternalTargetEnvironmentParser.g:797:2: ( ruleMinimumKind )
                    {
                    // InternalTargetEnvironmentParser.g:797:2: ( ruleMinimumKind )
                    // InternalTargetEnvironmentParser.g:798:3: ruleMinimumKind
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
                    // InternalTargetEnvironmentParser.g:803:2: ( ruleSelectionKind )
                    {
                    // InternalTargetEnvironmentParser.g:803:2: ( ruleSelectionKind )
                    // InternalTargetEnvironmentParser.g:804:3: ruleSelectionKind
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


    // $ANTLR start "rule__PropertyValue__Alternatives"
    // InternalTargetEnvironmentParser.g:813:1: rule__PropertyValue__Alternatives : ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:817:1: ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt4=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:818:2: ( rulePropertyValueInt )
                    {
                    // InternalTargetEnvironmentParser.g:818:2: ( rulePropertyValueInt )
                    // InternalTargetEnvironmentParser.g:819:3: rulePropertyValueInt
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
                    // InternalTargetEnvironmentParser.g:824:2: ( rulePropertyValueDouble )
                    {
                    // InternalTargetEnvironmentParser.g:824:2: ( rulePropertyValueDouble )
                    // InternalTargetEnvironmentParser.g:825:3: rulePropertyValueDouble
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
                    // InternalTargetEnvironmentParser.g:830:2: ( rulePropertyValueString )
                    {
                    // InternalTargetEnvironmentParser.g:830:2: ( rulePropertyValueString )
                    // InternalTargetEnvironmentParser.g:831:3: rulePropertyValueString
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
    // InternalTargetEnvironmentParser.g:840:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:844:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:845:2: ( RULE_STRING )
                    {
                    // InternalTargetEnvironmentParser.g:845:2: ( RULE_STRING )
                    // InternalTargetEnvironmentParser.g:846:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:851:2: ( RULE_ID )
                    {
                    // InternalTargetEnvironmentParser.g:851:2: ( RULE_ID )
                    // InternalTargetEnvironmentParser.g:852:3: RULE_ID
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
    // InternalTargetEnvironmentParser.g:861:1: rule__TargetEnvironment__Group__0 : rule__TargetEnvironment__Group__0__Impl rule__TargetEnvironment__Group__1 ;
    public final void rule__TargetEnvironment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:865:1: ( rule__TargetEnvironment__Group__0__Impl rule__TargetEnvironment__Group__1 )
            // InternalTargetEnvironmentParser.g:866:2: rule__TargetEnvironment__Group__0__Impl rule__TargetEnvironment__Group__1
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
    // InternalTargetEnvironmentParser.g:873:1: rule__TargetEnvironment__Group__0__Impl : ( () ) ;
    public final void rule__TargetEnvironment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:877:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:878:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:878:1: ( () )
            // InternalTargetEnvironmentParser.g:879:2: ()
            {
             before(grammarAccess.getTargetEnvironmentAccess().getTargetEnvironmentAction_0()); 
            // InternalTargetEnvironmentParser.g:880:2: ()
            // InternalTargetEnvironmentParser.g:880:3: 
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
    // InternalTargetEnvironmentParser.g:888:1: rule__TargetEnvironment__Group__1 : rule__TargetEnvironment__Group__1__Impl ;
    public final void rule__TargetEnvironment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:892:1: ( rule__TargetEnvironment__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:893:2: rule__TargetEnvironment__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:899:1: rule__TargetEnvironment__Group__1__Impl : ( ( rule__TargetEnvironment__TypeAssignment_1 ) ) ;
    public final void rule__TargetEnvironment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:903:1: ( ( ( rule__TargetEnvironment__TypeAssignment_1 ) ) )
            // InternalTargetEnvironmentParser.g:904:1: ( ( rule__TargetEnvironment__TypeAssignment_1 ) )
            {
            // InternalTargetEnvironmentParser.g:904:1: ( ( rule__TargetEnvironment__TypeAssignment_1 ) )
            // InternalTargetEnvironmentParser.g:905:2: ( rule__TargetEnvironment__TypeAssignment_1 )
            {
             before(grammarAccess.getTargetEnvironmentAccess().getTypeAssignment_1()); 
            // InternalTargetEnvironmentParser.g:906:2: ( rule__TargetEnvironment__TypeAssignment_1 )
            // InternalTargetEnvironmentParser.g:906:3: rule__TargetEnvironment__TypeAssignment_1
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
    // InternalTargetEnvironmentParser.g:915:1: rule__TargetDeployEnviroment__Group__0 : rule__TargetDeployEnviroment__Group__0__Impl rule__TargetDeployEnviroment__Group__1 ;
    public final void rule__TargetDeployEnviroment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:919:1: ( rule__TargetDeployEnviroment__Group__0__Impl rule__TargetDeployEnviroment__Group__1 )
            // InternalTargetEnvironmentParser.g:920:2: rule__TargetDeployEnviroment__Group__0__Impl rule__TargetDeployEnviroment__Group__1
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
    // InternalTargetEnvironmentParser.g:927:1: rule__TargetDeployEnviroment__Group__0__Impl : ( () ) ;
    public final void rule__TargetDeployEnviroment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:931:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:932:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:932:1: ( () )
            // InternalTargetEnvironmentParser.g:933:2: ()
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentAction_0()); 
            // InternalTargetEnvironmentParser.g:934:2: ()
            // InternalTargetEnvironmentParser.g:934:3: 
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
    // InternalTargetEnvironmentParser.g:942:1: rule__TargetDeployEnviroment__Group__1 : rule__TargetDeployEnviroment__Group__1__Impl rule__TargetDeployEnviroment__Group__2 ;
    public final void rule__TargetDeployEnviroment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:946:1: ( rule__TargetDeployEnviroment__Group__1__Impl rule__TargetDeployEnviroment__Group__2 )
            // InternalTargetEnvironmentParser.g:947:2: rule__TargetDeployEnviroment__Group__1__Impl rule__TargetDeployEnviroment__Group__2
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
    // InternalTargetEnvironmentParser.g:954:1: rule__TargetDeployEnviroment__Group__1__Impl : ( TargetDeployEnviroment ) ;
    public final void rule__TargetDeployEnviroment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:958:1: ( ( TargetDeployEnviroment ) )
            // InternalTargetEnvironmentParser.g:959:1: ( TargetDeployEnviroment )
            {
            // InternalTargetEnvironmentParser.g:959:1: ( TargetDeployEnviroment )
            // InternalTargetEnvironmentParser.g:960:2: TargetDeployEnviroment
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
    // InternalTargetEnvironmentParser.g:969:1: rule__TargetDeployEnviroment__Group__2 : rule__TargetDeployEnviroment__Group__2__Impl rule__TargetDeployEnviroment__Group__3 ;
    public final void rule__TargetDeployEnviroment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:973:1: ( rule__TargetDeployEnviroment__Group__2__Impl rule__TargetDeployEnviroment__Group__3 )
            // InternalTargetEnvironmentParser.g:974:2: rule__TargetDeployEnviroment__Group__2__Impl rule__TargetDeployEnviroment__Group__3
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
    // InternalTargetEnvironmentParser.g:981:1: rule__TargetDeployEnviroment__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__TargetDeployEnviroment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:985:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:986:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:986:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:987:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:996:1: rule__TargetDeployEnviroment__Group__3 : rule__TargetDeployEnviroment__Group__3__Impl rule__TargetDeployEnviroment__Group__4 ;
    public final void rule__TargetDeployEnviroment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1000:1: ( rule__TargetDeployEnviroment__Group__3__Impl rule__TargetDeployEnviroment__Group__4 )
            // InternalTargetEnvironmentParser.g:1001:2: rule__TargetDeployEnviroment__Group__3__Impl rule__TargetDeployEnviroment__Group__4
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
    // InternalTargetEnvironmentParser.g:1008:1: rule__TargetDeployEnviroment__Group__3__Impl : ( Name ) ;
    public final void rule__TargetDeployEnviroment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1012:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:1013:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:1013:1: ( Name )
            // InternalTargetEnvironmentParser.g:1014:2: Name
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
    // InternalTargetEnvironmentParser.g:1023:1: rule__TargetDeployEnviroment__Group__4 : rule__TargetDeployEnviroment__Group__4__Impl rule__TargetDeployEnviroment__Group__5 ;
    public final void rule__TargetDeployEnviroment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1027:1: ( rule__TargetDeployEnviroment__Group__4__Impl rule__TargetDeployEnviroment__Group__5 )
            // InternalTargetEnvironmentParser.g:1028:2: rule__TargetDeployEnviroment__Group__4__Impl rule__TargetDeployEnviroment__Group__5
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
    // InternalTargetEnvironmentParser.g:1035:1: rule__TargetDeployEnviroment__Group__4__Impl : ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) ) ;
    public final void rule__TargetDeployEnviroment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1039:1: ( ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) ) )
            // InternalTargetEnvironmentParser.g:1040:1: ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) )
            {
            // InternalTargetEnvironmentParser.g:1040:1: ( ( rule__TargetDeployEnviroment__NameAssignment_4 ) )
            // InternalTargetEnvironmentParser.g:1041:2: ( rule__TargetDeployEnviroment__NameAssignment_4 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getNameAssignment_4()); 
            // InternalTargetEnvironmentParser.g:1042:2: ( rule__TargetDeployEnviroment__NameAssignment_4 )
            // InternalTargetEnvironmentParser.g:1042:3: rule__TargetDeployEnviroment__NameAssignment_4
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
    // InternalTargetEnvironmentParser.g:1050:1: rule__TargetDeployEnviroment__Group__5 : rule__TargetDeployEnviroment__Group__5__Impl rule__TargetDeployEnviroment__Group__6 ;
    public final void rule__TargetDeployEnviroment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1054:1: ( rule__TargetDeployEnviroment__Group__5__Impl rule__TargetDeployEnviroment__Group__6 )
            // InternalTargetEnvironmentParser.g:1055:2: rule__TargetDeployEnviroment__Group__5__Impl rule__TargetDeployEnviroment__Group__6
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
    // InternalTargetEnvironmentParser.g:1062:1: rule__TargetDeployEnviroment__Group__5__Impl : ( ( rule__TargetDeployEnviroment__Group_5__0 )? ) ;
    public final void rule__TargetDeployEnviroment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1066:1: ( ( ( rule__TargetDeployEnviroment__Group_5__0 )? ) )
            // InternalTargetEnvironmentParser.g:1067:1: ( ( rule__TargetDeployEnviroment__Group_5__0 )? )
            {
            // InternalTargetEnvironmentParser.g:1067:1: ( ( rule__TargetDeployEnviroment__Group_5__0 )? )
            // InternalTargetEnvironmentParser.g:1068:2: ( rule__TargetDeployEnviroment__Group_5__0 )?
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getGroup_5()); 
            // InternalTargetEnvironmentParser.g:1069:2: ( rule__TargetDeployEnviroment__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IncludeDevice) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1069:3: rule__TargetDeployEnviroment__Group_5__0
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
    // InternalTargetEnvironmentParser.g:1077:1: rule__TargetDeployEnviroment__Group__6 : rule__TargetDeployEnviroment__Group__6__Impl rule__TargetDeployEnviroment__Group__7 ;
    public final void rule__TargetDeployEnviroment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1081:1: ( rule__TargetDeployEnviroment__Group__6__Impl rule__TargetDeployEnviroment__Group__7 )
            // InternalTargetEnvironmentParser.g:1082:2: rule__TargetDeployEnviroment__Group__6__Impl rule__TargetDeployEnviroment__Group__7
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
    // InternalTargetEnvironmentParser.g:1089:1: rule__TargetDeployEnviroment__Group__6__Impl : ( ( rule__TargetDeployEnviroment__Group_6__0 )? ) ;
    public final void rule__TargetDeployEnviroment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1093:1: ( ( ( rule__TargetDeployEnviroment__Group_6__0 )? ) )
            // InternalTargetEnvironmentParser.g:1094:1: ( ( rule__TargetDeployEnviroment__Group_6__0 )? )
            {
            // InternalTargetEnvironmentParser.g:1094:1: ( ( rule__TargetDeployEnviroment__Group_6__0 )? )
            // InternalTargetEnvironmentParser.g:1095:2: ( rule__TargetDeployEnviroment__Group_6__0 )?
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getGroup_6()); 
            // InternalTargetEnvironmentParser.g:1096:2: ( rule__TargetDeployEnviroment__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ConfigConnection) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1096:3: rule__TargetDeployEnviroment__Group_6__0
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
    // InternalTargetEnvironmentParser.g:1104:1: rule__TargetDeployEnviroment__Group__7 : rule__TargetDeployEnviroment__Group__7__Impl ;
    public final void rule__TargetDeployEnviroment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1108:1: ( rule__TargetDeployEnviroment__Group__7__Impl )
            // InternalTargetEnvironmentParser.g:1109:2: rule__TargetDeployEnviroment__Group__7__Impl
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
    // InternalTargetEnvironmentParser.g:1115:1: rule__TargetDeployEnviroment__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__TargetDeployEnviroment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1119:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1120:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1120:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1121:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1131:1: rule__TargetDeployEnviroment__Group_5__0 : rule__TargetDeployEnviroment__Group_5__0__Impl rule__TargetDeployEnviroment__Group_5__1 ;
    public final void rule__TargetDeployEnviroment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1135:1: ( rule__TargetDeployEnviroment__Group_5__0__Impl rule__TargetDeployEnviroment__Group_5__1 )
            // InternalTargetEnvironmentParser.g:1136:2: rule__TargetDeployEnviroment__Group_5__0__Impl rule__TargetDeployEnviroment__Group_5__1
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
    // InternalTargetEnvironmentParser.g:1143:1: rule__TargetDeployEnviroment__Group_5__0__Impl : ( IncludeDevice ) ;
    public final void rule__TargetDeployEnviroment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1147:1: ( ( IncludeDevice ) )
            // InternalTargetEnvironmentParser.g:1148:1: ( IncludeDevice )
            {
            // InternalTargetEnvironmentParser.g:1148:1: ( IncludeDevice )
            // InternalTargetEnvironmentParser.g:1149:2: IncludeDevice
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
    // InternalTargetEnvironmentParser.g:1158:1: rule__TargetDeployEnviroment__Group_5__1 : rule__TargetDeployEnviroment__Group_5__1__Impl rule__TargetDeployEnviroment__Group_5__2 ;
    public final void rule__TargetDeployEnviroment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1162:1: ( rule__TargetDeployEnviroment__Group_5__1__Impl rule__TargetDeployEnviroment__Group_5__2 )
            // InternalTargetEnvironmentParser.g:1163:2: rule__TargetDeployEnviroment__Group_5__1__Impl rule__TargetDeployEnviroment__Group_5__2
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
    // InternalTargetEnvironmentParser.g:1170:1: rule__TargetDeployEnviroment__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1174:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1175:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1175:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1176:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:1185:1: rule__TargetDeployEnviroment__Group_5__2 : rule__TargetDeployEnviroment__Group_5__2__Impl rule__TargetDeployEnviroment__Group_5__3 ;
    public final void rule__TargetDeployEnviroment__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1189:1: ( rule__TargetDeployEnviroment__Group_5__2__Impl rule__TargetDeployEnviroment__Group_5__3 )
            // InternalTargetEnvironmentParser.g:1190:2: rule__TargetDeployEnviroment__Group_5__2__Impl rule__TargetDeployEnviroment__Group_5__3
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
    // InternalTargetEnvironmentParser.g:1197:1: rule__TargetDeployEnviroment__Group_5__2__Impl : ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) ) ;
    public final void rule__TargetDeployEnviroment__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1201:1: ( ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:1202:1: ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:1202:1: ( ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* ) )
            // InternalTargetEnvironmentParser.g:1203:2: ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) ) ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* )
            {
            // InternalTargetEnvironmentParser.g:1203:2: ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 ) )
            // InternalTargetEnvironmentParser.g:1204:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:1205:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )
            // InternalTargetEnvironmentParser.g:1205:4: rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2
            {
            pushFollow(FOLLOW_11);
            rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 

            }

            // InternalTargetEnvironmentParser.g:1208:2: ( ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )* )
            // InternalTargetEnvironmentParser.g:1209:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )*
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:1210:3: ( rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==HyphenMinus) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:1210:4: rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalTargetEnvironmentParser.g:1219:1: rule__TargetDeployEnviroment__Group_5__3 : rule__TargetDeployEnviroment__Group_5__3__Impl ;
    public final void rule__TargetDeployEnviroment__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1223:1: ( rule__TargetDeployEnviroment__Group_5__3__Impl )
            // InternalTargetEnvironmentParser.g:1224:2: rule__TargetDeployEnviroment__Group_5__3__Impl
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
    // InternalTargetEnvironmentParser.g:1230:1: rule__TargetDeployEnviroment__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1234:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1235:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1235:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1236:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1246:1: rule__TargetDeployEnviroment__Group_6__0 : rule__TargetDeployEnviroment__Group_6__0__Impl rule__TargetDeployEnviroment__Group_6__1 ;
    public final void rule__TargetDeployEnviroment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1250:1: ( rule__TargetDeployEnviroment__Group_6__0__Impl rule__TargetDeployEnviroment__Group_6__1 )
            // InternalTargetEnvironmentParser.g:1251:2: rule__TargetDeployEnviroment__Group_6__0__Impl rule__TargetDeployEnviroment__Group_6__1
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
    // InternalTargetEnvironmentParser.g:1258:1: rule__TargetDeployEnviroment__Group_6__0__Impl : ( ConfigConnection ) ;
    public final void rule__TargetDeployEnviroment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1262:1: ( ( ConfigConnection ) )
            // InternalTargetEnvironmentParser.g:1263:1: ( ConfigConnection )
            {
            // InternalTargetEnvironmentParser.g:1263:1: ( ConfigConnection )
            // InternalTargetEnvironmentParser.g:1264:2: ConfigConnection
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
    // InternalTargetEnvironmentParser.g:1273:1: rule__TargetDeployEnviroment__Group_6__1 : rule__TargetDeployEnviroment__Group_6__1__Impl rule__TargetDeployEnviroment__Group_6__2 ;
    public final void rule__TargetDeployEnviroment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1277:1: ( rule__TargetDeployEnviroment__Group_6__1__Impl rule__TargetDeployEnviroment__Group_6__2 )
            // InternalTargetEnvironmentParser.g:1278:2: rule__TargetDeployEnviroment__Group_6__1__Impl rule__TargetDeployEnviroment__Group_6__2
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
    // InternalTargetEnvironmentParser.g:1285:1: rule__TargetDeployEnviroment__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1289:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1290:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1290:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1291:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:1300:1: rule__TargetDeployEnviroment__Group_6__2 : rule__TargetDeployEnviroment__Group_6__2__Impl rule__TargetDeployEnviroment__Group_6__3 ;
    public final void rule__TargetDeployEnviroment__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1304:1: ( rule__TargetDeployEnviroment__Group_6__2__Impl rule__TargetDeployEnviroment__Group_6__3 )
            // InternalTargetEnvironmentParser.g:1305:2: rule__TargetDeployEnviroment__Group_6__2__Impl rule__TargetDeployEnviroment__Group_6__3
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
    // InternalTargetEnvironmentParser.g:1312:1: rule__TargetDeployEnviroment__Group_6__2__Impl : ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) ) ;
    public final void rule__TargetDeployEnviroment__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1316:1: ( ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:1317:1: ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:1317:1: ( ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* ) )
            // InternalTargetEnvironmentParser.g:1318:2: ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) ) ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* )
            {
            // InternalTargetEnvironmentParser.g:1318:2: ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 ) )
            // InternalTargetEnvironmentParser.g:1319:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:1320:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )
            // InternalTargetEnvironmentParser.g:1320:4: rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 

            }

            // InternalTargetEnvironmentParser.g:1323:2: ( ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )* )
            // InternalTargetEnvironmentParser.g:1324:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:1325:3: ( rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==HyphenMinus) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:1325:4: rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalTargetEnvironmentParser.g:1334:1: rule__TargetDeployEnviroment__Group_6__3 : rule__TargetDeployEnviroment__Group_6__3__Impl ;
    public final void rule__TargetDeployEnviroment__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1338:1: ( rule__TargetDeployEnviroment__Group_6__3__Impl )
            // InternalTargetEnvironmentParser.g:1339:2: rule__TargetDeployEnviroment__Group_6__3__Impl
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
    // InternalTargetEnvironmentParser.g:1345:1: rule__TargetDeployEnviroment__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__TargetDeployEnviroment__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1349:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1350:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1350:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1351:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1361:1: rule__DeviceInstance__Group__0 : rule__DeviceInstance__Group__0__Impl rule__DeviceInstance__Group__1 ;
    public final void rule__DeviceInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1365:1: ( rule__DeviceInstance__Group__0__Impl rule__DeviceInstance__Group__1 )
            // InternalTargetEnvironmentParser.g:1366:2: rule__DeviceInstance__Group__0__Impl rule__DeviceInstance__Group__1
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
    // InternalTargetEnvironmentParser.g:1373:1: rule__DeviceInstance__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__DeviceInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1377:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:1378:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:1378:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:1379:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:1388:1: rule__DeviceInstance__Group__1 : rule__DeviceInstance__Group__1__Impl rule__DeviceInstance__Group__2 ;
    public final void rule__DeviceInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1392:1: ( rule__DeviceInstance__Group__1__Impl rule__DeviceInstance__Group__2 )
            // InternalTargetEnvironmentParser.g:1393:2: rule__DeviceInstance__Group__1__Impl rule__DeviceInstance__Group__2
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
    // InternalTargetEnvironmentParser.g:1400:1: rule__DeviceInstance__Group__1__Impl : ( Name ) ;
    public final void rule__DeviceInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1404:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:1405:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:1405:1: ( Name )
            // InternalTargetEnvironmentParser.g:1406:2: Name
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
    // InternalTargetEnvironmentParser.g:1415:1: rule__DeviceInstance__Group__2 : rule__DeviceInstance__Group__2__Impl rule__DeviceInstance__Group__3 ;
    public final void rule__DeviceInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1419:1: ( rule__DeviceInstance__Group__2__Impl rule__DeviceInstance__Group__3 )
            // InternalTargetEnvironmentParser.g:1420:2: rule__DeviceInstance__Group__2__Impl rule__DeviceInstance__Group__3
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
    // InternalTargetEnvironmentParser.g:1427:1: rule__DeviceInstance__Group__2__Impl : ( ( rule__DeviceInstance__NameAssignment_2 ) ) ;
    public final void rule__DeviceInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1431:1: ( ( ( rule__DeviceInstance__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:1432:1: ( ( rule__DeviceInstance__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:1432:1: ( ( rule__DeviceInstance__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:1433:2: ( rule__DeviceInstance__NameAssignment_2 )
            {
             before(grammarAccess.getDeviceInstanceAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:1434:2: ( rule__DeviceInstance__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:1434:3: rule__DeviceInstance__NameAssignment_2
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
    // InternalTargetEnvironmentParser.g:1442:1: rule__DeviceInstance__Group__3 : rule__DeviceInstance__Group__3__Impl rule__DeviceInstance__Group__4 ;
    public final void rule__DeviceInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1446:1: ( rule__DeviceInstance__Group__3__Impl rule__DeviceInstance__Group__4 )
            // InternalTargetEnvironmentParser.g:1447:2: rule__DeviceInstance__Group__3__Impl rule__DeviceInstance__Group__4
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
    // InternalTargetEnvironmentParser.g:1454:1: rule__DeviceInstance__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1458:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1459:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1459:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1460:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:1469:1: rule__DeviceInstance__Group__4 : rule__DeviceInstance__Group__4__Impl rule__DeviceInstance__Group__5 ;
    public final void rule__DeviceInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1473:1: ( rule__DeviceInstance__Group__4__Impl rule__DeviceInstance__Group__5 )
            // InternalTargetEnvironmentParser.g:1474:2: rule__DeviceInstance__Group__4__Impl rule__DeviceInstance__Group__5
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
    // InternalTargetEnvironmentParser.g:1481:1: rule__DeviceInstance__Group__4__Impl : ( RefDeviceType ) ;
    public final void rule__DeviceInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1485:1: ( ( RefDeviceType ) )
            // InternalTargetEnvironmentParser.g:1486:1: ( RefDeviceType )
            {
            // InternalTargetEnvironmentParser.g:1486:1: ( RefDeviceType )
            // InternalTargetEnvironmentParser.g:1487:2: RefDeviceType
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
    // InternalTargetEnvironmentParser.g:1496:1: rule__DeviceInstance__Group__5 : rule__DeviceInstance__Group__5__Impl rule__DeviceInstance__Group__6 ;
    public final void rule__DeviceInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1500:1: ( rule__DeviceInstance__Group__5__Impl rule__DeviceInstance__Group__6 )
            // InternalTargetEnvironmentParser.g:1501:2: rule__DeviceInstance__Group__5__Impl rule__DeviceInstance__Group__6
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
    // InternalTargetEnvironmentParser.g:1508:1: rule__DeviceInstance__Group__5__Impl : ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) ) ;
    public final void rule__DeviceInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1512:1: ( ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:1513:1: ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:1513:1: ( ( rule__DeviceInstance__RefDeviceTypeAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:1514:2: ( rule__DeviceInstance__RefDeviceTypeAssignment_5 )
            {
             before(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeAssignment_5()); 
            // InternalTargetEnvironmentParser.g:1515:2: ( rule__DeviceInstance__RefDeviceTypeAssignment_5 )
            // InternalTargetEnvironmentParser.g:1515:3: rule__DeviceInstance__RefDeviceTypeAssignment_5
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
    // InternalTargetEnvironmentParser.g:1523:1: rule__DeviceInstance__Group__6 : rule__DeviceInstance__Group__6__Impl ;
    public final void rule__DeviceInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1527:1: ( rule__DeviceInstance__Group__6__Impl )
            // InternalTargetEnvironmentParser.g:1528:2: rule__DeviceInstance__Group__6__Impl
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
    // InternalTargetEnvironmentParser.g:1534:1: rule__DeviceInstance__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1538:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1539:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1539:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1540:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1550:1: rule__ConfigConnection__Group__0 : rule__ConfigConnection__Group__0__Impl rule__ConfigConnection__Group__1 ;
    public final void rule__ConfigConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1554:1: ( rule__ConfigConnection__Group__0__Impl rule__ConfigConnection__Group__1 )
            // InternalTargetEnvironmentParser.g:1555:2: rule__ConfigConnection__Group__0__Impl rule__ConfigConnection__Group__1
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
    // InternalTargetEnvironmentParser.g:1562:1: rule__ConfigConnection__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__ConfigConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1566:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:1567:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:1567:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:1568:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:1577:1: rule__ConfigConnection__Group__1 : rule__ConfigConnection__Group__1__Impl rule__ConfigConnection__Group__2 ;
    public final void rule__ConfigConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1581:1: ( rule__ConfigConnection__Group__1__Impl rule__ConfigConnection__Group__2 )
            // InternalTargetEnvironmentParser.g:1582:2: rule__ConfigConnection__Group__1__Impl rule__ConfigConnection__Group__2
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
    // InternalTargetEnvironmentParser.g:1589:1: rule__ConfigConnection__Group__1__Impl : ( Name ) ;
    public final void rule__ConfigConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1593:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:1594:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:1594:1: ( Name )
            // InternalTargetEnvironmentParser.g:1595:2: Name
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
    // InternalTargetEnvironmentParser.g:1604:1: rule__ConfigConnection__Group__2 : rule__ConfigConnection__Group__2__Impl rule__ConfigConnection__Group__3 ;
    public final void rule__ConfigConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1608:1: ( rule__ConfigConnection__Group__2__Impl rule__ConfigConnection__Group__3 )
            // InternalTargetEnvironmentParser.g:1609:2: rule__ConfigConnection__Group__2__Impl rule__ConfigConnection__Group__3
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
    // InternalTargetEnvironmentParser.g:1616:1: rule__ConfigConnection__Group__2__Impl : ( ( rule__ConfigConnection__NameAssignment_2 ) ) ;
    public final void rule__ConfigConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1620:1: ( ( ( rule__ConfigConnection__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:1621:1: ( ( rule__ConfigConnection__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:1621:1: ( ( rule__ConfigConnection__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:1622:2: ( rule__ConfigConnection__NameAssignment_2 )
            {
             before(grammarAccess.getConfigConnectionAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:1623:2: ( rule__ConfigConnection__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:1623:3: rule__ConfigConnection__NameAssignment_2
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
    // InternalTargetEnvironmentParser.g:1631:1: rule__ConfigConnection__Group__3 : rule__ConfigConnection__Group__3__Impl rule__ConfigConnection__Group__4 ;
    public final void rule__ConfigConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1635:1: ( rule__ConfigConnection__Group__3__Impl rule__ConfigConnection__Group__4 )
            // InternalTargetEnvironmentParser.g:1636:2: rule__ConfigConnection__Group__3__Impl rule__ConfigConnection__Group__4
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
    // InternalTargetEnvironmentParser.g:1643:1: rule__ConfigConnection__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__ConfigConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1647:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1648:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1648:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1649:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:1658:1: rule__ConfigConnection__Group__4 : rule__ConfigConnection__Group__4__Impl rule__ConfigConnection__Group__5 ;
    public final void rule__ConfigConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1662:1: ( rule__ConfigConnection__Group__4__Impl rule__ConfigConnection__Group__5 )
            // InternalTargetEnvironmentParser.g:1663:2: rule__ConfigConnection__Group__4__Impl rule__ConfigConnection__Group__5
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
    // InternalTargetEnvironmentParser.g:1670:1: rule__ConfigConnection__Group__4__Impl : ( ConnectDevice ) ;
    public final void rule__ConfigConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1674:1: ( ( ConnectDevice ) )
            // InternalTargetEnvironmentParser.g:1675:1: ( ConnectDevice )
            {
            // InternalTargetEnvironmentParser.g:1675:1: ( ConnectDevice )
            // InternalTargetEnvironmentParser.g:1676:2: ConnectDevice
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
    // InternalTargetEnvironmentParser.g:1685:1: rule__ConfigConnection__Group__5 : rule__ConfigConnection__Group__5__Impl rule__ConfigConnection__Group__6 ;
    public final void rule__ConfigConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1689:1: ( rule__ConfigConnection__Group__5__Impl rule__ConfigConnection__Group__6 )
            // InternalTargetEnvironmentParser.g:1690:2: rule__ConfigConnection__Group__5__Impl rule__ConfigConnection__Group__6
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
    // InternalTargetEnvironmentParser.g:1697:1: rule__ConfigConnection__Group__5__Impl : ( RULE_INDENT ) ;
    public final void rule__ConfigConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1701:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1702:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1702:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1703:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:1712:1: rule__ConfigConnection__Group__6 : rule__ConfigConnection__Group__6__Impl rule__ConfigConnection__Group__7 ;
    public final void rule__ConfigConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1716:1: ( rule__ConfigConnection__Group__6__Impl rule__ConfigConnection__Group__7 )
            // InternalTargetEnvironmentParser.g:1717:2: rule__ConfigConnection__Group__6__Impl rule__ConfigConnection__Group__7
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
    // InternalTargetEnvironmentParser.g:1724:1: rule__ConfigConnection__Group__6__Impl : ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) ) ;
    public final void rule__ConfigConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1728:1: ( ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) ) )
            // InternalTargetEnvironmentParser.g:1729:1: ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) )
            {
            // InternalTargetEnvironmentParser.g:1729:1: ( ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* ) )
            // InternalTargetEnvironmentParser.g:1730:2: ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) ) ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* )
            {
            // InternalTargetEnvironmentParser.g:1730:2: ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 ) )
            // InternalTargetEnvironmentParser.g:1731:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )
            {
             before(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 
            // InternalTargetEnvironmentParser.g:1732:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )
            // InternalTargetEnvironmentParser.g:1732:4: rule__ConfigConnection__ConnectDeviceAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__ConfigConnection__ConnectDeviceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 

            }

            // InternalTargetEnvironmentParser.g:1735:2: ( ( rule__ConfigConnection__ConnectDeviceAssignment_6 )* )
            // InternalTargetEnvironmentParser.g:1736:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )*
            {
             before(grammarAccess.getConfigConnectionAccess().getConnectDeviceAssignment_6()); 
            // InternalTargetEnvironmentParser.g:1737:3: ( rule__ConfigConnection__ConnectDeviceAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==HyphenMinus) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:1737:4: rule__ConfigConnection__ConnectDeviceAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConfigConnection__ConnectDeviceAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalTargetEnvironmentParser.g:1746:1: rule__ConfigConnection__Group__7 : rule__ConfigConnection__Group__7__Impl rule__ConfigConnection__Group__8 ;
    public final void rule__ConfigConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1750:1: ( rule__ConfigConnection__Group__7__Impl rule__ConfigConnection__Group__8 )
            // InternalTargetEnvironmentParser.g:1751:2: rule__ConfigConnection__Group__7__Impl rule__ConfigConnection__Group__8
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
    // InternalTargetEnvironmentParser.g:1758:1: rule__ConfigConnection__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConfigConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1762:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1763:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1763:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1764:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1773:1: rule__ConfigConnection__Group__8 : rule__ConfigConnection__Group__8__Impl ;
    public final void rule__ConfigConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1777:1: ( rule__ConfigConnection__Group__8__Impl )
            // InternalTargetEnvironmentParser.g:1778:2: rule__ConfigConnection__Group__8__Impl
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
    // InternalTargetEnvironmentParser.g:1784:1: rule__ConfigConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConfigConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1788:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1789:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1789:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1790:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:1800:1: rule__ConnectedDevice__Group__0 : rule__ConnectedDevice__Group__0__Impl rule__ConnectedDevice__Group__1 ;
    public final void rule__ConnectedDevice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1804:1: ( rule__ConnectedDevice__Group__0__Impl rule__ConnectedDevice__Group__1 )
            // InternalTargetEnvironmentParser.g:1805:2: rule__ConnectedDevice__Group__0__Impl rule__ConnectedDevice__Group__1
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
    // InternalTargetEnvironmentParser.g:1812:1: rule__ConnectedDevice__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectedDevice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1816:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:1817:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:1817:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:1818:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:1827:1: rule__ConnectedDevice__Group__1 : rule__ConnectedDevice__Group__1__Impl rule__ConnectedDevice__Group__2 ;
    public final void rule__ConnectedDevice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1831:1: ( rule__ConnectedDevice__Group__1__Impl rule__ConnectedDevice__Group__2 )
            // InternalTargetEnvironmentParser.g:1832:2: rule__ConnectedDevice__Group__1__Impl rule__ConnectedDevice__Group__2
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
    // InternalTargetEnvironmentParser.g:1839:1: rule__ConnectedDevice__Group__1__Impl : ( RefDevice ) ;
    public final void rule__ConnectedDevice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1843:1: ( ( RefDevice ) )
            // InternalTargetEnvironmentParser.g:1844:1: ( RefDevice )
            {
            // InternalTargetEnvironmentParser.g:1844:1: ( RefDevice )
            // InternalTargetEnvironmentParser.g:1845:2: RefDevice
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
    // InternalTargetEnvironmentParser.g:1854:1: rule__ConnectedDevice__Group__2 : rule__ConnectedDevice__Group__2__Impl rule__ConnectedDevice__Group__3 ;
    public final void rule__ConnectedDevice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1858:1: ( rule__ConnectedDevice__Group__2__Impl rule__ConnectedDevice__Group__3 )
            // InternalTargetEnvironmentParser.g:1859:2: rule__ConnectedDevice__Group__2__Impl rule__ConnectedDevice__Group__3
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
    // InternalTargetEnvironmentParser.g:1866:1: rule__ConnectedDevice__Group__2__Impl : ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) ) ;
    public final void rule__ConnectedDevice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1870:1: ( ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:1871:1: ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:1871:1: ( ( rule__ConnectedDevice__RefDeviceAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:1872:2: ( rule__ConnectedDevice__RefDeviceAssignment_2 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefDeviceAssignment_2()); 
            // InternalTargetEnvironmentParser.g:1873:2: ( rule__ConnectedDevice__RefDeviceAssignment_2 )
            // InternalTargetEnvironmentParser.g:1873:3: rule__ConnectedDevice__RefDeviceAssignment_2
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
    // InternalTargetEnvironmentParser.g:1881:1: rule__ConnectedDevice__Group__3 : rule__ConnectedDevice__Group__3__Impl rule__ConnectedDevice__Group__4 ;
    public final void rule__ConnectedDevice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1885:1: ( rule__ConnectedDevice__Group__3__Impl rule__ConnectedDevice__Group__4 )
            // InternalTargetEnvironmentParser.g:1886:2: rule__ConnectedDevice__Group__3__Impl rule__ConnectedDevice__Group__4
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
    // InternalTargetEnvironmentParser.g:1893:1: rule__ConnectedDevice__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectedDevice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1897:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:1898:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:1898:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:1899:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:1908:1: rule__ConnectedDevice__Group__4 : rule__ConnectedDevice__Group__4__Impl rule__ConnectedDevice__Group__5 ;
    public final void rule__ConnectedDevice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1912:1: ( rule__ConnectedDevice__Group__4__Impl rule__ConnectedDevice__Group__5 )
            // InternalTargetEnvironmentParser.g:1913:2: rule__ConnectedDevice__Group__4__Impl rule__ConnectedDevice__Group__5
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
    // InternalTargetEnvironmentParser.g:1920:1: rule__ConnectedDevice__Group__4__Impl : ( RefConnection ) ;
    public final void rule__ConnectedDevice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1924:1: ( ( RefConnection ) )
            // InternalTargetEnvironmentParser.g:1925:1: ( RefConnection )
            {
            // InternalTargetEnvironmentParser.g:1925:1: ( RefConnection )
            // InternalTargetEnvironmentParser.g:1926:2: RefConnection
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
    // InternalTargetEnvironmentParser.g:1935:1: rule__ConnectedDevice__Group__5 : rule__ConnectedDevice__Group__5__Impl rule__ConnectedDevice__Group__6 ;
    public final void rule__ConnectedDevice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1939:1: ( rule__ConnectedDevice__Group__5__Impl rule__ConnectedDevice__Group__6 )
            // InternalTargetEnvironmentParser.g:1940:2: rule__ConnectedDevice__Group__5__Impl rule__ConnectedDevice__Group__6
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
    // InternalTargetEnvironmentParser.g:1947:1: rule__ConnectedDevice__Group__5__Impl : ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) ) ;
    public final void rule__ConnectedDevice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1951:1: ( ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:1952:1: ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:1952:1: ( ( rule__ConnectedDevice__RefConnectionAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:1953:2: ( rule__ConnectedDevice__RefConnectionAssignment_5 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefConnectionAssignment_5()); 
            // InternalTargetEnvironmentParser.g:1954:2: ( rule__ConnectedDevice__RefConnectionAssignment_5 )
            // InternalTargetEnvironmentParser.g:1954:3: rule__ConnectedDevice__RefConnectionAssignment_5
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
    // InternalTargetEnvironmentParser.g:1962:1: rule__ConnectedDevice__Group__6 : rule__ConnectedDevice__Group__6__Impl rule__ConnectedDevice__Group__7 ;
    public final void rule__ConnectedDevice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1966:1: ( rule__ConnectedDevice__Group__6__Impl rule__ConnectedDevice__Group__7 )
            // InternalTargetEnvironmentParser.g:1967:2: rule__ConnectedDevice__Group__6__Impl rule__ConnectedDevice__Group__7
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
    // InternalTargetEnvironmentParser.g:1974:1: rule__ConnectedDevice__Group__6__Impl : ( ( rule__ConnectedDevice__Group_6__0 )? ) ;
    public final void rule__ConnectedDevice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1978:1: ( ( ( rule__ConnectedDevice__Group_6__0 )? ) )
            // InternalTargetEnvironmentParser.g:1979:1: ( ( rule__ConnectedDevice__Group_6__0 )? )
            {
            // InternalTargetEnvironmentParser.g:1979:1: ( ( rule__ConnectedDevice__Group_6__0 )? )
            // InternalTargetEnvironmentParser.g:1980:2: ( rule__ConnectedDevice__Group_6__0 )?
            {
             before(grammarAccess.getConnectedDeviceAccess().getGroup_6()); 
            // InternalTargetEnvironmentParser.g:1981:2: ( rule__ConnectedDevice__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Configuration) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1981:3: rule__ConnectedDevice__Group_6__0
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
    // InternalTargetEnvironmentParser.g:1989:1: rule__ConnectedDevice__Group__7 : rule__ConnectedDevice__Group__7__Impl ;
    public final void rule__ConnectedDevice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:1993:1: ( rule__ConnectedDevice__Group__7__Impl )
            // InternalTargetEnvironmentParser.g:1994:2: rule__ConnectedDevice__Group__7__Impl
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
    // InternalTargetEnvironmentParser.g:2000:1: rule__ConnectedDevice__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectedDevice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2004:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2005:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2005:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2006:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2016:1: rule__ConnectedDevice__Group_6__0 : rule__ConnectedDevice__Group_6__0__Impl rule__ConnectedDevice__Group_6__1 ;
    public final void rule__ConnectedDevice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2020:1: ( rule__ConnectedDevice__Group_6__0__Impl rule__ConnectedDevice__Group_6__1 )
            // InternalTargetEnvironmentParser.g:2021:2: rule__ConnectedDevice__Group_6__0__Impl rule__ConnectedDevice__Group_6__1
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
    // InternalTargetEnvironmentParser.g:2028:1: rule__ConnectedDevice__Group_6__0__Impl : ( Configuration ) ;
    public final void rule__ConnectedDevice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2032:1: ( ( Configuration ) )
            // InternalTargetEnvironmentParser.g:2033:1: ( Configuration )
            {
            // InternalTargetEnvironmentParser.g:2033:1: ( Configuration )
            // InternalTargetEnvironmentParser.g:2034:2: Configuration
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
    // InternalTargetEnvironmentParser.g:2043:1: rule__ConnectedDevice__Group_6__1 : rule__ConnectedDevice__Group_6__1__Impl rule__ConnectedDevice__Group_6__2 ;
    public final void rule__ConnectedDevice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2047:1: ( rule__ConnectedDevice__Group_6__1__Impl rule__ConnectedDevice__Group_6__2 )
            // InternalTargetEnvironmentParser.g:2048:2: rule__ConnectedDevice__Group_6__1__Impl rule__ConnectedDevice__Group_6__2
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
    // InternalTargetEnvironmentParser.g:2055:1: rule__ConnectedDevice__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectedDevice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2059:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2060:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2060:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2061:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2070:1: rule__ConnectedDevice__Group_6__2 : rule__ConnectedDevice__Group_6__2__Impl rule__ConnectedDevice__Group_6__3 ;
    public final void rule__ConnectedDevice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2074:1: ( rule__ConnectedDevice__Group_6__2__Impl rule__ConnectedDevice__Group_6__3 )
            // InternalTargetEnvironmentParser.g:2075:2: rule__ConnectedDevice__Group_6__2__Impl rule__ConnectedDevice__Group_6__3
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
    // InternalTargetEnvironmentParser.g:2082:1: rule__ConnectedDevice__Group_6__2__Impl : ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) ) ;
    public final void rule__ConnectedDevice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2086:1: ( ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:2087:1: ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:2087:1: ( ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* ) )
            // InternalTargetEnvironmentParser.g:2088:2: ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) ) ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* )
            {
            // InternalTargetEnvironmentParser.g:2088:2: ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 ) )
            // InternalTargetEnvironmentParser.g:2089:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )
            {
             before(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:2090:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )
            // InternalTargetEnvironmentParser.g:2090:4: rule__ConnectedDevice__PropertiesAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__ConnectedDevice__PropertiesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 

            }

            // InternalTargetEnvironmentParser.g:2093:2: ( ( rule__ConnectedDevice__PropertiesAssignment_6_2 )* )
            // InternalTargetEnvironmentParser.g:2094:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )*
            {
             before(grammarAccess.getConnectedDeviceAccess().getPropertiesAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:2095:3: ( rule__ConnectedDevice__PropertiesAssignment_6_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==HyphenMinus) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:2095:4: rule__ConnectedDevice__PropertiesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ConnectedDevice__PropertiesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalTargetEnvironmentParser.g:2104:1: rule__ConnectedDevice__Group_6__3 : rule__ConnectedDevice__Group_6__3__Impl ;
    public final void rule__ConnectedDevice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2108:1: ( rule__ConnectedDevice__Group_6__3__Impl )
            // InternalTargetEnvironmentParser.g:2109:2: rule__ConnectedDevice__Group_6__3__Impl
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
    // InternalTargetEnvironmentParser.g:2115:1: rule__ConnectedDevice__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectedDevice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2119:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2120:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2120:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2121:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:2131:1: rule__ConfigConnectionProperty__Group__0 : rule__ConfigConnectionProperty__Group__0__Impl rule__ConfigConnectionProperty__Group__1 ;
    public final void rule__ConfigConnectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2135:1: ( rule__ConfigConnectionProperty__Group__0__Impl rule__ConfigConnectionProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:2136:2: rule__ConfigConnectionProperty__Group__0__Impl rule__ConfigConnectionProperty__Group__1
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
    // InternalTargetEnvironmentParser.g:2143:1: rule__ConfigConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConfigConnectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2147:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:2148:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:2148:1: ( () )
            // InternalTargetEnvironmentParser.g:2149:2: ()
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getConfigConnectionPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:2150:2: ()
            // InternalTargetEnvironmentParser.g:2150:3: 
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
    // InternalTargetEnvironmentParser.g:2158:1: rule__ConfigConnectionProperty__Group__1 : rule__ConfigConnectionProperty__Group__1__Impl rule__ConfigConnectionProperty__Group__2 ;
    public final void rule__ConfigConnectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2162:1: ( rule__ConfigConnectionProperty__Group__1__Impl rule__ConfigConnectionProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:2163:2: rule__ConfigConnectionProperty__Group__1__Impl rule__ConfigConnectionProperty__Group__2
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
    // InternalTargetEnvironmentParser.g:2170:1: rule__ConfigConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConfigConnectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2174:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:2175:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:2175:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:2176:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:2185:1: rule__ConfigConnectionProperty__Group__2 : rule__ConfigConnectionProperty__Group__2__Impl rule__ConfigConnectionProperty__Group__3 ;
    public final void rule__ConfigConnectionProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2189:1: ( rule__ConfigConnectionProperty__Group__2__Impl rule__ConfigConnectionProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:2190:2: rule__ConfigConnectionProperty__Group__2__Impl rule__ConfigConnectionProperty__Group__3
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
    // InternalTargetEnvironmentParser.g:2197:1: rule__ConfigConnectionProperty__Group__2__Impl : ( RefConnectionProperty ) ;
    public final void rule__ConfigConnectionProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2201:1: ( ( RefConnectionProperty ) )
            // InternalTargetEnvironmentParser.g:2202:1: ( RefConnectionProperty )
            {
            // InternalTargetEnvironmentParser.g:2202:1: ( RefConnectionProperty )
            // InternalTargetEnvironmentParser.g:2203:2: RefConnectionProperty
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
    // InternalTargetEnvironmentParser.g:2212:1: rule__ConfigConnectionProperty__Group__3 : rule__ConfigConnectionProperty__Group__3__Impl rule__ConfigConnectionProperty__Group__4 ;
    public final void rule__ConfigConnectionProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2216:1: ( rule__ConfigConnectionProperty__Group__3__Impl rule__ConfigConnectionProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:2217:2: rule__ConfigConnectionProperty__Group__3__Impl rule__ConfigConnectionProperty__Group__4
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
    // InternalTargetEnvironmentParser.g:2224:1: rule__ConfigConnectionProperty__Group__3__Impl : ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) ) ;
    public final void rule__ConfigConnectionProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2228:1: ( ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:2229:1: ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:2229:1: ( ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:2230:2: ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyAssignment_3()); 
            // InternalTargetEnvironmentParser.g:2231:2: ( rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 )
            // InternalTargetEnvironmentParser.g:2231:3: rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3
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
    // InternalTargetEnvironmentParser.g:2239:1: rule__ConfigConnectionProperty__Group__4 : rule__ConfigConnectionProperty__Group__4__Impl ;
    public final void rule__ConfigConnectionProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2243:1: ( rule__ConfigConnectionProperty__Group__4__Impl )
            // InternalTargetEnvironmentParser.g:2244:2: rule__ConfigConnectionProperty__Group__4__Impl
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
    // InternalTargetEnvironmentParser.g:2250:1: rule__ConfigConnectionProperty__Group__4__Impl : ( ( rule__ConfigConnectionProperty__Group_4__0 )? ) ;
    public final void rule__ConfigConnectionProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2254:1: ( ( ( rule__ConfigConnectionProperty__Group_4__0 )? ) )
            // InternalTargetEnvironmentParser.g:2255:1: ( ( rule__ConfigConnectionProperty__Group_4__0 )? )
            {
            // InternalTargetEnvironmentParser.g:2255:1: ( ( rule__ConfigConnectionProperty__Group_4__0 )? )
            // InternalTargetEnvironmentParser.g:2256:2: ( rule__ConfigConnectionProperty__Group_4__0 )?
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getGroup_4()); 
            // InternalTargetEnvironmentParser.g:2257:2: ( rule__ConfigConnectionProperty__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INDENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2257:3: rule__ConfigConnectionProperty__Group_4__0
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
    // InternalTargetEnvironmentParser.g:2266:1: rule__ConfigConnectionProperty__Group_4__0 : rule__ConfigConnectionProperty__Group_4__0__Impl rule__ConfigConnectionProperty__Group_4__1 ;
    public final void rule__ConfigConnectionProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2270:1: ( rule__ConfigConnectionProperty__Group_4__0__Impl rule__ConfigConnectionProperty__Group_4__1 )
            // InternalTargetEnvironmentParser.g:2271:2: rule__ConfigConnectionProperty__Group_4__0__Impl rule__ConfigConnectionProperty__Group_4__1
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
    // InternalTargetEnvironmentParser.g:2278:1: rule__ConfigConnectionProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__ConfigConnectionProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2282:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2283:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2283:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2284:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2293:1: rule__ConfigConnectionProperty__Group_4__1 : rule__ConfigConnectionProperty__Group_4__1__Impl rule__ConfigConnectionProperty__Group_4__2 ;
    public final void rule__ConfigConnectionProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2297:1: ( rule__ConfigConnectionProperty__Group_4__1__Impl rule__ConfigConnectionProperty__Group_4__2 )
            // InternalTargetEnvironmentParser.g:2298:2: rule__ConfigConnectionProperty__Group_4__1__Impl rule__ConfigConnectionProperty__Group_4__2
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
    // InternalTargetEnvironmentParser.g:2305:1: rule__ConfigConnectionProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__ConfigConnectionProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2309:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:2310:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:2310:1: ( Value )
            // InternalTargetEnvironmentParser.g:2311:2: Value
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
    // InternalTargetEnvironmentParser.g:2320:1: rule__ConfigConnectionProperty__Group_4__2 : rule__ConfigConnectionProperty__Group_4__2__Impl rule__ConfigConnectionProperty__Group_4__3 ;
    public final void rule__ConfigConnectionProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2324:1: ( rule__ConfigConnectionProperty__Group_4__2__Impl rule__ConfigConnectionProperty__Group_4__3 )
            // InternalTargetEnvironmentParser.g:2325:2: rule__ConfigConnectionProperty__Group_4__2__Impl rule__ConfigConnectionProperty__Group_4__3
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
    // InternalTargetEnvironmentParser.g:2332:1: rule__ConfigConnectionProperty__Group_4__2__Impl : ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__ConfigConnectionProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2336:1: ( ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) ) )
            // InternalTargetEnvironmentParser.g:2337:1: ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) )
            {
            // InternalTargetEnvironmentParser.g:2337:1: ( ( rule__ConfigConnectionProperty__ValueAssignment_4_2 ) )
            // InternalTargetEnvironmentParser.g:2338:2: ( rule__ConfigConnectionProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getValueAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:2339:2: ( rule__ConfigConnectionProperty__ValueAssignment_4_2 )
            // InternalTargetEnvironmentParser.g:2339:3: rule__ConfigConnectionProperty__ValueAssignment_4_2
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
    // InternalTargetEnvironmentParser.g:2347:1: rule__ConfigConnectionProperty__Group_4__3 : rule__ConfigConnectionProperty__Group_4__3__Impl ;
    public final void rule__ConfigConnectionProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2351:1: ( rule__ConfigConnectionProperty__Group_4__3__Impl )
            // InternalTargetEnvironmentParser.g:2352:2: rule__ConfigConnectionProperty__Group_4__3__Impl
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
    // InternalTargetEnvironmentParser.g:2358:1: rule__ConfigConnectionProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConfigConnectionProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2362:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2363:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2363:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2364:2: RULE_DEDENT
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


    // $ANTLR start "rule__DeviceType__Group__0"
    // InternalTargetEnvironmentParser.g:2374:1: rule__DeviceType__Group__0 : rule__DeviceType__Group__0__Impl rule__DeviceType__Group__1 ;
    public final void rule__DeviceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2378:1: ( rule__DeviceType__Group__0__Impl rule__DeviceType__Group__1 )
            // InternalTargetEnvironmentParser.g:2379:2: rule__DeviceType__Group__0__Impl rule__DeviceType__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__DeviceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__0"


    // $ANTLR start "rule__DeviceType__Group__0__Impl"
    // InternalTargetEnvironmentParser.g:2386:1: rule__DeviceType__Group__0__Impl : ( () ) ;
    public final void rule__DeviceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2390:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:2391:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:2391:1: ( () )
            // InternalTargetEnvironmentParser.g:2392:2: ()
            {
             before(grammarAccess.getDeviceTypeAccess().getDeviceTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:2393:2: ()
            // InternalTargetEnvironmentParser.g:2393:3: 
            {
            }

             after(grammarAccess.getDeviceTypeAccess().getDeviceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__0__Impl"


    // $ANTLR start "rule__DeviceType__Group__1"
    // InternalTargetEnvironmentParser.g:2401:1: rule__DeviceType__Group__1 : rule__DeviceType__Group__1__Impl rule__DeviceType__Group__2 ;
    public final void rule__DeviceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2405:1: ( rule__DeviceType__Group__1__Impl rule__DeviceType__Group__2 )
            // InternalTargetEnvironmentParser.g:2406:2: rule__DeviceType__Group__1__Impl rule__DeviceType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeviceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__1"


    // $ANTLR start "rule__DeviceType__Group__1__Impl"
    // InternalTargetEnvironmentParser.g:2413:1: rule__DeviceType__Group__1__Impl : ( DeviceType ) ;
    public final void rule__DeviceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2417:1: ( ( DeviceType ) )
            // InternalTargetEnvironmentParser.g:2418:1: ( DeviceType )
            {
            // InternalTargetEnvironmentParser.g:2418:1: ( DeviceType )
            // InternalTargetEnvironmentParser.g:2419:2: DeviceType
            {
             before(grammarAccess.getDeviceTypeAccess().getDeviceTypeKeyword_1()); 
            match(input,DeviceType,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getDeviceTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__1__Impl"


    // $ANTLR start "rule__DeviceType__Group__2"
    // InternalTargetEnvironmentParser.g:2428:1: rule__DeviceType__Group__2 : rule__DeviceType__Group__2__Impl rule__DeviceType__Group__3 ;
    public final void rule__DeviceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2432:1: ( rule__DeviceType__Group__2__Impl rule__DeviceType__Group__3 )
            // InternalTargetEnvironmentParser.g:2433:2: rule__DeviceType__Group__2__Impl rule__DeviceType__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DeviceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__2"


    // $ANTLR start "rule__DeviceType__Group__2__Impl"
    // InternalTargetEnvironmentParser.g:2440:1: rule__DeviceType__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2444:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2445:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2445:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2446:2: RULE_INDENT
            {
             before(grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_2()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__2__Impl"


    // $ANTLR start "rule__DeviceType__Group__3"
    // InternalTargetEnvironmentParser.g:2455:1: rule__DeviceType__Group__3 : rule__DeviceType__Group__3__Impl rule__DeviceType__Group__4 ;
    public final void rule__DeviceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2459:1: ( rule__DeviceType__Group__3__Impl rule__DeviceType__Group__4 )
            // InternalTargetEnvironmentParser.g:2460:2: rule__DeviceType__Group__3__Impl rule__DeviceType__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DeviceType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__3"


    // $ANTLR start "rule__DeviceType__Group__3__Impl"
    // InternalTargetEnvironmentParser.g:2467:1: rule__DeviceType__Group__3__Impl : ( Name ) ;
    public final void rule__DeviceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2471:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:2472:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:2472:1: ( Name )
            // InternalTargetEnvironmentParser.g:2473:2: Name
            {
             before(grammarAccess.getDeviceTypeAccess().getNameKeyword_3()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__3__Impl"


    // $ANTLR start "rule__DeviceType__Group__4"
    // InternalTargetEnvironmentParser.g:2482:1: rule__DeviceType__Group__4 : rule__DeviceType__Group__4__Impl rule__DeviceType__Group__5 ;
    public final void rule__DeviceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2486:1: ( rule__DeviceType__Group__4__Impl rule__DeviceType__Group__5 )
            // InternalTargetEnvironmentParser.g:2487:2: rule__DeviceType__Group__4__Impl rule__DeviceType__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__DeviceType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__4"


    // $ANTLR start "rule__DeviceType__Group__4__Impl"
    // InternalTargetEnvironmentParser.g:2494:1: rule__DeviceType__Group__4__Impl : ( ( rule__DeviceType__NameAssignment_4 ) ) ;
    public final void rule__DeviceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2498:1: ( ( ( rule__DeviceType__NameAssignment_4 ) ) )
            // InternalTargetEnvironmentParser.g:2499:1: ( ( rule__DeviceType__NameAssignment_4 ) )
            {
            // InternalTargetEnvironmentParser.g:2499:1: ( ( rule__DeviceType__NameAssignment_4 ) )
            // InternalTargetEnvironmentParser.g:2500:2: ( rule__DeviceType__NameAssignment_4 )
            {
             before(grammarAccess.getDeviceTypeAccess().getNameAssignment_4()); 
            // InternalTargetEnvironmentParser.g:2501:2: ( rule__DeviceType__NameAssignment_4 )
            // InternalTargetEnvironmentParser.g:2501:3: rule__DeviceType__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__4__Impl"


    // $ANTLR start "rule__DeviceType__Group__5"
    // InternalTargetEnvironmentParser.g:2509:1: rule__DeviceType__Group__5 : rule__DeviceType__Group__5__Impl rule__DeviceType__Group__6 ;
    public final void rule__DeviceType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2513:1: ( rule__DeviceType__Group__5__Impl rule__DeviceType__Group__6 )
            // InternalTargetEnvironmentParser.g:2514:2: rule__DeviceType__Group__5__Impl rule__DeviceType__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__DeviceType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__5"


    // $ANTLR start "rule__DeviceType__Group__5__Impl"
    // InternalTargetEnvironmentParser.g:2521:1: rule__DeviceType__Group__5__Impl : ( ( rule__DeviceType__Group_5__0 )? ) ;
    public final void rule__DeviceType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2525:1: ( ( ( rule__DeviceType__Group_5__0 )? ) )
            // InternalTargetEnvironmentParser.g:2526:1: ( ( rule__DeviceType__Group_5__0 )? )
            {
            // InternalTargetEnvironmentParser.g:2526:1: ( ( rule__DeviceType__Group_5__0 )? )
            // InternalTargetEnvironmentParser.g:2527:2: ( rule__DeviceType__Group_5__0 )?
            {
             before(grammarAccess.getDeviceTypeAccess().getGroup_5()); 
            // InternalTargetEnvironmentParser.g:2528:2: ( rule__DeviceType__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Capability) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2528:3: rule__DeviceType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__5__Impl"


    // $ANTLR start "rule__DeviceType__Group__6"
    // InternalTargetEnvironmentParser.g:2536:1: rule__DeviceType__Group__6 : rule__DeviceType__Group__6__Impl rule__DeviceType__Group__7 ;
    public final void rule__DeviceType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2540:1: ( rule__DeviceType__Group__6__Impl rule__DeviceType__Group__7 )
            // InternalTargetEnvironmentParser.g:2541:2: rule__DeviceType__Group__6__Impl rule__DeviceType__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__DeviceType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__6"


    // $ANTLR start "rule__DeviceType__Group__6__Impl"
    // InternalTargetEnvironmentParser.g:2548:1: rule__DeviceType__Group__6__Impl : ( ( rule__DeviceType__Group_6__0 )? ) ;
    public final void rule__DeviceType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2552:1: ( ( ( rule__DeviceType__Group_6__0 )? ) )
            // InternalTargetEnvironmentParser.g:2553:1: ( ( rule__DeviceType__Group_6__0 )? )
            {
            // InternalTargetEnvironmentParser.g:2553:1: ( ( rule__DeviceType__Group_6__0 )? )
            // InternalTargetEnvironmentParser.g:2554:2: ( rule__DeviceType__Group_6__0 )?
            {
             before(grammarAccess.getDeviceTypeAccess().getGroup_6()); 
            // InternalTargetEnvironmentParser.g:2555:2: ( rule__DeviceType__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CommunicationConnection) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2555:3: rule__DeviceType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__6__Impl"


    // $ANTLR start "rule__DeviceType__Group__7"
    // InternalTargetEnvironmentParser.g:2563:1: rule__DeviceType__Group__7 : rule__DeviceType__Group__7__Impl ;
    public final void rule__DeviceType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2567:1: ( rule__DeviceType__Group__7__Impl )
            // InternalTargetEnvironmentParser.g:2568:2: rule__DeviceType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__7"


    // $ANTLR start "rule__DeviceType__Group__7__Impl"
    // InternalTargetEnvironmentParser.g:2574:1: rule__DeviceType__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2578:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2579:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2579:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2580:2: RULE_DEDENT
            {
             before(grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_7()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group__7__Impl"


    // $ANTLR start "rule__DeviceType__Group_5__0"
    // InternalTargetEnvironmentParser.g:2590:1: rule__DeviceType__Group_5__0 : rule__DeviceType__Group_5__0__Impl rule__DeviceType__Group_5__1 ;
    public final void rule__DeviceType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2594:1: ( rule__DeviceType__Group_5__0__Impl rule__DeviceType__Group_5__1 )
            // InternalTargetEnvironmentParser.g:2595:2: rule__DeviceType__Group_5__0__Impl rule__DeviceType__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__DeviceType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_5__0"


    // $ANTLR start "rule__DeviceType__Group_5__0__Impl"
    // InternalTargetEnvironmentParser.g:2602:1: rule__DeviceType__Group_5__0__Impl : ( Capability ) ;
    public final void rule__DeviceType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2606:1: ( ( Capability ) )
            // InternalTargetEnvironmentParser.g:2607:1: ( Capability )
            {
            // InternalTargetEnvironmentParser.g:2607:1: ( Capability )
            // InternalTargetEnvironmentParser.g:2608:2: Capability
            {
             before(grammarAccess.getDeviceTypeAccess().getCapabilityKeyword_5_0()); 
            match(input,Capability,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getCapabilityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_5__0__Impl"


    // $ANTLR start "rule__DeviceType__Group_5__1"
    // InternalTargetEnvironmentParser.g:2617:1: rule__DeviceType__Group_5__1 : rule__DeviceType__Group_5__1__Impl rule__DeviceType__Group_5__2 ;
    public final void rule__DeviceType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2621:1: ( rule__DeviceType__Group_5__1__Impl rule__DeviceType__Group_5__2 )
            // InternalTargetEnvironmentParser.g:2622:2: rule__DeviceType__Group_5__1__Impl rule__DeviceType__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__DeviceType__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_5__1"


    // $ANTLR start "rule__DeviceType__Group_5__1__Impl"
    // InternalTargetEnvironmentParser.g:2629:1: rule__DeviceType__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2633:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2634:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2634:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2635:2: RULE_INDENT
            {
             before(grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_5_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_5__1__Impl"


    // $ANTLR start "rule__DeviceType__Group_5__2"
    // InternalTargetEnvironmentParser.g:2644:1: rule__DeviceType__Group_5__2 : rule__DeviceType__Group_5__2__Impl rule__DeviceType__Group_5__3 ;
    public final void rule__DeviceType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2648:1: ( rule__DeviceType__Group_5__2__Impl rule__DeviceType__Group_5__3 )
            // InternalTargetEnvironmentParser.g:2649:2: rule__DeviceType__Group_5__2__Impl rule__DeviceType__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__DeviceType__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_5__2"


    // $ANTLR start "rule__DeviceType__Group_5__2__Impl"
    // InternalTargetEnvironmentParser.g:2656:1: rule__DeviceType__Group_5__2__Impl : ( ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* ) ) ;
    public final void rule__DeviceType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2660:1: ( ( ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:2661:1: ( ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:2661:1: ( ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* ) )
            // InternalTargetEnvironmentParser.g:2662:2: ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* )
            {
            // InternalTargetEnvironmentParser.g:2662:2: ( ( rule__DeviceType__CapabilityAssignment_5_2 ) )
            // InternalTargetEnvironmentParser.g:2663:3: ( rule__DeviceType__CapabilityAssignment_5_2 )
            {
             before(grammarAccess.getDeviceTypeAccess().getCapabilityAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:2664:3: ( rule__DeviceType__CapabilityAssignment_5_2 )
            // InternalTargetEnvironmentParser.g:2664:4: rule__DeviceType__CapabilityAssignment_5_2
            {
            pushFollow(FOLLOW_11);
            rule__DeviceType__CapabilityAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getCapabilityAssignment_5_2()); 

            }

            // InternalTargetEnvironmentParser.g:2667:2: ( ( rule__DeviceType__CapabilityAssignment_5_2 )* )
            // InternalTargetEnvironmentParser.g:2668:3: ( rule__DeviceType__CapabilityAssignment_5_2 )*
            {
             before(grammarAccess.getDeviceTypeAccess().getCapabilityAssignment_5_2()); 
            // InternalTargetEnvironmentParser.g:2669:3: ( rule__DeviceType__CapabilityAssignment_5_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==HyphenMinus) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:2669:4: rule__DeviceType__CapabilityAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeviceType__CapabilityAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDeviceTypeAccess().getCapabilityAssignment_5_2()); 

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
    // $ANTLR end "rule__DeviceType__Group_5__2__Impl"


    // $ANTLR start "rule__DeviceType__Group_5__3"
    // InternalTargetEnvironmentParser.g:2678:1: rule__DeviceType__Group_5__3 : rule__DeviceType__Group_5__3__Impl ;
    public final void rule__DeviceType__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2682:1: ( rule__DeviceType__Group_5__3__Impl )
            // InternalTargetEnvironmentParser.g:2683:2: rule__DeviceType__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_5__3"


    // $ANTLR start "rule__DeviceType__Group_5__3__Impl"
    // InternalTargetEnvironmentParser.g:2689:1: rule__DeviceType__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2693:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2694:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2694:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2695:2: RULE_DEDENT
            {
             before(grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_5__3__Impl"


    // $ANTLR start "rule__DeviceType__Group_6__0"
    // InternalTargetEnvironmentParser.g:2705:1: rule__DeviceType__Group_6__0 : rule__DeviceType__Group_6__0__Impl rule__DeviceType__Group_6__1 ;
    public final void rule__DeviceType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2709:1: ( rule__DeviceType__Group_6__0__Impl rule__DeviceType__Group_6__1 )
            // InternalTargetEnvironmentParser.g:2710:2: rule__DeviceType__Group_6__0__Impl rule__DeviceType__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__DeviceType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_6__0"


    // $ANTLR start "rule__DeviceType__Group_6__0__Impl"
    // InternalTargetEnvironmentParser.g:2717:1: rule__DeviceType__Group_6__0__Impl : ( CommunicationConnection ) ;
    public final void rule__DeviceType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2721:1: ( ( CommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:2722:1: ( CommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:2722:1: ( CommunicationConnection )
            // InternalTargetEnvironmentParser.g:2723:2: CommunicationConnection
            {
             before(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionKeyword_6_0()); 
            match(input,CommunicationConnection,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_6__0__Impl"


    // $ANTLR start "rule__DeviceType__Group_6__1"
    // InternalTargetEnvironmentParser.g:2732:1: rule__DeviceType__Group_6__1 : rule__DeviceType__Group_6__1__Impl rule__DeviceType__Group_6__2 ;
    public final void rule__DeviceType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2736:1: ( rule__DeviceType__Group_6__1__Impl rule__DeviceType__Group_6__2 )
            // InternalTargetEnvironmentParser.g:2737:2: rule__DeviceType__Group_6__1__Impl rule__DeviceType__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__DeviceType__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_6__1"


    // $ANTLR start "rule__DeviceType__Group_6__1__Impl"
    // InternalTargetEnvironmentParser.g:2744:1: rule__DeviceType__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2748:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2749:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2749:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2750:2: RULE_INDENT
            {
             before(grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_6_1()); 
            match(input,RULE_INDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getINDENTTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_6__1__Impl"


    // $ANTLR start "rule__DeviceType__Group_6__2"
    // InternalTargetEnvironmentParser.g:2759:1: rule__DeviceType__Group_6__2 : rule__DeviceType__Group_6__2__Impl rule__DeviceType__Group_6__3 ;
    public final void rule__DeviceType__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2763:1: ( rule__DeviceType__Group_6__2__Impl rule__DeviceType__Group_6__3 )
            // InternalTargetEnvironmentParser.g:2764:2: rule__DeviceType__Group_6__2__Impl rule__DeviceType__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__DeviceType__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceType__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_6__2"


    // $ANTLR start "rule__DeviceType__Group_6__2__Impl"
    // InternalTargetEnvironmentParser.g:2771:1: rule__DeviceType__Group_6__2__Impl : ( ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* ) ) ;
    public final void rule__DeviceType__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2775:1: ( ( ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:2776:1: ( ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:2776:1: ( ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* ) )
            // InternalTargetEnvironmentParser.g:2777:2: ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* )
            {
            // InternalTargetEnvironmentParser.g:2777:2: ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) )
            // InternalTargetEnvironmentParser.g:2778:3: ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )
            {
             before(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:2779:3: ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )
            // InternalTargetEnvironmentParser.g:2779:4: rule__DeviceType__CommunicationConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__DeviceType__CommunicationConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionAssignment_6_2()); 

            }

            // InternalTargetEnvironmentParser.g:2782:2: ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* )
            // InternalTargetEnvironmentParser.g:2783:3: ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionAssignment_6_2()); 
            // InternalTargetEnvironmentParser.g:2784:3: ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==HyphenMinus) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:2784:4: rule__DeviceType__CommunicationConnectionAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeviceType__CommunicationConnectionAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionAssignment_6_2()); 

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
    // $ANTLR end "rule__DeviceType__Group_6__2__Impl"


    // $ANTLR start "rule__DeviceType__Group_6__3"
    // InternalTargetEnvironmentParser.g:2793:1: rule__DeviceType__Group_6__3 : rule__DeviceType__Group_6__3__Impl ;
    public final void rule__DeviceType__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2797:1: ( rule__DeviceType__Group_6__3__Impl )
            // InternalTargetEnvironmentParser.g:2798:2: rule__DeviceType__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_6__3"


    // $ANTLR start "rule__DeviceType__Group_6__3__Impl"
    // InternalTargetEnvironmentParser.g:2804:1: rule__DeviceType__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2808:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:2809:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:2809:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:2810:2: RULE_DEDENT
            {
             before(grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_6_3()); 
            match(input,RULE_DEDENT,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getDEDENTTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Group_6__3__Impl"


    // $ANTLR start "rule__CapabilityProperty__Group__0"
    // InternalTargetEnvironmentParser.g:2820:1: rule__CapabilityProperty__Group__0 : rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 ;
    public final void rule__CapabilityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2824:1: ( rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:2825:2: rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1
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
    // InternalTargetEnvironmentParser.g:2832:1: rule__CapabilityProperty__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__CapabilityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2836:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:2837:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:2837:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:2838:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:2847:1: rule__CapabilityProperty__Group__1 : rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 ;
    public final void rule__CapabilityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2851:1: ( rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:2852:2: rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2
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
    // InternalTargetEnvironmentParser.g:2859:1: rule__CapabilityProperty__Group__1__Impl : ( Name ) ;
    public final void rule__CapabilityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2863:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:2864:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:2864:1: ( Name )
            // InternalTargetEnvironmentParser.g:2865:2: Name
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
    // InternalTargetEnvironmentParser.g:2874:1: rule__CapabilityProperty__Group__2 : rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 ;
    public final void rule__CapabilityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2878:1: ( rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:2879:2: rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3
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
    // InternalTargetEnvironmentParser.g:2886:1: rule__CapabilityProperty__Group__2__Impl : ( ( rule__CapabilityProperty__NameAssignment_2 ) ) ;
    public final void rule__CapabilityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2890:1: ( ( ( rule__CapabilityProperty__NameAssignment_2 ) ) )
            // InternalTargetEnvironmentParser.g:2891:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            {
            // InternalTargetEnvironmentParser.g:2891:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            // InternalTargetEnvironmentParser.g:2892:2: ( rule__CapabilityProperty__NameAssignment_2 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getNameAssignment_2()); 
            // InternalTargetEnvironmentParser.g:2893:2: ( rule__CapabilityProperty__NameAssignment_2 )
            // InternalTargetEnvironmentParser.g:2893:3: rule__CapabilityProperty__NameAssignment_2
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
    // InternalTargetEnvironmentParser.g:2901:1: rule__CapabilityProperty__Group__3 : rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 ;
    public final void rule__CapabilityProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2905:1: ( rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:2906:2: rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalTargetEnvironmentParser.g:2913:1: rule__CapabilityProperty__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__CapabilityProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2917:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:2918:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:2918:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:2919:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:2928:1: rule__CapabilityProperty__Group__4 : rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 ;
    public final void rule__CapabilityProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2932:1: ( rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 )
            // InternalTargetEnvironmentParser.g:2933:2: rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5
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
    // InternalTargetEnvironmentParser.g:2940:1: rule__CapabilityProperty__Group__4__Impl : ( Type ) ;
    public final void rule__CapabilityProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2944:1: ( ( Type ) )
            // InternalTargetEnvironmentParser.g:2945:1: ( Type )
            {
            // InternalTargetEnvironmentParser.g:2945:1: ( Type )
            // InternalTargetEnvironmentParser.g:2946:2: Type
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
    // InternalTargetEnvironmentParser.g:2955:1: rule__CapabilityProperty__Group__5 : rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 ;
    public final void rule__CapabilityProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2959:1: ( rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 )
            // InternalTargetEnvironmentParser.g:2960:2: rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalTargetEnvironmentParser.g:2967:1: rule__CapabilityProperty__Group__5__Impl : ( ( rule__CapabilityProperty__TypeAssignment_5 ) ) ;
    public final void rule__CapabilityProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2971:1: ( ( ( rule__CapabilityProperty__TypeAssignment_5 ) ) )
            // InternalTargetEnvironmentParser.g:2972:1: ( ( rule__CapabilityProperty__TypeAssignment_5 ) )
            {
            // InternalTargetEnvironmentParser.g:2972:1: ( ( rule__CapabilityProperty__TypeAssignment_5 ) )
            // InternalTargetEnvironmentParser.g:2973:2: ( rule__CapabilityProperty__TypeAssignment_5 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeAssignment_5()); 
            // InternalTargetEnvironmentParser.g:2974:2: ( rule__CapabilityProperty__TypeAssignment_5 )
            // InternalTargetEnvironmentParser.g:2974:3: rule__CapabilityProperty__TypeAssignment_5
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
    // InternalTargetEnvironmentParser.g:2982:1: rule__CapabilityProperty__Group__6 : rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 ;
    public final void rule__CapabilityProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2986:1: ( rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 )
            // InternalTargetEnvironmentParser.g:2987:2: rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalTargetEnvironmentParser.g:2994:1: rule__CapabilityProperty__Group__6__Impl : ( Kind ) ;
    public final void rule__CapabilityProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:2998:1: ( ( Kind ) )
            // InternalTargetEnvironmentParser.g:2999:1: ( Kind )
            {
            // InternalTargetEnvironmentParser.g:2999:1: ( Kind )
            // InternalTargetEnvironmentParser.g:3000:2: Kind
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
    // InternalTargetEnvironmentParser.g:3009:1: rule__CapabilityProperty__Group__7 : rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 ;
    public final void rule__CapabilityProperty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3013:1: ( rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 )
            // InternalTargetEnvironmentParser.g:3014:2: rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalTargetEnvironmentParser.g:3021:1: rule__CapabilityProperty__Group__7__Impl : ( ( rule__CapabilityProperty__KindAssignment_7 ) ) ;
    public final void rule__CapabilityProperty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3025:1: ( ( ( rule__CapabilityProperty__KindAssignment_7 ) ) )
            // InternalTargetEnvironmentParser.g:3026:1: ( ( rule__CapabilityProperty__KindAssignment_7 ) )
            {
            // InternalTargetEnvironmentParser.g:3026:1: ( ( rule__CapabilityProperty__KindAssignment_7 ) )
            // InternalTargetEnvironmentParser.g:3027:2: ( rule__CapabilityProperty__KindAssignment_7 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindAssignment_7()); 
            // InternalTargetEnvironmentParser.g:3028:2: ( rule__CapabilityProperty__KindAssignment_7 )
            // InternalTargetEnvironmentParser.g:3028:3: rule__CapabilityProperty__KindAssignment_7
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
    // InternalTargetEnvironmentParser.g:3036:1: rule__CapabilityProperty__Group__8 : rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 ;
    public final void rule__CapabilityProperty__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3040:1: ( rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 )
            // InternalTargetEnvironmentParser.g:3041:2: rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalTargetEnvironmentParser.g:3048:1: rule__CapabilityProperty__Group__8__Impl : ( ( rule__CapabilityProperty__Group_8__0 )? ) ;
    public final void rule__CapabilityProperty__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3052:1: ( ( ( rule__CapabilityProperty__Group_8__0 )? ) )
            // InternalTargetEnvironmentParser.g:3053:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3053:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            // InternalTargetEnvironmentParser.g:3054:2: ( rule__CapabilityProperty__Group_8__0 )?
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup_8()); 
            // InternalTargetEnvironmentParser.g:3055:2: ( rule__CapabilityProperty__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Value) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3055:3: rule__CapabilityProperty__Group_8__0
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
    // InternalTargetEnvironmentParser.g:3063:1: rule__CapabilityProperty__Group__9 : rule__CapabilityProperty__Group__9__Impl ;
    public final void rule__CapabilityProperty__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3067:1: ( rule__CapabilityProperty__Group__9__Impl )
            // InternalTargetEnvironmentParser.g:3068:2: rule__CapabilityProperty__Group__9__Impl
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
    // InternalTargetEnvironmentParser.g:3074:1: rule__CapabilityProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__CapabilityProperty__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3078:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3079:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3079:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3080:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3090:1: rule__CapabilityProperty__Group_8__0 : rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 ;
    public final void rule__CapabilityProperty__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3094:1: ( rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 )
            // InternalTargetEnvironmentParser.g:3095:2: rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1
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
    // InternalTargetEnvironmentParser.g:3102:1: rule__CapabilityProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__CapabilityProperty__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3106:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:3107:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:3107:1: ( Value )
            // InternalTargetEnvironmentParser.g:3108:2: Value
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
    // InternalTargetEnvironmentParser.g:3117:1: rule__CapabilityProperty__Group_8__1 : rule__CapabilityProperty__Group_8__1__Impl ;
    public final void rule__CapabilityProperty__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3121:1: ( rule__CapabilityProperty__Group_8__1__Impl )
            // InternalTargetEnvironmentParser.g:3122:2: rule__CapabilityProperty__Group_8__1__Impl
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
    // InternalTargetEnvironmentParser.g:3128:1: rule__CapabilityProperty__Group_8__1__Impl : ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__CapabilityProperty__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3132:1: ( ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) )
            // InternalTargetEnvironmentParser.g:3133:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            {
            // InternalTargetEnvironmentParser.g:3133:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            // InternalTargetEnvironmentParser.g:3134:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getValueAssignment_8_1()); 
            // InternalTargetEnvironmentParser.g:3135:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            // InternalTargetEnvironmentParser.g:3135:3: rule__CapabilityProperty__ValueAssignment_8_1
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
    // InternalTargetEnvironmentParser.g:3144:1: rule__AttributeKind__Group__0 : rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 ;
    public final void rule__AttributeKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3148:1: ( rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 )
            // InternalTargetEnvironmentParser.g:3149:2: rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTargetEnvironmentParser.g:3156:1: rule__AttributeKind__Group__0__Impl : ( () ) ;
    public final void rule__AttributeKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3160:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3161:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3161:1: ( () )
            // InternalTargetEnvironmentParser.g:3162:2: ()
            {
             before(grammarAccess.getAttributeKindAccess().getAttributeKindAction_0()); 
            // InternalTargetEnvironmentParser.g:3163:2: ()
            // InternalTargetEnvironmentParser.g:3163:3: 
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
    // InternalTargetEnvironmentParser.g:3171:1: rule__AttributeKind__Group__1 : rule__AttributeKind__Group__1__Impl ;
    public final void rule__AttributeKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3175:1: ( rule__AttributeKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:3176:2: rule__AttributeKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:3182:1: rule__AttributeKind__Group__1__Impl : ( AttributeKind ) ;
    public final void rule__AttributeKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3186:1: ( ( AttributeKind ) )
            // InternalTargetEnvironmentParser.g:3187:1: ( AttributeKind )
            {
            // InternalTargetEnvironmentParser.g:3187:1: ( AttributeKind )
            // InternalTargetEnvironmentParser.g:3188:2: AttributeKind
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
    // InternalTargetEnvironmentParser.g:3198:1: rule__MaximumKind__Group__0 : rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 ;
    public final void rule__MaximumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3202:1: ( rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 )
            // InternalTargetEnvironmentParser.g:3203:2: rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetEnvironmentParser.g:3210:1: rule__MaximumKind__Group__0__Impl : ( () ) ;
    public final void rule__MaximumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3214:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3215:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3215:1: ( () )
            // InternalTargetEnvironmentParser.g:3216:2: ()
            {
             before(grammarAccess.getMaximumKindAccess().getMaximumKindAction_0()); 
            // InternalTargetEnvironmentParser.g:3217:2: ()
            // InternalTargetEnvironmentParser.g:3217:3: 
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
    // InternalTargetEnvironmentParser.g:3225:1: rule__MaximumKind__Group__1 : rule__MaximumKind__Group__1__Impl ;
    public final void rule__MaximumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3229:1: ( rule__MaximumKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:3230:2: rule__MaximumKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:3236:1: rule__MaximumKind__Group__1__Impl : ( MaximumKind ) ;
    public final void rule__MaximumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3240:1: ( ( MaximumKind ) )
            // InternalTargetEnvironmentParser.g:3241:1: ( MaximumKind )
            {
            // InternalTargetEnvironmentParser.g:3241:1: ( MaximumKind )
            // InternalTargetEnvironmentParser.g:3242:2: MaximumKind
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
    // InternalTargetEnvironmentParser.g:3252:1: rule__MinimumKind__Group__0 : rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 ;
    public final void rule__MinimumKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3256:1: ( rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 )
            // InternalTargetEnvironmentParser.g:3257:2: rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTargetEnvironmentParser.g:3264:1: rule__MinimumKind__Group__0__Impl : ( () ) ;
    public final void rule__MinimumKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3268:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3269:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3269:1: ( () )
            // InternalTargetEnvironmentParser.g:3270:2: ()
            {
             before(grammarAccess.getMinimumKindAccess().getMinimumKindAction_0()); 
            // InternalTargetEnvironmentParser.g:3271:2: ()
            // InternalTargetEnvironmentParser.g:3271:3: 
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
    // InternalTargetEnvironmentParser.g:3279:1: rule__MinimumKind__Group__1 : rule__MinimumKind__Group__1__Impl ;
    public final void rule__MinimumKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3283:1: ( rule__MinimumKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:3284:2: rule__MinimumKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:3290:1: rule__MinimumKind__Group__1__Impl : ( MinimumKind ) ;
    public final void rule__MinimumKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3294:1: ( ( MinimumKind ) )
            // InternalTargetEnvironmentParser.g:3295:1: ( MinimumKind )
            {
            // InternalTargetEnvironmentParser.g:3295:1: ( MinimumKind )
            // InternalTargetEnvironmentParser.g:3296:2: MinimumKind
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
    // InternalTargetEnvironmentParser.g:3306:1: rule__SelectionKind__Group__0 : rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 ;
    public final void rule__SelectionKind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3310:1: ( rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 )
            // InternalTargetEnvironmentParser.g:3311:2: rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalTargetEnvironmentParser.g:3318:1: rule__SelectionKind__Group__0__Impl : ( () ) ;
    public final void rule__SelectionKind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3322:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3323:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3323:1: ( () )
            // InternalTargetEnvironmentParser.g:3324:2: ()
            {
             before(grammarAccess.getSelectionKindAccess().getSelectionKindAction_0()); 
            // InternalTargetEnvironmentParser.g:3325:2: ()
            // InternalTargetEnvironmentParser.g:3325:3: 
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
    // InternalTargetEnvironmentParser.g:3333:1: rule__SelectionKind__Group__1 : rule__SelectionKind__Group__1__Impl ;
    public final void rule__SelectionKind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3337:1: ( rule__SelectionKind__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:3338:2: rule__SelectionKind__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:3344:1: rule__SelectionKind__Group__1__Impl : ( SelectionKind ) ;
    public final void rule__SelectionKind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3348:1: ( ( SelectionKind ) )
            // InternalTargetEnvironmentParser.g:3349:1: ( SelectionKind )
            {
            // InternalTargetEnvironmentParser.g:3349:1: ( SelectionKind )
            // InternalTargetEnvironmentParser.g:3350:2: SelectionKind
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
    // InternalTargetEnvironmentParser.g:3360:1: rule__ConnectionProperty__Group__0 : rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 ;
    public final void rule__ConnectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3364:1: ( rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 )
            // InternalTargetEnvironmentParser.g:3365:2: rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1
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
    // InternalTargetEnvironmentParser.g:3372:1: rule__ConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3376:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3377:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3377:1: ( () )
            // InternalTargetEnvironmentParser.g:3378:2: ()
            {
             before(grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0()); 
            // InternalTargetEnvironmentParser.g:3379:2: ()
            // InternalTargetEnvironmentParser.g:3379:3: 
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
    // InternalTargetEnvironmentParser.g:3387:1: rule__ConnectionProperty__Group__1 : rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 ;
    public final void rule__ConnectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3391:1: ( rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 )
            // InternalTargetEnvironmentParser.g:3392:2: rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2
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
    // InternalTargetEnvironmentParser.g:3399:1: rule__ConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3403:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:3404:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:3404:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:3405:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:3414:1: rule__ConnectionProperty__Group__2 : rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 ;
    public final void rule__ConnectionProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3418:1: ( rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 )
            // InternalTargetEnvironmentParser.g:3419:2: rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3
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
    // InternalTargetEnvironmentParser.g:3426:1: rule__ConnectionProperty__Group__2__Impl : ( Name ) ;
    public final void rule__ConnectionProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3430:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:3431:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:3431:1: ( Name )
            // InternalTargetEnvironmentParser.g:3432:2: Name
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
    // InternalTargetEnvironmentParser.g:3441:1: rule__ConnectionProperty__Group__3 : rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 ;
    public final void rule__ConnectionProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3445:1: ( rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 )
            // InternalTargetEnvironmentParser.g:3446:2: rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4
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
    // InternalTargetEnvironmentParser.g:3453:1: rule__ConnectionProperty__Group__3__Impl : ( ( rule__ConnectionProperty__NameAssignment_3 ) ) ;
    public final void rule__ConnectionProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3457:1: ( ( ( rule__ConnectionProperty__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:3458:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:3458:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:3459:2: ( rule__ConnectionProperty__NameAssignment_3 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:3460:2: ( rule__ConnectionProperty__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:3460:3: rule__ConnectionProperty__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:3468:1: rule__ConnectionProperty__Group__4 : rule__ConnectionProperty__Group__4__Impl ;
    public final void rule__ConnectionProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3472:1: ( rule__ConnectionProperty__Group__4__Impl )
            // InternalTargetEnvironmentParser.g:3473:2: rule__ConnectionProperty__Group__4__Impl
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
    // InternalTargetEnvironmentParser.g:3479:1: rule__ConnectionProperty__Group__4__Impl : ( ( rule__ConnectionProperty__Group_4__0 )? ) ;
    public final void rule__ConnectionProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3483:1: ( ( ( rule__ConnectionProperty__Group_4__0 )? ) )
            // InternalTargetEnvironmentParser.g:3484:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3484:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            // InternalTargetEnvironmentParser.g:3485:2: ( rule__ConnectionProperty__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup_4()); 
            // InternalTargetEnvironmentParser.g:3486:2: ( rule__ConnectionProperty__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3486:3: rule__ConnectionProperty__Group_4__0
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
    // InternalTargetEnvironmentParser.g:3495:1: rule__ConnectionProperty__Group_4__0 : rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 ;
    public final void rule__ConnectionProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3499:1: ( rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 )
            // InternalTargetEnvironmentParser.g:3500:2: rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1
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
    // InternalTargetEnvironmentParser.g:3507:1: rule__ConnectionProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectionProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3511:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3512:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3512:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3513:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3522:1: rule__ConnectionProperty__Group_4__1 : rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 ;
    public final void rule__ConnectionProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3526:1: ( rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 )
            // InternalTargetEnvironmentParser.g:3527:2: rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2
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
    // InternalTargetEnvironmentParser.g:3534:1: rule__ConnectionProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__ConnectionProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3538:1: ( ( Value ) )
            // InternalTargetEnvironmentParser.g:3539:1: ( Value )
            {
            // InternalTargetEnvironmentParser.g:3539:1: ( Value )
            // InternalTargetEnvironmentParser.g:3540:2: Value
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
    // InternalTargetEnvironmentParser.g:3549:1: rule__ConnectionProperty__Group_4__2 : rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 ;
    public final void rule__ConnectionProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3553:1: ( rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 )
            // InternalTargetEnvironmentParser.g:3554:2: rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3
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
    // InternalTargetEnvironmentParser.g:3561:1: rule__ConnectionProperty__Group_4__2__Impl : ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__ConnectionProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3565:1: ( ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) )
            // InternalTargetEnvironmentParser.g:3566:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            {
            // InternalTargetEnvironmentParser.g:3566:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            // InternalTargetEnvironmentParser.g:3567:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getValueAssignment_4_2()); 
            // InternalTargetEnvironmentParser.g:3568:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            // InternalTargetEnvironmentParser.g:3568:3: rule__ConnectionProperty__ValueAssignment_4_2
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
    // InternalTargetEnvironmentParser.g:3576:1: rule__ConnectionProperty__Group_4__3 : rule__ConnectionProperty__Group_4__3__Impl ;
    public final void rule__ConnectionProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3580:1: ( rule__ConnectionProperty__Group_4__3__Impl )
            // InternalTargetEnvironmentParser.g:3581:2: rule__ConnectionProperty__Group_4__3__Impl
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
    // InternalTargetEnvironmentParser.g:3587:1: rule__ConnectionProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectionProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3591:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3592:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3592:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3593:2: RULE_DEDENT
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


    // $ANTLR start "rule__CommunicationConnection__Group__0"
    // InternalTargetEnvironmentParser.g:3603:1: rule__CommunicationConnection__Group__0 : rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 ;
    public final void rule__CommunicationConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3607:1: ( rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 )
            // InternalTargetEnvironmentParser.g:3608:2: rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1
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
    // InternalTargetEnvironmentParser.g:3615:1: rule__CommunicationConnection__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3619:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3620:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3620:1: ( () )
            // InternalTargetEnvironmentParser.g:3621:2: ()
            {
             before(grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0()); 
            // InternalTargetEnvironmentParser.g:3622:2: ()
            // InternalTargetEnvironmentParser.g:3622:3: 
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
    // InternalTargetEnvironmentParser.g:3630:1: rule__CommunicationConnection__Group__1 : rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 ;
    public final void rule__CommunicationConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3634:1: ( rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 )
            // InternalTargetEnvironmentParser.g:3635:2: rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2
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
    // InternalTargetEnvironmentParser.g:3642:1: rule__CommunicationConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__CommunicationConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3646:1: ( ( rulePreListElement ) )
            // InternalTargetEnvironmentParser.g:3647:1: ( rulePreListElement )
            {
            // InternalTargetEnvironmentParser.g:3647:1: ( rulePreListElement )
            // InternalTargetEnvironmentParser.g:3648:2: rulePreListElement
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
    // InternalTargetEnvironmentParser.g:3657:1: rule__CommunicationConnection__Group__2 : rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 ;
    public final void rule__CommunicationConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3661:1: ( rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 )
            // InternalTargetEnvironmentParser.g:3662:2: rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3
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
    // InternalTargetEnvironmentParser.g:3669:1: rule__CommunicationConnection__Group__2__Impl : ( Name ) ;
    public final void rule__CommunicationConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3673:1: ( ( Name ) )
            // InternalTargetEnvironmentParser.g:3674:1: ( Name )
            {
            // InternalTargetEnvironmentParser.g:3674:1: ( Name )
            // InternalTargetEnvironmentParser.g:3675:2: Name
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
    // InternalTargetEnvironmentParser.g:3684:1: rule__CommunicationConnection__Group__3 : rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 ;
    public final void rule__CommunicationConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3688:1: ( rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 )
            // InternalTargetEnvironmentParser.g:3689:2: rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4
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
    // InternalTargetEnvironmentParser.g:3696:1: rule__CommunicationConnection__Group__3__Impl : ( ( rule__CommunicationConnection__NameAssignment_3 ) ) ;
    public final void rule__CommunicationConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3700:1: ( ( ( rule__CommunicationConnection__NameAssignment_3 ) ) )
            // InternalTargetEnvironmentParser.g:3701:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            {
            // InternalTargetEnvironmentParser.g:3701:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            // InternalTargetEnvironmentParser.g:3702:2: ( rule__CommunicationConnection__NameAssignment_3 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3()); 
            // InternalTargetEnvironmentParser.g:3703:2: ( rule__CommunicationConnection__NameAssignment_3 )
            // InternalTargetEnvironmentParser.g:3703:3: rule__CommunicationConnection__NameAssignment_3
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
    // InternalTargetEnvironmentParser.g:3711:1: rule__CommunicationConnection__Group__4 : rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 ;
    public final void rule__CommunicationConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3715:1: ( rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 )
            // InternalTargetEnvironmentParser.g:3716:2: rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalTargetEnvironmentParser.g:3723:1: rule__CommunicationConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3727:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3728:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3728:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3729:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3738:1: rule__CommunicationConnection__Group__5 : rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 ;
    public final void rule__CommunicationConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3742:1: ( rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 )
            // InternalTargetEnvironmentParser.g:3743:2: rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6
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
    // InternalTargetEnvironmentParser.g:3750:1: rule__CommunicationConnection__Group__5__Impl : ( Type ) ;
    public final void rule__CommunicationConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3754:1: ( ( Type ) )
            // InternalTargetEnvironmentParser.g:3755:1: ( Type )
            {
            // InternalTargetEnvironmentParser.g:3755:1: ( Type )
            // InternalTargetEnvironmentParser.g:3756:2: Type
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
    // InternalTargetEnvironmentParser.g:3765:1: rule__CommunicationConnection__Group__6 : rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 ;
    public final void rule__CommunicationConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3769:1: ( rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 )
            // InternalTargetEnvironmentParser.g:3770:2: rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalTargetEnvironmentParser.g:3777:1: rule__CommunicationConnection__Group__6__Impl : ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) ;
    public final void rule__CommunicationConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3781:1: ( ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) )
            // InternalTargetEnvironmentParser.g:3782:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            {
            // InternalTargetEnvironmentParser.g:3782:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            // InternalTargetEnvironmentParser.g:3783:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6()); 
            // InternalTargetEnvironmentParser.g:3784:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            // InternalTargetEnvironmentParser.g:3784:3: rule__CommunicationConnection__TypeAssignment_6
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
    // InternalTargetEnvironmentParser.g:3792:1: rule__CommunicationConnection__Group__7 : rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 ;
    public final void rule__CommunicationConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3796:1: ( rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 )
            // InternalTargetEnvironmentParser.g:3797:2: rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalTargetEnvironmentParser.g:3804:1: rule__CommunicationConnection__Group__7__Impl : ( ( rule__CommunicationConnection__Group_7__0 )? ) ;
    public final void rule__CommunicationConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3808:1: ( ( ( rule__CommunicationConnection__Group_7__0 )? ) )
            // InternalTargetEnvironmentParser.g:3809:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            {
            // InternalTargetEnvironmentParser.g:3809:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            // InternalTargetEnvironmentParser.g:3810:2: ( rule__CommunicationConnection__Group_7__0 )?
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup_7()); 
            // InternalTargetEnvironmentParser.g:3811:2: ( rule__CommunicationConnection__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Properties) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:3811:3: rule__CommunicationConnection__Group_7__0
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
    // InternalTargetEnvironmentParser.g:3819:1: rule__CommunicationConnection__Group__8 : rule__CommunicationConnection__Group__8__Impl ;
    public final void rule__CommunicationConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3823:1: ( rule__CommunicationConnection__Group__8__Impl )
            // InternalTargetEnvironmentParser.g:3824:2: rule__CommunicationConnection__Group__8__Impl
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
    // InternalTargetEnvironmentParser.g:3830:1: rule__CommunicationConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3834:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3835:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3835:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3836:2: RULE_DEDENT
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
    // InternalTargetEnvironmentParser.g:3846:1: rule__CommunicationConnection__Group_7__0 : rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 ;
    public final void rule__CommunicationConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3850:1: ( rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 )
            // InternalTargetEnvironmentParser.g:3851:2: rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1
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
    // InternalTargetEnvironmentParser.g:3858:1: rule__CommunicationConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__CommunicationConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3862:1: ( ( Properties ) )
            // InternalTargetEnvironmentParser.g:3863:1: ( Properties )
            {
            // InternalTargetEnvironmentParser.g:3863:1: ( Properties )
            // InternalTargetEnvironmentParser.g:3864:2: Properties
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
    // InternalTargetEnvironmentParser.g:3873:1: rule__CommunicationConnection__Group_7__1 : rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 ;
    public final void rule__CommunicationConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3877:1: ( rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 )
            // InternalTargetEnvironmentParser.g:3878:2: rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2
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
    // InternalTargetEnvironmentParser.g:3885:1: rule__CommunicationConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3889:1: ( ( RULE_INDENT ) )
            // InternalTargetEnvironmentParser.g:3890:1: ( RULE_INDENT )
            {
            // InternalTargetEnvironmentParser.g:3890:1: ( RULE_INDENT )
            // InternalTargetEnvironmentParser.g:3891:2: RULE_INDENT
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
    // InternalTargetEnvironmentParser.g:3900:1: rule__CommunicationConnection__Group_7__2 : rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 ;
    public final void rule__CommunicationConnection__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3904:1: ( rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 )
            // InternalTargetEnvironmentParser.g:3905:2: rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3
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
    // InternalTargetEnvironmentParser.g:3912:1: rule__CommunicationConnection__Group_7__2__Impl : ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__CommunicationConnection__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3916:1: ( ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalTargetEnvironmentParser.g:3917:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalTargetEnvironmentParser.g:3917:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            // InternalTargetEnvironmentParser.g:3918:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalTargetEnvironmentParser.g:3918:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) )
            // InternalTargetEnvironmentParser.g:3919:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:3920:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            // InternalTargetEnvironmentParser.g:3920:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_11);
            rule__CommunicationConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 

            }

            // InternalTargetEnvironmentParser.g:3923:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            // InternalTargetEnvironmentParser.g:3924:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2()); 
            // InternalTargetEnvironmentParser.g:3925:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==HyphenMinus) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:3925:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CommunicationConnection__PropertiesAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalTargetEnvironmentParser.g:3934:1: rule__CommunicationConnection__Group_7__3 : rule__CommunicationConnection__Group_7__3__Impl ;
    public final void rule__CommunicationConnection__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3938:1: ( rule__CommunicationConnection__Group_7__3__Impl )
            // InternalTargetEnvironmentParser.g:3939:2: rule__CommunicationConnection__Group_7__3__Impl
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
    // InternalTargetEnvironmentParser.g:3945:1: rule__CommunicationConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3949:1: ( ( RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:3950:1: ( RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:3950:1: ( RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:3951:2: RULE_DEDENT
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


    // $ANTLR start "rule__CommunicationType__Group__0"
    // InternalTargetEnvironmentParser.g:3961:1: rule__CommunicationType__Group__0 : rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 ;
    public final void rule__CommunicationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3965:1: ( rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 )
            // InternalTargetEnvironmentParser.g:3966:2: rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1
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
    // InternalTargetEnvironmentParser.g:3973:1: rule__CommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3977:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:3978:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:3978:1: ( () )
            // InternalTargetEnvironmentParser.g:3979:2: ()
            {
             before(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:3980:2: ()
            // InternalTargetEnvironmentParser.g:3980:3: 
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
    // InternalTargetEnvironmentParser.g:3988:1: rule__CommunicationType__Group__1 : rule__CommunicationType__Group__1__Impl ;
    public final void rule__CommunicationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:3992:1: ( rule__CommunicationType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:3993:2: rule__CommunicationType__Group__1__Impl
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
    // InternalTargetEnvironmentParser.g:3999:1: rule__CommunicationType__Group__1__Impl : ( ( rule__CommunicationType__NameAssignment_1 ) ) ;
    public final void rule__CommunicationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4003:1: ( ( ( rule__CommunicationType__NameAssignment_1 ) ) )
            // InternalTargetEnvironmentParser.g:4004:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            {
            // InternalTargetEnvironmentParser.g:4004:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            // InternalTargetEnvironmentParser.g:4005:2: ( rule__CommunicationType__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1()); 
            // InternalTargetEnvironmentParser.g:4006:2: ( rule__CommunicationType__NameAssignment_1 )
            // InternalTargetEnvironmentParser.g:4006:3: rule__CommunicationType__NameAssignment_1
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


    // $ANTLR start "rule__CapabilityType__Group__0"
    // InternalTargetEnvironmentParser.g:4015:1: rule__CapabilityType__Group__0 : rule__CapabilityType__Group__0__Impl rule__CapabilityType__Group__1 ;
    public final void rule__CapabilityType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4019:1: ( rule__CapabilityType__Group__0__Impl rule__CapabilityType__Group__1 )
            // InternalTargetEnvironmentParser.g:4020:2: rule__CapabilityType__Group__0__Impl rule__CapabilityType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CapabilityType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CapabilityType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityType__Group__0"


    // $ANTLR start "rule__CapabilityType__Group__0__Impl"
    // InternalTargetEnvironmentParser.g:4027:1: rule__CapabilityType__Group__0__Impl : ( () ) ;
    public final void rule__CapabilityType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4031:1: ( ( () ) )
            // InternalTargetEnvironmentParser.g:4032:1: ( () )
            {
            // InternalTargetEnvironmentParser.g:4032:1: ( () )
            // InternalTargetEnvironmentParser.g:4033:2: ()
            {
             before(grammarAccess.getCapabilityTypeAccess().getCapabilityTypeAction_0()); 
            // InternalTargetEnvironmentParser.g:4034:2: ()
            // InternalTargetEnvironmentParser.g:4034:3: 
            {
            }

             after(grammarAccess.getCapabilityTypeAccess().getCapabilityTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityType__Group__0__Impl"


    // $ANTLR start "rule__CapabilityType__Group__1"
    // InternalTargetEnvironmentParser.g:4042:1: rule__CapabilityType__Group__1 : rule__CapabilityType__Group__1__Impl ;
    public final void rule__CapabilityType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4046:1: ( rule__CapabilityType__Group__1__Impl )
            // InternalTargetEnvironmentParser.g:4047:2: rule__CapabilityType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityType__Group__1"


    // $ANTLR start "rule__CapabilityType__Group__1__Impl"
    // InternalTargetEnvironmentParser.g:4053:1: rule__CapabilityType__Group__1__Impl : ( ( rule__CapabilityType__NameAssignment_1 ) ) ;
    public final void rule__CapabilityType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4057:1: ( ( ( rule__CapabilityType__NameAssignment_1 ) ) )
            // InternalTargetEnvironmentParser.g:4058:1: ( ( rule__CapabilityType__NameAssignment_1 ) )
            {
            // InternalTargetEnvironmentParser.g:4058:1: ( ( rule__CapabilityType__NameAssignment_1 ) )
            // InternalTargetEnvironmentParser.g:4059:2: ( rule__CapabilityType__NameAssignment_1 )
            {
             before(grammarAccess.getCapabilityTypeAccess().getNameAssignment_1()); 
            // InternalTargetEnvironmentParser.g:4060:2: ( rule__CapabilityType__NameAssignment_1 )
            // InternalTargetEnvironmentParser.g:4060:3: rule__CapabilityType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CapabilityType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityType__Group__1__Impl"


    // $ANTLR start "rule__TargetEnvironment__TypeAssignment_1"
    // InternalTargetEnvironmentParser.g:4069:1: rule__TargetEnvironment__TypeAssignment_1 : ( ruleDescription ) ;
    public final void rule__TargetEnvironment__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4073:1: ( ( ruleDescription ) )
            // InternalTargetEnvironmentParser.g:4074:2: ( ruleDescription )
            {
            // InternalTargetEnvironmentParser.g:4074:2: ( ruleDescription )
            // InternalTargetEnvironmentParser.g:4075:3: ruleDescription
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
    // InternalTargetEnvironmentParser.g:4084:1: rule__TargetDeployEnviroment__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__TargetDeployEnviroment__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4088:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4089:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4089:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4090:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:4099:1: rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2 : ( ruleDeviceInstance ) ;
    public final void rule__TargetDeployEnviroment__IncludeDeviceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4103:1: ( ( ruleDeviceInstance ) )
            // InternalTargetEnvironmentParser.g:4104:2: ( ruleDeviceInstance )
            {
            // InternalTargetEnvironmentParser.g:4104:2: ( ruleDeviceInstance )
            // InternalTargetEnvironmentParser.g:4105:3: ruleDeviceInstance
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
    // InternalTargetEnvironmentParser.g:4114:1: rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2 : ( ruleConfigConnection ) ;
    public final void rule__TargetDeployEnviroment__ConfigConnectionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4118:1: ( ( ruleConfigConnection ) )
            // InternalTargetEnvironmentParser.g:4119:2: ( ruleConfigConnection )
            {
            // InternalTargetEnvironmentParser.g:4119:2: ( ruleConfigConnection )
            // InternalTargetEnvironmentParser.g:4120:3: ruleConfigConnection
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
    // InternalTargetEnvironmentParser.g:4129:1: rule__DeviceInstance__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DeviceInstance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4133:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4134:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4134:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4135:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:4144:1: rule__DeviceInstance__RefDeviceTypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__DeviceInstance__RefDeviceTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4148:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:4149:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:4149:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4150:3: ( ruleEString )
            {
             before(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeCrossReference_5_0()); 
            // InternalTargetEnvironmentParser.g:4151:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4152:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:4163:1: rule__ConfigConnection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ConfigConnection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4167:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4168:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4168:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4169:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:4178:1: rule__ConfigConnection__ConnectDeviceAssignment_6 : ( ruleConnectedDevice ) ;
    public final void rule__ConfigConnection__ConnectDeviceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4182:1: ( ( ruleConnectedDevice ) )
            // InternalTargetEnvironmentParser.g:4183:2: ( ruleConnectedDevice )
            {
            // InternalTargetEnvironmentParser.g:4183:2: ( ruleConnectedDevice )
            // InternalTargetEnvironmentParser.g:4184:3: ruleConnectedDevice
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
    // InternalTargetEnvironmentParser.g:4193:1: rule__ConnectedDevice__RefDeviceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__ConnectedDevice__RefDeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4197:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:4198:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:4198:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4199:3: ( ruleEString )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceCrossReference_2_0()); 
            // InternalTargetEnvironmentParser.g:4200:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4201:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:4212:1: rule__ConnectedDevice__RefConnectionAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ConnectedDevice__RefConnectionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4216:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:4217:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:4217:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4218:3: ( ruleEString )
            {
             before(grammarAccess.getConnectedDeviceAccess().getRefConnectionCommunicationConnectionCrossReference_5_0()); 
            // InternalTargetEnvironmentParser.g:4219:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4220:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:4231:1: rule__ConnectedDevice__PropertiesAssignment_6_2 : ( ruleConfigConnectionProperty ) ;
    public final void rule__ConnectedDevice__PropertiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4235:1: ( ( ruleConfigConnectionProperty ) )
            // InternalTargetEnvironmentParser.g:4236:2: ( ruleConfigConnectionProperty )
            {
            // InternalTargetEnvironmentParser.g:4236:2: ( ruleConfigConnectionProperty )
            // InternalTargetEnvironmentParser.g:4237:3: ruleConfigConnectionProperty
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
    // InternalTargetEnvironmentParser.g:4246:1: rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ConfigConnectionProperty__RefConnectionPropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4250:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:4251:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:4251:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4252:3: ( ruleEString )
            {
             before(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyConnectionPropertyCrossReference_3_0()); 
            // InternalTargetEnvironmentParser.g:4253:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4254:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:4265:1: rule__ConfigConnectionProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__ConfigConnectionProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4269:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:4270:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:4270:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:4271:3: rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:4280:1: rule__DeviceSet__DeviceAssignment : ( ruleDeviceType ) ;
    public final void rule__DeviceSet__DeviceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4284:1: ( ( ruleDeviceType ) )
            // InternalTargetEnvironmentParser.g:4285:2: ( ruleDeviceType )
            {
            // InternalTargetEnvironmentParser.g:4285:2: ( ruleDeviceType )
            // InternalTargetEnvironmentParser.g:4286:3: ruleDeviceType
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


    // $ANTLR start "rule__DeviceType__NameAssignment_4"
    // InternalTargetEnvironmentParser.g:4295:1: rule__DeviceType__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__DeviceType__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4299:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4300:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4300:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4301:3: ruleEString
            {
             before(grammarAccess.getDeviceTypeAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeviceTypeAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__NameAssignment_4"


    // $ANTLR start "rule__DeviceType__CapabilityAssignment_5_2"
    // InternalTargetEnvironmentParser.g:4310:1: rule__DeviceType__CapabilityAssignment_5_2 : ( ruleCapabilityProperty ) ;
    public final void rule__DeviceType__CapabilityAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4314:1: ( ( ruleCapabilityProperty ) )
            // InternalTargetEnvironmentParser.g:4315:2: ( ruleCapabilityProperty )
            {
            // InternalTargetEnvironmentParser.g:4315:2: ( ruleCapabilityProperty )
            // InternalTargetEnvironmentParser.g:4316:3: ruleCapabilityProperty
            {
             before(grammarAccess.getDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCapabilityProperty();

            state._fsp--;

             after(grammarAccess.getDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__CapabilityAssignment_5_2"


    // $ANTLR start "rule__DeviceType__CommunicationConnectionAssignment_6_2"
    // InternalTargetEnvironmentParser.g:4325:1: rule__DeviceType__CommunicationConnectionAssignment_6_2 : ( ruleCommunicationConnection ) ;
    public final void rule__DeviceType__CommunicationConnectionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4329:1: ( ( ruleCommunicationConnection ) )
            // InternalTargetEnvironmentParser.g:4330:2: ( ruleCommunicationConnection )
            {
            // InternalTargetEnvironmentParser.g:4330:2: ( ruleCommunicationConnection )
            // InternalTargetEnvironmentParser.g:4331:3: ruleCommunicationConnection
            {
             before(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionCommunicationConnectionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCommunicationConnection();

            state._fsp--;

             after(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionCommunicationConnectionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__CommunicationConnectionAssignment_6_2"


    // $ANTLR start "rule__CapabilityProperty__NameAssignment_2"
    // InternalTargetEnvironmentParser.g:4340:1: rule__CapabilityProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CapabilityProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4344:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4345:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4345:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4346:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:4355:1: rule__CapabilityProperty__TypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__CapabilityProperty__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4359:1: ( ( ( ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:4360:2: ( ( ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:4360:2: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4361:3: ( ruleEString )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeCrossReference_5_0()); 
            // InternalTargetEnvironmentParser.g:4362:3: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4363:4: ruleEString
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
    // InternalTargetEnvironmentParser.g:4374:1: rule__CapabilityProperty__KindAssignment_7 : ( ruleCapabilityKind ) ;
    public final void rule__CapabilityProperty__KindAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4378:1: ( ( ruleCapabilityKind ) )
            // InternalTargetEnvironmentParser.g:4379:2: ( ruleCapabilityKind )
            {
            // InternalTargetEnvironmentParser.g:4379:2: ( ruleCapabilityKind )
            // InternalTargetEnvironmentParser.g:4380:3: ruleCapabilityKind
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
    // InternalTargetEnvironmentParser.g:4389:1: rule__CapabilityProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__CapabilityProperty__ValueAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4393:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:4394:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:4394:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:4395:3: rulePropertyValue
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
    // InternalTargetEnvironmentParser.g:4404:1: rule__ConnectionProperty__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ConnectionProperty__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4408:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4409:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4409:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4410:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:4419:1: rule__ConnectionProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__ConnectionProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4423:1: ( ( rulePropertyValue ) )
            // InternalTargetEnvironmentParser.g:4424:2: ( rulePropertyValue )
            {
            // InternalTargetEnvironmentParser.g:4424:2: ( rulePropertyValue )
            // InternalTargetEnvironmentParser.g:4425:3: rulePropertyValue
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


    // $ANTLR start "rule__CommunicationConnection__NameAssignment_3"
    // InternalTargetEnvironmentParser.g:4434:1: rule__CommunicationConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__CommunicationConnection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4438:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4439:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4439:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4440:3: ruleEString
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
    // InternalTargetEnvironmentParser.g:4449:1: rule__CommunicationConnection__TypeAssignment_6 : ( ruleCommunicationType ) ;
    public final void rule__CommunicationConnection__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4453:1: ( ( ruleCommunicationType ) )
            // InternalTargetEnvironmentParser.g:4454:2: ( ruleCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:4454:2: ( ruleCommunicationType )
            // InternalTargetEnvironmentParser.g:4455:3: ruleCommunicationType
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCommunicationType();

            state._fsp--;

             after(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalTargetEnvironmentParser.g:4464:1: rule__CommunicationConnection__PropertiesAssignment_7_2 : ( ruleConnectionProperty ) ;
    public final void rule__CommunicationConnection__PropertiesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4468:1: ( ( ruleConnectionProperty ) )
            // InternalTargetEnvironmentParser.g:4469:2: ( ruleConnectionProperty )
            {
            // InternalTargetEnvironmentParser.g:4469:2: ( ruleConnectionProperty )
            // InternalTargetEnvironmentParser.g:4470:3: ruleConnectionProperty
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


    // $ANTLR start "rule__CommunicationType__NameAssignment_1"
    // InternalTargetEnvironmentParser.g:4479:1: rule__CommunicationType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CommunicationType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4483:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4484:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4484:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4485:3: ruleEString
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


    // $ANTLR start "rule__CapabilityType__NameAssignment_1"
    // InternalTargetEnvironmentParser.g:4494:1: rule__CapabilityType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CapabilityType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4498:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4499:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4499:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4500:3: ruleEString
            {
             before(grammarAccess.getCapabilityTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCapabilityTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilityType__NameAssignment_1"


    // $ANTLR start "rule__PropertyValueInt__ValueAssignment"
    // InternalTargetEnvironmentParser.g:4509:1: rule__PropertyValueInt__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__PropertyValueInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4513:1: ( ( ruleInteger0 ) )
            // InternalTargetEnvironmentParser.g:4514:2: ( ruleInteger0 )
            {
            // InternalTargetEnvironmentParser.g:4514:2: ( ruleInteger0 )
            // InternalTargetEnvironmentParser.g:4515:3: ruleInteger0
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
    // InternalTargetEnvironmentParser.g:4524:1: rule__PropertyValueDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__PropertyValueDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4528:1: ( ( ruleDouble0 ) )
            // InternalTargetEnvironmentParser.g:4529:2: ( ruleDouble0 )
            {
            // InternalTargetEnvironmentParser.g:4529:2: ( ruleDouble0 )
            // InternalTargetEnvironmentParser.g:4530:3: ruleDouble0
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
    // InternalTargetEnvironmentParser.g:4539:1: rule__PropertyValueString__ValueAssignment : ( ruleEString ) ;
    public final void rule__PropertyValueString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetEnvironmentParser.g:4543:1: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:4544:2: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:4544:2: ( ruleEString )
            // InternalTargetEnvironmentParser.g:4545:3: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000480L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000050060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000040010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000080000L});

}