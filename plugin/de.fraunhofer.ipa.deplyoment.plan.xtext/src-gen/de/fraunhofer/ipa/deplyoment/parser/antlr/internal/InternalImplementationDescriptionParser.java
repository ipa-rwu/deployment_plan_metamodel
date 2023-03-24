package de.fraunhofer.ipa.deplyoment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SoftwareConfigurationParameter", "ImplementationDescription", "IncludeSoftwareComponent", "ProcessorArchitecture", "ExecutionRequirement", "SoftwareDependency", "DeviceRequirement", "HWSWParemeter", "AttributeKind", "SelectionKind", "Description", "MaximumKind", "MinimumKind", "RangeKind", "Ethernet", "X86_64", "Value", "Arm64", "Linux", "MacOS", "Kind", "Name", "Path", "Type", "Wlan", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=35;
    public static final int RULE_DATE_TIME=40;
    public static final int RULE_BOOLEAN=32;
    public static final int AttributeKind=12;
    public static final int RULE_YEAR=37;
    public static final int SoftwareConfigurationParameter=4;
    public static final int Name=25;
    public static final int RULE_MIN_SEC=39;
    public static final int Kind=24;
    public static final int X86_64=19;
    public static final int RULE_DEDENT=43;
    public static final int SoftwareDependency=9;
    public static final int RULE_ID=44;
    public static final int RULE_DIGIT=30;
    public static final int ExecutionRequirement=8;
    public static final int HWSWParemeter=11;
    public static final int SelectionKind=13;
    public static final int Arm64=21;
    public static final int Linux=22;
    public static final int IncludeSoftwareComponent=6;
    public static final int RULE_INT=45;
    public static final int Ethernet=18;
    public static final int Value=20;
    public static final int RULE_ML_COMMENT=47;
    public static final int MacOS=23;
    public static final int Description=14;
    public static final int ProcessorArchitecture=7;
    public static final int RULE_STRING=46;
    public static final int Wlan=28;
    public static final int RULE_SL_COMMENT=41;
    public static final int ImplementationDescription=5;
    public static final int HyphenMinus=29;
    public static final int RULE_DOUBLE=34;
    public static final int RULE_DECINT=33;
    public static final int MinimumKind=16;
    public static final int EOF=-1;
    public static final int RULE_INDENT=42;
    public static final int Path=26;
    public static final int RULE_HOUR=38;
    public static final int RULE_WS=48;
    public static final int MaximumKind=15;
    public static final int RULE_ANY_OTHER=49;
    public static final int RangeKind=17;
    public static final int Type=27;
    public static final int DeviceRequirement=10;
    public static final int RULE_MONTH=36;
    public static final int RULE_BINARY=31;

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
    // InternalImplementationDescriptionParser.g:57:1: entryRuleImplementationDescription returns [EObject current=null] : iv_ruleImplementationDescription= ruleImplementationDescription EOF ;
    public final EObject entryRuleImplementationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDescription = null;


        try {
            // InternalImplementationDescriptionParser.g:57:66: (iv_ruleImplementationDescription= ruleImplementationDescription EOF )
            // InternalImplementationDescriptionParser.g:58:2: iv_ruleImplementationDescription= ruleImplementationDescription EOF
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
    // InternalImplementationDescriptionParser.g:64:1: ruleImplementationDescription returns [EObject current=null] : (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:70:2: ( (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:71:2: (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:71:2: (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:72:3: otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )? otherlv_11= IncludeSoftwareComponent this_INDENT_12= RULE_INDENT ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+ this_DEDENT_14= RULE_DEDENT this_DEDENT_15= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ImplementationDescription,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getImplementationDescriptionAccess().getImplementationDescriptionKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_1, grammarAccess.getImplementationDescriptionAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getImplementationDescriptionAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:84:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:85:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:85:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:86:5: lv_name_3_0= ruleEString
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

            // InternalImplementationDescriptionParser.g:103:3: (otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SoftwareDependency) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:104:4: otherlv_4= SoftwareDependency this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareDependency_7_0= ruleEString ) ) ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )* this_DEDENT_10= RULE_DEDENT
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

                    // InternalImplementationDescriptionParser.g:119:4: ( (lv_softwareDependency_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:120:5: (lv_softwareDependency_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:120:5: (lv_softwareDependency_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:121:6: lv_softwareDependency_7_0= ruleEString
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

                    // InternalImplementationDescriptionParser.g:138:4: ( rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==HyphenMinus) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:139:5: rulePreListElement ( (lv_softwareDependency_9_0= ruleEString ) )
                            {

                                                newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getPreListElementParserRuleCall_4_4_0());

                            pushFollow(FOLLOW_5);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:146:5: ( (lv_softwareDependency_9_0= ruleEString ) )
                            // InternalImplementationDescriptionParser.g:147:6: (lv_softwareDependency_9_0= ruleEString )
                            {
                            // InternalImplementationDescriptionParser.g:147:6: (lv_softwareDependency_9_0= ruleEString )
                            // InternalImplementationDescriptionParser.g:148:7: lv_softwareDependency_9_0= ruleEString
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

            // InternalImplementationDescriptionParser.g:179:3: ( (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent ) )+
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
                    // InternalImplementationDescriptionParser.g:180:4: (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent )
                    {
                    // InternalImplementationDescriptionParser.g:180:4: (lv_includeSoftwareComponent_13_0= ruleSoftwareComponent )
                    // InternalImplementationDescriptionParser.g:181:5: lv_includeSoftwareComponent_13_0= ruleSoftwareComponent
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
    // InternalImplementationDescriptionParser.g:210:1: entryRuleExecutionRequirement returns [EObject current=null] : iv_ruleExecutionRequirement= ruleExecutionRequirement EOF ;
    public final EObject entryRuleExecutionRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:210:61: (iv_ruleExecutionRequirement= ruleExecutionRequirement EOF )
            // InternalImplementationDescriptionParser.g:211:2: iv_ruleExecutionRequirement= ruleExecutionRequirement EOF
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
    // InternalImplementationDescriptionParser.g:217:1: ruleExecutionRequirement returns [EObject current=null] : (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement ) ;
    public final EObject ruleExecutionRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceRequirement_0 = null;

        EObject this_SoftwareConfigurationRequirement_1 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:223:2: ( (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement ) )
            // InternalImplementationDescriptionParser.g:224:2: (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement )
            {
            // InternalImplementationDescriptionParser.g:224:2: (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement )
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
                    // InternalImplementationDescriptionParser.g:225:3: this_DeviceRequirement_0= ruleDeviceRequirement
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
                    // InternalImplementationDescriptionParser.g:234:3: this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement
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
    // InternalImplementationDescriptionParser.g:246:1: entryRuleSoftwareComponent returns [EObject current=null] : iv_ruleSoftwareComponent= ruleSoftwareComponent EOF ;
    public final EObject entryRuleSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareComponent = null;


        try {
            // InternalImplementationDescriptionParser.g:246:58: (iv_ruleSoftwareComponent= ruleSoftwareComponent EOF )
            // InternalImplementationDescriptionParser.g:247:2: iv_ruleSoftwareComponent= ruleSoftwareComponent EOF
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
    // InternalImplementationDescriptionParser.g:253:1: ruleSoftwareComponent returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) (otherlv_7= ExecutionRequirement this_INDENT_8= RULE_INDENT ( (lv_executionRequirement_9_0= ruleExecutionRequirement ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleSoftwareComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_INDENT_8=null;
        Token this_DEDENT_10=null;
        Token this_DEDENT_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_path_6_0 = null;

        EObject lv_executionRequirement_9_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:259:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) (otherlv_7= ExecutionRequirement this_INDENT_8= RULE_INDENT ( (lv_executionRequirement_9_0= ruleExecutionRequirement ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:260:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) (otherlv_7= ExecutionRequirement this_INDENT_8= RULE_INDENT ( (lv_executionRequirement_9_0= ruleExecutionRequirement ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:260:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) (otherlv_7= ExecutionRequirement this_INDENT_8= RULE_INDENT ( (lv_executionRequirement_9_0= ruleExecutionRequirement ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:261:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Path ( (lv_path_6_0= ruleEString ) ) (otherlv_7= ExecutionRequirement this_INDENT_8= RULE_INDENT ( (lv_executionRequirement_9_0= ruleExecutionRequirement ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:261:3: ()
            // InternalImplementationDescriptionParser.g:262:4:
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

            // InternalImplementationDescriptionParser.g:279:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:280:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:280:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:281:5: lv_name_3_0= ruleEString
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

            otherlv_5=(Token)match(input,Path,FOLLOW_5);

                        newLeafNode(otherlv_5, grammarAccess.getSoftwareComponentAccess().getPathKeyword_5());

            // InternalImplementationDescriptionParser.g:306:3: ( (lv_path_6_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:307:4: (lv_path_6_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:307:4: (lv_path_6_0= ruleEString )
            // InternalImplementationDescriptionParser.g:308:5: lv_path_6_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getSoftwareComponentAccess().getPathEStringParserRuleCall_6_0());

            pushFollow(FOLLOW_12);
            lv_path_6_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getSoftwareComponentRule());
                                }
                                set(
                                    current,
                                    "path",
                                    lv_path_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:325:3: (otherlv_7= ExecutionRequirement this_INDENT_8= RULE_INDENT ( (lv_executionRequirement_9_0= ruleExecutionRequirement ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ExecutionRequirement) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:326:4: otherlv_7= ExecutionRequirement this_INDENT_8= RULE_INDENT ( (lv_executionRequirement_9_0= ruleExecutionRequirement ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,ExecutionRequirement,FOLLOW_3);

                                    newLeafNode(otherlv_7, grammarAccess.getSoftwareComponentAccess().getExecutionRequirementKeyword_7_0());

                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_13);

                                    newLeafNode(this_INDENT_8, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_7_1());

                    // InternalImplementationDescriptionParser.g:334:4: ( (lv_executionRequirement_9_0= ruleExecutionRequirement ) )+
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
                            // InternalImplementationDescriptionParser.g:335:5: (lv_executionRequirement_9_0= ruleExecutionRequirement )
                            {
                            // InternalImplementationDescriptionParser.g:335:5: (lv_executionRequirement_9_0= ruleExecutionRequirement )
                            // InternalImplementationDescriptionParser.g:336:6: lv_executionRequirement_9_0= ruleExecutionRequirement
                            {

                                                    newCompositeNode(grammarAccess.getSoftwareComponentAccess().getExecutionRequirementExecutionRequirementParserRuleCall_7_2_0());

                            pushFollow(FOLLOW_14);
                            lv_executionRequirement_9_0=ruleExecutionRequirement();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getSoftwareComponentRule());
                                                    }
                                                    add(
                                                        current,
                                                        "executionRequirement",
                                                        lv_executionRequirement_9_0,
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

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_10);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getSoftwareComponentAccess().getDEDENTTerminalRuleCall_7_3());


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getSoftwareComponentAccess().getDEDENTTerminalRuleCall_8());


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


    // $ANTLR start "entryRuleDeviceRequirement"
    // InternalImplementationDescriptionParser.g:366:1: entryRuleDeviceRequirement returns [EObject current=null] : iv_ruleDeviceRequirement= ruleDeviceRequirement EOF ;
    public final EObject entryRuleDeviceRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:366:58: (iv_ruleDeviceRequirement= ruleDeviceRequirement EOF )
            // InternalImplementationDescriptionParser.g:367:2: iv_ruleDeviceRequirement= ruleDeviceRequirement EOF
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
    // InternalImplementationDescriptionParser.g:373:1: ruleDeviceRequirement returns [EObject current=null] : (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:379:2: ( (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:380:2: (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:380:2: (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:381:3: otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,DeviceRequirement,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getDeviceRequirementAccess().getDeviceRequirementKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_7);

                        newLeafNode(this_INDENT_1, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_1());


                        newCompositeNode(grammarAccess.getDeviceRequirementAccess().getPreListElementParserRuleCall_2());

            pushFollow(FOLLOW_15);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_3=(Token)match(input,Type,FOLLOW_5);

                        newLeafNode(otherlv_3, grammarAccess.getDeviceRequirementAccess().getTypeKeyword_3());

            // InternalImplementationDescriptionParser.g:400:3: ( (lv_type_4_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:401:4: (lv_type_4_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:401:4: (lv_type_4_0= ruleEString )
            // InternalImplementationDescriptionParser.g:402:5: lv_type_4_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceRequirementAccess().getTypeEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_16);
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

            // InternalImplementationDescriptionParser.g:419:3: (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:420:4: this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT
                    {
                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_17);

                                    newLeafNode(this_INDENT_5, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_5_0());

                    otherlv_6=(Token)match(input,HWSWParemeter,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getDeviceRequirementAccess().getHWSWParemeterKeyword_5_1());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_7, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_5_2());

                    // InternalImplementationDescriptionParser.g:432:4: ( (lv_parameter_8_0= ruleHWSWParemeter ) )+
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
                            // InternalImplementationDescriptionParser.g:433:5: (lv_parameter_8_0= ruleHWSWParemeter )
                            {
                            // InternalImplementationDescriptionParser.g:433:5: (lv_parameter_8_0= ruleHWSWParemeter )
                            // InternalImplementationDescriptionParser.g:434:6: lv_parameter_8_0= ruleHWSWParemeter
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
    // InternalImplementationDescriptionParser.g:468:1: entryRuleSoftwareConfigurationRequirement returns [EObject current=null] : iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF ;
    public final EObject entryRuleSoftwareConfigurationRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareConfigurationRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:468:73: (iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF )
            // InternalImplementationDescriptionParser.g:469:2: iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF
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
    // InternalImplementationDescriptionParser.g:475:1: ruleSoftwareConfigurationRequirement returns [EObject current=null] : (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT ) ;
    public final EObject ruleSoftwareConfigurationRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token this_DEDENT_3=null;
        EObject lv_parameter_2_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:481:2: ( (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:482:2: (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:482:2: (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:483:3: otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,SoftwareConfigurationParameter,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getSoftwareConfigurationRequirementAccess().getSoftwareConfigurationParameterKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_7);

                        newLeafNode(this_INDENT_1, grammarAccess.getSoftwareConfigurationRequirementAccess().getINDENTTerminalRuleCall_1());

            // InternalImplementationDescriptionParser.g:491:3: ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+
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
                    // InternalImplementationDescriptionParser.g:492:4: (lv_parameter_2_0= ruleSoftwareExecutionParemeter )
                    {
                    // InternalImplementationDescriptionParser.g:492:4: (lv_parameter_2_0= ruleSoftwareExecutionParemeter )
                    // InternalImplementationDescriptionParser.g:493:5: lv_parameter_2_0= ruleSoftwareExecutionParemeter
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
    // InternalImplementationDescriptionParser.g:518:1: entryRuleHWSWParemeter returns [EObject current=null] : iv_ruleHWSWParemeter= ruleHWSWParemeter EOF ;
    public final EObject entryRuleHWSWParemeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHWSWParemeter = null;


        try {
            // InternalImplementationDescriptionParser.g:518:54: (iv_ruleHWSWParemeter= ruleHWSWParemeter EOF )
            // InternalImplementationDescriptionParser.g:519:2: iv_ruleHWSWParemeter= ruleHWSWParemeter EOF
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
    // InternalImplementationDescriptionParser.g:525:1: ruleHWSWParemeter returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:531:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:532:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:532:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:533:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:533:3: ()
            // InternalImplementationDescriptionParser.g:534:4:
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

            // InternalImplementationDescriptionParser.g:551:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:552:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:552:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:553:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_18);

                        newLeafNode(this_INDENT_4, grammarAccess.getHWSWParemeterAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_19);

                        newLeafNode(otherlv_5, grammarAccess.getHWSWParemeterAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:578:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:579:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:579:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:580:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getHWSWParemeterAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_20);
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

            // InternalImplementationDescriptionParser.g:597:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Description) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:598:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getHWSWParemeterAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:602:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:603:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:603:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:604:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getHWSWParemeterAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_21);
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

            // InternalImplementationDescriptionParser.g:622:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Value) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:623:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getHWSWParemeterAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_10, grammarAccess.getHWSWParemeterAccess().getINDENTTerminalRuleCall_8_1());


                                    newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_22);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:638:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:639:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:639:5: (lv_value_12_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:640:6: lv_value_12_0= rulePropertyValue
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

                    // InternalImplementationDescriptionParser.g:657:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==HyphenMinus) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:658:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_8_4_0());

                            pushFollow(FOLLOW_22);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:665:5: ( (lv_value_14_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:666:6: (lv_value_14_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:666:6: (lv_value_14_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:667:7: lv_value_14_0= rulePropertyValue
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
    // InternalImplementationDescriptionParser.g:698:1: entryRuleSoftwareExecutionParemeter returns [EObject current=null] : iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF ;
    public final EObject entryRuleSoftwareExecutionParemeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareExecutionParemeter = null;


        try {
            // InternalImplementationDescriptionParser.g:698:67: (iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF )
            // InternalImplementationDescriptionParser.g:699:2: iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF
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
    // InternalImplementationDescriptionParser.g:705:1: ruleSoftwareExecutionParemeter returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:711:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:712:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:712:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:713:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:713:3: ()
            // InternalImplementationDescriptionParser.g:714:4:
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

            // InternalImplementationDescriptionParser.g:731:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:732:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:732:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:733:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_18);

                        newLeafNode(this_INDENT_4, grammarAccess.getSoftwareExecutionParemeterAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_19);

                        newLeafNode(otherlv_5, grammarAccess.getSoftwareExecutionParemeterAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:758:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:759:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:759:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:760:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_20);
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

            // InternalImplementationDescriptionParser.g:777:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Description) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:778:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getSoftwareExecutionParemeterAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:782:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:783:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:783:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:784:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_21);
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

            // InternalImplementationDescriptionParser.g:802:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Value) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:803:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getSoftwareExecutionParemeterAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_10, grammarAccess.getSoftwareExecutionParemeterAccess().getINDENTTerminalRuleCall_8_1());


                                    newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_22);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:818:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:819:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:819:5: (lv_value_12_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:820:6: lv_value_12_0= rulePropertyValue
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

                    // InternalImplementationDescriptionParser.g:837:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==HyphenMinus) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:838:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_8_4_0());

                            pushFollow(FOLLOW_22);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:845:5: ( (lv_value_14_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:846:6: (lv_value_14_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:846:6: (lv_value_14_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:847:7: lv_value_14_0= rulePropertyValue
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


    // $ANTLR start "entryRulePropertyKind"
    // InternalImplementationDescriptionParser.g:878:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalImplementationDescriptionParser.g:878:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalImplementationDescriptionParser.g:879:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalImplementationDescriptionParser.g:885:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:891:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalImplementationDescriptionParser.g:892:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalImplementationDescriptionParser.g:892:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt16=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt16=1;
                }
                break;
            case MaximumKind:
                {
                alt16=2;
                }
                break;
            case MinimumKind:
                {
                alt16=3;
                }
                break;
            case RangeKind:
                {
                alt16=4;
                }
                break;
            case SelectionKind:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:893:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalImplementationDescriptionParser.g:902:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalImplementationDescriptionParser.g:911:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalImplementationDescriptionParser.g:920:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalImplementationDescriptionParser.g:929:3: this_SelectionKind_4= ruleSelectionKind
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


    // $ANTLR start "entryRuleProperty"
    // InternalImplementationDescriptionParser.g:941:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalImplementationDescriptionParser.g:941:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalImplementationDescriptionParser.g:942:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty;
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalImplementationDescriptionParser.g:948:1: ruleProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
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
            // InternalImplementationDescriptionParser.g:954:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:955:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:955:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:956:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:967:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:968:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:968:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:969:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_18);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_23);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:994:3: ( (lv_kind_5_0= rulePropertyKind ) )
            // InternalImplementationDescriptionParser.g:995:4: (lv_kind_5_0= rulePropertyKind )
            {
            // InternalImplementationDescriptionParser.g:995:4: (lv_kind_5_0= rulePropertyKind )
            // InternalImplementationDescriptionParser.g:996:5: lv_kind_5_0= rulePropertyKind
            {

                                newCompositeNode(grammarAccess.getPropertyAccess().getKindPropertyKindParserRuleCall_5_0());

            pushFollow(FOLLOW_24);
            lv_kind_5_0=rulePropertyKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.PropertyKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:1013:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Description) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1014:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1018:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1019:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1019:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1020:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_25);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRule());
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

            // InternalImplementationDescriptionParser.g:1038:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Value) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1039:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_22);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1054:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1055:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1055:5: (lv_value_11_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1056:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_8);
                    lv_value_11_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_11_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalImplementationDescriptionParser.g:1073:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==HyphenMinus) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:1074:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_22);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:1081:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:1082:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:1082:6: (lv_value_13_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:1083:7: lv_value_13_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                            pushFollow(FOLLOW_8);
                            lv_value_13_0=rulePropertyValue();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getPropertyRule());
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
                            break loop18;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_26);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1106:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DEDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1107:4: this_DEDENT_15= RULE_DEDENT
                    {
                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_8());


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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyAttribute"
    // InternalImplementationDescriptionParser.g:1116:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalImplementationDescriptionParser.g:1116:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalImplementationDescriptionParser.g:1117:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalImplementationDescriptionParser.g:1123:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1129:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1130:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1130:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1131:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1142:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1143:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1143:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1144:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_18);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_19);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1169:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:1170:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:1170:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:1171:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_24);
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

            // InternalImplementationDescriptionParser.g:1188:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Description) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1189:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1193:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1194:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1194:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1195:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1213:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1214:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_22);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1218:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1219:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1219:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1220:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalImplementationDescriptionParser.g:1238:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DEDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1239:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1248:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalImplementationDescriptionParser.g:1248:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalImplementationDescriptionParser.g:1249:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalImplementationDescriptionParser.g:1255:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1261:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1262:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1262:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1263:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1274:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1275:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1275:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1276:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_18);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_27);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1301:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalImplementationDescriptionParser.g:1302:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalImplementationDescriptionParser.g:1302:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalImplementationDescriptionParser.g:1303:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_24);
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

            // InternalImplementationDescriptionParser.g:1320:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Description) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1321:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1325:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1326:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1326:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1327:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1345:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Value) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1346:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_22);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1350:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1351:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1351:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1352:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalImplementationDescriptionParser.g:1370:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DEDENT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1371:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1380:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalImplementationDescriptionParser.g:1380:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalImplementationDescriptionParser.g:1381:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalImplementationDescriptionParser.g:1387:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1393:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1394:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1394:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1395:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1406:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1407:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1407:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1408:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_18);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1433:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalImplementationDescriptionParser.g:1434:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalImplementationDescriptionParser.g:1434:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalImplementationDescriptionParser.g:1435:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_24);
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

            // InternalImplementationDescriptionParser.g:1452:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Description) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1453:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1457:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1458:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1458:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1459:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1477:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Value) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1478:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_22);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1482:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1483:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1483:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1484:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalImplementationDescriptionParser.g:1502:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_DEDENT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1503:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1512:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalImplementationDescriptionParser.g:1512:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalImplementationDescriptionParser.g:1513:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalImplementationDescriptionParser.g:1519:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1525:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1526:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1526:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1527:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1538:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1539:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1539:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1540:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_18);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_23);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1565:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalImplementationDescriptionParser.g:1566:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalImplementationDescriptionParser.g:1566:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalImplementationDescriptionParser.g:1567:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_24);
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

            // InternalImplementationDescriptionParser.g:1584:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Description) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1585:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1589:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1590:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1590:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1591:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1609:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Value) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1610:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_22);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1625:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1626:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1626:5: (lv_value_11_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1627:6: lv_value_11_0= rulePropertyValue
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

                    // InternalImplementationDescriptionParser.g:1644:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==HyphenMinus) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:1645:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_22);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:1652:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:1653:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:1653:6: (lv_value_13_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:1654:7: lv_value_13_0= rulePropertyValue
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
                            break loop31;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_26);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1677:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_DEDENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1678:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1687:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalImplementationDescriptionParser.g:1687:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalImplementationDescriptionParser.g:1688:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalImplementationDescriptionParser.g:1694:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1700:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1701:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1701:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1702:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1713:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1714:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1714:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1715:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_18);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_29);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1740:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalImplementationDescriptionParser.g:1741:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalImplementationDescriptionParser.g:1741:4: (lv_kind_5_0= ruleRangeKind )
            // InternalImplementationDescriptionParser.g:1742:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_24);
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

            // InternalImplementationDescriptionParser.g:1759:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Description) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1760:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1764:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1765:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1765:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1766:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1784:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Value) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1785:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_22);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1800:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1801:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1801:5: (lv_value_11_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1802:6: lv_value_11_0= rulePropertyValue
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

                    pushFollow(FOLLOW_22);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1826:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1827:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1827:5: (lv_value_13_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1828:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_26);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1850:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DEDENT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1851:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1860:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalImplementationDescriptionParser.g:1860:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalImplementationDescriptionParser.g:1861:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalImplementationDescriptionParser.g:1867:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1873:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) )
            // InternalImplementationDescriptionParser.g:1874:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            {
            // InternalImplementationDescriptionParser.g:1874:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            int alt37=4;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt37=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt37=3;
                }
                break;
            case X86_64:
            case Arm64:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1875:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalImplementationDescriptionParser.g:1884:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalImplementationDescriptionParser.g:1893:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalImplementationDescriptionParser.g:1902:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
    // InternalImplementationDescriptionParser.g:1914:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalImplementationDescriptionParser.g:1914:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalImplementationDescriptionParser.g:1915:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalImplementationDescriptionParser.g:1921:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1927:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalImplementationDescriptionParser.g:1928:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalImplementationDescriptionParser.g:1928:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalImplementationDescriptionParser.g:1929:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalImplementationDescriptionParser.g:1929:3: (lv_value_0_0= ruleInteger0 )
            // InternalImplementationDescriptionParser.g:1930:4: lv_value_0_0= ruleInteger0
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
    // InternalImplementationDescriptionParser.g:1950:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalImplementationDescriptionParser.g:1950:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalImplementationDescriptionParser.g:1951:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalImplementationDescriptionParser.g:1957:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1963:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalImplementationDescriptionParser.g:1964:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalImplementationDescriptionParser.g:1964:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalImplementationDescriptionParser.g:1965:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalImplementationDescriptionParser.g:1965:3: (lv_value_0_0= ruleDouble0 )
            // InternalImplementationDescriptionParser.g:1966:4: lv_value_0_0= ruleDouble0
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
    // InternalImplementationDescriptionParser.g:1986:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalImplementationDescriptionParser.g:1986:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalImplementationDescriptionParser.g:1987:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalImplementationDescriptionParser.g:1993:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1999:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2000:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2000:2: ( (lv_value_0_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2001:3: (lv_value_0_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2001:3: (lv_value_0_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2002:4: lv_value_0_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2022:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2022:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalImplementationDescriptionParser.g:2023:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalImplementationDescriptionParser.g:2029:1: ruleProcessorArchitectureValue returns [EObject current=null] : (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject this_X86ProcessorArchitecture_0 = null;

        EObject this_Arm64ProcessorArchitecture_1 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2035:2: ( (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) )
            // InternalImplementationDescriptionParser.g:2036:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            {
            // InternalImplementationDescriptionParser.g:2036:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==X86_64) ) {
                alt38=1;
            }
            else if ( (LA38_0==Arm64) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2037:3: this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture
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
                    // InternalImplementationDescriptionParser.g:2046:3: this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture
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


    // $ANTLR start "entryRuleOpertingSystemType"
    // InternalImplementationDescriptionParser.g:2058:1: entryRuleOpertingSystemType returns [EObject current=null] : iv_ruleOpertingSystemType= ruleOpertingSystemType EOF ;
    public final EObject entryRuleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemType = null;


        try {
            // InternalImplementationDescriptionParser.g:2058:59: (iv_ruleOpertingSystemType= ruleOpertingSystemType EOF )
            // InternalImplementationDescriptionParser.g:2059:2: iv_ruleOpertingSystemType= ruleOpertingSystemType EOF
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
    // InternalImplementationDescriptionParser.g:2065:1: ruleOpertingSystemType returns [EObject current=null] : (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) ;
    public final EObject ruleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystemType_0 = null;

        EObject this_MacOSOpertingSystemType_1 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2071:2: ( (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) )
            // InternalImplementationDescriptionParser.g:2072:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            {
            // InternalImplementationDescriptionParser.g:2072:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Linux) ) {
                alt39=1;
            }
            else if ( (LA39_0==MacOS) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2073:3: this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType
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
                    // InternalImplementationDescriptionParser.g:2082:3: this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType
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


    // $ANTLR start "entryRuleResourceType"
    // InternalImplementationDescriptionParser.g:2094:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalImplementationDescriptionParser.g:2094:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalImplementationDescriptionParser.g:2095:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalImplementationDescriptionParser.g:2101:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2107:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:2108:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:2108:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2109:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2109:3: ()
            // InternalImplementationDescriptionParser.g:2110:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2116:3: ( (lv_name_1_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2117:4: (lv_name_1_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2117:4: (lv_name_1_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2118:5: lv_name_1_0= ruleEString
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


    // $ANTLR start "entryRuleProcessorArchitectureType"
    // InternalImplementationDescriptionParser.g:2139:1: entryRuleProcessorArchitectureType returns [EObject current=null] : iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF ;
    public final EObject entryRuleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureType = null;


        try {
            // InternalImplementationDescriptionParser.g:2139:66: (iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF )
            // InternalImplementationDescriptionParser.g:2140:2: iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF
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
    // InternalImplementationDescriptionParser.g:2146:1: ruleProcessorArchitectureType returns [EObject current=null] : ( () otherlv_1= ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2152:2: ( ( () otherlv_1= ProcessorArchitecture ) )
            // InternalImplementationDescriptionParser.g:2153:2: ( () otherlv_1= ProcessorArchitecture )
            {
            // InternalImplementationDescriptionParser.g:2153:2: ( () otherlv_1= ProcessorArchitecture )
            // InternalImplementationDescriptionParser.g:2154:3: () otherlv_1= ProcessorArchitecture
            {
            // InternalImplementationDescriptionParser.g:2154:3: ()
            // InternalImplementationDescriptionParser.g:2155:4:
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
    // InternalImplementationDescriptionParser.g:2169:1: entryRuleLinuxOpertingSystemType returns [EObject current=null] : iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF ;
    public final EObject entryRuleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystemType = null;


        try {
            // InternalImplementationDescriptionParser.g:2169:64: (iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF )
            // InternalImplementationDescriptionParser.g:2170:2: iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF
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
    // InternalImplementationDescriptionParser.g:2176:1: ruleLinuxOpertingSystemType returns [EObject current=null] : ( () otherlv_1= Linux ) ;
    public final EObject ruleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2182:2: ( ( () otherlv_1= Linux ) )
            // InternalImplementationDescriptionParser.g:2183:2: ( () otherlv_1= Linux )
            {
            // InternalImplementationDescriptionParser.g:2183:2: ( () otherlv_1= Linux )
            // InternalImplementationDescriptionParser.g:2184:3: () otherlv_1= Linux
            {
            // InternalImplementationDescriptionParser.g:2184:3: ()
            // InternalImplementationDescriptionParser.g:2185:4:
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
    // InternalImplementationDescriptionParser.g:2199:1: entryRuleMacOSOpertingSystemType returns [EObject current=null] : iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF ;
    public final EObject entryRuleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystemType = null;


        try {
            // InternalImplementationDescriptionParser.g:2199:64: (iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF )
            // InternalImplementationDescriptionParser.g:2200:2: iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF
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
    // InternalImplementationDescriptionParser.g:2206:1: ruleMacOSOpertingSystemType returns [EObject current=null] : ( () otherlv_1= MacOS ) ;
    public final EObject ruleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2212:2: ( ( () otherlv_1= MacOS ) )
            // InternalImplementationDescriptionParser.g:2213:2: ( () otherlv_1= MacOS )
            {
            // InternalImplementationDescriptionParser.g:2213:2: ( () otherlv_1= MacOS )
            // InternalImplementationDescriptionParser.g:2214:3: () otherlv_1= MacOS
            {
            // InternalImplementationDescriptionParser.g:2214:3: ()
            // InternalImplementationDescriptionParser.g:2215:4:
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
    // InternalImplementationDescriptionParser.g:2229:1: entryRuleX86ProcessorArchitecture returns [EObject current=null] : iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF ;
    public final EObject entryRuleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX86ProcessorArchitecture = null;


        try {
            // InternalImplementationDescriptionParser.g:2229:65: (iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF )
            // InternalImplementationDescriptionParser.g:2230:2: iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF
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
    // InternalImplementationDescriptionParser.g:2236:1: ruleX86ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= X86_64 ) ;
    public final EObject ruleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2242:2: ( ( () otherlv_1= X86_64 ) )
            // InternalImplementationDescriptionParser.g:2243:2: ( () otherlv_1= X86_64 )
            {
            // InternalImplementationDescriptionParser.g:2243:2: ( () otherlv_1= X86_64 )
            // InternalImplementationDescriptionParser.g:2244:3: () otherlv_1= X86_64
            {
            // InternalImplementationDescriptionParser.g:2244:3: ()
            // InternalImplementationDescriptionParser.g:2245:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,X86_64,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getX86ProcessorArchitectureAccess().getX86_64Keyword_1());


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
    // InternalImplementationDescriptionParser.g:2259:1: entryRuleArm64ProcessorArchitecture returns [EObject current=null] : iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF ;
    public final EObject entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm64ProcessorArchitecture = null;


        try {
            // InternalImplementationDescriptionParser.g:2259:67: (iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF )
            // InternalImplementationDescriptionParser.g:2260:2: iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF
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
    // InternalImplementationDescriptionParser.g:2266:1: ruleArm64ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= Arm64 ) ;
    public final EObject ruleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2272:2: ( ( () otherlv_1= Arm64 ) )
            // InternalImplementationDescriptionParser.g:2273:2: ( () otherlv_1= Arm64 )
            {
            // InternalImplementationDescriptionParser.g:2273:2: ( () otherlv_1= Arm64 )
            // InternalImplementationDescriptionParser.g:2274:3: () otherlv_1= Arm64
            {
            // InternalImplementationDescriptionParser.g:2274:3: ()
            // InternalImplementationDescriptionParser.g:2275:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Arm64,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getArm64ProcessorArchitectureAccess().getArm64Keyword_1());


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
    // InternalImplementationDescriptionParser.g:2289:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2289:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2290:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2296:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2302:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:2303:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:2303:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2304:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2304:3: ()
            // InternalImplementationDescriptionParser.g:2305:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2311:3: ( (lv_name_1_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2312:4: (lv_name_1_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2312:4: (lv_name_1_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2313:5: lv_name_1_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2334:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2334:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2335:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2341:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2347:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalImplementationDescriptionParser.g:2348:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalImplementationDescriptionParser.g:2348:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Ethernet) ) {
                alt40=1;
            }
            else if ( (LA40_0==Wlan) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2349:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalImplementationDescriptionParser.g:2358:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalImplementationDescriptionParser.g:2370:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2370:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2371:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2377:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2383:2: ( ( () otherlv_1= Ethernet ) )
            // InternalImplementationDescriptionParser.g:2384:2: ( () otherlv_1= Ethernet )
            {
            // InternalImplementationDescriptionParser.g:2384:2: ( () otherlv_1= Ethernet )
            // InternalImplementationDescriptionParser.g:2385:3: () otherlv_1= Ethernet
            {
            // InternalImplementationDescriptionParser.g:2385:3: ()
            // InternalImplementationDescriptionParser.g:2386:4:
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
    // InternalImplementationDescriptionParser.g:2400:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2400:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2401:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2407:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2413:2: ( ( () otherlv_1= Wlan ) )
            // InternalImplementationDescriptionParser.g:2414:2: ( () otherlv_1= Wlan )
            {
            // InternalImplementationDescriptionParser.g:2414:2: ( () otherlv_1= Wlan )
            // InternalImplementationDescriptionParser.g:2415:3: () otherlv_1= Wlan
            {
            // InternalImplementationDescriptionParser.g:2415:3: ()
            // InternalImplementationDescriptionParser.g:2416:4:
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
    // InternalImplementationDescriptionParser.g:2430:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2430:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalImplementationDescriptionParser.g:2431:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalImplementationDescriptionParser.g:2437:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2443:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalImplementationDescriptionParser.g:2444:2: ( () otherlv_1= AttributeKind )
            {
            // InternalImplementationDescriptionParser.g:2444:2: ( () otherlv_1= AttributeKind )
            // InternalImplementationDescriptionParser.g:2445:3: () otherlv_1= AttributeKind
            {
            // InternalImplementationDescriptionParser.g:2445:3: ()
            // InternalImplementationDescriptionParser.g:2446:4:
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
    // InternalImplementationDescriptionParser.g:2460:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2460:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalImplementationDescriptionParser.g:2461:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalImplementationDescriptionParser.g:2467:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2473:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalImplementationDescriptionParser.g:2474:2: ( () otherlv_1= MaximumKind )
            {
            // InternalImplementationDescriptionParser.g:2474:2: ( () otherlv_1= MaximumKind )
            // InternalImplementationDescriptionParser.g:2475:3: () otherlv_1= MaximumKind
            {
            // InternalImplementationDescriptionParser.g:2475:3: ()
            // InternalImplementationDescriptionParser.g:2476:4:
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
    // InternalImplementationDescriptionParser.g:2490:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2490:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalImplementationDescriptionParser.g:2491:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalImplementationDescriptionParser.g:2497:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2503:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalImplementationDescriptionParser.g:2504:2: ( () otherlv_1= MinimumKind )
            {
            // InternalImplementationDescriptionParser.g:2504:2: ( () otherlv_1= MinimumKind )
            // InternalImplementationDescriptionParser.g:2505:3: () otherlv_1= MinimumKind
            {
            // InternalImplementationDescriptionParser.g:2505:3: ()
            // InternalImplementationDescriptionParser.g:2506:4:
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
    // InternalImplementationDescriptionParser.g:2520:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2520:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalImplementationDescriptionParser.g:2521:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalImplementationDescriptionParser.g:2527:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2533:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalImplementationDescriptionParser.g:2534:2: ( () otherlv_1= SelectionKind )
            {
            // InternalImplementationDescriptionParser.g:2534:2: ( () otherlv_1= SelectionKind )
            // InternalImplementationDescriptionParser.g:2535:3: () otherlv_1= SelectionKind
            {
            // InternalImplementationDescriptionParser.g:2535:3: ()
            // InternalImplementationDescriptionParser.g:2536:4:
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
    // InternalImplementationDescriptionParser.g:2550:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2550:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalImplementationDescriptionParser.g:2551:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalImplementationDescriptionParser.g:2557:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2563:2: ( ( () otherlv_1= RangeKind ) )
            // InternalImplementationDescriptionParser.g:2564:2: ( () otherlv_1= RangeKind )
            {
            // InternalImplementationDescriptionParser.g:2564:2: ( () otherlv_1= RangeKind )
            // InternalImplementationDescriptionParser.g:2565:3: () otherlv_1= RangeKind
            {
            // InternalImplementationDescriptionParser.g:2565:3: ()
            // InternalImplementationDescriptionParser.g:2566:4:
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


    // $ANTLR start "entryRuleDouble0"
    // InternalImplementationDescriptionParser.g:2580:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalImplementationDescriptionParser.g:2580:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalImplementationDescriptionParser.g:2581:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalImplementationDescriptionParser.g:2587:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2593:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalImplementationDescriptionParser.g:2594:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalImplementationDescriptionParser.g:2604:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalImplementationDescriptionParser.g:2604:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalImplementationDescriptionParser.g:2605:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalImplementationDescriptionParser.g:2611:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2617:2: (this_DECINT_0= RULE_DECINT )
            // InternalImplementationDescriptionParser.g:2618:2: this_DECINT_0= RULE_DECINT
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
    // InternalImplementationDescriptionParser.g:2628:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalImplementationDescriptionParser.g:2628:47: (iv_ruleEString= ruleEString EOF )
            // InternalImplementationDescriptionParser.g:2629:2: iv_ruleEString= ruleEString EOF
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
    // InternalImplementationDescriptionParser.g:2635:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2641:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalImplementationDescriptionParser.g:2642:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalImplementationDescriptionParser.g:2642:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2643:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:2651:3: this_ID_1= RULE_ID
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
    // InternalImplementationDescriptionParser.g:2662:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalImplementationDescriptionParser.g:2664:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalImplementationDescriptionParser.g:2665:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalImplementationDescriptionParser.g:2674:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalImplementationDescriptionParser.g:2681:2: (kw= HyphenMinus )
            // InternalImplementationDescriptionParser.g:2682:2: kw= HyphenMinus
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000410L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000104000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000500600280000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000003B000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000104002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000100002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L});

}
