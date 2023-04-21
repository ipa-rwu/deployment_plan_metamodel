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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "AttributeKind", "SelectionKind", "DeviceType", "MaximumKind", "MinimumKind", "Capability", "Properties", "Value", "Kind", "Name", "Type", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=22;
    public static final int RULE_DATE_TIME=27;
    public static final int RULE_BOOLEAN=19;
    public static final int RULE_STRING=33;
    public static final int AttributeKind=5;
    public static final int RULE_YEAR=24;
    public static final int Properties=11;
    public static final int Name=14;
    public static final int RULE_MIN_SEC=26;
    public static final int RULE_SL_COMMENT=28;
    public static final int CommunicationConnection=4;
    public static final int HyphenMinus=16;
    public static final int RULE_DOUBLE=21;
    public static final int Kind=13;
    public static final int RULE_DECINT=20;
    public static final int MinimumKind=9;
    public static final int EOF=-1;
    public static final int RULE_INDENT=29;
    public static final int RULE_DEDENT=30;
    public static final int RULE_HOUR=25;
    public static final int Capability=10;
    public static final int RULE_ID=31;
    public static final int RULE_WS=35;
    public static final int RULE_DIGIT=17;
    public static final int MaximumKind=8;
    public static final int RULE_ANY_OTHER=36;
    public static final int SelectionKind=6;
    public static final int DeviceType=7;
    public static final int Type=15;
    public static final int RULE_INT=32;
    public static final int Value=12;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_MONTH=23;
    public static final int RULE_BINARY=18;

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
            tokenNameToValue.put("Kind", "'kind:'");
            tokenNameToValue.put("Name", "'name:'");
            tokenNameToValue.put("Type", "'type:'");
            tokenNameToValue.put("Value", "'value:'");
            tokenNameToValue.put("DeviceType", "'DeviceType:'");
            tokenNameToValue.put("MaximumKind", "'MaximumKind'");
            tokenNameToValue.put("MinimumKind", "'MinimumKind'");
            tokenNameToValue.put("Capability", "'capability:'");
            tokenNameToValue.put("Properties", "'properties:'");
            tokenNameToValue.put("AttributeKind", "'AttributeKind'");
            tokenNameToValue.put("SelectionKind", "'SelectionKind'");
            tokenNameToValue.put("CommunicationConnection", "'communicationConnection:'");
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
    // InternalDeviceParser.g:68:1: entryRuleDeviceSet : ruleDeviceSet EOF ;
    public final void entryRuleDeviceSet() throws RecognitionException {
        try {
            // InternalDeviceParser.g:69:1: ( ruleDeviceSet EOF )
            // InternalDeviceParser.g:70:1: ruleDeviceSet EOF
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
    // InternalDeviceParser.g:77:1: ruleDeviceSet : ( ( rule__DeviceSet__DeviceAssignment )* ) ;
    public final void ruleDeviceSet() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:81:2: ( ( ( rule__DeviceSet__DeviceAssignment )* ) )
            // InternalDeviceParser.g:82:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            {
            // InternalDeviceParser.g:82:2: ( ( rule__DeviceSet__DeviceAssignment )* )
            // InternalDeviceParser.g:83:3: ( rule__DeviceSet__DeviceAssignment )*
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceAssignment());
            // InternalDeviceParser.g:84:3: ( rule__DeviceSet__DeviceAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DeviceType) ) {
                    alt1=1;
                }


                switch (alt1) {
                case 1 :
                    // InternalDeviceParser.g:84:4: rule__DeviceSet__DeviceAssignment
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
    // InternalDeviceParser.g:93:1: entryRuleCapabilityKind : ruleCapabilityKind EOF ;
    public final void entryRuleCapabilityKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:94:1: ( ruleCapabilityKind EOF )
            // InternalDeviceParser.g:95:1: ruleCapabilityKind EOF
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
    // InternalDeviceParser.g:102:1: ruleCapabilityKind : ( ( rule__CapabilityKind__Alternatives ) ) ;
    public final void ruleCapabilityKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:106:2: ( ( ( rule__CapabilityKind__Alternatives ) ) )
            // InternalDeviceParser.g:107:2: ( ( rule__CapabilityKind__Alternatives ) )
            {
            // InternalDeviceParser.g:107:2: ( ( rule__CapabilityKind__Alternatives ) )
            // InternalDeviceParser.g:108:3: ( rule__CapabilityKind__Alternatives )
            {
             before(grammarAccess.getCapabilityKindAccess().getAlternatives());
            // InternalDeviceParser.g:109:3: ( rule__CapabilityKind__Alternatives )
            // InternalDeviceParser.g:109:4: rule__CapabilityKind__Alternatives
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
    // InternalDeviceParser.g:118:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:119:1: ( ruleDeviceType EOF )
            // InternalDeviceParser.g:120:1: ruleDeviceType EOF
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
    // InternalDeviceParser.g:127:1: ruleDeviceType : ( ( rule__DeviceType__Group__0 ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:131:2: ( ( ( rule__DeviceType__Group__0 ) ) )
            // InternalDeviceParser.g:132:2: ( ( rule__DeviceType__Group__0 ) )
            {
            // InternalDeviceParser.g:132:2: ( ( rule__DeviceType__Group__0 ) )
            // InternalDeviceParser.g:133:3: ( rule__DeviceType__Group__0 )
            {
             before(grammarAccess.getDeviceTypeAccess().getGroup());
            // InternalDeviceParser.g:134:3: ( rule__DeviceType__Group__0 )
            // InternalDeviceParser.g:134:4: rule__DeviceType__Group__0
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
    // InternalDeviceParser.g:143:1: entryRuleCapabilityProperty : ruleCapabilityProperty EOF ;
    public final void entryRuleCapabilityProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:144:1: ( ruleCapabilityProperty EOF )
            // InternalDeviceParser.g:145:1: ruleCapabilityProperty EOF
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
    // InternalDeviceParser.g:152:1: ruleCapabilityProperty : ( ( rule__CapabilityProperty__Group__0 ) ) ;
    public final void ruleCapabilityProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:156:2: ( ( ( rule__CapabilityProperty__Group__0 ) ) )
            // InternalDeviceParser.g:157:2: ( ( rule__CapabilityProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:157:2: ( ( rule__CapabilityProperty__Group__0 ) )
            // InternalDeviceParser.g:158:3: ( rule__CapabilityProperty__Group__0 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup());
            // InternalDeviceParser.g:159:3: ( rule__CapabilityProperty__Group__0 )
            // InternalDeviceParser.g:159:4: rule__CapabilityProperty__Group__0
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
    // InternalDeviceParser.g:168:1: entryRuleAttributeKind : ruleAttributeKind EOF ;
    public final void entryRuleAttributeKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:169:1: ( ruleAttributeKind EOF )
            // InternalDeviceParser.g:170:1: ruleAttributeKind EOF
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
    // InternalDeviceParser.g:177:1: ruleAttributeKind : ( ( rule__AttributeKind__Group__0 ) ) ;
    public final void ruleAttributeKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:181:2: ( ( ( rule__AttributeKind__Group__0 ) ) )
            // InternalDeviceParser.g:182:2: ( ( rule__AttributeKind__Group__0 ) )
            {
            // InternalDeviceParser.g:182:2: ( ( rule__AttributeKind__Group__0 ) )
            // InternalDeviceParser.g:183:3: ( rule__AttributeKind__Group__0 )
            {
             before(grammarAccess.getAttributeKindAccess().getGroup());
            // InternalDeviceParser.g:184:3: ( rule__AttributeKind__Group__0 )
            // InternalDeviceParser.g:184:4: rule__AttributeKind__Group__0
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
    // InternalDeviceParser.g:193:1: entryRuleMaximumKind : ruleMaximumKind EOF ;
    public final void entryRuleMaximumKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:194:1: ( ruleMaximumKind EOF )
            // InternalDeviceParser.g:195:1: ruleMaximumKind EOF
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
    // InternalDeviceParser.g:202:1: ruleMaximumKind : ( ( rule__MaximumKind__Group__0 ) ) ;
    public final void ruleMaximumKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:206:2: ( ( ( rule__MaximumKind__Group__0 ) ) )
            // InternalDeviceParser.g:207:2: ( ( rule__MaximumKind__Group__0 ) )
            {
            // InternalDeviceParser.g:207:2: ( ( rule__MaximumKind__Group__0 ) )
            // InternalDeviceParser.g:208:3: ( rule__MaximumKind__Group__0 )
            {
             before(grammarAccess.getMaximumKindAccess().getGroup());
            // InternalDeviceParser.g:209:3: ( rule__MaximumKind__Group__0 )
            // InternalDeviceParser.g:209:4: rule__MaximumKind__Group__0
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
    // InternalDeviceParser.g:218:1: entryRuleMinimumKind : ruleMinimumKind EOF ;
    public final void entryRuleMinimumKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:219:1: ( ruleMinimumKind EOF )
            // InternalDeviceParser.g:220:1: ruleMinimumKind EOF
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
    // InternalDeviceParser.g:227:1: ruleMinimumKind : ( ( rule__MinimumKind__Group__0 ) ) ;
    public final void ruleMinimumKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:231:2: ( ( ( rule__MinimumKind__Group__0 ) ) )
            // InternalDeviceParser.g:232:2: ( ( rule__MinimumKind__Group__0 ) )
            {
            // InternalDeviceParser.g:232:2: ( ( rule__MinimumKind__Group__0 ) )
            // InternalDeviceParser.g:233:3: ( rule__MinimumKind__Group__0 )
            {
             before(grammarAccess.getMinimumKindAccess().getGroup());
            // InternalDeviceParser.g:234:3: ( rule__MinimumKind__Group__0 )
            // InternalDeviceParser.g:234:4: rule__MinimumKind__Group__0
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
    // InternalDeviceParser.g:243:1: entryRuleSelectionKind : ruleSelectionKind EOF ;
    public final void entryRuleSelectionKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:244:1: ( ruleSelectionKind EOF )
            // InternalDeviceParser.g:245:1: ruleSelectionKind EOF
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
    // InternalDeviceParser.g:252:1: ruleSelectionKind : ( ( rule__SelectionKind__Group__0 ) ) ;
    public final void ruleSelectionKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:256:2: ( ( ( rule__SelectionKind__Group__0 ) ) )
            // InternalDeviceParser.g:257:2: ( ( rule__SelectionKind__Group__0 ) )
            {
            // InternalDeviceParser.g:257:2: ( ( rule__SelectionKind__Group__0 ) )
            // InternalDeviceParser.g:258:3: ( rule__SelectionKind__Group__0 )
            {
             before(grammarAccess.getSelectionKindAccess().getGroup());
            // InternalDeviceParser.g:259:3: ( rule__SelectionKind__Group__0 )
            // InternalDeviceParser.g:259:4: rule__SelectionKind__Group__0
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
    // InternalDeviceParser.g:268:1: entryRuleConnectionProperty : ruleConnectionProperty EOF ;
    public final void entryRuleConnectionProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:269:1: ( ruleConnectionProperty EOF )
            // InternalDeviceParser.g:270:1: ruleConnectionProperty EOF
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
    // InternalDeviceParser.g:277:1: ruleConnectionProperty : ( ( rule__ConnectionProperty__Group__0 ) ) ;
    public final void ruleConnectionProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:281:2: ( ( ( rule__ConnectionProperty__Group__0 ) ) )
            // InternalDeviceParser.g:282:2: ( ( rule__ConnectionProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:282:2: ( ( rule__ConnectionProperty__Group__0 ) )
            // InternalDeviceParser.g:283:3: ( rule__ConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup());
            // InternalDeviceParser.g:284:3: ( rule__ConnectionProperty__Group__0 )
            // InternalDeviceParser.g:284:4: rule__ConnectionProperty__Group__0
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
    // InternalDeviceParser.g:293:1: entryRuleCommunicationConnection : ruleCommunicationConnection EOF ;
    public final void entryRuleCommunicationConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:294:1: ( ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:295:1: ruleCommunicationConnection EOF
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
    // InternalDeviceParser.g:302:1: ruleCommunicationConnection : ( ( rule__CommunicationConnection__Group__0 ) ) ;
    public final void ruleCommunicationConnection() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:306:2: ( ( ( rule__CommunicationConnection__Group__0 ) ) )
            // InternalDeviceParser.g:307:2: ( ( rule__CommunicationConnection__Group__0 ) )
            {
            // InternalDeviceParser.g:307:2: ( ( rule__CommunicationConnection__Group__0 ) )
            // InternalDeviceParser.g:308:3: ( rule__CommunicationConnection__Group__0 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup());
            // InternalDeviceParser.g:309:3: ( rule__CommunicationConnection__Group__0 )
            // InternalDeviceParser.g:309:4: rule__CommunicationConnection__Group__0
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
    // InternalDeviceParser.g:318:1: entryRuleCommunicationType : ruleCommunicationType EOF ;
    public final void entryRuleCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:319:1: ( ruleCommunicationType EOF )
            // InternalDeviceParser.g:320:1: ruleCommunicationType EOF
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
    // InternalDeviceParser.g:327:1: ruleCommunicationType : ( ( rule__CommunicationType__Group__0 ) ) ;
    public final void ruleCommunicationType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:331:2: ( ( ( rule__CommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:332:2: ( ( rule__CommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:332:2: ( ( rule__CommunicationType__Group__0 ) )
            // InternalDeviceParser.g:333:3: ( rule__CommunicationType__Group__0 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getGroup());
            // InternalDeviceParser.g:334:3: ( rule__CommunicationType__Group__0 )
            // InternalDeviceParser.g:334:4: rule__CommunicationType__Group__0
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
    // InternalDeviceParser.g:343:1: entryRuleCapabilityType : ruleCapabilityType EOF ;
    public final void entryRuleCapabilityType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:344:1: ( ruleCapabilityType EOF )
            // InternalDeviceParser.g:345:1: ruleCapabilityType EOF
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
    // InternalDeviceParser.g:352:1: ruleCapabilityType : ( ( rule__CapabilityType__Group__0 ) ) ;
    public final void ruleCapabilityType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:356:2: ( ( ( rule__CapabilityType__Group__0 ) ) )
            // InternalDeviceParser.g:357:2: ( ( rule__CapabilityType__Group__0 ) )
            {
            // InternalDeviceParser.g:357:2: ( ( rule__CapabilityType__Group__0 ) )
            // InternalDeviceParser.g:358:3: ( rule__CapabilityType__Group__0 )
            {
             before(grammarAccess.getCapabilityTypeAccess().getGroup());
            // InternalDeviceParser.g:359:3: ( rule__CapabilityType__Group__0 )
            // InternalDeviceParser.g:359:4: rule__CapabilityType__Group__0
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
    // InternalDeviceParser.g:368:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalDeviceParser.g:369:1: ( rulePropertyValue EOF )
            // InternalDeviceParser.g:370:1: rulePropertyValue EOF
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
    // InternalDeviceParser.g:377:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:381:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalDeviceParser.g:382:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalDeviceParser.g:382:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalDeviceParser.g:383:3: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives());
            // InternalDeviceParser.g:384:3: ( rule__PropertyValue__Alternatives )
            // InternalDeviceParser.g:384:4: rule__PropertyValue__Alternatives
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
    // InternalDeviceParser.g:393:1: entryRulePropertyValueInt : rulePropertyValueInt EOF ;
    public final void entryRulePropertyValueInt() throws RecognitionException {
        try {
            // InternalDeviceParser.g:394:1: ( rulePropertyValueInt EOF )
            // InternalDeviceParser.g:395:1: rulePropertyValueInt EOF
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
    // InternalDeviceParser.g:402:1: rulePropertyValueInt : ( ( rule__PropertyValueInt__ValueAssignment ) ) ;
    public final void rulePropertyValueInt() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:406:2: ( ( ( rule__PropertyValueInt__ValueAssignment ) ) )
            // InternalDeviceParser.g:407:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            {
            // InternalDeviceParser.g:407:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            // InternalDeviceParser.g:408:3: ( rule__PropertyValueInt__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueIntAccess().getValueAssignment());
            // InternalDeviceParser.g:409:3: ( rule__PropertyValueInt__ValueAssignment )
            // InternalDeviceParser.g:409:4: rule__PropertyValueInt__ValueAssignment
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
    // InternalDeviceParser.g:418:1: entryRulePropertyValueDouble : rulePropertyValueDouble EOF ;
    public final void entryRulePropertyValueDouble() throws RecognitionException {
        try {
            // InternalDeviceParser.g:419:1: ( rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:420:1: rulePropertyValueDouble EOF
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
    // InternalDeviceParser.g:427:1: rulePropertyValueDouble : ( ( rule__PropertyValueDouble__ValueAssignment ) ) ;
    public final void rulePropertyValueDouble() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:431:2: ( ( ( rule__PropertyValueDouble__ValueAssignment ) ) )
            // InternalDeviceParser.g:432:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            {
            // InternalDeviceParser.g:432:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            // InternalDeviceParser.g:433:3: ( rule__PropertyValueDouble__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment());
            // InternalDeviceParser.g:434:3: ( rule__PropertyValueDouble__ValueAssignment )
            // InternalDeviceParser.g:434:4: rule__PropertyValueDouble__ValueAssignment
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
    // InternalDeviceParser.g:443:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // InternalDeviceParser.g:444:1: ( rulePropertyValueString EOF )
            // InternalDeviceParser.g:445:1: rulePropertyValueString EOF
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
    // InternalDeviceParser.g:452:1: rulePropertyValueString : ( ( rule__PropertyValueString__ValueAssignment ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:456:2: ( ( ( rule__PropertyValueString__ValueAssignment ) ) )
            // InternalDeviceParser.g:457:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            {
            // InternalDeviceParser.g:457:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            // InternalDeviceParser.g:458:3: ( rule__PropertyValueString__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueStringAccess().getValueAssignment());
            // InternalDeviceParser.g:459:3: ( rule__PropertyValueString__ValueAssignment )
            // InternalDeviceParser.g:459:4: rule__PropertyValueString__ValueAssignment
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
    // InternalDeviceParser.g:468:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalDeviceParser.g:469:1: ( ruleDouble0 EOF )
            // InternalDeviceParser.g:470:1: ruleDouble0 EOF
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
    // InternalDeviceParser.g:477:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:481:2: ( ( RULE_DOUBLE ) )
            // InternalDeviceParser.g:482:2: ( RULE_DOUBLE )
            {
            // InternalDeviceParser.g:482:2: ( RULE_DOUBLE )
            // InternalDeviceParser.g:483:3: RULE_DOUBLE
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
    // InternalDeviceParser.g:493:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalDeviceParser.g:494:1: ( ruleInteger0 EOF )
            // InternalDeviceParser.g:495:1: ruleInteger0 EOF
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
    // InternalDeviceParser.g:502:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:506:2: ( ( RULE_DECINT ) )
            // InternalDeviceParser.g:507:2: ( RULE_DECINT )
            {
            // InternalDeviceParser.g:507:2: ( RULE_DECINT )
            // InternalDeviceParser.g:508:3: RULE_DECINT
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
    // InternalDeviceParser.g:518:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDeviceParser.g:519:1: ( ruleEString EOF )
            // InternalDeviceParser.g:520:1: ruleEString EOF
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
    // InternalDeviceParser.g:527:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:531:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDeviceParser.g:532:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDeviceParser.g:532:2: ( ( rule__EString__Alternatives ) )
            // InternalDeviceParser.g:533:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives());
            // InternalDeviceParser.g:534:3: ( rule__EString__Alternatives )
            // InternalDeviceParser.g:534:4: rule__EString__Alternatives
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
    // InternalDeviceParser.g:543:1: entryRulePreListElement : rulePreListElement EOF ;
    public final void entryRulePreListElement() throws RecognitionException {

            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:547:1: ( rulePreListElement EOF )
            // InternalDeviceParser.g:548:1: rulePreListElement EOF
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
    // InternalDeviceParser.g:558:1: rulePreListElement : ( HyphenMinus ) ;
    public final void rulePreListElement() throws RecognitionException {

                HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:563:2: ( ( HyphenMinus ) )
            // InternalDeviceParser.g:564:2: ( HyphenMinus )
            {
            // InternalDeviceParser.g:564:2: ( HyphenMinus )
            // InternalDeviceParser.g:565:3: HyphenMinus
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
    // InternalDeviceParser.g:575:1: rule__CapabilityKind__Alternatives : ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) );
    public final void rule__CapabilityKind__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:579:1: ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleSelectionKind ) )
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
                    // InternalDeviceParser.g:580:2: ( ruleAttributeKind )
                    {
                    // InternalDeviceParser.g:580:2: ( ruleAttributeKind )
                    // InternalDeviceParser.g:581:3: ruleAttributeKind
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
                    // InternalDeviceParser.g:586:2: ( ruleMaximumKind )
                    {
                    // InternalDeviceParser.g:586:2: ( ruleMaximumKind )
                    // InternalDeviceParser.g:587:3: ruleMaximumKind
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
                    // InternalDeviceParser.g:592:2: ( ruleMinimumKind )
                    {
                    // InternalDeviceParser.g:592:2: ( ruleMinimumKind )
                    // InternalDeviceParser.g:593:3: ruleMinimumKind
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
                    // InternalDeviceParser.g:598:2: ( ruleSelectionKind )
                    {
                    // InternalDeviceParser.g:598:2: ( ruleSelectionKind )
                    // InternalDeviceParser.g:599:3: ruleSelectionKind
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
    // InternalDeviceParser.g:608:1: rule__PropertyValue__Alternatives : ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:612:1: ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt3=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDeviceParser.g:613:2: ( rulePropertyValueInt )
                    {
                    // InternalDeviceParser.g:613:2: ( rulePropertyValueInt )
                    // InternalDeviceParser.g:614:3: rulePropertyValueInt
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
                    // InternalDeviceParser.g:619:2: ( rulePropertyValueDouble )
                    {
                    // InternalDeviceParser.g:619:2: ( rulePropertyValueDouble )
                    // InternalDeviceParser.g:620:3: rulePropertyValueDouble
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
                    // InternalDeviceParser.g:625:2: ( rulePropertyValueString )
                    {
                    // InternalDeviceParser.g:625:2: ( rulePropertyValueString )
                    // InternalDeviceParser.g:626:3: rulePropertyValueString
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
    // InternalDeviceParser.g:635:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:639:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeviceParser.g:640:2: ( RULE_STRING )
                    {
                    // InternalDeviceParser.g:640:2: ( RULE_STRING )
                    // InternalDeviceParser.g:641:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    match(input,RULE_STRING,FOLLOW_2);
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:646:2: ( RULE_ID )
                    {
                    // InternalDeviceParser.g:646:2: ( RULE_ID )
                    // InternalDeviceParser.g:647:3: RULE_ID
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


    // $ANTLR start "rule__DeviceType__Group__0"
    // InternalDeviceParser.g:656:1: rule__DeviceType__Group__0 : rule__DeviceType__Group__0__Impl rule__DeviceType__Group__1 ;
    public final void rule__DeviceType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:660:1: ( rule__DeviceType__Group__0__Impl rule__DeviceType__Group__1 )
            // InternalDeviceParser.g:661:2: rule__DeviceType__Group__0__Impl rule__DeviceType__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDeviceParser.g:668:1: rule__DeviceType__Group__0__Impl : ( () ) ;
    public final void rule__DeviceType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:672:1: ( ( () ) )
            // InternalDeviceParser.g:673:1: ( () )
            {
            // InternalDeviceParser.g:673:1: ( () )
            // InternalDeviceParser.g:674:2: ()
            {
             before(grammarAccess.getDeviceTypeAccess().getDeviceTypeAction_0());
            // InternalDeviceParser.g:675:2: ()
            // InternalDeviceParser.g:675:3:
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
    // InternalDeviceParser.g:683:1: rule__DeviceType__Group__1 : rule__DeviceType__Group__1__Impl rule__DeviceType__Group__2 ;
    public final void rule__DeviceType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:687:1: ( rule__DeviceType__Group__1__Impl rule__DeviceType__Group__2 )
            // InternalDeviceParser.g:688:2: rule__DeviceType__Group__1__Impl rule__DeviceType__Group__2
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
    // InternalDeviceParser.g:695:1: rule__DeviceType__Group__1__Impl : ( DeviceType ) ;
    public final void rule__DeviceType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:699:1: ( ( DeviceType ) )
            // InternalDeviceParser.g:700:1: ( DeviceType )
            {
            // InternalDeviceParser.g:700:1: ( DeviceType )
            // InternalDeviceParser.g:701:2: DeviceType
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
    // InternalDeviceParser.g:710:1: rule__DeviceType__Group__2 : rule__DeviceType__Group__2__Impl rule__DeviceType__Group__3 ;
    public final void rule__DeviceType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:714:1: ( rule__DeviceType__Group__2__Impl rule__DeviceType__Group__3 )
            // InternalDeviceParser.g:715:2: rule__DeviceType__Group__2__Impl rule__DeviceType__Group__3
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
    // InternalDeviceParser.g:722:1: rule__DeviceType__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:726:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:727:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:727:1: ( RULE_INDENT )
            // InternalDeviceParser.g:728:2: RULE_INDENT
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
    // InternalDeviceParser.g:737:1: rule__DeviceType__Group__3 : rule__DeviceType__Group__3__Impl rule__DeviceType__Group__4 ;
    public final void rule__DeviceType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:741:1: ( rule__DeviceType__Group__3__Impl rule__DeviceType__Group__4 )
            // InternalDeviceParser.g:742:2: rule__DeviceType__Group__3__Impl rule__DeviceType__Group__4
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
    // InternalDeviceParser.g:749:1: rule__DeviceType__Group__3__Impl : ( Name ) ;
    public final void rule__DeviceType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:753:1: ( ( Name ) )
            // InternalDeviceParser.g:754:1: ( Name )
            {
            // InternalDeviceParser.g:754:1: ( Name )
            // InternalDeviceParser.g:755:2: Name
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
    // InternalDeviceParser.g:764:1: rule__DeviceType__Group__4 : rule__DeviceType__Group__4__Impl rule__DeviceType__Group__5 ;
    public final void rule__DeviceType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:768:1: ( rule__DeviceType__Group__4__Impl rule__DeviceType__Group__5 )
            // InternalDeviceParser.g:769:2: rule__DeviceType__Group__4__Impl rule__DeviceType__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeviceParser.g:776:1: rule__DeviceType__Group__4__Impl : ( ( rule__DeviceType__NameAssignment_4 ) ) ;
    public final void rule__DeviceType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:780:1: ( ( ( rule__DeviceType__NameAssignment_4 ) ) )
            // InternalDeviceParser.g:781:1: ( ( rule__DeviceType__NameAssignment_4 ) )
            {
            // InternalDeviceParser.g:781:1: ( ( rule__DeviceType__NameAssignment_4 ) )
            // InternalDeviceParser.g:782:2: ( rule__DeviceType__NameAssignment_4 )
            {
             before(grammarAccess.getDeviceTypeAccess().getNameAssignment_4());
            // InternalDeviceParser.g:783:2: ( rule__DeviceType__NameAssignment_4 )
            // InternalDeviceParser.g:783:3: rule__DeviceType__NameAssignment_4
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
    // InternalDeviceParser.g:791:1: rule__DeviceType__Group__5 : rule__DeviceType__Group__5__Impl rule__DeviceType__Group__6 ;
    public final void rule__DeviceType__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:795:1: ( rule__DeviceType__Group__5__Impl rule__DeviceType__Group__6 )
            // InternalDeviceParser.g:796:2: rule__DeviceType__Group__5__Impl rule__DeviceType__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeviceParser.g:803:1: rule__DeviceType__Group__5__Impl : ( ( rule__DeviceType__Group_5__0 )? ) ;
    public final void rule__DeviceType__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:807:1: ( ( ( rule__DeviceType__Group_5__0 )? ) )
            // InternalDeviceParser.g:808:1: ( ( rule__DeviceType__Group_5__0 )? )
            {
            // InternalDeviceParser.g:808:1: ( ( rule__DeviceType__Group_5__0 )? )
            // InternalDeviceParser.g:809:2: ( rule__DeviceType__Group_5__0 )?
            {
             before(grammarAccess.getDeviceTypeAccess().getGroup_5());
            // InternalDeviceParser.g:810:2: ( rule__DeviceType__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Capability) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDeviceParser.g:810:3: rule__DeviceType__Group_5__0
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
    // InternalDeviceParser.g:818:1: rule__DeviceType__Group__6 : rule__DeviceType__Group__6__Impl rule__DeviceType__Group__7 ;
    public final void rule__DeviceType__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:822:1: ( rule__DeviceType__Group__6__Impl rule__DeviceType__Group__7 )
            // InternalDeviceParser.g:823:2: rule__DeviceType__Group__6__Impl rule__DeviceType__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeviceParser.g:830:1: rule__DeviceType__Group__6__Impl : ( ( rule__DeviceType__Group_6__0 )? ) ;
    public final void rule__DeviceType__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:834:1: ( ( ( rule__DeviceType__Group_6__0 )? ) )
            // InternalDeviceParser.g:835:1: ( ( rule__DeviceType__Group_6__0 )? )
            {
            // InternalDeviceParser.g:835:1: ( ( rule__DeviceType__Group_6__0 )? )
            // InternalDeviceParser.g:836:2: ( rule__DeviceType__Group_6__0 )?
            {
             before(grammarAccess.getDeviceTypeAccess().getGroup_6());
            // InternalDeviceParser.g:837:2: ( rule__DeviceType__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CommunicationConnection) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:837:3: rule__DeviceType__Group_6__0
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
    // InternalDeviceParser.g:845:1: rule__DeviceType__Group__7 : rule__DeviceType__Group__7__Impl ;
    public final void rule__DeviceType__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:849:1: ( rule__DeviceType__Group__7__Impl )
            // InternalDeviceParser.g:850:2: rule__DeviceType__Group__7__Impl
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
    // InternalDeviceParser.g:856:1: rule__DeviceType__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:860:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:861:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:861:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:862:2: RULE_DEDENT
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
    // InternalDeviceParser.g:872:1: rule__DeviceType__Group_5__0 : rule__DeviceType__Group_5__0__Impl rule__DeviceType__Group_5__1 ;
    public final void rule__DeviceType__Group_5__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:876:1: ( rule__DeviceType__Group_5__0__Impl rule__DeviceType__Group_5__1 )
            // InternalDeviceParser.g:877:2: rule__DeviceType__Group_5__0__Impl rule__DeviceType__Group_5__1
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
    // InternalDeviceParser.g:884:1: rule__DeviceType__Group_5__0__Impl : ( Capability ) ;
    public final void rule__DeviceType__Group_5__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:888:1: ( ( Capability ) )
            // InternalDeviceParser.g:889:1: ( Capability )
            {
            // InternalDeviceParser.g:889:1: ( Capability )
            // InternalDeviceParser.g:890:2: Capability
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
    // InternalDeviceParser.g:899:1: rule__DeviceType__Group_5__1 : rule__DeviceType__Group_5__1__Impl rule__DeviceType__Group_5__2 ;
    public final void rule__DeviceType__Group_5__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:903:1: ( rule__DeviceType__Group_5__1__Impl rule__DeviceType__Group_5__2 )
            // InternalDeviceParser.g:904:2: rule__DeviceType__Group_5__1__Impl rule__DeviceType__Group_5__2
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
    // InternalDeviceParser.g:911:1: rule__DeviceType__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType__Group_5__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:915:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:916:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:916:1: ( RULE_INDENT )
            // InternalDeviceParser.g:917:2: RULE_INDENT
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
    // InternalDeviceParser.g:926:1: rule__DeviceType__Group_5__2 : rule__DeviceType__Group_5__2__Impl rule__DeviceType__Group_5__3 ;
    public final void rule__DeviceType__Group_5__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:930:1: ( rule__DeviceType__Group_5__2__Impl rule__DeviceType__Group_5__3 )
            // InternalDeviceParser.g:931:2: rule__DeviceType__Group_5__2__Impl rule__DeviceType__Group_5__3
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
    // InternalDeviceParser.g:938:1: rule__DeviceType__Group_5__2__Impl : ( ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* ) ) ;
    public final void rule__DeviceType__Group_5__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:942:1: ( ( ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* ) ) )
            // InternalDeviceParser.g:943:1: ( ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* ) )
            {
            // InternalDeviceParser.g:943:1: ( ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* ) )
            // InternalDeviceParser.g:944:2: ( ( rule__DeviceType__CapabilityAssignment_5_2 ) ) ( ( rule__DeviceType__CapabilityAssignment_5_2 )* )
            {
            // InternalDeviceParser.g:944:2: ( ( rule__DeviceType__CapabilityAssignment_5_2 ) )
            // InternalDeviceParser.g:945:3: ( rule__DeviceType__CapabilityAssignment_5_2 )
            {
             before(grammarAccess.getDeviceTypeAccess().getCapabilityAssignment_5_2());
            // InternalDeviceParser.g:946:3: ( rule__DeviceType__CapabilityAssignment_5_2 )
            // InternalDeviceParser.g:946:4: rule__DeviceType__CapabilityAssignment_5_2
            {
            pushFollow(FOLLOW_11);
            rule__DeviceType__CapabilityAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getCapabilityAssignment_5_2());

            }

            // InternalDeviceParser.g:949:2: ( ( rule__DeviceType__CapabilityAssignment_5_2 )* )
            // InternalDeviceParser.g:950:3: ( rule__DeviceType__CapabilityAssignment_5_2 )*
            {
             before(grammarAccess.getDeviceTypeAccess().getCapabilityAssignment_5_2());
            // InternalDeviceParser.g:951:3: ( rule__DeviceType__CapabilityAssignment_5_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==HyphenMinus) ) {
                    alt7=1;
                }


                switch (alt7) {
                case 1 :
                    // InternalDeviceParser.g:951:4: rule__DeviceType__CapabilityAssignment_5_2
                    {
                    pushFollow(FOLLOW_11);
                    rule__DeviceType__CapabilityAssignment_5_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop7;
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
    // InternalDeviceParser.g:960:1: rule__DeviceType__Group_5__3 : rule__DeviceType__Group_5__3__Impl ;
    public final void rule__DeviceType__Group_5__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:964:1: ( rule__DeviceType__Group_5__3__Impl )
            // InternalDeviceParser.g:965:2: rule__DeviceType__Group_5__3__Impl
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
    // InternalDeviceParser.g:971:1: rule__DeviceType__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType__Group_5__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:975:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:976:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:976:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:977:2: RULE_DEDENT
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
    // InternalDeviceParser.g:987:1: rule__DeviceType__Group_6__0 : rule__DeviceType__Group_6__0__Impl rule__DeviceType__Group_6__1 ;
    public final void rule__DeviceType__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:991:1: ( rule__DeviceType__Group_6__0__Impl rule__DeviceType__Group_6__1 )
            // InternalDeviceParser.g:992:2: rule__DeviceType__Group_6__0__Impl rule__DeviceType__Group_6__1
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
    // InternalDeviceParser.g:999:1: rule__DeviceType__Group_6__0__Impl : ( CommunicationConnection ) ;
    public final void rule__DeviceType__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1003:1: ( ( CommunicationConnection ) )
            // InternalDeviceParser.g:1004:1: ( CommunicationConnection )
            {
            // InternalDeviceParser.g:1004:1: ( CommunicationConnection )
            // InternalDeviceParser.g:1005:2: CommunicationConnection
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
    // InternalDeviceParser.g:1014:1: rule__DeviceType__Group_6__1 : rule__DeviceType__Group_6__1__Impl rule__DeviceType__Group_6__2 ;
    public final void rule__DeviceType__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1018:1: ( rule__DeviceType__Group_6__1__Impl rule__DeviceType__Group_6__2 )
            // InternalDeviceParser.g:1019:2: rule__DeviceType__Group_6__1__Impl rule__DeviceType__Group_6__2
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
    // InternalDeviceParser.g:1026:1: rule__DeviceType__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1030:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1031:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1031:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1032:2: RULE_INDENT
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
    // InternalDeviceParser.g:1041:1: rule__DeviceType__Group_6__2 : rule__DeviceType__Group_6__2__Impl rule__DeviceType__Group_6__3 ;
    public final void rule__DeviceType__Group_6__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1045:1: ( rule__DeviceType__Group_6__2__Impl rule__DeviceType__Group_6__3 )
            // InternalDeviceParser.g:1046:2: rule__DeviceType__Group_6__2__Impl rule__DeviceType__Group_6__3
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
    // InternalDeviceParser.g:1053:1: rule__DeviceType__Group_6__2__Impl : ( ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* ) ) ;
    public final void rule__DeviceType__Group_6__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1057:1: ( ( ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* ) ) )
            // InternalDeviceParser.g:1058:1: ( ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* ) )
            {
            // InternalDeviceParser.g:1058:1: ( ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* ) )
            // InternalDeviceParser.g:1059:2: ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* )
            {
            // InternalDeviceParser.g:1059:2: ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 ) )
            // InternalDeviceParser.g:1060:3: ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )
            {
             before(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionAssignment_6_2());
            // InternalDeviceParser.g:1061:3: ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )
            // InternalDeviceParser.g:1061:4: rule__DeviceType__CommunicationConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_11);
            rule__DeviceType__CommunicationConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionAssignment_6_2());

            }

            // InternalDeviceParser.g:1064:2: ( ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )* )
            // InternalDeviceParser.g:1065:3: ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getDeviceTypeAccess().getCommunicationConnectionAssignment_6_2());
            // InternalDeviceParser.g:1066:3: ( rule__DeviceType__CommunicationConnectionAssignment_6_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==HyphenMinus) ) {
                    alt8=1;
                }


                switch (alt8) {
                case 1 :
                    // InternalDeviceParser.g:1066:4: rule__DeviceType__CommunicationConnectionAssignment_6_2
                    {
                    pushFollow(FOLLOW_11);
                    rule__DeviceType__CommunicationConnectionAssignment_6_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop8;
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
    // InternalDeviceParser.g:1075:1: rule__DeviceType__Group_6__3 : rule__DeviceType__Group_6__3__Impl ;
    public final void rule__DeviceType__Group_6__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1079:1: ( rule__DeviceType__Group_6__3__Impl )
            // InternalDeviceParser.g:1080:2: rule__DeviceType__Group_6__3__Impl
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
    // InternalDeviceParser.g:1086:1: rule__DeviceType__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType__Group_6__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1090:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1091:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1091:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1092:2: RULE_DEDENT
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
    // InternalDeviceParser.g:1102:1: rule__CapabilityProperty__Group__0 : rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 ;
    public final void rule__CapabilityProperty__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1106:1: ( rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1 )
            // InternalDeviceParser.g:1107:2: rule__CapabilityProperty__Group__0__Impl rule__CapabilityProperty__Group__1
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
    // InternalDeviceParser.g:1114:1: rule__CapabilityProperty__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__CapabilityProperty__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1118:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:1119:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:1119:1: ( rulePreListElement )
            // InternalDeviceParser.g:1120:2: rulePreListElement
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
    // InternalDeviceParser.g:1129:1: rule__CapabilityProperty__Group__1 : rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 ;
    public final void rule__CapabilityProperty__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1133:1: ( rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2 )
            // InternalDeviceParser.g:1134:2: rule__CapabilityProperty__Group__1__Impl rule__CapabilityProperty__Group__2
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
    // InternalDeviceParser.g:1141:1: rule__CapabilityProperty__Group__1__Impl : ( Name ) ;
    public final void rule__CapabilityProperty__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1145:1: ( ( Name ) )
            // InternalDeviceParser.g:1146:1: ( Name )
            {
            // InternalDeviceParser.g:1146:1: ( Name )
            // InternalDeviceParser.g:1147:2: Name
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
    // InternalDeviceParser.g:1156:1: rule__CapabilityProperty__Group__2 : rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 ;
    public final void rule__CapabilityProperty__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1160:1: ( rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3 )
            // InternalDeviceParser.g:1161:2: rule__CapabilityProperty__Group__2__Impl rule__CapabilityProperty__Group__3
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
    // InternalDeviceParser.g:1168:1: rule__CapabilityProperty__Group__2__Impl : ( ( rule__CapabilityProperty__NameAssignment_2 ) ) ;
    public final void rule__CapabilityProperty__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1172:1: ( ( ( rule__CapabilityProperty__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:1173:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:1173:1: ( ( rule__CapabilityProperty__NameAssignment_2 ) )
            // InternalDeviceParser.g:1174:2: ( rule__CapabilityProperty__NameAssignment_2 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getNameAssignment_2());
            // InternalDeviceParser.g:1175:2: ( rule__CapabilityProperty__NameAssignment_2 )
            // InternalDeviceParser.g:1175:3: rule__CapabilityProperty__NameAssignment_2
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
    // InternalDeviceParser.g:1183:1: rule__CapabilityProperty__Group__3 : rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 ;
    public final void rule__CapabilityProperty__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1187:1: ( rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4 )
            // InternalDeviceParser.g:1188:2: rule__CapabilityProperty__Group__3__Impl rule__CapabilityProperty__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalDeviceParser.g:1195:1: rule__CapabilityProperty__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__CapabilityProperty__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1199:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1200:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1200:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1201:2: RULE_INDENT
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
    // InternalDeviceParser.g:1210:1: rule__CapabilityProperty__Group__4 : rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 ;
    public final void rule__CapabilityProperty__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1214:1: ( rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5 )
            // InternalDeviceParser.g:1215:2: rule__CapabilityProperty__Group__4__Impl rule__CapabilityProperty__Group__5
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
    // InternalDeviceParser.g:1222:1: rule__CapabilityProperty__Group__4__Impl : ( Type ) ;
    public final void rule__CapabilityProperty__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1226:1: ( ( Type ) )
            // InternalDeviceParser.g:1227:1: ( Type )
            {
            // InternalDeviceParser.g:1227:1: ( Type )
            // InternalDeviceParser.g:1228:2: Type
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
    // InternalDeviceParser.g:1237:1: rule__CapabilityProperty__Group__5 : rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 ;
    public final void rule__CapabilityProperty__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1241:1: ( rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6 )
            // InternalDeviceParser.g:1242:2: rule__CapabilityProperty__Group__5__Impl rule__CapabilityProperty__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalDeviceParser.g:1249:1: rule__CapabilityProperty__Group__5__Impl : ( ( rule__CapabilityProperty__TypeAssignment_5 ) ) ;
    public final void rule__CapabilityProperty__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1253:1: ( ( ( rule__CapabilityProperty__TypeAssignment_5 ) ) )
            // InternalDeviceParser.g:1254:1: ( ( rule__CapabilityProperty__TypeAssignment_5 ) )
            {
            // InternalDeviceParser.g:1254:1: ( ( rule__CapabilityProperty__TypeAssignment_5 ) )
            // InternalDeviceParser.g:1255:2: ( rule__CapabilityProperty__TypeAssignment_5 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeAssignment_5());
            // InternalDeviceParser.g:1256:2: ( rule__CapabilityProperty__TypeAssignment_5 )
            // InternalDeviceParser.g:1256:3: rule__CapabilityProperty__TypeAssignment_5
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
    // InternalDeviceParser.g:1264:1: rule__CapabilityProperty__Group__6 : rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 ;
    public final void rule__CapabilityProperty__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1268:1: ( rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7 )
            // InternalDeviceParser.g:1269:2: rule__CapabilityProperty__Group__6__Impl rule__CapabilityProperty__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1276:1: rule__CapabilityProperty__Group__6__Impl : ( Kind ) ;
    public final void rule__CapabilityProperty__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1280:1: ( ( Kind ) )
            // InternalDeviceParser.g:1281:1: ( Kind )
            {
            // InternalDeviceParser.g:1281:1: ( Kind )
            // InternalDeviceParser.g:1282:2: Kind
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
    // InternalDeviceParser.g:1291:1: rule__CapabilityProperty__Group__7 : rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 ;
    public final void rule__CapabilityProperty__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1295:1: ( rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8 )
            // InternalDeviceParser.g:1296:2: rule__CapabilityProperty__Group__7__Impl rule__CapabilityProperty__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalDeviceParser.g:1303:1: rule__CapabilityProperty__Group__7__Impl : ( ( rule__CapabilityProperty__KindAssignment_7 ) ) ;
    public final void rule__CapabilityProperty__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1307:1: ( ( ( rule__CapabilityProperty__KindAssignment_7 ) ) )
            // InternalDeviceParser.g:1308:1: ( ( rule__CapabilityProperty__KindAssignment_7 ) )
            {
            // InternalDeviceParser.g:1308:1: ( ( rule__CapabilityProperty__KindAssignment_7 ) )
            // InternalDeviceParser.g:1309:2: ( rule__CapabilityProperty__KindAssignment_7 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getKindAssignment_7());
            // InternalDeviceParser.g:1310:2: ( rule__CapabilityProperty__KindAssignment_7 )
            // InternalDeviceParser.g:1310:3: rule__CapabilityProperty__KindAssignment_7
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
    // InternalDeviceParser.g:1318:1: rule__CapabilityProperty__Group__8 : rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 ;
    public final void rule__CapabilityProperty__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1322:1: ( rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9 )
            // InternalDeviceParser.g:1323:2: rule__CapabilityProperty__Group__8__Impl rule__CapabilityProperty__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalDeviceParser.g:1330:1: rule__CapabilityProperty__Group__8__Impl : ( ( rule__CapabilityProperty__Group_8__0 )? ) ;
    public final void rule__CapabilityProperty__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1334:1: ( ( ( rule__CapabilityProperty__Group_8__0 )? ) )
            // InternalDeviceParser.g:1335:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            {
            // InternalDeviceParser.g:1335:1: ( ( rule__CapabilityProperty__Group_8__0 )? )
            // InternalDeviceParser.g:1336:2: ( rule__CapabilityProperty__Group_8__0 )?
            {
             before(grammarAccess.getCapabilityPropertyAccess().getGroup_8());
            // InternalDeviceParser.g:1337:2: ( rule__CapabilityProperty__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Value) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeviceParser.g:1337:3: rule__CapabilityProperty__Group_8__0
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
    // InternalDeviceParser.g:1345:1: rule__CapabilityProperty__Group__9 : rule__CapabilityProperty__Group__9__Impl ;
    public final void rule__CapabilityProperty__Group__9() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1349:1: ( rule__CapabilityProperty__Group__9__Impl )
            // InternalDeviceParser.g:1350:2: rule__CapabilityProperty__Group__9__Impl
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
    // InternalDeviceParser.g:1356:1: rule__CapabilityProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__CapabilityProperty__Group__9__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1360:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1361:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1361:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1362:2: RULE_DEDENT
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
    // InternalDeviceParser.g:1372:1: rule__CapabilityProperty__Group_8__0 : rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 ;
    public final void rule__CapabilityProperty__Group_8__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1376:1: ( rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1 )
            // InternalDeviceParser.g:1377:2: rule__CapabilityProperty__Group_8__0__Impl rule__CapabilityProperty__Group_8__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDeviceParser.g:1384:1: rule__CapabilityProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__CapabilityProperty__Group_8__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1388:1: ( ( Value ) )
            // InternalDeviceParser.g:1389:1: ( Value )
            {
            // InternalDeviceParser.g:1389:1: ( Value )
            // InternalDeviceParser.g:1390:2: Value
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
    // InternalDeviceParser.g:1399:1: rule__CapabilityProperty__Group_8__1 : rule__CapabilityProperty__Group_8__1__Impl ;
    public final void rule__CapabilityProperty__Group_8__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1403:1: ( rule__CapabilityProperty__Group_8__1__Impl )
            // InternalDeviceParser.g:1404:2: rule__CapabilityProperty__Group_8__1__Impl
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
    // InternalDeviceParser.g:1410:1: rule__CapabilityProperty__Group_8__1__Impl : ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__CapabilityProperty__Group_8__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1414:1: ( ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) ) )
            // InternalDeviceParser.g:1415:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            {
            // InternalDeviceParser.g:1415:1: ( ( rule__CapabilityProperty__ValueAssignment_8_1 ) )
            // InternalDeviceParser.g:1416:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getValueAssignment_8_1());
            // InternalDeviceParser.g:1417:2: ( rule__CapabilityProperty__ValueAssignment_8_1 )
            // InternalDeviceParser.g:1417:3: rule__CapabilityProperty__ValueAssignment_8_1
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
    // InternalDeviceParser.g:1426:1: rule__AttributeKind__Group__0 : rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 ;
    public final void rule__AttributeKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1430:1: ( rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 )
            // InternalDeviceParser.g:1431:2: rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDeviceParser.g:1438:1: rule__AttributeKind__Group__0__Impl : ( () ) ;
    public final void rule__AttributeKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1442:1: ( ( () ) )
            // InternalDeviceParser.g:1443:1: ( () )
            {
            // InternalDeviceParser.g:1443:1: ( () )
            // InternalDeviceParser.g:1444:2: ()
            {
             before(grammarAccess.getAttributeKindAccess().getAttributeKindAction_0());
            // InternalDeviceParser.g:1445:2: ()
            // InternalDeviceParser.g:1445:3:
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
    // InternalDeviceParser.g:1453:1: rule__AttributeKind__Group__1 : rule__AttributeKind__Group__1__Impl ;
    public final void rule__AttributeKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1457:1: ( rule__AttributeKind__Group__1__Impl )
            // InternalDeviceParser.g:1458:2: rule__AttributeKind__Group__1__Impl
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
    // InternalDeviceParser.g:1464:1: rule__AttributeKind__Group__1__Impl : ( AttributeKind ) ;
    public final void rule__AttributeKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1468:1: ( ( AttributeKind ) )
            // InternalDeviceParser.g:1469:1: ( AttributeKind )
            {
            // InternalDeviceParser.g:1469:1: ( AttributeKind )
            // InternalDeviceParser.g:1470:2: AttributeKind
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
    // InternalDeviceParser.g:1480:1: rule__MaximumKind__Group__0 : rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 ;
    public final void rule__MaximumKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1484:1: ( rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 )
            // InternalDeviceParser.g:1485:2: rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDeviceParser.g:1492:1: rule__MaximumKind__Group__0__Impl : ( () ) ;
    public final void rule__MaximumKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1496:1: ( ( () ) )
            // InternalDeviceParser.g:1497:1: ( () )
            {
            // InternalDeviceParser.g:1497:1: ( () )
            // InternalDeviceParser.g:1498:2: ()
            {
             before(grammarAccess.getMaximumKindAccess().getMaximumKindAction_0());
            // InternalDeviceParser.g:1499:2: ()
            // InternalDeviceParser.g:1499:3:
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
    // InternalDeviceParser.g:1507:1: rule__MaximumKind__Group__1 : rule__MaximumKind__Group__1__Impl ;
    public final void rule__MaximumKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1511:1: ( rule__MaximumKind__Group__1__Impl )
            // InternalDeviceParser.g:1512:2: rule__MaximumKind__Group__1__Impl
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
    // InternalDeviceParser.g:1518:1: rule__MaximumKind__Group__1__Impl : ( MaximumKind ) ;
    public final void rule__MaximumKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1522:1: ( ( MaximumKind ) )
            // InternalDeviceParser.g:1523:1: ( MaximumKind )
            {
            // InternalDeviceParser.g:1523:1: ( MaximumKind )
            // InternalDeviceParser.g:1524:2: MaximumKind
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
    // InternalDeviceParser.g:1534:1: rule__MinimumKind__Group__0 : rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 ;
    public final void rule__MinimumKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1538:1: ( rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 )
            // InternalDeviceParser.g:1539:2: rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDeviceParser.g:1546:1: rule__MinimumKind__Group__0__Impl : ( () ) ;
    public final void rule__MinimumKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1550:1: ( ( () ) )
            // InternalDeviceParser.g:1551:1: ( () )
            {
            // InternalDeviceParser.g:1551:1: ( () )
            // InternalDeviceParser.g:1552:2: ()
            {
             before(grammarAccess.getMinimumKindAccess().getMinimumKindAction_0());
            // InternalDeviceParser.g:1553:2: ()
            // InternalDeviceParser.g:1553:3:
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
    // InternalDeviceParser.g:1561:1: rule__MinimumKind__Group__1 : rule__MinimumKind__Group__1__Impl ;
    public final void rule__MinimumKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1565:1: ( rule__MinimumKind__Group__1__Impl )
            // InternalDeviceParser.g:1566:2: rule__MinimumKind__Group__1__Impl
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
    // InternalDeviceParser.g:1572:1: rule__MinimumKind__Group__1__Impl : ( MinimumKind ) ;
    public final void rule__MinimumKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1576:1: ( ( MinimumKind ) )
            // InternalDeviceParser.g:1577:1: ( MinimumKind )
            {
            // InternalDeviceParser.g:1577:1: ( MinimumKind )
            // InternalDeviceParser.g:1578:2: MinimumKind
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
    // InternalDeviceParser.g:1588:1: rule__SelectionKind__Group__0 : rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 ;
    public final void rule__SelectionKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1592:1: ( rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 )
            // InternalDeviceParser.g:1593:2: rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:1600:1: rule__SelectionKind__Group__0__Impl : ( () ) ;
    public final void rule__SelectionKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1604:1: ( ( () ) )
            // InternalDeviceParser.g:1605:1: ( () )
            {
            // InternalDeviceParser.g:1605:1: ( () )
            // InternalDeviceParser.g:1606:2: ()
            {
             before(grammarAccess.getSelectionKindAccess().getSelectionKindAction_0());
            // InternalDeviceParser.g:1607:2: ()
            // InternalDeviceParser.g:1607:3:
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
    // InternalDeviceParser.g:1615:1: rule__SelectionKind__Group__1 : rule__SelectionKind__Group__1__Impl ;
    public final void rule__SelectionKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1619:1: ( rule__SelectionKind__Group__1__Impl )
            // InternalDeviceParser.g:1620:2: rule__SelectionKind__Group__1__Impl
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
    // InternalDeviceParser.g:1626:1: rule__SelectionKind__Group__1__Impl : ( SelectionKind ) ;
    public final void rule__SelectionKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1630:1: ( ( SelectionKind ) )
            // InternalDeviceParser.g:1631:1: ( SelectionKind )
            {
            // InternalDeviceParser.g:1631:1: ( SelectionKind )
            // InternalDeviceParser.g:1632:2: SelectionKind
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
    // InternalDeviceParser.g:1642:1: rule__ConnectionProperty__Group__0 : rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 ;
    public final void rule__ConnectionProperty__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1646:1: ( rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 )
            // InternalDeviceParser.g:1647:2: rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1
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
    // InternalDeviceParser.g:1654:1: rule__ConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionProperty__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1658:1: ( ( () ) )
            // InternalDeviceParser.g:1659:1: ( () )
            {
            // InternalDeviceParser.g:1659:1: ( () )
            // InternalDeviceParser.g:1660:2: ()
            {
             before(grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0());
            // InternalDeviceParser.g:1661:2: ()
            // InternalDeviceParser.g:1661:3:
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
    // InternalDeviceParser.g:1669:1: rule__ConnectionProperty__Group__1 : rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 ;
    public final void rule__ConnectionProperty__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1673:1: ( rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 )
            // InternalDeviceParser.g:1674:2: rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2
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
    // InternalDeviceParser.g:1681:1: rule__ConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectionProperty__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1685:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:1686:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:1686:1: ( rulePreListElement )
            // InternalDeviceParser.g:1687:2: rulePreListElement
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
    // InternalDeviceParser.g:1696:1: rule__ConnectionProperty__Group__2 : rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 ;
    public final void rule__ConnectionProperty__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1700:1: ( rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 )
            // InternalDeviceParser.g:1701:2: rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3
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
    // InternalDeviceParser.g:1708:1: rule__ConnectionProperty__Group__2__Impl : ( Name ) ;
    public final void rule__ConnectionProperty__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1712:1: ( ( Name ) )
            // InternalDeviceParser.g:1713:1: ( Name )
            {
            // InternalDeviceParser.g:1713:1: ( Name )
            // InternalDeviceParser.g:1714:2: Name
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
    // InternalDeviceParser.g:1723:1: rule__ConnectionProperty__Group__3 : rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 ;
    public final void rule__ConnectionProperty__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1727:1: ( rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 )
            // InternalDeviceParser.g:1728:2: rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4
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
    // InternalDeviceParser.g:1735:1: rule__ConnectionProperty__Group__3__Impl : ( ( rule__ConnectionProperty__NameAssignment_3 ) ) ;
    public final void rule__ConnectionProperty__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1739:1: ( ( ( rule__ConnectionProperty__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:1740:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:1740:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            // InternalDeviceParser.g:1741:2: ( rule__ConnectionProperty__NameAssignment_3 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3());
            // InternalDeviceParser.g:1742:2: ( rule__ConnectionProperty__NameAssignment_3 )
            // InternalDeviceParser.g:1742:3: rule__ConnectionProperty__NameAssignment_3
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
    // InternalDeviceParser.g:1750:1: rule__ConnectionProperty__Group__4 : rule__ConnectionProperty__Group__4__Impl ;
    public final void rule__ConnectionProperty__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1754:1: ( rule__ConnectionProperty__Group__4__Impl )
            // InternalDeviceParser.g:1755:2: rule__ConnectionProperty__Group__4__Impl
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
    // InternalDeviceParser.g:1761:1: rule__ConnectionProperty__Group__4__Impl : ( ( rule__ConnectionProperty__Group_4__0 )? ) ;
    public final void rule__ConnectionProperty__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1765:1: ( ( ( rule__ConnectionProperty__Group_4__0 )? ) )
            // InternalDeviceParser.g:1766:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            {
            // InternalDeviceParser.g:1766:1: ( ( rule__ConnectionProperty__Group_4__0 )? )
            // InternalDeviceParser.g:1767:2: ( rule__ConnectionProperty__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup_4());
            // InternalDeviceParser.g:1768:2: ( rule__ConnectionProperty__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INDENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceParser.g:1768:3: rule__ConnectionProperty__Group_4__0
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
    // InternalDeviceParser.g:1777:1: rule__ConnectionProperty__Group_4__0 : rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 ;
    public final void rule__ConnectionProperty__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1781:1: ( rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1 )
            // InternalDeviceParser.g:1782:2: rule__ConnectionProperty__Group_4__0__Impl rule__ConnectionProperty__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDeviceParser.g:1789:1: rule__ConnectionProperty__Group_4__0__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectionProperty__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1793:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1794:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1794:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1795:2: RULE_INDENT
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
    // InternalDeviceParser.g:1804:1: rule__ConnectionProperty__Group_4__1 : rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 ;
    public final void rule__ConnectionProperty__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1808:1: ( rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2 )
            // InternalDeviceParser.g:1809:2: rule__ConnectionProperty__Group_4__1__Impl rule__ConnectionProperty__Group_4__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDeviceParser.g:1816:1: rule__ConnectionProperty__Group_4__1__Impl : ( Value ) ;
    public final void rule__ConnectionProperty__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1820:1: ( ( Value ) )
            // InternalDeviceParser.g:1821:1: ( Value )
            {
            // InternalDeviceParser.g:1821:1: ( Value )
            // InternalDeviceParser.g:1822:2: Value
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
    // InternalDeviceParser.g:1831:1: rule__ConnectionProperty__Group_4__2 : rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 ;
    public final void rule__ConnectionProperty__Group_4__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1835:1: ( rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3 )
            // InternalDeviceParser.g:1836:2: rule__ConnectionProperty__Group_4__2__Impl rule__ConnectionProperty__Group_4__3
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
    // InternalDeviceParser.g:1843:1: rule__ConnectionProperty__Group_4__2__Impl : ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__ConnectionProperty__Group_4__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1847:1: ( ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) ) )
            // InternalDeviceParser.g:1848:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            {
            // InternalDeviceParser.g:1848:1: ( ( rule__ConnectionProperty__ValueAssignment_4_2 ) )
            // InternalDeviceParser.g:1849:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getValueAssignment_4_2());
            // InternalDeviceParser.g:1850:2: ( rule__ConnectionProperty__ValueAssignment_4_2 )
            // InternalDeviceParser.g:1850:3: rule__ConnectionProperty__ValueAssignment_4_2
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
    // InternalDeviceParser.g:1858:1: rule__ConnectionProperty__Group_4__3 : rule__ConnectionProperty__Group_4__3__Impl ;
    public final void rule__ConnectionProperty__Group_4__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1862:1: ( rule__ConnectionProperty__Group_4__3__Impl )
            // InternalDeviceParser.g:1863:2: rule__ConnectionProperty__Group_4__3__Impl
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
    // InternalDeviceParser.g:1869:1: rule__ConnectionProperty__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectionProperty__Group_4__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1873:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1874:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1874:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1875:2: RULE_DEDENT
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
    // InternalDeviceParser.g:1885:1: rule__CommunicationConnection__Group__0 : rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 ;
    public final void rule__CommunicationConnection__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1889:1: ( rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 )
            // InternalDeviceParser.g:1890:2: rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1
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
    // InternalDeviceParser.g:1897:1: rule__CommunicationConnection__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationConnection__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1901:1: ( ( () ) )
            // InternalDeviceParser.g:1902:1: ( () )
            {
            // InternalDeviceParser.g:1902:1: ( () )
            // InternalDeviceParser.g:1903:2: ()
            {
             before(grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0());
            // InternalDeviceParser.g:1904:2: ()
            // InternalDeviceParser.g:1904:3:
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
    // InternalDeviceParser.g:1912:1: rule__CommunicationConnection__Group__1 : rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 ;
    public final void rule__CommunicationConnection__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1916:1: ( rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 )
            // InternalDeviceParser.g:1917:2: rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2
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
    // InternalDeviceParser.g:1924:1: rule__CommunicationConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__CommunicationConnection__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1928:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:1929:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:1929:1: ( rulePreListElement )
            // InternalDeviceParser.g:1930:2: rulePreListElement
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
    // InternalDeviceParser.g:1939:1: rule__CommunicationConnection__Group__2 : rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 ;
    public final void rule__CommunicationConnection__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1943:1: ( rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 )
            // InternalDeviceParser.g:1944:2: rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3
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
    // InternalDeviceParser.g:1951:1: rule__CommunicationConnection__Group__2__Impl : ( Name ) ;
    public final void rule__CommunicationConnection__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1955:1: ( ( Name ) )
            // InternalDeviceParser.g:1956:1: ( Name )
            {
            // InternalDeviceParser.g:1956:1: ( Name )
            // InternalDeviceParser.g:1957:2: Name
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
    // InternalDeviceParser.g:1966:1: rule__CommunicationConnection__Group__3 : rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 ;
    public final void rule__CommunicationConnection__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1970:1: ( rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 )
            // InternalDeviceParser.g:1971:2: rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4
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
    // InternalDeviceParser.g:1978:1: rule__CommunicationConnection__Group__3__Impl : ( ( rule__CommunicationConnection__NameAssignment_3 ) ) ;
    public final void rule__CommunicationConnection__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1982:1: ( ( ( rule__CommunicationConnection__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:1983:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:1983:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            // InternalDeviceParser.g:1984:2: ( rule__CommunicationConnection__NameAssignment_3 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3());
            // InternalDeviceParser.g:1985:2: ( rule__CommunicationConnection__NameAssignment_3 )
            // InternalDeviceParser.g:1985:3: rule__CommunicationConnection__NameAssignment_3
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
    // InternalDeviceParser.g:1993:1: rule__CommunicationConnection__Group__4 : rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 ;
    public final void rule__CommunicationConnection__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1997:1: ( rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 )
            // InternalDeviceParser.g:1998:2: rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalDeviceParser.g:2005:1: rule__CommunicationConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2009:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2010:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2010:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2011:2: RULE_INDENT
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
    // InternalDeviceParser.g:2020:1: rule__CommunicationConnection__Group__5 : rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 ;
    public final void rule__CommunicationConnection__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2024:1: ( rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 )
            // InternalDeviceParser.g:2025:2: rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6
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
    // InternalDeviceParser.g:2032:1: rule__CommunicationConnection__Group__5__Impl : ( Type ) ;
    public final void rule__CommunicationConnection__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2036:1: ( ( Type ) )
            // InternalDeviceParser.g:2037:1: ( Type )
            {
            // InternalDeviceParser.g:2037:1: ( Type )
            // InternalDeviceParser.g:2038:2: Type
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
    // InternalDeviceParser.g:2047:1: rule__CommunicationConnection__Group__6 : rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 ;
    public final void rule__CommunicationConnection__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2051:1: ( rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 )
            // InternalDeviceParser.g:2052:2: rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalDeviceParser.g:2059:1: rule__CommunicationConnection__Group__6__Impl : ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) ;
    public final void rule__CommunicationConnection__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2063:1: ( ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) )
            // InternalDeviceParser.g:2064:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            {
            // InternalDeviceParser.g:2064:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            // InternalDeviceParser.g:2065:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6());
            // InternalDeviceParser.g:2066:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            // InternalDeviceParser.g:2066:3: rule__CommunicationConnection__TypeAssignment_6
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
    // InternalDeviceParser.g:2074:1: rule__CommunicationConnection__Group__7 : rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 ;
    public final void rule__CommunicationConnection__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2078:1: ( rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 )
            // InternalDeviceParser.g:2079:2: rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalDeviceParser.g:2086:1: rule__CommunicationConnection__Group__7__Impl : ( ( rule__CommunicationConnection__Group_7__0 )? ) ;
    public final void rule__CommunicationConnection__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2090:1: ( ( ( rule__CommunicationConnection__Group_7__0 )? ) )
            // InternalDeviceParser.g:2091:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            {
            // InternalDeviceParser.g:2091:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            // InternalDeviceParser.g:2092:2: ( rule__CommunicationConnection__Group_7__0 )?
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup_7());
            // InternalDeviceParser.g:2093:2: ( rule__CommunicationConnection__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Properties) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeviceParser.g:2093:3: rule__CommunicationConnection__Group_7__0
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
    // InternalDeviceParser.g:2101:1: rule__CommunicationConnection__Group__8 : rule__CommunicationConnection__Group__8__Impl ;
    public final void rule__CommunicationConnection__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2105:1: ( rule__CommunicationConnection__Group__8__Impl )
            // InternalDeviceParser.g:2106:2: rule__CommunicationConnection__Group__8__Impl
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
    // InternalDeviceParser.g:2112:1: rule__CommunicationConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2116:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2117:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2117:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2118:2: RULE_DEDENT
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
    // InternalDeviceParser.g:2128:1: rule__CommunicationConnection__Group_7__0 : rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 ;
    public final void rule__CommunicationConnection__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2132:1: ( rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 )
            // InternalDeviceParser.g:2133:2: rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1
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
    // InternalDeviceParser.g:2140:1: rule__CommunicationConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__CommunicationConnection__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2144:1: ( ( Properties ) )
            // InternalDeviceParser.g:2145:1: ( Properties )
            {
            // InternalDeviceParser.g:2145:1: ( Properties )
            // InternalDeviceParser.g:2146:2: Properties
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
    // InternalDeviceParser.g:2155:1: rule__CommunicationConnection__Group_7__1 : rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 ;
    public final void rule__CommunicationConnection__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2159:1: ( rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 )
            // InternalDeviceParser.g:2160:2: rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2
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
    // InternalDeviceParser.g:2167:1: rule__CommunicationConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2171:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2172:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2172:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2173:2: RULE_INDENT
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
    // InternalDeviceParser.g:2182:1: rule__CommunicationConnection__Group_7__2 : rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 ;
    public final void rule__CommunicationConnection__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2186:1: ( rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 )
            // InternalDeviceParser.g:2187:2: rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3
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
    // InternalDeviceParser.g:2194:1: rule__CommunicationConnection__Group_7__2__Impl : ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__CommunicationConnection__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2198:1: ( ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalDeviceParser.g:2199:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalDeviceParser.g:2199:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            // InternalDeviceParser.g:2200:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalDeviceParser.g:2200:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) )
            // InternalDeviceParser.g:2201:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2());
            // InternalDeviceParser.g:2202:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            // InternalDeviceParser.g:2202:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_11);
            rule__CommunicationConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2());

            }

            // InternalDeviceParser.g:2205:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            // InternalDeviceParser.g:2206:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2());
            // InternalDeviceParser.g:2207:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==HyphenMinus) ) {
                    alt12=1;
                }


                switch (alt12) {
                case 1 :
                    // InternalDeviceParser.g:2207:4: rule__CommunicationConnection__PropertiesAssignment_7_2
                    {
                    pushFollow(FOLLOW_11);
                    rule__CommunicationConnection__PropertiesAssignment_7_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop12;
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
    // InternalDeviceParser.g:2216:1: rule__CommunicationConnection__Group_7__3 : rule__CommunicationConnection__Group_7__3__Impl ;
    public final void rule__CommunicationConnection__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2220:1: ( rule__CommunicationConnection__Group_7__3__Impl )
            // InternalDeviceParser.g:2221:2: rule__CommunicationConnection__Group_7__3__Impl
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
    // InternalDeviceParser.g:2227:1: rule__CommunicationConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2231:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2232:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2232:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2233:2: RULE_DEDENT
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
    // InternalDeviceParser.g:2243:1: rule__CommunicationType__Group__0 : rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 ;
    public final void rule__CommunicationType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2247:1: ( rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 )
            // InternalDeviceParser.g:2248:2: rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1
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
    // InternalDeviceParser.g:2255:1: rule__CommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2259:1: ( ( () ) )
            // InternalDeviceParser.g:2260:1: ( () )
            {
            // InternalDeviceParser.g:2260:1: ( () )
            // InternalDeviceParser.g:2261:2: ()
            {
             before(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0());
            // InternalDeviceParser.g:2262:2: ()
            // InternalDeviceParser.g:2262:3:
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
    // InternalDeviceParser.g:2270:1: rule__CommunicationType__Group__1 : rule__CommunicationType__Group__1__Impl ;
    public final void rule__CommunicationType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2274:1: ( rule__CommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:2275:2: rule__CommunicationType__Group__1__Impl
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
    // InternalDeviceParser.g:2281:1: rule__CommunicationType__Group__1__Impl : ( ( rule__CommunicationType__NameAssignment_1 ) ) ;
    public final void rule__CommunicationType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2285:1: ( ( ( rule__CommunicationType__NameAssignment_1 ) ) )
            // InternalDeviceParser.g:2286:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            {
            // InternalDeviceParser.g:2286:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            // InternalDeviceParser.g:2287:2: ( rule__CommunicationType__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1());
            // InternalDeviceParser.g:2288:2: ( rule__CommunicationType__NameAssignment_1 )
            // InternalDeviceParser.g:2288:3: rule__CommunicationType__NameAssignment_1
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
    // InternalDeviceParser.g:2297:1: rule__CapabilityType__Group__0 : rule__CapabilityType__Group__0__Impl rule__CapabilityType__Group__1 ;
    public final void rule__CapabilityType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2301:1: ( rule__CapabilityType__Group__0__Impl rule__CapabilityType__Group__1 )
            // InternalDeviceParser.g:2302:2: rule__CapabilityType__Group__0__Impl rule__CapabilityType__Group__1
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
    // InternalDeviceParser.g:2309:1: rule__CapabilityType__Group__0__Impl : ( () ) ;
    public final void rule__CapabilityType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2313:1: ( ( () ) )
            // InternalDeviceParser.g:2314:1: ( () )
            {
            // InternalDeviceParser.g:2314:1: ( () )
            // InternalDeviceParser.g:2315:2: ()
            {
             before(grammarAccess.getCapabilityTypeAccess().getCapabilityTypeAction_0());
            // InternalDeviceParser.g:2316:2: ()
            // InternalDeviceParser.g:2316:3:
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
    // InternalDeviceParser.g:2324:1: rule__CapabilityType__Group__1 : rule__CapabilityType__Group__1__Impl ;
    public final void rule__CapabilityType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2328:1: ( rule__CapabilityType__Group__1__Impl )
            // InternalDeviceParser.g:2329:2: rule__CapabilityType__Group__1__Impl
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
    // InternalDeviceParser.g:2335:1: rule__CapabilityType__Group__1__Impl : ( ( rule__CapabilityType__NameAssignment_1 ) ) ;
    public final void rule__CapabilityType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2339:1: ( ( ( rule__CapabilityType__NameAssignment_1 ) ) )
            // InternalDeviceParser.g:2340:1: ( ( rule__CapabilityType__NameAssignment_1 ) )
            {
            // InternalDeviceParser.g:2340:1: ( ( rule__CapabilityType__NameAssignment_1 ) )
            // InternalDeviceParser.g:2341:2: ( rule__CapabilityType__NameAssignment_1 )
            {
             before(grammarAccess.getCapabilityTypeAccess().getNameAssignment_1());
            // InternalDeviceParser.g:2342:2: ( rule__CapabilityType__NameAssignment_1 )
            // InternalDeviceParser.g:2342:3: rule__CapabilityType__NameAssignment_1
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


    // $ANTLR start "rule__DeviceSet__DeviceAssignment"
    // InternalDeviceParser.g:2351:1: rule__DeviceSet__DeviceAssignment : ( ruleDeviceType ) ;
    public final void rule__DeviceSet__DeviceAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2355:1: ( ( ruleDeviceType ) )
            // InternalDeviceParser.g:2356:2: ( ruleDeviceType )
            {
            // InternalDeviceParser.g:2356:2: ( ruleDeviceType )
            // InternalDeviceParser.g:2357:3: ruleDeviceType
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
    // InternalDeviceParser.g:2366:1: rule__DeviceType__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__DeviceType__NameAssignment_4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2370:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:2371:2: ( ruleEString )
            {
            // InternalDeviceParser.g:2371:2: ( ruleEString )
            // InternalDeviceParser.g:2372:3: ruleEString
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
    // InternalDeviceParser.g:2381:1: rule__DeviceType__CapabilityAssignment_5_2 : ( ruleCapabilityProperty ) ;
    public final void rule__DeviceType__CapabilityAssignment_5_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2385:1: ( ( ruleCapabilityProperty ) )
            // InternalDeviceParser.g:2386:2: ( ruleCapabilityProperty )
            {
            // InternalDeviceParser.g:2386:2: ( ruleCapabilityProperty )
            // InternalDeviceParser.g:2387:3: ruleCapabilityProperty
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
    // InternalDeviceParser.g:2396:1: rule__DeviceType__CommunicationConnectionAssignment_6_2 : ( ruleCommunicationConnection ) ;
    public final void rule__DeviceType__CommunicationConnectionAssignment_6_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2400:1: ( ( ruleCommunicationConnection ) )
            // InternalDeviceParser.g:2401:2: ( ruleCommunicationConnection )
            {
            // InternalDeviceParser.g:2401:2: ( ruleCommunicationConnection )
            // InternalDeviceParser.g:2402:3: ruleCommunicationConnection
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
    // InternalDeviceParser.g:2411:1: rule__CapabilityProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CapabilityProperty__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2415:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:2416:2: ( ruleEString )
            {
            // InternalDeviceParser.g:2416:2: ( ruleEString )
            // InternalDeviceParser.g:2417:3: ruleEString
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
    // InternalDeviceParser.g:2426:1: rule__CapabilityProperty__TypeAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__CapabilityProperty__TypeAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2430:1: ( ( ( ruleEString ) ) )
            // InternalDeviceParser.g:2431:2: ( ( ruleEString ) )
            {
            // InternalDeviceParser.g:2431:2: ( ( ruleEString ) )
            // InternalDeviceParser.g:2432:3: ( ruleEString )
            {
             before(grammarAccess.getCapabilityPropertyAccess().getTypeCapabilityTypeCrossReference_5_0());
            // InternalDeviceParser.g:2433:3: ( ruleEString )
            // InternalDeviceParser.g:2434:4: ruleEString
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
    // InternalDeviceParser.g:2445:1: rule__CapabilityProperty__KindAssignment_7 : ( ruleCapabilityKind ) ;
    public final void rule__CapabilityProperty__KindAssignment_7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2449:1: ( ( ruleCapabilityKind ) )
            // InternalDeviceParser.g:2450:2: ( ruleCapabilityKind )
            {
            // InternalDeviceParser.g:2450:2: ( ruleCapabilityKind )
            // InternalDeviceParser.g:2451:3: ruleCapabilityKind
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
    // InternalDeviceParser.g:2460:1: rule__CapabilityProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__CapabilityProperty__ValueAssignment_8_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2464:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:2465:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:2465:2: ( rulePropertyValue )
            // InternalDeviceParser.g:2466:3: rulePropertyValue
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
    // InternalDeviceParser.g:2475:1: rule__ConnectionProperty__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ConnectionProperty__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2479:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:2480:2: ( ruleEString )
            {
            // InternalDeviceParser.g:2480:2: ( ruleEString )
            // InternalDeviceParser.g:2481:3: ruleEString
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
    // InternalDeviceParser.g:2490:1: rule__ConnectionProperty__ValueAssignment_4_2 : ( rulePropertyValue ) ;
    public final void rule__ConnectionProperty__ValueAssignment_4_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2494:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:2495:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:2495:2: ( rulePropertyValue )
            // InternalDeviceParser.g:2496:3: rulePropertyValue
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
    // InternalDeviceParser.g:2505:1: rule__CommunicationConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__CommunicationConnection__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2509:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:2510:2: ( ruleEString )
            {
            // InternalDeviceParser.g:2510:2: ( ruleEString )
            // InternalDeviceParser.g:2511:3: ruleEString
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
    // InternalDeviceParser.g:2520:1: rule__CommunicationConnection__TypeAssignment_6 : ( ruleCommunicationType ) ;
    public final void rule__CommunicationConnection__TypeAssignment_6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2524:1: ( ( ruleCommunicationType ) )
            // InternalDeviceParser.g:2525:2: ( ruleCommunicationType )
            {
            // InternalDeviceParser.g:2525:2: ( ruleCommunicationType )
            // InternalDeviceParser.g:2526:3: ruleCommunicationType
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
    // InternalDeviceParser.g:2535:1: rule__CommunicationConnection__PropertiesAssignment_7_2 : ( ruleConnectionProperty ) ;
    public final void rule__CommunicationConnection__PropertiesAssignment_7_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2539:1: ( ( ruleConnectionProperty ) )
            // InternalDeviceParser.g:2540:2: ( ruleConnectionProperty )
            {
            // InternalDeviceParser.g:2540:2: ( ruleConnectionProperty )
            // InternalDeviceParser.g:2541:3: ruleConnectionProperty
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
    // InternalDeviceParser.g:2550:1: rule__CommunicationType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CommunicationType__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2554:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:2555:2: ( ruleEString )
            {
            // InternalDeviceParser.g:2555:2: ( ruleEString )
            // InternalDeviceParser.g:2556:3: ruleEString
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
    // InternalDeviceParser.g:2565:1: rule__CapabilityType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CapabilityType__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2569:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:2570:2: ( ruleEString )
            {
            // InternalDeviceParser.g:2570:2: ( ruleEString )
            // InternalDeviceParser.g:2571:3: ruleEString
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
    // InternalDeviceParser.g:2580:1: rule__PropertyValueInt__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__PropertyValueInt__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2584:1: ( ( ruleInteger0 ) )
            // InternalDeviceParser.g:2585:2: ( ruleInteger0 )
            {
            // InternalDeviceParser.g:2585:2: ( ruleInteger0 )
            // InternalDeviceParser.g:2586:3: ruleInteger0
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
    // InternalDeviceParser.g:2595:1: rule__PropertyValueDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__PropertyValueDouble__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2599:1: ( ( ruleDouble0 ) )
            // InternalDeviceParser.g:2600:2: ( ruleDouble0 )
            {
            // InternalDeviceParser.g:2600:2: ( ruleDouble0 )
            // InternalDeviceParser.g:2601:3: ruleDouble0
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
    // InternalDeviceParser.g:2610:1: rule__PropertyValueString__ValueAssignment : ( ruleEString ) ;
    public final void rule__PropertyValueString__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2614:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:2615:2: ( ruleEString )
            {
            // InternalDeviceParser.g:2615:2: ( ruleEString )
            // InternalDeviceParser.g:2616:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000410L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000360L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000280300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000800L});

}
