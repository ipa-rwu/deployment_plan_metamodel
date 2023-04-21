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
import de.fraunhofer.ipa.deplyoment.services.PlanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExecutionConfiguration", "LinuxOpertingSystem", "MacOSOpertingSystem", "OpertingSystemType", "SoftwareComponents", "DeploymentPlan", "AttributeKind", "SelectionKind", "StartCommand", "Description", "RuntimeType", "MaximumKind", "MinimumKind", "Assignment", "ExecutedBy", "Middleware", "Properties", "Processor", "RangeKind", "Container", "DeployTo", "Ethernet", "Rolling", "Humble", "Noetic", "Debian", "Humble_1", "Noetic_1", "Ubuntu", "Value", "Arm64", "Focal", "From", "Jammy", "Kind", "Name", "Type", "Wlan", "To", "X86", "HyphenMinus", "Colon", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int SoftwareComponents=8;
    public static final int DeployTo=24;
    public static final int AttributeKind=10;
    public static final int Noetic=28;
    public static final int Name=39;
    public static final int Assignment=17;
    public static final int Container=23;
    public static final int Debian=29;
    public static final int Kind=38;
    public static final int To=42;
    public static final int ExecutedBy=18;
    public static final int Ubuntu=32;
    public static final int RULE_DEDENT=51;
    public static final int LinuxOpertingSystem=5;
    public static final int RULE_ID=52;
    public static final int RULE_DIGIT=46;
    public static final int Middleware=19;
    public static final int SelectionKind=11;
    public static final int Arm64=34;
    public static final int RULE_INT=53;
    public static final int Ethernet=25;
    public static final int Value=33;
    public static final int RULE_ML_COMMENT=55;
    public static final int Noetic_1=31;
    public static final int Description=13;
    public static final int Processor=21;
    public static final int StartCommand=12;
    public static final int Humble_1=30;
    public static final int RULE_STRING=54;
    public static final int Focal=35;
    public static final int Wlan=41;
    public static final int Properties=20;
    public static final int RULE_SL_COMMENT=49;
    public static final int HyphenMinus=44;
    public static final int OpertingSystemType=7;
    public static final int RULE_DOUBLE=48;
    public static final int X86=43;
    public static final int Colon=45;
    public static final int RULE_DECINT=47;
    public static final int DeploymentPlan=9;
    public static final int MinimumKind=16;
    public static final int EOF=-1;
    public static final int RULE_INDENT=50;
    public static final int Jammy=37;
    public static final int RULE_WS=56;
    public static final int Rolling=26;
    public static final int ExecutionConfiguration=4;
    public static final int MaximumKind=15;
    public static final int From=36;
    public static final int RULE_ANY_OTHER=57;
    public static final int RangeKind=22;
    public static final int Type=40;
    public static final int MacOSOpertingSystem=6;
    public static final int RuntimeType=14;
    public static final int Humble=27;

    // delegates
    // delegators


        public InternalPlanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalPlanParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPlanParser.g"; }



        private PlanGrammarAccess grammarAccess;

        public InternalPlanParser(TokenStream input, PlanGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
            return "DeploymentPlan";
        }

        @Override
        protected PlanGrammarAccess getGrammarAccess() {
            return grammarAccess;
        }




    // $ANTLR start "entryRuleDeploymentPlan"
    // InternalPlanParser.g:58:1: entryRuleDeploymentPlan returns [EObject current=null] : iv_ruleDeploymentPlan= ruleDeploymentPlan EOF ;
    public final EObject entryRuleDeploymentPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentPlan = null;


        try {
            // InternalPlanParser.g:58:55: (iv_ruleDeploymentPlan= ruleDeploymentPlan EOF )
            // InternalPlanParser.g:59:2: iv_ruleDeploymentPlan= ruleDeploymentPlan EOF
            {
             newCompositeNode(grammarAccess.getDeploymentPlanRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeploymentPlan=ruleDeploymentPlan();

            state._fsp--;

             current =iv_ruleDeploymentPlan;
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
    // $ANTLR end "entryRuleDeploymentPlan"


    // $ANTLR start "ruleDeploymentPlan"
    // InternalPlanParser.g:65:1: ruleDeploymentPlan returns [EObject current=null] : (otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT ) ;
    public final EObject ruleDeploymentPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_DEDENT_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_realize_6_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:71:2: ( (otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT ) )
            // InternalPlanParser.g:72:2: (otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT )
            {
            // InternalPlanParser.g:72:2: (otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT )
            // InternalPlanParser.g:73:3: otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,DeploymentPlan,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getDeploymentPlanAccess().getDeploymentPlanKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_1, grammarAccess.getDeploymentPlanAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getDeploymentPlanAccess().getNameKeyword_2());

            // InternalPlanParser.g:85:3: ( (lv_name_3_0= ruleEString ) )
            // InternalPlanParser.g:86:4: (lv_name_3_0= ruleEString )
            {
            // InternalPlanParser.g:86:4: (lv_name_3_0= ruleEString )
            // InternalPlanParser.g:87:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeploymentPlanAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeploymentPlanRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_4=(Token)match(input,DeployTo,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getDeploymentPlanAccess().getDeployToKeyword_4());

            // InternalPlanParser.g:108:3: ( ( ruleEString ) )
            // InternalPlanParser.g:109:4: ( ruleEString )
            {
            // InternalPlanParser.g:109:4: ( ruleEString )
            // InternalPlanParser.g:110:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getDeploymentPlanRule());
                                }


                                newCompositeNode(grammarAccess.getDeploymentPlanAccess().getDeployToTargetDeployEnviromentCrossReference_5_0());

            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanParser.g:124:3: ( (lv_realize_6_0= ruleAbstractRealization ) )
            // InternalPlanParser.g:125:4: (lv_realize_6_0= ruleAbstractRealization )
            {
            // InternalPlanParser.g:125:4: (lv_realize_6_0= ruleAbstractRealization )
            // InternalPlanParser.g:126:5: lv_realize_6_0= ruleAbstractRealization
            {

                                newCompositeNode(grammarAccess.getDeploymentPlanAccess().getRealizeAbstractRealizationParserRuleCall_6_0());

            pushFollow(FOLLOW_8);
            lv_realize_6_0=ruleAbstractRealization();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeploymentPlanRule());
                                }
                                set(
                                    current,
                                    "realize",
                                    lv_realize_6_0,
                                    "de.fraunhofer.ipa.deplyoment.Plan.AbstractRealization");
                                afterParserOrEnumRuleCall();


            }


            }

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_7, grammarAccess.getDeploymentPlanAccess().getDEDENTTerminalRuleCall_7());


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
    // $ANTLR end "ruleDeploymentPlan"


    // $ANTLR start "entryRuleAbstractComputationAssignment"
    // InternalPlanParser.g:151:1: entryRuleAbstractComputationAssignment returns [EObject current=null] : iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF ;
    public final EObject entryRuleAbstractComputationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComputationAssignment = null;


        try {
            // InternalPlanParser.g:151:70: (iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF )
            // InternalPlanParser.g:152:2: iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF
            {
             newCompositeNode(grammarAccess.getAbstractComputationAssignmentRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComputationAssignment=ruleAbstractComputationAssignment();

            state._fsp--;

             current =iv_ruleAbstractComputationAssignment;
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
    // $ANTLR end "entryRuleAbstractComputationAssignment"


    // $ANTLR start "ruleAbstractComputationAssignment"
    // InternalPlanParser.g:158:1: ruleAbstractComputationAssignment returns [EObject current=null] : this_ImplementationAssignment_0= ruleImplementationAssignment ;
    public final EObject ruleAbstractComputationAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_ImplementationAssignment_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:164:2: (this_ImplementationAssignment_0= ruleImplementationAssignment )
            // InternalPlanParser.g:165:2: this_ImplementationAssignment_0= ruleImplementationAssignment
            {

                    newCompositeNode(grammarAccess.getAbstractComputationAssignmentAccess().getImplementationAssignmentParserRuleCall());

            pushFollow(FOLLOW_2);
            this_ImplementationAssignment_0=ruleImplementationAssignment();

            state._fsp--;


                    current = this_ImplementationAssignment_0;
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
    // $ANTLR end "ruleAbstractComputationAssignment"


    // $ANTLR start "entryRuleAbstractRealization"
    // InternalPlanParser.g:176:1: entryRuleAbstractRealization returns [EObject current=null] : iv_ruleAbstractRealization= ruleAbstractRealization EOF ;
    public final EObject entryRuleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRealization = null;


        try {
            // InternalPlanParser.g:176:60: (iv_ruleAbstractRealization= ruleAbstractRealization EOF )
            // InternalPlanParser.g:177:2: iv_ruleAbstractRealization= ruleAbstractRealization EOF
            {
             newCompositeNode(grammarAccess.getAbstractRealizationRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractRealization=ruleAbstractRealization();

            state._fsp--;

             current =iv_ruleAbstractRealization;
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
    // $ANTLR end "entryRuleAbstractRealization"


    // $ANTLR start "ruleAbstractRealization"
    // InternalPlanParser.g:183:1: ruleAbstractRealization returns [EObject current=null] : this_Realization_0= ruleRealization ;
    public final EObject ruleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject this_Realization_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:189:2: (this_Realization_0= ruleRealization )
            // InternalPlanParser.g:190:2: this_Realization_0= ruleRealization
            {

                    newCompositeNode(grammarAccess.getAbstractRealizationAccess().getRealizationParserRuleCall());

            pushFollow(FOLLOW_2);
            this_Realization_0=ruleRealization();

            state._fsp--;


                    current = this_Realization_0;
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
    // $ANTLR end "ruleAbstractRealization"


    // $ANTLR start "entryRuleAbstractConfigExecutionParameter"
    // InternalPlanParser.g:201:1: entryRuleAbstractConfigExecutionParameter returns [EObject current=null] : iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF ;
    public final EObject entryRuleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractConfigExecutionParameter = null;


        try {
            // InternalPlanParser.g:201:73: (iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF )
            // InternalPlanParser.g:202:2: iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractConfigExecutionParameterRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractConfigExecutionParameter=ruleAbstractConfigExecutionParameter();

            state._fsp--;

             current =iv_ruleAbstractConfigExecutionParameter;
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
    // $ANTLR end "entryRuleAbstractConfigExecutionParameter"


    // $ANTLR start "ruleAbstractConfigExecutionParameter"
    // InternalPlanParser.g:208:1: ruleAbstractConfigExecutionParameter returns [EObject current=null] : this_ConfigExecutionParameter_0= ruleConfigExecutionParameter ;
    public final EObject ruleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigExecutionParameter_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:214:2: (this_ConfigExecutionParameter_0= ruleConfigExecutionParameter )
            // InternalPlanParser.g:215:2: this_ConfigExecutionParameter_0= ruleConfigExecutionParameter
            {

                    newCompositeNode(grammarAccess.getAbstractConfigExecutionParameterAccess().getConfigExecutionParameterParserRuleCall());

            pushFollow(FOLLOW_2);
            this_ConfigExecutionParameter_0=ruleConfigExecutionParameter();

            state._fsp--;


                    current = this_ConfigExecutionParameter_0;
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
    // $ANTLR end "ruleAbstractConfigExecutionParameter"


    // $ANTLR start "entryRuleRealization"
    // InternalPlanParser.g:226:1: entryRuleRealization returns [EObject current=null] : iv_ruleRealization= ruleRealization EOF ;
    public final EObject entryRuleRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealization = null;


        try {
            // InternalPlanParser.g:226:52: (iv_ruleRealization= ruleRealization EOF )
            // InternalPlanParser.g:227:2: iv_ruleRealization= ruleRealization EOF
            {
             newCompositeNode(grammarAccess.getRealizationRule());
            pushFollow(FOLLOW_1);
            iv_ruleRealization=ruleRealization();

            state._fsp--;

             current =iv_ruleRealization;
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
    // $ANTLR end "entryRuleRealization"


    // $ANTLR start "ruleRealization"
    // InternalPlanParser.g:233:1: ruleRealization returns [EObject current=null] : ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) ;
    public final EObject ruleRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token this_DEDENT_4=null;
        EObject lv_realizations_3_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:239:2: ( ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) )
            // InternalPlanParser.g:240:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:240:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            // InternalPlanParser.g:241:3: () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            {
            // InternalPlanParser.g:241:3: ()
            // InternalPlanParser.g:242:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getRealizationAccess().getRealizationAction_0(),
                                current);


            }

            // InternalPlanParser.g:248:3: (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Assignment) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPlanParser.g:249:4: otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Assignment,FOLLOW_3);

                                    newLeafNode(otherlv_1, grammarAccess.getRealizationAccess().getAssignmentKeyword_1_0());

                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                    newLeafNode(this_INDENT_2, grammarAccess.getRealizationAccess().getINDENTTerminalRuleCall_1_1());

                    // InternalPlanParser.g:257:4: ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==HyphenMinus) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                        case 1 :
                            // InternalPlanParser.g:258:5: (lv_realizations_3_0= ruleAbstractComputationAssignment )
                            {
                            // InternalPlanParser.g:258:5: (lv_realizations_3_0= ruleAbstractComputationAssignment )
                            // InternalPlanParser.g:259:6: lv_realizations_3_0= ruleAbstractComputationAssignment
                            {

                                                    newCompositeNode(grammarAccess.getRealizationAccess().getRealizationsAbstractComputationAssignmentParserRuleCall_1_2_0());

                            pushFollow(FOLLOW_10);
                            lv_realizations_3_0=ruleAbstractComputationAssignment();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getRealizationRule());
                                                    }
                                                    add(
                                                        current,
                                                        "realizations",
                                                        lv_realizations_3_0,
                                                        "de.fraunhofer.ipa.deplyoment.Plan.AbstractComputationAssignment");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    this_DEDENT_4=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_4, grammarAccess.getRealizationAccess().getDEDENTTerminalRuleCall_1_3());


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
    // $ANTLR end "ruleRealization"


    // $ANTLR start "entryRuleConfigSoftwareComponent"
    // InternalPlanParser.g:285:1: entryRuleConfigSoftwareComponent returns [EObject current=null] : iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF ;
    public final EObject entryRuleConfigSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigSoftwareComponent = null;


        try {
            // InternalPlanParser.g:285:64: (iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF )
            // InternalPlanParser.g:286:2: iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF
            {
             newCompositeNode(grammarAccess.getConfigSoftwareComponentRule());
            pushFollow(FOLLOW_1);
            iv_ruleConfigSoftwareComponent=ruleConfigSoftwareComponent();

            state._fsp--;

             current =iv_ruleConfigSoftwareComponent;
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
    // $ANTLR end "entryRuleConfigSoftwareComponent"


    // $ANTLR start "ruleConfigSoftwareComponent"
    // InternalPlanParser.g:292:1: ruleConfigSoftwareComponent returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) ;
    public final EObject ruleConfigSoftwareComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token otherlv_3=null;
        Token this_INDENT_4=null;
        Token this_DEDENT_6=null;
        Token otherlv_7=null;
        Token this_INDENT_8=null;
        Token this_DEDENT_13=null;
        Token this_DEDENT_14=null;
        EObject lv_executionConfiguration_5_0 = null;

        AntlrDatatypeRuleToken lv_startCommand_10_0 = null;

        AntlrDatatypeRuleToken lv_startCommand_12_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:298:2: ( ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) )
            // InternalPlanParser.g:299:2: ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:299:2: ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            // InternalPlanParser.g:300:3: ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            {
            // InternalPlanParser.g:300:3: ( ( ruleEString ) )
            // InternalPlanParser.g:301:4: ( ruleEString )
            {
            // InternalPlanParser.g:301:4: ( ruleEString )
            // InternalPlanParser.g:302:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigSoftwareComponentRule());
                                }


                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getComponentAbstractComputationAssignmentTargetCrossReference_0_0());

            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanParser.g:316:3: (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Colon) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPlanParser.g:317:4: otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Colon,FOLLOW_12);

                                    newLeafNode(otherlv_1, grammarAccess.getConfigSoftwareComponentAccess().getColonKeyword_1_0());

                    // InternalPlanParser.g:321:4: (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_INDENT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPlanParser.g:322:5: this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT
                            {
                            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_13);

                                                newLeafNode(this_INDENT_2, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_1_0());

                            otherlv_3=(Token)match(input,ExecutionConfiguration,FOLLOW_3);

                                                newLeafNode(otherlv_3, grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationKeyword_1_1_1());

                            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                                newLeafNode(this_INDENT_4, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_1_2());

                            // InternalPlanParser.g:334:5: ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+
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
                                    // InternalPlanParser.g:335:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                    {
                                    // InternalPlanParser.g:335:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                    // InternalPlanParser.g:336:7: lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter
                                    {

                                                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationAbstractConfigExecutionParameterParserRuleCall_1_1_3_0());

                                    pushFollow(FOLLOW_10);
                                    lv_executionConfiguration_5_0=ruleAbstractConfigExecutionParameter();

                                    state._fsp--;


                                                                if (current==null) {
                                                                    current = createModelElementForParent(grammarAccess.getConfigSoftwareComponentRule());
                                                                }
                                                                add(
                                                                    current,
                                                                    "executionConfiguration",
                                                                    lv_executionConfiguration_5_0,
                                                                    "de.fraunhofer.ipa.deplyoment.Plan.AbstractConfigExecutionParameter");
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

                            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_14);

                                                newLeafNode(this_DEDENT_6, grammarAccess.getConfigSoftwareComponentAccess().getDEDENTTerminalRuleCall_1_1_4());


                            }
                            break;

                    }

                    // InternalPlanParser.g:358:4: (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==StartCommand) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPlanParser.g:359:5: otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT
                            {
                            otherlv_7=(Token)match(input,StartCommand,FOLLOW_3);

                                                newLeafNode(otherlv_7, grammarAccess.getConfigSoftwareComponentAccess().getStartCommandKeyword_1_2_0());

                            this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                                newLeafNode(this_INDENT_8, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_2_1());


                                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getPreListElementParserRuleCall_1_2_2());

                            pushFollow(FOLLOW_5);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanParser.g:374:5: ( (lv_startCommand_10_0= ruleEString ) )
                            // InternalPlanParser.g:375:6: (lv_startCommand_10_0= ruleEString )
                            {
                            // InternalPlanParser.g:375:6: (lv_startCommand_10_0= ruleEString )
                            // InternalPlanParser.g:376:7: lv_startCommand_10_0= ruleEString
                            {

                                                        newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getStartCommandEStringParserRuleCall_1_2_3_0());

                            pushFollow(FOLLOW_10);
                            lv_startCommand_10_0=ruleEString();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getConfigSoftwareComponentRule());
                                                        }
                                                        add(
                                                            current,
                                                            "startCommand",
                                                            lv_startCommand_10_0,
                                                            "de.fraunhofer.ipa.deployment.Util.EString");
                                                        afterParserOrEnumRuleCall();


                            }


                            }

                            // InternalPlanParser.g:393:5: ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==HyphenMinus) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalPlanParser.g:394:6: rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )*
                                    {

                                                            newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getPreListElementParserRuleCall_1_2_4_0());

                                    pushFollow(FOLLOW_15);
                                    rulePreListElement();

                                    state._fsp--;


                                                            afterParserOrEnumRuleCall();

                                    // InternalPlanParser.g:401:6: ( (lv_startCommand_12_0= ruleEString ) )*
                                    loop5:
                                    do {
                                        int alt5=2;
                                        int LA5_0 = input.LA(1);

                                        if ( (LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
                                            alt5=1;
                                        }


                                        switch (alt5) {
                                        case 1 :
                                            // InternalPlanParser.g:402:7: (lv_startCommand_12_0= ruleEString )
                                            {
                                            // InternalPlanParser.g:402:7: (lv_startCommand_12_0= ruleEString )
                                            // InternalPlanParser.g:403:8: lv_startCommand_12_0= ruleEString
                                            {

                                                                            newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getStartCommandEStringParserRuleCall_1_2_4_1_0());

                                            pushFollow(FOLLOW_15);
                                            lv_startCommand_12_0=ruleEString();

                                            state._fsp--;


                                                                            if (current==null) {
                                                                                current = createModelElementForParent(grammarAccess.getConfigSoftwareComponentRule());
                                                                            }
                                                                            add(
                                                                                current,
                                                                                "startCommand",
                                                                                lv_startCommand_12_0,
                                                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                                                            afterParserOrEnumRuleCall();


                                            }


                                            }
                                            break;

                                        default :
                                            break loop5;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_8);

                                                newLeafNode(this_DEDENT_13, grammarAccess.getConfigSoftwareComponentAccess().getDEDENTTerminalRuleCall_1_2_5());


                            }
                            break;

                    }

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getConfigSoftwareComponentAccess().getDEDENTTerminalRuleCall_1_3());


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
    // $ANTLR end "ruleConfigSoftwareComponent"


    // $ANTLR start "entryRuleImplementationAssignment"
    // InternalPlanParser.g:435:1: entryRuleImplementationAssignment returns [EObject current=null] : iv_ruleImplementationAssignment= ruleImplementationAssignment EOF ;
    public final EObject entryRuleImplementationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationAssignment = null;


        try {
            // InternalPlanParser.g:435:65: (iv_ruleImplementationAssignment= ruleImplementationAssignment EOF )
            // InternalPlanParser.g:436:2: iv_ruleImplementationAssignment= ruleImplementationAssignment EOF
            {
             newCompositeNode(grammarAccess.getImplementationAssignmentRule());
            pushFollow(FOLLOW_1);
            iv_ruleImplementationAssignment=ruleImplementationAssignment();

            state._fsp--;

             current =iv_ruleImplementationAssignment;
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
    // $ANTLR end "entryRuleImplementationAssignment"


    // $ANTLR start "ruleImplementationAssignment"
    // InternalPlanParser.g:442:1: ruleImplementationAssignment returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= SoftwareComponents this_INDENT_7= RULE_INDENT rulePreListElement ( (lv_softwareComponents_9_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_12= RULE_DEDENT (otherlv_13= Middleware ( (lv_middleware_14_0= ruleMiddleware ) ) )? (otherlv_15= RuntimeType ( (lv_runtimeType_16_0= ruleRunTimeType ) ) )? (otherlv_17= OpertingSystemType ( (lv_opertingSystemType_18_0= ruleOpertingSystemName ) ) )? this_DEDENT_19= RULE_DEDENT ) ;
    public final EObject ruleImplementationAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_INDENT_7=null;
        Token this_DEDENT_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token this_DEDENT_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_softwareComponents_9_0 = null;

        EObject lv_softwareComponents_11_0 = null;

        EObject lv_middleware_14_0 = null;

        Enumerator lv_runtimeType_16_0 = null;

        EObject lv_opertingSystemType_18_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:448:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= SoftwareComponents this_INDENT_7= RULE_INDENT rulePreListElement ( (lv_softwareComponents_9_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_12= RULE_DEDENT (otherlv_13= Middleware ( (lv_middleware_14_0= ruleMiddleware ) ) )? (otherlv_15= RuntimeType ( (lv_runtimeType_16_0= ruleRunTimeType ) ) )? (otherlv_17= OpertingSystemType ( (lv_opertingSystemType_18_0= ruleOpertingSystemName ) ) )? this_DEDENT_19= RULE_DEDENT ) )
            // InternalPlanParser.g:449:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= SoftwareComponents this_INDENT_7= RULE_INDENT rulePreListElement ( (lv_softwareComponents_9_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_12= RULE_DEDENT (otherlv_13= Middleware ( (lv_middleware_14_0= ruleMiddleware ) ) )? (otherlv_15= RuntimeType ( (lv_runtimeType_16_0= ruleRunTimeType ) ) )? (otherlv_17= OpertingSystemType ( (lv_opertingSystemType_18_0= ruleOpertingSystemName ) ) )? this_DEDENT_19= RULE_DEDENT )
            {
            // InternalPlanParser.g:449:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= SoftwareComponents this_INDENT_7= RULE_INDENT rulePreListElement ( (lv_softwareComponents_9_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_12= RULE_DEDENT (otherlv_13= Middleware ( (lv_middleware_14_0= ruleMiddleware ) ) )? (otherlv_15= RuntimeType ( (lv_runtimeType_16_0= ruleRunTimeType ) ) )? (otherlv_17= OpertingSystemType ( (lv_opertingSystemType_18_0= ruleOpertingSystemName ) ) )? this_DEDENT_19= RULE_DEDENT )
            // InternalPlanParser.g:450:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= SoftwareComponents this_INDENT_7= RULE_INDENT rulePreListElement ( (lv_softwareComponents_9_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_12= RULE_DEDENT (otherlv_13= Middleware ( (lv_middleware_14_0= ruleMiddleware ) ) )? (otherlv_15= RuntimeType ( (lv_runtimeType_16_0= ruleRunTimeType ) ) )? (otherlv_17= OpertingSystemType ( (lv_opertingSystemType_18_0= ruleOpertingSystemName ) ) )? this_DEDENT_19= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getImplementationAssignmentAccess().getNameKeyword_1());

            // InternalPlanParser.g:461:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:462:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:462:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:463:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_16);

                        newLeafNode(this_INDENT_3, grammarAccess.getImplementationAssignmentAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,ExecutedBy,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getImplementationAssignmentAccess().getExecutedByKeyword_4());

            // InternalPlanParser.g:488:3: ( ( ruleEString ) )
            // InternalPlanParser.g:489:4: ( ruleEString )
            {
            // InternalPlanParser.g:489:4: ( ruleEString )
            // InternalPlanParser.g:490:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getImplementationAssignmentRule());
                                }


                                newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getExecutedByComputationDeviceInstanceCrossReference_5_0());

            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_6=(Token)match(input,SoftwareComponents,FOLLOW_3);

                        newLeafNode(otherlv_6, grammarAccess.getImplementationAssignmentAccess().getSoftwareComponentsKeyword_6());

            this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_9);

                        newLeafNode(this_INDENT_7, grammarAccess.getImplementationAssignmentAccess().getINDENTTerminalRuleCall_7());


                        newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getPreListElementParserRuleCall_8());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            // InternalPlanParser.g:519:3: ( (lv_softwareComponents_9_0= ruleConfigSoftwareComponent ) )
            // InternalPlanParser.g:520:4: (lv_softwareComponents_9_0= ruleConfigSoftwareComponent )
            {
            // InternalPlanParser.g:520:4: (lv_softwareComponents_9_0= ruleConfigSoftwareComponent )
            // InternalPlanParser.g:521:5: lv_softwareComponents_9_0= ruleConfigSoftwareComponent
            {

                                newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getSoftwareComponentsConfigSoftwareComponentParserRuleCall_9_0());

            pushFollow(FOLLOW_10);
            lv_softwareComponents_9_0=ruleConfigSoftwareComponent();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                }
                                add(
                                    current,
                                    "softwareComponents",
                                    lv_softwareComponents_9_0,
                                    "de.fraunhofer.ipa.deplyoment.Plan.ConfigSoftwareComponent");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanParser.g:538:3: ( rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigSoftwareComponent ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==HyphenMinus) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // InternalPlanParser.g:539:4: rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigSoftwareComponent ) )
                    {

                                    newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getPreListElementParserRuleCall_10_0());

                    pushFollow(FOLLOW_5);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:546:4: ( (lv_softwareComponents_11_0= ruleConfigSoftwareComponent ) )
                    // InternalPlanParser.g:547:5: (lv_softwareComponents_11_0= ruleConfigSoftwareComponent )
                    {
                    // InternalPlanParser.g:547:5: (lv_softwareComponents_11_0= ruleConfigSoftwareComponent )
                    // InternalPlanParser.g:548:6: lv_softwareComponents_11_0= ruleConfigSoftwareComponent
                    {

                                            newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getSoftwareComponentsConfigSoftwareComponentParserRuleCall_10_1_0());

                    pushFollow(FOLLOW_10);
                    lv_softwareComponents_11_0=ruleConfigSoftwareComponent();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                            }
                                            add(
                                                current,
                                                "softwareComponents",
                                                lv_softwareComponents_11_0,
                                                "de.fraunhofer.ipa.deplyoment.Plan.ConfigSoftwareComponent");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

                default :
                    break loop9;
                }
            } while (true);

            this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_18);

                        newLeafNode(this_DEDENT_12, grammarAccess.getImplementationAssignmentAccess().getDEDENTTerminalRuleCall_11());

            // InternalPlanParser.g:570:3: (otherlv_13= Middleware ( (lv_middleware_14_0= ruleMiddleware ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Middleware) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPlanParser.g:571:4: otherlv_13= Middleware ( (lv_middleware_14_0= ruleMiddleware ) )
                    {
                    otherlv_13=(Token)match(input,Middleware,FOLLOW_19);

                                    newLeafNode(otherlv_13, grammarAccess.getImplementationAssignmentAccess().getMiddlewareKeyword_12_0());

                    // InternalPlanParser.g:575:4: ( (lv_middleware_14_0= ruleMiddleware ) )
                    // InternalPlanParser.g:576:5: (lv_middleware_14_0= ruleMiddleware )
                    {
                    // InternalPlanParser.g:576:5: (lv_middleware_14_0= ruleMiddleware )
                    // InternalPlanParser.g:577:6: lv_middleware_14_0= ruleMiddleware
                    {

                                            newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getMiddlewareMiddlewareParserRuleCall_12_1_0());

                    pushFollow(FOLLOW_20);
                    lv_middleware_14_0=ruleMiddleware();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                            }
                                            set(
                                                current,
                                                "middleware",
                                                lv_middleware_14_0,
                                                "de.fraunhofer.ipa.deplyoment.Plan.Middleware");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalPlanParser.g:595:3: (otherlv_15= RuntimeType ( (lv_runtimeType_16_0= ruleRunTimeType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RuntimeType) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPlanParser.g:596:4: otherlv_15= RuntimeType ( (lv_runtimeType_16_0= ruleRunTimeType ) )
                    {
                    otherlv_15=(Token)match(input,RuntimeType,FOLLOW_21);

                                    newLeafNode(otherlv_15, grammarAccess.getImplementationAssignmentAccess().getRuntimeTypeKeyword_13_0());

                    // InternalPlanParser.g:600:4: ( (lv_runtimeType_16_0= ruleRunTimeType ) )
                    // InternalPlanParser.g:601:5: (lv_runtimeType_16_0= ruleRunTimeType )
                    {
                    // InternalPlanParser.g:601:5: (lv_runtimeType_16_0= ruleRunTimeType )
                    // InternalPlanParser.g:602:6: lv_runtimeType_16_0= ruleRunTimeType
                    {

                                            newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getRuntimeTypeRunTimeTypeEnumRuleCall_13_1_0());

                    pushFollow(FOLLOW_22);
                    lv_runtimeType_16_0=ruleRunTimeType();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                            }
                                            set(
                                                current,
                                                "runtimeType",
                                                lv_runtimeType_16_0,
                                                "de.fraunhofer.ipa.deployment.Util.RunTimeType");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalPlanParser.g:620:3: (otherlv_17= OpertingSystemType ( (lv_opertingSystemType_18_0= ruleOpertingSystemName ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==OpertingSystemType) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPlanParser.g:621:4: otherlv_17= OpertingSystemType ( (lv_opertingSystemType_18_0= ruleOpertingSystemName ) )
                    {
                    otherlv_17=(Token)match(input,OpertingSystemType,FOLLOW_23);

                                    newLeafNode(otherlv_17, grammarAccess.getImplementationAssignmentAccess().getOpertingSystemTypeKeyword_14_0());

                    // InternalPlanParser.g:625:4: ( (lv_opertingSystemType_18_0= ruleOpertingSystemName ) )
                    // InternalPlanParser.g:626:5: (lv_opertingSystemType_18_0= ruleOpertingSystemName )
                    {
                    // InternalPlanParser.g:626:5: (lv_opertingSystemType_18_0= ruleOpertingSystemName )
                    // InternalPlanParser.g:627:6: lv_opertingSystemType_18_0= ruleOpertingSystemName
                    {

                                            newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getOpertingSystemTypeOpertingSystemNameParserRuleCall_14_1_0());

                    pushFollow(FOLLOW_8);
                    lv_opertingSystemType_18_0=ruleOpertingSystemName();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                            }
                                            set(
                                                current,
                                                "opertingSystemType",
                                                lv_opertingSystemType_18_0,
                                                "de.fraunhofer.ipa.deployment.Util.OpertingSystemName");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_19=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_19, grammarAccess.getImplementationAssignmentAccess().getDEDENTTerminalRuleCall_15());


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
    // $ANTLR end "ruleImplementationAssignment"


    // $ANTLR start "entryRuleMiddleware"
    // InternalPlanParser.g:653:1: entryRuleMiddleware returns [EObject current=null] : iv_ruleMiddleware= ruleMiddleware EOF ;
    public final EObject entryRuleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleware = null;


        try {
            // InternalPlanParser.g:653:51: (iv_ruleMiddleware= ruleMiddleware EOF )
            // InternalPlanParser.g:654:2: iv_ruleMiddleware= ruleMiddleware EOF
            {
             newCompositeNode(grammarAccess.getMiddlewareRule());
            pushFollow(FOLLOW_1);
            iv_ruleMiddleware=ruleMiddleware();

            state._fsp--;

             current =iv_ruleMiddleware;
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
    // $ANTLR end "entryRuleMiddleware"


    // $ANTLR start "ruleMiddleware"
    // InternalPlanParser.g:660:1: ruleMiddleware returns [EObject current=null] : this_RosMiddleware_0= ruleRosMiddleware ;
    public final EObject ruleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_RosMiddleware_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:666:2: (this_RosMiddleware_0= ruleRosMiddleware )
            // InternalPlanParser.g:667:2: this_RosMiddleware_0= ruleRosMiddleware
            {

                    newCompositeNode(grammarAccess.getMiddlewareAccess().getRosMiddlewareParserRuleCall());

            pushFollow(FOLLOW_2);
            this_RosMiddleware_0=ruleRosMiddleware();

            state._fsp--;


                    current = this_RosMiddleware_0;
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
    // $ANTLR end "ruleMiddleware"


    // $ANTLR start "entryRuleRosMiddleware"
    // InternalPlanParser.g:678:1: entryRuleRosMiddleware returns [EObject current=null] : iv_ruleRosMiddleware= ruleRosMiddleware EOF ;
    public final EObject entryRuleRosMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosMiddleware = null;


        try {
            // InternalPlanParser.g:678:54: (iv_ruleRosMiddleware= ruleRosMiddleware EOF )
            // InternalPlanParser.g:679:2: iv_ruleRosMiddleware= ruleRosMiddleware EOF
            {
             newCompositeNode(grammarAccess.getRosMiddlewareRule());
            pushFollow(FOLLOW_1);
            iv_ruleRosMiddleware=ruleRosMiddleware();

            state._fsp--;

             current =iv_ruleRosMiddleware;
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
    // $ANTLR end "entryRuleRosMiddleware"


    // $ANTLR start "ruleRosMiddleware"
    // InternalPlanParser.g:685:1: ruleRosMiddleware returns [EObject current=null] : ( (lv_value_0_0= ruleROSDistro ) ) ;
    public final EObject ruleRosMiddleware() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:691:2: ( ( (lv_value_0_0= ruleROSDistro ) ) )
            // InternalPlanParser.g:692:2: ( (lv_value_0_0= ruleROSDistro ) )
            {
            // InternalPlanParser.g:692:2: ( (lv_value_0_0= ruleROSDistro ) )
            // InternalPlanParser.g:693:3: (lv_value_0_0= ruleROSDistro )
            {
            // InternalPlanParser.g:693:3: (lv_value_0_0= ruleROSDistro )
            // InternalPlanParser.g:694:4: lv_value_0_0= ruleROSDistro
            {

                            newCompositeNode(grammarAccess.getRosMiddlewareAccess().getValueROSDistroEnumRuleCall_0());

            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleROSDistro();

            state._fsp--;


                            if (current==null) {
                                current = createModelElementForParent(grammarAccess.getRosMiddlewareRule());
                            }
                            set(
                                current,
                                "value",
                                lv_value_0_0,
                                "de.fraunhofer.ipa.deplyoment.Plan.ROSDistro");
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
    // $ANTLR end "ruleRosMiddleware"


    // $ANTLR start "entryRuleConfigExecutionParameter"
    // InternalPlanParser.g:714:1: entryRuleConfigExecutionParameter returns [EObject current=null] : iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF ;
    public final EObject entryRuleConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigExecutionParameter = null;


        try {
            // InternalPlanParser.g:714:65: (iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF )
            // InternalPlanParser.g:715:2: iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF
            {
             newCompositeNode(grammarAccess.getConfigExecutionParameterRule());
            pushFollow(FOLLOW_1);
            iv_ruleConfigExecutionParameter=ruleConfigExecutionParameter();

            state._fsp--;

             current =iv_ruleConfigExecutionParameter;
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
    // $ANTLR end "entryRuleConfigExecutionParameter"


    // $ANTLR start "ruleConfigExecutionParameter"
    // InternalPlanParser.g:721:1: ruleConfigExecutionParameter returns [EObject current=null] : ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
    public final EObject ruleConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_DEDENT_9=null;
        EObject lv_value_8_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:727:2: ( ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalPlanParser.g:728:2: ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalPlanParser.g:728:2: ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalPlanParser.g:729:3: () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalPlanParser.g:729:3: ()
            // InternalPlanParser.g:730:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigExecutionParameterAccess().getConfigExecutionParameterAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_24);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,From,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getConfigExecutionParameterAccess().getFromKeyword_2());

            // InternalPlanParser.g:747:3: ( ( ruleEString ) )
            // InternalPlanParser.g:748:4: ( ruleEString )
            {
            // InternalPlanParser.g:748:4: ( ruleEString )
            // InternalPlanParser.g:749:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigExecutionParameterRule());
                                }


                                newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getFromExecutionPropertyCrossReference_3_0());

            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_25);

                        newLeafNode(this_INDENT_4, grammarAccess.getConfigExecutionParameterAccess().getINDENTTerminalRuleCall_4());

            // InternalPlanParser.g:767:3: (otherlv_5= To ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==To) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPlanParser.g:768:4: otherlv_5= To ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,To,FOLLOW_5);

                                    newLeafNode(otherlv_5, grammarAccess.getConfigExecutionParameterAccess().getToKeyword_5_0());

                    // InternalPlanParser.g:772:4: ( ( ruleEString ) )
                    // InternalPlanParser.g:773:5: ( ruleEString )
                    {
                    // InternalPlanParser.g:773:5: ( ruleEString )
                    // InternalPlanParser.g:774:6: ruleEString
                    {

                                            if (current==null) {
                                                current = createModelElement(grammarAccess.getConfigExecutionParameterRule());
                                            }


                                            newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getToAbstractConfigPropertyCrossReference_5_1_0());

                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalPlanParser.g:789:3: (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Value) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPlanParser.g:790:4: otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) )
                    {
                    otherlv_7=(Token)match(input,Value,FOLLOW_27);

                                    newLeafNode(otherlv_7, grammarAccess.getConfigExecutionParameterAccess().getValueKeyword_6_0());

                    // InternalPlanParser.g:794:4: ( (lv_value_8_0= rulePropertyValue ) )
                    // InternalPlanParser.g:795:5: (lv_value_8_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:795:5: (lv_value_8_0= rulePropertyValue )
                    // InternalPlanParser.g:796:6: lv_value_8_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getValuePropertyValueParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_8);
                    lv_value_8_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getConfigExecutionParameterRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_8_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_9, grammarAccess.getConfigExecutionParameterAccess().getDEDENTTerminalRuleCall_7());


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
    // $ANTLR end "ruleConfigExecutionParameter"


    // $ANTLR start "entryRuleAbstractProperty"
    // InternalPlanParser.g:822:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalPlanParser.g:822:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalPlanParser.g:823:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalPlanParser.g:829:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



            enterRule();

        try {
            // InternalPlanParser.g:835:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalPlanParser.g:836:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalPlanParser.g:836:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt15=5;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalPlanParser.g:837:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalPlanParser.g:846:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalPlanParser.g:855:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalPlanParser.g:864:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalPlanParser.g:873:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalPlanParser.g:885:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalPlanParser.g:885:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalPlanParser.g:886:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalPlanParser.g:892:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalPlanParser.g:898:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalPlanParser.g:899:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalPlanParser.g:899:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
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
                    // InternalPlanParser.g:900:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalPlanParser.g:909:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalPlanParser.g:918:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalPlanParser.g:927:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalPlanParser.g:936:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalPlanParser.g:948:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalPlanParser.g:948:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalPlanParser.g:949:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalPlanParser.g:955:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:961:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanParser.g:962:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:962:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanParser.g:963:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalPlanParser.g:974:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:975:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:975:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:976:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_28);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_29);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalPlanParser.g:1001:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalPlanParser.g:1002:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalPlanParser.g:1002:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalPlanParser.g:1003:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_30);
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

            // InternalPlanParser.g:1020:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Description) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPlanParser.g:1021:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1025:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1026:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1026:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1027:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalPlanParser.g:1045:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Value) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPlanParser.g:1046:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_27);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalPlanParser.g:1050:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1051:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1051:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanParser.g:1052:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_32);
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

            // InternalPlanParser.g:1070:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DEDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPlanParser.g:1071:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanParser.g:1080:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalPlanParser.g:1080:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalPlanParser.g:1081:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalPlanParser.g:1087:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:1093:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanParser.g:1094:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:1094:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanParser.g:1095:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalPlanParser.g:1106:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:1107:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:1107:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:1108:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_28);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_33);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalPlanParser.g:1133:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalPlanParser.g:1134:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalPlanParser.g:1134:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalPlanParser.g:1135:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_30);
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

            // InternalPlanParser.g:1152:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Description) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPlanParser.g:1153:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1157:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1158:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1158:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1159:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalPlanParser.g:1177:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Value) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPlanParser.g:1178:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_27);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalPlanParser.g:1182:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1183:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1183:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanParser.g:1184:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_32);
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

            // InternalPlanParser.g:1202:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DEDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPlanParser.g:1203:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanParser.g:1212:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalPlanParser.g:1212:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalPlanParser.g:1213:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalPlanParser.g:1219:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:1225:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanParser.g:1226:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:1226:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanParser.g:1227:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalPlanParser.g:1238:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:1239:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:1239:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:1240:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_28);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_34);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalPlanParser.g:1265:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalPlanParser.g:1266:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalPlanParser.g:1266:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalPlanParser.g:1267:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_30);
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

            // InternalPlanParser.g:1284:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Description) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPlanParser.g:1285:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1289:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1290:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1290:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1291:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalPlanParser.g:1309:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Value) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPlanParser.g:1310:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_27);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalPlanParser.g:1314:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1315:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1315:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanParser.g:1316:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_32);
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

            // InternalPlanParser.g:1334:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DEDENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPlanParser.g:1335:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanParser.g:1344:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalPlanParser.g:1344:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalPlanParser.g:1345:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalPlanParser.g:1351:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:1357:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanParser.g:1358:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:1358:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanParser.g:1359:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalPlanParser.g:1370:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:1371:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:1371:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:1372:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_28);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_35);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalPlanParser.g:1397:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalPlanParser.g:1398:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalPlanParser.g:1398:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalPlanParser.g:1399:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_30);
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

            // InternalPlanParser.g:1416:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Description) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPlanParser.g:1417:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1421:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1422:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1422:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1423:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalPlanParser.g:1441:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Value) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPlanParser.g:1442:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_27);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:1457:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1458:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1458:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanParser.g:1459:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_10);
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

                    // InternalPlanParser.g:1476:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==HyphenMinus) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                        case 1 :
                            // InternalPlanParser.g:1477:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_27);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanParser.g:1484:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalPlanParser.g:1485:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalPlanParser.g:1485:6: (lv_value_13_0= rulePropertyValue )
                            // InternalPlanParser.g:1486:7: lv_value_13_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                            pushFollow(FOLLOW_10);
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
                            break loop27;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_32);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalPlanParser.g:1509:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_DEDENT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPlanParser.g:1510:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanParser.g:1519:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalPlanParser.g:1519:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalPlanParser.g:1520:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalPlanParser.g:1526:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:1532:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanParser.g:1533:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:1533:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanParser.g:1534:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalPlanParser.g:1545:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:1546:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:1546:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:1547:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_28);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_36);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalPlanParser.g:1572:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalPlanParser.g:1573:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalPlanParser.g:1573:4: (lv_kind_5_0= ruleRangeKind )
            // InternalPlanParser.g:1574:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_30);
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

            // InternalPlanParser.g:1591:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Description) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPlanParser.g:1592:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1596:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1597:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1597:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1598:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalPlanParser.g:1616:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Value) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPlanParser.g:1617:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_27);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:1632:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1633:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1633:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanParser.g:1634:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_9);
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

                    pushFollow(FOLLOW_27);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:1658:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1659:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1659:5: (lv_value_13_0= rulePropertyValue )
                    // InternalPlanParser.g:1660:6: lv_value_13_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_5_0());

                    pushFollow(FOLLOW_8);
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_32);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalPlanParser.g:1682:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DEDENT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPlanParser.g:1683:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanParser.g:1692:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalPlanParser.g:1692:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalPlanParser.g:1693:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalPlanParser.g:1699:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) ;
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
            // InternalPlanParser.g:1705:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) )
            // InternalPlanParser.g:1706:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            {
            // InternalPlanParser.g:1706:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            int alt33=6;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt33=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt33=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt33=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt33=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt33=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalPlanParser.g:1707:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalPlanParser.g:1716:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalPlanParser.g:1725:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalPlanParser.g:1734:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalPlanParser.g:1743:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalPlanParser.g:1752:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
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
    // InternalPlanParser.g:1764:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalPlanParser.g:1764:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalPlanParser.g:1765:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalPlanParser.g:1771:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:1777:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalPlanParser.g:1778:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalPlanParser.g:1778:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalPlanParser.g:1779:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalPlanParser.g:1779:3: (lv_value_0_0= ruleInteger0 )
            // InternalPlanParser.g:1780:4: lv_value_0_0= ruleInteger0
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
    // InternalPlanParser.g:1800:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalPlanParser.g:1800:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalPlanParser.g:1801:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalPlanParser.g:1807:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:1813:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalPlanParser.g:1814:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalPlanParser.g:1814:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalPlanParser.g:1815:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalPlanParser.g:1815:3: (lv_value_0_0= ruleDouble0 )
            // InternalPlanParser.g:1816:4: lv_value_0_0= ruleDouble0
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
    // InternalPlanParser.g:1836:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalPlanParser.g:1836:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalPlanParser.g:1837:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalPlanParser.g:1843:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:1849:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalPlanParser.g:1850:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalPlanParser.g:1850:2: ( (lv_value_0_0= ruleEString ) )
            // InternalPlanParser.g:1851:3: (lv_value_0_0= ruleEString )
            {
            // InternalPlanParser.g:1851:3: (lv_value_0_0= ruleEString )
            // InternalPlanParser.g:1852:4: lv_value_0_0= ruleEString
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
    // InternalPlanParser.g:1872:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalPlanParser.g:1872:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalPlanParser.g:1873:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalPlanParser.g:1879:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:1885:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalPlanParser.g:1886:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalPlanParser.g:1886:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalPlanParser.g:1887:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalPlanParser.g:1887:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalPlanParser.g:1888:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalPlanParser.g:1908:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalPlanParser.g:1908:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalPlanParser.g:1909:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalPlanParser.g:1915:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:1921:2: (this_ResourceType_0= ruleResourceType )
            // InternalPlanParser.g:1922:2: this_ResourceType_0= ruleResourceType
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
    // InternalPlanParser.g:1933:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalPlanParser.g:1933:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalPlanParser.g:1934:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalPlanParser.g:1940:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:1946:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanParser.g:1947:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanParser.g:1947:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanParser.g:1948:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanParser.g:1948:3: ()
            // InternalPlanParser.g:1949:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalPlanParser.g:1955:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanParser.g:1956:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanParser.g:1956:4: (lv_name_1_0= ruleEString )
            // InternalPlanParser.g:1957:5: lv_name_1_0= ruleEString
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
    // InternalPlanParser.g:1978:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalPlanParser.g:1978:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalPlanParser.g:1979:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalPlanParser.g:1985:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:1991:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalPlanParser.g:1992:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalPlanParser.g:1992:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalPlanParser.g:1993:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalPlanParser.g:1993:3: ()
            // InternalPlanParser.g:1994:4:
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
    // InternalPlanParser.g:2008:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalPlanParser.g:2008:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalPlanParser.g:2009:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalPlanParser.g:2015:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2021:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalPlanParser.g:2022:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalPlanParser.g:2022:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalPlanParser.g:2023:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalPlanParser.g:2023:3: ()
            // InternalPlanParser.g:2024:4:
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
    // InternalPlanParser.g:2038:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalPlanParser.g:2038:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalPlanParser.g:2039:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalPlanParser.g:2045:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2051:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanParser.g:2052:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanParser.g:2052:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanParser.g:2053:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanParser.g:2053:3: ()
            // InternalPlanParser.g:2054:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalPlanParser.g:2060:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanParser.g:2061:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanParser.g:2061:4: (lv_name_1_0= ruleEString )
            // InternalPlanParser.g:2062:5: lv_name_1_0= ruleEString
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
    // InternalPlanParser.g:2083:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalPlanParser.g:2083:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalPlanParser.g:2084:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalPlanParser.g:2090:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2096:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalPlanParser.g:2097:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalPlanParser.g:2097:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Ethernet) ) {
                alt34=1;
            }
            else if ( (LA34_0==Wlan) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalPlanParser.g:2098:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalPlanParser.g:2107:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalPlanParser.g:2119:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalPlanParser.g:2119:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalPlanParser.g:2120:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalPlanParser.g:2126:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2132:2: ( ( () otherlv_1= Ethernet ) )
            // InternalPlanParser.g:2133:2: ( () otherlv_1= Ethernet )
            {
            // InternalPlanParser.g:2133:2: ( () otherlv_1= Ethernet )
            // InternalPlanParser.g:2134:3: () otherlv_1= Ethernet
            {
            // InternalPlanParser.g:2134:3: ()
            // InternalPlanParser.g:2135:4:
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
    // InternalPlanParser.g:2149:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalPlanParser.g:2149:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalPlanParser.g:2150:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalPlanParser.g:2156:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2162:2: ( ( () otherlv_1= Wlan ) )
            // InternalPlanParser.g:2163:2: ( () otherlv_1= Wlan )
            {
            // InternalPlanParser.g:2163:2: ( () otherlv_1= Wlan )
            // InternalPlanParser.g:2164:3: () otherlv_1= Wlan
            {
            // InternalPlanParser.g:2164:3: ()
            // InternalPlanParser.g:2165:4:
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
    // InternalPlanParser.g:2179:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalPlanParser.g:2179:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalPlanParser.g:2180:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalPlanParser.g:2186:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2192:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalPlanParser.g:2193:2: ( () otherlv_1= AttributeKind )
            {
            // InternalPlanParser.g:2193:2: ( () otherlv_1= AttributeKind )
            // InternalPlanParser.g:2194:3: () otherlv_1= AttributeKind
            {
            // InternalPlanParser.g:2194:3: ()
            // InternalPlanParser.g:2195:4:
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
    // InternalPlanParser.g:2209:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalPlanParser.g:2209:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalPlanParser.g:2210:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalPlanParser.g:2216:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2222:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalPlanParser.g:2223:2: ( () otherlv_1= MaximumKind )
            {
            // InternalPlanParser.g:2223:2: ( () otherlv_1= MaximumKind )
            // InternalPlanParser.g:2224:3: () otherlv_1= MaximumKind
            {
            // InternalPlanParser.g:2224:3: ()
            // InternalPlanParser.g:2225:4:
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
    // InternalPlanParser.g:2239:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalPlanParser.g:2239:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalPlanParser.g:2240:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalPlanParser.g:2246:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2252:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalPlanParser.g:2253:2: ( () otherlv_1= MinimumKind )
            {
            // InternalPlanParser.g:2253:2: ( () otherlv_1= MinimumKind )
            // InternalPlanParser.g:2254:3: () otherlv_1= MinimumKind
            {
            // InternalPlanParser.g:2254:3: ()
            // InternalPlanParser.g:2255:4:
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
    // InternalPlanParser.g:2269:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalPlanParser.g:2269:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalPlanParser.g:2270:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalPlanParser.g:2276:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2282:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalPlanParser.g:2283:2: ( () otherlv_1= SelectionKind )
            {
            // InternalPlanParser.g:2283:2: ( () otherlv_1= SelectionKind )
            // InternalPlanParser.g:2284:3: () otherlv_1= SelectionKind
            {
            // InternalPlanParser.g:2284:3: ()
            // InternalPlanParser.g:2285:4:
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
    // InternalPlanParser.g:2299:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalPlanParser.g:2299:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalPlanParser.g:2300:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalPlanParser.g:2306:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2312:2: ( ( () otherlv_1= RangeKind ) )
            // InternalPlanParser.g:2313:2: ( () otherlv_1= RangeKind )
            {
            // InternalPlanParser.g:2313:2: ( () otherlv_1= RangeKind )
            // InternalPlanParser.g:2314:3: () otherlv_1= RangeKind
            {
            // InternalPlanParser.g:2314:3: ()
            // InternalPlanParser.g:2315:4:
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
    // InternalPlanParser.g:2329:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalPlanParser.g:2329:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalPlanParser.g:2330:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalPlanParser.g:2336:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2342:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalPlanParser.g:2343:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalPlanParser.g:2343:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalPlanParser.g:2344:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalPlanParser.g:2344:3: ()
            // InternalPlanParser.g:2345:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                                current);


            }

            // InternalPlanParser.g:2351:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalPlanParser.g:2352:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalPlanParser.g:2352:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalPlanParser.g:2353:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalPlanParser.g:2374:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalPlanParser.g:2374:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalPlanParser.g:2375:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalPlanParser.g:2381:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2387:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalPlanParser.g:2388:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalPlanParser.g:2388:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalPlanParser.g:2389:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalPlanParser.g:2389:3: ()
            // InternalPlanParser.g:2390:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                                current);


            }

            // InternalPlanParser.g:2396:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalPlanParser.g:2397:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalPlanParser.g:2397:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalPlanParser.g:2398:5: lv_value_1_0= ruleUbuntuVersion
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


    // $ANTLR start "entryRuleOpertingSystemName"
    // InternalPlanParser.g:2419:1: entryRuleOpertingSystemName returns [EObject current=null] : iv_ruleOpertingSystemName= ruleOpertingSystemName EOF ;
    public final EObject entryRuleOpertingSystemName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemName = null;


        try {
            // InternalPlanParser.g:2419:59: (iv_ruleOpertingSystemName= ruleOpertingSystemName EOF )
            // InternalPlanParser.g:2420:2: iv_ruleOpertingSystemName= ruleOpertingSystemName EOF
            {
             newCompositeNode(grammarAccess.getOpertingSystemNameRule());
            pushFollow(FOLLOW_1);
            iv_ruleOpertingSystemName=ruleOpertingSystemName();

            state._fsp--;

             current =iv_ruleOpertingSystemName;
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
    // $ANTLR end "entryRuleOpertingSystemName"


    // $ANTLR start "ruleOpertingSystemName"
    // InternalPlanParser.g:2426:1: ruleOpertingSystemName returns [EObject current=null] : this_LinuxDistributionValue_0= ruleLinuxDistributionValue ;
    public final EObject ruleOpertingSystemName() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxDistributionValue_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2432:2: (this_LinuxDistributionValue_0= ruleLinuxDistributionValue )
            // InternalPlanParser.g:2433:2: this_LinuxDistributionValue_0= ruleLinuxDistributionValue
            {

                    newCompositeNode(grammarAccess.getOpertingSystemNameAccess().getLinuxDistributionValueParserRuleCall());

            pushFollow(FOLLOW_2);
            this_LinuxDistributionValue_0=ruleLinuxDistributionValue();

            state._fsp--;


                    current = this_LinuxDistributionValue_0;
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
    // $ANTLR end "ruleOpertingSystemName"


    // $ANTLR start "entryRuleDouble0"
    // InternalPlanParser.g:2444:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalPlanParser.g:2444:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalPlanParser.g:2445:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalPlanParser.g:2451:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalPlanParser.g:2457:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalPlanParser.g:2458:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalPlanParser.g:2468:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalPlanParser.g:2468:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalPlanParser.g:2469:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalPlanParser.g:2475:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalPlanParser.g:2481:2: (this_DECINT_0= RULE_DECINT )
            // InternalPlanParser.g:2482:2: this_DECINT_0= RULE_DECINT
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
    // InternalPlanParser.g:2492:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPlanParser.g:2492:47: (iv_ruleEString= ruleEString EOF )
            // InternalPlanParser.g:2493:2: iv_ruleEString= ruleEString EOF
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
    // InternalPlanParser.g:2499:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2505:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPlanParser.g:2506:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPlanParser.g:2506:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalPlanParser.g:2507:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalPlanParser.g:2515:3: this_ID_1= RULE_ID
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
    // InternalPlanParser.g:2526:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanParser.g:2528:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalPlanParser.g:2529:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalPlanParser.g:2538:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanParser.g:2545:2: (kw= HyphenMinus )
            // InternalPlanParser.g:2546:2: kw= HyphenMinus
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


    // $ANTLR start "ruleROSDistro"
    // InternalPlanParser.g:2557:1: ruleROSDistro returns [Enumerator current=null] : ( (enumLiteral_0= Noetic_1 ) | (enumLiteral_1= Humble_1 ) | (enumLiteral_2= Rolling ) ) ;
    public final Enumerator ruleROSDistro() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


            enterRule();

        try {
            // InternalPlanParser.g:2563:2: ( ( (enumLiteral_0= Noetic_1 ) | (enumLiteral_1= Humble_1 ) | (enumLiteral_2= Rolling ) ) )
            // InternalPlanParser.g:2564:2: ( (enumLiteral_0= Noetic_1 ) | (enumLiteral_1= Humble_1 ) | (enumLiteral_2= Rolling ) )
            {
            // InternalPlanParser.g:2564:2: ( (enumLiteral_0= Noetic_1 ) | (enumLiteral_1= Humble_1 ) | (enumLiteral_2= Rolling ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case Noetic_1:
                {
                alt36=1;
                }
                break;
            case Humble_1:
                {
                alt36=2;
                }
                break;
            case Rolling:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalPlanParser.g:2565:3: (enumLiteral_0= Noetic_1 )
                    {
                    // InternalPlanParser.g:2565:3: (enumLiteral_0= Noetic_1 )
                    // InternalPlanParser.g:2566:4: enumLiteral_0= Noetic_1
                    {
                    enumLiteral_0=(Token)match(input,Noetic_1,FOLLOW_2);

                                    current = grammarAccess.getROSDistroAccess().getNoeticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getROSDistroAccess().getNoeticEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanParser.g:2573:3: (enumLiteral_1= Humble_1 )
                    {
                    // InternalPlanParser.g:2573:3: (enumLiteral_1= Humble_1 )
                    // InternalPlanParser.g:2574:4: enumLiteral_1= Humble_1
                    {
                    enumLiteral_1=(Token)match(input,Humble_1,FOLLOW_2);

                                    current = grammarAccess.getROSDistroAccess().getHumbleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_1, grammarAccess.getROSDistroAccess().getHumbleEnumLiteralDeclaration_1());


                    }


                    }
                    break;
                case 3 :
                    // InternalPlanParser.g:2581:3: (enumLiteral_2= Rolling )
                    {
                    // InternalPlanParser.g:2581:3: (enumLiteral_2= Rolling )
                    // InternalPlanParser.g:2582:4: enumLiteral_2= Rolling
                    {
                    enumLiteral_2=(Token)match(input,Rolling,FOLLOW_2);

                                    current = grammarAccess.getROSDistroAccess().getRollingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_2, grammarAccess.getROSDistroAccess().getRollingEnumLiteralDeclaration_2());


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
    // $ANTLR end "ruleROSDistro"


    // $ANTLR start "ruleRunTimeType"
    // InternalPlanParser.g:2592:1: ruleRunTimeType returns [Enumerator current=null] : (enumLiteral_0= Container ) ;
    public final Enumerator ruleRunTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


            enterRule();

        try {
            // InternalPlanParser.g:2598:2: ( (enumLiteral_0= Container ) )
            // InternalPlanParser.g:2599:2: (enumLiteral_0= Container )
            {
            // InternalPlanParser.g:2599:2: (enumLiteral_0= Container )
            // InternalPlanParser.g:2600:3: enumLiteral_0= Container
            {
            enumLiteral_0=(Token)match(input,Container,FOLLOW_2);

                        current = grammarAccess.getRunTimeTypeAccess().getContainerEnumLiteralDeclaration().getEnumLiteral().getInstance();
                        newLeafNode(enumLiteral_0, grammarAccess.getRunTimeTypeAccess().getContainerEnumLiteralDeclaration());


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
    // $ANTLR end "ruleRunTimeType"


    // $ANTLR start "ruleProcessorArchitectureType"
    // InternalPlanParser.g:2609:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2615:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalPlanParser.g:2616:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalPlanParser.g:2616:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
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
                    // InternalPlanParser.g:2617:3: (enumLiteral_0= X86 )
                    {
                    // InternalPlanParser.g:2617:3: (enumLiteral_0= X86 )
                    // InternalPlanParser.g:2618:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                                    current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanParser.g:2625:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalPlanParser.g:2625:3: (enumLiteral_1= Arm64 )
                    // InternalPlanParser.g:2626:4: enumLiteral_1= Arm64
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
    // InternalPlanParser.g:2636:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2642:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalPlanParser.g:2643:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalPlanParser.g:2643:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
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
                    // InternalPlanParser.g:2644:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalPlanParser.g:2644:3: (enumLiteral_0= Ubuntu )
                    // InternalPlanParser.g:2645:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                                    current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanParser.g:2652:3: (enumLiteral_1= Debian )
                    {
                    // InternalPlanParser.g:2652:3: (enumLiteral_1= Debian )
                    // InternalPlanParser.g:2653:4: enumLiteral_1= Debian
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
    // InternalPlanParser.g:2663:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2669:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalPlanParser.g:2670:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalPlanParser.g:2670:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
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
                    // InternalPlanParser.g:2671:3: (enumLiteral_0= Focal )
                    {
                    // InternalPlanParser.g:2671:3: (enumLiteral_0= Focal )
                    // InternalPlanParser.g:2672:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                                    current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanParser.g:2679:3: (enumLiteral_1= Jammy )
                    {
                    // InternalPlanParser.g:2679:3: (enumLiteral_1= Jammy )
                    // InternalPlanParser.g:2680:4: enumLiteral_1= Jammy
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


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\54\1\47\1\64\2\62\1\46\1\12\5\uffff";
    static final String dfa_3s = "\1\54\1\47\1\66\2\62\1\46\1\26\5\uffff";
    static final String dfa_4s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\3\uffff\1\11\1\10\5\uffff\1\12",
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "836:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008100000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000C000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0008000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0058000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0008000000084080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C4000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000000004080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0008040200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0051882D20000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000200002002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000200000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000400000L});

}
