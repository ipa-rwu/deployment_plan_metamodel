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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CommunicationConnection", "ComputationDeviceType", "ProcessorArchitecture", "DeviceProperty", "AttributeKind", "SelectionKind", "Description", "DeviceType", "MaximumKind", "MinimumKind", "Properties", "RangeKind", "Interface", "Ethernet", "Address", "X86_64", "Value", "Arm64", "Linux", "MacOS", "Kind", "Name", "Type", "Wlan", "HyphenMinusHyphenMinusHyphenMinus", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=35;
    public static final int Address=18;
    public static final int RULE_DATE_TIME=40;
    public static final int RULE_BOOLEAN=32;
    public static final int AttributeKind=8;
    public static final int RULE_YEAR=37;
    public static final int Name=25;
    public static final int RULE_MIN_SEC=39;
    public static final int Kind=24;
    public static final int X86_64=19;
    public static final int RULE_DEDENT=43;
    public static final int RULE_ID=44;
    public static final int RULE_DIGIT=30;
    public static final int HyphenMinusHyphenMinusHyphenMinus=28;
    public static final int SelectionKind=9;
    public static final int DeviceType=11;
    public static final int DeviceProperty=7;
    public static final int Arm64=21;
    public static final int Linux=22;
    public static final int RULE_INT=45;
    public static final int Ethernet=17;
    public static final int Value=20;
    public static final int RULE_ML_COMMENT=47;
    public static final int MacOS=23;
    public static final int Description=10;
    public static final int ProcessorArchitecture=6;
    public static final int RULE_STRING=46;
    public static final int Wlan=27;
    public static final int Properties=14;
    public static final int RULE_SL_COMMENT=41;
    public static final int CommunicationConnection=4;
    public static final int HyphenMinus=29;
    public static final int RULE_DOUBLE=34;
    public static final int RULE_DECINT=33;
    public static final int MinimumKind=13;
    public static final int EOF=-1;
    public static final int RULE_INDENT=42;
    public static final int RULE_HOUR=38;
    public static final int RULE_WS=48;
    public static final int MaximumKind=12;
    public static final int RULE_ANY_OTHER=49;
    public static final int ComputationDeviceType=5;
    public static final int RangeKind=15;
    public static final int Type=26;
    public static final int RULE_MONTH=36;
    public static final int RULE_BINARY=31;
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
            tokenNameToValue.put("HyphenMinusHyphenMinusHyphenMinus", "'---'");
            tokenNameToValue.put("Wlan", "'Wlan'");
            tokenNameToValue.put("Arm64", "'Arm64'");
            tokenNameToValue.put("Linux", "'Linux'");
            tokenNameToValue.put("MacOS", "'MacOS'");
            tokenNameToValue.put("Kind", "'kind:'");
            tokenNameToValue.put("Name", "'name:'");
            tokenNameToValue.put("Type", "'type:'");
            tokenNameToValue.put("X86_64", "'X86_64'");
            tokenNameToValue.put("Value", "'value:'");
            tokenNameToValue.put("Address", "'address'");
            tokenNameToValue.put("Ethernet", "'Ethernet'");
            tokenNameToValue.put("RangeKind", "'RangeKind'");
            tokenNameToValue.put("Interface", "'interface'");
            tokenNameToValue.put("DeviceType", "'DeviceType:'");
            tokenNameToValue.put("MaximumKind", "'MaximumKind'");
            tokenNameToValue.put("MinimumKind", "'MinimumKind'");
            tokenNameToValue.put("Properties", "'properties:'");
            tokenNameToValue.put("Description", "'description:'");
            tokenNameToValue.put("AttributeKind", "'AttributeKind'");
            tokenNameToValue.put("SelectionKind", "'SelectionKind'");
            tokenNameToValue.put("DeviceProperty", "'deviceProperty:'");
            tokenNameToValue.put("ProcessorArchitecture", "'ProcessorArchitecture'");
            tokenNameToValue.put("ComputationDeviceType", "'ComputationDeviceType:'");
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
    // InternalDeviceParser.g:90:1: ruleDeviceSet : ( ( rule__DeviceSet__Group__0 ) ) ;
    public final void ruleDeviceSet() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:94:2: ( ( ( rule__DeviceSet__Group__0 ) ) )
            // InternalDeviceParser.g:95:2: ( ( rule__DeviceSet__Group__0 ) )
            {
            // InternalDeviceParser.g:95:2: ( ( rule__DeviceSet__Group__0 ) )
            // InternalDeviceParser.g:96:3: ( rule__DeviceSet__Group__0 )
            {
             before(grammarAccess.getDeviceSetAccess().getGroup());
            // InternalDeviceParser.g:97:3: ( rule__DeviceSet__Group__0 )
            // InternalDeviceParser.g:97:4: rule__DeviceSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceSetAccess().getGroup());

            }


            }

        }
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


    // $ANTLR start "entryRuleDeviceType"
    // InternalDeviceParser.g:106:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:107:1: ( ruleDeviceType EOF )
            // InternalDeviceParser.g:108:1: ruleDeviceType EOF
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
    // InternalDeviceParser.g:115:1: ruleDeviceType : ( ( rule__DeviceType__Alternatives ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:119:2: ( ( ( rule__DeviceType__Alternatives ) ) )
            // InternalDeviceParser.g:120:2: ( ( rule__DeviceType__Alternatives ) )
            {
            // InternalDeviceParser.g:120:2: ( ( rule__DeviceType__Alternatives ) )
            // InternalDeviceParser.g:121:3: ( rule__DeviceType__Alternatives )
            {
             before(grammarAccess.getDeviceTypeAccess().getAlternatives());
            // InternalDeviceParser.g:122:3: ( rule__DeviceType__Alternatives )
            // InternalDeviceParser.g:122:4: rule__DeviceType__Alternatives
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
    // InternalDeviceParser.g:131:1: entryRuleAbstractCommunicationConnection : ruleAbstractCommunicationConnection EOF ;
    public final void entryRuleAbstractCommunicationConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:132:1: ( ruleAbstractCommunicationConnection EOF )
            // InternalDeviceParser.g:133:1: ruleAbstractCommunicationConnection EOF
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
    // InternalDeviceParser.g:140:1: ruleAbstractCommunicationConnection : ( ( rule__AbstractCommunicationConnection__Alternatives ) ) ;
    public final void ruleAbstractCommunicationConnection() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:144:2: ( ( ( rule__AbstractCommunicationConnection__Alternatives ) ) )
            // InternalDeviceParser.g:145:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            {
            // InternalDeviceParser.g:145:2: ( ( rule__AbstractCommunicationConnection__Alternatives ) )
            // InternalDeviceParser.g:146:3: ( rule__AbstractCommunicationConnection__Alternatives )
            {
             before(grammarAccess.getAbstractCommunicationConnectionAccess().getAlternatives());
            // InternalDeviceParser.g:147:3: ( rule__AbstractCommunicationConnection__Alternatives )
            // InternalDeviceParser.g:147:4: rule__AbstractCommunicationConnection__Alternatives
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
    // InternalDeviceParser.g:156:1: entryRuleAbstractNetworkProperty : ruleAbstractNetworkProperty EOF ;
    public final void entryRuleAbstractNetworkProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:157:1: ( ruleAbstractNetworkProperty EOF )
            // InternalDeviceParser.g:158:1: ruleAbstractNetworkProperty EOF
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
    // InternalDeviceParser.g:165:1: ruleAbstractNetworkProperty : ( ( rule__AbstractNetworkProperty__Alternatives ) ) ;
    public final void ruleAbstractNetworkProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:169:2: ( ( ( rule__AbstractNetworkProperty__Alternatives ) ) )
            // InternalDeviceParser.g:170:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            {
            // InternalDeviceParser.g:170:2: ( ( rule__AbstractNetworkProperty__Alternatives ) )
            // InternalDeviceParser.g:171:3: ( rule__AbstractNetworkProperty__Alternatives )
            {
             before(grammarAccess.getAbstractNetworkPropertyAccess().getAlternatives());
            // InternalDeviceParser.g:172:3: ( rule__AbstractNetworkProperty__Alternatives )
            // InternalDeviceParser.g:172:4: rule__AbstractNetworkProperty__Alternatives
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
    // InternalDeviceParser.g:181:1: entryRuleInterfaceNetworkProperty : ruleInterfaceNetworkProperty EOF ;
    public final void entryRuleInterfaceNetworkProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:182:1: ( ruleInterfaceNetworkProperty EOF )
            // InternalDeviceParser.g:183:1: ruleInterfaceNetworkProperty EOF
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
    // InternalDeviceParser.g:190:1: ruleInterfaceNetworkProperty : ( ( rule__InterfaceNetworkProperty__Group__0 ) ) ;
    public final void ruleInterfaceNetworkProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:194:2: ( ( ( rule__InterfaceNetworkProperty__Group__0 ) ) )
            // InternalDeviceParser.g:195:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:195:2: ( ( rule__InterfaceNetworkProperty__Group__0 ) )
            // InternalDeviceParser.g:196:3: ( rule__InterfaceNetworkProperty__Group__0 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup());
            // InternalDeviceParser.g:197:3: ( rule__InterfaceNetworkProperty__Group__0 )
            // InternalDeviceParser.g:197:4: rule__InterfaceNetworkProperty__Group__0
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
    // InternalDeviceParser.g:206:1: entryRuleAddressNetworkProperty : ruleAddressNetworkProperty EOF ;
    public final void entryRuleAddressNetworkProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:207:1: ( ruleAddressNetworkProperty EOF )
            // InternalDeviceParser.g:208:1: ruleAddressNetworkProperty EOF
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
    // InternalDeviceParser.g:215:1: ruleAddressNetworkProperty : ( ( rule__AddressNetworkProperty__Group__0 ) ) ;
    public final void ruleAddressNetworkProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:219:2: ( ( ( rule__AddressNetworkProperty__Group__0 ) ) )
            // InternalDeviceParser.g:220:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:220:2: ( ( rule__AddressNetworkProperty__Group__0 ) )
            // InternalDeviceParser.g:221:3: ( rule__AddressNetworkProperty__Group__0 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup());
            // InternalDeviceParser.g:222:3: ( rule__AddressNetworkProperty__Group__0 )
            // InternalDeviceParser.g:222:4: rule__AddressNetworkProperty__Group__0
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
    // InternalDeviceParser.g:231:1: entryRuleDeviceType_Impl : ruleDeviceType_Impl EOF ;
    public final void entryRuleDeviceType_Impl() throws RecognitionException {
        try {
            // InternalDeviceParser.g:232:1: ( ruleDeviceType_Impl EOF )
            // InternalDeviceParser.g:233:1: ruleDeviceType_Impl EOF
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
    // InternalDeviceParser.g:240:1: ruleDeviceType_Impl : ( ( rule__DeviceType_Impl__Group__0 ) ) ;
    public final void ruleDeviceType_Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:244:2: ( ( ( rule__DeviceType_Impl__Group__0 ) ) )
            // InternalDeviceParser.g:245:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            {
            // InternalDeviceParser.g:245:2: ( ( rule__DeviceType_Impl__Group__0 ) )
            // InternalDeviceParser.g:246:3: ( rule__DeviceType_Impl__Group__0 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup());
            // InternalDeviceParser.g:247:3: ( rule__DeviceType_Impl__Group__0 )
            // InternalDeviceParser.g:247:4: rule__DeviceType_Impl__Group__0
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


    // $ANTLR start "entryRuleDeviceProperty"
    // InternalDeviceParser.g:256:1: entryRuleDeviceProperty : ruleDeviceProperty EOF ;
    public final void entryRuleDeviceProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:257:1: ( ruleDeviceProperty EOF )
            // InternalDeviceParser.g:258:1: ruleDeviceProperty EOF
            {
             before(grammarAccess.getDevicePropertyRule());
            pushFollow(FOLLOW_1);
            ruleDeviceProperty();

            state._fsp--;

             after(grammarAccess.getDevicePropertyRule());
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
    // $ANTLR end "entryRuleDeviceProperty"


    // $ANTLR start "ruleDeviceProperty"
    // InternalDeviceParser.g:265:1: ruleDeviceProperty : ( ( rule__DeviceProperty__Group__0 ) ) ;
    public final void ruleDeviceProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:269:2: ( ( ( rule__DeviceProperty__Group__0 ) ) )
            // InternalDeviceParser.g:270:2: ( ( rule__DeviceProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:270:2: ( ( rule__DeviceProperty__Group__0 ) )
            // InternalDeviceParser.g:271:3: ( rule__DeviceProperty__Group__0 )
            {
             before(grammarAccess.getDevicePropertyAccess().getGroup());
            // InternalDeviceParser.g:272:3: ( rule__DeviceProperty__Group__0 )
            // InternalDeviceParser.g:272:4: rule__DeviceProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDevicePropertyAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceProperty"


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


    // $ANTLR start "entryRuleConnectionProperty"
    // InternalDeviceParser.g:306:1: entryRuleConnectionProperty : ruleConnectionProperty EOF ;
    public final void entryRuleConnectionProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:307:1: ( ruleConnectionProperty EOF )
            // InternalDeviceParser.g:308:1: ruleConnectionProperty EOF
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
    // InternalDeviceParser.g:315:1: ruleConnectionProperty : ( ( rule__ConnectionProperty__Group__0 ) ) ;
    public final void ruleConnectionProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:319:2: ( ( ( rule__ConnectionProperty__Group__0 ) ) )
            // InternalDeviceParser.g:320:2: ( ( rule__ConnectionProperty__Group__0 ) )
            {
            // InternalDeviceParser.g:320:2: ( ( rule__ConnectionProperty__Group__0 ) )
            // InternalDeviceParser.g:321:3: ( rule__ConnectionProperty__Group__0 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup());
            // InternalDeviceParser.g:322:3: ( rule__ConnectionProperty__Group__0 )
            // InternalDeviceParser.g:322:4: rule__ConnectionProperty__Group__0
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
    // InternalDeviceParser.g:331:1: entryRuleNetworkConnection : ruleNetworkConnection EOF ;
    public final void entryRuleNetworkConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:332:1: ( ruleNetworkConnection EOF )
            // InternalDeviceParser.g:333:1: ruleNetworkConnection EOF
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
    // InternalDeviceParser.g:340:1: ruleNetworkConnection : ( ( rule__NetworkConnection__Group__0 ) ) ;
    public final void ruleNetworkConnection() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:344:2: ( ( ( rule__NetworkConnection__Group__0 ) ) )
            // InternalDeviceParser.g:345:2: ( ( rule__NetworkConnection__Group__0 ) )
            {
            // InternalDeviceParser.g:345:2: ( ( rule__NetworkConnection__Group__0 ) )
            // InternalDeviceParser.g:346:3: ( rule__NetworkConnection__Group__0 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup());
            // InternalDeviceParser.g:347:3: ( rule__NetworkConnection__Group__0 )
            // InternalDeviceParser.g:347:4: rule__NetworkConnection__Group__0
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
    // InternalDeviceParser.g:356:1: entryRuleCommunicationConnection : ruleCommunicationConnection EOF ;
    public final void entryRuleCommunicationConnection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:357:1: ( ruleCommunicationConnection EOF )
            // InternalDeviceParser.g:358:1: ruleCommunicationConnection EOF
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
    // InternalDeviceParser.g:365:1: ruleCommunicationConnection : ( ( rule__CommunicationConnection__Group__0 ) ) ;
    public final void ruleCommunicationConnection() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:369:2: ( ( ( rule__CommunicationConnection__Group__0 ) ) )
            // InternalDeviceParser.g:370:2: ( ( rule__CommunicationConnection__Group__0 ) )
            {
            // InternalDeviceParser.g:370:2: ( ( rule__CommunicationConnection__Group__0 ) )
            // InternalDeviceParser.g:371:3: ( rule__CommunicationConnection__Group__0 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup());
            // InternalDeviceParser.g:372:3: ( rule__CommunicationConnection__Group__0 )
            // InternalDeviceParser.g:372:4: rule__CommunicationConnection__Group__0
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


    // $ANTLR start "entryRulePropertyKind"
    // InternalDeviceParser.g:381:1: entryRulePropertyKind : rulePropertyKind EOF ;
    public final void entryRulePropertyKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:382:1: ( rulePropertyKind EOF )
            // InternalDeviceParser.g:383:1: rulePropertyKind EOF
            {
             before(grammarAccess.getPropertyKindRule());
            pushFollow(FOLLOW_1);
            rulePropertyKind();

            state._fsp--;

             after(grammarAccess.getPropertyKindRule());
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
    // $ANTLR end "entryRulePropertyKind"


    // $ANTLR start "rulePropertyKind"
    // InternalDeviceParser.g:390:1: rulePropertyKind : ( ( rule__PropertyKind__Alternatives ) ) ;
    public final void rulePropertyKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:394:2: ( ( ( rule__PropertyKind__Alternatives ) ) )
            // InternalDeviceParser.g:395:2: ( ( rule__PropertyKind__Alternatives ) )
            {
            // InternalDeviceParser.g:395:2: ( ( rule__PropertyKind__Alternatives ) )
            // InternalDeviceParser.g:396:3: ( rule__PropertyKind__Alternatives )
            {
             before(grammarAccess.getPropertyKindAccess().getAlternatives());
            // InternalDeviceParser.g:397:3: ( rule__PropertyKind__Alternatives )
            // InternalDeviceParser.g:397:4: rule__PropertyKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PropertyKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyKindAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyKind"


    // $ANTLR start "entryRuleProperty"
    // InternalDeviceParser.g:406:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalDeviceParser.g:407:1: ( ruleProperty EOF )
            // InternalDeviceParser.g:408:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule());
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule());
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDeviceParser.g:415:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:419:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalDeviceParser.g:420:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalDeviceParser.g:420:2: ( ( rule__Property__Group__0 ) )
            // InternalDeviceParser.g:421:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup());
            // InternalDeviceParser.g:422:3: ( rule__Property__Group__0 )
            // InternalDeviceParser.g:422:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyAttribute"
    // InternalDeviceParser.g:431:1: entryRulePropertyAttribute : rulePropertyAttribute EOF ;
    public final void entryRulePropertyAttribute() throws RecognitionException {
        try {
            // InternalDeviceParser.g:432:1: ( rulePropertyAttribute EOF )
            // InternalDeviceParser.g:433:1: rulePropertyAttribute EOF
            {
             before(grammarAccess.getPropertyAttributeRule());
            pushFollow(FOLLOW_1);
            rulePropertyAttribute();

            state._fsp--;

             after(grammarAccess.getPropertyAttributeRule());
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
    // $ANTLR end "entryRulePropertyAttribute"


    // $ANTLR start "rulePropertyAttribute"
    // InternalDeviceParser.g:440:1: rulePropertyAttribute : ( ( rule__PropertyAttribute__Group__0 ) ) ;
    public final void rulePropertyAttribute() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:444:2: ( ( ( rule__PropertyAttribute__Group__0 ) ) )
            // InternalDeviceParser.g:445:2: ( ( rule__PropertyAttribute__Group__0 ) )
            {
            // InternalDeviceParser.g:445:2: ( ( rule__PropertyAttribute__Group__0 ) )
            // InternalDeviceParser.g:446:3: ( rule__PropertyAttribute__Group__0 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getGroup());
            // InternalDeviceParser.g:447:3: ( rule__PropertyAttribute__Group__0 )
            // InternalDeviceParser.g:447:4: rule__PropertyAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAttributeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyAttribute"


    // $ANTLR start "entryRulePropertyMaximun"
    // InternalDeviceParser.g:456:1: entryRulePropertyMaximun : rulePropertyMaximun EOF ;
    public final void entryRulePropertyMaximun() throws RecognitionException {
        try {
            // InternalDeviceParser.g:457:1: ( rulePropertyMaximun EOF )
            // InternalDeviceParser.g:458:1: rulePropertyMaximun EOF
            {
             before(grammarAccess.getPropertyMaximunRule());
            pushFollow(FOLLOW_1);
            rulePropertyMaximun();

            state._fsp--;

             after(grammarAccess.getPropertyMaximunRule());
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
    // $ANTLR end "entryRulePropertyMaximun"


    // $ANTLR start "rulePropertyMaximun"
    // InternalDeviceParser.g:465:1: rulePropertyMaximun : ( ( rule__PropertyMaximun__Group__0 ) ) ;
    public final void rulePropertyMaximun() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:469:2: ( ( ( rule__PropertyMaximun__Group__0 ) ) )
            // InternalDeviceParser.g:470:2: ( ( rule__PropertyMaximun__Group__0 ) )
            {
            // InternalDeviceParser.g:470:2: ( ( rule__PropertyMaximun__Group__0 ) )
            // InternalDeviceParser.g:471:3: ( rule__PropertyMaximun__Group__0 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getGroup());
            // InternalDeviceParser.g:472:3: ( rule__PropertyMaximun__Group__0 )
            // InternalDeviceParser.g:472:4: rule__PropertyMaximun__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMaximunAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyMaximun"


    // $ANTLR start "entryRulePropertyMinimum"
    // InternalDeviceParser.g:481:1: entryRulePropertyMinimum : rulePropertyMinimum EOF ;
    public final void entryRulePropertyMinimum() throws RecognitionException {
        try {
            // InternalDeviceParser.g:482:1: ( rulePropertyMinimum EOF )
            // InternalDeviceParser.g:483:1: rulePropertyMinimum EOF
            {
             before(grammarAccess.getPropertyMinimumRule());
            pushFollow(FOLLOW_1);
            rulePropertyMinimum();

            state._fsp--;

             after(grammarAccess.getPropertyMinimumRule());
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
    // $ANTLR end "entryRulePropertyMinimum"


    // $ANTLR start "rulePropertyMinimum"
    // InternalDeviceParser.g:490:1: rulePropertyMinimum : ( ( rule__PropertyMinimum__Group__0 ) ) ;
    public final void rulePropertyMinimum() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:494:2: ( ( ( rule__PropertyMinimum__Group__0 ) ) )
            // InternalDeviceParser.g:495:2: ( ( rule__PropertyMinimum__Group__0 ) )
            {
            // InternalDeviceParser.g:495:2: ( ( rule__PropertyMinimum__Group__0 ) )
            // InternalDeviceParser.g:496:3: ( rule__PropertyMinimum__Group__0 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getGroup());
            // InternalDeviceParser.g:497:3: ( rule__PropertyMinimum__Group__0 )
            // InternalDeviceParser.g:497:4: rule__PropertyMinimum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMinimumAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyMinimum"


    // $ANTLR start "entryRulePropertySelection"
    // InternalDeviceParser.g:506:1: entryRulePropertySelection : rulePropertySelection EOF ;
    public final void entryRulePropertySelection() throws RecognitionException {
        try {
            // InternalDeviceParser.g:507:1: ( rulePropertySelection EOF )
            // InternalDeviceParser.g:508:1: rulePropertySelection EOF
            {
             before(grammarAccess.getPropertySelectionRule());
            pushFollow(FOLLOW_1);
            rulePropertySelection();

            state._fsp--;

             after(grammarAccess.getPropertySelectionRule());
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
    // $ANTLR end "entryRulePropertySelection"


    // $ANTLR start "rulePropertySelection"
    // InternalDeviceParser.g:515:1: rulePropertySelection : ( ( rule__PropertySelection__Group__0 ) ) ;
    public final void rulePropertySelection() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:519:2: ( ( ( rule__PropertySelection__Group__0 ) ) )
            // InternalDeviceParser.g:520:2: ( ( rule__PropertySelection__Group__0 ) )
            {
            // InternalDeviceParser.g:520:2: ( ( rule__PropertySelection__Group__0 ) )
            // InternalDeviceParser.g:521:3: ( rule__PropertySelection__Group__0 )
            {
             before(grammarAccess.getPropertySelectionAccess().getGroup());
            // InternalDeviceParser.g:522:3: ( rule__PropertySelection__Group__0 )
            // InternalDeviceParser.g:522:4: rule__PropertySelection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectionAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertySelection"


    // $ANTLR start "entryRulePropertyRange"
    // InternalDeviceParser.g:531:1: entryRulePropertyRange : rulePropertyRange EOF ;
    public final void entryRulePropertyRange() throws RecognitionException {
        try {
            // InternalDeviceParser.g:532:1: ( rulePropertyRange EOF )
            // InternalDeviceParser.g:533:1: rulePropertyRange EOF
            {
             before(grammarAccess.getPropertyRangeRule());
            pushFollow(FOLLOW_1);
            rulePropertyRange();

            state._fsp--;

             after(grammarAccess.getPropertyRangeRule());
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
    // $ANTLR end "entryRulePropertyRange"


    // $ANTLR start "rulePropertyRange"
    // InternalDeviceParser.g:540:1: rulePropertyRange : ( ( rule__PropertyRange__Group__0 ) ) ;
    public final void rulePropertyRange() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:544:2: ( ( ( rule__PropertyRange__Group__0 ) ) )
            // InternalDeviceParser.g:545:2: ( ( rule__PropertyRange__Group__0 ) )
            {
            // InternalDeviceParser.g:545:2: ( ( rule__PropertyRange__Group__0 ) )
            // InternalDeviceParser.g:546:3: ( rule__PropertyRange__Group__0 )
            {
             before(grammarAccess.getPropertyRangeAccess().getGroup());
            // InternalDeviceParser.g:547:3: ( rule__PropertyRange__Group__0 )
            // InternalDeviceParser.g:547:4: rule__PropertyRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRangeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyRange"


    // $ANTLR start "entryRulePropertyValue"
    // InternalDeviceParser.g:556:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalDeviceParser.g:557:1: ( rulePropertyValue EOF )
            // InternalDeviceParser.g:558:1: rulePropertyValue EOF
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
    // InternalDeviceParser.g:565:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:569:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalDeviceParser.g:570:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalDeviceParser.g:570:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalDeviceParser.g:571:3: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives());
            // InternalDeviceParser.g:572:3: ( rule__PropertyValue__Alternatives )
            // InternalDeviceParser.g:572:4: rule__PropertyValue__Alternatives
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
    // InternalDeviceParser.g:581:1: entryRulePropertyValueInt : rulePropertyValueInt EOF ;
    public final void entryRulePropertyValueInt() throws RecognitionException {
        try {
            // InternalDeviceParser.g:582:1: ( rulePropertyValueInt EOF )
            // InternalDeviceParser.g:583:1: rulePropertyValueInt EOF
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
    // InternalDeviceParser.g:590:1: rulePropertyValueInt : ( ( rule__PropertyValueInt__ValueAssignment ) ) ;
    public final void rulePropertyValueInt() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:594:2: ( ( ( rule__PropertyValueInt__ValueAssignment ) ) )
            // InternalDeviceParser.g:595:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            {
            // InternalDeviceParser.g:595:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            // InternalDeviceParser.g:596:3: ( rule__PropertyValueInt__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueIntAccess().getValueAssignment());
            // InternalDeviceParser.g:597:3: ( rule__PropertyValueInt__ValueAssignment )
            // InternalDeviceParser.g:597:4: rule__PropertyValueInt__ValueAssignment
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
    // InternalDeviceParser.g:606:1: entryRulePropertyValueDouble : rulePropertyValueDouble EOF ;
    public final void entryRulePropertyValueDouble() throws RecognitionException {
        try {
            // InternalDeviceParser.g:607:1: ( rulePropertyValueDouble EOF )
            // InternalDeviceParser.g:608:1: rulePropertyValueDouble EOF
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
    // InternalDeviceParser.g:615:1: rulePropertyValueDouble : ( ( rule__PropertyValueDouble__ValueAssignment ) ) ;
    public final void rulePropertyValueDouble() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:619:2: ( ( ( rule__PropertyValueDouble__ValueAssignment ) ) )
            // InternalDeviceParser.g:620:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            {
            // InternalDeviceParser.g:620:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            // InternalDeviceParser.g:621:3: ( rule__PropertyValueDouble__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment());
            // InternalDeviceParser.g:622:3: ( rule__PropertyValueDouble__ValueAssignment )
            // InternalDeviceParser.g:622:4: rule__PropertyValueDouble__ValueAssignment
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
    // InternalDeviceParser.g:631:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // InternalDeviceParser.g:632:1: ( rulePropertyValueString EOF )
            // InternalDeviceParser.g:633:1: rulePropertyValueString EOF
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
    // InternalDeviceParser.g:640:1: rulePropertyValueString : ( ( rule__PropertyValueString__ValueAssignment ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:644:2: ( ( ( rule__PropertyValueString__ValueAssignment ) ) )
            // InternalDeviceParser.g:645:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            {
            // InternalDeviceParser.g:645:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            // InternalDeviceParser.g:646:3: ( rule__PropertyValueString__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueStringAccess().getValueAssignment());
            // InternalDeviceParser.g:647:3: ( rule__PropertyValueString__ValueAssignment )
            // InternalDeviceParser.g:647:4: rule__PropertyValueString__ValueAssignment
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
    // InternalDeviceParser.g:656:1: entryRuleProcessorArchitectureValue : ruleProcessorArchitectureValue EOF ;
    public final void entryRuleProcessorArchitectureValue() throws RecognitionException {
        try {
            // InternalDeviceParser.g:657:1: ( ruleProcessorArchitectureValue EOF )
            // InternalDeviceParser.g:658:1: ruleProcessorArchitectureValue EOF
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
    // InternalDeviceParser.g:665:1: ruleProcessorArchitectureValue : ( ( rule__ProcessorArchitectureValue__Alternatives ) ) ;
    public final void ruleProcessorArchitectureValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:669:2: ( ( ( rule__ProcessorArchitectureValue__Alternatives ) ) )
            // InternalDeviceParser.g:670:2: ( ( rule__ProcessorArchitectureValue__Alternatives ) )
            {
            // InternalDeviceParser.g:670:2: ( ( rule__ProcessorArchitectureValue__Alternatives ) )
            // InternalDeviceParser.g:671:3: ( rule__ProcessorArchitectureValue__Alternatives )
            {
             before(grammarAccess.getProcessorArchitectureValueAccess().getAlternatives());
            // InternalDeviceParser.g:672:3: ( rule__ProcessorArchitectureValue__Alternatives )
            // InternalDeviceParser.g:672:4: rule__ProcessorArchitectureValue__Alternatives
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
    // InternalDeviceParser.g:681:1: entryRuleAbstractResouceType : ruleAbstractResouceType EOF ;
    public final void entryRuleAbstractResouceType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:682:1: ( ruleAbstractResouceType EOF )
            // InternalDeviceParser.g:683:1: ruleAbstractResouceType EOF
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
    // InternalDeviceParser.g:690:1: ruleAbstractResouceType : ( ( rule__AbstractResouceType__Alternatives ) ) ;
    public final void ruleAbstractResouceType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:694:2: ( ( ( rule__AbstractResouceType__Alternatives ) ) )
            // InternalDeviceParser.g:695:2: ( ( rule__AbstractResouceType__Alternatives ) )
            {
            // InternalDeviceParser.g:695:2: ( ( rule__AbstractResouceType__Alternatives ) )
            // InternalDeviceParser.g:696:3: ( rule__AbstractResouceType__Alternatives )
            {
             before(grammarAccess.getAbstractResouceTypeAccess().getAlternatives());
            // InternalDeviceParser.g:697:3: ( rule__AbstractResouceType__Alternatives )
            // InternalDeviceParser.g:697:4: rule__AbstractResouceType__Alternatives
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
    // InternalDeviceParser.g:706:1: entryRuleOpertingSystemType : ruleOpertingSystemType EOF ;
    public final void entryRuleOpertingSystemType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:707:1: ( ruleOpertingSystemType EOF )
            // InternalDeviceParser.g:708:1: ruleOpertingSystemType EOF
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
    // InternalDeviceParser.g:715:1: ruleOpertingSystemType : ( ( rule__OpertingSystemType__Alternatives ) ) ;
    public final void ruleOpertingSystemType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:719:2: ( ( ( rule__OpertingSystemType__Alternatives ) ) )
            // InternalDeviceParser.g:720:2: ( ( rule__OpertingSystemType__Alternatives ) )
            {
            // InternalDeviceParser.g:720:2: ( ( rule__OpertingSystemType__Alternatives ) )
            // InternalDeviceParser.g:721:3: ( rule__OpertingSystemType__Alternatives )
            {
             before(grammarAccess.getOpertingSystemTypeAccess().getAlternatives());
            // InternalDeviceParser.g:722:3: ( rule__OpertingSystemType__Alternatives )
            // InternalDeviceParser.g:722:4: rule__OpertingSystemType__Alternatives
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


    // $ANTLR start "entryRuleResourceType"
    // InternalDeviceParser.g:731:1: entryRuleResourceType : ruleResourceType EOF ;
    public final void entryRuleResourceType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:732:1: ( ruleResourceType EOF )
            // InternalDeviceParser.g:733:1: ruleResourceType EOF
            {
             before(grammarAccess.getResourceTypeRule());
            pushFollow(FOLLOW_1);
            ruleResourceType();

            state._fsp--;

             after(grammarAccess.getResourceTypeRule());
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
    // $ANTLR end "entryRuleResourceType"


    // $ANTLR start "ruleResourceType"
    // InternalDeviceParser.g:740:1: ruleResourceType : ( ( rule__ResourceType__Group__0 ) ) ;
    public final void ruleResourceType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:744:2: ( ( ( rule__ResourceType__Group__0 ) ) )
            // InternalDeviceParser.g:745:2: ( ( rule__ResourceType__Group__0 ) )
            {
            // InternalDeviceParser.g:745:2: ( ( rule__ResourceType__Group__0 ) )
            // InternalDeviceParser.g:746:3: ( rule__ResourceType__Group__0 )
            {
             before(grammarAccess.getResourceTypeAccess().getGroup());
            // InternalDeviceParser.g:747:3: ( rule__ResourceType__Group__0 )
            // InternalDeviceParser.g:747:4: rule__ResourceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResourceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceTypeAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "entryRuleProcessorArchitectureType"
    // InternalDeviceParser.g:756:1: entryRuleProcessorArchitectureType : ruleProcessorArchitectureType EOF ;
    public final void entryRuleProcessorArchitectureType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:757:1: ( ruleProcessorArchitectureType EOF )
            // InternalDeviceParser.g:758:1: ruleProcessorArchitectureType EOF
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
    // InternalDeviceParser.g:765:1: ruleProcessorArchitectureType : ( ( rule__ProcessorArchitectureType__Group__0 ) ) ;
    public final void ruleProcessorArchitectureType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:769:2: ( ( ( rule__ProcessorArchitectureType__Group__0 ) ) )
            // InternalDeviceParser.g:770:2: ( ( rule__ProcessorArchitectureType__Group__0 ) )
            {
            // InternalDeviceParser.g:770:2: ( ( rule__ProcessorArchitectureType__Group__0 ) )
            // InternalDeviceParser.g:771:3: ( rule__ProcessorArchitectureType__Group__0 )
            {
             before(grammarAccess.getProcessorArchitectureTypeAccess().getGroup());
            // InternalDeviceParser.g:772:3: ( rule__ProcessorArchitectureType__Group__0 )
            // InternalDeviceParser.g:772:4: rule__ProcessorArchitectureType__Group__0
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
    // InternalDeviceParser.g:781:1: entryRuleLinuxOpertingSystemType : ruleLinuxOpertingSystemType EOF ;
    public final void entryRuleLinuxOpertingSystemType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:782:1: ( ruleLinuxOpertingSystemType EOF )
            // InternalDeviceParser.g:783:1: ruleLinuxOpertingSystemType EOF
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
    // InternalDeviceParser.g:790:1: ruleLinuxOpertingSystemType : ( ( rule__LinuxOpertingSystemType__Group__0 ) ) ;
    public final void ruleLinuxOpertingSystemType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:794:2: ( ( ( rule__LinuxOpertingSystemType__Group__0 ) ) )
            // InternalDeviceParser.g:795:2: ( ( rule__LinuxOpertingSystemType__Group__0 ) )
            {
            // InternalDeviceParser.g:795:2: ( ( rule__LinuxOpertingSystemType__Group__0 ) )
            // InternalDeviceParser.g:796:3: ( rule__LinuxOpertingSystemType__Group__0 )
            {
             before(grammarAccess.getLinuxOpertingSystemTypeAccess().getGroup());
            // InternalDeviceParser.g:797:3: ( rule__LinuxOpertingSystemType__Group__0 )
            // InternalDeviceParser.g:797:4: rule__LinuxOpertingSystemType__Group__0
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
    // InternalDeviceParser.g:806:1: entryRuleMacOSOpertingSystemType : ruleMacOSOpertingSystemType EOF ;
    public final void entryRuleMacOSOpertingSystemType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:807:1: ( ruleMacOSOpertingSystemType EOF )
            // InternalDeviceParser.g:808:1: ruleMacOSOpertingSystemType EOF
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
    // InternalDeviceParser.g:815:1: ruleMacOSOpertingSystemType : ( ( rule__MacOSOpertingSystemType__Group__0 ) ) ;
    public final void ruleMacOSOpertingSystemType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:819:2: ( ( ( rule__MacOSOpertingSystemType__Group__0 ) ) )
            // InternalDeviceParser.g:820:2: ( ( rule__MacOSOpertingSystemType__Group__0 ) )
            {
            // InternalDeviceParser.g:820:2: ( ( rule__MacOSOpertingSystemType__Group__0 ) )
            // InternalDeviceParser.g:821:3: ( rule__MacOSOpertingSystemType__Group__0 )
            {
             before(grammarAccess.getMacOSOpertingSystemTypeAccess().getGroup());
            // InternalDeviceParser.g:822:3: ( rule__MacOSOpertingSystemType__Group__0 )
            // InternalDeviceParser.g:822:4: rule__MacOSOpertingSystemType__Group__0
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
    // InternalDeviceParser.g:831:1: entryRuleX86ProcessorArchitecture : ruleX86ProcessorArchitecture EOF ;
    public final void entryRuleX86ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalDeviceParser.g:832:1: ( ruleX86ProcessorArchitecture EOF )
            // InternalDeviceParser.g:833:1: ruleX86ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:840:1: ruleX86ProcessorArchitecture : ( ( rule__X86ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleX86ProcessorArchitecture() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:844:2: ( ( ( rule__X86ProcessorArchitecture__Group__0 ) ) )
            // InternalDeviceParser.g:845:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            {
            // InternalDeviceParser.g:845:2: ( ( rule__X86ProcessorArchitecture__Group__0 ) )
            // InternalDeviceParser.g:846:3: ( rule__X86ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getGroup());
            // InternalDeviceParser.g:847:3: ( rule__X86ProcessorArchitecture__Group__0 )
            // InternalDeviceParser.g:847:4: rule__X86ProcessorArchitecture__Group__0
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
    // InternalDeviceParser.g:856:1: entryRuleArm64ProcessorArchitecture : ruleArm64ProcessorArchitecture EOF ;
    public final void entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        try {
            // InternalDeviceParser.g:857:1: ( ruleArm64ProcessorArchitecture EOF )
            // InternalDeviceParser.g:858:1: ruleArm64ProcessorArchitecture EOF
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
    // InternalDeviceParser.g:865:1: ruleArm64ProcessorArchitecture : ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) ;
    public final void ruleArm64ProcessorArchitecture() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:869:2: ( ( ( rule__Arm64ProcessorArchitecture__Group__0 ) ) )
            // InternalDeviceParser.g:870:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            {
            // InternalDeviceParser.g:870:2: ( ( rule__Arm64ProcessorArchitecture__Group__0 ) )
            // InternalDeviceParser.g:871:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getGroup());
            // InternalDeviceParser.g:872:3: ( rule__Arm64ProcessorArchitecture__Group__0 )
            // InternalDeviceParser.g:872:4: rule__Arm64ProcessorArchitecture__Group__0
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
    // InternalDeviceParser.g:881:1: entryRuleCommunicationType : ruleCommunicationType EOF ;
    public final void entryRuleCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:882:1: ( ruleCommunicationType EOF )
            // InternalDeviceParser.g:883:1: ruleCommunicationType EOF
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
    // InternalDeviceParser.g:890:1: ruleCommunicationType : ( ( rule__CommunicationType__Group__0 ) ) ;
    public final void ruleCommunicationType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:894:2: ( ( ( rule__CommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:895:2: ( ( rule__CommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:895:2: ( ( rule__CommunicationType__Group__0 ) )
            // InternalDeviceParser.g:896:3: ( rule__CommunicationType__Group__0 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getGroup());
            // InternalDeviceParser.g:897:3: ( rule__CommunicationType__Group__0 )
            // InternalDeviceParser.g:897:4: rule__CommunicationType__Group__0
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
    // InternalDeviceParser.g:906:1: entryRuleNetworkCommunicationType : ruleNetworkCommunicationType EOF ;
    public final void entryRuleNetworkCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:907:1: ( ruleNetworkCommunicationType EOF )
            // InternalDeviceParser.g:908:1: ruleNetworkCommunicationType EOF
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
    // InternalDeviceParser.g:915:1: ruleNetworkCommunicationType : ( ( rule__NetworkCommunicationType__Alternatives ) ) ;
    public final void ruleNetworkCommunicationType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:919:2: ( ( ( rule__NetworkCommunicationType__Alternatives ) ) )
            // InternalDeviceParser.g:920:2: ( ( rule__NetworkCommunicationType__Alternatives ) )
            {
            // InternalDeviceParser.g:920:2: ( ( rule__NetworkCommunicationType__Alternatives ) )
            // InternalDeviceParser.g:921:3: ( rule__NetworkCommunicationType__Alternatives )
            {
             before(grammarAccess.getNetworkCommunicationTypeAccess().getAlternatives());
            // InternalDeviceParser.g:922:3: ( rule__NetworkCommunicationType__Alternatives )
            // InternalDeviceParser.g:922:4: rule__NetworkCommunicationType__Alternatives
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
    // InternalDeviceParser.g:931:1: entryRuleEthernetCommunicationType : ruleEthernetCommunicationType EOF ;
    public final void entryRuleEthernetCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:932:1: ( ruleEthernetCommunicationType EOF )
            // InternalDeviceParser.g:933:1: ruleEthernetCommunicationType EOF
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
    // InternalDeviceParser.g:940:1: ruleEthernetCommunicationType : ( ( rule__EthernetCommunicationType__Group__0 ) ) ;
    public final void ruleEthernetCommunicationType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:944:2: ( ( ( rule__EthernetCommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:945:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:945:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            // InternalDeviceParser.g:946:3: ( rule__EthernetCommunicationType__Group__0 )
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getGroup());
            // InternalDeviceParser.g:947:3: ( rule__EthernetCommunicationType__Group__0 )
            // InternalDeviceParser.g:947:4: rule__EthernetCommunicationType__Group__0
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
    // InternalDeviceParser.g:956:1: entryRuleWlanCommunicationType : ruleWlanCommunicationType EOF ;
    public final void entryRuleWlanCommunicationType() throws RecognitionException {
        try {
            // InternalDeviceParser.g:957:1: ( ruleWlanCommunicationType EOF )
            // InternalDeviceParser.g:958:1: ruleWlanCommunicationType EOF
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
    // InternalDeviceParser.g:965:1: ruleWlanCommunicationType : ( ( rule__WlanCommunicationType__Group__0 ) ) ;
    public final void ruleWlanCommunicationType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:969:2: ( ( ( rule__WlanCommunicationType__Group__0 ) ) )
            // InternalDeviceParser.g:970:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            {
            // InternalDeviceParser.g:970:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            // InternalDeviceParser.g:971:3: ( rule__WlanCommunicationType__Group__0 )
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getGroup());
            // InternalDeviceParser.g:972:3: ( rule__WlanCommunicationType__Group__0 )
            // InternalDeviceParser.g:972:4: rule__WlanCommunicationType__Group__0
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


    // $ANTLR start "entryRuleAttributeKind"
    // InternalDeviceParser.g:981:1: entryRuleAttributeKind : ruleAttributeKind EOF ;
    public final void entryRuleAttributeKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:982:1: ( ruleAttributeKind EOF )
            // InternalDeviceParser.g:983:1: ruleAttributeKind EOF
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
    // InternalDeviceParser.g:990:1: ruleAttributeKind : ( ( rule__AttributeKind__Group__0 ) ) ;
    public final void ruleAttributeKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:994:2: ( ( ( rule__AttributeKind__Group__0 ) ) )
            // InternalDeviceParser.g:995:2: ( ( rule__AttributeKind__Group__0 ) )
            {
            // InternalDeviceParser.g:995:2: ( ( rule__AttributeKind__Group__0 ) )
            // InternalDeviceParser.g:996:3: ( rule__AttributeKind__Group__0 )
            {
             before(grammarAccess.getAttributeKindAccess().getGroup());
            // InternalDeviceParser.g:997:3: ( rule__AttributeKind__Group__0 )
            // InternalDeviceParser.g:997:4: rule__AttributeKind__Group__0
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
    // InternalDeviceParser.g:1006:1: entryRuleMaximumKind : ruleMaximumKind EOF ;
    public final void entryRuleMaximumKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:1007:1: ( ruleMaximumKind EOF )
            // InternalDeviceParser.g:1008:1: ruleMaximumKind EOF
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
    // InternalDeviceParser.g:1015:1: ruleMaximumKind : ( ( rule__MaximumKind__Group__0 ) ) ;
    public final void ruleMaximumKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1019:2: ( ( ( rule__MaximumKind__Group__0 ) ) )
            // InternalDeviceParser.g:1020:2: ( ( rule__MaximumKind__Group__0 ) )
            {
            // InternalDeviceParser.g:1020:2: ( ( rule__MaximumKind__Group__0 ) )
            // InternalDeviceParser.g:1021:3: ( rule__MaximumKind__Group__0 )
            {
             before(grammarAccess.getMaximumKindAccess().getGroup());
            // InternalDeviceParser.g:1022:3: ( rule__MaximumKind__Group__0 )
            // InternalDeviceParser.g:1022:4: rule__MaximumKind__Group__0
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
    // InternalDeviceParser.g:1031:1: entryRuleMinimumKind : ruleMinimumKind EOF ;
    public final void entryRuleMinimumKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:1032:1: ( ruleMinimumKind EOF )
            // InternalDeviceParser.g:1033:1: ruleMinimumKind EOF
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
    // InternalDeviceParser.g:1040:1: ruleMinimumKind : ( ( rule__MinimumKind__Group__0 ) ) ;
    public final void ruleMinimumKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1044:2: ( ( ( rule__MinimumKind__Group__0 ) ) )
            // InternalDeviceParser.g:1045:2: ( ( rule__MinimumKind__Group__0 ) )
            {
            // InternalDeviceParser.g:1045:2: ( ( rule__MinimumKind__Group__0 ) )
            // InternalDeviceParser.g:1046:3: ( rule__MinimumKind__Group__0 )
            {
             before(grammarAccess.getMinimumKindAccess().getGroup());
            // InternalDeviceParser.g:1047:3: ( rule__MinimumKind__Group__0 )
            // InternalDeviceParser.g:1047:4: rule__MinimumKind__Group__0
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
    // InternalDeviceParser.g:1056:1: entryRuleSelectionKind : ruleSelectionKind EOF ;
    public final void entryRuleSelectionKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:1057:1: ( ruleSelectionKind EOF )
            // InternalDeviceParser.g:1058:1: ruleSelectionKind EOF
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
    // InternalDeviceParser.g:1065:1: ruleSelectionKind : ( ( rule__SelectionKind__Group__0 ) ) ;
    public final void ruleSelectionKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1069:2: ( ( ( rule__SelectionKind__Group__0 ) ) )
            // InternalDeviceParser.g:1070:2: ( ( rule__SelectionKind__Group__0 ) )
            {
            // InternalDeviceParser.g:1070:2: ( ( rule__SelectionKind__Group__0 ) )
            // InternalDeviceParser.g:1071:3: ( rule__SelectionKind__Group__0 )
            {
             before(grammarAccess.getSelectionKindAccess().getGroup());
            // InternalDeviceParser.g:1072:3: ( rule__SelectionKind__Group__0 )
            // InternalDeviceParser.g:1072:4: rule__SelectionKind__Group__0
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


    // $ANTLR start "entryRuleRangeKind"
    // InternalDeviceParser.g:1081:1: entryRuleRangeKind : ruleRangeKind EOF ;
    public final void entryRuleRangeKind() throws RecognitionException {
        try {
            // InternalDeviceParser.g:1082:1: ( ruleRangeKind EOF )
            // InternalDeviceParser.g:1083:1: ruleRangeKind EOF
            {
             before(grammarAccess.getRangeKindRule());
            pushFollow(FOLLOW_1);
            ruleRangeKind();

            state._fsp--;

             after(grammarAccess.getRangeKindRule());
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
    // $ANTLR end "entryRuleRangeKind"


    // $ANTLR start "ruleRangeKind"
    // InternalDeviceParser.g:1090:1: ruleRangeKind : ( ( rule__RangeKind__Group__0 ) ) ;
    public final void ruleRangeKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1094:2: ( ( ( rule__RangeKind__Group__0 ) ) )
            // InternalDeviceParser.g:1095:2: ( ( rule__RangeKind__Group__0 ) )
            {
            // InternalDeviceParser.g:1095:2: ( ( rule__RangeKind__Group__0 ) )
            // InternalDeviceParser.g:1096:3: ( rule__RangeKind__Group__0 )
            {
             before(grammarAccess.getRangeKindAccess().getGroup());
            // InternalDeviceParser.g:1097:3: ( rule__RangeKind__Group__0 )
            // InternalDeviceParser.g:1097:4: rule__RangeKind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RangeKind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeKindAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRangeKind"


    // $ANTLR start "entryRuleDouble0"
    // InternalDeviceParser.g:1106:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalDeviceParser.g:1107:1: ( ruleDouble0 EOF )
            // InternalDeviceParser.g:1108:1: ruleDouble0 EOF
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
    // InternalDeviceParser.g:1115:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1119:2: ( ( RULE_DOUBLE ) )
            // InternalDeviceParser.g:1120:2: ( RULE_DOUBLE )
            {
            // InternalDeviceParser.g:1120:2: ( RULE_DOUBLE )
            // InternalDeviceParser.g:1121:3: RULE_DOUBLE
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
    // InternalDeviceParser.g:1131:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalDeviceParser.g:1132:1: ( ruleInteger0 EOF )
            // InternalDeviceParser.g:1133:1: ruleInteger0 EOF
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
    // InternalDeviceParser.g:1140:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1144:2: ( ( RULE_DECINT ) )
            // InternalDeviceParser.g:1145:2: ( RULE_DECINT )
            {
            // InternalDeviceParser.g:1145:2: ( RULE_DECINT )
            // InternalDeviceParser.g:1146:3: RULE_DECINT
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
    // InternalDeviceParser.g:1156:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDeviceParser.g:1157:1: ( ruleEString EOF )
            // InternalDeviceParser.g:1158:1: ruleEString EOF
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
    // InternalDeviceParser.g:1165:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1169:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDeviceParser.g:1170:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDeviceParser.g:1170:2: ( ( rule__EString__Alternatives ) )
            // InternalDeviceParser.g:1171:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives());
            // InternalDeviceParser.g:1172:3: ( rule__EString__Alternatives )
            // InternalDeviceParser.g:1172:4: rule__EString__Alternatives
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
    // InternalDeviceParser.g:1181:1: entryRulePreListElement : rulePreListElement EOF ;
    public final void entryRulePreListElement() throws RecognitionException {

            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalDeviceParser.g:1185:1: ( rulePreListElement EOF )
            // InternalDeviceParser.g:1186:1: rulePreListElement EOF
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
    // InternalDeviceParser.g:1196:1: rulePreListElement : ( HyphenMinus ) ;
    public final void rulePreListElement() throws RecognitionException {

                HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1201:2: ( ( HyphenMinus ) )
            // InternalDeviceParser.g:1202:2: ( HyphenMinus )
            {
            // InternalDeviceParser.g:1202:2: ( HyphenMinus )
            // InternalDeviceParser.g:1203:3: HyphenMinus
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


    // $ANTLR start "rule__DeviceType__Alternatives"
    // InternalDeviceParser.g:1213:1: rule__DeviceType__Alternatives : ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) );
    public final void rule__DeviceType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1217:1: ( ( ruleDeviceType_Impl ) | ( ruleComputationDeviceType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==DeviceType) ) {
                alt1=1;
            }
            else if ( (LA1_0==ComputationDeviceType) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeviceParser.g:1218:2: ( ruleDeviceType_Impl )
                    {
                    // InternalDeviceParser.g:1218:2: ( ruleDeviceType_Impl )
                    // InternalDeviceParser.g:1219:3: ruleDeviceType_Impl
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
                    // InternalDeviceParser.g:1224:2: ( ruleComputationDeviceType )
                    {
                    // InternalDeviceParser.g:1224:2: ( ruleComputationDeviceType )
                    // InternalDeviceParser.g:1225:3: ruleComputationDeviceType
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
    // InternalDeviceParser.g:1234:1: rule__AbstractCommunicationConnection__Alternatives : ( ( ruleCommunicationConnection ) | ( ruleNetworkConnection ) );
    public final void rule__AbstractCommunicationConnection__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1238:1: ( ( ruleCommunicationConnection ) | ( ruleNetworkConnection ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==HyphenMinus) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==Name) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_STRING) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==RULE_INDENT) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==Type) ) {
                                int LA2_6 = input.LA(6);

                                if ( (LA2_6==RULE_ID||LA2_6==RULE_STRING) ) {
                                    alt2=1;
                                }
                                else if ( (LA2_6==Ethernet||LA2_6==Wlan) ) {
                                    alt2=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_2==RULE_ID) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==RULE_INDENT) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==Type) ) {
                                int LA2_6 = input.LA(6);

                                if ( (LA2_6==RULE_ID||LA2_6==RULE_STRING) ) {
                                    alt2=1;
                                }
                                else if ( (LA2_6==Ethernet||LA2_6==Wlan) ) {
                                    alt2=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDeviceParser.g:1239:2: ( ruleCommunicationConnection )
                    {
                    // InternalDeviceParser.g:1239:2: ( ruleCommunicationConnection )
                    // InternalDeviceParser.g:1240:3: ruleCommunicationConnection
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
                    // InternalDeviceParser.g:1245:2: ( ruleNetworkConnection )
                    {
                    // InternalDeviceParser.g:1245:2: ( ruleNetworkConnection )
                    // InternalDeviceParser.g:1246:3: ruleNetworkConnection
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
    // InternalDeviceParser.g:1255:1: rule__AbstractNetworkProperty__Alternatives : ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) );
    public final void rule__AbstractNetworkProperty__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1259:1: ( ( ruleInterfaceNetworkProperty ) | ( ruleAddressNetworkProperty ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==HyphenMinus) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==Name) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==Address) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==Interface) ) {
                        alt3=1;
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
                    // InternalDeviceParser.g:1260:2: ( ruleInterfaceNetworkProperty )
                    {
                    // InternalDeviceParser.g:1260:2: ( ruleInterfaceNetworkProperty )
                    // InternalDeviceParser.g:1261:3: ruleInterfaceNetworkProperty
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
                    // InternalDeviceParser.g:1266:2: ( ruleAddressNetworkProperty )
                    {
                    // InternalDeviceParser.g:1266:2: ( ruleAddressNetworkProperty )
                    // InternalDeviceParser.g:1267:3: ruleAddressNetworkProperty
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


    // $ANTLR start "rule__PropertyKind__Alternatives"
    // InternalDeviceParser.g:1276:1: rule__PropertyKind__Alternatives : ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleRangeKind ) | ( ruleSelectionKind ) );
    public final void rule__PropertyKind__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1280:1: ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleRangeKind ) | ( ruleSelectionKind ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt4=1;
                }
                break;
            case MaximumKind:
                {
                alt4=2;
                }
                break;
            case MinimumKind:
                {
                alt4=3;
                }
                break;
            case RangeKind:
                {
                alt4=4;
                }
                break;
            case SelectionKind:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDeviceParser.g:1281:2: ( ruleAttributeKind )
                    {
                    // InternalDeviceParser.g:1281:2: ( ruleAttributeKind )
                    // InternalDeviceParser.g:1282:3: ruleAttributeKind
                    {
                     before(grammarAccess.getPropertyKindAccess().getAttributeKindParserRuleCall_0());
                    pushFollow(FOLLOW_2);
                    ruleAttributeKind();

                    state._fsp--;

                     after(grammarAccess.getPropertyKindAccess().getAttributeKindParserRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1287:2: ( ruleMaximumKind )
                    {
                    // InternalDeviceParser.g:1287:2: ( ruleMaximumKind )
                    // InternalDeviceParser.g:1288:3: ruleMaximumKind
                    {
                     before(grammarAccess.getPropertyKindAccess().getMaximumKindParserRuleCall_1());
                    pushFollow(FOLLOW_2);
                    ruleMaximumKind();

                    state._fsp--;

                     after(grammarAccess.getPropertyKindAccess().getMaximumKindParserRuleCall_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceParser.g:1293:2: ( ruleMinimumKind )
                    {
                    // InternalDeviceParser.g:1293:2: ( ruleMinimumKind )
                    // InternalDeviceParser.g:1294:3: ruleMinimumKind
                    {
                     before(grammarAccess.getPropertyKindAccess().getMinimumKindParserRuleCall_2());
                    pushFollow(FOLLOW_2);
                    ruleMinimumKind();

                    state._fsp--;

                     after(grammarAccess.getPropertyKindAccess().getMinimumKindParserRuleCall_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalDeviceParser.g:1299:2: ( ruleRangeKind )
                    {
                    // InternalDeviceParser.g:1299:2: ( ruleRangeKind )
                    // InternalDeviceParser.g:1300:3: ruleRangeKind
                    {
                     before(grammarAccess.getPropertyKindAccess().getRangeKindParserRuleCall_3());
                    pushFollow(FOLLOW_2);
                    ruleRangeKind();

                    state._fsp--;

                     after(grammarAccess.getPropertyKindAccess().getRangeKindParserRuleCall_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalDeviceParser.g:1305:2: ( ruleSelectionKind )
                    {
                    // InternalDeviceParser.g:1305:2: ( ruleSelectionKind )
                    // InternalDeviceParser.g:1306:3: ruleSelectionKind
                    {
                     before(grammarAccess.getPropertyKindAccess().getSelectionKindParserRuleCall_4());
                    pushFollow(FOLLOW_2);
                    ruleSelectionKind();

                    state._fsp--;

                     after(grammarAccess.getPropertyKindAccess().getSelectionKindParserRuleCall_4());

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
    // $ANTLR end "rule__PropertyKind__Alternatives"


    // $ANTLR start "rule__PropertyValue__Alternatives"
    // InternalDeviceParser.g:1315:1: rule__PropertyValue__Alternatives : ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) | ( ruleProcessorArchitectureValue ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1319:1: ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) | ( ruleProcessorArchitectureValue ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt5=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case X86_64:
            case Arm64:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDeviceParser.g:1320:2: ( rulePropertyValueInt )
                    {
                    // InternalDeviceParser.g:1320:2: ( rulePropertyValueInt )
                    // InternalDeviceParser.g:1321:3: rulePropertyValueInt
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
                    // InternalDeviceParser.g:1326:2: ( rulePropertyValueDouble )
                    {
                    // InternalDeviceParser.g:1326:2: ( rulePropertyValueDouble )
                    // InternalDeviceParser.g:1327:3: rulePropertyValueDouble
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
                    // InternalDeviceParser.g:1332:2: ( rulePropertyValueString )
                    {
                    // InternalDeviceParser.g:1332:2: ( rulePropertyValueString )
                    // InternalDeviceParser.g:1333:3: rulePropertyValueString
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
                    // InternalDeviceParser.g:1338:2: ( ruleProcessorArchitectureValue )
                    {
                    // InternalDeviceParser.g:1338:2: ( ruleProcessorArchitectureValue )
                    // InternalDeviceParser.g:1339:3: ruleProcessorArchitectureValue
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
    // InternalDeviceParser.g:1348:1: rule__ProcessorArchitectureValue__Alternatives : ( ( ruleX86ProcessorArchitecture ) | ( ruleArm64ProcessorArchitecture ) );
    public final void rule__ProcessorArchitectureValue__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1352:1: ( ( ruleX86ProcessorArchitecture ) | ( ruleArm64ProcessorArchitecture ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==X86_64) ) {
                alt6=1;
            }
            else if ( (LA6_0==Arm64) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeviceParser.g:1353:2: ( ruleX86ProcessorArchitecture )
                    {
                    // InternalDeviceParser.g:1353:2: ( ruleX86ProcessorArchitecture )
                    // InternalDeviceParser.g:1354:3: ruleX86ProcessorArchitecture
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
                    // InternalDeviceParser.g:1359:2: ( ruleArm64ProcessorArchitecture )
                    {
                    // InternalDeviceParser.g:1359:2: ( ruleArm64ProcessorArchitecture )
                    // InternalDeviceParser.g:1360:3: ruleArm64ProcessorArchitecture
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
    // InternalDeviceParser.g:1369:1: rule__AbstractResouceType__Alternatives : ( ( ruleOpertingSystemType ) | ( ruleProcessorArchitectureType ) | ( ruleResourceType ) );
    public final void rule__AbstractResouceType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1373:1: ( ( ruleOpertingSystemType ) | ( ruleProcessorArchitectureType ) | ( ruleResourceType ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case Linux:
            case MacOS:
                {
                alt7=1;
                }
                break;
            case ProcessorArchitecture:
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
                    // InternalDeviceParser.g:1374:2: ( ruleOpertingSystemType )
                    {
                    // InternalDeviceParser.g:1374:2: ( ruleOpertingSystemType )
                    // InternalDeviceParser.g:1375:3: ruleOpertingSystemType
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
                    // InternalDeviceParser.g:1380:2: ( ruleProcessorArchitectureType )
                    {
                    // InternalDeviceParser.g:1380:2: ( ruleProcessorArchitectureType )
                    // InternalDeviceParser.g:1381:3: ruleProcessorArchitectureType
                    {
                     before(grammarAccess.getAbstractResouceTypeAccess().getProcessorArchitectureTypeParserRuleCall_1());
                    pushFollow(FOLLOW_2);
                    ruleProcessorArchitectureType();

                    state._fsp--;

                     after(grammarAccess.getAbstractResouceTypeAccess().getProcessorArchitectureTypeParserRuleCall_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalDeviceParser.g:1386:2: ( ruleResourceType )
                    {
                    // InternalDeviceParser.g:1386:2: ( ruleResourceType )
                    // InternalDeviceParser.g:1387:3: ruleResourceType
                    {
                     before(grammarAccess.getAbstractResouceTypeAccess().getResourceTypeParserRuleCall_2());
                    pushFollow(FOLLOW_2);
                    ruleResourceType();

                    state._fsp--;

                     after(grammarAccess.getAbstractResouceTypeAccess().getResourceTypeParserRuleCall_2());

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
    // InternalDeviceParser.g:1396:1: rule__OpertingSystemType__Alternatives : ( ( ruleLinuxOpertingSystemType ) | ( ruleMacOSOpertingSystemType ) );
    public final void rule__OpertingSystemType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1400:1: ( ( ruleLinuxOpertingSystemType ) | ( ruleMacOSOpertingSystemType ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Linux) ) {
                alt8=1;
            }
            else if ( (LA8_0==MacOS) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDeviceParser.g:1401:2: ( ruleLinuxOpertingSystemType )
                    {
                    // InternalDeviceParser.g:1401:2: ( ruleLinuxOpertingSystemType )
                    // InternalDeviceParser.g:1402:3: ruleLinuxOpertingSystemType
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
                    // InternalDeviceParser.g:1407:2: ( ruleMacOSOpertingSystemType )
                    {
                    // InternalDeviceParser.g:1407:2: ( ruleMacOSOpertingSystemType )
                    // InternalDeviceParser.g:1408:3: ruleMacOSOpertingSystemType
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
    // InternalDeviceParser.g:1417:1: rule__NetworkCommunicationType__Alternatives : ( ( ruleEthernetCommunicationType ) | ( ruleWlanCommunicationType ) );
    public final void rule__NetworkCommunicationType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1421:1: ( ( ruleEthernetCommunicationType ) | ( ruleWlanCommunicationType ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Ethernet) ) {
                alt9=1;
            }
            else if ( (LA9_0==Wlan) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeviceParser.g:1422:2: ( ruleEthernetCommunicationType )
                    {
                    // InternalDeviceParser.g:1422:2: ( ruleEthernetCommunicationType )
                    // InternalDeviceParser.g:1423:3: ruleEthernetCommunicationType
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
                    // InternalDeviceParser.g:1428:2: ( ruleWlanCommunicationType )
                    {
                    // InternalDeviceParser.g:1428:2: ( ruleWlanCommunicationType )
                    // InternalDeviceParser.g:1429:3: ruleWlanCommunicationType
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
    // InternalDeviceParser.g:1438:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1442:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceParser.g:1443:2: ( RULE_STRING )
                    {
                    // InternalDeviceParser.g:1443:2: ( RULE_STRING )
                    // InternalDeviceParser.g:1444:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    match(input,RULE_STRING,FOLLOW_2);
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalDeviceParser.g:1449:2: ( RULE_ID )
                    {
                    // InternalDeviceParser.g:1449:2: ( RULE_ID )
                    // InternalDeviceParser.g:1450:3: RULE_ID
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


    // $ANTLR start "rule__DeviceSet__Group__0"
    // InternalDeviceParser.g:1459:1: rule__DeviceSet__Group__0 : rule__DeviceSet__Group__0__Impl rule__DeviceSet__Group__1 ;
    public final void rule__DeviceSet__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1463:1: ( rule__DeviceSet__Group__0__Impl rule__DeviceSet__Group__1 )
            // InternalDeviceParser.g:1464:2: rule__DeviceSet__Group__0__Impl rule__DeviceSet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DeviceSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__Group__0"


    // $ANTLR start "rule__DeviceSet__Group__0__Impl"
    // InternalDeviceParser.g:1471:1: rule__DeviceSet__Group__0__Impl : ( ( rule__DeviceSet__DeviceAssignment_0 ) ) ;
    public final void rule__DeviceSet__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1475:1: ( ( ( rule__DeviceSet__DeviceAssignment_0 ) ) )
            // InternalDeviceParser.g:1476:1: ( ( rule__DeviceSet__DeviceAssignment_0 ) )
            {
            // InternalDeviceParser.g:1476:1: ( ( rule__DeviceSet__DeviceAssignment_0 ) )
            // InternalDeviceParser.g:1477:2: ( rule__DeviceSet__DeviceAssignment_0 )
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceAssignment_0());
            // InternalDeviceParser.g:1478:2: ( rule__DeviceSet__DeviceAssignment_0 )
            // InternalDeviceParser.g:1478:3: rule__DeviceSet__DeviceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceSet__DeviceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceSetAccess().getDeviceAssignment_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__Group__0__Impl"


    // $ANTLR start "rule__DeviceSet__Group__1"
    // InternalDeviceParser.g:1486:1: rule__DeviceSet__Group__1 : rule__DeviceSet__Group__1__Impl ;
    public final void rule__DeviceSet__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1490:1: ( rule__DeviceSet__Group__1__Impl )
            // InternalDeviceParser.g:1491:2: rule__DeviceSet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceSet__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__Group__1"


    // $ANTLR start "rule__DeviceSet__Group__1__Impl"
    // InternalDeviceParser.g:1497:1: rule__DeviceSet__Group__1__Impl : ( ( rule__DeviceSet__Group_1__0 )* ) ;
    public final void rule__DeviceSet__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1501:1: ( ( ( rule__DeviceSet__Group_1__0 )* ) )
            // InternalDeviceParser.g:1502:1: ( ( rule__DeviceSet__Group_1__0 )* )
            {
            // InternalDeviceParser.g:1502:1: ( ( rule__DeviceSet__Group_1__0 )* )
            // InternalDeviceParser.g:1503:2: ( rule__DeviceSet__Group_1__0 )*
            {
             before(grammarAccess.getDeviceSetAccess().getGroup_1());
            // InternalDeviceParser.g:1504:2: ( rule__DeviceSet__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==HyphenMinusHyphenMinusHyphenMinus) ) {
                    alt11=1;
                }


                switch (alt11) {
                case 1 :
                    // InternalDeviceParser.g:1504:3: rule__DeviceSet__Group_1__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__DeviceSet__Group_1__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop11;
                }
            } while (true);

             after(grammarAccess.getDeviceSetAccess().getGroup_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__Group__1__Impl"


    // $ANTLR start "rule__DeviceSet__Group_1__0"
    // InternalDeviceParser.g:1513:1: rule__DeviceSet__Group_1__0 : rule__DeviceSet__Group_1__0__Impl rule__DeviceSet__Group_1__1 ;
    public final void rule__DeviceSet__Group_1__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1517:1: ( rule__DeviceSet__Group_1__0__Impl rule__DeviceSet__Group_1__1 )
            // InternalDeviceParser.g:1518:2: rule__DeviceSet__Group_1__0__Impl rule__DeviceSet__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__DeviceSet__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceSet__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__Group_1__0"


    // $ANTLR start "rule__DeviceSet__Group_1__0__Impl"
    // InternalDeviceParser.g:1525:1: rule__DeviceSet__Group_1__0__Impl : ( HyphenMinusHyphenMinusHyphenMinus ) ;
    public final void rule__DeviceSet__Group_1__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1529:1: ( ( HyphenMinusHyphenMinusHyphenMinus ) )
            // InternalDeviceParser.g:1530:1: ( HyphenMinusHyphenMinusHyphenMinus )
            {
            // InternalDeviceParser.g:1530:1: ( HyphenMinusHyphenMinusHyphenMinus )
            // InternalDeviceParser.g:1531:2: HyphenMinusHyphenMinusHyphenMinus
            {
             before(grammarAccess.getDeviceSetAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_1_0());
            match(input,HyphenMinusHyphenMinusHyphenMinus,FOLLOW_2);
             after(grammarAccess.getDeviceSetAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__Group_1__0__Impl"


    // $ANTLR start "rule__DeviceSet__Group_1__1"
    // InternalDeviceParser.g:1540:1: rule__DeviceSet__Group_1__1 : rule__DeviceSet__Group_1__1__Impl ;
    public final void rule__DeviceSet__Group_1__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1544:1: ( rule__DeviceSet__Group_1__1__Impl )
            // InternalDeviceParser.g:1545:2: rule__DeviceSet__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceSet__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__Group_1__1"


    // $ANTLR start "rule__DeviceSet__Group_1__1__Impl"
    // InternalDeviceParser.g:1551:1: rule__DeviceSet__Group_1__1__Impl : ( ( rule__DeviceSet__DeviceAssignment_1_1 ) ) ;
    public final void rule__DeviceSet__Group_1__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1555:1: ( ( ( rule__DeviceSet__DeviceAssignment_1_1 ) ) )
            // InternalDeviceParser.g:1556:1: ( ( rule__DeviceSet__DeviceAssignment_1_1 ) )
            {
            // InternalDeviceParser.g:1556:1: ( ( rule__DeviceSet__DeviceAssignment_1_1 ) )
            // InternalDeviceParser.g:1557:2: ( rule__DeviceSet__DeviceAssignment_1_1 )
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceAssignment_1_1());
            // InternalDeviceParser.g:1558:2: ( rule__DeviceSet__DeviceAssignment_1_1 )
            // InternalDeviceParser.g:1558:3: rule__DeviceSet__DeviceAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceSet__DeviceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceSetAccess().getDeviceAssignment_1_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__Group_1__1__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__0"
    // InternalDeviceParser.g:1567:1: rule__InterfaceNetworkProperty__Group__0 : rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 ;
    public final void rule__InterfaceNetworkProperty__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1571:1: ( rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1 )
            // InternalDeviceParser.g:1572:2: rule__InterfaceNetworkProperty__Group__0__Impl rule__InterfaceNetworkProperty__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:1579:1: rule__InterfaceNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__InterfaceNetworkProperty__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1583:1: ( ( () ) )
            // InternalDeviceParser.g:1584:1: ( () )
            {
            // InternalDeviceParser.g:1584:1: ( () )
            // InternalDeviceParser.g:1585:2: ()
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0());
            // InternalDeviceParser.g:1586:2: ()
            // InternalDeviceParser.g:1586:3:
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
    // InternalDeviceParser.g:1594:1: rule__InterfaceNetworkProperty__Group__1 : rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 ;
    public final void rule__InterfaceNetworkProperty__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1598:1: ( rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2 )
            // InternalDeviceParser.g:1599:2: rule__InterfaceNetworkProperty__Group__1__Impl rule__InterfaceNetworkProperty__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:1606:1: rule__InterfaceNetworkProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__InterfaceNetworkProperty__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1610:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:1611:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:1611:1: ( rulePreListElement )
            // InternalDeviceParser.g:1612:2: rulePreListElement
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
    // InternalDeviceParser.g:1621:1: rule__InterfaceNetworkProperty__Group__2 : rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 ;
    public final void rule__InterfaceNetworkProperty__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1625:1: ( rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3 )
            // InternalDeviceParser.g:1626:2: rule__InterfaceNetworkProperty__Group__2__Impl rule__InterfaceNetworkProperty__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDeviceParser.g:1633:1: rule__InterfaceNetworkProperty__Group__2__Impl : ( Name ) ;
    public final void rule__InterfaceNetworkProperty__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1637:1: ( ( Name ) )
            // InternalDeviceParser.g:1638:1: ( Name )
            {
            // InternalDeviceParser.g:1638:1: ( Name )
            // InternalDeviceParser.g:1639:2: Name
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
    // InternalDeviceParser.g:1648:1: rule__InterfaceNetworkProperty__Group__3 : rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 ;
    public final void rule__InterfaceNetworkProperty__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1652:1: ( rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4 )
            // InternalDeviceParser.g:1653:2: rule__InterfaceNetworkProperty__Group__3__Impl rule__InterfaceNetworkProperty__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:1660:1: rule__InterfaceNetworkProperty__Group__3__Impl : ( ( rule__InterfaceNetworkProperty__NameAssignment_3 ) ) ;
    public final void rule__InterfaceNetworkProperty__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1664:1: ( ( ( rule__InterfaceNetworkProperty__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:1665:1: ( ( rule__InterfaceNetworkProperty__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:1665:1: ( ( rule__InterfaceNetworkProperty__NameAssignment_3 ) )
            // InternalDeviceParser.g:1666:2: ( rule__InterfaceNetworkProperty__NameAssignment_3 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getNameAssignment_3());
            // InternalDeviceParser.g:1667:2: ( rule__InterfaceNetworkProperty__NameAssignment_3 )
            // InternalDeviceParser.g:1667:3: rule__InterfaceNetworkProperty__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getNameAssignment_3());

            }


            }

        }
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
    // InternalDeviceParser.g:1675:1: rule__InterfaceNetworkProperty__Group__4 : rule__InterfaceNetworkProperty__Group__4__Impl rule__InterfaceNetworkProperty__Group__5 ;
    public final void rule__InterfaceNetworkProperty__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1679:1: ( rule__InterfaceNetworkProperty__Group__4__Impl rule__InterfaceNetworkProperty__Group__5 )
            // InternalDeviceParser.g:1680:2: rule__InterfaceNetworkProperty__Group__4__Impl rule__InterfaceNetworkProperty__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDeviceParser.g:1687:1: rule__InterfaceNetworkProperty__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1691:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:1692:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:1692:1: ( RULE_INDENT )
            // InternalDeviceParser.g:1693:2: RULE_INDENT
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            }


            }

        }
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
    // InternalDeviceParser.g:1702:1: rule__InterfaceNetworkProperty__Group__5 : rule__InterfaceNetworkProperty__Group__5__Impl rule__InterfaceNetworkProperty__Group__6 ;
    public final void rule__InterfaceNetworkProperty__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1706:1: ( rule__InterfaceNetworkProperty__Group__5__Impl rule__InterfaceNetworkProperty__Group__6 )
            // InternalDeviceParser.g:1707:2: rule__InterfaceNetworkProperty__Group__5__Impl rule__InterfaceNetworkProperty__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalDeviceParser.g:1714:1: rule__InterfaceNetworkProperty__Group__5__Impl : ( Kind ) ;
    public final void rule__InterfaceNetworkProperty__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1718:1: ( ( Kind ) )
            // InternalDeviceParser.g:1719:1: ( Kind )
            {
            // InternalDeviceParser.g:1719:1: ( Kind )
            // InternalDeviceParser.g:1720:2: Kind
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getKindKeyword_5());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getKindKeyword_5());

            }


            }

        }
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
    // InternalDeviceParser.g:1729:1: rule__InterfaceNetworkProperty__Group__6 : rule__InterfaceNetworkProperty__Group__6__Impl rule__InterfaceNetworkProperty__Group__7 ;
    public final void rule__InterfaceNetworkProperty__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1733:1: ( rule__InterfaceNetworkProperty__Group__6__Impl rule__InterfaceNetworkProperty__Group__7 )
            // InternalDeviceParser.g:1734:2: rule__InterfaceNetworkProperty__Group__6__Impl rule__InterfaceNetworkProperty__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__InterfaceNetworkProperty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__7();

            state._fsp--;


            }

        }
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
    // InternalDeviceParser.g:1741:1: rule__InterfaceNetworkProperty__Group__6__Impl : ( ( rule__InterfaceNetworkProperty__KindAssignment_6 ) ) ;
    public final void rule__InterfaceNetworkProperty__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1745:1: ( ( ( rule__InterfaceNetworkProperty__KindAssignment_6 ) ) )
            // InternalDeviceParser.g:1746:1: ( ( rule__InterfaceNetworkProperty__KindAssignment_6 ) )
            {
            // InternalDeviceParser.g:1746:1: ( ( rule__InterfaceNetworkProperty__KindAssignment_6 ) )
            // InternalDeviceParser.g:1747:2: ( rule__InterfaceNetworkProperty__KindAssignment_6 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getKindAssignment_6());
            // InternalDeviceParser.g:1748:2: ( rule__InterfaceNetworkProperty__KindAssignment_6 )
            // InternalDeviceParser.g:1748:3: rule__InterfaceNetworkProperty__KindAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__KindAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getKindAssignment_6());

            }


            }

        }
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


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__7"
    // InternalDeviceParser.g:1756:1: rule__InterfaceNetworkProperty__Group__7 : rule__InterfaceNetworkProperty__Group__7__Impl rule__InterfaceNetworkProperty__Group__8 ;
    public final void rule__InterfaceNetworkProperty__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1760:1: ( rule__InterfaceNetworkProperty__Group__7__Impl rule__InterfaceNetworkProperty__Group__8 )
            // InternalDeviceParser.g:1761:2: rule__InterfaceNetworkProperty__Group__7__Impl rule__InterfaceNetworkProperty__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__InterfaceNetworkProperty__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__7"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__7__Impl"
    // InternalDeviceParser.g:1768:1: rule__InterfaceNetworkProperty__Group__7__Impl : ( ( rule__InterfaceNetworkProperty__Group_7__0 )? ) ;
    public final void rule__InterfaceNetworkProperty__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1772:1: ( ( ( rule__InterfaceNetworkProperty__Group_7__0 )? ) )
            // InternalDeviceParser.g:1773:1: ( ( rule__InterfaceNetworkProperty__Group_7__0 )? )
            {
            // InternalDeviceParser.g:1773:1: ( ( rule__InterfaceNetworkProperty__Group_7__0 )? )
            // InternalDeviceParser.g:1774:2: ( rule__InterfaceNetworkProperty__Group_7__0 )?
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_7());
            // InternalDeviceParser.g:1775:2: ( rule__InterfaceNetworkProperty__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Description) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceParser.g:1775:3: rule__InterfaceNetworkProperty__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceNetworkProperty__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__7__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__8"
    // InternalDeviceParser.g:1783:1: rule__InterfaceNetworkProperty__Group__8 : rule__InterfaceNetworkProperty__Group__8__Impl rule__InterfaceNetworkProperty__Group__9 ;
    public final void rule__InterfaceNetworkProperty__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1787:1: ( rule__InterfaceNetworkProperty__Group__8__Impl rule__InterfaceNetworkProperty__Group__9 )
            // InternalDeviceParser.g:1788:2: rule__InterfaceNetworkProperty__Group__8__Impl rule__InterfaceNetworkProperty__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__InterfaceNetworkProperty__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__8"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__8__Impl"
    // InternalDeviceParser.g:1795:1: rule__InterfaceNetworkProperty__Group__8__Impl : ( ( rule__InterfaceNetworkProperty__Group_8__0 )? ) ;
    public final void rule__InterfaceNetworkProperty__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1799:1: ( ( ( rule__InterfaceNetworkProperty__Group_8__0 )? ) )
            // InternalDeviceParser.g:1800:1: ( ( rule__InterfaceNetworkProperty__Group_8__0 )? )
            {
            // InternalDeviceParser.g:1800:1: ( ( rule__InterfaceNetworkProperty__Group_8__0 )? )
            // InternalDeviceParser.g:1801:2: ( rule__InterfaceNetworkProperty__Group_8__0 )?
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_8());
            // InternalDeviceParser.g:1802:2: ( rule__InterfaceNetworkProperty__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Value) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceParser.g:1802:3: rule__InterfaceNetworkProperty__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InterfaceNetworkProperty__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getGroup_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__8__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__9"
    // InternalDeviceParser.g:1810:1: rule__InterfaceNetworkProperty__Group__9 : rule__InterfaceNetworkProperty__Group__9__Impl ;
    public final void rule__InterfaceNetworkProperty__Group__9() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1814:1: ( rule__InterfaceNetworkProperty__Group__9__Impl )
            // InternalDeviceParser.g:1815:2: rule__InterfaceNetworkProperty__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__9"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group__9__Impl"
    // InternalDeviceParser.g:1821:1: rule__InterfaceNetworkProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__InterfaceNetworkProperty__Group__9__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1825:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:1826:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:1826:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:1827:2: RULE_DEDENT
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group__9__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_7__0"
    // InternalDeviceParser.g:1837:1: rule__InterfaceNetworkProperty__Group_7__0 : rule__InterfaceNetworkProperty__Group_7__0__Impl rule__InterfaceNetworkProperty__Group_7__1 ;
    public final void rule__InterfaceNetworkProperty__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1841:1: ( rule__InterfaceNetworkProperty__Group_7__0__Impl rule__InterfaceNetworkProperty__Group_7__1 )
            // InternalDeviceParser.g:1842:2: rule__InterfaceNetworkProperty__Group_7__0__Impl rule__InterfaceNetworkProperty__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__InterfaceNetworkProperty__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_7__0"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_7__0__Impl"
    // InternalDeviceParser.g:1849:1: rule__InterfaceNetworkProperty__Group_7__0__Impl : ( Description ) ;
    public final void rule__InterfaceNetworkProperty__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1853:1: ( ( Description ) )
            // InternalDeviceParser.g:1854:1: ( Description )
            {
            // InternalDeviceParser.g:1854:1: ( Description )
            // InternalDeviceParser.g:1855:2: Description
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionKeyword_7_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_7__0__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_7__1"
    // InternalDeviceParser.g:1864:1: rule__InterfaceNetworkProperty__Group_7__1 : rule__InterfaceNetworkProperty__Group_7__1__Impl ;
    public final void rule__InterfaceNetworkProperty__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1868:1: ( rule__InterfaceNetworkProperty__Group_7__1__Impl )
            // InternalDeviceParser.g:1869:2: rule__InterfaceNetworkProperty__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_7__1"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_7__1__Impl"
    // InternalDeviceParser.g:1875:1: rule__InterfaceNetworkProperty__Group_7__1__Impl : ( ( rule__InterfaceNetworkProperty__DescriptionAssignment_7_1 ) ) ;
    public final void rule__InterfaceNetworkProperty__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1879:1: ( ( ( rule__InterfaceNetworkProperty__DescriptionAssignment_7_1 ) ) )
            // InternalDeviceParser.g:1880:1: ( ( rule__InterfaceNetworkProperty__DescriptionAssignment_7_1 ) )
            {
            // InternalDeviceParser.g:1880:1: ( ( rule__InterfaceNetworkProperty__DescriptionAssignment_7_1 ) )
            // InternalDeviceParser.g:1881:2: ( rule__InterfaceNetworkProperty__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionAssignment_7_1());
            // InternalDeviceParser.g:1882:2: ( rule__InterfaceNetworkProperty__DescriptionAssignment_7_1 )
            // InternalDeviceParser.g:1882:3: rule__InterfaceNetworkProperty__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionAssignment_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_7__1__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_8__0"
    // InternalDeviceParser.g:1891:1: rule__InterfaceNetworkProperty__Group_8__0 : rule__InterfaceNetworkProperty__Group_8__0__Impl rule__InterfaceNetworkProperty__Group_8__1 ;
    public final void rule__InterfaceNetworkProperty__Group_8__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1895:1: ( rule__InterfaceNetworkProperty__Group_8__0__Impl rule__InterfaceNetworkProperty__Group_8__1 )
            // InternalDeviceParser.g:1896:2: rule__InterfaceNetworkProperty__Group_8__0__Impl rule__InterfaceNetworkProperty__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__InterfaceNetworkProperty__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_8__0"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_8__0__Impl"
    // InternalDeviceParser.g:1903:1: rule__InterfaceNetworkProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__InterfaceNetworkProperty__Group_8__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1907:1: ( ( Value ) )
            // InternalDeviceParser.g:1908:1: ( Value )
            {
            // InternalDeviceParser.g:1908:1: ( Value )
            // InternalDeviceParser.g:1909:2: Value
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_8_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_8_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_8__0__Impl"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_8__1"
    // InternalDeviceParser.g:1918:1: rule__InterfaceNetworkProperty__Group_8__1 : rule__InterfaceNetworkProperty__Group_8__1__Impl ;
    public final void rule__InterfaceNetworkProperty__Group_8__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1922:1: ( rule__InterfaceNetworkProperty__Group_8__1__Impl )
            // InternalDeviceParser.g:1923:2: rule__InterfaceNetworkProperty__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_8__1"


    // $ANTLR start "rule__InterfaceNetworkProperty__Group_8__1__Impl"
    // InternalDeviceParser.g:1929:1: rule__InterfaceNetworkProperty__Group_8__1__Impl : ( ( rule__InterfaceNetworkProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__InterfaceNetworkProperty__Group_8__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1933:1: ( ( ( rule__InterfaceNetworkProperty__ValueAssignment_8_1 ) ) )
            // InternalDeviceParser.g:1934:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_8_1 ) )
            {
            // InternalDeviceParser.g:1934:1: ( ( rule__InterfaceNetworkProperty__ValueAssignment_8_1 ) )
            // InternalDeviceParser.g:1935:2: ( rule__InterfaceNetworkProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValueAssignment_8_1());
            // InternalDeviceParser.g:1936:2: ( rule__InterfaceNetworkProperty__ValueAssignment_8_1 )
            // InternalDeviceParser.g:1936:3: rule__InterfaceNetworkProperty__ValueAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceNetworkProperty__ValueAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValueAssignment_8_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__Group_8__1__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__0"
    // InternalDeviceParser.g:1945:1: rule__AddressNetworkProperty__Group__0 : rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 ;
    public final void rule__AddressNetworkProperty__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1949:1: ( rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1 )
            // InternalDeviceParser.g:1950:2: rule__AddressNetworkProperty__Group__0__Impl rule__AddressNetworkProperty__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:1957:1: rule__AddressNetworkProperty__Group__0__Impl : ( () ) ;
    public final void rule__AddressNetworkProperty__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1961:1: ( ( () ) )
            // InternalDeviceParser.g:1962:1: ( () )
            {
            // InternalDeviceParser.g:1962:1: ( () )
            // InternalDeviceParser.g:1963:2: ()
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0());
            // InternalDeviceParser.g:1964:2: ()
            // InternalDeviceParser.g:1964:3:
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
    // InternalDeviceParser.g:1972:1: rule__AddressNetworkProperty__Group__1 : rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 ;
    public final void rule__AddressNetworkProperty__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1976:1: ( rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2 )
            // InternalDeviceParser.g:1977:2: rule__AddressNetworkProperty__Group__1__Impl rule__AddressNetworkProperty__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:1984:1: rule__AddressNetworkProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__AddressNetworkProperty__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:1988:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:1989:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:1989:1: ( rulePreListElement )
            // InternalDeviceParser.g:1990:2: rulePreListElement
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
    // InternalDeviceParser.g:1999:1: rule__AddressNetworkProperty__Group__2 : rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 ;
    public final void rule__AddressNetworkProperty__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2003:1: ( rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3 )
            // InternalDeviceParser.g:2004:2: rule__AddressNetworkProperty__Group__2__Impl rule__AddressNetworkProperty__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDeviceParser.g:2011:1: rule__AddressNetworkProperty__Group__2__Impl : ( Name ) ;
    public final void rule__AddressNetworkProperty__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2015:1: ( ( Name ) )
            // InternalDeviceParser.g:2016:1: ( Name )
            {
            // InternalDeviceParser.g:2016:1: ( Name )
            // InternalDeviceParser.g:2017:2: Name
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
    // InternalDeviceParser.g:2026:1: rule__AddressNetworkProperty__Group__3 : rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 ;
    public final void rule__AddressNetworkProperty__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2030:1: ( rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4 )
            // InternalDeviceParser.g:2031:2: rule__AddressNetworkProperty__Group__3__Impl rule__AddressNetworkProperty__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:2038:1: rule__AddressNetworkProperty__Group__3__Impl : ( ( rule__AddressNetworkProperty__NameAssignment_3 ) ) ;
    public final void rule__AddressNetworkProperty__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2042:1: ( ( ( rule__AddressNetworkProperty__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:2043:1: ( ( rule__AddressNetworkProperty__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:2043:1: ( ( rule__AddressNetworkProperty__NameAssignment_3 ) )
            // InternalDeviceParser.g:2044:2: ( rule__AddressNetworkProperty__NameAssignment_3 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getNameAssignment_3());
            // InternalDeviceParser.g:2045:2: ( rule__AddressNetworkProperty__NameAssignment_3 )
            // InternalDeviceParser.g:2045:3: rule__AddressNetworkProperty__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getNameAssignment_3());

            }


            }

        }
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
    // InternalDeviceParser.g:2053:1: rule__AddressNetworkProperty__Group__4 : rule__AddressNetworkProperty__Group__4__Impl rule__AddressNetworkProperty__Group__5 ;
    public final void rule__AddressNetworkProperty__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2057:1: ( rule__AddressNetworkProperty__Group__4__Impl rule__AddressNetworkProperty__Group__5 )
            // InternalDeviceParser.g:2058:2: rule__AddressNetworkProperty__Group__4__Impl rule__AddressNetworkProperty__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDeviceParser.g:2065:1: rule__AddressNetworkProperty__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__AddressNetworkProperty__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2069:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2070:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2070:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2071:2: RULE_INDENT
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4());

            }


            }

        }
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
    // InternalDeviceParser.g:2080:1: rule__AddressNetworkProperty__Group__5 : rule__AddressNetworkProperty__Group__5__Impl rule__AddressNetworkProperty__Group__6 ;
    public final void rule__AddressNetworkProperty__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2084:1: ( rule__AddressNetworkProperty__Group__5__Impl rule__AddressNetworkProperty__Group__6 )
            // InternalDeviceParser.g:2085:2: rule__AddressNetworkProperty__Group__5__Impl rule__AddressNetworkProperty__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalDeviceParser.g:2092:1: rule__AddressNetworkProperty__Group__5__Impl : ( Kind ) ;
    public final void rule__AddressNetworkProperty__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2096:1: ( ( Kind ) )
            // InternalDeviceParser.g:2097:1: ( Kind )
            {
            // InternalDeviceParser.g:2097:1: ( Kind )
            // InternalDeviceParser.g:2098:2: Kind
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getKindKeyword_5());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getAddressNetworkPropertyAccess().getKindKeyword_5());

            }


            }

        }
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
    // InternalDeviceParser.g:2107:1: rule__AddressNetworkProperty__Group__6 : rule__AddressNetworkProperty__Group__6__Impl rule__AddressNetworkProperty__Group__7 ;
    public final void rule__AddressNetworkProperty__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2111:1: ( rule__AddressNetworkProperty__Group__6__Impl rule__AddressNetworkProperty__Group__7 )
            // InternalDeviceParser.g:2112:2: rule__AddressNetworkProperty__Group__6__Impl rule__AddressNetworkProperty__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__AddressNetworkProperty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__7();

            state._fsp--;


            }

        }
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
    // InternalDeviceParser.g:2119:1: rule__AddressNetworkProperty__Group__6__Impl : ( ( rule__AddressNetworkProperty__KindAssignment_6 ) ) ;
    public final void rule__AddressNetworkProperty__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2123:1: ( ( ( rule__AddressNetworkProperty__KindAssignment_6 ) ) )
            // InternalDeviceParser.g:2124:1: ( ( rule__AddressNetworkProperty__KindAssignment_6 ) )
            {
            // InternalDeviceParser.g:2124:1: ( ( rule__AddressNetworkProperty__KindAssignment_6 ) )
            // InternalDeviceParser.g:2125:2: ( rule__AddressNetworkProperty__KindAssignment_6 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getKindAssignment_6());
            // InternalDeviceParser.g:2126:2: ( rule__AddressNetworkProperty__KindAssignment_6 )
            // InternalDeviceParser.g:2126:3: rule__AddressNetworkProperty__KindAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__KindAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getKindAssignment_6());

            }


            }

        }
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


    // $ANTLR start "rule__AddressNetworkProperty__Group__7"
    // InternalDeviceParser.g:2134:1: rule__AddressNetworkProperty__Group__7 : rule__AddressNetworkProperty__Group__7__Impl rule__AddressNetworkProperty__Group__8 ;
    public final void rule__AddressNetworkProperty__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2138:1: ( rule__AddressNetworkProperty__Group__7__Impl rule__AddressNetworkProperty__Group__8 )
            // InternalDeviceParser.g:2139:2: rule__AddressNetworkProperty__Group__7__Impl rule__AddressNetworkProperty__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__AddressNetworkProperty__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__7"


    // $ANTLR start "rule__AddressNetworkProperty__Group__7__Impl"
    // InternalDeviceParser.g:2146:1: rule__AddressNetworkProperty__Group__7__Impl : ( ( rule__AddressNetworkProperty__Group_7__0 )? ) ;
    public final void rule__AddressNetworkProperty__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2150:1: ( ( ( rule__AddressNetworkProperty__Group_7__0 )? ) )
            // InternalDeviceParser.g:2151:1: ( ( rule__AddressNetworkProperty__Group_7__0 )? )
            {
            // InternalDeviceParser.g:2151:1: ( ( rule__AddressNetworkProperty__Group_7__0 )? )
            // InternalDeviceParser.g:2152:2: ( rule__AddressNetworkProperty__Group_7__0 )?
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup_7());
            // InternalDeviceParser.g:2153:2: ( rule__AddressNetworkProperty__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Description) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceParser.g:2153:3: rule__AddressNetworkProperty__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddressNetworkProperty__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__7__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__8"
    // InternalDeviceParser.g:2161:1: rule__AddressNetworkProperty__Group__8 : rule__AddressNetworkProperty__Group__8__Impl rule__AddressNetworkProperty__Group__9 ;
    public final void rule__AddressNetworkProperty__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2165:1: ( rule__AddressNetworkProperty__Group__8__Impl rule__AddressNetworkProperty__Group__9 )
            // InternalDeviceParser.g:2166:2: rule__AddressNetworkProperty__Group__8__Impl rule__AddressNetworkProperty__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__AddressNetworkProperty__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__8"


    // $ANTLR start "rule__AddressNetworkProperty__Group__8__Impl"
    // InternalDeviceParser.g:2173:1: rule__AddressNetworkProperty__Group__8__Impl : ( ( rule__AddressNetworkProperty__Group_8__0 )? ) ;
    public final void rule__AddressNetworkProperty__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2177:1: ( ( ( rule__AddressNetworkProperty__Group_8__0 )? ) )
            // InternalDeviceParser.g:2178:1: ( ( rule__AddressNetworkProperty__Group_8__0 )? )
            {
            // InternalDeviceParser.g:2178:1: ( ( rule__AddressNetworkProperty__Group_8__0 )? )
            // InternalDeviceParser.g:2179:2: ( rule__AddressNetworkProperty__Group_8__0 )?
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getGroup_8());
            // InternalDeviceParser.g:2180:2: ( rule__AddressNetworkProperty__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Value) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeviceParser.g:2180:3: rule__AddressNetworkProperty__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddressNetworkProperty__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getGroup_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__8__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group__9"
    // InternalDeviceParser.g:2188:1: rule__AddressNetworkProperty__Group__9 : rule__AddressNetworkProperty__Group__9__Impl ;
    public final void rule__AddressNetworkProperty__Group__9() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2192:1: ( rule__AddressNetworkProperty__Group__9__Impl )
            // InternalDeviceParser.g:2193:2: rule__AddressNetworkProperty__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__9"


    // $ANTLR start "rule__AddressNetworkProperty__Group__9__Impl"
    // InternalDeviceParser.g:2199:1: rule__AddressNetworkProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__AddressNetworkProperty__Group__9__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2203:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2204:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2204:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2205:2: RULE_DEDENT
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_9());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group__9__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group_7__0"
    // InternalDeviceParser.g:2215:1: rule__AddressNetworkProperty__Group_7__0 : rule__AddressNetworkProperty__Group_7__0__Impl rule__AddressNetworkProperty__Group_7__1 ;
    public final void rule__AddressNetworkProperty__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2219:1: ( rule__AddressNetworkProperty__Group_7__0__Impl rule__AddressNetworkProperty__Group_7__1 )
            // InternalDeviceParser.g:2220:2: rule__AddressNetworkProperty__Group_7__0__Impl rule__AddressNetworkProperty__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__AddressNetworkProperty__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_7__0"


    // $ANTLR start "rule__AddressNetworkProperty__Group_7__0__Impl"
    // InternalDeviceParser.g:2227:1: rule__AddressNetworkProperty__Group_7__0__Impl : ( Description ) ;
    public final void rule__AddressNetworkProperty__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2231:1: ( ( Description ) )
            // InternalDeviceParser.g:2232:1: ( Description )
            {
            // InternalDeviceParser.g:2232:1: ( Description )
            // InternalDeviceParser.g:2233:2: Description
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getAddressNetworkPropertyAccess().getDescriptionKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_7__0__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group_7__1"
    // InternalDeviceParser.g:2242:1: rule__AddressNetworkProperty__Group_7__1 : rule__AddressNetworkProperty__Group_7__1__Impl ;
    public final void rule__AddressNetworkProperty__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2246:1: ( rule__AddressNetworkProperty__Group_7__1__Impl )
            // InternalDeviceParser.g:2247:2: rule__AddressNetworkProperty__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_7__1"


    // $ANTLR start "rule__AddressNetworkProperty__Group_7__1__Impl"
    // InternalDeviceParser.g:2253:1: rule__AddressNetworkProperty__Group_7__1__Impl : ( ( rule__AddressNetworkProperty__DescriptionAssignment_7_1 ) ) ;
    public final void rule__AddressNetworkProperty__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2257:1: ( ( ( rule__AddressNetworkProperty__DescriptionAssignment_7_1 ) ) )
            // InternalDeviceParser.g:2258:1: ( ( rule__AddressNetworkProperty__DescriptionAssignment_7_1 ) )
            {
            // InternalDeviceParser.g:2258:1: ( ( rule__AddressNetworkProperty__DescriptionAssignment_7_1 ) )
            // InternalDeviceParser.g:2259:2: ( rule__AddressNetworkProperty__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getDescriptionAssignment_7_1());
            // InternalDeviceParser.g:2260:2: ( rule__AddressNetworkProperty__DescriptionAssignment_7_1 )
            // InternalDeviceParser.g:2260:3: rule__AddressNetworkProperty__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getDescriptionAssignment_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_7__1__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group_8__0"
    // InternalDeviceParser.g:2269:1: rule__AddressNetworkProperty__Group_8__0 : rule__AddressNetworkProperty__Group_8__0__Impl rule__AddressNetworkProperty__Group_8__1 ;
    public final void rule__AddressNetworkProperty__Group_8__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2273:1: ( rule__AddressNetworkProperty__Group_8__0__Impl rule__AddressNetworkProperty__Group_8__1 )
            // InternalDeviceParser.g:2274:2: rule__AddressNetworkProperty__Group_8__0__Impl rule__AddressNetworkProperty__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__AddressNetworkProperty__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_8__0"


    // $ANTLR start "rule__AddressNetworkProperty__Group_8__0__Impl"
    // InternalDeviceParser.g:2281:1: rule__AddressNetworkProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__AddressNetworkProperty__Group_8__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2285:1: ( ( Value ) )
            // InternalDeviceParser.g:2286:1: ( Value )
            {
            // InternalDeviceParser.g:2286:1: ( Value )
            // InternalDeviceParser.g:2287:2: Value
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_8_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_8_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_8__0__Impl"


    // $ANTLR start "rule__AddressNetworkProperty__Group_8__1"
    // InternalDeviceParser.g:2296:1: rule__AddressNetworkProperty__Group_8__1 : rule__AddressNetworkProperty__Group_8__1__Impl ;
    public final void rule__AddressNetworkProperty__Group_8__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2300:1: ( rule__AddressNetworkProperty__Group_8__1__Impl )
            // InternalDeviceParser.g:2301:2: rule__AddressNetworkProperty__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_8__1"


    // $ANTLR start "rule__AddressNetworkProperty__Group_8__1__Impl"
    // InternalDeviceParser.g:2307:1: rule__AddressNetworkProperty__Group_8__1__Impl : ( ( rule__AddressNetworkProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__AddressNetworkProperty__Group_8__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2311:1: ( ( ( rule__AddressNetworkProperty__ValueAssignment_8_1 ) ) )
            // InternalDeviceParser.g:2312:1: ( ( rule__AddressNetworkProperty__ValueAssignment_8_1 ) )
            {
            // InternalDeviceParser.g:2312:1: ( ( rule__AddressNetworkProperty__ValueAssignment_8_1 ) )
            // InternalDeviceParser.g:2313:2: ( rule__AddressNetworkProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValueAssignment_8_1());
            // InternalDeviceParser.g:2314:2: ( rule__AddressNetworkProperty__ValueAssignment_8_1 )
            // InternalDeviceParser.g:2314:3: rule__AddressNetworkProperty__ValueAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__AddressNetworkProperty__ValueAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getValueAssignment_8_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__Group_8__1__Impl"


    // $ANTLR start "rule__DeviceType_Impl__Group__0"
    // InternalDeviceParser.g:2323:1: rule__DeviceType_Impl__Group__0 : rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 ;
    public final void rule__DeviceType_Impl__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2327:1: ( rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1 )
            // InternalDeviceParser.g:2328:2: rule__DeviceType_Impl__Group__0__Impl rule__DeviceType_Impl__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDeviceParser.g:2335:1: rule__DeviceType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__DeviceType_Impl__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2339:1: ( ( () ) )
            // InternalDeviceParser.g:2340:1: ( () )
            {
            // InternalDeviceParser.g:2340:1: ( () )
            // InternalDeviceParser.g:2341:2: ()
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0());
            // InternalDeviceParser.g:2342:2: ()
            // InternalDeviceParser.g:2342:3:
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
    // InternalDeviceParser.g:2350:1: rule__DeviceType_Impl__Group__1 : rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 ;
    public final void rule__DeviceType_Impl__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2354:1: ( rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2 )
            // InternalDeviceParser.g:2355:2: rule__DeviceType_Impl__Group__1__Impl rule__DeviceType_Impl__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:2362:1: rule__DeviceType_Impl__Group__1__Impl : ( DeviceType ) ;
    public final void rule__DeviceType_Impl__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2366:1: ( ( DeviceType ) )
            // InternalDeviceParser.g:2367:1: ( DeviceType )
            {
            // InternalDeviceParser.g:2367:1: ( DeviceType )
            // InternalDeviceParser.g:2368:2: DeviceType
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
    // InternalDeviceParser.g:2377:1: rule__DeviceType_Impl__Group__2 : rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 ;
    public final void rule__DeviceType_Impl__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2381:1: ( rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3 )
            // InternalDeviceParser.g:2382:2: rule__DeviceType_Impl__Group__2__Impl rule__DeviceType_Impl__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:2389:1: rule__DeviceType_Impl__Group__2__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2393:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2394:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2394:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2395:2: RULE_INDENT
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
    // InternalDeviceParser.g:2404:1: rule__DeviceType_Impl__Group__3 : rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 ;
    public final void rule__DeviceType_Impl__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2408:1: ( rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4 )
            // InternalDeviceParser.g:2409:2: rule__DeviceType_Impl__Group__3__Impl rule__DeviceType_Impl__Group__4
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
    // InternalDeviceParser.g:2416:1: rule__DeviceType_Impl__Group__3__Impl : ( Name ) ;
    public final void rule__DeviceType_Impl__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2420:1: ( ( Name ) )
            // InternalDeviceParser.g:2421:1: ( Name )
            {
            // InternalDeviceParser.g:2421:1: ( Name )
            // InternalDeviceParser.g:2422:2: Name
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
    // InternalDeviceParser.g:2431:1: rule__DeviceType_Impl__Group__4 : rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 ;
    public final void rule__DeviceType_Impl__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2435:1: ( rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5 )
            // InternalDeviceParser.g:2436:2: rule__DeviceType_Impl__Group__4__Impl rule__DeviceType_Impl__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalDeviceParser.g:2443:1: rule__DeviceType_Impl__Group__4__Impl : ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) ;
    public final void rule__DeviceType_Impl__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2447:1: ( ( ( rule__DeviceType_Impl__NameAssignment_4 ) ) )
            // InternalDeviceParser.g:2448:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            {
            // InternalDeviceParser.g:2448:1: ( ( rule__DeviceType_Impl__NameAssignment_4 ) )
            // InternalDeviceParser.g:2449:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getNameAssignment_4());
            // InternalDeviceParser.g:2450:2: ( rule__DeviceType_Impl__NameAssignment_4 )
            // InternalDeviceParser.g:2450:3: rule__DeviceType_Impl__NameAssignment_4
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
    // InternalDeviceParser.g:2458:1: rule__DeviceType_Impl__Group__5 : rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 ;
    public final void rule__DeviceType_Impl__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2462:1: ( rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6 )
            // InternalDeviceParser.g:2463:2: rule__DeviceType_Impl__Group__5__Impl rule__DeviceType_Impl__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalDeviceParser.g:2470:1: rule__DeviceType_Impl__Group__5__Impl : ( ( rule__DeviceType_Impl__Group_5__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2474:1: ( ( ( rule__DeviceType_Impl__Group_5__0 )? ) )
            // InternalDeviceParser.g:2475:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            {
            // InternalDeviceParser.g:2475:1: ( ( rule__DeviceType_Impl__Group_5__0 )? )
            // InternalDeviceParser.g:2476:2: ( rule__DeviceType_Impl__Group_5__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_5());
            // InternalDeviceParser.g:2477:2: ( rule__DeviceType_Impl__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==DeviceProperty) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDeviceParser.g:2477:3: rule__DeviceType_Impl__Group_5__0
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
    // InternalDeviceParser.g:2485:1: rule__DeviceType_Impl__Group__6 : rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 ;
    public final void rule__DeviceType_Impl__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2489:1: ( rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7 )
            // InternalDeviceParser.g:2490:2: rule__DeviceType_Impl__Group__6__Impl rule__DeviceType_Impl__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalDeviceParser.g:2497:1: rule__DeviceType_Impl__Group__6__Impl : ( ( rule__DeviceType_Impl__Group_6__0 )? ) ;
    public final void rule__DeviceType_Impl__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2501:1: ( ( ( rule__DeviceType_Impl__Group_6__0 )? ) )
            // InternalDeviceParser.g:2502:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            {
            // InternalDeviceParser.g:2502:1: ( ( rule__DeviceType_Impl__Group_6__0 )? )
            // InternalDeviceParser.g:2503:2: ( rule__DeviceType_Impl__Group_6__0 )?
            {
             before(grammarAccess.getDeviceType_ImplAccess().getGroup_6());
            // InternalDeviceParser.g:2504:2: ( rule__DeviceType_Impl__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CommunicationConnection) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDeviceParser.g:2504:3: rule__DeviceType_Impl__Group_6__0
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
    // InternalDeviceParser.g:2512:1: rule__DeviceType_Impl__Group__7 : rule__DeviceType_Impl__Group__7__Impl ;
    public final void rule__DeviceType_Impl__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2516:1: ( rule__DeviceType_Impl__Group__7__Impl )
            // InternalDeviceParser.g:2517:2: rule__DeviceType_Impl__Group__7__Impl
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
    // InternalDeviceParser.g:2523:1: rule__DeviceType_Impl__Group__7__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2527:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2528:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2528:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2529:2: RULE_DEDENT
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
    // InternalDeviceParser.g:2539:1: rule__DeviceType_Impl__Group_5__0 : rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 ;
    public final void rule__DeviceType_Impl__Group_5__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2543:1: ( rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1 )
            // InternalDeviceParser.g:2544:2: rule__DeviceType_Impl__Group_5__0__Impl rule__DeviceType_Impl__Group_5__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:2551:1: rule__DeviceType_Impl__Group_5__0__Impl : ( DeviceProperty ) ;
    public final void rule__DeviceType_Impl__Group_5__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2555:1: ( ( DeviceProperty ) )
            // InternalDeviceParser.g:2556:1: ( DeviceProperty )
            {
            // InternalDeviceParser.g:2556:1: ( DeviceProperty )
            // InternalDeviceParser.g:2557:2: DeviceProperty
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyKeyword_5_0());
            match(input,DeviceProperty,FOLLOW_2);
             after(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyKeyword_5_0());

            }


            }

        }
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
    // InternalDeviceParser.g:2566:1: rule__DeviceType_Impl__Group_5__1 : rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 ;
    public final void rule__DeviceType_Impl__Group_5__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2570:1: ( rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2 )
            // InternalDeviceParser.g:2571:2: rule__DeviceType_Impl__Group_5__1__Impl rule__DeviceType_Impl__Group_5__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:2578:1: rule__DeviceType_Impl__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2582:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2583:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2583:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2584:2: RULE_INDENT
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
    // InternalDeviceParser.g:2593:1: rule__DeviceType_Impl__Group_5__2 : rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 ;
    public final void rule__DeviceType_Impl__Group_5__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2597:1: ( rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3 )
            // InternalDeviceParser.g:2598:2: rule__DeviceType_Impl__Group_5__2__Impl rule__DeviceType_Impl__Group_5__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDeviceParser.g:2605:1: rule__DeviceType_Impl__Group_5__2__Impl : ( ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_5__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2609:1: ( ( ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )* ) ) )
            // InternalDeviceParser.g:2610:1: ( ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )* ) )
            {
            // InternalDeviceParser.g:2610:1: ( ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )* ) )
            // InternalDeviceParser.g:2611:2: ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 ) ) ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )* )
            {
            // InternalDeviceParser.g:2611:2: ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 ) )
            // InternalDeviceParser.g:2612:3: ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyAssignment_5_2());
            // InternalDeviceParser.g:2613:3: ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )
            // InternalDeviceParser.g:2613:4: rule__DeviceType_Impl__DevicePropertyAssignment_5_2
            {
            pushFollow(FOLLOW_19);
            rule__DeviceType_Impl__DevicePropertyAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyAssignment_5_2());

            }

            // InternalDeviceParser.g:2616:2: ( ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )* )
            // InternalDeviceParser.g:2617:3: ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyAssignment_5_2());
            // InternalDeviceParser.g:2618:3: ( rule__DeviceType_Impl__DevicePropertyAssignment_5_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==HyphenMinus) ) {
                    alt18=1;
                }


                switch (alt18) {
                case 1 :
                    // InternalDeviceParser.g:2618:4: rule__DeviceType_Impl__DevicePropertyAssignment_5_2
                    {
                    pushFollow(FOLLOW_19);
                    rule__DeviceType_Impl__DevicePropertyAssignment_5_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop18;
                }
            } while (true);

             after(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyAssignment_5_2());

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
    // InternalDeviceParser.g:2627:1: rule__DeviceType_Impl__Group_5__3 : rule__DeviceType_Impl__Group_5__3__Impl ;
    public final void rule__DeviceType_Impl__Group_5__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2631:1: ( rule__DeviceType_Impl__Group_5__3__Impl )
            // InternalDeviceParser.g:2632:2: rule__DeviceType_Impl__Group_5__3__Impl
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
    // InternalDeviceParser.g:2638:1: rule__DeviceType_Impl__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_5__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2642:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2643:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2643:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2644:2: RULE_DEDENT
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
    // InternalDeviceParser.g:2654:1: rule__DeviceType_Impl__Group_6__0 : rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 ;
    public final void rule__DeviceType_Impl__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2658:1: ( rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1 )
            // InternalDeviceParser.g:2659:2: rule__DeviceType_Impl__Group_6__0__Impl rule__DeviceType_Impl__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:2666:1: rule__DeviceType_Impl__Group_6__0__Impl : ( CommunicationConnection ) ;
    public final void rule__DeviceType_Impl__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2670:1: ( ( CommunicationConnection ) )
            // InternalDeviceParser.g:2671:1: ( CommunicationConnection )
            {
            // InternalDeviceParser.g:2671:1: ( CommunicationConnection )
            // InternalDeviceParser.g:2672:2: CommunicationConnection
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
    // InternalDeviceParser.g:2681:1: rule__DeviceType_Impl__Group_6__1 : rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 ;
    public final void rule__DeviceType_Impl__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2685:1: ( rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2 )
            // InternalDeviceParser.g:2686:2: rule__DeviceType_Impl__Group_6__1__Impl rule__DeviceType_Impl__Group_6__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:2693:1: rule__DeviceType_Impl__Group_6__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2697:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2698:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2698:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2699:2: RULE_INDENT
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
    // InternalDeviceParser.g:2708:1: rule__DeviceType_Impl__Group_6__2 : rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 ;
    public final void rule__DeviceType_Impl__Group_6__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2712:1: ( rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3 )
            // InternalDeviceParser.g:2713:2: rule__DeviceType_Impl__Group_6__2__Impl rule__DeviceType_Impl__Group_6__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDeviceParser.g:2720:1: rule__DeviceType_Impl__Group_6__2__Impl : ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) ;
    public final void rule__DeviceType_Impl__Group_6__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2724:1: ( ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) ) )
            // InternalDeviceParser.g:2725:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            {
            // InternalDeviceParser.g:2725:1: ( ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* ) )
            // InternalDeviceParser.g:2726:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) ) ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            {
            // InternalDeviceParser.g:2726:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 ) )
            // InternalDeviceParser.g:2727:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2());
            // InternalDeviceParser.g:2728:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )
            // InternalDeviceParser.g:2728:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
            {
            pushFollow(FOLLOW_19);
            rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2());

            }

            // InternalDeviceParser.g:2731:2: ( ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )* )
            // InternalDeviceParser.g:2732:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            {
             before(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAssignment_6_2());
            // InternalDeviceParser.g:2733:3: ( rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==HyphenMinus) ) {
                    alt19=1;
                }


                switch (alt19) {
                case 1 :
                    // InternalDeviceParser.g:2733:4: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2
                    {
                    pushFollow(FOLLOW_19);
                    rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop19;
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
    // InternalDeviceParser.g:2742:1: rule__DeviceType_Impl__Group_6__3 : rule__DeviceType_Impl__Group_6__3__Impl ;
    public final void rule__DeviceType_Impl__Group_6__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2746:1: ( rule__DeviceType_Impl__Group_6__3__Impl )
            // InternalDeviceParser.g:2747:2: rule__DeviceType_Impl__Group_6__3__Impl
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
    // InternalDeviceParser.g:2753:1: rule__DeviceType_Impl__Group_6__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceType_Impl__Group_6__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2757:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:2758:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:2758:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:2759:2: RULE_DEDENT
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


    // $ANTLR start "rule__DeviceProperty__Group__0"
    // InternalDeviceParser.g:2769:1: rule__DeviceProperty__Group__0 : rule__DeviceProperty__Group__0__Impl rule__DeviceProperty__Group__1 ;
    public final void rule__DeviceProperty__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2773:1: ( rule__DeviceProperty__Group__0__Impl rule__DeviceProperty__Group__1 )
            // InternalDeviceParser.g:2774:2: rule__DeviceProperty__Group__0__Impl rule__DeviceProperty__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DeviceProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__0"


    // $ANTLR start "rule__DeviceProperty__Group__0__Impl"
    // InternalDeviceParser.g:2781:1: rule__DeviceProperty__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__DeviceProperty__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2785:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:2786:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:2786:1: ( rulePreListElement )
            // InternalDeviceParser.g:2787:2: rulePreListElement
            {
             before(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__0__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__1"
    // InternalDeviceParser.g:2796:1: rule__DeviceProperty__Group__1 : rule__DeviceProperty__Group__1__Impl rule__DeviceProperty__Group__2 ;
    public final void rule__DeviceProperty__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2800:1: ( rule__DeviceProperty__Group__1__Impl rule__DeviceProperty__Group__2 )
            // InternalDeviceParser.g:2801:2: rule__DeviceProperty__Group__1__Impl rule__DeviceProperty__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DeviceProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__1"


    // $ANTLR start "rule__DeviceProperty__Group__1__Impl"
    // InternalDeviceParser.g:2808:1: rule__DeviceProperty__Group__1__Impl : ( Name ) ;
    public final void rule__DeviceProperty__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2812:1: ( ( Name ) )
            // InternalDeviceParser.g:2813:1: ( Name )
            {
            // InternalDeviceParser.g:2813:1: ( Name )
            // InternalDeviceParser.g:2814:2: Name
            {
             before(grammarAccess.getDevicePropertyAccess().getNameKeyword_1());
            match(input,Name,FOLLOW_2);
             after(grammarAccess.getDevicePropertyAccess().getNameKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__1__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__2"
    // InternalDeviceParser.g:2823:1: rule__DeviceProperty__Group__2 : rule__DeviceProperty__Group__2__Impl rule__DeviceProperty__Group__3 ;
    public final void rule__DeviceProperty__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2827:1: ( rule__DeviceProperty__Group__2__Impl rule__DeviceProperty__Group__3 )
            // InternalDeviceParser.g:2828:2: rule__DeviceProperty__Group__2__Impl rule__DeviceProperty__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__DeviceProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__2"


    // $ANTLR start "rule__DeviceProperty__Group__2__Impl"
    // InternalDeviceParser.g:2835:1: rule__DeviceProperty__Group__2__Impl : ( ( rule__DeviceProperty__NameAssignment_2 ) ) ;
    public final void rule__DeviceProperty__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2839:1: ( ( ( rule__DeviceProperty__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:2840:1: ( ( rule__DeviceProperty__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:2840:1: ( ( rule__DeviceProperty__NameAssignment_2 ) )
            // InternalDeviceParser.g:2841:2: ( rule__DeviceProperty__NameAssignment_2 )
            {
             before(grammarAccess.getDevicePropertyAccess().getNameAssignment_2());
            // InternalDeviceParser.g:2842:2: ( rule__DeviceProperty__NameAssignment_2 )
            // InternalDeviceParser.g:2842:3: rule__DeviceProperty__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDevicePropertyAccess().getNameAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__2__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__3"
    // InternalDeviceParser.g:2850:1: rule__DeviceProperty__Group__3 : rule__DeviceProperty__Group__3__Impl rule__DeviceProperty__Group__4 ;
    public final void rule__DeviceProperty__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2854:1: ( rule__DeviceProperty__Group__3__Impl rule__DeviceProperty__Group__4 )
            // InternalDeviceParser.g:2855:2: rule__DeviceProperty__Group__3__Impl rule__DeviceProperty__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__DeviceProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__3"


    // $ANTLR start "rule__DeviceProperty__Group__3__Impl"
    // InternalDeviceParser.g:2862:1: rule__DeviceProperty__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceProperty__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2866:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:2867:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:2867:1: ( RULE_INDENT )
            // InternalDeviceParser.g:2868:2: RULE_INDENT
            {
             before(grammarAccess.getDevicePropertyAccess().getINDENTTerminalRuleCall_3());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getDevicePropertyAccess().getINDENTTerminalRuleCall_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__3__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__4"
    // InternalDeviceParser.g:2877:1: rule__DeviceProperty__Group__4 : rule__DeviceProperty__Group__4__Impl rule__DeviceProperty__Group__5 ;
    public final void rule__DeviceProperty__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2881:1: ( rule__DeviceProperty__Group__4__Impl rule__DeviceProperty__Group__5 )
            // InternalDeviceParser.g:2882:2: rule__DeviceProperty__Group__4__Impl rule__DeviceProperty__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__DeviceProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__4"


    // $ANTLR start "rule__DeviceProperty__Group__4__Impl"
    // InternalDeviceParser.g:2889:1: rule__DeviceProperty__Group__4__Impl : ( Kind ) ;
    public final void rule__DeviceProperty__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2893:1: ( ( Kind ) )
            // InternalDeviceParser.g:2894:1: ( Kind )
            {
            // InternalDeviceParser.g:2894:1: ( Kind )
            // InternalDeviceParser.g:2895:2: Kind
            {
             before(grammarAccess.getDevicePropertyAccess().getKindKeyword_4());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getDevicePropertyAccess().getKindKeyword_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__4__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__5"
    // InternalDeviceParser.g:2904:1: rule__DeviceProperty__Group__5 : rule__DeviceProperty__Group__5__Impl rule__DeviceProperty__Group__6 ;
    public final void rule__DeviceProperty__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2908:1: ( rule__DeviceProperty__Group__5__Impl rule__DeviceProperty__Group__6 )
            // InternalDeviceParser.g:2909:2: rule__DeviceProperty__Group__5__Impl rule__DeviceProperty__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__DeviceProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__5"


    // $ANTLR start "rule__DeviceProperty__Group__5__Impl"
    // InternalDeviceParser.g:2916:1: rule__DeviceProperty__Group__5__Impl : ( ( rule__DeviceProperty__KindAssignment_5 ) ) ;
    public final void rule__DeviceProperty__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2920:1: ( ( ( rule__DeviceProperty__KindAssignment_5 ) ) )
            // InternalDeviceParser.g:2921:1: ( ( rule__DeviceProperty__KindAssignment_5 ) )
            {
            // InternalDeviceParser.g:2921:1: ( ( rule__DeviceProperty__KindAssignment_5 ) )
            // InternalDeviceParser.g:2922:2: ( rule__DeviceProperty__KindAssignment_5 )
            {
             before(grammarAccess.getDevicePropertyAccess().getKindAssignment_5());
            // InternalDeviceParser.g:2923:2: ( rule__DeviceProperty__KindAssignment_5 )
            // InternalDeviceParser.g:2923:3: rule__DeviceProperty__KindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__KindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDevicePropertyAccess().getKindAssignment_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__5__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__6"
    // InternalDeviceParser.g:2931:1: rule__DeviceProperty__Group__6 : rule__DeviceProperty__Group__6__Impl rule__DeviceProperty__Group__7 ;
    public final void rule__DeviceProperty__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2935:1: ( rule__DeviceProperty__Group__6__Impl rule__DeviceProperty__Group__7 )
            // InternalDeviceParser.g:2936:2: rule__DeviceProperty__Group__6__Impl rule__DeviceProperty__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__DeviceProperty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__6"


    // $ANTLR start "rule__DeviceProperty__Group__6__Impl"
    // InternalDeviceParser.g:2943:1: rule__DeviceProperty__Group__6__Impl : ( Type ) ;
    public final void rule__DeviceProperty__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2947:1: ( ( Type ) )
            // InternalDeviceParser.g:2948:1: ( Type )
            {
            // InternalDeviceParser.g:2948:1: ( Type )
            // InternalDeviceParser.g:2949:2: Type
            {
             before(grammarAccess.getDevicePropertyAccess().getTypeKeyword_6());
            match(input,Type,FOLLOW_2);
             after(grammarAccess.getDevicePropertyAccess().getTypeKeyword_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__6__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__7"
    // InternalDeviceParser.g:2958:1: rule__DeviceProperty__Group__7 : rule__DeviceProperty__Group__7__Impl rule__DeviceProperty__Group__8 ;
    public final void rule__DeviceProperty__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2962:1: ( rule__DeviceProperty__Group__7__Impl rule__DeviceProperty__Group__8 )
            // InternalDeviceParser.g:2963:2: rule__DeviceProperty__Group__7__Impl rule__DeviceProperty__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__DeviceProperty__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__7"


    // $ANTLR start "rule__DeviceProperty__Group__7__Impl"
    // InternalDeviceParser.g:2970:1: rule__DeviceProperty__Group__7__Impl : ( ( rule__DeviceProperty__TypeAssignment_7 ) ) ;
    public final void rule__DeviceProperty__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2974:1: ( ( ( rule__DeviceProperty__TypeAssignment_7 ) ) )
            // InternalDeviceParser.g:2975:1: ( ( rule__DeviceProperty__TypeAssignment_7 ) )
            {
            // InternalDeviceParser.g:2975:1: ( ( rule__DeviceProperty__TypeAssignment_7 ) )
            // InternalDeviceParser.g:2976:2: ( rule__DeviceProperty__TypeAssignment_7 )
            {
             before(grammarAccess.getDevicePropertyAccess().getTypeAssignment_7());
            // InternalDeviceParser.g:2977:2: ( rule__DeviceProperty__TypeAssignment_7 )
            // InternalDeviceParser.g:2977:3: rule__DeviceProperty__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDevicePropertyAccess().getTypeAssignment_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__7__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__8"
    // InternalDeviceParser.g:2985:1: rule__DeviceProperty__Group__8 : rule__DeviceProperty__Group__8__Impl rule__DeviceProperty__Group__9 ;
    public final void rule__DeviceProperty__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:2989:1: ( rule__DeviceProperty__Group__8__Impl rule__DeviceProperty__Group__9 )
            // InternalDeviceParser.g:2990:2: rule__DeviceProperty__Group__8__Impl rule__DeviceProperty__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__DeviceProperty__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__8"


    // $ANTLR start "rule__DeviceProperty__Group__8__Impl"
    // InternalDeviceParser.g:2997:1: rule__DeviceProperty__Group__8__Impl : ( ( rule__DeviceProperty__Group_8__0 )? ) ;
    public final void rule__DeviceProperty__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3001:1: ( ( ( rule__DeviceProperty__Group_8__0 )? ) )
            // InternalDeviceParser.g:3002:1: ( ( rule__DeviceProperty__Group_8__0 )? )
            {
            // InternalDeviceParser.g:3002:1: ( ( rule__DeviceProperty__Group_8__0 )? )
            // InternalDeviceParser.g:3003:2: ( rule__DeviceProperty__Group_8__0 )?
            {
             before(grammarAccess.getDevicePropertyAccess().getGroup_8());
            // InternalDeviceParser.g:3004:2: ( rule__DeviceProperty__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Description) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDeviceParser.g:3004:3: rule__DeviceProperty__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceProperty__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDevicePropertyAccess().getGroup_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__8__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__9"
    // InternalDeviceParser.g:3012:1: rule__DeviceProperty__Group__9 : rule__DeviceProperty__Group__9__Impl rule__DeviceProperty__Group__10 ;
    public final void rule__DeviceProperty__Group__9() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3016:1: ( rule__DeviceProperty__Group__9__Impl rule__DeviceProperty__Group__10 )
            // InternalDeviceParser.g:3017:2: rule__DeviceProperty__Group__9__Impl rule__DeviceProperty__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__DeviceProperty__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__9"


    // $ANTLR start "rule__DeviceProperty__Group__9__Impl"
    // InternalDeviceParser.g:3024:1: rule__DeviceProperty__Group__9__Impl : ( ( rule__DeviceProperty__Group_9__0 )? ) ;
    public final void rule__DeviceProperty__Group__9__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3028:1: ( ( ( rule__DeviceProperty__Group_9__0 )? ) )
            // InternalDeviceParser.g:3029:1: ( ( rule__DeviceProperty__Group_9__0 )? )
            {
            // InternalDeviceParser.g:3029:1: ( ( rule__DeviceProperty__Group_9__0 )? )
            // InternalDeviceParser.g:3030:2: ( rule__DeviceProperty__Group_9__0 )?
            {
             before(grammarAccess.getDevicePropertyAccess().getGroup_9());
            // InternalDeviceParser.g:3031:2: ( rule__DeviceProperty__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Value) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeviceParser.g:3031:3: rule__DeviceProperty__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeviceProperty__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDevicePropertyAccess().getGroup_9());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__9__Impl"


    // $ANTLR start "rule__DeviceProperty__Group__10"
    // InternalDeviceParser.g:3039:1: rule__DeviceProperty__Group__10 : rule__DeviceProperty__Group__10__Impl ;
    public final void rule__DeviceProperty__Group__10() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3043:1: ( rule__DeviceProperty__Group__10__Impl )
            // InternalDeviceParser.g:3044:2: rule__DeviceProperty__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__10"


    // $ANTLR start "rule__DeviceProperty__Group__10__Impl"
    // InternalDeviceParser.g:3050:1: rule__DeviceProperty__Group__10__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceProperty__Group__10__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3054:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3055:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3055:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3056:2: RULE_DEDENT
            {
             before(grammarAccess.getDevicePropertyAccess().getDEDENTTerminalRuleCall_10());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getDevicePropertyAccess().getDEDENTTerminalRuleCall_10());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group__10__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_8__0"
    // InternalDeviceParser.g:3066:1: rule__DeviceProperty__Group_8__0 : rule__DeviceProperty__Group_8__0__Impl rule__DeviceProperty__Group_8__1 ;
    public final void rule__DeviceProperty__Group_8__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3070:1: ( rule__DeviceProperty__Group_8__0__Impl rule__DeviceProperty__Group_8__1 )
            // InternalDeviceParser.g:3071:2: rule__DeviceProperty__Group_8__0__Impl rule__DeviceProperty__Group_8__1
            {
            pushFollow(FOLLOW_13);
            rule__DeviceProperty__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_8__0"


    // $ANTLR start "rule__DeviceProperty__Group_8__0__Impl"
    // InternalDeviceParser.g:3078:1: rule__DeviceProperty__Group_8__0__Impl : ( Description ) ;
    public final void rule__DeviceProperty__Group_8__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3082:1: ( ( Description ) )
            // InternalDeviceParser.g:3083:1: ( Description )
            {
            // InternalDeviceParser.g:3083:1: ( Description )
            // InternalDeviceParser.g:3084:2: Description
            {
             before(grammarAccess.getDevicePropertyAccess().getDescriptionKeyword_8_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getDevicePropertyAccess().getDescriptionKeyword_8_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_8__0__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_8__1"
    // InternalDeviceParser.g:3093:1: rule__DeviceProperty__Group_8__1 : rule__DeviceProperty__Group_8__1__Impl ;
    public final void rule__DeviceProperty__Group_8__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3097:1: ( rule__DeviceProperty__Group_8__1__Impl )
            // InternalDeviceParser.g:3098:2: rule__DeviceProperty__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_8__1"


    // $ANTLR start "rule__DeviceProperty__Group_8__1__Impl"
    // InternalDeviceParser.g:3104:1: rule__DeviceProperty__Group_8__1__Impl : ( ( rule__DeviceProperty__DescriptionAssignment_8_1 ) ) ;
    public final void rule__DeviceProperty__Group_8__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3108:1: ( ( ( rule__DeviceProperty__DescriptionAssignment_8_1 ) ) )
            // InternalDeviceParser.g:3109:1: ( ( rule__DeviceProperty__DescriptionAssignment_8_1 ) )
            {
            // InternalDeviceParser.g:3109:1: ( ( rule__DeviceProperty__DescriptionAssignment_8_1 ) )
            // InternalDeviceParser.g:3110:2: ( rule__DeviceProperty__DescriptionAssignment_8_1 )
            {
             before(grammarAccess.getDevicePropertyAccess().getDescriptionAssignment_8_1());
            // InternalDeviceParser.g:3111:2: ( rule__DeviceProperty__DescriptionAssignment_8_1 )
            // InternalDeviceParser.g:3111:3: rule__DeviceProperty__DescriptionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__DescriptionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDevicePropertyAccess().getDescriptionAssignment_8_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_8__1__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_9__0"
    // InternalDeviceParser.g:3120:1: rule__DeviceProperty__Group_9__0 : rule__DeviceProperty__Group_9__0__Impl rule__DeviceProperty__Group_9__1 ;
    public final void rule__DeviceProperty__Group_9__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3124:1: ( rule__DeviceProperty__Group_9__0__Impl rule__DeviceProperty__Group_9__1 )
            // InternalDeviceParser.g:3125:2: rule__DeviceProperty__Group_9__0__Impl rule__DeviceProperty__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__DeviceProperty__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__0"


    // $ANTLR start "rule__DeviceProperty__Group_9__0__Impl"
    // InternalDeviceParser.g:3132:1: rule__DeviceProperty__Group_9__0__Impl : ( Value ) ;
    public final void rule__DeviceProperty__Group_9__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3136:1: ( ( Value ) )
            // InternalDeviceParser.g:3137:1: ( Value )
            {
            // InternalDeviceParser.g:3137:1: ( Value )
            // InternalDeviceParser.g:3138:2: Value
            {
             before(grammarAccess.getDevicePropertyAccess().getValueKeyword_9_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getDevicePropertyAccess().getValueKeyword_9_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__0__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_9__1"
    // InternalDeviceParser.g:3147:1: rule__DeviceProperty__Group_9__1 : rule__DeviceProperty__Group_9__1__Impl rule__DeviceProperty__Group_9__2 ;
    public final void rule__DeviceProperty__Group_9__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3151:1: ( rule__DeviceProperty__Group_9__1__Impl rule__DeviceProperty__Group_9__2 )
            // InternalDeviceParser.g:3152:2: rule__DeviceProperty__Group_9__1__Impl rule__DeviceProperty__Group_9__2
            {
            pushFollow(FOLLOW_6);
            rule__DeviceProperty__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__1"


    // $ANTLR start "rule__DeviceProperty__Group_9__1__Impl"
    // InternalDeviceParser.g:3159:1: rule__DeviceProperty__Group_9__1__Impl : ( RULE_INDENT ) ;
    public final void rule__DeviceProperty__Group_9__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3163:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3164:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3164:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3165:2: RULE_INDENT
            {
             before(grammarAccess.getDevicePropertyAccess().getINDENTTerminalRuleCall_9_1());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getDevicePropertyAccess().getINDENTTerminalRuleCall_9_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__1__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_9__2"
    // InternalDeviceParser.g:3174:1: rule__DeviceProperty__Group_9__2 : rule__DeviceProperty__Group_9__2__Impl rule__DeviceProperty__Group_9__3 ;
    public final void rule__DeviceProperty__Group_9__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3178:1: ( rule__DeviceProperty__Group_9__2__Impl rule__DeviceProperty__Group_9__3 )
            // InternalDeviceParser.g:3179:2: rule__DeviceProperty__Group_9__2__Impl rule__DeviceProperty__Group_9__3
            {
            pushFollow(FOLLOW_14);
            rule__DeviceProperty__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__2"


    // $ANTLR start "rule__DeviceProperty__Group_9__2__Impl"
    // InternalDeviceParser.g:3186:1: rule__DeviceProperty__Group_9__2__Impl : ( rulePreListElement ) ;
    public final void rule__DeviceProperty__Group_9__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3190:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:3191:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:3191:1: ( rulePreListElement )
            // InternalDeviceParser.g:3192:2: rulePreListElement
            {
             before(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_9_2());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_9_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__2__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_9__3"
    // InternalDeviceParser.g:3201:1: rule__DeviceProperty__Group_9__3 : rule__DeviceProperty__Group_9__3__Impl rule__DeviceProperty__Group_9__4 ;
    public final void rule__DeviceProperty__Group_9__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3205:1: ( rule__DeviceProperty__Group_9__3__Impl rule__DeviceProperty__Group_9__4 )
            // InternalDeviceParser.g:3206:2: rule__DeviceProperty__Group_9__3__Impl rule__DeviceProperty__Group_9__4
            {
            pushFollow(FOLLOW_23);
            rule__DeviceProperty__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__3"


    // $ANTLR start "rule__DeviceProperty__Group_9__3__Impl"
    // InternalDeviceParser.g:3213:1: rule__DeviceProperty__Group_9__3__Impl : ( ( rule__DeviceProperty__ValueAssignment_9_3 ) ) ;
    public final void rule__DeviceProperty__Group_9__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3217:1: ( ( ( rule__DeviceProperty__ValueAssignment_9_3 ) ) )
            // InternalDeviceParser.g:3218:1: ( ( rule__DeviceProperty__ValueAssignment_9_3 ) )
            {
            // InternalDeviceParser.g:3218:1: ( ( rule__DeviceProperty__ValueAssignment_9_3 ) )
            // InternalDeviceParser.g:3219:2: ( rule__DeviceProperty__ValueAssignment_9_3 )
            {
             before(grammarAccess.getDevicePropertyAccess().getValueAssignment_9_3());
            // InternalDeviceParser.g:3220:2: ( rule__DeviceProperty__ValueAssignment_9_3 )
            // InternalDeviceParser.g:3220:3: rule__DeviceProperty__ValueAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__ValueAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getDevicePropertyAccess().getValueAssignment_9_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__3__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_9__4"
    // InternalDeviceParser.g:3228:1: rule__DeviceProperty__Group_9__4 : rule__DeviceProperty__Group_9__4__Impl rule__DeviceProperty__Group_9__5 ;
    public final void rule__DeviceProperty__Group_9__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3232:1: ( rule__DeviceProperty__Group_9__4__Impl rule__DeviceProperty__Group_9__5 )
            // InternalDeviceParser.g:3233:2: rule__DeviceProperty__Group_9__4__Impl rule__DeviceProperty__Group_9__5
            {
            pushFollow(FOLLOW_23);
            rule__DeviceProperty__Group_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_9__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__4"


    // $ANTLR start "rule__DeviceProperty__Group_9__4__Impl"
    // InternalDeviceParser.g:3240:1: rule__DeviceProperty__Group_9__4__Impl : ( ( rule__DeviceProperty__Group_9_4__0 )* ) ;
    public final void rule__DeviceProperty__Group_9__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3244:1: ( ( ( rule__DeviceProperty__Group_9_4__0 )* ) )
            // InternalDeviceParser.g:3245:1: ( ( rule__DeviceProperty__Group_9_4__0 )* )
            {
            // InternalDeviceParser.g:3245:1: ( ( rule__DeviceProperty__Group_9_4__0 )* )
            // InternalDeviceParser.g:3246:2: ( rule__DeviceProperty__Group_9_4__0 )*
            {
             before(grammarAccess.getDevicePropertyAccess().getGroup_9_4());
            // InternalDeviceParser.g:3247:2: ( rule__DeviceProperty__Group_9_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==HyphenMinus) ) {
                    alt22=1;
                }


                switch (alt22) {
                case 1 :
                    // InternalDeviceParser.g:3247:3: rule__DeviceProperty__Group_9_4__0
                    {
                    pushFollow(FOLLOW_19);
                    rule__DeviceProperty__Group_9_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop22;
                }
            } while (true);

             after(grammarAccess.getDevicePropertyAccess().getGroup_9_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__4__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_9__5"
    // InternalDeviceParser.g:3255:1: rule__DeviceProperty__Group_9__5 : rule__DeviceProperty__Group_9__5__Impl ;
    public final void rule__DeviceProperty__Group_9__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3259:1: ( rule__DeviceProperty__Group_9__5__Impl )
            // InternalDeviceParser.g:3260:2: rule__DeviceProperty__Group_9__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_9__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__5"


    // $ANTLR start "rule__DeviceProperty__Group_9__5__Impl"
    // InternalDeviceParser.g:3266:1: rule__DeviceProperty__Group_9__5__Impl : ( RULE_DEDENT ) ;
    public final void rule__DeviceProperty__Group_9__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3270:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3271:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3271:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3272:2: RULE_DEDENT
            {
             before(grammarAccess.getDevicePropertyAccess().getDEDENTTerminalRuleCall_9_5());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getDevicePropertyAccess().getDEDENTTerminalRuleCall_9_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9__5__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_9_4__0"
    // InternalDeviceParser.g:3282:1: rule__DeviceProperty__Group_9_4__0 : rule__DeviceProperty__Group_9_4__0__Impl rule__DeviceProperty__Group_9_4__1 ;
    public final void rule__DeviceProperty__Group_9_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3286:1: ( rule__DeviceProperty__Group_9_4__0__Impl rule__DeviceProperty__Group_9_4__1 )
            // InternalDeviceParser.g:3287:2: rule__DeviceProperty__Group_9_4__0__Impl rule__DeviceProperty__Group_9_4__1
            {
            pushFollow(FOLLOW_14);
            rule__DeviceProperty__Group_9_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_9_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9_4__0"


    // $ANTLR start "rule__DeviceProperty__Group_9_4__0__Impl"
    // InternalDeviceParser.g:3294:1: rule__DeviceProperty__Group_9_4__0__Impl : ( rulePreListElement ) ;
    public final void rule__DeviceProperty__Group_9_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3298:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:3299:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:3299:1: ( rulePreListElement )
            // InternalDeviceParser.g:3300:2: rulePreListElement
            {
             before(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_9_4_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getDevicePropertyAccess().getPreListElementParserRuleCall_9_4_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9_4__0__Impl"


    // $ANTLR start "rule__DeviceProperty__Group_9_4__1"
    // InternalDeviceParser.g:3309:1: rule__DeviceProperty__Group_9_4__1 : rule__DeviceProperty__Group_9_4__1__Impl ;
    public final void rule__DeviceProperty__Group_9_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3313:1: ( rule__DeviceProperty__Group_9_4__1__Impl )
            // InternalDeviceParser.g:3314:2: rule__DeviceProperty__Group_9_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__Group_9_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9_4__1"


    // $ANTLR start "rule__DeviceProperty__Group_9_4__1__Impl"
    // InternalDeviceParser.g:3320:1: rule__DeviceProperty__Group_9_4__1__Impl : ( ( rule__DeviceProperty__ValueAssignment_9_4_1 ) ) ;
    public final void rule__DeviceProperty__Group_9_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3324:1: ( ( ( rule__DeviceProperty__ValueAssignment_9_4_1 ) ) )
            // InternalDeviceParser.g:3325:1: ( ( rule__DeviceProperty__ValueAssignment_9_4_1 ) )
            {
            // InternalDeviceParser.g:3325:1: ( ( rule__DeviceProperty__ValueAssignment_9_4_1 ) )
            // InternalDeviceParser.g:3326:2: ( rule__DeviceProperty__ValueAssignment_9_4_1 )
            {
             before(grammarAccess.getDevicePropertyAccess().getValueAssignment_9_4_1());
            // InternalDeviceParser.g:3327:2: ( rule__DeviceProperty__ValueAssignment_9_4_1 )
            // InternalDeviceParser.g:3327:3: rule__DeviceProperty__ValueAssignment_9_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceProperty__ValueAssignment_9_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDevicePropertyAccess().getValueAssignment_9_4_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__Group_9_4__1__Impl"


    // $ANTLR start "rule__ComputationDeviceType__Group__0"
    // InternalDeviceParser.g:3336:1: rule__ComputationDeviceType__Group__0 : rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 ;
    public final void rule__ComputationDeviceType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3340:1: ( rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1 )
            // InternalDeviceParser.g:3341:2: rule__ComputationDeviceType__Group__0__Impl rule__ComputationDeviceType__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:3348:1: rule__ComputationDeviceType__Group__0__Impl : ( ComputationDeviceType ) ;
    public final void rule__ComputationDeviceType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3352:1: ( ( ComputationDeviceType ) )
            // InternalDeviceParser.g:3353:1: ( ComputationDeviceType )
            {
            // InternalDeviceParser.g:3353:1: ( ComputationDeviceType )
            // InternalDeviceParser.g:3354:2: ComputationDeviceType
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
    // InternalDeviceParser.g:3363:1: rule__ComputationDeviceType__Group__1 : rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 ;
    public final void rule__ComputationDeviceType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3367:1: ( rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2 )
            // InternalDeviceParser.g:3368:2: rule__ComputationDeviceType__Group__1__Impl rule__ComputationDeviceType__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:3375:1: rule__ComputationDeviceType__Group__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3379:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3380:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3380:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3381:2: RULE_INDENT
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
    // InternalDeviceParser.g:3390:1: rule__ComputationDeviceType__Group__2 : rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 ;
    public final void rule__ComputationDeviceType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3394:1: ( rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3 )
            // InternalDeviceParser.g:3395:2: rule__ComputationDeviceType__Group__2__Impl rule__ComputationDeviceType__Group__3
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
    // InternalDeviceParser.g:3402:1: rule__ComputationDeviceType__Group__2__Impl : ( Name ) ;
    public final void rule__ComputationDeviceType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3406:1: ( ( Name ) )
            // InternalDeviceParser.g:3407:1: ( Name )
            {
            // InternalDeviceParser.g:3407:1: ( Name )
            // InternalDeviceParser.g:3408:2: Name
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
    // InternalDeviceParser.g:3417:1: rule__ComputationDeviceType__Group__3 : rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 ;
    public final void rule__ComputationDeviceType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3421:1: ( rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4 )
            // InternalDeviceParser.g:3422:2: rule__ComputationDeviceType__Group__3__Impl rule__ComputationDeviceType__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalDeviceParser.g:3429:1: rule__ComputationDeviceType__Group__3__Impl : ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) ;
    public final void rule__ComputationDeviceType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3433:1: ( ( ( rule__ComputationDeviceType__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:3434:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:3434:1: ( ( rule__ComputationDeviceType__NameAssignment_3 ) )
            // InternalDeviceParser.g:3435:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getNameAssignment_3());
            // InternalDeviceParser.g:3436:2: ( rule__ComputationDeviceType__NameAssignment_3 )
            // InternalDeviceParser.g:3436:3: rule__ComputationDeviceType__NameAssignment_3
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
    // InternalDeviceParser.g:3444:1: rule__ComputationDeviceType__Group__4 : rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 ;
    public final void rule__ComputationDeviceType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3448:1: ( rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5 )
            // InternalDeviceParser.g:3449:2: rule__ComputationDeviceType__Group__4__Impl rule__ComputationDeviceType__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalDeviceParser.g:3456:1: rule__ComputationDeviceType__Group__4__Impl : ( ( rule__ComputationDeviceType__Group_4__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3460:1: ( ( ( rule__ComputationDeviceType__Group_4__0 )? ) )
            // InternalDeviceParser.g:3461:1: ( ( rule__ComputationDeviceType__Group_4__0 )? )
            {
            // InternalDeviceParser.g:3461:1: ( ( rule__ComputationDeviceType__Group_4__0 )? )
            // InternalDeviceParser.g:3462:2: ( rule__ComputationDeviceType__Group_4__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_4());
            // InternalDeviceParser.g:3463:2: ( rule__ComputationDeviceType__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DeviceProperty) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDeviceParser.g:3463:3: rule__ComputationDeviceType__Group_4__0
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
    // InternalDeviceParser.g:3471:1: rule__ComputationDeviceType__Group__5 : rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 ;
    public final void rule__ComputationDeviceType__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3475:1: ( rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6 )
            // InternalDeviceParser.g:3476:2: rule__ComputationDeviceType__Group__5__Impl rule__ComputationDeviceType__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalDeviceParser.g:3483:1: rule__ComputationDeviceType__Group__5__Impl : ( ( rule__ComputationDeviceType__Group_5__0 )? ) ;
    public final void rule__ComputationDeviceType__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3487:1: ( ( ( rule__ComputationDeviceType__Group_5__0 )? ) )
            // InternalDeviceParser.g:3488:1: ( ( rule__ComputationDeviceType__Group_5__0 )? )
            {
            // InternalDeviceParser.g:3488:1: ( ( rule__ComputationDeviceType__Group_5__0 )? )
            // InternalDeviceParser.g:3489:2: ( rule__ComputationDeviceType__Group_5__0 )?
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getGroup_5());
            // InternalDeviceParser.g:3490:2: ( rule__ComputationDeviceType__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==CommunicationConnection) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDeviceParser.g:3490:3: rule__ComputationDeviceType__Group_5__0
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
    // InternalDeviceParser.g:3498:1: rule__ComputationDeviceType__Group__6 : rule__ComputationDeviceType__Group__6__Impl ;
    public final void rule__ComputationDeviceType__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3502:1: ( rule__ComputationDeviceType__Group__6__Impl )
            // InternalDeviceParser.g:3503:2: rule__ComputationDeviceType__Group__6__Impl
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
    // InternalDeviceParser.g:3509:1: rule__ComputationDeviceType__Group__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3513:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3514:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3514:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3515:2: RULE_DEDENT
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
    // InternalDeviceParser.g:3525:1: rule__ComputationDeviceType__Group_4__0 : rule__ComputationDeviceType__Group_4__0__Impl rule__ComputationDeviceType__Group_4__1 ;
    public final void rule__ComputationDeviceType__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3529:1: ( rule__ComputationDeviceType__Group_4__0__Impl rule__ComputationDeviceType__Group_4__1 )
            // InternalDeviceParser.g:3530:2: rule__ComputationDeviceType__Group_4__0__Impl rule__ComputationDeviceType__Group_4__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:3537:1: rule__ComputationDeviceType__Group_4__0__Impl : ( DeviceProperty ) ;
    public final void rule__ComputationDeviceType__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3541:1: ( ( DeviceProperty ) )
            // InternalDeviceParser.g:3542:1: ( DeviceProperty )
            {
            // InternalDeviceParser.g:3542:1: ( DeviceProperty )
            // InternalDeviceParser.g:3543:2: DeviceProperty
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyKeyword_4_0());
            match(input,DeviceProperty,FOLLOW_2);
             after(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyKeyword_4_0());

            }


            }

        }
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
    // InternalDeviceParser.g:3552:1: rule__ComputationDeviceType__Group_4__1 : rule__ComputationDeviceType__Group_4__1__Impl rule__ComputationDeviceType__Group_4__2 ;
    public final void rule__ComputationDeviceType__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3556:1: ( rule__ComputationDeviceType__Group_4__1__Impl rule__ComputationDeviceType__Group_4__2 )
            // InternalDeviceParser.g:3557:2: rule__ComputationDeviceType__Group_4__1__Impl rule__ComputationDeviceType__Group_4__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:3564:1: rule__ComputationDeviceType__Group_4__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3568:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3569:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3569:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3570:2: RULE_INDENT
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
    // InternalDeviceParser.g:3579:1: rule__ComputationDeviceType__Group_4__2 : rule__ComputationDeviceType__Group_4__2__Impl rule__ComputationDeviceType__Group_4__3 ;
    public final void rule__ComputationDeviceType__Group_4__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3583:1: ( rule__ComputationDeviceType__Group_4__2__Impl rule__ComputationDeviceType__Group_4__3 )
            // InternalDeviceParser.g:3584:2: rule__ComputationDeviceType__Group_4__2__Impl rule__ComputationDeviceType__Group_4__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDeviceParser.g:3591:1: rule__ComputationDeviceType__Group_4__2__Impl : ( ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_4__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3595:1: ( ( ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )* ) ) )
            // InternalDeviceParser.g:3596:1: ( ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )* ) )
            {
            // InternalDeviceParser.g:3596:1: ( ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )* ) )
            // InternalDeviceParser.g:3597:2: ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 ) ) ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )* )
            {
            // InternalDeviceParser.g:3597:2: ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 ) )
            // InternalDeviceParser.g:3598:3: ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyAssignment_4_2());
            // InternalDeviceParser.g:3599:3: ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )
            // InternalDeviceParser.g:3599:4: rule__ComputationDeviceType__DevicePropertyAssignment_4_2
            {
            pushFollow(FOLLOW_19);
            rule__ComputationDeviceType__DevicePropertyAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyAssignment_4_2());

            }

            // InternalDeviceParser.g:3602:2: ( ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )* )
            // InternalDeviceParser.g:3603:3: ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyAssignment_4_2());
            // InternalDeviceParser.g:3604:3: ( rule__ComputationDeviceType__DevicePropertyAssignment_4_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==HyphenMinus) ) {
                    alt25=1;
                }


                switch (alt25) {
                case 1 :
                    // InternalDeviceParser.g:3604:4: rule__ComputationDeviceType__DevicePropertyAssignment_4_2
                    {
                    pushFollow(FOLLOW_19);
                    rule__ComputationDeviceType__DevicePropertyAssignment_4_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop25;
                }
            } while (true);

             after(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyAssignment_4_2());

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
    // InternalDeviceParser.g:3613:1: rule__ComputationDeviceType__Group_4__3 : rule__ComputationDeviceType__Group_4__3__Impl ;
    public final void rule__ComputationDeviceType__Group_4__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3617:1: ( rule__ComputationDeviceType__Group_4__3__Impl )
            // InternalDeviceParser.g:3618:2: rule__ComputationDeviceType__Group_4__3__Impl
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
    // InternalDeviceParser.g:3624:1: rule__ComputationDeviceType__Group_4__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_4__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3628:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3629:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3629:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3630:2: RULE_DEDENT
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
    // InternalDeviceParser.g:3640:1: rule__ComputationDeviceType__Group_5__0 : rule__ComputationDeviceType__Group_5__0__Impl rule__ComputationDeviceType__Group_5__1 ;
    public final void rule__ComputationDeviceType__Group_5__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3644:1: ( rule__ComputationDeviceType__Group_5__0__Impl rule__ComputationDeviceType__Group_5__1 )
            // InternalDeviceParser.g:3645:2: rule__ComputationDeviceType__Group_5__0__Impl rule__ComputationDeviceType__Group_5__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:3652:1: rule__ComputationDeviceType__Group_5__0__Impl : ( CommunicationConnection ) ;
    public final void rule__ComputationDeviceType__Group_5__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3656:1: ( ( CommunicationConnection ) )
            // InternalDeviceParser.g:3657:1: ( CommunicationConnection )
            {
            // InternalDeviceParser.g:3657:1: ( CommunicationConnection )
            // InternalDeviceParser.g:3658:2: CommunicationConnection
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
    // InternalDeviceParser.g:3667:1: rule__ComputationDeviceType__Group_5__1 : rule__ComputationDeviceType__Group_5__1__Impl rule__ComputationDeviceType__Group_5__2 ;
    public final void rule__ComputationDeviceType__Group_5__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3671:1: ( rule__ComputationDeviceType__Group_5__1__Impl rule__ComputationDeviceType__Group_5__2 )
            // InternalDeviceParser.g:3672:2: rule__ComputationDeviceType__Group_5__1__Impl rule__ComputationDeviceType__Group_5__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:3679:1: rule__ComputationDeviceType__Group_5__1__Impl : ( RULE_INDENT ) ;
    public final void rule__ComputationDeviceType__Group_5__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3683:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3684:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3684:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3685:2: RULE_INDENT
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
    // InternalDeviceParser.g:3694:1: rule__ComputationDeviceType__Group_5__2 : rule__ComputationDeviceType__Group_5__2__Impl rule__ComputationDeviceType__Group_5__3 ;
    public final void rule__ComputationDeviceType__Group_5__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3698:1: ( rule__ComputationDeviceType__Group_5__2__Impl rule__ComputationDeviceType__Group_5__3 )
            // InternalDeviceParser.g:3699:2: rule__ComputationDeviceType__Group_5__2__Impl rule__ComputationDeviceType__Group_5__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDeviceParser.g:3706:1: rule__ComputationDeviceType__Group_5__2__Impl : ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) ) ;
    public final void rule__ComputationDeviceType__Group_5__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3710:1: ( ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) ) )
            // InternalDeviceParser.g:3711:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) )
            {
            // InternalDeviceParser.g:3711:1: ( ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* ) )
            // InternalDeviceParser.g:3712:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) ) ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* )
            {
            // InternalDeviceParser.g:3712:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 ) )
            // InternalDeviceParser.g:3713:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2());
            // InternalDeviceParser.g:3714:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )
            // InternalDeviceParser.g:3714:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2
            {
            pushFollow(FOLLOW_19);
            rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2());

            }

            // InternalDeviceParser.g:3717:2: ( ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )* )
            // InternalDeviceParser.g:3718:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )*
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAssignment_5_2());
            // InternalDeviceParser.g:3719:3: ( rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==HyphenMinus) ) {
                    alt26=1;
                }


                switch (alt26) {
                case 1 :
                    // InternalDeviceParser.g:3719:4: rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2
                    {
                    pushFollow(FOLLOW_19);
                    rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop26;
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
    // InternalDeviceParser.g:3728:1: rule__ComputationDeviceType__Group_5__3 : rule__ComputationDeviceType__Group_5__3__Impl ;
    public final void rule__ComputationDeviceType__Group_5__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3732:1: ( rule__ComputationDeviceType__Group_5__3__Impl )
            // InternalDeviceParser.g:3733:2: rule__ComputationDeviceType__Group_5__3__Impl
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
    // InternalDeviceParser.g:3739:1: rule__ComputationDeviceType__Group_5__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__ComputationDeviceType__Group_5__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3743:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:3744:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:3744:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:3745:2: RULE_DEDENT
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


    // $ANTLR start "rule__ConnectionProperty__Group__0"
    // InternalDeviceParser.g:3755:1: rule__ConnectionProperty__Group__0 : rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 ;
    public final void rule__ConnectionProperty__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3759:1: ( rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1 )
            // InternalDeviceParser.g:3760:2: rule__ConnectionProperty__Group__0__Impl rule__ConnectionProperty__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:3767:1: rule__ConnectionProperty__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionProperty__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3771:1: ( ( () ) )
            // InternalDeviceParser.g:3772:1: ( () )
            {
            // InternalDeviceParser.g:3772:1: ( () )
            // InternalDeviceParser.g:3773:2: ()
            {
             before(grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0());
            // InternalDeviceParser.g:3774:2: ()
            // InternalDeviceParser.g:3774:3:
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
    // InternalDeviceParser.g:3782:1: rule__ConnectionProperty__Group__1 : rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 ;
    public final void rule__ConnectionProperty__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3786:1: ( rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2 )
            // InternalDeviceParser.g:3787:2: rule__ConnectionProperty__Group__1__Impl rule__ConnectionProperty__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:3794:1: rule__ConnectionProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__ConnectionProperty__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3798:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:3799:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:3799:1: ( rulePreListElement )
            // InternalDeviceParser.g:3800:2: rulePreListElement
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
    // InternalDeviceParser.g:3809:1: rule__ConnectionProperty__Group__2 : rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 ;
    public final void rule__ConnectionProperty__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3813:1: ( rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3 )
            // InternalDeviceParser.g:3814:2: rule__ConnectionProperty__Group__2__Impl rule__ConnectionProperty__Group__3
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
    // InternalDeviceParser.g:3821:1: rule__ConnectionProperty__Group__2__Impl : ( Name ) ;
    public final void rule__ConnectionProperty__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3825:1: ( ( Name ) )
            // InternalDeviceParser.g:3826:1: ( Name )
            {
            // InternalDeviceParser.g:3826:1: ( Name )
            // InternalDeviceParser.g:3827:2: Name
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
    // InternalDeviceParser.g:3836:1: rule__ConnectionProperty__Group__3 : rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 ;
    public final void rule__ConnectionProperty__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3840:1: ( rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4 )
            // InternalDeviceParser.g:3841:2: rule__ConnectionProperty__Group__3__Impl rule__ConnectionProperty__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:3848:1: rule__ConnectionProperty__Group__3__Impl : ( ( rule__ConnectionProperty__NameAssignment_3 ) ) ;
    public final void rule__ConnectionProperty__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3852:1: ( ( ( rule__ConnectionProperty__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:3853:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:3853:1: ( ( rule__ConnectionProperty__NameAssignment_3 ) )
            // InternalDeviceParser.g:3854:2: ( rule__ConnectionProperty__NameAssignment_3 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getNameAssignment_3());
            // InternalDeviceParser.g:3855:2: ( rule__ConnectionProperty__NameAssignment_3 )
            // InternalDeviceParser.g:3855:3: rule__ConnectionProperty__NameAssignment_3
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
    // InternalDeviceParser.g:3863:1: rule__ConnectionProperty__Group__4 : rule__ConnectionProperty__Group__4__Impl rule__ConnectionProperty__Group__5 ;
    public final void rule__ConnectionProperty__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3867:1: ( rule__ConnectionProperty__Group__4__Impl rule__ConnectionProperty__Group__5 )
            // InternalDeviceParser.g:3868:2: rule__ConnectionProperty__Group__4__Impl rule__ConnectionProperty__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ConnectionProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__5();

            state._fsp--;


            }

        }
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
    // InternalDeviceParser.g:3875:1: rule__ConnectionProperty__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__ConnectionProperty__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3879:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:3880:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:3880:1: ( RULE_INDENT )
            // InternalDeviceParser.g:3881:2: RULE_INDENT
            {
             before(grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4());

            }


            }

        }
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


    // $ANTLR start "rule__ConnectionProperty__Group__5"
    // InternalDeviceParser.g:3890:1: rule__ConnectionProperty__Group__5 : rule__ConnectionProperty__Group__5__Impl rule__ConnectionProperty__Group__6 ;
    public final void rule__ConnectionProperty__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3894:1: ( rule__ConnectionProperty__Group__5__Impl rule__ConnectionProperty__Group__6 )
            // InternalDeviceParser.g:3895:2: rule__ConnectionProperty__Group__5__Impl rule__ConnectionProperty__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ConnectionProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__5"


    // $ANTLR start "rule__ConnectionProperty__Group__5__Impl"
    // InternalDeviceParser.g:3902:1: rule__ConnectionProperty__Group__5__Impl : ( Kind ) ;
    public final void rule__ConnectionProperty__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3906:1: ( ( Kind ) )
            // InternalDeviceParser.g:3907:1: ( Kind )
            {
            // InternalDeviceParser.g:3907:1: ( Kind )
            // InternalDeviceParser.g:3908:2: Kind
            {
             before(grammarAccess.getConnectionPropertyAccess().getKindKeyword_5());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getConnectionPropertyAccess().getKindKeyword_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__5__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group__6"
    // InternalDeviceParser.g:3917:1: rule__ConnectionProperty__Group__6 : rule__ConnectionProperty__Group__6__Impl rule__ConnectionProperty__Group__7 ;
    public final void rule__ConnectionProperty__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3921:1: ( rule__ConnectionProperty__Group__6__Impl rule__ConnectionProperty__Group__7 )
            // InternalDeviceParser.g:3922:2: rule__ConnectionProperty__Group__6__Impl rule__ConnectionProperty__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ConnectionProperty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__6"


    // $ANTLR start "rule__ConnectionProperty__Group__6__Impl"
    // InternalDeviceParser.g:3929:1: rule__ConnectionProperty__Group__6__Impl : ( ( rule__ConnectionProperty__KindAssignment_6 ) ) ;
    public final void rule__ConnectionProperty__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3933:1: ( ( ( rule__ConnectionProperty__KindAssignment_6 ) ) )
            // InternalDeviceParser.g:3934:1: ( ( rule__ConnectionProperty__KindAssignment_6 ) )
            {
            // InternalDeviceParser.g:3934:1: ( ( rule__ConnectionProperty__KindAssignment_6 ) )
            // InternalDeviceParser.g:3935:2: ( rule__ConnectionProperty__KindAssignment_6 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getKindAssignment_6());
            // InternalDeviceParser.g:3936:2: ( rule__ConnectionProperty__KindAssignment_6 )
            // InternalDeviceParser.g:3936:3: rule__ConnectionProperty__KindAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__KindAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPropertyAccess().getKindAssignment_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__6__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group__7"
    // InternalDeviceParser.g:3944:1: rule__ConnectionProperty__Group__7 : rule__ConnectionProperty__Group__7__Impl rule__ConnectionProperty__Group__8 ;
    public final void rule__ConnectionProperty__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3948:1: ( rule__ConnectionProperty__Group__7__Impl rule__ConnectionProperty__Group__8 )
            // InternalDeviceParser.g:3949:2: rule__ConnectionProperty__Group__7__Impl rule__ConnectionProperty__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__ConnectionProperty__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__7"


    // $ANTLR start "rule__ConnectionProperty__Group__7__Impl"
    // InternalDeviceParser.g:3956:1: rule__ConnectionProperty__Group__7__Impl : ( ( rule__ConnectionProperty__Group_7__0 )? ) ;
    public final void rule__ConnectionProperty__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3960:1: ( ( ( rule__ConnectionProperty__Group_7__0 )? ) )
            // InternalDeviceParser.g:3961:1: ( ( rule__ConnectionProperty__Group_7__0 )? )
            {
            // InternalDeviceParser.g:3961:1: ( ( rule__ConnectionProperty__Group_7__0 )? )
            // InternalDeviceParser.g:3962:2: ( rule__ConnectionProperty__Group_7__0 )?
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup_7());
            // InternalDeviceParser.g:3963:2: ( rule__ConnectionProperty__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Description) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDeviceParser.g:3963:3: rule__ConnectionProperty__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectionProperty__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionPropertyAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__7__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group__8"
    // InternalDeviceParser.g:3971:1: rule__ConnectionProperty__Group__8 : rule__ConnectionProperty__Group__8__Impl rule__ConnectionProperty__Group__9 ;
    public final void rule__ConnectionProperty__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3975:1: ( rule__ConnectionProperty__Group__8__Impl rule__ConnectionProperty__Group__9 )
            // InternalDeviceParser.g:3976:2: rule__ConnectionProperty__Group__8__Impl rule__ConnectionProperty__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__ConnectionProperty__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__8"


    // $ANTLR start "rule__ConnectionProperty__Group__8__Impl"
    // InternalDeviceParser.g:3983:1: rule__ConnectionProperty__Group__8__Impl : ( ( rule__ConnectionProperty__Group_8__0 )? ) ;
    public final void rule__ConnectionProperty__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:3987:1: ( ( ( rule__ConnectionProperty__Group_8__0 )? ) )
            // InternalDeviceParser.g:3988:1: ( ( rule__ConnectionProperty__Group_8__0 )? )
            {
            // InternalDeviceParser.g:3988:1: ( ( rule__ConnectionProperty__Group_8__0 )? )
            // InternalDeviceParser.g:3989:2: ( rule__ConnectionProperty__Group_8__0 )?
            {
             before(grammarAccess.getConnectionPropertyAccess().getGroup_8());
            // InternalDeviceParser.g:3990:2: ( rule__ConnectionProperty__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Value) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDeviceParser.g:3990:3: rule__ConnectionProperty__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectionProperty__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionPropertyAccess().getGroup_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__8__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group__9"
    // InternalDeviceParser.g:3998:1: rule__ConnectionProperty__Group__9 : rule__ConnectionProperty__Group__9__Impl ;
    public final void rule__ConnectionProperty__Group__9() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4002:1: ( rule__ConnectionProperty__Group__9__Impl )
            // InternalDeviceParser.g:4003:2: rule__ConnectionProperty__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__9"


    // $ANTLR start "rule__ConnectionProperty__Group__9__Impl"
    // InternalDeviceParser.g:4009:1: rule__ConnectionProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__ConnectionProperty__Group__9__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4013:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:4014:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:4014:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:4015:2: RULE_DEDENT
            {
             before(grammarAccess.getConnectionPropertyAccess().getDEDENTTerminalRuleCall_9());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getConnectionPropertyAccess().getDEDENTTerminalRuleCall_9());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group__9__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group_7__0"
    // InternalDeviceParser.g:4025:1: rule__ConnectionProperty__Group_7__0 : rule__ConnectionProperty__Group_7__0__Impl rule__ConnectionProperty__Group_7__1 ;
    public final void rule__ConnectionProperty__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4029:1: ( rule__ConnectionProperty__Group_7__0__Impl rule__ConnectionProperty__Group_7__1 )
            // InternalDeviceParser.g:4030:2: rule__ConnectionProperty__Group_7__0__Impl rule__ConnectionProperty__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__ConnectionProperty__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_7__0"


    // $ANTLR start "rule__ConnectionProperty__Group_7__0__Impl"
    // InternalDeviceParser.g:4037:1: rule__ConnectionProperty__Group_7__0__Impl : ( Description ) ;
    public final void rule__ConnectionProperty__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4041:1: ( ( Description ) )
            // InternalDeviceParser.g:4042:1: ( Description )
            {
            // InternalDeviceParser.g:4042:1: ( Description )
            // InternalDeviceParser.g:4043:2: Description
            {
             before(grammarAccess.getConnectionPropertyAccess().getDescriptionKeyword_7_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getConnectionPropertyAccess().getDescriptionKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_7__0__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group_7__1"
    // InternalDeviceParser.g:4052:1: rule__ConnectionProperty__Group_7__1 : rule__ConnectionProperty__Group_7__1__Impl ;
    public final void rule__ConnectionProperty__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4056:1: ( rule__ConnectionProperty__Group_7__1__Impl )
            // InternalDeviceParser.g:4057:2: rule__ConnectionProperty__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_7__1"


    // $ANTLR start "rule__ConnectionProperty__Group_7__1__Impl"
    // InternalDeviceParser.g:4063:1: rule__ConnectionProperty__Group_7__1__Impl : ( ( rule__ConnectionProperty__DescriptionAssignment_7_1 ) ) ;
    public final void rule__ConnectionProperty__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4067:1: ( ( ( rule__ConnectionProperty__DescriptionAssignment_7_1 ) ) )
            // InternalDeviceParser.g:4068:1: ( ( rule__ConnectionProperty__DescriptionAssignment_7_1 ) )
            {
            // InternalDeviceParser.g:4068:1: ( ( rule__ConnectionProperty__DescriptionAssignment_7_1 ) )
            // InternalDeviceParser.g:4069:2: ( rule__ConnectionProperty__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getDescriptionAssignment_7_1());
            // InternalDeviceParser.g:4070:2: ( rule__ConnectionProperty__DescriptionAssignment_7_1 )
            // InternalDeviceParser.g:4070:3: rule__ConnectionProperty__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPropertyAccess().getDescriptionAssignment_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_7__1__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group_8__0"
    // InternalDeviceParser.g:4079:1: rule__ConnectionProperty__Group_8__0 : rule__ConnectionProperty__Group_8__0__Impl rule__ConnectionProperty__Group_8__1 ;
    public final void rule__ConnectionProperty__Group_8__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4083:1: ( rule__ConnectionProperty__Group_8__0__Impl rule__ConnectionProperty__Group_8__1 )
            // InternalDeviceParser.g:4084:2: rule__ConnectionProperty__Group_8__0__Impl rule__ConnectionProperty__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__ConnectionProperty__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_8__0"


    // $ANTLR start "rule__ConnectionProperty__Group_8__0__Impl"
    // InternalDeviceParser.g:4091:1: rule__ConnectionProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__ConnectionProperty__Group_8__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4095:1: ( ( Value ) )
            // InternalDeviceParser.g:4096:1: ( Value )
            {
            // InternalDeviceParser.g:4096:1: ( Value )
            // InternalDeviceParser.g:4097:2: Value
            {
             before(grammarAccess.getConnectionPropertyAccess().getValueKeyword_8_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getConnectionPropertyAccess().getValueKeyword_8_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_8__0__Impl"


    // $ANTLR start "rule__ConnectionProperty__Group_8__1"
    // InternalDeviceParser.g:4106:1: rule__ConnectionProperty__Group_8__1 : rule__ConnectionProperty__Group_8__1__Impl ;
    public final void rule__ConnectionProperty__Group_8__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4110:1: ( rule__ConnectionProperty__Group_8__1__Impl )
            // InternalDeviceParser.g:4111:2: rule__ConnectionProperty__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_8__1"


    // $ANTLR start "rule__ConnectionProperty__Group_8__1__Impl"
    // InternalDeviceParser.g:4117:1: rule__ConnectionProperty__Group_8__1__Impl : ( ( rule__ConnectionProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__ConnectionProperty__Group_8__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4121:1: ( ( ( rule__ConnectionProperty__ValueAssignment_8_1 ) ) )
            // InternalDeviceParser.g:4122:1: ( ( rule__ConnectionProperty__ValueAssignment_8_1 ) )
            {
            // InternalDeviceParser.g:4122:1: ( ( rule__ConnectionProperty__ValueAssignment_8_1 ) )
            // InternalDeviceParser.g:4123:2: ( rule__ConnectionProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getConnectionPropertyAccess().getValueAssignment_8_1());
            // InternalDeviceParser.g:4124:2: ( rule__ConnectionProperty__ValueAssignment_8_1 )
            // InternalDeviceParser.g:4124:3: rule__ConnectionProperty__ValueAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionProperty__ValueAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPropertyAccess().getValueAssignment_8_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__Group_8__1__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__0"
    // InternalDeviceParser.g:4133:1: rule__NetworkConnection__Group__0 : rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 ;
    public final void rule__NetworkConnection__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4137:1: ( rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 )
            // InternalDeviceParser.g:4138:2: rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:4145:1: rule__NetworkConnection__Group__0__Impl : ( () ) ;
    public final void rule__NetworkConnection__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4149:1: ( ( () ) )
            // InternalDeviceParser.g:4150:1: ( () )
            {
            // InternalDeviceParser.g:4150:1: ( () )
            // InternalDeviceParser.g:4151:2: ()
            {
             before(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionAction_0());
            // InternalDeviceParser.g:4152:2: ()
            // InternalDeviceParser.g:4152:3:
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
    // InternalDeviceParser.g:4160:1: rule__NetworkConnection__Group__1 : rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 ;
    public final void rule__NetworkConnection__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4164:1: ( rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 )
            // InternalDeviceParser.g:4165:2: rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:4172:1: rule__NetworkConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__NetworkConnection__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4176:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:4177:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:4177:1: ( rulePreListElement )
            // InternalDeviceParser.g:4178:2: rulePreListElement
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
    // InternalDeviceParser.g:4187:1: rule__NetworkConnection__Group__2 : rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 ;
    public final void rule__NetworkConnection__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4191:1: ( rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 )
            // InternalDeviceParser.g:4192:2: rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3
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
    // InternalDeviceParser.g:4199:1: rule__NetworkConnection__Group__2__Impl : ( Name ) ;
    public final void rule__NetworkConnection__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4203:1: ( ( Name ) )
            // InternalDeviceParser.g:4204:1: ( Name )
            {
            // InternalDeviceParser.g:4204:1: ( Name )
            // InternalDeviceParser.g:4205:2: Name
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
    // InternalDeviceParser.g:4214:1: rule__NetworkConnection__Group__3 : rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 ;
    public final void rule__NetworkConnection__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4218:1: ( rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 )
            // InternalDeviceParser.g:4219:2: rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:4226:1: rule__NetworkConnection__Group__3__Impl : ( ( rule__NetworkConnection__NameAssignment_3 ) ) ;
    public final void rule__NetworkConnection__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4230:1: ( ( ( rule__NetworkConnection__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:4231:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:4231:1: ( ( rule__NetworkConnection__NameAssignment_3 ) )
            // InternalDeviceParser.g:4232:2: ( rule__NetworkConnection__NameAssignment_3 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getNameAssignment_3());
            // InternalDeviceParser.g:4233:2: ( rule__NetworkConnection__NameAssignment_3 )
            // InternalDeviceParser.g:4233:3: rule__NetworkConnection__NameAssignment_3
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
    // InternalDeviceParser.g:4241:1: rule__NetworkConnection__Group__4 : rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 ;
    public final void rule__NetworkConnection__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4245:1: ( rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 )
            // InternalDeviceParser.g:4246:2: rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalDeviceParser.g:4253:1: rule__NetworkConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4257:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:4258:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:4258:1: ( RULE_INDENT )
            // InternalDeviceParser.g:4259:2: RULE_INDENT
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
    // InternalDeviceParser.g:4268:1: rule__NetworkConnection__Group__5 : rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 ;
    public final void rule__NetworkConnection__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4272:1: ( rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 )
            // InternalDeviceParser.g:4273:2: rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6
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
    // InternalDeviceParser.g:4280:1: rule__NetworkConnection__Group__5__Impl : ( Type ) ;
    public final void rule__NetworkConnection__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4284:1: ( ( Type ) )
            // InternalDeviceParser.g:4285:1: ( Type )
            {
            // InternalDeviceParser.g:4285:1: ( Type )
            // InternalDeviceParser.g:4286:2: Type
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
    // InternalDeviceParser.g:4295:1: rule__NetworkConnection__Group__6 : rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 ;
    public final void rule__NetworkConnection__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4299:1: ( rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7 )
            // InternalDeviceParser.g:4300:2: rule__NetworkConnection__Group__6__Impl rule__NetworkConnection__Group__7
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
    // InternalDeviceParser.g:4307:1: rule__NetworkConnection__Group__6__Impl : ( ( rule__NetworkConnection__TypeAssignment_6 ) ) ;
    public final void rule__NetworkConnection__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4311:1: ( ( ( rule__NetworkConnection__TypeAssignment_6 ) ) )
            // InternalDeviceParser.g:4312:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            {
            // InternalDeviceParser.g:4312:1: ( ( rule__NetworkConnection__TypeAssignment_6 ) )
            // InternalDeviceParser.g:4313:2: ( rule__NetworkConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getTypeAssignment_6());
            // InternalDeviceParser.g:4314:2: ( rule__NetworkConnection__TypeAssignment_6 )
            // InternalDeviceParser.g:4314:3: rule__NetworkConnection__TypeAssignment_6
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
    // InternalDeviceParser.g:4322:1: rule__NetworkConnection__Group__7 : rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 ;
    public final void rule__NetworkConnection__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4326:1: ( rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8 )
            // InternalDeviceParser.g:4327:2: rule__NetworkConnection__Group__7__Impl rule__NetworkConnection__Group__8
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
    // InternalDeviceParser.g:4334:1: rule__NetworkConnection__Group__7__Impl : ( ( rule__NetworkConnection__Group_7__0 )? ) ;
    public final void rule__NetworkConnection__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4338:1: ( ( ( rule__NetworkConnection__Group_7__0 )? ) )
            // InternalDeviceParser.g:4339:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            {
            // InternalDeviceParser.g:4339:1: ( ( rule__NetworkConnection__Group_7__0 )? )
            // InternalDeviceParser.g:4340:2: ( rule__NetworkConnection__Group_7__0 )?
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup_7());
            // InternalDeviceParser.g:4341:2: ( rule__NetworkConnection__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Properties) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDeviceParser.g:4341:3: rule__NetworkConnection__Group_7__0
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
    // InternalDeviceParser.g:4349:1: rule__NetworkConnection__Group__8 : rule__NetworkConnection__Group__8__Impl ;
    public final void rule__NetworkConnection__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4353:1: ( rule__NetworkConnection__Group__8__Impl )
            // InternalDeviceParser.g:4354:2: rule__NetworkConnection__Group__8__Impl
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
    // InternalDeviceParser.g:4360:1: rule__NetworkConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__NetworkConnection__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4364:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:4365:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:4365:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:4366:2: RULE_DEDENT
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
    // InternalDeviceParser.g:4376:1: rule__NetworkConnection__Group_7__0 : rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 ;
    public final void rule__NetworkConnection__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4380:1: ( rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1 )
            // InternalDeviceParser.g:4381:2: rule__NetworkConnection__Group_7__0__Impl rule__NetworkConnection__Group_7__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:4388:1: rule__NetworkConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__NetworkConnection__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4392:1: ( ( Properties ) )
            // InternalDeviceParser.g:4393:1: ( Properties )
            {
            // InternalDeviceParser.g:4393:1: ( Properties )
            // InternalDeviceParser.g:4394:2: Properties
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
    // InternalDeviceParser.g:4403:1: rule__NetworkConnection__Group_7__1 : rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 ;
    public final void rule__NetworkConnection__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4407:1: ( rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2 )
            // InternalDeviceParser.g:4408:2: rule__NetworkConnection__Group_7__1__Impl rule__NetworkConnection__Group_7__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:4415:1: rule__NetworkConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__NetworkConnection__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4419:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:4420:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:4420:1: ( RULE_INDENT )
            // InternalDeviceParser.g:4421:2: RULE_INDENT
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
    // InternalDeviceParser.g:4430:1: rule__NetworkConnection__Group_7__2 : rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 ;
    public final void rule__NetworkConnection__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4434:1: ( rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3 )
            // InternalDeviceParser.g:4435:2: rule__NetworkConnection__Group_7__2__Impl rule__NetworkConnection__Group_7__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDeviceParser.g:4442:1: rule__NetworkConnection__Group_7__2__Impl : ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__NetworkConnection__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4446:1: ( ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalDeviceParser.g:4447:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalDeviceParser.g:4447:1: ( ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* ) )
            // InternalDeviceParser.g:4448:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) ) ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalDeviceParser.g:4448:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 ) )
            // InternalDeviceParser.g:4449:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2());
            // InternalDeviceParser.g:4450:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )
            // InternalDeviceParser.g:4450:4: rule__NetworkConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_19);
            rule__NetworkConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2());

            }

            // InternalDeviceParser.g:4453:2: ( ( rule__NetworkConnection__PropertiesAssignment_7_2 )* )
            // InternalDeviceParser.g:4454:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getNetworkConnectionAccess().getPropertiesAssignment_7_2());
            // InternalDeviceParser.g:4455:3: ( rule__NetworkConnection__PropertiesAssignment_7_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==HyphenMinus) ) {
                    alt30=1;
                }


                switch (alt30) {
                case 1 :
                    // InternalDeviceParser.g:4455:4: rule__NetworkConnection__PropertiesAssignment_7_2
                    {
                    pushFollow(FOLLOW_19);
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
    // InternalDeviceParser.g:4464:1: rule__NetworkConnection__Group_7__3 : rule__NetworkConnection__Group_7__3__Impl ;
    public final void rule__NetworkConnection__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4468:1: ( rule__NetworkConnection__Group_7__3__Impl )
            // InternalDeviceParser.g:4469:2: rule__NetworkConnection__Group_7__3__Impl
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
    // InternalDeviceParser.g:4475:1: rule__NetworkConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__NetworkConnection__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4479:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:4480:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:4480:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:4481:2: RULE_DEDENT
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
    // InternalDeviceParser.g:4491:1: rule__CommunicationConnection__Group__0 : rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 ;
    public final void rule__CommunicationConnection__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4495:1: ( rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1 )
            // InternalDeviceParser.g:4496:2: rule__CommunicationConnection__Group__0__Impl rule__CommunicationConnection__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:4503:1: rule__CommunicationConnection__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationConnection__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4507:1: ( ( () ) )
            // InternalDeviceParser.g:4508:1: ( () )
            {
            // InternalDeviceParser.g:4508:1: ( () )
            // InternalDeviceParser.g:4509:2: ()
            {
             before(grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0());
            // InternalDeviceParser.g:4510:2: ()
            // InternalDeviceParser.g:4510:3:
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
    // InternalDeviceParser.g:4518:1: rule__CommunicationConnection__Group__1 : rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 ;
    public final void rule__CommunicationConnection__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4522:1: ( rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2 )
            // InternalDeviceParser.g:4523:2: rule__CommunicationConnection__Group__1__Impl rule__CommunicationConnection__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDeviceParser.g:4530:1: rule__CommunicationConnection__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__CommunicationConnection__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4534:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:4535:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:4535:1: ( rulePreListElement )
            // InternalDeviceParser.g:4536:2: rulePreListElement
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
    // InternalDeviceParser.g:4545:1: rule__CommunicationConnection__Group__2 : rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 ;
    public final void rule__CommunicationConnection__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4549:1: ( rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3 )
            // InternalDeviceParser.g:4550:2: rule__CommunicationConnection__Group__2__Impl rule__CommunicationConnection__Group__3
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
    // InternalDeviceParser.g:4557:1: rule__CommunicationConnection__Group__2__Impl : ( Name ) ;
    public final void rule__CommunicationConnection__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4561:1: ( ( Name ) )
            // InternalDeviceParser.g:4562:1: ( Name )
            {
            // InternalDeviceParser.g:4562:1: ( Name )
            // InternalDeviceParser.g:4563:2: Name
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
    // InternalDeviceParser.g:4572:1: rule__CommunicationConnection__Group__3 : rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 ;
    public final void rule__CommunicationConnection__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4576:1: ( rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4 )
            // InternalDeviceParser.g:4577:2: rule__CommunicationConnection__Group__3__Impl rule__CommunicationConnection__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:4584:1: rule__CommunicationConnection__Group__3__Impl : ( ( rule__CommunicationConnection__NameAssignment_3 ) ) ;
    public final void rule__CommunicationConnection__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4588:1: ( ( ( rule__CommunicationConnection__NameAssignment_3 ) ) )
            // InternalDeviceParser.g:4589:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            {
            // InternalDeviceParser.g:4589:1: ( ( rule__CommunicationConnection__NameAssignment_3 ) )
            // InternalDeviceParser.g:4590:2: ( rule__CommunicationConnection__NameAssignment_3 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getNameAssignment_3());
            // InternalDeviceParser.g:4591:2: ( rule__CommunicationConnection__NameAssignment_3 )
            // InternalDeviceParser.g:4591:3: rule__CommunicationConnection__NameAssignment_3
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
    // InternalDeviceParser.g:4599:1: rule__CommunicationConnection__Group__4 : rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 ;
    public final void rule__CommunicationConnection__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4603:1: ( rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5 )
            // InternalDeviceParser.g:4604:2: rule__CommunicationConnection__Group__4__Impl rule__CommunicationConnection__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalDeviceParser.g:4611:1: rule__CommunicationConnection__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4615:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:4616:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:4616:1: ( RULE_INDENT )
            // InternalDeviceParser.g:4617:2: RULE_INDENT
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
    // InternalDeviceParser.g:4626:1: rule__CommunicationConnection__Group__5 : rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 ;
    public final void rule__CommunicationConnection__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4630:1: ( rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6 )
            // InternalDeviceParser.g:4631:2: rule__CommunicationConnection__Group__5__Impl rule__CommunicationConnection__Group__6
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
    // InternalDeviceParser.g:4638:1: rule__CommunicationConnection__Group__5__Impl : ( Type ) ;
    public final void rule__CommunicationConnection__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4642:1: ( ( Type ) )
            // InternalDeviceParser.g:4643:1: ( Type )
            {
            // InternalDeviceParser.g:4643:1: ( Type )
            // InternalDeviceParser.g:4644:2: Type
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
    // InternalDeviceParser.g:4653:1: rule__CommunicationConnection__Group__6 : rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 ;
    public final void rule__CommunicationConnection__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4657:1: ( rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7 )
            // InternalDeviceParser.g:4658:2: rule__CommunicationConnection__Group__6__Impl rule__CommunicationConnection__Group__7
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
    // InternalDeviceParser.g:4665:1: rule__CommunicationConnection__Group__6__Impl : ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) ;
    public final void rule__CommunicationConnection__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4669:1: ( ( ( rule__CommunicationConnection__TypeAssignment_6 ) ) )
            // InternalDeviceParser.g:4670:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            {
            // InternalDeviceParser.g:4670:1: ( ( rule__CommunicationConnection__TypeAssignment_6 ) )
            // InternalDeviceParser.g:4671:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getTypeAssignment_6());
            // InternalDeviceParser.g:4672:2: ( rule__CommunicationConnection__TypeAssignment_6 )
            // InternalDeviceParser.g:4672:3: rule__CommunicationConnection__TypeAssignment_6
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
    // InternalDeviceParser.g:4680:1: rule__CommunicationConnection__Group__7 : rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 ;
    public final void rule__CommunicationConnection__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4684:1: ( rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8 )
            // InternalDeviceParser.g:4685:2: rule__CommunicationConnection__Group__7__Impl rule__CommunicationConnection__Group__8
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
    // InternalDeviceParser.g:4692:1: rule__CommunicationConnection__Group__7__Impl : ( ( rule__CommunicationConnection__Group_7__0 )? ) ;
    public final void rule__CommunicationConnection__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4696:1: ( ( ( rule__CommunicationConnection__Group_7__0 )? ) )
            // InternalDeviceParser.g:4697:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            {
            // InternalDeviceParser.g:4697:1: ( ( rule__CommunicationConnection__Group_7__0 )? )
            // InternalDeviceParser.g:4698:2: ( rule__CommunicationConnection__Group_7__0 )?
            {
             before(grammarAccess.getCommunicationConnectionAccess().getGroup_7());
            // InternalDeviceParser.g:4699:2: ( rule__CommunicationConnection__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Properties) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDeviceParser.g:4699:3: rule__CommunicationConnection__Group_7__0
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
    // InternalDeviceParser.g:4707:1: rule__CommunicationConnection__Group__8 : rule__CommunicationConnection__Group__8__Impl ;
    public final void rule__CommunicationConnection__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4711:1: ( rule__CommunicationConnection__Group__8__Impl )
            // InternalDeviceParser.g:4712:2: rule__CommunicationConnection__Group__8__Impl
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
    // InternalDeviceParser.g:4718:1: rule__CommunicationConnection__Group__8__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4722:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:4723:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:4723:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:4724:2: RULE_DEDENT
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
    // InternalDeviceParser.g:4734:1: rule__CommunicationConnection__Group_7__0 : rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 ;
    public final void rule__CommunicationConnection__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4738:1: ( rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1 )
            // InternalDeviceParser.g:4739:2: rule__CommunicationConnection__Group_7__0__Impl rule__CommunicationConnection__Group_7__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDeviceParser.g:4746:1: rule__CommunicationConnection__Group_7__0__Impl : ( Properties ) ;
    public final void rule__CommunicationConnection__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4750:1: ( ( Properties ) )
            // InternalDeviceParser.g:4751:1: ( Properties )
            {
            // InternalDeviceParser.g:4751:1: ( Properties )
            // InternalDeviceParser.g:4752:2: Properties
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
    // InternalDeviceParser.g:4761:1: rule__CommunicationConnection__Group_7__1 : rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 ;
    public final void rule__CommunicationConnection__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4765:1: ( rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2 )
            // InternalDeviceParser.g:4766:2: rule__CommunicationConnection__Group_7__1__Impl rule__CommunicationConnection__Group_7__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalDeviceParser.g:4773:1: rule__CommunicationConnection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__CommunicationConnection__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4777:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:4778:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:4778:1: ( RULE_INDENT )
            // InternalDeviceParser.g:4779:2: RULE_INDENT
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
    // InternalDeviceParser.g:4788:1: rule__CommunicationConnection__Group_7__2 : rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 ;
    public final void rule__CommunicationConnection__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4792:1: ( rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3 )
            // InternalDeviceParser.g:4793:2: rule__CommunicationConnection__Group_7__2__Impl rule__CommunicationConnection__Group_7__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDeviceParser.g:4800:1: rule__CommunicationConnection__Group_7__2__Impl : ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) ;
    public final void rule__CommunicationConnection__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4804:1: ( ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) ) )
            // InternalDeviceParser.g:4805:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            {
            // InternalDeviceParser.g:4805:1: ( ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* ) )
            // InternalDeviceParser.g:4806:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) ) ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            {
            // InternalDeviceParser.g:4806:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 ) )
            // InternalDeviceParser.g:4807:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2());
            // InternalDeviceParser.g:4808:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )
            // InternalDeviceParser.g:4808:4: rule__CommunicationConnection__PropertiesAssignment_7_2
            {
            pushFollow(FOLLOW_19);
            rule__CommunicationConnection__PropertiesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2());

            }

            // InternalDeviceParser.g:4811:2: ( ( rule__CommunicationConnection__PropertiesAssignment_7_2 )* )
            // InternalDeviceParser.g:4812:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            {
             before(grammarAccess.getCommunicationConnectionAccess().getPropertiesAssignment_7_2());
            // InternalDeviceParser.g:4813:3: ( rule__CommunicationConnection__PropertiesAssignment_7_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==HyphenMinus) ) {
                    alt32=1;
                }


                switch (alt32) {
                case 1 :
                    // InternalDeviceParser.g:4813:4: rule__CommunicationConnection__PropertiesAssignment_7_2
                    {
                    pushFollow(FOLLOW_19);
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
    // InternalDeviceParser.g:4822:1: rule__CommunicationConnection__Group_7__3 : rule__CommunicationConnection__Group_7__3__Impl ;
    public final void rule__CommunicationConnection__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4826:1: ( rule__CommunicationConnection__Group_7__3__Impl )
            // InternalDeviceParser.g:4827:2: rule__CommunicationConnection__Group_7__3__Impl
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
    // InternalDeviceParser.g:4833:1: rule__CommunicationConnection__Group_7__3__Impl : ( RULE_DEDENT ) ;
    public final void rule__CommunicationConnection__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4837:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:4838:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:4838:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:4839:2: RULE_DEDENT
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


    // $ANTLR start "rule__Property__Group__0"
    // InternalDeviceParser.g:4849:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4853:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDeviceParser.g:4854:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalDeviceParser.g:4861:1: rule__Property__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4865:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:4866:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:4866:1: ( rulePreListElement )
            // InternalDeviceParser.g:4867:2: rulePreListElement
            {
             before(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalDeviceParser.g:4876:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4880:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalDeviceParser.g:4881:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalDeviceParser.g:4888:1: rule__Property__Group__1__Impl : ( Name ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4892:1: ( ( Name ) )
            // InternalDeviceParser.g:4893:1: ( Name )
            {
            // InternalDeviceParser.g:4893:1: ( Name )
            // InternalDeviceParser.g:4894:2: Name
            {
             before(grammarAccess.getPropertyAccess().getNameKeyword_1());
            match(input,Name,FOLLOW_2);
             after(grammarAccess.getPropertyAccess().getNameKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalDeviceParser.g:4903:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4907:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalDeviceParser.g:4908:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalDeviceParser.g:4915:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4919:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:4920:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:4920:1: ( ( rule__Property__NameAssignment_2 ) )
            // InternalDeviceParser.g:4921:2: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2());
            // InternalDeviceParser.g:4922:2: ( rule__Property__NameAssignment_2 )
            // InternalDeviceParser.g:4922:3: rule__Property__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalDeviceParser.g:4930:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4934:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalDeviceParser.g:4935:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalDeviceParser.g:4942:1: rule__Property__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4946:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:4947:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:4947:1: ( RULE_INDENT )
            // InternalDeviceParser.g:4948:2: RULE_INDENT
            {
             before(grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_3());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalDeviceParser.g:4957:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4961:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalDeviceParser.g:4962:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalDeviceParser.g:4969:1: rule__Property__Group__4__Impl : ( Kind ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4973:1: ( ( Kind ) )
            // InternalDeviceParser.g:4974:1: ( Kind )
            {
            // InternalDeviceParser.g:4974:1: ( Kind )
            // InternalDeviceParser.g:4975:2: Kind
            {
             before(grammarAccess.getPropertyAccess().getKindKeyword_4());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getPropertyAccess().getKindKeyword_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // InternalDeviceParser.g:4984:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:4988:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // InternalDeviceParser.g:4989:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // InternalDeviceParser.g:4996:1: rule__Property__Group__5__Impl : ( ( rule__Property__KindAssignment_5 ) ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5000:1: ( ( ( rule__Property__KindAssignment_5 ) ) )
            // InternalDeviceParser.g:5001:1: ( ( rule__Property__KindAssignment_5 ) )
            {
            // InternalDeviceParser.g:5001:1: ( ( rule__Property__KindAssignment_5 ) )
            // InternalDeviceParser.g:5002:2: ( rule__Property__KindAssignment_5 )
            {
             before(grammarAccess.getPropertyAccess().getKindAssignment_5());
            // InternalDeviceParser.g:5003:2: ( rule__Property__KindAssignment_5 )
            // InternalDeviceParser.g:5003:3: rule__Property__KindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Property__KindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getKindAssignment_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__6"
    // InternalDeviceParser.g:5011:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5015:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // InternalDeviceParser.g:5016:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6"


    // $ANTLR start "rule__Property__Group__6__Impl"
    // InternalDeviceParser.g:5023:1: rule__Property__Group__6__Impl : ( ( rule__Property__Group_6__0 )? ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5027:1: ( ( ( rule__Property__Group_6__0 )? ) )
            // InternalDeviceParser.g:5028:1: ( ( rule__Property__Group_6__0 )? )
            {
            // InternalDeviceParser.g:5028:1: ( ( rule__Property__Group_6__0 )? )
            // InternalDeviceParser.g:5029:2: ( rule__Property__Group_6__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_6());
            // InternalDeviceParser.g:5030:2: ( rule__Property__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Description) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDeviceParser.g:5030:3: rule__Property__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6__Impl"


    // $ANTLR start "rule__Property__Group__7"
    // InternalDeviceParser.g:5038:1: rule__Property__Group__7 : rule__Property__Group__7__Impl rule__Property__Group__8 ;
    public final void rule__Property__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5042:1: ( rule__Property__Group__7__Impl rule__Property__Group__8 )
            // InternalDeviceParser.g:5043:2: rule__Property__Group__7__Impl rule__Property__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Property__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7"


    // $ANTLR start "rule__Property__Group__7__Impl"
    // InternalDeviceParser.g:5050:1: rule__Property__Group__7__Impl : ( ( rule__Property__Group_7__0 )? ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5054:1: ( ( ( rule__Property__Group_7__0 )? ) )
            // InternalDeviceParser.g:5055:1: ( ( rule__Property__Group_7__0 )? )
            {
            // InternalDeviceParser.g:5055:1: ( ( rule__Property__Group_7__0 )? )
            // InternalDeviceParser.g:5056:2: ( rule__Property__Group_7__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_7());
            // InternalDeviceParser.g:5057:2: ( rule__Property__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Value) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDeviceParser.g:5057:3: rule__Property__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7__Impl"


    // $ANTLR start "rule__Property__Group__8"
    // InternalDeviceParser.g:5065:1: rule__Property__Group__8 : rule__Property__Group__8__Impl ;
    public final void rule__Property__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5069:1: ( rule__Property__Group__8__Impl )
            // InternalDeviceParser.g:5070:2: rule__Property__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8"


    // $ANTLR start "rule__Property__Group__8__Impl"
    // InternalDeviceParser.g:5076:1: rule__Property__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__Property__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5080:1: ( ( ( RULE_DEDENT )? ) )
            // InternalDeviceParser.g:5081:1: ( ( RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:5081:1: ( ( RULE_DEDENT )? )
            // InternalDeviceParser.g:5082:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_8());
            // InternalDeviceParser.g:5083:2: ( RULE_DEDENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_DEDENT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDeviceParser.g:5083:3: RULE_DEDENT
                    {
                    match(input,RULE_DEDENT,FOLLOW_2);

                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8__Impl"


    // $ANTLR start "rule__Property__Group_6__0"
    // InternalDeviceParser.g:5092:1: rule__Property__Group_6__0 : rule__Property__Group_6__0__Impl rule__Property__Group_6__1 ;
    public final void rule__Property__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5096:1: ( rule__Property__Group_6__0__Impl rule__Property__Group_6__1 )
            // InternalDeviceParser.g:5097:2: rule__Property__Group_6__0__Impl rule__Property__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__0"


    // $ANTLR start "rule__Property__Group_6__0__Impl"
    // InternalDeviceParser.g:5104:1: rule__Property__Group_6__0__Impl : ( Description ) ;
    public final void rule__Property__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5108:1: ( ( Description ) )
            // InternalDeviceParser.g:5109:1: ( Description )
            {
            // InternalDeviceParser.g:5109:1: ( Description )
            // InternalDeviceParser.g:5110:2: Description
            {
             before(grammarAccess.getPropertyAccess().getDescriptionKeyword_6_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getPropertyAccess().getDescriptionKeyword_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__0__Impl"


    // $ANTLR start "rule__Property__Group_6__1"
    // InternalDeviceParser.g:5119:1: rule__Property__Group_6__1 : rule__Property__Group_6__1__Impl ;
    public final void rule__Property__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5123:1: ( rule__Property__Group_6__1__Impl )
            // InternalDeviceParser.g:5124:2: rule__Property__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__1"


    // $ANTLR start "rule__Property__Group_6__1__Impl"
    // InternalDeviceParser.g:5130:1: rule__Property__Group_6__1__Impl : ( ( rule__Property__DescriptionAssignment_6_1 ) ) ;
    public final void rule__Property__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5134:1: ( ( ( rule__Property__DescriptionAssignment_6_1 ) ) )
            // InternalDeviceParser.g:5135:1: ( ( rule__Property__DescriptionAssignment_6_1 ) )
            {
            // InternalDeviceParser.g:5135:1: ( ( rule__Property__DescriptionAssignment_6_1 ) )
            // InternalDeviceParser.g:5136:2: ( rule__Property__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_6_1());
            // InternalDeviceParser.g:5137:2: ( rule__Property__DescriptionAssignment_6_1 )
            // InternalDeviceParser.g:5137:3: rule__Property__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_6_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__1__Impl"


    // $ANTLR start "rule__Property__Group_7__0"
    // InternalDeviceParser.g:5146:1: rule__Property__Group_7__0 : rule__Property__Group_7__0__Impl rule__Property__Group_7__1 ;
    public final void rule__Property__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5150:1: ( rule__Property__Group_7__0__Impl rule__Property__Group_7__1 )
            // InternalDeviceParser.g:5151:2: rule__Property__Group_7__0__Impl rule__Property__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Property__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__0"


    // $ANTLR start "rule__Property__Group_7__0__Impl"
    // InternalDeviceParser.g:5158:1: rule__Property__Group_7__0__Impl : ( Value ) ;
    public final void rule__Property__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5162:1: ( ( Value ) )
            // InternalDeviceParser.g:5163:1: ( Value )
            {
            // InternalDeviceParser.g:5163:1: ( Value )
            // InternalDeviceParser.g:5164:2: Value
            {
             before(grammarAccess.getPropertyAccess().getValueKeyword_7_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getPropertyAccess().getValueKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__0__Impl"


    // $ANTLR start "rule__Property__Group_7__1"
    // InternalDeviceParser.g:5173:1: rule__Property__Group_7__1 : rule__Property__Group_7__1__Impl rule__Property__Group_7__2 ;
    public final void rule__Property__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5177:1: ( rule__Property__Group_7__1__Impl rule__Property__Group_7__2 )
            // InternalDeviceParser.g:5178:2: rule__Property__Group_7__1__Impl rule__Property__Group_7__2
            {
            pushFollow(FOLLOW_6);
            rule__Property__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__1"


    // $ANTLR start "rule__Property__Group_7__1__Impl"
    // InternalDeviceParser.g:5185:1: rule__Property__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__Property__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5189:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:5190:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:5190:1: ( RULE_INDENT )
            // InternalDeviceParser.g:5191:2: RULE_INDENT
            {
             before(grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_7_1());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__1__Impl"


    // $ANTLR start "rule__Property__Group_7__2"
    // InternalDeviceParser.g:5200:1: rule__Property__Group_7__2 : rule__Property__Group_7__2__Impl rule__Property__Group_7__3 ;
    public final void rule__Property__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5204:1: ( rule__Property__Group_7__2__Impl rule__Property__Group_7__3 )
            // InternalDeviceParser.g:5205:2: rule__Property__Group_7__2__Impl rule__Property__Group_7__3
            {
            pushFollow(FOLLOW_14);
            rule__Property__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__2"


    // $ANTLR start "rule__Property__Group_7__2__Impl"
    // InternalDeviceParser.g:5212:1: rule__Property__Group_7__2__Impl : ( rulePreListElement ) ;
    public final void rule__Property__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5216:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:5217:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:5217:1: ( rulePreListElement )
            // InternalDeviceParser.g:5218:2: rulePreListElement
            {
             before(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_2());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__2__Impl"


    // $ANTLR start "rule__Property__Group_7__3"
    // InternalDeviceParser.g:5227:1: rule__Property__Group_7__3 : rule__Property__Group_7__3__Impl rule__Property__Group_7__4 ;
    public final void rule__Property__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5231:1: ( rule__Property__Group_7__3__Impl rule__Property__Group_7__4 )
            // InternalDeviceParser.g:5232:2: rule__Property__Group_7__3__Impl rule__Property__Group_7__4
            {
            pushFollow(FOLLOW_23);
            rule__Property__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__3"


    // $ANTLR start "rule__Property__Group_7__3__Impl"
    // InternalDeviceParser.g:5239:1: rule__Property__Group_7__3__Impl : ( ( rule__Property__ValueAssignment_7_3 ) ) ;
    public final void rule__Property__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5243:1: ( ( ( rule__Property__ValueAssignment_7_3 ) ) )
            // InternalDeviceParser.g:5244:1: ( ( rule__Property__ValueAssignment_7_3 ) )
            {
            // InternalDeviceParser.g:5244:1: ( ( rule__Property__ValueAssignment_7_3 ) )
            // InternalDeviceParser.g:5245:2: ( rule__Property__ValueAssignment_7_3 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_7_3());
            // InternalDeviceParser.g:5246:2: ( rule__Property__ValueAssignment_7_3 )
            // InternalDeviceParser.g:5246:3: rule__Property__ValueAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_7_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__3__Impl"


    // $ANTLR start "rule__Property__Group_7__4"
    // InternalDeviceParser.g:5254:1: rule__Property__Group_7__4 : rule__Property__Group_7__4__Impl rule__Property__Group_7__5 ;
    public final void rule__Property__Group_7__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5258:1: ( rule__Property__Group_7__4__Impl rule__Property__Group_7__5 )
            // InternalDeviceParser.g:5259:2: rule__Property__Group_7__4__Impl rule__Property__Group_7__5
            {
            pushFollow(FOLLOW_23);
            rule__Property__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__4"


    // $ANTLR start "rule__Property__Group_7__4__Impl"
    // InternalDeviceParser.g:5266:1: rule__Property__Group_7__4__Impl : ( ( rule__Property__Group_7_4__0 )* ) ;
    public final void rule__Property__Group_7__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5270:1: ( ( ( rule__Property__Group_7_4__0 )* ) )
            // InternalDeviceParser.g:5271:1: ( ( rule__Property__Group_7_4__0 )* )
            {
            // InternalDeviceParser.g:5271:1: ( ( rule__Property__Group_7_4__0 )* )
            // InternalDeviceParser.g:5272:2: ( rule__Property__Group_7_4__0 )*
            {
             before(grammarAccess.getPropertyAccess().getGroup_7_4());
            // InternalDeviceParser.g:5273:2: ( rule__Property__Group_7_4__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==HyphenMinus) ) {
                    alt36=1;
                }


                switch (alt36) {
                case 1 :
                    // InternalDeviceParser.g:5273:3: rule__Property__Group_7_4__0
                    {
                    pushFollow(FOLLOW_19);
                    rule__Property__Group_7_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop36;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getGroup_7_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__4__Impl"


    // $ANTLR start "rule__Property__Group_7__5"
    // InternalDeviceParser.g:5281:1: rule__Property__Group_7__5 : rule__Property__Group_7__5__Impl ;
    public final void rule__Property__Group_7__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5285:1: ( rule__Property__Group_7__5__Impl )
            // InternalDeviceParser.g:5286:2: rule__Property__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_7__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__5"


    // $ANTLR start "rule__Property__Group_7__5__Impl"
    // InternalDeviceParser.g:5292:1: rule__Property__Group_7__5__Impl : ( RULE_DEDENT ) ;
    public final void rule__Property__Group_7__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5296:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:5297:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:5297:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:5298:2: RULE_DEDENT
            {
             before(grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_7_5());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_7_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7__5__Impl"


    // $ANTLR start "rule__Property__Group_7_4__0"
    // InternalDeviceParser.g:5308:1: rule__Property__Group_7_4__0 : rule__Property__Group_7_4__0__Impl rule__Property__Group_7_4__1 ;
    public final void rule__Property__Group_7_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5312:1: ( rule__Property__Group_7_4__0__Impl rule__Property__Group_7_4__1 )
            // InternalDeviceParser.g:5313:2: rule__Property__Group_7_4__0__Impl rule__Property__Group_7_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Property__Group_7_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_7_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7_4__0"


    // $ANTLR start "rule__Property__Group_7_4__0__Impl"
    // InternalDeviceParser.g:5320:1: rule__Property__Group_7_4__0__Impl : ( rulePreListElement ) ;
    public final void rule__Property__Group_7_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5324:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:5325:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:5325:1: ( rulePreListElement )
            // InternalDeviceParser.g:5326:2: rulePreListElement
            {
             before(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_4_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_4_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7_4__0__Impl"


    // $ANTLR start "rule__Property__Group_7_4__1"
    // InternalDeviceParser.g:5335:1: rule__Property__Group_7_4__1 : rule__Property__Group_7_4__1__Impl ;
    public final void rule__Property__Group_7_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5339:1: ( rule__Property__Group_7_4__1__Impl )
            // InternalDeviceParser.g:5340:2: rule__Property__Group_7_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_7_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7_4__1"


    // $ANTLR start "rule__Property__Group_7_4__1__Impl"
    // InternalDeviceParser.g:5346:1: rule__Property__Group_7_4__1__Impl : ( ( rule__Property__ValueAssignment_7_4_1 ) ) ;
    public final void rule__Property__Group_7_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5350:1: ( ( ( rule__Property__ValueAssignment_7_4_1 ) ) )
            // InternalDeviceParser.g:5351:1: ( ( rule__Property__ValueAssignment_7_4_1 ) )
            {
            // InternalDeviceParser.g:5351:1: ( ( rule__Property__ValueAssignment_7_4_1 ) )
            // InternalDeviceParser.g:5352:2: ( rule__Property__ValueAssignment_7_4_1 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_7_4_1());
            // InternalDeviceParser.g:5353:2: ( rule__Property__ValueAssignment_7_4_1 )
            // InternalDeviceParser.g:5353:3: rule__Property__ValueAssignment_7_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_7_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_7_4_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_7_4__1__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__0"
    // InternalDeviceParser.g:5362:1: rule__PropertyAttribute__Group__0 : rule__PropertyAttribute__Group__0__Impl rule__PropertyAttribute__Group__1 ;
    public final void rule__PropertyAttribute__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5366:1: ( rule__PropertyAttribute__Group__0__Impl rule__PropertyAttribute__Group__1 )
            // InternalDeviceParser.g:5367:2: rule__PropertyAttribute__Group__0__Impl rule__PropertyAttribute__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PropertyAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__0"


    // $ANTLR start "rule__PropertyAttribute__Group__0__Impl"
    // InternalDeviceParser.g:5374:1: rule__PropertyAttribute__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyAttribute__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5378:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:5379:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:5379:1: ( rulePreListElement )
            // InternalDeviceParser.g:5380:2: rulePreListElement
            {
             before(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__0__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__1"
    // InternalDeviceParser.g:5389:1: rule__PropertyAttribute__Group__1 : rule__PropertyAttribute__Group__1__Impl rule__PropertyAttribute__Group__2 ;
    public final void rule__PropertyAttribute__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5393:1: ( rule__PropertyAttribute__Group__1__Impl rule__PropertyAttribute__Group__2 )
            // InternalDeviceParser.g:5394:2: rule__PropertyAttribute__Group__1__Impl rule__PropertyAttribute__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PropertyAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__1"


    // $ANTLR start "rule__PropertyAttribute__Group__1__Impl"
    // InternalDeviceParser.g:5401:1: rule__PropertyAttribute__Group__1__Impl : ( Name ) ;
    public final void rule__PropertyAttribute__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5405:1: ( ( Name ) )
            // InternalDeviceParser.g:5406:1: ( Name )
            {
            // InternalDeviceParser.g:5406:1: ( Name )
            // InternalDeviceParser.g:5407:2: Name
            {
             before(grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());
            match(input,Name,FOLLOW_2);
             after(grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__1__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__2"
    // InternalDeviceParser.g:5416:1: rule__PropertyAttribute__Group__2 : rule__PropertyAttribute__Group__2__Impl rule__PropertyAttribute__Group__3 ;
    public final void rule__PropertyAttribute__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5420:1: ( rule__PropertyAttribute__Group__2__Impl rule__PropertyAttribute__Group__3 )
            // InternalDeviceParser.g:5421:2: rule__PropertyAttribute__Group__2__Impl rule__PropertyAttribute__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PropertyAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__2"


    // $ANTLR start "rule__PropertyAttribute__Group__2__Impl"
    // InternalDeviceParser.g:5428:1: rule__PropertyAttribute__Group__2__Impl : ( ( rule__PropertyAttribute__NameAssignment_2 ) ) ;
    public final void rule__PropertyAttribute__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5432:1: ( ( ( rule__PropertyAttribute__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:5433:1: ( ( rule__PropertyAttribute__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:5433:1: ( ( rule__PropertyAttribute__NameAssignment_2 ) )
            // InternalDeviceParser.g:5434:2: ( rule__PropertyAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getNameAssignment_2());
            // InternalDeviceParser.g:5435:2: ( rule__PropertyAttribute__NameAssignment_2 )
            // InternalDeviceParser.g:5435:3: rule__PropertyAttribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAttributeAccess().getNameAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__2__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__3"
    // InternalDeviceParser.g:5443:1: rule__PropertyAttribute__Group__3 : rule__PropertyAttribute__Group__3__Impl rule__PropertyAttribute__Group__4 ;
    public final void rule__PropertyAttribute__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5447:1: ( rule__PropertyAttribute__Group__3__Impl rule__PropertyAttribute__Group__4 )
            // InternalDeviceParser.g:5448:2: rule__PropertyAttribute__Group__3__Impl rule__PropertyAttribute__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__PropertyAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__3"


    // $ANTLR start "rule__PropertyAttribute__Group__3__Impl"
    // InternalDeviceParser.g:5455:1: rule__PropertyAttribute__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyAttribute__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5459:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:5460:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:5460:1: ( RULE_INDENT )
            // InternalDeviceParser.g:5461:2: RULE_INDENT
            {
             before(grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__3__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__4"
    // InternalDeviceParser.g:5470:1: rule__PropertyAttribute__Group__4 : rule__PropertyAttribute__Group__4__Impl rule__PropertyAttribute__Group__5 ;
    public final void rule__PropertyAttribute__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5474:1: ( rule__PropertyAttribute__Group__4__Impl rule__PropertyAttribute__Group__5 )
            // InternalDeviceParser.g:5475:2: rule__PropertyAttribute__Group__4__Impl rule__PropertyAttribute__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__PropertyAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__4"


    // $ANTLR start "rule__PropertyAttribute__Group__4__Impl"
    // InternalDeviceParser.g:5482:1: rule__PropertyAttribute__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertyAttribute__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5486:1: ( ( Kind ) )
            // InternalDeviceParser.g:5487:1: ( Kind )
            {
            // InternalDeviceParser.g:5487:1: ( Kind )
            // InternalDeviceParser.g:5488:2: Kind
            {
             before(grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__4__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__5"
    // InternalDeviceParser.g:5497:1: rule__PropertyAttribute__Group__5 : rule__PropertyAttribute__Group__5__Impl rule__PropertyAttribute__Group__6 ;
    public final void rule__PropertyAttribute__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5501:1: ( rule__PropertyAttribute__Group__5__Impl rule__PropertyAttribute__Group__6 )
            // InternalDeviceParser.g:5502:2: rule__PropertyAttribute__Group__5__Impl rule__PropertyAttribute__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__PropertyAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__5"


    // $ANTLR start "rule__PropertyAttribute__Group__5__Impl"
    // InternalDeviceParser.g:5509:1: rule__PropertyAttribute__Group__5__Impl : ( ( rule__PropertyAttribute__KindAssignment_5 ) ) ;
    public final void rule__PropertyAttribute__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5513:1: ( ( ( rule__PropertyAttribute__KindAssignment_5 ) ) )
            // InternalDeviceParser.g:5514:1: ( ( rule__PropertyAttribute__KindAssignment_5 ) )
            {
            // InternalDeviceParser.g:5514:1: ( ( rule__PropertyAttribute__KindAssignment_5 ) )
            // InternalDeviceParser.g:5515:2: ( rule__PropertyAttribute__KindAssignment_5 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getKindAssignment_5());
            // InternalDeviceParser.g:5516:2: ( rule__PropertyAttribute__KindAssignment_5 )
            // InternalDeviceParser.g:5516:3: rule__PropertyAttribute__KindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__KindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAttributeAccess().getKindAssignment_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__5__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__6"
    // InternalDeviceParser.g:5524:1: rule__PropertyAttribute__Group__6 : rule__PropertyAttribute__Group__6__Impl rule__PropertyAttribute__Group__7 ;
    public final void rule__PropertyAttribute__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5528:1: ( rule__PropertyAttribute__Group__6__Impl rule__PropertyAttribute__Group__7 )
            // InternalDeviceParser.g:5529:2: rule__PropertyAttribute__Group__6__Impl rule__PropertyAttribute__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__PropertyAttribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__6"


    // $ANTLR start "rule__PropertyAttribute__Group__6__Impl"
    // InternalDeviceParser.g:5536:1: rule__PropertyAttribute__Group__6__Impl : ( ( rule__PropertyAttribute__Group_6__0 )? ) ;
    public final void rule__PropertyAttribute__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5540:1: ( ( ( rule__PropertyAttribute__Group_6__0 )? ) )
            // InternalDeviceParser.g:5541:1: ( ( rule__PropertyAttribute__Group_6__0 )? )
            {
            // InternalDeviceParser.g:5541:1: ( ( rule__PropertyAttribute__Group_6__0 )? )
            // InternalDeviceParser.g:5542:2: ( rule__PropertyAttribute__Group_6__0 )?
            {
             before(grammarAccess.getPropertyAttributeAccess().getGroup_6());
            // InternalDeviceParser.g:5543:2: ( rule__PropertyAttribute__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Description) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDeviceParser.g:5543:3: rule__PropertyAttribute__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyAttribute__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAttributeAccess().getGroup_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__6__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__7"
    // InternalDeviceParser.g:5551:1: rule__PropertyAttribute__Group__7 : rule__PropertyAttribute__Group__7__Impl rule__PropertyAttribute__Group__8 ;
    public final void rule__PropertyAttribute__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5555:1: ( rule__PropertyAttribute__Group__7__Impl rule__PropertyAttribute__Group__8 )
            // InternalDeviceParser.g:5556:2: rule__PropertyAttribute__Group__7__Impl rule__PropertyAttribute__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__PropertyAttribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__7"


    // $ANTLR start "rule__PropertyAttribute__Group__7__Impl"
    // InternalDeviceParser.g:5563:1: rule__PropertyAttribute__Group__7__Impl : ( ( rule__PropertyAttribute__Group_7__0 )? ) ;
    public final void rule__PropertyAttribute__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5567:1: ( ( ( rule__PropertyAttribute__Group_7__0 )? ) )
            // InternalDeviceParser.g:5568:1: ( ( rule__PropertyAttribute__Group_7__0 )? )
            {
            // InternalDeviceParser.g:5568:1: ( ( rule__PropertyAttribute__Group_7__0 )? )
            // InternalDeviceParser.g:5569:2: ( rule__PropertyAttribute__Group_7__0 )?
            {
             before(grammarAccess.getPropertyAttributeAccess().getGroup_7());
            // InternalDeviceParser.g:5570:2: ( rule__PropertyAttribute__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Value) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDeviceParser.g:5570:3: rule__PropertyAttribute__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyAttribute__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAttributeAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__7__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__8"
    // InternalDeviceParser.g:5578:1: rule__PropertyAttribute__Group__8 : rule__PropertyAttribute__Group__8__Impl ;
    public final void rule__PropertyAttribute__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5582:1: ( rule__PropertyAttribute__Group__8__Impl )
            // InternalDeviceParser.g:5583:2: rule__PropertyAttribute__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__8"


    // $ANTLR start "rule__PropertyAttribute__Group__8__Impl"
    // InternalDeviceParser.g:5589:1: rule__PropertyAttribute__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertyAttribute__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5593:1: ( ( ( RULE_DEDENT )? ) )
            // InternalDeviceParser.g:5594:1: ( ( RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:5594:1: ( ( RULE_DEDENT )? )
            // InternalDeviceParser.g:5595:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertyAttributeAccess().getDEDENTTerminalRuleCall_8());
            // InternalDeviceParser.g:5596:2: ( RULE_DEDENT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_DEDENT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDeviceParser.g:5596:3: RULE_DEDENT
                    {
                    match(input,RULE_DEDENT,FOLLOW_2);

                    }
                    break;

            }

             after(grammarAccess.getPropertyAttributeAccess().getDEDENTTerminalRuleCall_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group__8__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group_6__0"
    // InternalDeviceParser.g:5605:1: rule__PropertyAttribute__Group_6__0 : rule__PropertyAttribute__Group_6__0__Impl rule__PropertyAttribute__Group_6__1 ;
    public final void rule__PropertyAttribute__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5609:1: ( rule__PropertyAttribute__Group_6__0__Impl rule__PropertyAttribute__Group_6__1 )
            // InternalDeviceParser.g:5610:2: rule__PropertyAttribute__Group_6__0__Impl rule__PropertyAttribute__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__PropertyAttribute__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_6__0"


    // $ANTLR start "rule__PropertyAttribute__Group_6__0__Impl"
    // InternalDeviceParser.g:5617:1: rule__PropertyAttribute__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertyAttribute__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5621:1: ( ( Description ) )
            // InternalDeviceParser.g:5622:1: ( Description )
            {
            // InternalDeviceParser.g:5622:1: ( Description )
            // InternalDeviceParser.g:5623:2: Description
            {
             before(grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_6__0__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group_6__1"
    // InternalDeviceParser.g:5632:1: rule__PropertyAttribute__Group_6__1 : rule__PropertyAttribute__Group_6__1__Impl ;
    public final void rule__PropertyAttribute__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5636:1: ( rule__PropertyAttribute__Group_6__1__Impl )
            // InternalDeviceParser.g:5637:2: rule__PropertyAttribute__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_6__1"


    // $ANTLR start "rule__PropertyAttribute__Group_6__1__Impl"
    // InternalDeviceParser.g:5643:1: rule__PropertyAttribute__Group_6__1__Impl : ( ( rule__PropertyAttribute__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertyAttribute__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5647:1: ( ( ( rule__PropertyAttribute__DescriptionAssignment_6_1 ) ) )
            // InternalDeviceParser.g:5648:1: ( ( rule__PropertyAttribute__DescriptionAssignment_6_1 ) )
            {
            // InternalDeviceParser.g:5648:1: ( ( rule__PropertyAttribute__DescriptionAssignment_6_1 ) )
            // InternalDeviceParser.g:5649:2: ( rule__PropertyAttribute__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getDescriptionAssignment_6_1());
            // InternalDeviceParser.g:5650:2: ( rule__PropertyAttribute__DescriptionAssignment_6_1 )
            // InternalDeviceParser.g:5650:3: rule__PropertyAttribute__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAttributeAccess().getDescriptionAssignment_6_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_6__1__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group_7__0"
    // InternalDeviceParser.g:5659:1: rule__PropertyAttribute__Group_7__0 : rule__PropertyAttribute__Group_7__0__Impl rule__PropertyAttribute__Group_7__1 ;
    public final void rule__PropertyAttribute__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5663:1: ( rule__PropertyAttribute__Group_7__0__Impl rule__PropertyAttribute__Group_7__1 )
            // InternalDeviceParser.g:5664:2: rule__PropertyAttribute__Group_7__0__Impl rule__PropertyAttribute__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyAttribute__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_7__0"


    // $ANTLR start "rule__PropertyAttribute__Group_7__0__Impl"
    // InternalDeviceParser.g:5671:1: rule__PropertyAttribute__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertyAttribute__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5675:1: ( ( Value ) )
            // InternalDeviceParser.g:5676:1: ( Value )
            {
            // InternalDeviceParser.g:5676:1: ( Value )
            // InternalDeviceParser.g:5677:2: Value
            {
             before(grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_7__0__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group_7__1"
    // InternalDeviceParser.g:5686:1: rule__PropertyAttribute__Group_7__1 : rule__PropertyAttribute__Group_7__1__Impl ;
    public final void rule__PropertyAttribute__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5690:1: ( rule__PropertyAttribute__Group_7__1__Impl )
            // InternalDeviceParser.g:5691:2: rule__PropertyAttribute__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_7__1"


    // $ANTLR start "rule__PropertyAttribute__Group_7__1__Impl"
    // InternalDeviceParser.g:5697:1: rule__PropertyAttribute__Group_7__1__Impl : ( ( rule__PropertyAttribute__ValueAssignment_7_1 ) ) ;
    public final void rule__PropertyAttribute__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5701:1: ( ( ( rule__PropertyAttribute__ValueAssignment_7_1 ) ) )
            // InternalDeviceParser.g:5702:1: ( ( rule__PropertyAttribute__ValueAssignment_7_1 ) )
            {
            // InternalDeviceParser.g:5702:1: ( ( rule__PropertyAttribute__ValueAssignment_7_1 ) )
            // InternalDeviceParser.g:5703:2: ( rule__PropertyAttribute__ValueAssignment_7_1 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getValueAssignment_7_1());
            // InternalDeviceParser.g:5704:2: ( rule__PropertyAttribute__ValueAssignment_7_1 )
            // InternalDeviceParser.g:5704:3: rule__PropertyAttribute__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyAttribute__ValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAttributeAccess().getValueAssignment_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Group_7__1__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group__0"
    // InternalDeviceParser.g:5713:1: rule__PropertyMaximun__Group__0 : rule__PropertyMaximun__Group__0__Impl rule__PropertyMaximun__Group__1 ;
    public final void rule__PropertyMaximun__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5717:1: ( rule__PropertyMaximun__Group__0__Impl rule__PropertyMaximun__Group__1 )
            // InternalDeviceParser.g:5718:2: rule__PropertyMaximun__Group__0__Impl rule__PropertyMaximun__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PropertyMaximun__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__0"


    // $ANTLR start "rule__PropertyMaximun__Group__0__Impl"
    // InternalDeviceParser.g:5725:1: rule__PropertyMaximun__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyMaximun__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5729:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:5730:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:5730:1: ( rulePreListElement )
            // InternalDeviceParser.g:5731:2: rulePreListElement
            {
             before(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__0__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group__1"
    // InternalDeviceParser.g:5740:1: rule__PropertyMaximun__Group__1 : rule__PropertyMaximun__Group__1__Impl rule__PropertyMaximun__Group__2 ;
    public final void rule__PropertyMaximun__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5744:1: ( rule__PropertyMaximun__Group__1__Impl rule__PropertyMaximun__Group__2 )
            // InternalDeviceParser.g:5745:2: rule__PropertyMaximun__Group__1__Impl rule__PropertyMaximun__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PropertyMaximun__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__1"


    // $ANTLR start "rule__PropertyMaximun__Group__1__Impl"
    // InternalDeviceParser.g:5752:1: rule__PropertyMaximun__Group__1__Impl : ( Name ) ;
    public final void rule__PropertyMaximun__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5756:1: ( ( Name ) )
            // InternalDeviceParser.g:5757:1: ( Name )
            {
            // InternalDeviceParser.g:5757:1: ( Name )
            // InternalDeviceParser.g:5758:2: Name
            {
             before(grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());
            match(input,Name,FOLLOW_2);
             after(grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__1__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group__2"
    // InternalDeviceParser.g:5767:1: rule__PropertyMaximun__Group__2 : rule__PropertyMaximun__Group__2__Impl rule__PropertyMaximun__Group__3 ;
    public final void rule__PropertyMaximun__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5771:1: ( rule__PropertyMaximun__Group__2__Impl rule__PropertyMaximun__Group__3 )
            // InternalDeviceParser.g:5772:2: rule__PropertyMaximun__Group__2__Impl rule__PropertyMaximun__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PropertyMaximun__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__2"


    // $ANTLR start "rule__PropertyMaximun__Group__2__Impl"
    // InternalDeviceParser.g:5779:1: rule__PropertyMaximun__Group__2__Impl : ( ( rule__PropertyMaximun__NameAssignment_2 ) ) ;
    public final void rule__PropertyMaximun__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5783:1: ( ( ( rule__PropertyMaximun__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:5784:1: ( ( rule__PropertyMaximun__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:5784:1: ( ( rule__PropertyMaximun__NameAssignment_2 ) )
            // InternalDeviceParser.g:5785:2: ( rule__PropertyMaximun__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getNameAssignment_2());
            // InternalDeviceParser.g:5786:2: ( rule__PropertyMaximun__NameAssignment_2 )
            // InternalDeviceParser.g:5786:3: rule__PropertyMaximun__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMaximunAccess().getNameAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__2__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group__3"
    // InternalDeviceParser.g:5794:1: rule__PropertyMaximun__Group__3 : rule__PropertyMaximun__Group__3__Impl rule__PropertyMaximun__Group__4 ;
    public final void rule__PropertyMaximun__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5798:1: ( rule__PropertyMaximun__Group__3__Impl rule__PropertyMaximun__Group__4 )
            // InternalDeviceParser.g:5799:2: rule__PropertyMaximun__Group__3__Impl rule__PropertyMaximun__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__PropertyMaximun__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__3"


    // $ANTLR start "rule__PropertyMaximun__Group__3__Impl"
    // InternalDeviceParser.g:5806:1: rule__PropertyMaximun__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyMaximun__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5810:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:5811:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:5811:1: ( RULE_INDENT )
            // InternalDeviceParser.g:5812:2: RULE_INDENT
            {
             before(grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__3__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group__4"
    // InternalDeviceParser.g:5821:1: rule__PropertyMaximun__Group__4 : rule__PropertyMaximun__Group__4__Impl rule__PropertyMaximun__Group__5 ;
    public final void rule__PropertyMaximun__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5825:1: ( rule__PropertyMaximun__Group__4__Impl rule__PropertyMaximun__Group__5 )
            // InternalDeviceParser.g:5826:2: rule__PropertyMaximun__Group__4__Impl rule__PropertyMaximun__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__PropertyMaximun__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__4"


    // $ANTLR start "rule__PropertyMaximun__Group__4__Impl"
    // InternalDeviceParser.g:5833:1: rule__PropertyMaximun__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertyMaximun__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5837:1: ( ( Kind ) )
            // InternalDeviceParser.g:5838:1: ( Kind )
            {
            // InternalDeviceParser.g:5838:1: ( Kind )
            // InternalDeviceParser.g:5839:2: Kind
            {
             before(grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__4__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group__5"
    // InternalDeviceParser.g:5848:1: rule__PropertyMaximun__Group__5 : rule__PropertyMaximun__Group__5__Impl rule__PropertyMaximun__Group__6 ;
    public final void rule__PropertyMaximun__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5852:1: ( rule__PropertyMaximun__Group__5__Impl rule__PropertyMaximun__Group__6 )
            // InternalDeviceParser.g:5853:2: rule__PropertyMaximun__Group__5__Impl rule__PropertyMaximun__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__PropertyMaximun__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__5"


    // $ANTLR start "rule__PropertyMaximun__Group__5__Impl"
    // InternalDeviceParser.g:5860:1: rule__PropertyMaximun__Group__5__Impl : ( ( rule__PropertyMaximun__KindAssignment_5 ) ) ;
    public final void rule__PropertyMaximun__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5864:1: ( ( ( rule__PropertyMaximun__KindAssignment_5 ) ) )
            // InternalDeviceParser.g:5865:1: ( ( rule__PropertyMaximun__KindAssignment_5 ) )
            {
            // InternalDeviceParser.g:5865:1: ( ( rule__PropertyMaximun__KindAssignment_5 ) )
            // InternalDeviceParser.g:5866:2: ( rule__PropertyMaximun__KindAssignment_5 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getKindAssignment_5());
            // InternalDeviceParser.g:5867:2: ( rule__PropertyMaximun__KindAssignment_5 )
            // InternalDeviceParser.g:5867:3: rule__PropertyMaximun__KindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__KindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMaximunAccess().getKindAssignment_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__5__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group__6"
    // InternalDeviceParser.g:5875:1: rule__PropertyMaximun__Group__6 : rule__PropertyMaximun__Group__6__Impl rule__PropertyMaximun__Group__7 ;
    public final void rule__PropertyMaximun__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5879:1: ( rule__PropertyMaximun__Group__6__Impl rule__PropertyMaximun__Group__7 )
            // InternalDeviceParser.g:5880:2: rule__PropertyMaximun__Group__6__Impl rule__PropertyMaximun__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__PropertyMaximun__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__6"


    // $ANTLR start "rule__PropertyMaximun__Group__6__Impl"
    // InternalDeviceParser.g:5887:1: rule__PropertyMaximun__Group__6__Impl : ( ( rule__PropertyMaximun__Group_6__0 )? ) ;
    public final void rule__PropertyMaximun__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5891:1: ( ( ( rule__PropertyMaximun__Group_6__0 )? ) )
            // InternalDeviceParser.g:5892:1: ( ( rule__PropertyMaximun__Group_6__0 )? )
            {
            // InternalDeviceParser.g:5892:1: ( ( rule__PropertyMaximun__Group_6__0 )? )
            // InternalDeviceParser.g:5893:2: ( rule__PropertyMaximun__Group_6__0 )?
            {
             before(grammarAccess.getPropertyMaximunAccess().getGroup_6());
            // InternalDeviceParser.g:5894:2: ( rule__PropertyMaximun__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Description) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDeviceParser.g:5894:3: rule__PropertyMaximun__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyMaximun__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyMaximunAccess().getGroup_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__6__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group__7"
    // InternalDeviceParser.g:5902:1: rule__PropertyMaximun__Group__7 : rule__PropertyMaximun__Group__7__Impl rule__PropertyMaximun__Group__8 ;
    public final void rule__PropertyMaximun__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5906:1: ( rule__PropertyMaximun__Group__7__Impl rule__PropertyMaximun__Group__8 )
            // InternalDeviceParser.g:5907:2: rule__PropertyMaximun__Group__7__Impl rule__PropertyMaximun__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__PropertyMaximun__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__7"


    // $ANTLR start "rule__PropertyMaximun__Group__7__Impl"
    // InternalDeviceParser.g:5914:1: rule__PropertyMaximun__Group__7__Impl : ( ( rule__PropertyMaximun__Group_7__0 )? ) ;
    public final void rule__PropertyMaximun__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5918:1: ( ( ( rule__PropertyMaximun__Group_7__0 )? ) )
            // InternalDeviceParser.g:5919:1: ( ( rule__PropertyMaximun__Group_7__0 )? )
            {
            // InternalDeviceParser.g:5919:1: ( ( rule__PropertyMaximun__Group_7__0 )? )
            // InternalDeviceParser.g:5920:2: ( rule__PropertyMaximun__Group_7__0 )?
            {
             before(grammarAccess.getPropertyMaximunAccess().getGroup_7());
            // InternalDeviceParser.g:5921:2: ( rule__PropertyMaximun__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Value) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDeviceParser.g:5921:3: rule__PropertyMaximun__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyMaximun__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyMaximunAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__7__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group__8"
    // InternalDeviceParser.g:5929:1: rule__PropertyMaximun__Group__8 : rule__PropertyMaximun__Group__8__Impl ;
    public final void rule__PropertyMaximun__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5933:1: ( rule__PropertyMaximun__Group__8__Impl )
            // InternalDeviceParser.g:5934:2: rule__PropertyMaximun__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__8"


    // $ANTLR start "rule__PropertyMaximun__Group__8__Impl"
    // InternalDeviceParser.g:5940:1: rule__PropertyMaximun__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertyMaximun__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5944:1: ( ( ( RULE_DEDENT )? ) )
            // InternalDeviceParser.g:5945:1: ( ( RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:5945:1: ( ( RULE_DEDENT )? )
            // InternalDeviceParser.g:5946:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertyMaximunAccess().getDEDENTTerminalRuleCall_8());
            // InternalDeviceParser.g:5947:2: ( RULE_DEDENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DEDENT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDeviceParser.g:5947:3: RULE_DEDENT
                    {
                    match(input,RULE_DEDENT,FOLLOW_2);

                    }
                    break;

            }

             after(grammarAccess.getPropertyMaximunAccess().getDEDENTTerminalRuleCall_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group__8__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group_6__0"
    // InternalDeviceParser.g:5956:1: rule__PropertyMaximun__Group_6__0 : rule__PropertyMaximun__Group_6__0__Impl rule__PropertyMaximun__Group_6__1 ;
    public final void rule__PropertyMaximun__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5960:1: ( rule__PropertyMaximun__Group_6__0__Impl rule__PropertyMaximun__Group_6__1 )
            // InternalDeviceParser.g:5961:2: rule__PropertyMaximun__Group_6__0__Impl rule__PropertyMaximun__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__PropertyMaximun__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group_6__0"


    // $ANTLR start "rule__PropertyMaximun__Group_6__0__Impl"
    // InternalDeviceParser.g:5968:1: rule__PropertyMaximun__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertyMaximun__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5972:1: ( ( Description ) )
            // InternalDeviceParser.g:5973:1: ( Description )
            {
            // InternalDeviceParser.g:5973:1: ( Description )
            // InternalDeviceParser.g:5974:2: Description
            {
             before(grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group_6__0__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group_6__1"
    // InternalDeviceParser.g:5983:1: rule__PropertyMaximun__Group_6__1 : rule__PropertyMaximun__Group_6__1__Impl ;
    public final void rule__PropertyMaximun__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5987:1: ( rule__PropertyMaximun__Group_6__1__Impl )
            // InternalDeviceParser.g:5988:2: rule__PropertyMaximun__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group_6__1"


    // $ANTLR start "rule__PropertyMaximun__Group_6__1__Impl"
    // InternalDeviceParser.g:5994:1: rule__PropertyMaximun__Group_6__1__Impl : ( ( rule__PropertyMaximun__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertyMaximun__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:5998:1: ( ( ( rule__PropertyMaximun__DescriptionAssignment_6_1 ) ) )
            // InternalDeviceParser.g:5999:1: ( ( rule__PropertyMaximun__DescriptionAssignment_6_1 ) )
            {
            // InternalDeviceParser.g:5999:1: ( ( rule__PropertyMaximun__DescriptionAssignment_6_1 ) )
            // InternalDeviceParser.g:6000:2: ( rule__PropertyMaximun__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getDescriptionAssignment_6_1());
            // InternalDeviceParser.g:6001:2: ( rule__PropertyMaximun__DescriptionAssignment_6_1 )
            // InternalDeviceParser.g:6001:3: rule__PropertyMaximun__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMaximunAccess().getDescriptionAssignment_6_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group_6__1__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group_7__0"
    // InternalDeviceParser.g:6010:1: rule__PropertyMaximun__Group_7__0 : rule__PropertyMaximun__Group_7__0__Impl rule__PropertyMaximun__Group_7__1 ;
    public final void rule__PropertyMaximun__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6014:1: ( rule__PropertyMaximun__Group_7__0__Impl rule__PropertyMaximun__Group_7__1 )
            // InternalDeviceParser.g:6015:2: rule__PropertyMaximun__Group_7__0__Impl rule__PropertyMaximun__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyMaximun__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group_7__0"


    // $ANTLR start "rule__PropertyMaximun__Group_7__0__Impl"
    // InternalDeviceParser.g:6022:1: rule__PropertyMaximun__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertyMaximun__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6026:1: ( ( Value ) )
            // InternalDeviceParser.g:6027:1: ( Value )
            {
            // InternalDeviceParser.g:6027:1: ( Value )
            // InternalDeviceParser.g:6028:2: Value
            {
             before(grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group_7__0__Impl"


    // $ANTLR start "rule__PropertyMaximun__Group_7__1"
    // InternalDeviceParser.g:6037:1: rule__PropertyMaximun__Group_7__1 : rule__PropertyMaximun__Group_7__1__Impl ;
    public final void rule__PropertyMaximun__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6041:1: ( rule__PropertyMaximun__Group_7__1__Impl )
            // InternalDeviceParser.g:6042:2: rule__PropertyMaximun__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group_7__1"


    // $ANTLR start "rule__PropertyMaximun__Group_7__1__Impl"
    // InternalDeviceParser.g:6048:1: rule__PropertyMaximun__Group_7__1__Impl : ( ( rule__PropertyMaximun__ValueAssignment_7_1 ) ) ;
    public final void rule__PropertyMaximun__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6052:1: ( ( ( rule__PropertyMaximun__ValueAssignment_7_1 ) ) )
            // InternalDeviceParser.g:6053:1: ( ( rule__PropertyMaximun__ValueAssignment_7_1 ) )
            {
            // InternalDeviceParser.g:6053:1: ( ( rule__PropertyMaximun__ValueAssignment_7_1 ) )
            // InternalDeviceParser.g:6054:2: ( rule__PropertyMaximun__ValueAssignment_7_1 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getValueAssignment_7_1());
            // InternalDeviceParser.g:6055:2: ( rule__PropertyMaximun__ValueAssignment_7_1 )
            // InternalDeviceParser.g:6055:3: rule__PropertyMaximun__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMaximun__ValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMaximunAccess().getValueAssignment_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__Group_7__1__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group__0"
    // InternalDeviceParser.g:6064:1: rule__PropertyMinimum__Group__0 : rule__PropertyMinimum__Group__0__Impl rule__PropertyMinimum__Group__1 ;
    public final void rule__PropertyMinimum__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6068:1: ( rule__PropertyMinimum__Group__0__Impl rule__PropertyMinimum__Group__1 )
            // InternalDeviceParser.g:6069:2: rule__PropertyMinimum__Group__0__Impl rule__PropertyMinimum__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PropertyMinimum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__0"


    // $ANTLR start "rule__PropertyMinimum__Group__0__Impl"
    // InternalDeviceParser.g:6076:1: rule__PropertyMinimum__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyMinimum__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6080:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:6081:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:6081:1: ( rulePreListElement )
            // InternalDeviceParser.g:6082:2: rulePreListElement
            {
             before(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__0__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group__1"
    // InternalDeviceParser.g:6091:1: rule__PropertyMinimum__Group__1 : rule__PropertyMinimum__Group__1__Impl rule__PropertyMinimum__Group__2 ;
    public final void rule__PropertyMinimum__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6095:1: ( rule__PropertyMinimum__Group__1__Impl rule__PropertyMinimum__Group__2 )
            // InternalDeviceParser.g:6096:2: rule__PropertyMinimum__Group__1__Impl rule__PropertyMinimum__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PropertyMinimum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__1"


    // $ANTLR start "rule__PropertyMinimum__Group__1__Impl"
    // InternalDeviceParser.g:6103:1: rule__PropertyMinimum__Group__1__Impl : ( Name ) ;
    public final void rule__PropertyMinimum__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6107:1: ( ( Name ) )
            // InternalDeviceParser.g:6108:1: ( Name )
            {
            // InternalDeviceParser.g:6108:1: ( Name )
            // InternalDeviceParser.g:6109:2: Name
            {
             before(grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());
            match(input,Name,FOLLOW_2);
             after(grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__1__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group__2"
    // InternalDeviceParser.g:6118:1: rule__PropertyMinimum__Group__2 : rule__PropertyMinimum__Group__2__Impl rule__PropertyMinimum__Group__3 ;
    public final void rule__PropertyMinimum__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6122:1: ( rule__PropertyMinimum__Group__2__Impl rule__PropertyMinimum__Group__3 )
            // InternalDeviceParser.g:6123:2: rule__PropertyMinimum__Group__2__Impl rule__PropertyMinimum__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PropertyMinimum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__2"


    // $ANTLR start "rule__PropertyMinimum__Group__2__Impl"
    // InternalDeviceParser.g:6130:1: rule__PropertyMinimum__Group__2__Impl : ( ( rule__PropertyMinimum__NameAssignment_2 ) ) ;
    public final void rule__PropertyMinimum__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6134:1: ( ( ( rule__PropertyMinimum__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:6135:1: ( ( rule__PropertyMinimum__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:6135:1: ( ( rule__PropertyMinimum__NameAssignment_2 ) )
            // InternalDeviceParser.g:6136:2: ( rule__PropertyMinimum__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getNameAssignment_2());
            // InternalDeviceParser.g:6137:2: ( rule__PropertyMinimum__NameAssignment_2 )
            // InternalDeviceParser.g:6137:3: rule__PropertyMinimum__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMinimumAccess().getNameAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__2__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group__3"
    // InternalDeviceParser.g:6145:1: rule__PropertyMinimum__Group__3 : rule__PropertyMinimum__Group__3__Impl rule__PropertyMinimum__Group__4 ;
    public final void rule__PropertyMinimum__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6149:1: ( rule__PropertyMinimum__Group__3__Impl rule__PropertyMinimum__Group__4 )
            // InternalDeviceParser.g:6150:2: rule__PropertyMinimum__Group__3__Impl rule__PropertyMinimum__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__PropertyMinimum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__3"


    // $ANTLR start "rule__PropertyMinimum__Group__3__Impl"
    // InternalDeviceParser.g:6157:1: rule__PropertyMinimum__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyMinimum__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6161:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:6162:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:6162:1: ( RULE_INDENT )
            // InternalDeviceParser.g:6163:2: RULE_INDENT
            {
             before(grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__3__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group__4"
    // InternalDeviceParser.g:6172:1: rule__PropertyMinimum__Group__4 : rule__PropertyMinimum__Group__4__Impl rule__PropertyMinimum__Group__5 ;
    public final void rule__PropertyMinimum__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6176:1: ( rule__PropertyMinimum__Group__4__Impl rule__PropertyMinimum__Group__5 )
            // InternalDeviceParser.g:6177:2: rule__PropertyMinimum__Group__4__Impl rule__PropertyMinimum__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__PropertyMinimum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__4"


    // $ANTLR start "rule__PropertyMinimum__Group__4__Impl"
    // InternalDeviceParser.g:6184:1: rule__PropertyMinimum__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertyMinimum__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6188:1: ( ( Kind ) )
            // InternalDeviceParser.g:6189:1: ( Kind )
            {
            // InternalDeviceParser.g:6189:1: ( Kind )
            // InternalDeviceParser.g:6190:2: Kind
            {
             before(grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__4__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group__5"
    // InternalDeviceParser.g:6199:1: rule__PropertyMinimum__Group__5 : rule__PropertyMinimum__Group__5__Impl rule__PropertyMinimum__Group__6 ;
    public final void rule__PropertyMinimum__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6203:1: ( rule__PropertyMinimum__Group__5__Impl rule__PropertyMinimum__Group__6 )
            // InternalDeviceParser.g:6204:2: rule__PropertyMinimum__Group__5__Impl rule__PropertyMinimum__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__PropertyMinimum__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__5"


    // $ANTLR start "rule__PropertyMinimum__Group__5__Impl"
    // InternalDeviceParser.g:6211:1: rule__PropertyMinimum__Group__5__Impl : ( ( rule__PropertyMinimum__KindAssignment_5 ) ) ;
    public final void rule__PropertyMinimum__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6215:1: ( ( ( rule__PropertyMinimum__KindAssignment_5 ) ) )
            // InternalDeviceParser.g:6216:1: ( ( rule__PropertyMinimum__KindAssignment_5 ) )
            {
            // InternalDeviceParser.g:6216:1: ( ( rule__PropertyMinimum__KindAssignment_5 ) )
            // InternalDeviceParser.g:6217:2: ( rule__PropertyMinimum__KindAssignment_5 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getKindAssignment_5());
            // InternalDeviceParser.g:6218:2: ( rule__PropertyMinimum__KindAssignment_5 )
            // InternalDeviceParser.g:6218:3: rule__PropertyMinimum__KindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__KindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMinimumAccess().getKindAssignment_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__5__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group__6"
    // InternalDeviceParser.g:6226:1: rule__PropertyMinimum__Group__6 : rule__PropertyMinimum__Group__6__Impl rule__PropertyMinimum__Group__7 ;
    public final void rule__PropertyMinimum__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6230:1: ( rule__PropertyMinimum__Group__6__Impl rule__PropertyMinimum__Group__7 )
            // InternalDeviceParser.g:6231:2: rule__PropertyMinimum__Group__6__Impl rule__PropertyMinimum__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__PropertyMinimum__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__6"


    // $ANTLR start "rule__PropertyMinimum__Group__6__Impl"
    // InternalDeviceParser.g:6238:1: rule__PropertyMinimum__Group__6__Impl : ( ( rule__PropertyMinimum__Group_6__0 )? ) ;
    public final void rule__PropertyMinimum__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6242:1: ( ( ( rule__PropertyMinimum__Group_6__0 )? ) )
            // InternalDeviceParser.g:6243:1: ( ( rule__PropertyMinimum__Group_6__0 )? )
            {
            // InternalDeviceParser.g:6243:1: ( ( rule__PropertyMinimum__Group_6__0 )? )
            // InternalDeviceParser.g:6244:2: ( rule__PropertyMinimum__Group_6__0 )?
            {
             before(grammarAccess.getPropertyMinimumAccess().getGroup_6());
            // InternalDeviceParser.g:6245:2: ( rule__PropertyMinimum__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Description) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDeviceParser.g:6245:3: rule__PropertyMinimum__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyMinimum__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyMinimumAccess().getGroup_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__6__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group__7"
    // InternalDeviceParser.g:6253:1: rule__PropertyMinimum__Group__7 : rule__PropertyMinimum__Group__7__Impl rule__PropertyMinimum__Group__8 ;
    public final void rule__PropertyMinimum__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6257:1: ( rule__PropertyMinimum__Group__7__Impl rule__PropertyMinimum__Group__8 )
            // InternalDeviceParser.g:6258:2: rule__PropertyMinimum__Group__7__Impl rule__PropertyMinimum__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__PropertyMinimum__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__7"


    // $ANTLR start "rule__PropertyMinimum__Group__7__Impl"
    // InternalDeviceParser.g:6265:1: rule__PropertyMinimum__Group__7__Impl : ( ( rule__PropertyMinimum__Group_7__0 )? ) ;
    public final void rule__PropertyMinimum__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6269:1: ( ( ( rule__PropertyMinimum__Group_7__0 )? ) )
            // InternalDeviceParser.g:6270:1: ( ( rule__PropertyMinimum__Group_7__0 )? )
            {
            // InternalDeviceParser.g:6270:1: ( ( rule__PropertyMinimum__Group_7__0 )? )
            // InternalDeviceParser.g:6271:2: ( rule__PropertyMinimum__Group_7__0 )?
            {
             before(grammarAccess.getPropertyMinimumAccess().getGroup_7());
            // InternalDeviceParser.g:6272:2: ( rule__PropertyMinimum__Group_7__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Value) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDeviceParser.g:6272:3: rule__PropertyMinimum__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyMinimum__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyMinimumAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__7__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group__8"
    // InternalDeviceParser.g:6280:1: rule__PropertyMinimum__Group__8 : rule__PropertyMinimum__Group__8__Impl ;
    public final void rule__PropertyMinimum__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6284:1: ( rule__PropertyMinimum__Group__8__Impl )
            // InternalDeviceParser.g:6285:2: rule__PropertyMinimum__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__8"


    // $ANTLR start "rule__PropertyMinimum__Group__8__Impl"
    // InternalDeviceParser.g:6291:1: rule__PropertyMinimum__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertyMinimum__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6295:1: ( ( ( RULE_DEDENT )? ) )
            // InternalDeviceParser.g:6296:1: ( ( RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:6296:1: ( ( RULE_DEDENT )? )
            // InternalDeviceParser.g:6297:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertyMinimumAccess().getDEDENTTerminalRuleCall_8());
            // InternalDeviceParser.g:6298:2: ( RULE_DEDENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DEDENT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDeviceParser.g:6298:3: RULE_DEDENT
                    {
                    match(input,RULE_DEDENT,FOLLOW_2);

                    }
                    break;

            }

             after(grammarAccess.getPropertyMinimumAccess().getDEDENTTerminalRuleCall_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group__8__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group_6__0"
    // InternalDeviceParser.g:6307:1: rule__PropertyMinimum__Group_6__0 : rule__PropertyMinimum__Group_6__0__Impl rule__PropertyMinimum__Group_6__1 ;
    public final void rule__PropertyMinimum__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6311:1: ( rule__PropertyMinimum__Group_6__0__Impl rule__PropertyMinimum__Group_6__1 )
            // InternalDeviceParser.g:6312:2: rule__PropertyMinimum__Group_6__0__Impl rule__PropertyMinimum__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__PropertyMinimum__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group_6__0"


    // $ANTLR start "rule__PropertyMinimum__Group_6__0__Impl"
    // InternalDeviceParser.g:6319:1: rule__PropertyMinimum__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertyMinimum__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6323:1: ( ( Description ) )
            // InternalDeviceParser.g:6324:1: ( Description )
            {
            // InternalDeviceParser.g:6324:1: ( Description )
            // InternalDeviceParser.g:6325:2: Description
            {
             before(grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group_6__0__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group_6__1"
    // InternalDeviceParser.g:6334:1: rule__PropertyMinimum__Group_6__1 : rule__PropertyMinimum__Group_6__1__Impl ;
    public final void rule__PropertyMinimum__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6338:1: ( rule__PropertyMinimum__Group_6__1__Impl )
            // InternalDeviceParser.g:6339:2: rule__PropertyMinimum__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group_6__1"


    // $ANTLR start "rule__PropertyMinimum__Group_6__1__Impl"
    // InternalDeviceParser.g:6345:1: rule__PropertyMinimum__Group_6__1__Impl : ( ( rule__PropertyMinimum__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertyMinimum__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6349:1: ( ( ( rule__PropertyMinimum__DescriptionAssignment_6_1 ) ) )
            // InternalDeviceParser.g:6350:1: ( ( rule__PropertyMinimum__DescriptionAssignment_6_1 ) )
            {
            // InternalDeviceParser.g:6350:1: ( ( rule__PropertyMinimum__DescriptionAssignment_6_1 ) )
            // InternalDeviceParser.g:6351:2: ( rule__PropertyMinimum__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getDescriptionAssignment_6_1());
            // InternalDeviceParser.g:6352:2: ( rule__PropertyMinimum__DescriptionAssignment_6_1 )
            // InternalDeviceParser.g:6352:3: rule__PropertyMinimum__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMinimumAccess().getDescriptionAssignment_6_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group_6__1__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group_7__0"
    // InternalDeviceParser.g:6361:1: rule__PropertyMinimum__Group_7__0 : rule__PropertyMinimum__Group_7__0__Impl rule__PropertyMinimum__Group_7__1 ;
    public final void rule__PropertyMinimum__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6365:1: ( rule__PropertyMinimum__Group_7__0__Impl rule__PropertyMinimum__Group_7__1 )
            // InternalDeviceParser.g:6366:2: rule__PropertyMinimum__Group_7__0__Impl rule__PropertyMinimum__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertyMinimum__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group_7__0"


    // $ANTLR start "rule__PropertyMinimum__Group_7__0__Impl"
    // InternalDeviceParser.g:6373:1: rule__PropertyMinimum__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertyMinimum__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6377:1: ( ( Value ) )
            // InternalDeviceParser.g:6378:1: ( Value )
            {
            // InternalDeviceParser.g:6378:1: ( Value )
            // InternalDeviceParser.g:6379:2: Value
            {
             before(grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group_7__0__Impl"


    // $ANTLR start "rule__PropertyMinimum__Group_7__1"
    // InternalDeviceParser.g:6388:1: rule__PropertyMinimum__Group_7__1 : rule__PropertyMinimum__Group_7__1__Impl ;
    public final void rule__PropertyMinimum__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6392:1: ( rule__PropertyMinimum__Group_7__1__Impl )
            // InternalDeviceParser.g:6393:2: rule__PropertyMinimum__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group_7__1"


    // $ANTLR start "rule__PropertyMinimum__Group_7__1__Impl"
    // InternalDeviceParser.g:6399:1: rule__PropertyMinimum__Group_7__1__Impl : ( ( rule__PropertyMinimum__ValueAssignment_7_1 ) ) ;
    public final void rule__PropertyMinimum__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6403:1: ( ( ( rule__PropertyMinimum__ValueAssignment_7_1 ) ) )
            // InternalDeviceParser.g:6404:1: ( ( rule__PropertyMinimum__ValueAssignment_7_1 ) )
            {
            // InternalDeviceParser.g:6404:1: ( ( rule__PropertyMinimum__ValueAssignment_7_1 ) )
            // InternalDeviceParser.g:6405:2: ( rule__PropertyMinimum__ValueAssignment_7_1 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getValueAssignment_7_1());
            // InternalDeviceParser.g:6406:2: ( rule__PropertyMinimum__ValueAssignment_7_1 )
            // InternalDeviceParser.g:6406:3: rule__PropertyMinimum__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyMinimum__ValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMinimumAccess().getValueAssignment_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__Group_7__1__Impl"


    // $ANTLR start "rule__PropertySelection__Group__0"
    // InternalDeviceParser.g:6415:1: rule__PropertySelection__Group__0 : rule__PropertySelection__Group__0__Impl rule__PropertySelection__Group__1 ;
    public final void rule__PropertySelection__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6419:1: ( rule__PropertySelection__Group__0__Impl rule__PropertySelection__Group__1 )
            // InternalDeviceParser.g:6420:2: rule__PropertySelection__Group__0__Impl rule__PropertySelection__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PropertySelection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__0"


    // $ANTLR start "rule__PropertySelection__Group__0__Impl"
    // InternalDeviceParser.g:6427:1: rule__PropertySelection__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertySelection__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6431:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:6432:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:6432:1: ( rulePreListElement )
            // InternalDeviceParser.g:6433:2: rulePreListElement
            {
             before(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__0__Impl"


    // $ANTLR start "rule__PropertySelection__Group__1"
    // InternalDeviceParser.g:6442:1: rule__PropertySelection__Group__1 : rule__PropertySelection__Group__1__Impl rule__PropertySelection__Group__2 ;
    public final void rule__PropertySelection__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6446:1: ( rule__PropertySelection__Group__1__Impl rule__PropertySelection__Group__2 )
            // InternalDeviceParser.g:6447:2: rule__PropertySelection__Group__1__Impl rule__PropertySelection__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PropertySelection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__1"


    // $ANTLR start "rule__PropertySelection__Group__1__Impl"
    // InternalDeviceParser.g:6454:1: rule__PropertySelection__Group__1__Impl : ( Name ) ;
    public final void rule__PropertySelection__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6458:1: ( ( Name ) )
            // InternalDeviceParser.g:6459:1: ( Name )
            {
            // InternalDeviceParser.g:6459:1: ( Name )
            // InternalDeviceParser.g:6460:2: Name
            {
             before(grammarAccess.getPropertySelectionAccess().getNameKeyword_1());
            match(input,Name,FOLLOW_2);
             after(grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__1__Impl"


    // $ANTLR start "rule__PropertySelection__Group__2"
    // InternalDeviceParser.g:6469:1: rule__PropertySelection__Group__2 : rule__PropertySelection__Group__2__Impl rule__PropertySelection__Group__3 ;
    public final void rule__PropertySelection__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6473:1: ( rule__PropertySelection__Group__2__Impl rule__PropertySelection__Group__3 )
            // InternalDeviceParser.g:6474:2: rule__PropertySelection__Group__2__Impl rule__PropertySelection__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PropertySelection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__2"


    // $ANTLR start "rule__PropertySelection__Group__2__Impl"
    // InternalDeviceParser.g:6481:1: rule__PropertySelection__Group__2__Impl : ( ( rule__PropertySelection__NameAssignment_2 ) ) ;
    public final void rule__PropertySelection__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6485:1: ( ( ( rule__PropertySelection__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:6486:1: ( ( rule__PropertySelection__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:6486:1: ( ( rule__PropertySelection__NameAssignment_2 ) )
            // InternalDeviceParser.g:6487:2: ( rule__PropertySelection__NameAssignment_2 )
            {
             before(grammarAccess.getPropertySelectionAccess().getNameAssignment_2());
            // InternalDeviceParser.g:6488:2: ( rule__PropertySelection__NameAssignment_2 )
            // InternalDeviceParser.g:6488:3: rule__PropertySelection__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectionAccess().getNameAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__2__Impl"


    // $ANTLR start "rule__PropertySelection__Group__3"
    // InternalDeviceParser.g:6496:1: rule__PropertySelection__Group__3 : rule__PropertySelection__Group__3__Impl rule__PropertySelection__Group__4 ;
    public final void rule__PropertySelection__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6500:1: ( rule__PropertySelection__Group__3__Impl rule__PropertySelection__Group__4 )
            // InternalDeviceParser.g:6501:2: rule__PropertySelection__Group__3__Impl rule__PropertySelection__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__PropertySelection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__3"


    // $ANTLR start "rule__PropertySelection__Group__3__Impl"
    // InternalDeviceParser.g:6508:1: rule__PropertySelection__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertySelection__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6512:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:6513:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:6513:1: ( RULE_INDENT )
            // InternalDeviceParser.g:6514:2: RULE_INDENT
            {
             before(grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__3__Impl"


    // $ANTLR start "rule__PropertySelection__Group__4"
    // InternalDeviceParser.g:6523:1: rule__PropertySelection__Group__4 : rule__PropertySelection__Group__4__Impl rule__PropertySelection__Group__5 ;
    public final void rule__PropertySelection__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6527:1: ( rule__PropertySelection__Group__4__Impl rule__PropertySelection__Group__5 )
            // InternalDeviceParser.g:6528:2: rule__PropertySelection__Group__4__Impl rule__PropertySelection__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__PropertySelection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__4"


    // $ANTLR start "rule__PropertySelection__Group__4__Impl"
    // InternalDeviceParser.g:6535:1: rule__PropertySelection__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertySelection__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6539:1: ( ( Kind ) )
            // InternalDeviceParser.g:6540:1: ( Kind )
            {
            // InternalDeviceParser.g:6540:1: ( Kind )
            // InternalDeviceParser.g:6541:2: Kind
            {
             before(grammarAccess.getPropertySelectionAccess().getKindKeyword_4());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__4__Impl"


    // $ANTLR start "rule__PropertySelection__Group__5"
    // InternalDeviceParser.g:6550:1: rule__PropertySelection__Group__5 : rule__PropertySelection__Group__5__Impl rule__PropertySelection__Group__6 ;
    public final void rule__PropertySelection__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6554:1: ( rule__PropertySelection__Group__5__Impl rule__PropertySelection__Group__6 )
            // InternalDeviceParser.g:6555:2: rule__PropertySelection__Group__5__Impl rule__PropertySelection__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__PropertySelection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__5"


    // $ANTLR start "rule__PropertySelection__Group__5__Impl"
    // InternalDeviceParser.g:6562:1: rule__PropertySelection__Group__5__Impl : ( ( rule__PropertySelection__KindAssignment_5 ) ) ;
    public final void rule__PropertySelection__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6566:1: ( ( ( rule__PropertySelection__KindAssignment_5 ) ) )
            // InternalDeviceParser.g:6567:1: ( ( rule__PropertySelection__KindAssignment_5 ) )
            {
            // InternalDeviceParser.g:6567:1: ( ( rule__PropertySelection__KindAssignment_5 ) )
            // InternalDeviceParser.g:6568:2: ( rule__PropertySelection__KindAssignment_5 )
            {
             before(grammarAccess.getPropertySelectionAccess().getKindAssignment_5());
            // InternalDeviceParser.g:6569:2: ( rule__PropertySelection__KindAssignment_5 )
            // InternalDeviceParser.g:6569:3: rule__PropertySelection__KindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__KindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectionAccess().getKindAssignment_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__5__Impl"


    // $ANTLR start "rule__PropertySelection__Group__6"
    // InternalDeviceParser.g:6577:1: rule__PropertySelection__Group__6 : rule__PropertySelection__Group__6__Impl rule__PropertySelection__Group__7 ;
    public final void rule__PropertySelection__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6581:1: ( rule__PropertySelection__Group__6__Impl rule__PropertySelection__Group__7 )
            // InternalDeviceParser.g:6582:2: rule__PropertySelection__Group__6__Impl rule__PropertySelection__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__PropertySelection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__6"


    // $ANTLR start "rule__PropertySelection__Group__6__Impl"
    // InternalDeviceParser.g:6589:1: rule__PropertySelection__Group__6__Impl : ( ( rule__PropertySelection__Group_6__0 )? ) ;
    public final void rule__PropertySelection__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6593:1: ( ( ( rule__PropertySelection__Group_6__0 )? ) )
            // InternalDeviceParser.g:6594:1: ( ( rule__PropertySelection__Group_6__0 )? )
            {
            // InternalDeviceParser.g:6594:1: ( ( rule__PropertySelection__Group_6__0 )? )
            // InternalDeviceParser.g:6595:2: ( rule__PropertySelection__Group_6__0 )?
            {
             before(grammarAccess.getPropertySelectionAccess().getGroup_6());
            // InternalDeviceParser.g:6596:2: ( rule__PropertySelection__Group_6__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Description) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDeviceParser.g:6596:3: rule__PropertySelection__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertySelection__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertySelectionAccess().getGroup_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__6__Impl"


    // $ANTLR start "rule__PropertySelection__Group__7"
    // InternalDeviceParser.g:6604:1: rule__PropertySelection__Group__7 : rule__PropertySelection__Group__7__Impl rule__PropertySelection__Group__8 ;
    public final void rule__PropertySelection__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6608:1: ( rule__PropertySelection__Group__7__Impl rule__PropertySelection__Group__8 )
            // InternalDeviceParser.g:6609:2: rule__PropertySelection__Group__7__Impl rule__PropertySelection__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__PropertySelection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__7"


    // $ANTLR start "rule__PropertySelection__Group__7__Impl"
    // InternalDeviceParser.g:6616:1: rule__PropertySelection__Group__7__Impl : ( ( rule__PropertySelection__Group_7__0 )? ) ;
    public final void rule__PropertySelection__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6620:1: ( ( ( rule__PropertySelection__Group_7__0 )? ) )
            // InternalDeviceParser.g:6621:1: ( ( rule__PropertySelection__Group_7__0 )? )
            {
            // InternalDeviceParser.g:6621:1: ( ( rule__PropertySelection__Group_7__0 )? )
            // InternalDeviceParser.g:6622:2: ( rule__PropertySelection__Group_7__0 )?
            {
             before(grammarAccess.getPropertySelectionAccess().getGroup_7());
            // InternalDeviceParser.g:6623:2: ( rule__PropertySelection__Group_7__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Value) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDeviceParser.g:6623:3: rule__PropertySelection__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertySelection__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertySelectionAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__7__Impl"


    // $ANTLR start "rule__PropertySelection__Group__8"
    // InternalDeviceParser.g:6631:1: rule__PropertySelection__Group__8 : rule__PropertySelection__Group__8__Impl ;
    public final void rule__PropertySelection__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6635:1: ( rule__PropertySelection__Group__8__Impl )
            // InternalDeviceParser.g:6636:2: rule__PropertySelection__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__8"


    // $ANTLR start "rule__PropertySelection__Group__8__Impl"
    // InternalDeviceParser.g:6642:1: rule__PropertySelection__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertySelection__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6646:1: ( ( ( RULE_DEDENT )? ) )
            // InternalDeviceParser.g:6647:1: ( ( RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:6647:1: ( ( RULE_DEDENT )? )
            // InternalDeviceParser.g:6648:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_8());
            // InternalDeviceParser.g:6649:2: ( RULE_DEDENT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_DEDENT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDeviceParser.g:6649:3: RULE_DEDENT
                    {
                    match(input,RULE_DEDENT,FOLLOW_2);

                    }
                    break;

            }

             after(grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group__8__Impl"


    // $ANTLR start "rule__PropertySelection__Group_6__0"
    // InternalDeviceParser.g:6658:1: rule__PropertySelection__Group_6__0 : rule__PropertySelection__Group_6__0__Impl rule__PropertySelection__Group_6__1 ;
    public final void rule__PropertySelection__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6662:1: ( rule__PropertySelection__Group_6__0__Impl rule__PropertySelection__Group_6__1 )
            // InternalDeviceParser.g:6663:2: rule__PropertySelection__Group_6__0__Impl rule__PropertySelection__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__PropertySelection__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_6__0"


    // $ANTLR start "rule__PropertySelection__Group_6__0__Impl"
    // InternalDeviceParser.g:6670:1: rule__PropertySelection__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertySelection__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6674:1: ( ( Description ) )
            // InternalDeviceParser.g:6675:1: ( Description )
            {
            // InternalDeviceParser.g:6675:1: ( Description )
            // InternalDeviceParser.g:6676:2: Description
            {
             before(grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_6__0__Impl"


    // $ANTLR start "rule__PropertySelection__Group_6__1"
    // InternalDeviceParser.g:6685:1: rule__PropertySelection__Group_6__1 : rule__PropertySelection__Group_6__1__Impl ;
    public final void rule__PropertySelection__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6689:1: ( rule__PropertySelection__Group_6__1__Impl )
            // InternalDeviceParser.g:6690:2: rule__PropertySelection__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_6__1"


    // $ANTLR start "rule__PropertySelection__Group_6__1__Impl"
    // InternalDeviceParser.g:6696:1: rule__PropertySelection__Group_6__1__Impl : ( ( rule__PropertySelection__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertySelection__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6700:1: ( ( ( rule__PropertySelection__DescriptionAssignment_6_1 ) ) )
            // InternalDeviceParser.g:6701:1: ( ( rule__PropertySelection__DescriptionAssignment_6_1 ) )
            {
            // InternalDeviceParser.g:6701:1: ( ( rule__PropertySelection__DescriptionAssignment_6_1 ) )
            // InternalDeviceParser.g:6702:2: ( rule__PropertySelection__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertySelectionAccess().getDescriptionAssignment_6_1());
            // InternalDeviceParser.g:6703:2: ( rule__PropertySelection__DescriptionAssignment_6_1 )
            // InternalDeviceParser.g:6703:3: rule__PropertySelection__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectionAccess().getDescriptionAssignment_6_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_6__1__Impl"


    // $ANTLR start "rule__PropertySelection__Group_7__0"
    // InternalDeviceParser.g:6712:1: rule__PropertySelection__Group_7__0 : rule__PropertySelection__Group_7__0__Impl rule__PropertySelection__Group_7__1 ;
    public final void rule__PropertySelection__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6716:1: ( rule__PropertySelection__Group_7__0__Impl rule__PropertySelection__Group_7__1 )
            // InternalDeviceParser.g:6717:2: rule__PropertySelection__Group_7__0__Impl rule__PropertySelection__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__PropertySelection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__0"


    // $ANTLR start "rule__PropertySelection__Group_7__0__Impl"
    // InternalDeviceParser.g:6724:1: rule__PropertySelection__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertySelection__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6728:1: ( ( Value ) )
            // InternalDeviceParser.g:6729:1: ( Value )
            {
            // InternalDeviceParser.g:6729:1: ( Value )
            // InternalDeviceParser.g:6730:2: Value
            {
             before(grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__0__Impl"


    // $ANTLR start "rule__PropertySelection__Group_7__1"
    // InternalDeviceParser.g:6739:1: rule__PropertySelection__Group_7__1 : rule__PropertySelection__Group_7__1__Impl rule__PropertySelection__Group_7__2 ;
    public final void rule__PropertySelection__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6743:1: ( rule__PropertySelection__Group_7__1__Impl rule__PropertySelection__Group_7__2 )
            // InternalDeviceParser.g:6744:2: rule__PropertySelection__Group_7__1__Impl rule__PropertySelection__Group_7__2
            {
            pushFollow(FOLLOW_6);
            rule__PropertySelection__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__1"


    // $ANTLR start "rule__PropertySelection__Group_7__1__Impl"
    // InternalDeviceParser.g:6751:1: rule__PropertySelection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertySelection__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6755:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:6756:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:6756:1: ( RULE_INDENT )
            // InternalDeviceParser.g:6757:2: RULE_INDENT
            {
             before(grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__1__Impl"


    // $ANTLR start "rule__PropertySelection__Group_7__2"
    // InternalDeviceParser.g:6766:1: rule__PropertySelection__Group_7__2 : rule__PropertySelection__Group_7__2__Impl rule__PropertySelection__Group_7__3 ;
    public final void rule__PropertySelection__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6770:1: ( rule__PropertySelection__Group_7__2__Impl rule__PropertySelection__Group_7__3 )
            // InternalDeviceParser.g:6771:2: rule__PropertySelection__Group_7__2__Impl rule__PropertySelection__Group_7__3
            {
            pushFollow(FOLLOW_14);
            rule__PropertySelection__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__2"


    // $ANTLR start "rule__PropertySelection__Group_7__2__Impl"
    // InternalDeviceParser.g:6778:1: rule__PropertySelection__Group_7__2__Impl : ( rulePreListElement ) ;
    public final void rule__PropertySelection__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6782:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:6783:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:6783:1: ( rulePreListElement )
            // InternalDeviceParser.g:6784:2: rulePreListElement
            {
             before(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__2__Impl"


    // $ANTLR start "rule__PropertySelection__Group_7__3"
    // InternalDeviceParser.g:6793:1: rule__PropertySelection__Group_7__3 : rule__PropertySelection__Group_7__3__Impl rule__PropertySelection__Group_7__4 ;
    public final void rule__PropertySelection__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6797:1: ( rule__PropertySelection__Group_7__3__Impl rule__PropertySelection__Group_7__4 )
            // InternalDeviceParser.g:6798:2: rule__PropertySelection__Group_7__3__Impl rule__PropertySelection__Group_7__4
            {
            pushFollow(FOLLOW_23);
            rule__PropertySelection__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__3"


    // $ANTLR start "rule__PropertySelection__Group_7__3__Impl"
    // InternalDeviceParser.g:6805:1: rule__PropertySelection__Group_7__3__Impl : ( ( rule__PropertySelection__ValueAssignment_7_3 ) ) ;
    public final void rule__PropertySelection__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6809:1: ( ( ( rule__PropertySelection__ValueAssignment_7_3 ) ) )
            // InternalDeviceParser.g:6810:1: ( ( rule__PropertySelection__ValueAssignment_7_3 ) )
            {
            // InternalDeviceParser.g:6810:1: ( ( rule__PropertySelection__ValueAssignment_7_3 ) )
            // InternalDeviceParser.g:6811:2: ( rule__PropertySelection__ValueAssignment_7_3 )
            {
             before(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_3());
            // InternalDeviceParser.g:6812:2: ( rule__PropertySelection__ValueAssignment_7_3 )
            // InternalDeviceParser.g:6812:3: rule__PropertySelection__ValueAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__ValueAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__3__Impl"


    // $ANTLR start "rule__PropertySelection__Group_7__4"
    // InternalDeviceParser.g:6820:1: rule__PropertySelection__Group_7__4 : rule__PropertySelection__Group_7__4__Impl rule__PropertySelection__Group_7__5 ;
    public final void rule__PropertySelection__Group_7__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6824:1: ( rule__PropertySelection__Group_7__4__Impl rule__PropertySelection__Group_7__5 )
            // InternalDeviceParser.g:6825:2: rule__PropertySelection__Group_7__4__Impl rule__PropertySelection__Group_7__5
            {
            pushFollow(FOLLOW_23);
            rule__PropertySelection__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__4"


    // $ANTLR start "rule__PropertySelection__Group_7__4__Impl"
    // InternalDeviceParser.g:6832:1: rule__PropertySelection__Group_7__4__Impl : ( ( rule__PropertySelection__Group_7_4__0 )* ) ;
    public final void rule__PropertySelection__Group_7__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6836:1: ( ( ( rule__PropertySelection__Group_7_4__0 )* ) )
            // InternalDeviceParser.g:6837:1: ( ( rule__PropertySelection__Group_7_4__0 )* )
            {
            // InternalDeviceParser.g:6837:1: ( ( rule__PropertySelection__Group_7_4__0 )* )
            // InternalDeviceParser.g:6838:2: ( rule__PropertySelection__Group_7_4__0 )*
            {
             before(grammarAccess.getPropertySelectionAccess().getGroup_7_4());
            // InternalDeviceParser.g:6839:2: ( rule__PropertySelection__Group_7_4__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==HyphenMinus) ) {
                    alt49=1;
                }


                switch (alt49) {
                case 1 :
                    // InternalDeviceParser.g:6839:3: rule__PropertySelection__Group_7_4__0
                    {
                    pushFollow(FOLLOW_19);
                    rule__PropertySelection__Group_7_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop49;
                }
            } while (true);

             after(grammarAccess.getPropertySelectionAccess().getGroup_7_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__4__Impl"


    // $ANTLR start "rule__PropertySelection__Group_7__5"
    // InternalDeviceParser.g:6847:1: rule__PropertySelection__Group_7__5 : rule__PropertySelection__Group_7__5__Impl ;
    public final void rule__PropertySelection__Group_7__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6851:1: ( rule__PropertySelection__Group_7__5__Impl )
            // InternalDeviceParser.g:6852:2: rule__PropertySelection__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_7__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__5"


    // $ANTLR start "rule__PropertySelection__Group_7__5__Impl"
    // InternalDeviceParser.g:6858:1: rule__PropertySelection__Group_7__5__Impl : ( RULE_DEDENT ) ;
    public final void rule__PropertySelection__Group_7__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6862:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:6863:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:6863:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:6864:2: RULE_DEDENT
            {
             before(grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7__5__Impl"


    // $ANTLR start "rule__PropertySelection__Group_7_4__0"
    // InternalDeviceParser.g:6874:1: rule__PropertySelection__Group_7_4__0 : rule__PropertySelection__Group_7_4__0__Impl rule__PropertySelection__Group_7_4__1 ;
    public final void rule__PropertySelection__Group_7_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6878:1: ( rule__PropertySelection__Group_7_4__0__Impl rule__PropertySelection__Group_7_4__1 )
            // InternalDeviceParser.g:6879:2: rule__PropertySelection__Group_7_4__0__Impl rule__PropertySelection__Group_7_4__1
            {
            pushFollow(FOLLOW_14);
            rule__PropertySelection__Group_7_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_7_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7_4__0"


    // $ANTLR start "rule__PropertySelection__Group_7_4__0__Impl"
    // InternalDeviceParser.g:6886:1: rule__PropertySelection__Group_7_4__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertySelection__Group_7_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6890:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:6891:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:6891:1: ( rulePreListElement )
            // InternalDeviceParser.g:6892:2: rulePreListElement
            {
             before(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7_4__0__Impl"


    // $ANTLR start "rule__PropertySelection__Group_7_4__1"
    // InternalDeviceParser.g:6901:1: rule__PropertySelection__Group_7_4__1 : rule__PropertySelection__Group_7_4__1__Impl ;
    public final void rule__PropertySelection__Group_7_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6905:1: ( rule__PropertySelection__Group_7_4__1__Impl )
            // InternalDeviceParser.g:6906:2: rule__PropertySelection__Group_7_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__Group_7_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7_4__1"


    // $ANTLR start "rule__PropertySelection__Group_7_4__1__Impl"
    // InternalDeviceParser.g:6912:1: rule__PropertySelection__Group_7_4__1__Impl : ( ( rule__PropertySelection__ValueAssignment_7_4_1 ) ) ;
    public final void rule__PropertySelection__Group_7_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6916:1: ( ( ( rule__PropertySelection__ValueAssignment_7_4_1 ) ) )
            // InternalDeviceParser.g:6917:1: ( ( rule__PropertySelection__ValueAssignment_7_4_1 ) )
            {
            // InternalDeviceParser.g:6917:1: ( ( rule__PropertySelection__ValueAssignment_7_4_1 ) )
            // InternalDeviceParser.g:6918:2: ( rule__PropertySelection__ValueAssignment_7_4_1 )
            {
             before(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_4_1());
            // InternalDeviceParser.g:6919:2: ( rule__PropertySelection__ValueAssignment_7_4_1 )
            // InternalDeviceParser.g:6919:3: rule__PropertySelection__ValueAssignment_7_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertySelection__ValueAssignment_7_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_4_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__Group_7_4__1__Impl"


    // $ANTLR start "rule__PropertyRange__Group__0"
    // InternalDeviceParser.g:6928:1: rule__PropertyRange__Group__0 : rule__PropertyRange__Group__0__Impl rule__PropertyRange__Group__1 ;
    public final void rule__PropertyRange__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6932:1: ( rule__PropertyRange__Group__0__Impl rule__PropertyRange__Group__1 )
            // InternalDeviceParser.g:6933:2: rule__PropertyRange__Group__0__Impl rule__PropertyRange__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PropertyRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__0"


    // $ANTLR start "rule__PropertyRange__Group__0__Impl"
    // InternalDeviceParser.g:6940:1: rule__PropertyRange__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyRange__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6944:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:6945:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:6945:1: ( rulePreListElement )
            // InternalDeviceParser.g:6946:2: rulePreListElement
            {
             before(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__0__Impl"


    // $ANTLR start "rule__PropertyRange__Group__1"
    // InternalDeviceParser.g:6955:1: rule__PropertyRange__Group__1 : rule__PropertyRange__Group__1__Impl rule__PropertyRange__Group__2 ;
    public final void rule__PropertyRange__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6959:1: ( rule__PropertyRange__Group__1__Impl rule__PropertyRange__Group__2 )
            // InternalDeviceParser.g:6960:2: rule__PropertyRange__Group__1__Impl rule__PropertyRange__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PropertyRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__1"


    // $ANTLR start "rule__PropertyRange__Group__1__Impl"
    // InternalDeviceParser.g:6967:1: rule__PropertyRange__Group__1__Impl : ( Name ) ;
    public final void rule__PropertyRange__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6971:1: ( ( Name ) )
            // InternalDeviceParser.g:6972:1: ( Name )
            {
            // InternalDeviceParser.g:6972:1: ( Name )
            // InternalDeviceParser.g:6973:2: Name
            {
             before(grammarAccess.getPropertyRangeAccess().getNameKeyword_1());
            match(input,Name,FOLLOW_2);
             after(grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__1__Impl"


    // $ANTLR start "rule__PropertyRange__Group__2"
    // InternalDeviceParser.g:6982:1: rule__PropertyRange__Group__2 : rule__PropertyRange__Group__2__Impl rule__PropertyRange__Group__3 ;
    public final void rule__PropertyRange__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6986:1: ( rule__PropertyRange__Group__2__Impl rule__PropertyRange__Group__3 )
            // InternalDeviceParser.g:6987:2: rule__PropertyRange__Group__2__Impl rule__PropertyRange__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PropertyRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__2"


    // $ANTLR start "rule__PropertyRange__Group__2__Impl"
    // InternalDeviceParser.g:6994:1: rule__PropertyRange__Group__2__Impl : ( ( rule__PropertyRange__NameAssignment_2 ) ) ;
    public final void rule__PropertyRange__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:6998:1: ( ( ( rule__PropertyRange__NameAssignment_2 ) ) )
            // InternalDeviceParser.g:6999:1: ( ( rule__PropertyRange__NameAssignment_2 ) )
            {
            // InternalDeviceParser.g:6999:1: ( ( rule__PropertyRange__NameAssignment_2 ) )
            // InternalDeviceParser.g:7000:2: ( rule__PropertyRange__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyRangeAccess().getNameAssignment_2());
            // InternalDeviceParser.g:7001:2: ( rule__PropertyRange__NameAssignment_2 )
            // InternalDeviceParser.g:7001:3: rule__PropertyRange__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRange__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRangeAccess().getNameAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__2__Impl"


    // $ANTLR start "rule__PropertyRange__Group__3"
    // InternalDeviceParser.g:7009:1: rule__PropertyRange__Group__3 : rule__PropertyRange__Group__3__Impl rule__PropertyRange__Group__4 ;
    public final void rule__PropertyRange__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7013:1: ( rule__PropertyRange__Group__3__Impl rule__PropertyRange__Group__4 )
            // InternalDeviceParser.g:7014:2: rule__PropertyRange__Group__3__Impl rule__PropertyRange__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__PropertyRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__3"


    // $ANTLR start "rule__PropertyRange__Group__3__Impl"
    // InternalDeviceParser.g:7021:1: rule__PropertyRange__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyRange__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7025:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:7026:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:7026:1: ( RULE_INDENT )
            // InternalDeviceParser.g:7027:2: RULE_INDENT
            {
             before(grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__3__Impl"


    // $ANTLR start "rule__PropertyRange__Group__4"
    // InternalDeviceParser.g:7036:1: rule__PropertyRange__Group__4 : rule__PropertyRange__Group__4__Impl rule__PropertyRange__Group__5 ;
    public final void rule__PropertyRange__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7040:1: ( rule__PropertyRange__Group__4__Impl rule__PropertyRange__Group__5 )
            // InternalDeviceParser.g:7041:2: rule__PropertyRange__Group__4__Impl rule__PropertyRange__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__PropertyRange__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__4"


    // $ANTLR start "rule__PropertyRange__Group__4__Impl"
    // InternalDeviceParser.g:7048:1: rule__PropertyRange__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertyRange__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7052:1: ( ( Kind ) )
            // InternalDeviceParser.g:7053:1: ( Kind )
            {
            // InternalDeviceParser.g:7053:1: ( Kind )
            // InternalDeviceParser.g:7054:2: Kind
            {
             before(grammarAccess.getPropertyRangeAccess().getKindKeyword_4());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__4__Impl"


    // $ANTLR start "rule__PropertyRange__Group__5"
    // InternalDeviceParser.g:7063:1: rule__PropertyRange__Group__5 : rule__PropertyRange__Group__5__Impl rule__PropertyRange__Group__6 ;
    public final void rule__PropertyRange__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7067:1: ( rule__PropertyRange__Group__5__Impl rule__PropertyRange__Group__6 )
            // InternalDeviceParser.g:7068:2: rule__PropertyRange__Group__5__Impl rule__PropertyRange__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__PropertyRange__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__5"


    // $ANTLR start "rule__PropertyRange__Group__5__Impl"
    // InternalDeviceParser.g:7075:1: rule__PropertyRange__Group__5__Impl : ( ( rule__PropertyRange__KindAssignment_5 ) ) ;
    public final void rule__PropertyRange__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7079:1: ( ( ( rule__PropertyRange__KindAssignment_5 ) ) )
            // InternalDeviceParser.g:7080:1: ( ( rule__PropertyRange__KindAssignment_5 ) )
            {
            // InternalDeviceParser.g:7080:1: ( ( rule__PropertyRange__KindAssignment_5 ) )
            // InternalDeviceParser.g:7081:2: ( rule__PropertyRange__KindAssignment_5 )
            {
             before(grammarAccess.getPropertyRangeAccess().getKindAssignment_5());
            // InternalDeviceParser.g:7082:2: ( rule__PropertyRange__KindAssignment_5 )
            // InternalDeviceParser.g:7082:3: rule__PropertyRange__KindAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRange__KindAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRangeAccess().getKindAssignment_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__5__Impl"


    // $ANTLR start "rule__PropertyRange__Group__6"
    // InternalDeviceParser.g:7090:1: rule__PropertyRange__Group__6 : rule__PropertyRange__Group__6__Impl rule__PropertyRange__Group__7 ;
    public final void rule__PropertyRange__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7094:1: ( rule__PropertyRange__Group__6__Impl rule__PropertyRange__Group__7 )
            // InternalDeviceParser.g:7095:2: rule__PropertyRange__Group__6__Impl rule__PropertyRange__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__PropertyRange__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__6"


    // $ANTLR start "rule__PropertyRange__Group__6__Impl"
    // InternalDeviceParser.g:7102:1: rule__PropertyRange__Group__6__Impl : ( ( rule__PropertyRange__Group_6__0 )? ) ;
    public final void rule__PropertyRange__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7106:1: ( ( ( rule__PropertyRange__Group_6__0 )? ) )
            // InternalDeviceParser.g:7107:1: ( ( rule__PropertyRange__Group_6__0 )? )
            {
            // InternalDeviceParser.g:7107:1: ( ( rule__PropertyRange__Group_6__0 )? )
            // InternalDeviceParser.g:7108:2: ( rule__PropertyRange__Group_6__0 )?
            {
             before(grammarAccess.getPropertyRangeAccess().getGroup_6());
            // InternalDeviceParser.g:7109:2: ( rule__PropertyRange__Group_6__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Description) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDeviceParser.g:7109:3: rule__PropertyRange__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRange__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyRangeAccess().getGroup_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__6__Impl"


    // $ANTLR start "rule__PropertyRange__Group__7"
    // InternalDeviceParser.g:7117:1: rule__PropertyRange__Group__7 : rule__PropertyRange__Group__7__Impl rule__PropertyRange__Group__8 ;
    public final void rule__PropertyRange__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7121:1: ( rule__PropertyRange__Group__7__Impl rule__PropertyRange__Group__8 )
            // InternalDeviceParser.g:7122:2: rule__PropertyRange__Group__7__Impl rule__PropertyRange__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__PropertyRange__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__7"


    // $ANTLR start "rule__PropertyRange__Group__7__Impl"
    // InternalDeviceParser.g:7129:1: rule__PropertyRange__Group__7__Impl : ( ( rule__PropertyRange__Group_7__0 )? ) ;
    public final void rule__PropertyRange__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7133:1: ( ( ( rule__PropertyRange__Group_7__0 )? ) )
            // InternalDeviceParser.g:7134:1: ( ( rule__PropertyRange__Group_7__0 )? )
            {
            // InternalDeviceParser.g:7134:1: ( ( rule__PropertyRange__Group_7__0 )? )
            // InternalDeviceParser.g:7135:2: ( rule__PropertyRange__Group_7__0 )?
            {
             before(grammarAccess.getPropertyRangeAccess().getGroup_7());
            // InternalDeviceParser.g:7136:2: ( rule__PropertyRange__Group_7__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Value) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDeviceParser.g:7136:3: rule__PropertyRange__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRange__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyRangeAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__7__Impl"


    // $ANTLR start "rule__PropertyRange__Group__8"
    // InternalDeviceParser.g:7144:1: rule__PropertyRange__Group__8 : rule__PropertyRange__Group__8__Impl ;
    public final void rule__PropertyRange__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7148:1: ( rule__PropertyRange__Group__8__Impl )
            // InternalDeviceParser.g:7149:2: rule__PropertyRange__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__8"


    // $ANTLR start "rule__PropertyRange__Group__8__Impl"
    // InternalDeviceParser.g:7155:1: rule__PropertyRange__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertyRange__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7159:1: ( ( ( RULE_DEDENT )? ) )
            // InternalDeviceParser.g:7160:1: ( ( RULE_DEDENT )? )
            {
            // InternalDeviceParser.g:7160:1: ( ( RULE_DEDENT )? )
            // InternalDeviceParser.g:7161:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_8());
            // InternalDeviceParser.g:7162:2: ( RULE_DEDENT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_DEDENT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDeviceParser.g:7162:3: RULE_DEDENT
                    {
                    match(input,RULE_DEDENT,FOLLOW_2);

                    }
                    break;

            }

             after(grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group__8__Impl"


    // $ANTLR start "rule__PropertyRange__Group_6__0"
    // InternalDeviceParser.g:7171:1: rule__PropertyRange__Group_6__0 : rule__PropertyRange__Group_6__0__Impl rule__PropertyRange__Group_6__1 ;
    public final void rule__PropertyRange__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7175:1: ( rule__PropertyRange__Group_6__0__Impl rule__PropertyRange__Group_6__1 )
            // InternalDeviceParser.g:7176:2: rule__PropertyRange__Group_6__0__Impl rule__PropertyRange__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__PropertyRange__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_6__0"


    // $ANTLR start "rule__PropertyRange__Group_6__0__Impl"
    // InternalDeviceParser.g:7183:1: rule__PropertyRange__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertyRange__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7187:1: ( ( Description ) )
            // InternalDeviceParser.g:7188:1: ( Description )
            {
            // InternalDeviceParser.g:7188:1: ( Description )
            // InternalDeviceParser.g:7189:2: Description
            {
             before(grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_6__0__Impl"


    // $ANTLR start "rule__PropertyRange__Group_6__1"
    // InternalDeviceParser.g:7198:1: rule__PropertyRange__Group_6__1 : rule__PropertyRange__Group_6__1__Impl ;
    public final void rule__PropertyRange__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7202:1: ( rule__PropertyRange__Group_6__1__Impl )
            // InternalDeviceParser.g:7203:2: rule__PropertyRange__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_6__1"


    // $ANTLR start "rule__PropertyRange__Group_6__1__Impl"
    // InternalDeviceParser.g:7209:1: rule__PropertyRange__Group_6__1__Impl : ( ( rule__PropertyRange__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertyRange__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7213:1: ( ( ( rule__PropertyRange__DescriptionAssignment_6_1 ) ) )
            // InternalDeviceParser.g:7214:1: ( ( rule__PropertyRange__DescriptionAssignment_6_1 ) )
            {
            // InternalDeviceParser.g:7214:1: ( ( rule__PropertyRange__DescriptionAssignment_6_1 ) )
            // InternalDeviceParser.g:7215:2: ( rule__PropertyRange__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertyRangeAccess().getDescriptionAssignment_6_1());
            // InternalDeviceParser.g:7216:2: ( rule__PropertyRange__DescriptionAssignment_6_1 )
            // InternalDeviceParser.g:7216:3: rule__PropertyRange__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRange__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRangeAccess().getDescriptionAssignment_6_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_6__1__Impl"


    // $ANTLR start "rule__PropertyRange__Group_7__0"
    // InternalDeviceParser.g:7225:1: rule__PropertyRange__Group_7__0 : rule__PropertyRange__Group_7__0__Impl rule__PropertyRange__Group_7__1 ;
    public final void rule__PropertyRange__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7229:1: ( rule__PropertyRange__Group_7__0__Impl rule__PropertyRange__Group_7__1 )
            // InternalDeviceParser.g:7230:2: rule__PropertyRange__Group_7__0__Impl rule__PropertyRange__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__PropertyRange__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__0"


    // $ANTLR start "rule__PropertyRange__Group_7__0__Impl"
    // InternalDeviceParser.g:7237:1: rule__PropertyRange__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertyRange__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7241:1: ( ( Value ) )
            // InternalDeviceParser.g:7242:1: ( Value )
            {
            // InternalDeviceParser.g:7242:1: ( Value )
            // InternalDeviceParser.g:7243:2: Value
            {
             before(grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__0__Impl"


    // $ANTLR start "rule__PropertyRange__Group_7__1"
    // InternalDeviceParser.g:7252:1: rule__PropertyRange__Group_7__1 : rule__PropertyRange__Group_7__1__Impl rule__PropertyRange__Group_7__2 ;
    public final void rule__PropertyRange__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7256:1: ( rule__PropertyRange__Group_7__1__Impl rule__PropertyRange__Group_7__2 )
            // InternalDeviceParser.g:7257:2: rule__PropertyRange__Group_7__1__Impl rule__PropertyRange__Group_7__2
            {
            pushFollow(FOLLOW_6);
            rule__PropertyRange__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__1"


    // $ANTLR start "rule__PropertyRange__Group_7__1__Impl"
    // InternalDeviceParser.g:7264:1: rule__PropertyRange__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyRange__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7268:1: ( ( RULE_INDENT ) )
            // InternalDeviceParser.g:7269:1: ( RULE_INDENT )
            {
            // InternalDeviceParser.g:7269:1: ( RULE_INDENT )
            // InternalDeviceParser.g:7270:2: RULE_INDENT
            {
             before(grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__1__Impl"


    // $ANTLR start "rule__PropertyRange__Group_7__2"
    // InternalDeviceParser.g:7279:1: rule__PropertyRange__Group_7__2 : rule__PropertyRange__Group_7__2__Impl rule__PropertyRange__Group_7__3 ;
    public final void rule__PropertyRange__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7283:1: ( rule__PropertyRange__Group_7__2__Impl rule__PropertyRange__Group_7__3 )
            // InternalDeviceParser.g:7284:2: rule__PropertyRange__Group_7__2__Impl rule__PropertyRange__Group_7__3
            {
            pushFollow(FOLLOW_14);
            rule__PropertyRange__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__2"


    // $ANTLR start "rule__PropertyRange__Group_7__2__Impl"
    // InternalDeviceParser.g:7291:1: rule__PropertyRange__Group_7__2__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyRange__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7295:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:7296:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:7296:1: ( rulePreListElement )
            // InternalDeviceParser.g:7297:2: rulePreListElement
            {
             before(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__2__Impl"


    // $ANTLR start "rule__PropertyRange__Group_7__3"
    // InternalDeviceParser.g:7306:1: rule__PropertyRange__Group_7__3 : rule__PropertyRange__Group_7__3__Impl rule__PropertyRange__Group_7__4 ;
    public final void rule__PropertyRange__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7310:1: ( rule__PropertyRange__Group_7__3__Impl rule__PropertyRange__Group_7__4 )
            // InternalDeviceParser.g:7311:2: rule__PropertyRange__Group_7__3__Impl rule__PropertyRange__Group_7__4
            {
            pushFollow(FOLLOW_6);
            rule__PropertyRange__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__3"


    // $ANTLR start "rule__PropertyRange__Group_7__3__Impl"
    // InternalDeviceParser.g:7318:1: rule__PropertyRange__Group_7__3__Impl : ( ( rule__PropertyRange__ValueAssignment_7_3 ) ) ;
    public final void rule__PropertyRange__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7322:1: ( ( ( rule__PropertyRange__ValueAssignment_7_3 ) ) )
            // InternalDeviceParser.g:7323:1: ( ( rule__PropertyRange__ValueAssignment_7_3 ) )
            {
            // InternalDeviceParser.g:7323:1: ( ( rule__PropertyRange__ValueAssignment_7_3 ) )
            // InternalDeviceParser.g:7324:2: ( rule__PropertyRange__ValueAssignment_7_3 )
            {
             before(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_3());
            // InternalDeviceParser.g:7325:2: ( rule__PropertyRange__ValueAssignment_7_3 )
            // InternalDeviceParser.g:7325:3: rule__PropertyRange__ValueAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRange__ValueAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__3__Impl"


    // $ANTLR start "rule__PropertyRange__Group_7__4"
    // InternalDeviceParser.g:7333:1: rule__PropertyRange__Group_7__4 : rule__PropertyRange__Group_7__4__Impl rule__PropertyRange__Group_7__5 ;
    public final void rule__PropertyRange__Group_7__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7337:1: ( rule__PropertyRange__Group_7__4__Impl rule__PropertyRange__Group_7__5 )
            // InternalDeviceParser.g:7338:2: rule__PropertyRange__Group_7__4__Impl rule__PropertyRange__Group_7__5
            {
            pushFollow(FOLLOW_14);
            rule__PropertyRange__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__4"


    // $ANTLR start "rule__PropertyRange__Group_7__4__Impl"
    // InternalDeviceParser.g:7345:1: rule__PropertyRange__Group_7__4__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyRange__Group_7__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7349:1: ( ( rulePreListElement ) )
            // InternalDeviceParser.g:7350:1: ( rulePreListElement )
            {
            // InternalDeviceParser.g:7350:1: ( rulePreListElement )
            // InternalDeviceParser.g:7351:2: rulePreListElement
            {
             before(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_4());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__4__Impl"


    // $ANTLR start "rule__PropertyRange__Group_7__5"
    // InternalDeviceParser.g:7360:1: rule__PropertyRange__Group_7__5 : rule__PropertyRange__Group_7__5__Impl rule__PropertyRange__Group_7__6 ;
    public final void rule__PropertyRange__Group_7__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7364:1: ( rule__PropertyRange__Group_7__5__Impl rule__PropertyRange__Group_7__6 )
            // InternalDeviceParser.g:7365:2: rule__PropertyRange__Group_7__5__Impl rule__PropertyRange__Group_7__6
            {
            pushFollow(FOLLOW_18);
            rule__PropertyRange__Group_7__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group_7__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__5"


    // $ANTLR start "rule__PropertyRange__Group_7__5__Impl"
    // InternalDeviceParser.g:7372:1: rule__PropertyRange__Group_7__5__Impl : ( ( rule__PropertyRange__ValueAssignment_7_5 ) ) ;
    public final void rule__PropertyRange__Group_7__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7376:1: ( ( ( rule__PropertyRange__ValueAssignment_7_5 ) ) )
            // InternalDeviceParser.g:7377:1: ( ( rule__PropertyRange__ValueAssignment_7_5 ) )
            {
            // InternalDeviceParser.g:7377:1: ( ( rule__PropertyRange__ValueAssignment_7_5 ) )
            // InternalDeviceParser.g:7378:2: ( rule__PropertyRange__ValueAssignment_7_5 )
            {
             before(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_5());
            // InternalDeviceParser.g:7379:2: ( rule__PropertyRange__ValueAssignment_7_5 )
            // InternalDeviceParser.g:7379:3: rule__PropertyRange__ValueAssignment_7_5
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRange__ValueAssignment_7_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__5__Impl"


    // $ANTLR start "rule__PropertyRange__Group_7__6"
    // InternalDeviceParser.g:7387:1: rule__PropertyRange__Group_7__6 : rule__PropertyRange__Group_7__6__Impl ;
    public final void rule__PropertyRange__Group_7__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7391:1: ( rule__PropertyRange__Group_7__6__Impl )
            // InternalDeviceParser.g:7392:2: rule__PropertyRange__Group_7__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRange__Group_7__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__6"


    // $ANTLR start "rule__PropertyRange__Group_7__6__Impl"
    // InternalDeviceParser.g:7398:1: rule__PropertyRange__Group_7__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__PropertyRange__Group_7__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7402:1: ( ( RULE_DEDENT ) )
            // InternalDeviceParser.g:7403:1: ( RULE_DEDENT )
            {
            // InternalDeviceParser.g:7403:1: ( RULE_DEDENT )
            // InternalDeviceParser.g:7404:2: RULE_DEDENT
            {
             before(grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__Group_7__6__Impl"


    // $ANTLR start "rule__ResourceType__Group__0"
    // InternalDeviceParser.g:7414:1: rule__ResourceType__Group__0 : rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1 ;
    public final void rule__ResourceType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7418:1: ( rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1 )
            // InternalDeviceParser.g:7419:2: rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ResourceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResourceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__0"


    // $ANTLR start "rule__ResourceType__Group__0__Impl"
    // InternalDeviceParser.g:7426:1: rule__ResourceType__Group__0__Impl : ( () ) ;
    public final void rule__ResourceType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7430:1: ( ( () ) )
            // InternalDeviceParser.g:7431:1: ( () )
            {
            // InternalDeviceParser.g:7431:1: ( () )
            // InternalDeviceParser.g:7432:2: ()
            {
             before(grammarAccess.getResourceTypeAccess().getResourceTypeAction_0());
            // InternalDeviceParser.g:7433:2: ()
            // InternalDeviceParser.g:7433:3:
            {
            }

             after(grammarAccess.getResourceTypeAccess().getResourceTypeAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__0__Impl"


    // $ANTLR start "rule__ResourceType__Group__1"
    // InternalDeviceParser.g:7441:1: rule__ResourceType__Group__1 : rule__ResourceType__Group__1__Impl ;
    public final void rule__ResourceType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7445:1: ( rule__ResourceType__Group__1__Impl )
            // InternalDeviceParser.g:7446:2: rule__ResourceType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResourceType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__1"


    // $ANTLR start "rule__ResourceType__Group__1__Impl"
    // InternalDeviceParser.g:7452:1: rule__ResourceType__Group__1__Impl : ( ( rule__ResourceType__NameAssignment_1 ) ) ;
    public final void rule__ResourceType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7456:1: ( ( ( rule__ResourceType__NameAssignment_1 ) ) )
            // InternalDeviceParser.g:7457:1: ( ( rule__ResourceType__NameAssignment_1 ) )
            {
            // InternalDeviceParser.g:7457:1: ( ( rule__ResourceType__NameAssignment_1 ) )
            // InternalDeviceParser.g:7458:2: ( rule__ResourceType__NameAssignment_1 )
            {
             before(grammarAccess.getResourceTypeAccess().getNameAssignment_1());
            // InternalDeviceParser.g:7459:2: ( rule__ResourceType__NameAssignment_1 )
            // InternalDeviceParser.g:7459:3: rule__ResourceType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ResourceType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceTypeAccess().getNameAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Group__1__Impl"


    // $ANTLR start "rule__ProcessorArchitectureType__Group__0"
    // InternalDeviceParser.g:7468:1: rule__ProcessorArchitectureType__Group__0 : rule__ProcessorArchitectureType__Group__0__Impl rule__ProcessorArchitectureType__Group__1 ;
    public final void rule__ProcessorArchitectureType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7472:1: ( rule__ProcessorArchitectureType__Group__0__Impl rule__ProcessorArchitectureType__Group__1 )
            // InternalDeviceParser.g:7473:2: rule__ProcessorArchitectureType__Group__0__Impl rule__ProcessorArchitectureType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDeviceParser.g:7480:1: rule__ProcessorArchitectureType__Group__0__Impl : ( () ) ;
    public final void rule__ProcessorArchitectureType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7484:1: ( ( () ) )
            // InternalDeviceParser.g:7485:1: ( () )
            {
            // InternalDeviceParser.g:7485:1: ( () )
            // InternalDeviceParser.g:7486:2: ()
            {
             before(grammarAccess.getProcessorArchitectureTypeAccess().getProcessorArchitectureTypeAction_0());
            // InternalDeviceParser.g:7487:2: ()
            // InternalDeviceParser.g:7487:3:
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
    // InternalDeviceParser.g:7495:1: rule__ProcessorArchitectureType__Group__1 : rule__ProcessorArchitectureType__Group__1__Impl ;
    public final void rule__ProcessorArchitectureType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7499:1: ( rule__ProcessorArchitectureType__Group__1__Impl )
            // InternalDeviceParser.g:7500:2: rule__ProcessorArchitectureType__Group__1__Impl
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
    // InternalDeviceParser.g:7506:1: rule__ProcessorArchitectureType__Group__1__Impl : ( ProcessorArchitecture ) ;
    public final void rule__ProcessorArchitectureType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7510:1: ( ( ProcessorArchitecture ) )
            // InternalDeviceParser.g:7511:1: ( ProcessorArchitecture )
            {
            // InternalDeviceParser.g:7511:1: ( ProcessorArchitecture )
            // InternalDeviceParser.g:7512:2: ProcessorArchitecture
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
    // InternalDeviceParser.g:7522:1: rule__LinuxOpertingSystemType__Group__0 : rule__LinuxOpertingSystemType__Group__0__Impl rule__LinuxOpertingSystemType__Group__1 ;
    public final void rule__LinuxOpertingSystemType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7526:1: ( rule__LinuxOpertingSystemType__Group__0__Impl rule__LinuxOpertingSystemType__Group__1 )
            // InternalDeviceParser.g:7527:2: rule__LinuxOpertingSystemType__Group__0__Impl rule__LinuxOpertingSystemType__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDeviceParser.g:7534:1: rule__LinuxOpertingSystemType__Group__0__Impl : ( () ) ;
    public final void rule__LinuxOpertingSystemType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7538:1: ( ( () ) )
            // InternalDeviceParser.g:7539:1: ( () )
            {
            // InternalDeviceParser.g:7539:1: ( () )
            // InternalDeviceParser.g:7540:2: ()
            {
             before(grammarAccess.getLinuxOpertingSystemTypeAccess().getLinuxOpertingSystemTypeAction_0());
            // InternalDeviceParser.g:7541:2: ()
            // InternalDeviceParser.g:7541:3:
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
    // InternalDeviceParser.g:7549:1: rule__LinuxOpertingSystemType__Group__1 : rule__LinuxOpertingSystemType__Group__1__Impl ;
    public final void rule__LinuxOpertingSystemType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7553:1: ( rule__LinuxOpertingSystemType__Group__1__Impl )
            // InternalDeviceParser.g:7554:2: rule__LinuxOpertingSystemType__Group__1__Impl
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
    // InternalDeviceParser.g:7560:1: rule__LinuxOpertingSystemType__Group__1__Impl : ( Linux ) ;
    public final void rule__LinuxOpertingSystemType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7564:1: ( ( Linux ) )
            // InternalDeviceParser.g:7565:1: ( Linux )
            {
            // InternalDeviceParser.g:7565:1: ( Linux )
            // InternalDeviceParser.g:7566:2: Linux
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
    // InternalDeviceParser.g:7576:1: rule__MacOSOpertingSystemType__Group__0 : rule__MacOSOpertingSystemType__Group__0__Impl rule__MacOSOpertingSystemType__Group__1 ;
    public final void rule__MacOSOpertingSystemType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7580:1: ( rule__MacOSOpertingSystemType__Group__0__Impl rule__MacOSOpertingSystemType__Group__1 )
            // InternalDeviceParser.g:7581:2: rule__MacOSOpertingSystemType__Group__0__Impl rule__MacOSOpertingSystemType__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDeviceParser.g:7588:1: rule__MacOSOpertingSystemType__Group__0__Impl : ( () ) ;
    public final void rule__MacOSOpertingSystemType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7592:1: ( ( () ) )
            // InternalDeviceParser.g:7593:1: ( () )
            {
            // InternalDeviceParser.g:7593:1: ( () )
            // InternalDeviceParser.g:7594:2: ()
            {
             before(grammarAccess.getMacOSOpertingSystemTypeAccess().getMacOSOpertingSystemTypeAction_0());
            // InternalDeviceParser.g:7595:2: ()
            // InternalDeviceParser.g:7595:3:
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
    // InternalDeviceParser.g:7603:1: rule__MacOSOpertingSystemType__Group__1 : rule__MacOSOpertingSystemType__Group__1__Impl ;
    public final void rule__MacOSOpertingSystemType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7607:1: ( rule__MacOSOpertingSystemType__Group__1__Impl )
            // InternalDeviceParser.g:7608:2: rule__MacOSOpertingSystemType__Group__1__Impl
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
    // InternalDeviceParser.g:7614:1: rule__MacOSOpertingSystemType__Group__1__Impl : ( MacOS ) ;
    public final void rule__MacOSOpertingSystemType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7618:1: ( ( MacOS ) )
            // InternalDeviceParser.g:7619:1: ( MacOS )
            {
            // InternalDeviceParser.g:7619:1: ( MacOS )
            // InternalDeviceParser.g:7620:2: MacOS
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
    // InternalDeviceParser.g:7630:1: rule__X86ProcessorArchitecture__Group__0 : rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 ;
    public final void rule__X86ProcessorArchitecture__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7634:1: ( rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1 )
            // InternalDeviceParser.g:7635:2: rule__X86ProcessorArchitecture__Group__0__Impl rule__X86ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDeviceParser.g:7642:1: rule__X86ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__X86ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7646:1: ( ( () ) )
            // InternalDeviceParser.g:7647:1: ( () )
            {
            // InternalDeviceParser.g:7647:1: ( () )
            // InternalDeviceParser.g:7648:2: ()
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0());
            // InternalDeviceParser.g:7649:2: ()
            // InternalDeviceParser.g:7649:3:
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
    // InternalDeviceParser.g:7657:1: rule__X86ProcessorArchitecture__Group__1 : rule__X86ProcessorArchitecture__Group__1__Impl ;
    public final void rule__X86ProcessorArchitecture__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7661:1: ( rule__X86ProcessorArchitecture__Group__1__Impl )
            // InternalDeviceParser.g:7662:2: rule__X86ProcessorArchitecture__Group__1__Impl
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
    // InternalDeviceParser.g:7668:1: rule__X86ProcessorArchitecture__Group__1__Impl : ( X86_64 ) ;
    public final void rule__X86ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7672:1: ( ( X86_64 ) )
            // InternalDeviceParser.g:7673:1: ( X86_64 )
            {
            // InternalDeviceParser.g:7673:1: ( X86_64 )
            // InternalDeviceParser.g:7674:2: X86_64
            {
             before(grammarAccess.getX86ProcessorArchitectureAccess().getX86_64Keyword_1());
            match(input,X86_64,FOLLOW_2);
             after(grammarAccess.getX86ProcessorArchitectureAccess().getX86_64Keyword_1());

            }


            }

        }
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
    // InternalDeviceParser.g:7684:1: rule__Arm64ProcessorArchitecture__Group__0 : rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 ;
    public final void rule__Arm64ProcessorArchitecture__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7688:1: ( rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1 )
            // InternalDeviceParser.g:7689:2: rule__Arm64ProcessorArchitecture__Group__0__Impl rule__Arm64ProcessorArchitecture__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDeviceParser.g:7696:1: rule__Arm64ProcessorArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7700:1: ( ( () ) )
            // InternalDeviceParser.g:7701:1: ( () )
            {
            // InternalDeviceParser.g:7701:1: ( () )
            // InternalDeviceParser.g:7702:2: ()
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0());
            // InternalDeviceParser.g:7703:2: ()
            // InternalDeviceParser.g:7703:3:
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
    // InternalDeviceParser.g:7711:1: rule__Arm64ProcessorArchitecture__Group__1 : rule__Arm64ProcessorArchitecture__Group__1__Impl ;
    public final void rule__Arm64ProcessorArchitecture__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7715:1: ( rule__Arm64ProcessorArchitecture__Group__1__Impl )
            // InternalDeviceParser.g:7716:2: rule__Arm64ProcessorArchitecture__Group__1__Impl
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
    // InternalDeviceParser.g:7722:1: rule__Arm64ProcessorArchitecture__Group__1__Impl : ( Arm64 ) ;
    public final void rule__Arm64ProcessorArchitecture__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7726:1: ( ( Arm64 ) )
            // InternalDeviceParser.g:7727:1: ( Arm64 )
            {
            // InternalDeviceParser.g:7727:1: ( Arm64 )
            // InternalDeviceParser.g:7728:2: Arm64
            {
             before(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64Keyword_1());
            match(input,Arm64,FOLLOW_2);
             after(grammarAccess.getArm64ProcessorArchitectureAccess().getArm64Keyword_1());

            }


            }

        }
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
    // InternalDeviceParser.g:7738:1: rule__CommunicationType__Group__0 : rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 ;
    public final void rule__CommunicationType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7742:1: ( rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 )
            // InternalDeviceParser.g:7743:2: rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1
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
    // InternalDeviceParser.g:7750:1: rule__CommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7754:1: ( ( () ) )
            // InternalDeviceParser.g:7755:1: ( () )
            {
            // InternalDeviceParser.g:7755:1: ( () )
            // InternalDeviceParser.g:7756:2: ()
            {
             before(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0());
            // InternalDeviceParser.g:7757:2: ()
            // InternalDeviceParser.g:7757:3:
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
    // InternalDeviceParser.g:7765:1: rule__CommunicationType__Group__1 : rule__CommunicationType__Group__1__Impl ;
    public final void rule__CommunicationType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7769:1: ( rule__CommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:7770:2: rule__CommunicationType__Group__1__Impl
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
    // InternalDeviceParser.g:7776:1: rule__CommunicationType__Group__1__Impl : ( ( rule__CommunicationType__NameAssignment_1 ) ) ;
    public final void rule__CommunicationType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7780:1: ( ( ( rule__CommunicationType__NameAssignment_1 ) ) )
            // InternalDeviceParser.g:7781:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            {
            // InternalDeviceParser.g:7781:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            // InternalDeviceParser.g:7782:2: ( rule__CommunicationType__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1());
            // InternalDeviceParser.g:7783:2: ( rule__CommunicationType__NameAssignment_1 )
            // InternalDeviceParser.g:7783:3: rule__CommunicationType__NameAssignment_1
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
    // InternalDeviceParser.g:7792:1: rule__EthernetCommunicationType__Group__0 : rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 ;
    public final void rule__EthernetCommunicationType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7796:1: ( rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 )
            // InternalDeviceParser.g:7797:2: rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1
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
    // InternalDeviceParser.g:7804:1: rule__EthernetCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__EthernetCommunicationType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7808:1: ( ( () ) )
            // InternalDeviceParser.g:7809:1: ( () )
            {
            // InternalDeviceParser.g:7809:1: ( () )
            // InternalDeviceParser.g:7810:2: ()
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeAction_0());
            // InternalDeviceParser.g:7811:2: ()
            // InternalDeviceParser.g:7811:3:
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
    // InternalDeviceParser.g:7819:1: rule__EthernetCommunicationType__Group__1 : rule__EthernetCommunicationType__Group__1__Impl ;
    public final void rule__EthernetCommunicationType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7823:1: ( rule__EthernetCommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:7824:2: rule__EthernetCommunicationType__Group__1__Impl
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
    // InternalDeviceParser.g:7830:1: rule__EthernetCommunicationType__Group__1__Impl : ( Ethernet ) ;
    public final void rule__EthernetCommunicationType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7834:1: ( ( Ethernet ) )
            // InternalDeviceParser.g:7835:1: ( Ethernet )
            {
            // InternalDeviceParser.g:7835:1: ( Ethernet )
            // InternalDeviceParser.g:7836:2: Ethernet
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
    // InternalDeviceParser.g:7846:1: rule__WlanCommunicationType__Group__0 : rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 ;
    public final void rule__WlanCommunicationType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7850:1: ( rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 )
            // InternalDeviceParser.g:7851:2: rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1
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
    // InternalDeviceParser.g:7858:1: rule__WlanCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__WlanCommunicationType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7862:1: ( ( () ) )
            // InternalDeviceParser.g:7863:1: ( () )
            {
            // InternalDeviceParser.g:7863:1: ( () )
            // InternalDeviceParser.g:7864:2: ()
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeAction_0());
            // InternalDeviceParser.g:7865:2: ()
            // InternalDeviceParser.g:7865:3:
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
    // InternalDeviceParser.g:7873:1: rule__WlanCommunicationType__Group__1 : rule__WlanCommunicationType__Group__1__Impl ;
    public final void rule__WlanCommunicationType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7877:1: ( rule__WlanCommunicationType__Group__1__Impl )
            // InternalDeviceParser.g:7878:2: rule__WlanCommunicationType__Group__1__Impl
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
    // InternalDeviceParser.g:7884:1: rule__WlanCommunicationType__Group__1__Impl : ( Wlan ) ;
    public final void rule__WlanCommunicationType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7888:1: ( ( Wlan ) )
            // InternalDeviceParser.g:7889:1: ( Wlan )
            {
            // InternalDeviceParser.g:7889:1: ( Wlan )
            // InternalDeviceParser.g:7890:2: Wlan
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


    // $ANTLR start "rule__AttributeKind__Group__0"
    // InternalDeviceParser.g:7900:1: rule__AttributeKind__Group__0 : rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 ;
    public final void rule__AttributeKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7904:1: ( rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 )
            // InternalDeviceParser.g:7905:2: rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDeviceParser.g:7912:1: rule__AttributeKind__Group__0__Impl : ( () ) ;
    public final void rule__AttributeKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7916:1: ( ( () ) )
            // InternalDeviceParser.g:7917:1: ( () )
            {
            // InternalDeviceParser.g:7917:1: ( () )
            // InternalDeviceParser.g:7918:2: ()
            {
             before(grammarAccess.getAttributeKindAccess().getAttributeKindAction_0());
            // InternalDeviceParser.g:7919:2: ()
            // InternalDeviceParser.g:7919:3:
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
    // InternalDeviceParser.g:7927:1: rule__AttributeKind__Group__1 : rule__AttributeKind__Group__1__Impl ;
    public final void rule__AttributeKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7931:1: ( rule__AttributeKind__Group__1__Impl )
            // InternalDeviceParser.g:7932:2: rule__AttributeKind__Group__1__Impl
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
    // InternalDeviceParser.g:7938:1: rule__AttributeKind__Group__1__Impl : ( AttributeKind ) ;
    public final void rule__AttributeKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7942:1: ( ( AttributeKind ) )
            // InternalDeviceParser.g:7943:1: ( AttributeKind )
            {
            // InternalDeviceParser.g:7943:1: ( AttributeKind )
            // InternalDeviceParser.g:7944:2: AttributeKind
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
    // InternalDeviceParser.g:7954:1: rule__MaximumKind__Group__0 : rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 ;
    public final void rule__MaximumKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7958:1: ( rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 )
            // InternalDeviceParser.g:7959:2: rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDeviceParser.g:7966:1: rule__MaximumKind__Group__0__Impl : ( () ) ;
    public final void rule__MaximumKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7970:1: ( ( () ) )
            // InternalDeviceParser.g:7971:1: ( () )
            {
            // InternalDeviceParser.g:7971:1: ( () )
            // InternalDeviceParser.g:7972:2: ()
            {
             before(grammarAccess.getMaximumKindAccess().getMaximumKindAction_0());
            // InternalDeviceParser.g:7973:2: ()
            // InternalDeviceParser.g:7973:3:
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
    // InternalDeviceParser.g:7981:1: rule__MaximumKind__Group__1 : rule__MaximumKind__Group__1__Impl ;
    public final void rule__MaximumKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7985:1: ( rule__MaximumKind__Group__1__Impl )
            // InternalDeviceParser.g:7986:2: rule__MaximumKind__Group__1__Impl
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
    // InternalDeviceParser.g:7992:1: rule__MaximumKind__Group__1__Impl : ( MaximumKind ) ;
    public final void rule__MaximumKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:7996:1: ( ( MaximumKind ) )
            // InternalDeviceParser.g:7997:1: ( MaximumKind )
            {
            // InternalDeviceParser.g:7997:1: ( MaximumKind )
            // InternalDeviceParser.g:7998:2: MaximumKind
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
    // InternalDeviceParser.g:8008:1: rule__MinimumKind__Group__0 : rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 ;
    public final void rule__MinimumKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8012:1: ( rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 )
            // InternalDeviceParser.g:8013:2: rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDeviceParser.g:8020:1: rule__MinimumKind__Group__0__Impl : ( () ) ;
    public final void rule__MinimumKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8024:1: ( ( () ) )
            // InternalDeviceParser.g:8025:1: ( () )
            {
            // InternalDeviceParser.g:8025:1: ( () )
            // InternalDeviceParser.g:8026:2: ()
            {
             before(grammarAccess.getMinimumKindAccess().getMinimumKindAction_0());
            // InternalDeviceParser.g:8027:2: ()
            // InternalDeviceParser.g:8027:3:
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
    // InternalDeviceParser.g:8035:1: rule__MinimumKind__Group__1 : rule__MinimumKind__Group__1__Impl ;
    public final void rule__MinimumKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8039:1: ( rule__MinimumKind__Group__1__Impl )
            // InternalDeviceParser.g:8040:2: rule__MinimumKind__Group__1__Impl
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
    // InternalDeviceParser.g:8046:1: rule__MinimumKind__Group__1__Impl : ( MinimumKind ) ;
    public final void rule__MinimumKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8050:1: ( ( MinimumKind ) )
            // InternalDeviceParser.g:8051:1: ( MinimumKind )
            {
            // InternalDeviceParser.g:8051:1: ( MinimumKind )
            // InternalDeviceParser.g:8052:2: MinimumKind
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
    // InternalDeviceParser.g:8062:1: rule__SelectionKind__Group__0 : rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 ;
    public final void rule__SelectionKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8066:1: ( rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 )
            // InternalDeviceParser.g:8067:2: rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDeviceParser.g:8074:1: rule__SelectionKind__Group__0__Impl : ( () ) ;
    public final void rule__SelectionKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8078:1: ( ( () ) )
            // InternalDeviceParser.g:8079:1: ( () )
            {
            // InternalDeviceParser.g:8079:1: ( () )
            // InternalDeviceParser.g:8080:2: ()
            {
             before(grammarAccess.getSelectionKindAccess().getSelectionKindAction_0());
            // InternalDeviceParser.g:8081:2: ()
            // InternalDeviceParser.g:8081:3:
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
    // InternalDeviceParser.g:8089:1: rule__SelectionKind__Group__1 : rule__SelectionKind__Group__1__Impl ;
    public final void rule__SelectionKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8093:1: ( rule__SelectionKind__Group__1__Impl )
            // InternalDeviceParser.g:8094:2: rule__SelectionKind__Group__1__Impl
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
    // InternalDeviceParser.g:8100:1: rule__SelectionKind__Group__1__Impl : ( SelectionKind ) ;
    public final void rule__SelectionKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8104:1: ( ( SelectionKind ) )
            // InternalDeviceParser.g:8105:1: ( SelectionKind )
            {
            // InternalDeviceParser.g:8105:1: ( SelectionKind )
            // InternalDeviceParser.g:8106:2: SelectionKind
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


    // $ANTLR start "rule__RangeKind__Group__0"
    // InternalDeviceParser.g:8116:1: rule__RangeKind__Group__0 : rule__RangeKind__Group__0__Impl rule__RangeKind__Group__1 ;
    public final void rule__RangeKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8120:1: ( rule__RangeKind__Group__0__Impl rule__RangeKind__Group__1 )
            // InternalDeviceParser.g:8121:2: rule__RangeKind__Group__0__Impl rule__RangeKind__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__RangeKind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeKind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeKind__Group__0"


    // $ANTLR start "rule__RangeKind__Group__0__Impl"
    // InternalDeviceParser.g:8128:1: rule__RangeKind__Group__0__Impl : ( () ) ;
    public final void rule__RangeKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8132:1: ( ( () ) )
            // InternalDeviceParser.g:8133:1: ( () )
            {
            // InternalDeviceParser.g:8133:1: ( () )
            // InternalDeviceParser.g:8134:2: ()
            {
             before(grammarAccess.getRangeKindAccess().getRangeKindAction_0());
            // InternalDeviceParser.g:8135:2: ()
            // InternalDeviceParser.g:8135:3:
            {
            }

             after(grammarAccess.getRangeKindAccess().getRangeKindAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeKind__Group__0__Impl"


    // $ANTLR start "rule__RangeKind__Group__1"
    // InternalDeviceParser.g:8143:1: rule__RangeKind__Group__1 : rule__RangeKind__Group__1__Impl ;
    public final void rule__RangeKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8147:1: ( rule__RangeKind__Group__1__Impl )
            // InternalDeviceParser.g:8148:2: rule__RangeKind__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeKind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeKind__Group__1"


    // $ANTLR start "rule__RangeKind__Group__1__Impl"
    // InternalDeviceParser.g:8154:1: rule__RangeKind__Group__1__Impl : ( RangeKind ) ;
    public final void rule__RangeKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8158:1: ( ( RangeKind ) )
            // InternalDeviceParser.g:8159:1: ( RangeKind )
            {
            // InternalDeviceParser.g:8159:1: ( RangeKind )
            // InternalDeviceParser.g:8160:2: RangeKind
            {
             before(grammarAccess.getRangeKindAccess().getRangeKindKeyword_1());
            match(input,RangeKind,FOLLOW_2);
             after(grammarAccess.getRangeKindAccess().getRangeKindKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeKind__Group__1__Impl"


    // $ANTLR start "rule__DeviceSet__DeviceAssignment_0"
    // InternalDeviceParser.g:8170:1: rule__DeviceSet__DeviceAssignment_0 : ( ruleDeviceType ) ;
    public final void rule__DeviceSet__DeviceAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8174:1: ( ( ruleDeviceType ) )
            // InternalDeviceParser.g:8175:2: ( ruleDeviceType )
            {
            // InternalDeviceParser.g:8175:2: ( ruleDeviceType )
            // InternalDeviceParser.g:8176:3: ruleDeviceType
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_0_0());
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_0_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__DeviceAssignment_0"


    // $ANTLR start "rule__DeviceSet__DeviceAssignment_1_1"
    // InternalDeviceParser.g:8185:1: rule__DeviceSet__DeviceAssignment_1_1 : ( ruleDeviceType ) ;
    public final void rule__DeviceSet__DeviceAssignment_1_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8189:1: ( ( ruleDeviceType ) )
            // InternalDeviceParser.g:8190:2: ( ruleDeviceType )
            {
            // InternalDeviceParser.g:8190:2: ( ruleDeviceType )
            // InternalDeviceParser.g:8191:3: ruleDeviceType
            {
             before(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_1_1_0());
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_1_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceSet__DeviceAssignment_1_1"


    // $ANTLR start "rule__InterfaceNetworkProperty__NameAssignment_3"
    // InternalDeviceParser.g:8200:1: rule__InterfaceNetworkProperty__NameAssignment_3 : ( ( Interface ) ) ;
    public final void rule__InterfaceNetworkProperty__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8204:1: ( ( ( Interface ) ) )
            // InternalDeviceParser.g:8205:2: ( ( Interface ) )
            {
            // InternalDeviceParser.g:8205:2: ( ( Interface ) )
            // InternalDeviceParser.g:8206:3: ( Interface )
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getNameInterfaceKeyword_3_0());
            // InternalDeviceParser.g:8207:3: ( Interface )
            // InternalDeviceParser.g:8208:4: Interface
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getNameInterfaceKeyword_3_0());
            match(input,Interface,FOLLOW_2);
             after(grammarAccess.getInterfaceNetworkPropertyAccess().getNameInterfaceKeyword_3_0());

            }

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getNameInterfaceKeyword_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__NameAssignment_3"


    // $ANTLR start "rule__InterfaceNetworkProperty__KindAssignment_6"
    // InternalDeviceParser.g:8219:1: rule__InterfaceNetworkProperty__KindAssignment_6 : ( ruleAttributeKind ) ;
    public final void rule__InterfaceNetworkProperty__KindAssignment_6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8223:1: ( ( ruleAttributeKind ) )
            // InternalDeviceParser.g:8224:2: ( ruleAttributeKind )
            {
            // InternalDeviceParser.g:8224:2: ( ruleAttributeKind )
            // InternalDeviceParser.g:8225:3: ruleAttributeKind
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());
            pushFollow(FOLLOW_2);
            ruleAttributeKind();

            state._fsp--;

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__KindAssignment_6"


    // $ANTLR start "rule__InterfaceNetworkProperty__DescriptionAssignment_7_1"
    // InternalDeviceParser.g:8234:1: rule__InterfaceNetworkProperty__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__InterfaceNetworkProperty__DescriptionAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8238:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8239:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8239:2: ( ruleEString )
            // InternalDeviceParser.g:8240:3: ruleEString
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__DescriptionAssignment_7_1"


    // $ANTLR start "rule__InterfaceNetworkProperty__ValueAssignment_8_1"
    // InternalDeviceParser.g:8249:1: rule__InterfaceNetworkProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__InterfaceNetworkProperty__ValueAssignment_8_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8253:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8254:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8254:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8255:3: rulePropertyValue
            {
             before(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceNetworkProperty__ValueAssignment_8_1"


    // $ANTLR start "rule__AddressNetworkProperty__NameAssignment_3"
    // InternalDeviceParser.g:8264:1: rule__AddressNetworkProperty__NameAssignment_3 : ( ( Address ) ) ;
    public final void rule__AddressNetworkProperty__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8268:1: ( ( ( Address ) ) )
            // InternalDeviceParser.g:8269:2: ( ( Address ) )
            {
            // InternalDeviceParser.g:8269:2: ( ( Address ) )
            // InternalDeviceParser.g:8270:3: ( Address )
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getNameAddressKeyword_3_0());
            // InternalDeviceParser.g:8271:3: ( Address )
            // InternalDeviceParser.g:8272:4: Address
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getNameAddressKeyword_3_0());
            match(input,Address,FOLLOW_2);
             after(grammarAccess.getAddressNetworkPropertyAccess().getNameAddressKeyword_3_0());

            }

             after(grammarAccess.getAddressNetworkPropertyAccess().getNameAddressKeyword_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__NameAssignment_3"


    // $ANTLR start "rule__AddressNetworkProperty__KindAssignment_6"
    // InternalDeviceParser.g:8283:1: rule__AddressNetworkProperty__KindAssignment_6 : ( ruleAttributeKind ) ;
    public final void rule__AddressNetworkProperty__KindAssignment_6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8287:1: ( ( ruleAttributeKind ) )
            // InternalDeviceParser.g:8288:2: ( ruleAttributeKind )
            {
            // InternalDeviceParser.g:8288:2: ( ruleAttributeKind )
            // InternalDeviceParser.g:8289:3: ruleAttributeKind
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());
            pushFollow(FOLLOW_2);
            ruleAttributeKind();

            state._fsp--;

             after(grammarAccess.getAddressNetworkPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__KindAssignment_6"


    // $ANTLR start "rule__AddressNetworkProperty__DescriptionAssignment_7_1"
    // InternalDeviceParser.g:8298:1: rule__AddressNetworkProperty__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__AddressNetworkProperty__DescriptionAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8302:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8303:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8303:2: ( ruleEString )
            // InternalDeviceParser.g:8304:3: ruleEString
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddressNetworkPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__DescriptionAssignment_7_1"


    // $ANTLR start "rule__AddressNetworkProperty__ValueAssignment_8_1"
    // InternalDeviceParser.g:8313:1: rule__AddressNetworkProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__AddressNetworkProperty__ValueAssignment_8_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8317:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8318:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8318:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8319:3: rulePropertyValue
            {
             before(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressNetworkProperty__ValueAssignment_8_1"


    // $ANTLR start "rule__DeviceType_Impl__NameAssignment_4"
    // InternalDeviceParser.g:8328:1: rule__DeviceType_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__DeviceType_Impl__NameAssignment_4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8332:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8333:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8333:2: ( ruleEString )
            // InternalDeviceParser.g:8334:3: ruleEString
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


    // $ANTLR start "rule__DeviceType_Impl__DevicePropertyAssignment_5_2"
    // InternalDeviceParser.g:8343:1: rule__DeviceType_Impl__DevicePropertyAssignment_5_2 : ( ruleDeviceProperty ) ;
    public final void rule__DeviceType_Impl__DevicePropertyAssignment_5_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8347:1: ( ( ruleDeviceProperty ) )
            // InternalDeviceParser.g:8348:2: ( ruleDeviceProperty )
            {
            // InternalDeviceParser.g:8348:2: ( ruleDeviceProperty )
            // InternalDeviceParser.g:8349:3: ruleDeviceProperty
            {
             before(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyDevicePropertyParserRuleCall_5_2_0());
            pushFollow(FOLLOW_2);
            ruleDeviceProperty();

            state._fsp--;

             after(grammarAccess.getDeviceType_ImplAccess().getDevicePropertyDevicePropertyParserRuleCall_5_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType_Impl__DevicePropertyAssignment_5_2"


    // $ANTLR start "rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2"
    // InternalDeviceParser.g:8358:1: rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__DeviceType_Impl__CommunicationConnectionAssignment_6_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8362:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalDeviceParser.g:8363:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalDeviceParser.g:8363:2: ( ruleAbstractCommunicationConnection )
            // InternalDeviceParser.g:8364:3: ruleAbstractCommunicationConnection
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


    // $ANTLR start "rule__DeviceProperty__NameAssignment_2"
    // InternalDeviceParser.g:8373:1: rule__DeviceProperty__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DeviceProperty__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8377:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8378:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8378:2: ( ruleEString )
            // InternalDeviceParser.g:8379:3: ruleEString
            {
             before(grammarAccess.getDevicePropertyAccess().getNameEStringParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDevicePropertyAccess().getNameEStringParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__NameAssignment_2"


    // $ANTLR start "rule__DeviceProperty__KindAssignment_5"
    // InternalDeviceParser.g:8388:1: rule__DeviceProperty__KindAssignment_5 : ( rulePropertyKind ) ;
    public final void rule__DeviceProperty__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8392:1: ( ( rulePropertyKind ) )
            // InternalDeviceParser.g:8393:2: ( rulePropertyKind )
            {
            // InternalDeviceParser.g:8393:2: ( rulePropertyKind )
            // InternalDeviceParser.g:8394:3: rulePropertyKind
            {
             before(grammarAccess.getDevicePropertyAccess().getKindPropertyKindParserRuleCall_5_0());
            pushFollow(FOLLOW_2);
            rulePropertyKind();

            state._fsp--;

             after(grammarAccess.getDevicePropertyAccess().getKindPropertyKindParserRuleCall_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__KindAssignment_5"


    // $ANTLR start "rule__DeviceProperty__TypeAssignment_7"
    // InternalDeviceParser.g:8403:1: rule__DeviceProperty__TypeAssignment_7 : ( ruleAbstractResouceType ) ;
    public final void rule__DeviceProperty__TypeAssignment_7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8407:1: ( ( ruleAbstractResouceType ) )
            // InternalDeviceParser.g:8408:2: ( ruleAbstractResouceType )
            {
            // InternalDeviceParser.g:8408:2: ( ruleAbstractResouceType )
            // InternalDeviceParser.g:8409:3: ruleAbstractResouceType
            {
             before(grammarAccess.getDevicePropertyAccess().getTypeAbstractResouceTypeParserRuleCall_7_0());
            pushFollow(FOLLOW_2);
            ruleAbstractResouceType();

            state._fsp--;

             after(grammarAccess.getDevicePropertyAccess().getTypeAbstractResouceTypeParserRuleCall_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__TypeAssignment_7"


    // $ANTLR start "rule__DeviceProperty__DescriptionAssignment_8_1"
    // InternalDeviceParser.g:8418:1: rule__DeviceProperty__DescriptionAssignment_8_1 : ( ruleEString ) ;
    public final void rule__DeviceProperty__DescriptionAssignment_8_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8422:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8423:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8423:2: ( ruleEString )
            // InternalDeviceParser.g:8424:3: ruleEString
            {
             before(grammarAccess.getDevicePropertyAccess().getDescriptionEStringParserRuleCall_8_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDevicePropertyAccess().getDescriptionEStringParserRuleCall_8_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__DescriptionAssignment_8_1"


    // $ANTLR start "rule__DeviceProperty__ValueAssignment_9_3"
    // InternalDeviceParser.g:8433:1: rule__DeviceProperty__ValueAssignment_9_3 : ( rulePropertyValue ) ;
    public final void rule__DeviceProperty__ValueAssignment_9_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8437:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8438:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8438:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8439:3: rulePropertyValue
            {
             before(grammarAccess.getDevicePropertyAccess().getValuePropertyValueParserRuleCall_9_3_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getDevicePropertyAccess().getValuePropertyValueParserRuleCall_9_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__ValueAssignment_9_3"


    // $ANTLR start "rule__DeviceProperty__ValueAssignment_9_4_1"
    // InternalDeviceParser.g:8448:1: rule__DeviceProperty__ValueAssignment_9_4_1 : ( rulePropertyValue ) ;
    public final void rule__DeviceProperty__ValueAssignment_9_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8452:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8453:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8453:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8454:3: rulePropertyValue
            {
             before(grammarAccess.getDevicePropertyAccess().getValuePropertyValueParserRuleCall_9_4_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getDevicePropertyAccess().getValuePropertyValueParserRuleCall_9_4_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceProperty__ValueAssignment_9_4_1"


    // $ANTLR start "rule__ComputationDeviceType__NameAssignment_3"
    // InternalDeviceParser.g:8463:1: rule__ComputationDeviceType__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComputationDeviceType__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8467:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8468:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8468:2: ( ruleEString )
            // InternalDeviceParser.g:8469:3: ruleEString
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


    // $ANTLR start "rule__ComputationDeviceType__DevicePropertyAssignment_4_2"
    // InternalDeviceParser.g:8478:1: rule__ComputationDeviceType__DevicePropertyAssignment_4_2 : ( ruleDeviceProperty ) ;
    public final void rule__ComputationDeviceType__DevicePropertyAssignment_4_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8482:1: ( ( ruleDeviceProperty ) )
            // InternalDeviceParser.g:8483:2: ( ruleDeviceProperty )
            {
            // InternalDeviceParser.g:8483:2: ( ruleDeviceProperty )
            // InternalDeviceParser.g:8484:3: ruleDeviceProperty
            {
             before(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyDevicePropertyParserRuleCall_4_2_0());
            pushFollow(FOLLOW_2);
            ruleDeviceProperty();

            state._fsp--;

             after(grammarAccess.getComputationDeviceTypeAccess().getDevicePropertyDevicePropertyParserRuleCall_4_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComputationDeviceType__DevicePropertyAssignment_4_2"


    // $ANTLR start "rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2"
    // InternalDeviceParser.g:8493:1: rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2 : ( ruleAbstractCommunicationConnection ) ;
    public final void rule__ComputationDeviceType__CommunicationConnectionAssignment_5_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8497:1: ( ( ruleAbstractCommunicationConnection ) )
            // InternalDeviceParser.g:8498:2: ( ruleAbstractCommunicationConnection )
            {
            // InternalDeviceParser.g:8498:2: ( ruleAbstractCommunicationConnection )
            // InternalDeviceParser.g:8499:3: ruleAbstractCommunicationConnection
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


    // $ANTLR start "rule__ConnectionProperty__NameAssignment_3"
    // InternalDeviceParser.g:8508:1: rule__ConnectionProperty__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ConnectionProperty__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8512:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8513:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8513:2: ( ruleEString )
            // InternalDeviceParser.g:8514:3: ruleEString
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


    // $ANTLR start "rule__ConnectionProperty__KindAssignment_6"
    // InternalDeviceParser.g:8523:1: rule__ConnectionProperty__KindAssignment_6 : ( ruleAttributeKind ) ;
    public final void rule__ConnectionProperty__KindAssignment_6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8527:1: ( ( ruleAttributeKind ) )
            // InternalDeviceParser.g:8528:2: ( ruleAttributeKind )
            {
            // InternalDeviceParser.g:8528:2: ( ruleAttributeKind )
            // InternalDeviceParser.g:8529:3: ruleAttributeKind
            {
             before(grammarAccess.getConnectionPropertyAccess().getKindAttributeKindParserRuleCall_6_0());
            pushFollow(FOLLOW_2);
            ruleAttributeKind();

            state._fsp--;

             after(grammarAccess.getConnectionPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__KindAssignment_6"


    // $ANTLR start "rule__ConnectionProperty__DescriptionAssignment_7_1"
    // InternalDeviceParser.g:8538:1: rule__ConnectionProperty__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__ConnectionProperty__DescriptionAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8542:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8543:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8543:2: ( ruleEString )
            // InternalDeviceParser.g:8544:3: ruleEString
            {
             before(grammarAccess.getConnectionPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__DescriptionAssignment_7_1"


    // $ANTLR start "rule__ConnectionProperty__ValueAssignment_8_1"
    // InternalDeviceParser.g:8553:1: rule__ConnectionProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__ConnectionProperty__ValueAssignment_8_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8557:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8558:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8558:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8559:3: rulePropertyValue
            {
             before(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionProperty__ValueAssignment_8_1"


    // $ANTLR start "rule__NetworkConnection__NameAssignment_3"
    // InternalDeviceParser.g:8568:1: rule__NetworkConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__NetworkConnection__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8572:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8573:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8573:2: ( ruleEString )
            // InternalDeviceParser.g:8574:3: ruleEString
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
    // InternalDeviceParser.g:8583:1: rule__NetworkConnection__TypeAssignment_6 : ( ruleNetworkCommunicationType ) ;
    public final void rule__NetworkConnection__TypeAssignment_6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8587:1: ( ( ruleNetworkCommunicationType ) )
            // InternalDeviceParser.g:8588:2: ( ruleNetworkCommunicationType )
            {
            // InternalDeviceParser.g:8588:2: ( ruleNetworkCommunicationType )
            // InternalDeviceParser.g:8589:3: ruleNetworkCommunicationType
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
    // InternalDeviceParser.g:8598:1: rule__NetworkConnection__PropertiesAssignment_7_2 : ( ruleAbstractNetworkProperty ) ;
    public final void rule__NetworkConnection__PropertiesAssignment_7_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8602:1: ( ( ruleAbstractNetworkProperty ) )
            // InternalDeviceParser.g:8603:2: ( ruleAbstractNetworkProperty )
            {
            // InternalDeviceParser.g:8603:2: ( ruleAbstractNetworkProperty )
            // InternalDeviceParser.g:8604:3: ruleAbstractNetworkProperty
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
    // InternalDeviceParser.g:8613:1: rule__CommunicationConnection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__CommunicationConnection__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8617:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8618:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8618:2: ( ruleEString )
            // InternalDeviceParser.g:8619:3: ruleEString
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
    // InternalDeviceParser.g:8628:1: rule__CommunicationConnection__TypeAssignment_6 : ( ruleCommunicationType ) ;
    public final void rule__CommunicationConnection__TypeAssignment_6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8632:1: ( ( ruleCommunicationType ) )
            // InternalDeviceParser.g:8633:2: ( ruleCommunicationType )
            {
            // InternalDeviceParser.g:8633:2: ( ruleCommunicationType )
            // InternalDeviceParser.g:8634:3: ruleCommunicationType
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
    // InternalDeviceParser.g:8643:1: rule__CommunicationConnection__PropertiesAssignment_7_2 : ( ruleConnectionProperty ) ;
    public final void rule__CommunicationConnection__PropertiesAssignment_7_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8647:1: ( ( ruleConnectionProperty ) )
            // InternalDeviceParser.g:8648:2: ( ruleConnectionProperty )
            {
            // InternalDeviceParser.g:8648:2: ( ruleConnectionProperty )
            // InternalDeviceParser.g:8649:3: ruleConnectionProperty
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


    // $ANTLR start "rule__Property__NameAssignment_2"
    // InternalDeviceParser.g:8658:1: rule__Property__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8662:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8663:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8663:2: ( ruleEString )
            // InternalDeviceParser.g:8664:3: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_2"


    // $ANTLR start "rule__Property__KindAssignment_5"
    // InternalDeviceParser.g:8673:1: rule__Property__KindAssignment_5 : ( rulePropertyKind ) ;
    public final void rule__Property__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8677:1: ( ( rulePropertyKind ) )
            // InternalDeviceParser.g:8678:2: ( rulePropertyKind )
            {
            // InternalDeviceParser.g:8678:2: ( rulePropertyKind )
            // InternalDeviceParser.g:8679:3: rulePropertyKind
            {
             before(grammarAccess.getPropertyAccess().getKindPropertyKindParserRuleCall_5_0());
            pushFollow(FOLLOW_2);
            rulePropertyKind();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getKindPropertyKindParserRuleCall_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__KindAssignment_5"


    // $ANTLR start "rule__Property__DescriptionAssignment_6_1"
    // InternalDeviceParser.g:8688:1: rule__Property__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Property__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8692:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8693:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8693:2: ( ruleEString )
            // InternalDeviceParser.g:8694:3: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_6_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_6_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__DescriptionAssignment_6_1"


    // $ANTLR start "rule__Property__ValueAssignment_7_3"
    // InternalDeviceParser.g:8703:1: rule__Property__ValueAssignment_7_3 : ( rulePropertyValue ) ;
    public final void rule__Property__ValueAssignment_7_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8707:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8708:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8708:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8709:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_3_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_7_3"


    // $ANTLR start "rule__Property__ValueAssignment_7_4_1"
    // InternalDeviceParser.g:8718:1: rule__Property__ValueAssignment_7_4_1 : ( rulePropertyValue ) ;
    public final void rule__Property__ValueAssignment_7_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8722:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8723:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8723:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8724:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_4_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_7_4_1"


    // $ANTLR start "rule__PropertyAttribute__NameAssignment_2"
    // InternalDeviceParser.g:8733:1: rule__PropertyAttribute__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertyAttribute__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8737:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8738:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8738:2: ( ruleEString )
            // InternalDeviceParser.g:8739:3: ruleEString
            {
             before(grammarAccess.getPropertyAttributeAccess().getNameEStringParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAttributeAccess().getNameEStringParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__NameAssignment_2"


    // $ANTLR start "rule__PropertyAttribute__KindAssignment_5"
    // InternalDeviceParser.g:8748:1: rule__PropertyAttribute__KindAssignment_5 : ( ruleAttributeKind ) ;
    public final void rule__PropertyAttribute__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8752:1: ( ( ruleAttributeKind ) )
            // InternalDeviceParser.g:8753:2: ( ruleAttributeKind )
            {
            // InternalDeviceParser.g:8753:2: ( ruleAttributeKind )
            // InternalDeviceParser.g:8754:3: ruleAttributeKind
            {
             before(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());
            pushFollow(FOLLOW_2);
            ruleAttributeKind();

            state._fsp--;

             after(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__KindAssignment_5"


    // $ANTLR start "rule__PropertyAttribute__DescriptionAssignment_6_1"
    // InternalDeviceParser.g:8763:1: rule__PropertyAttribute__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertyAttribute__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8767:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8768:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8768:2: ( ruleEString )
            // InternalDeviceParser.g:8769:3: ruleEString
            {
             before(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__DescriptionAssignment_6_1"


    // $ANTLR start "rule__PropertyAttribute__ValueAssignment_7_1"
    // InternalDeviceParser.g:8778:1: rule__PropertyAttribute__ValueAssignment_7_1 : ( rulePropertyValue ) ;
    public final void rule__PropertyAttribute__ValueAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8782:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8783:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8783:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8784:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__ValueAssignment_7_1"


    // $ANTLR start "rule__PropertyMaximun__NameAssignment_2"
    // InternalDeviceParser.g:8793:1: rule__PropertyMaximun__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertyMaximun__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8797:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8798:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8798:2: ( ruleEString )
            // InternalDeviceParser.g:8799:3: ruleEString
            {
             before(grammarAccess.getPropertyMaximunAccess().getNameEStringParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyMaximunAccess().getNameEStringParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__NameAssignment_2"


    // $ANTLR start "rule__PropertyMaximun__KindAssignment_5"
    // InternalDeviceParser.g:8808:1: rule__PropertyMaximun__KindAssignment_5 : ( ruleMaximumKind ) ;
    public final void rule__PropertyMaximun__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8812:1: ( ( ruleMaximumKind ) )
            // InternalDeviceParser.g:8813:2: ( ruleMaximumKind )
            {
            // InternalDeviceParser.g:8813:2: ( ruleMaximumKind )
            // InternalDeviceParser.g:8814:3: ruleMaximumKind
            {
             before(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());
            pushFollow(FOLLOW_2);
            ruleMaximumKind();

            state._fsp--;

             after(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__KindAssignment_5"


    // $ANTLR start "rule__PropertyMaximun__DescriptionAssignment_6_1"
    // InternalDeviceParser.g:8823:1: rule__PropertyMaximun__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertyMaximun__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8827:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8828:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8828:2: ( ruleEString )
            // InternalDeviceParser.g:8829:3: ruleEString
            {
             before(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__DescriptionAssignment_6_1"


    // $ANTLR start "rule__PropertyMaximun__ValueAssignment_7_1"
    // InternalDeviceParser.g:8838:1: rule__PropertyMaximun__ValueAssignment_7_1 : ( rulePropertyValue ) ;
    public final void rule__PropertyMaximun__ValueAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8842:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8843:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8843:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8844:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMaximun__ValueAssignment_7_1"


    // $ANTLR start "rule__PropertyMinimum__NameAssignment_2"
    // InternalDeviceParser.g:8853:1: rule__PropertyMinimum__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertyMinimum__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8857:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8858:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8858:2: ( ruleEString )
            // InternalDeviceParser.g:8859:3: ruleEString
            {
             before(grammarAccess.getPropertyMinimumAccess().getNameEStringParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyMinimumAccess().getNameEStringParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__NameAssignment_2"


    // $ANTLR start "rule__PropertyMinimum__KindAssignment_5"
    // InternalDeviceParser.g:8868:1: rule__PropertyMinimum__KindAssignment_5 : ( ruleMinimumKind ) ;
    public final void rule__PropertyMinimum__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8872:1: ( ( ruleMinimumKind ) )
            // InternalDeviceParser.g:8873:2: ( ruleMinimumKind )
            {
            // InternalDeviceParser.g:8873:2: ( ruleMinimumKind )
            // InternalDeviceParser.g:8874:3: ruleMinimumKind
            {
             before(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());
            pushFollow(FOLLOW_2);
            ruleMinimumKind();

            state._fsp--;

             after(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__KindAssignment_5"


    // $ANTLR start "rule__PropertyMinimum__DescriptionAssignment_6_1"
    // InternalDeviceParser.g:8883:1: rule__PropertyMinimum__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertyMinimum__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8887:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8888:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8888:2: ( ruleEString )
            // InternalDeviceParser.g:8889:3: ruleEString
            {
             before(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__DescriptionAssignment_6_1"


    // $ANTLR start "rule__PropertyMinimum__ValueAssignment_7_1"
    // InternalDeviceParser.g:8898:1: rule__PropertyMinimum__ValueAssignment_7_1 : ( rulePropertyValue ) ;
    public final void rule__PropertyMinimum__ValueAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8902:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8903:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8903:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8904:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyMinimum__ValueAssignment_7_1"


    // $ANTLR start "rule__PropertySelection__NameAssignment_2"
    // InternalDeviceParser.g:8913:1: rule__PropertySelection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertySelection__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8917:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8918:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8918:2: ( ruleEString )
            // InternalDeviceParser.g:8919:3: ruleEString
            {
             before(grammarAccess.getPropertySelectionAccess().getNameEStringParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertySelectionAccess().getNameEStringParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__NameAssignment_2"


    // $ANTLR start "rule__PropertySelection__KindAssignment_5"
    // InternalDeviceParser.g:8928:1: rule__PropertySelection__KindAssignment_5 : ( ruleSelectionKind ) ;
    public final void rule__PropertySelection__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8932:1: ( ( ruleSelectionKind ) )
            // InternalDeviceParser.g:8933:2: ( ruleSelectionKind )
            {
            // InternalDeviceParser.g:8933:2: ( ruleSelectionKind )
            // InternalDeviceParser.g:8934:3: ruleSelectionKind
            {
             before(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());
            pushFollow(FOLLOW_2);
            ruleSelectionKind();

            state._fsp--;

             after(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__KindAssignment_5"


    // $ANTLR start "rule__PropertySelection__DescriptionAssignment_6_1"
    // InternalDeviceParser.g:8943:1: rule__PropertySelection__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertySelection__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8947:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8948:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8948:2: ( ruleEString )
            // InternalDeviceParser.g:8949:3: ruleEString
            {
             before(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__DescriptionAssignment_6_1"


    // $ANTLR start "rule__PropertySelection__ValueAssignment_7_3"
    // InternalDeviceParser.g:8958:1: rule__PropertySelection__ValueAssignment_7_3 : ( rulePropertyValue ) ;
    public final void rule__PropertySelection__ValueAssignment_7_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8962:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8963:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8963:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8964:3: rulePropertyValue
            {
             before(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_3_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__ValueAssignment_7_3"


    // $ANTLR start "rule__PropertySelection__ValueAssignment_7_4_1"
    // InternalDeviceParser.g:8973:1: rule__PropertySelection__ValueAssignment_7_4_1 : ( rulePropertyValue ) ;
    public final void rule__PropertySelection__ValueAssignment_7_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8977:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:8978:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:8978:2: ( rulePropertyValue )
            // InternalDeviceParser.g:8979:3: rulePropertyValue
            {
             before(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_4_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertySelection__ValueAssignment_7_4_1"


    // $ANTLR start "rule__PropertyRange__NameAssignment_2"
    // InternalDeviceParser.g:8988:1: rule__PropertyRange__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertyRange__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:8992:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:8993:2: ( ruleEString )
            {
            // InternalDeviceParser.g:8993:2: ( ruleEString )
            // InternalDeviceParser.g:8994:3: ruleEString
            {
             before(grammarAccess.getPropertyRangeAccess().getNameEStringParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyRangeAccess().getNameEStringParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__NameAssignment_2"


    // $ANTLR start "rule__PropertyRange__KindAssignment_5"
    // InternalDeviceParser.g:9003:1: rule__PropertyRange__KindAssignment_5 : ( ruleRangeKind ) ;
    public final void rule__PropertyRange__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:9007:1: ( ( ruleRangeKind ) )
            // InternalDeviceParser.g:9008:2: ( ruleRangeKind )
            {
            // InternalDeviceParser.g:9008:2: ( ruleRangeKind )
            // InternalDeviceParser.g:9009:3: ruleRangeKind
            {
             before(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());
            pushFollow(FOLLOW_2);
            ruleRangeKind();

            state._fsp--;

             after(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__KindAssignment_5"


    // $ANTLR start "rule__PropertyRange__DescriptionAssignment_6_1"
    // InternalDeviceParser.g:9018:1: rule__PropertyRange__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertyRange__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:9022:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:9023:2: ( ruleEString )
            {
            // InternalDeviceParser.g:9023:2: ( ruleEString )
            // InternalDeviceParser.g:9024:3: ruleEString
            {
             before(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__DescriptionAssignment_6_1"


    // $ANTLR start "rule__PropertyRange__ValueAssignment_7_3"
    // InternalDeviceParser.g:9033:1: rule__PropertyRange__ValueAssignment_7_3 : ( rulePropertyValue ) ;
    public final void rule__PropertyRange__ValueAssignment_7_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:9037:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:9038:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:9038:2: ( rulePropertyValue )
            // InternalDeviceParser.g:9039:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_3_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__ValueAssignment_7_3"


    // $ANTLR start "rule__PropertyRange__ValueAssignment_7_5"
    // InternalDeviceParser.g:9048:1: rule__PropertyRange__ValueAssignment_7_5 : ( rulePropertyValue ) ;
    public final void rule__PropertyRange__ValueAssignment_7_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:9052:1: ( ( rulePropertyValue ) )
            // InternalDeviceParser.g:9053:2: ( rulePropertyValue )
            {
            // InternalDeviceParser.g:9053:2: ( rulePropertyValue )
            // InternalDeviceParser.g:9054:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_5_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRange__ValueAssignment_7_5"


    // $ANTLR start "rule__PropertyValueInt__ValueAssignment"
    // InternalDeviceParser.g:9063:1: rule__PropertyValueInt__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__PropertyValueInt__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:9067:1: ( ( ruleInteger0 ) )
            // InternalDeviceParser.g:9068:2: ( ruleInteger0 )
            {
            // InternalDeviceParser.g:9068:2: ( ruleInteger0 )
            // InternalDeviceParser.g:9069:3: ruleInteger0
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
    // InternalDeviceParser.g:9078:1: rule__PropertyValueDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__PropertyValueDouble__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:9082:1: ( ( ruleDouble0 ) )
            // InternalDeviceParser.g:9083:2: ( ruleDouble0 )
            {
            // InternalDeviceParser.g:9083:2: ( ruleDouble0 )
            // InternalDeviceParser.g:9084:3: ruleDouble0
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
    // InternalDeviceParser.g:9093:1: rule__PropertyValueString__ValueAssignment : ( ruleEString ) ;
    public final void rule__PropertyValueString__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:9097:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:9098:2: ( ruleEString )
            {
            // InternalDeviceParser.g:9098:2: ( ruleEString )
            // InternalDeviceParser.g:9099:3: ruleEString
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


    // $ANTLR start "rule__ResourceType__NameAssignment_1"
    // InternalDeviceParser.g:9108:1: rule__ResourceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ResourceType__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:9112:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:9113:2: ( ruleEString )
            {
            // InternalDeviceParser.g:9113:2: ( ruleEString )
            // InternalDeviceParser.g:9114:3: ruleEString
            {
             before(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__NameAssignment_1"


    // $ANTLR start "rule__CommunicationType__NameAssignment_1"
    // InternalDeviceParser.g:9123:1: rule__CommunicationType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CommunicationType__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalDeviceParser.g:9127:1: ( ( ruleEString ) )
            // InternalDeviceParser.g:9128:2: ( ruleEString )
            {
            // InternalDeviceParser.g:9128:2: ( ruleEString )
            // InternalDeviceParser.g:9129:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000100400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000500600280000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000090L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000B300L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000500000C00040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000020000L});

}
