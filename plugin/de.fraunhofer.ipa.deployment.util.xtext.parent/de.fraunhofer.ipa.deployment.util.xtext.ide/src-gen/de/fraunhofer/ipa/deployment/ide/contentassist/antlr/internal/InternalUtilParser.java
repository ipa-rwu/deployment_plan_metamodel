package de.fraunhofer.ipa.deployment.ide.contentassist.antlr.internal;
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
import de.fraunhofer.ipa.deployment.services.UtilGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUtilParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LinuxOpertingSystem", "MacOSOpertingSystem", "AttributeKind", "SelectionKind", "Description", "MaximumKind", "MinimumKind", "Properties", "Os_version", "Processor", "RangeKind", "Container", "Ethernet", "Os_name", "Debian", "Ubuntu", "Value", "Arm64", "Focal", "Jammy", "Kind", "Name", "Type", "Wlan", "Usb", "X86", "HyphenMinus", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Description=8;
    public static final int Processor=13;
    public static final int RULE_STRING=39;
    public static final int AttributeKind=6;
    public static final int Focal=22;
    public static final int Wlan=27;
    public static final int Properties=11;
    public static final int Name=25;
    public static final int RULE_SL_COMMENT=34;
    public static final int Os_name=17;
    public static final int Container=15;
    public static final int HyphenMinus=30;
    public static final int Debian=18;
    public static final int RULE_DOUBLE=33;
    public static final int Kind=24;
    public static final int X86=29;
    public static final int RULE_DECINT=32;
    public static final int MinimumKind=10;
    public static final int EOF=-1;
    public static final int RULE_INDENT=35;
    public static final int Ubuntu=19;
    public static final int RULE_DEDENT=36;
    public static final int Jammy=23;
    public static final int LinuxOpertingSystem=4;
    public static final int RULE_ID=37;
    public static final int Usb=28;
    public static final int RULE_WS=41;
    public static final int RULE_DIGIT=31;
    public static final int MaximumKind=9;
    public static final int RULE_ANY_OTHER=42;
    public static final int SelectionKind=7;
    public static final int RangeKind=14;
    public static final int Os_version=12;
    public static final int Type=26;
    public static final int MacOSOpertingSystem=5;
    public static final int Arm64=21;
    public static final int RULE_INT=38;
    public static final int Ethernet=16;
    public static final int Value=20;
    public static final int RULE_ML_COMMENT=40;

    // delegates
    // delegators


        public InternalUtilParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUtilParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalUtilParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUtilParser.g"; }


        private UtilGrammarAccess grammarAccess;
        private final Map<String, String> tokenNameToValue = new HashMap<String, String>();

        {
            tokenNameToValue.put("HyphenMinus", "'-'");
            tokenNameToValue.put("Usb", "'Usb'");
            tokenNameToValue.put("X86", "'x86'");
            tokenNameToValue.put("Wlan", "'Wlan'");
            tokenNameToValue.put("Arm64", "'arm64'");
            tokenNameToValue.put("Focal", "'focal'");
            tokenNameToValue.put("Jammy", "'jammy'");
            tokenNameToValue.put("Kind", "'kind:'");
            tokenNameToValue.put("Name", "'name:'");
            tokenNameToValue.put("Type", "'type:'");
            tokenNameToValue.put("Debian", "'debian'");
            tokenNameToValue.put("Ubuntu", "'ubuntu'");
            tokenNameToValue.put("Value", "'value:'");
            tokenNameToValue.put("Os_name", "'os_name'");
            tokenNameToValue.put("Ethernet", "'Ethernet'");
            tokenNameToValue.put("Processor", "'Processor'");
            tokenNameToValue.put("RangeKind", "'RangeKind'");
            tokenNameToValue.put("Container", "'container'");
            tokenNameToValue.put("Os_version", "'os_version'");
            tokenNameToValue.put("MaximumKind", "'MaximumKind'");
            tokenNameToValue.put("MinimumKind", "'MinimumKind'");
            tokenNameToValue.put("Properties", "'properties:'");
            tokenNameToValue.put("Description", "'description:'");
            tokenNameToValue.put("AttributeKind", "'AttributeKind'");
            tokenNameToValue.put("SelectionKind", "'SelectionKind'");
            tokenNameToValue.put("LinuxOpertingSystem", "'LinuxOpertingSystem'");
            tokenNameToValue.put("MacOSOpertingSystem", "'MacOSOpertingSystem'");
        }

        public void setGrammarAccess(UtilGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDescription"
    // InternalUtilParser.g:82:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalUtilParser.g:83:1: ( ruleDescription EOF )
            // InternalUtilParser.g:84:1: ruleDescription EOF
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
    // InternalUtilParser.g:91:1: ruleDescription : ( () ) ;
    public final void ruleDescription() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:95:2: ( ( () ) )
            // InternalUtilParser.g:96:2: ( () )
            {
            // InternalUtilParser.g:96:2: ( () )
            // InternalUtilParser.g:97:3: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction());
            // InternalUtilParser.g:98:3: ()
            // InternalUtilParser.g:98:4:
            {
            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAction());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleAbstractOperatingSystemProperty"
    // InternalUtilParser.g:107:1: entryRuleAbstractOperatingSystemProperty : ruleAbstractOperatingSystemProperty EOF ;
    public final void entryRuleAbstractOperatingSystemProperty() throws RecognitionException {
        try {
            // InternalUtilParser.g:108:1: ( ruleAbstractOperatingSystemProperty EOF )
            // InternalUtilParser.g:109:1: ruleAbstractOperatingSystemProperty EOF
            {
             before(grammarAccess.getAbstractOperatingSystemPropertyRule());
            pushFollow(FOLLOW_1);
            ruleAbstractOperatingSystemProperty();

            state._fsp--;

             after(grammarAccess.getAbstractOperatingSystemPropertyRule());
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
    // $ANTLR end "entryRuleAbstractOperatingSystemProperty"


    // $ANTLR start "ruleAbstractOperatingSystemProperty"
    // InternalUtilParser.g:116:1: ruleAbstractOperatingSystemProperty : ( ( rule__AbstractOperatingSystemProperty__Alternatives ) ) ;
    public final void ruleAbstractOperatingSystemProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:120:2: ( ( ( rule__AbstractOperatingSystemProperty__Alternatives ) ) )
            // InternalUtilParser.g:121:2: ( ( rule__AbstractOperatingSystemProperty__Alternatives ) )
            {
            // InternalUtilParser.g:121:2: ( ( rule__AbstractOperatingSystemProperty__Alternatives ) )
            // InternalUtilParser.g:122:3: ( rule__AbstractOperatingSystemProperty__Alternatives )
            {
             before(grammarAccess.getAbstractOperatingSystemPropertyAccess().getAlternatives());
            // InternalUtilParser.g:123:3: ( rule__AbstractOperatingSystemProperty__Alternatives )
            // InternalUtilParser.g:123:4: rule__AbstractOperatingSystemProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractOperatingSystemProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractOperatingSystemPropertyAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractOperatingSystemProperty"


    // $ANTLR start "entryRuleNameOperatingSystemProperty"
    // InternalUtilParser.g:132:1: entryRuleNameOperatingSystemProperty : ruleNameOperatingSystemProperty EOF ;
    public final void entryRuleNameOperatingSystemProperty() throws RecognitionException {
        try {
            // InternalUtilParser.g:133:1: ( ruleNameOperatingSystemProperty EOF )
            // InternalUtilParser.g:134:1: ruleNameOperatingSystemProperty EOF
            {
             before(grammarAccess.getNameOperatingSystemPropertyRule());
            pushFollow(FOLLOW_1);
            ruleNameOperatingSystemProperty();

            state._fsp--;

             after(grammarAccess.getNameOperatingSystemPropertyRule());
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
    // $ANTLR end "entryRuleNameOperatingSystemProperty"


    // $ANTLR start "ruleNameOperatingSystemProperty"
    // InternalUtilParser.g:141:1: ruleNameOperatingSystemProperty : ( ( rule__NameOperatingSystemProperty__Group__0 ) ) ;
    public final void ruleNameOperatingSystemProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:145:2: ( ( ( rule__NameOperatingSystemProperty__Group__0 ) ) )
            // InternalUtilParser.g:146:2: ( ( rule__NameOperatingSystemProperty__Group__0 ) )
            {
            // InternalUtilParser.g:146:2: ( ( rule__NameOperatingSystemProperty__Group__0 ) )
            // InternalUtilParser.g:147:3: ( rule__NameOperatingSystemProperty__Group__0 )
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup());
            // InternalUtilParser.g:148:3: ( rule__NameOperatingSystemProperty__Group__0 )
            // InternalUtilParser.g:148:4: rule__NameOperatingSystemProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameOperatingSystemProperty"


    // $ANTLR start "entryRuleVersionOperatingSystemProperty"
    // InternalUtilParser.g:157:1: entryRuleVersionOperatingSystemProperty : ruleVersionOperatingSystemProperty EOF ;
    public final void entryRuleVersionOperatingSystemProperty() throws RecognitionException {
        try {
            // InternalUtilParser.g:158:1: ( ruleVersionOperatingSystemProperty EOF )
            // InternalUtilParser.g:159:1: ruleVersionOperatingSystemProperty EOF
            {
             before(grammarAccess.getVersionOperatingSystemPropertyRule());
            pushFollow(FOLLOW_1);
            ruleVersionOperatingSystemProperty();

            state._fsp--;

             after(grammarAccess.getVersionOperatingSystemPropertyRule());
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
    // $ANTLR end "entryRuleVersionOperatingSystemProperty"


    // $ANTLR start "ruleVersionOperatingSystemProperty"
    // InternalUtilParser.g:166:1: ruleVersionOperatingSystemProperty : ( ( rule__VersionOperatingSystemProperty__Group__0 ) ) ;
    public final void ruleVersionOperatingSystemProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:170:2: ( ( ( rule__VersionOperatingSystemProperty__Group__0 ) ) )
            // InternalUtilParser.g:171:2: ( ( rule__VersionOperatingSystemProperty__Group__0 ) )
            {
            // InternalUtilParser.g:171:2: ( ( rule__VersionOperatingSystemProperty__Group__0 ) )
            // InternalUtilParser.g:172:3: ( rule__VersionOperatingSystemProperty__Group__0 )
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup());
            // InternalUtilParser.g:173:3: ( rule__VersionOperatingSystemProperty__Group__0 )
            // InternalUtilParser.g:173:4: rule__VersionOperatingSystemProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersionOperatingSystemProperty"


    // $ANTLR start "entryRuleAbstractProperty"
    // InternalUtilParser.g:182:1: entryRuleAbstractProperty : ruleAbstractProperty EOF ;
    public final void entryRuleAbstractProperty() throws RecognitionException {
        try {
            // InternalUtilParser.g:183:1: ( ruleAbstractProperty EOF )
            // InternalUtilParser.g:184:1: ruleAbstractProperty EOF
            {
             before(grammarAccess.getAbstractPropertyRule());
            pushFollow(FOLLOW_1);
            ruleAbstractProperty();

            state._fsp--;

             after(grammarAccess.getAbstractPropertyRule());
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
    // $ANTLR end "entryRuleAbstractProperty"


    // $ANTLR start "ruleAbstractProperty"
    // InternalUtilParser.g:191:1: ruleAbstractProperty : ( ( rule__AbstractProperty__Alternatives ) ) ;
    public final void ruleAbstractProperty() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:195:2: ( ( ( rule__AbstractProperty__Alternatives ) ) )
            // InternalUtilParser.g:196:2: ( ( rule__AbstractProperty__Alternatives ) )
            {
            // InternalUtilParser.g:196:2: ( ( rule__AbstractProperty__Alternatives ) )
            // InternalUtilParser.g:197:3: ( rule__AbstractProperty__Alternatives )
            {
             before(grammarAccess.getAbstractPropertyAccess().getAlternatives());
            // InternalUtilParser.g:198:3: ( rule__AbstractProperty__Alternatives )
            // InternalUtilParser.g:198:4: rule__AbstractProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractPropertyAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractProperty"


    // $ANTLR start "entryRulePropertyKind"
    // InternalUtilParser.g:207:1: entryRulePropertyKind : rulePropertyKind EOF ;
    public final void entryRulePropertyKind() throws RecognitionException {
        try {
            // InternalUtilParser.g:208:1: ( rulePropertyKind EOF )
            // InternalUtilParser.g:209:1: rulePropertyKind EOF
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
    // InternalUtilParser.g:216:1: rulePropertyKind : ( ( rule__PropertyKind__Alternatives ) ) ;
    public final void rulePropertyKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:220:2: ( ( ( rule__PropertyKind__Alternatives ) ) )
            // InternalUtilParser.g:221:2: ( ( rule__PropertyKind__Alternatives ) )
            {
            // InternalUtilParser.g:221:2: ( ( rule__PropertyKind__Alternatives ) )
            // InternalUtilParser.g:222:3: ( rule__PropertyKind__Alternatives )
            {
             before(grammarAccess.getPropertyKindAccess().getAlternatives());
            // InternalUtilParser.g:223:3: ( rule__PropertyKind__Alternatives )
            // InternalUtilParser.g:223:4: rule__PropertyKind__Alternatives
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


    // $ANTLR start "entryRulePropertyAttribute"
    // InternalUtilParser.g:232:1: entryRulePropertyAttribute : rulePropertyAttribute EOF ;
    public final void entryRulePropertyAttribute() throws RecognitionException {
        try {
            // InternalUtilParser.g:233:1: ( rulePropertyAttribute EOF )
            // InternalUtilParser.g:234:1: rulePropertyAttribute EOF
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
    // InternalUtilParser.g:241:1: rulePropertyAttribute : ( ( rule__PropertyAttribute__Group__0 ) ) ;
    public final void rulePropertyAttribute() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:245:2: ( ( ( rule__PropertyAttribute__Group__0 ) ) )
            // InternalUtilParser.g:246:2: ( ( rule__PropertyAttribute__Group__0 ) )
            {
            // InternalUtilParser.g:246:2: ( ( rule__PropertyAttribute__Group__0 ) )
            // InternalUtilParser.g:247:3: ( rule__PropertyAttribute__Group__0 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getGroup());
            // InternalUtilParser.g:248:3: ( rule__PropertyAttribute__Group__0 )
            // InternalUtilParser.g:248:4: rule__PropertyAttribute__Group__0
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
    // InternalUtilParser.g:257:1: entryRulePropertyMaximun : rulePropertyMaximun EOF ;
    public final void entryRulePropertyMaximun() throws RecognitionException {
        try {
            // InternalUtilParser.g:258:1: ( rulePropertyMaximun EOF )
            // InternalUtilParser.g:259:1: rulePropertyMaximun EOF
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
    // InternalUtilParser.g:266:1: rulePropertyMaximun : ( ( rule__PropertyMaximun__Group__0 ) ) ;
    public final void rulePropertyMaximun() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:270:2: ( ( ( rule__PropertyMaximun__Group__0 ) ) )
            // InternalUtilParser.g:271:2: ( ( rule__PropertyMaximun__Group__0 ) )
            {
            // InternalUtilParser.g:271:2: ( ( rule__PropertyMaximun__Group__0 ) )
            // InternalUtilParser.g:272:3: ( rule__PropertyMaximun__Group__0 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getGroup());
            // InternalUtilParser.g:273:3: ( rule__PropertyMaximun__Group__0 )
            // InternalUtilParser.g:273:4: rule__PropertyMaximun__Group__0
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
    // InternalUtilParser.g:282:1: entryRulePropertyMinimum : rulePropertyMinimum EOF ;
    public final void entryRulePropertyMinimum() throws RecognitionException {
        try {
            // InternalUtilParser.g:283:1: ( rulePropertyMinimum EOF )
            // InternalUtilParser.g:284:1: rulePropertyMinimum EOF
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
    // InternalUtilParser.g:291:1: rulePropertyMinimum : ( ( rule__PropertyMinimum__Group__0 ) ) ;
    public final void rulePropertyMinimum() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:295:2: ( ( ( rule__PropertyMinimum__Group__0 ) ) )
            // InternalUtilParser.g:296:2: ( ( rule__PropertyMinimum__Group__0 ) )
            {
            // InternalUtilParser.g:296:2: ( ( rule__PropertyMinimum__Group__0 ) )
            // InternalUtilParser.g:297:3: ( rule__PropertyMinimum__Group__0 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getGroup());
            // InternalUtilParser.g:298:3: ( rule__PropertyMinimum__Group__0 )
            // InternalUtilParser.g:298:4: rule__PropertyMinimum__Group__0
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
    // InternalUtilParser.g:307:1: entryRulePropertySelection : rulePropertySelection EOF ;
    public final void entryRulePropertySelection() throws RecognitionException {
        try {
            // InternalUtilParser.g:308:1: ( rulePropertySelection EOF )
            // InternalUtilParser.g:309:1: rulePropertySelection EOF
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
    // InternalUtilParser.g:316:1: rulePropertySelection : ( ( rule__PropertySelection__Group__0 ) ) ;
    public final void rulePropertySelection() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:320:2: ( ( ( rule__PropertySelection__Group__0 ) ) )
            // InternalUtilParser.g:321:2: ( ( rule__PropertySelection__Group__0 ) )
            {
            // InternalUtilParser.g:321:2: ( ( rule__PropertySelection__Group__0 ) )
            // InternalUtilParser.g:322:3: ( rule__PropertySelection__Group__0 )
            {
             before(grammarAccess.getPropertySelectionAccess().getGroup());
            // InternalUtilParser.g:323:3: ( rule__PropertySelection__Group__0 )
            // InternalUtilParser.g:323:4: rule__PropertySelection__Group__0
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
    // InternalUtilParser.g:332:1: entryRulePropertyRange : rulePropertyRange EOF ;
    public final void entryRulePropertyRange() throws RecognitionException {
        try {
            // InternalUtilParser.g:333:1: ( rulePropertyRange EOF )
            // InternalUtilParser.g:334:1: rulePropertyRange EOF
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
    // InternalUtilParser.g:341:1: rulePropertyRange : ( ( rule__PropertyRange__Group__0 ) ) ;
    public final void rulePropertyRange() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:345:2: ( ( ( rule__PropertyRange__Group__0 ) ) )
            // InternalUtilParser.g:346:2: ( ( rule__PropertyRange__Group__0 ) )
            {
            // InternalUtilParser.g:346:2: ( ( rule__PropertyRange__Group__0 ) )
            // InternalUtilParser.g:347:3: ( rule__PropertyRange__Group__0 )
            {
             before(grammarAccess.getPropertyRangeAccess().getGroup());
            // InternalUtilParser.g:348:3: ( rule__PropertyRange__Group__0 )
            // InternalUtilParser.g:348:4: rule__PropertyRange__Group__0
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
    // InternalUtilParser.g:357:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalUtilParser.g:358:1: ( rulePropertyValue EOF )
            // InternalUtilParser.g:359:1: rulePropertyValue EOF
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
    // InternalUtilParser.g:366:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:370:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalUtilParser.g:371:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalUtilParser.g:371:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalUtilParser.g:372:3: ( rule__PropertyValue__Alternatives )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives());
            // InternalUtilParser.g:373:3: ( rule__PropertyValue__Alternatives )
            // InternalUtilParser.g:373:4: rule__PropertyValue__Alternatives
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
    // InternalUtilParser.g:382:1: entryRulePropertyValueInt : rulePropertyValueInt EOF ;
    public final void entryRulePropertyValueInt() throws RecognitionException {
        try {
            // InternalUtilParser.g:383:1: ( rulePropertyValueInt EOF )
            // InternalUtilParser.g:384:1: rulePropertyValueInt EOF
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
    // InternalUtilParser.g:391:1: rulePropertyValueInt : ( ( rule__PropertyValueInt__ValueAssignment ) ) ;
    public final void rulePropertyValueInt() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:395:2: ( ( ( rule__PropertyValueInt__ValueAssignment ) ) )
            // InternalUtilParser.g:396:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            {
            // InternalUtilParser.g:396:2: ( ( rule__PropertyValueInt__ValueAssignment ) )
            // InternalUtilParser.g:397:3: ( rule__PropertyValueInt__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueIntAccess().getValueAssignment());
            // InternalUtilParser.g:398:3: ( rule__PropertyValueInt__ValueAssignment )
            // InternalUtilParser.g:398:4: rule__PropertyValueInt__ValueAssignment
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
    // InternalUtilParser.g:407:1: entryRulePropertyValueDouble : rulePropertyValueDouble EOF ;
    public final void entryRulePropertyValueDouble() throws RecognitionException {
        try {
            // InternalUtilParser.g:408:1: ( rulePropertyValueDouble EOF )
            // InternalUtilParser.g:409:1: rulePropertyValueDouble EOF
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
    // InternalUtilParser.g:416:1: rulePropertyValueDouble : ( ( rule__PropertyValueDouble__ValueAssignment ) ) ;
    public final void rulePropertyValueDouble() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:420:2: ( ( ( rule__PropertyValueDouble__ValueAssignment ) ) )
            // InternalUtilParser.g:421:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            {
            // InternalUtilParser.g:421:2: ( ( rule__PropertyValueDouble__ValueAssignment ) )
            // InternalUtilParser.g:422:3: ( rule__PropertyValueDouble__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueDoubleAccess().getValueAssignment());
            // InternalUtilParser.g:423:3: ( rule__PropertyValueDouble__ValueAssignment )
            // InternalUtilParser.g:423:4: rule__PropertyValueDouble__ValueAssignment
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
    // InternalUtilParser.g:432:1: entryRulePropertyValueString : rulePropertyValueString EOF ;
    public final void entryRulePropertyValueString() throws RecognitionException {
        try {
            // InternalUtilParser.g:433:1: ( rulePropertyValueString EOF )
            // InternalUtilParser.g:434:1: rulePropertyValueString EOF
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
    // InternalUtilParser.g:441:1: rulePropertyValueString : ( ( rule__PropertyValueString__ValueAssignment ) ) ;
    public final void rulePropertyValueString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:445:2: ( ( ( rule__PropertyValueString__ValueAssignment ) ) )
            // InternalUtilParser.g:446:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            {
            // InternalUtilParser.g:446:2: ( ( rule__PropertyValueString__ValueAssignment ) )
            // InternalUtilParser.g:447:3: ( rule__PropertyValueString__ValueAssignment )
            {
             before(grammarAccess.getPropertyValueStringAccess().getValueAssignment());
            // InternalUtilParser.g:448:3: ( rule__PropertyValueString__ValueAssignment )
            // InternalUtilParser.g:448:4: rule__PropertyValueString__ValueAssignment
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


    // $ANTLR start "entryRulePropertyValueList"
    // InternalUtilParser.g:457:1: entryRulePropertyValueList : rulePropertyValueList EOF ;
    public final void entryRulePropertyValueList() throws RecognitionException {
        try {
            // InternalUtilParser.g:458:1: ( rulePropertyValueList EOF )
            // InternalUtilParser.g:459:1: rulePropertyValueList EOF
            {
             before(grammarAccess.getPropertyValueListRule());
            pushFollow(FOLLOW_1);
            rulePropertyValueList();

            state._fsp--;

             after(grammarAccess.getPropertyValueListRule());
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
    // $ANTLR end "entryRulePropertyValueList"


    // $ANTLR start "rulePropertyValueList"
    // InternalUtilParser.g:466:1: rulePropertyValueList : ( ( rule__PropertyValueList__Group__0 ) ) ;
    public final void rulePropertyValueList() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:470:2: ( ( ( rule__PropertyValueList__Group__0 ) ) )
            // InternalUtilParser.g:471:2: ( ( rule__PropertyValueList__Group__0 ) )
            {
            // InternalUtilParser.g:471:2: ( ( rule__PropertyValueList__Group__0 ) )
            // InternalUtilParser.g:472:3: ( rule__PropertyValueList__Group__0 )
            {
             before(grammarAccess.getPropertyValueListAccess().getGroup());
            // InternalUtilParser.g:473:3: ( rule__PropertyValueList__Group__0 )
            // InternalUtilParser.g:473:4: rule__PropertyValueList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValueList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueListAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValueList"


    // $ANTLR start "entryRuleProcessorArchitectureValue"
    // InternalUtilParser.g:482:1: entryRuleProcessorArchitectureValue : ruleProcessorArchitectureValue EOF ;
    public final void entryRuleProcessorArchitectureValue() throws RecognitionException {
        try {
            // InternalUtilParser.g:483:1: ( ruleProcessorArchitectureValue EOF )
            // InternalUtilParser.g:484:1: ruleProcessorArchitectureValue EOF
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
    // InternalUtilParser.g:491:1: ruleProcessorArchitectureValue : ( ( rule__ProcessorArchitectureValue__ValueAssignment ) ) ;
    public final void ruleProcessorArchitectureValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:495:2: ( ( ( rule__ProcessorArchitectureValue__ValueAssignment ) ) )
            // InternalUtilParser.g:496:2: ( ( rule__ProcessorArchitectureValue__ValueAssignment ) )
            {
            // InternalUtilParser.g:496:2: ( ( rule__ProcessorArchitectureValue__ValueAssignment ) )
            // InternalUtilParser.g:497:3: ( rule__ProcessorArchitectureValue__ValueAssignment )
            {
             before(grammarAccess.getProcessorArchitectureValueAccess().getValueAssignment());
            // InternalUtilParser.g:498:3: ( rule__ProcessorArchitectureValue__ValueAssignment )
            // InternalUtilParser.g:498:4: rule__ProcessorArchitectureValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorArchitectureValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProcessorArchitectureValueAccess().getValueAssignment());

            }


            }

        }
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
    // InternalUtilParser.g:507:1: entryRuleAbstractResouceType : ruleAbstractResouceType EOF ;
    public final void entryRuleAbstractResouceType() throws RecognitionException {
        try {
            // InternalUtilParser.g:508:1: ( ruleAbstractResouceType EOF )
            // InternalUtilParser.g:509:1: ruleAbstractResouceType EOF
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
    // InternalUtilParser.g:516:1: ruleAbstractResouceType : ( ruleResourceType ) ;
    public final void ruleAbstractResouceType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:520:2: ( ( ruleResourceType ) )
            // InternalUtilParser.g:521:2: ( ruleResourceType )
            {
            // InternalUtilParser.g:521:2: ( ruleResourceType )
            // InternalUtilParser.g:522:3: ruleResourceType
            {
             before(grammarAccess.getAbstractResouceTypeAccess().getResourceTypeParserRuleCall());
            pushFollow(FOLLOW_2);
            ruleResourceType();

            state._fsp--;

             after(grammarAccess.getAbstractResouceTypeAccess().getResourceTypeParserRuleCall());

            }


            }

        }
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


    // $ANTLR start "entryRuleOpertingSystemResouceType"
    // InternalUtilParser.g:532:1: entryRuleOpertingSystemResouceType : ruleOpertingSystemResouceType EOF ;
    public final void entryRuleOpertingSystemResouceType() throws RecognitionException {
        try {
            // InternalUtilParser.g:533:1: ( ruleOpertingSystemResouceType EOF )
            // InternalUtilParser.g:534:1: ruleOpertingSystemResouceType EOF
            {
             before(grammarAccess.getOpertingSystemResouceTypeRule());
            pushFollow(FOLLOW_1);
            ruleOpertingSystemResouceType();

            state._fsp--;

             after(grammarAccess.getOpertingSystemResouceTypeRule());
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
    // $ANTLR end "entryRuleOpertingSystemResouceType"


    // $ANTLR start "ruleOpertingSystemResouceType"
    // InternalUtilParser.g:541:1: ruleOpertingSystemResouceType : ( ( rule__OpertingSystemResouceType__Alternatives ) ) ;
    public final void ruleOpertingSystemResouceType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:545:2: ( ( ( rule__OpertingSystemResouceType__Alternatives ) ) )
            // InternalUtilParser.g:546:2: ( ( rule__OpertingSystemResouceType__Alternatives ) )
            {
            // InternalUtilParser.g:546:2: ( ( rule__OpertingSystemResouceType__Alternatives ) )
            // InternalUtilParser.g:547:3: ( rule__OpertingSystemResouceType__Alternatives )
            {
             before(grammarAccess.getOpertingSystemResouceTypeAccess().getAlternatives());
            // InternalUtilParser.g:548:3: ( rule__OpertingSystemResouceType__Alternatives )
            // InternalUtilParser.g:548:4: rule__OpertingSystemResouceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpertingSystemResouceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpertingSystemResouceTypeAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpertingSystemResouceType"


    // $ANTLR start "entryRuleResourceType"
    // InternalUtilParser.g:557:1: entryRuleResourceType : ruleResourceType EOF ;
    public final void entryRuleResourceType() throws RecognitionException {
        try {
            // InternalUtilParser.g:558:1: ( ruleResourceType EOF )
            // InternalUtilParser.g:559:1: ruleResourceType EOF
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
    // InternalUtilParser.g:566:1: ruleResourceType : ( ( rule__ResourceType__Group__0 ) ) ;
    public final void ruleResourceType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:570:2: ( ( ( rule__ResourceType__Group__0 ) ) )
            // InternalUtilParser.g:571:2: ( ( rule__ResourceType__Group__0 ) )
            {
            // InternalUtilParser.g:571:2: ( ( rule__ResourceType__Group__0 ) )
            // InternalUtilParser.g:572:3: ( rule__ResourceType__Group__0 )
            {
             before(grammarAccess.getResourceTypeAccess().getGroup());
            // InternalUtilParser.g:573:3: ( rule__ResourceType__Group__0 )
            // InternalUtilParser.g:573:4: rule__ResourceType__Group__0
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


    // $ANTLR start "entryRuleLinuxOpertingSystem"
    // InternalUtilParser.g:582:1: entryRuleLinuxOpertingSystem : ruleLinuxOpertingSystem EOF ;
    public final void entryRuleLinuxOpertingSystem() throws RecognitionException {
        try {
            // InternalUtilParser.g:583:1: ( ruleLinuxOpertingSystem EOF )
            // InternalUtilParser.g:584:1: ruleLinuxOpertingSystem EOF
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
    // InternalUtilParser.g:591:1: ruleLinuxOpertingSystem : ( ( rule__LinuxOpertingSystem__Group__0 ) ) ;
    public final void ruleLinuxOpertingSystem() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:595:2: ( ( ( rule__LinuxOpertingSystem__Group__0 ) ) )
            // InternalUtilParser.g:596:2: ( ( rule__LinuxOpertingSystem__Group__0 ) )
            {
            // InternalUtilParser.g:596:2: ( ( rule__LinuxOpertingSystem__Group__0 ) )
            // InternalUtilParser.g:597:3: ( rule__LinuxOpertingSystem__Group__0 )
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getGroup());
            // InternalUtilParser.g:598:3: ( rule__LinuxOpertingSystem__Group__0 )
            // InternalUtilParser.g:598:4: rule__LinuxOpertingSystem__Group__0
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


    // $ANTLR start "entryRuleMacOSOpertingSystem"
    // InternalUtilParser.g:607:1: entryRuleMacOSOpertingSystem : ruleMacOSOpertingSystem EOF ;
    public final void entryRuleMacOSOpertingSystem() throws RecognitionException {
        try {
            // InternalUtilParser.g:608:1: ( ruleMacOSOpertingSystem EOF )
            // InternalUtilParser.g:609:1: ruleMacOSOpertingSystem EOF
            {
             before(grammarAccess.getMacOSOpertingSystemRule());
            pushFollow(FOLLOW_1);
            ruleMacOSOpertingSystem();

            state._fsp--;

             after(grammarAccess.getMacOSOpertingSystemRule());
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
    // $ANTLR end "entryRuleMacOSOpertingSystem"


    // $ANTLR start "ruleMacOSOpertingSystem"
    // InternalUtilParser.g:616:1: ruleMacOSOpertingSystem : ( ( rule__MacOSOpertingSystem__Group__0 ) ) ;
    public final void ruleMacOSOpertingSystem() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:620:2: ( ( ( rule__MacOSOpertingSystem__Group__0 ) ) )
            // InternalUtilParser.g:621:2: ( ( rule__MacOSOpertingSystem__Group__0 ) )
            {
            // InternalUtilParser.g:621:2: ( ( rule__MacOSOpertingSystem__Group__0 ) )
            // InternalUtilParser.g:622:3: ( rule__MacOSOpertingSystem__Group__0 )
            {
             before(grammarAccess.getMacOSOpertingSystemAccess().getGroup());
            // InternalUtilParser.g:623:3: ( rule__MacOSOpertingSystem__Group__0 )
            // InternalUtilParser.g:623:4: rule__MacOSOpertingSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MacOSOpertingSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMacOSOpertingSystemAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMacOSOpertingSystem"


    // $ANTLR start "entryRuleCommunicationType"
    // InternalUtilParser.g:632:1: entryRuleCommunicationType : ruleCommunicationType EOF ;
    public final void entryRuleCommunicationType() throws RecognitionException {
        try {
            // InternalUtilParser.g:633:1: ( ruleCommunicationType EOF )
            // InternalUtilParser.g:634:1: ruleCommunicationType EOF
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
    // InternalUtilParser.g:641:1: ruleCommunicationType : ( ( rule__CommunicationType__Group__0 ) ) ;
    public final void ruleCommunicationType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:645:2: ( ( ( rule__CommunicationType__Group__0 ) ) )
            // InternalUtilParser.g:646:2: ( ( rule__CommunicationType__Group__0 ) )
            {
            // InternalUtilParser.g:646:2: ( ( rule__CommunicationType__Group__0 ) )
            // InternalUtilParser.g:647:3: ( rule__CommunicationType__Group__0 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getGroup());
            // InternalUtilParser.g:648:3: ( rule__CommunicationType__Group__0 )
            // InternalUtilParser.g:648:4: rule__CommunicationType__Group__0
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
    // InternalUtilParser.g:657:1: entryRuleNetworkCommunicationType : ruleNetworkCommunicationType EOF ;
    public final void entryRuleNetworkCommunicationType() throws RecognitionException {
        try {
            // InternalUtilParser.g:658:1: ( ruleNetworkCommunicationType EOF )
            // InternalUtilParser.g:659:1: ruleNetworkCommunicationType EOF
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
    // InternalUtilParser.g:666:1: ruleNetworkCommunicationType : ( ( rule__NetworkCommunicationType__Alternatives ) ) ;
    public final void ruleNetworkCommunicationType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:670:2: ( ( ( rule__NetworkCommunicationType__Alternatives ) ) )
            // InternalUtilParser.g:671:2: ( ( rule__NetworkCommunicationType__Alternatives ) )
            {
            // InternalUtilParser.g:671:2: ( ( rule__NetworkCommunicationType__Alternatives ) )
            // InternalUtilParser.g:672:3: ( rule__NetworkCommunicationType__Alternatives )
            {
             before(grammarAccess.getNetworkCommunicationTypeAccess().getAlternatives());
            // InternalUtilParser.g:673:3: ( rule__NetworkCommunicationType__Alternatives )
            // InternalUtilParser.g:673:4: rule__NetworkCommunicationType__Alternatives
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
    // InternalUtilParser.g:682:1: entryRuleEthernetCommunicationType : ruleEthernetCommunicationType EOF ;
    public final void entryRuleEthernetCommunicationType() throws RecognitionException {
        try {
            // InternalUtilParser.g:683:1: ( ruleEthernetCommunicationType EOF )
            // InternalUtilParser.g:684:1: ruleEthernetCommunicationType EOF
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
    // InternalUtilParser.g:691:1: ruleEthernetCommunicationType : ( ( rule__EthernetCommunicationType__Group__0 ) ) ;
    public final void ruleEthernetCommunicationType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:695:2: ( ( ( rule__EthernetCommunicationType__Group__0 ) ) )
            // InternalUtilParser.g:696:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            {
            // InternalUtilParser.g:696:2: ( ( rule__EthernetCommunicationType__Group__0 ) )
            // InternalUtilParser.g:697:3: ( rule__EthernetCommunicationType__Group__0 )
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getGroup());
            // InternalUtilParser.g:698:3: ( rule__EthernetCommunicationType__Group__0 )
            // InternalUtilParser.g:698:4: rule__EthernetCommunicationType__Group__0
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
    // InternalUtilParser.g:707:1: entryRuleWlanCommunicationType : ruleWlanCommunicationType EOF ;
    public final void entryRuleWlanCommunicationType() throws RecognitionException {
        try {
            // InternalUtilParser.g:708:1: ( ruleWlanCommunicationType EOF )
            // InternalUtilParser.g:709:1: ruleWlanCommunicationType EOF
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
    // InternalUtilParser.g:716:1: ruleWlanCommunicationType : ( ( rule__WlanCommunicationType__Group__0 ) ) ;
    public final void ruleWlanCommunicationType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:720:2: ( ( ( rule__WlanCommunicationType__Group__0 ) ) )
            // InternalUtilParser.g:721:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            {
            // InternalUtilParser.g:721:2: ( ( rule__WlanCommunicationType__Group__0 ) )
            // InternalUtilParser.g:722:3: ( rule__WlanCommunicationType__Group__0 )
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getGroup());
            // InternalUtilParser.g:723:3: ( rule__WlanCommunicationType__Group__0 )
            // InternalUtilParser.g:723:4: rule__WlanCommunicationType__Group__0
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
    // InternalUtilParser.g:732:1: entryRuleAttributeKind : ruleAttributeKind EOF ;
    public final void entryRuleAttributeKind() throws RecognitionException {
        try {
            // InternalUtilParser.g:733:1: ( ruleAttributeKind EOF )
            // InternalUtilParser.g:734:1: ruleAttributeKind EOF
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
    // InternalUtilParser.g:741:1: ruleAttributeKind : ( ( rule__AttributeKind__Group__0 ) ) ;
    public final void ruleAttributeKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:745:2: ( ( ( rule__AttributeKind__Group__0 ) ) )
            // InternalUtilParser.g:746:2: ( ( rule__AttributeKind__Group__0 ) )
            {
            // InternalUtilParser.g:746:2: ( ( rule__AttributeKind__Group__0 ) )
            // InternalUtilParser.g:747:3: ( rule__AttributeKind__Group__0 )
            {
             before(grammarAccess.getAttributeKindAccess().getGroup());
            // InternalUtilParser.g:748:3: ( rule__AttributeKind__Group__0 )
            // InternalUtilParser.g:748:4: rule__AttributeKind__Group__0
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
    // InternalUtilParser.g:757:1: entryRuleMaximumKind : ruleMaximumKind EOF ;
    public final void entryRuleMaximumKind() throws RecognitionException {
        try {
            // InternalUtilParser.g:758:1: ( ruleMaximumKind EOF )
            // InternalUtilParser.g:759:1: ruleMaximumKind EOF
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
    // InternalUtilParser.g:766:1: ruleMaximumKind : ( ( rule__MaximumKind__Group__0 ) ) ;
    public final void ruleMaximumKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:770:2: ( ( ( rule__MaximumKind__Group__0 ) ) )
            // InternalUtilParser.g:771:2: ( ( rule__MaximumKind__Group__0 ) )
            {
            // InternalUtilParser.g:771:2: ( ( rule__MaximumKind__Group__0 ) )
            // InternalUtilParser.g:772:3: ( rule__MaximumKind__Group__0 )
            {
             before(grammarAccess.getMaximumKindAccess().getGroup());
            // InternalUtilParser.g:773:3: ( rule__MaximumKind__Group__0 )
            // InternalUtilParser.g:773:4: rule__MaximumKind__Group__0
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
    // InternalUtilParser.g:782:1: entryRuleMinimumKind : ruleMinimumKind EOF ;
    public final void entryRuleMinimumKind() throws RecognitionException {
        try {
            // InternalUtilParser.g:783:1: ( ruleMinimumKind EOF )
            // InternalUtilParser.g:784:1: ruleMinimumKind EOF
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
    // InternalUtilParser.g:791:1: ruleMinimumKind : ( ( rule__MinimumKind__Group__0 ) ) ;
    public final void ruleMinimumKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:795:2: ( ( ( rule__MinimumKind__Group__0 ) ) )
            // InternalUtilParser.g:796:2: ( ( rule__MinimumKind__Group__0 ) )
            {
            // InternalUtilParser.g:796:2: ( ( rule__MinimumKind__Group__0 ) )
            // InternalUtilParser.g:797:3: ( rule__MinimumKind__Group__0 )
            {
             before(grammarAccess.getMinimumKindAccess().getGroup());
            // InternalUtilParser.g:798:3: ( rule__MinimumKind__Group__0 )
            // InternalUtilParser.g:798:4: rule__MinimumKind__Group__0
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
    // InternalUtilParser.g:807:1: entryRuleSelectionKind : ruleSelectionKind EOF ;
    public final void entryRuleSelectionKind() throws RecognitionException {
        try {
            // InternalUtilParser.g:808:1: ( ruleSelectionKind EOF )
            // InternalUtilParser.g:809:1: ruleSelectionKind EOF
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
    // InternalUtilParser.g:816:1: ruleSelectionKind : ( ( rule__SelectionKind__Group__0 ) ) ;
    public final void ruleSelectionKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:820:2: ( ( ( rule__SelectionKind__Group__0 ) ) )
            // InternalUtilParser.g:821:2: ( ( rule__SelectionKind__Group__0 ) )
            {
            // InternalUtilParser.g:821:2: ( ( rule__SelectionKind__Group__0 ) )
            // InternalUtilParser.g:822:3: ( rule__SelectionKind__Group__0 )
            {
             before(grammarAccess.getSelectionKindAccess().getGroup());
            // InternalUtilParser.g:823:3: ( rule__SelectionKind__Group__0 )
            // InternalUtilParser.g:823:4: rule__SelectionKind__Group__0
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
    // InternalUtilParser.g:832:1: entryRuleRangeKind : ruleRangeKind EOF ;
    public final void entryRuleRangeKind() throws RecognitionException {
        try {
            // InternalUtilParser.g:833:1: ( ruleRangeKind EOF )
            // InternalUtilParser.g:834:1: ruleRangeKind EOF
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
    // InternalUtilParser.g:841:1: ruleRangeKind : ( ( rule__RangeKind__Group__0 ) ) ;
    public final void ruleRangeKind() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:845:2: ( ( ( rule__RangeKind__Group__0 ) ) )
            // InternalUtilParser.g:846:2: ( ( rule__RangeKind__Group__0 ) )
            {
            // InternalUtilParser.g:846:2: ( ( rule__RangeKind__Group__0 ) )
            // InternalUtilParser.g:847:3: ( rule__RangeKind__Group__0 )
            {
             before(grammarAccess.getRangeKindAccess().getGroup());
            // InternalUtilParser.g:848:3: ( rule__RangeKind__Group__0 )
            // InternalUtilParser.g:848:4: rule__RangeKind__Group__0
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


    // $ANTLR start "entryRuleLinuxDistributionValue"
    // InternalUtilParser.g:857:1: entryRuleLinuxDistributionValue : ruleLinuxDistributionValue EOF ;
    public final void entryRuleLinuxDistributionValue() throws RecognitionException {
        try {
            // InternalUtilParser.g:858:1: ( ruleLinuxDistributionValue EOF )
            // InternalUtilParser.g:859:1: ruleLinuxDistributionValue EOF
            {
             before(grammarAccess.getLinuxDistributionValueRule());
            pushFollow(FOLLOW_1);
            ruleLinuxDistributionValue();

            state._fsp--;

             after(grammarAccess.getLinuxDistributionValueRule());
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
    // $ANTLR end "entryRuleLinuxDistributionValue"


    // $ANTLR start "ruleLinuxDistributionValue"
    // InternalUtilParser.g:866:1: ruleLinuxDistributionValue : ( ( rule__LinuxDistributionValue__Group__0 ) ) ;
    public final void ruleLinuxDistributionValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:870:2: ( ( ( rule__LinuxDistributionValue__Group__0 ) ) )
            // InternalUtilParser.g:871:2: ( ( rule__LinuxDistributionValue__Group__0 ) )
            {
            // InternalUtilParser.g:871:2: ( ( rule__LinuxDistributionValue__Group__0 ) )
            // InternalUtilParser.g:872:3: ( rule__LinuxDistributionValue__Group__0 )
            {
             before(grammarAccess.getLinuxDistributionValueAccess().getGroup());
            // InternalUtilParser.g:873:3: ( rule__LinuxDistributionValue__Group__0 )
            // InternalUtilParser.g:873:4: rule__LinuxDistributionValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinuxDistributionValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinuxDistributionValueAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinuxDistributionValue"


    // $ANTLR start "entryRuleUbuntuVersionValue"
    // InternalUtilParser.g:882:1: entryRuleUbuntuVersionValue : ruleUbuntuVersionValue EOF ;
    public final void entryRuleUbuntuVersionValue() throws RecognitionException {
        try {
            // InternalUtilParser.g:883:1: ( ruleUbuntuVersionValue EOF )
            // InternalUtilParser.g:884:1: ruleUbuntuVersionValue EOF
            {
             before(grammarAccess.getUbuntuVersionValueRule());
            pushFollow(FOLLOW_1);
            ruleUbuntuVersionValue();

            state._fsp--;

             after(grammarAccess.getUbuntuVersionValueRule());
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
    // $ANTLR end "entryRuleUbuntuVersionValue"


    // $ANTLR start "ruleUbuntuVersionValue"
    // InternalUtilParser.g:891:1: ruleUbuntuVersionValue : ( ( rule__UbuntuVersionValue__Group__0 ) ) ;
    public final void ruleUbuntuVersionValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:895:2: ( ( ( rule__UbuntuVersionValue__Group__0 ) ) )
            // InternalUtilParser.g:896:2: ( ( rule__UbuntuVersionValue__Group__0 ) )
            {
            // InternalUtilParser.g:896:2: ( ( rule__UbuntuVersionValue__Group__0 ) )
            // InternalUtilParser.g:897:3: ( rule__UbuntuVersionValue__Group__0 )
            {
             before(grammarAccess.getUbuntuVersionValueAccess().getGroup());
            // InternalUtilParser.g:898:3: ( rule__UbuntuVersionValue__Group__0 )
            // InternalUtilParser.g:898:4: rule__UbuntuVersionValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UbuntuVersionValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUbuntuVersionValueAccess().getGroup());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUbuntuVersionValue"


    // $ANTLR start "entryRuleDouble0"
    // InternalUtilParser.g:907:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalUtilParser.g:908:1: ( ruleDouble0 EOF )
            // InternalUtilParser.g:909:1: ruleDouble0 EOF
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
    // InternalUtilParser.g:916:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:920:2: ( ( RULE_DOUBLE ) )
            // InternalUtilParser.g:921:2: ( RULE_DOUBLE )
            {
            // InternalUtilParser.g:921:2: ( RULE_DOUBLE )
            // InternalUtilParser.g:922:3: RULE_DOUBLE
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
    // InternalUtilParser.g:932:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalUtilParser.g:933:1: ( ruleInteger0 EOF )
            // InternalUtilParser.g:934:1: ruleInteger0 EOF
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
    // InternalUtilParser.g:941:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:945:2: ( ( RULE_DECINT ) )
            // InternalUtilParser.g:946:2: ( RULE_DECINT )
            {
            // InternalUtilParser.g:946:2: ( RULE_DECINT )
            // InternalUtilParser.g:947:3: RULE_DECINT
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
    // InternalUtilParser.g:957:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUtilParser.g:958:1: ( ruleEString EOF )
            // InternalUtilParser.g:959:1: ruleEString EOF
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
    // InternalUtilParser.g:966:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:970:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUtilParser.g:971:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUtilParser.g:971:2: ( ( rule__EString__Alternatives ) )
            // InternalUtilParser.g:972:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives());
            // InternalUtilParser.g:973:3: ( rule__EString__Alternatives )
            // InternalUtilParser.g:973:4: rule__EString__Alternatives
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
    // InternalUtilParser.g:982:1: entryRulePreListElement : rulePreListElement EOF ;
    public final void entryRulePreListElement() throws RecognitionException {

            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalUtilParser.g:986:1: ( rulePreListElement EOF )
            // InternalUtilParser.g:987:1: rulePreListElement EOF
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
    // InternalUtilParser.g:997:1: rulePreListElement : ( HyphenMinus ) ;
    public final void rulePreListElement() throws RecognitionException {

                HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");
                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1002:2: ( ( HyphenMinus ) )
            // InternalUtilParser.g:1003:2: ( HyphenMinus )
            {
            // InternalUtilParser.g:1003:2: ( HyphenMinus )
            // InternalUtilParser.g:1004:3: HyphenMinus
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


    // $ANTLR start "ruleProcessorArchitectureType"
    // InternalUtilParser.g:1015:1: ruleProcessorArchitectureType : ( ( rule__ProcessorArchitectureType__Alternatives ) ) ;
    public final void ruleProcessorArchitectureType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1019:1: ( ( ( rule__ProcessorArchitectureType__Alternatives ) ) )
            // InternalUtilParser.g:1020:2: ( ( rule__ProcessorArchitectureType__Alternatives ) )
            {
            // InternalUtilParser.g:1020:2: ( ( rule__ProcessorArchitectureType__Alternatives ) )
            // InternalUtilParser.g:1021:3: ( rule__ProcessorArchitectureType__Alternatives )
            {
             before(grammarAccess.getProcessorArchitectureTypeAccess().getAlternatives());
            // InternalUtilParser.g:1022:3: ( rule__ProcessorArchitectureType__Alternatives )
            // InternalUtilParser.g:1022:4: rule__ProcessorArchitectureType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorArchitectureType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessorArchitectureTypeAccess().getAlternatives());

            }


            }

        }
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


    // $ANTLR start "ruleLinuxDistribution"
    // InternalUtilParser.g:1031:1: ruleLinuxDistribution : ( ( rule__LinuxDistribution__Alternatives ) ) ;
    public final void ruleLinuxDistribution() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1035:1: ( ( ( rule__LinuxDistribution__Alternatives ) ) )
            // InternalUtilParser.g:1036:2: ( ( rule__LinuxDistribution__Alternatives ) )
            {
            // InternalUtilParser.g:1036:2: ( ( rule__LinuxDistribution__Alternatives ) )
            // InternalUtilParser.g:1037:3: ( rule__LinuxDistribution__Alternatives )
            {
             before(grammarAccess.getLinuxDistributionAccess().getAlternatives());
            // InternalUtilParser.g:1038:3: ( rule__LinuxDistribution__Alternatives )
            // InternalUtilParser.g:1038:4: rule__LinuxDistribution__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LinuxDistribution__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinuxDistributionAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinuxDistribution"


    // $ANTLR start "ruleUbuntuVersion"
    // InternalUtilParser.g:1047:1: ruleUbuntuVersion : ( ( rule__UbuntuVersion__Alternatives ) ) ;
    public final void ruleUbuntuVersion() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1051:1: ( ( ( rule__UbuntuVersion__Alternatives ) ) )
            // InternalUtilParser.g:1052:2: ( ( rule__UbuntuVersion__Alternatives ) )
            {
            // InternalUtilParser.g:1052:2: ( ( rule__UbuntuVersion__Alternatives ) )
            // InternalUtilParser.g:1053:3: ( rule__UbuntuVersion__Alternatives )
            {
             before(grammarAccess.getUbuntuVersionAccess().getAlternatives());
            // InternalUtilParser.g:1054:3: ( rule__UbuntuVersion__Alternatives )
            // InternalUtilParser.g:1054:4: rule__UbuntuVersion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UbuntuVersion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUbuntuVersionAccess().getAlternatives());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUbuntuVersion"


    // $ANTLR start "rule__AbstractOperatingSystemProperty__Alternatives"
    // InternalUtilParser.g:1062:1: rule__AbstractOperatingSystemProperty__Alternatives : ( ( ruleNameOperatingSystemProperty ) | ( ruleVersionOperatingSystemProperty ) );
    public final void rule__AbstractOperatingSystemProperty__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1066:1: ( ( ruleNameOperatingSystemProperty ) | ( ruleVersionOperatingSystemProperty ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==HyphenMinus) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==Name) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==Os_name) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==Os_version) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUtilParser.g:1067:2: ( ruleNameOperatingSystemProperty )
                    {
                    // InternalUtilParser.g:1067:2: ( ruleNameOperatingSystemProperty )
                    // InternalUtilParser.g:1068:3: ruleNameOperatingSystemProperty
                    {
                     before(grammarAccess.getAbstractOperatingSystemPropertyAccess().getNameOperatingSystemPropertyParserRuleCall_0());
                    pushFollow(FOLLOW_2);
                    ruleNameOperatingSystemProperty();

                    state._fsp--;

                     after(grammarAccess.getAbstractOperatingSystemPropertyAccess().getNameOperatingSystemPropertyParserRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalUtilParser.g:1073:2: ( ruleVersionOperatingSystemProperty )
                    {
                    // InternalUtilParser.g:1073:2: ( ruleVersionOperatingSystemProperty )
                    // InternalUtilParser.g:1074:3: ruleVersionOperatingSystemProperty
                    {
                     before(grammarAccess.getAbstractOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyParserRuleCall_1());
                    pushFollow(FOLLOW_2);
                    ruleVersionOperatingSystemProperty();

                    state._fsp--;

                     after(grammarAccess.getAbstractOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyParserRuleCall_1());

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
    // $ANTLR end "rule__AbstractOperatingSystemProperty__Alternatives"


    // $ANTLR start "rule__AbstractProperty__Alternatives"
    // InternalUtilParser.g:1083:1: rule__AbstractProperty__Alternatives : ( ( rulePropertyAttribute ) | ( rulePropertyMaximun ) | ( rulePropertyMinimum ) | ( rulePropertySelection ) | ( rulePropertyRange ) );
    public final void rule__AbstractProperty__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1087:1: ( ( rulePropertyAttribute ) | ( rulePropertyMaximun ) | ( rulePropertyMinimum ) | ( rulePropertySelection ) | ( rulePropertyRange ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalUtilParser.g:1088:2: ( rulePropertyAttribute )
                    {
                    // InternalUtilParser.g:1088:2: ( rulePropertyAttribute )
                    // InternalUtilParser.g:1089:3: rulePropertyAttribute
                    {
                     before(grammarAccess.getAbstractPropertyAccess().getPropertyAttributeParserRuleCall_0());
                    pushFollow(FOLLOW_2);
                    rulePropertyAttribute();

                    state._fsp--;

                     after(grammarAccess.getAbstractPropertyAccess().getPropertyAttributeParserRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalUtilParser.g:1094:2: ( rulePropertyMaximun )
                    {
                    // InternalUtilParser.g:1094:2: ( rulePropertyMaximun )
                    // InternalUtilParser.g:1095:3: rulePropertyMaximun
                    {
                     before(grammarAccess.getAbstractPropertyAccess().getPropertyMaximunParserRuleCall_1());
                    pushFollow(FOLLOW_2);
                    rulePropertyMaximun();

                    state._fsp--;

                     after(grammarAccess.getAbstractPropertyAccess().getPropertyMaximunParserRuleCall_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalUtilParser.g:1100:2: ( rulePropertyMinimum )
                    {
                    // InternalUtilParser.g:1100:2: ( rulePropertyMinimum )
                    // InternalUtilParser.g:1101:3: rulePropertyMinimum
                    {
                     before(grammarAccess.getAbstractPropertyAccess().getPropertyMinimumParserRuleCall_2());
                    pushFollow(FOLLOW_2);
                    rulePropertyMinimum();

                    state._fsp--;

                     after(grammarAccess.getAbstractPropertyAccess().getPropertyMinimumParserRuleCall_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalUtilParser.g:1106:2: ( rulePropertySelection )
                    {
                    // InternalUtilParser.g:1106:2: ( rulePropertySelection )
                    // InternalUtilParser.g:1107:3: rulePropertySelection
                    {
                     before(grammarAccess.getAbstractPropertyAccess().getPropertySelectionParserRuleCall_3());
                    pushFollow(FOLLOW_2);
                    rulePropertySelection();

                    state._fsp--;

                     after(grammarAccess.getAbstractPropertyAccess().getPropertySelectionParserRuleCall_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalUtilParser.g:1112:2: ( rulePropertyRange )
                    {
                    // InternalUtilParser.g:1112:2: ( rulePropertyRange )
                    // InternalUtilParser.g:1113:3: rulePropertyRange
                    {
                     before(grammarAccess.getAbstractPropertyAccess().getPropertyRangeParserRuleCall_4());
                    pushFollow(FOLLOW_2);
                    rulePropertyRange();

                    state._fsp--;

                     after(grammarAccess.getAbstractPropertyAccess().getPropertyRangeParserRuleCall_4());

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
    // $ANTLR end "rule__AbstractProperty__Alternatives"


    // $ANTLR start "rule__PropertyKind__Alternatives"
    // InternalUtilParser.g:1122:1: rule__PropertyKind__Alternatives : ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleRangeKind ) | ( ruleSelectionKind ) );
    public final void rule__PropertyKind__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1126:1: ( ( ruleAttributeKind ) | ( ruleMaximumKind ) | ( ruleMinimumKind ) | ( ruleRangeKind ) | ( ruleSelectionKind ) )
            int alt3=5;
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
            case RangeKind:
                {
                alt3=4;
                }
                break;
            case SelectionKind:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUtilParser.g:1127:2: ( ruleAttributeKind )
                    {
                    // InternalUtilParser.g:1127:2: ( ruleAttributeKind )
                    // InternalUtilParser.g:1128:3: ruleAttributeKind
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
                    // InternalUtilParser.g:1133:2: ( ruleMaximumKind )
                    {
                    // InternalUtilParser.g:1133:2: ( ruleMaximumKind )
                    // InternalUtilParser.g:1134:3: ruleMaximumKind
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
                    // InternalUtilParser.g:1139:2: ( ruleMinimumKind )
                    {
                    // InternalUtilParser.g:1139:2: ( ruleMinimumKind )
                    // InternalUtilParser.g:1140:3: ruleMinimumKind
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
                    // InternalUtilParser.g:1145:2: ( ruleRangeKind )
                    {
                    // InternalUtilParser.g:1145:2: ( ruleRangeKind )
                    // InternalUtilParser.g:1146:3: ruleRangeKind
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
                    // InternalUtilParser.g:1151:2: ( ruleSelectionKind )
                    {
                    // InternalUtilParser.g:1151:2: ( ruleSelectionKind )
                    // InternalUtilParser.g:1152:3: ruleSelectionKind
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
    // InternalUtilParser.g:1161:1: rule__PropertyValue__Alternatives : ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) | ( ruleProcessorArchitectureValue ) | ( ruleLinuxDistributionValue ) | ( ruleUbuntuVersionValue ) | ( rulePropertyValueList ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1165:1: ( ( rulePropertyValueInt ) | ( rulePropertyValueDouble ) | ( rulePropertyValueString ) | ( ruleProcessorArchitectureValue ) | ( ruleLinuxDistributionValue ) | ( ruleUbuntuVersionValue ) | ( rulePropertyValueList ) )
            int alt4=7;
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
            case Arm64:
            case X86:
                {
                alt4=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt4=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt4=6;
                }
                break;
            case RULE_INDENT:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalUtilParser.g:1166:2: ( rulePropertyValueInt )
                    {
                    // InternalUtilParser.g:1166:2: ( rulePropertyValueInt )
                    // InternalUtilParser.g:1167:3: rulePropertyValueInt
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
                    // InternalUtilParser.g:1172:2: ( rulePropertyValueDouble )
                    {
                    // InternalUtilParser.g:1172:2: ( rulePropertyValueDouble )
                    // InternalUtilParser.g:1173:3: rulePropertyValueDouble
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
                    // InternalUtilParser.g:1178:2: ( rulePropertyValueString )
                    {
                    // InternalUtilParser.g:1178:2: ( rulePropertyValueString )
                    // InternalUtilParser.g:1179:3: rulePropertyValueString
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
                    // InternalUtilParser.g:1184:2: ( ruleProcessorArchitectureValue )
                    {
                    // InternalUtilParser.g:1184:2: ( ruleProcessorArchitectureValue )
                    // InternalUtilParser.g:1185:3: ruleProcessorArchitectureValue
                    {
                     before(grammarAccess.getPropertyValueAccess().getProcessorArchitectureValueParserRuleCall_3());
                    pushFollow(FOLLOW_2);
                    ruleProcessorArchitectureValue();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getProcessorArchitectureValueParserRuleCall_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalUtilParser.g:1190:2: ( ruleLinuxDistributionValue )
                    {
                    // InternalUtilParser.g:1190:2: ( ruleLinuxDistributionValue )
                    // InternalUtilParser.g:1191:3: ruleLinuxDistributionValue
                    {
                     before(grammarAccess.getPropertyValueAccess().getLinuxDistributionValueParserRuleCall_4());
                    pushFollow(FOLLOW_2);
                    ruleLinuxDistributionValue();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getLinuxDistributionValueParserRuleCall_4());

                    }


                    }
                    break;
                case 6 :
                    // InternalUtilParser.g:1196:2: ( ruleUbuntuVersionValue )
                    {
                    // InternalUtilParser.g:1196:2: ( ruleUbuntuVersionValue )
                    // InternalUtilParser.g:1197:3: ruleUbuntuVersionValue
                    {
                     before(grammarAccess.getPropertyValueAccess().getUbuntuVersionValueParserRuleCall_5());
                    pushFollow(FOLLOW_2);
                    ruleUbuntuVersionValue();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getUbuntuVersionValueParserRuleCall_5());

                    }


                    }
                    break;
                case 7 :
                    // InternalUtilParser.g:1202:2: ( rulePropertyValueList )
                    {
                    // InternalUtilParser.g:1202:2: ( rulePropertyValueList )
                    // InternalUtilParser.g:1203:3: rulePropertyValueList
                    {
                     before(grammarAccess.getPropertyValueAccess().getPropertyValueListParserRuleCall_6());
                    pushFollow(FOLLOW_2);
                    rulePropertyValueList();

                    state._fsp--;

                     after(grammarAccess.getPropertyValueAccess().getPropertyValueListParserRuleCall_6());

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


    // $ANTLR start "rule__OpertingSystemResouceType__Alternatives"
    // InternalUtilParser.g:1212:1: rule__OpertingSystemResouceType__Alternatives : ( ( ruleLinuxOpertingSystem ) | ( ruleMacOSOpertingSystem ) );
    public final void rule__OpertingSystemResouceType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1216:1: ( ( ruleLinuxOpertingSystem ) | ( ruleMacOSOpertingSystem ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==LinuxOpertingSystem) ) {
                alt5=1;
            }
            else if ( (LA5_0==MacOSOpertingSystem) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUtilParser.g:1217:2: ( ruleLinuxOpertingSystem )
                    {
                    // InternalUtilParser.g:1217:2: ( ruleLinuxOpertingSystem )
                    // InternalUtilParser.g:1218:3: ruleLinuxOpertingSystem
                    {
                     before(grammarAccess.getOpertingSystemResouceTypeAccess().getLinuxOpertingSystemParserRuleCall_0());
                    pushFollow(FOLLOW_2);
                    ruleLinuxOpertingSystem();

                    state._fsp--;

                     after(grammarAccess.getOpertingSystemResouceTypeAccess().getLinuxOpertingSystemParserRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalUtilParser.g:1223:2: ( ruleMacOSOpertingSystem )
                    {
                    // InternalUtilParser.g:1223:2: ( ruleMacOSOpertingSystem )
                    // InternalUtilParser.g:1224:3: ruleMacOSOpertingSystem
                    {
                     before(grammarAccess.getOpertingSystemResouceTypeAccess().getMacOSOpertingSystemParserRuleCall_1());
                    pushFollow(FOLLOW_2);
                    ruleMacOSOpertingSystem();

                    state._fsp--;

                     after(grammarAccess.getOpertingSystemResouceTypeAccess().getMacOSOpertingSystemParserRuleCall_1());

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
    // $ANTLR end "rule__OpertingSystemResouceType__Alternatives"


    // $ANTLR start "rule__NetworkCommunicationType__Alternatives"
    // InternalUtilParser.g:1233:1: rule__NetworkCommunicationType__Alternatives : ( ( ruleEthernetCommunicationType ) | ( ruleWlanCommunicationType ) );
    public final void rule__NetworkCommunicationType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1237:1: ( ( ruleEthernetCommunicationType ) | ( ruleWlanCommunicationType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Ethernet) ) {
                alt6=1;
            }
            else if ( (LA6_0==Wlan) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUtilParser.g:1238:2: ( ruleEthernetCommunicationType )
                    {
                    // InternalUtilParser.g:1238:2: ( ruleEthernetCommunicationType )
                    // InternalUtilParser.g:1239:3: ruleEthernetCommunicationType
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
                    // InternalUtilParser.g:1244:2: ( ruleWlanCommunicationType )
                    {
                    // InternalUtilParser.g:1244:2: ( ruleWlanCommunicationType )
                    // InternalUtilParser.g:1245:3: ruleWlanCommunicationType
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
    // InternalUtilParser.g:1254:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1258:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalUtilParser.g:1259:2: ( RULE_STRING )
                    {
                    // InternalUtilParser.g:1259:2: ( RULE_STRING )
                    // InternalUtilParser.g:1260:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    match(input,RULE_STRING,FOLLOW_2);
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalUtilParser.g:1265:2: ( RULE_ID )
                    {
                    // InternalUtilParser.g:1265:2: ( RULE_ID )
                    // InternalUtilParser.g:1266:3: RULE_ID
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


    // $ANTLR start "rule__ProcessorArchitectureType__Alternatives"
    // InternalUtilParser.g:1275:1: rule__ProcessorArchitectureType__Alternatives : ( ( ( X86 ) ) | ( ( Arm64 ) ) );
    public final void rule__ProcessorArchitectureType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1279:1: ( ( ( X86 ) ) | ( ( Arm64 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==X86) ) {
                alt8=1;
            }
            else if ( (LA8_0==Arm64) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUtilParser.g:1280:2: ( ( X86 ) )
                    {
                    // InternalUtilParser.g:1280:2: ( ( X86 ) )
                    // InternalUtilParser.g:1281:3: ( X86 )
                    {
                     before(grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());
                    // InternalUtilParser.g:1282:3: ( X86 )
                    // InternalUtilParser.g:1282:4: X86
                    {
                    match(input,X86,FOLLOW_2);

                    }

                     after(grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalUtilParser.g:1286:2: ( ( Arm64 ) )
                    {
                    // InternalUtilParser.g:1286:2: ( ( Arm64 ) )
                    // InternalUtilParser.g:1287:3: ( Arm64 )
                    {
                     before(grammarAccess.getProcessorArchitectureTypeAccess().getArm64EnumLiteralDeclaration_1());
                    // InternalUtilParser.g:1288:3: ( Arm64 )
                    // InternalUtilParser.g:1288:4: Arm64
                    {
                    match(input,Arm64,FOLLOW_2);

                    }

                     after(grammarAccess.getProcessorArchitectureTypeAccess().getArm64EnumLiteralDeclaration_1());

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
    // $ANTLR end "rule__ProcessorArchitectureType__Alternatives"


    // $ANTLR start "rule__LinuxDistribution__Alternatives"
    // InternalUtilParser.g:1296:1: rule__LinuxDistribution__Alternatives : ( ( ( Ubuntu ) ) | ( ( Debian ) ) );
    public final void rule__LinuxDistribution__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1300:1: ( ( ( Ubuntu ) ) | ( ( Debian ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Ubuntu) ) {
                alt9=1;
            }
            else if ( (LA9_0==Debian) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUtilParser.g:1301:2: ( ( Ubuntu ) )
                    {
                    // InternalUtilParser.g:1301:2: ( ( Ubuntu ) )
                    // InternalUtilParser.g:1302:3: ( Ubuntu )
                    {
                     before(grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());
                    // InternalUtilParser.g:1303:3: ( Ubuntu )
                    // InternalUtilParser.g:1303:4: Ubuntu
                    {
                    match(input,Ubuntu,FOLLOW_2);

                    }

                     after(grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalUtilParser.g:1307:2: ( ( Debian ) )
                    {
                    // InternalUtilParser.g:1307:2: ( ( Debian ) )
                    // InternalUtilParser.g:1308:3: ( Debian )
                    {
                     before(grammarAccess.getLinuxDistributionAccess().getDebianEnumLiteralDeclaration_1());
                    // InternalUtilParser.g:1309:3: ( Debian )
                    // InternalUtilParser.g:1309:4: Debian
                    {
                    match(input,Debian,FOLLOW_2);

                    }

                     after(grammarAccess.getLinuxDistributionAccess().getDebianEnumLiteralDeclaration_1());

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
    // $ANTLR end "rule__LinuxDistribution__Alternatives"


    // $ANTLR start "rule__UbuntuVersion__Alternatives"
    // InternalUtilParser.g:1317:1: rule__UbuntuVersion__Alternatives : ( ( ( Focal ) ) | ( ( Jammy ) ) );
    public final void rule__UbuntuVersion__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1321:1: ( ( ( Focal ) ) | ( ( Jammy ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Focal) ) {
                alt10=1;
            }
            else if ( (LA10_0==Jammy) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUtilParser.g:1322:2: ( ( Focal ) )
                    {
                    // InternalUtilParser.g:1322:2: ( ( Focal ) )
                    // InternalUtilParser.g:1323:3: ( Focal )
                    {
                     before(grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());
                    // InternalUtilParser.g:1324:3: ( Focal )
                    // InternalUtilParser.g:1324:4: Focal
                    {
                    match(input,Focal,FOLLOW_2);

                    }

                     after(grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalUtilParser.g:1328:2: ( ( Jammy ) )
                    {
                    // InternalUtilParser.g:1328:2: ( ( Jammy ) )
                    // InternalUtilParser.g:1329:3: ( Jammy )
                    {
                     before(grammarAccess.getUbuntuVersionAccess().getJammyEnumLiteralDeclaration_1());
                    // InternalUtilParser.g:1330:3: ( Jammy )
                    // InternalUtilParser.g:1330:4: Jammy
                    {
                    match(input,Jammy,FOLLOW_2);

                    }

                     after(grammarAccess.getUbuntuVersionAccess().getJammyEnumLiteralDeclaration_1());

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
    // $ANTLR end "rule__UbuntuVersion__Alternatives"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__0"
    // InternalUtilParser.g:1338:1: rule__NameOperatingSystemProperty__Group__0 : rule__NameOperatingSystemProperty__Group__0__Impl rule__NameOperatingSystemProperty__Group__1 ;
    public final void rule__NameOperatingSystemProperty__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1342:1: ( rule__NameOperatingSystemProperty__Group__0__Impl rule__NameOperatingSystemProperty__Group__1 )
            // InternalUtilParser.g:1343:2: rule__NameOperatingSystemProperty__Group__0__Impl rule__NameOperatingSystemProperty__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NameOperatingSystemProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__0"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__0__Impl"
    // InternalUtilParser.g:1350:1: rule__NameOperatingSystemProperty__Group__0__Impl : ( () ) ;
    public final void rule__NameOperatingSystemProperty__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1354:1: ( ( () ) )
            // InternalUtilParser.g:1355:1: ( () )
            {
            // InternalUtilParser.g:1355:1: ( () )
            // InternalUtilParser.g:1356:2: ()
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getNameOperatingSystemPropertyAction_0());
            // InternalUtilParser.g:1357:2: ()
            // InternalUtilParser.g:1357:3:
            {
            }

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getNameOperatingSystemPropertyAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__0__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__1"
    // InternalUtilParser.g:1365:1: rule__NameOperatingSystemProperty__Group__1 : rule__NameOperatingSystemProperty__Group__1__Impl rule__NameOperatingSystemProperty__Group__2 ;
    public final void rule__NameOperatingSystemProperty__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1369:1: ( rule__NameOperatingSystemProperty__Group__1__Impl rule__NameOperatingSystemProperty__Group__2 )
            // InternalUtilParser.g:1370:2: rule__NameOperatingSystemProperty__Group__1__Impl rule__NameOperatingSystemProperty__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NameOperatingSystemProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__1"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__1__Impl"
    // InternalUtilParser.g:1377:1: rule__NameOperatingSystemProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__NameOperatingSystemProperty__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1381:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:1382:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:1382:1: ( rulePreListElement )
            // InternalUtilParser.g:1383:2: rulePreListElement
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__1__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__2"
    // InternalUtilParser.g:1392:1: rule__NameOperatingSystemProperty__Group__2 : rule__NameOperatingSystemProperty__Group__2__Impl rule__NameOperatingSystemProperty__Group__3 ;
    public final void rule__NameOperatingSystemProperty__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1396:1: ( rule__NameOperatingSystemProperty__Group__2__Impl rule__NameOperatingSystemProperty__Group__3 )
            // InternalUtilParser.g:1397:2: rule__NameOperatingSystemProperty__Group__2__Impl rule__NameOperatingSystemProperty__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__NameOperatingSystemProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__2"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__2__Impl"
    // InternalUtilParser.g:1404:1: rule__NameOperatingSystemProperty__Group__2__Impl : ( Name ) ;
    public final void rule__NameOperatingSystemProperty__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1408:1: ( ( Name ) )
            // InternalUtilParser.g:1409:1: ( Name )
            {
            // InternalUtilParser.g:1409:1: ( Name )
            // InternalUtilParser.g:1410:2: Name
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());
            match(input,Name,FOLLOW_2);
             after(grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__2__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__3"
    // InternalUtilParser.g:1419:1: rule__NameOperatingSystemProperty__Group__3 : rule__NameOperatingSystemProperty__Group__3__Impl rule__NameOperatingSystemProperty__Group__4 ;
    public final void rule__NameOperatingSystemProperty__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1423:1: ( rule__NameOperatingSystemProperty__Group__3__Impl rule__NameOperatingSystemProperty__Group__4 )
            // InternalUtilParser.g:1424:2: rule__NameOperatingSystemProperty__Group__3__Impl rule__NameOperatingSystemProperty__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__NameOperatingSystemProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__3"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__3__Impl"
    // InternalUtilParser.g:1431:1: rule__NameOperatingSystemProperty__Group__3__Impl : ( ( rule__NameOperatingSystemProperty__NameAssignment_3 ) ) ;
    public final void rule__NameOperatingSystemProperty__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1435:1: ( ( ( rule__NameOperatingSystemProperty__NameAssignment_3 ) ) )
            // InternalUtilParser.g:1436:1: ( ( rule__NameOperatingSystemProperty__NameAssignment_3 ) )
            {
            // InternalUtilParser.g:1436:1: ( ( rule__NameOperatingSystemProperty__NameAssignment_3 ) )
            // InternalUtilParser.g:1437:2: ( rule__NameOperatingSystemProperty__NameAssignment_3 )
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getNameAssignment_3());
            // InternalUtilParser.g:1438:2: ( rule__NameOperatingSystemProperty__NameAssignment_3 )
            // InternalUtilParser.g:1438:3: rule__NameOperatingSystemProperty__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getNameAssignment_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__3__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__4"
    // InternalUtilParser.g:1446:1: rule__NameOperatingSystemProperty__Group__4 : rule__NameOperatingSystemProperty__Group__4__Impl rule__NameOperatingSystemProperty__Group__5 ;
    public final void rule__NameOperatingSystemProperty__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1450:1: ( rule__NameOperatingSystemProperty__Group__4__Impl rule__NameOperatingSystemProperty__Group__5 )
            // InternalUtilParser.g:1451:2: rule__NameOperatingSystemProperty__Group__4__Impl rule__NameOperatingSystemProperty__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__NameOperatingSystemProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__4"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__4__Impl"
    // InternalUtilParser.g:1458:1: rule__NameOperatingSystemProperty__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__NameOperatingSystemProperty__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1462:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:1463:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:1463:1: ( RULE_INDENT )
            // InternalUtilParser.g:1464:2: RULE_INDENT
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getNameOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__4__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__5"
    // InternalUtilParser.g:1473:1: rule__NameOperatingSystemProperty__Group__5 : rule__NameOperatingSystemProperty__Group__5__Impl rule__NameOperatingSystemProperty__Group__6 ;
    public final void rule__NameOperatingSystemProperty__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1477:1: ( rule__NameOperatingSystemProperty__Group__5__Impl rule__NameOperatingSystemProperty__Group__6 )
            // InternalUtilParser.g:1478:2: rule__NameOperatingSystemProperty__Group__5__Impl rule__NameOperatingSystemProperty__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__NameOperatingSystemProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__5"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__5__Impl"
    // InternalUtilParser.g:1485:1: rule__NameOperatingSystemProperty__Group__5__Impl : ( Kind ) ;
    public final void rule__NameOperatingSystemProperty__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1489:1: ( ( Kind ) )
            // InternalUtilParser.g:1490:1: ( Kind )
            {
            // InternalUtilParser.g:1490:1: ( Kind )
            // InternalUtilParser.g:1491:2: Kind
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getKindKeyword_5());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getNameOperatingSystemPropertyAccess().getKindKeyword_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__5__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__6"
    // InternalUtilParser.g:1500:1: rule__NameOperatingSystemProperty__Group__6 : rule__NameOperatingSystemProperty__Group__6__Impl rule__NameOperatingSystemProperty__Group__7 ;
    public final void rule__NameOperatingSystemProperty__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1504:1: ( rule__NameOperatingSystemProperty__Group__6__Impl rule__NameOperatingSystemProperty__Group__7 )
            // InternalUtilParser.g:1505:2: rule__NameOperatingSystemProperty__Group__6__Impl rule__NameOperatingSystemProperty__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__NameOperatingSystemProperty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__6"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__6__Impl"
    // InternalUtilParser.g:1512:1: rule__NameOperatingSystemProperty__Group__6__Impl : ( ( rule__NameOperatingSystemProperty__KindAssignment_6 ) ) ;
    public final void rule__NameOperatingSystemProperty__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1516:1: ( ( ( rule__NameOperatingSystemProperty__KindAssignment_6 ) ) )
            // InternalUtilParser.g:1517:1: ( ( rule__NameOperatingSystemProperty__KindAssignment_6 ) )
            {
            // InternalUtilParser.g:1517:1: ( ( rule__NameOperatingSystemProperty__KindAssignment_6 ) )
            // InternalUtilParser.g:1518:2: ( rule__NameOperatingSystemProperty__KindAssignment_6 )
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAssignment_6());
            // InternalUtilParser.g:1519:2: ( rule__NameOperatingSystemProperty__KindAssignment_6 )
            // InternalUtilParser.g:1519:3: rule__NameOperatingSystemProperty__KindAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__KindAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAssignment_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__6__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__7"
    // InternalUtilParser.g:1527:1: rule__NameOperatingSystemProperty__Group__7 : rule__NameOperatingSystemProperty__Group__7__Impl rule__NameOperatingSystemProperty__Group__8 ;
    public final void rule__NameOperatingSystemProperty__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1531:1: ( rule__NameOperatingSystemProperty__Group__7__Impl rule__NameOperatingSystemProperty__Group__8 )
            // InternalUtilParser.g:1532:2: rule__NameOperatingSystemProperty__Group__7__Impl rule__NameOperatingSystemProperty__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__NameOperatingSystemProperty__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__7"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__7__Impl"
    // InternalUtilParser.g:1539:1: rule__NameOperatingSystemProperty__Group__7__Impl : ( ( rule__NameOperatingSystemProperty__Group_7__0 )? ) ;
    public final void rule__NameOperatingSystemProperty__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1543:1: ( ( ( rule__NameOperatingSystemProperty__Group_7__0 )? ) )
            // InternalUtilParser.g:1544:1: ( ( rule__NameOperatingSystemProperty__Group_7__0 )? )
            {
            // InternalUtilParser.g:1544:1: ( ( rule__NameOperatingSystemProperty__Group_7__0 )? )
            // InternalUtilParser.g:1545:2: ( rule__NameOperatingSystemProperty__Group_7__0 )?
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup_7());
            // InternalUtilParser.g:1546:2: ( rule__NameOperatingSystemProperty__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Description) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUtilParser.g:1546:3: rule__NameOperatingSystemProperty__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameOperatingSystemProperty__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__7__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__8"
    // InternalUtilParser.g:1554:1: rule__NameOperatingSystemProperty__Group__8 : rule__NameOperatingSystemProperty__Group__8__Impl rule__NameOperatingSystemProperty__Group__9 ;
    public final void rule__NameOperatingSystemProperty__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1558:1: ( rule__NameOperatingSystemProperty__Group__8__Impl rule__NameOperatingSystemProperty__Group__9 )
            // InternalUtilParser.g:1559:2: rule__NameOperatingSystemProperty__Group__8__Impl rule__NameOperatingSystemProperty__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__NameOperatingSystemProperty__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__8"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__8__Impl"
    // InternalUtilParser.g:1566:1: rule__NameOperatingSystemProperty__Group__8__Impl : ( ( rule__NameOperatingSystemProperty__Group_8__0 )? ) ;
    public final void rule__NameOperatingSystemProperty__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1570:1: ( ( ( rule__NameOperatingSystemProperty__Group_8__0 )? ) )
            // InternalUtilParser.g:1571:1: ( ( rule__NameOperatingSystemProperty__Group_8__0 )? )
            {
            // InternalUtilParser.g:1571:1: ( ( rule__NameOperatingSystemProperty__Group_8__0 )? )
            // InternalUtilParser.g:1572:2: ( rule__NameOperatingSystemProperty__Group_8__0 )?
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup_8());
            // InternalUtilParser.g:1573:2: ( rule__NameOperatingSystemProperty__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Value) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUtilParser.g:1573:3: rule__NameOperatingSystemProperty__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameOperatingSystemProperty__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getGroup_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__8__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__9"
    // InternalUtilParser.g:1581:1: rule__NameOperatingSystemProperty__Group__9 : rule__NameOperatingSystemProperty__Group__9__Impl ;
    public final void rule__NameOperatingSystemProperty__Group__9() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1585:1: ( rule__NameOperatingSystemProperty__Group__9__Impl )
            // InternalUtilParser.g:1586:2: rule__NameOperatingSystemProperty__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__9"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group__9__Impl"
    // InternalUtilParser.g:1592:1: rule__NameOperatingSystemProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__NameOperatingSystemProperty__Group__9__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1596:1: ( ( RULE_DEDENT ) )
            // InternalUtilParser.g:1597:1: ( RULE_DEDENT )
            {
            // InternalUtilParser.g:1597:1: ( RULE_DEDENT )
            // InternalUtilParser.g:1598:2: RULE_DEDENT
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getDEDENTTerminalRuleCall_9());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getNameOperatingSystemPropertyAccess().getDEDENTTerminalRuleCall_9());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group__9__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group_7__0"
    // InternalUtilParser.g:1608:1: rule__NameOperatingSystemProperty__Group_7__0 : rule__NameOperatingSystemProperty__Group_7__0__Impl rule__NameOperatingSystemProperty__Group_7__1 ;
    public final void rule__NameOperatingSystemProperty__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1612:1: ( rule__NameOperatingSystemProperty__Group_7__0__Impl rule__NameOperatingSystemProperty__Group_7__1 )
            // InternalUtilParser.g:1613:2: rule__NameOperatingSystemProperty__Group_7__0__Impl rule__NameOperatingSystemProperty__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__NameOperatingSystemProperty__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group_7__0"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group_7__0__Impl"
    // InternalUtilParser.g:1620:1: rule__NameOperatingSystemProperty__Group_7__0__Impl : ( Description ) ;
    public final void rule__NameOperatingSystemProperty__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1624:1: ( ( Description ) )
            // InternalUtilParser.g:1625:1: ( Description )
            {
            // InternalUtilParser.g:1625:1: ( Description )
            // InternalUtilParser.g:1626:2: Description
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group_7__0__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group_7__1"
    // InternalUtilParser.g:1635:1: rule__NameOperatingSystemProperty__Group_7__1 : rule__NameOperatingSystemProperty__Group_7__1__Impl ;
    public final void rule__NameOperatingSystemProperty__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1639:1: ( rule__NameOperatingSystemProperty__Group_7__1__Impl )
            // InternalUtilParser.g:1640:2: rule__NameOperatingSystemProperty__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group_7__1"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group_7__1__Impl"
    // InternalUtilParser.g:1646:1: rule__NameOperatingSystemProperty__Group_7__1__Impl : ( ( rule__NameOperatingSystemProperty__DescriptionAssignment_7_1 ) ) ;
    public final void rule__NameOperatingSystemProperty__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1650:1: ( ( ( rule__NameOperatingSystemProperty__DescriptionAssignment_7_1 ) ) )
            // InternalUtilParser.g:1651:1: ( ( rule__NameOperatingSystemProperty__DescriptionAssignment_7_1 ) )
            {
            // InternalUtilParser.g:1651:1: ( ( rule__NameOperatingSystemProperty__DescriptionAssignment_7_1 ) )
            // InternalUtilParser.g:1652:2: ( rule__NameOperatingSystemProperty__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionAssignment_7_1());
            // InternalUtilParser.g:1653:2: ( rule__NameOperatingSystemProperty__DescriptionAssignment_7_1 )
            // InternalUtilParser.g:1653:3: rule__NameOperatingSystemProperty__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionAssignment_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group_7__1__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group_8__0"
    // InternalUtilParser.g:1662:1: rule__NameOperatingSystemProperty__Group_8__0 : rule__NameOperatingSystemProperty__Group_8__0__Impl rule__NameOperatingSystemProperty__Group_8__1 ;
    public final void rule__NameOperatingSystemProperty__Group_8__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1666:1: ( rule__NameOperatingSystemProperty__Group_8__0__Impl rule__NameOperatingSystemProperty__Group_8__1 )
            // InternalUtilParser.g:1667:2: rule__NameOperatingSystemProperty__Group_8__0__Impl rule__NameOperatingSystemProperty__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__NameOperatingSystemProperty__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group_8__0"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group_8__0__Impl"
    // InternalUtilParser.g:1674:1: rule__NameOperatingSystemProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__NameOperatingSystemProperty__Group_8__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1678:1: ( ( Value ) )
            // InternalUtilParser.g:1679:1: ( Value )
            {
            // InternalUtilParser.g:1679:1: ( Value )
            // InternalUtilParser.g:1680:2: Value
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group_8__0__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group_8__1"
    // InternalUtilParser.g:1689:1: rule__NameOperatingSystemProperty__Group_8__1 : rule__NameOperatingSystemProperty__Group_8__1__Impl ;
    public final void rule__NameOperatingSystemProperty__Group_8__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1693:1: ( rule__NameOperatingSystemProperty__Group_8__1__Impl )
            // InternalUtilParser.g:1694:2: rule__NameOperatingSystemProperty__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group_8__1"


    // $ANTLR start "rule__NameOperatingSystemProperty__Group_8__1__Impl"
    // InternalUtilParser.g:1700:1: rule__NameOperatingSystemProperty__Group_8__1__Impl : ( ( rule__NameOperatingSystemProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__NameOperatingSystemProperty__Group_8__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1704:1: ( ( ( rule__NameOperatingSystemProperty__ValueAssignment_8_1 ) ) )
            // InternalUtilParser.g:1705:1: ( ( rule__NameOperatingSystemProperty__ValueAssignment_8_1 ) )
            {
            // InternalUtilParser.g:1705:1: ( ( rule__NameOperatingSystemProperty__ValueAssignment_8_1 ) )
            // InternalUtilParser.g:1706:2: ( rule__NameOperatingSystemProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getValueAssignment_8_1());
            // InternalUtilParser.g:1707:2: ( rule__NameOperatingSystemProperty__ValueAssignment_8_1 )
            // InternalUtilParser.g:1707:3: rule__NameOperatingSystemProperty__ValueAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__NameOperatingSystemProperty__ValueAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getValueAssignment_8_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__Group_8__1__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__0"
    // InternalUtilParser.g:1716:1: rule__VersionOperatingSystemProperty__Group__0 : rule__VersionOperatingSystemProperty__Group__0__Impl rule__VersionOperatingSystemProperty__Group__1 ;
    public final void rule__VersionOperatingSystemProperty__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1720:1: ( rule__VersionOperatingSystemProperty__Group__0__Impl rule__VersionOperatingSystemProperty__Group__1 )
            // InternalUtilParser.g:1721:2: rule__VersionOperatingSystemProperty__Group__0__Impl rule__VersionOperatingSystemProperty__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VersionOperatingSystemProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__0"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__0__Impl"
    // InternalUtilParser.g:1728:1: rule__VersionOperatingSystemProperty__Group__0__Impl : ( () ) ;
    public final void rule__VersionOperatingSystemProperty__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1732:1: ( ( () ) )
            // InternalUtilParser.g:1733:1: ( () )
            {
            // InternalUtilParser.g:1733:1: ( () )
            // InternalUtilParser.g:1734:2: ()
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyAction_0());
            // InternalUtilParser.g:1735:2: ()
            // InternalUtilParser.g:1735:3:
            {
            }

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__0__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__1"
    // InternalUtilParser.g:1743:1: rule__VersionOperatingSystemProperty__Group__1 : rule__VersionOperatingSystemProperty__Group__1__Impl rule__VersionOperatingSystemProperty__Group__2 ;
    public final void rule__VersionOperatingSystemProperty__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1747:1: ( rule__VersionOperatingSystemProperty__Group__1__Impl rule__VersionOperatingSystemProperty__Group__2 )
            // InternalUtilParser.g:1748:2: rule__VersionOperatingSystemProperty__Group__1__Impl rule__VersionOperatingSystemProperty__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VersionOperatingSystemProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__1"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__1__Impl"
    // InternalUtilParser.g:1755:1: rule__VersionOperatingSystemProperty__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__VersionOperatingSystemProperty__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1759:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:1760:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:1760:1: ( rulePreListElement )
            // InternalUtilParser.g:1761:2: rulePreListElement
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__1__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__2"
    // InternalUtilParser.g:1770:1: rule__VersionOperatingSystemProperty__Group__2 : rule__VersionOperatingSystemProperty__Group__2__Impl rule__VersionOperatingSystemProperty__Group__3 ;
    public final void rule__VersionOperatingSystemProperty__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1774:1: ( rule__VersionOperatingSystemProperty__Group__2__Impl rule__VersionOperatingSystemProperty__Group__3 )
            // InternalUtilParser.g:1775:2: rule__VersionOperatingSystemProperty__Group__2__Impl rule__VersionOperatingSystemProperty__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__VersionOperatingSystemProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__2"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__2__Impl"
    // InternalUtilParser.g:1782:1: rule__VersionOperatingSystemProperty__Group__2__Impl : ( Name ) ;
    public final void rule__VersionOperatingSystemProperty__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1786:1: ( ( Name ) )
            // InternalUtilParser.g:1787:1: ( Name )
            {
            // InternalUtilParser.g:1787:1: ( Name )
            // InternalUtilParser.g:1788:2: Name
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());
            match(input,Name,FOLLOW_2);
             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__2__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__3"
    // InternalUtilParser.g:1797:1: rule__VersionOperatingSystemProperty__Group__3 : rule__VersionOperatingSystemProperty__Group__3__Impl rule__VersionOperatingSystemProperty__Group__4 ;
    public final void rule__VersionOperatingSystemProperty__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1801:1: ( rule__VersionOperatingSystemProperty__Group__3__Impl rule__VersionOperatingSystemProperty__Group__4 )
            // InternalUtilParser.g:1802:2: rule__VersionOperatingSystemProperty__Group__3__Impl rule__VersionOperatingSystemProperty__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VersionOperatingSystemProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__3"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__3__Impl"
    // InternalUtilParser.g:1809:1: rule__VersionOperatingSystemProperty__Group__3__Impl : ( ( rule__VersionOperatingSystemProperty__NameAssignment_3 ) ) ;
    public final void rule__VersionOperatingSystemProperty__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1813:1: ( ( ( rule__VersionOperatingSystemProperty__NameAssignment_3 ) ) )
            // InternalUtilParser.g:1814:1: ( ( rule__VersionOperatingSystemProperty__NameAssignment_3 ) )
            {
            // InternalUtilParser.g:1814:1: ( ( rule__VersionOperatingSystemProperty__NameAssignment_3 ) )
            // InternalUtilParser.g:1815:2: ( rule__VersionOperatingSystemProperty__NameAssignment_3 )
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameAssignment_3());
            // InternalUtilParser.g:1816:2: ( rule__VersionOperatingSystemProperty__NameAssignment_3 )
            // InternalUtilParser.g:1816:3: rule__VersionOperatingSystemProperty__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameAssignment_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__3__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__4"
    // InternalUtilParser.g:1824:1: rule__VersionOperatingSystemProperty__Group__4 : rule__VersionOperatingSystemProperty__Group__4__Impl rule__VersionOperatingSystemProperty__Group__5 ;
    public final void rule__VersionOperatingSystemProperty__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1828:1: ( rule__VersionOperatingSystemProperty__Group__4__Impl rule__VersionOperatingSystemProperty__Group__5 )
            // InternalUtilParser.g:1829:2: rule__VersionOperatingSystemProperty__Group__4__Impl rule__VersionOperatingSystemProperty__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__VersionOperatingSystemProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__4"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__4__Impl"
    // InternalUtilParser.g:1836:1: rule__VersionOperatingSystemProperty__Group__4__Impl : ( RULE_INDENT ) ;
    public final void rule__VersionOperatingSystemProperty__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1840:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:1841:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:1841:1: ( RULE_INDENT )
            // InternalUtilParser.g:1842:2: RULE_INDENT
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__4__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__5"
    // InternalUtilParser.g:1851:1: rule__VersionOperatingSystemProperty__Group__5 : rule__VersionOperatingSystemProperty__Group__5__Impl rule__VersionOperatingSystemProperty__Group__6 ;
    public final void rule__VersionOperatingSystemProperty__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1855:1: ( rule__VersionOperatingSystemProperty__Group__5__Impl rule__VersionOperatingSystemProperty__Group__6 )
            // InternalUtilParser.g:1856:2: rule__VersionOperatingSystemProperty__Group__5__Impl rule__VersionOperatingSystemProperty__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__VersionOperatingSystemProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__5"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__5__Impl"
    // InternalUtilParser.g:1863:1: rule__VersionOperatingSystemProperty__Group__5__Impl : ( Kind ) ;
    public final void rule__VersionOperatingSystemProperty__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1867:1: ( ( Kind ) )
            // InternalUtilParser.g:1868:1: ( Kind )
            {
            // InternalUtilParser.g:1868:1: ( Kind )
            // InternalUtilParser.g:1869:2: Kind
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindKeyword_5());
            match(input,Kind,FOLLOW_2);
             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindKeyword_5());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__5__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__6"
    // InternalUtilParser.g:1878:1: rule__VersionOperatingSystemProperty__Group__6 : rule__VersionOperatingSystemProperty__Group__6__Impl rule__VersionOperatingSystemProperty__Group__7 ;
    public final void rule__VersionOperatingSystemProperty__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1882:1: ( rule__VersionOperatingSystemProperty__Group__6__Impl rule__VersionOperatingSystemProperty__Group__7 )
            // InternalUtilParser.g:1883:2: rule__VersionOperatingSystemProperty__Group__6__Impl rule__VersionOperatingSystemProperty__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__VersionOperatingSystemProperty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__6"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__6__Impl"
    // InternalUtilParser.g:1890:1: rule__VersionOperatingSystemProperty__Group__6__Impl : ( ( rule__VersionOperatingSystemProperty__KindAssignment_6 ) ) ;
    public final void rule__VersionOperatingSystemProperty__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1894:1: ( ( ( rule__VersionOperatingSystemProperty__KindAssignment_6 ) ) )
            // InternalUtilParser.g:1895:1: ( ( rule__VersionOperatingSystemProperty__KindAssignment_6 ) )
            {
            // InternalUtilParser.g:1895:1: ( ( rule__VersionOperatingSystemProperty__KindAssignment_6 ) )
            // InternalUtilParser.g:1896:2: ( rule__VersionOperatingSystemProperty__KindAssignment_6 )
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAssignment_6());
            // InternalUtilParser.g:1897:2: ( rule__VersionOperatingSystemProperty__KindAssignment_6 )
            // InternalUtilParser.g:1897:3: rule__VersionOperatingSystemProperty__KindAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__KindAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAssignment_6());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__6__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__7"
    // InternalUtilParser.g:1905:1: rule__VersionOperatingSystemProperty__Group__7 : rule__VersionOperatingSystemProperty__Group__7__Impl rule__VersionOperatingSystemProperty__Group__8 ;
    public final void rule__VersionOperatingSystemProperty__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1909:1: ( rule__VersionOperatingSystemProperty__Group__7__Impl rule__VersionOperatingSystemProperty__Group__8 )
            // InternalUtilParser.g:1910:2: rule__VersionOperatingSystemProperty__Group__7__Impl rule__VersionOperatingSystemProperty__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__VersionOperatingSystemProperty__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__7"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__7__Impl"
    // InternalUtilParser.g:1917:1: rule__VersionOperatingSystemProperty__Group__7__Impl : ( ( rule__VersionOperatingSystemProperty__Group_7__0 )? ) ;
    public final void rule__VersionOperatingSystemProperty__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1921:1: ( ( ( rule__VersionOperatingSystemProperty__Group_7__0 )? ) )
            // InternalUtilParser.g:1922:1: ( ( rule__VersionOperatingSystemProperty__Group_7__0 )? )
            {
            // InternalUtilParser.g:1922:1: ( ( rule__VersionOperatingSystemProperty__Group_7__0 )? )
            // InternalUtilParser.g:1923:2: ( rule__VersionOperatingSystemProperty__Group_7__0 )?
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup_7());
            // InternalUtilParser.g:1924:2: ( rule__VersionOperatingSystemProperty__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Description) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUtilParser.g:1924:3: rule__VersionOperatingSystemProperty__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VersionOperatingSystemProperty__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup_7());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__7__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__8"
    // InternalUtilParser.g:1932:1: rule__VersionOperatingSystemProperty__Group__8 : rule__VersionOperatingSystemProperty__Group__8__Impl rule__VersionOperatingSystemProperty__Group__9 ;
    public final void rule__VersionOperatingSystemProperty__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1936:1: ( rule__VersionOperatingSystemProperty__Group__8__Impl rule__VersionOperatingSystemProperty__Group__9 )
            // InternalUtilParser.g:1937:2: rule__VersionOperatingSystemProperty__Group__8__Impl rule__VersionOperatingSystemProperty__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__VersionOperatingSystemProperty__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__8"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__8__Impl"
    // InternalUtilParser.g:1944:1: rule__VersionOperatingSystemProperty__Group__8__Impl : ( ( rule__VersionOperatingSystemProperty__Group_8__0 )? ) ;
    public final void rule__VersionOperatingSystemProperty__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1948:1: ( ( ( rule__VersionOperatingSystemProperty__Group_8__0 )? ) )
            // InternalUtilParser.g:1949:1: ( ( rule__VersionOperatingSystemProperty__Group_8__0 )? )
            {
            // InternalUtilParser.g:1949:1: ( ( rule__VersionOperatingSystemProperty__Group_8__0 )? )
            // InternalUtilParser.g:1950:2: ( rule__VersionOperatingSystemProperty__Group_8__0 )?
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup_8());
            // InternalUtilParser.g:1951:2: ( rule__VersionOperatingSystemProperty__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Value) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUtilParser.g:1951:3: rule__VersionOperatingSystemProperty__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VersionOperatingSystemProperty__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getGroup_8());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__8__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__9"
    // InternalUtilParser.g:1959:1: rule__VersionOperatingSystemProperty__Group__9 : rule__VersionOperatingSystemProperty__Group__9__Impl ;
    public final void rule__VersionOperatingSystemProperty__Group__9() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1963:1: ( rule__VersionOperatingSystemProperty__Group__9__Impl )
            // InternalUtilParser.g:1964:2: rule__VersionOperatingSystemProperty__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__9"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group__9__Impl"
    // InternalUtilParser.g:1970:1: rule__VersionOperatingSystemProperty__Group__9__Impl : ( RULE_DEDENT ) ;
    public final void rule__VersionOperatingSystemProperty__Group__9__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1974:1: ( ( RULE_DEDENT ) )
            // InternalUtilParser.g:1975:1: ( RULE_DEDENT )
            {
            // InternalUtilParser.g:1975:1: ( RULE_DEDENT )
            // InternalUtilParser.g:1976:2: RULE_DEDENT
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getDEDENTTerminalRuleCall_9());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getDEDENTTerminalRuleCall_9());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group__9__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group_7__0"
    // InternalUtilParser.g:1986:1: rule__VersionOperatingSystemProperty__Group_7__0 : rule__VersionOperatingSystemProperty__Group_7__0__Impl rule__VersionOperatingSystemProperty__Group_7__1 ;
    public final void rule__VersionOperatingSystemProperty__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:1990:1: ( rule__VersionOperatingSystemProperty__Group_7__0__Impl rule__VersionOperatingSystemProperty__Group_7__1 )
            // InternalUtilParser.g:1991:2: rule__VersionOperatingSystemProperty__Group_7__0__Impl rule__VersionOperatingSystemProperty__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__VersionOperatingSystemProperty__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group_7__0"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group_7__0__Impl"
    // InternalUtilParser.g:1998:1: rule__VersionOperatingSystemProperty__Group_7__0__Impl : ( Description ) ;
    public final void rule__VersionOperatingSystemProperty__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2002:1: ( ( Description ) )
            // InternalUtilParser.g:2003:1: ( Description )
            {
            // InternalUtilParser.g:2003:1: ( Description )
            // InternalUtilParser.g:2004:2: Description
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());
            match(input,Description,FOLLOW_2);
             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group_7__0__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group_7__1"
    // InternalUtilParser.g:2013:1: rule__VersionOperatingSystemProperty__Group_7__1 : rule__VersionOperatingSystemProperty__Group_7__1__Impl ;
    public final void rule__VersionOperatingSystemProperty__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2017:1: ( rule__VersionOperatingSystemProperty__Group_7__1__Impl )
            // InternalUtilParser.g:2018:2: rule__VersionOperatingSystemProperty__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group_7__1"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group_7__1__Impl"
    // InternalUtilParser.g:2024:1: rule__VersionOperatingSystemProperty__Group_7__1__Impl : ( ( rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1 ) ) ;
    public final void rule__VersionOperatingSystemProperty__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2028:1: ( ( ( rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1 ) ) )
            // InternalUtilParser.g:2029:1: ( ( rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1 ) )
            {
            // InternalUtilParser.g:2029:1: ( ( rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1 ) )
            // InternalUtilParser.g:2030:2: ( rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionAssignment_7_1());
            // InternalUtilParser.g:2031:2: ( rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1 )
            // InternalUtilParser.g:2031:3: rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionAssignment_7_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group_7__1__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group_8__0"
    // InternalUtilParser.g:2040:1: rule__VersionOperatingSystemProperty__Group_8__0 : rule__VersionOperatingSystemProperty__Group_8__0__Impl rule__VersionOperatingSystemProperty__Group_8__1 ;
    public final void rule__VersionOperatingSystemProperty__Group_8__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2044:1: ( rule__VersionOperatingSystemProperty__Group_8__0__Impl rule__VersionOperatingSystemProperty__Group_8__1 )
            // InternalUtilParser.g:2045:2: rule__VersionOperatingSystemProperty__Group_8__0__Impl rule__VersionOperatingSystemProperty__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__VersionOperatingSystemProperty__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group_8__0"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group_8__0__Impl"
    // InternalUtilParser.g:2052:1: rule__VersionOperatingSystemProperty__Group_8__0__Impl : ( Value ) ;
    public final void rule__VersionOperatingSystemProperty__Group_8__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2056:1: ( ( Value ) )
            // InternalUtilParser.g:2057:1: ( Value )
            {
            // InternalUtilParser.g:2057:1: ( Value )
            // InternalUtilParser.g:2058:2: Value
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());
            match(input,Value,FOLLOW_2);
             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group_8__0__Impl"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group_8__1"
    // InternalUtilParser.g:2067:1: rule__VersionOperatingSystemProperty__Group_8__1 : rule__VersionOperatingSystemProperty__Group_8__1__Impl ;
    public final void rule__VersionOperatingSystemProperty__Group_8__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2071:1: ( rule__VersionOperatingSystemProperty__Group_8__1__Impl )
            // InternalUtilParser.g:2072:2: rule__VersionOperatingSystemProperty__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group_8__1"


    // $ANTLR start "rule__VersionOperatingSystemProperty__Group_8__1__Impl"
    // InternalUtilParser.g:2078:1: rule__VersionOperatingSystemProperty__Group_8__1__Impl : ( ( rule__VersionOperatingSystemProperty__ValueAssignment_8_1 ) ) ;
    public final void rule__VersionOperatingSystemProperty__Group_8__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2082:1: ( ( ( rule__VersionOperatingSystemProperty__ValueAssignment_8_1 ) ) )
            // InternalUtilParser.g:2083:1: ( ( rule__VersionOperatingSystemProperty__ValueAssignment_8_1 ) )
            {
            // InternalUtilParser.g:2083:1: ( ( rule__VersionOperatingSystemProperty__ValueAssignment_8_1 ) )
            // InternalUtilParser.g:2084:2: ( rule__VersionOperatingSystemProperty__ValueAssignment_8_1 )
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getValueAssignment_8_1());
            // InternalUtilParser.g:2085:2: ( rule__VersionOperatingSystemProperty__ValueAssignment_8_1 )
            // InternalUtilParser.g:2085:3: rule__VersionOperatingSystemProperty__ValueAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__VersionOperatingSystemProperty__ValueAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getValueAssignment_8_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__Group_8__1__Impl"


    // $ANTLR start "rule__PropertyAttribute__Group__0"
    // InternalUtilParser.g:2094:1: rule__PropertyAttribute__Group__0 : rule__PropertyAttribute__Group__0__Impl rule__PropertyAttribute__Group__1 ;
    public final void rule__PropertyAttribute__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2098:1: ( rule__PropertyAttribute__Group__0__Impl rule__PropertyAttribute__Group__1 )
            // InternalUtilParser.g:2099:2: rule__PropertyAttribute__Group__0__Impl rule__PropertyAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUtilParser.g:2106:1: rule__PropertyAttribute__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyAttribute__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2110:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:2111:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:2111:1: ( rulePreListElement )
            // InternalUtilParser.g:2112:2: rulePreListElement
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
    // InternalUtilParser.g:2121:1: rule__PropertyAttribute__Group__1 : rule__PropertyAttribute__Group__1__Impl rule__PropertyAttribute__Group__2 ;
    public final void rule__PropertyAttribute__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2125:1: ( rule__PropertyAttribute__Group__1__Impl rule__PropertyAttribute__Group__2 )
            // InternalUtilParser.g:2126:2: rule__PropertyAttribute__Group__1__Impl rule__PropertyAttribute__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:2133:1: rule__PropertyAttribute__Group__1__Impl : ( Name ) ;
    public final void rule__PropertyAttribute__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2137:1: ( ( Name ) )
            // InternalUtilParser.g:2138:1: ( Name )
            {
            // InternalUtilParser.g:2138:1: ( Name )
            // InternalUtilParser.g:2139:2: Name
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
    // InternalUtilParser.g:2148:1: rule__PropertyAttribute__Group__2 : rule__PropertyAttribute__Group__2__Impl rule__PropertyAttribute__Group__3 ;
    public final void rule__PropertyAttribute__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2152:1: ( rule__PropertyAttribute__Group__2__Impl rule__PropertyAttribute__Group__3 )
            // InternalUtilParser.g:2153:2: rule__PropertyAttribute__Group__2__Impl rule__PropertyAttribute__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalUtilParser.g:2160:1: rule__PropertyAttribute__Group__2__Impl : ( ( rule__PropertyAttribute__NameAssignment_2 ) ) ;
    public final void rule__PropertyAttribute__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2164:1: ( ( ( rule__PropertyAttribute__NameAssignment_2 ) ) )
            // InternalUtilParser.g:2165:1: ( ( rule__PropertyAttribute__NameAssignment_2 ) )
            {
            // InternalUtilParser.g:2165:1: ( ( rule__PropertyAttribute__NameAssignment_2 ) )
            // InternalUtilParser.g:2166:2: ( rule__PropertyAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getNameAssignment_2());
            // InternalUtilParser.g:2167:2: ( rule__PropertyAttribute__NameAssignment_2 )
            // InternalUtilParser.g:2167:3: rule__PropertyAttribute__NameAssignment_2
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
    // InternalUtilParser.g:2175:1: rule__PropertyAttribute__Group__3 : rule__PropertyAttribute__Group__3__Impl rule__PropertyAttribute__Group__4 ;
    public final void rule__PropertyAttribute__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2179:1: ( rule__PropertyAttribute__Group__3__Impl rule__PropertyAttribute__Group__4 )
            // InternalUtilParser.g:2180:2: rule__PropertyAttribute__Group__3__Impl rule__PropertyAttribute__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUtilParser.g:2187:1: rule__PropertyAttribute__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyAttribute__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2191:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:2192:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:2192:1: ( RULE_INDENT )
            // InternalUtilParser.g:2193:2: RULE_INDENT
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
    // InternalUtilParser.g:2202:1: rule__PropertyAttribute__Group__4 : rule__PropertyAttribute__Group__4__Impl rule__PropertyAttribute__Group__5 ;
    public final void rule__PropertyAttribute__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2206:1: ( rule__PropertyAttribute__Group__4__Impl rule__PropertyAttribute__Group__5 )
            // InternalUtilParser.g:2207:2: rule__PropertyAttribute__Group__4__Impl rule__PropertyAttribute__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalUtilParser.g:2214:1: rule__PropertyAttribute__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertyAttribute__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2218:1: ( ( Kind ) )
            // InternalUtilParser.g:2219:1: ( Kind )
            {
            // InternalUtilParser.g:2219:1: ( Kind )
            // InternalUtilParser.g:2220:2: Kind
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
    // InternalUtilParser.g:2229:1: rule__PropertyAttribute__Group__5 : rule__PropertyAttribute__Group__5__Impl rule__PropertyAttribute__Group__6 ;
    public final void rule__PropertyAttribute__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2233:1: ( rule__PropertyAttribute__Group__5__Impl rule__PropertyAttribute__Group__6 )
            // InternalUtilParser.g:2234:2: rule__PropertyAttribute__Group__5__Impl rule__PropertyAttribute__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:2241:1: rule__PropertyAttribute__Group__5__Impl : ( ( rule__PropertyAttribute__KindAssignment_5 ) ) ;
    public final void rule__PropertyAttribute__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2245:1: ( ( ( rule__PropertyAttribute__KindAssignment_5 ) ) )
            // InternalUtilParser.g:2246:1: ( ( rule__PropertyAttribute__KindAssignment_5 ) )
            {
            // InternalUtilParser.g:2246:1: ( ( rule__PropertyAttribute__KindAssignment_5 ) )
            // InternalUtilParser.g:2247:2: ( rule__PropertyAttribute__KindAssignment_5 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getKindAssignment_5());
            // InternalUtilParser.g:2248:2: ( rule__PropertyAttribute__KindAssignment_5 )
            // InternalUtilParser.g:2248:3: rule__PropertyAttribute__KindAssignment_5
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
    // InternalUtilParser.g:2256:1: rule__PropertyAttribute__Group__6 : rule__PropertyAttribute__Group__6__Impl rule__PropertyAttribute__Group__7 ;
    public final void rule__PropertyAttribute__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2260:1: ( rule__PropertyAttribute__Group__6__Impl rule__PropertyAttribute__Group__7 )
            // InternalUtilParser.g:2261:2: rule__PropertyAttribute__Group__6__Impl rule__PropertyAttribute__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:2268:1: rule__PropertyAttribute__Group__6__Impl : ( ( rule__PropertyAttribute__Group_6__0 )? ) ;
    public final void rule__PropertyAttribute__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2272:1: ( ( ( rule__PropertyAttribute__Group_6__0 )? ) )
            // InternalUtilParser.g:2273:1: ( ( rule__PropertyAttribute__Group_6__0 )? )
            {
            // InternalUtilParser.g:2273:1: ( ( rule__PropertyAttribute__Group_6__0 )? )
            // InternalUtilParser.g:2274:2: ( rule__PropertyAttribute__Group_6__0 )?
            {
             before(grammarAccess.getPropertyAttributeAccess().getGroup_6());
            // InternalUtilParser.g:2275:2: ( rule__PropertyAttribute__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Description) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUtilParser.g:2275:3: rule__PropertyAttribute__Group_6__0
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
    // InternalUtilParser.g:2283:1: rule__PropertyAttribute__Group__7 : rule__PropertyAttribute__Group__7__Impl rule__PropertyAttribute__Group__8 ;
    public final void rule__PropertyAttribute__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2287:1: ( rule__PropertyAttribute__Group__7__Impl rule__PropertyAttribute__Group__8 )
            // InternalUtilParser.g:2288:2: rule__PropertyAttribute__Group__7__Impl rule__PropertyAttribute__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:2295:1: rule__PropertyAttribute__Group__7__Impl : ( ( rule__PropertyAttribute__Group_7__0 )? ) ;
    public final void rule__PropertyAttribute__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2299:1: ( ( ( rule__PropertyAttribute__Group_7__0 )? ) )
            // InternalUtilParser.g:2300:1: ( ( rule__PropertyAttribute__Group_7__0 )? )
            {
            // InternalUtilParser.g:2300:1: ( ( rule__PropertyAttribute__Group_7__0 )? )
            // InternalUtilParser.g:2301:2: ( rule__PropertyAttribute__Group_7__0 )?
            {
             before(grammarAccess.getPropertyAttributeAccess().getGroup_7());
            // InternalUtilParser.g:2302:2: ( rule__PropertyAttribute__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Value) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUtilParser.g:2302:3: rule__PropertyAttribute__Group_7__0
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
    // InternalUtilParser.g:2310:1: rule__PropertyAttribute__Group__8 : rule__PropertyAttribute__Group__8__Impl ;
    public final void rule__PropertyAttribute__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2314:1: ( rule__PropertyAttribute__Group__8__Impl )
            // InternalUtilParser.g:2315:2: rule__PropertyAttribute__Group__8__Impl
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
    // InternalUtilParser.g:2321:1: rule__PropertyAttribute__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertyAttribute__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2325:1: ( ( ( RULE_DEDENT )? ) )
            // InternalUtilParser.g:2326:1: ( ( RULE_DEDENT )? )
            {
            // InternalUtilParser.g:2326:1: ( ( RULE_DEDENT )? )
            // InternalUtilParser.g:2327:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertyAttributeAccess().getDEDENTTerminalRuleCall_8());
            // InternalUtilParser.g:2328:2: ( RULE_DEDENT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DEDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUtilParser.g:2328:3: RULE_DEDENT
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
    // InternalUtilParser.g:2337:1: rule__PropertyAttribute__Group_6__0 : rule__PropertyAttribute__Group_6__0__Impl rule__PropertyAttribute__Group_6__1 ;
    public final void rule__PropertyAttribute__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2341:1: ( rule__PropertyAttribute__Group_6__0__Impl rule__PropertyAttribute__Group_6__1 )
            // InternalUtilParser.g:2342:2: rule__PropertyAttribute__Group_6__0__Impl rule__PropertyAttribute__Group_6__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:2349:1: rule__PropertyAttribute__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertyAttribute__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2353:1: ( ( Description ) )
            // InternalUtilParser.g:2354:1: ( Description )
            {
            // InternalUtilParser.g:2354:1: ( Description )
            // InternalUtilParser.g:2355:2: Description
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
    // InternalUtilParser.g:2364:1: rule__PropertyAttribute__Group_6__1 : rule__PropertyAttribute__Group_6__1__Impl ;
    public final void rule__PropertyAttribute__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2368:1: ( rule__PropertyAttribute__Group_6__1__Impl )
            // InternalUtilParser.g:2369:2: rule__PropertyAttribute__Group_6__1__Impl
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
    // InternalUtilParser.g:2375:1: rule__PropertyAttribute__Group_6__1__Impl : ( ( rule__PropertyAttribute__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertyAttribute__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2379:1: ( ( ( rule__PropertyAttribute__DescriptionAssignment_6_1 ) ) )
            // InternalUtilParser.g:2380:1: ( ( rule__PropertyAttribute__DescriptionAssignment_6_1 ) )
            {
            // InternalUtilParser.g:2380:1: ( ( rule__PropertyAttribute__DescriptionAssignment_6_1 ) )
            // InternalUtilParser.g:2381:2: ( rule__PropertyAttribute__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getDescriptionAssignment_6_1());
            // InternalUtilParser.g:2382:2: ( rule__PropertyAttribute__DescriptionAssignment_6_1 )
            // InternalUtilParser.g:2382:3: rule__PropertyAttribute__DescriptionAssignment_6_1
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
    // InternalUtilParser.g:2391:1: rule__PropertyAttribute__Group_7__0 : rule__PropertyAttribute__Group_7__0__Impl rule__PropertyAttribute__Group_7__1 ;
    public final void rule__PropertyAttribute__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2395:1: ( rule__PropertyAttribute__Group_7__0__Impl rule__PropertyAttribute__Group_7__1 )
            // InternalUtilParser.g:2396:2: rule__PropertyAttribute__Group_7__0__Impl rule__PropertyAttribute__Group_7__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUtilParser.g:2403:1: rule__PropertyAttribute__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertyAttribute__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2407:1: ( ( Value ) )
            // InternalUtilParser.g:2408:1: ( Value )
            {
            // InternalUtilParser.g:2408:1: ( Value )
            // InternalUtilParser.g:2409:2: Value
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
    // InternalUtilParser.g:2418:1: rule__PropertyAttribute__Group_7__1 : rule__PropertyAttribute__Group_7__1__Impl ;
    public final void rule__PropertyAttribute__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2422:1: ( rule__PropertyAttribute__Group_7__1__Impl )
            // InternalUtilParser.g:2423:2: rule__PropertyAttribute__Group_7__1__Impl
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
    // InternalUtilParser.g:2429:1: rule__PropertyAttribute__Group_7__1__Impl : ( ( rule__PropertyAttribute__ValueAssignment_7_1 ) ) ;
    public final void rule__PropertyAttribute__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2433:1: ( ( ( rule__PropertyAttribute__ValueAssignment_7_1 ) ) )
            // InternalUtilParser.g:2434:1: ( ( rule__PropertyAttribute__ValueAssignment_7_1 ) )
            {
            // InternalUtilParser.g:2434:1: ( ( rule__PropertyAttribute__ValueAssignment_7_1 ) )
            // InternalUtilParser.g:2435:2: ( rule__PropertyAttribute__ValueAssignment_7_1 )
            {
             before(grammarAccess.getPropertyAttributeAccess().getValueAssignment_7_1());
            // InternalUtilParser.g:2436:2: ( rule__PropertyAttribute__ValueAssignment_7_1 )
            // InternalUtilParser.g:2436:3: rule__PropertyAttribute__ValueAssignment_7_1
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
    // InternalUtilParser.g:2445:1: rule__PropertyMaximun__Group__0 : rule__PropertyMaximun__Group__0__Impl rule__PropertyMaximun__Group__1 ;
    public final void rule__PropertyMaximun__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2449:1: ( rule__PropertyMaximun__Group__0__Impl rule__PropertyMaximun__Group__1 )
            // InternalUtilParser.g:2450:2: rule__PropertyMaximun__Group__0__Impl rule__PropertyMaximun__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUtilParser.g:2457:1: rule__PropertyMaximun__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyMaximun__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2461:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:2462:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:2462:1: ( rulePreListElement )
            // InternalUtilParser.g:2463:2: rulePreListElement
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
    // InternalUtilParser.g:2472:1: rule__PropertyMaximun__Group__1 : rule__PropertyMaximun__Group__1__Impl rule__PropertyMaximun__Group__2 ;
    public final void rule__PropertyMaximun__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2476:1: ( rule__PropertyMaximun__Group__1__Impl rule__PropertyMaximun__Group__2 )
            // InternalUtilParser.g:2477:2: rule__PropertyMaximun__Group__1__Impl rule__PropertyMaximun__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:2484:1: rule__PropertyMaximun__Group__1__Impl : ( Name ) ;
    public final void rule__PropertyMaximun__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2488:1: ( ( Name ) )
            // InternalUtilParser.g:2489:1: ( Name )
            {
            // InternalUtilParser.g:2489:1: ( Name )
            // InternalUtilParser.g:2490:2: Name
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
    // InternalUtilParser.g:2499:1: rule__PropertyMaximun__Group__2 : rule__PropertyMaximun__Group__2__Impl rule__PropertyMaximun__Group__3 ;
    public final void rule__PropertyMaximun__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2503:1: ( rule__PropertyMaximun__Group__2__Impl rule__PropertyMaximun__Group__3 )
            // InternalUtilParser.g:2504:2: rule__PropertyMaximun__Group__2__Impl rule__PropertyMaximun__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalUtilParser.g:2511:1: rule__PropertyMaximun__Group__2__Impl : ( ( rule__PropertyMaximun__NameAssignment_2 ) ) ;
    public final void rule__PropertyMaximun__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2515:1: ( ( ( rule__PropertyMaximun__NameAssignment_2 ) ) )
            // InternalUtilParser.g:2516:1: ( ( rule__PropertyMaximun__NameAssignment_2 ) )
            {
            // InternalUtilParser.g:2516:1: ( ( rule__PropertyMaximun__NameAssignment_2 ) )
            // InternalUtilParser.g:2517:2: ( rule__PropertyMaximun__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getNameAssignment_2());
            // InternalUtilParser.g:2518:2: ( rule__PropertyMaximun__NameAssignment_2 )
            // InternalUtilParser.g:2518:3: rule__PropertyMaximun__NameAssignment_2
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
    // InternalUtilParser.g:2526:1: rule__PropertyMaximun__Group__3 : rule__PropertyMaximun__Group__3__Impl rule__PropertyMaximun__Group__4 ;
    public final void rule__PropertyMaximun__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2530:1: ( rule__PropertyMaximun__Group__3__Impl rule__PropertyMaximun__Group__4 )
            // InternalUtilParser.g:2531:2: rule__PropertyMaximun__Group__3__Impl rule__PropertyMaximun__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUtilParser.g:2538:1: rule__PropertyMaximun__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyMaximun__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2542:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:2543:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:2543:1: ( RULE_INDENT )
            // InternalUtilParser.g:2544:2: RULE_INDENT
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
    // InternalUtilParser.g:2553:1: rule__PropertyMaximun__Group__4 : rule__PropertyMaximun__Group__4__Impl rule__PropertyMaximun__Group__5 ;
    public final void rule__PropertyMaximun__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2557:1: ( rule__PropertyMaximun__Group__4__Impl rule__PropertyMaximun__Group__5 )
            // InternalUtilParser.g:2558:2: rule__PropertyMaximun__Group__4__Impl rule__PropertyMaximun__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalUtilParser.g:2565:1: rule__PropertyMaximun__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertyMaximun__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2569:1: ( ( Kind ) )
            // InternalUtilParser.g:2570:1: ( Kind )
            {
            // InternalUtilParser.g:2570:1: ( Kind )
            // InternalUtilParser.g:2571:2: Kind
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
    // InternalUtilParser.g:2580:1: rule__PropertyMaximun__Group__5 : rule__PropertyMaximun__Group__5__Impl rule__PropertyMaximun__Group__6 ;
    public final void rule__PropertyMaximun__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2584:1: ( rule__PropertyMaximun__Group__5__Impl rule__PropertyMaximun__Group__6 )
            // InternalUtilParser.g:2585:2: rule__PropertyMaximun__Group__5__Impl rule__PropertyMaximun__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:2592:1: rule__PropertyMaximun__Group__5__Impl : ( ( rule__PropertyMaximun__KindAssignment_5 ) ) ;
    public final void rule__PropertyMaximun__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2596:1: ( ( ( rule__PropertyMaximun__KindAssignment_5 ) ) )
            // InternalUtilParser.g:2597:1: ( ( rule__PropertyMaximun__KindAssignment_5 ) )
            {
            // InternalUtilParser.g:2597:1: ( ( rule__PropertyMaximun__KindAssignment_5 ) )
            // InternalUtilParser.g:2598:2: ( rule__PropertyMaximun__KindAssignment_5 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getKindAssignment_5());
            // InternalUtilParser.g:2599:2: ( rule__PropertyMaximun__KindAssignment_5 )
            // InternalUtilParser.g:2599:3: rule__PropertyMaximun__KindAssignment_5
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
    // InternalUtilParser.g:2607:1: rule__PropertyMaximun__Group__6 : rule__PropertyMaximun__Group__6__Impl rule__PropertyMaximun__Group__7 ;
    public final void rule__PropertyMaximun__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2611:1: ( rule__PropertyMaximun__Group__6__Impl rule__PropertyMaximun__Group__7 )
            // InternalUtilParser.g:2612:2: rule__PropertyMaximun__Group__6__Impl rule__PropertyMaximun__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:2619:1: rule__PropertyMaximun__Group__6__Impl : ( ( rule__PropertyMaximun__Group_6__0 )? ) ;
    public final void rule__PropertyMaximun__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2623:1: ( ( ( rule__PropertyMaximun__Group_6__0 )? ) )
            // InternalUtilParser.g:2624:1: ( ( rule__PropertyMaximun__Group_6__0 )? )
            {
            // InternalUtilParser.g:2624:1: ( ( rule__PropertyMaximun__Group_6__0 )? )
            // InternalUtilParser.g:2625:2: ( rule__PropertyMaximun__Group_6__0 )?
            {
             before(grammarAccess.getPropertyMaximunAccess().getGroup_6());
            // InternalUtilParser.g:2626:2: ( rule__PropertyMaximun__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Description) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUtilParser.g:2626:3: rule__PropertyMaximun__Group_6__0
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
    // InternalUtilParser.g:2634:1: rule__PropertyMaximun__Group__7 : rule__PropertyMaximun__Group__7__Impl rule__PropertyMaximun__Group__8 ;
    public final void rule__PropertyMaximun__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2638:1: ( rule__PropertyMaximun__Group__7__Impl rule__PropertyMaximun__Group__8 )
            // InternalUtilParser.g:2639:2: rule__PropertyMaximun__Group__7__Impl rule__PropertyMaximun__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:2646:1: rule__PropertyMaximun__Group__7__Impl : ( ( rule__PropertyMaximun__Group_7__0 )? ) ;
    public final void rule__PropertyMaximun__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2650:1: ( ( ( rule__PropertyMaximun__Group_7__0 )? ) )
            // InternalUtilParser.g:2651:1: ( ( rule__PropertyMaximun__Group_7__0 )? )
            {
            // InternalUtilParser.g:2651:1: ( ( rule__PropertyMaximun__Group_7__0 )? )
            // InternalUtilParser.g:2652:2: ( rule__PropertyMaximun__Group_7__0 )?
            {
             before(grammarAccess.getPropertyMaximunAccess().getGroup_7());
            // InternalUtilParser.g:2653:2: ( rule__PropertyMaximun__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Value) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUtilParser.g:2653:3: rule__PropertyMaximun__Group_7__0
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
    // InternalUtilParser.g:2661:1: rule__PropertyMaximun__Group__8 : rule__PropertyMaximun__Group__8__Impl ;
    public final void rule__PropertyMaximun__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2665:1: ( rule__PropertyMaximun__Group__8__Impl )
            // InternalUtilParser.g:2666:2: rule__PropertyMaximun__Group__8__Impl
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
    // InternalUtilParser.g:2672:1: rule__PropertyMaximun__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertyMaximun__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2676:1: ( ( ( RULE_DEDENT )? ) )
            // InternalUtilParser.g:2677:1: ( ( RULE_DEDENT )? )
            {
            // InternalUtilParser.g:2677:1: ( ( RULE_DEDENT )? )
            // InternalUtilParser.g:2678:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertyMaximunAccess().getDEDENTTerminalRuleCall_8());
            // InternalUtilParser.g:2679:2: ( RULE_DEDENT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DEDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUtilParser.g:2679:3: RULE_DEDENT
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
    // InternalUtilParser.g:2688:1: rule__PropertyMaximun__Group_6__0 : rule__PropertyMaximun__Group_6__0__Impl rule__PropertyMaximun__Group_6__1 ;
    public final void rule__PropertyMaximun__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2692:1: ( rule__PropertyMaximun__Group_6__0__Impl rule__PropertyMaximun__Group_6__1 )
            // InternalUtilParser.g:2693:2: rule__PropertyMaximun__Group_6__0__Impl rule__PropertyMaximun__Group_6__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:2700:1: rule__PropertyMaximun__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertyMaximun__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2704:1: ( ( Description ) )
            // InternalUtilParser.g:2705:1: ( Description )
            {
            // InternalUtilParser.g:2705:1: ( Description )
            // InternalUtilParser.g:2706:2: Description
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
    // InternalUtilParser.g:2715:1: rule__PropertyMaximun__Group_6__1 : rule__PropertyMaximun__Group_6__1__Impl ;
    public final void rule__PropertyMaximun__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2719:1: ( rule__PropertyMaximun__Group_6__1__Impl )
            // InternalUtilParser.g:2720:2: rule__PropertyMaximun__Group_6__1__Impl
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
    // InternalUtilParser.g:2726:1: rule__PropertyMaximun__Group_6__1__Impl : ( ( rule__PropertyMaximun__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertyMaximun__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2730:1: ( ( ( rule__PropertyMaximun__DescriptionAssignment_6_1 ) ) )
            // InternalUtilParser.g:2731:1: ( ( rule__PropertyMaximun__DescriptionAssignment_6_1 ) )
            {
            // InternalUtilParser.g:2731:1: ( ( rule__PropertyMaximun__DescriptionAssignment_6_1 ) )
            // InternalUtilParser.g:2732:2: ( rule__PropertyMaximun__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getDescriptionAssignment_6_1());
            // InternalUtilParser.g:2733:2: ( rule__PropertyMaximun__DescriptionAssignment_6_1 )
            // InternalUtilParser.g:2733:3: rule__PropertyMaximun__DescriptionAssignment_6_1
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
    // InternalUtilParser.g:2742:1: rule__PropertyMaximun__Group_7__0 : rule__PropertyMaximun__Group_7__0__Impl rule__PropertyMaximun__Group_7__1 ;
    public final void rule__PropertyMaximun__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2746:1: ( rule__PropertyMaximun__Group_7__0__Impl rule__PropertyMaximun__Group_7__1 )
            // InternalUtilParser.g:2747:2: rule__PropertyMaximun__Group_7__0__Impl rule__PropertyMaximun__Group_7__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUtilParser.g:2754:1: rule__PropertyMaximun__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertyMaximun__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2758:1: ( ( Value ) )
            // InternalUtilParser.g:2759:1: ( Value )
            {
            // InternalUtilParser.g:2759:1: ( Value )
            // InternalUtilParser.g:2760:2: Value
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
    // InternalUtilParser.g:2769:1: rule__PropertyMaximun__Group_7__1 : rule__PropertyMaximun__Group_7__1__Impl ;
    public final void rule__PropertyMaximun__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2773:1: ( rule__PropertyMaximun__Group_7__1__Impl )
            // InternalUtilParser.g:2774:2: rule__PropertyMaximun__Group_7__1__Impl
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
    // InternalUtilParser.g:2780:1: rule__PropertyMaximun__Group_7__1__Impl : ( ( rule__PropertyMaximun__ValueAssignment_7_1 ) ) ;
    public final void rule__PropertyMaximun__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2784:1: ( ( ( rule__PropertyMaximun__ValueAssignment_7_1 ) ) )
            // InternalUtilParser.g:2785:1: ( ( rule__PropertyMaximun__ValueAssignment_7_1 ) )
            {
            // InternalUtilParser.g:2785:1: ( ( rule__PropertyMaximun__ValueAssignment_7_1 ) )
            // InternalUtilParser.g:2786:2: ( rule__PropertyMaximun__ValueAssignment_7_1 )
            {
             before(grammarAccess.getPropertyMaximunAccess().getValueAssignment_7_1());
            // InternalUtilParser.g:2787:2: ( rule__PropertyMaximun__ValueAssignment_7_1 )
            // InternalUtilParser.g:2787:3: rule__PropertyMaximun__ValueAssignment_7_1
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
    // InternalUtilParser.g:2796:1: rule__PropertyMinimum__Group__0 : rule__PropertyMinimum__Group__0__Impl rule__PropertyMinimum__Group__1 ;
    public final void rule__PropertyMinimum__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2800:1: ( rule__PropertyMinimum__Group__0__Impl rule__PropertyMinimum__Group__1 )
            // InternalUtilParser.g:2801:2: rule__PropertyMinimum__Group__0__Impl rule__PropertyMinimum__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUtilParser.g:2808:1: rule__PropertyMinimum__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyMinimum__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2812:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:2813:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:2813:1: ( rulePreListElement )
            // InternalUtilParser.g:2814:2: rulePreListElement
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
    // InternalUtilParser.g:2823:1: rule__PropertyMinimum__Group__1 : rule__PropertyMinimum__Group__1__Impl rule__PropertyMinimum__Group__2 ;
    public final void rule__PropertyMinimum__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2827:1: ( rule__PropertyMinimum__Group__1__Impl rule__PropertyMinimum__Group__2 )
            // InternalUtilParser.g:2828:2: rule__PropertyMinimum__Group__1__Impl rule__PropertyMinimum__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:2835:1: rule__PropertyMinimum__Group__1__Impl : ( Name ) ;
    public final void rule__PropertyMinimum__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2839:1: ( ( Name ) )
            // InternalUtilParser.g:2840:1: ( Name )
            {
            // InternalUtilParser.g:2840:1: ( Name )
            // InternalUtilParser.g:2841:2: Name
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
    // InternalUtilParser.g:2850:1: rule__PropertyMinimum__Group__2 : rule__PropertyMinimum__Group__2__Impl rule__PropertyMinimum__Group__3 ;
    public final void rule__PropertyMinimum__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2854:1: ( rule__PropertyMinimum__Group__2__Impl rule__PropertyMinimum__Group__3 )
            // InternalUtilParser.g:2855:2: rule__PropertyMinimum__Group__2__Impl rule__PropertyMinimum__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalUtilParser.g:2862:1: rule__PropertyMinimum__Group__2__Impl : ( ( rule__PropertyMinimum__NameAssignment_2 ) ) ;
    public final void rule__PropertyMinimum__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2866:1: ( ( ( rule__PropertyMinimum__NameAssignment_2 ) ) )
            // InternalUtilParser.g:2867:1: ( ( rule__PropertyMinimum__NameAssignment_2 ) )
            {
            // InternalUtilParser.g:2867:1: ( ( rule__PropertyMinimum__NameAssignment_2 ) )
            // InternalUtilParser.g:2868:2: ( rule__PropertyMinimum__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getNameAssignment_2());
            // InternalUtilParser.g:2869:2: ( rule__PropertyMinimum__NameAssignment_2 )
            // InternalUtilParser.g:2869:3: rule__PropertyMinimum__NameAssignment_2
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
    // InternalUtilParser.g:2877:1: rule__PropertyMinimum__Group__3 : rule__PropertyMinimum__Group__3__Impl rule__PropertyMinimum__Group__4 ;
    public final void rule__PropertyMinimum__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2881:1: ( rule__PropertyMinimum__Group__3__Impl rule__PropertyMinimum__Group__4 )
            // InternalUtilParser.g:2882:2: rule__PropertyMinimum__Group__3__Impl rule__PropertyMinimum__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUtilParser.g:2889:1: rule__PropertyMinimum__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyMinimum__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2893:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:2894:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:2894:1: ( RULE_INDENT )
            // InternalUtilParser.g:2895:2: RULE_INDENT
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
    // InternalUtilParser.g:2904:1: rule__PropertyMinimum__Group__4 : rule__PropertyMinimum__Group__4__Impl rule__PropertyMinimum__Group__5 ;
    public final void rule__PropertyMinimum__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2908:1: ( rule__PropertyMinimum__Group__4__Impl rule__PropertyMinimum__Group__5 )
            // InternalUtilParser.g:2909:2: rule__PropertyMinimum__Group__4__Impl rule__PropertyMinimum__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalUtilParser.g:2916:1: rule__PropertyMinimum__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertyMinimum__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2920:1: ( ( Kind ) )
            // InternalUtilParser.g:2921:1: ( Kind )
            {
            // InternalUtilParser.g:2921:1: ( Kind )
            // InternalUtilParser.g:2922:2: Kind
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
    // InternalUtilParser.g:2931:1: rule__PropertyMinimum__Group__5 : rule__PropertyMinimum__Group__5__Impl rule__PropertyMinimum__Group__6 ;
    public final void rule__PropertyMinimum__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2935:1: ( rule__PropertyMinimum__Group__5__Impl rule__PropertyMinimum__Group__6 )
            // InternalUtilParser.g:2936:2: rule__PropertyMinimum__Group__5__Impl rule__PropertyMinimum__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:2943:1: rule__PropertyMinimum__Group__5__Impl : ( ( rule__PropertyMinimum__KindAssignment_5 ) ) ;
    public final void rule__PropertyMinimum__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2947:1: ( ( ( rule__PropertyMinimum__KindAssignment_5 ) ) )
            // InternalUtilParser.g:2948:1: ( ( rule__PropertyMinimum__KindAssignment_5 ) )
            {
            // InternalUtilParser.g:2948:1: ( ( rule__PropertyMinimum__KindAssignment_5 ) )
            // InternalUtilParser.g:2949:2: ( rule__PropertyMinimum__KindAssignment_5 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getKindAssignment_5());
            // InternalUtilParser.g:2950:2: ( rule__PropertyMinimum__KindAssignment_5 )
            // InternalUtilParser.g:2950:3: rule__PropertyMinimum__KindAssignment_5
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
    // InternalUtilParser.g:2958:1: rule__PropertyMinimum__Group__6 : rule__PropertyMinimum__Group__6__Impl rule__PropertyMinimum__Group__7 ;
    public final void rule__PropertyMinimum__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2962:1: ( rule__PropertyMinimum__Group__6__Impl rule__PropertyMinimum__Group__7 )
            // InternalUtilParser.g:2963:2: rule__PropertyMinimum__Group__6__Impl rule__PropertyMinimum__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:2970:1: rule__PropertyMinimum__Group__6__Impl : ( ( rule__PropertyMinimum__Group_6__0 )? ) ;
    public final void rule__PropertyMinimum__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2974:1: ( ( ( rule__PropertyMinimum__Group_6__0 )? ) )
            // InternalUtilParser.g:2975:1: ( ( rule__PropertyMinimum__Group_6__0 )? )
            {
            // InternalUtilParser.g:2975:1: ( ( rule__PropertyMinimum__Group_6__0 )? )
            // InternalUtilParser.g:2976:2: ( rule__PropertyMinimum__Group_6__0 )?
            {
             before(grammarAccess.getPropertyMinimumAccess().getGroup_6());
            // InternalUtilParser.g:2977:2: ( rule__PropertyMinimum__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Description) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUtilParser.g:2977:3: rule__PropertyMinimum__Group_6__0
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
    // InternalUtilParser.g:2985:1: rule__PropertyMinimum__Group__7 : rule__PropertyMinimum__Group__7__Impl rule__PropertyMinimum__Group__8 ;
    public final void rule__PropertyMinimum__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:2989:1: ( rule__PropertyMinimum__Group__7__Impl rule__PropertyMinimum__Group__8 )
            // InternalUtilParser.g:2990:2: rule__PropertyMinimum__Group__7__Impl rule__PropertyMinimum__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:2997:1: rule__PropertyMinimum__Group__7__Impl : ( ( rule__PropertyMinimum__Group_7__0 )? ) ;
    public final void rule__PropertyMinimum__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3001:1: ( ( ( rule__PropertyMinimum__Group_7__0 )? ) )
            // InternalUtilParser.g:3002:1: ( ( rule__PropertyMinimum__Group_7__0 )? )
            {
            // InternalUtilParser.g:3002:1: ( ( rule__PropertyMinimum__Group_7__0 )? )
            // InternalUtilParser.g:3003:2: ( rule__PropertyMinimum__Group_7__0 )?
            {
             before(grammarAccess.getPropertyMinimumAccess().getGroup_7());
            // InternalUtilParser.g:3004:2: ( rule__PropertyMinimum__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUtilParser.g:3004:3: rule__PropertyMinimum__Group_7__0
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
    // InternalUtilParser.g:3012:1: rule__PropertyMinimum__Group__8 : rule__PropertyMinimum__Group__8__Impl ;
    public final void rule__PropertyMinimum__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3016:1: ( rule__PropertyMinimum__Group__8__Impl )
            // InternalUtilParser.g:3017:2: rule__PropertyMinimum__Group__8__Impl
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
    // InternalUtilParser.g:3023:1: rule__PropertyMinimum__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertyMinimum__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3027:1: ( ( ( RULE_DEDENT )? ) )
            // InternalUtilParser.g:3028:1: ( ( RULE_DEDENT )? )
            {
            // InternalUtilParser.g:3028:1: ( ( RULE_DEDENT )? )
            // InternalUtilParser.g:3029:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertyMinimumAccess().getDEDENTTerminalRuleCall_8());
            // InternalUtilParser.g:3030:2: ( RULE_DEDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DEDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUtilParser.g:3030:3: RULE_DEDENT
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
    // InternalUtilParser.g:3039:1: rule__PropertyMinimum__Group_6__0 : rule__PropertyMinimum__Group_6__0__Impl rule__PropertyMinimum__Group_6__1 ;
    public final void rule__PropertyMinimum__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3043:1: ( rule__PropertyMinimum__Group_6__0__Impl rule__PropertyMinimum__Group_6__1 )
            // InternalUtilParser.g:3044:2: rule__PropertyMinimum__Group_6__0__Impl rule__PropertyMinimum__Group_6__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:3051:1: rule__PropertyMinimum__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertyMinimum__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3055:1: ( ( Description ) )
            // InternalUtilParser.g:3056:1: ( Description )
            {
            // InternalUtilParser.g:3056:1: ( Description )
            // InternalUtilParser.g:3057:2: Description
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
    // InternalUtilParser.g:3066:1: rule__PropertyMinimum__Group_6__1 : rule__PropertyMinimum__Group_6__1__Impl ;
    public final void rule__PropertyMinimum__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3070:1: ( rule__PropertyMinimum__Group_6__1__Impl )
            // InternalUtilParser.g:3071:2: rule__PropertyMinimum__Group_6__1__Impl
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
    // InternalUtilParser.g:3077:1: rule__PropertyMinimum__Group_6__1__Impl : ( ( rule__PropertyMinimum__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertyMinimum__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3081:1: ( ( ( rule__PropertyMinimum__DescriptionAssignment_6_1 ) ) )
            // InternalUtilParser.g:3082:1: ( ( rule__PropertyMinimum__DescriptionAssignment_6_1 ) )
            {
            // InternalUtilParser.g:3082:1: ( ( rule__PropertyMinimum__DescriptionAssignment_6_1 ) )
            // InternalUtilParser.g:3083:2: ( rule__PropertyMinimum__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getDescriptionAssignment_6_1());
            // InternalUtilParser.g:3084:2: ( rule__PropertyMinimum__DescriptionAssignment_6_1 )
            // InternalUtilParser.g:3084:3: rule__PropertyMinimum__DescriptionAssignment_6_1
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
    // InternalUtilParser.g:3093:1: rule__PropertyMinimum__Group_7__0 : rule__PropertyMinimum__Group_7__0__Impl rule__PropertyMinimum__Group_7__1 ;
    public final void rule__PropertyMinimum__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3097:1: ( rule__PropertyMinimum__Group_7__0__Impl rule__PropertyMinimum__Group_7__1 )
            // InternalUtilParser.g:3098:2: rule__PropertyMinimum__Group_7__0__Impl rule__PropertyMinimum__Group_7__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUtilParser.g:3105:1: rule__PropertyMinimum__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertyMinimum__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3109:1: ( ( Value ) )
            // InternalUtilParser.g:3110:1: ( Value )
            {
            // InternalUtilParser.g:3110:1: ( Value )
            // InternalUtilParser.g:3111:2: Value
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
    // InternalUtilParser.g:3120:1: rule__PropertyMinimum__Group_7__1 : rule__PropertyMinimum__Group_7__1__Impl ;
    public final void rule__PropertyMinimum__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3124:1: ( rule__PropertyMinimum__Group_7__1__Impl )
            // InternalUtilParser.g:3125:2: rule__PropertyMinimum__Group_7__1__Impl
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
    // InternalUtilParser.g:3131:1: rule__PropertyMinimum__Group_7__1__Impl : ( ( rule__PropertyMinimum__ValueAssignment_7_1 ) ) ;
    public final void rule__PropertyMinimum__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3135:1: ( ( ( rule__PropertyMinimum__ValueAssignment_7_1 ) ) )
            // InternalUtilParser.g:3136:1: ( ( rule__PropertyMinimum__ValueAssignment_7_1 ) )
            {
            // InternalUtilParser.g:3136:1: ( ( rule__PropertyMinimum__ValueAssignment_7_1 ) )
            // InternalUtilParser.g:3137:2: ( rule__PropertyMinimum__ValueAssignment_7_1 )
            {
             before(grammarAccess.getPropertyMinimumAccess().getValueAssignment_7_1());
            // InternalUtilParser.g:3138:2: ( rule__PropertyMinimum__ValueAssignment_7_1 )
            // InternalUtilParser.g:3138:3: rule__PropertyMinimum__ValueAssignment_7_1
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
    // InternalUtilParser.g:3147:1: rule__PropertySelection__Group__0 : rule__PropertySelection__Group__0__Impl rule__PropertySelection__Group__1 ;
    public final void rule__PropertySelection__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3151:1: ( rule__PropertySelection__Group__0__Impl rule__PropertySelection__Group__1 )
            // InternalUtilParser.g:3152:2: rule__PropertySelection__Group__0__Impl rule__PropertySelection__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUtilParser.g:3159:1: rule__PropertySelection__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertySelection__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3163:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:3164:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:3164:1: ( rulePreListElement )
            // InternalUtilParser.g:3165:2: rulePreListElement
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
    // InternalUtilParser.g:3174:1: rule__PropertySelection__Group__1 : rule__PropertySelection__Group__1__Impl rule__PropertySelection__Group__2 ;
    public final void rule__PropertySelection__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3178:1: ( rule__PropertySelection__Group__1__Impl rule__PropertySelection__Group__2 )
            // InternalUtilParser.g:3179:2: rule__PropertySelection__Group__1__Impl rule__PropertySelection__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:3186:1: rule__PropertySelection__Group__1__Impl : ( Name ) ;
    public final void rule__PropertySelection__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3190:1: ( ( Name ) )
            // InternalUtilParser.g:3191:1: ( Name )
            {
            // InternalUtilParser.g:3191:1: ( Name )
            // InternalUtilParser.g:3192:2: Name
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
    // InternalUtilParser.g:3201:1: rule__PropertySelection__Group__2 : rule__PropertySelection__Group__2__Impl rule__PropertySelection__Group__3 ;
    public final void rule__PropertySelection__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3205:1: ( rule__PropertySelection__Group__2__Impl rule__PropertySelection__Group__3 )
            // InternalUtilParser.g:3206:2: rule__PropertySelection__Group__2__Impl rule__PropertySelection__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalUtilParser.g:3213:1: rule__PropertySelection__Group__2__Impl : ( ( rule__PropertySelection__NameAssignment_2 ) ) ;
    public final void rule__PropertySelection__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3217:1: ( ( ( rule__PropertySelection__NameAssignment_2 ) ) )
            // InternalUtilParser.g:3218:1: ( ( rule__PropertySelection__NameAssignment_2 ) )
            {
            // InternalUtilParser.g:3218:1: ( ( rule__PropertySelection__NameAssignment_2 ) )
            // InternalUtilParser.g:3219:2: ( rule__PropertySelection__NameAssignment_2 )
            {
             before(grammarAccess.getPropertySelectionAccess().getNameAssignment_2());
            // InternalUtilParser.g:3220:2: ( rule__PropertySelection__NameAssignment_2 )
            // InternalUtilParser.g:3220:3: rule__PropertySelection__NameAssignment_2
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
    // InternalUtilParser.g:3228:1: rule__PropertySelection__Group__3 : rule__PropertySelection__Group__3__Impl rule__PropertySelection__Group__4 ;
    public final void rule__PropertySelection__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3232:1: ( rule__PropertySelection__Group__3__Impl rule__PropertySelection__Group__4 )
            // InternalUtilParser.g:3233:2: rule__PropertySelection__Group__3__Impl rule__PropertySelection__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUtilParser.g:3240:1: rule__PropertySelection__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertySelection__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3244:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:3245:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:3245:1: ( RULE_INDENT )
            // InternalUtilParser.g:3246:2: RULE_INDENT
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
    // InternalUtilParser.g:3255:1: rule__PropertySelection__Group__4 : rule__PropertySelection__Group__4__Impl rule__PropertySelection__Group__5 ;
    public final void rule__PropertySelection__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3259:1: ( rule__PropertySelection__Group__4__Impl rule__PropertySelection__Group__5 )
            // InternalUtilParser.g:3260:2: rule__PropertySelection__Group__4__Impl rule__PropertySelection__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalUtilParser.g:3267:1: rule__PropertySelection__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertySelection__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3271:1: ( ( Kind ) )
            // InternalUtilParser.g:3272:1: ( Kind )
            {
            // InternalUtilParser.g:3272:1: ( Kind )
            // InternalUtilParser.g:3273:2: Kind
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
    // InternalUtilParser.g:3282:1: rule__PropertySelection__Group__5 : rule__PropertySelection__Group__5__Impl rule__PropertySelection__Group__6 ;
    public final void rule__PropertySelection__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3286:1: ( rule__PropertySelection__Group__5__Impl rule__PropertySelection__Group__6 )
            // InternalUtilParser.g:3287:2: rule__PropertySelection__Group__5__Impl rule__PropertySelection__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:3294:1: rule__PropertySelection__Group__5__Impl : ( ( rule__PropertySelection__KindAssignment_5 ) ) ;
    public final void rule__PropertySelection__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3298:1: ( ( ( rule__PropertySelection__KindAssignment_5 ) ) )
            // InternalUtilParser.g:3299:1: ( ( rule__PropertySelection__KindAssignment_5 ) )
            {
            // InternalUtilParser.g:3299:1: ( ( rule__PropertySelection__KindAssignment_5 ) )
            // InternalUtilParser.g:3300:2: ( rule__PropertySelection__KindAssignment_5 )
            {
             before(grammarAccess.getPropertySelectionAccess().getKindAssignment_5());
            // InternalUtilParser.g:3301:2: ( rule__PropertySelection__KindAssignment_5 )
            // InternalUtilParser.g:3301:3: rule__PropertySelection__KindAssignment_5
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
    // InternalUtilParser.g:3309:1: rule__PropertySelection__Group__6 : rule__PropertySelection__Group__6__Impl rule__PropertySelection__Group__7 ;
    public final void rule__PropertySelection__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3313:1: ( rule__PropertySelection__Group__6__Impl rule__PropertySelection__Group__7 )
            // InternalUtilParser.g:3314:2: rule__PropertySelection__Group__6__Impl rule__PropertySelection__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:3321:1: rule__PropertySelection__Group__6__Impl : ( ( rule__PropertySelection__Group_6__0 )? ) ;
    public final void rule__PropertySelection__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3325:1: ( ( ( rule__PropertySelection__Group_6__0 )? ) )
            // InternalUtilParser.g:3326:1: ( ( rule__PropertySelection__Group_6__0 )? )
            {
            // InternalUtilParser.g:3326:1: ( ( rule__PropertySelection__Group_6__0 )? )
            // InternalUtilParser.g:3327:2: ( rule__PropertySelection__Group_6__0 )?
            {
             before(grammarAccess.getPropertySelectionAccess().getGroup_6());
            // InternalUtilParser.g:3328:2: ( rule__PropertySelection__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Description) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUtilParser.g:3328:3: rule__PropertySelection__Group_6__0
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
    // InternalUtilParser.g:3336:1: rule__PropertySelection__Group__7 : rule__PropertySelection__Group__7__Impl rule__PropertySelection__Group__8 ;
    public final void rule__PropertySelection__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3340:1: ( rule__PropertySelection__Group__7__Impl rule__PropertySelection__Group__8 )
            // InternalUtilParser.g:3341:2: rule__PropertySelection__Group__7__Impl rule__PropertySelection__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:3348:1: rule__PropertySelection__Group__7__Impl : ( ( rule__PropertySelection__Group_7__0 )? ) ;
    public final void rule__PropertySelection__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3352:1: ( ( ( rule__PropertySelection__Group_7__0 )? ) )
            // InternalUtilParser.g:3353:1: ( ( rule__PropertySelection__Group_7__0 )? )
            {
            // InternalUtilParser.g:3353:1: ( ( rule__PropertySelection__Group_7__0 )? )
            // InternalUtilParser.g:3354:2: ( rule__PropertySelection__Group_7__0 )?
            {
             before(grammarAccess.getPropertySelectionAccess().getGroup_7());
            // InternalUtilParser.g:3355:2: ( rule__PropertySelection__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Value) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUtilParser.g:3355:3: rule__PropertySelection__Group_7__0
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
    // InternalUtilParser.g:3363:1: rule__PropertySelection__Group__8 : rule__PropertySelection__Group__8__Impl ;
    public final void rule__PropertySelection__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3367:1: ( rule__PropertySelection__Group__8__Impl )
            // InternalUtilParser.g:3368:2: rule__PropertySelection__Group__8__Impl
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
    // InternalUtilParser.g:3374:1: rule__PropertySelection__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertySelection__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3378:1: ( ( ( RULE_DEDENT )? ) )
            // InternalUtilParser.g:3379:1: ( ( RULE_DEDENT )? )
            {
            // InternalUtilParser.g:3379:1: ( ( RULE_DEDENT )? )
            // InternalUtilParser.g:3380:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_8());
            // InternalUtilParser.g:3381:2: ( RULE_DEDENT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DEDENT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUtilParser.g:3381:3: RULE_DEDENT
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
    // InternalUtilParser.g:3390:1: rule__PropertySelection__Group_6__0 : rule__PropertySelection__Group_6__0__Impl rule__PropertySelection__Group_6__1 ;
    public final void rule__PropertySelection__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3394:1: ( rule__PropertySelection__Group_6__0__Impl rule__PropertySelection__Group_6__1 )
            // InternalUtilParser.g:3395:2: rule__PropertySelection__Group_6__0__Impl rule__PropertySelection__Group_6__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:3402:1: rule__PropertySelection__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertySelection__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3406:1: ( ( Description ) )
            // InternalUtilParser.g:3407:1: ( Description )
            {
            // InternalUtilParser.g:3407:1: ( Description )
            // InternalUtilParser.g:3408:2: Description
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
    // InternalUtilParser.g:3417:1: rule__PropertySelection__Group_6__1 : rule__PropertySelection__Group_6__1__Impl ;
    public final void rule__PropertySelection__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3421:1: ( rule__PropertySelection__Group_6__1__Impl )
            // InternalUtilParser.g:3422:2: rule__PropertySelection__Group_6__1__Impl
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
    // InternalUtilParser.g:3428:1: rule__PropertySelection__Group_6__1__Impl : ( ( rule__PropertySelection__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertySelection__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3432:1: ( ( ( rule__PropertySelection__DescriptionAssignment_6_1 ) ) )
            // InternalUtilParser.g:3433:1: ( ( rule__PropertySelection__DescriptionAssignment_6_1 ) )
            {
            // InternalUtilParser.g:3433:1: ( ( rule__PropertySelection__DescriptionAssignment_6_1 ) )
            // InternalUtilParser.g:3434:2: ( rule__PropertySelection__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertySelectionAccess().getDescriptionAssignment_6_1());
            // InternalUtilParser.g:3435:2: ( rule__PropertySelection__DescriptionAssignment_6_1 )
            // InternalUtilParser.g:3435:3: rule__PropertySelection__DescriptionAssignment_6_1
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
    // InternalUtilParser.g:3444:1: rule__PropertySelection__Group_7__0 : rule__PropertySelection__Group_7__0__Impl rule__PropertySelection__Group_7__1 ;
    public final void rule__PropertySelection__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3448:1: ( rule__PropertySelection__Group_7__0__Impl rule__PropertySelection__Group_7__1 )
            // InternalUtilParser.g:3449:2: rule__PropertySelection__Group_7__0__Impl rule__PropertySelection__Group_7__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUtilParser.g:3456:1: rule__PropertySelection__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertySelection__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3460:1: ( ( Value ) )
            // InternalUtilParser.g:3461:1: ( Value )
            {
            // InternalUtilParser.g:3461:1: ( Value )
            // InternalUtilParser.g:3462:2: Value
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
    // InternalUtilParser.g:3471:1: rule__PropertySelection__Group_7__1 : rule__PropertySelection__Group_7__1__Impl rule__PropertySelection__Group_7__2 ;
    public final void rule__PropertySelection__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3475:1: ( rule__PropertySelection__Group_7__1__Impl rule__PropertySelection__Group_7__2 )
            // InternalUtilParser.g:3476:2: rule__PropertySelection__Group_7__1__Impl rule__PropertySelection__Group_7__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalUtilParser.g:3483:1: rule__PropertySelection__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertySelection__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3487:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:3488:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:3488:1: ( RULE_INDENT )
            // InternalUtilParser.g:3489:2: RULE_INDENT
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
    // InternalUtilParser.g:3498:1: rule__PropertySelection__Group_7__2 : rule__PropertySelection__Group_7__2__Impl rule__PropertySelection__Group_7__3 ;
    public final void rule__PropertySelection__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3502:1: ( rule__PropertySelection__Group_7__2__Impl rule__PropertySelection__Group_7__3 )
            // InternalUtilParser.g:3503:2: rule__PropertySelection__Group_7__2__Impl rule__PropertySelection__Group_7__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalUtilParser.g:3510:1: rule__PropertySelection__Group_7__2__Impl : ( rulePreListElement ) ;
    public final void rule__PropertySelection__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3514:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:3515:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:3515:1: ( rulePreListElement )
            // InternalUtilParser.g:3516:2: rulePreListElement
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
    // InternalUtilParser.g:3525:1: rule__PropertySelection__Group_7__3 : rule__PropertySelection__Group_7__3__Impl rule__PropertySelection__Group_7__4 ;
    public final void rule__PropertySelection__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3529:1: ( rule__PropertySelection__Group_7__3__Impl rule__PropertySelection__Group_7__4 )
            // InternalUtilParser.g:3530:2: rule__PropertySelection__Group_7__3__Impl rule__PropertySelection__Group_7__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalUtilParser.g:3537:1: rule__PropertySelection__Group_7__3__Impl : ( ( rule__PropertySelection__ValueAssignment_7_3 ) ) ;
    public final void rule__PropertySelection__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3541:1: ( ( ( rule__PropertySelection__ValueAssignment_7_3 ) ) )
            // InternalUtilParser.g:3542:1: ( ( rule__PropertySelection__ValueAssignment_7_3 ) )
            {
            // InternalUtilParser.g:3542:1: ( ( rule__PropertySelection__ValueAssignment_7_3 ) )
            // InternalUtilParser.g:3543:2: ( rule__PropertySelection__ValueAssignment_7_3 )
            {
             before(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_3());
            // InternalUtilParser.g:3544:2: ( rule__PropertySelection__ValueAssignment_7_3 )
            // InternalUtilParser.g:3544:3: rule__PropertySelection__ValueAssignment_7_3
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
    // InternalUtilParser.g:3552:1: rule__PropertySelection__Group_7__4 : rule__PropertySelection__Group_7__4__Impl rule__PropertySelection__Group_7__5 ;
    public final void rule__PropertySelection__Group_7__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3556:1: ( rule__PropertySelection__Group_7__4__Impl rule__PropertySelection__Group_7__5 )
            // InternalUtilParser.g:3557:2: rule__PropertySelection__Group_7__4__Impl rule__PropertySelection__Group_7__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalUtilParser.g:3564:1: rule__PropertySelection__Group_7__4__Impl : ( ( rule__PropertySelection__Group_7_4__0 )* ) ;
    public final void rule__PropertySelection__Group_7__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3568:1: ( ( ( rule__PropertySelection__Group_7_4__0 )* ) )
            // InternalUtilParser.g:3569:1: ( ( rule__PropertySelection__Group_7_4__0 )* )
            {
            // InternalUtilParser.g:3569:1: ( ( rule__PropertySelection__Group_7_4__0 )* )
            // InternalUtilParser.g:3570:2: ( rule__PropertySelection__Group_7_4__0 )*
            {
             before(grammarAccess.getPropertySelectionAccess().getGroup_7_4());
            // InternalUtilParser.g:3571:2: ( rule__PropertySelection__Group_7_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==HyphenMinus) ) {
                    alt27=1;
                }


                switch (alt27) {
                case 1 :
                    // InternalUtilParser.g:3571:3: rule__PropertySelection__Group_7_4__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__PropertySelection__Group_7_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop27;
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
    // InternalUtilParser.g:3579:1: rule__PropertySelection__Group_7__5 : rule__PropertySelection__Group_7__5__Impl ;
    public final void rule__PropertySelection__Group_7__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3583:1: ( rule__PropertySelection__Group_7__5__Impl )
            // InternalUtilParser.g:3584:2: rule__PropertySelection__Group_7__5__Impl
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
    // InternalUtilParser.g:3590:1: rule__PropertySelection__Group_7__5__Impl : ( RULE_DEDENT ) ;
    public final void rule__PropertySelection__Group_7__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3594:1: ( ( RULE_DEDENT ) )
            // InternalUtilParser.g:3595:1: ( RULE_DEDENT )
            {
            // InternalUtilParser.g:3595:1: ( RULE_DEDENT )
            // InternalUtilParser.g:3596:2: RULE_DEDENT
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
    // InternalUtilParser.g:3606:1: rule__PropertySelection__Group_7_4__0 : rule__PropertySelection__Group_7_4__0__Impl rule__PropertySelection__Group_7_4__1 ;
    public final void rule__PropertySelection__Group_7_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3610:1: ( rule__PropertySelection__Group_7_4__0__Impl rule__PropertySelection__Group_7_4__1 )
            // InternalUtilParser.g:3611:2: rule__PropertySelection__Group_7_4__0__Impl rule__PropertySelection__Group_7_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUtilParser.g:3618:1: rule__PropertySelection__Group_7_4__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertySelection__Group_7_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3622:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:3623:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:3623:1: ( rulePreListElement )
            // InternalUtilParser.g:3624:2: rulePreListElement
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
    // InternalUtilParser.g:3633:1: rule__PropertySelection__Group_7_4__1 : rule__PropertySelection__Group_7_4__1__Impl ;
    public final void rule__PropertySelection__Group_7_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3637:1: ( rule__PropertySelection__Group_7_4__1__Impl )
            // InternalUtilParser.g:3638:2: rule__PropertySelection__Group_7_4__1__Impl
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
    // InternalUtilParser.g:3644:1: rule__PropertySelection__Group_7_4__1__Impl : ( ( rule__PropertySelection__ValueAssignment_7_4_1 ) ) ;
    public final void rule__PropertySelection__Group_7_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3648:1: ( ( ( rule__PropertySelection__ValueAssignment_7_4_1 ) ) )
            // InternalUtilParser.g:3649:1: ( ( rule__PropertySelection__ValueAssignment_7_4_1 ) )
            {
            // InternalUtilParser.g:3649:1: ( ( rule__PropertySelection__ValueAssignment_7_4_1 ) )
            // InternalUtilParser.g:3650:2: ( rule__PropertySelection__ValueAssignment_7_4_1 )
            {
             before(grammarAccess.getPropertySelectionAccess().getValueAssignment_7_4_1());
            // InternalUtilParser.g:3651:2: ( rule__PropertySelection__ValueAssignment_7_4_1 )
            // InternalUtilParser.g:3651:3: rule__PropertySelection__ValueAssignment_7_4_1
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
    // InternalUtilParser.g:3660:1: rule__PropertyRange__Group__0 : rule__PropertyRange__Group__0__Impl rule__PropertyRange__Group__1 ;
    public final void rule__PropertyRange__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3664:1: ( rule__PropertyRange__Group__0__Impl rule__PropertyRange__Group__1 )
            // InternalUtilParser.g:3665:2: rule__PropertyRange__Group__0__Impl rule__PropertyRange__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUtilParser.g:3672:1: rule__PropertyRange__Group__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyRange__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3676:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:3677:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:3677:1: ( rulePreListElement )
            // InternalUtilParser.g:3678:2: rulePreListElement
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
    // InternalUtilParser.g:3687:1: rule__PropertyRange__Group__1 : rule__PropertyRange__Group__1__Impl rule__PropertyRange__Group__2 ;
    public final void rule__PropertyRange__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3691:1: ( rule__PropertyRange__Group__1__Impl rule__PropertyRange__Group__2 )
            // InternalUtilParser.g:3692:2: rule__PropertyRange__Group__1__Impl rule__PropertyRange__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:3699:1: rule__PropertyRange__Group__1__Impl : ( Name ) ;
    public final void rule__PropertyRange__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3703:1: ( ( Name ) )
            // InternalUtilParser.g:3704:1: ( Name )
            {
            // InternalUtilParser.g:3704:1: ( Name )
            // InternalUtilParser.g:3705:2: Name
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
    // InternalUtilParser.g:3714:1: rule__PropertyRange__Group__2 : rule__PropertyRange__Group__2__Impl rule__PropertyRange__Group__3 ;
    public final void rule__PropertyRange__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3718:1: ( rule__PropertyRange__Group__2__Impl rule__PropertyRange__Group__3 )
            // InternalUtilParser.g:3719:2: rule__PropertyRange__Group__2__Impl rule__PropertyRange__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalUtilParser.g:3726:1: rule__PropertyRange__Group__2__Impl : ( ( rule__PropertyRange__NameAssignment_2 ) ) ;
    public final void rule__PropertyRange__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3730:1: ( ( ( rule__PropertyRange__NameAssignment_2 ) ) )
            // InternalUtilParser.g:3731:1: ( ( rule__PropertyRange__NameAssignment_2 ) )
            {
            // InternalUtilParser.g:3731:1: ( ( rule__PropertyRange__NameAssignment_2 ) )
            // InternalUtilParser.g:3732:2: ( rule__PropertyRange__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyRangeAccess().getNameAssignment_2());
            // InternalUtilParser.g:3733:2: ( rule__PropertyRange__NameAssignment_2 )
            // InternalUtilParser.g:3733:3: rule__PropertyRange__NameAssignment_2
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
    // InternalUtilParser.g:3741:1: rule__PropertyRange__Group__3 : rule__PropertyRange__Group__3__Impl rule__PropertyRange__Group__4 ;
    public final void rule__PropertyRange__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3745:1: ( rule__PropertyRange__Group__3__Impl rule__PropertyRange__Group__4 )
            // InternalUtilParser.g:3746:2: rule__PropertyRange__Group__3__Impl rule__PropertyRange__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUtilParser.g:3753:1: rule__PropertyRange__Group__3__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyRange__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3757:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:3758:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:3758:1: ( RULE_INDENT )
            // InternalUtilParser.g:3759:2: RULE_INDENT
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
    // InternalUtilParser.g:3768:1: rule__PropertyRange__Group__4 : rule__PropertyRange__Group__4__Impl rule__PropertyRange__Group__5 ;
    public final void rule__PropertyRange__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3772:1: ( rule__PropertyRange__Group__4__Impl rule__PropertyRange__Group__5 )
            // InternalUtilParser.g:3773:2: rule__PropertyRange__Group__4__Impl rule__PropertyRange__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalUtilParser.g:3780:1: rule__PropertyRange__Group__4__Impl : ( Kind ) ;
    public final void rule__PropertyRange__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3784:1: ( ( Kind ) )
            // InternalUtilParser.g:3785:1: ( Kind )
            {
            // InternalUtilParser.g:3785:1: ( Kind )
            // InternalUtilParser.g:3786:2: Kind
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
    // InternalUtilParser.g:3795:1: rule__PropertyRange__Group__5 : rule__PropertyRange__Group__5__Impl rule__PropertyRange__Group__6 ;
    public final void rule__PropertyRange__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3799:1: ( rule__PropertyRange__Group__5__Impl rule__PropertyRange__Group__6 )
            // InternalUtilParser.g:3800:2: rule__PropertyRange__Group__5__Impl rule__PropertyRange__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:3807:1: rule__PropertyRange__Group__5__Impl : ( ( rule__PropertyRange__KindAssignment_5 ) ) ;
    public final void rule__PropertyRange__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3811:1: ( ( ( rule__PropertyRange__KindAssignment_5 ) ) )
            // InternalUtilParser.g:3812:1: ( ( rule__PropertyRange__KindAssignment_5 ) )
            {
            // InternalUtilParser.g:3812:1: ( ( rule__PropertyRange__KindAssignment_5 ) )
            // InternalUtilParser.g:3813:2: ( rule__PropertyRange__KindAssignment_5 )
            {
             before(grammarAccess.getPropertyRangeAccess().getKindAssignment_5());
            // InternalUtilParser.g:3814:2: ( rule__PropertyRange__KindAssignment_5 )
            // InternalUtilParser.g:3814:3: rule__PropertyRange__KindAssignment_5
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
    // InternalUtilParser.g:3822:1: rule__PropertyRange__Group__6 : rule__PropertyRange__Group__6__Impl rule__PropertyRange__Group__7 ;
    public final void rule__PropertyRange__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3826:1: ( rule__PropertyRange__Group__6__Impl rule__PropertyRange__Group__7 )
            // InternalUtilParser.g:3827:2: rule__PropertyRange__Group__6__Impl rule__PropertyRange__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:3834:1: rule__PropertyRange__Group__6__Impl : ( ( rule__PropertyRange__Group_6__0 )? ) ;
    public final void rule__PropertyRange__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3838:1: ( ( ( rule__PropertyRange__Group_6__0 )? ) )
            // InternalUtilParser.g:3839:1: ( ( rule__PropertyRange__Group_6__0 )? )
            {
            // InternalUtilParser.g:3839:1: ( ( rule__PropertyRange__Group_6__0 )? )
            // InternalUtilParser.g:3840:2: ( rule__PropertyRange__Group_6__0 )?
            {
             before(grammarAccess.getPropertyRangeAccess().getGroup_6());
            // InternalUtilParser.g:3841:2: ( rule__PropertyRange__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Description) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUtilParser.g:3841:3: rule__PropertyRange__Group_6__0
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
    // InternalUtilParser.g:3849:1: rule__PropertyRange__Group__7 : rule__PropertyRange__Group__7__Impl rule__PropertyRange__Group__8 ;
    public final void rule__PropertyRange__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3853:1: ( rule__PropertyRange__Group__7__Impl rule__PropertyRange__Group__8 )
            // InternalUtilParser.g:3854:2: rule__PropertyRange__Group__7__Impl rule__PropertyRange__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalUtilParser.g:3861:1: rule__PropertyRange__Group__7__Impl : ( ( rule__PropertyRange__Group_7__0 )? ) ;
    public final void rule__PropertyRange__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3865:1: ( ( ( rule__PropertyRange__Group_7__0 )? ) )
            // InternalUtilParser.g:3866:1: ( ( rule__PropertyRange__Group_7__0 )? )
            {
            // InternalUtilParser.g:3866:1: ( ( rule__PropertyRange__Group_7__0 )? )
            // InternalUtilParser.g:3867:2: ( rule__PropertyRange__Group_7__0 )?
            {
             before(grammarAccess.getPropertyRangeAccess().getGroup_7());
            // InternalUtilParser.g:3868:2: ( rule__PropertyRange__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Value) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUtilParser.g:3868:3: rule__PropertyRange__Group_7__0
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
    // InternalUtilParser.g:3876:1: rule__PropertyRange__Group__8 : rule__PropertyRange__Group__8__Impl ;
    public final void rule__PropertyRange__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3880:1: ( rule__PropertyRange__Group__8__Impl )
            // InternalUtilParser.g:3881:2: rule__PropertyRange__Group__8__Impl
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
    // InternalUtilParser.g:3887:1: rule__PropertyRange__Group__8__Impl : ( ( RULE_DEDENT )? ) ;
    public final void rule__PropertyRange__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3891:1: ( ( ( RULE_DEDENT )? ) )
            // InternalUtilParser.g:3892:1: ( ( RULE_DEDENT )? )
            {
            // InternalUtilParser.g:3892:1: ( ( RULE_DEDENT )? )
            // InternalUtilParser.g:3893:2: ( RULE_DEDENT )?
            {
             before(grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_8());
            // InternalUtilParser.g:3894:2: ( RULE_DEDENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DEDENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUtilParser.g:3894:3: RULE_DEDENT
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
    // InternalUtilParser.g:3903:1: rule__PropertyRange__Group_6__0 : rule__PropertyRange__Group_6__0__Impl rule__PropertyRange__Group_6__1 ;
    public final void rule__PropertyRange__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3907:1: ( rule__PropertyRange__Group_6__0__Impl rule__PropertyRange__Group_6__1 )
            // InternalUtilParser.g:3908:2: rule__PropertyRange__Group_6__0__Impl rule__PropertyRange__Group_6__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:3915:1: rule__PropertyRange__Group_6__0__Impl : ( Description ) ;
    public final void rule__PropertyRange__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3919:1: ( ( Description ) )
            // InternalUtilParser.g:3920:1: ( Description )
            {
            // InternalUtilParser.g:3920:1: ( Description )
            // InternalUtilParser.g:3921:2: Description
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
    // InternalUtilParser.g:3930:1: rule__PropertyRange__Group_6__1 : rule__PropertyRange__Group_6__1__Impl ;
    public final void rule__PropertyRange__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3934:1: ( rule__PropertyRange__Group_6__1__Impl )
            // InternalUtilParser.g:3935:2: rule__PropertyRange__Group_6__1__Impl
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
    // InternalUtilParser.g:3941:1: rule__PropertyRange__Group_6__1__Impl : ( ( rule__PropertyRange__DescriptionAssignment_6_1 ) ) ;
    public final void rule__PropertyRange__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3945:1: ( ( ( rule__PropertyRange__DescriptionAssignment_6_1 ) ) )
            // InternalUtilParser.g:3946:1: ( ( rule__PropertyRange__DescriptionAssignment_6_1 ) )
            {
            // InternalUtilParser.g:3946:1: ( ( rule__PropertyRange__DescriptionAssignment_6_1 ) )
            // InternalUtilParser.g:3947:2: ( rule__PropertyRange__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getPropertyRangeAccess().getDescriptionAssignment_6_1());
            // InternalUtilParser.g:3948:2: ( rule__PropertyRange__DescriptionAssignment_6_1 )
            // InternalUtilParser.g:3948:3: rule__PropertyRange__DescriptionAssignment_6_1
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
    // InternalUtilParser.g:3957:1: rule__PropertyRange__Group_7__0 : rule__PropertyRange__Group_7__0__Impl rule__PropertyRange__Group_7__1 ;
    public final void rule__PropertyRange__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3961:1: ( rule__PropertyRange__Group_7__0__Impl rule__PropertyRange__Group_7__1 )
            // InternalUtilParser.g:3962:2: rule__PropertyRange__Group_7__0__Impl rule__PropertyRange__Group_7__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUtilParser.g:3969:1: rule__PropertyRange__Group_7__0__Impl : ( Value ) ;
    public final void rule__PropertyRange__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3973:1: ( ( Value ) )
            // InternalUtilParser.g:3974:1: ( Value )
            {
            // InternalUtilParser.g:3974:1: ( Value )
            // InternalUtilParser.g:3975:2: Value
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
    // InternalUtilParser.g:3984:1: rule__PropertyRange__Group_7__1 : rule__PropertyRange__Group_7__1__Impl rule__PropertyRange__Group_7__2 ;
    public final void rule__PropertyRange__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:3988:1: ( rule__PropertyRange__Group_7__1__Impl rule__PropertyRange__Group_7__2 )
            // InternalUtilParser.g:3989:2: rule__PropertyRange__Group_7__1__Impl rule__PropertyRange__Group_7__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalUtilParser.g:3996:1: rule__PropertyRange__Group_7__1__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyRange__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4000:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:4001:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:4001:1: ( RULE_INDENT )
            // InternalUtilParser.g:4002:2: RULE_INDENT
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
    // InternalUtilParser.g:4011:1: rule__PropertyRange__Group_7__2 : rule__PropertyRange__Group_7__2__Impl rule__PropertyRange__Group_7__3 ;
    public final void rule__PropertyRange__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4015:1: ( rule__PropertyRange__Group_7__2__Impl rule__PropertyRange__Group_7__3 )
            // InternalUtilParser.g:4016:2: rule__PropertyRange__Group_7__2__Impl rule__PropertyRange__Group_7__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalUtilParser.g:4023:1: rule__PropertyRange__Group_7__2__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyRange__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4027:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:4028:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:4028:1: ( rulePreListElement )
            // InternalUtilParser.g:4029:2: rulePreListElement
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
    // InternalUtilParser.g:4038:1: rule__PropertyRange__Group_7__3 : rule__PropertyRange__Group_7__3__Impl rule__PropertyRange__Group_7__4 ;
    public final void rule__PropertyRange__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4042:1: ( rule__PropertyRange__Group_7__3__Impl rule__PropertyRange__Group_7__4 )
            // InternalUtilParser.g:4043:2: rule__PropertyRange__Group_7__3__Impl rule__PropertyRange__Group_7__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalUtilParser.g:4050:1: rule__PropertyRange__Group_7__3__Impl : ( ( rule__PropertyRange__ValueAssignment_7_3 ) ) ;
    public final void rule__PropertyRange__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4054:1: ( ( ( rule__PropertyRange__ValueAssignment_7_3 ) ) )
            // InternalUtilParser.g:4055:1: ( ( rule__PropertyRange__ValueAssignment_7_3 ) )
            {
            // InternalUtilParser.g:4055:1: ( ( rule__PropertyRange__ValueAssignment_7_3 ) )
            // InternalUtilParser.g:4056:2: ( rule__PropertyRange__ValueAssignment_7_3 )
            {
             before(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_3());
            // InternalUtilParser.g:4057:2: ( rule__PropertyRange__ValueAssignment_7_3 )
            // InternalUtilParser.g:4057:3: rule__PropertyRange__ValueAssignment_7_3
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
    // InternalUtilParser.g:4065:1: rule__PropertyRange__Group_7__4 : rule__PropertyRange__Group_7__4__Impl rule__PropertyRange__Group_7__5 ;
    public final void rule__PropertyRange__Group_7__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4069:1: ( rule__PropertyRange__Group_7__4__Impl rule__PropertyRange__Group_7__5 )
            // InternalUtilParser.g:4070:2: rule__PropertyRange__Group_7__4__Impl rule__PropertyRange__Group_7__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalUtilParser.g:4077:1: rule__PropertyRange__Group_7__4__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyRange__Group_7__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4081:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:4082:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:4082:1: ( rulePreListElement )
            // InternalUtilParser.g:4083:2: rulePreListElement
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
    // InternalUtilParser.g:4092:1: rule__PropertyRange__Group_7__5 : rule__PropertyRange__Group_7__5__Impl rule__PropertyRange__Group_7__6 ;
    public final void rule__PropertyRange__Group_7__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4096:1: ( rule__PropertyRange__Group_7__5__Impl rule__PropertyRange__Group_7__6 )
            // InternalUtilParser.g:4097:2: rule__PropertyRange__Group_7__5__Impl rule__PropertyRange__Group_7__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalUtilParser.g:4104:1: rule__PropertyRange__Group_7__5__Impl : ( ( rule__PropertyRange__ValueAssignment_7_5 ) ) ;
    public final void rule__PropertyRange__Group_7__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4108:1: ( ( ( rule__PropertyRange__ValueAssignment_7_5 ) ) )
            // InternalUtilParser.g:4109:1: ( ( rule__PropertyRange__ValueAssignment_7_5 ) )
            {
            // InternalUtilParser.g:4109:1: ( ( rule__PropertyRange__ValueAssignment_7_5 ) )
            // InternalUtilParser.g:4110:2: ( rule__PropertyRange__ValueAssignment_7_5 )
            {
             before(grammarAccess.getPropertyRangeAccess().getValueAssignment_7_5());
            // InternalUtilParser.g:4111:2: ( rule__PropertyRange__ValueAssignment_7_5 )
            // InternalUtilParser.g:4111:3: rule__PropertyRange__ValueAssignment_7_5
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
    // InternalUtilParser.g:4119:1: rule__PropertyRange__Group_7__6 : rule__PropertyRange__Group_7__6__Impl ;
    public final void rule__PropertyRange__Group_7__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4123:1: ( rule__PropertyRange__Group_7__6__Impl )
            // InternalUtilParser.g:4124:2: rule__PropertyRange__Group_7__6__Impl
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
    // InternalUtilParser.g:4130:1: rule__PropertyRange__Group_7__6__Impl : ( RULE_DEDENT ) ;
    public final void rule__PropertyRange__Group_7__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4134:1: ( ( RULE_DEDENT ) )
            // InternalUtilParser.g:4135:1: ( RULE_DEDENT )
            {
            // InternalUtilParser.g:4135:1: ( RULE_DEDENT )
            // InternalUtilParser.g:4136:2: RULE_DEDENT
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


    // $ANTLR start "rule__PropertyValueList__Group__0"
    // InternalUtilParser.g:4146:1: rule__PropertyValueList__Group__0 : rule__PropertyValueList__Group__0__Impl rule__PropertyValueList__Group__1 ;
    public final void rule__PropertyValueList__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4150:1: ( rule__PropertyValueList__Group__0__Impl rule__PropertyValueList__Group__1 )
            // InternalUtilParser.g:4151:2: rule__PropertyValueList__Group__0__Impl rule__PropertyValueList__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PropertyValueList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValueList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__0"


    // $ANTLR start "rule__PropertyValueList__Group__0__Impl"
    // InternalUtilParser.g:4158:1: rule__PropertyValueList__Group__0__Impl : ( RULE_INDENT ) ;
    public final void rule__PropertyValueList__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4162:1: ( ( RULE_INDENT ) )
            // InternalUtilParser.g:4163:1: ( RULE_INDENT )
            {
            // InternalUtilParser.g:4163:1: ( RULE_INDENT )
            // InternalUtilParser.g:4164:2: RULE_INDENT
            {
             before(grammarAccess.getPropertyValueListAccess().getINDENTTerminalRuleCall_0());
            match(input,RULE_INDENT,FOLLOW_2);
             after(grammarAccess.getPropertyValueListAccess().getINDENTTerminalRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__0__Impl"


    // $ANTLR start "rule__PropertyValueList__Group__1"
    // InternalUtilParser.g:4173:1: rule__PropertyValueList__Group__1 : rule__PropertyValueList__Group__1__Impl rule__PropertyValueList__Group__2 ;
    public final void rule__PropertyValueList__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4177:1: ( rule__PropertyValueList__Group__1__Impl rule__PropertyValueList__Group__2 )
            // InternalUtilParser.g:4178:2: rule__PropertyValueList__Group__1__Impl rule__PropertyValueList__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PropertyValueList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValueList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__1"


    // $ANTLR start "rule__PropertyValueList__Group__1__Impl"
    // InternalUtilParser.g:4185:1: rule__PropertyValueList__Group__1__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyValueList__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4189:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:4190:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:4190:1: ( rulePreListElement )
            // InternalUtilParser.g:4191:2: rulePreListElement
            {
             before(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_1());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__1__Impl"


    // $ANTLR start "rule__PropertyValueList__Group__2"
    // InternalUtilParser.g:4200:1: rule__PropertyValueList__Group__2 : rule__PropertyValueList__Group__2__Impl rule__PropertyValueList__Group__3 ;
    public final void rule__PropertyValueList__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4204:1: ( rule__PropertyValueList__Group__2__Impl rule__PropertyValueList__Group__3 )
            // InternalUtilParser.g:4205:2: rule__PropertyValueList__Group__2__Impl rule__PropertyValueList__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__PropertyValueList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValueList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__2"


    // $ANTLR start "rule__PropertyValueList__Group__2__Impl"
    // InternalUtilParser.g:4212:1: rule__PropertyValueList__Group__2__Impl : ( ( rule__PropertyValueList__ValueAssignment_2 ) ) ;
    public final void rule__PropertyValueList__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4216:1: ( ( ( rule__PropertyValueList__ValueAssignment_2 ) ) )
            // InternalUtilParser.g:4217:1: ( ( rule__PropertyValueList__ValueAssignment_2 ) )
            {
            // InternalUtilParser.g:4217:1: ( ( rule__PropertyValueList__ValueAssignment_2 ) )
            // InternalUtilParser.g:4218:2: ( rule__PropertyValueList__ValueAssignment_2 )
            {
             before(grammarAccess.getPropertyValueListAccess().getValueAssignment_2());
            // InternalUtilParser.g:4219:2: ( rule__PropertyValueList__ValueAssignment_2 )
            // InternalUtilParser.g:4219:3: rule__PropertyValueList__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValueList__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueListAccess().getValueAssignment_2());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__2__Impl"


    // $ANTLR start "rule__PropertyValueList__Group__3"
    // InternalUtilParser.g:4227:1: rule__PropertyValueList__Group__3 : rule__PropertyValueList__Group__3__Impl rule__PropertyValueList__Group__4 ;
    public final void rule__PropertyValueList__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4231:1: ( rule__PropertyValueList__Group__3__Impl rule__PropertyValueList__Group__4 )
            // InternalUtilParser.g:4232:2: rule__PropertyValueList__Group__3__Impl rule__PropertyValueList__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__PropertyValueList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValueList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__3"


    // $ANTLR start "rule__PropertyValueList__Group__3__Impl"
    // InternalUtilParser.g:4239:1: rule__PropertyValueList__Group__3__Impl : ( ( rule__PropertyValueList__Group_3__0 )* ) ;
    public final void rule__PropertyValueList__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4243:1: ( ( ( rule__PropertyValueList__Group_3__0 )* ) )
            // InternalUtilParser.g:4244:1: ( ( rule__PropertyValueList__Group_3__0 )* )
            {
            // InternalUtilParser.g:4244:1: ( ( rule__PropertyValueList__Group_3__0 )* )
            // InternalUtilParser.g:4245:2: ( rule__PropertyValueList__Group_3__0 )*
            {
             before(grammarAccess.getPropertyValueListAccess().getGroup_3());
            // InternalUtilParser.g:4246:2: ( rule__PropertyValueList__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==HyphenMinus) ) {
                    alt31=1;
                }


                switch (alt31) {
                case 1 :
                    // InternalUtilParser.g:4246:3: rule__PropertyValueList__Group_3__0
                    {
                    pushFollow(FOLLOW_17);
                    rule__PropertyValueList__Group_3__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop31;
                }
            } while (true);

             after(grammarAccess.getPropertyValueListAccess().getGroup_3());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__3__Impl"


    // $ANTLR start "rule__PropertyValueList__Group__4"
    // InternalUtilParser.g:4254:1: rule__PropertyValueList__Group__4 : rule__PropertyValueList__Group__4__Impl ;
    public final void rule__PropertyValueList__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4258:1: ( rule__PropertyValueList__Group__4__Impl )
            // InternalUtilParser.g:4259:2: rule__PropertyValueList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValueList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__4"


    // $ANTLR start "rule__PropertyValueList__Group__4__Impl"
    // InternalUtilParser.g:4265:1: rule__PropertyValueList__Group__4__Impl : ( RULE_DEDENT ) ;
    public final void rule__PropertyValueList__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4269:1: ( ( RULE_DEDENT ) )
            // InternalUtilParser.g:4270:1: ( RULE_DEDENT )
            {
            // InternalUtilParser.g:4270:1: ( RULE_DEDENT )
            // InternalUtilParser.g:4271:2: RULE_DEDENT
            {
             before(grammarAccess.getPropertyValueListAccess().getDEDENTTerminalRuleCall_4());
            match(input,RULE_DEDENT,FOLLOW_2);
             after(grammarAccess.getPropertyValueListAccess().getDEDENTTerminalRuleCall_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group__4__Impl"


    // $ANTLR start "rule__PropertyValueList__Group_3__0"
    // InternalUtilParser.g:4281:1: rule__PropertyValueList__Group_3__0 : rule__PropertyValueList__Group_3__0__Impl rule__PropertyValueList__Group_3__1 ;
    public final void rule__PropertyValueList__Group_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4285:1: ( rule__PropertyValueList__Group_3__0__Impl rule__PropertyValueList__Group_3__1 )
            // InternalUtilParser.g:4286:2: rule__PropertyValueList__Group_3__0__Impl rule__PropertyValueList__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__PropertyValueList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValueList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group_3__0"


    // $ANTLR start "rule__PropertyValueList__Group_3__0__Impl"
    // InternalUtilParser.g:4293:1: rule__PropertyValueList__Group_3__0__Impl : ( rulePreListElement ) ;
    public final void rule__PropertyValueList__Group_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4297:1: ( ( rulePreListElement ) )
            // InternalUtilParser.g:4298:1: ( rulePreListElement )
            {
            // InternalUtilParser.g:4298:1: ( rulePreListElement )
            // InternalUtilParser.g:4299:2: rulePreListElement
            {
             before(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_3_0());
            pushFollow(FOLLOW_2);
            rulePreListElement();

            state._fsp--;

             after(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group_3__0__Impl"


    // $ANTLR start "rule__PropertyValueList__Group_3__1"
    // InternalUtilParser.g:4308:1: rule__PropertyValueList__Group_3__1 : rule__PropertyValueList__Group_3__1__Impl ;
    public final void rule__PropertyValueList__Group_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4312:1: ( rule__PropertyValueList__Group_3__1__Impl )
            // InternalUtilParser.g:4313:2: rule__PropertyValueList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValueList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group_3__1"


    // $ANTLR start "rule__PropertyValueList__Group_3__1__Impl"
    // InternalUtilParser.g:4319:1: rule__PropertyValueList__Group_3__1__Impl : ( ( rule__PropertyValueList__ValueAssignment_3_1 ) ) ;
    public final void rule__PropertyValueList__Group_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4323:1: ( ( ( rule__PropertyValueList__ValueAssignment_3_1 ) ) )
            // InternalUtilParser.g:4324:1: ( ( rule__PropertyValueList__ValueAssignment_3_1 ) )
            {
            // InternalUtilParser.g:4324:1: ( ( rule__PropertyValueList__ValueAssignment_3_1 ) )
            // InternalUtilParser.g:4325:2: ( rule__PropertyValueList__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPropertyValueListAccess().getValueAssignment_3_1());
            // InternalUtilParser.g:4326:2: ( rule__PropertyValueList__ValueAssignment_3_1 )
            // InternalUtilParser.g:4326:3: rule__PropertyValueList__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValueList__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueListAccess().getValueAssignment_3_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__Group_3__1__Impl"


    // $ANTLR start "rule__ResourceType__Group__0"
    // InternalUtilParser.g:4335:1: rule__ResourceType__Group__0 : rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1 ;
    public final void rule__ResourceType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4339:1: ( rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1 )
            // InternalUtilParser.g:4340:2: rule__ResourceType__Group__0__Impl rule__ResourceType__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:4347:1: rule__ResourceType__Group__0__Impl : ( () ) ;
    public final void rule__ResourceType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4351:1: ( ( () ) )
            // InternalUtilParser.g:4352:1: ( () )
            {
            // InternalUtilParser.g:4352:1: ( () )
            // InternalUtilParser.g:4353:2: ()
            {
             before(grammarAccess.getResourceTypeAccess().getResourceTypeAction_0());
            // InternalUtilParser.g:4354:2: ()
            // InternalUtilParser.g:4354:3:
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
    // InternalUtilParser.g:4362:1: rule__ResourceType__Group__1 : rule__ResourceType__Group__1__Impl ;
    public final void rule__ResourceType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4366:1: ( rule__ResourceType__Group__1__Impl )
            // InternalUtilParser.g:4367:2: rule__ResourceType__Group__1__Impl
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
    // InternalUtilParser.g:4373:1: rule__ResourceType__Group__1__Impl : ( ( rule__ResourceType__NameAssignment_1 ) ) ;
    public final void rule__ResourceType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4377:1: ( ( ( rule__ResourceType__NameAssignment_1 ) ) )
            // InternalUtilParser.g:4378:1: ( ( rule__ResourceType__NameAssignment_1 ) )
            {
            // InternalUtilParser.g:4378:1: ( ( rule__ResourceType__NameAssignment_1 ) )
            // InternalUtilParser.g:4379:2: ( rule__ResourceType__NameAssignment_1 )
            {
             before(grammarAccess.getResourceTypeAccess().getNameAssignment_1());
            // InternalUtilParser.g:4380:2: ( rule__ResourceType__NameAssignment_1 )
            // InternalUtilParser.g:4380:3: rule__ResourceType__NameAssignment_1
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


    // $ANTLR start "rule__LinuxOpertingSystem__Group__0"
    // InternalUtilParser.g:4389:1: rule__LinuxOpertingSystem__Group__0 : rule__LinuxOpertingSystem__Group__0__Impl rule__LinuxOpertingSystem__Group__1 ;
    public final void rule__LinuxOpertingSystem__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4393:1: ( rule__LinuxOpertingSystem__Group__0__Impl rule__LinuxOpertingSystem__Group__1 )
            // InternalUtilParser.g:4394:2: rule__LinuxOpertingSystem__Group__0__Impl rule__LinuxOpertingSystem__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUtilParser.g:4401:1: rule__LinuxOpertingSystem__Group__0__Impl : ( () ) ;
    public final void rule__LinuxOpertingSystem__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4405:1: ( ( () ) )
            // InternalUtilParser.g:4406:1: ( () )
            {
            // InternalUtilParser.g:4406:1: ( () )
            // InternalUtilParser.g:4407:2: ()
            {
             before(grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemAction_0());
            // InternalUtilParser.g:4408:2: ()
            // InternalUtilParser.g:4408:3:
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
    // InternalUtilParser.g:4416:1: rule__LinuxOpertingSystem__Group__1 : rule__LinuxOpertingSystem__Group__1__Impl ;
    public final void rule__LinuxOpertingSystem__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4420:1: ( rule__LinuxOpertingSystem__Group__1__Impl )
            // InternalUtilParser.g:4421:2: rule__LinuxOpertingSystem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinuxOpertingSystem__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalUtilParser.g:4427:1: rule__LinuxOpertingSystem__Group__1__Impl : ( LinuxOpertingSystem ) ;
    public final void rule__LinuxOpertingSystem__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4431:1: ( ( LinuxOpertingSystem ) )
            // InternalUtilParser.g:4432:1: ( LinuxOpertingSystem )
            {
            // InternalUtilParser.g:4432:1: ( LinuxOpertingSystem )
            // InternalUtilParser.g:4433:2: LinuxOpertingSystem
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


    // $ANTLR start "rule__MacOSOpertingSystem__Group__0"
    // InternalUtilParser.g:4443:1: rule__MacOSOpertingSystem__Group__0 : rule__MacOSOpertingSystem__Group__0__Impl rule__MacOSOpertingSystem__Group__1 ;
    public final void rule__MacOSOpertingSystem__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4447:1: ( rule__MacOSOpertingSystem__Group__0__Impl rule__MacOSOpertingSystem__Group__1 )
            // InternalUtilParser.g:4448:2: rule__MacOSOpertingSystem__Group__0__Impl rule__MacOSOpertingSystem__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MacOSOpertingSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacOSOpertingSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOSOpertingSystem__Group__0"


    // $ANTLR start "rule__MacOSOpertingSystem__Group__0__Impl"
    // InternalUtilParser.g:4455:1: rule__MacOSOpertingSystem__Group__0__Impl : ( () ) ;
    public final void rule__MacOSOpertingSystem__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4459:1: ( ( () ) )
            // InternalUtilParser.g:4460:1: ( () )
            {
            // InternalUtilParser.g:4460:1: ( () )
            // InternalUtilParser.g:4461:2: ()
            {
             before(grammarAccess.getMacOSOpertingSystemAccess().getMacOSOpertingSystemAction_0());
            // InternalUtilParser.g:4462:2: ()
            // InternalUtilParser.g:4462:3:
            {
            }

             after(grammarAccess.getMacOSOpertingSystemAccess().getMacOSOpertingSystemAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOSOpertingSystem__Group__0__Impl"


    // $ANTLR start "rule__MacOSOpertingSystem__Group__1"
    // InternalUtilParser.g:4470:1: rule__MacOSOpertingSystem__Group__1 : rule__MacOSOpertingSystem__Group__1__Impl ;
    public final void rule__MacOSOpertingSystem__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4474:1: ( rule__MacOSOpertingSystem__Group__1__Impl )
            // InternalUtilParser.g:4475:2: rule__MacOSOpertingSystem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MacOSOpertingSystem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOSOpertingSystem__Group__1"


    // $ANTLR start "rule__MacOSOpertingSystem__Group__1__Impl"
    // InternalUtilParser.g:4481:1: rule__MacOSOpertingSystem__Group__1__Impl : ( MacOSOpertingSystem ) ;
    public final void rule__MacOSOpertingSystem__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4485:1: ( ( MacOSOpertingSystem ) )
            // InternalUtilParser.g:4486:1: ( MacOSOpertingSystem )
            {
            // InternalUtilParser.g:4486:1: ( MacOSOpertingSystem )
            // InternalUtilParser.g:4487:2: MacOSOpertingSystem
            {
             before(grammarAccess.getMacOSOpertingSystemAccess().getMacOSOpertingSystemKeyword_1());
            match(input,MacOSOpertingSystem,FOLLOW_2);
             after(grammarAccess.getMacOSOpertingSystemAccess().getMacOSOpertingSystemKeyword_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOSOpertingSystem__Group__1__Impl"


    // $ANTLR start "rule__CommunicationType__Group__0"
    // InternalUtilParser.g:4497:1: rule__CommunicationType__Group__0 : rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 ;
    public final void rule__CommunicationType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4501:1: ( rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1 )
            // InternalUtilParser.g:4502:2: rule__CommunicationType__Group__0__Impl rule__CommunicationType__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalUtilParser.g:4509:1: rule__CommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__CommunicationType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4513:1: ( ( () ) )
            // InternalUtilParser.g:4514:1: ( () )
            {
            // InternalUtilParser.g:4514:1: ( () )
            // InternalUtilParser.g:4515:2: ()
            {
             before(grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0());
            // InternalUtilParser.g:4516:2: ()
            // InternalUtilParser.g:4516:3:
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
    // InternalUtilParser.g:4524:1: rule__CommunicationType__Group__1 : rule__CommunicationType__Group__1__Impl ;
    public final void rule__CommunicationType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4528:1: ( rule__CommunicationType__Group__1__Impl )
            // InternalUtilParser.g:4529:2: rule__CommunicationType__Group__1__Impl
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
    // InternalUtilParser.g:4535:1: rule__CommunicationType__Group__1__Impl : ( ( rule__CommunicationType__NameAssignment_1 ) ) ;
    public final void rule__CommunicationType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4539:1: ( ( ( rule__CommunicationType__NameAssignment_1 ) ) )
            // InternalUtilParser.g:4540:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            {
            // InternalUtilParser.g:4540:1: ( ( rule__CommunicationType__NameAssignment_1 ) )
            // InternalUtilParser.g:4541:2: ( rule__CommunicationType__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1());
            // InternalUtilParser.g:4542:2: ( rule__CommunicationType__NameAssignment_1 )
            // InternalUtilParser.g:4542:3: rule__CommunicationType__NameAssignment_1
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
    // InternalUtilParser.g:4551:1: rule__EthernetCommunicationType__Group__0 : rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 ;
    public final void rule__EthernetCommunicationType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4555:1: ( rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1 )
            // InternalUtilParser.g:4556:2: rule__EthernetCommunicationType__Group__0__Impl rule__EthernetCommunicationType__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUtilParser.g:4563:1: rule__EthernetCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__EthernetCommunicationType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4567:1: ( ( () ) )
            // InternalUtilParser.g:4568:1: ( () )
            {
            // InternalUtilParser.g:4568:1: ( () )
            // InternalUtilParser.g:4569:2: ()
            {
             before(grammarAccess.getEthernetCommunicationTypeAccess().getEthernetCommunicationTypeAction_0());
            // InternalUtilParser.g:4570:2: ()
            // InternalUtilParser.g:4570:3:
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
    // InternalUtilParser.g:4578:1: rule__EthernetCommunicationType__Group__1 : rule__EthernetCommunicationType__Group__1__Impl ;
    public final void rule__EthernetCommunicationType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4582:1: ( rule__EthernetCommunicationType__Group__1__Impl )
            // InternalUtilParser.g:4583:2: rule__EthernetCommunicationType__Group__1__Impl
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
    // InternalUtilParser.g:4589:1: rule__EthernetCommunicationType__Group__1__Impl : ( Ethernet ) ;
    public final void rule__EthernetCommunicationType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4593:1: ( ( Ethernet ) )
            // InternalUtilParser.g:4594:1: ( Ethernet )
            {
            // InternalUtilParser.g:4594:1: ( Ethernet )
            // InternalUtilParser.g:4595:2: Ethernet
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
    // InternalUtilParser.g:4605:1: rule__WlanCommunicationType__Group__0 : rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 ;
    public final void rule__WlanCommunicationType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4609:1: ( rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1 )
            // InternalUtilParser.g:4610:2: rule__WlanCommunicationType__Group__0__Impl rule__WlanCommunicationType__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalUtilParser.g:4617:1: rule__WlanCommunicationType__Group__0__Impl : ( () ) ;
    public final void rule__WlanCommunicationType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4621:1: ( ( () ) )
            // InternalUtilParser.g:4622:1: ( () )
            {
            // InternalUtilParser.g:4622:1: ( () )
            // InternalUtilParser.g:4623:2: ()
            {
             before(grammarAccess.getWlanCommunicationTypeAccess().getWlanCommunicationTypeAction_0());
            // InternalUtilParser.g:4624:2: ()
            // InternalUtilParser.g:4624:3:
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
    // InternalUtilParser.g:4632:1: rule__WlanCommunicationType__Group__1 : rule__WlanCommunicationType__Group__1__Impl ;
    public final void rule__WlanCommunicationType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4636:1: ( rule__WlanCommunicationType__Group__1__Impl )
            // InternalUtilParser.g:4637:2: rule__WlanCommunicationType__Group__1__Impl
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
    // InternalUtilParser.g:4643:1: rule__WlanCommunicationType__Group__1__Impl : ( Wlan ) ;
    public final void rule__WlanCommunicationType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4647:1: ( ( Wlan ) )
            // InternalUtilParser.g:4648:1: ( Wlan )
            {
            // InternalUtilParser.g:4648:1: ( Wlan )
            // InternalUtilParser.g:4649:2: Wlan
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
    // InternalUtilParser.g:4659:1: rule__AttributeKind__Group__0 : rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 ;
    public final void rule__AttributeKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4663:1: ( rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1 )
            // InternalUtilParser.g:4664:2: rule__AttributeKind__Group__0__Impl rule__AttributeKind__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUtilParser.g:4671:1: rule__AttributeKind__Group__0__Impl : ( () ) ;
    public final void rule__AttributeKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4675:1: ( ( () ) )
            // InternalUtilParser.g:4676:1: ( () )
            {
            // InternalUtilParser.g:4676:1: ( () )
            // InternalUtilParser.g:4677:2: ()
            {
             before(grammarAccess.getAttributeKindAccess().getAttributeKindAction_0());
            // InternalUtilParser.g:4678:2: ()
            // InternalUtilParser.g:4678:3:
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
    // InternalUtilParser.g:4686:1: rule__AttributeKind__Group__1 : rule__AttributeKind__Group__1__Impl ;
    public final void rule__AttributeKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4690:1: ( rule__AttributeKind__Group__1__Impl )
            // InternalUtilParser.g:4691:2: rule__AttributeKind__Group__1__Impl
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
    // InternalUtilParser.g:4697:1: rule__AttributeKind__Group__1__Impl : ( AttributeKind ) ;
    public final void rule__AttributeKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4701:1: ( ( AttributeKind ) )
            // InternalUtilParser.g:4702:1: ( AttributeKind )
            {
            // InternalUtilParser.g:4702:1: ( AttributeKind )
            // InternalUtilParser.g:4703:2: AttributeKind
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
    // InternalUtilParser.g:4713:1: rule__MaximumKind__Group__0 : rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 ;
    public final void rule__MaximumKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4717:1: ( rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1 )
            // InternalUtilParser.g:4718:2: rule__MaximumKind__Group__0__Impl rule__MaximumKind__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUtilParser.g:4725:1: rule__MaximumKind__Group__0__Impl : ( () ) ;
    public final void rule__MaximumKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4729:1: ( ( () ) )
            // InternalUtilParser.g:4730:1: ( () )
            {
            // InternalUtilParser.g:4730:1: ( () )
            // InternalUtilParser.g:4731:2: ()
            {
             before(grammarAccess.getMaximumKindAccess().getMaximumKindAction_0());
            // InternalUtilParser.g:4732:2: ()
            // InternalUtilParser.g:4732:3:
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
    // InternalUtilParser.g:4740:1: rule__MaximumKind__Group__1 : rule__MaximumKind__Group__1__Impl ;
    public final void rule__MaximumKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4744:1: ( rule__MaximumKind__Group__1__Impl )
            // InternalUtilParser.g:4745:2: rule__MaximumKind__Group__1__Impl
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
    // InternalUtilParser.g:4751:1: rule__MaximumKind__Group__1__Impl : ( MaximumKind ) ;
    public final void rule__MaximumKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4755:1: ( ( MaximumKind ) )
            // InternalUtilParser.g:4756:1: ( MaximumKind )
            {
            // InternalUtilParser.g:4756:1: ( MaximumKind )
            // InternalUtilParser.g:4757:2: MaximumKind
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
    // InternalUtilParser.g:4767:1: rule__MinimumKind__Group__0 : rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 ;
    public final void rule__MinimumKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4771:1: ( rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1 )
            // InternalUtilParser.g:4772:2: rule__MinimumKind__Group__0__Impl rule__MinimumKind__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalUtilParser.g:4779:1: rule__MinimumKind__Group__0__Impl : ( () ) ;
    public final void rule__MinimumKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4783:1: ( ( () ) )
            // InternalUtilParser.g:4784:1: ( () )
            {
            // InternalUtilParser.g:4784:1: ( () )
            // InternalUtilParser.g:4785:2: ()
            {
             before(grammarAccess.getMinimumKindAccess().getMinimumKindAction_0());
            // InternalUtilParser.g:4786:2: ()
            // InternalUtilParser.g:4786:3:
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
    // InternalUtilParser.g:4794:1: rule__MinimumKind__Group__1 : rule__MinimumKind__Group__1__Impl ;
    public final void rule__MinimumKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4798:1: ( rule__MinimumKind__Group__1__Impl )
            // InternalUtilParser.g:4799:2: rule__MinimumKind__Group__1__Impl
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
    // InternalUtilParser.g:4805:1: rule__MinimumKind__Group__1__Impl : ( MinimumKind ) ;
    public final void rule__MinimumKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4809:1: ( ( MinimumKind ) )
            // InternalUtilParser.g:4810:1: ( MinimumKind )
            {
            // InternalUtilParser.g:4810:1: ( MinimumKind )
            // InternalUtilParser.g:4811:2: MinimumKind
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
    // InternalUtilParser.g:4821:1: rule__SelectionKind__Group__0 : rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 ;
    public final void rule__SelectionKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4825:1: ( rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1 )
            // InternalUtilParser.g:4826:2: rule__SelectionKind__Group__0__Impl rule__SelectionKind__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUtilParser.g:4833:1: rule__SelectionKind__Group__0__Impl : ( () ) ;
    public final void rule__SelectionKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4837:1: ( ( () ) )
            // InternalUtilParser.g:4838:1: ( () )
            {
            // InternalUtilParser.g:4838:1: ( () )
            // InternalUtilParser.g:4839:2: ()
            {
             before(grammarAccess.getSelectionKindAccess().getSelectionKindAction_0());
            // InternalUtilParser.g:4840:2: ()
            // InternalUtilParser.g:4840:3:
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
    // InternalUtilParser.g:4848:1: rule__SelectionKind__Group__1 : rule__SelectionKind__Group__1__Impl ;
    public final void rule__SelectionKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4852:1: ( rule__SelectionKind__Group__1__Impl )
            // InternalUtilParser.g:4853:2: rule__SelectionKind__Group__1__Impl
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
    // InternalUtilParser.g:4859:1: rule__SelectionKind__Group__1__Impl : ( SelectionKind ) ;
    public final void rule__SelectionKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4863:1: ( ( SelectionKind ) )
            // InternalUtilParser.g:4864:1: ( SelectionKind )
            {
            // InternalUtilParser.g:4864:1: ( SelectionKind )
            // InternalUtilParser.g:4865:2: SelectionKind
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
    // InternalUtilParser.g:4875:1: rule__RangeKind__Group__0 : rule__RangeKind__Group__0__Impl rule__RangeKind__Group__1 ;
    public final void rule__RangeKind__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4879:1: ( rule__RangeKind__Group__0__Impl rule__RangeKind__Group__1 )
            // InternalUtilParser.g:4880:2: rule__RangeKind__Group__0__Impl rule__RangeKind__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalUtilParser.g:4887:1: rule__RangeKind__Group__0__Impl : ( () ) ;
    public final void rule__RangeKind__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4891:1: ( ( () ) )
            // InternalUtilParser.g:4892:1: ( () )
            {
            // InternalUtilParser.g:4892:1: ( () )
            // InternalUtilParser.g:4893:2: ()
            {
             before(grammarAccess.getRangeKindAccess().getRangeKindAction_0());
            // InternalUtilParser.g:4894:2: ()
            // InternalUtilParser.g:4894:3:
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
    // InternalUtilParser.g:4902:1: rule__RangeKind__Group__1 : rule__RangeKind__Group__1__Impl ;
    public final void rule__RangeKind__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4906:1: ( rule__RangeKind__Group__1__Impl )
            // InternalUtilParser.g:4907:2: rule__RangeKind__Group__1__Impl
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
    // InternalUtilParser.g:4913:1: rule__RangeKind__Group__1__Impl : ( RangeKind ) ;
    public final void rule__RangeKind__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4917:1: ( ( RangeKind ) )
            // InternalUtilParser.g:4918:1: ( RangeKind )
            {
            // InternalUtilParser.g:4918:1: ( RangeKind )
            // InternalUtilParser.g:4919:2: RangeKind
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


    // $ANTLR start "rule__LinuxDistributionValue__Group__0"
    // InternalUtilParser.g:4929:1: rule__LinuxDistributionValue__Group__0 : rule__LinuxDistributionValue__Group__0__Impl rule__LinuxDistributionValue__Group__1 ;
    public final void rule__LinuxDistributionValue__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4933:1: ( rule__LinuxDistributionValue__Group__0__Impl rule__LinuxDistributionValue__Group__1 )
            // InternalUtilParser.g:4934:2: rule__LinuxDistributionValue__Group__0__Impl rule__LinuxDistributionValue__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__LinuxDistributionValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinuxDistributionValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxDistributionValue__Group__0"


    // $ANTLR start "rule__LinuxDistributionValue__Group__0__Impl"
    // InternalUtilParser.g:4941:1: rule__LinuxDistributionValue__Group__0__Impl : ( () ) ;
    public final void rule__LinuxDistributionValue__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4945:1: ( ( () ) )
            // InternalUtilParser.g:4946:1: ( () )
            {
            // InternalUtilParser.g:4946:1: ( () )
            // InternalUtilParser.g:4947:2: ()
            {
             before(grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0());
            // InternalUtilParser.g:4948:2: ()
            // InternalUtilParser.g:4948:3:
            {
            }

             after(grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxDistributionValue__Group__0__Impl"


    // $ANTLR start "rule__LinuxDistributionValue__Group__1"
    // InternalUtilParser.g:4956:1: rule__LinuxDistributionValue__Group__1 : rule__LinuxDistributionValue__Group__1__Impl ;
    public final void rule__LinuxDistributionValue__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4960:1: ( rule__LinuxDistributionValue__Group__1__Impl )
            // InternalUtilParser.g:4961:2: rule__LinuxDistributionValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinuxDistributionValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxDistributionValue__Group__1"


    // $ANTLR start "rule__LinuxDistributionValue__Group__1__Impl"
    // InternalUtilParser.g:4967:1: rule__LinuxDistributionValue__Group__1__Impl : ( ( rule__LinuxDistributionValue__ValueAssignment_1 ) ) ;
    public final void rule__LinuxDistributionValue__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4971:1: ( ( ( rule__LinuxDistributionValue__ValueAssignment_1 ) ) )
            // InternalUtilParser.g:4972:1: ( ( rule__LinuxDistributionValue__ValueAssignment_1 ) )
            {
            // InternalUtilParser.g:4972:1: ( ( rule__LinuxDistributionValue__ValueAssignment_1 ) )
            // InternalUtilParser.g:4973:2: ( rule__LinuxDistributionValue__ValueAssignment_1 )
            {
             before(grammarAccess.getLinuxDistributionValueAccess().getValueAssignment_1());
            // InternalUtilParser.g:4974:2: ( rule__LinuxDistributionValue__ValueAssignment_1 )
            // InternalUtilParser.g:4974:3: rule__LinuxDistributionValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LinuxDistributionValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinuxDistributionValueAccess().getValueAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxDistributionValue__Group__1__Impl"


    // $ANTLR start "rule__UbuntuVersionValue__Group__0"
    // InternalUtilParser.g:4983:1: rule__UbuntuVersionValue__Group__0 : rule__UbuntuVersionValue__Group__0__Impl rule__UbuntuVersionValue__Group__1 ;
    public final void rule__UbuntuVersionValue__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4987:1: ( rule__UbuntuVersionValue__Group__0__Impl rule__UbuntuVersionValue__Group__1 )
            // InternalUtilParser.g:4988:2: rule__UbuntuVersionValue__Group__0__Impl rule__UbuntuVersionValue__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__UbuntuVersionValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UbuntuVersionValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UbuntuVersionValue__Group__0"


    // $ANTLR start "rule__UbuntuVersionValue__Group__0__Impl"
    // InternalUtilParser.g:4995:1: rule__UbuntuVersionValue__Group__0__Impl : ( () ) ;
    public final void rule__UbuntuVersionValue__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:4999:1: ( ( () ) )
            // InternalUtilParser.g:5000:1: ( () )
            {
            // InternalUtilParser.g:5000:1: ( () )
            // InternalUtilParser.g:5001:2: ()
            {
             before(grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0());
            // InternalUtilParser.g:5002:2: ()
            // InternalUtilParser.g:5002:3:
            {
            }

             after(grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0());

            }


            }

        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UbuntuVersionValue__Group__0__Impl"


    // $ANTLR start "rule__UbuntuVersionValue__Group__1"
    // InternalUtilParser.g:5010:1: rule__UbuntuVersionValue__Group__1 : rule__UbuntuVersionValue__Group__1__Impl ;
    public final void rule__UbuntuVersionValue__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5014:1: ( rule__UbuntuVersionValue__Group__1__Impl )
            // InternalUtilParser.g:5015:2: rule__UbuntuVersionValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UbuntuVersionValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UbuntuVersionValue__Group__1"


    // $ANTLR start "rule__UbuntuVersionValue__Group__1__Impl"
    // InternalUtilParser.g:5021:1: rule__UbuntuVersionValue__Group__1__Impl : ( ( rule__UbuntuVersionValue__ValueAssignment_1 ) ) ;
    public final void rule__UbuntuVersionValue__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5025:1: ( ( ( rule__UbuntuVersionValue__ValueAssignment_1 ) ) )
            // InternalUtilParser.g:5026:1: ( ( rule__UbuntuVersionValue__ValueAssignment_1 ) )
            {
            // InternalUtilParser.g:5026:1: ( ( rule__UbuntuVersionValue__ValueAssignment_1 ) )
            // InternalUtilParser.g:5027:2: ( rule__UbuntuVersionValue__ValueAssignment_1 )
            {
             before(grammarAccess.getUbuntuVersionValueAccess().getValueAssignment_1());
            // InternalUtilParser.g:5028:2: ( rule__UbuntuVersionValue__ValueAssignment_1 )
            // InternalUtilParser.g:5028:3: rule__UbuntuVersionValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UbuntuVersionValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUbuntuVersionValueAccess().getValueAssignment_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UbuntuVersionValue__Group__1__Impl"


    // $ANTLR start "rule__NameOperatingSystemProperty__NameAssignment_3"
    // InternalUtilParser.g:5037:1: rule__NameOperatingSystemProperty__NameAssignment_3 : ( ( Os_name ) ) ;
    public final void rule__NameOperatingSystemProperty__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5041:1: ( ( ( Os_name ) ) )
            // InternalUtilParser.g:5042:2: ( ( Os_name ) )
            {
            // InternalUtilParser.g:5042:2: ( ( Os_name ) )
            // InternalUtilParser.g:5043:3: ( Os_name )
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());
            // InternalUtilParser.g:5044:3: ( Os_name )
            // InternalUtilParser.g:5045:4: Os_name
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());
            match(input,Os_name,FOLLOW_2);
             after(grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());

            }

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__NameAssignment_3"


    // $ANTLR start "rule__NameOperatingSystemProperty__KindAssignment_6"
    // InternalUtilParser.g:5056:1: rule__NameOperatingSystemProperty__KindAssignment_6 : ( ruleAttributeKind ) ;
    public final void rule__NameOperatingSystemProperty__KindAssignment_6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5060:1: ( ( ruleAttributeKind ) )
            // InternalUtilParser.g:5061:2: ( ruleAttributeKind )
            {
            // InternalUtilParser.g:5061:2: ( ruleAttributeKind )
            // InternalUtilParser.g:5062:3: ruleAttributeKind
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());
            pushFollow(FOLLOW_2);
            ruleAttributeKind();

            state._fsp--;

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__KindAssignment_6"


    // $ANTLR start "rule__NameOperatingSystemProperty__DescriptionAssignment_7_1"
    // InternalUtilParser.g:5071:1: rule__NameOperatingSystemProperty__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__NameOperatingSystemProperty__DescriptionAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5075:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5076:2: ( ruleEString )
            {
            // InternalUtilParser.g:5076:2: ( ruleEString )
            // InternalUtilParser.g:5077:3: ruleEString
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__DescriptionAssignment_7_1"


    // $ANTLR start "rule__NameOperatingSystemProperty__ValueAssignment_8_1"
    // InternalUtilParser.g:5086:1: rule__NameOperatingSystemProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__NameOperatingSystemProperty__ValueAssignment_8_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5090:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5091:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5091:2: ( rulePropertyValue )
            // InternalUtilParser.g:5092:3: rulePropertyValue
            {
             before(grammarAccess.getNameOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getNameOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameOperatingSystemProperty__ValueAssignment_8_1"


    // $ANTLR start "rule__VersionOperatingSystemProperty__NameAssignment_3"
    // InternalUtilParser.g:5101:1: rule__VersionOperatingSystemProperty__NameAssignment_3 : ( ( Os_version ) ) ;
    public final void rule__VersionOperatingSystemProperty__NameAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5105:1: ( ( ( Os_version ) ) )
            // InternalUtilParser.g:5106:2: ( ( Os_version ) )
            {
            // InternalUtilParser.g:5106:2: ( ( Os_version ) )
            // InternalUtilParser.g:5107:3: ( Os_version )
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());
            // InternalUtilParser.g:5108:3: ( Os_version )
            // InternalUtilParser.g:5109:4: Os_version
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());
            match(input,Os_version,FOLLOW_2);
             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());

            }

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__NameAssignment_3"


    // $ANTLR start "rule__VersionOperatingSystemProperty__KindAssignment_6"
    // InternalUtilParser.g:5120:1: rule__VersionOperatingSystemProperty__KindAssignment_6 : ( ruleAttributeKind ) ;
    public final void rule__VersionOperatingSystemProperty__KindAssignment_6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5124:1: ( ( ruleAttributeKind ) )
            // InternalUtilParser.g:5125:2: ( ruleAttributeKind )
            {
            // InternalUtilParser.g:5125:2: ( ruleAttributeKind )
            // InternalUtilParser.g:5126:3: ruleAttributeKind
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());
            pushFollow(FOLLOW_2);
            ruleAttributeKind();

            state._fsp--;

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__KindAssignment_6"


    // $ANTLR start "rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1"
    // InternalUtilParser.g:5135:1: rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5139:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5140:2: ( ruleEString )
            {
            // InternalUtilParser.g:5140:2: ( ruleEString )
            // InternalUtilParser.g:5141:3: ruleEString
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__DescriptionAssignment_7_1"


    // $ANTLR start "rule__VersionOperatingSystemProperty__ValueAssignment_8_1"
    // InternalUtilParser.g:5150:1: rule__VersionOperatingSystemProperty__ValueAssignment_8_1 : ( rulePropertyValue ) ;
    public final void rule__VersionOperatingSystemProperty__ValueAssignment_8_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5154:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5155:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5155:2: ( rulePropertyValue )
            // InternalUtilParser.g:5156:3: rulePropertyValue
            {
             before(grammarAccess.getVersionOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getVersionOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionOperatingSystemProperty__ValueAssignment_8_1"


    // $ANTLR start "rule__PropertyAttribute__NameAssignment_2"
    // InternalUtilParser.g:5165:1: rule__PropertyAttribute__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertyAttribute__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5169:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5170:2: ( ruleEString )
            {
            // InternalUtilParser.g:5170:2: ( ruleEString )
            // InternalUtilParser.g:5171:3: ruleEString
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
    // InternalUtilParser.g:5180:1: rule__PropertyAttribute__KindAssignment_5 : ( ruleAttributeKind ) ;
    public final void rule__PropertyAttribute__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5184:1: ( ( ruleAttributeKind ) )
            // InternalUtilParser.g:5185:2: ( ruleAttributeKind )
            {
            // InternalUtilParser.g:5185:2: ( ruleAttributeKind )
            // InternalUtilParser.g:5186:3: ruleAttributeKind
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
    // InternalUtilParser.g:5195:1: rule__PropertyAttribute__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertyAttribute__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5199:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5200:2: ( ruleEString )
            {
            // InternalUtilParser.g:5200:2: ( ruleEString )
            // InternalUtilParser.g:5201:3: ruleEString
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
    // InternalUtilParser.g:5210:1: rule__PropertyAttribute__ValueAssignment_7_1 : ( rulePropertyValue ) ;
    public final void rule__PropertyAttribute__ValueAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5214:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5215:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5215:2: ( rulePropertyValue )
            // InternalUtilParser.g:5216:3: rulePropertyValue
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
    // InternalUtilParser.g:5225:1: rule__PropertyMaximun__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertyMaximun__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5229:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5230:2: ( ruleEString )
            {
            // InternalUtilParser.g:5230:2: ( ruleEString )
            // InternalUtilParser.g:5231:3: ruleEString
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
    // InternalUtilParser.g:5240:1: rule__PropertyMaximun__KindAssignment_5 : ( ruleMaximumKind ) ;
    public final void rule__PropertyMaximun__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5244:1: ( ( ruleMaximumKind ) )
            // InternalUtilParser.g:5245:2: ( ruleMaximumKind )
            {
            // InternalUtilParser.g:5245:2: ( ruleMaximumKind )
            // InternalUtilParser.g:5246:3: ruleMaximumKind
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
    // InternalUtilParser.g:5255:1: rule__PropertyMaximun__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertyMaximun__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5259:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5260:2: ( ruleEString )
            {
            // InternalUtilParser.g:5260:2: ( ruleEString )
            // InternalUtilParser.g:5261:3: ruleEString
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
    // InternalUtilParser.g:5270:1: rule__PropertyMaximun__ValueAssignment_7_1 : ( rulePropertyValue ) ;
    public final void rule__PropertyMaximun__ValueAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5274:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5275:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5275:2: ( rulePropertyValue )
            // InternalUtilParser.g:5276:3: rulePropertyValue
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
    // InternalUtilParser.g:5285:1: rule__PropertyMinimum__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertyMinimum__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5289:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5290:2: ( ruleEString )
            {
            // InternalUtilParser.g:5290:2: ( ruleEString )
            // InternalUtilParser.g:5291:3: ruleEString
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
    // InternalUtilParser.g:5300:1: rule__PropertyMinimum__KindAssignment_5 : ( ruleMinimumKind ) ;
    public final void rule__PropertyMinimum__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5304:1: ( ( ruleMinimumKind ) )
            // InternalUtilParser.g:5305:2: ( ruleMinimumKind )
            {
            // InternalUtilParser.g:5305:2: ( ruleMinimumKind )
            // InternalUtilParser.g:5306:3: ruleMinimumKind
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
    // InternalUtilParser.g:5315:1: rule__PropertyMinimum__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertyMinimum__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5319:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5320:2: ( ruleEString )
            {
            // InternalUtilParser.g:5320:2: ( ruleEString )
            // InternalUtilParser.g:5321:3: ruleEString
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
    // InternalUtilParser.g:5330:1: rule__PropertyMinimum__ValueAssignment_7_1 : ( rulePropertyValue ) ;
    public final void rule__PropertyMinimum__ValueAssignment_7_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5334:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5335:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5335:2: ( rulePropertyValue )
            // InternalUtilParser.g:5336:3: rulePropertyValue
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
    // InternalUtilParser.g:5345:1: rule__PropertySelection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertySelection__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5349:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5350:2: ( ruleEString )
            {
            // InternalUtilParser.g:5350:2: ( ruleEString )
            // InternalUtilParser.g:5351:3: ruleEString
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
    // InternalUtilParser.g:5360:1: rule__PropertySelection__KindAssignment_5 : ( ruleSelectionKind ) ;
    public final void rule__PropertySelection__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5364:1: ( ( ruleSelectionKind ) )
            // InternalUtilParser.g:5365:2: ( ruleSelectionKind )
            {
            // InternalUtilParser.g:5365:2: ( ruleSelectionKind )
            // InternalUtilParser.g:5366:3: ruleSelectionKind
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
    // InternalUtilParser.g:5375:1: rule__PropertySelection__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertySelection__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5379:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5380:2: ( ruleEString )
            {
            // InternalUtilParser.g:5380:2: ( ruleEString )
            // InternalUtilParser.g:5381:3: ruleEString
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
    // InternalUtilParser.g:5390:1: rule__PropertySelection__ValueAssignment_7_3 : ( rulePropertyValue ) ;
    public final void rule__PropertySelection__ValueAssignment_7_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5394:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5395:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5395:2: ( rulePropertyValue )
            // InternalUtilParser.g:5396:3: rulePropertyValue
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
    // InternalUtilParser.g:5405:1: rule__PropertySelection__ValueAssignment_7_4_1 : ( rulePropertyValue ) ;
    public final void rule__PropertySelection__ValueAssignment_7_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5409:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5410:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5410:2: ( rulePropertyValue )
            // InternalUtilParser.g:5411:3: rulePropertyValue
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
    // InternalUtilParser.g:5420:1: rule__PropertyRange__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertyRange__NameAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5424:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5425:2: ( ruleEString )
            {
            // InternalUtilParser.g:5425:2: ( ruleEString )
            // InternalUtilParser.g:5426:3: ruleEString
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
    // InternalUtilParser.g:5435:1: rule__PropertyRange__KindAssignment_5 : ( ruleRangeKind ) ;
    public final void rule__PropertyRange__KindAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5439:1: ( ( ruleRangeKind ) )
            // InternalUtilParser.g:5440:2: ( ruleRangeKind )
            {
            // InternalUtilParser.g:5440:2: ( ruleRangeKind )
            // InternalUtilParser.g:5441:3: ruleRangeKind
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
    // InternalUtilParser.g:5450:1: rule__PropertyRange__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__PropertyRange__DescriptionAssignment_6_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5454:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5455:2: ( ruleEString )
            {
            // InternalUtilParser.g:5455:2: ( ruleEString )
            // InternalUtilParser.g:5456:3: ruleEString
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
    // InternalUtilParser.g:5465:1: rule__PropertyRange__ValueAssignment_7_3 : ( rulePropertyValue ) ;
    public final void rule__PropertyRange__ValueAssignment_7_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5469:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5470:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5470:2: ( rulePropertyValue )
            // InternalUtilParser.g:5471:3: rulePropertyValue
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
    // InternalUtilParser.g:5480:1: rule__PropertyRange__ValueAssignment_7_5 : ( rulePropertyValue ) ;
    public final void rule__PropertyRange__ValueAssignment_7_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5484:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5485:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5485:2: ( rulePropertyValue )
            // InternalUtilParser.g:5486:3: rulePropertyValue
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
    // InternalUtilParser.g:5495:1: rule__PropertyValueInt__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__PropertyValueInt__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5499:1: ( ( ruleInteger0 ) )
            // InternalUtilParser.g:5500:2: ( ruleInteger0 )
            {
            // InternalUtilParser.g:5500:2: ( ruleInteger0 )
            // InternalUtilParser.g:5501:3: ruleInteger0
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
    // InternalUtilParser.g:5510:1: rule__PropertyValueDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__PropertyValueDouble__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5514:1: ( ( ruleDouble0 ) )
            // InternalUtilParser.g:5515:2: ( ruleDouble0 )
            {
            // InternalUtilParser.g:5515:2: ( ruleDouble0 )
            // InternalUtilParser.g:5516:3: ruleDouble0
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
    // InternalUtilParser.g:5525:1: rule__PropertyValueString__ValueAssignment : ( ruleEString ) ;
    public final void rule__PropertyValueString__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5529:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5530:2: ( ruleEString )
            {
            // InternalUtilParser.g:5530:2: ( ruleEString )
            // InternalUtilParser.g:5531:3: ruleEString
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


    // $ANTLR start "rule__PropertyValueList__ValueAssignment_2"
    // InternalUtilParser.g:5540:1: rule__PropertyValueList__ValueAssignment_2 : ( rulePropertyValue ) ;
    public final void rule__PropertyValueList__ValueAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5544:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5545:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5545:2: ( rulePropertyValue )
            // InternalUtilParser.g:5546:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__ValueAssignment_2"


    // $ANTLR start "rule__PropertyValueList__ValueAssignment_3_1"
    // InternalUtilParser.g:5555:1: rule__PropertyValueList__ValueAssignment_3_1 : ( rulePropertyValue ) ;
    public final void rule__PropertyValueList__ValueAssignment_3_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5559:1: ( ( rulePropertyValue ) )
            // InternalUtilParser.g:5560:2: ( rulePropertyValue )
            {
            // InternalUtilParser.g:5560:2: ( rulePropertyValue )
            // InternalUtilParser.g:5561:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_3_1_0());
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_3_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueList__ValueAssignment_3_1"


    // $ANTLR start "rule__ProcessorArchitectureValue__ValueAssignment"
    // InternalUtilParser.g:5570:1: rule__ProcessorArchitectureValue__ValueAssignment : ( ruleProcessorArchitectureType ) ;
    public final void rule__ProcessorArchitectureValue__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5574:1: ( ( ruleProcessorArchitectureType ) )
            // InternalUtilParser.g:5575:2: ( ruleProcessorArchitectureType )
            {
            // InternalUtilParser.g:5575:2: ( ruleProcessorArchitectureType )
            // InternalUtilParser.g:5576:3: ruleProcessorArchitectureType
            {
             before(grammarAccess.getProcessorArchitectureValueAccess().getValueProcessorArchitectureTypeEnumRuleCall_0());
            pushFollow(FOLLOW_2);
            ruleProcessorArchitectureType();

            state._fsp--;

             after(grammarAccess.getProcessorArchitectureValueAccess().getValueProcessorArchitectureTypeEnumRuleCall_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorArchitectureValue__ValueAssignment"


    // $ANTLR start "rule__ResourceType__NameAssignment_1"
    // InternalUtilParser.g:5585:1: rule__ResourceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ResourceType__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5589:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5590:2: ( ruleEString )
            {
            // InternalUtilParser.g:5590:2: ( ruleEString )
            // InternalUtilParser.g:5591:3: ruleEString
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
    // InternalUtilParser.g:5600:1: rule__CommunicationType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CommunicationType__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5604:1: ( ( ruleEString ) )
            // InternalUtilParser.g:5605:2: ( ruleEString )
            {
            // InternalUtilParser.g:5605:2: ( ruleEString )
            // InternalUtilParser.g:5606:3: ruleEString
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


    // $ANTLR start "rule__LinuxDistributionValue__ValueAssignment_1"
    // InternalUtilParser.g:5615:1: rule__LinuxDistributionValue__ValueAssignment_1 : ( ruleLinuxDistribution ) ;
    public final void rule__LinuxDistributionValue__ValueAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5619:1: ( ( ruleLinuxDistribution ) )
            // InternalUtilParser.g:5620:2: ( ruleLinuxDistribution )
            {
            // InternalUtilParser.g:5620:2: ( ruleLinuxDistribution )
            // InternalUtilParser.g:5621:3: ruleLinuxDistribution
            {
             before(grammarAccess.getLinuxDistributionValueAccess().getValueLinuxDistributionEnumRuleCall_1_0());
            pushFollow(FOLLOW_2);
            ruleLinuxDistribution();

            state._fsp--;

             after(grammarAccess.getLinuxDistributionValueAccess().getValueLinuxDistributionEnumRuleCall_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinuxDistributionValue__ValueAssignment_1"


    // $ANTLR start "rule__UbuntuVersionValue__ValueAssignment_1"
    // InternalUtilParser.g:5630:1: rule__UbuntuVersionValue__ValueAssignment_1 : ( ruleUbuntuVersion ) ;
    public final void rule__UbuntuVersionValue__ValueAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalUtilParser.g:5634:1: ( ( ruleUbuntuVersion ) )
            // InternalUtilParser.g:5635:2: ( ruleUbuntuVersion )
            {
            // InternalUtilParser.g:5635:2: ( ruleUbuntuVersion )
            // InternalUtilParser.g:5636:3: ruleUbuntuVersion
            {
             before(grammarAccess.getUbuntuVersionValueAccess().getValueUbuntuVersionEnumRuleCall_1_0());
            pushFollow(FOLLOW_2);
            ruleUbuntuVersion();

            state._fsp--;

             after(grammarAccess.getUbuntuVersionValueAccess().getValueUbuntuVersionEnumRuleCall_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UbuntuVersionValue__ValueAssignment_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\36\1\31\1\45\2\43\1\30\1\6\5\uffff";
    static final String dfa_3s = "\1\36\1\31\1\47\2\43\1\30\1\16\5\uffff";
    static final String dfa_4s = "\7\uffff\1\4\1\5\1\1\1\2\1\3";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\11\1\7\1\uffff\1\12\1\13\3\uffff\1\10",
            "",
            "",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1083:1: rule__AbstractProperty__Alternatives : ( ( rulePropertyAttribute ) | ( rulePropertyMaximun ) | ( rulePropertyMinimum ) | ( rulePropertySelection ) | ( rulePropertyRange ) );";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000100100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000AB20EC0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000C00000L});

}
