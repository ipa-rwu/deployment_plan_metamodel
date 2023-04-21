package de.fraunhofer.ipa.deplyoment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.deplyoment.services.ImplementationDescriptionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalImplementationDescriptionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SoftwareConfigurationParameter", "ImplementationDescription", "IncludeSoftwareComponent", "ExecutionRequirement", "LinuxOpertingSystem", "MacOSOpertingSystem", "SoftwareDependency", "DeviceRequirement", "HWSWParemeter", "AttributeKind", "SelectionKind", "Description", "MaximumKind", "MinimumKind", "Properties", "Repository", "Processor", "RangeKind", "Container", "Ethernet", "Version", "Debian", "Ubuntu", "Value", "Arm64", "Focal", "Jammy", "Kind", "Name", "Type", "Wlan", "Url", "Git", "X86", "HyphenMinus", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int AttributeKind=13;
    public static final int SoftwareConfigurationParameter=4;
    public static final int Name=32;
    public static final int Container=22;
    public static final int Debian=25;
    public static final int Version=24;
    public static final int Kind=31;
    public static final int Ubuntu=26;
    public static final int RULE_DEDENT=44;
    public static final int SoftwareDependency=10;
    public static final int LinuxOpertingSystem=8;
    public static final int RULE_ID=45;
    public static final int RULE_DIGIT=39;
    public static final int ExecutionRequirement=7;
    public static final int HWSWParemeter=12;
    public static final int SelectionKind=14;
    public static final int Arm64=28;
    public static final int Git=36;
    public static final int IncludeSoftwareComponent=6;
    public static final int RULE_INT=46;
    public static final int Ethernet=23;
    public static final int Value=27;
    public static final int RULE_ML_COMMENT=48;
    public static final int Description=15;
    public static final int Processor=20;
    public static final int RULE_STRING=47;
    public static final int Focal=29;
    public static final int Wlan=34;
    public static final int Properties=18;
    public static final int Url=35;
    public static final int RULE_SL_COMMENT=42;
    public static final int ImplementationDescription=5;
    public static final int HyphenMinus=38;
    public static final int RULE_DOUBLE=41;
    public static final int X86=37;
    public static final int RULE_DECINT=40;
    public static final int MinimumKind=17;
    public static final int EOF=-1;
    public static final int RULE_INDENT=43;
    public static final int Jammy=30;
    public static final int RULE_WS=49;
    public static final int MaximumKind=16;
    public static final int RULE_ANY_OTHER=50;
    public static final int RangeKind=21;
    public static final int Repository=19;
    public static final int Type=33;
    public static final int MacOSOpertingSystem=9;
    public static final int DeviceRequirement=11;

    // delegates
    // delegators


        public InternalImplementationDescriptionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalImplementationDescriptionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalImplementationDescriptionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalImplementationDescriptionParser.g"; }



        private ImplementationDescriptionGrammarAccess grammarAccess;

        public InternalImplementationDescriptionParser(TokenStream input, ImplementationDescriptionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
            return "ImplementationDescription";
        }

        @Override
        protected ImplementationDescriptionGrammarAccess getGrammarAccess() {
            return grammarAccess;
        }




    // $ANTLR start "entryRuleImplementationDescription"
    // InternalImplementationDescriptionParser.g:58:1: entryRuleImplementationDescription returns [EObject current=null] : iv_ruleImplementationDescription= ruleImplementationDescription EOF ;
    public final EObject entryRuleImplementationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDescription = null;


        try {
            // InternalImplementationDescriptionParser.g:58:66: (iv_ruleImplementationDescription= ruleImplementationDescription EOF )
            // InternalImplementationDescriptionParser.g:59:2: iv_ruleImplementationDescription= ruleImplementationDescription EOF
            {
             newCompositeNode(grammarAccess.getImplementationDescriptionRule());
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDescription=ruleImplementationDescription();

            state._fsp--;

             current =iv_ruleImplementationDescription;
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
    // $ANTLR end "entryRuleImplementationDescription"


    // $ANTLR start "ruleImplementationDescription"
    // InternalImplementationDescriptionParser.g:65:1: ruleImplementationDescription returns [EObject current=null] : (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT ) ;
    public final EObject ruleImplementationDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_INDENT_5=null;
        Token this_DEDENT_10=null;
        Token otherlv_11=null;
        Token this_INDENT_12=null;
        Token this_DEDENT_14=null;
        Token this_DEDENT_15=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_softwareDependency_7_0 = null;

        AntlrDatatypeRuleToken lv_softwareDependency_9_0 = null;

        EObject lv_includeSoftwareComponent_13_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:71:2: ( (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:72:2: (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:72:2: (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:73:3: otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ImplementationDescription,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getImplementationDescriptionAccess().getImplementationDescriptionKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_1, grammarAccess.getImplementationDescriptionAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getImplementationDescriptionAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:85:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:86:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:86:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:87:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getImplementationDescriptionRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:104:3: (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SoftwareDependency) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:105:4: otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,SoftwareDependency,FOLLOW_3);

                                    newLeafNode(otherlv_4, grammarAccess.getImplementationDescriptionAccess().getSoftwareDependencyKeyword_4_0());

                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_5, grammarAccess.getImplementationDescriptionAccess().getINDENTTerminalRuleCall_4_1());


                                    newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getPreListElementParserRuleCall_4_2());

                    pushFollow(FOLLOW_5);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:120:4: ( (lv_softwareDependency_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:121:5: (lv_softwareDependency_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:121:5: (lv_softwareDependency_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:122:6: lv_softwareDependency_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getSoftwareDependencyEStringParserRuleCall_4_3_0());

                    pushFollow(FOLLOW_8);
                    lv_softwareDependency_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getImplementationDescriptionRule());
                                            }
                                            add(
                                                current,
                                                "softwareDependency",
                                                lv_softwareDependency_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalImplementationDescriptionParser.g:139:4: ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==HyphenMinus) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:140:5: rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) )
                            {

                                                newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getPreListElementParserRuleCall_4_4_0());

                            pushFollow(FOLLOW_5);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:147:5: ( (lv_softwareDependency_9_0= ruleEString ) )
                            // InternalImplementationDescriptionParser.g:148:6: (lv_softwareDependency_9_0= ruleEString )
                            {
                            // InternalImplementationDescriptionParser.g:148:6: (lv_softwareDependency_9_0= ruleEString )
                            // InternalImplementationDescriptionParser.g:149:7: lv_softwareDependency_9_0= ruleEString
                            {

                                                        newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getSoftwareDependencyEStringParserRuleCall_4_4_1_0());

                            pushFollow(FOLLOW_8);
                            lv_softwareDependency_9_0=ruleEString();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getImplementationDescriptionRule());
                                                        }
                                                        add(
                                                            current,
                                                            "softwareDependency",
                                                            lv_softwareDependency_9_0,
                                                            "de.fraunhofer.ipa.deployment.Util.EString");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop1;
                        }
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_9);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getImplementationDescriptionAccess().getDEDENTTerminalRuleCall_4_5());


                    }
                    break;

            }

            otherlv_11=(Token)match(input,IncludeSoftwareComponent,FOLLOW_3);

                        newLeafNode(otherlv_11, grammarAccess.getImplementationDescriptionAccess().getIncludeSoftwareComponentKeyword_5());

            this_INDENT_12=(Token)match(input,RULE_INDENT,FOLLOW_7);

                        newLeafNode(this_INDENT_12, grammarAccess.getImplementationDescriptionAccess().getINDENTTerminalRuleCall_6());

            // InternalImplementationDescriptionParser.g:180:3: ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==HyphenMinus) ) {
                    alt3=1;
                }


                switch (alt3) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:181:4: (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent )
                    {
                    // InternalImplementationDescriptionParser.g:181:4: (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent )
                    // InternalImplementationDescriptionParser.g:182:5: lv_includeSoftwareComponent_13_0= ruleSoftwareComponent
                    {

                                        newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getIncludeSoftwareComponentSoftwareComponentParserRuleCall_7_0());

                    pushFollow(FOLLOW_8);
                    lv_includeSoftwareComponent_13_0=ruleSoftwareComponent();

                    state._fsp--;


                                        if (current==null) {
                                            current = createModelElementForParent(grammarAccess.getImplementationDescriptionRule());
                                        }
                                        add(
                                            current,
                                            "includeSoftwareComponent",
                                            lv_includeSoftwareComponent_13_0,
                                            "de.fraunhofer.ipa.deplyoment.ImplementationDescription.SoftwareComponent");
                                        afterParserOrEnumRuleCall();


                    }


                    }
                    break;

                default :
                    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                        newLeafNode(this_DEDENT_14, grammarAccess.getImplementationDescriptionAccess().getDEDENTTerminalRuleCall_8());

            this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_15, grammarAccess.getImplementationDescriptionAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleImplementationDescription"


    // $ANTLR start "entryRuleExecutionRequirement"
    // InternalImplementationDescriptionParser.g:211:1: entryRuleExecutionRequirement returns [EObject current=null] : iv_ruleExecutionRequirement= ruleExecutionRequirement EOF ;
    public final EObject entryRuleExecutionRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:211:61: (iv_ruleExecutionRequirement= ruleExecutionRequirement EOF )
            // InternalImplementationDescriptionParser.g:212:2: iv_ruleExecutionRequirement= ruleExecutionRequirement EOF
            {
             newCompositeNode(grammarAccess.getExecutionRequirementRule());
            pushFollow(FOLLOW_1);
            iv_ruleExecutionRequirement=ruleExecutionRequirement();

            state._fsp--;

             current =iv_ruleExecutionRequirement;
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
    // $ANTLR end "entryRuleExecutionRequirement"


    // $ANTLR start "ruleExecutionRequirement"
    // InternalImplementationDescriptionParser.g:218:1: ruleExecutionRequirement returns [EObject current=null] : (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement ) ;
    public final EObject ruleExecutionRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceRequirement_0 = null;

        EObject this_SoftwareConfigurationRequirement_1 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:224:2: ( (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement ) )
            // InternalImplementationDescriptionParser.g:225:2: (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement )
            {
            // InternalImplementationDescriptionParser.g:225:2: (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DeviceRequirement) ) {
                alt4=1;
            }
            else if ( (LA4_0==SoftwareConfigurationParameter) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:226:3: this_DeviceRequirement_0= ruleDeviceRequirement
                    {

                                newCompositeNode(grammarAccess.getExecutionRequirementAccess().getDeviceRequirementParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_DeviceRequirement_0=ruleDeviceRequirement();

                    state._fsp--;


                                current = this_DeviceRequirement_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:235:3: this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement
                    {

                                newCompositeNode(grammarAccess.getExecutionRequirementAccess().getSoftwareConfigurationRequirementParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_SoftwareConfigurationRequirement_1=ruleSoftwareConfigurationRequirement();

                    state._fsp--;


                                current = this_SoftwareConfigurationRequirement_1;
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
    // $ANTLR end "ruleExecutionRequirement"


    // $ANTLR start "entryRuleSoftwareComponent"
    // InternalImplementationDescriptionParser.g:247:1: entryRuleSoftwareComponent returns [EObject current=null] : iv_ruleSoftwareComponent= ruleSoftwareComponent EOF ;
    public final EObject entryRuleSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareComponent = null;


        try {
            // InternalImplementationDescriptionParser.g:247:58: (iv_ruleSoftwareComponent= ruleSoftwareComponent EOF )
            // InternalImplementationDescriptionParser.g:248:2: iv_ruleSoftwareComponent= ruleSoftwareComponent EOF
            {
             newCompositeNode(grammarAccess.getSoftwareComponentRule());
            pushFollow(FOLLOW_1);
            iv_ruleSoftwareComponent=ruleSoftwareComponent();

            state._fsp--;

             current =iv_ruleSoftwareComponent;
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
    // $ANTLR end "entryRuleSoftwareComponent"


    // $ANTLR start "ruleSoftwareComponent"
    // InternalImplementationDescriptionParser.g:254:1: ruleSoftwareComponent returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
    public final EObject ruleSoftwareComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token this_INDENT_6=null;
        Token this_DEDENT_8=null;
        Token otherlv_9=null;
        Token this_INDENT_10=null;
        Token this_DEDENT_12=null;
        Token this_DEDENT_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_repository_7_0 = null;

        EObject lv_executionRequirement_11_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:260:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:261:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:261:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:262:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:262:3: ()
            // InternalImplementationDescriptionParser.g:263:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getSoftwareComponentAccess().getSoftwareComponentAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getSoftwareComponentAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getSoftwareComponentAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:280:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:281:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:281:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:282:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getSoftwareComponentAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getSoftwareComponentRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_11);

                        newLeafNode(this_INDENT_4, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Repository,FOLLOW_3);

                        newLeafNode(otherlv_5, grammarAccess.getSoftwareComponentAccess().getRepositoryKeyword_5());

            this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_12);

                        newLeafNode(this_INDENT_6, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_6());

            // InternalImplementationDescriptionParser.g:311:3: ( (lv_repository_7_0= ruleRepository ) )
            // InternalImplementationDescriptionParser.g:312:4: (lv_repository_7_0= ruleRepository )
            {
            // InternalImplementationDescriptionParser.g:312:4: (lv_repository_7_0= ruleRepository )
            // InternalImplementationDescriptionParser.g:313:5: lv_repository_7_0= ruleRepository
            {

                                newCompositeNode(grammarAccess.getSoftwareComponentAccess().getRepositoryRepositoryParserRuleCall_7_0());

            pushFollow(FOLLOW_10);
            lv_repository_7_0=ruleRepository();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getSoftwareComponentRule());
                                }
                                set(
                                    current,
                                    "repository",
                                    lv_repository_7_0,
                                    "de.fraunhofer.ipa.deplyoment.ImplementationDescription.Repository");
                                afterParserOrEnumRuleCall();


            }


            }

            this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_13);

                        newLeafNode(this_DEDENT_8, grammarAccess.getSoftwareComponentAccess().getDEDENTTerminalRuleCall_8());

            // InternalImplementationDescriptionParser.g:334:3: (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ExecutionRequirement) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:335:4: otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,ExecutionRequirement,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getSoftwareComponentAccess().getExecutionRequirementKeyword_9_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_14);

                                    newLeafNode(this_INDENT_10, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_9_1());

                    // InternalImplementationDescriptionParser.g:343:4: ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==SoftwareConfigurationParameter||LA5_0==DeviceRequirement) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:344:5: (lv_executionRequirement_11_0= ruleExecutionRequirement )
                            {
                            // InternalImplementationDescriptionParser.g:344:5: (lv_executionRequirement_11_0= ruleExecutionRequirement )
                            // InternalImplementationDescriptionParser.g:345:6: lv_executionRequirement_11_0= ruleExecutionRequirement
                            {

                                                    newCompositeNode(grammarAccess.getSoftwareComponentAccess().getExecutionRequirementExecutionRequirementParserRuleCall_9_2_0());

                            pushFollow(FOLLOW_15);
                            lv_executionRequirement_11_0=ruleExecutionRequirement();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getSoftwareComponentRule());
                                                    }
                                                    add(
                                                        current,
                                                        "executionRequirement",
                                                        lv_executionRequirement_11_0,
                                                        "de.fraunhofer.ipa.deplyoment.ImplementationDescription.ExecutionRequirement");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_12, grammarAccess.getSoftwareComponentAccess().getDEDENTTerminalRuleCall_9_3());


                    }
                    break;

            }

            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_13, grammarAccess.getSoftwareComponentAccess().getDEDENTTerminalRuleCall_10());


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
    // $ANTLR end "ruleSoftwareComponent"


    // $ANTLR start "entryRuleRepository"
    // InternalImplementationDescriptionParser.g:375:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalImplementationDescriptionParser.g:375:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalImplementationDescriptionParser.g:376:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule());
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository;
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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalImplementationDescriptionParser.g:382:1: ruleRepository returns [EObject current=null] : (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_version_5_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:388:2: ( (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:389:2: (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:389:2: (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:390:3: otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_16);

                        newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getTypeKeyword_0());

            // InternalImplementationDescriptionParser.g:394:3: ( (lv_type_1_0= ruleRepositoryType ) )
            // InternalImplementationDescriptionParser.g:395:4: (lv_type_1_0= ruleRepositoryType )
            {
            // InternalImplementationDescriptionParser.g:395:4: (lv_type_1_0= ruleRepositoryType )
            // InternalImplementationDescriptionParser.g:396:5: lv_type_1_0= ruleRepositoryType
            {

                                newCompositeNode(grammarAccess.getRepositoryAccess().getTypeRepositoryTypeParserRuleCall_1_0());

            pushFollow(FOLLOW_17);
            lv_type_1_0=ruleRepositoryType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getRepositoryRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_1_0,
                                    "de.fraunhofer.ipa.deplyoment.ImplementationDescription.RepositoryType");
                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_2=(Token)match(input,Url,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getUrlKeyword_2());

            // InternalImplementationDescriptionParser.g:417:3: ( (lv_url_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:418:4: (lv_url_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:418:4: (lv_url_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:419:5: lv_url_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getRepositoryAccess().getUrlEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_18);
            lv_url_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getRepositoryRule());
                                }
                                set(
                                    current,
                                    "url",
                                    lv_url_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_4=(Token)match(input,Version,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getVersionKeyword_4());

            // InternalImplementationDescriptionParser.g:440:3: ( (lv_version_5_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:441:4: (lv_version_5_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:441:4: (lv_version_5_0= ruleEString )
            // InternalImplementationDescriptionParser.g:442:5: lv_version_5_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getRepositoryAccess().getVersionEStringParserRuleCall_5_0());

            pushFollow(FOLLOW_2);
            lv_version_5_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getRepositoryRule());
                                }
                                set(
                                    current,
                                    "version",
                                    lv_version_5_0,
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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleRepositoryType"
    // InternalImplementationDescriptionParser.g:463:1: entryRuleRepositoryType returns [EObject current=null] : iv_ruleRepositoryType= ruleRepositoryType EOF ;
    public final EObject entryRuleRepositoryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryType = null;


        try {
            // InternalImplementationDescriptionParser.g:463:55: (iv_ruleRepositoryType= ruleRepositoryType EOF )
            // InternalImplementationDescriptionParser.g:464:2: iv_ruleRepositoryType= ruleRepositoryType EOF
            {
             newCompositeNode(grammarAccess.getRepositoryTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleRepositoryType=ruleRepositoryType();

            state._fsp--;

             current =iv_ruleRepositoryType;
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
    // $ANTLR end "entryRuleRepositoryType"


    // $ANTLR start "ruleRepositoryType"
    // InternalImplementationDescriptionParser.g:470:1: ruleRepositoryType returns [EObject current=null] : this_GitRepositoryType_0= ruleGitRepositoryType ;
    public final EObject ruleRepositoryType() throws RecognitionException {
        EObject current = null;

        EObject this_GitRepositoryType_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:476:2: (this_GitRepositoryType_0= ruleGitRepositoryType )
            // InternalImplementationDescriptionParser.g:477:2: this_GitRepositoryType_0= ruleGitRepositoryType
            {

                    newCompositeNode(grammarAccess.getRepositoryTypeAccess().getGitRepositoryTypeParserRuleCall());

            pushFollow(FOLLOW_2);
            this_GitRepositoryType_0=ruleGitRepositoryType();

            state._fsp--;


                    current = this_GitRepositoryType_0;
                    afterParserOrEnumRuleCall();


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
    // $ANTLR end "ruleRepositoryType"


    // $ANTLR start "entryRuleGitRepositoryType"
    // InternalImplementationDescriptionParser.g:488:1: entryRuleGitRepositoryType returns [EObject current=null] : iv_ruleGitRepositoryType= ruleGitRepositoryType EOF ;
    public final EObject entryRuleGitRepositoryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitRepositoryType = null;


        try {
            // InternalImplementationDescriptionParser.g:488:58: (iv_ruleGitRepositoryType= ruleGitRepositoryType EOF )
            // InternalImplementationDescriptionParser.g:489:2: iv_ruleGitRepositoryType= ruleGitRepositoryType EOF
            {
             newCompositeNode(grammarAccess.getGitRepositoryTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleGitRepositoryType=ruleGitRepositoryType();

            state._fsp--;

             current =iv_ruleGitRepositoryType;
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
    // $ANTLR end "entryRuleGitRepositoryType"


    // $ANTLR start "ruleGitRepositoryType"
    // InternalImplementationDescriptionParser.g:495:1: ruleGitRepositoryType returns [EObject current=null] : ( () otherlv_1= Git ) ;
    public final EObject ruleGitRepositoryType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:501:2: ( ( () otherlv_1= Git ) )
            // InternalImplementationDescriptionParser.g:502:2: ( () otherlv_1= Git )
            {
            // InternalImplementationDescriptionParser.g:502:2: ( () otherlv_1= Git )
            // InternalImplementationDescriptionParser.g:503:3: () otherlv_1= Git
            {
            // InternalImplementationDescriptionParser.g:503:3: ()
            // InternalImplementationDescriptionParser.g:504:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getGitRepositoryTypeAccess().getGitRepositoryTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Git,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getGitRepositoryTypeAccess().getGitKeyword_1());


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
    // $ANTLR end "ruleGitRepositoryType"


    // $ANTLR start "entryRuleDeviceRequirement"
    // InternalImplementationDescriptionParser.g:518:1: entryRuleDeviceRequirement returns [EObject current=null] : iv_ruleDeviceRequirement= ruleDeviceRequirement EOF ;
    public final EObject entryRuleDeviceRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:518:58: (iv_ruleDeviceRequirement= ruleDeviceRequirement EOF )
            // InternalImplementationDescriptionParser.g:519:2: iv_ruleDeviceRequirement= ruleDeviceRequirement EOF
            {
             newCompositeNode(grammarAccess.getDeviceRequirementRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeviceRequirement=ruleDeviceRequirement();

            state._fsp--;

             current =iv_ruleDeviceRequirement;
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
    // $ANTLR end "entryRuleDeviceRequirement"


    // $ANTLR start "ruleDeviceRequirement"
    // InternalImplementationDescriptionParser.g:525:1: ruleDeviceRequirement returns [EObject current=null] : (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleDeviceRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token otherlv_3=null;
        Token this_INDENT_5=null;
        Token otherlv_6=null;
        Token this_INDENT_7=null;
        Token this_DEDENT_9=null;
        Token this_DEDENT_10=null;
        Token this_DEDENT_11=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        EObject lv_parameter_8_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:531:2: ( (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:532:2: (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:532:2: (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:533:3: otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,DeviceRequirement,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getDeviceRequirementAccess().getDeviceRequirementKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_7);

                        newLeafNode(this_INDENT_1, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_1());


                        newCompositeNode(grammarAccess.getDeviceRequirementAccess().getPreListElementParserRuleCall_2());

            pushFollow(FOLLOW_12);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_3=(Token)match(input,Type,FOLLOW_5);

                        newLeafNode(otherlv_3, grammarAccess.getDeviceRequirementAccess().getTypeKeyword_3());

            // InternalImplementationDescriptionParser.g:552:3: ( (lv_type_4_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:553:4: (lv_type_4_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:553:4: (lv_type_4_0= ruleEString )
            // InternalImplementationDescriptionParser.g:554:5: lv_type_4_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceRequirementAccess().getTypeEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_19);
            lv_type_4_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeviceRequirementRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_4_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:571:3: (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:572:4: this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT
                    {
                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_20);

                                    newLeafNode(this_INDENT_5, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_5_0());

                    otherlv_6=(Token)match(input,HWSWParemeter,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getDeviceRequirementAccess().getHWSWParemeterKeyword_5_1());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_7, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_5_2());

                    // InternalImplementationDescriptionParser.g:584:4: ( (lv_parameter_8_0= ruleHWSWParemeter ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==HyphenMinus) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:585:5: (lv_parameter_8_0= ruleHWSWParemeter )
                            {
                            // InternalImplementationDescriptionParser.g:585:5: (lv_parameter_8_0= ruleHWSWParemeter )
                            // InternalImplementationDescriptionParser.g:586:6: lv_parameter_8_0= ruleHWSWParemeter
                            {

                                                    newCompositeNode(grammarAccess.getDeviceRequirementAccess().getParameterHWSWParemeterParserRuleCall_5_3_0());

                            pushFollow(FOLLOW_8);
                            lv_parameter_8_0=ruleHWSWParemeter();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getDeviceRequirementRule());
                                                    }
                                                    add(
                                                        current,
                                                        "parameter",
                                                        lv_parameter_8_0,
                                                        "de.fraunhofer.ipa.deplyoment.ImplementationDescription.HWSWParemeter");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_9, grammarAccess.getDeviceRequirementAccess().getDEDENTTerminalRuleCall_5_4());

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getDeviceRequirementAccess().getDEDENTTerminalRuleCall_5_5());


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getDeviceRequirementAccess().getDEDENTTerminalRuleCall_6());


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
    // $ANTLR end "ruleDeviceRequirement"


    // $ANTLR start "entryRuleSoftwareConfigurationRequirement"
    // InternalImplementationDescriptionParser.g:620:1: entryRuleSoftwareConfigurationRequirement returns [EObject current=null] : iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF ;
    public final EObject entryRuleSoftwareConfigurationRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareConfigurationRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:620:73: (iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF )
            // InternalImplementationDescriptionParser.g:621:2: iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF
            {
             newCompositeNode(grammarAccess.getSoftwareConfigurationRequirementRule());
            pushFollow(FOLLOW_1);
            iv_ruleSoftwareConfigurationRequirement=ruleSoftwareConfigurationRequirement();

            state._fsp--;

             current =iv_ruleSoftwareConfigurationRequirement;
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
    // $ANTLR end "entryRuleSoftwareConfigurationRequirement"


    // $ANTLR start "ruleSoftwareConfigurationRequirement"
    // InternalImplementationDescriptionParser.g:627:1: ruleSoftwareConfigurationRequirement returns [EObject current=null] : (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT ) ;
    public final EObject ruleSoftwareConfigurationRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token this_DEDENT_3=null;
        EObject lv_parameter_2_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:633:2: ( (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:634:2: (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:634:2: (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:635:3: otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,SoftwareConfigurationParameter,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getSoftwareConfigurationRequirementAccess().getSoftwareConfigurationParameterKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_7);

                        newLeafNode(this_INDENT_1, grammarAccess.getSoftwareConfigurationRequirementAccess().getINDENTTerminalRuleCall_1());

            // InternalImplementationDescriptionParser.g:643:3: ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==HyphenMinus) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:644:4: (lv_parameter_2_0= ruleSoftwareExecutionParemeter )
                    {
                    // InternalImplementationDescriptionParser.g:644:4: (lv_parameter_2_0= ruleSoftwareExecutionParemeter )
                    // InternalImplementationDescriptionParser.g:645:5: lv_parameter_2_0= ruleSoftwareExecutionParemeter
                    {

                                        newCompositeNode(grammarAccess.getSoftwareConfigurationRequirementAccess().getParameterSoftwareExecutionParemeterParserRuleCall_2_0());

                    pushFollow(FOLLOW_8);
                    lv_parameter_2_0=ruleSoftwareExecutionParemeter();

                    state._fsp--;


                                        if (current==null) {
                                            current = createModelElementForParent(grammarAccess.getSoftwareConfigurationRequirementRule());
                                        }
                                        add(
                                            current,
                                            "parameter",
                                            lv_parameter_2_0,
                                            "de.fraunhofer.ipa.deplyoment.ImplementationDescription.SoftwareExecutionParemeter");
                                        afterParserOrEnumRuleCall();


                    }


                    }
                    break;

                default :
                    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            this_DEDENT_3=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_3, grammarAccess.getSoftwareConfigurationRequirementAccess().getDEDENTTerminalRuleCall_3());


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
    // $ANTLR end "ruleSoftwareConfigurationRequirement"


    // $ANTLR start "entryRuleHWSWParemeter"
    // InternalImplementationDescriptionParser.g:670:1: entryRuleHWSWParemeter returns [EObject current=null] : iv_ruleHWSWParemeter= ruleHWSWParemeter EOF ;
    public final EObject entryRuleHWSWParemeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHWSWParemeter = null;


        try {
            // InternalImplementationDescriptionParser.g:670:54: (iv_ruleHWSWParemeter= ruleHWSWParemeter EOF )
            // InternalImplementationDescriptionParser.g:671:2: iv_ruleHWSWParemeter= ruleHWSWParemeter EOF
            {
             newCompositeNode(grammarAccess.getHWSWParemeterRule());
            pushFollow(FOLLOW_1);
            iv_ruleHWSWParemeter=ruleHWSWParemeter();

            state._fsp--;

             current =iv_ruleHWSWParemeter;
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
    // $ANTLR end "entryRuleHWSWParemeter"


    // $ANTLR start "ruleHWSWParemeter"
    // InternalImplementationDescriptionParser.g:677:1: ruleHWSWParemeter returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
    public final EObject ruleHWSWParemeter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_INDENT_10=null;
        Token this_DEDENT_15=null;
        Token this_DEDENT_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_value_14_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:683:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:684:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:684:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:685:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:685:3: ()
            // InternalImplementationDescriptionParser.g:686:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getHWSWParemeterAccess().getHWSWParemeterAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getHWSWParemeterAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:703:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:704:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:704:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:705:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getHWSWParemeterAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getHWSWParemeterRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_21);

                        newLeafNode(this_INDENT_4, grammarAccess.getHWSWParemeterAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_22);

                        newLeafNode(otherlv_5, grammarAccess.getHWSWParemeterAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:730:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:731:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:731:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:732:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getHWSWParemeterAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_23);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getHWSWParemeterRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:749:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Description) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:750:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getHWSWParemeterAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:754:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:755:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:755:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:756:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getHWSWParemeterAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_24);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getHWSWParemeterRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_8_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:774:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Value) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:775:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getHWSWParemeterAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_10, grammarAccess.getHWSWParemeterAccess().getINDENTTerminalRuleCall_8_1());


                                    newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_25);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:790:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:791:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:791:5: (lv_value_12_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:792:6: lv_value_12_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getHWSWParemeterAccess().getValuePropertyValueParserRuleCall_8_3_0());

                    pushFollow(FOLLOW_8);
                    lv_value_12_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getHWSWParemeterRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_12_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalImplementationDescriptionParser.g:809:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==HyphenMinus) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:810:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_8_4_0());

                            pushFollow(FOLLOW_25);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:817:5: ( (lv_value_14_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:818:6: (lv_value_14_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:818:6: (lv_value_14_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:819:7: lv_value_14_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getHWSWParemeterAccess().getValuePropertyValueParserRuleCall_8_4_1_0());

                            pushFollow(FOLLOW_8);
                            lv_value_14_0=rulePropertyValue();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getHWSWParemeterRule());
                                                        }
                                                        add(
                                                            current,
                                                            "value",
                                                            lv_value_14_0,
                                                            "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop11;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getHWSWParemeterAccess().getDEDENTTerminalRuleCall_8_5());


                    }
                    break;

            }

            this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_16, grammarAccess.getHWSWParemeterAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleHWSWParemeter"


    // $ANTLR start "entryRuleSoftwareExecutionParemeter"
    // InternalImplementationDescriptionParser.g:850:1: entryRuleSoftwareExecutionParemeter returns [EObject current=null] : iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF ;
    public final EObject entryRuleSoftwareExecutionParemeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareExecutionParemeter = null;


        try {
            // InternalImplementationDescriptionParser.g:850:67: (iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF )
            // InternalImplementationDescriptionParser.g:851:2: iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF
            {
             newCompositeNode(grammarAccess.getSoftwareExecutionParemeterRule());
            pushFollow(FOLLOW_1);
            iv_ruleSoftwareExecutionParemeter=ruleSoftwareExecutionParemeter();

            state._fsp--;

             current =iv_ruleSoftwareExecutionParemeter;
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
    // $ANTLR end "entryRuleSoftwareExecutionParemeter"


    // $ANTLR start "ruleSoftwareExecutionParemeter"
    // InternalImplementationDescriptionParser.g:857:1: ruleSoftwareExecutionParemeter returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
    public final EObject ruleSoftwareExecutionParemeter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_INDENT_10=null;
        Token this_DEDENT_15=null;
        Token this_DEDENT_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_value_14_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:863:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:864:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:864:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:865:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:865:3: ()
            // InternalImplementationDescriptionParser.g:866:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getSoftwareExecutionParemeterAccess().getSoftwareExecutionParemeterAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getSoftwareExecutionParemeterAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:883:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:884:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:884:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:885:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getSoftwareExecutionParemeterRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_21);

                        newLeafNode(this_INDENT_4, grammarAccess.getSoftwareExecutionParemeterAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_22);

                        newLeafNode(otherlv_5, grammarAccess.getSoftwareExecutionParemeterAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:910:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:911:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:911:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:912:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_23);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getSoftwareExecutionParemeterRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:929:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Description) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:930:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getSoftwareExecutionParemeterAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:934:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:935:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:935:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:936:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_24);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getSoftwareExecutionParemeterRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_8_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:954:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Value) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:955:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getSoftwareExecutionParemeterAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_10, grammarAccess.getSoftwareExecutionParemeterAccess().getINDENTTerminalRuleCall_8_1());


                                    newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_25);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:970:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:971:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:971:5: (lv_value_12_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:972:6: lv_value_12_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getValuePropertyValueParserRuleCall_8_3_0());

                    pushFollow(FOLLOW_8);
                    lv_value_12_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getSoftwareExecutionParemeterRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_12_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalImplementationDescriptionParser.g:989:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==HyphenMinus) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:990:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_8_4_0());

                            pushFollow(FOLLOW_25);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:997:5: ( (lv_value_14_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:998:6: (lv_value_14_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:998:6: (lv_value_14_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:999:7: lv_value_14_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getValuePropertyValueParserRuleCall_8_4_1_0());

                            pushFollow(FOLLOW_8);
                            lv_value_14_0=rulePropertyValue();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getSoftwareExecutionParemeterRule());
                                                        }
                                                        add(
                                                            current,
                                                            "value",
                                                            lv_value_14_0,
                                                            "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop14;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getSoftwareExecutionParemeterAccess().getDEDENTTerminalRuleCall_8_5());


                    }
                    break;

            }

            this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_16, grammarAccess.getSoftwareExecutionParemeterAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleSoftwareExecutionParemeter"


    // $ANTLR start "entryRuleAbstractProperty"
    // InternalImplementationDescriptionParser.g:1030:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalImplementationDescriptionParser.g:1030:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalImplementationDescriptionParser.g:1031:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
            {
             newCompositeNode(grammarAccess.getAbstractPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractProperty=ruleAbstractProperty();

            state._fsp--;

             current =iv_ruleAbstractProperty;
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
    // $ANTLR end "entryRuleAbstractProperty"


    // $ANTLR start "ruleAbstractProperty"
    // InternalImplementationDescriptionParser.g:1037:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1043:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalImplementationDescriptionParser.g:1044:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalImplementationDescriptionParser.g:1044:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1045:3: this_PropertyAttribute_0= rulePropertyAttribute
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertyAttributeParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_PropertyAttribute_0=rulePropertyAttribute();

                    state._fsp--;


                                current = this_PropertyAttribute_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:1054:3: this_PropertyMaximun_1= rulePropertyMaximun
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertyMaximunParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_PropertyMaximun_1=rulePropertyMaximun();

                    state._fsp--;


                                current = this_PropertyMaximun_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 3 :
                    // InternalImplementationDescriptionParser.g:1063:3: this_PropertyMinimum_2= rulePropertyMinimum
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertyMinimumParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_PropertyMinimum_2=rulePropertyMinimum();

                    state._fsp--;


                                current = this_PropertyMinimum_2;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 4 :
                    // InternalImplementationDescriptionParser.g:1072:3: this_PropertySelection_3= rulePropertySelection
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertySelectionParserRuleCall_3());

                    pushFollow(FOLLOW_2);
                    this_PropertySelection_3=rulePropertySelection();

                    state._fsp--;


                                current = this_PropertySelection_3;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 5 :
                    // InternalImplementationDescriptionParser.g:1081:3: this_PropertyRange_4= rulePropertyRange
                    {

                                newCompositeNode(grammarAccess.getAbstractPropertyAccess().getPropertyRangeParserRuleCall_4());

                    pushFollow(FOLLOW_2);
                    this_PropertyRange_4=rulePropertyRange();

                    state._fsp--;


                                current = this_PropertyRange_4;
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
    // $ANTLR end "ruleAbstractProperty"


    // $ANTLR start "entryRulePropertyKind"
    // InternalImplementationDescriptionParser.g:1093:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalImplementationDescriptionParser.g:1093:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalImplementationDescriptionParser.g:1094:2: iv_rulePropertyKind= rulePropertyKind EOF
            {
             newCompositeNode(grammarAccess.getPropertyKindRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyKind=rulePropertyKind();

            state._fsp--;

             current =iv_rulePropertyKind;
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
    // $ANTLR end "entryRulePropertyKind"


    // $ANTLR start "rulePropertyKind"
    // InternalImplementationDescriptionParser.g:1100:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1106:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalImplementationDescriptionParser.g:1107:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalImplementationDescriptionParser.g:1107:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt17=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt17=1;
                }
                break;
            case MaximumKind:
                {
                alt17=2;
                }
                break;
            case MinimumKind:
                {
                alt17=3;
                }
                break;
            case RangeKind:
                {
                alt17=4;
                }
                break;
            case SelectionKind:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1108:3: this_AttributeKind_0= ruleAttributeKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getAttributeKindParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_AttributeKind_0=ruleAttributeKind();

                    state._fsp--;


                                current = this_AttributeKind_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:1117:3: this_MaximumKind_1= ruleMaximumKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getMaximumKindParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_MaximumKind_1=ruleMaximumKind();

                    state._fsp--;


                                current = this_MaximumKind_1;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 3 :
                    // InternalImplementationDescriptionParser.g:1126:3: this_MinimumKind_2= ruleMinimumKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getMinimumKindParserRuleCall_2());

                    pushFollow(FOLLOW_2);
                    this_MinimumKind_2=ruleMinimumKind();

                    state._fsp--;


                                current = this_MinimumKind_2;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 4 :
                    // InternalImplementationDescriptionParser.g:1135:3: this_RangeKind_3= ruleRangeKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getRangeKindParserRuleCall_3());

                    pushFollow(FOLLOW_2);
                    this_RangeKind_3=ruleRangeKind();

                    state._fsp--;


                                current = this_RangeKind_3;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 5 :
                    // InternalImplementationDescriptionParser.g:1144:3: this_SelectionKind_4= ruleSelectionKind
                    {

                                newCompositeNode(grammarAccess.getPropertyKindAccess().getSelectionKindParserRuleCall_4());

                    pushFollow(FOLLOW_2);
                    this_SelectionKind_4=ruleSelectionKind();

                    state._fsp--;


                                current = this_SelectionKind_4;
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
    // $ANTLR end "rulePropertyKind"


    // $ANTLR start "entryRulePropertyAttribute"
    // InternalImplementationDescriptionParser.g:1156:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalImplementationDescriptionParser.g:1156:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalImplementationDescriptionParser.g:1157:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
            {
             newCompositeNode(grammarAccess.getPropertyAttributeRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyAttribute=rulePropertyAttribute();

            state._fsp--;

             current =iv_rulePropertyAttribute;
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
    // $ANTLR end "entryRulePropertyAttribute"


    // $ANTLR start "rulePropertyAttribute"
    // InternalImplementationDescriptionParser.g:1163:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
    public final EObject rulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_9_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1169:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1170:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1170:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1171:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1182:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1183:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1183:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1184:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyAttributeRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_21);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_22);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1209:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:1210:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:1210:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:1211:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_26);
            lv_kind_5_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyAttributeRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:1228:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Description) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1229:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1233:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1234:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1234:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1235:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_27);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyAttributeRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1253:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Value) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1254:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_25);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1258:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1259:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1259:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1260:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_28);
                    lv_value_9_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyAttributeRule());
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

            // InternalImplementationDescriptionParser.g:1278:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DEDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1279:4: this_DEDENT_10= RULE_DEDENT
                    {
                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getPropertyAttributeAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "rulePropertyAttribute"


    // $ANTLR start "entryRulePropertyMaximun"
    // InternalImplementationDescriptionParser.g:1288:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalImplementationDescriptionParser.g:1288:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalImplementationDescriptionParser.g:1289:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
            {
             newCompositeNode(grammarAccess.getPropertyMaximunRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyMaximun=rulePropertyMaximun();

            state._fsp--;

             current =iv_rulePropertyMaximun;
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
    // $ANTLR end "entryRulePropertyMaximun"


    // $ANTLR start "rulePropertyMaximun"
    // InternalImplementationDescriptionParser.g:1295:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
    public final EObject rulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_9_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1301:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1302:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1302:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1303:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1314:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1315:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1315:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1316:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyMaximunRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_21);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_29);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1341:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalImplementationDescriptionParser.g:1342:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalImplementationDescriptionParser.g:1342:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalImplementationDescriptionParser.g:1343:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_26);
            lv_kind_5_0=ruleMaximumKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyMaximunRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.MaximumKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:1360:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Description) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1361:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1365:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1366:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1366:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1367:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_27);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyMaximunRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1385:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1386:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_25);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1390:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1391:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1391:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1392:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_28);
                    lv_value_9_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyMaximunRule());
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

            // InternalImplementationDescriptionParser.g:1410:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DEDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1411:4: this_DEDENT_10= RULE_DEDENT
                    {
                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getPropertyMaximunAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "rulePropertyMaximun"


    // $ANTLR start "entryRulePropertyMinimum"
    // InternalImplementationDescriptionParser.g:1420:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalImplementationDescriptionParser.g:1420:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalImplementationDescriptionParser.g:1421:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
            {
             newCompositeNode(grammarAccess.getPropertyMinimumRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyMinimum=rulePropertyMinimum();

            state._fsp--;

             current =iv_rulePropertyMinimum;
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
    // $ANTLR end "entryRulePropertyMinimum"


    // $ANTLR start "rulePropertyMinimum"
    // InternalImplementationDescriptionParser.g:1427:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
    public final EObject rulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_9_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1433:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1434:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1434:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1435:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1446:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1447:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1447:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1448:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyMinimumRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_21);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_30);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1473:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalImplementationDescriptionParser.g:1474:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalImplementationDescriptionParser.g:1474:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalImplementationDescriptionParser.g:1475:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_26);
            lv_kind_5_0=ruleMinimumKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyMinimumRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.MinimumKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:1492:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Description) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1493:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1497:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1498:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1498:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1499:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_27);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyMinimumRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1517:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Value) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1518:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_25);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1522:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1523:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1523:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1524:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_28);
                    lv_value_9_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyMinimumRule());
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

            // InternalImplementationDescriptionParser.g:1542:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DEDENT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1543:4: this_DEDENT_10= RULE_DEDENT
                    {
                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getPropertyMinimumAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "rulePropertyMinimum"


    // $ANTLR start "entryRulePropertySelection"
    // InternalImplementationDescriptionParser.g:1552:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalImplementationDescriptionParser.g:1552:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalImplementationDescriptionParser.g:1553:2: iv_rulePropertySelection= rulePropertySelection EOF
            {
             newCompositeNode(grammarAccess.getPropertySelectionRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertySelection=rulePropertySelection();

            state._fsp--;

             current =iv_rulePropertySelection;
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
    // $ANTLR end "entryRulePropertySelection"


    // $ANTLR start "rulePropertySelection"
    // InternalImplementationDescriptionParser.g:1559:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
    public final EObject rulePropertySelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_14=null;
        Token this_DEDENT_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_11_0 = null;

        EObject lv_value_13_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1565:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1566:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1566:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1567:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1578:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1579:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1579:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1580:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_21);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_31);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1605:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalImplementationDescriptionParser.g:1606:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalImplementationDescriptionParser.g:1606:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalImplementationDescriptionParser.g:1607:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_26);
            lv_kind_5_0=ruleSelectionKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.SelectionKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:1624:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Description) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1625:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1629:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1630:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1630:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1631:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_27);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1649:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Value) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1650:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_25);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1665:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1666:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1666:5: (lv_value_11_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1667:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_8);
                    lv_value_11_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_11_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalImplementationDescriptionParser.g:1684:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==HyphenMinus) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:1685:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_25);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:1692:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:1693:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:1693:6: (lv_value_13_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:1694:7: lv_value_13_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                            pushFollow(FOLLOW_8);
                            lv_value_13_0=rulePropertyValue();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getPropertySelectionRule());
                                                        }
                                                        add(
                                                            current,
                                                            "value",
                                                            lv_value_13_0,
                                                            "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop28;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_28);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1717:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DEDENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1718:4: this_DEDENT_15= RULE_DEDENT
                    {
                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "rulePropertySelection"


    // $ANTLR start "entryRulePropertyRange"
    // InternalImplementationDescriptionParser.g:1727:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalImplementationDescriptionParser.g:1727:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalImplementationDescriptionParser.g:1728:2: iv_rulePropertyRange= rulePropertyRange EOF
            {
             newCompositeNode(grammarAccess.getPropertyRangeRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyRange=rulePropertyRange();

            state._fsp--;

             current =iv_rulePropertyRange;
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
    // $ANTLR end "entryRulePropertyRange"


    // $ANTLR start "rulePropertyRange"
    // InternalImplementationDescriptionParser.g:1734:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
    public final EObject rulePropertyRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_14=null;
        Token this_DEDENT_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_value_11_0 = null;

        EObject lv_value_13_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1740:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1741:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1741:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1742:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1753:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1754:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1754:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1755:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_21);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_32);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1780:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalImplementationDescriptionParser.g:1781:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalImplementationDescriptionParser.g:1781:4: (lv_kind_5_0= ruleRangeKind )
            // InternalImplementationDescriptionParser.g:1782:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_26);
            lv_kind_5_0=ruleRangeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.RangeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:1799:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Description) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1800:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1804:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1805:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1805:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1806:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_27);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                            }
                                            set(
                                                current,
                                                "description",
                                                lv_description_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1824:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Value) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1825:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_25);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1840:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1841:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1841:5: (lv_value_11_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1842:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_7);
                    lv_value_11_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_11_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_4());

                    pushFollow(FOLLOW_25);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1866:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1867:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1867:5: (lv_value_13_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1868:6: lv_value_13_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_5_0());

                    pushFollow(FOLLOW_10);
                    lv_value_13_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRangeRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_13_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_28);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1890:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_DEDENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1891:4: this_DEDENT_15= RULE_DEDENT
                    {
                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "rulePropertyRange"


    // $ANTLR start "entryRulePropertyValue"
    // InternalImplementationDescriptionParser.g:1900:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalImplementationDescriptionParser.g:1900:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalImplementationDescriptionParser.g:1901:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalImplementationDescriptionParser.g:1907:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;

        EObject this_LinuxDistributionValue_4 = null;

        EObject this_UbuntuVersionValue_5 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1913:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) )
            // InternalImplementationDescriptionParser.g:1914:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            {
            // InternalImplementationDescriptionParser.g:1914:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            int alt34=6;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt34=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt34=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt34=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt34=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt34=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1915:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalImplementationDescriptionParser.g:1924:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalImplementationDescriptionParser.g:1933:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalImplementationDescriptionParser.g:1942:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getProcessorArchitectureValueParserRuleCall_3());

                    pushFollow(FOLLOW_2);
                    this_ProcessorArchitectureValue_3=ruleProcessorArchitectureValue();

                    state._fsp--;


                                current = this_ProcessorArchitectureValue_3;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 5 :
                    // InternalImplementationDescriptionParser.g:1951:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getLinuxDistributionValueParserRuleCall_4());

                    pushFollow(FOLLOW_2);
                    this_LinuxDistributionValue_4=ruleLinuxDistributionValue();

                    state._fsp--;


                                current = this_LinuxDistributionValue_4;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 6 :
                    // InternalImplementationDescriptionParser.g:1960:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getUbuntuVersionValueParserRuleCall_5());

                    pushFollow(FOLLOW_2);
                    this_UbuntuVersionValue_5=ruleUbuntuVersionValue();

                    state._fsp--;


                                current = this_UbuntuVersionValue_5;
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
    // InternalImplementationDescriptionParser.g:1972:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalImplementationDescriptionParser.g:1972:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalImplementationDescriptionParser.g:1973:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalImplementationDescriptionParser.g:1979:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1985:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalImplementationDescriptionParser.g:1986:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalImplementationDescriptionParser.g:1986:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalImplementationDescriptionParser.g:1987:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalImplementationDescriptionParser.g:1987:3: (lv_value_0_0= ruleInteger0 )
            // InternalImplementationDescriptionParser.g:1988:4: lv_value_0_0= ruleInteger0
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
    // InternalImplementationDescriptionParser.g:2008:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalImplementationDescriptionParser.g:2008:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalImplementationDescriptionParser.g:2009:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalImplementationDescriptionParser.g:2015:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2021:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalImplementationDescriptionParser.g:2022:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalImplementationDescriptionParser.g:2022:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalImplementationDescriptionParser.g:2023:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalImplementationDescriptionParser.g:2023:3: (lv_value_0_0= ruleDouble0 )
            // InternalImplementationDescriptionParser.g:2024:4: lv_value_0_0= ruleDouble0
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
    // InternalImplementationDescriptionParser.g:2044:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalImplementationDescriptionParser.g:2044:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalImplementationDescriptionParser.g:2045:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalImplementationDescriptionParser.g:2051:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2057:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2058:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2058:2: ( (lv_value_0_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2059:3: (lv_value_0_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2059:3: (lv_value_0_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2060:4: lv_value_0_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2080:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2080:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalImplementationDescriptionParser.g:2081:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalImplementationDescriptionParser.g:2087:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2093:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalImplementationDescriptionParser.g:2094:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalImplementationDescriptionParser.g:2094:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalImplementationDescriptionParser.g:2095:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalImplementationDescriptionParser.g:2095:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalImplementationDescriptionParser.g:2096:4: lv_value_0_0= ruleProcessorArchitectureType
            {

                            newCompositeNode(grammarAccess.getProcessorArchitectureValueAccess().getValueProcessorArchitectureTypeEnumRuleCall_0());

            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleProcessorArchitectureType();

            state._fsp--;


                            if (current==null) {
                                current = createModelElementForParent(grammarAccess.getProcessorArchitectureValueRule());
                            }
                            set(
                                current,
                                "value",
                                lv_value_0_0,
                                "de.fraunhofer.ipa.deployment.Util.ProcessorArchitectureType");
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
    // $ANTLR end "ruleProcessorArchitectureValue"


    // $ANTLR start "entryRuleAbstractResouceType"
    // InternalImplementationDescriptionParser.g:2116:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalImplementationDescriptionParser.g:2116:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalImplementationDescriptionParser.g:2117:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalImplementationDescriptionParser.g:2123:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2129:2: (this_ResourceType_0= ruleResourceType )
            // InternalImplementationDescriptionParser.g:2130:2: this_ResourceType_0= ruleResourceType
            {

                    newCompositeNode(grammarAccess.getAbstractResouceTypeAccess().getResourceTypeParserRuleCall());

            pushFollow(FOLLOW_2);
            this_ResourceType_0=ruleResourceType();

            state._fsp--;


                    current = this_ResourceType_0;
                    afterParserOrEnumRuleCall();


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


    // $ANTLR start "entryRuleResourceType"
    // InternalImplementationDescriptionParser.g:2141:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalImplementationDescriptionParser.g:2141:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalImplementationDescriptionParser.g:2142:2: iv_ruleResourceType= ruleResourceType EOF
            {
             newCompositeNode(grammarAccess.getResourceTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleResourceType=ruleResourceType();

            state._fsp--;

             current =iv_ruleResourceType;
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
    // $ANTLR end "entryRuleResourceType"


    // $ANTLR start "ruleResourceType"
    // InternalImplementationDescriptionParser.g:2148:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2154:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:2155:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:2155:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2156:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2156:3: ()
            // InternalImplementationDescriptionParser.g:2157:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2163:3: ( (lv_name_1_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2164:4: (lv_name_1_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2164:4: (lv_name_1_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2165:5: lv_name_1_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getResourceTypeAccess().getNameEStringParserRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getResourceTypeRule());
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
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "entryRuleLinuxOpertingSystem"
    // InternalImplementationDescriptionParser.g:2186:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalImplementationDescriptionParser.g:2186:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalImplementationDescriptionParser.g:2187:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalImplementationDescriptionParser.g:2193:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2199:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalImplementationDescriptionParser.g:2200:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalImplementationDescriptionParser.g:2200:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalImplementationDescriptionParser.g:2201:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalImplementationDescriptionParser.g:2201:3: ()
            // InternalImplementationDescriptionParser.g:2202:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,LinuxOpertingSystem,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getLinuxOpertingSystemAccess().getLinuxOpertingSystemKeyword_1());


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


    // $ANTLR start "entryRuleMacOSOpertingSystem"
    // InternalImplementationDescriptionParser.g:2216:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalImplementationDescriptionParser.g:2216:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalImplementationDescriptionParser.g:2217:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
            {
             newCompositeNode(grammarAccess.getMacOSOpertingSystemRule());
            pushFollow(FOLLOW_1);
            iv_ruleMacOSOpertingSystem=ruleMacOSOpertingSystem();

            state._fsp--;

             current =iv_ruleMacOSOpertingSystem;
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
    // $ANTLR end "entryRuleMacOSOpertingSystem"


    // $ANTLR start "ruleMacOSOpertingSystem"
    // InternalImplementationDescriptionParser.g:2223:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2229:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalImplementationDescriptionParser.g:2230:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalImplementationDescriptionParser.g:2230:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalImplementationDescriptionParser.g:2231:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalImplementationDescriptionParser.g:2231:3: ()
            // InternalImplementationDescriptionParser.g:2232:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getMacOSOpertingSystemAccess().getMacOSOpertingSystemAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,MacOSOpertingSystem,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getMacOSOpertingSystemAccess().getMacOSOpertingSystemKeyword_1());


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
    // $ANTLR end "ruleMacOSOpertingSystem"


    // $ANTLR start "entryRuleCommunicationType"
    // InternalImplementationDescriptionParser.g:2246:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2246:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2247:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2253:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2259:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:2260:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:2260:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2261:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2261:3: ()
            // InternalImplementationDescriptionParser.g:2262:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2268:3: ( (lv_name_1_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2269:4: (lv_name_1_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2269:4: (lv_name_1_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2270:5: lv_name_1_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2291:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2291:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2292:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2298:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2304:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalImplementationDescriptionParser.g:2305:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalImplementationDescriptionParser.g:2305:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Ethernet) ) {
                alt35=1;
            }
            else if ( (LA35_0==Wlan) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2306:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalImplementationDescriptionParser.g:2315:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalImplementationDescriptionParser.g:2327:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2327:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2328:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2334:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2340:2: ( ( () otherlv_1= Ethernet ) )
            // InternalImplementationDescriptionParser.g:2341:2: ( () otherlv_1= Ethernet )
            {
            // InternalImplementationDescriptionParser.g:2341:2: ( () otherlv_1= Ethernet )
            // InternalImplementationDescriptionParser.g:2342:3: () otherlv_1= Ethernet
            {
            // InternalImplementationDescriptionParser.g:2342:3: ()
            // InternalImplementationDescriptionParser.g:2343:4:
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
    // InternalImplementationDescriptionParser.g:2357:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2357:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2358:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2364:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2370:2: ( ( () otherlv_1= Wlan ) )
            // InternalImplementationDescriptionParser.g:2371:2: ( () otherlv_1= Wlan )
            {
            // InternalImplementationDescriptionParser.g:2371:2: ( () otherlv_1= Wlan )
            // InternalImplementationDescriptionParser.g:2372:3: () otherlv_1= Wlan
            {
            // InternalImplementationDescriptionParser.g:2372:3: ()
            // InternalImplementationDescriptionParser.g:2373:4:
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


    // $ANTLR start "entryRuleAttributeKind"
    // InternalImplementationDescriptionParser.g:2387:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2387:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalImplementationDescriptionParser.g:2388:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalImplementationDescriptionParser.g:2394:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2400:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalImplementationDescriptionParser.g:2401:2: ( () otherlv_1= AttributeKind )
            {
            // InternalImplementationDescriptionParser.g:2401:2: ( () otherlv_1= AttributeKind )
            // InternalImplementationDescriptionParser.g:2402:3: () otherlv_1= AttributeKind
            {
            // InternalImplementationDescriptionParser.g:2402:3: ()
            // InternalImplementationDescriptionParser.g:2403:4:
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
    // InternalImplementationDescriptionParser.g:2417:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2417:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalImplementationDescriptionParser.g:2418:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalImplementationDescriptionParser.g:2424:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2430:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalImplementationDescriptionParser.g:2431:2: ( () otherlv_1= MaximumKind )
            {
            // InternalImplementationDescriptionParser.g:2431:2: ( () otherlv_1= MaximumKind )
            // InternalImplementationDescriptionParser.g:2432:3: () otherlv_1= MaximumKind
            {
            // InternalImplementationDescriptionParser.g:2432:3: ()
            // InternalImplementationDescriptionParser.g:2433:4:
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
    // InternalImplementationDescriptionParser.g:2447:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2447:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalImplementationDescriptionParser.g:2448:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalImplementationDescriptionParser.g:2454:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2460:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalImplementationDescriptionParser.g:2461:2: ( () otherlv_1= MinimumKind )
            {
            // InternalImplementationDescriptionParser.g:2461:2: ( () otherlv_1= MinimumKind )
            // InternalImplementationDescriptionParser.g:2462:3: () otherlv_1= MinimumKind
            {
            // InternalImplementationDescriptionParser.g:2462:3: ()
            // InternalImplementationDescriptionParser.g:2463:4:
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
    // InternalImplementationDescriptionParser.g:2477:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2477:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalImplementationDescriptionParser.g:2478:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalImplementationDescriptionParser.g:2484:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2490:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalImplementationDescriptionParser.g:2491:2: ( () otherlv_1= SelectionKind )
            {
            // InternalImplementationDescriptionParser.g:2491:2: ( () otherlv_1= SelectionKind )
            // InternalImplementationDescriptionParser.g:2492:3: () otherlv_1= SelectionKind
            {
            // InternalImplementationDescriptionParser.g:2492:3: ()
            // InternalImplementationDescriptionParser.g:2493:4:
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


    // $ANTLR start "entryRuleRangeKind"
    // InternalImplementationDescriptionParser.g:2507:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2507:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalImplementationDescriptionParser.g:2508:2: iv_ruleRangeKind= ruleRangeKind EOF
            {
             newCompositeNode(grammarAccess.getRangeKindRule());
            pushFollow(FOLLOW_1);
            iv_ruleRangeKind=ruleRangeKind();

            state._fsp--;

             current =iv_ruleRangeKind;
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
    // $ANTLR end "entryRuleRangeKind"


    // $ANTLR start "ruleRangeKind"
    // InternalImplementationDescriptionParser.g:2514:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2520:2: ( ( () otherlv_1= RangeKind ) )
            // InternalImplementationDescriptionParser.g:2521:2: ( () otherlv_1= RangeKind )
            {
            // InternalImplementationDescriptionParser.g:2521:2: ( () otherlv_1= RangeKind )
            // InternalImplementationDescriptionParser.g:2522:3: () otherlv_1= RangeKind
            {
            // InternalImplementationDescriptionParser.g:2522:3: ()
            // InternalImplementationDescriptionParser.g:2523:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getRangeKindAccess().getRangeKindAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,RangeKind,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getRangeKindAccess().getRangeKindKeyword_1());


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
    // $ANTLR end "ruleRangeKind"


    // $ANTLR start "entryRuleLinuxDistributionValue"
    // InternalImplementationDescriptionParser.g:2537:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2537:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalImplementationDescriptionParser.g:2538:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
            {
             newCompositeNode(grammarAccess.getLinuxDistributionValueRule());
            pushFollow(FOLLOW_1);
            iv_ruleLinuxDistributionValue=ruleLinuxDistributionValue();

            state._fsp--;

             current =iv_ruleLinuxDistributionValue;
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
    // $ANTLR end "entryRuleLinuxDistributionValue"


    // $ANTLR start "ruleLinuxDistributionValue"
    // InternalImplementationDescriptionParser.g:2544:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2550:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalImplementationDescriptionParser.g:2551:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalImplementationDescriptionParser.g:2551:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalImplementationDescriptionParser.g:2552:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalImplementationDescriptionParser.g:2552:3: ()
            // InternalImplementationDescriptionParser.g:2553:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2559:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalImplementationDescriptionParser.g:2560:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalImplementationDescriptionParser.g:2560:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalImplementationDescriptionParser.g:2561:5: lv_value_1_0= ruleLinuxDistribution
            {

                                newCompositeNode(grammarAccess.getLinuxDistributionValueAccess().getValueLinuxDistributionEnumRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleLinuxDistribution();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getLinuxDistributionValueRule());
                                }
                                set(
                                    current,
                                    "value",
                                    lv_value_1_0,
                                    "de.fraunhofer.ipa.deployment.Util.LinuxDistribution");
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
    // $ANTLR end "ruleLinuxDistributionValue"


    // $ANTLR start "entryRuleUbuntuVersionValue"
    // InternalImplementationDescriptionParser.g:2582:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2582:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalImplementationDescriptionParser.g:2583:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
            {
             newCompositeNode(grammarAccess.getUbuntuVersionValueRule());
            pushFollow(FOLLOW_1);
            iv_ruleUbuntuVersionValue=ruleUbuntuVersionValue();

            state._fsp--;

             current =iv_ruleUbuntuVersionValue;
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
    // $ANTLR end "entryRuleUbuntuVersionValue"


    // $ANTLR start "ruleUbuntuVersionValue"
    // InternalImplementationDescriptionParser.g:2589:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2595:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalImplementationDescriptionParser.g:2596:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalImplementationDescriptionParser.g:2596:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalImplementationDescriptionParser.g:2597:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalImplementationDescriptionParser.g:2597:3: ()
            // InternalImplementationDescriptionParser.g:2598:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2604:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalImplementationDescriptionParser.g:2605:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalImplementationDescriptionParser.g:2605:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalImplementationDescriptionParser.g:2606:5: lv_value_1_0= ruleUbuntuVersion
            {

                                newCompositeNode(grammarAccess.getUbuntuVersionValueAccess().getValueUbuntuVersionEnumRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleUbuntuVersion();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getUbuntuVersionValueRule());
                                }
                                set(
                                    current,
                                    "value",
                                    lv_value_1_0,
                                    "de.fraunhofer.ipa.deployment.Util.UbuntuVersion");
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
    // $ANTLR end "ruleUbuntuVersionValue"


    // $ANTLR start "entryRuleDouble0"
    // InternalImplementationDescriptionParser.g:2627:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalImplementationDescriptionParser.g:2627:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalImplementationDescriptionParser.g:2628:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalImplementationDescriptionParser.g:2634:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2640:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalImplementationDescriptionParser.g:2641:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalImplementationDescriptionParser.g:2651:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalImplementationDescriptionParser.g:2651:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalImplementationDescriptionParser.g:2652:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalImplementationDescriptionParser.g:2658:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2664:2: (this_DECINT_0= RULE_DECINT )
            // InternalImplementationDescriptionParser.g:2665:2: this_DECINT_0= RULE_DECINT
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
    // InternalImplementationDescriptionParser.g:2675:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalImplementationDescriptionParser.g:2675:47: (iv_ruleEString= ruleEString EOF )
            // InternalImplementationDescriptionParser.g:2676:2: iv_ruleEString= ruleEString EOF
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
    // InternalImplementationDescriptionParser.g:2682:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2688:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalImplementationDescriptionParser.g:2689:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalImplementationDescriptionParser.g:2689:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2690:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:2698:3: this_ID_1= RULE_ID
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
    // InternalImplementationDescriptionParser.g:2709:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalImplementationDescriptionParser.g:2711:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalImplementationDescriptionParser.g:2712:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalImplementationDescriptionParser.g:2721:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalImplementationDescriptionParser.g:2728:2: (kw= HyphenMinus )
            // InternalImplementationDescriptionParser.g:2729:2: kw= HyphenMinus
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


    // $ANTLR start "ruleProcessorArchitectureType"
    // InternalImplementationDescriptionParser.g:2740:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2746:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalImplementationDescriptionParser.g:2747:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalImplementationDescriptionParser.g:2747:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==X86) ) {
                alt37=1;
            }
            else if ( (LA37_0==Arm64) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2748:3: (enumLiteral_0= X86 )
                    {
                    // InternalImplementationDescriptionParser.g:2748:3: (enumLiteral_0= X86 )
                    // InternalImplementationDescriptionParser.g:2749:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                                    current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:2756:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalImplementationDescriptionParser.g:2756:3: (enumLiteral_1= Arm64 )
                    // InternalImplementationDescriptionParser.g:2757:4: enumLiteral_1= Arm64
                    {
                    enumLiteral_1=(Token)match(input,Arm64,FOLLOW_2);

                                    current = grammarAccess.getProcessorArchitectureTypeAccess().getArm64EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_1, grammarAccess.getProcessorArchitectureTypeAccess().getArm64EnumLiteralDeclaration_1());


                    }


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
    // $ANTLR end "ruleProcessorArchitectureType"


    // $ANTLR start "ruleLinuxDistribution"
    // InternalImplementationDescriptionParser.g:2767:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2773:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalImplementationDescriptionParser.g:2774:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalImplementationDescriptionParser.g:2774:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Ubuntu) ) {
                alt38=1;
            }
            else if ( (LA38_0==Debian) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2775:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalImplementationDescriptionParser.g:2775:3: (enumLiteral_0= Ubuntu )
                    // InternalImplementationDescriptionParser.g:2776:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                                    current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:2783:3: (enumLiteral_1= Debian )
                    {
                    // InternalImplementationDescriptionParser.g:2783:3: (enumLiteral_1= Debian )
                    // InternalImplementationDescriptionParser.g:2784:4: enumLiteral_1= Debian
                    {
                    enumLiteral_1=(Token)match(input,Debian,FOLLOW_2);

                                    current = grammarAccess.getLinuxDistributionAccess().getDebianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_1, grammarAccess.getLinuxDistributionAccess().getDebianEnumLiteralDeclaration_1());


                    }


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
    // $ANTLR end "ruleLinuxDistribution"


    // $ANTLR start "ruleUbuntuVersion"
    // InternalImplementationDescriptionParser.g:2794:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2800:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalImplementationDescriptionParser.g:2801:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalImplementationDescriptionParser.g:2801:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Focal) ) {
                alt39=1;
            }
            else if ( (LA39_0==Jammy) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2802:3: (enumLiteral_0= Focal )
                    {
                    // InternalImplementationDescriptionParser.g:2802:3: (enumLiteral_0= Focal )
                    // InternalImplementationDescriptionParser.g:2803:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                                    current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:2810:3: (enumLiteral_1= Jammy )
                    {
                    // InternalImplementationDescriptionParser.g:2810:3: (enumLiteral_1= Jammy )
                    // InternalImplementationDescriptionParser.g:2811:4: enumLiteral_1= Jammy
                    {
                    enumLiteral_1=(Token)match(input,Jammy,FOLLOW_2);

                                    current = grammarAccess.getUbuntuVersionAccess().getJammyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_1, grammarAccess.getUbuntuVersionAccess().getJammyEnumLiteralDeclaration_1());


                    }


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
    // $ANTLR end "ruleUbuntuVersion"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\46\1\40\1\55\2\53\1\37\1\15\5\uffff";
    static final String dfa_3s = "\1\46\1\40\1\57\2\53\1\37\1\25\5\uffff";
    static final String dfa_4s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\1\uffff\1\11\1\10\3\uffff\1\12",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1044:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000810L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100008008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000A32076000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100008008002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200000L});

}
